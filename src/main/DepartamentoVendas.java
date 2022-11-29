package main;

public class DepartamentoVendas extends Departamento {
    
    private float totalVendas;

    public DepartamentoVendas(float totalVendas, String nomeDepartamento, String funcaoDepartamento) {
        super(nomeDepartamento, funcaoDepartamento);
        this.totalVendas = totalVendas;
    }

    public float getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(float totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public String getInformacaoDepartamento() {
        return "Departamento: "+this.getNomeDepartamento()+" da função "+this.getFuncaoDepartamento()+ " possui total de vendas: "+ totalVendas;
    }
}
