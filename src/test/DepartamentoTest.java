package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import main.*;

public class DepartamentoTest {

    @Test
    public void deveRetornarInformacooesDepartamentoFinanceiro(){
        ChefeDepartamento chefeDepartamento = new ChefeDepartamento(123456, "Júlia");
        DepartamentoFinanceiro departamentoFinanceiro = new DepartamentoFinanceiro(1000, 
                                                            "Financeiro 1", 
                                                            "Verificar contabilização");
        
        DepartamentoVendas departamentoVendas = new DepartamentoVendas(20000, 
                                                            "Vendas 1", 
                                                            "Contabilizar vendas totais");
        
        chefeDepartamento.adicionaDepartamento(departamentoFinanceiro);
        chefeDepartamento.adicionaDepartamento(departamentoVendas);
        
        String saidaEsperada = "Chefe : Júlia\n" +
                               "Departamento: Financeiro 1 de função: Verificar contabilização possui em contabilidade: 1000.0" +
                               "Departamento: Vendas 1 da função Contabilizar vendas totais possui total de vendas: 20000.0" ;
        
        
        assertEquals(saidaEsperada, chefeDepartamento.getDepartamentos() );
    }
    
}
