public class estacionDeCargaTest {
    public static void main(String[] args) {
        EstacionCarga station = new EstacionCarga();
        new VehiculoElectrico("Vehiculo1", station);
        new VehiculoElectrico("Vehiculo2", station);
        new VehiculoElectrico("Vehiculo3", station);
        new VehiculoElectrico("Vehiculo4", station);
    }
}

class EstacionCarga {
    // Aforo máximo: 2 vehículos
    public static final int MAX_CAPACITY = 2;
    private int totalChargingVehicles = 0;

    public synchronized void charge(String vehicle) {
        while (totalChargingVehicles >= MAX_CAPACITY) {
            try {
                System.out.println(" La estación está llena " +
                                   vehicle + " tiene que esperar ");
                wait();
            } catch (InterruptedException e) {
                //
            }
        }
        // precondición es verdadera
        System.out.println(vehicle + " ha iniciado carga");
        totalChargingVehicles = totalChargingVehicles + 1;
    }

    public synchronized void finishCharge(String vehicle) {
        totalChargingVehicles = totalChargingVehicles - 1;
        System.out.println(vehicle + " ha terminado su atención. " +"Aforo actual: (" +totalChargingVehicles + "/" + MAX_CAPACITY + ")");
        notify();
    }
}

class VehiculoElectrico extends Thread {
    private EstacionCarga station;
    private String name;

    VehiculoElectrico(String n, EstacionCarga s) {
        name = n;
        station = s;
        start();
    }

    public void run() {
        System.out.println(name + " está listo para cargar");
        station.charge(name);
        try {
            // Tiempo de carga: 8000 milisegundos
            sleep(8000);
        } catch (InterruptedException e) {
            //
        }
        // terminar carga después de 8000ms
        station.finishCharge(name);
    }
}