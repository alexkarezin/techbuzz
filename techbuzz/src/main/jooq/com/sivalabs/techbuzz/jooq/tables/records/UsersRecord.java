/*
 * This file is generated by jOOQ.
 */
package com.sivalabs.techbuzz.jooq.tables.records;


import com.sivalabs.techbuzz.jooq.tables.Users;
import com.sivalabs.techbuzz.users.domain.models.RoleEnum;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> implements Record9<Long, String, String, String, RoleEnum, Boolean, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.users.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.users.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.users.email</code>.
     */
    public void setEmail(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.users.email</code>.
     */
    public String getEmail() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.users.password</code>.
     */
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.users.password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.users.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.users.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.users.role</code>.
     */
    public void setRole(RoleEnum value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.users.role</code>.
     */
    public RoleEnum getRole() {
        return (RoleEnum) get(4);
    }

    /**
     * Setter for <code>public.users.verified</code>.
     */
    public void setVerified(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.users.verified</code>.
     */
    public Boolean getVerified() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>public.users.verification_token</code>.
     */
    public void setVerificationToken(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.users.verification_token</code>.
     */
    public String getVerificationToken() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.users.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.users.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>public.users.updated_at</code>.
     */
    public void setUpdatedAt(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.users.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, String, String, RoleEnum, Boolean, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, String, String, String, RoleEnum, Boolean, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Users.USERS.ID;
    }

    @Override
    public Field<String> field2() {
        return Users.USERS.EMAIL;
    }

    @Override
    public Field<String> field3() {
        return Users.USERS.PASSWORD;
    }

    @Override
    public Field<String> field4() {
        return Users.USERS.NAME;
    }

    @Override
    public Field<RoleEnum> field5() {
        return Users.USERS.ROLE;
    }

    @Override
    public Field<Boolean> field6() {
        return Users.USERS.VERIFIED;
    }

    @Override
    public Field<String> field7() {
        return Users.USERS.VERIFICATION_TOKEN;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return Users.USERS.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return Users.USERS.UPDATED_AT;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getEmail();
    }

    @Override
    public String component3() {
        return getPassword();
    }

    @Override
    public String component4() {
        return getName();
    }

    @Override
    public RoleEnum component5() {
        return getRole();
    }

    @Override
    public Boolean component6() {
        return getVerified();
    }

    @Override
    public String component7() {
        return getVerificationToken();
    }

    @Override
    public LocalDateTime component8() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime component9() {
        return getUpdatedAt();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getEmail();
    }

    @Override
    public String value3() {
        return getPassword();
    }

    @Override
    public String value4() {
        return getName();
    }

    @Override
    public RoleEnum value5() {
        return getRole();
    }

    @Override
    public Boolean value6() {
        return getVerified();
    }

    @Override
    public String value7() {
        return getVerificationToken();
    }

    @Override
    public LocalDateTime value8() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime value9() {
        return getUpdatedAt();
    }

    @Override
    public UsersRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public UsersRecord value2(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public UsersRecord value3(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public UsersRecord value4(String value) {
        setName(value);
        return this;
    }

    @Override
    public UsersRecord value5(RoleEnum value) {
        setRole(value);
        return this;
    }

    @Override
    public UsersRecord value6(Boolean value) {
        setVerified(value);
        return this;
    }

    @Override
    public UsersRecord value7(String value) {
        setVerificationToken(value);
        return this;
    }

    @Override
    public UsersRecord value8(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public UsersRecord value9(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public UsersRecord values(Long value1, String value2, String value3, String value4, RoleEnum value5, Boolean value6, String value7, LocalDateTime value8, LocalDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(Long id, String email, String password, String name, RoleEnum role, Boolean verified, String verificationToken, LocalDateTime createdAt, LocalDateTime updatedAt) {
        super(Users.USERS);

        setId(id);
        setEmail(email);
        setPassword(password);
        setName(name);
        setRole(role);
        setVerified(verified);
        setVerificationToken(verificationToken);
        setCreatedAt(createdAt);
        setUpdatedAt(updatedAt);
        resetChangedOnNotNull();
    }
}
