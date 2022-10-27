public class DZ {
    public static void main(String[] args) {
        Book thegoldfinch = new Book("The Goldfinch", "Author", 2015);
        Author tartt = new Author("Donna", "Tartt");
        System.out.println("thegoldfinch.title = " + thegoldfinch.getTitle());
        System.out.println("thegoldfinch.Author = " + tartt.getName() + " " + tartt.getSecondName());
        System.out.println("thegoldfinch.year = " + thegoldfinch.getYear());
        thegoldfinch.setYear(2013);

        Book thesevensisters = new Book("The Seven Sisters", "Author", 2019);
        Author riley = new Author("Lucinda", "Riley");
        System.out.println("thesevensisters.title = " + thesevensisters.getTitle());
        System.out.println("thesevensisters.Author = " + riley.getName() + " " + riley.getSecondName());
        System.out.println("thesevensisters.year = " + thesevensisters.getYear());

    }
}
