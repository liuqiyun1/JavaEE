package jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl {

    private JdbcTemplate jdbcTemplate;

    public void transfer(Integer userId1,Integer userId2,float sum){

        String sql="insert into business (userId1,userId2,sum) values(?,?,?)";
        jdbcTemplate.update(sql,userId1,userId2,sum);

        sql="update user set balance=balance-? where userId=?";
        jdbcTemplate.update(sql,sum,userId1);

        sql="update user set balance=balance+? where userId=?";
        jdbcTemplate.update(sql,sum,userId2);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
