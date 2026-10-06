package c41;

import a61.c1;
import a81.t;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.play.core.appupdate.internal.zzy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o {
    public static final HashMap n = new HashMap();
    public final Context a;
    public final t b;
    public boolean g;
    public final Intent h;
    public c1 l;
    public h m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final l j = new l(0, this);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "AppUpdateService";
    public final WeakReference i = new WeakReference(null);

    public o(Context context, t tVar, Intent intent) {
        this.a = context;
        this.b = tVar;
        this.h = intent;
    }

    public static void b(o oVar, k kVar) {
        h hVar = oVar.m;
        t tVar = oVar.b;
        ArrayList arrayList = oVar.d;
        int i = 0;
        if (hVar != null || oVar.g) {
            if (!oVar.g) {
                kVar.run();
                return;
            } else {
                tVar.g("Waiting to bind to the service.", new Object[0]);
                arrayList.add(kVar);
                return;
            }
        }
        tVar.g("Initiate binding to the service.", new Object[0]);
        arrayList.add(kVar);
        c1 c1Var = new c1(1, oVar);
        oVar.l = c1Var;
        oVar.g = true;
        if (oVar.a.bindService(oVar.h, c1Var, 1)) {
            return;
        }
        tVar.g("Failed to bind to the service.", new Object[0]);
        oVar.g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zzy zzyVar = new zzy();
            w21.g gVar = ((k) obj).r;
            if (gVar != null) {
                gVar.b(zzyVar);
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

    public final void c(w21.g gVar) {
        synchronized (this.f) {
            this.e.remove(gVar);
        }
        a().post(new m(0, this));
    }

    public final void d() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((w21.g) it.next()).b(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
