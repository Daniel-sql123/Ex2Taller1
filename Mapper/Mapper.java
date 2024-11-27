package Model.Mapper;

/**
 *
 * @author Crisp
 * @param <Ent>
 * @param <DTO>
 */

public interface Mapper <Ent,DTO> {
    
    public DTO toDTO(Ent ent);
    public Ent toEnt(DTO dto);
//
}
