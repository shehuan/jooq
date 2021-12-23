/*
 * This file is generated by jOOQ.
 */
package com.sh.jooq.codegen.tables.records;


import com.sh.jooq.codegen.tables.TRole;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TRoleRecord extends UpdatableRecordImpl<TRoleRecord> implements Record3<Long, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>security.t_role.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>security.t_role.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>security.t_role.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>security.t_role.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>security.t_role.name_zh</code>.
     */
    public void setNameZh(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>security.t_role.name_zh</code>.
     */
    public String getNameZh() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TRole.T_ROLE.ID;
    }

    @Override
    public Field<String> field2() {
        return TRole.T_ROLE.NAME;
    }

    @Override
    public Field<String> field3() {
        return TRole.T_ROLE.NAME_ZH;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getNameZh();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getNameZh();
    }

    @Override
    public TRoleRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public TRoleRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public TRoleRecord value3(String value) {
        setNameZh(value);
        return this;
    }

    @Override
    public TRoleRecord values(Long value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TRoleRecord
     */
    public TRoleRecord() {
        super(TRole.T_ROLE);
    }

    /**
     * Create a detached, initialised TRoleRecord
     */
    public TRoleRecord(Long id, String name, String nameZh) {
        super(TRole.T_ROLE);

        setId(id);
        setName(name);
        setNameZh(nameZh);
    }

    /**
     * Create a detached, initialised TRoleRecord
     */
    public TRoleRecord(com.sh.jooq.codegen.tables.pojos.TRole value) {
        super(TRole.T_ROLE);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            setNameZh(value.getNameZh());
        }
    }
}
