package androidx.glance.session;

import java.util.concurrent.CancellationException;
import x.i;

/* loaded from: /home/user/work/p/classes.dex */
public final class TimeoutCancellationException extends CancellationException {

    /* renamed from: r, reason: collision with root package name */
    public String f2817r;

    /* renamed from: s, reason: collision with root package name */
    public int f2818s;

    public TimeoutCancellationException(String str, int i) {
        super(str);
        this.f2817r = str;
        this.f2818s = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f2817r;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimeoutCancellationException(");
        sb2.append(this.f2817r);
        sb2.append(", ");
        return i.j(sb2, this.f2818s, ')');
    }
}
