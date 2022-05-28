package com.project.livrestore.controller;

import com.project.livrestore.model.Livre;
import com.project.livrestore.service.ILivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/book")//pre-path
public class LivreController
{
    @Autowired
    private ILivreService bookService;

    @PostMapping //api/livre
    public ResponseEntity<?> saveBook(@RequestBody Livre livre)
    {
        return new ResponseEntity<>(bookService.saveBook(livre), HttpStatus.CREATED);
    }

    @DeleteMapping("{bookId}") //api/book/{bookId}
    public ResponseEntity<?> deleteBook(@PathVariable Long bookId)
    {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping //api/book
    public ResponseEntity<?> getAllBooks()
    {
        return new ResponseEntity<>(bookService.findAllBooks(), HttpStatus.OK);
    }
}
