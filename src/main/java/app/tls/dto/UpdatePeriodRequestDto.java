package app.tls.dto;

public class UpdatePeriodRequestDto {
    private Long id;
    private int period;

    public UpdatePeriodRequestDto(Long id, int period) {
        this.id = id;
        this.period = period;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "UpdatePeriodRequestDto{" +
                "id=" + id +
                ", period=" + period +
                '}';
    }
}
