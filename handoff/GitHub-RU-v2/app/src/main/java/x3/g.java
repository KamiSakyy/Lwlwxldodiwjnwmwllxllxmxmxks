package x3;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class g implements com.google.common.util.concurrent.c {

    /* renamed from: u, reason: collision with root package name */
    public static final boolean f33734u = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: v, reason: collision with root package name */
    public static final Logger f33735v = Logger.getLogger(g.class.getName());

    /* renamed from: w, reason: collision with root package name */
    public static final t.e f33736w;

    /* renamed from: x, reason: collision with root package name */
    public static final Object f33737x;

    /* renamed from: r, reason: collision with root package name */
    public volatile Object f33738r;

    /* renamed from: s, reason: collision with root package name */
    public volatile c f33739s;

    /* renamed from: t, reason: collision with root package name */
    public volatile f f33740t;

    static {
        t.e eVar;
        try {
            eVar = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "t"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "s"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "r"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f33736w = eVar;
        if (th != null) {
            f33735v.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f33737x = new Object();
    }

    public static void e(g gVar) {
        f fVar;
        c cVar;
        c cVar2;
        c cVar3;
        do {
            fVar = gVar.f33740t;
        } while (!f33736w.i(gVar, fVar, f.f33731c));
        while (true) {
            cVar = null;
            if (fVar == null) {
                break;
            }
            Thread thread = fVar.f33732a;
            if (thread != null) {
                fVar.f33732a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f33733b;
        }
        gVar.d();
        do {
            cVar2 = gVar.f33739s;
        } while (!f33736w.g(gVar, cVar2, c.f33722d));
        while (true) {
            cVar3 = cVar;
            cVar = cVar2;
            if (cVar == null) {
                break;
            }
            cVar2 = cVar.f33725c;
            cVar.f33725c = cVar3;
        }
        while (cVar3 != null) {
            c cVar4 = cVar3.f33725c;
            f(cVar3.f33723a, cVar3.f33724b);
            cVar3 = cVar4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e5) {
            f33735v.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e5);
        }
    }

    public static Object g(Object obj) {

        Object th = null;
        if (obj instanceof a) {
            Throwable th = ((a) obj).f33720b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f33721a);
        }
        if (obj == f33737x) {
            return null;
        }
        return obj;
    }

    public static Object h(Future future) {
        Object obj;
        boolean z10 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f33739s;
        c cVar2 = c.f33722d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f33725c = cVar;
                if (f33736w.g(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f33739s;
                }
            } while (cVar != cVar2);
        }
        f(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(StringBuilder sb2) {
        try {
            Object h10 = h(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(h10 == this ? "this future" : String.valueOf(h10));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e5) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e5.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        }
    }

    public final boolean cancel(boolean z10) {
        Object obj = this.f33738r;
        if (obj == null) {
            if (f33736w.h(this, obj, f33734u ? new a(new CancellationException("Future.cancel() was called."), z10) : z10 ? a.f33717c : a.f33718d)) {
                e(this);
                return true;
            }
        }
        return false;
    }

    public void d() {
    }

    public final Object get(long j10, TimeUnit timeUnit) {
        f fVar = f.f33731c;
        long nanos = timeUnit.toNanos(j10);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f33738r;
        if (obj != null) {
            return g(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar2 = this.f33740t;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    t.e eVar = f33736w;
                    eVar.p(fVar3, fVar2);
                    if (eVar.i(this, fVar2, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                j(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f33738r;
                            if (obj2 != null) {
                                return g(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        j(fVar3);
                    } else {
                        fVar2 = this.f33740t;
                    }
                } while (fVar2 != fVar);
            }
            return g(this.f33738r);
        }
        while (nanos > 0) {
            Object obj3 = this.f33738r;
            if (obj3 != null) {
                return g(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String gVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j10 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String f6 = x.i.f(str, " (plus ");
            long j11 = -nanos;
            long convert = timeUnit.convert(j11, TimeUnit.NANOSECONDS);
            long nanos2 = j11 - timeUnit.toNanos(convert);
            boolean z10 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = f6 + convert + " " + lowerCase;
                if (z10) {
                    str2 = x.i.f(str2, ",");
                }
                f6 = x.i.f(str2, " ");
            }
            if (z10) {
                f6 = f6 + nanos2 + " nanoseconds ";
            }
            str = x.i.f(f6, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(x.i.f(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(f1.e.h(str, " for ", gVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final boolean isCancelled() {
        return this.f33738r instanceof a;
    }

    public final boolean isDone() {
        return this.f33738r != null;
    }

    public final void j(f fVar) {
        fVar.f33732a = null;
        while (true) {
            f fVar2 = this.f33740t;
            if (fVar2 == f.f33731c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f33733b;
                if (fVar2.f33732a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f33733b = fVar4;
                    if (fVar3.f33732a == null) {
                        break;
                    }
                } else if (!f33736w.i(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    public boolean k(Object obj) {
        if (obj == null) {
            obj = f33737x;
        }
        if (!f33736w.h(this, null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public boolean l(Throwable th) {
        th.getClass();
        if (!f33736w.h(this, null, new b(th))) {
            return false;
        }
        e(this);
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f33738r instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            c(sb2);
        } else {
            try {
                str = i();
            } catch (RuntimeException e5) {
                str = "Exception thrown from implementation: " + e5.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                c(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final Object get() {
        Object obj;
        f fVar = f.f33731c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f33738r;
            if (obj2 != null) {
                return g(obj2);
            }
            f fVar2 = this.f33740t;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    t.e eVar = f33736w;
                    eVar.p(fVar3, fVar2);
                    if (eVar.i(this, fVar2, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f33738r;
                            } else {
                                j(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return g(obj);
                    }
                    fVar2 = this.f33740t;
                } while (fVar2 != fVar);
            }
            return g(this.f33738r);
        }
        throw new InterruptedException();
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class f {
        public f() {
        }
    }
}
