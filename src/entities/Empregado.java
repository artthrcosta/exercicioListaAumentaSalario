package entities;

public class Empregado {

    private Integer id;
    private String name;
    private Double salary;

    public Empregado(Integer id, String name, Double salary) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void aumentarSalario(Double porcentagem) {
        this.salary += salary * porcentagem /100.0;
    }
    @Override
    public String toString() {
        return   "Id: "+ id+
                 ", Nome: "+ name+
                 ", Salário: "+ salary
                ;
    }
}

