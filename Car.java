class Car {

    private Integer id;
    private String licencia;
    private Account conductor;
    private Integer pasajeros;

    public Car (String licencia, Account conductor) {
        this.licencia = licencia;
        this.conductor = conductor;
    }
    public void printDataCar () {
        System.out.print("\nConductor: "+conductor.getNombre() + ", DNI:"+conductor.getDocumento()
        +"\nCantidad de pasajeros: "+pasajeros);
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getLicencia() {
        return licencia;
    }
    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
    public Account getConductor() {
        return conductor;
    }
    public void setConductor(Account conductor) {
        this.conductor = conductor;
    }
    public Integer getPasajeros(){
        return pasajeros;
    }
    public void setPasajeros(Integer pasajeros){
        if(pasajeros < 5){
            this.pasajeros = pasajeros;
        }else{
            System.out.println("La cantidad maxima es de 4 pasajeros");
        }
    }
}
