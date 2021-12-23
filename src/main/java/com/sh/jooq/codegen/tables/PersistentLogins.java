/*
 * This file is generated by jOOQ.
 */
package com.sh.jooq.codegen.tables;


import com.sh.jooq.codegen.Keys;
import com.sh.jooq.codegen.Security;
import com.sh.jooq.codegen.tables.records.PersistentLoginsRecord;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PersistentLogins extends TableImpl<PersistentLoginsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>security.persistent_logins</code>
     */
    public static final PersistentLogins PERSISTENT_LOGINS = new PersistentLogins();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PersistentLoginsRecord> getRecordType() {
        return PersistentLoginsRecord.class;
    }

    /**
     * The column <code>security.persistent_logins.username</code>.
     */
    public final TableField<PersistentLoginsRecord, String> USERNAME = createField(DSL.name("username"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>security.persistent_logins.series</code>.
     */
    public final TableField<PersistentLoginsRecord, String> SERIES = createField(DSL.name("series"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>security.persistent_logins.token</code>.
     */
    public final TableField<PersistentLoginsRecord, String> TOKEN = createField(DSL.name("token"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>security.persistent_logins.last_used</code>.
     */
    public final TableField<PersistentLoginsRecord, LocalDateTime> LAST_USED = createField(DSL.name("last_used"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    private PersistentLogins(Name alias, Table<PersistentLoginsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PersistentLogins(Name alias, Table<PersistentLoginsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>security.persistent_logins</code> table reference
     */
    public PersistentLogins(String alias) {
        this(DSL.name(alias), PERSISTENT_LOGINS);
    }

    /**
     * Create an aliased <code>security.persistent_logins</code> table reference
     */
    public PersistentLogins(Name alias) {
        this(alias, PERSISTENT_LOGINS);
    }

    /**
     * Create a <code>security.persistent_logins</code> table reference
     */
    public PersistentLogins() {
        this(DSL.name("persistent_logins"), null);
    }

    public <O extends Record> PersistentLogins(Table<O> child, ForeignKey<O, PersistentLoginsRecord> key) {
        super(child, key, PERSISTENT_LOGINS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Security.SECURITY;
    }

    @Override
    public UniqueKey<PersistentLoginsRecord> getPrimaryKey() {
        return Keys.KEY_PERSISTENT_LOGINS_PRIMARY;
    }

    @Override
    public PersistentLogins as(String alias) {
        return new PersistentLogins(DSL.name(alias), this);
    }

    @Override
    public PersistentLogins as(Name alias) {
        return new PersistentLogins(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PersistentLogins rename(String name) {
        return new PersistentLogins(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PersistentLogins rename(Name name) {
        return new PersistentLogins(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}