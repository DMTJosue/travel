package sn.ecpi.demo.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.ecpi.demo.entity.Bus;
import sn.ecpi.demo.service.BusService;

import java.util.List;

@RestController
@RequestMapping("/bus")
@AllArgsConstructor
public class BusController {
    private final BusService busService;

    @PostMapping("/create")
    public Bus create(@RequestBody Bus bus ){
        return busService.creer(bus);
    }

    @GetMapping("/read")
    public List<Bus> read(){
        return busService.lire();
    }

    @PutMapping("/update/{id}")
    public Bus update(@PathVariable long id, @RequestBody Bus bus){
        return busService.modifier(id, bus);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable long id){
        return busService.supprimer(id);
    }

}
