// Класс ГорячихНапитковАвтомат
class ГорячихНапитковАвтомат implements ТорговыйАвтомат {
    private СпецифическийГорячийНапиток[] напитки;

    public ГорячихНапитковАвтомат(СпецифическийГорячийНапиток[] напитки) {
        this.напитки = напитки;
    }

    @Override
    public ГорячийНапиток getProduct(String name, int volume, int temperature) {
        for (СпецифическийГорячийНапиток напиток : напитки) {
            if (напиток.getName().equals(name) &&
                напиток.getVolume() == volume &&
                напиток.getТемпература() == temperature) {
                return напиток;
            }
        }
        System.out.println("Напиток не найден.");
        return null;
    }
}
