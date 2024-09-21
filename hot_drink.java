// Базовый класс ГорячийНапиток
class ГорячийНапиток {
    private String name;
    private int volume;

    public ГорячийНапиток(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "ГорячийНапиток{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
