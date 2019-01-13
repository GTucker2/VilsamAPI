package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceController {

    private static final String nameTemplate = "Device%d";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/device")
    public Device device(@RequestParam(value="name", required=false) String name,
                         @RequestParam(value="type", required=true) DeviceType deviceType,
                         @RequestParam(value="supportedCommands", required=true) byte deviceCommands) {
        long deviceId = counter.incrementAndGet();
        String deviceName = name; 
        if (name == null) deviceName = String.format(nameTemplate, deviceId);
        return new Device(deviceId, deviceName, deviceType, deviceCommands);
    }
}