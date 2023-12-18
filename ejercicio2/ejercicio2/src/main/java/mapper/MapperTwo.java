package mapper;

import dto.InputTwoDTO;
import dto.OutputTwoDTO;

import java.util.ArrayList;
import java.util.List;

public class MapperTwo {
    // TODO: Implementar el método de mapeo aquí
    public static OutputTwoDTO mapInputToOutputTwo(InputTwoDTO inputTwoDTO) {
        // TODO: Mapear las propiedades de InputTwoDTO a OutputTwoDTO, incluyendo la transformación de habilidades
        // Ejemplo ficticio:
        // List<String> formattedSkills = inputDTO.getSkills().stream().map(skill -> skill.toUpperCase()).collect(Collectors.toList());
        // return new OutputDTO(inputDTO.getName(), inputDTO.getAge(), inputDTO.getOccupation(), formattedSkills);

        if(inputTwoDTO != null) {
            if (!inputTwoDTO.getName().isEmpty()
                    && inputTwoDTO.getAge()>0
                    && !inputTwoDTO.getOccupation().isEmpty()
                    && !inputTwoDTO.getSkills().isEmpty()    )   {
                // ¿Debemos comprobar la integridad de los datos?
                //return new OutputTwoDTO(inputTwoDTO.getName(), inputTwoDTO.getAge(), inputTwoDTO.getOccupation(),inputTwoDTO.getSkills()) ;

                List<String> recuperado = new ArrayList<String>();

                for (String itemIn : inputTwoDTO.getSkills()) {
                   if(itemIn.isEmpty()) {recuperado.add("NoValueIn"); }
                           else recuperado.add(itemIn);
                }

                return new OutputTwoDTO(inputTwoDTO.getName(), inputTwoDTO.getAge(), inputTwoDTO.getOccupation(),recuperado);
            }
        }



        return null; // Reemplazar con la lógica adecuada
    }
}
