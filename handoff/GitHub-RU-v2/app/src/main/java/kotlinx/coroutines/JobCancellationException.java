package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import k71.k;
import v71.j1;
import v71.m1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class JobCancellationException extends CancellationException {
    public final transient j1 r;

    public JobCancellationException(String str, Throwable th, j1 j1Var) {
        super(str);
        this.r = j1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) obj;
        if (!k.b(jobCancellationException.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = jobCancellationException.r;
        if (obj2 == null) {
            obj2 = m1.s;
        }
        Object obj3 = this.r;
        if (obj3 == null) {
            obj3 = m1.s;
        }
        return k.b(obj2, obj3) && k.b(jobCancellationException.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        k.d(message);
        int hashCode = message.hashCode() * 31;
        Object obj = this.r;
        if (obj == null) {
            obj = m1.s;
        }
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return hashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.r;
        if (obj == null) {
            obj = m1.s;
        }
        sb.append(obj);
        return sb.toString();
    }
}
