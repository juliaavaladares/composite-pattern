package main;

public class DepartamentoFinanceiro extends Departamento{

    private float contabilidadeTotal;

    public DepartamentoFinanceiro(float contabilidadeTotal, String nomeDepartamento, String funcaoDepartamento) {
        super(nomeDepartamento, funcaoDepartamento);
        this.contabilidadeTotal = contabilidadeTotal;
    }

    public float getContabilidadeTotal() {
        return contabilidadeTotal;
    }

    public void setContabilidadeTotal(float contabilidadeTotal) {
        this.contabilidadeTotal = contabilidadeTotal;
    }

    @Override
    public String getInformacaoDepartamento() {
        return "Departamento: "+ this.getNomeDepartamento()+ " de função: "+ this.getFuncaoDepartamento()+ " possui em contabilidade: "+contabilidadeTotal;
    }
    
}
