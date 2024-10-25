package conteudo.orientacaoobjetos;

import conteudo.orientacaoobjetos.entities.ExercicioListaEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioListas {
    public static void main(String[] args) {

        //exercicio resolvido com explicacao: https://www.youtube.com/watch?v=Xj-osdBe3TE

        Scanner sc = new Scanner(System.in);

        List<ExercicioListaEmployee> list = new ArrayList<>(); //pelo tipo List ser uma interface, não tem como instanciar ele mesmo.

        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.println("Employee " + (i+1) + ": ");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            ExercicioListaEmployee emp = new ExercicioListaEmployee(id, name, salary);

            list.add(emp); //adicionando a lista o objeto emp (com os parametros)
        }

        System.out.println("Enter the employee id that will have salary increase : ");
        int idSalary = sc.nextInt();
        Integer pos = position(list, idSalary);
        if (pos == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.println("Enter percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of Employees");
        for (ExercicioListaEmployee emp : list) { //para cada ExercicioListaEmployee emp na minha lista list
            System.out.println(emp);
        }




        sc.close();
    }

    //função para verificar a posicao do id na lista
    public static Integer position(List<ExercicioListaEmployee> list, int id) { //essa função vai receber como argumentos, uma lista de funcionarios e um ID e irá retornar a posiçao do funcionario na lista. OBS: o list daqui nao tem a ver com o list do objeto declarado mais acima no codigo.
        for (int i = 0; i < list.size() ; i++) { //list.size significa que ira percorrer pelo tamanho da lista
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
