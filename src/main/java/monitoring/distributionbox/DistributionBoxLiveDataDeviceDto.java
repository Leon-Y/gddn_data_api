package monitoring.distributionbox;

import lombok.Data;

/**
 * @Author: Administrator
 * @Date: 2020/3/10 :15:51
 * @Description:
 */
@Data
public class DistributionBoxLiveDataDeviceDto {

    /**
     * 数据源类型，iot厂商类型
     */
    private Integer dataSourceType;

    /**
     * 设备序列号，多台设备请用”,”分隔
     */
    private String deviceSn;
}
