package sendbooks;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.util.Scanner;

public class books {
    public static void top10Book() {
        try (
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/sendbooks?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement statement = connection.createStatement();
        ) {
            ResultSet resultSet = statement.executeQuery("select BookName from books group by BookName DESC");
            System.out.println("\t\t BookName top 10");
            while (resultSet.next()) {
                String BookName = resultSet.getString("BookName");
                System.out.println("\t\t    " + BookName);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void top100Book() {
        try (
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/sendbooks?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement statement = connection.createStatement();
        ) {
            ResultSet resultSet = statement.executeQuery("select BookName, sum(status) as 'so luong da ban' from books inner join oderbook on books.BookName = oderbook.orderBookname group by BookName limit 100");
            System.out.println("Top 100 send books");
            while (resultSet.next()) {
                String BookName = resultSet.getString("BookName");
//                int stt = resultSet.getInt("oderbook.status");
                System.out.println(BookName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void searchCategory() {
        try (

                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/sendbooks?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement statement = connection.createStatement()
        ) {
            System.out.println("Nhap the loai ban muon tim (TECHNOLOGI, TECHNOLOGI LANGUAGE):");
            String search = new Scanner(System.in).next();
            ResultSet resultSet = statement.executeQuery("select BookName from books where Category =" + "'" + search + "'");
            System.out.println("Danh sach ban muon tim:");
            while (resultSet.next()) {
                String BookName = resultSet.getString("BookName");
                System.out.println(BookName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void searchAuthor() {
        try (
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/sendbooks?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement statement = connection.createStatement();
        ) {
            System.out.println("Nhap tac gia ban muon tim:");
            String search = new Scanner(System.in).next();
            ResultSet resultSet = statement.executeQuery("select BookName from books where Author ='" + search + "'");
            System.out.println("Danh sach ban muon tim:");
            while (resultSet.next()) {
                String BookName = resultSet.getString("BookName");
                System.out.println(BookName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void searchID() {
        try (
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/sendbooks?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement statement = connection.createStatement();
        )
        {
            System.out.println("Nhap ID ban muon tim:");
            String search = new Scanner(System.in).next();
            ResultSet resultSet = statement.executeQuery("select * from books where BookID =" + "'" + search + "'");
            System.out.println("Danh sach ban muon tim:");
            while (resultSet.next()) {
                String id = resultSet.getString("BookID");
                System.out.println(id);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        top10Book();
        top100Book();
//        searchCategory();
//        searchAuthor();
//        searchID();
    }
}
