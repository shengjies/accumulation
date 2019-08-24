package com.sj.mapper.slave.device;

import com.sj.domain.device.Device;
import org.apache.ibatis.annotations.Param;

public interface IDeviceMapper {
    /**
     * 根据硬件名称查询硬件信息
     * @param deviceName 硬件名称
     * @return
     */
    Device findDeviceByDeviceName(@Param("deviceName")String deviceName);
}
