package com.sj.service.device;

import com.sj.domain.device.Device;

/**
 * 硬件管理
 */
public interface IDeviceService {
    /**
     * 根据硬件名称查询对应的硬件信息
     * @param name 硬件名称
     * @return
     */
    Device findDeviceByName(String name);
}
