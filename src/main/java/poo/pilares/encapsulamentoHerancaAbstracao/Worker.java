package poo.pilares.encapsulamentoHerancaAbstracao;

/*
    Essa classe irá demonstrar o uso de Herança e Abstração em POO.
        * Herança permite que uma classe herde características de outra. A classe filha
            (subclasse) herda atributos e métodos da classe pai (superclasse).
        * A abstração é a simplificação de objetos do mundo real para o mundo digital, de forma a
            capturar apenas o essencial conforme a necessidade da sua aplicação.
    Observe que a classe filha (Worker) consegue acessar métodos e atributos da classe pai (Person)
    e, além disso, possui os seus próprios métodos e atributos.
 */
public class Worker extends Person {

    // Atributos privados
    private double salary;

    // Construtor padrão
    public Worker() {
        super();
        this.salary = 1000;
    }

    // Construtor personalizado
    public Worker(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    // Métodos públicos para acessar e modificar atributos
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Método para exibir informações
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary: " + salary);
    }

    // Método para verificar se é rico
    public boolean isRich() {
        return salary > 10000;
    }

    // Método para trabalhar
    public void work() {
        System.out.println(this.getName() + " is working...");
    }

}
