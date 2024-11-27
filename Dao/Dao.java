package Model.Dao;

/**
 *
 * @author Crisp
 * @param <Dto>
 */
import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;

//<Dto> para adaptar los métodos para trabajar
//con ese dto
public abstract class Dao<Dto> {
    protected Connection connection;
    
    public Dao(Connection connection){
        this.connection = connection;
    }
    
    public abstract boolean create(Dto dto) throws SQLException;
    public abstract  Dto read(Object id) throws  SQLException;
    public abstract  List<Dto> readAll() throws SQLException;
    public abstract  boolean update(Dto dto) throws  SQLException;
    public abstract boolean delete (Object id) throws  SQLException;
}
             