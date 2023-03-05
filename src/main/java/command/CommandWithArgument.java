package command;

/**
 * Interface describing the behavior of commands with an argument
 */

public interface CommandWithArgument extends Command{
    void getArgument(String argument);
}