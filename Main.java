import question.Question;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Question question1 = new Question(
                "Cтолица России:",
                "Москва", "Париж", "Лондон", "Нью-Йорк", 1);

        Question question2 = new Question(
                "Как назывался особый головной убор, который носили фараоны в Древнем Египте?:",
                "Картуз", "Немес", "Корона", "Убрус", 2);

        Question question3 = new Question(
                "У какого животного самые большие глаза относительно тела?",
                "У лемура", "У летучей мыши", "У долгопята", "У тупайи", 3);

        Question question4 = new Question(
                "Как называли строителя в старину?",
                "Бондарь", "Бортник", "Зодчий", "Кормчий", 3);

        Question question5 = new Question(
                "Какое из этих растений — плотоядное?",
                "Володушка", "Росянка", "Мытник", "Астрагал", 2);



        printQuestion(question1);
        printQuestion(question2);
        printQuestion(question3);
        printQuestion(question4);
        printQuestion(question5);


    }

    private static void printQuestion (Question question) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("вопрос: " + question.getQuestion());
        Thread.sleep(500);
        System.out.println("1. " + question.getAnswer1());
        Thread.sleep(500);
        System.out.println("2. " + question.getAnswer2());
        Thread.sleep(500);
        System.out.println("3. " + question.getAnswer3());
        Thread.sleep(500);
        System.out.println("4. " + question.getAnswer4());
        Thread.sleep(500);
        System.out.println("Введите правильный ответ: ");
        Thread.sleep(500);
        int result = scanner.nextInt();
        if (result == question.currentAnswer){
            System.out.println("Правильый ответ!");
            Thread.sleep(500);
        }
        else {System.out.println("Неверно!");
        Thread.sleep(500);}


    }
}
