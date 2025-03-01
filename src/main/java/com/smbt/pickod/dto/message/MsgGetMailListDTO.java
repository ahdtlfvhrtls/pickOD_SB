package com.smbt.pickod.dto.message;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Setter @Getter @ToString
@NoArgsConstructor
public class MsgGetMailListDTO {
    private Long msgId;
    private Long memberNum;
    private Long msgRecipient;
    private Long msgSender;
    private String memberNickName;
    private String msgContent;
    private LocalDateTime msgSentTime;
    private String msgBox;
    private Long msgRead;
}
