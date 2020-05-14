package java15_0506;

import java.sql.*;

public class JDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.注册数据库的驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获取数据库连接（里面内容依次是："jdbc:mysql://主机名:端口号/数据库名","用户名","登录密码"）
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java15_0506?characterEncoding=utf8&useSSL=false", "root", "123456");
        //3.需要执行的sql语句（?是占位符，代表一个参数）
        //插入操作
        String sql = "insert into stu(id,name ) values(?,?)";
        //4.获取预处理对象，并依次给参数赋值
//        PreparedStatement statement = connection.prepareStatement(sql);
//        statement.setInt(1, 10);    //数据库字段类型是int，就是setInt；1代表第一个参数
//        statement.setString(2, "蔡徐坤"); //数据库字段类型是string,就是setString,2代表第二个参数
//        //5.执行sql语句（执行了几条记录，就返回几）
//        int i=statement.executeUpdate();
//        System.out.println(i);
//        //6.打印sql语句,这里没有 ; .
//        System.out.println(statement);
        //删除操作
        String sql1="delete from stu where id=?";
        PreparedStatement statement1=connection.prepareStatement(sql1);
        statement1.setInt(1,10);
        statement1.executeUpdate();
        //查询操作
        String sql2="select * from stu where id=?";
        PreparedStatement statement2=connection.prepareStatement(sql2);
        statement2.setInt(1,1);
        ResultSet resultSet=statement2.executeQuery();
        while (resultSet.next()){
            int id=resultSet.getInt("id");
            String name=resultSet.getString("name");
            System.out.println(id+": "+name);
        }
        //7.关闭jdbc连接,一定是先释放 statement, 再释放 Connection(先开的后关).
        statement1.close();
        connection.close();
    }
}
