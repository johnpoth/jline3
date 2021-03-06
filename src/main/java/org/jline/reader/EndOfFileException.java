/*
 * Copyright (c) 2002-2016, the original author or authors.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package org.jline.reader;

import org.jline.terminal.Terminal;

/**
 * This exception is thrown by {@link LineReader#readLine} when
 * user the user types ctrl-D).
 */
public class EndOfFileException extends RuntimeException {

    private static final long serialVersionUID = 528485360925144689L;

}
