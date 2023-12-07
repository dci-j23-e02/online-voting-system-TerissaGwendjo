import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class VotingSystemTest {
    private VotingSystem votingSystem;

    @BeforeEach
    void setUpSystem() {
        votingSystem = new VotingSystem();
    }

    @Test
    void registerUser() {
        votingSystem.registerUser("Terissa", "teri123");
        assertNotNull(votingSystem.users.get("Terissa"), "User should be registered successfully");
    }

    @Test
    void loginUser() {
        votingSystem.registerUser("Derick", "der123");
        assertTrue(votingSystem.loginUser("Derick", "der123"), "User should be able to log in.");
    }

    @Test
    void vote() {
        votingSystem.registerUser("Jason", "j123");
        votingSystem.addCandidate("Kamto");

        assumeTrue(votingSystem.users.get("Jason").hasVoted(), "User should have voted");
        assertEquals(1, votingSystem.candidates.get("Kamto").getVotes(), "Vote should be cast successfully" );
    }

    @Test
    void displayTotalVotes() {
        votingSystem.addCandidate("Kamto");
        votingSystem.addCandidate("Merkel");

        votingSystem.registerUser("Terissa","teri123");
        votingSystem.registerUser("Derick", "der123");

        assumeTrue(votingSystem.loginUser("Terissa", "teri123"), "Terissa should be able to log in");
        votingSystem.vote("Terissa", "Merkel");

        assumeTrue(votingSystem.loginUser("Derick", "der123"), "Derick should be able to log in");
        votingSystem.vote("Derick", "Kamto");

        assertEquals(1, votingSystem.candidates.get("Merkel").getVotes(), "Total votes for Merkel should be 1");
        assertEquals(1, votingSystem.candidates.get("Kamto").getVotes(), "Total votes for Kamto should be 1");

    }
    @Test
    void addCandidate() {
        votingSystem.addCandidate("Kamto");

        assertTrue(votingSystem.candidates.containsKey("Kamto"), "Candidate added successfully");
    }

}