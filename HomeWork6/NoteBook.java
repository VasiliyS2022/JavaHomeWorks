public class NoteBook {
    private int id;
    private String name;
    private int ram;
    private int ssd;
    private String os;
    private String color;

    public NoteBook(int id, String name, int ram, int ssd, String os, String color) {
        this.id = id;
        this.name = name;
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
    }

    public void setId(int id) {
        this.id = id;
    } 

    public void setName(String name) {
        this.name = name;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("артикул: %d, наименование: %s, ram: %d, ssd: %d, os: %s, цвет: %s", id, name, ram, ssd, os, color);
    }
}