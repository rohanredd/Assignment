package com.hibernate;

import com.dao.AssociatiobDao;
import com.dao.RegisterhqHq1;
import com.dao.RegistrationDao;
import com.entity.Captian;
import com.entity.Team;

public class App {
	
	public static void main(String[] args) {
	/*
    UserRegistration registration = new UserRegistration();
  //  registration.setId(125L);
    registration.setUserName("amith");
    registration.setPassword("passwroed");
    registration.setEmail("amith@gmail.com");
    registration.setMobileNumber("134567");
    */
    RegistrationDao registerDao = new RegistrationDao();
    //registerDao.saveUser(registration);
   
   // UserRegistration userRegistration = registerDao.getUserById(124L);
    //System.out.println(userRegistration);
    /*
    		UserDto userDto = new UserDto();
    		userDto.setUserName("ravi t");
    		userDto.setPassword("pwd@123");
    		userDto.setMobileNumber("1234567890");
    		userDto.setEmail("rt@outlook.com");
    		
    		registerDao.updateUserDetailsById(124L, userDto);
    		 */
    
    RegisterhqHq1 hqlDao = new RegisterhqHq1();
    		
    /*
    List<UserRegistration> list = hqlDao.getUsers();
    list.forEach( user ->{
    		System.out.println(user);
    });
    */
    /*
    UserRegistration userRegistration = hqlDao.getUserByEmail("rt@outlook.com");
    System.out.println(userRegistration);
    */
   // hqlDao.updateMobileNumberById("8951606106", 124L);
   // hqlDao.deleteUserById(125L);
    
    
    Captian captain = new Captian();
    captain.setName("rohre");
    captain.setAge(24L);
    captain.setJersyNumber("7");
    captain.setNoMatchesPlayed(200L);
    
    Team team = new Team();
    team.setName("indian football team");
    team.setType("football");
    team.setCountry("India");
    team.setNoOfPlayers(11L);
    team.setCaptain(captain);
    
    AssociatiobDao dao = new AssociatiobDao();
    dao.saveTeamDetails(team);
	}
}
}
