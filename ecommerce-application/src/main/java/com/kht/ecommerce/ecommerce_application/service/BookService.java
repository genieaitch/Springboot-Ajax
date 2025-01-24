package com.kht.ecommerce.ecommerce_application.service;

import com.kht.ecommerce.ecommerce_application.dto.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<Book> getAllBooks();
}
