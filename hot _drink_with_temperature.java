public class ГорячийНапитокСТемпературой extends ГорячийНапиток {
    private int температура;

    public ГорячийНапитокСТемпературой(String name, int volume, int температура) {
        super(name, volume);
        this.температура = температура;
    }

    public int getТемпература() {
        return температура;
    }
}
