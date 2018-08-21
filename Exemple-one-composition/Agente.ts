import { Pessoa } from "./Pessoa";

export class Agente{
    idAgente : number;
    pessoa : Pessoa
    
    getIdAgente(){
        return this.idAgente
    }

    setIdAgente(id){
        this.idAgente = id
    }

    getNome(){
        return this.pessoa.nome
    }

    setNome(name){
        this.pessoa.nome = name
    }
    
    getEndereco(){
        return this.pessoa.endereco
    }

    setEndereco(novo_endereco){
        this.pessoa.nome = name
    }

    generateRandomRef() : number{
        return Math.floor(Math.random()*5)
    }
}