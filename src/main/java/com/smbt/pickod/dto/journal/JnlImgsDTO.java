package com.smbt.pickod.dto.journal;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter @Setter @ToString
@NoArgsConstructor
public class JnlImgsDTO {
    private Long jnlImgsId;
    private String jnlImgsGuid;
    private String fileName;
    private String uploadPath;
    private Long jnlNum;
    private Long jnlDay;
    private Long placeId;
    private List<JournalDTO> journalList;
    private List<JnlDayDTO> jnlDayList;
    //place 리스트 받아야함
}
