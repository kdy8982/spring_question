package com.example.demo;

class AppConfig {
    RepositoryRank getRepositoryRank() {
        return new RepositoryRank(gitHubService());
    }
    private GitHubService gitHubService() {
        return new TestGitHubService();
    }
}