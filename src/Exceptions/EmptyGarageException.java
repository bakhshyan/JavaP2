package Exceptions;

import dataimport.ExcelParser;

public class EmptyGarageException extends Exception {
    public EmptyGarageException(String errorMessage) {
        super(errorMessage);

    }
}
