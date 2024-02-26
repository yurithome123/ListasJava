import java.util.Scanner;

public class ex02 {
    public static void ex1() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println("X = " + (a + b - c));
    }

    public static void ex2() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt(), d = input.nextInt();
        System.out.println("Yuri:" + (a + b + c + d) / 4);
    }

    public static void ex3() {
        Scanner input = new Scanner(System.in);
        if (input.nextInt() >= 0) {
            System.out.println("Depois de Cristo");
        } else {
            System.out.println("Antes de Cristo");
        }
    }

    public static void ex4() {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble(), b = input.nextDouble();
        if (a > b) {
            System.out.println("O primeiro número é maior");
        } else if (a < b) {
            System.out.println("O segundo número é maior");
        }

    }

    public static void ex5() {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble(), b = input.nextDouble();
        if (a > b) {
            System.out.println("O primeiro número é maior");
        } else if (a < b) {
            System.out.println("O segundo número é maior");
        } else {
            System.out.println("Os números são iguais");
        }
    }

    public static void ex6() {
        Scanner input = new Scanner(System.in);
        if ((input.nextDouble() + input.nextDouble()) / 2 >= 70) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void ex7() {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble(), b = input.nextDouble();
        if ((a + b) / 2 >= 40 && (a + b) / 2 < 70) { // media A + B é maior ou igual a 70
            System.out.println("Aprovado");
        } else if (((a + b) / 2 < 40)) {
            System.out.println("Reprovado");
        }
    }

    public static void ex8() {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
        if (a > b && a > c) {
            System.out.println("O maior número é " + a);
        } else if (b > a && b > c) {
            System.out.println("O maior número é " + b);
        } else if (c > a && c > b) {
            System.out.println("O maior número é " + c);
        }
        if (a < b && a < c) {
            System.out.println("O menor número é " + a);
        } else if (b < a && b < c) {
            System.out.println("O menor número é " + b);
        } else if (c < a && c < b) {
            System.out.println("O menor número é " + c);
        }
    }

    public static void quest(){
        Scanner input = new Scanner(System.in);
        switch (input.nextInt()) {
            case 1:
                ex1();
                return;
            case 2:
                ex2();
                return;
            case 3:
                ex3();
                return;
            case 4:
                ex4();
                return;
            case 5:
                ex5();
                return;
            case 6:
                ex6();
                return;
            case 7:
                ex7();
                return;
            case 8:
                ex8();
                return;
            default:
                System.out.println("Nenhum selecionado, saindo");
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha um exercício para executar: ");
        System.out.println("1 - Exercício 1");
        System.out.println("2 - Exercício 2");
        System.out.println("3 - Exercício 3");
        System.out.println("4 - Exercício 4");
        System.out.println("5 - Exercício 5");
        System.out.println("6 - Exercício 6");
        System.out.println("7 - Exercício 7");
        System.out.println("8 - Exercício 8");
        quest();
    }
}
