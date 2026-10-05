package rb;

import a71.h;
import com.github.rudroid.common.e;
import com.github.rudroid.common.exceptions.ExpandedStackTraceException;
import com.github.rudroid.common.exceptions.GithubException;
import j71.c;
import java.lang.Thread;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import sy.u;
import v71.b0;
import v71.w;
import v71.x;
import x61.m;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends a71.a implements x {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f31347s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f31348t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f31349u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ StackTraceElement[] f31350v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(c cVar, e eVar, String str, StackTraceElement[] stackTraceElementArr) {
        super(r0);
        w wVar = w.r;
        this.f31347s = cVar;
        this.f31348t = eVar;
        this.f31349u = str;
        this.f31350v = stackTraceElementArr;
    }

    public final void i0(h hVar, Throwable th) {
        boolean z10;
        if (((Boolean) this.f31347s.k(th)).booleanValue()) {
            return;
        }
        List h10 = u.h(th);
        if (!h10.isEmpty()) {
            Iterator it = h10.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof CancellationException) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        boolean z11 = b0.r(hVar).isCancelled() || !b0.r(hVar).f();
        boolean z12 = th instanceof GithubException;
        String str = this.f31349u;
        if (z12 && (z11 || z10)) {
            e.a aVar = e.Companion;
            this.f31348t.b(str, th, true);
            return;
        }
        ExpandedStackTraceException expandedStackTraceException = new ExpandedStackTraceException("expanded stack trace in ".concat(str));
        expandedStackTraceException.setStackTrace(this.f31350v);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Throwable th2 = th;
        while (th2.getCause() != null && !m.N(linkedHashSet, th2.getCause())) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                th2 = cause;
            }
            linkedHashSet.add(th2);
        }
        if (th2.getCause() == null) {
            try {
                th2.initCause(expandedStackTraceException);
            } catch (Throwable unused) {
            }
        }
        Thread currentThread = Thread.currentThread();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
        if (uncaughtExceptionHandler == null) {
            uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        }
        uncaughtExceptionHandler.uncaughtException(currentThread, th);
    }
}
