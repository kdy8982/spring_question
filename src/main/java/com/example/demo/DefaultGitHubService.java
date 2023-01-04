package com.example.demo;

import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;

class DefaultGitHubService implements GitHubService {

    GitHub gitHub;
    GitHubRepository gitHubRepository;

    @Override
    public void connect() throws IOException {
        this.gitHub = GitHub.connect();
    }

    @Override
    public GitHubRepository getRepository(String repositoryName) throws IOException {
        GHRepository gHRepository = this.gitHub.getRepository("test");
        gitHubRepository = new GitHubRepository(gHRepository.hasIssues(), gHRepository.getReadme(), gHRepository.getStargazersCount(), gHRepository.getForksCount(), gHRepository.getPullRequests(GHIssueState.ALL));
        return gitHubRepository;
    }

}