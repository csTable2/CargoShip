package course;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CargoShipTest {

    private final static int ACCOMMODATIONS = 10;

    private CargoShip cargoShip;
    private Officer officer;
    private Seaman seaman;

    @Before
    public void setup() {
        cargoShip = new CargoShip(
                ACCOMMODATIONS,
                "Test");
        officer = new Officer("1a", "Officer", 30, "1st");
        cargoShip.add(officer);
        seaman = new Seaman("1b", "Seaman", 15, "asdasdasdasd");
        cargoShip.add(seaman);
    }

    @Test
    public void addTest() {
        cargoShip.add(new Seaman("2b", "S2", 25, "dadas"));
        assertEquals(cargoShip.getFreeCabins(), 7);
    }

    @Test(expected = NoCrewMeberException.class)
    public void removeTest() {
        cargoShip.remove(new Seaman("3b", "S3", 5, "dadas"));
    }

    @Test(expected = MaxSpaseLimitException.class)
    public void objectCreationTest() {
        CargoShip cargoShip = new CargoShip(1, "dsda");
        cargoShip.add(officer);
        cargoShip.add(seaman);
    }
}