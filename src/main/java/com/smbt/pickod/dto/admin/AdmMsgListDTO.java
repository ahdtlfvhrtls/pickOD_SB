package com.smbt.pickod.dto.admin;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter @Setter
@ToString @NoArgsConstructor
public class AdmMsgListDTO {
    private Long msgId;
    private Long memberNum;
    private Long msgSender;
    private String memberNickName;
    private String msgContent;
    private LocalDateTime msgSentTime;
    private String msgBox;
    private Long msgRead;
}
