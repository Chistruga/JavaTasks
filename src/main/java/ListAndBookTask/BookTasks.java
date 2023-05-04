package ListAndBookTask;

import Utils.BookLanguages;

import java.util.*;
import java.util.stream.Collectors;

public class BookTasks {
    public Comparator<Map<String, String>> mapComparator = Comparator.comparing(m -> m.get("author"));
    public ListOfBooks list = new ListOfBooks();
    public void getfirstSpanishBook() {
        Map<String, String> spanishBook = list.getBooks().stream()
                .filter(map -> map.get("language").equals(BookLanguages.SPANISH.name()))
                .findFirst().orElseThrow(NoSuchElementException::new);

        System.out.print("\nFirst Spanish Book from the list: \n" + spanishBook);
    }

    public void sortListOfBooksByAuthor() {
        List<Map<String, String>> sortedListByAuthor = list.getBooks();
        Collections.sort(sortedListByAuthor, mapComparator);
        System.out.print("\nList of books sorted in ascending order: \n" + sortedListByAuthor);
    }

    public void getTheBookWithMaximumPagesByTitle() {
        Optional<Map<String, String>> maxPageValue = list.getBooks().stream()
                .max(Comparator.comparing((Map<String, String> m) -> m.get("numberOfPages")));

        System.out.print("\nBook with the maximum page value is: " + maxPageValue.get().get("title"));
    }

    public void getAListOfBooksThatHaveMoreThan200Pages() {
        List<Map<String, String>> returnBooksWithMoreThan200Pages = list.getBooks().stream()
                .filter(a -> Integer.parseInt(a.get("numberOfPages")) > 200)
                .collect(Collectors.toList());

        System.out.print("\nList of books which have more than 200 pages: \n" + returnBooksWithMoreThan200Pages);
    }
}