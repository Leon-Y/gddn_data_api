package monitoring.service;

import lombok.Data;

import java.util.Date;

/**
 * @Author: Administrator
 * @Date: 2020/3/3 :16:52
 * @Description:用电用水总量统计
 */
@Data
public class WaterElectricityTotalDto {

    /**
     * 总电量
     */
    private float totalNumber;

    /**
     * 厂商类型
     */
    private Integer dataSourceType;

    /**
     * 设备sn
     */
    private String deviceSn;

}
