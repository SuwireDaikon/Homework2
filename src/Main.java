
public class Main {
    public static void main(String[] args) {
        Author janeAusten = new Author("Jane", "Austen");
        Author zhenyaZamyatin = new Author("Yevgeny", "Zamyatin");

        Book prideAndPrejudice = new Book("Pride and Prejudice", janeAusten, 1999);
        Book we = new Book("We", zhenyaZamyatin, 1921);


        //System.out.println(janeAusten.getFirstName() + " " + janeAusten.getSurname()); // I used toString() in Author, but you can do this
        System.out.println(prideAndPrejudice.getTitle() + ", " + prideAndPrejudice.getWriter() + ", " + prideAndPrejudice.getPublishingDate());
        we.setPublishingDate(1984);
        System.out.println(we.getTitle() + ", " + we.getWriter() + ", " + we.getPublishingDate());
    }
}