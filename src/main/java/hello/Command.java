package hello;

public enum Command {
    ON_OFF          (0x1),
    BRIGHTNESS      (0x2),
    COLOR_SPECTRUM  (0x3),
    START_STOP      (0x4),
    TEMPERATURE_SET (0x5);

    private final byte commandByte; 
    Command(int commandByte) {
        this.commandByte = (byte)commandByte;
    }
    public byte getCommandByte() {
        return commandByte;
    }
}