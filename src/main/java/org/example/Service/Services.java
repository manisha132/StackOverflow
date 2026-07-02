package org.example.Service;

import org.example.Model.*;
import org.example.Repository.Repo;

import java.util.Collection;

public class Services {
    private final Repo repo;

    private Long userIdCounter = 1L;
    private Long questionsIdCounter = 1L;
    private Long tagCounter = 1L;
    private Long commentCounter = 1L;
    private Long voteCounter = 1L;
    private Long answerCounter = 1L;

    public Services(Repo repo) {
        this.repo = repo;
    }

    public  User createUser(String name)
    {
        User user = new User(userIdCounter++,name);
        repo.saveUser(user);
        return  user;
    }

    public User getUser(Long id)
    {
        return repo.findByUserId(id);
    }

    public Collection<User> getAllUser()
    {
        return repo.findAllUsers();
    }
   // ______________ Post questions______________
    public Question postQuestions(String title, String description,User user)
    {
        Question question = new Question(questionsIdCounter++,title,description,user);
        repo.saveQuestions(question);
        return question;
    }
   // _____________ Add Tag________
   public void addTag(Long questionId, String tagName)
    {
        Question question = repo.findByQuestionId(questionId);
        Tag tag = new Tag(tagCounter++ , tagName);
        question.addTag(tag);
    }
    public void addComment(Long id,User user,String message)
    {
        Question question = repo.findByQuestionId(id);
        Comment comment = new Comment(commentCounter++,user,message);
        question.addComment(comment);
    }

    public void voteQuestion(Long id, User user, VoteType voteType)
    {
        Question question = repo.findByQuestionId(id);
        Vote vote = new Vote(voteCounter++,user,voteType);
        question.addVote(vote);
    }

    public Question getQuestion(Long id)
    {
        return repo.findByQuestionId(id);
    }
    //__________________Ans____________

    public Answer addAns(Long id, String description, User user)
    {
        Question question = repo.findByQuestionId(id);
        Answer answer = new Answer(answerCounter++,description,user);
        repo.saveAns(answer.getId(),answer);
        question.addAnswer(answer);
        return  answer;

    }

    public void commentAnswer(Long ansId,User user, String message)
    {
        Answer answer = repo.findByAnsId(ansId);
        Comment comment = new Comment(commentCounter++,user,message);
        answer.addComment(comment);
    }

    public void voteAns(Long ansId,User user, VoteType voteType)
    {
        Answer answer = repo.findByAnsId(ansId);
        Vote vote = new Vote(voteCounter++,user,voteType);
        answer.addVote(vote);
    }




}
