public class Drinks extends ProductByUnit {

    public Drinks(String name, Double price, Double quantity, String unit) {
        super(name, price, quantity, unit);
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + " /// " + getUnit() + ": " + getQuantity() + " /// Precio: $" + getPrice();
    }
}
