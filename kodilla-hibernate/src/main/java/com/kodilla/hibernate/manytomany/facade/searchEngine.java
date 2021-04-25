package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class searchEngine {
    private static final Logger LOGGER = LoggerFactory.getLogger(searchEngine.class);

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> searchCompanies(String partOfName) throws serachEngineException {
        LOGGER.info("Searching for company with letters: " + partOfName + " in it's name");
        List <Company> companies = companyDao.searchByPartOfName(partOfName);
        if (companies.size() == 0) {
            LOGGER.error(serachEngineException.ERR_COMPANY_NOT_FOUND);
            throw new serachEngineException(serachEngineException.ERR_COMPANY_NOT_FOUND);
        }
        return companies;
    }

    public List<Employee> searchEmployees(String partOfName) throws serachEngineException {
        LOGGER.info("Searching for employees with letters: " + partOfName + " in it's name");
        List<Employee> employees = employeeDao.searchByPartOfName(partOfName);
        if (employees.size() == 0) {
            LOGGER.error(serachEngineException.ERR_EMPLOYEE_NOT_FOUND);
            throw new serachEngineException(serachEngineException.ERR_COMPANY_NOT_FOUND);
        }
        return employees;
    }
}
