package h91;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: /home/user/work/p/classes5.dex */
public interface i0 extends Closeable, Flushable {
    void I0(h hVar, long j);

    m0 b();

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    void close();

    void flush();




}
