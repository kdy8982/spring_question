package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class RepositoryRankTest {

    @Test
    public void testGetPoint() throws Exception {
        //given
        AppConfig appConfig = new AppConfig();
        RepositoryRank repositoryRank = appConfig.getRepositoryRank();

        //when
        int point = repositoryRank.getPoint("test");

        //then
        Assertions.assertThat(point).isEqualTo(8);
    }

}