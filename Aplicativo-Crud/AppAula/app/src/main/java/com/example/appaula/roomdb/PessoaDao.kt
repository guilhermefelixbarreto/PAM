package com.example.appaula.roomdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao // (Data Access Object) que é usada para interagir com o banco de dados
interface PessoaDao { //PessoaDao contém os métodos de acesso e manipulação dos dados da tebela "Pessoa".

    @Upsert
    suspend fun  upsertPessoa(pessoa: Pessoa) //Insere ou atualiza

    @Delete
    suspend fun deletePessoa(pessoa: Pessoa) //Excluí algum determinado campo

    @Query("SELECT * FROM pessoa") //Seleciona todos os campos da classe "Pessoa"
    fun getAllPessoa(): Flow<List<Pessoa>>
}