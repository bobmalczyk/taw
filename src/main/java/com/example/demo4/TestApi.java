package com.example.demo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class TestApi {
    @Autowired
    private CourseDatabase courseDatabase;

    @GetMapping("test")
    public String testApi() {
        return "test";
    }

    @PostMapping(value = "courses",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public void addNewCourse(@RequestBody Course element) {
        courseDatabase.addCourse(element);
    }

    @GetMapping(value = "courses",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Course> getCourses(
                                        @Nullable @RequestParam("ects") Integer ects,
                                        @Nullable @RequestParam("nazwa") String name,
                                        @Nullable @RequestParam("sala") Integer sala,
                                        @Nullable @RequestParam("egzamin") String egzamin) {
        return courseDatabase.getCourseList(name, ects, sala, egzamin);
    }

    @GetMapping(value= "courses/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getCourseById(@PathVariable("id") Integer id){
        Course course = courseDatabase.getCourseById(id);
        if(course == null){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(course);
        }
    }


    @DeleteMapping(value = "courses")
    public void deleteAll(){
        courseDatabase.deleteAll();
    }

    @DeleteMapping(value = "courses/{id}")
    public ResponseEntity deleteById(@PathVariable("id") Integer id){
        boolean isDeleted = courseDatabase.deleteById(id);
        if(isDeleted == true){
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
