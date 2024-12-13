package com.codigotutorial.book.book;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.domain.Specification;

@Slf4j
public class BookSpecification {

    public static Specification<Book> withOwnerId(Integer ownerId) {
        log.info("Owner id {}", ownerId);
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("owner").get("id"), ownerId);
    }

}
