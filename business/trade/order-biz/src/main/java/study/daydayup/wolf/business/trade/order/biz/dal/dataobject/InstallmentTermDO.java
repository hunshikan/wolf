package study.daydayup.wolf.business.trade.order.biz.dal.dataobject;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class InstallmentTermDO implements Serializable {
    private Long id;

    private String tradeNo;

    private String relatedTradeNo;

    private Long buyerId;

    private Long sellerId;

    private Integer installmentNo;

    private Integer installmentType;

    private Integer state;

    private LocalDate effectAt;

    private LocalDate dueAt;

    private Integer currency;

    private BigDecimal amount;

    private BigDecimal paidAmount;

    private BigDecimal lossAmount;

    private BigDecimal loanAmount;

    private BigDecimal handlingFee;

    private BigDecimal interest;

    private BigDecimal penalty;

    private Integer period;

    private BigDecimal percentage;

    private BigDecimal feePercentage;

    private Integer version;

    private Boolean deleteFlag;

    private Long lastEditor;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", relatedTradeNo=").append(relatedTradeNo);
        sb.append(", buyerId=").append(buyerId);
        sb.append(", sellerId=").append(sellerId);
        sb.append(", installmentNo=").append(installmentNo);
        sb.append(", installmentType=").append(installmentType);
        sb.append(", state=").append(state);
        sb.append(", effectAt=").append(effectAt);
        sb.append(", dueAt=").append(dueAt);
        sb.append(", currency=").append(currency);
        sb.append(", amount=").append(amount);
        sb.append(", paidAmount=").append(paidAmount);
        sb.append(", lossAmount=").append(lossAmount);
        sb.append(", loanAmount=").append(loanAmount);
        sb.append(", handlingFee=").append(handlingFee);
        sb.append(", interest=").append(interest);
        sb.append(", penalty=").append(penalty);
        sb.append(", period=").append(period);
        sb.append(", percentage=").append(percentage);
        sb.append(", feePercentage=").append(feePercentage);
        sb.append(", version=").append(version);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", lastEditor=").append(lastEditor);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        InstallmentTermDO other = (InstallmentTermDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTradeNo() == null ? other.getTradeNo() == null : this.getTradeNo().equals(other.getTradeNo()))
            && (this.getRelatedTradeNo() == null ? other.getRelatedTradeNo() == null : this.getRelatedTradeNo().equals(other.getRelatedTradeNo()))
            && (this.getBuyerId() == null ? other.getBuyerId() == null : this.getBuyerId().equals(other.getBuyerId()))
            && (this.getSellerId() == null ? other.getSellerId() == null : this.getSellerId().equals(other.getSellerId()))
            && (this.getInstallmentNo() == null ? other.getInstallmentNo() == null : this.getInstallmentNo().equals(other.getInstallmentNo()))
            && (this.getInstallmentType() == null ? other.getInstallmentType() == null : this.getInstallmentType().equals(other.getInstallmentType()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getEffectAt() == null ? other.getEffectAt() == null : this.getEffectAt().equals(other.getEffectAt()))
            && (this.getDueAt() == null ? other.getDueAt() == null : this.getDueAt().equals(other.getDueAt()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getPaidAmount() == null ? other.getPaidAmount() == null : this.getPaidAmount().equals(other.getPaidAmount()))
            && (this.getLossAmount() == null ? other.getLossAmount() == null : this.getLossAmount().equals(other.getLossAmount()))
            && (this.getLoanAmount() == null ? other.getLoanAmount() == null : this.getLoanAmount().equals(other.getLoanAmount()))
            && (this.getHandlingFee() == null ? other.getHandlingFee() == null : this.getHandlingFee().equals(other.getHandlingFee()))
            && (this.getInterest() == null ? other.getInterest() == null : this.getInterest().equals(other.getInterest()))
            && (this.getPenalty() == null ? other.getPenalty() == null : this.getPenalty().equals(other.getPenalty()))
            && (this.getPeriod() == null ? other.getPeriod() == null : this.getPeriod().equals(other.getPeriod()))
            && (this.getPercentage() == null ? other.getPercentage() == null : this.getPercentage().equals(other.getPercentage()))
            && (this.getFeePercentage() == null ? other.getFeePercentage() == null : this.getFeePercentage().equals(other.getFeePercentage()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getLastEditor() == null ? other.getLastEditor() == null : this.getLastEditor().equals(other.getLastEditor()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTradeNo() == null) ? 0 : getTradeNo().hashCode());
        result = prime * result + ((getRelatedTradeNo() == null) ? 0 : getRelatedTradeNo().hashCode());
        result = prime * result + ((getBuyerId() == null) ? 0 : getBuyerId().hashCode());
        result = prime * result + ((getSellerId() == null) ? 0 : getSellerId().hashCode());
        result = prime * result + ((getInstallmentNo() == null) ? 0 : getInstallmentNo().hashCode());
        result = prime * result + ((getInstallmentType() == null) ? 0 : getInstallmentType().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getEffectAt() == null) ? 0 : getEffectAt().hashCode());
        result = prime * result + ((getDueAt() == null) ? 0 : getDueAt().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getPaidAmount() == null) ? 0 : getPaidAmount().hashCode());
        result = prime * result + ((getLossAmount() == null) ? 0 : getLossAmount().hashCode());
        result = prime * result + ((getLoanAmount() == null) ? 0 : getLoanAmount().hashCode());
        result = prime * result + ((getHandlingFee() == null) ? 0 : getHandlingFee().hashCode());
        result = prime * result + ((getInterest() == null) ? 0 : getInterest().hashCode());
        result = prime * result + ((getPenalty() == null) ? 0 : getPenalty().hashCode());
        result = prime * result + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        result = prime * result + ((getPercentage() == null) ? 0 : getPercentage().hashCode());
        result = prime * result + ((getFeePercentage() == null) ? 0 : getFeePercentage().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getLastEditor() == null) ? 0 : getLastEditor().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return result;
    }
}