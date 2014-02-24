/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Moi;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Pc
 */
@Local
public interface MoiFacadeLocal {

    void create(Moi moi);

    void edit(Moi moi);

    void remove(Moi moi);

    Moi find(Object id);

    List<Moi> findAll();

    List<Moi> findRange(int[] range);

    int count();
    
}
