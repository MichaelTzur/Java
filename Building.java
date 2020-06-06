package building;

import java.util.Arrays;
import java.util.Random;

public class Building {

    private Floor[] floors;

    public Building() {
        Random random = new Random();
        this.floors = new Floor[random.nextInt(2) + 3];
        Arrays.setAll(floors, i -> new Floor());
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void fillBuildingWithMockData() {
        for (Floor floor : floors) {
            for (Room room : floor.getRooms()) {
                fillRoomWithMockData(room);
            }
        }
    }

    private void fillRoomWithMockData(Room room) {

        Person[] parents = room.getParents();
        Person[] children = room.getChildren();

        if (parents.length == 1) {
            parents[0] = new Man(fillPersonWithMockData());
        }
        else if (parents.length == 2) {
            parents[0] = new Man(fillPersonWithMockData());
            parents[1] = new Woman(fillPersonWithMockData());

            Arrays.setAll(children, i -> new Child(fillPersonWithMockData()));
        }
        room.setParents(parents);
        room.setChildren(children);
    }

    private Person fillPersonWithMockData() {

        String[] names = {"Ariel", "Bar", "Tal", "Yarden", "Lior"};
        Person.Gender[] genders = Person.Gender.values();
        int age;

        Random random = new Random();
        String name = names[random.nextInt(5)];
        Person.Gender gender = genders[random.nextInt(2)];
        age = random.nextInt(90);

        return new Person(name, gender, age);
    }
}
