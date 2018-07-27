package course;

public class Main {

    public static void main(String[] args) {
        CargoShip cargoShip = new CargoShip(10, "CargoShip");
        cargoShip.add(new Officer("1a", "Master", 45, "1st"));
        cargoShip.add(new Seaman("1b", "Jon", 30, "No des"));
        cargoShip.showCrewMembers();
    }
}
