package com.project.livrestore.service;

import com.project.livrestore.model.Livre;
import com.project.livrestore.repository.ILivreRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class LivreService implements ILivreService
{
    private final ILivreRepository bookRepository;

    public LivreService(ILivreRepository bookRepository)
    {
        this.bookRepository = bookRepository;
    }

    @Override
    public Livre saveBook(Livre livre)
    {
        livre.setCreateTime(LocalDateTime.now());
        return bookRepository.save(livre);
    }

    @Override
    public void deleteBook(Long id)
    {
        bookRepository.deleteById(id);
    }

    @Override
    public List<Livre> findAllBooks()
    {
        return bookRepository.findAll();
    }
}
