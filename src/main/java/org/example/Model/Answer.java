package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Answer {
    private Long id;
    private String description;
    private User user;
    private List<Comment> comments = new ArrayList<>();
    private List<Vote> votes = new ArrayList<>();

    public Answer(Long id, String description, User user) {
        this.id = id;
        this.description = description;
        this.user = user;
    }

    public Answer(Long id, String description, User user, List<Comment> comments, List<Vote> votes) {
        this.id = id;
        this.description = description;
        this.user = user;
        this.comments = comments;
        this.votes = votes;
    }

    public Long getId() {
        return id;
    }

    public void addComment(Comment comment) {

        comments.add(comment);
    }

    public void addVote(Vote vote) {

        votes.add(vote);
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", user=" + user +
                ", comments=" + comments +
                ", votes=" + votes +
                '}';
    }
}
