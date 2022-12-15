package main;

public abstract class Aplicacao {
    private String entrada;
    private String inter;

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getInter() {
        return inter;
    }

    public void setInter(String inter) {
        this.inter = inter;
    }

    public abstract String verificarEntrada();

    public String getTipo(){
        return "Aplicação base";
    }

    public String getInformacao(){
        return getTipo() + ": "+
                "entrada=" + this.entrada +
                ", interface=" + this.inter +
                ", entrada tratada=" + verificarEntrada();
    }
}
