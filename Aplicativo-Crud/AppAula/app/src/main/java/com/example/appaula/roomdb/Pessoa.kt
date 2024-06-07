package com.example.appaula.roomdb

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity //A anotação "@Entity" é utilizada para indicar que essa classe representa uma tabela no banco de dados.
data class Pessoa( // Pessoa Kt - A classe "pessoa" no código define uma entidade para o uso com o banco de dados.
    val nome: String, // /A classe possuí três propriedadades: "nome", "telefone" e "id" - São do tipo "String" e representam colunas na tabela.
    val telefone: String,
    @PrimaryKey(autoGenerate = true) //"@PrimaryKey" indica que a propriedade "id" é chave primária da tebela. o parâmetro "autoGenerate = true" significa que o valor da chave primária vai ser gerada automaticamente pelo Room.
    val id: Int = 0 //Define o "iD" como valor 0.
)


