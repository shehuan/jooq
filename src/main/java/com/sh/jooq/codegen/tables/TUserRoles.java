/*
 * This file is generated by jOOQ.
 */
package com.sh.jooq.codegen.tables;


import com.sh.jooq.codegen.Keys;
import com.sh.jooq.codegen.Security;
import com.sh.jooq.codegen.tables.records.TUserRolesRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUserRoles extends TableImpl<TUserRolesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>security.t_user_roles</code>
     */
    public static final TUserRoles T_USER_ROLES = new TUserRoles();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TUserRolesRecord> getRecordType() {
        return TUserRolesRecord.class;
    }

    /**
     * The column <code>security.t_user_roles.t_user_id</code>.
     */
    public final TableField<TUserRolesRecord, Long> T_USER_ID = createField(DSL.name("t_user_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>security.t_user_roles.roles_id</code>.
     */
    public final TableField<TUserRolesRecord, Long> ROLES_ID = createField(DSL.name("roles_id"), SQLDataType.BIGINT.nullable(false), this, "");

    private TUserRoles(Name alias, Table<TUserRolesRecord> aliased) {
        this(alias, aliased, null);
    }

    private TUserRoles(Name alias, Table<TUserRolesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>security.t_user_roles</code> table reference
     */
    public TUserRoles(String alias) {
        this(DSL.name(alias), T_USER_ROLES);
    }

    /**
     * Create an aliased <code>security.t_user_roles</code> table reference
     */
    public TUserRoles(Name alias) {
        this(alias, T_USER_ROLES);
    }

    /**
     * Create a <code>security.t_user_roles</code> table reference
     */
    public TUserRoles() {
        this(DSL.name("t_user_roles"), null);
    }

    public <O extends Record> TUserRoles(Table<O> child, ForeignKey<O, TUserRolesRecord> key) {
        super(child, key, T_USER_ROLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Security.SECURITY;
    }

    @Override
    public List<ForeignKey<TUserRolesRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FK7L00C7JB4804XLPMK1K26TEXY, Keys.FKJ47YP3HHTSOAJHT9793TBDRP4);
    }

    private transient TUser _tUser;
    private transient TRole _tRole;

    public TUser tUser() {
        if (_tUser == null)
            _tUser = new TUser(this, Keys.FK7L00C7JB4804XLPMK1K26TEXY);

        return _tUser;
    }

    public TRole tRole() {
        if (_tRole == null)
            _tRole = new TRole(this, Keys.FKJ47YP3HHTSOAJHT9793TBDRP4);

        return _tRole;
    }

    @Override
    public TUserRoles as(String alias) {
        return new TUserRoles(DSL.name(alias), this);
    }

    @Override
    public TUserRoles as(Name alias) {
        return new TUserRoles(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TUserRoles rename(String name) {
        return new TUserRoles(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TUserRoles rename(Name name) {
        return new TUserRoles(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}