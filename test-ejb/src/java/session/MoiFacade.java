/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import bean.Moi;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Pc
 */
@Stateless
@LocalBean
public class MoiFacade extends AbstractFacade<Moi> implements MoiFacadeLocal {
    @PersistenceContext(unitName = "test-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MoiFacade() {
        super(Moi.class);
    }
    
}
