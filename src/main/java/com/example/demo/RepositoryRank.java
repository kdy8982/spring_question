package com.example.demo;

import org.kohsuke.github.GHIssueState;

import java.io.IOException;

public class RepositoryRank {
    private final GitHubService gitHubService;

    public RepositoryRank(GitHubService gitHubService) {
        this.gitHubService = gitHubService;
    }

    public int getPoint(String repositoryName) throws IOException {
        gitHubService.connect();
        GitHubRepository repository = gitHubService.getRepository(repositoryName);

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
//        RepositoryRank spring = new RepositoryRank(new DefaultGitHubService());
        AppConfig appConfig = new AppConfig();
        RepositoryRank spring = appConfig.getRepositoryRank();
        int point = spring.getPoint("whiteship/live-study");
        System.out.println(point);
    }
}
