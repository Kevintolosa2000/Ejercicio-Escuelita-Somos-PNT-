public class ShowerProducts extends ProductByUnit {

    public ShowerProducts(String name, Double price, double quantity, String unit) {
        super(name, price, quantity, unit);
    }

    @Override
    public String toString() {
        return "Nombre: " + getName() + " /// Contenido: " + getQuantity() + getUnit() + " /// Precio: $" + getPrice();
    }
}
