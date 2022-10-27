public class DZ {
    public static void main(String[] args) {
        Author author = new Author("Donna", "Tartt");
        Book thegoldfinch = new Book("The Goldfinch", author, 2015);
        System.out.println("thegoldfinch.title = " + thegoldfinch.getTitle());
        System.out.println("thegoldfinch.author = " + author.getName() + " " + author.getSecondName());
        System.out.println("thegoldfinch.year = " + thegoldfinch.getYear());
        thegoldfinch.setYear(2013);


        Book thesevensisters = new Book("The Seven Sisters", author, 2019);
        Author riley = new Author("Lucinda", "Riley");
        System.out.println("thesevensisters.title = " + thesevensisters.getTitle());
        System.out.println("thesevensisters.author = " + riley.getName() + " " + riley.getSecondName());
        System.out.println("thesevensisters.year = " + thesevensisters.getYear());

    }
}

