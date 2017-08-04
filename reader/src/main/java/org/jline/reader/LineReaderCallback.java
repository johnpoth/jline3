/*
 * Copyright (c) 2002-2017, the original author or authors.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package org.jline.reader;

public interface LineReaderCallback {
    
    String onDisplayLine(String line);
    
    String onAddLineToHistory(String line);

    String onHighlightLine(String line);
}