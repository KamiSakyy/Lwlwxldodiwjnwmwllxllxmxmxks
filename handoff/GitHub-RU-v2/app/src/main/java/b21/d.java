package b21;

import a0.s0;
import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import c21.g0;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.internal.measurement.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements Handler.Callback {
    public static final Status F = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status G = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object H = new Object();
    public static d I;
    public ConcurrentHashMap A;
    public x.f B;
    public x.f C;
    public h0 D;
    public volatile boolean E;
    public long r;
    public boolean s;
    public c21.l t;
    public e21.c u;
    public Context v;
    public z11.e w;
    public b1.m x;
    public AtomicInteger y;
    public AtomicInteger z;

    public d(Context context, Looper looper) {
        z11.e eVar = z11.e.d;
        this.r = 10000L;
        this.s = false;
        this.y = new AtomicInteger(1);
        this.z = new AtomicInteger(0);
        this.A = new ConcurrentHashMap(5, 0.75f, 1);
        this.B = new x.f(0);
        this.C = new x.f(0);
        this.E = true;
        this.v = context;
        h0 h0Var = new h0(looper, this);
        Looper.getMainLooper();
        this.D = h0Var;
        this.w = eVar;
        this.x = new b1.m(18);
        PackageManager packageManager = context.getPackageManager();
        if (g21.b.f == null) {
            g21.b.f = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (g21.b.f.booleanValue()) {
            this.E = false;
        }
        h0Var.sendMessage(h0Var.obtainMessage(6));
    }

    public static Status b(a aVar, z11.b bVar) {
        return new Status(17, s0.k("API: ", (String) aVar.b.t, " is not available on this device. Connection failed with: ", String.valueOf(bVar)), bVar.t, bVar);
    }

    public static d d(Context context) {
        d dVar;
        HandlerThread handlerThread;
        synchronized (H) {
            if (I == null) {
                synchronized (g0.g) {
                    try {
                        handlerThread = g0.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            g0.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = g0.i;
                        }
                    } finally {
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = z11.e.c;
                I = new d(applicationContext, looper);
            }
            dVar = I;
        }
        return dVar;
    }

    public final boolean a(z11.b bVar, int i) {
        z11.e eVar = this.w;
        eVar.getClass();
        Context context = this.v;
        if (!i21.a.w(context)) {
            int i2 = bVar.s;
            PendingIntent pendingIntent = bVar.t;
            if (!((i2 == 0 || pendingIntent == null) ? false : true)) {
                pendingIntent = null;
                Intent a = eVar.a(i2, context, null);
                if (a != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, a, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i3 = GoogleApiActivity.s;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                eVar.f(context, i2, PendingIntent.getActivity(context, 0, intent, m21.c.a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final j c(a21.c cVar) {
        a aVar = cVar.e;
        ConcurrentHashMap concurrentHashMap = this.A;
        j jVar = (j) concurrentHashMap.get(aVar);
        if (jVar == null) {
            jVar = new j(this, cVar);
            concurrentHashMap.put(aVar, jVar);
        }
        if (jVar.g.l()) {
            this.C.add(aVar);
        }
        jVar.m();
        return jVar;
    }

    public final void e(z11.b bVar, int i) {
        if (a(bVar, i)) {
            return;
        }
        h0 h0Var = this.D;
        h0Var.sendMessage(h0Var.obtainMessage(5, i, 0, bVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a9, code lost:
    
        if (r3 != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0113, code lost:
    
        if (r0 != 0) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:198:0x032c  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        j jVar;
        boolean z;
        z11.d[] b;
        c21.j jVar2;
        c21.j jVar3;
        Context context = this.v;
        x.f fVar = this.C;
        h0 h0Var = this.D;
        ConcurrentHashMap concurrentHashMap = this.A;
        int i = 0;
        switch (message.what) {
            case 1:
                this.r = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                h0Var.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    h0Var.sendMessageDelayed(h0Var.obtainMessage(12, (a) it.next()), this.r);
                }
                return true;
            case 2:
                throw s0.d(message.obj);
            case 3:
                for (j jVar4 : concurrentHashMap.values()) {
                    c21.uShadow.c(jVar4.p.D);
                    jVar4.o = null;
                    jVar4.m();
                }
                return true;
            case 4:
            case 8:
            case 13:
                q qVar = (q) message.obj;
                e21.c cVar = qVar.c;
                t tVar = qVar.a;
                j jVar5 = (j) concurrentHashMap.get(cVar.e);
                if (jVar5 == null) {
                    jVar5 = c(qVar.c);
                }
                if (!jVar5.g.l() || this.z.get() == qVar.b) {
                    jVar5.n(tVar);
                    return true;
                }
                tVar.c(F);
                jVar5.p();
                return true;
            case 5:
                int i2 = message.arg1;
                z11.b bVar = (z11.b) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        jVar = (j) it2.next();
                        if (jVar.l == i2) {
                        }
                    } else {
                        jVar = null;
                    }
                }
                if (jVar == null) {
                    Log.wtf("GoogleApiManager", s0.i("Could not find API instance ", i2, " while trying to fail enqueued calls."), new Exception());
                    return true;
                }
                int i3 = bVar.s;
                if (i3 != 13) {
                    jVar.b(b(jVar.h, bVar));
                    return true;
                }
                this.w.getClass();
                int i4 = z11.g.e;
                jVar.b(new Status(17, s0.k("Error resolution was canceled by the user, original error message: ", z11.b.j(i3), ": ", bVar.u), null, null));
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    c.a((Application) context.getApplicationContext());
                    c cVar2 = c.v;
                    h hVar = new h(this);
                    cVar2.getClass();
                    synchronized (cVar2) {
                        cVar2.t.add(hVar);
                    }
                    AtomicBoolean atomicBoolean = cVar2.r;
                    AtomicBoolean atomicBoolean2 = cVar2.s;
                    if (!atomicBoolean2.get()) {
                        if (g21.c.b()) {
                            z = true;
                            if (!z) {
                                this.r = 300000L;
                                return true;
                            }
                        } else {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                atomicBoolean.set(true);
                            }
                        }
                    }
                    z = atomicBoolean.get();
                    if (!z) {
                    }
                }
                return true;
            case 7:
                c((a21.c) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    j jVar6 = (j) concurrentHashMap.get(message.obj);
                    c21.uShadow.c(jVar6.p.D);
                    if (jVar6.m) {
                        jVar6.m();
                        return true;
                    }
                }
                return true;
            case 10:
                fVar.getClass();
                x.a aVar = new x.a(fVar);
                while (aVar.hasNext()) {
                    j jVar7 = (j) concurrentHashMap.remove((a) aVar.next());
                    if (jVar7 != null) {
                        jVar7.p();
                    }
                }
                fVar.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    j jVar8 = (j) concurrentHashMap.get(message.obj);
                    d dVar = jVar8.p;
                    c21.uShadow.c(dVar.D);
                    boolean z2 = jVar8.m;
                    if (z2) {
                        a aVar2 = jVar8.h;
                        h0 h0Var2 = jVar8.p.D;
                        if (z2) {
                            h0Var2.removeMessages(11, aVar2);
                            h0Var2.removeMessages(9, aVar2);
                            jVar8.m = false;
                        }
                        jVar8.b(dVar.w.b(dVar.v, z11.f.a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        jVar8.g.b("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    j jVar9 = (j) concurrentHashMap.get(message.obj);
                    c21.uShadow.c(jVar9.p.D);
                    a21.a aVar3 = jVar9.g;
                    if (aVar3.g() && jVar9.k.isEmpty()) {
                        b1.m mVar = jVar9.i;
                        if (((Map) mVar.s).isEmpty() && ((Map) mVar.t).isEmpty()) {
                            aVar3.b("Timing out service connection.");
                            return true;
                        }
                        jVar9.j();
                    }
                    return true;
                }
                return true;
            case 14:
                throw s0.d(message.obj);
            case 15:
                kShadow kVar = (kShadow) message.obj;
                if (concurrentHashMap.containsKey(kVar.a)) {
                    j jVar10 = (j) concurrentHashMap.get(kVar.a);
                    if (jVar10.n.contains(kVar) && !jVar10.m) {
                        if (jVar10.g.g()) {
                            jVar10.d();
                            return true;
                        }
                        jVar10.m();
                        return true;
                    }
                }
                return true;
            case 16:
                kShadow kVar2 = (kShadow) message.obj;
                if (concurrentHashMap.containsKey(kVar2.a)) {
                    j jVar11 = (j) concurrentHashMap.get(kVar2.a);
                    ArrayList arrayList = jVar11.n;
                    d dVar2 = jVar11.p;
                    LinkedList<o> linkedList = jVar11.f;
                    if (arrayList.remove(kVar2)) {
                        dVar2.D.removeMessages(15, kVar2);
                        dVar2.D.removeMessages(16, kVar2);
                        z11.d dVar3 = kVar2.b;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (o oVar : linkedList) {
                            if (oVar != null && (b = oVar.b(jVar11)) != null) {
                                int length = b.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= length) {
                                        break;
                                    }
                                    if (!c21.uShadow.j(b[i5], dVar3)) {
                                        i5++;
                                    } else if (i5 >= 0) {
                                        arrayList2.add(oVar);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        while (i < size) {
                            o oVar2 = (o) arrayList2.get(i);
                            linkedList.remove(oVar2);
                            oVar2.d(new UnsupportedApiCallException(dVar3));
                            i++;
                        }
                    }
                }
                return true;
            case 17:
                c21.l lVar = this.t;
                if (lVar != null) {
                    if (lVar.r <= 0) {
                        if (!this.s) {
                            synchronized (c21.j.class) {
                                try {
                                    if (c21.j.s == null) {
                                        c21.j.s = new c21.j(i);
                                    }
                                    jVar2 = c21.j.s;
                                } finally {
                                }
                            }
                            jVar2.getClass();
                            int i6 = ((SparseIntArray) this.x.s).get(203400000, -1);
                            if (i6 != -1) {
                            }
                        }
                        this.t = null;
                        return true;
                    }
                    if (this.u == null) {
                        this.u = new e21.c(this.v, e21.c.i, c21.m.b, a21.b.b);
                    }
                    this.u.a(lVar);
                    this.t = null;
                    return true;
                }
                return true;
            case 18:
                ((p) message.obj).getClass();
                if (0 == 0) {
                    c21.l lVar2 = new c21.l(0, Arrays.asList(null));
                    if (this.u == null) {
                        this.u = new e21.c(this.v, e21.c.i, c21.m.b, a21.b.b);
                    }
                    this.u.a(lVar2);
                    return true;
                }
                c21.l lVar3 = this.t;
                if (lVar3 != null) {
                    List list = lVar3.s;
                    if (lVar3.r != 0 || (list != null && list.size() >= 0)) {
                        h0Var.removeMessages(17);
                        c21.l lVar4 = this.t;
                        if (lVar4 != null) {
                            if (lVar4.r <= 0) {
                                if (!this.s) {
                                    synchronized (c21.j.class) {
                                        try {
                                            if (c21.j.s == null) {
                                                c21.j.s = new c21.j(i);
                                            }
                                            jVar3 = c21.j.s;
                                        } finally {
                                        }
                                    }
                                    jVar3.getClass();
                                    int i7 = ((SparseIntArray) this.x.s).get(203400000, -1);
                                    if (i7 != -1) {
                                    }
                                }
                                this.t = null;
                            }
                            if (this.u == null) {
                                this.u = new e21.c(this.v, e21.c.i, c21.m.b, a21.b.b);
                            }
                            this.u.a(lVar4);
                            this.t = null;
                        }
                    } else {
                        c21.l lVar5 = this.t;
                        if (lVar5.s == null) {
                            lVar5.s = new ArrayList();
                        }
                        lVar5.s.add(null);
                    }
                }
                if (this.t == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(null);
                    this.t = new c21.l(0, arrayList3);
                    h0Var.sendMessageDelayed(h0Var.obtainMessage(17), 0L);
                    return true;
                }
                return true;
            case 19:
                this.s = false;
                return true;
            default:
                return false;
        }
    }

    public d(Object... a) {
    }
}
