package mapper;

import dto.OutputInfoDTO;
import dto.PersonInfoDTO;
import dto.ProjectDTO;

import java.util.ArrayList;
import java.util.List;

public class MapperThree {
    // TODO: Implementar el método de mapeo aquí
    public static OutputInfoDTO mapInputToOutputThree(PersonInfoDTO personInfoDTO) {
        // TODO: Mapear las propiedades de PersonInfoDTO a OutputInfoDTO, incluyendo la transformación de proyectos
        // Ejemplo ficticio:
        // List<String> formattedProjectNames = personInfoDTO.getProjects().stream().map(ProjectDTO::getName).collect(Collectors.toList());
        // return new OutputInfoDTO(personInfoDTO.getFullName(), personInfoDTO.getAge(), personInfoDTO.getOccupation(), formattedProjectNames);

        if(personInfoDTO != null) {
            if (!personInfoDTO.getFullName().isEmpty()
                    && personInfoDTO.getAge()>0
                    && !personInfoDTO.getOccupation().isEmpty()
                    && !personInfoDTO.getProjects().isEmpty()    )   {
                // ¿Debemos comprobar la integridad de los datos?
                //return new OutputTwoDTO(inputTwoDTO.getName(), inputTwoDTO.getAge(), inputTwoDTO.getOccupation(),inputTwoDTO.getSkills()) ;

                List<String> recuperado = new ArrayList<String>();

                for (ProjectDTO itemIn : personInfoDTO.getProjects()) {
                    String name="NoVsalueIn", descr="NoVsalueIn";
                    if(!itemIn.getName().isEmpty()) {name = itemIn.getName(); }
                    if(!itemIn.getDescription().isEmpty()) {descr = itemIn.getName(); }
                   recuperado.add(name);
                    recuperado.add(descr);
                }

                return new OutputInfoDTO(personInfoDTO.getFullName(), personInfoDTO.getAge(), personInfoDTO.getOccupation(),recuperado);
            }
        }

        return null; // Reemplazar con la lógica adecuada
    }
}
