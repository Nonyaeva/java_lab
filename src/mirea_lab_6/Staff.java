package mirea_lab_6;
class Staff extends Dog {
    public Staff(String color, String name) {
        super(color, name);
    }

    @Override
    public void eating() {
        System.out.println("Стафф " + color + " цвета ест");
    }
}

