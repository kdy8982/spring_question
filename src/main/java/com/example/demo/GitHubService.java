package com.example.demo;

import org.kohsuke.github.GitHub;

import java.io.IOException;

interface GitHubService {
    GitHub connect() throws IOException;
}