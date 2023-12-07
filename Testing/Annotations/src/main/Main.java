import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Add candidates to the map during system initialization
        VotingSystem votingSystem = new VotingSystem();
        votingSystem.addCandidate("Merkel");
        votingSystem.addCandidate("Kamto");
        votingSystem.addCandidate("Kouamou");

        Scanner scanner = new Scanner(System.in);

        // Register users
        votingSystem.registerUser("Terissa", "teri123");
        votingSystem.registerUser("Derick", "der123");
        votingSystem.registerUser("Jason", "j123");
        votingSystem.registerUser("Reine", "reine123");
        votingSystem.registerUser("Mado", "mado123");
        votingSystem.registerUser("Carolyn", "caro123");
        votingSystem.registerUser("Patu", "patu123");
        votingSystem.registerUser("Blanche", "queen123");
        votingSystem.registerUser("Sandrine", "san123");
        votingSystem.registerUser("Luqman", "luq123");

        for (int i = 0; i < votingSystem.users.size();  i++) {
            System.out.print("Enter username to login: ");
            String loginUsername = scanner.nextLine();
            System.out.print("Enter password to login: ");
            String loginPassword = scanner.nextLine();

            if (votingSystem.loginUser(loginUsername, loginPassword)) {
                System.out.print("Enter candidate name to vote: ");
                String candidateName = scanner.nextLine();
                votingSystem.vote(loginUsername, candidateName);
            } else {
                System.out.println("Login failed. Please try again.");
                i--;  // Decrement the loop counter to repeat the login attempt
            }

        }

        scanner.close();
    }

}

