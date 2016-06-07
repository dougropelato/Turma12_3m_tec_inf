package teste_banco_dados;

import dao.GenericDao;
import dao.PessoasDao;
import formularios.NovoJFrame;
import formularios.jfPessoas;
import formularios.jfPrincipal;
import java.lang.reflect.InvocationTargetException;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import tabelas.Pessoas;

/**
 *
 * @author Douglas
 */
public class Teste_banco_dados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        GenericDao gDao = new GenericDao();
        System.out.println("");
        List<Object> lista = gDao.listar(Pessoas.class);
        NovoJFrame t = new NovoJFrame(lista);
        t.setVisible(true);
        
        //  t.setVisible(true);
        // jfPrincipal p = new jfPrincipal();
        // p.setVisible(true);
        //Exemplos de utilização de data e hora
        //http://www.devmedia.com.br/trabalhando-com-as-classes-date-calendar-e-simpledateformat-em-java/27401
        /*        Calendar c = Calendar.getInstance();
        System.out.println("Data/Hora atual: "+c.getTime());
        System.out.println("Ano: "+c.get(Calendar.YEAR));
        System.out.println("Mês: "+c.get(Calendar.MONTH));
        System.out.println("Dia: "+c.get(Calendar.DAY_OF_MONTH));*/
        // jfPessoas formPessoas = new jfPessoas();
        //formPessoas.setVisible(true);
        //  GenericDao gDao = new GenericDao();
        
        
    }
}
