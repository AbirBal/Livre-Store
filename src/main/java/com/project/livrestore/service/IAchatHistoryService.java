package com.project.livrestore.service;

import com.project.livrestore.model.AchatHistory;
import com.project.livrestore.repository.projection.IArticleAchete;

import java.util.List;


public interface IAchatHistoryService
{
    AchatHistory savePurchaseHistory(AchatHistory achatHistory);

    List<IArticleAchete> findPurchasedItemsOfUser(Long userId);
}
