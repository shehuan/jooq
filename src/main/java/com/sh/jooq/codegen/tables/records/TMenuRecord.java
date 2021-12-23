/*
 * This file is generated by jOOQ.
 */
package com.sh.jooq.codegen.tables.records;


import com.sh.jooq.codegen.tables.TMenu;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TMenuRecord extends UpdatableRecordImpl<TMenuRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>security.t_menu.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>security.t_menu.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>security.t_menu.pattern</code>.
     */
    public void setPattern(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>security.t_menu.pattern</code>.
     */
    public String getPattern() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Long, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TMenu.T_MENU.ID;
    }

    @Override
    public Field<String> field2() {
        return TMenu.T_MENU.PATTERN;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getPattern();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getPattern();
    }

    @Override
    public TMenuRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public TMenuRecord value2(String value) {
        setPattern(value);
        return this;
    }

    @Override
    public TMenuRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TMenuRecord
     */
    public TMenuRecord() {
        super(TMenu.T_MENU);
    }

    /**
     * Create a detached, initialised TMenuRecord
     */
    public TMenuRecord(Long id, String pattern) {
        super(TMenu.T_MENU);

        setId(id);
        setPattern(pattern);
    }

    /**
     * Create a detached, initialised TMenuRecord
     */
    public TMenuRecord(com.sh.jooq.codegen.tables.pojos.TMenu value) {
        super(TMenu.T_MENU);

        if (value != null) {
            setId(value.getId());
            setPattern(value.getPattern());
        }
    }
}
