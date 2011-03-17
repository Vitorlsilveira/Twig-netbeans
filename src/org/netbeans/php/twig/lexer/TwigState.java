package org.netbeans.php.twig.lexer;
import java.util.*;

/**
 * Represents a Twig lexer state.
 * 
 * Incldues mode and brackets for re-lexing changed parts of the code.
 *
 * @author Sebastian Hörl
 */
public class TwigState {

    public enum Mode {
        DATA,
        BLOCK,
        VAR,
        COMMENT,
        RAW
    };

    boolean captureRawData = false;
    boolean seekTag = false;
    Mode mode = Mode.DATA;
    Stack<String> brackets = new Stack();

}
