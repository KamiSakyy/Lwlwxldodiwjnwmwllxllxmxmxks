package androidx.compose.material3.internal;

import h1.j;
import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    public PlatformOptimizedCancellationException() {
        super(null);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(j.f25346a);
        return this;
    }
}
