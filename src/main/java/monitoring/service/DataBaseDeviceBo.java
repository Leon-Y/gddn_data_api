package monitoring.service;

import lombok.Data;

/**
 * @Author: Administrator
 * @Date: 2020/3/11 :15:48
 * @Description:
 */
@Data
public class DataBaseDeviceBo {
    /**
     * 设备号，数组，逗号相隔
     */
    private String deviceSn;

    /**
     * 开始时间
     */
    private long startTime;

    /**
     * 结束时间
     */
    private long endTime;

    /**
     * 设备开发者code
     */
    private Integer dataSourceType;

    /**
     * 设备数据粒度 时间类型:1-小时；2-天；3-月；4-年
     */
    private Integer timeType;

    /**
     * 设备类型:7-水表；8-电表
     */
    private Integer deviceType;

}
