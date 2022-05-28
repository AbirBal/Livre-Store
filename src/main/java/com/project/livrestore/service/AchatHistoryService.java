package com.project.livrestore.service;

import com.project.livrestore.model.AchatHistory;
import com.project.livrestore.repository.IAchatHistoryRepository;
import com.project.livrestore.repository.projection.IArticleAchete;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class AchatHistoryService implements IAchatHistoryService
{
    private final IAchatHistoryRepository purchaseHistoryRepository;

    public AchatHistoryService(IAchatHistoryRepository purchaseHistoryRepository)
    {
        this.purchaseHistoryRepository = purchaseHistoryRepository;
    }

    @Override
    public AchatHistory savePurchaseHistory(AchatHistory achatHistory)
    {
        achatHistory.setPurchaseTime(LocalDateTime.now());

        return purchaseHistoryRepository.save(achatHistory);
    }

    @Override
    public List<IArticleAchete> findPurchasedItemsOfUser(Long userId)
    {
        return purchaseHistoryRepository.findAllPurchasesOfUser(userId);
    }
}
