package com.sunil.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sunil.entity.AccountTransactions;

@Repository
public interface AccountTransactionsRepository extends JpaRepository<AccountTransactions, Long> {

	List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(int customerId);
}
