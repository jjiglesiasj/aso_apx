package mapper;

import dto.InputDTO;
import dto.OutputDTO;

public class Mapper {
    // TODO: Implementar el método de mapeo aquí
    public static OutputDTO mapInputToOutput(InputDTO inputDTO) {
        // TODO: Mapear las propiedades de InputDTO a OutputDTO
        // Ejemplo ficticio:
        // return new OutputDTO(inputDTO.getName(), inputDTO.getAge(), inputDTO.getOccupation());

        //Validamos que no es nulo el input.
        //Validamos que los campos de entrada no están vacios y la edad es positiva.

        if(inputDTO != null) {
            if (!inputDTO.getName().isEmpty()
                && inputDTO.getAge()>0
                    && !inputDTO.getOccupation().isEmpty()
                        ) {

                return new OutputDTO(inputDTO.getName(), inputDTO.getAge(), inputDTO.getOccupation()) ;

            }
        }


        return null; // Reemplazar con la lógica adecuada
    }
}
