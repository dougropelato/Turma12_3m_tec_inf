/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import dao.GenericDao;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tabelas.cidade;

/**
 *
 * @author Fernando
 */
public class Teste {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, InstantiationException {
        GenericDao genericDao = new GenericDao();
        List teste = new ArrayList();
        
        teste = genericDao.listar(cidade.class);
    }
}
