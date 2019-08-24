package com.sj.web.controller.device;

import com.sj.domain.device.Device;
import com.sj.service.device.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceController {

    @Autowired
    private IDeviceService deviceService;

    @RequestMapping("/device")
    public Device findDeviceByName(){
        return deviceService.findDeviceByName("看板一号");
    }
}
