/*
 * This file is generated by jOOQ.
*/
package com.nuxsoftware.kotlindemo.db.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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
public class Databasechangeloglock implements Serializable {

    private static final long serialVersionUID = 480731156;

    private Integer   id;
    private Boolean   locked;
    private Timestamp lockgranted;
    private String    lockedby;

    public Databasechangeloglock() {}

    public Databasechangeloglock(Databasechangeloglock value) {
        this.id = value.id;
        this.locked = value.locked;
        this.lockgranted = value.lockgranted;
        this.lockedby = value.lockedby;
    }

    public Databasechangeloglock(
        Integer   id,
        Boolean   locked,
        Timestamp lockgranted,
        String    lockedby
    ) {
        this.id = id;
        this.locked = locked;
        this.lockgranted = lockgranted;
        this.lockedby = lockedby;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getLocked() {
        return this.locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Timestamp getLockgranted() {
        return this.lockgranted;
    }

    public void setLockgranted(Timestamp lockgranted) {
        this.lockgranted = lockgranted;
    }

    public String getLockedby() {
        return this.lockedby;
    }

    public void setLockedby(String lockedby) {
        this.lockedby = lockedby;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Databasechangeloglock (");

        sb.append(id);
        sb.append(", ").append(locked);
        sb.append(", ").append(lockgranted);
        sb.append(", ").append(lockedby);

        sb.append(")");
        return sb.toString();
    }
}
