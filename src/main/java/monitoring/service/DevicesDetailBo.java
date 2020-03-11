package monitoring.service;

import lombok.Data;

import java.util.List;

/**
 * @Author: Administrator
 * @Date: 2020/3/6 :10:13
 * @Description:设备信息列表
 */
@Data
public class DevicesDetailBo {

    /**
     * 设备信息列表
     */
    private List<DeviceBo> deviceBos;

    /**
     * 设备数据粒度
     */
    private Integer granularity;

    /**
     * 设备类型
     */
    private Integer type;
}
