package UniTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import crackingthecodeinterview.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Mahmoud {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("أهلا وسهلا بكم في نظام القبول والتسجيل");
        System.out.println("يرجى تسجيل الدخول للمتابعة");
        boolean logged = false;
        String username, password;
        int option;
        do {
            System.out.println("1- تم تسجيل الدخول");
            System.out.println("0-خروج");
            System.out.println("يرجى اختيار الاجراء للمتابعة");
            option = input.nextInt();
            switch (option) {
                case 1:
                    logged = true;
                    System.out.println("ادخل اسم المستخدم");
                    username = input.next();
                    System.out.println("ادخل كلمة المرور");
                    password = input.next();
                    login(username, password);
                    break;
                case 0:
                    logged = false;
                    break;
                default:
                    System.out.println("اختيار خاطئ");
                    ;
            }
        }
        while (logged);

    }

    private static final String adminuser = "admin";
    private static final String stduser = "student";

    private static final String adminpass = "102030";
    private static final String stdpass = "123";

    public static void login(String username, String password) {
        if (username.equals(adminuser) && password.equals(adminpass)) {
            System.out.println("تم تسجيل الدخول بنجاح..المستخدم مدير");
            adminMenu();


        } else if (username.equals(stduser) && password.equals(stdpass)) {
            System.out.println("تم تسجيل الدخول بنجاح.. المستخدم طالب");
            studentMenu();
        } else {
            System.out.println("اسم المستخدم او كلمة المرور خطا");
        }
    }

    private static void adminMenu() {
        System.out.println(""
                + "1-add student \n"
                + "2-add teacher \n"
                + "3-add course \n"
                + "4-Delete teacher \n"
                + "5-delete student \n"
                + "6-delete coutse \n"
                + "7-Modify student \n"
                + "8-View courses \n"
                + "9-View courses teacher \n"
                + "10-exit"
        );
        boolean exit = true;
        int select;
        Scanner input = new Scanner(System.in);
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("يرجى ادخال معلومات الطالب");
                System.out.println("رقم الطالب");
                int id = input.nextInt();
                System.out.println("اسم الطالب:");
                String name = input.next();
                System.out.println("التخصص");
                String Specialization = input.next();
                addStudent(id, name, Specialization);
                break;
            case 2:
                System.out.println("يرجى ادخال معلومات المدرس");
                System.out.println("رقم المدرس");
                int idt = input.nextInt();
                System.out.println("اسم المدرس:");
                String namet = input.next();

                addTeacher(idt, namet);
                break;
            case 3:
                System.out.println("يرجى ادخال معلومات المساق");
                System.out.println("رقم المساق");
                int idc = input.nextInt();
                System.out.println("اسم المساق:");
                String namec = input.next();

                addCourse(idc, namec);
                break;
            case 4:
                System.out.println("يرجى ادخال معلومات الطالب");
                System.out.println("رقم الطالب");
                int idst = input.nextInt();
                deleteStudent(idst);
                break;
            case 5:
                System.out.println("يرجى ادخال معلومات الطالب");
                System.out.println("رقم المدرس");
                int idte = input.nextInt();
                deleteTeacher(idte);
                break;
            case 6:
                System.out.println("يرجى ادخال معلومات الطالب");
                System.out.println("رقم المساق");
                int idco = input.nextInt();
                deleteCourse(idco);
                break;
            case 7:
                System.out.println("يرجى ادخال معلومات الطالب");
                System.out.println("رقم المساق");

                break;
        }
    }


    public static class student {

        private int id;
        private String name;
        private String Specialization;

        public student(int id, String name, String Specialization) {

            this.id = id;
            this.name = name;
            this.Specialization = Specialization;
        }

    }


    public class Teacher {

        private int idt;
        private String namet;

        public Teacher(int id, String name) {

            this.idt = id;
            this.namet = name;

        }

    }

    private static void studentMenu() {
        System.out.println(""


                + "1-add course \n"
                + "2-delete coutse \n"
                + "3-View courses \n"
                + "4-exit"
        );
        boolean exit = true;
        int select;
        Scanner input = new Scanner(System.in);
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("يرجى ادخال معلومات المساق");
                System.out.println("رقم المساق");
                int idc = input.nextInt();
                System.out.println("اسم المساق:");
                String namec = input.next();

                addCourse(idc, namec);
                break;
            case 2:
                System.out.println("يرجى ادخال معلومات المدرس");
                System.out.println("رقم المدرس");
                int idt = input.nextInt();
                int idte = input.nextInt();
                deleteTeacher(idte);

                break;
            case 3:
                System.out.println("رقم المدرس");

        }
    }

    static ArrayList<student> students = new ArrayList<>();
    static ArrayList<Teacher> teachers = new ArrayList<>();

        private static void addStudent( int id, String name, String Specialization) {
            Scanner myObj = new Scanner(System.in);

             student s = new student(id,name,Specialization);
            students.add(s);
            System.out.println("تم اضافة الطالب بنجاح");
            System.out.println("s.toString");

        }

    private static void addTeacher(int idt, String namet) {

    }

    private static void addCourse(int idc, String namec) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void deleteStudent(int idt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void deleteTeacher(int idte) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void deleteCourse(int idco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}

