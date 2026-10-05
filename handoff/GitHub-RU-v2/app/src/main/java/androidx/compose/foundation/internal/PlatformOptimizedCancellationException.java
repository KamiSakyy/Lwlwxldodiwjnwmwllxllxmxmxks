package androidx.compose.foundation.internal;

import java.util.concurrent.CancellationException;
import k0.c;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    public PlatformOptimizedCancellationException() {
        super(null);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(c.f27578a);
        return this;
    }
}
