package com.example.demo;

import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;

public class RepositoryRank {

    public int getPoint(String repositoryName) throws IOException {
        GitHub github = GitHub.connect();
        GHRepository repository = github.getRepository(repositoryName);

        int points = 0;
        if (repository.hasIssues() ) {
            points += 1;
        }

        if (repository.getReadme() != null) {
            points += 1;
        }

        if (repository.getPullRequests(GHIssueState.CLOSED).size() > 0) {
            points += 1;
        }

        points += repository.getStargazersCount();
        points += repository.getForksCount();

        return points;
    }

    public static void main(String[] args) throws IOException {
        RepositoryRank spring = new RepositoryRank();
        int point = spring.getPoint("whiteship/live-study");
        System.out.println(point);
    }
}
