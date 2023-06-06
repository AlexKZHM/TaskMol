
public class StudentW374 {

    public StudentW374(String surname, String name, String patronymic, String gender, int group) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.gender = gender;
        this.group = group;
    }
    private String name;
    private String patronymic;
    private String surname;
    private String gender;
    private int group;

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

}
