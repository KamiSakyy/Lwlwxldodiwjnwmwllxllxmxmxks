package y11;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import v2.t;
import w21.m;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ j s;

    public /* synthetic */ i(j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                break;
            case 1:
                j jVar = this.s;
                synchronized (jVar) {
                    if (jVar.r == 1) {
                        jVar.a("Timed out while binding");
                    }
                }
                return;
            default:
                this.s.a("Service disconnected");
                return;
        }
        while (true) {
            j jVar2 = this.s;
            synchronized (jVar2) {
                try {
                    if (jVar2.r != 2) {
                        return;
                    }
                    if (jVar2.u.isEmpty()) {
                        jVar2.c();
                        return;
                    }
                    k kVar = (k) jVar2.u.poll();
                    jVar2.v.put(kVar.a, kVar);
                    ((ScheduledExecutorService) jVar2.w.c).schedule(new m(jVar2, kVar, false, 13), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(kVar));
                    }
                    l lVar = jVar2.w;
                    Messenger messenger = jVar2.s;
                    int i = kVar.c;
                    Context context = (Context) lVar.b;
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = kVar.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", kVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", kVar.d);
                    obtain.setData(bundle);
                    try {
                        t tVar = jVar2.t;
                        Messenger messenger2 = (Messenger) tVar.s;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            g gVar = (g) tVar.t;
                            if (gVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = gVar.r;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e) {
                        jVar2.a(e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
