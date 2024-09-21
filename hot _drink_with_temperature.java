// Наследник класса ГорячийНапиток с полем температура
class СпецифическийГорячийНапиток extends ГорячийНапиток {
    private int температура;

    public СпецифическийГорячийНапиток(String name, int volume, int температура) {
        super(name, volume);
        this.температура = температура;
    }

    public int getТемпература() {
        return температура;
    }

    @Override
    public String toString() {
        return "СпецифическийГорячийНапиток{" +
                "name='" + getName() + '\'' +
                ", volume=" + getVolume() +
                ", температура=" + температура +
                '}';
    }
}
