package com.github.rudroid.uitoolkit.swipetodismiss;

import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes3.dex */
final class AnchoredDragFinishedSignal extends CancellationException {
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
