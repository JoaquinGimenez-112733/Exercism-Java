import java.util.*;

class KindergartenGarden {
    final String firstRow;
    final String secondRow;

    Map<String, Integer> studentMap = new HashMap<>();

    KindergartenGarden(String garden) {

        this.studentMap.put("Alice", 0);
        this.studentMap.put("Bob", 2);
        this.studentMap.put("Charlie", 4);
        this.studentMap.put("David", 6);
        this.studentMap.put("Eve", 8);
        this.studentMap.put("Fred", 10);
        this.studentMap.put("Ginny", 12);
        this.studentMap.put("Harriet", 14);
        this.studentMap.put("Ileana", 16);
        this.studentMap.put("Joseph", 18);
        this.studentMap.put("Kincaid", 20);
        this.studentMap.put("Larry", 22);

        this.firstRow = garden.split("\n")[0];
        this.secondRow = garden.split("\n")[1];
    }

    List<Plant> getPlantsOfStudent(String student) {
        List<Plant> plantList = new ArrayList<>();
        int indexSubstring = studentMap.get(student);
        String stringPlants = String.format("%s%s",
                this.firstRow.substring(indexSubstring, indexSubstring+2),
                this.secondRow.substring(indexSubstring, indexSubstring+2));

        for (char c : stringPlants.toCharArray()){
            Plant p = Plant.getPlant(c);
            if (!Objects.isNull(p)){
                plantList.add(p);
            }
        }

        return plantList;
    }

}
