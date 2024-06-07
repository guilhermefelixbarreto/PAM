package com.example.appaula.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.appaula.roomdb.Pessoa
import kotlinx.coroutines.launch

class PessoaViewModel(private val repository: Repository): ViewModel() {
    fun getPessoa() = repository.getAllPessoa().asLiveData(viewModelScope.coroutineContext) //O "AsLiveData" exibe as requisições em tempo real.

    fun upsertPessoa(pessoa: Pessoa){ //Insere ou atualiza uma pessoa no banco de dados dentro do escopo "View Model".
        viewModelScope.launch {
            repository.upsertPessoa(pessoa)
        }
    }

    fun deletePessoa(pessoa: Pessoa){ // Exclui uma pessoa do banco de dados dentro do escopo "ViewModel".
        viewModelScope.launch {
            repository.deletePessoa(pessoa)
        }
    }
}