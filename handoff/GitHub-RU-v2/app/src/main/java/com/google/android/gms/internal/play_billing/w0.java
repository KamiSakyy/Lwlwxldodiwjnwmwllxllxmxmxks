package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w0 extends m0 implements h0 {
    public u0 y;
    public ScheduledFuture z;

    public static Object e(Object obj) {
        if (obj instanceof c0) {
            Throwable th = ((c0) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof f0) {
            throw new ExecutionException(((f0) obj).a);
        }
        if (obj == m0.u) {
            return null;
        }
        return obj;
    }

    public static boolean g(Object obj) {
        return !(obj instanceof d0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(u0 u0Var) {
        Object obj;
        Throwable c;
        if (u0Var instanceof h0) {
            Object obj2 = ((w0) u0Var).r;
            if (obj2 instanceof c0) {
                c0 c0Var = (c0) obj2;
                if (c0Var.a) {
                    Throwable th = c0Var.b;
                    obj2 = th != null ? new c0(th, false) : c0.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((u0Var instanceof x0) && (c = ((x0) u0Var).c()) != null) {
            return new f0(c);
        }
        boolean isCancelled = u0Var.isCancelled();
        boolean z = true;
        if ((!m0.w) && isCancelled) {
            c0 c0Var2 = c0.d;
            Objects.requireNonNull(c0Var2);
            return c0Var2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = u0Var.get();
                        break;
                    } catch (Error e) {
                        e = e;
                        return new f0(e);
                    }
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th2) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            } catch (Error | Exception e2) {
                e = e2;
                return new f0(e);
            } catch (CancellationException e3) {
                return !isCancelled ? new f0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(u0Var)), e3)) : new c0(e3, false);
            } catch (ExecutionException e4) {
                return isCancelled ? new c0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(u0Var)), e4), false) : new f0(e4.getCause());
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return isCancelled ? new c0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(u0Var))), false) : obj == null ? m0.u : obj;
    }

    public static void j(w0 w0Var) {
        g0 g0Var;
        g0 g0Var2 = null;
        while (true) {
            w0Var.getClass();
            for (l0 e0 = m0.x.e0(w0Var); e0 != null; e0 = e0.b) {
                Thread thread = e0.a;
                if (thread != null) {
                    e0.a = null;
                    LockSupport.unpark(thread);
                }
            }
            u0 u0Var = w0Var.y;
            if ((w0Var.r instanceof c0) & (u0Var != null)) {
                Object obj = w0Var.r;
                u0Var.cancel((obj instanceof c0) && ((c0) obj).a);
            }
            ScheduledFuture scheduledFuture = w0Var.z;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            w0Var.y = null;
            w0Var.z = null;
            g0 g0Var3 = g0Var2;
            g0 c0 = m0.x.c0(w0Var);
            g0 g0Var4 = g0Var3;
            while (c0 != null) {
                g0 g0Var5 = c0.c;
                c0.c = g0Var4;
                g0Var4 = c0;
                c0 = g0Var5;
            }
            while (g0Var4 != null) {
                Runnable runnable = g0Var4.a;
                g0Var = g0Var4.c;
                Objects.requireNonNull(runnable);
                if (runnable instanceof d0) {
                    d0 d0Var = (d0) runnable;
                    w0Var = d0Var.r;
                    if (w0Var.r == d0Var) {
                        if (m0.x.i0(w0Var, d0Var, h(d0Var.s))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = g0Var4.b;
                    Objects.requireNonNull(executor);
                    k(runnable, executor);
                }
                g0Var4 = g0Var;
            }
            return;
            g0Var2 = g0Var;
        }
    }

    public static void k(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            m0.v.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", a0.s0.k("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.u0
    public final void b(Runnable runnable, Executor executor) {
        g0 g0Var;
        g0 g0Var2 = g0.d;
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (g0Var = this.s) != g0Var2) {
            g0 g0Var3 = new g0(runnable, executor);
            do {
                g0Var3.c = g0Var;
                if (m0.x.h0(this, g0Var, g0Var3)) {
                    return;
                } else {
                    g0Var = this.s;
                }
            } while (g0Var != g0Var2);
        }
        k(runnable, executor);
    }

    @Override // com.google.android.gms.internal.play_billing.x0
    public final Throwable c() {
        if (!(this instanceof h0)) {
            return null;
        }
        Object obj = this.r;
        if (obj instanceof f0) {
            return ((f0) obj).a;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0056, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean cancel(boolean z) {
        c0 c0Var;
        Object obj = this.r;
        if (!(obj instanceof d0) && !(obj == null)) {
            return false;
        }
        if (m0.w) {
            c0Var = new c0(new CancellationException("Future.cancel() was called."), z);
        } else {
            c0Var = z ? c0.c : c0.d;
            Objects.requireNonNull(c0Var);
        }
        w0 w0Var = this;
        boolean z2 = false;
        while (true) {
            if (m0.x.i0(w0Var, obj, c0Var)) {
                j(w0Var);
                if (!(obj instanceof d0)) {
                    break;
                }
                u0 u0Var = ((d0) obj).s;
                if (!(u0Var instanceof h0)) {
                    u0Var.cancel(z);
                    break;
                }
                w0Var = (w0) u0Var;
                obj = w0Var.r;
                if (!(obj == null) && !(obj instanceof d0)) {
                    break;
                }
                z2 = true;
            } else {
                obj = w0Var.r;
                if (g(obj)) {
                    return z2;
                }
            }
        }
    }

    public final String f() {
        u0 u0Var = this.y;
        ScheduledFuture scheduledFuture = this.z;
        if (u0Var == null) {
            return null;
        }
        String z = f1.e.z("inputFuture=[", u0Var.toString(), "]");
        if (scheduledFuture == null) {
            return z;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return z;
        }
        return z + ", remaining delay=[" + delay + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        l0 l0Var = l0.c;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.r;
        if ((obj2 != null) && g(obj2)) {
            return e(obj2);
        }
        l0 l0Var2 = this.t;
        if (l0Var2 != l0Var) {
            l0 l0Var3 = new l0();
            do {
                b91.g gVar = m0.x;
                gVar.f0(l0Var3, l0Var2);
                if (gVar.j0(this, l0Var2, l0Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            d(l0Var3);
                            throw new InterruptedException();
                        }
                        obj = this.r;
                    } while (!((obj != null) & g(obj)));
                    return e(obj);
                }
                l0Var2 = this.t;
            } while (l0Var2 != l0Var);
        }
        Object obj3 = this.r;
        Objects.requireNonNull(obj3);
        return e(obj3);
    }

    public final void i(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == null) {
            sb.append("null");
        } else if (obj == this) {
            sb.append("this future");
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.r instanceof c0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.r;
        return (obj != null) & g(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        String concat;
        boolean z;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.r instanceof c0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            i(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.r;
            if (obj instanceof d0) {
                sb.append(", setFuture=[");
                u0 u0Var = ((d0) obj).s;
                try {
                    if (u0Var == this) {
                        sb.append("this future");
                    } else {
                        sb.append(u0Var);
                    }
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    concat = f();
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (concat != null) {
                    if (!concat.isEmpty()) {
                        z = false;
                        if (z) {
                            concat = null;
                        }
                        if (concat != null) {
                            sb.append(", info=[");
                            sb.append(concat);
                            sb.append("]");
                        }
                    }
                }
                z = true;
                if (z) {
                }
                if (concat != null) {
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                i(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long j2;
        l0 l0Var = l0.c;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.r;
            if ((obj != null) & g(obj)) {
                return e(obj);
            }
            long j3 = 0;
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                l0 l0Var2 = this.t;
                if (l0Var2 != l0Var) {
                    l0 l0Var3 = new l0();
                    while (true) {
                        b91.g gVar = m0.x;
                        gVar.f0(l0Var3, l0Var2);
                        if (gVar.j0(this, l0Var2, l0Var3)) {
                            j2 = j3;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.r;
                                    if ((obj2 != null) & g(obj2)) {
                                        return e(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    d(l0Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            d(l0Var3);
                        } else {
                            long j4 = j3;
                            l0Var2 = this.t;
                            if (l0Var2 == l0Var) {
                                break;
                            }
                            j3 = j4;
                        }
                    }
                }
                Object obj3 = this.r;
                Objects.requireNonNull(obj3);
                return e(obj3);
            }
            j2 = 0;
            while (nanos > j2) {
                Object obj4 = this.r;
                if ((obj4 != null) & g(obj4)) {
                    return e(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String w0Var = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < j2) {
                String concat = str.concat(" (plus ");
                long j5 = -nanos;
                long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
                long nanos2 = j5 - timeUnit.toNanos(convert);
                boolean z = convert == j2 || nanos2 > 1000;
                if (convert > j2) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(f1.e.h(str, " for ", w0Var));
        }
        throw new InterruptedException();
    }
}
