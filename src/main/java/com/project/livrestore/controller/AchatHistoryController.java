package com.project.livrestore.controller;

import com.project.livrestore.model.AchatHistory;
import com.project.livrestore.security.UserPrincipal;
import com.project.livrestore.service.IAchatHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/purchase-history")//pre-path
public class AchatHistoryController
{
    @Autowired
    private IAchatHistoryService purchaseHistoryService;

    @PostMapping //api/purchase-history
    public ResponseEntity<?> savePurchaseHistory(@RequestBody AchatHistory achatHistory)
    {
        return new ResponseEntity<>(purchaseHistoryService.savePurchaseHistory(achatHistory), HttpStatus.CREATED);
    }

    @GetMapping //api/purchase-history
    public ResponseEntity<?> getAllPurchasesOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal)
    {
        return ResponseEntity.ok(purchaseHistoryService.findPurchasedItemsOfUser(userPrincipal.getId()));
    }
}
