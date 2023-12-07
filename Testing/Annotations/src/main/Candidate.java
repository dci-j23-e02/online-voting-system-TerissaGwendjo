public class Candidate {
    String name;
    int votes; //total number of votes

    public Candidate(String name) {
        this.name = name;
        this.votes = 0;
    }
    public void incrementVotes() {
        this.votes ++;
        //the votes field is incremented as users cast their votes for a specific candidate
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getVotes() {
        return votes;
    }
    public void setVotes(int votes) {
        this.votes = votes;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", votes=" + votes +
                '}';
    }
}