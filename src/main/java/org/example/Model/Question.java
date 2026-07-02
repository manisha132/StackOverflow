package org.example.Model;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private Long id;
    private String title;
    private String description;
    private User createdBy;
    private List<Tag> tags = new ArrayList<>();

    public Question(Long id, String title, String description, User createdBy) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdBy = createdBy;
    }

    private List<Answer> answers = new ArrayList<>();
    private List<Comment> comments = new ArrayList<>();
    private List<Vote> votes = new ArrayList<>();

    public Question(Long id, String title, String description, User createdBy, List<Tag> tags, List<Answer> answers, List<Comment> comments, List<Vote> votes) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.createdBy = createdBy;
        this.tags = tags;
        this.answers = answers;
        this.comments = comments;
        this.votes = votes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }
    public void addTag(Tag tag) {
        tags.add(tag);
    }

    public void addAnswer(Answer answer) {
        answers.add(answer);
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void addVote(Vote vote) {
        votes.add(vote);
    }
}
