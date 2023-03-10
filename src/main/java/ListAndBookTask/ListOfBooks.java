package ListAndBookTask;

import Utils.Book;
import Utils.BookLanguages;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListOfBooks {
    public List<Map<String, String>> getBooks() {

        Book book1 = new Book("The lucky mill", "Ioan Slavici", 320, "Lumina", BookLanguages.ROMANIAN, "Novella");
        Book book2 = new Book("How to Stop Worrying and Start Living", "Dale Carnegie", 306, "Curtea Veche Publishing", BookLanguages.SPANISH, "Self-help book");
        Book book3 = new Book("The Alchemist", "Paulo Coelho", 400, "Curtea Veche Publishing", BookLanguages.SPANISH, "Novel");
        Book book4 = new Book("The Shadow of the Wind", "Carlos Ruiz Zafón", 500, "Curtea Veche Publishing", BookLanguages.ENGLISH, "Novel");
        Book book5 = new Book("La casa de los espíritus", "Isabel Allende", 120, "Curtea Veche Publishing", BookLanguages.ENGLISH, "Novel");
        Book book6 = new Book("Twenty Love Poems and a Song of Despair", "Pablo Neruda", 250, "Curtea Veche Publishing", BookLanguages.ROMANIAN, "Romantic poems");
        Book book7 = new Book("The Power of Now: A Guide to Spiritual Enlightenment", "Eckhart Tolle", 520, "Curtea Veche Publishing", BookLanguages.SPANISH, "Self-help book");
        Book book8 = new Book("The 48 Laws of Power", "Robert Greene", 400, "Curtea Veche Publishing", BookLanguages.ENGLISH, "Self-help book");

        List<Map<String, String>> exampleList = new ArrayList<>();
        exampleList.add(book1.toMap());
        exampleList.add(book2.toMap());
        exampleList.add(book3.toMap());
        exampleList.add(book4.toMap());
        exampleList.add(book5.toMap());
        exampleList.add(book6.toMap());
        exampleList.add(book7.toMap());
        exampleList.add(book8.toMap());

        return exampleList;
    }
}