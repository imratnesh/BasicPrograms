/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Values.tutorials;

import java.util.*;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class JavaCollection {
    
    private List countryList;
    private Set countrySet;
    private Map countryMap;
    private Properties countryProperties;
    
    public void setCountryList(List countryList)
    {
        this.countryList= countryList;
    }
    public void getCountryList()
    {
        System.out.println("List: "+ countryList );
    }
    public void setCountrySet(Set countrySet)
    {
        this.countrySet= countrySet;
    }
    public void getCountrySet()
    {
        System.out.println("Set: "+ countrySet );
    }
    public void setCountryMap(Map countryMap)
    {
        this.countryMap= countryMap;
    }
    public void getCountryMap()
    {
        System.out.println("Map: "+ countryMap );
    }
    public void setCountryProperties(Properties countryProperties)
    {
        this.countryProperties= countryProperties;
    }
    public void getCountryProperties()
    {
        System.out.println("Properties: "+ countryProperties );
    }
    
}
