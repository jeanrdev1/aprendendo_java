package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.ToDo;
import utils.Env;

public class ToDoService {

    Connection conn;

    public ToDoService() {
        try {
            conn = DriverManager.getConnection(Env.DB_URL, Env.DB_USER, Env.DB_PASSWORD);
            System.out.println("DB CONNECTION OK!");
            createTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createTable() throws SQLException {

        /*
            CREATE TABLE IF NOT EXISTS todo (
                id INT AUTO_INCREMENT PRIMARY KEY,
                title VARCHAR(50) NOT NULL,
                description VARCHAR(50) NOT NULL,
                done BOOLEAN DEFAULT FALSE
            );
        */

        String sql = "CREATE TABLE IF NOT EXISTS todo (id INT AUTO_INCREMENT PRIMARY KEY, title VARCHAR(50) NOT NULL, description VARCHAR(50) NOT NULL, done BOOLEAN DEFAULT FALSE);";

        Statement stmt = conn.createStatement();
        stmt.execute(sql);
        stmt.close();
    }

    public void create(String title, String description) throws SQLException {
        String sql = "INSERT INTO todo (title, description) VALUES (?, ?)";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, title);
        pstmt.setString(2, description);
        pstmt.executeUpdate();
        pstmt.close();
    }

    public ToDo read(int id) throws SQLException {
        ToDo todo = null;

        String sql = "SELECT * FROM todo WHERE id = ?";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);

        ResultSet result = pstmt.executeQuery();

        if (result.next()) {
            todo = new ToDo(result.getInt("id"), result.getString("title"), result.getString("description"), result.getBoolean("done"));
        }

        result.close();
        pstmt.close();
        
        return todo;
    }

    public List<ToDo> readAll() throws SQLException {
        List<ToDo> todos = new ArrayList<>();

        String sql = "SELECT * FROM todo";

        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(sql);

        while (result.next()) {
            todos.add(new ToDo(result.getInt("id"), result.getString("title"), result.getString("description"), result.getBoolean("done")));
        }

        result.close();
        stmt.close();
        
        return todos;
    }

    public void updateStatus(int id) throws SQLException {
        ToDo todo = read(id);

        String sql = "UPDATE todo SET done = ? WHERE id = ?";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setBoolean(1, !todo.done);
        pstmt.setInt(2, id);
        pstmt.executeUpdate();
        pstmt.close();
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM todo WHERE id = ?";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        pstmt.executeUpdate();
        pstmt.close();
    }
}
