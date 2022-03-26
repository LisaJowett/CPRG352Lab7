package ca.sait.cprg352lab7.dataaccess;

import ca.sait.cprg352lab7.models.Role;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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

    /*public int getToRoleID(String roleName) throws Exception 
    {
        //ConnectionPool cp = ConnectionPool.getInstance();
        //Connection con = cp.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        int id = -1;

        String sql = "SELECT role+id FROM role WHERE role_name=?";

        try
        {
            //ps = con.prepareStatement(sql);
            ps.setString(1, roleName);
            rs = ps.executeQuery();

            if(rs.next())
            {
                id = rs.getInt(1);
            }

        }
    
        finally
        {
            DBUtil1.closeResultSet(rs);
            DBUtil1.closePreparedStatement(ps);
            //cp.freeConnection(con);
        }

        return id;
    }*/
}


