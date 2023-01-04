package com.example.demo;

import org.kohsuke.github.GHContent;
import org.kohsuke.github.GHPullRequest;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestGitHubService implements GitHubService {
    GitHub gitHub;
    GitHubRepository gitHubRepository;

    @Override
    public void connect() throws IOException {
    }

    @Override
    public GitHubRepository getRepository(String repositoryName) throws IOException {
        List<GHPullRequest> pullRequests = new ArrayList<>();
        return new GitHubRepository(true, null, 3, 4, pullRequests);
    }
}
