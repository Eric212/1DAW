package como.ericsospedra.Tema08.Ejercicio1;

public class Coche {
    private String modelo, color, matricula, tipoCoche, aFabricacion, modSeguro;
    private boolean metalizado;

    public Coche() {
        modelo = "Focus";
        color = "Negro";
        metalizado = true;
        matricula = "2639DHJ";
        tipoCoche = "Deportivo";
        aFabricacion = "15/03/2005";
        modSeguro = "Terceros";
    }

    public Coche(String modelo, String tipoCoche, String color, boolean metalizado, String matricula, String aFabricacion, String modSeguro) {
        this.modelo = modelo;
        this.color = color;
        this.metalizado = metalizado;
        this.matricula = matricula;
        this.tipoCoche = tipoCoche;
        this.aFabricacion = aFabricacion;
        this.modSeguro = modSeguro;
    }

    public Coche(String modelo, String color, String tipoCoche, String aFabricacion, boolean metalizado) {
        this.modelo = modelo;
        this.color = color;
        this.metalizado = metalizado;
        this.tipoCoche = tipoCoche;
        this.aFabricacion = aFabricacion;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setMetalizado(boolean metalizado) {
        this.metalizado = metalizado;
    }

    public boolean getMetalizadoo() {
        return metalizado;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setTipoCoche(String tipoCoche) {
        this.tipoCoche = tipoCoche;
    }

    public String getTipoCoche() {
        return this.tipoCoche;
    }

    public void setAFabricacion(String aFabricacion) {
        this.aFabricacion = aFabricacion;
    }

    public String getAFabricacion() {
        return this.aFabricacion;
    }

    public void setModSeguro(String modSeguro) {
        this.modSeguro = modSeguro;
    }

    public String getModSeguro() {
        return this.modSeguro;
    }

    public String imprimirCoche() {
        return "Modelo: " + this.modelo + "\nColor: " + this.color;
    }
}