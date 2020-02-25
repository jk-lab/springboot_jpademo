package com.offcn.controller;

import com.offcn.dao.PersonDao;
import com.offcn.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonDao personDao;

    /***
     * 添加方法
     * @param person
     * @return
     */

@PostMapping("/")
    public  String add(@RequestBody Person person){
        try {
            personDao.save(person);
            return "添加成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "添加失败";
        }
    }
@GetMapping("/{id}")
    public String update(@PathVariable(name = "id") Long id,Person person){
        person.setId(id);
        personDao.saveAndFlush(person);
        return "更新成功";
    }
@DeleteMapping("/{id}")
    public String delete(@PathVariable(name = "id") Long id){
            personDao.deleteById(id);
            return "删除成功";
    }
@GetMapping("/{id}")
    public Person findOne(@PathVariable(name = "id") Long id){
    return  personDao.findById(id).get();
    }

    @GetMapping("/")
    public List<Person> findAll(){
    return personDao.findAll();
    }

}
