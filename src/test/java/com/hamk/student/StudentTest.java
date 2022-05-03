package com.hamk.student;

import com.hank.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    Student stu = new Student("Hank", 60, 80);
    @Test
    void  heightScoreTest(){
        Assertions.assertEquals(80, stu.heighest());
    }
    @Test
    void averageTest(){
        Assertions.assertEquals((60+80)/2, stu.getAvgerage());
    }
}
