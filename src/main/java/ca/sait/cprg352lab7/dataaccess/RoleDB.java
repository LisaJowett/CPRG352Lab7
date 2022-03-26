package ca.sait.cprg352lab7.dataaccess;

import ca.sait.cprg352lab7.models.Role;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class RoleDB 
{

    public List<Role> getAll() throws Exception 
    {
        EntityManager em = DBUtil1.getEmFactory().createEntityManager();
        
        try 
        {
            Query query = em.createNamedQuery("Role.findAll");
            return query.getResultList();
        } 
        finally 
        {
            em.close();
        }
    } 
}


