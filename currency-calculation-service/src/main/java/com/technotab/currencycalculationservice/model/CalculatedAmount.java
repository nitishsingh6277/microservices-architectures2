package com.technotab.currencycalculationservice.model;

import java.math.BigDecimal;
import java.util.Objects;

public class CalculatedAmount {
   private long id;
   private String from;
   private String to;
   private BigDecimal conversionMultiple;
   private BigDecimal quantity;
   private BigDecimal totalCalculatedAmount;
   private int port;


   public CalculatedAmount() {
     // TODO document why this constructor is empty
   }


public CalculatedAmount(long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
        BigDecimal totalCalculatedAmount, int port) {
    this.id = id;
    this.from = from;
    this.to = to;
    this.conversionMultiple = conversionMultiple;
    this.quantity = quantity;
    this.totalCalculatedAmount = totalCalculatedAmount;
    this.port = port;
}

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFrom() {
        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return this.conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal multiplicationFactor) {
        this.conversionMultiple = multiplicationFactor;
    }

    public BigDecimal getQuantity() {
        return this.quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalCalculatedAmount() {
        return this.totalCalculatedAmount;
    }

    public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
        this.totalCalculatedAmount = totalCalculatedAmount;
    }

    public int getPort() {
        return this.port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public CalculatedAmount id(long id) {
        setId(id);
        return this;
    }

    public CalculatedAmount from(String from) {
        setFrom(from);
        return this;
    }

    public CalculatedAmount to(String to) {
        setTo(to);
        return this;
    }

    public CalculatedAmount multiplicationFactor(BigDecimal multiplicationFactor) {
        setConversionMultiple(multiplicationFactor);
        return this;
    }

    public CalculatedAmount quantity(BigDecimal quantity) {
        setQuantity(quantity);
        return this;
    }

    public CalculatedAmount totalCalculatedAmount(BigDecimal totalCalculatedAmount) {
        setTotalCalculatedAmount(totalCalculatedAmount);
        return this;
    }

    public CalculatedAmount port(int port) {
        setPort(port);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CalculatedAmount)) {
            return false;
        }
        CalculatedAmount calculatedAmount = (CalculatedAmount) o;
        return id == calculatedAmount.id && Objects.equals(from, calculatedAmount.from) && Objects.equals(to, calculatedAmount.to) && Objects.equals(conversionMultiple, calculatedAmount.conversionMultiple) && Objects.equals(quantity, calculatedAmount.quantity) && Objects.equals(totalCalculatedAmount, calculatedAmount.totalCalculatedAmount) && port == calculatedAmount.port;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, from, to, conversionMultiple, quantity, totalCalculatedAmount, port);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", from='" + getFrom() + "'" +
            ", to='" + getTo() + "'" +
            ", multiplicationFactor='" + getConversionMultiple() + "'" +
            ", quantity='" + getQuantity() + "'" +
            ", totalCalculatedAmount='" + getTotalCalculatedAmount() + "'" +
            ", port='" + getPort() + "'" +
            "}";
    }
   
   
}
