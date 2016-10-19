/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.myjdbc;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class Student {
    
    private String name;
    private Integer id;
    private Integer age;
    public void setName(String name)
    {
        this.name= name;
    }
    public void setId(Integer id)
    {
        this.id=id;
    }
    public  void setAge(Integer age)
    {
        this.age=age;
    }
    public String getName()
    {
        return name;
    }
    public Integer getId()
    {
        return id;
    }
    public Integer getAge()
    {
        return age;
    }
}
