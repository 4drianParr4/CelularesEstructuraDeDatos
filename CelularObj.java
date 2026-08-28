public class CelularObj {

    String Modelo;
    String Marca;
    Double Precio;
    int Cantdisp;
    String Caracteristicas;

    public CelularObj(String modelo, String marca, Double precio, int cantdisp, String caracteristicas) {
        Modelo = modelo;
        Marca = marca;
        Precio = precio;
        Cantdisp = cantdisp;
        Caracteristicas = caracteristicas;
    }

    public CelularObj() {
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public int getCantdisp() {
        return Cantdisp;
    }

    public void setCantdisp(int cantdisp) {
        Cantdisp = cantdisp;
    }

    public String getCaracteristicas() {
        return Caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        Caracteristicas = caracteristicas;
    }
    
    
    

    
    


    
}
