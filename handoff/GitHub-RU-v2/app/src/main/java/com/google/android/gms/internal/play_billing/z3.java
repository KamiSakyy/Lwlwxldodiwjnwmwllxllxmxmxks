package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /home/user/work/p/classes4.dex */
public class z3 implements u0 {
    public static final boolean u = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger v = Logger.getLogger(z3.class.getName());
    public static final com.google.android.gms.internal.measurement.b4 w;
    public static final Object x;
    public volatile Object r;
    public volatile g2 s;
    public volatile y3 t;

    static {
        com.google.android.gms.internal.measurement.b4 x3Var;
        try {
            x3Var = new a3(AtomicReferenceFieldUpdater.newUpdater(y3.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(y3.class, y3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(z3.class, y3.class, "t"), AtomicReferenceFieldUpdater.newUpdater(z3.class, g2.class, "s"), AtomicReferenceFieldUpdater.newUpdater(z3.class, Object.class, "r"));
            th = null;
        } catch (Throwable th) {
            th = th;
            x3Var = new x3();
        }
        Throwable th2 = th;
        w = x3Var;
        if (th2 != null) {
            v.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", th2);
        }
        x = new Object();
    }

    public static void d(z3 z3Var) {
        y3 y3Var;
        com.google.android.gms.internal.measurement.b4 b4Var;
        g2 g2Var;
        g2 g2Var2;
        g2 g2Var3;
        do {
            y3Var = z3Var.t;
            b4Var = w;
        } while (!b4Var.B0(z3Var, y3Var, y3.c));
        while (true) {
            g2Var = null;
            if (y3Var == null) {
                break;
            }
            Thread thread = y3Var.a;
            if (thread != null) {
                y3Var.a = null;
                LockSupport.unpark(thread);
            }
            y3Var = y3Var.b;
        }
        do {
            g2Var2 = z3Var.s;
        } while (!b4Var.z0(z3Var, g2Var2, g2.d));
        while (true) {
            g2Var3 = g2Var;
            g2Var = g2Var2;
            if (g2Var == null) {
                break;
            }
            g2Var2 = g2Var.c;
            g2Var.c = g2Var3;
        }
        while (g2Var3 != null) {
            Runnable runnable = g2Var3.a;
            g2 g2Var4 = g2Var3.c;
            f(runnable, g2Var3.b);
            g2Var3 = g2Var4;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            v.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", a0.s0.k("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    public static final Object h(Object obj) {

        Object th = null;
        if (obj instanceof c1) {
            Throwable th = ((c1) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof y1) {
            throw new ExecutionException(((y1) obj).a);
        }
        if (obj == x) {
            return null;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.u0
    public final void b(Runnable runnable, Executor executor) {
        executor.getClass();
        g2 g2Var = this.s;
        g2 g2Var2 = g2.d;
        if (g2Var != g2Var2) {
            g2 g2Var3 = new g2(runnable, executor);
            do {
                g2Var3.c = g2Var;
                if (w.z0(this, g2Var, g2Var3)) {
                    return;
                } else {
                    g2Var = this.s;
                }
            } while (g2Var != g2Var2);
        }
        f(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String c() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.r;
        if (obj != null) {
            return false;
        }
        if (!w.A0(this, obj, u ? new c1(new CancellationException("Future.cancel() was called.")) : z ? c1.b : c1.c)) {
            return false;
        }
        d(this);
        return true;
    }

    public final void e(StringBuilder sb) {
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
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    public final void g(y3 y3Var) {
        y3Var.a = null;
        while (true) {
            y3 y3Var2 = this.t;
            if (y3Var2 != y3.c) {
                y3 y3Var3 = null;
                while (y3Var2 != null) {
                    y3 y3Var4 = y3Var2.b;
                    if (y3Var2.a != null) {
                        y3Var3 = y3Var2;
                    } else if (y3Var3 != null) {
                        y3Var3.b = y3Var4;
                        if (y3Var3.a == null) {
                            break;
                        }
                    } else if (!w.B0(this, y3Var2, y3Var4)) {
                        break;
                    }
                    y3Var2 = y3Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.r;
        if (obj2 != null) {
            return h(obj2);
        }
        y3 y3Var = this.t;
        y3 y3Var2 = y3.c;
        if (y3Var != y3Var2) {
            y3 y3Var3 = new y3();
            do {
                com.google.android.gms.internal.measurement.b4 b4Var = w;
                b4Var.w0(y3Var3, y3Var);
                if (b4Var.B0(this, y3Var, y3Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            g(y3Var3);
                            throw new InterruptedException();
                        }
                        obj = this.r;
                    } while (obj == null);
                    return h(obj);
                }
                y3Var = this.t;
            } while (y3Var != y3Var2);
        }
        return h(this.r);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.r instanceof c1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.r != null;
    }

    public final String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.r instanceof c1) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            e(sb);
        } else {
            try {
                concat = c();
            } catch (RuntimeException e) {
                concat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (concat != null && !concat.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(concat);
                sb.append("]");
            } else if (isDone()) {
                e(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.r;
            if (obj != null) {
                return h(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                y3 y3Var = this.t;
                y3 y3Var2 = y3.c;
                if (y3Var != y3Var2) {
                    y3 y3Var3 = new y3();
                    do {
                        com.google.android.gms.internal.measurement.b4 b4Var = w;
                        b4Var.w0(y3Var3, y3Var);
                        if (b4Var.B0(this, y3Var, y3Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.r;
                                    if (obj2 != null) {
                                        return h(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    g(y3Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            g(y3Var3);
                        } else {
                            y3Var = this.t;
                        }
                    } while (y3Var != y3Var2);
                }
                return h(this.r);
            }
            while (nanos > 0) {
                Object obj3 = this.r;
                if (obj3 != null) {
                    return h(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String z3Var = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j2 = -nanos;
                long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(convert);
                boolean z = true;
                if (convert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (convert > 0) {
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
            throw new TimeoutException(f1.e.h(str, " for ", z3Var));
        }
        throw new InterruptedException();
    }
}
