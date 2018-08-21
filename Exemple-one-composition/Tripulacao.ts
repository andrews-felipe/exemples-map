import { Pessoa } from './Pessoa'

export class Tripulacao{
    idTripulacao : number
    pessoa : Pessoa

    getIdTripulacao(){
        return this.idTripulacao
    }

    setIdTripulacao(id){
        this.idTripulacao = id
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