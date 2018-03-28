/*
 * This file is generated by jOOQ.
*/
package com.nuxsoftware.kotlindemo.db;


import com.nuxsoftware.kotlindemo.db.tables.Authority;
import com.nuxsoftware.kotlindemo.db.tables.Databasechangeloglock;
import com.nuxsoftware.kotlindemo.db.tables.HrUser;
import com.nuxsoftware.kotlindemo.db.tables.HrUserAuthority;
import com.nuxsoftware.kotlindemo.db.tables.records.AuthorityRecord;
import com.nuxsoftware.kotlindemo.db.tables.records.DatabasechangeloglockRecord;
import com.nuxsoftware.kotlindemo.db.tables.records.HrUserAuthorityRecord;
import com.nuxsoftware.kotlindemo.db.tables.records.HrUserRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>PUBLIC</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorityRecord> PK_AUTHORITY = UniqueKeys0.PK_AUTHORITY;
    public static final UniqueKey<DatabasechangeloglockRecord> PK_DATABASECHANGELOGLOCK = UniqueKeys0.PK_DATABASECHANGELOGLOCK;
    public static final UniqueKey<HrUserRecord> PK_HR_USER = UniqueKeys0.PK_HR_USER;
    public static final UniqueKey<HrUserRecord> UX_USER_LOGIN = UniqueKeys0.UX_USER_LOGIN;
    public static final UniqueKey<HrUserRecord> UX_USER_EMAIL = UniqueKeys0.UX_USER_EMAIL;
    public static final UniqueKey<HrUserAuthorityRecord> CONSTRAINT_5 = UniqueKeys0.CONSTRAINT_5;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<HrUserAuthorityRecord, HrUserRecord> FK_USER_ID = ForeignKeys0.FK_USER_ID;
    public static final ForeignKey<HrUserAuthorityRecord, AuthorityRecord> FK_AUTHORITY_NAME = ForeignKeys0.FK_AUTHORITY_NAME;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AuthorityRecord> PK_AUTHORITY = createUniqueKey(Authority.AUTHORITY, "PK_AUTHORITY", Authority.AUTHORITY.NAME);
        public static final UniqueKey<DatabasechangeloglockRecord> PK_DATABASECHANGELOGLOCK = createUniqueKey(Databasechangeloglock.DATABASECHANGELOGLOCK, "PK_DATABASECHANGELOGLOCK", Databasechangeloglock.DATABASECHANGELOGLOCK.ID);
        public static final UniqueKey<HrUserRecord> PK_HR_USER = createUniqueKey(HrUser.HR_USER, "PK_HR_USER", HrUser.HR_USER.ID);
        public static final UniqueKey<HrUserRecord> UX_USER_LOGIN = createUniqueKey(HrUser.HR_USER, "UX_USER_LOGIN", HrUser.HR_USER.LOGIN);
        public static final UniqueKey<HrUserRecord> UX_USER_EMAIL = createUniqueKey(HrUser.HR_USER, "UX_USER_EMAIL", HrUser.HR_USER.EMAIL);
        public static final UniqueKey<HrUserAuthorityRecord> CONSTRAINT_5 = createUniqueKey(HrUserAuthority.HR_USER_AUTHORITY, "CONSTRAINT_5", HrUserAuthority.HR_USER_AUTHORITY.HR_USER_ID, HrUserAuthority.HR_USER_AUTHORITY.AUTHORITY_NAME);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<HrUserAuthorityRecord, HrUserRecord> FK_USER_ID = createForeignKey(com.nuxsoftware.kotlindemo.db.Keys.PK_HR_USER, HrUserAuthority.HR_USER_AUTHORITY, "FK_USER_ID", HrUserAuthority.HR_USER_AUTHORITY.HR_USER_ID);
        public static final ForeignKey<HrUserAuthorityRecord, AuthorityRecord> FK_AUTHORITY_NAME = createForeignKey(com.nuxsoftware.kotlindemo.db.Keys.PK_AUTHORITY, HrUserAuthority.HR_USER_AUTHORITY, "FK_AUTHORITY_NAME", HrUserAuthority.HR_USER_AUTHORITY.AUTHORITY_NAME);
    }
}
