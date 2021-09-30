const fondo= document.querySelector('.fondo');
const finPartida= document.querySelector('.finPartida');
const puntuacion=document.querySelector('#puntuacion');
const boton=document.getElementById('boton');
let posicionNave=130;
let width=9;
let puntos=0;
let velocidad=1000;
let moviendoseDerecha= true;
let direccion = 1;
let alienigenasId;
let alienigenasElimininados=[];
puntuacion.innerHTML="Puntutacion: "+puntos;
for (let i=0;i<135;i++){
  const cuadrado=document.createElement('div');
  fondo.appendChild(cuadrado);
}
const alienigenas=[0,1,2,3,4,5,6,9,10,11,12,13
  ,14,15,18,19,20,21,22,23,24,27,28,29
  ,30,31,32,33];

const cuadrado =Array.from(document.querySelectorAll('.fondo div'));
function dibujar(){
  for(let i =0;i <alienigenas.length;i++){
    if(!alienigenasElimininados.includes(i)) {
      cuadrado[alienigenas[i]].classList.add('alienigena');
    }
  }
}
function borrar(){
  for(let i =0;i <alienigenas.length;i++){
    cuadrado[alienigenas[i]].classList.remove('alienigena');
  }
}
dibujar();
cuadrado[posicionNave].classList.add('nave');
function movimientoNave(event){
  cuadrado[posicionNave].classList.remove('nave');
  switch (event.key){
    case 'ArrowLeft':
      if(posicionNave >126){
        posicionNave= posicionNave-1;
      }
      break
    case 'ArrowRight':
      if(posicionNave <134){
        posicionNave= posicionNave+1;
      }
      break
  }
  cuadrado[posicionNave].classList.add('nave');
}
document.addEventListener('keydown',movimientoNave);
function moverAlienigenas(){
  const ladoIzq=alienigenas[0] % width === 0;
  const ladoDer= alienigenas[alienigenas.length - 1] % width === width -1;
  borrar();
  if(ladoIzq && moviendoseDerecha){
    for (let i=0;i<alienigenas.length;i++) {
      alienigenas[i]+=width-1;
      direccion= 1;
      moviendoseDerecha=false;
    }
  }
  if(ladoDer && !moviendoseDerecha){
    for (let i=0;i<alienigenas.length;i++) {
      alienigenas[i]+=width+1;
      direccion=-1;
      moviendoseDerecha=true;
    }
  }
  for (let i=0;i<alienigenas.length;i++){
    alienigenas[i]+= direccion;
  }
  dibujar();
  function cambiarMusica(){
    document.getElementById('musica').setAttribute('loop',"true");
    document.getElementById('musica').setAttribute('autoplay',"true");
    document.getElementById('musica').setAttribute('src',"music/Space_Invaders.mp3");
  }
  if(cuadrado[posicionNave].classList.contains('alienigena')){
    cuadrado[posicionNave].classList.remove('nave');
    cuadrado[posicionNave].classList.add('boom');
    for(let i=0;i<cuadrado.length;i++){
      if(cuadrado[i].classList.contains('boom')){
        cuadrado[i].classList.remove('boom');
      }
    }
    setTimeout(()=>cuadrado[posicionNave].classList.remove('boom'),800);
    borrar();
    finPartida.innerHTML = "GAME OVER";
    puntuacion.innerHTML="Puntuacion: "+puntos;
    document.getElementById('musica').setAttribute('loop',"false");
    document.getElementById('musica').setAttribute('autoplay',"false");
    document.getElementById('musica').setAttribute('src',"music/gameover.mp3");
    setTimeout(cambiarMusica,6200);
    clearInterval(alienigenasId);
    document.removeEventListener("keydown", movimientoNave);
    document.removeEventListener("keydown", disparar);
  }else {
    for (let i = 0; i < alienigenas.length; i++) {
      if (alienigenas[i] > cuadrado.length-9&&alienigenasElimininados.length!=alienigenas.length) {
        finPartida.innerHTML = "GAME OVER";
        cuadrado[posicionNave].classList.remove('nave');
        cuadrado[posicionNave].classList.add('boom');
        setTimeout(()=>cuadrado[posicionNave].classList.remove('boom'),800);
      }
    }
  }
}
alienigenasId = setInterval(moverAlienigenas,velocidad);
function disparar(event){
  let laser;
  let posicionLaser=posicionNave;
  function moverLaser() {
    cuadrado[posicionLaser].classList.remove('laser');
    posicionLaser -= width;
    cuadrado[posicionLaser].classList.add('laser');
    if(cuadrado[posicionLaser].classList.contains('alienigena')){
      cuadrado[posicionLaser].classList.remove('laser');
      cuadrado[posicionLaser].classList.remove('alienigena');
      cuadrado[posicionLaser].classList.add('boom');
      puntos+=100;
      puntuacion.innerHTML="Puntutacion: "+puntos;
      setTimeout(()=>cuadrado[posicionLaser].classList.remove('boom'),800);
      clearInterval(laser);
      const alienEliminado = alienigenas.indexOf(posicionLaser);
      alienigenasElimininados.push(alienEliminado);
    }
  }
  switch (event.key){
    case 'ArrowUp':
      laser= setInterval(moverLaser,100);
  }
}
document.addEventListener('keydown',disparar);
if(alienigenasElimininados.length==alienigenas.length){
  const boton=document.createElement('button');
  fondo.appendChild(boton);
  boton.setAttribute('name','Siguiente Nivel');
}
