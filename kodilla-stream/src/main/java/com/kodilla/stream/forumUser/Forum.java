package com.kodilla.stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(0, "John", 'M', 1950, 02, 10,60 ));
        usersList.add(new ForumUser(0, "Mike", 'M', 2001, 10, 01,1 ));
        usersList.add(new ForumUser(0, "Ela", 'F', 1970, 05, 22,18 ));
        usersList.add(new ForumUser(0, "Anna", 'F', 2010, 06, 30,150 ));
    }

    public List<ForumUser> getUserList() {
        return usersList;
    }
}
