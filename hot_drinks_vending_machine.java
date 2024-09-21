import java.util.ArrayList;
import java.util.List;

public class ГорячихНапитковАвтомат implements ТорговыйАвтомат {
    private List<ГорячийНапитокСТемпературой> напитки;

    public ГорячихНапитковАвтомат() {
        напитки = new ArrayList<>();
    }

    public void addProduct(ГорячийНапитокСТемпературой продукт) {
        напитки.add(продукт);
    }

    @Override
    public ГорячийНапиток getProduct(String name, int volume, int температура) {
        for (ГорячийНапитокСТемпературой напиток : напитки) {
            if (напиток.getName().equals(name) && 
                напиток.getVolume() == volume && 
                напиток.getТемпература() == температура) {
                return напиток;
            }
        }
        return null; // Если не найдено, можно кинуть исключение или вернуться к null
    }
}
