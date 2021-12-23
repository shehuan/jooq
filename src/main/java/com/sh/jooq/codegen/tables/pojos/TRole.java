/*
 * This file is generated by jOOQ.
 */
package com.sh.jooq.codegen.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TRole implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long   id;
    private String name;
    private String nameZh;

    public TRole() {}

    public TRole(TRole value) {
        this.id = value.id;
        this.name = value.name;
        this.nameZh = value.nameZh;
    }

    public TRole(
        Long   id,
        String name,
        String nameZh
    ) {
        this.id = id;
        this.name = name;
        this.nameZh = nameZh;
    }

    /**
     * Getter for <code>security.t_role.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>security.t_role.id</code>.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter for <code>security.t_role.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>security.t_role.name</code>.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for <code>security.t_role.name_zh</code>.
     */
    public String getNameZh() {
        return this.nameZh;
    }

    /**
     * Setter for <code>security.t_role.name_zh</code>.
     */
    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TRole (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(nameZh);

        sb.append(")");
        return sb.toString();
    }
}
