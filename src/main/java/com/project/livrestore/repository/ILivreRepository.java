package com.project.livrestore.repository;

import com.project.livrestore.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ILivreRepository extends JpaRepository<Livre, Long>
{
}
