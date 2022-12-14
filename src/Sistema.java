import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ApplicationFacade facade = new ApplicationFacade();

        while (true) {
            String opcao = menu(scanner);
            comandos(opcao, scanner, facade);
        }
    }

    private static String menu(Scanner scanner) {
        System.out.print("\n(C)adastrar Produto\n" +
                    "(E)xibir Produto\n" +
                    "(N)ovo Lote\n" +
                    "(L)istar Produtos\n" +
                    "(V)er lotes\n" +
                    "\n" +
                    "Opção> ");

        return scanner.next().toUpperCase();
    }

    private static void comandos(String opcao, Scanner scanner, ApplicationFacade facade) throws IllegalArgumentException {
        limpaBuffer(scanner);
        switch (opcao) {
            case "C":
                cadastraProduto(facade, scanner);
                break;
            case "E":
                exibeProduto(facade, scanner);
                break;
            case "N":
                cadastraLote(facade, scanner);
                break;
            case "L":
                listaProdutos(facade, scanner);
                break;
            case "V":
                listaLotes(facade, scanner);
                break;
            default:
                System.out.println("Entrada inválida!");
                throw new IllegalArgumentException();

        }
    }

    private static void listaLotes(ApplicationFacade facade, Scanner scanner) {

        System.out.println(facade.listaLotes());
    }

    private static void listaProdutos(ApplicationFacade facade, Scanner scanner) {
        System.out.println(facade.listaProdutos());
    }

    private static void cadastraLote(ApplicationFacade facade, Scanner scanner) {
        System.out.print("Nome do produto: ");
        String nome = scanner.next();
        limpaBuffer(scanner);

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        limpaBuffer(scanner);

        System.out.print("Data: ");
        String data = scanner.next();
        limpaBuffer(scanner);

        System.out.println(facade.cadastraLote(nome, quantidade, data));
    }

    private static void exibeProduto(ApplicationFacade facade, Scanner scanner) {
        System.out.print("ID: ");
        String produtoID = scanner.next();
        limpaBuffer(scanner);

        System.out.println(facade.exibeProduto(produtoID));
    }

    private static void cadastraProduto(ApplicationFacade facade, Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Fabricante: ");
        String fabricante = scanner.nextLine();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        limpaBuffer(scanner);

        System.out.println(facade.cadastraProduto(nome, fabricante, preco));
    }

    private static void limpaBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
