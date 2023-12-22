package mirea_lab_6;

class Table extends Furniture {
    protected int height;

    public Table(String material, String color, int height){
        super(material, color);
        this.height = height;
    }

    @Override
    public void fell() {
        System.out.println("Стол высотой " + height + " см" +  " упал");
    }
}