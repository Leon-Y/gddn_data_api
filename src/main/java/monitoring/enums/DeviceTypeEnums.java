package monitoring.enums;

/**
 * @Author: Administrator
 * @Date: 2020/3/6 :10:16
 * @Description:iot仓库设备类型
 */
public enum DeviceTypeEnums {
    WATER_DEVICE(7, "水表设备"),
    ELECTRICITY_DEVICE(8, "电表设备");

    private Integer code;
    private String description;

    DeviceTypeEnums(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    /**
     * 获取设备类型
     * @param type 设备的类型code
     * @return
     */
    public static DeviceTypeEnums getType(Integer type) {
        for (DeviceTypeEnums typeEnum : DeviceTypeEnums.values()) {
            if (typeEnum.equals(type)) {
                return typeEnum;
            }
        }
        return null;
    }
}
