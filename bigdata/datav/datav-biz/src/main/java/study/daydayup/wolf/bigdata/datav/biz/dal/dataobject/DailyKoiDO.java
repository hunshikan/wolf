package study.daydayup.wolf.bigdata.datav.biz.dal.dataobject;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class DailyKoiDO implements Serializable {
    private Long id;

    private Long orgId;

    private LocalDate date;

    private Integer pv;

    private Integer uv;

    private Integer registerCount;

    private Integer basicInfoCount;

    private Integer livenessCount;

    private Integer bankcardCount;

    private Integer aadhaarCount;

    private Integer panCardCount;

    private Integer passportCount;

    private Integer drivingLicenseCount;

    private Integer voterCount;

    private Integer kycCount;

    private Integer creditPromoteCount;

    private Integer authSuccessCount;

    private Boolean deleteFlag;

    private LocalDateTime createdAt;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orgId=").append(orgId);
        sb.append(", date=").append(date);
        sb.append(", pv=").append(pv);
        sb.append(", uv=").append(uv);
        sb.append(", registerCount=").append(registerCount);
        sb.append(", basicInfoCount=").append(basicInfoCount);
        sb.append(", livenessCount=").append(livenessCount);
        sb.append(", bankcardCount=").append(bankcardCount);
        sb.append(", aadhaarCount=").append(aadhaarCount);
        sb.append(", panCardCount=").append(panCardCount);
        sb.append(", passportCount=").append(passportCount);
        sb.append(", drivingLicenseCount=").append(drivingLicenseCount);
        sb.append(", voterCount=").append(voterCount);
        sb.append(", kycCount=").append(kycCount);
        sb.append(", creditPromoteCount=").append(creditPromoteCount);
        sb.append(", authSuccessCount=").append(authSuccessCount);
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", createdAt=").append(createdAt);
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
        DailyKoiDO other = (DailyKoiDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrgId() == null ? other.getOrgId() == null : this.getOrgId().equals(other.getOrgId()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getPv() == null ? other.getPv() == null : this.getPv().equals(other.getPv()))
            && (this.getUv() == null ? other.getUv() == null : this.getUv().equals(other.getUv()))
            && (this.getRegisterCount() == null ? other.getRegisterCount() == null : this.getRegisterCount().equals(other.getRegisterCount()))
            && (this.getBasicInfoCount() == null ? other.getBasicInfoCount() == null : this.getBasicInfoCount().equals(other.getBasicInfoCount()))
            && (this.getLivenessCount() == null ? other.getLivenessCount() == null : this.getLivenessCount().equals(other.getLivenessCount()))
            && (this.getBankcardCount() == null ? other.getBankcardCount() == null : this.getBankcardCount().equals(other.getBankcardCount()))
            && (this.getAadhaarCount() == null ? other.getAadhaarCount() == null : this.getAadhaarCount().equals(other.getAadhaarCount()))
            && (this.getPanCardCount() == null ? other.getPanCardCount() == null : this.getPanCardCount().equals(other.getPanCardCount()))
            && (this.getPassportCount() == null ? other.getPassportCount() == null : this.getPassportCount().equals(other.getPassportCount()))
            && (this.getDrivingLicenseCount() == null ? other.getDrivingLicenseCount() == null : this.getDrivingLicenseCount().equals(other.getDrivingLicenseCount()))
            && (this.getVoterCount() == null ? other.getVoterCount() == null : this.getVoterCount().equals(other.getVoterCount()))
            && (this.getKycCount() == null ? other.getKycCount() == null : this.getKycCount().equals(other.getKycCount()))
            && (this.getCreditPromoteCount() == null ? other.getCreditPromoteCount() == null : this.getCreditPromoteCount().equals(other.getCreditPromoteCount()))
            && (this.getAuthSuccessCount() == null ? other.getAuthSuccessCount() == null : this.getAuthSuccessCount().equals(other.getAuthSuccessCount()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrgId() == null) ? 0 : getOrgId().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getPv() == null) ? 0 : getPv().hashCode());
        result = prime * result + ((getUv() == null) ? 0 : getUv().hashCode());
        result = prime * result + ((getRegisterCount() == null) ? 0 : getRegisterCount().hashCode());
        result = prime * result + ((getBasicInfoCount() == null) ? 0 : getBasicInfoCount().hashCode());
        result = prime * result + ((getLivenessCount() == null) ? 0 : getLivenessCount().hashCode());
        result = prime * result + ((getBankcardCount() == null) ? 0 : getBankcardCount().hashCode());
        result = prime * result + ((getAadhaarCount() == null) ? 0 : getAadhaarCount().hashCode());
        result = prime * result + ((getPanCardCount() == null) ? 0 : getPanCardCount().hashCode());
        result = prime * result + ((getPassportCount() == null) ? 0 : getPassportCount().hashCode());
        result = prime * result + ((getDrivingLicenseCount() == null) ? 0 : getDrivingLicenseCount().hashCode());
        result = prime * result + ((getVoterCount() == null) ? 0 : getVoterCount().hashCode());
        result = prime * result + ((getKycCount() == null) ? 0 : getKycCount().hashCode());
        result = prime * result + ((getCreditPromoteCount() == null) ? 0 : getCreditPromoteCount().hashCode());
        result = prime * result + ((getAuthSuccessCount() == null) ? 0 : getAuthSuccessCount().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return result;
    }
}