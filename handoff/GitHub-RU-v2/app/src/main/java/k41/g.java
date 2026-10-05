package k41;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import b1.m;
import c21.u;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p41.k;
import sy.p;
import z70.y1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g {
    public static final Object k = new Object();
    public static final x.e l = new x.e(0);
    public final Context a;
    public final String b;
    public final i c;
    public final p41.f d;
    public final k g;
    public final p51.b h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    public g(Context context, String str, i iVar) {
        ArrayList arrayList;
        int i = 0;
        this.a = context;
        u.d(str);
        this.b = str;
        this.c = iVar;
        a aVar = FirebaseInitProvider.r;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Objects.toString(ComponentDiscoveryService.class);
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new p41.c(i, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        q41.k kVar = q41.k.r;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i2 = 1;
        arrayList3.add(new p41.c(i2, new FirebaseCommonRegistrar()));
        arrayList3.add(new p41.c(i2, new ExecutorsRegistrar()));
        arrayList4.add(p41.a.c(context, Context.class, new Class[0]));
        arrayList4.add(p41.a.c(this, g.class, new Class[0]));
        arrayList4.add(p41.a.c(iVar, i.class, new Class[0]));
        y1 y1Var = new y1(6);
        if (p.p(context) && FirebaseInitProvider.s.get()) {
            arrayList4.add(p41.a.c(aVar, a.class, new Class[0]));
        }
        p41.f fVar = new p41.f(arrayList3, arrayList4, y1Var);
        this.d = fVar;
        Trace.endSection();
        this.g = new k(new c(i, this, context));
        this.h = fVar.e(n51.d.class);
        d dVar = new d(this);
        a();
        if (this.e.get()) {
            b21.c.v.r.get();
        }
        this.i.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (k) {
            try {
                gVar = (g) l.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + g21.c.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((n51.d) gVar.h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g f(Context context, i iVar) {
        g gVar;
        AtomicReference atomicReference = e.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        b21.c.a(application);
                        b21.c cVar = b21.c.v;
                        cVar.getClass();
                        synchronized (cVar) {
                            cVar.t.add(eVar);
                        }
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            x.e eVar2 = l;
            u.i("FirebaseApp name [DEFAULT] already exists!", !eVar2.containsKey("[DEFAULT]"));
            u.h(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", iVar);
            eVar2.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        u.i("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.c.b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void e() {
        HashMap hashMap;
        if (!p.p(this.a)) {
            a();
            Context context = this.a;
            AtomicReference atomicReference = f.b;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        a();
        p41.f fVar2 = this.d;
        a();
        boolean equals = "[DEFAULT]".equals(this.b);
        AtomicReference atomicReference2 = fVar2.f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (fVar2) {
                    hashMap = new HashMap(fVar2.a);
                }
                fVar2.h(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((n51.d) this.h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.b.equals(gVar.b);
    }

    public final boolean g() {
        boolean z;
        a();
        u51.a aVar = (u51.a) this.g.get();
        synchronized (aVar) {
            z = aVar.a;
        }
        return z;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        m mVar = new m(this);
        mVar.a(this.b, "name");
        mVar.a(this.c, "options");
        return mVar.toString();
    }
}
