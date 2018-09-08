package eentity;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class User implements Comparable<User>{
   public String email;
    public String password;
    public LocalDate birhday;

    static private Set<User> listUser = new TreeSet<>();

    public User(String email, String password, LocalDate birhday) {
        this.email = email;
        this.password = password;
        this.birhday = birhday;
        listUser.add(this);

    }

   public void printUser(){
        System.out.println(listUser);
    }

    public static Set<User> getListUser() {
        return listUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", birhday=" + birhday +
                '}';
    }

    public static void main(String[] args) {

        User user1 = new User
                ("mail@i.ua", "qwe123", LocalDate.of(2000, 12, 23));
        User user2 = new User
                ("mail@i.ua", "qwewwe123", LocalDate.of(2000, 12, 23));

        System.out.println(User.listUser);
        //LocalDate qw=new LocalDate();
    }


    @Override
    public int compareTo(User o) {
        return this.email.compareTo(o.email);
    }
}
