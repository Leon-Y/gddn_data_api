package monitoring.electricity;

import lombok.Data;

import java.util.Date;

/**
 * @Author: Administrator
 * @Date: 2020/3/3 :16:54
 * @Description:
 */
@Data
public class EletricityLiveDataDto {

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
    private Date startTime;

    /**
     * 止码时间
     */
    private Date endTime;

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
