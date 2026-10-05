package okhttp3.internal.http2;

import java.io.IOException;
import x81.a;

/* loaded from: /home/user/work/p/classes5.dex */
public final class StreamResetException extends IOException {
    public final a r;

    public StreamResetException(a aVar) {
        super("stream was reset: " + aVar);
        this.r = aVar;
    }
}
