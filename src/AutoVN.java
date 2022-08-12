import java.util.ArrayList;
import java.util.Map;

class AutoVN extends Car {
    private Map<String,Map<String,Integer>> typeCarAccepted;
    private ArrayList<String> seatsMaterial;

    public AutoVN (String licencia, Account conductor,
                   Map<String,Map<String,Integer>> typeCarAccepted,
                   ArrayList<String> seatsMaterial) {
        super(licencia, conductor);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
    public Map<String, Map<String, Integer>> getTypeCarAccepted() {
        return typeCarAccepted;
    }
    public void setTypeCarAccepted(Map<String, Map<String, Integer>> typeCarAccepted) {
        this.typeCarAccepted = typeCarAccepted;
    }
    public ArrayList<String> getSeatsMaterial() {
        return seatsMaterial;
    }
    public void setSeatsMaterial(ArrayList<String> seatsMaterial) {
        this.seatsMaterial = seatsMaterial;
    }
    @Override
    public void setPasajeros(Integer pasajeros) {
        if(pasajeros > 5) {
            super.setPasajeros(pasajeros);
        }else{
            System.out.println("La cantidad minima de pasajeros debe ser 6");
        }
    }
    @Override
    public void printDataCar() {
        super.printDataCar();
        System.out.println("; Marca de auto: ");
        System.out.println();
    }
}
