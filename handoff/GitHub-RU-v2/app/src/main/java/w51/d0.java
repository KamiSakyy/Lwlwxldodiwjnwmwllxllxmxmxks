package w51;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d0 implements ServiceConnection {
    public Context r;
    public Intent s;
    public ScheduledThreadPoolExecutor t;
    public ArrayDeque u;
    public b0 v;
    public boolean w;

    public d0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new h21.a("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.u = new ArrayDeque();
        this.w = false;
        Context applicationContext = context.getApplicationContext();
        this.r = applicationContext;
        this.s = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.t = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (f21.a.b().a(r4.r, r4.s, r4, 65) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a() {
        try {
            Log.isLoggable("FirebaseMessaging", 3);
            while (!this.u.isEmpty()) {
                Log.isLoggable("FirebaseMessaging", 3);
                b0 b0Var = this.v;
                if (b0Var == null || !b0Var.isBinderAlive()) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    if (!this.w) {
                        this.w = true;
                    }
                } else {
                    Log.isLoggable("FirebaseMessaging", 3);
                    this.v.a((c0) this.u.poll());
                }
            }
            return;
        } finally {
        }
        this.w = false;
        ArrayDeque arrayDeque = this.u;
        while (!arrayDeque.isEmpty()) {
            ((c0) arrayDeque.poll()).b.c(null);
        }
    }

    public final synchronized w21.o b(Intent intent) {
        c0 c0Var;
        Log.isLoggable("FirebaseMessaging", 3);
        c0Var = new c0(intent);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.t;
        c0Var.b.a.a(scheduledThreadPoolExecutor, new a0(1, scheduledThreadPoolExecutor.schedule((Runnable) new androidx.fragment.app.s(27, c0Var), 20L, TimeUnit.SECONDS)));
        this.u.add(c0Var);
        a();
        return c0Var.b.a;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.w = false;
            if (iBinder instanceof b0) {
                this.v = (b0) iBinder;
                a();
            } else {
                Objects.toString(iBinder);
                ArrayDeque arrayDeque = this.u;
                while (!arrayDeque.isEmpty()) {
                    ((c0) arrayDeque.poll()).b.c(null);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        a();
    }
}
