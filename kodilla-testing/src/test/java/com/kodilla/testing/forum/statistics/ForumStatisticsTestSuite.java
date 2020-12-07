package com.kodilla.testing.forum.statistics;


import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DisplayName("Test suite for calculate forum statistics")

public class ForumStatisticsTestSuite {
    //private static StatCalculator statCalculator;
    Statistics statisticsMock;
    StatCalculator statCalculator;
    List<String> usersNames;
    private static int testCounter = 0;

    @BeforeEach
    public void beforeEach() {
        statisticsMock = mock(Statistics.class);
        statCalculator = new StatCalculator();
        usersNames = new ArrayList<>();
        usersNames.add("User1");
        usersNames.add("User2");
        usersNames.add("User3");
        usersNames.add("User4");
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }


    @DisplayName("Test for quantity of posts = 0")
    @Test
    public void testCalculateAdvStatisticsForPost0() {
        //When
        when(statisticsMock.postsCount()).thenReturn(0);
        statCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, statCalculator.getPostsNumber());
    }

    @DisplayName("Test for quantity of posts: 1000")
    @Test
    public void testCalculateAdvStatisticsForPosts1000() {
        //When
        when(statisticsMock.postsCount()).thenReturn(1000);
        statCalculator.calculateAdvStatistics((statisticsMock));
        //Then
        assertEquals(1000, statCalculator.getPostsNumber());
    }

    @DisplayName("Test for quantity of comments:  0")
    @Test
    public void testCalculateAdvStatisticsForComments0() {
        //When
        when(statisticsMock.commentsCount()).thenReturn(0);
        statCalculator.calculateAdvStatistics((statisticsMock));
        //Then
        assertEquals(0, statCalculator.getCommentsNumber());
    }

    @DisplayName("Test for (quantity of comments) < (quantity of posts)")
    @Test
    public void testCalculateAdvStatisticsForCommentsSmallerThanPosts() {
        //When
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(1000);
        statCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000, statCalculator.getPostsNumber());
        assertEquals(100, statCalculator.getCommentsNumber());
        assertEquals(0.1, statCalculator.getAverageCommentsInPost());
    }

    @DisplayName("Test for (quantity of comments) > (quantity of posts)")
    @Test
    public void testCalculateAdvStatisticsCommentsBiggerThanPosts() {
        //When
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(100);
        statCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, statCalculator.getPostsNumber());
        assertEquals(1000, statCalculator.getCommentsNumber());
        assertEquals(10, statCalculator.getAverageCommentsInPost());
    }

    @DisplayName("Test for quantity of users = 0")
    @Test
    public void testCalculateAdvStatisticsForUser0() {
        //When
        statCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0, statCalculator.getUsersNumber());
    }

    @DisplayName("Test for quantity of users = 100")
    @Test
    public void testCalculateAdvStatisticsForUser100() {
        //Given
        List<String> usersNames = new ArrayList<>();
        for (int n = 0; n < 100; n++) {
            usersNames.add("User" + n);
        }
        //When
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        statCalculator.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(100, statCalculator.getUsersNumber());
    }
}

