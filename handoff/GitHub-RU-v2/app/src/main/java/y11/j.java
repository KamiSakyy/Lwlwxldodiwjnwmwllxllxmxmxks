package y11;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import c21.f0;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.internal.measurement.h0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import v2.t;
import w21.m;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements ServiceConnection {
    public int r = 0;
    public Messenger s;
    public t t;
    public ArrayDeque u;
    public SparseArray v;
    public final /* synthetic */ l w;

    public j(l lVar) {
        this.w = lVar;
        h0 h0Var = new h0(Looper.getMainLooper(), new f0(3, this));
        Looper.getMainLooper();
        this.s = new Messenger(h0Var);
        this.u = new ArrayDeque();
        this.v = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i = this.r;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.r = 4;
                return;
            }
            Log.isLoggable("MessengerIpcClient", 2);
            this.r = 4;
            f21.a.b().c((Context) this.w.b, this);
            zzt zztVar = new zzt(str, securityException);
            Iterator it = this.u.iterator();
            while (it.hasNext()) {
                ((k) it.next()).b(zztVar);
            }
            this.u.clear();
            for (int i2 = 0; i2 < this.v.size(); i2++) {
                ((k) this.v.valueAt(i2)).b(zztVar);
            }
            this.v.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        if (this.r == 2 && this.u.isEmpty() && this.v.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.r = 3;
            f21.a.b().c((Context) this.w.b, this);
        }
    }

    public final synchronized boolean d(k kVar) {
        int i = this.r;
        if (i != 0) {
            if (i == 1) {
                this.u.add(kVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.u.add(kVar);
            ((ScheduledExecutorService) this.w.c).execute(new i(this, 0));
            return true;
        }
        this.u.add(kVar);
        if (this.r != 0) {
            throw new IllegalStateException();
        }
        Log.isLoggable("MessengerIpcClient", 2);
        this.r = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (f21.a.b().a((Context) this.w.b, intent, this, 1)) {
                ((ScheduledExecutorService) this.w.c).schedule(new i(this, 1), 30L, TimeUnit.SECONDS);
            } else {
                a("Unable to bind to service");
            }
        } catch (SecurityException e) {
            b("Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        ((ScheduledExecutorService) this.w.c).execute(new m(this, iBinder, false, 12));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        ((ScheduledExecutorService) this.w.c).execute(new i(this, 2));
    }
}
