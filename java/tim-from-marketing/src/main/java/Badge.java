import java.util.Objects;

class Badge {
    public String print(Integer id, String name, String department) {
        String badge;
        if (Objects.isNull(department) && id == null){
            badge = String.format("%s - %s", name, "OWNER");
            return badge;
        }
        if (id == null && !Objects.isNull(department)){
            badge = String.format("%s - %s", name, department.toUpperCase());
            return badge;
        }
        if (Objects.isNull(department) && id != null){
            badge = String.format("[%d] - %s - %s", id, name, "OWNER");
            return badge;
        }

        badge = String.format("[%d] - %s - %s", id, name, department.toUpperCase());
        return badge;
    }
}
