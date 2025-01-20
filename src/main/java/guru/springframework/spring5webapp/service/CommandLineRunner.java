package guru.springframework.spring5webapp.service;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.repository.AuthorRepository;
import guru.springframework.spring5webapp.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.xml.bind.SchemaOutputResolver;

@Component
@RequiredArgsConstructor
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    @Override
    public void run(String... args) throws Exception {

        Book book1 = new Book();
        book1.setTitle("Spring Framework 5");
        book1.setIsbn("123456");

        Book book2 = new Book();
        book2.setTitle("Harry potter");
        book2.setIsbn("4212331");

        Author author1 = new Author();
        author1.setFirstName("Rod");
        author1.setLastName("Johnson");

        Author author2 = new Author();
        author2.setFirstName("J.K");
        author2.setLastName("Rowling");

        bookRepository.save(book1);
        bookRepository.save(book2);

        authorRepository.save(author1);
        authorRepository.save(author2);

        System.out.println("Book saved: " + bookRepository.count());
        System.out.println("Author saved: " + authorRepository.count());

//        System.out.println("Books:" + bookRepository.findAll());

    }
}
