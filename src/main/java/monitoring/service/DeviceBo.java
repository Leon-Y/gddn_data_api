package monitoring.service;

import lombok.Data;

import java.util.Date;

/**
 * @Author: Administrator
 * @Date: 2020/3/5 :21:09
 * @Description:设备描述bo
 */
@Data
public class DeviceBo {
    /**
     * 设备号
     */
    private String deviceSn;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 设备开发者code
     */
    private Integer code;

}
