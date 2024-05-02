package io.rcw.astromod.indi.client;

import java.nio.ByteBuffer;
import java.util.concurrent.Future;

public interface INDIClient {
    Future<Void> connect(String uri);

    Future<Void> write(ByteBuffer buffer);

    Future<ByteBuffer> read();
}
