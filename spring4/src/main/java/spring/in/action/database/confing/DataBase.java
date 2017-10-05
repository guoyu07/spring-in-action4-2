package spring.in.action.database.confing;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;


/**
 * Created by private on 05.10.17.
 */
@Configuration
public class DataBase {

    @Bean(destroyMethod = "shutdown")
    public DataSource dataSourceMemory() {
        return new EmbeddedDatabaseBuilder()
                .addScript("classpath:schema.sql")
                .addScript("classpath:test-data.sql")
                .build();
    }

    @Bean
    public DataSource dataSourceJndi() {
        JndiObjectFactoryBean jndiObjectFactoryBean =
                new JndiObjectFactoryBean();
        jndiObjectFactoryBean.setJndiName("jdbc/myDS");
        jndiObjectFactoryBean.setResourceRef(true);
        jndiObjectFactoryBean.setProxyInterface(javax.sql.DataSource.class);
        return (DataSource) jndiObjectFactoryBean.getObject();
    }

    @Bean(destroyMethod = "close")
    public DataSource dataSourceDBCP() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:h2:tcp://dbserver/~/test");
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUsername("sa");
        dataSource.setPassword("password");
        dataSource.setInitialSize(20);
        dataSource.setMaxActive(30);
        return dataSource;
    }
}
