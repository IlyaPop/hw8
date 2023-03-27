import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Камень, ножницы или бумага? \nКамень - 0 , ножницы - 1 , бумага - 2");
        int rockPaperScissors = input.nextInt();
        double computer = (int)(Math.random() * 3);
        if (rockPaperScissors == 0 && computer == 0) {
            System.out.println("Компьютер - камень. Ты - камень. Ничья.");
        } else if (rockPaperScissors == 0 && computer == 1) {
            System.out.println("Компьютер - ножницы. Ты - камень. Ты выиграл");
        } else if (rockPaperScissors == 0 && computer == 2) {
            System.out.println("Компьютер - бумага. Ты - камень. Ты проиграл");
        } else if (rockPaperScissors == 1 && computer == 0) {
            System.out.println("Компьютер - камень. Ты - ножницы. Ты проиграл");
        } else if (rockPaperScissors == 1 && computer == 1) {
            System.out.println("Компьютер - ножницы. Ты - ножницы. Ничья.");
        } else if (rockPaperScissors == 1 && computer == 2) {
            System.out.println("Комьютер - бумага. Ты - ножницы. Ты победил");
        } else if (rockPaperScissors == 2 && computer == 0) {
            System.out.println("Компьютер - камень. Ты - бумага. Ты победил");
        } else if (rockPaperScissors == 2 && computer == 1) {
            System.out.println("Компьютер - ножницы. Ты - бумага. Ты проиграл");
        } else if (rockPaperScissors == 2 && computer == 2) {
            System.out.println("Компьютер - бумага. Ты - бумага. Ничья.");
        }
    }
}