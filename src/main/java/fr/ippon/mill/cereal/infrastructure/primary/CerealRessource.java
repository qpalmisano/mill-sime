package fr.ippon.mill.cereal.infrastructure.primary;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping(CerealRessource.CEREAL_API_URI)
@Validated
public class CerealRessource {

  public static final String CEREAL_API_URI = "/api/cereals";



  public CerealRessource() {

  }

  @PostMapping
  public ResponseEntity<String> create(@RequestBody @Valid CreateCerealRequest newCereal) {
        return ResponseEntity.ok("ok");
    }
  }

