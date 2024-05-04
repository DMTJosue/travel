package sn.ecpi.demo.service;

import sn.ecpi.demo.entity.Bus;

import java.util.List;

public interface BusService {
    Bus creer(Bus bus);
    List <Bus> lire();
    Bus modifier(Long id, Bus bus);
    String supprimer(long id);
}
