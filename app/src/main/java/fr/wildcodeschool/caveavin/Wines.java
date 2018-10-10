package fr.wildcodeschool.caveavin;

public class Wines {

    //attributs
    private String name;
    private int year;
    private String description;
    private String keep;

    public void Wines (String name, int year, String description, String keep) {
        this.name=name;
        this.year=year;
        this.description=description;
        this.keep=keep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeep() {
        return keep;
    }

    public void setKeep(String keep) {
        this.keep = keep;
    }
}
