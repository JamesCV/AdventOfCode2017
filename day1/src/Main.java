import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        int finishSum = 0;
        System.out.println("Enter a set of numbers next to each other. e.g. 44921");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int[] answers = new int[input.length()];

        for (int i = 0; i < input.length(); i += 1) {
            answers[i] = Integer.parseInt(input.substring(i, i + 1));
        }

        for (int i = 0; i < answers.length; i+=1) {
            if (i == (answers.length - 1)) {
                if (answers[i] == answers[0]) {
                    finishSum += answers[i];
                }
                System.out.println("Captcha finsihed, sum = " + finishSum);
            } else {
                if (answers[i] == answers[i+1]) {
                    finishSum += answers[i];
                }
            }
        }
    }
}















