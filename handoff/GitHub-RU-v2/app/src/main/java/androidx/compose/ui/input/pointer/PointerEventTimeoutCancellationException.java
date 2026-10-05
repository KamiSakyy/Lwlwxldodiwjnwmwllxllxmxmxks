package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;
import q2.t;

/* loaded from: /home/user/work/p/classes.dex */
public final class PointerEventTimeoutCancellationException extends CancellationException {
    public PointerEventTimeoutCancellationException(long j10) {
        super("Timed out waiting for " + j10 + " ms");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(t.f30889d);
        return this;
    }
}
