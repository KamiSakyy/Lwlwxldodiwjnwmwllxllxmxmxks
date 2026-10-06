package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class AbortFlowException extends CancellationException {
    public transient Object r;

    public AbortFlowException(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.r = obj;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
