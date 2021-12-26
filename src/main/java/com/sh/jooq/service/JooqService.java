package com.sh.jooq.service;

import com.sh.jooq.codegen.tables.pojos.TRole;
import com.sh.jooq.codegen.tables.pojos.TUser;
import com.sh.jooq.codegen.tables.records.TUserRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.sh.jooq.codegen.Tables.*;

@Service
public class JooqService {
//    @Value("${spring.datasource.url}")
//    private String url;
//
//    @Value("${spring.datasource.username}")
//    private String username;
//
//    @Value("${spring.datasource.password}")
//    private String password;
//

//    @PostConstruct
//    public void init() {
//        try {
//            Connection connection = DriverManager.getConnection(url, username, password);
//            dslContext = DSL.using(connection, SQLDialect.MYSQL);
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//    }

    @Autowired
    private DSLContext dslContext;

    public void insert0() {
        dslContext.insertInto(T_USER, T_USER.USERNAME, T_USER.PASSWORD, T_USER.SECRET_KEY)
                .values("lisi", "$2a$10$r.1TKh7LSwZU0bqORyLItuV.dxcYnMG4kczfCAXom9RU3WWU8sWXS", "1024")
//                .values("lisi", "$2a$10$r.1TKh7LSwZU0bqORyLItuV.dxcYnMG4kczfCAXom9RU3WWU8sWXS", "1024")
                // 主键重复时忽略插入
                //.onDuplicateKeyIgnore()
                // 主键重复时更新数据
                //.onDuplicateKeyIgnore()
                // 返回对应字段的值（例如主键id）
//                .returning(T_USER.ID).fetchOne().getId();
                .execute();
    }

    public void insert1() {
        dslContext.insertInto(T_USER)
                .set(T_USER.USERNAME, "wangwu")
                .set(T_USER.PASSWORD, "$2a$10$r.1TKh7LSwZU0bqORyLItuV.dxcYnMG4kczfCAXom9RU3WWU8sWXS")
                .set(T_USER.SECRET_KEY, "1024")
//                .newRecord()
//                .set(T_USER.USERNAME, "wangwu")
//                .set(T_USER.PASSWORD, "$2a$10$r.1TKh7LSwZU0bqORyLItuV.dxcYnMG4kczfCAXom9RU3WWU8sWXS")
//                .set(T_USER.SECRET_KEY, "1024")
                .execute();
    }

    public void insert2() {
        TUserRecord record = dslContext.newRecord(T_USER);
        record.setUsername("zhaoliu");
        record.setPassword("$2a$10$r.1TKh7LSwZU0bqORyLItuV.dxcYnMG4kczfCAXom9RU3WWU8sWXS");
        record.setSecretKey("1024");
        // 插入所有set的字段
        record.insert();
        // set后指定要插入的字段
//        record.insert(T_USER.USERNAME, T_USER.PASSWORD);

        Long id = record.getId();
        System.out.println("---");
    }

    public void insert3() {
        TUserRecord record = new TUserRecord();
        record.setUsername("zhaoliu");
        record.setPassword("$2a$10$r.1TKh7LSwZU0bqORyLItuV.dxcYnMG4kczfCAXom9RU3WWU8sWXS");
        record.setSecretKey("1024");
        dslContext.insertInto(T_USER).set(record).execute();
        // 要返回主键id可参考insert0
    }

    /**
     * 直接使用 new 的方式创建 Record 对象，由于没有数据库连接相关信息，无法直接进行 insert, update, delete 操作，
     * 但是可以通过 DSLContext 的 API 进行操作数据操作，通过这种方式创建的 Record 对象可以理解为一个单纯的数据储存对象。
     */
    public void insert4() {
        TUserRecord record0 = new TUserRecord();
        record0.setUsername("lisi");
        record0.setPassword("$2a$10$r.1TKh7LSwZU0bqORyLItuV.dxcYnMG4kczfCAXom9RU3WWU8sWXS");
        record0.setSecretKey("1024");

        TUserRecord record1 = new TUserRecord();
        record1.setUsername("wangwu");
        record1.setPassword("$2a$10$r.1TKh7LSwZU0bqORyLItuV.dxcYnMG4kczfCAXom9RU3WWU8sWXS");
        record1.setSecretKey("1024");

        TUserRecord record2 = new TUserRecord();
        record2.setUsername("zhaoliu");
        record2.setPassword("$2a$10$r.1TKh7LSwZU0bqORyLItuV.dxcYnMG4kczfCAXom9RU3WWU8sWXS");
        record2.setSecretKey("1024");

        List<TUserRecord> recordList = new ArrayList<>();
        recordList.add(record0);
        recordList.add(record1);
        recordList.add(record2);

        dslContext.batchInsert(recordList).execute();
    }

    public void update0() {
        dslContext.update(T_USER)
                .set(T_USER.SECRET_KEY, "1024")
                .where(T_USER.USERNAME.eq("lisi"))
//                .where("t_user.username = 'lisi'")
                .execute();
    }

    public void update1() {
        // 通过主键更新
        TUserRecord record = dslContext.newRecord(T_USER);
        record.setId(10L);
        record.setSecretKey("2048");
        record.setEnabled(false);
        // 更新所有set的字段
        record.update();
        // set后指定要更新的字段
//        record.update(T_USER.SECRET_KEY);
    }

    public void update2() {
        // 通过主键更新
        TUserRecord record0 = dslContext.newRecord(T_USER);
        record0.setId(10L);
        record0.setSecretKey("2048");
        record0.update();

        TUserRecord record1 = dslContext.newRecord(T_USER);
        record1.setId(11L);
        record1.setSecretKey("2048");
        record1.update();

        TUserRecord record2 = dslContext.newRecord(T_USER);
        record2.setId(12L);
        record2.setSecretKey("2048");
        record2.update();

        List<TUserRecord> recordList = new ArrayList<>();
        recordList.add(record0);
        recordList.add(record1);
        recordList.add(record2);

        dslContext.batchUpdate(recordList).execute();
    }

    public void select0() {
        Result<Record> records = dslContext.select().from(T_USER).fetch();
        List<TUser> userList0 = records.into(TUser.class);
        List<TUser> userList = dslContext.select().from(T_USER).fetchInto(TUser.class);
        TUserRecord userRecord = dslContext.selectFrom(T_USER).where(T_USER.ID.eq(1L)).fetchOne();
        Record record = dslContext.select().from(T_USER).where(T_USER.ID.eq(1L)).fetchOne();
        TUser user = dslContext.select().from(T_USER).where(T_USER.ID.eq(1L)).fetchOneInto(TUser.class);
        List<String> usernameList = dslContext.select(T_USER.USERNAME).from(T_USER).fetchInto(String.class);
        Map<String, String> nameSecretKeyMap = dslContext.select().from(T_USER).fetchMap(T_USER.USERNAME, T_USER.SECRET_KEY);
        System.out.println("------");
    }

    public void select1() {
        List<TRole> roles = dslContext.select().from(T_ROLE).where(T_ROLE.ID.in(
                dslContext.select(T_USER_ROLES.ROLES_ID).from(T_USER_ROLES).where(T_USER_ROLES.T_USER_ID.eq(1L))))
                .fetchInto(TRole.class);

        Result<Record3<Long, String, String>> list = dslContext.select(T_USER.ID, T_USER.USERNAME, T_ROLE.NAME_ZH.as("nameZh")).from(T_USER)
                .innerJoin(T_USER_ROLES).on(T_USER.ID.eq(T_USER_ROLES.T_USER_ID))
                .innerJoin(T_ROLE).on(T_USER_ROLES.ROLES_ID.eq(T_ROLE.ID)).fetch();

        Map<String, List<String>> map = dslContext.select(T_USER.USERNAME, T_ROLE.NAME_ZH).from(T_USER)
                .innerJoin(T_USER_ROLES).on(T_USER.ID.eq(T_USER_ROLES.T_USER_ID))
                .innerJoin(T_ROLE).on(T_USER_ROLES.ROLES_ID.eq(T_ROLE.ID))
                .fetchGroups(T_USER.USERNAME, T_ROLE.NAME_ZH);
        System.out.println("------");
    }

    public void delete0() {
        dslContext.delete(T_USER).where(T_USER.USERNAME.eq("zhaoliu")).execute();
    }

    public void delete1() {
        // 根据主键删除
        TUserRecord record = new TUserRecord();
        record.setId(12L);
        record.delete();
    }

    public void delete3() {
        TUserRecord record0 = dslContext.newRecord(T_USER);
        record0.setId(11L);

        TUserRecord record1 = new TUserRecord();
        record1.setId(12L);

        List<TUserRecord> recordList = new ArrayList<>();
        recordList.add(record0);
        recordList.add(record1);

        dslContext.batchDelete(recordList).execute();
//        dslContext.batchDelete(record0, record1).execute();
    }
}
