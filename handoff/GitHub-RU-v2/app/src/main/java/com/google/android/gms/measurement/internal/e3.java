package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e3 implements Runnable {
    public final /* synthetic */ int r = 0;
    public long s;
    public Object t;
    public Object u;

    public e3(f3 f3Var, b3 b3Var, long j) {
        this.t = b3Var;
        this.s = j;
        Objects.requireNonNull(f3Var);
        this.u = f3Var;
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.u).b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() {
        try {
            if (((FirebaseMessaging) this.u).a() == null) {
                return false;
            }
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if ("SERVICE_NOT_AVAILABLE".equals(message) || "INTERNAL_SERVER_ERROR".equals(message) || "InternalServerError".equals(message)) {
                e.getMessage();
                return false;
            }
            if (e.getMessage() == null) {
                return false;
            }
            throw e;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                f3 f3Var = (f3) this.u;
                f3Var.D((b3) this.t, false, this.s);
                f3Var.w = null;
                p3 p = ((o1) ((androidx.compose.foundation.lazy.layout.s0) f3Var).s).p();
                p.z();
                p.A();
                p.N(new com.google.common.util.concurrent.b(p, (b3) null));
                return;
            default:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.t;
                w51.r C = w51.r.C();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.u;
                if (C.G(firebaseMessaging.b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = true;
                        }
                        if (!firebaseMessaging.h.d()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.i = false;
                            }
                            if (!w51.r.C().G(firebaseMessaging.b)) {
                                return;
                            }
                        } else if (!w51.r.C().F(firebaseMessaging.b) || a()) {
                            if (b()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.i = false;
                                }
                            } else {
                                firebaseMessaging.j(this.s);
                            }
                            if (!w51.r.C().G(firebaseMessaging.b)) {
                                return;
                            }
                        } else {
                            b21.n nVar = new b21.n();
                            nVar.c = this;
                            nVar.a();
                            if (!w51.r.C().G(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        e.getMessage();
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = false;
                            if (!w51.r.C().G(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (w51.r.C().G(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
        }
    }

    public e3(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new h21.a("firebase-iid-executor"));
        this.u = firebaseMessaging;
        this.s = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.t = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }
}
