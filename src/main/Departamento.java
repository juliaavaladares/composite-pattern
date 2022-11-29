package main;

public abstract class Departamento {

    private String nomeDepartamento;
    private String funcaoDepartamento;

    public Departamento(String nomeDepartamento, String funcaoDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
        this.funcaoDepartamento = funcaoDepartamento;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public String getFuncaoDepartamento() {
        return funcaoDepartamento;
    }

    public void setFuncaoDepartamento(String funcaoDepartamento) {
        this.funcaoDepartamento = funcaoDepartamento;
    }

    public abstract String getInformacaoDepartamento();
}