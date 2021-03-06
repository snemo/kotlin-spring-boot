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
public class HrUserAuthority implements Serializable {

    private static final long serialVersionUID = 1687825050;

    private Long   hrUserId;
    private String authorityName;

    public HrUserAuthority() {}

    public HrUserAuthority(HrUserAuthority value) {
        this.hrUserId = value.hrUserId;
        this.authorityName = value.authorityName;
    }

    public HrUserAuthority(
        Long   hrUserId,
        String authorityName
    ) {
        this.hrUserId = hrUserId;
        this.authorityName = authorityName;
    }

    public Long getHrUserId() {
        return this.hrUserId;
    }

    public void setHrUserId(Long hrUserId) {
        this.hrUserId = hrUserId;
    }

    public String getAuthorityName() {
        return this.authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HrUserAuthority (");

        sb.append(hrUserId);
        sb.append(", ").append(authorityName);

        sb.append(")");
        return sb.toString();
    }
}
