package com.project.livrestore.repository;

import com.project.livrestore.repository.projection.IArticleAchete;
import com.project.livrestore.model.AchatHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface IAchatHistoryRepository extends JpaRepository<AchatHistory, Long>
{
    @Query("select " +
            "b.title as title, ph.price as price, ph.purchaseTime as purchaseTime  " +
            "from AchatHistory ph left join Livre b on b.id = ph.bookId " +
            "where ph.userId = :userId")
    List<IArticleAchete> findAllPurchasesOfUser(@Param("userId") Long userId);
}
