package fr.ippon.mill.cereal.infrastructure.primary;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

/**
 * CreateCerealRequest
 */

public class CreateCerealRequest {

  @NotNull
  @NotBlank
  @JsonProperty("cereal")
  private String cereal;

  @NotNull
  @NotBlank
  private double quantity;

  @NotNull
  @NotBlank
  private Date deliveryDate;


  public String getCereal() {
    return cereal;
  }

  public void setCereal(String cereal) {
    this.cereal = cereal;
  }

  public double getQuantity() {
    return quantity;
  }

  public void setQuantity(double quantity) {
    this.quantity = quantity;
  }

  public Date getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(Date deliveryDate) {
    this.deliveryDate = deliveryDate;
  }
}

