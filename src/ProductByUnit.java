class ProductByUnit extends Product {
    private Double quantity;
    private String unit;

    public ProductByUnit(String name, Double price, double quantity, String unit) {
        super(name, price);
        this.quantity = quantity;
        this.unit = unit;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }


}