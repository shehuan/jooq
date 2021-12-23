/*
 * This file is generated by jOOQ.
 */
package com.sh.jooq.codegen.tables.records;


import com.sh.jooq.codegen.tables.PersistentLogins;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PersistentLoginsRecord extends UpdatableRecordImpl<PersistentLoginsRecord> implements Record4<String, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>security.persistent_logins.username</code>.
     */
    public void setUsername(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>security.persistent_logins.username</code>.
     */
    public String getUsername() {
        return (String) get(0);
    }

    /**
     * Setter for <code>security.persistent_logins.series</code>.
     */
    public void setSeries(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>security.persistent_logins.series</code>.
     */
    public String getSeries() {
        return (String) get(1);
    }

    /**
     * Setter for <code>security.persistent_logins.token</code>.
     */
    public void setToken(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>security.persistent_logins.token</code>.
     */
    public String getToken() {
        return (String) get(2);
    }

    /**
     * Setter for <code>security.persistent_logins.last_used</code>.
     */
    public void setLastUsed(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>security.persistent_logins.last_used</code>.
     */
    public LocalDateTime getLastUsed() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PersistentLogins.PERSISTENT_LOGINS.USERNAME;
    }

    @Override
    public Field<String> field2() {
        return PersistentLogins.PERSISTENT_LOGINS.SERIES;
    }

    @Override
    public Field<String> field3() {
        return PersistentLogins.PERSISTENT_LOGINS.TOKEN;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return PersistentLogins.PERSISTENT_LOGINS.LAST_USED;
    }

    @Override
    public String component1() {
        return getUsername();
    }

    @Override
    public String component2() {
        return getSeries();
    }

    @Override
    public String component3() {
        return getToken();
    }

    @Override
    public LocalDateTime component4() {
        return getLastUsed();
    }

    @Override
    public String value1() {
        return getUsername();
    }

    @Override
    public String value2() {
        return getSeries();
    }

    @Override
    public String value3() {
        return getToken();
    }

    @Override
    public LocalDateTime value4() {
        return getLastUsed();
    }

    @Override
    public PersistentLoginsRecord value1(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public PersistentLoginsRecord value2(String value) {
        setSeries(value);
        return this;
    }

    @Override
    public PersistentLoginsRecord value3(String value) {
        setToken(value);
        return this;
    }

    @Override
    public PersistentLoginsRecord value4(LocalDateTime value) {
        setLastUsed(value);
        return this;
    }

    @Override
    public PersistentLoginsRecord values(String value1, String value2, String value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PersistentLoginsRecord
     */
    public PersistentLoginsRecord() {
        super(PersistentLogins.PERSISTENT_LOGINS);
    }

    /**
     * Create a detached, initialised PersistentLoginsRecord
     */
    public PersistentLoginsRecord(String username, String series, String token, LocalDateTime lastUsed) {
        super(PersistentLogins.PERSISTENT_LOGINS);

        setUsername(username);
        setSeries(series);
        setToken(token);
        setLastUsed(lastUsed);
    }

    /**
     * Create a detached, initialised PersistentLoginsRecord
     */
    public PersistentLoginsRecord(com.sh.jooq.codegen.tables.pojos.PersistentLogins value) {
        super(PersistentLogins.PERSISTENT_LOGINS);

        if (value != null) {
            setUsername(value.getUsername());
            setSeries(value.getSeries());
            setToken(value.getToken());
            setLastUsed(value.getLastUsed());
        }
    }
}