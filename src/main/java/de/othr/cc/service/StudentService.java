package de.othr.cc.service;

import de.othr.cc.entity.Student;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class StudentService {

    private static int lastStudentId = 1;

    @WebMethod(operationName = "registerStudent")
    public Student immatrikulieren(@WebParam(name = "student") Student student) {
        student.setMatrikelNr(lastStudentId);
        lastStudentId = lastStudentId + 1;
        System.out.println("Immatrikulieren: " + student);
        return student;
    }

}
