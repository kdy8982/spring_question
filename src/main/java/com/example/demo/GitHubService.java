package com.example.demo;

import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;

interface GitHubService {
    void connect() throws IOException;

    GitHubRepository getRepository(String repositoryName) throws IOException;
}