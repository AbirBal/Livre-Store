package com.project.livrestore.service;

import com.project.livrestore.model.Livre;

import java.util.List;


public interface ILivreService
{
    Livre saveBook(Livre livre);

    void deleteBook(Long id);

    List<Livre> findAllBooks();
}
