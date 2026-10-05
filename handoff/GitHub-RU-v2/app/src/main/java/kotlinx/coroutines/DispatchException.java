package kotlinx.coroutines;

import a71.h;
import v71.v;

/* loaded from: /home/user/work/p/classes5.dex */
public final class DispatchException extends Exception {
    public final Throwable r;

    public DispatchException(Throwable th, v vVar, h hVar) {
        super("Coroutine dispatcher " + vVar + " threw an exception, context = " + hVar, th);
        this.r = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.r;
    }
}
