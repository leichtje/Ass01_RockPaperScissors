import java.util.Scanner;

public class Ass01_RockPaperScissors {
    public static void main(String[] args) {

        String playerAMove="";
        String playerBMove="";
        boolean done1 = false;
        boolean done2 = false;
        boolean done3 = false;
        String trash = "";
        String shouldContinue;

        Scanner in = new Scanner(System.in);

        do {

            do {
                System.out.println("Player A enter your move");
                if (in.hasNext()) {
                    playerAMove = in.nextLine();

                    if (playerAMove.equalsIgnoreCase("R") || playerAMove.equalsIgnoreCase("P") || playerAMove.equalsIgnoreCase("S")) {
                        System.out.println("Player A move is: " + playerAMove);
                        done1 = true;
                    } else {
//                        trash = in.nextLine();
                        System.out.println("You entered an invalid move: " + playerAMove + " Please try again with a valid move[R,P,S]");
                    }
                } else {
                    trash = in.nextLine();
                    System.out.println("You entered an invalid move: " + trash + " Please try again with a valid move[R,P,S]");
                }
            } while (!done1);





            do {
                System.out.println("Player B enter your move");
                if (in.hasNext()) {
                    playerBMove = in.nextLine();
                    if (playerBMove.equalsIgnoreCase("R") || playerBMove.equalsIgnoreCase("P") || playerBMove.equalsIgnoreCase("S")) {
                        System.out.println("Player B move is: " + playerBMove);
                        done2 = true;
                    }
                    else {
                     //   trash = in.nextLine();
                        System.out.println("You entered an invalid move: " + playerBMove + " Please try again with a valid move[R,P,S]");
                    }
                } else {
                    trash = in.nextLine();
                    System.out.println("You entered an invalid move: " + trash + " Please try again with a valid move[R,P,S]");
                }

            } while (!done2);




            if (playerAMove.equalsIgnoreCase("R")) {
                if (playerBMove.equalsIgnoreCase("R")) {
                    System.out.println("It is a tie");
                } else if (playerBMove.equalsIgnoreCase("P")) {
                    System.out.println("Paper beats Rock, Player B wins");
                } else if (playerBMove.equalsIgnoreCase("S")) {
                    System.out.println("Rock beats Scissors, Player A wins");
                }
            }
            if (playerAMove.equalsIgnoreCase("P")) {
                if (playerBMove.equalsIgnoreCase("P")) {
                    System.out.println("It is a tie");
                } else if (playerBMove.equalsIgnoreCase("S")) {
                    System.out.println("Scissors beats Paper, Player B wins");
                } else if (playerBMove.equalsIgnoreCase("R")) {
                    System.out.println("Paper beats Rock, Player A wins");
                }
            }
            if (playerAMove.equalsIgnoreCase("S")) {
                if (playerBMove.equalsIgnoreCase("S")) {
                    System.out.println("It is a tie");
                } else if (playerBMove.equalsIgnoreCase("R")) {
                    System.out.println("Rock beats Scissors, Player B wins");
                } else if (playerBMove.equalsIgnoreCase("P")) {
                    System.out.println("Scissors beats Paper, Player A wins");
                }

            }
            System.out.println("Do you want to play again [Y/N]");
            if(in.hasNext()) {
                 shouldContinue = in.nextLine();//Receive a string input from user
                if (shouldContinue.equalsIgnoreCase("N")) {
                    done3 = true;
                }
            }
        }while (!done3) ;
    }
}