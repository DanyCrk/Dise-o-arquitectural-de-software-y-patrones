package PuntoEjercicio;
public class Main {
    public static void main(String[] args) {
        accountManager manager = new accountManager();
        
        Account accountA = new Account("A12", 1000, manager);
        Account accountB = new Account("B34", 1000, manager);
        
        // Transferencia en ambas direcciones
        accountA.initiateTransfer(accountB, 500);  // A → B
        accountB.initiateTransfer(accountA, 100);   // B → A
    }
}