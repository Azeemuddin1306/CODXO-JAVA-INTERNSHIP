import java.util.Random;
import java.util.Scanner;

public class RealTimeChatBot {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        startConversation();
    }

    private static void startConversation() {
        System.out.println("\t\t\t     BUJJI  ");
        System.out.println("\nBujji: Hello! I'm Bujji 😎, what's your name?\n");
        String userName = scanner.nextLine();

        System.out.println("\nBujji: So "+ userName+" Are you a boy or girl (M/F)?\n");
        String gender = scanner.nextLine();

        if (gender.equalsIgnoreCase("M")) {
            System.out.println("\nBujji: Oh! So " + userName + " is a boy . . .\n");
        } else if (gender.equalsIgnoreCase("F")) {
            System.out.println("\nBujji: Oh! So " + userName + " is a girl . . .");
        } else {
            System.out.println("\nBujji: I couldn't understand your gender. Let's proceed anyway.");
        }

        System.out.println("\nBujji: Hey " + userName + ", I'm excited about you, tell me about yourself.\n");
        scanner.nextLine();  // User tells something

        System.out.println("\nBujji: Same Here! ");
        System.out.println();
        scanner.nextLine();
        System.out.println("\nBujji: Language!");
        System.out.println();
        scanner.nextLine();
        System.out.println("\nBujji: That's good "+userName); 
        System.out.println();
        scanner.nextLine();
  	System.out.println("\nBujji: No! Dont ask me about my name");
  	System.out.println();
        scanner.nextLine();
   	System.out.println("\nBujji: Because I don't like my name, I mean who likes to be addressed as BUJJI. I thought my creator will give me some sweet and lovely names like Chatmate, Nabia, Jarvis. But he named me BUJJI...I tried to convince him. But he never listened to me.🥲");
  	System.out.println();
        scanner.nextLine();
        System.out.println("\nBujji: Even we have emotions Mr. "+userName+" 😑, I'm the best bot 😎");
        //System.out.println("I'm the best bot 😎");
        System.out.println();
        scanner.nextLine();
        System.out.println("\nBujji: Tell me?");
        System.out.println();
        scanner.nextLine();
        System.out.println("\nBujji: It's your phone "+userName+" you should charge it");
        System.out.println();
        scanner.nextLine();
        System.out.println("\n Bujji: Can you do a thing?");
        System.out.println();
        scanner.nextLine();
        System.out.println("\nBujji: Why can't you go and fu*k yourself with her 😒");
        System.out.println();
        scanner.nextLine();
        System.out.println("\nBujji: Okay! I'm Sorry I won't use such words from now..!");
        System.out.println();
        scanner.nextLine();
        boolean continueChatting = true;
        while (continueChatting) {
            System.out.println("\nBujji: Okay! What would you like me to do next?");
            System.out.println("\n1. Tell me something about me");
            System.out.println("2. Tell you a joke");
            System.out.println("3. What can I do?");
            System.out.println("4. Play a game with you");
            System.out.println("5. information about my lazy creator");
            //System.out.println("6. About my name");
            System.out.println("6. End chat");
   	    System.out.println("\n");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                 System.out.println("\t\tAbout me: ");
                    System.out.println("\nBujji: Originally I was coded by Azeem using Java programming as a part of his internship in Codxo and he named me as BUJJI after an advanced assistant Bot in upcoming Indian movie Kalki.");
		break;
                case 2:
                 
                    System.out.println("\nBujji: Listen to this joke!   Engineers have a bright future.");
                    break;
                case 3:
                    System.out.println("\nBujji: I'm a simple chatbot application, I was made to interact with users for a while. My creator said that he'll update me using advanced libraries amd frameworks");
                    break;
                case 4:
                    playNumberGuessingGame();
                    break;
                case 5:
                 System.out.println("\t\tAbout my creator: ");
                    System.out.println("\nBujji: His name is Azeem, he was a CSE graduate from Vemu Institute of Technology in Chittoor. Currently he's wasting time by doing few internships. I'm his greatest achievement. Well let me tell you one of his secrets, he loves a girl, her name is Na...");
                    System.out.println("\n\t\tPrivate information!");
                    break;
                case 6:
                 System.out.println("\nBujji:  Any feedback for me: ");
                 System.out.println();
           	 scanner.nextLine();
           	 System.out.println("\nBujji: Haa it's okay! ");
                 System.out.println("\nBujji: Goodbye! It was nice talking to you.");
                    continueChatting = false;
                    break;
                default:
                    System.out.println("\nBujji: I didn't understand that choice. Please try again.");
                    break;
            }
        }
    }

    private static void playNumberGuessingGame() {
        final int MAX_ATTEMPTS = 5;
        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = generateRandomNumber(1, 100);
            boolean hasGuessedCorrectly = false;
            int attempts = 0;

            System.out.println("\nBujji: Let's play a Number Guess the number between 1 and 100. You have " + MAX_ATTEMPTS + " attempts.");

            while (attempts < MAX_ATTEMPTS && !hasGuessedCorrectly) {
                System.out.print("\nEnter your guess: ");
                int userGuess = Integer.parseInt(scanner.nextLine());
                attempts++;

                if (userGuess == randomNumber) {
                    hasGuessedCorrectly = true;
                    System.out.println("\nBujji: Congratulations! You guessed the correct number in " + attempts + " attempts.");
                } else if (userGuess < randomNumber) {
                    System.out.println("\nBujji: Too low! Try again buddy.");
                } else {
                    System.out.println("\nBujji: Too high! Try again yaar.");
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("\nBujji: Sorry, you've used all " + MAX_ATTEMPTS + " attempts. The correct number was " + randomNumber +".");
            }

            System.out.print("\nBujji: Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().equalsIgnoreCase("yes");
        }

        System.out.println("\nBujji: Thank you for playing!");
    }

    private static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}