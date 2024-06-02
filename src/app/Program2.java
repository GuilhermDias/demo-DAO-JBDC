package app;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("--- Teste 1: FindById ---");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("\n--- Teste 2: FindAll ---");
		List<Department> list = departmentDao.findAll();
		for(Department d: list) {
			System.out.println(d);
		}
		
		System.out.println("\n--- Teste 3: Insert ---");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Done!! Department Insert: " + newDepartment);
		
		System.out.println("\n--- Teste 4: Update ---");
		Department dep2 = departmentDao.findById(3);
		dep2.setName("Moda");
		departmentDao.update(dep2);
		System.out.println("UPDATE!! Department UPDATE: " + dep2);
		
		System.out.println("\n=== TEST 5: delete =======");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");


		
		sc.close();

	}

}
