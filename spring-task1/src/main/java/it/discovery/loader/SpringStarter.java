package it.discovery.loader;

import it.discovery.model.Book;
import it.discovery.repository.BookRepository;
import it.discovery.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class SpringStarter {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("it.discovery")) {

            BookRepository repository = context.getBean(BookRepository.class);
            BookService service = context.getBean(BookService.class);

            Book book = new Book();
            book.setName("Introduction into Spring");
            book.setPages(100);
            book.setYear(2016);
            service.saveBook(book);

            List<Book> books = service.findBooks();
            System.out.println(books);

            System.out.println("Total bean count: " + context.getBeanDefinitionCount());
            System.out.println("Current bean names: " + Arrays.toString(context.getBeanDefinitionNames()));
        }

    }

}
