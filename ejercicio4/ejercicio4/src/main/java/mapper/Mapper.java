package mapper;

import dto.ContactDTO;
import dto.RequestDTO;
import dto.ResponseDTO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Mapper {
    /**
     * Mapea una lista de entrada a una lista de salida.
     *
     * @param requestDTO La solicitud de entrada que contiene los datos a mapear.
     * @return Una lista de objetos ResponseDTO mapeados desde la entrada.
     * @throws ParseException Si ocurre un error al analizar los datos.
     */
    public static List<ResponseDTO> mapListaEntradaToSalida(RequestDTO requestDTO) throws ParseException {
        // TODO: Implementar lógica de mapeo aquí
        List<ResponseDTO> listaSalida = new ArrayList<>();
        List<String> dataDTO = requestDTO.getRequest();

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");

        int marcador = 0;

        // Ejemplo de cómo podrías comenzar a implementar el mapeo
        for (ContactDTO contactDTO : requestDTO.getContact()) {
            ResponseDTO responseDTO = new ResponseDTO();

            String[] splitDataDTO = dataDTO.get(marcador).split(",");

            responseDTO.setCel(contactDTO.getCel());
            responseDTO.setEmail(contactDTO.getEmail());
            responseDTO.setNombre(splitDataDTO[0]);
            responseDTO.setNumero(Integer.parseInt(splitDataDTO[1]));
            Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(splitDataDTO[2]);
            responseDTO.setFecha(date1);

            // Aquí deberías realizar el mapeo de cada propiedad desde contactDTO a responseDTO
            // por ejemplo: responseDTO.setNombre(contactDTO.getNombre());

            listaSalida.add(responseDTO);
            marcador++;
        }
        return listaSalida;
    }
}
