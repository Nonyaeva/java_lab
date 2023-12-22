package mirea_lab_6;

class Plate extends Dish {
    private int diameter;

    public Plate(String material, String color, int diameter){
        super(material, color);
        this.diameter = diameter;
    }

    @Override
    public void wish() {
        System.out.println("Тарелка диаметром " + diameter + " см моется");
    }
}
