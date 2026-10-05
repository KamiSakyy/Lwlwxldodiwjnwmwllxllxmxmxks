package androidx.compose.ui.internal;

import java.util.concurrent.CancellationException;
import t2.b;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    public PlatformOptimizedCancellationException() {
        super(null);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(b.f32053a);
        return this;
    }
}
