package fr.univ.rouen.stbserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@RestController
public class GETController {
@GetMapping("/resume")
public String getListSTBinXML() {
return "Envoi de la liste des STB";
}

@GetMapping("/id")
public String getSTBinXML(
		@RequestParam(value = "name") String texte) {
return ("Détail de la STB demandée : " + texte);
}

@GetMapping("/test")
public String getTest(
@RequestParam(value = "nb") String nb,
@RequestParam(value = "texte") String text) {
return (" Test: "+ "id = "+ nb + "titre = " + text);
}


}