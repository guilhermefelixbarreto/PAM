package com.example.appaula.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Pessoa::class], //A entidade "pessoa" é utilizada para criar uma tabela no banco de dados.
    version = 1 //Versão do banco de dados
)

abstract class PessoaDataBase: RoomDatabase() {
    abstract fun pessoaDao(): PessoaDao // Está retornando uma instância da pessoaDao.
}