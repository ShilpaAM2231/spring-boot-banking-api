package com.bank.banking_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bank.banking_system.entity.Account;
import com.bank.banking_system.service.AccountService;
import com.bank.banking_system.dto.DepositRequest;
import com.bank.banking_system.dto.TransferRequest;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    // Create Account
    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    // Get All Accounts
    @GetMapping
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    // Deposit API
    @PostMapping("/{id}/deposit")
    public Account deposit(@PathVariable Long id, @RequestBody DepositRequest request) {
        return accountService.deposit(id, request.getAmount());
    }

    // Withdraw API
    @PostMapping("/{id}/withdraw")
    public Account withdraw(@PathVariable Long id, @RequestBody DepositRequest request) {
        return accountService.withdraw(id, request.getAmount());
    }

    // Transfer Money API
    @PostMapping("/transfer")
    public String transfer(@RequestBody TransferRequest request) {

        accountService.transfer(
                request.getFromAccountId(),
                request.getToAccountId(),
                request.getAmount()
        );

        return "Money transferred successfully";
    }
}