package com.smbt.pickod.dto.admin.report;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@NoArgsConstructor
public class AdmReportSearchSanctionDTO {
    private String inqCondition;
    private String inqKeyword;
}
