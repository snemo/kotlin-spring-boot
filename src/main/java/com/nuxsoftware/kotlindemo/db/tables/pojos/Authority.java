/*
 * This file is generated by jOOQ.
*/
package com.nuxsoftware.kotlindemo.db.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Authority implements Serializable {

    private static final long serialVersionUID = -233510201;

    private String name;

    public Authority() {}

    public Authority(Authority value) {
        this.name = value.name;
    }

    public Authority(
        String name
    ) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Authority (");

        sb.append(name);

        sb.append(")");
        return sb.toString();
    }
}
