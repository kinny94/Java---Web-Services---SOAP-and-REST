package com.springframework.spring5webapp.bootstrap;

import com.springframework.spring5webapp.model.Author;
import com.springframework.spring5webapp.model.Book;
import com.springframework.spring5webapp.model.Publisher;
import com.springframework.spring5webapp.repositories.AuthorRepository;
import com.springframework.spring5webapp.repositories.BookRepository;
import com.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    private void initData(){

        Publisher publisher = new Publisher();
        publisher.setName( "foo" );

        publisherRepository.save( publisher );

        //Eric
        Author eric = new Author( "Eric", "Evans" );
        Book  ddd = new Book( "Domain Driven Design", "1234", publisher );
        eric.getBooks().add( ddd );
        ddd.getAuthors().add( eric );

        authorRepository.save( eric );
        bookRepository.save( ddd );

        // Chris
        Author chris = new Author( "Chris", "Evans" );
        Book  ddd2 = new Book( "Hey What's up", "1241", publisher );
        chris.getBooks().add( ddd2 );

        authorRepository.save( chris );
        bookRepository.save( ddd2 );
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }
}
