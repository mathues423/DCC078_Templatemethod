package main;

public class AplicacaoWin extends Aplicacao{

    @Override
    public String getTipo(){
        return "Aplicação Windows";
    }

    @Override
    public String verificarEntrada() {
        if (this.getEntrada().equals("home")){
            return "W_templete";
        }

        return "Templete invalido";
    }
}
