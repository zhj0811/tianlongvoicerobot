package com.cctegitc.ai.function.vo.pagefind;

import com.cctegitc.ai.function.db.pojo.AudioLibrary;
import lombok.Data;

import java.util.List;

@Data
public class AudioLibraryVo implements IPageVo {

    private Integer page;
    private Integer limit;
    private String sort;
    private Long total;
    private Long status;
    private List<AudioLibrary> items;

    @Override
    public void setItems(List<?> items) {
        this.items = (List<AudioLibrary>) items;
    }
}
