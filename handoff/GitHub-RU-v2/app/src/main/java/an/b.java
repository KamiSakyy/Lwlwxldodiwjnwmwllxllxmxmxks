package an;

import a0.k0;
import a61.n0;
import aa.i0;
import android.graphics.Bitmap;
import android.view.View;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.i2;
import androidx.compose.runtime.w0;
import b1.o;
import b1.r;
import b1.s;
import b1.t;
import c00.u;
import d1.z1;
import do0.q;
import g3.m0;
import h0.e2;
import h0.i3;
import ik.p0;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k71.w;
import kotlin.KotlinNothingValueException;
import l3.p;
import l3.v;
import q2.x;
import rm0.b2;
import s0.g1;
import s0.o0;
import s0.t0;
import sy.y;
import t00.f8;
import t00.s1;
import v71.b0;
import v71.d1;
import v71.z;
import vb0.k1;
import w2.l0;
import w61.a0;
import wy0.l1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends c71.j implements j71.e {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int v;
    public int w;
    public Object x;
    public Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.github.service.wrapper.b bVar, i0 i0Var, String str, a71.c cVar) {
        super(2, cVar);
        this.v = 4;
        this.z = bVar;
        this.B = i0Var;
        this.A = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                b bVar = new b((c) this.y, (oa.j) this.z, (String) this.A, (com.github.rudroid.viewmodels.tasklist.c) this.B, cVar, 0);
                bVar.x = obj;
                return bVar;
            case 1:
                b bVar2 = new b(this.z, (Serializable) this.A, this.B, cVar, 1);
                bVar2.x = obj;
                return bVar2;
            case 2:
                b bVar3 = new b((l0) this.y, (j71.c) this.z, (b1.b) this.A, (o) this.B, cVar, 2);
                bVar3.x = obj;
                return bVar3;
            case 3:
                return new b((w) this.y, (u) this.z, (String) this.A, (String) this.B, cVar, 3);
            case 4:
                b bVar4 = new b((com.github.service.wrapper.b) this.z, (i0) this.B, (String) this.A, cVar);
                bVar4.x = obj;
                return bVar4;
            case 5:
                return new b((w) this.y, (u) this.z, (String) this.A, (String) this.B, cVar, 5);
            case 6:
                return new b((r9.k) this.x, (g9.h) this.y, (s9.h) this.z, (g9.c) this.A, (Bitmap) this.B, cVar, 6);
            case 7:
                b bVar5 = new b((x) this.y, (j71.f) this.z, (j71.c) this.A, (e2) this.B, cVar);
                bVar5.x = obj;
                return bVar5;
            case 8:
                b bVar6 = new b((j71.e) this.y, (d8.m) this.z, (z) this.A, (AtomicReference) this.B, cVar, 8);
                bVar6.x = obj;
                return bVar6;
            case 9:
                b bVar7 = new b((b2) this.z, (String) this.A, (String) this.B, cVar, 9);
                bVar7.x = obj;
                return bVar7;
            case 10:
                return new b((o0) this.x, (f1) this.y, (l3.w) this.z, (z1) this.A, (l3.j) this.B, cVar, 10);
            case 11:
                return new b((p0.c) this.x, (v) this.y, (o0) this.z, (g1) this.A, (p) this.B, cVar, 11);
            case 12:
                b bVar8 = new b((s1) this.z, (String) this.A, (String) this.B, cVar, 12);
                bVar8.x = obj;
                return bVar8;
            case 13:
                b bVar9 = new b((k1) this.z, (String) this.A, (String) this.B, cVar, 13);
                bVar9.x = obj;
                return bVar9;
            default:
                b bVar10 = new b((l1) this.z, (String) this.A, (String) this.B, cVar, 14);
                bVar10.x = obj;
                return bVar10;
        }
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                return r((a71.c) obj2, (String) obj).v(a0.a);
            case 1:
                return r((a71.c) obj2, (z) obj).v(a0.a);
            case 2:
                r((a71.c) obj2, (z) obj).v(a0.a);
                return b71.a.r;
            case 3:
                return r((a71.c) obj2, (y71.j) obj).v(a0.a);
            case 4:
                return r((a71.c) obj2, (y71.j) obj).v(a0.a);
            case 5:
                return r((a71.c) obj2, (y71.j) obj).v(a0.a);
            case 6:
                return r((a71.c) obj2, (z) obj).v(a0.a);
            case 7:
                return r((a71.c) obj2, (z) obj).v(a0.a);
            case 8:
                return r((a71.c) obj2, (z) obj).v(a0.a);
            case 9:
                return r((a71.c) obj2, (y71.j) obj).v(a0.a);
            case 10:
                return r((a71.c) obj2, (z) obj).v(a0.a);
            case 11:
                return r((a71.c) obj2, (z) obj).v(a0.a);
            case 12:
                return r((a71.c) obj2, (y71.j) obj).v(a0.a);
            case 13:
                return r((a71.c) obj2, (y71.j) obj).v(a0.a);
            default:
                return r((a71.c) obj2, (y71.j) obj).v(a0.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x0576 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x050a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        y1 y1Var;
        p1.b bVar;
        p1.b bVar2;
        androidx.fragment.app.i0 i0Var;
        d1 d1Var;
        i2 i2Var;
        List H;
        p1.b bVar3;
        i2 i2Var2;
        Object o;
        w wVar;
        Object c;
        Object p;
        w wVar2;
        Object f;
        Object f2;
        Object f3;
        Object f4;
        switch (this.v) {
            case 0:
                String str = (String) this.x;
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                p0 p0Var = ((c) this.y).a;
                oa.j jVar = (oa.j) this.z;
                String str2 = (String) this.A;
                com.github.rudroid.viewmodels.tasklist.c cVar = (com.github.rudroid.viewmodels.tasklist.c) this.B;
                this.x = null;
                this.w = 1;
                Object a = p0Var.a(jVar, str2, str, cVar, this);
                return a == aVar ? aVar : a;
            case 1:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    y.j(obj);
                    d1 r = b0.r(((z) this.x).K());
                    i2 i2Var3 = (i2) this.z;
                    synchronized (i2Var3.d) {
                        Throwable th2 = i2Var3.f;
                        if (th2 != null) {
                            throw th2;
                        }
                        if (((androidx.compose.runtime.e2) i2Var3.v.getValue()).compareTo(androidx.compose.runtime.e2.s) <= 0) {
                            throw new IllegalStateException("Recomposer shut down");
                        }
                        if (i2Var3.e != null) {
                            throw new IllegalStateException("Recomposer already running");
                        }
                        i2Var3.e = r;
                        i2Var3.C();
                    }
                    k0 k0Var = new k0(6, (i2) this.z);
                    v1.m.e(v1.m.a);
                    synchronized (v1.m.c) {
                        v1.m.h = x61.m.m0((Collection) v1.m.h, k0Var);
                    }
                    androidx.fragment.app.i0 i0Var2 = new androidx.fragment.app.i0(k0Var);
                    y1 y1Var2 = i2.A;
                    androidx.compose.runtime.i iVar = ((i2) this.z).z;
                    try {
                        do {
                            y1Var = i2.A;
                            bVar = (m1.e) y1Var.getValue();
                            bVar2 = bVar;
                            q1.b bVar4 = q1.b.a;
                            o1.c cVar2 = bVar2.t;
                            if (!cVar2.containsKey(iVar)) {
                                if (bVar2.isEmpty()) {
                                    bVar3 = new p1.b(iVar, iVar, cVar2.b(iVar, new p1.a(bVar4, bVar4)));
                                } else {
                                    Object obj2 = bVar2.s;
                                    Object obj3 = cVar2.get(obj2);
                                    k71.k.d(obj3);
                                    bVar3 = new p1.b(bVar2.r, iVar, cVar2.b(obj2, new p1.a(((p1.a) obj3).a, iVar)).b(iVar, new p1.a(obj2, bVar4)));
                                }
                                bVar2 = bVar3;
                            }
                            if (bVar != bVar2) {
                            }
                            i2Var = (i2) this.z;
                            synchronized (i2Var.d) {
                                H = i2Var.H();
                            }
                            int size = H.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                ((androidx.compose.runtime.a0) H.get(i3)).x();
                            }
                            a61.o oVar = new a61.o((h2) this.A, (w0) this.B, (a71.c) null, 3);
                            this.x = r;
                            this.y = i0Var2;
                            this.w = 1;
                            if (b0.k(oVar, this) == aVar2) {
                                return aVar2;
                            }
                            i0Var = i0Var2;
                            d1Var = r;
                        } while (!y1Var.i(bVar, bVar2));
                        i2Var = (i2) this.z;
                        synchronized (i2Var.d) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i0Var = i0Var2;
                        d1Var = r;
                        i0Var.a();
                        i2Var2 = (i2) this.z;
                        synchronized (i2Var2.d) {
                            try {
                                if (i2Var2.e == d1Var) {
                                    i2Var2.e = null;
                                }
                                i2Var2.C();
                            } catch (Throwable th4) {
                                throw th4;
                            }
                        }
                        y1 y1Var3 = i2.A;
                        androidx.compose.runtime.i.b(((i2) this.z).z);
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i0Var = (androidx.fragment.app.i0) this.y;
                    d1Var = (d1) this.x;
                    try {
                        y.j(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        i0Var.a();
                        i2Var2 = (i2) this.z;
                        synchronized (i2Var2.d) {
                        }
                    }
                }
                i0Var.a();
                i2 i2Var4 = (i2) this.z;
                synchronized (i2Var4.d) {
                    try {
                        if (i2Var4.e == d1Var) {
                            i2Var4.e = null;
                        }
                        i2Var4.C();
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                y1 y1Var4 = i2.A;
                androidx.compose.runtime.i.b(((i2) this.z).z);
                return a0.a;
            case 2:
                b1.b bVar5 = (b1.b) this.A;
                l0 l0Var = (l0) this.y;
                b71.a aVar3 = b71.a.r;
                int i4 = this.w;
                try {
                    if (i4 != 0) {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                        throw new KotlinNothingValueException();
                    }
                    y.j(obj);
                    z zVar = (z) this.x;
                    r rVar = s.a;
                    View view = l0Var.r;
                    rVar.getClass();
                    b1.m mVar = new b1.m(view);
                    t tVar = new t(l0Var.r, new b1.a((o) this.B), mVar);
                    if (a1.f.a) {
                        b0.z(zVar, (a71.h) null, (v71.a0) null, new n0(bVar5, mVar, (a71.c) null, 6), 3);
                    }
                    j71.c cVar3 = (j71.c) this.z;
                    if (cVar3 != null) {
                        cVar3.k(tVar);
                    }
                    bVar5.c = tVar;
                    this.w = 1;
                    l0Var.a(tVar, this);
                    return aVar3;
                } catch (Throwable th7) {
                    bVar5.c = null;
                    throw th7;
                }
            case 3:
                b71.a aVar4 = b71.a.r;
                int i5 = this.w;
                if (i5 == 0) {
                    y.j(obj);
                    w wVar3 = (w) this.y;
                    u uVar = (u) this.z;
                    String str3 = (String) this.A;
                    String str4 = (String) this.B;
                    this.x = wVar3;
                    this.w = 1;
                    o = u.o(uVar, str3, str4, this);
                    if (o == aVar4) {
                        return aVar4;
                    }
                    wVar = wVar3;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wVar = (w) this.x;
                    y.j(obj);
                    o = obj;
                }
                wVar.r = o;
                return a0.a;
            case 4:
                y71.j jVar2 = (y71.j) this.x;
                b71.a aVar5 = b71.a.r;
                int i6 = this.w;
                if (i6 == 0) {
                    y.j(obj);
                    com.github.service.wrapper.b bVar6 = (com.github.service.wrapper.b) this.z;
                    i0 i0Var3 = (i0) this.B;
                    String str5 = (String) this.A;
                    this.x = null;
                    this.y = jVar2;
                    this.w = 1;
                    c = bVar6.c(i0Var3, str5);
                    if (c == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                        return a0.a;
                    }
                    jVar2 = (y71.j) this.y;
                    y.j(obj);
                    c = obj;
                }
                this.x = null;
                this.y = null;
                this.w = 2;
                if (jVar2.c(c, this) == aVar5) {
                    return aVar5;
                }
                return a0.a;
            case 5:
                b71.a aVar6 = b71.a.r;
                int i7 = this.w;
                if (i7 == 0) {
                    y.j(obj);
                    w wVar4 = (w) this.y;
                    u uVar2 = (u) this.z;
                    String str6 = (String) this.A;
                    String str7 = (String) this.B;
                    this.x = wVar4;
                    this.w = 1;
                    p = u.p(uVar2, str6, str7, this);
                    if (p == aVar6) {
                        return aVar6;
                    }
                    wVar2 = wVar4;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wVar2 = (w) this.x;
                    y.j(obj);
                    p = obj;
                }
                wVar2.r = p;
                return a0.a;
            case 6:
                b71.a aVar7 = b71.a.r;
                int i8 = this.w;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                r9.k kVar = (r9.k) this.x;
                m9.i iVar2 = new m9.i(kVar, ((g9.h) this.y).j, 0, kVar, (s9.h) this.z, (g9.c) this.A, ((Bitmap) this.B) != null);
                this.w = 1;
                Object c2 = iVar2.c(kVar, this);
                return c2 == aVar7 ? aVar7 : c2;
            case 7:
                b71.a aVar8 = b71.a.r;
                int i9 = this.w;
                if (i9 == 0) {
                    y.j(obj);
                    z zVar2 = (z) this.x;
                    x xVar = (x) this.y;
                    i3 i3Var = new i3(zVar2, (c71.j) this.z, (j71.c) this.A, (e2) this.B, (a71.c) null);
                    this.w = 1;
                    if (h0.h.g(xVar, i3Var, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 8:
                b71.a aVar9 = b71.a.r;
                int i11 = this.w;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                k6.v vVar = new k6.v((z) this.x, (d8.m) this.z, (z) this.A, (j71.e) this.y, (AtomicReference) this.B);
                j71.e eVar = (j71.e) this.y;
                this.w = 1;
                Object s = eVar.s(vVar, this);
                return s == aVar9 ? aVar9 : s;
            case 9:
                y71.j jVar3 = (y71.j) this.x;
                b71.a aVar10 = b71.a.r;
                int i12 = this.w;
                if (i12 == 0) {
                    y.j(obj);
                    sm0.r rVar2 = ((b2) this.z).x;
                    String str8 = (String) this.A;
                    String str9 = (String) this.B;
                    this.x = null;
                    this.y = jVar3;
                    this.w = 1;
                    f = rVar2.f(str8, str9, this);
                    if (f == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                        return a0.a;
                    }
                    jVar3 = (y71.j) this.y;
                    y.j(obj);
                    f = obj;
                }
                this.x = null;
                this.y = null;
                this.w = 2;
                if (jVar3.c(f, this) == aVar10) {
                    return aVar10;
                }
                return a0.a;
            case 10:
                o0 o0Var = (o0) this.x;
                b71.a aVar11 = b71.a.r;
                int i13 = this.w;
                try {
                    if (i13 == 0) {
                        y.j(obj);
                        f8 J = androidx.compose.runtime.t.J(new de.f((f1) this.y, 12));
                        q qVar = new q(o0Var, (l3.w) this.z, (z1) this.A, (l3.j) this.B, 10);
                        this.w = 1;
                        if (J.b(qVar, this) == aVar11) {
                            return aVar11;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                    }
                    s0.s.s(o0Var);
                    return a0.a;
                } catch (Throwable th8) {
                    s0.s.s(o0Var);
                    throw th8;
                }
            case 11:
                a0 a0Var = a0.a;
                b71.a aVar12 = b71.a.r;
                int i14 = this.w;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0Var;
                }
                y.j(obj);
                p0.c cVar4 = (p0.c) this.x;
                v vVar2 = (v) this.y;
                t0 t0Var = ((o0) this.z).a;
                m0 m0Var = ((g1) this.A).a;
                p pVar = (p) this.B;
                this.w = 1;
                int m = pVar.m(g3.p0.e(vVar2.b));
                Object a2 = cVar4.a(m < m0Var.a.a.s.length() ? m0Var.b(m) : m != 0 ? m0Var.b(m - 1) : new c2.c(0.0f, 0.0f, 1.0f, (int) (s0.w0.b(t0Var.b, t0Var.g, t0Var.h) & 4294967295L)), this);
                if (a2 != aVar12) {
                    a2 = a0Var;
                }
                return a2 == aVar12 ? aVar12 : a0Var;
            case 12:
                y71.j jVar4 = (y71.j) this.x;
                b71.a aVar13 = b71.a.r;
                int i15 = this.w;
                if (i15 == 0) {
                    y.j(obj);
                    u00.q qVar2 = ((s1) this.z).x;
                    String str10 = (String) this.A;
                    String str11 = (String) this.B;
                    this.x = null;
                    this.y = jVar4;
                    this.w = 1;
                    f2 = qVar2.f(str10, str11, this);
                    if (f2 == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                        return a0.a;
                    }
                    jVar4 = (y71.j) this.y;
                    y.j(obj);
                    f2 = obj;
                }
                this.x = null;
                this.y = null;
                this.w = 2;
                if (jVar4.c(f2, this) == aVar13) {
                    return aVar13;
                }
                return a0.a;
            case 13:
                y71.j jVar5 = (y71.j) this.x;
                b71.a aVar14 = b71.a.r;
                int i16 = this.w;
                if (i16 == 0) {
                    y.j(obj);
                    wb0.q qVar3 = ((k1) this.z).x;
                    String str12 = (String) this.A;
                    String str13 = (String) this.B;
                    this.x = null;
                    this.y = jVar5;
                    this.w = 1;
                    f3 = qVar3.f(str12, str13, this);
                    if (f3 == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                        return a0.a;
                    }
                    jVar5 = (y71.j) this.y;
                    y.j(obj);
                    f3 = obj;
                }
                this.x = null;
                this.y = null;
                this.w = 2;
                if (jVar5.c(f3, this) == aVar14) {
                    return aVar14;
                }
                return a0.a;
            default:
                y71.j jVar6 = (y71.j) this.x;
                b71.a aVar15 = b71.a.r;
                int i17 = this.w;
                if (i17 == 0) {
                    y.j(obj);
                    xy0.q qVar4 = ((l1) this.z).x;
                    String str14 = (String) this.A;
                    String str15 = (String) this.B;
                    this.x = null;
                    this.y = jVar6;
                    this.w = 1;
                    f4 = qVar4.f(str14, str15, this);
                    if (f4 == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                        return a0.a;
                    }
                    jVar6 = (y71.j) this.y;
                    y.j(obj);
                    f4 = obj;
                }
                this.x = null;
                this.y = null;
                this.w = 2;
                if (jVar6.c(f4, this) == aVar15) {
                    return aVar15;
                }
                return a0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Serializable serializable, Object obj2, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.z = obj;
        this.A = serializable;
        this.B = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
        this.B = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x xVar, j71.f fVar, j71.c cVar, e2 e2Var, a71.c cVar2) {
        super(2, cVar2);
        this.v = 7;
        this.y = xVar;
        this.z = (c71.j) fVar;
        this.A = cVar;
        this.B = e2Var;
    }
}
