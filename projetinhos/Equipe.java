package projetinhos;

public class Equipe {
    private String nome;
    int vitorias;
    int derrotas;
    int empates;

    Equipe(String nome){
        nome = this.nome;
        vitorias = 0;
        derrotas = 0;
        empates = 0;
    }
    void setNome(String nome){
        nome = this.nome;
    }
    public getNome(){
        return nome;
    }

}
