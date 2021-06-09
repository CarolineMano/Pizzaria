import java.util.Scanner;
import model.Menu;
import util.List;
import util.Tool;

public class App {
    public static void main(String[] args) {
        ManageOrders manager = new ManageOrders();
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        int option = 0;
        int topping = 0;
        List newOrder;
        boolean endOfProgram = true;

        System.out.println("*****Pizzaria da Carol*****");

        do {
            System.out.println("\nEscolha uma das opções abaixo: ");
            System.out.println("1 - Cliente quer fazer novo pedido");
            System.out.println("2 - Verificar qual será o próximo pedido a ser atendido");
            System.out.println("3 - Atender um cliente");
            System.out.println("4 - Exibir a fila de pedidos");
            System.out.println("5 - Finalizar o programa (só poderá ser finalizado caso não tenha mais pedidos na fila)");
            System.out.print("Opção: ");

            option = Tool.convertStringToInt(input);

            switch (option) {
                case 1:
                    System.out.println(menu.showAllToppings());
                    System.out.println("Quantas pizzas vai querer?");
                    option = Tool.convertStringToInt(input);
                    newOrder = new List();

                    int i = 0;
                    while(i < option){
                        System.out.println("Escolha o seu sabor a partir do número no menu: ");
                        topping = Tool.convertStringToInt(input) - 1;
                        if(topping >= 0 && topping <= 3) {
                            newOrder.addBeginning(menu.getMenu()[topping]);
                            i++;
                        }
                        else {
                            System.out.println("Por favor, escolha uma opção válida!");
                        }
                    }
                    manager.addOrder(newOrder);
                    break;
                case 2:
                    if(manager.isEmpty()) {
                        System.out.println("Não há pedidos para serem atendidos.");
                        break;
                    }
                    System.out.println(manager.showNextOrder());
                    break;
                case 3:
                    if(manager.isEmpty()) {
                        System.out.println("Não há pedidos para serem atendidos.");
                        break;
                    }
                    System.out.println("Pedido pronto!");
                    System.out.println(manager.makeNextOrder());
                    break;
                case 4:
                    System.out.println(manager.showAllOrders());
                    break;
                case 5:
                    endOfProgram = !manager.isEmpty();
                    if(endOfProgram) {
                        System.out.println("Ainda há pedidos para serem atendidos!");
                    }
                    break;
                default:
                    System.out.println("Por favor, escolha uma opção do menu válida");
                    break;
            }

        } while (endOfProgram);

        input.close();
        System.out.println("Pizzaria fechada");
 
    }
}
