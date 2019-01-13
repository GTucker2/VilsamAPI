package hello;

public enum Command {
    ON_OFF          (0b00000001),
    BRIGHTNESS      (0b00000010),
    COLOR_SPECTRUM  (0b00000100),
    START_STOP      (0b00001000),
    TEMPERATURE_SET (0b00010000);

    private final byte commandByte; 
    Command(byte commandByte) {
        this.commandByte = commandByte;
    }
    public getByte() {
        return commandByte;
    }
}

public enum DeviceType {
    MOBILE,
    DESKTOP,
    LAPTOP,
    VIRTUAL_ASSISTANT;
}

public class Device {
    private final long id;
    private final String name; 
    private final DeviceType type;
    private final byte commandByte;

    public Device(long id, String name, DeviceType type, byte commandByte) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.commandByte = commandByte;
    }

    public Boolean supportsCommand(Command command) {
        byte commandByte = Command.getCommandByte();
        if (commandByte & this.commandByte == commandByte) return true; 
        else return false; 
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public DeviceType getType() {
        return type;
    }

    public byte getCommandByte() {
        return commandByte; 
    }
}