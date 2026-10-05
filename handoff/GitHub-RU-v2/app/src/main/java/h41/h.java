package h41;

import a61.c1;
import a81.t;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import c41.l;
import com.google.android.play.core.review.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final t b;
    public boolean g;
    public final Intent h;
    public c1 l;
    public d m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final l j = new l(1, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    public h(Context context, t tVar, Intent intent) {
        this.a = context;
        this.b = tVar;
        this.h = intent;
    }

    public static void b(h hVar, g41.d dVar) {
        d dVar2 = hVar.m;
        t tVar = hVar.b;
        ArrayList arrayList = hVar.d;
        int i = 0;
        if (dVar2 != null || hVar.g) {
            if (!hVar.g) {
                dVar.run();
                return;
            } else {
                tVar.f("Waiting to bind to the service.", new Object[0]);
                arrayList.add(dVar);
                return;
            }
        }
        tVar.f("Initiate binding to the service.", new Object[0]);
        arrayList.add(dVar);
        c1 c1Var = new c1(2, hVar);
        hVar.l = c1Var;
        hVar.g = true;
        if (hVar.a.bindService(hVar.h, c1Var, 1)) {
            return;
        }
        tVar.f("Failed to bind to the service.", new Object[0]);
        hVar.g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zzu zzuVar = new zzu();
            w21.g gVar = ((e) obj).r;
            if (gVar != null) {
                gVar.b(zzuVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    hashMap.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((w21.g) it.next()).b(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
