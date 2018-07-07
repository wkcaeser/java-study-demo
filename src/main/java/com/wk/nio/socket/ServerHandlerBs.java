package com.wk.nio.socket;

import java.io.IOException;
import java.nio.channels.SelectionKey;

/**
 * description:
 *
 * @author wkGui
 */
interface ServerHandlerBs {
    void handleAccept(SelectionKey selectionKey) throws IOException;

    String handleRead(SelectionKey selectionKey) throws IOException;
}
