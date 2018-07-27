package course;

import java.util.ArrayList;
import java.util.List;

public class CargoShip {

    private final int accommodations;
    private String name;
    private int usedAccommodations;
    private List<CrewMember> crewMembers;

    public CargoShip(
            int accommodations,
            String name) {
        this.accommodations = accommodations;
        this.name = name;
        this.usedAccommodations = 0;
        this.crewMembers = new ArrayList<>();
    }

    public int getAccommodations() {
        return accommodations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUsedAccommodations() {
        return usedAccommodations;
    }

    public void setUsedAccommodations(int usedAccommodations) {
        this.usedAccommodations = usedAccommodations;
    }

    public List<CrewMember> getCrewMembers() {
        return crewMembers;
    }

    public void setCrewMembers(List<CrewMember> crewMembers) {
        this.crewMembers = crewMembers;
    }

    public void add(CrewMember crewMember) {
        if (crewMembers.size() >= accommodations) throw new MaxSpaseLimitException("Out of space");
        crewMembers.add(crewMember);
        usedAccommodations++;
    }

    public void remove(CrewMember crewMember) {
        for (CrewMember member : crewMembers) {
            if (member.getId().equals(crewMember.getId())) {
                crewMembers.remove(crewMember);
                usedAccommodations--;
                return;
            } else {
                throw new NoCrewMeberException();
            }
        }
    }

    public int getFreeCabins() {
        return accommodations - usedAccommodations;
    }

    public void showCrewMembers() {
        crewMembers.forEach(System.out::println);
    }
}
