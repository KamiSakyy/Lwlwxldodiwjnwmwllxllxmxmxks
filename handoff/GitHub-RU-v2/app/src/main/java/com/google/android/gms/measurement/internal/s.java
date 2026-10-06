package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s implements u81.g {
    public final /* synthetic */ int r = 0;
    public final long s;
    public long t;
    public final Object u;
    public final Object v;
    public final Serializable w;
    public final Iterable x;

    public s(o1 o1Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        v vVar;
        c21.u.d(str2);
        c21.u.d(str3);
        this.u = str2;
        this.v = str3;
        this.w = true == TextUtils.isEmpty(str) ? null : str;
        this.s = j;
        this.t = j2;
        if (j2 != 0 && j2 > j) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.A.b(s0.H(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            vVar = new v(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    s0 s0Var2 = o1Var.w;
                    o1.m(s0Var2);
                    s0Var2.x.a("Param name can't be null");
                    it.remove();
                } else {
                    t4 t4Var = o1Var.z;
                    o1.k(t4Var);
                    Object G = t4Var.G(bundle2.get(next), next);
                    if (G == null) {
                        s0 s0Var3 = o1Var.w;
                        o1.m(s0Var3);
                        s0Var3.A.b(o1Var.A.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        t4 t4Var2 = o1Var.z;
                        o1.k(t4Var2);
                        t4Var2.O(bundle2, next, G);
                    }
                }
            }
            vVar = new v(bundle2);
        }
        this.x = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0002, B:5:0x000c, B:11:0x0021, B:13:0x002b, B:20:0x0057, B:64:0x0065, B:67:0x0072, B:25:0x007b, B:27:0x0081, B:31:0x008a, B:33:0x0095, B:34:0x009b, B:36:0x009f, B:41:0x00a6, B:44:0x00b0, B:46:0x00b4, B:49:0x00ba, B:50:0x00be, B:52:0x00c2, B:53:0x00c3, B:56:0x00c7, B:69:0x004c, B:71:0x00d2, B:72:0x00d9), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0002, B:5:0x000c, B:11:0x0021, B:13:0x002b, B:20:0x0057, B:64:0x0065, B:67:0x0072, B:25:0x007b, B:27:0x0081, B:31:0x008a, B:33:0x0095, B:34:0x009b, B:36:0x009f, B:41:0x00a6, B:44:0x00b0, B:46:0x00b4, B:49:0x00ba, B:50:0x00be, B:52:0x00c2, B:53:0x00c3, B:56:0x00c7, B:69:0x004c, B:71:0x00d2, B:72:0x00d9), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0002, B:5:0x000c, B:11:0x0021, B:13:0x002b, B:20:0x0057, B:64:0x0065, B:67:0x0072, B:25:0x007b, B:27:0x0081, B:31:0x008a, B:33:0x0095, B:34:0x009b, B:36:0x009f, B:41:0x00a6, B:44:0x00b0, B:46:0x00b4, B:49:0x00ba, B:50:0x00be, B:52:0x00c2, B:53:0x00c3, B:56:0x00c7, B:69:0x004c, B:71:0x00d2, B:72:0x00d9), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u81.n a() {
        u81.q d;
        long j;
        Throwable th;
        u81.r rVar;
        u81.q qVar;
        IOException iOException = null;
        while (true) {
            try {
                if (((CopyOnWriteArrayList) this.w).isEmpty() && !((u81.o) this.u).a((u81.n) null)) {
                    c();
                    k71.k.d(iOException);
                    throw iOException;
                }
                if (((u81.o) this.u).l.H) {
                    throw new IOException("Canceled");
                }
                s21.a aVar = ((t81.e) this.v).a;
                long nanoTime = System.nanoTime();
                long j2 = this.t - nanoTime;
                if (!((CopyOnWriteArrayList) this.w).isEmpty() && j2 > 0) {
                    j = j2;
                    d = null;
                    if (d != null) {
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.w;
                        if (!copyOnWriteArrayList.isEmpty() && (qVar = (u81.q) ((LinkedBlockingDeque) this.x).poll(j, timeUnit)) != null) {
                            copyOnWriteArrayList.remove(qVar.a);
                            d = qVar;
                            if (d != null) {
                            }
                        }
                        d = null;
                        if (d != null) {
                        }
                    }
                    boolean z = false;
                    if (d.b != null && d.c == null) {
                        c();
                        if (!d.a.a()) {
                            d = d.a.g();
                        }
                        if (d.b == null && d.c == null) {
                            z = true;
                        }
                        if (z) {
                            return d.a.c();
                        }
                    }
                    th = d.c;
                    if (th != null) {
                        if (!(th instanceof IOException)) {
                            throw th;
                        }
                        if (iOException == null) {
                            iOException = (IOException) th;
                        } else {
                            sy.u.a(iOException, th);
                        }
                    }
                    rVar = d.b;
                    if (rVar == null) {
                        ((u81.o) this.u).q.addFirst(rVar);
                    }
                }
                d = d();
                j = this.s;
                this.t = nanoTime + j;
                if (d != null) {
                }
                boolean z2 = false;
                if (d.b != null && d.c == null) {
                }
                th = d.c;
                if (th != null) {
                }
                rVar = d.b;
                if (rVar == null) {
                }
            } finally {
                c();
            }
        }
    }

    public u81.o b() {
        return (u81.o) this.u;
    }

    public void c() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.w;
        Iterator it = copyOnWriteArrayList.iterator();
        k71.k.f(it, "iterator(...)");
        while (it.hasNext()) {
            u81.r rVar = (u81.r) it.next();
            rVar.cancel();
            u81.r b = rVar.b();
            if (b != null) {
                ((u81.o) this.u).q.addLast(b);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public u81.q d() {
        u81.r hVar;
        u81.o oVar = (u81.o) this.u;
        if (oVar.a((u81.n) null)) {
            try {
                hVar = oVar.b();
            } catch (Throwable th) {
                hVar = new u81.h(th);
            }
            if (hVar.a()) {
                return new u81.q(hVar, (Throwable) null, 6);
            }
            if (hVar instanceof u81.h) {
                return ((u81.h) hVar).a;
            }
            ((CopyOnWriteArrayList) this.w).add(hVar);
            ((t81.e) this.v).d().c(new u81.i(r81.g.b + " connect " + oVar.j.h.g(), hVar, this), 0L);
        }
        return null;
    }

    public s e(o1 o1Var, long j) {
        return new s(o1Var, (String) this.w, (String) this.u, (String) this.v, this.s, j, (v) this.x);
    }

    public String toString() {
        switch (this.r) {
            case 0:
                String vVar = ((v) this.x).toString();
                String str = (String) this.u;
                int length = String.valueOf(str).length();
                String str2 = (String) this.v;
                StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + vVar.length() + 1);
                f1.e.x(sb, "Event{appId='", str, "', name='", str2);
                return no.a.q(sb, "', params=", vVar, "}");
            default:
                return super.toString();
        }
    }

    public s(o1 o1Var, String str, String str2, String str3, long j, long j2, v vVar) {
        c21.u.d(str2);
        c21.u.d(str3);
        c21.u.g(vVar);
        this.u = str2;
        this.v = str3;
        this.w = true == TextUtils.isEmpty(str) ? null : str;
        this.s = j;
        this.t = j2;
        if (j2 != 0 && j2 > j) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.A.c("Event created with reverse previous/current timestamps. appId, name", s0.H(str2), s0.H(str3));
        }
        this.x = vVar;
    }

    public s(u81.o oVar, t81.e eVar) {
        k71.k.g(eVar, "taskRunner");
        this.u = oVar;
        this.v = eVar;
        this.s = TimeUnit.MILLISECONDS.toNanos(250L);
        this.t = Long.MIN_VALUE;
        this.w = new CopyOnWriteArrayList();
        this.x = new LinkedBlockingDeque();
    }
    public Object F(Object p1) { return null; }
    public Object i(Object p1, Object p2) { return null; }
    public Object n(Object p1) { return null; }
    public Object t() { return null; }
    public Object u() { return null; }
}
