package com.example.vasuchand.taskbuilder;

/**
 * Created by Vasu Chand on 11/9/2016.
 */

public class data {
    private String heading;
    private String create;

    public data(String heading, String create) {
        this.heading = heading;
        this.create = create;
    }

    public void setHeading(String heading) {

        this.heading = heading;
    }

    public void setCreate(String create) {
        this.create = create;
    }

    public String getHeading() {

        return heading;
    }

    public String getCreate() {
        return create;
    }
}
