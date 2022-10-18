import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        String playerA = "";
        String playerB = "";
        String YN = "";
        boolean playAgain = false;
        boolean done = false;

        do {
            System.out.print("\n Player A's move, please enter [R,P,S]: ");
            {
                if (in.hasNextLine()) {
                    playerA = in.nextLine();
                }


                System.out.print("\n Player B's move, please enter [R,P,S]: ");
                {
                    if (in.hasNextLine()) {
                        playerB = in.nextLine();
                    }

                }

                if (playerA.equalsIgnoreCase("R"))

                    if (playerB.equalsIgnoreCase("R")) {
                        System.out.println("Rock vs Rock, ITS A TIE!");
                        done = true;
                    } else if (playerB.equalsIgnoreCase("P")) {
                        System.out.println("Paper covers rock, Player B Wins!");
                        done = true;
                    } else if (playerB.equalsIgnoreCase("S")) {
                        System.out.println("Rock breaks Scissors, Player A Wins!");
                        done = true;
                    }


                if (playerA.equalsIgnoreCase("P"))

                    if (playerB.equalsIgnoreCase("R")) {
                        System.out.println("Paper covers rock, Player A Wins!");
                        done = true;
                    } else if (playerB.equalsIgnoreCase("P")) {
                        System.out.println("Paper vs Paper, ITS A TIE");
                        done = true;
                    } else if (playerB.equalsIgnoreCase("S")) {
                        System.out.println("Scissors cuts Paper, Player B Wins!");
                        done = true;
                    }

            }

            if (playerA.equalsIgnoreCase("S"))

                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors! Player B wins!");
                    done = true;
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cut Paper! Player A wins!");
                    done = true;

                } else if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors vs Scissors, ITS A TIE!");
                    done = true;
                }


        } while (!done);

        do {
            {
                System.out.println("Would you like to play again [Y/N] ");
            }
            if (in.hasNextLine()) {
                YN = in.nextLine();
            }

            if (YN.equalsIgnoreCase("N"))
            {
                System.out.println("Thanks for Playing!");
                break;
            }

            else if (YN.equalsIgnoreCase("Y")) {


                {
                    System.out.print("\n Player A's move, please enter [R,P,S]: ");
                }
                if (in.hasNextLine()) {
                    playerA = in.nextLine();
                }
                {
                    System.out.print("\n Player B's move, please enter [R,P,S]: ");
                }
                if (in.hasNextLine()) {
                    playerB = in.nextLine();
                }


                if (playerA.equalsIgnoreCase("R"))

                    if (playerB.equalsIgnoreCase("R")) {
                        System.out.println("Rock vs Rock, ITS A TIE!");
                        done = true;
                    } else if (playerB.equalsIgnoreCase("P")) {
                        System.out.println("Paper covers rock, Player B Wins!");
                        done = true;
                    } else if (playerB.equalsIgnoreCase("S")) {
                        System.out.println("Rock breaks Scissors, Player A Wins!");
                        done = true;
                    }


                if (playerA.equalsIgnoreCase("P"))

                    if (playerB.equalsIgnoreCase("R")) {
                        System.out.println("Paper covers rock, Player A Wins!");
                        done = true;
                    } else if (playerB.equalsIgnoreCase("P")) {
                        System.out.println("Paper vs Paper, ITS A TIE");
                        done = true;
                    } else if (playerB.equalsIgnoreCase("S")) {
                        System.out.println("Scissors cuts Paper, Player B Wins!");
                        done = true;
                    }


                if (playerA.equalsIgnoreCase("S"))

                    if (playerB.equalsIgnoreCase("R")) {
                        System.out.println("Rock breaks Scissors! Player B wins!");
                        done = true;
                    } else if (playerB.equalsIgnoreCase("P")) {
                        System.out.println("Scissors cut Paper! Player A wins!");
                        done = true;

                    } else if (playerB.equalsIgnoreCase("S")) {
                        System.out.println("Scissors vs Scissors, ITS A TIE!");
                        done = true;
                    }

            }


        }while(playAgain = true);

    }
}