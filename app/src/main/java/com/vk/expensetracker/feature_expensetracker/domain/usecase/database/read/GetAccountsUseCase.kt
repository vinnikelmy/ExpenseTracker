package com.vk.expensetracker.feature_expensetracker.domain.usecase.database.read

import com.vk.expensetracker.feature_expensetracker.domain.model.Account
import com.vk.expensetracker.feature_expensetracker.domain.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAccountsUseCase @Inject constructor(private val repo: TransactionRepository) {
    operator fun invoke(): Flow<List<Account>> {
        return repo.getAllAccounts()
    }
}