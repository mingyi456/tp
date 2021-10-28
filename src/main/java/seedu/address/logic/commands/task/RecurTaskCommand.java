package seedu.address.logic.commands.task;

import seedu.address.commons.core.Messages;
import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.CommandResult;
import seedu.address.logic.commands.TaskCommand;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.task.Task;

import java.util.List;

import static java.util.Objects.requireNonNull;

public class RecurTaskCommand extends TaskCommand {

    public static final String COMMAND_WORD = "recur";
    public static final String FULL_COMMAND_WORD = TaskCommand.COMMAND_WORD + " " + COMMAND_WORD;
    public static final String MESSAGE_SUCCESS = "Recurred task: %1$s";
    public static final String MESSAGE_USAGE = FULL_COMMAND_WORD
            + ": Deletes the task identified by the index number used in the displayed task list.\n"
            + "Parameters: INDEX (must be a positive integer)\n"
            + "Example: " + FULL_COMMAND_WORD + " 1";

    private final Index targetIndex;
    private final long daysToAdd;
    private final int factor;

    public RecurTaskCommand(Index targetIndex, int factor, long daysToAdd) {
        this.targetIndex = targetIndex;
        this.daysToAdd = daysToAdd;
        this.factor = factor;
    }

    /**
     * Executes the command and returns the result message.
     *
     * @param model {@code Model} which the command should operate on.
     * @return feedback message of the operation result for display
     * @throws CommandException If an error occurs during command execution.
     */
    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        List<Task> taskList = model.getFilteredTaskList();

        if (targetIndex.getZeroBased() >= taskList.size()) {
            throw new CommandException(Messages.MESSAGE_INVALID_TASK_DISPLAYED_INDEX);
        }
        super.canExecute();

        Task taskToRecur = taskList.get(targetIndex.getZeroBased());



        throw new CommandException("Task not implemented yet, " + Integer.toString(factor) + " " + Long.toString(daysToAdd));
    }

    @Override
    public CommandResult undo(Model model) {

        return new CommandResult("Undone");
    }
}
