package Mapper;

/**
 *
 * @author Crisp
 */
public interface Mapper<Ent, DTO> {

    public DTO toDTO(Ent ent);
    public Ent toEnt(DTO dto);

}
