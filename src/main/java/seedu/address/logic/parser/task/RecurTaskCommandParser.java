package seedu.address.logic.parser.task;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.task.RecurTaskCommand;
import seedu.address.logic.parser.Parser;
import seedu.address.logic.parser.exceptions.ParseException;

public class RecurTaskCommandParser implements Parser<RecurTaskCommand> {
    /**
     * Parses {@code userInput} into a command and returns it.
     *
     * @param userInput
     * @throws ParseException if {@code userInput} does not conform to the expected format
     */
    @Override
    public RecurTaskCommand parse(String userInput) throws ParseException {
        return new RecurTaskCommand(Index.fromZeroBased(0), 0,2L);
    }
}
