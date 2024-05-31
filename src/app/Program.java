package app;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");

		Seller obj1 = new Seller(21, "Bob", "Bob@gmail.com", new Date(), 3000.0, obj);
		System.out.println(obj1);
		
		SellerDao sellerdao = DaoFactory.createSellerDao();
		
	}

}
