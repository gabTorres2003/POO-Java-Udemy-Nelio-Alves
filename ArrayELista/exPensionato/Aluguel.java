package ArrayELista.exPensionato;

public class Aluguel {

    private String email, nome;
    
    public Aluguel(){
    }

    public Aluguel(String email, String nome) {
        this.email = email;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome + ", " + email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }  

}
