package androidx.compose.runtime.internal;

import java.util.concurrent.CancellationException;
import r1.i;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    public PlatformOptimizedCancellationException() {
        super(null);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(i.f31079a);
        return this;
    }
}
