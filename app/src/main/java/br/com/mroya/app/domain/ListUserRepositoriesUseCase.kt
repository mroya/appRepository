package br.com.mroya.app.domain

import br.com.mroya.app.core.UseCase
import br.com.mroya.app.data.repositories.RepoRepository
import br.com.mroya.app.data.model.Repo
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}