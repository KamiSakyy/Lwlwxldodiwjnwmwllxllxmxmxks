package w51;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.compose.foundation.lazy.layout.q1;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g extends Service {
    public ExecutorService r;
    public b0 s;
    public Object t;
    public int u;
    public int v;

    public g() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new h21.a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.r = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.t = new Object();
        this.v = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            z.b(intent);
        }
        synchronized (this.t) {
            try {
                int i = this.v - 1;
                this.v = i;
                if (i == 0) {
                    stopSelfResult(this.u);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            Log.isLoggable("EnhancedIntentService", 3);
            if (this.s == null) {
                this.s = new b0(new s21.a(24, this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.s;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.r.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.t) {
            this.u = i2;
            this.v++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) r.C().v).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        w21.g gVar = new w21.g();
        this.r.execute(new androidx.fragment.app.e(this, intent2, gVar, 5));
        w21.o oVar = gVar.a;
        if (oVar.i()) {
            a(intent);
            return 2;
        }
        oVar.a(new i7.c(0), new q1(14, this, intent));
        return 3;
    }
    public Object a(Object p1, Object p2, Object p3) { return null; }
    public Object b() { return null; }
    public Object a(Object p1, Object p2, int p3) { return null; }
    public Object a(Object p1, Object p2, int p3) { return null; }
}
