class AutoX extends Car {
    private String marca;
    private String modelo;

    public AutoX (String licencia, Account conductor, String marca, String modelo) {
        super(licencia, conductor);
        this.marca = marca;
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @Override
    public void printDataCar() {
        super.printDataCar();
        System.out.println("; Marca de auto: "+getMarca());
        System.out.println();
    }
}
