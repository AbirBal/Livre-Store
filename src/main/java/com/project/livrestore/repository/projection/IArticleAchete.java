package com.project.livrestore.repository.projection;

import java.time.LocalDateTime;


public interface IArticleAchete
{
    String getTitle();
    Double getPrice();
    LocalDateTime getPurchaseTime();
}
