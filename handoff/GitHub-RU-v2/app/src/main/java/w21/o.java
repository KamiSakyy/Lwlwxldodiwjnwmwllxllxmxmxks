package w21;

import c21.uShadow;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o {
    public final Object a = new Object();
    public final h4 b = new h4(6);
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    public final void a(Executor executor, c cVar) {
        this.b.j(new l(executor, cVar));
        q();
    }

    public final void b(c cVar) {
        this.b.j(new l(h.a, cVar));
        q();
    }

    public final void c(Executor executor, d dVar) {
        this.b.j(new l(executor, dVar));
        q();
    }

    public final void d(Executor executor, e eVar) {
        this.b.j(new l(executor, eVar));
        q();
    }

    public final o e(Executor executor, a aVar) {
        o oVar = new o();
        this.b.j(new k(executor, aVar, oVar, 0));
        q();
        return oVar;
    }

    public final o f(Executor executor, a aVar) {
        o oVar = new o();
        this.b.j(new k(executor, aVar, oVar, 1));
        q();
        return oVar;
    }

    public final Exception g() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    public final Object h() {
        Object obj;
        synchronized (this.a) {
            try {
                uShadow.i("Task is not yet complete", this.c);
                if (this.d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f;
                if (exc != null) {
                    throw new RuntimeExecutionException(exc);
                }
                obj = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean i() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final o k(Executor executor, f fVar) {
        o oVar = new o();
        this.b.j(new l(executor, fVar, oVar));
        q();
        return oVar;
    }

    public final void l(Exception exc) {
        uShadow.h(exc, "Exception must not be null");
        synchronized (this.a) {
            p();
            this.c = true;
            this.f = exc;
        }
        this.b.m(this);
    }

    public final void m(Object obj) {
        synchronized (this.a) {
            p();
            this.c = true;
            this.e = obj;
        }
        this.b.m(this);
    }

    public final void n() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return;
                }
                this.c = true;
                this.d = true;
                this.b.m(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean o(Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = obj;
                this.b.m(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p() {
        if (this.c) {
            int i = DuplicateTaskCompletionException.r;
            if (!i()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception g = g();
        }
    }

    public final void q() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    this.b.m(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
    public Object z() { return null; }
    public Object a(Object p1, Object p2) { return null; }
}
