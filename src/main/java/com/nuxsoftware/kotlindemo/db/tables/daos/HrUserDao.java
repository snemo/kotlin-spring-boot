/*
 * This file is generated by jOOQ.
*/
package com.nuxsoftware.kotlindemo.db.tables.daos;


import com.nuxsoftware.kotlindemo.db.tables.HrUser;
import com.nuxsoftware.kotlindemo.db.tables.records.HrUserRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


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
public class HrUserDao extends DAOImpl<HrUserRecord, com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser, Long> {

    /**
     * Create a new HrUserDao without any configuration
     */
    public HrUserDao() {
        super(HrUser.HR_USER, com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser.class);
    }

    /**
     * Create a new HrUserDao with an attached configuration
     */
    public HrUserDao(Configuration configuration) {
        super(HrUser.HR_USER, com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>ID IN (values)</code>
     */
    public List<com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser> fetchById(Long... values) {
        return fetch(HrUser.HR_USER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>ID = value</code>
     */
    public com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser fetchOneById(Long value) {
        return fetchOne(HrUser.HR_USER.ID, value);
    }

    /**
     * Fetch records that have <code>LOGIN IN (values)</code>
     */
    public List<com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser> fetchByLogin(String... values) {
        return fetch(HrUser.HR_USER.LOGIN, values);
    }

    /**
     * Fetch a unique record that has <code>LOGIN = value</code>
     */
    public com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser fetchOneByLogin(String value) {
        return fetchOne(HrUser.HR_USER.LOGIN, value);
    }

    /**
     * Fetch records that have <code>PASSWORD_HASH IN (values)</code>
     */
    public List<com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser> fetchByPasswordHash(String... values) {
        return fetch(HrUser.HR_USER.PASSWORD_HASH, values);
    }

    /**
     * Fetch records that have <code>FIRST_NAME IN (values)</code>
     */
    public List<com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser> fetchByFirstName(String... values) {
        return fetch(HrUser.HR_USER.FIRST_NAME, values);
    }

    /**
     * Fetch records that have <code>LAST_NAME IN (values)</code>
     */
    public List<com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser> fetchByLastName(String... values) {
        return fetch(HrUser.HR_USER.LAST_NAME, values);
    }

    /**
     * Fetch records that have <code>EMAIL IN (values)</code>
     */
    public List<com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser> fetchByEmail(String... values) {
        return fetch(HrUser.HR_USER.EMAIL, values);
    }

    /**
     * Fetch a unique record that has <code>EMAIL = value</code>
     */
    public com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser fetchOneByEmail(String value) {
        return fetchOne(HrUser.HR_USER.EMAIL, value);
    }

    /**
     * Fetch records that have <code>IMAGE_URL IN (values)</code>
     */
    public List<com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser> fetchByImageUrl(String... values) {
        return fetch(HrUser.HR_USER.IMAGE_URL, values);
    }

    /**
     * Fetch records that have <code>ACTIVATED IN (values)</code>
     */
    public List<com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser> fetchByActivated(Boolean... values) {
        return fetch(HrUser.HR_USER.ACTIVATED, values);
    }

    /**
     * Fetch records that have <code>LANG_KEY IN (values)</code>
     */
    public List<com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser> fetchByLangKey(String... values) {
        return fetch(HrUser.HR_USER.LANG_KEY, values);
    }

    /**
     * Fetch records that have <code>ACTIVATION_KEY IN (values)</code>
     */
    public List<com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser> fetchByActivationKey(String... values) {
        return fetch(HrUser.HR_USER.ACTIVATION_KEY, values);
    }

    /**
     * Fetch records that have <code>RESET_KEY IN (values)</code>
     */
    public List<com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser> fetchByResetKey(String... values) {
        return fetch(HrUser.HR_USER.RESET_KEY, values);
    }

    /**
     * Fetch records that have <code>CREATED_BY IN (values)</code>
     */
    public List<com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser> fetchByCreatedBy(String... values) {
        return fetch(HrUser.HR_USER.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>CREATED_DATE IN (values)</code>
     */
    public List<com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser> fetchByCreatedDate(Timestamp... values) {
        return fetch(HrUser.HR_USER.CREATED_DATE, values);
    }

    /**
     * Fetch records that have <code>RESET_DATE IN (values)</code>
     */
    public List<com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser> fetchByResetDate(Timestamp... values) {
        return fetch(HrUser.HR_USER.RESET_DATE, values);
    }

    /**
     * Fetch records that have <code>LAST_MODIFIED_BY IN (values)</code>
     */
    public List<com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser> fetchByLastModifiedBy(String... values) {
        return fetch(HrUser.HR_USER.LAST_MODIFIED_BY, values);
    }

    /**
     * Fetch records that have <code>LAST_MODIFIED_DATE IN (values)</code>
     */
    public List<com.nuxsoftware.kotlindemo.db.tables.pojos.HrUser> fetchByLastModifiedDate(Timestamp... values) {
        return fetch(HrUser.HR_USER.LAST_MODIFIED_DATE, values);
    }
}