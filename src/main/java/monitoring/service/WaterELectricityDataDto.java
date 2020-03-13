package monitoring.service;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @Author: Administrator
 * @Date: 2020/3/11 :17:33
 * @Description:
 */
@Data
public class WaterELectricityDataDto {

    /**
     * 起码
     */
    private float startValue;

    /**
     * 止码
     */
    private float endValue;

    /**
     * 起码时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date gmtStart;

    /**
     * 止码时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date gmtEnd;

    /**
     * 差值
     */
    private float diffValue;

    /**
     * 设备编号
     */
    private String deviceSn;

    /**
     * 厂商类型
     */
    private Integer dataSourceType;
}
