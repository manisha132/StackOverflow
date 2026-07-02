package org.example.Repository;

import org.example.Model.Answer;
import org.example.Model.Question;
import org.example.Model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Repo {
    private final Map<Long, User> users = new HashMap<>();
    private final Map<Long, Question> questions = new HashMap<>();
    private final Map<Long, Answer> answers = new HashMap<>();

    public void saveUser(User user) {

        users.put(user.getId(), user);
    }

    public User findByUserId(Long id) {

        return users.get(id);
    }

    public Collection<User> findAllUsers() {

        return users.values();
    }

    public void saveQuestions(Question question) {

        questions.put(question.getId(), question);
    }

    public Question findByQuestionId(Long id) {

        return questions.get(id);
    }

    public Collection<Question> findAllQuestions() {

        return questions.values();
    }
    public void saveAns(Long id,
                     Answer answer) {

        answers.put(id, answer);
    }

    public Answer findByAnsId(Long id) {

        return answers.get(id);
    }

    public Collection<Answer> findAllAns() {

        return answers.values();
    }



}
