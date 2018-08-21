import { Pessoa } from "./Pessoa";

export class Passageiro{
    numeroSmiles : number;
    pessoa : Pessoa


    getnumeroSmiles(){
        return this.numeroSmiles
    }

    setnumeroSmiles(numero){
        this.numeroSmiles = numero
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

}