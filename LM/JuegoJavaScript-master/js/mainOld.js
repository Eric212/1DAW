let x = 960;
let y = 790;
let life= 3;
let player = document.getElementById("player");
function movimiento(event) {
  if (event.keyCode == '39') {//derecha
    x = x + 10;
    player.style.left = x + 'px';
    if (x >= 1150) {
      x = 1150;
    }
  }
  if (event.keyCode == '37') {//Izquierda
    x = x - 10;
    player.style.left = x + 'px';
    if (x <= 750) {
      x = 750;
    }
  }
  if(event.keyCode=='32'){
    y=790;
    let shoot=document.getElementById("shoot");
    shoot.style.visibility="visible";
    shoot.style.left=x;
    setInterval(shootPlayer(shoot),3000);
    console.log(y);
    clearInterval(3000);
  }
}
function shootPlayer(shoot){
  if(y>160) {
    y = y - 5;
    shoot.style.top = y + 'px';
  }
  shoot.style.visibility="hidden";
}
window.onkeyup=movimiento;
//740-1160
