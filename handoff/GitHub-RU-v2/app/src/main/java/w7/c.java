package w7;

import java.io.Closeable;

/* loaded from: /home/user/work/p/classes.dex */
public interface c extends Closeable {
    a f0();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
