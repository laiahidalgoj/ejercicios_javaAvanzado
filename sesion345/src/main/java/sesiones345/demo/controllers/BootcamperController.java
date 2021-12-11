package sesiones345.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sesiones345.demo.entities.Bootcamper;
import sesiones345.demo.repository.BootcamperRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class BootcamperController {

    private final Logger log = LoggerFactory.getLogger(BootcamperRepository.class);
    private BootcamperRepository bootcamperRepository;

    public  BootcamperController(BootcamperRepository bootcamperRepository){
        this.bootcamperRepository = bootcamperRepository;
    }

    /**
     * Obtener todos los bootcampers
     * @return
     */
    @GetMapping("/bootcampers")
    public List<Bootcamper> findAll(){
        return bootcamperRepository.findAll();
    }

    /**
     * Obtener bootcamper según id
     * @param id
     * @return
     */
    @GetMapping("/bootcampers/{id}")
    public ResponseEntity<Bootcamper> findById(@PathVariable Long id){
        Optional<Bootcamper> bootcamperOpt = bootcamperRepository.findById(id);
        if(bootcamperOpt.isPresent()){
            return ResponseEntity.ok(bootcamperOpt.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * Crear Bootcamper en base de datos.
     * @param bootcamper
     * @return
     */
    @PostMapping("bootcampers")
    public ResponseEntity<Bootcamper> create(@RequestBody Bootcamper bootcamper){
        if(bootcamper.getId() != null){
            log.warn("Intentando crear un bootcamper con id");
            return ResponseEntity.badRequest().build();
        }

        Bootcamper bootcamperSave = new Bootcamper(
                null,
                bootcamper.getNombre(),
                bootcamper.getNivel()
        );

        Bootcamper result = bootcamperRepository.save(bootcamperSave);
        return ResponseEntity.ok(result);
    }

    /**
     * Actualizar bootcamper en la base de datos
     * @param bootcamper
     * @return
     */
    @PutMapping("bootcampers")
    public ResponseEntity<Bootcamper> update(@RequestBody Bootcamper bootcamper){
        if(bootcamper.getId() == null){
            log.warn("Intentando actualizar un bootcamper inexistente");
            return ResponseEntity.badRequest().build();
        }
        if(!bootcamperRepository.existsById(bootcamper.getId())){
            log.warn("Intentando actualiza un bootcamper inexistente");
        }

        Optional<Bootcamper> bootcamperOpt = bootcamperRepository.findById(bootcamper.getId());
        if(bootcamperOpt.isPresent()){
            Bootcamper bootcamperOld = bootcamperOpt.get();
        }

        Bootcamper bootcamperSave = new Bootcamper(
                bootcamper.getId(),
                bootcamper.getNombre(),
                bootcamper.getNivel()
        );

        Bootcamper result = bootcamperRepository.save(bootcamperSave);
        log.info("Actualizando bootcamper " + bootcamperSave.getId());
        return ResponseEntity.ok(result);
    }

    /**
     * Eliminar bootcamper según id
     * @param id
     * @return
     */
    @DeleteMapping("bootcampers/{id}")
    public ResponseEntity<Bootcamper> deleteById(@PathVariable Long id){
        if(!bootcamperRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }

        bootcamperRepository.deleteById(id);
        log.info("Eliminando boocamper: " + id);
        return ResponseEntity.noContent().build();
    }

    /**
     * Eliminar todos los bootcampers
     * @return
     */
    @DeleteMapping("bootcampers")
    public ResponseEntity<Bootcamper> deleteAll(){
        bootcamperRepository.deleteAll();
        log.info("Eliminando todos los bootcampers");
        return ResponseEntity.noContent().build();
        }
    }
