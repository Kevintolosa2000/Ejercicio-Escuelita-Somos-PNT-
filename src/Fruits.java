public class Fruits extends ProductByUnit{

    public Fruits(String name, Double price, double quantity, String unit) {
        super(name, price, quantity, unit);
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + " /// Precio: $" + getPrice() + " /// Unidad de venta: " + getUnit();
    }
}
