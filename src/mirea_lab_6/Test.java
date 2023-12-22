package mirea_lab_6;

public class Test {
    public static void main(String[] args) {


        Plate p1 = new Plate("Стекло", "Черный", 20);
        p1.wish();
        Mug m1 = new Mug("Стекло", "Белый", 300);
        m1.wish();

        Staff s1 = new Staff("Рыжий", "Тоби");
        s1.eating();
        Staff s2 = new Staff("Черный", "Юта");
        s2.eating();

        Table t1 = new Table("Дерево", "Коричневый", 100);
        t1.fell();


    }
}
