public class CelularObj {

    String Modelo;
    String Marca;
    double Precio;
    int Cantdisp;
    String Caracteristicas;
    double Descuento;
    int Descaplicado;

    public CelularObj(String modelo, String marca, double precio, int cantdisp, String caracteristicas,
            double descuento, int descaplicado) {
        Modelo = modelo;
        Marca = marca;
        Precio = precio;
        Cantdisp = cantdisp;
        Caracteristicas = caracteristicas;
        Descuento = descuento;
        Descaplicado = descaplicado;
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

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
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

    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double descuento) {
        Descuento = descuento;
    }

    public int getDescaplicado() {
        return Descaplicado;
    }

    public void setDescaplicado(int descaplicado) {
        Descaplicado = descaplicado;
    }
}
