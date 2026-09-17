package fr.ippon.mill.cereal.infrastructure.secondary;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "cereal")
public class CerealEntity {

  @Id
  private Long id;
  private String cereal;
  private Long farmerId;
  private double quantity;
  private Date deliveryDate;
}
