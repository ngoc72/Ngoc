/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.conferencewizard.db;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.TypedQuery;

/**
 *
 * @author Emmett
 */
@Entity
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String personId;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String title;
    @ManyToMany(mappedBy="attendees")
    private List<Conference> conferences;
    @ManyToMany(mappedBy="authors")
    private List<ConfPaper> papers;
    @ManyToMany
    private List<Presentation> presentations;

    public Person(String personId, String firstName, String lastName, String phone, String title, List<Conference> conferences, List<ConfPaper> papers) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.title = title;
        this.conferences = conferences;
        this.papers = papers;
    }

    public Person() {
    }

    public Person add(){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        try  {
            trans.begin();
            em.persist(this);
            trans.commit();
            return this;
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            trans.rollback();
        } finally {
            em.close();
        }
        return null;
    }
    
    public void change(){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        try  {
            trans.begin();
            em.merge(this);
            trans.commit();
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            trans.rollback();
        } finally {
            em.close();
        }
    }
    
    public void delete(){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        try  {
            trans.begin();
            em.remove(this);
            trans.commit();
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            trans.rollback();
        } finally {
            em.close();
        }     
    }
    
    public static Person read(String email){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        String readQuery = "Select p From Person p" +
                "Where p.email = :email";
        TypedQuery<Person> p = em.createQuery(readQuery, Person.class);
        
        try  {
            p.setParameter("email", email);
            return p.getSingleResult();
            
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            trans.rollback();
        } finally {
            em.close();
        }
        return null;
    }
    
    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Conference> getConferences() {
        return conferences;
    }

    public void setConferences(List<Conference> conferences) {
        this.conferences = conferences;
    }

    public List<ConfPaper> getPapers() {
        return papers;
    }

    public void setPapers(List<ConfPaper> papers) {
        this.papers = papers;
    }

    public List<Presentation> getPresentations() {
        return presentations;
    }

    public void setPresentations(List<Presentation> presentations) {
        this.presentations = presentations;
    }
    
}
