package ArrayELista.exArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos colaboradores serão cadastrados?: ");
        int totalColaboradores = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for(int i=0; i < totalColaboradores; i++){
            System.out.println();
            System.out.println("Colaborador #" + (i+1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salário: ");
            double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);
            list.add(employee);
        }

        System.out.println();
        System.out.print("Insira o ID do colaborador que terá um aumento no salário: ");
        int idAumento = sc.nextInt();
        int posicao = posicaoId(list, idAumento);
        if (posicao == -1) {
            System.out.println("Este ID não existe!");
        }else{
            System.out.print("Porcentagem do aumento: ");
            double porcentagem = sc.nextDouble();
            list.get(posicao).aumentoSalarial(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de colaboradores: ");
        for(Employee colaborador : list){
            System.out.println(colaborador);
        }

        sc.close();
    }

    public static int posicaoId (List<Employee> list, int id){
        for(int i= 0; i < list.size(); i++){
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
