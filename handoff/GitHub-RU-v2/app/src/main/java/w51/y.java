package w51;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y implements Runnable {
    public static final Object w = new Object();
    public static Boolean x;
    public static Boolean y;
    public final Context r;
    public final j4.h s;
    public final PowerManager.WakeLock t;
    public final w u;
    public final long v;

    public y(w wVar, Context context, j4.h hVar, long j) {
        this.u = wVar;
        this.r = context;
        this.v = j;
        this.s = hVar;
        this.t = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean booleanValue;
        synchronized (w) {
            try {
                Boolean bool = y;
                if (bool != null) {
                    booleanValue = bool.booleanValue();
                } else if (bool != null) {
                    booleanValue = bool.booleanValue();
                } else {
                    booleanValue = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
                    if (!booleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                }
                y = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean b(Context context) {
        boolean booleanValue;
        synchronized (w) {
            try {
                Boolean bool = x;
                if (bool != null) {
                    booleanValue = bool.booleanValue();
                } else if (bool != null) {
                    booleanValue = bool.booleanValue();
                } else {
                    booleanValue = context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0;
                    if (!booleanValue) {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                }
                x = Boolean.valueOf(booleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean c() {
        boolean z;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.r.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                z = activeNetworkInfo.isConnected();
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        w wVar = this.u;
        Context context = this.r;
        boolean b = b(context);
        PowerManager.WakeLock wakeLock = this.t;
        if (b) {
            wakeLock.acquire(f.a);
        }
        try {
            try {
                try {
                    wVar.d(true);
                    if (!this.s.d()) {
                        wVar.d(false);
                        if (b(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                return;
                            }
                        }
                        return;
                    }
                    if (!a(context) || c()) {
                        if (wVar.e()) {
                            wVar.d(false);
                        } else {
                            wVar.f(this.v);
                        }
                        if (b(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    x xVar = new x();
                    xVar.a = this;
                    Log.isLoggable("FirebaseMessaging", 3);
                    context.registerReceiver(xVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    if (b(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                        }
                    }
                } catch (RuntimeException unused3) {
                }
            } catch (IOException e) {
                e.getMessage();
                wVar.d(false);
                if (b(context)) {
                    wakeLock.release();
                }
            }
        } catch (Throwable th) {
            if (b(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                }
            }
            throw th;
        }
    }
}
