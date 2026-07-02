package org.example;

import org.example.Model.Answer;
import org.example.Model.Question;
import org.example.Model.User;
import org.example.Model.VoteType;
import org.example.Repository.Repo;
import org.example.Service.Services;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Repo repo = new Repo();
        Services services = new Services(repo);

        User manisha = services.createUser("Manisha");
        User pooja = services.createUser("Pooja");
        System.out.println("Users Created");
        System.out.println(manisha);
        System.out.println(pooja);
        System.out.println("--------------------------------");

        Question question = services.postQuestions("How HashMap Works?",
                "Can anyone explain HashMap internal working?",manisha);
        System.out.println("Question Posted");
        System.out.println(question);

        System.out.println("--------------------------------");

        services.addTag(question.getId(), "java");
        services.addTag(question.getId(), "Collections");
        System.out.println("Tags Added");

        System.out.println("--------------------------------");
        Answer answer = services.addAns(question.getId(), "HashMap use internally as data structue HashTable",pooja);

        System.out.println("Answer Added");

        System.out.println(answer);

        System.out.println("--------------------------------");

        services.addComment(question.getId(), pooja, "Great Question");
        services.commentAnswer(answer.getId(), manisha,"Thanks for explaining");
        System.out.println("Comments Added");

        System.out.println("--------------------------------");

        services.voteQuestion(question.getId(), pooja, VoteType.UPVOTE);
        services.voteAns(answer.getId(), manisha,VoteType.UPVOTE);
        System.out.println("Voting Completed");

        System.out.println("--------------------------------");

        System.out.println("Final Question");

        System.out.println(question);

        System.out.println("--------------------------------");

        System.out.println("Final Answer");

        System.out.println(answer);


        }
    }