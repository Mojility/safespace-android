package com.example.psalmers.virtualsafespace;

/**
 * Created by psalmers on 2017-03-25.
 */

public class Post {
    public final String body;
    public final int id;
    public final String handle;
    public EmoteOnPost[] emotes;

    public Post(String body, int id, String handle) {
        this.body = body;
        this.id = id;
        this.handle = handle;
    }
}
