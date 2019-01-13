package hello;

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
        byte commandByte = command.getCommandByte();
        if ((commandByte & this.commandByte) == commandByte) return true; 
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