package androidx.compose.animation.core.internal;

import b0.a;
import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    public PlatformOptimizedCancellationException() {
        super(null);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(a.f3244a);
        return this;
    }
}
