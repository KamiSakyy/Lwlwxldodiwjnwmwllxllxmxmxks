package b21;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.internal.measurement.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements a21.d, a21.e {
    public a21.a g;
    public a h;
    public b1.m i;
    public int l;
    public boolean m;
    public final /* synthetic */ d p;
    public final LinkedList f = new LinkedList();
    public final HashSet j = new HashSet();
    public final HashMap k = new HashMap();
    public final ArrayList n = new ArrayList();
    public z11.b o = null;

    public j(d dVar, a21.c cVar) {
        this.p = dVar;
        Looper looper = dVar.D.getLooper();
        Context context = cVar.a;
        a5.s sVar = new a5.s(6, (byte) 0);
        Set set = Collections.EMPTY_SET;
        if (((x.f) sVar.t) == null) {
            sVar.t = new x.f(0);
        }
        ((x.f) sVar.t).addAll(set);
        sVar.s = context.getClass().getName();
        sVar.u = context.getPackageName();
        a5.s sVar2 = new a5.s((String) sVar.u, (String) sVar.s, (x.f) sVar.t);
        e21.b bVar = (e21.b) cVar.c.s;
        c21.uShadow.g(bVar);
        c21.m mVar = cVar.d;
        Context context2 = cVar.a;
        bVar.getClass();
        e21.d dVar2 = new e21.d(context2, looper, sVar2, mVar, this, this);
        String str = cVar.b;
        if (str != null) {
            dVar2.s = str;
        }
        this.g = dVar2;
        this.h = cVar.e;
        this.i = new b1.m(11);
        this.l = cVar.f;
    }

    public final void a(z11.b bVar) {
        HashSet hashSet = this.j;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (c21.uShadow.j(bVar, z11.b.w)) {
                this.g.d();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        c21.uShadow.c(this.p.D);
        c(status, null, false);
    }

    public final void c(Status status, Exception exc, boolean z) {
        c21.uShadow.c(this.p.D);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            if (!z || oVar.a == 2) {
                if (status != null) {
                    oVar.c(status);
                } else {
                    oVar.d(exc);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.f;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o oVar = (o) arrayList.get(i);
            if (!this.g.g()) {
                return;
            }
            if (k(oVar)) {
                linkedList.remove(oVar);
            }
        }
    }

    @Override // a21.d
    public final void e(int i) {
        Looper myLooper = Looper.myLooper();
        h0 h0Var = this.p.D;
        if (myLooper == h0Var.getLooper()) {
            i(i);
        } else {
            h0Var.post(new i(this, i, 0));
        }
    }

    @Override // a21.d
    public final void f() {
        Looper myLooper = Looper.myLooper();
        h0 h0Var = this.p.D;
        if (myLooper == h0Var.getLooper()) {
            h();
        } else {
            h0Var.post(new androidx.fragment.app.o(4, this));
        }
    }

    @Override // a21.e
    public final void g(z11.b bVar) {
        o(bVar, null);
    }

    public final void h() {
        d dVar = this.p;
        c21.uShadow.c(dVar.D);
        this.o = null;
        a(z11.b.w);
        h0 h0Var = dVar.D;
        if (this.m) {
            a aVar = this.h;
            h0Var.removeMessages(11, aVar);
            h0Var.removeMessages(9, aVar);
            this.m = false;
        }
        Iterator it = this.k.values().iterator();
        if (it.hasNext()) {
            throw f4.g(it);
        }
        d();
        j();
    }

    public final void i(int i) {
        d dVar = this.p;
        h0 h0Var = dVar.D;
        c21.uShadow.c(dVar.D);
        this.o = null;
        this.m = true;
        String j = this.g.j();
        b1.m mVar = this.i;
        mVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (j != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(j);
        }
        mVar.H(true, new Status(20, sb.toString(), null, null));
        a aVar = this.h;
        h0Var.sendMessageDelayed(Message.obtain(h0Var, 9, aVar), 5000L);
        h0Var.sendMessageDelayed(Message.obtain(h0Var, 11, aVar), 120000L);
        ((SparseIntArray) dVar.x.s).clear();
        Iterator it = this.k.values().iterator();
        if (it.hasNext()) {
            throw f4.g(it);
        }
    }

    public final void j() {
        d dVar = this.p;
        h0 h0Var = dVar.D;
        a aVar = this.h;
        h0Var.removeMessages(12, aVar);
        h0Var.sendMessageDelayed(h0Var.obtainMessage(12, aVar), dVar.r);
    }

    public final boolean k(o oVar) {
        z11.d dVar;
        if (oVar == null) {
            b1.m mVar = this.i;
            a21.a aVar = this.g;
            oVar.f(mVar, aVar.l());
            try {
                oVar.e(this);
                return true;
            } catch (DeadObjectException unused) {
                e(1);
                aVar.b("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        z11.d[] b = oVar.b(this);
        if (b != null && b.length != 0) {
            z11.d[] i = this.g.i();
            if (i == null) {
                i = new z11.d[0];
            }
            x.e eVar = new x.e(i.length);
            for (z11.d dVar2 : i) {
                eVar.put(dVar2.r, Long.valueOf(dVar2.j()));
            }
            int length = b.length;
            for (int i2 = 0; i2 < length; i2++) {
                dVar = b[i2];
                Long l = (Long) eVar.get(dVar.r);
                if (l == null || l.longValue() < dVar.j()) {
                    break;
                }
            }
        }
        dVar = null;
        if (dVar == null) {
            b1.m mVar2 = this.i;
            a21.a aVar2 = this.g;
            oVar.f(mVar2, aVar2.l());
            try {
                oVar.e(this);
                return true;
            } catch (DeadObjectException unused2) {
                e(1);
                aVar2.b("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        this.g.getClass();
        if (!this.p.E || !oVar.a(this)) {
            oVar.d(new UnsupportedApiCallException(dVar));
            return true;
        }
        kShadow kVar = new kShadow(this.h, dVar);
        int indexOf = this.n.indexOf(kVar);
        if (indexOf >= 0) {
            kShadow kVar2 = (kShadow) this.n.get(indexOf);
            this.p.D.removeMessages(15, kVar2);
            h0 h0Var = this.p.D;
            h0Var.sendMessageDelayed(Message.obtain(h0Var, 15, kVar2), 5000L);
        } else {
            this.n.add(kVar);
            h0 h0Var2 = this.p.D;
            h0Var2.sendMessageDelayed(Message.obtain(h0Var2, 15, kVar), 5000L);
            h0 h0Var3 = this.p.D;
            h0Var3.sendMessageDelayed(Message.obtain(h0Var3, 16, kVar), 120000L);
            z11.b bVar = new z11.b(2, null, null);
            if (!l(bVar)) {
                this.p.a(bVar, this.l);
            }
        }
        return false;
    }

    public final boolean l(z11.b bVar) {
        synchronized (d.H) {
        }
        return false;
    }

    public final void m() {
        d dVar = this.p;
        c21.uShadow.c(dVar.D);
        a21.a aVar = this.g;
        if (aVar.g() || aVar.c()) {
            return;
        }
        try {
            b1.m mVar = dVar.x;
            Context context = dVar.v;
            SparseIntArray sparseIntArray = (SparseIntArray) mVar.s;
            c21.uShadow.g(context);
            int h = aVar.h();
            int i = ((SparseIntArray) mVar.s).get(h, -1);
            if (i == -1) {
                i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= sparseIntArray.size()) {
                        i = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i2);
                    if (keyAt > h && sparseIntArray.get(keyAt) == 0) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i == -1) {
                    i = ((z11.e) mVar.t).b(context, h);
                }
                sparseIntArray.put(h, i);
            }
            if (i != 0) {
                z11.b bVar = new z11.b(i, null, null);
                bVar.toString();
                o(bVar, null);
                return;
            }
            l lVar = new l(dVar, aVar, this.h);
            if (aVar.l()) {
                c21.uShadow.g(null);
                throw null;
            }
            try {
                aVar.e(lVar);
            } catch (SecurityException e) {
                o(new z11.b(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            o(new z11.b(10, null, null), e2);
        }
    }

    public final void n(o oVar) {
        c21.uShadow.c(this.p.D);
        boolean g = this.g.g();
        LinkedList linkedList = this.f;
        if (g) {
            if (k(oVar)) {
                j();
                return;
            } else {
                linkedList.add(oVar);
                return;
            }
        }
        linkedList.add(oVar);
        z11.b bVar = this.o;
        if (bVar == null || bVar.s == 0 || bVar.t == null) {
            m();
        } else {
            o(bVar, null);
        }
    }

    public final void o(z11.b bVar, RuntimeException runtimeException) {
        c21.uShadow.c(this.p.D);
        c21.uShadow.c(this.p.D);
        this.o = null;
        ((SparseIntArray) this.p.x.s).clear();
        a(bVar);
        if ((this.g instanceof e21.d) && bVar.s != 24) {
            d dVar = this.p;
            dVar.s = true;
            h0 h0Var = dVar.D;
            h0Var.sendMessageDelayed(h0Var.obtainMessage(19), 300000L);
        }
        if (bVar.s == 4) {
            b(d.G);
            return;
        }
        if (this.f.isEmpty()) {
            this.o = bVar;
            return;
        }
        if (runtimeException != null) {
            c21.uShadow.c(this.p.D);
            c(null, runtimeException, false);
            return;
        }
        if (!this.p.E) {
            b(d.b(this.h, bVar));
            return;
        }
        c(d.b(this.h, bVar), null, true);
        if (this.f.isEmpty() || l(bVar) || this.p.a(bVar, this.l)) {
            return;
        }
        if (bVar.s == 18) {
            this.m = true;
        }
        if (!this.m) {
            b(d.b(this.h, bVar));
            return;
        }
        d dVar2 = this.p;
        a aVar = this.h;
        h0 h0Var2 = dVar2.D;
        h0Var2.sendMessageDelayed(Message.obtain(h0Var2, 9, aVar), 5000L);
    }

    public final void p() {
        c21.uShadow.c(this.p.D);
        Status status = d.F;
        b(status);
        this.i.H(false, status);
        for (f fVar : (f[]) this.k.keySet().toArray(new f[0])) {
            n(new u(new w21.g()));
        }
        a(new z11.b(4, null, null));
        a21.a aVar = this.g;
        if (aVar.g()) {
            aVar.m(new y51.c(14, this));
        }
    }
}
