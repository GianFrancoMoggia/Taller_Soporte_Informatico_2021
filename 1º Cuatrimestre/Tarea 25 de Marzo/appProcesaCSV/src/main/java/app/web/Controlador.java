package app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class Controlador {



    @Autowired
    private ManejadorDeArchivos archivoCSV;



    public Controlador() {
        this.archivoCSV = new ManejadorDeArchivos();
    }


    @GetMapping("/")
    public String index() {
        return "inicio";
    }



    @RequestMapping(value = "/datos/csv",method = RequestMethod.GET)
    public ResponseEntity<Object> enviarDatosCSV(){
        HashMap<String,Object> valores = new HashMap<>();
        valores.put("Beneficiarios",obtenerBeneficiarios());
        return new ResponseEntity<>(valores,HttpStatus.OK);
    }

    @RequestMapping(value = "/datos/json",method = RequestMethod.GET)
    public ResponseEntity<Object> enviarDatosJson(){
        return new ResponseEntity<>(this.archivoCSV.obtenerArchivoJson(),HttpStatus.OK);
    }

    public ArrayList<Beneficiario> obtenerBeneficiarios(){

        ArrayList<Beneficiario> listaBeneficiarios = new ArrayList<>();
        Iterator<String[]> iterador = archivoCSV.obtenerIterador();

        while (iterador.hasNext()){

            String[] fila = iterador.next();

            String genero = fila[0];
            String nivel_educativo = fila[1];
            String edad = fila[2];
            String ingreso_conjunto = fila[3];
            String smvm = fila[4];
            String alquila = fila[5];
            String condicion_laboral_primaria = fila[6];
            String condicion_laboral_secundaria = fila[7];
            String localidad = fila[8];
            String comuna = fila[9];
            String barrio = fila[10];
            String partido = fila[11];


            Beneficiario beneficiario= new Beneficiario(genero,nivel_educativo,edad,ingreso_conjunto,smvm,alquila,
                                                        condicion_laboral_primaria,condicion_laboral_secundaria,
                                                        localidad,comuna,barrio,partido);

            listaBeneficiarios.add(beneficiario);

        }

        return listaBeneficiarios;
    }
}

