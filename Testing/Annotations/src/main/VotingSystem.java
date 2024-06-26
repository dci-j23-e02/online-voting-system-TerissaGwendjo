import java.util.HashMap;
import java.util.Map;

public class VotingSystem {

    Map<String, User> users;
    Map<String, Candidate> candidates;

    public void addCandidate(String name) {
        candidates.put(name, new Candidate(name));
    }

    public VotingSystem() {
        this.users = new HashMap<>();
        this.candidates = new HashMap<>();
    }

    //User Registration method
    public void registerUser (String username, String password) {
        users.put(username,new User(username,password));
        System.out.println(username + " registered Successfully");
    }

    // User login method
    public boolean loginUser (String username, String password) {
        if (users.containsKey(username) && users.get(username).getPassword().equals(password)) {
            System.out.println("Login Successful!");
            return true;
        } else {
            System.out.println("Invalid username or password");
            return false;
        }
    }

    // Voting method
    public void vote (String username, String name) {
        if(users.containsKey(username) && !users.get(username).hasVoted() && candidates.containsKey(name)) {
            users.get(username).setVoted(true);
            candidates.get(name).incrementVotes();
            System.out.println("Vote cast successfully");
        } else if (users.containsKey(username) && users.get(username).hasVoted()) {
            System.out.println("User has already voted. Cannot vote again.");
        }
        else {
            System.out.println("Invalid vote");
        }
    }
    // Total votes method
    public void displayTotalVotes () {
        System.out.println("Total votes for each Candidate:");
        for (Candidate candidate: candidates.values()) {
            System.out.println(candidate.getName() + ":" + candidate.getVotes());
        }
    }
}
