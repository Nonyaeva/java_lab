package mirea_lab_6;

class Mug extends Dish {
    protected int volume;
    Mug(String material, String color, int volume) {
        super(color, material);
        this.volume = volume;
    }


    @Override
    public void wish() {
        System.out.println("Чашка объемом " + volume + " мл моется");
    }
}
