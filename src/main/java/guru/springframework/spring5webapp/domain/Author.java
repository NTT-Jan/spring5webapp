package guru.springframework.spring5webapp.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "authors")
//    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "author_id"),
//            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private Set<Book> books;
    

}
