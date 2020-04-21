package sendbooks;

import java.sql.*;
import java.util.Scanner;

public class order {
    public static void ordertop30() {
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
            ResultSet resultSet = statement.executeQuery("select ordername from oderbook group by status = 1 limit 30");
            System.out.println("Danh sach ban muon tim:");
            while (resultSet.next()) {
                String ordername = resultSet.getString("ordername");
                System.out.println(ordername);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void status_ctmID() {
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
            ResultSet resultSet = statement.executeQuery("select status, orderID  from oderbook inner join customers on oderbook.orderID = customers.customersID");
            System.out.println("Trang thai\t\t\tOrderID");
            while (resultSet.next()) {
                String stauts = resultSet.getString("status");
                String orderID = resultSet.getString("orderID");
                System.out.println("\t" + stauts + "\t\t   \t\t" + orderID);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void orderID_ctmID() {
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
            ResultSet resultSet = statement.executeQuery("select ordername, orderID  from oderbook inner join customers on oderbook.orderID = customers.customersID");
            System.out.println("Trang thai\t\t\tOrderID");
            while (resultSet.next()) {
                String orderName = resultSet.getString("ordername");
                String orderID = resultSet.getString("orderID");
                System.out.println("\t" + orderName + "\t\t   \t\t" + orderID);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void inforOder() {
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
            System.out.println("Nhap id ban muon tim:");
            String urID = new Scanner(System.in).next();
            ResultSet resultSet = statement.executeQuery("select * from oderbook where orderID='" + urID + "'");
            System.out.println("OrderID \t\t orderName \t\t Book Name \t\t Status \t\t Time \t\t price \t\t Quality");
            while (resultSet.next()) {
                String ordername = resultSet.getString("ordername");
                String orderID = resultSet.getString("orderID");
                String orderBookName = resultSet.getString("orderBookname");
                int stt = resultSet.getInt("status");
                String time = resultSet.getString("orderTime");
                double price = resultSet.getDouble("price");
                int qty = resultSet.getInt("qty");
                System.out.println(orderID + "\t\t\t\t\t" + ordername + "\t\t" + orderBookName + "\t\t\t" + stt + "\t\t\t" + time + "\t\t" + price + "\t\t" + qty);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//Don hang stt = 0
    public static void stt_0() {
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
            ResultSet resultSet = statement.executeQuery("select ordername from oderbook where status = 0");
            System.out.println("Don hang trang thai 0:");
            while (resultSet.next()) {
                String ordername = resultSet.getString("ordername");
                System.out.println(ordername);
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //Don hang stt = 2
    public static void stt_2() {
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
            ResultSet resultSet = statement.executeQuery("select ordername from oderbook where status = 2");
            System.out.println("Don hang trang thai 2:");
            while (resultSet.next()) {
                String ordername = resultSet.getString("ordername");
                System.out.println(ordername);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Don hang stt = 3
    public static void stt_3() {
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
            ResultSet resultSet = statement.executeQuery("select ordername from oderbook where status = 3");
            System.out.println("Don hang trang thai 3:");
            while (resultSet.next()) {
                String ordername = resultSet.getString("ordername");
                System.out.println(ordername);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Don hang stt = 4
    public static void stt_4() {
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
            ResultSet resultSet = statement.executeQuery("select ordername from oderbook where status = 4");
            System.out.println("Don hang trang thai 4:");
            while (resultSet.next()) {
                String ordername = resultSet.getString("ordername");
                System.out.println(ordername);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Don hang stt = 5
    public static void stt_5() {
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
            ResultSet resultSet = statement.executeQuery("select ordername from oderbook where status = 5");
            System.out.println("Don hang trang thai 5:");
            while (resultSet.next()) {
                String ordername = resultSet.getString("ordername");
                System.out.println(ordername);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
//        ordertop30();
//        orderID_ctmID();
//        status_ctmID();
//        inforOder();
        stt_0();
    }
}
