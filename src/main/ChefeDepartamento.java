package main;

import java.util.ArrayList;
import java.util.List;

public class ChefeDepartamento {

    private Integer id;
    private String nome;
    private List<Departamento> departamentos;

    public ChefeDepartamento(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
        this.departamentos = new ArrayList<Departamento>();
    }

    public void adicionaDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void removeDepartmento(Departamento departamento) {
        departamentos.remove(departamento);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
}
