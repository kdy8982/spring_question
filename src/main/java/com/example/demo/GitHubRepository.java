package com.example.demo;

import org.kohsuke.github.GHContent;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GHPullRequest;

import java.util.ArrayList;
import java.util.List;

public class GitHubRepository {
    private boolean issues;
    private GHContent readme;
    private int stargazersCount;
    private int forksCount;

    private List<GHPullRequest> pullRequests;

    public GitHubRepository(boolean issues, GHContent readme, int stargazersCount, int forksCount, List<GHPullRequest> pullRequests) {
        this.issues = issues;
        this.readme = readme;
        this.stargazersCount = stargazersCount;
        this.forksCount = forksCount;
        this.pullRequests = pullRequests;
    }

    public boolean hasIssues() {
        return this.issues;
    }

    public GHContent getReadme() {
        return this.readme;
    }

    public List<GHPullRequest> getPullRequests(GHIssueState closed) {
        return this.pullRequests;
    }

    public int getStargazersCount() {
        return this.stargazersCount;
    }

    public int getForksCount() {
        return this.forksCount;
    }
}