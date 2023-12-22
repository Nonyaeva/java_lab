package mirea_lab_3;

public class TestAuthor {
    public static void main(String[] args) {
        Author a_1 = new Author("Ivan Popov", "ivPopov@somewhere.com", 'M');
        Author a_2 = new Author("Anna Ivanova","anIvanova@somewhere.com", 'F');
        a_2.setEmail("anIvanova@somewhere.ru");
        System.out.println(a_1);
        System.out.println(a_2);
    }
}

