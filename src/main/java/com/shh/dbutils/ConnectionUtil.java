package com.shh.dbutils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * 从数据源获取一个连接，并且和当前线程绑定
 */
@Component
public class ConnectionUtil {
    @Autowired
    private DataSource dataSource;

    private ThreadLocal<Connection> tl = new ThreadLocal<Connection>();

    /**
     * 获取连接
     *
     * @return
     */
    public Connection getConnection() {
        Connection connection = tl.get();
        try {
            if (connection == null) {
                connection = dataSource.getConnection();
                tl.set(connection);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    /**
     * 删除连接
     */
    public void removeConnection() {
        tl.remove();
    }
}
