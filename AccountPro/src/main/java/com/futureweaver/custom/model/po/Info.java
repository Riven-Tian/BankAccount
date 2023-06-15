package com.futureweaver.custom.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 *
 * </p>
 *
 * @author tian
 */
@Data
@TableName("custom_info")
public class Info implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Integer cardId;

    private String type;

    private LocalDateTime endTime;

    private LocalDateTime startTime;

    private String status;


}
