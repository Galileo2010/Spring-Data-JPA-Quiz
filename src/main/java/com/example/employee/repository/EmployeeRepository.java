package com.example.employee.repository;

import com.example.employee.entity.Company;
import com.example.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //以下所有的*都代表变量
    public Employee findById(int id);
    //1.查询名字是*的第一个employee
    public Employee findByName(String name);
    //2.找出Employee表中第一个姓名包含`*`字符并且薪资大于*的雇员个人信息
    public Employee findFirst1ByNameLikeAndSalaryGreaterThan(String ch, int salary);
    //3.找出一个薪资最高且公司ID是*的雇员以及该雇员的姓名
    public Employee findTop1ByCompanyIdOrderBySalaryDesc(int companyId);
    //4.实现对Employee的分页查询，每页两个数据

    //5.查找**的所在的公司的公司名称
    //@Query(value = "SELECT companyName FROM Company WHERE Company.id = ( SELECT companyId FROM Employee WHERE name = ?1 )")
    //@Query(value = "SELECT companyName FROM Company JOIN Employee ON Company.id = Employee.companyId WHERE Employee.name = ?1 ")
    //@Query(value = "SELECT CompanyName FROM Company WHERE id = (SELECT companyId FROM Employee WHERE name = ?1; )")

    //public String getCompanyNameByName(String name);
    //6.将*的名字改成*,输出这次修改影响的行数
    //public int updateNameByName(String name1, String name2);
    //7.删除姓名是*的employee
//    @Modifying
//    @Transactional
    public int deleteByName(String name);
}
