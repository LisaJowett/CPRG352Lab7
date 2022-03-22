package ca.sait.cprg352lab7.services;

import ca.sait.cprg352lab7.dataaccess.RoleDB;
import ca.sait.cprg352lab7.models.Role;
import java.util.List;

public class RoleService 
{
    private RoleDB roleDB = new RoleDB();

    public List<Role> getAll() throws Exception 
    {
        List<Role> roles = this.roleDB.getAll();
        return roles;
    }

    public int getRoleId(String roleName) throws Exception
    {
        int id = this.roleDB.getToRoleID(roleName);
        return id;
    }
}
