package org.example.Model;

public class Vote {
    private Long id;
    private User user;
    private VoteType voteType;

    public Vote(Long id, User user, VoteType voteType) {
        this.id = id;
        this.user = user;
        this.voteType = voteType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public VoteType getVoteType() {
        return voteType;
    }

    public void setVoteType(VoteType voteType) {
        this.voteType = voteType;
    }
}
