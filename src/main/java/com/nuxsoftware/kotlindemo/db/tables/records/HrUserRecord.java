/*
 * This file is generated by jOOQ.
*/
package com.nuxsoftware.kotlindemo.db.tables.records;


import com.nuxsoftware.kotlindemo.db.tables.HrUser;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;


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
public class HrUserRecord extends UpdatableRecordImpl<HrUserRecord> implements Record16<Long, String, String, String, String, String, String, Boolean, String, String, String, String, Timestamp, Timestamp, String, Timestamp> {

    private static final long serialVersionUID = -1295723844;

    /**
     * Setter for <code>PUBLIC.HR_USER.ID</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.HR_USER.ID</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>PUBLIC.HR_USER.LOGIN</code>.
     */
    public void setLogin(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.HR_USER.LOGIN</code>.
     */
    public String getLogin() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.HR_USER.PASSWORD_HASH</code>.
     */
    public void setPasswordHash(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.HR_USER.PASSWORD_HASH</code>.
     */
    public String getPasswordHash() {
        return (String) get(2);
    }

    /**
     * Setter for <code>PUBLIC.HR_USER.FIRST_NAME</code>.
     */
    public void setFirstName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.HR_USER.FIRST_NAME</code>.
     */
    public String getFirstName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>PUBLIC.HR_USER.LAST_NAME</code>.
     */
    public void setLastName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.HR_USER.LAST_NAME</code>.
     */
    public String getLastName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>PUBLIC.HR_USER.EMAIL</code>.
     */
    public void setEmail(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>PUBLIC.HR_USER.EMAIL</code>.
     */
    public String getEmail() {
        return (String) get(5);
    }

    /**
     * Setter for <code>PUBLIC.HR_USER.IMAGE_URL</code>.
     */
    public void setImageUrl(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>PUBLIC.HR_USER.IMAGE_URL</code>.
     */
    public String getImageUrl() {
        return (String) get(6);
    }

    /**
     * Setter for <code>PUBLIC.HR_USER.ACTIVATED</code>.
     */
    public void setActivated(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>PUBLIC.HR_USER.ACTIVATED</code>.
     */
    public Boolean getActivated() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>PUBLIC.HR_USER.LANG_KEY</code>.
     */
    public void setLangKey(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>PUBLIC.HR_USER.LANG_KEY</code>.
     */
    public String getLangKey() {
        return (String) get(8);
    }

    /**
     * Setter for <code>PUBLIC.HR_USER.ACTIVATION_KEY</code>.
     */
    public void setActivationKey(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>PUBLIC.HR_USER.ACTIVATION_KEY</code>.
     */
    public String getActivationKey() {
        return (String) get(9);
    }

    /**
     * Setter for <code>PUBLIC.HR_USER.RESET_KEY</code>.
     */
    public void setResetKey(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>PUBLIC.HR_USER.RESET_KEY</code>.
     */
    public String getResetKey() {
        return (String) get(10);
    }

    /**
     * Setter for <code>PUBLIC.HR_USER.CREATED_BY</code>.
     */
    public void setCreatedBy(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>PUBLIC.HR_USER.CREATED_BY</code>.
     */
    public String getCreatedBy() {
        return (String) get(11);
    }

    /**
     * Setter for <code>PUBLIC.HR_USER.CREATED_DATE</code>.
     */
    public void setCreatedDate(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>PUBLIC.HR_USER.CREATED_DATE</code>.
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>PUBLIC.HR_USER.RESET_DATE</code>.
     */
    public void setResetDate(Timestamp value) {
        set(13, value);
    }

    /**
     * Getter for <code>PUBLIC.HR_USER.RESET_DATE</code>.
     */
    public Timestamp getResetDate() {
        return (Timestamp) get(13);
    }

    /**
     * Setter for <code>PUBLIC.HR_USER.LAST_MODIFIED_BY</code>.
     */
    public void setLastModifiedBy(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>PUBLIC.HR_USER.LAST_MODIFIED_BY</code>.
     */
    public String getLastModifiedBy() {
        return (String) get(14);
    }

    /**
     * Setter for <code>PUBLIC.HR_USER.LAST_MODIFIED_DATE</code>.
     */
    public void setLastModifiedDate(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>PUBLIC.HR_USER.LAST_MODIFIED_DATE</code>.
     */
    public Timestamp getLastModifiedDate() {
        return (Timestamp) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, String, String, String, String, String, String, Boolean, String, String, String, String, Timestamp, Timestamp, String, Timestamp> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Long, String, String, String, String, String, String, Boolean, String, String, String, String, Timestamp, Timestamp, String, Timestamp> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return HrUser.HR_USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return HrUser.HR_USER.LOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return HrUser.HR_USER.PASSWORD_HASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return HrUser.HR_USER.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return HrUser.HR_USER.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return HrUser.HR_USER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return HrUser.HR_USER.IMAGE_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return HrUser.HR_USER.ACTIVATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return HrUser.HR_USER.LANG_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return HrUser.HR_USER.ACTIVATION_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return HrUser.HR_USER.RESET_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return HrUser.HR_USER.CREATED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return HrUser.HR_USER.CREATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return HrUser.HR_USER.RESET_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return HrUser.HR_USER.LAST_MODIFIED_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return HrUser.HR_USER.LAST_MODIFIED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPasswordHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getImageUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
        return getActivated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getLangKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getActivationKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getResetKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
        return getResetDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getLastModifiedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getLastModifiedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPasswordHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getImageUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getActivated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getLangKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getActivationKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getResetKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getCreatedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getCreatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getResetDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getLastModifiedBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getLastModifiedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrUserRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrUserRecord value2(String value) {
        setLogin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrUserRecord value3(String value) {
        setPasswordHash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrUserRecord value4(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrUserRecord value5(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrUserRecord value6(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrUserRecord value7(String value) {
        setImageUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrUserRecord value8(Boolean value) {
        setActivated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrUserRecord value9(String value) {
        setLangKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrUserRecord value10(String value) {
        setActivationKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrUserRecord value11(String value) {
        setResetKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrUserRecord value12(String value) {
        setCreatedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrUserRecord value13(Timestamp value) {
        setCreatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrUserRecord value14(Timestamp value) {
        setResetDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrUserRecord value15(String value) {
        setLastModifiedBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrUserRecord value16(Timestamp value) {
        setLastModifiedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HrUserRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, String value7, Boolean value8, String value9, String value10, String value11, String value12, Timestamp value13, Timestamp value14, String value15, Timestamp value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HrUserRecord
     */
    public HrUserRecord() {
        super(HrUser.HR_USER);
    }

    /**
     * Create a detached, initialised HrUserRecord
     */
    public HrUserRecord(Long id, String login, String passwordHash, String firstName, String lastName, String email, String imageUrl, Boolean activated, String langKey, String activationKey, String resetKey, String createdBy, Timestamp createdDate, Timestamp resetDate, String lastModifiedBy, Timestamp lastModifiedDate) {
        super(HrUser.HR_USER);

        set(0, id);
        set(1, login);
        set(2, passwordHash);
        set(3, firstName);
        set(4, lastName);
        set(5, email);
        set(6, imageUrl);
        set(7, activated);
        set(8, langKey);
        set(9, activationKey);
        set(10, resetKey);
        set(11, createdBy);
        set(12, createdDate);
        set(13, resetDate);
        set(14, lastModifiedBy);
        set(15, lastModifiedDate);
    }
}
