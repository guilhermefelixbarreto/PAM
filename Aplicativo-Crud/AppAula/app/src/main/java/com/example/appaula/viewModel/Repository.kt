package com.example.appaula.viewModel

import com.example.appaula.roomdb.Pessoa
import com.example.appaula.roomdb.PessoaDataBase

data class Repository(private val db:PessoaDataBase){
    suspend fun upsertPessoa(pessoa: Pessoa){ //Insere ou atualiza uma pessoa no banco de dados.
        db.pessoaDao().upsertPessoa(pessoa)
    }

    suspend fun deletePessoa(pessoa: Pessoa){ //Exclui uma pessoa do banco de dados.
        db.pessoaDao().deletePessoa(pessoa)
    }

    fun getAllPessoa() = db.pessoaDao().getAllPessoa() //Retorna todas as pessoas do banco da dedos.
}
