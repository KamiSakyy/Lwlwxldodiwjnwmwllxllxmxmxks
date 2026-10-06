package kotlinx.coroutines.internal;

import a71.h;

/* loaded from: /home/user/work/p/classes5.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {
    public final transient h r;

    public DiagnosticCoroutineContextException(h hVar) {
        this.r = hVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.r);
    }
}
