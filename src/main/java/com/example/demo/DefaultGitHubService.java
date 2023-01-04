package com.example.demo;

import org.kohsuke.github.GitHub;

import java.io.IOException;

class DefaultGitHubService implements GitHubService {
    @Override
    public GitHub connect() throws IOException {
        return GitHub.connect();
    }
}