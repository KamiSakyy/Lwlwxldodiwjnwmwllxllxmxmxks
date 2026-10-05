package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j3 implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ Parcelable s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ j3(p3 p3Var, v4 v4Var, boolean z, d21.a aVar, int i) {
        this.r = i;
        this.s = v4Var;
        this.t = z;
        this.v = aVar;
        this.u = p3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        int i;
        switch (this.r) {
            case 0:
                p3 p3Var = (p3) this.u;
                f0 f0Var = p3Var.v;
                if (f0Var == null) {
                    s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var).s).w;
                    o1.m(s0Var);
                    s0Var.x.a("Discarding data. Failed to set user property");
                    return;
                } else {
                    p3Var.R(f0Var, this.t ? null : (q4) this.v, (v4) this.s);
                    p3Var.M();
                    return;
                }
            case 1:
                p3 p3Var2 = (p3) this.u;
                f0 f0Var2 = p3Var2.v;
                if (f0Var2 == null) {
                    s0 s0Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var2).s).w;
                    o1.m(s0Var2);
                    s0Var2.x.a("Discarding data. Failed to send event to service");
                    return;
                } else {
                    p3Var2.R(f0Var2, this.t ? null : (w) this.v, (v4) this.s);
                    p3Var2.M();
                    return;
                }
            case 2:
                p3 p3Var3 = (p3) this.u;
                f0 f0Var3 = p3Var3.v;
                if (f0Var3 == null) {
                    s0 s0Var3 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) p3Var3).s).w;
                    o1.m(s0Var3);
                    s0Var3.x.a("Discarding data. Failed to send conditional user property to service");
                    return;
                } else {
                    p3Var3.R(f0Var3, this.t ? null : (f) this.v, (v4) this.s);
                    p3Var3.M();
                    return;
                }
            default:
                Intent intent = (Intent) this.s;
                Context context = (Context) this.v;
                boolean z = this.t;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.u;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 != null) {
                        i = FirebaseInstanceIdReceiver.a(intent2);
                    } else {
                        int i2 = 500;
                        if (intent.getExtras() != null) {
                            Executor executor2 = null;
                            y11.a aVar = new y11.a(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.b;
                                    if (softReference != null) {
                                        executor2 = (Executor) softReference.get();
                                    }
                                    if (executor2 == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new h21.a("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executor2 = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.b = new SoftReference(executor2);
                                    }
                                    executor = executor2;
                                } finally {
                                }
                            }
                            executor.execute(new c51.c(14, context, aVar, countDownLatch, false));
                            try {
                                i2 = ((Integer) t.q.c(new w51.j(context).b(intent))).intValue();
                            } catch (InterruptedException | ExecutionException unused) {
                            }
                            try {
                                countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
                            } catch (InterruptedException e) {
                                "Message ack failed: ".concat(e.toString());
                            }
                        }
                        i = i2;
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(i);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th;
                }
        }
    }

    public /* synthetic */ j3(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.r = 3;
        this.s = intent;
        this.v = context;
        this.t = z;
        this.u = pendingResult;
    }

    public j3(p3 p3Var, v4 v4Var, boolean z, f fVar) {
        this.r = 2;
        this.s = v4Var;
        this.t = z;
        this.v = fVar;
        Objects.requireNonNull(p3Var);
        this.u = p3Var;
    }
}
