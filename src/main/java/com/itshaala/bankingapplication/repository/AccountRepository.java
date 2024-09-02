package com.itshaala.bankingapplication.repository;

import com.itshaala.bankingapplication.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
