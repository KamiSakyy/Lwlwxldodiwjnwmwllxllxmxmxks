package c51;

import android.os.SystemClock;
import android.util.Log;
import androidx.lifecycle.l1;
import b9.f;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v2.t;
import v41.x;
import w21.g;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final l1 h;
    public final t i;
    public int j;
    public long k;

    public d(l1 l1Var, d51.b bVar, t tVar) {
        double d = bVar.d;
        double d2 = bVar.e;
        this.a = d;
        this.b = d2;
        this.c = bVar.f * 1000;
        this.h = l1Var;
        this.i = tVar;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.c);
        int min = this.f.size() == this.e ? Math.min(100, this.j + currentTimeMillis) : Math.max(0, this.j - currentTimeMillis);
        if (this.j != min) {
            this.j = min;
            this.k = System.currentTimeMillis();
        }
        return min;
    }

    public final void b(final v41.b bVar, final g gVar) {
        Log.isLoggable("FirebaseCrashlytics", 3);
        final boolean z = SystemClock.elapsedRealtime() - this.d < 2000;
        this.h.D(new j11.a(bVar.a, j11.d.t, null), new j11.g() { // from class: c51.b
            @Override // j11.g
            public final void b(Exception exc) {
                g gVar2 = gVar;
                if (exc != null) {
                    gVar2.b(exc);
                    return;
                }
                if (z) {
                    boolean z2 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread((Runnable) new f(1, d.this, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = x.a;
                    boolean z3 = false;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long nanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    nanos = nanoTime - System.nanoTime();
                                    z3 = true;
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (z2) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z3) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                    }
                }
                gVar2.c(bVar);
            }
        });
    }


}
