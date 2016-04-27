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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.TypedQuery;

/**
 *
 * @author Emmett
 */
@Entity
public class Room implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long roomId;
    @ManyToOne
    private Conference conference;
    private String roomName;
    private int capacity;
    @OneToMany(mappedBy="room")
    private List<Presentation> presentations;

    public Room(Long roomId, Long confId, String roomName, int capacity, List<Presentation> presentations) {
        this.roomId = roomId;
      //  this.conference = conference;
        this.roomName = roomName;
        this.capacity = capacity;
        this.presentations = presentations;
    }

    public Room() {
    }
    public Room add(){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try{
            em.persist(this);
            trans.commit();
            return this;
            
        }catch(Exception e){
           System.out.println(e);
            trans.rollback();
            
        }finally{
            em.close();
        }
         
    return null;
    }
    public void change(){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try{
            
            em.merge(this);
            trans.commit();
            
        }catch (Exception e){
            System.out.println(e);
            trans.rollback();
            
        }finally{
            em.close();
        }
    }
     public void delete(){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try{
            Room r = em.find(this.getClass(), this.getRoomId());
            em.remove(r);
            trans.commit();
            
        }catch (Exception e){
            System.out.println(e);
            trans.rollback();
            
        }finally{
            em.close();
        }
    }
    public static Room read(Long roomId){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        
        trans.begin();
         try  {
            Room room = em.find(Room.class, roomId);
            return room;
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            trans.rollback();
        } finally {
            em.close();
        }
        return null;
    }
    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Presentation> getPresentations() {
        return presentations;
    }

    public void setPresentations(List<Presentation> presentations) {
        this.presentations = presentations;
    }
    
    
    
    
    
    
}
