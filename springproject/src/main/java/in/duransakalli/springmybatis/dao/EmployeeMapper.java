package in.duransakalli.springmybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import in.duransakalli.springmybatis.util.MyBatisUtil;
import in.duransakalli.springmybetis.entity.Employee;

@Repository
public class EmployeeMapper {
	
	public List<Employee> getAllEmployees(){
		
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		List<Employee> employeeList =  session.selectList("getAllEmployees");
		session.commit();
		session.close();
		return employeeList;
		
	}
	
}
