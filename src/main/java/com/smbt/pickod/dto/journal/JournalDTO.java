package com.smbt.pickod.dto.journal;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter @ToString
@NoArgsConstructor
public class JournalDTO {
    private Long jnlNum;
    private String jnlTitle;
    private Long memberNum;
    private Integer jnlViews;
    private String jnlMemo;
    private LocalDateTime jnlCreateDate;
    private LocalDateTime jnlUpdateDate;
    private String jnlPeriod;
    private String jnlTag;
    private String jnlTheme;
    private String jnlArea;
    private Integer pickCount;
    private List<JnlMemberDTO> jnlMemberList;
    private JournalProfileDTO authorProfile;
    private List<JnlDayDTO> jnlDayList;
    private List<JnlImgsDTO> jnlImgsList;
    private boolean hasPermission;
}