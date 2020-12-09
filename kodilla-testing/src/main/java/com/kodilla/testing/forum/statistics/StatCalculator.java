package com.kodilla.testing.forum.statistics;

public class StatCalculator {

    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double userAveragePosts;
    private double  userAverageComments;
    private double averageCommentsInPost;

    public void calculateAdvStatistics(Statistics statistics) {
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();

        if (usersNumber == 0) {
            userAveragePosts = 0;
            userAverageComments = 0;
        } else {
            userAveragePosts =  (double)postsNumber / (double)usersNumber;
            userAverageComments = (double)commentsNumber / (double)usersNumber;
        }

        if (postsNumber == 0) {
            averageCommentsInPost = 0;
        } else {
            averageCommentsInPost = (double)commentsNumber / (double)postsNumber;
        }

    }

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getUserAveragePosts() {
        return userAveragePosts;
    }

    public double getUserAverageComments() {
        return userAverageComments;
    }

    public double getAverageCommentsInPost() {
        return averageCommentsInPost;
    }

    public void showStatistics() {
        System.out.println("Users Number: " + usersNumber);
        System.out.println("Posts number: " + postsNumber);
        System.out.println("Comments number: " + commentsNumber);
        System.out.println("Average posts per user: " + userAveragePosts);
        System.out.println("Average comments per user: " + userAverageComments);
        System.out.println("Average comments per post: " + averageCommentsInPost);
    }
}
