package main;

public class AplicacaoCel extends Aplicacao{

    @Override
    public String getTipo(){
        return "Aplicação Celular";
    }

    @Override
    public String verificarEntrada() {
        if (this.getEntrada().equals("home")){
            return "C_templete com varios botões";
        }

        return "Templete invalido";
    }
}
