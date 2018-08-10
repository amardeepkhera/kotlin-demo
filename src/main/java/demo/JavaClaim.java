package demo;

import java.math.BigDecimal;
import java.util.Objects;

public class JavaClaim {

    private String id;
    private String type;
    private BigDecimal amount;
    private String status;

    public JavaClaim() {
    }

    public JavaClaim(String id, String type, BigDecimal amount, String status) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaClaim javaClaim = (JavaClaim) o;
        return Objects.equals(getId(), javaClaim.getId());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "JavaClaim{" +
            "id='" + id + '\'' +
            ", type='" + type + '\'' +
            ", amount=" + amount +
            ", status='" + status + '\'' +
            '}';
    }
}
