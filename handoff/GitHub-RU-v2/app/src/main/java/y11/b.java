package y11;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import androidx.compose.runtime.i1;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import w21.o;
import x.q0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final q0 a = new q0(0);
    public Context b;
    public i1 c;
    public ScheduledThreadPoolExecutor d;
    public Messenger e;
    public Messenger f;
    public g g;

    public b(Context context) {
        this.b = context;
        i1 i1Var = new i1();
        i1Var.s = 0;
        i1Var.t = context;
        this.c = i1Var;
        this.e = new Messenger(new e(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public final o a(Bundle bundle) {
        String num;
        synchronized (b.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        w21.g gVar = new w21.g();
        synchronized (this.a) {
            this.a.put(num, gVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.o() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.b;
        synchronized (b.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, n21.a.a);
                }
                intent.putExtra("app", i);
            } finally {
            }
        }
        intent.putExtra("kid", "|ID|" + num + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f != null || this.g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.g.r;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable("Rpc", 3);
            }
            ScheduledFuture<?> schedule = this.d.schedule((Runnable) new t81.d(6, gVar), 30L, TimeUnit.SECONDS);
            o oVar = gVar.a;
            h hVar = h.t;
            x9.f fVar = new x9.f();
            fVar.s = this;
            fVar.r = num;
            fVar.t = schedule;
            oVar.a(hVar, fVar);
            return gVar.a;
        }
        if (this.c.o() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
        ScheduledFuture<?> schedule2 = this.d.schedule((Runnable) new t81.d(6, gVar), 30L, TimeUnit.SECONDS);
        o oVar2 = gVar.a;
        h hVar2 = h.t;
        x9.f fVar2 = new x9.f();
        fVar2.s = this;
        fVar2.r = num;
        fVar2.t = schedule2;
        oVar2.a(hVar2, fVar2);
        return gVar.a;
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.a) {
            try {
                w21.g gVar = (w21.g) this.a.remove(str);
                if (gVar == null) {
                    return;
                }
                gVar.a(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
