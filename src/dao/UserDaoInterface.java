package dao;

import model.User;

public interface UserDaoInterface {
	int signUp(User user) throws Exception;
	boolean loginUser(User user) throws Exception;
}


//package dao;
//
//import model.User;
//
//public interface UserDaoInterface {
//	int signUp(User user);
//	boolean loginUser(User user);
//}
