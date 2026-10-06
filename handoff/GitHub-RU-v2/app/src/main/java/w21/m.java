package w21;

import android.graphics.Typeface;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.internal.play_billing.p;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.internal.play_billing.t;
import com.google.android.gms.internal.play_billing.v;
import com.google.android.gms.tasks.RuntimeExecutionException;
import d9.q;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import v8.x;
import x9.z;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ m(int i, Object obj, Object obj2) {
        this.r = i;
        this.t = obj;
        this.s = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object a = null;
        switch (this.r) {
            case 0:
                synchronized (((l) this.t).t) {
                    ((e) ((l) this.t).u).e(((o) this.s).h());
                }
                return;
            case 1:
                l lVar = (l) this.t;
                try {
                    o f = ((f) lVar.t).f(((o) this.s).h());
                    k.m mVar = h.b;
                    f.d(mVar, lVar);
                    f.c(mVar, lVar);
                    f.b.j(new l((Executor) mVar, (b) lVar));
                    f.q();
                    return;
                } catch (RuntimeExecutionException e) {
                    if (e.getCause() instanceof Exception) {
                        lVar.h((Exception) e.getCause());
                        return;
                    } else {
                        lVar.h(e);
                        return;
                    }
                } catch (CancellationException unused) {
                    lVar.a();
                    return;
                } catch (Exception e2) {
                    lVar.h(e2);
                    return;
                }
            case 2:
                o oVar = (o) this.s;
                try {
                    oVar.m(((Callable) this.t).call());
                    return;
                } catch (Exception e3) {
                    oVar.l(e3);
                    return;
                } catch (Throwable th) {
                    oVar.l(new RuntimeException(th));
                    return;
                }
            case 3:
                kk.a aVar = (kk.a) this.s;
                Typeface typeface = (Typeface) this.t;
                q4.b bVar = (q4.b) aVar.s;
                if (bVar != null) {
                    bVar.j(typeface);
                    return;
                }
                return;
            case 4:
                ((x4.e) this.s).accept(this.t);
                return;
            case 5:
                x a = x.a();
                int i = x8.a.e;
                q qVar = (q) this.s;
                a.getClass();
                ((x8.a) this.t).a.a(new q[]{qVar});
                return;
            case 6:
                x9.c cVar = (x9.c) this.s;
                c5.b bVar2 = (c5.b) this.t;
                x9.hShadow hVar = z.k;
                cVar.A(24, 3, hVar);
                bVar2.n(hVar);
                return;
            case 7:
                x9.c cVar2 = (x9.c) this.s;
                x9.hShadow hVar2 = (x9.hShadow) this.t;
                if (((x9.o) cVar2.f.t) != null) {
                    ((x9.o) cVar2.f.t).a(hVar2, (List) null);
                    return;
                } else {
                    int i2 = t.a;
                    Log.isLoggable("BillingClient", 5);
                    return;
                }
            case 8:
                Future future = (Future) this.s;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                Runnable runnable = (Runnable) this.t;
                future.cancel(true);
                int i3 = t.a;
                Log.isLoggable("BillingClient", 5);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 9:
                x9.c cVar3 = (x9.c) this.s;
                x9.d dVar = (x9.d) this.t;
                x9.hShadow hVar3 = z.k;
                cVar3.A(24, 7, hVar3);
                p pVar = r.s;
                v vVar = v.v;
                v71.r rVar = dVar.a;
                k71.k.d(hVar3);
                rVar.X(new x9.m(hVar3, vVar));
                return;
            case 10:
                x9.c cVar4 = (x9.c) this.s;
                x9.d dVar2 = (x9.d) this.t;
                x9.hShadow hVar4 = z.k;
                cVar4.A(24, 9, hVar4);
                p pVar2 = r.s;
                dVar2.a(hVar4, v.v);
                return;
            case 11:
                v2.t tVar = (v2.t) this.s;
                try {
                    ((x9.c) tVar.t).A.a((x9.hShadow) this.t);
                    return;
                } catch (Throwable unused2) {
                    t.h("BillingClient");
                    return;
                }
            case 12:
                y11.j jVar = (y11.j) this.s;
                IBinder iBinder = (IBinder) this.t;
                synchronized (jVar) {
                    if (iBinder == null) {
                        jVar.a("Null service connection");
                    } else {
                        try {
                            jVar.t = new v2.t(iBinder);
                            jVar.r = 2;
                            ((ScheduledExecutorService) jVar.w.c).execute(new y11.i(jVar, 0));
                        } catch (RemoteException e4) {
                            jVar.a(e4.getMessage());
                        }
                    }
                }
                return;
            default:
                y11.j jVar2 = (y11.j) this.s;
                int i4 = ((y11.k) this.t).a;
                synchronized (jVar2) {
                    y11.k kVar = (y11.k) jVar2.v.get(i4);
                    if (kVar != null) {
                        jVar2.v.remove(i4);
                        kVar.b(new zzt("Timed out waiting for response", null));
                        jVar2.c();
                    }
                }
                return;
        }
    }

    public /* synthetic */ m(Object obj, Object obj2, boolean z, int i) {
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }

    public Object t;
}
