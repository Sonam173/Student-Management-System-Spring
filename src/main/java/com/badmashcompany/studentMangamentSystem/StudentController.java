package com.badmashcompany.studentMangamentSystem;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@RestController

public class StudentController {
    Map<Integer,Student> db = new HashMap<>();//database
   @GetMapping("/get_info")
    Student getStudent(@RequestParam("id") int adminNo)
    {
      return  db.get(adminNo);
    }
    @PostMapping("/add")
  String  addStudent(@RequestBody() Student student)
    {
        db.put(student.getAdminNo(),student);
        return "student has been added successfully";
    }
    @DeleteMapping("/delete/{id}")

   String deleteStudent(@PathVariable("id") int adminNo)
    {
        db.remove(adminNo);
        return "student deleted successfully";

    }
}
