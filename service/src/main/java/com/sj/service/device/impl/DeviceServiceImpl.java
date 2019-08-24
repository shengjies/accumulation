package com.sj.service.device.impl;

import com.sj.domain.device.Device;
import com.sj.mapper.slave.device.IDeviceMapper;
import com.sj.service.device.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 硬件管理
 */
@Service
public class DeviceServiceImpl implements IDeviceService {

    @Autowired
    private IDeviceMapper deviceMapper;

    /**
     * 根据硬件名称查询对应的硬件信息
     * @param name 硬件名称
     * @return
     */
    @Override
    public Device findDeviceByName(String name) {
        return deviceMapper.findDeviceByDeviceName(name);
    }
}
