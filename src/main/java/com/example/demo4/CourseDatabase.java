package com.example.demo4;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Scope("singleton")
public class CourseDatabase {

    private List<Course> courseList = new ArrayList<>();
    private int courseCounter = 1;
    public void addCourse(Course element){
        element.setId((courseCounter));
        courseList.add(element);
        courseCounter++;
    }

    public Course getCourseById(Integer id) {
        for ( Course element: courseList){
            if(element.getId().equals(id)){
                return element; }
        }
        return null;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public List<Course> getCourseList(String name, Integer ects, Integer sala, String egzamin ) {


        List<Course> filteredCourses = new ArrayList<>(courseList);
        //if(priority != null) {
        //filteredCourses = filteredCourses.stream()
        //.filter(e -> e.getPriority().equals(priority))
        //.collect(Collectors.toList());
       // }
        if(name != null) {
        filteredCourses = filteredCourses.stream()
        .filter(e -> e.getName().equals(name))
        .collect(Collectors.toList());
         }
        if(egzamin != null) {
        filteredCourses = filteredCourses.stream()
        .filter(e -> e.getEgzamin().equals(egzamin))
        .collect(Collectors.toList());
        }
        if(sala != null) {
        filteredCourses = filteredCourses.stream()
        .filter(e -> e.getSala().equals(sala))
        .collect(Collectors.toList());
        }
         return filteredCourses;


       /* if(priority == null && name == null) {
            return  activityList;
        }
        List<Activity> filteredCourses = new ArrayList<>();
        for ( Activity element : activityList ) {

            if(element.getPriority().equals(priority) || element.getName().equals(name) ){
                filteredCourses.add(element);
            }
        }
        return filteredCourses;*/
    }

    public void deleteAll(){
        courseList.clear();
    }

    public boolean deleteById(Integer id){
        Course toDelete = null;
        for(Course element : courseList) {
            if(element.getId().equals(id)){
                toDelete = element;
            }
        }
        return courseList.remove(toDelete);
    }
}
