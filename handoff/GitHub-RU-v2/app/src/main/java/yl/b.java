package yl;

import a0.a2;
import a71.h;
import aa.g0;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.x1;
import androidx.compose.ui.layout.o0;
import c71.j;
import d9.q;
import fk.f;
import j71.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo.f4;
import k71.k;
import rm0.u7;
import rm0.v4;
import s0.z0;
import sy.d0;
import sy.y;
import t00.f8;
import t71.w;
import v71.b0;
import v71.z;
import w61.a0;
import x61.m;
import x61.n;
import x61.r;
import x71.s;
import x71.t;
import x71.v;
import y71.i;
import y71.n1;
import y71.o;
import y71.p;
import z71.x;
import z8.g;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends j implements e {
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.y = obj;
        this.z = obj2;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                return new b((c) this.x, (oa.j) this.y, (f) this.z, cVar, 0);
            case 1:
                b bVar = new b((a2) this.y, (f1) this.z, cVar, 1);
                bVar.x = obj;
                return bVar;
            case 2:
                b bVar2 = new b((y71.j) this.y, (z71.d) this.z, cVar, 2);
                bVar2.x = obj;
                return bVar2;
            case 3:
                return new b((i) this.x, (x) this.y, (e81.i) this.z, cVar, 3);
            case 4:
                b bVar3 = new b((p) this.y, (y71.j) this.z, cVar, 4);
                bVar3.x = obj;
                return bVar3;
            case 5:
                b bVar4 = new b((v8.f) this.y, (z8.d) this.z, cVar, 5);
                bVar4.x = obj;
                return bVar4;
            case 6:
                return new b((ia.d) this.x, (q) this.y, (z8.f) this.z, cVar, 6);
            case 7:
                return new b((z9.b) this.x, (aa.d) this.y, (t) this.z, cVar, 7);
            default:
                b bVar5 = new b((z9.b) this.y, (aa.d) this.z, cVar, 8);
                bVar5.x = obj;
                return bVar5;
        }
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                return r((a71.c) obj2, (z) obj).v(a0.a);
            case 1:
                return r((a71.c) obj2, (x1) obj).v(a0.a);
            case 2:
                return r((a71.c) obj2, (z) obj).v(a0.a);
            case 3:
                return r((a71.c) obj2, (z) obj).v(a0.a);
            case 4:
                return r((a71.c) obj2, (z) obj).v(a0.a);
            case 5:
                return r((a71.c) obj2, (t) obj).v(a0.a);
            case 6:
                return r((a71.c) obj2, (z) obj).v(a0.a);
            case 7:
                return r((a71.c) obj2, (z) obj).v(a0.a);
            default:
                return r((a71.c) obj2, (t) obj).v(a0.a);
        }
    }

    public final Object v(Object obj) {
        Object a;
        nf.j eVar;
        int i = this.v;
        a0 a0Var = a0.a;
        Object obj2 = this.z;
        Object obj3 = this.y;
        switch (i) {
            case 0:
                c cVar = (c) this.x;
                b71.a aVar = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    y.j(obj);
                    this.w = 1;
                    a = cVar.b.a((oa.j) obj3, (f) obj2, this);
                    if (a == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    a = obj;
                }
                String str = (String) a;
                if (str == null) {
                    return null;
                }
                cVar.a.getClass();
                return fk.c.a(str);
            case 1:
                a2 a2Var = (a2) obj3;
                b71.a aVar2 = b71.a.r;
                int i3 = this.w;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                x1 x1Var = (x1) this.x;
                f8 J = androidx.compose.runtime.t.J(new o0(18, a2Var));
                c00.f fVar = new c00.f(x1Var, a2Var, (f1) obj2, 26);
                this.w = 1;
                return J.b(fVar, this) == aVar2 ? aVar2 : a0Var;
            case 2:
                b71.a aVar3 = b71.a.r;
                int i4 = this.w;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                v g = ((z71.d) obj2).g((z) this.x);
                this.w = 1;
                Object r = n1.r((y71.j) obj3, g, true, this);
                if (r != aVar3) {
                    r = a0Var;
                }
                return r == aVar3 ? aVar3 : a0Var;
            case 3:
                e81.i iVar = (e81.i) obj2;
                b71.a aVar4 = b71.a.r;
                int i5 = this.w;
                try {
                    if (i5 == 0) {
                        y.j(obj);
                        this.w = 1;
                        if (((i) this.x).b((x) obj3, this) == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                    }
                    return a0Var;
                } finally {
                    iVar.c();
                }
            case 4:
                b71.a aVar5 = b71.a.r;
                int i6 = this.w;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                p pVar = (p) obj3;
                this.w = 1;
                return pVar.f((z) this.x, (y71.j) obj2, this) == aVar5 ? aVar5 : a0Var;
            case 5:
                z8.d dVar = (z8.d) obj2;
                ConnectivityManager connectivityManager = dVar.a;
                b71.a aVar6 = b71.a.r;
                int i7 = this.w;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                s sVar = (t) this.x;
                NetworkRequest a2 = ((v8.f) obj3).a();
                if (a2 == null) {
                    s sVar2 = sVar;
                    sVar2.getClass();
                    sVar2.e((Throwable) null);
                    return a0Var;
                }
                z0 z0Var = new z0(16, b0.z(sVar, (h) null, (v71.a0) null, new v4(dVar, sVar, (a71.c) null, 29), 3), sVar);
                if (Build.VERSION.SDK_INT >= 30) {
                    g.a.getClass();
                    eVar = g.a(connectivityManager, a2, z0Var);
                } else {
                    int i8 = b9.i.c;
                    b9.i iVar2 = new b9.i(z0Var);
                    k71.s sVar3 = new k71.s();
                    try {
                        v8.x a3 = v8.x.a();
                        int i9 = z8.h.a;
                        a3.getClass();
                        connectivityManager.registerNetworkCallback(a2, (ConnectivityManager.NetworkCallback) iVar2);
                        sVar3.r = true;
                    } catch (RuntimeException e) {
                        if (!w.x(e.getClass().getName(), "TooManyRequestsException", false)) {
                            throw e;
                        }
                        v8.x a4 = v8.x.a();
                        int i11 = z8.h.a;
                        a4.getClass();
                        z0Var.k(new z8.b(7));
                    }
                    eVar = new com.github.rudroid.actions.workflowruns.ui.e(sVar3, connectivityManager, iVar2, 27);
                }
                qd.g gVar = new qd.g(18, eVar);
                this.w = 1;
                return t.z.f(sVar, gVar, this) == aVar6 ? aVar6 : a0Var;
            case 6:
                q qVar = (q) obj3;
                b71.a aVar7 = b71.a.r;
                int i12 = this.w;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                ia.d dVar2 = (ia.d) this.x;
                dVar2.getClass();
                k.g(qVar, "spec");
                ArrayList arrayList = dVar2.a;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj4 = arrayList.get(i13);
                    i13++;
                    if (((a9.d) obj4).b(qVar)) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList(n.F(arrayList2, 10));
                int size2 = arrayList2.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj5 = arrayList2.get(i14);
                    i14++;
                    arrayList3.add(((a9.d) obj5).a(qVar.j));
                }
                i p = n1.p(new c00.p((i[]) m.F0(arrayList3).toArray(new i[0]), 4));
                u7 u7Var = new u7(21, (z8.f) obj2, qVar);
                this.w = 1;
                return p.b(u7Var, this) == aVar7 ? aVar7 : a0Var;
            case 7:
                b71.a aVar8 = b71.a.r;
                int i15 = this.w;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                z9.b bVar = (z9.b) this.x;
                l3.y yVar = bVar.r;
                aa.d d = ((aa.d) obj3).d();
                g0 d2 = bVar.s.d(bVar.w).d(bVar.z).d(d.c);
                k.g(d2, "executionContext");
                d.c = d2;
                ba.f fVar2 = d.d;
                if (fVar2 == null) {
                    fVar2 = null;
                }
                d.d = fVar2;
                Boolean bool = d.g;
                if (bool == null) {
                    bool = null;
                }
                d.g = bool;
                Boolean bool2 = d.h;
                if (bool2 == null) {
                    bool2 = null;
                }
                d.h = bool2;
                Boolean bool3 = d.f;
                if (bool3 == null) {
                    bool3 = null;
                }
                d.f = bool3;
                y61.b i16 = d0.i();
                List list = r.r;
                i16.addAll(list);
                List list2 = d.e;
                if (list2 != null) {
                    list = list2;
                }
                i16.addAll(list);
                d.e = d0.h(i16);
                Boolean bool4 = d.i;
                if (bool4 == null) {
                    bool4 = null;
                }
                d.i = bool4;
                Boolean bool5 = d.j;
                d.j = bool5 != null ? bool5 : null;
                d.k = bVar.y;
                aa.d b = d.b();
                y61.b i17 = d0.i();
                i17.addAll(yVar.a);
                i17.addAll((ArrayList) yVar.d);
                i17.addAll((ArrayList) yVar.e);
                int i18 = com.apollographql.apollo.interceptor.h.a;
                i17.add(new com.apollographql.apollo.interceptor.f());
                i17.addAll((ArrayList) yVar.f);
                i17.add(bVar.A);
                y61.b h = d0.h(i17);
                k.g(h, "interceptors");
                if (h.a() <= 0) {
                    throw new IllegalStateException("Check failed.");
                }
                i a5 = ((com.apollographql.apollo.interceptor.b) h.get(0)).a(b, new b21.v(h, 1, 1));
                o oVar = new o((t) obj2, 2);
                this.w = 1;
                return a5.b(oVar, this) == aVar8 ? aVar8 : a0Var;
            default:
                z9.b bVar2 = (z9.b) obj3;
                b71.a aVar9 = b71.a.r;
                int i19 = this.w;
                try {
                    if (i19 == 0) {
                        y.j(obj);
                        t tVar = (t) this.x;
                        Iterator it = bVar2.x.iterator();
                        if (it.hasNext()) {
                            throw f4.g(it);
                        }
                        v71.v vVar = bVar2.s.a;
                        b bVar3 = new b(bVar2, (aa.d) obj2, tVar, null, 7);
                        this.w = 1;
                        if (b0.L(vVar, bVar3, this) == aVar9) {
                            return aVar9;
                        }
                    } else {
                        if (i19 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                    }
                    Iterator it2 = bVar2.x.iterator();
                    if (it2.hasNext()) {
                        throw f4.g(it2);
                    }
                    return a0Var;
                } catch (Throwable th2) {
                    Iterator it3 = bVar2.x.iterator();
                    if (it3.hasNext()) {
                        throw f4.g(it3);
                    }
                    throw th2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Object obj3, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }
    public Object A = null;
}
