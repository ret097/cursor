package main.java.users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter {
   private List<User> users=new ArrayList<>();

   public void addToList(){
       User userOne = new User("aaa@mail", LocalDate.of(2020,10,14),"blue");
       User userTwo = new User("bbb@mail", LocalDate.of(2020,10,15),"red");
       User userThree = new User("ccc@mail", LocalDate.of(2020,8,16),"blue");
       User userFour = new User("ddd@mail", LocalDate.of(2020,10,17),"red");
       User userFive = new User("eee@mail", LocalDate.of(2020,9,30),"blue");
       User userSix = new User("fff@mail", LocalDate.of(2020,10,1),"red");
       User userSeven = new User("ggg@mail", LocalDate.of(2020,10,9),"blue");

       users.add(userOne);
       users.add(userFive);
       users.add(userThree);
       users.add(userFour);
       users.add(userSeven);
       users.add(userSix);
       users.add(userTwo);
   }
   public void sortUsers(){
       addToList();
       LocalDate date=LocalDate.of(2020,10,1);
       Map<String, Map<String, List<User>>> filter= users.stream()
               .filter(user -> user.getLoginDate().isAfter(date))
               .collect(Collectors.groupingBy(User::getTeam,
                       Collectors.groupingBy(User::getMail)));
       filter.forEach((team, list)-> System.out.println(team + " team " + list.keySet()));
   }
}