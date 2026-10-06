package c00;

import aa.h0;
import aa.i0;
import aa.u0;
import aa.w0;
import com.github.service.models.response.discussions.type.DiscussionCloseReason;
import com.github.service.models.response.projects.ProjectsMetaInfo;
import e50.e0;
import e50.l0;
import e50.x;
import gn0.a9;
import gn0.c9;
import gn0.g9;
import hc0.o8;
import hc0.q8;
import hc0.u8;
import java.util.List;
import jn0.i90;
import jn0.j90;
import jn0.k90;
import jn0.l90;
import jo.wb0;
import jo.xb0;
import jo.yb0;
import jo.zb0;
import k71.w;
import kc0.l50;
import kc0.m50;
import kc0.n50;
import kc0.o50;
import kotlin.NoWhenBranchMatchedException;
import m10.fd;
import m10.hd;
import m10.ld;
import pz0.ba;
import pz0.da;
import pz0.ha;
import rm0.b2;
import rm0.g2;
import sy.y;
import t00.f8;
import t00.s1;
import u10.n30;
import u10.o30;
import u10.p30;
import u10.q30;
import vb0.k1;
import w61.a0;
import wy0.l1;
import y71.n1;
import z01.p0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends c71.j implements j71.f {
    public final /* synthetic */ String A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ Object x;
    public /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(a71.c cVar, com.github.rudroid.common.b bVar, String str, Object obj, int i) {
        super(3, cVar);
        this.v = i;
        this.z = bVar;
        this.A = str;
        this.B = obj;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        switch (this.v) {
            case 0:
                a aVar = new a((a71.c) obj3, (u) this.z, this.A, (w) this.B, 0);
                aVar.x = jVar;
                aVar.y = obj2;
                return aVar.v(a0.a);
            case 1:
                a aVar2 = new a((a71.c) obj3, (u) this.z, this.A, (w0) this.B, 1);
                aVar2.x = jVar;
                aVar2.y = obj2;
                return aVar2.v(a0.a);
            case 2:
                a aVar3 = new a((a71.c) obj3, (u) this.z, this.A, (w) this.B, 2);
                aVar3.x = jVar;
                aVar3.y = obj2;
                return aVar3.v(a0.a);
            case 3:
                a aVar4 = new a((a71.c) obj3, (u) this.z, this.A, (w0) this.B, 3);
                aVar4.x = jVar;
                aVar4.y = obj2;
                return aVar4.v(a0.a);
            case 4:
                a aVar5 = new a((a71.c) obj3, (il.p) this.z, (oa.j) this.B, this.A, 4);
                aVar5.x = jVar;
                aVar5.y = obj2;
                return aVar5.v(a0.a);
            case 5:
                a aVar6 = new a((w) this.B, (com.github.service.wrapper.b) this.y, (i0) this.z, this.A, (a71.c) obj3);
                aVar6.x = (Throwable) obj2;
                aVar6.v(a0.a);
                return b71.a.r;
            case 6:
                a aVar7 = new a((a71.c) obj3, (com.github.rudroid.common.b) this.z, this.A, this.B, 6);
                aVar7.x = jVar;
                aVar7.y = obj2;
                return aVar7.v(a0.a);
            case 7:
                a aVar8 = new a((a71.c) obj3, (com.github.rudroid.common.b) this.z, this.A, this.B, 7);
                aVar8.x = jVar;
                aVar8.y = obj2;
                return aVar8.v(a0.a);
            case 8:
                a aVar9 = new a((a71.c) obj3, (s1) this.z, this.A, (DiscussionCloseReason) this.B, 8);
                aVar9.x = jVar;
                aVar9.y = obj2;
                return aVar9.v(a0.a);
            case 9:
                a aVar10 = new a((a71.c) obj3, (s1) this.z, this.A, (b01.e) this.B, 9);
                aVar10.x = jVar;
                aVar10.y = obj2;
                return aVar10.v(a0.a);
            case 10:
                a aVar11 = new a((a71.c) obj3, (com.github.rudroid.common.b) this.z, this.A, this.B, 10);
                aVar11.x = jVar;
                aVar11.y = obj2;
                return aVar11.v(a0.a);
            case 11:
                a aVar12 = new a((a71.c) obj3, (com.github.rudroid.common.b) this.z, this.A, this.B, 11);
                aVar12.x = jVar;
                aVar12.y = obj2;
                return aVar12.v(a0.a);
            case 12:
                a aVar13 = new a((a71.c) obj3, (ProjectsMetaInfo) this.z, (t00.k) this.B, this.A, 12);
                aVar13.x = jVar;
                aVar13.y = obj2;
                return aVar13.v(a0.a);
            case 13:
                a aVar14 = new a((a71.c) obj3, (com.github.rudroid.common.b) this.z, this.A, this.B, 13);
                aVar14.x = jVar;
                aVar14.y = obj2;
                return aVar14.v(a0.a);
            default:
                a aVar15 = new a((a71.c) obj3, (com.github.rudroid.common.b) this.z, this.A, this.B, 14);
                aVar15.x = jVar;
                aVar15.y = obj2;
                return aVar15.v(a0.a);
        }
    }

    public final Object v(Object obj) {
        g9 g9Var;
        l50 l50Var;
        ld ldVar;
        wb0 wb0Var;
        u8 u8Var;
        n30 n30Var;
        ha haVar;
        i90 i90Var;
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    y.j(obj);
                    y71.j jVar = (y71.j) this.x;
                    y71.i m = u.m((u) this.z, this.A, (List) ((w) this.B).r);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (n1.q(jVar, m, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 1:
                u uVar = (u) this.z;
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    y.j(obj);
                    y71.j jVar2 = (y71.j) this.x;
                    vz.b bVar = (vz.b) this.y;
                    String str = this.A;
                    a71.c cVar = null;
                    y71.i b = bVar == null ? uVar.b(str, "") : n1.I(new g(new g(new y00.l(new f8(new c(sy.q.i(bVar).size(), uVar, str, cVar, 0)), 10), uVar, bVar, 2), uVar, (w0) this.B, 3), new m(cVar, uVar, str, 1));
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (n1.q(jVar2, b, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 2:
                b71.a aVar3 = b71.a.r;
                int i3 = this.w;
                if (i3 == 0) {
                    y.j(obj);
                    y71.j jVar3 = (y71.j) this.x;
                    y71.i n = u.n((u) this.z, this.A, (List) ((w) this.B).r);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (n1.q(jVar3, n, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 3:
                u uVar2 = (u) this.z;
                b71.a aVar4 = b71.a.r;
                int i4 = this.w;
                if (i4 == 0) {
                    y.j(obj);
                    y71.j jVar4 = (y71.j) this.x;
                    yx0.b bVar2 = (yx0.b) this.y;
                    String str2 = this.A;
                    a71.c cVar2 = null;
                    y71.i b2 = bVar2 == null ? uVar2.b(str2, "") : n1.I(new g(new g(new y00.l(new f8(new c(t.e.k(bVar2).size(), uVar2, str2, cVar2, 1)), 10), uVar2, bVar2, 7), uVar2, (w0) this.B, 8), new m(cVar2, uVar2, str2, 5));
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (n1.q(jVar4, b2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 4:
                b71.a aVar5 = b71.a.r;
                int i5 = this.w;
                if (i5 == 0) {
                    y.j(obj);
                    y71.j jVar5 = (y71.j) this.x;
                    y71.i d = ((p0) ((il.p) this.z).a.a((oa.j) this.B)).d((String) this.y, this.A);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (n1.q(jVar5, d, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 5:
                Throwable th2 = (Throwable) this.x;
                b71.a aVar6 = b71.a.r;
                int i6 = this.w;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    throw th2;
                }
                y.j(obj);
                h0 h0Var = (h0) ((w) this.B).r;
                if (h0Var == null) {
                    throw th2;
                }
                com.github.service.wrapper.b bVar3 = (com.github.service.wrapper.b) this.y;
                i0 i0Var = (i0) this.z;
                this.x = th2;
                this.w = 1;
                if (bVar3.p(i0Var, h0Var, this.A, this) == aVar6) {
                    return aVar6;
                }
                throw th2;
            case 6:
                b71.a aVar7 = b71.a.r;
                int i7 = this.w;
                if (i7 == 0) {
                    y.j(obj);
                    y71.j jVar6 = (y71.j) this.x;
                    id0.c cVar3 = (id0.c) this.y;
                    com.github.service.wrapper.b bVar4 = ((b2) this.z).s;
                    DiscussionCloseReason discussionCloseReason = (DiscussionCloseReason) this.B;
                    k71.k.g(discussionCloseReason, "<this>");
                    int i8 = rl0.a.a[discussionCloseReason.ordinal()];
                    if (i8 == 1) {
                        g9Var = g9.s;
                    } else if (i8 == 2) {
                        g9Var = g9.t;
                    } else if (i8 == 3) {
                        g9Var = g9.u;
                    } else {
                        if (i8 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        g9Var = g9.v;
                    }
                    y71.i k = bVar4.k(new id0.e(new u0(g9Var), this.A), cVar3);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (n1.q(jVar6, k, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 7:
                b2 b2Var = (b2) this.z;
                b01.e eVar = (b01.e) this.B;
                String str3 = eVar.a;
                b71.a aVar8 = b71.a.r;
                int i9 = this.w;
                if (i9 == 0) {
                    y.j(obj);
                    y71.j jVar7 = (y71.j) this.x;
                    uf0.a0 a0Var = (uf0.a0) this.y;
                    String str4 = this.A;
                    if (a0Var != null) {
                        a9.Companion.getClass();
                        String str5 = ((aa.q) a9.l).a;
                        uf0.p0 p0Var = a0Var.k;
                        c9.Companion.getClass();
                        String str6 = ((aa.q) c9.a).a;
                        String str7 = eVar.a;
                        String str8 = eVar.b;
                        String str9 = eVar.c;
                        boolean z = eVar.d;
                        boolean z2 = eVar.e;
                        String str10 = eVar.f;
                        String str11 = eVar.g;
                        l50Var = new l50(new n50(new m50(str5, str4, uf0.a0.a(a0Var, new uf0.p0(p0Var.a, p0Var.b, p0Var.c, p0Var.d, p0Var.e, p0Var.f, p0Var.g, p0Var.h, p0Var.i, p0Var.j, p0Var.k, p0Var.l, p0Var.m, p0Var.n, p0Var.o, new uf0.i0(str6, str3, new wf0.b(str7, str8, str9, z, z2, str10, str11 != null ? new wf0.a(str11) : null, str6)), p0Var.q, p0Var.r, p0Var.s, p0Var.t, p0Var.u, p0Var.v), (yh0.a) null, 7167))));
                    } else {
                        l50Var = null;
                    }
                    y71.i y = n1.y(b2Var.s.k(new o50(str4, str3), l50Var), b2Var.t);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (n1.q(jVar7, y, this) == aVar8) {
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
                if (i11 == 0) {
                    y.j(obj);
                    y71.j jVar8 = (y71.j) this.x;
                    np.c cVar4 = (np.c) this.y;
                    com.github.service.wrapper.b bVar5 = ((s1) this.z).s;
                    DiscussionCloseReason discussionCloseReason2 = (DiscussionCloseReason) this.B;
                    k71.k.g(discussionCloseReason2, "<this>");
                    int i12 = wy.a.a[discussionCloseReason2.ordinal()];
                    if (i12 == 1) {
                        ldVar = ld.s;
                    } else if (i12 == 2) {
                        ldVar = ld.t;
                    } else if (i12 == 3) {
                        ldVar = ld.u;
                    } else {
                        if (i12 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ldVar = ld.v;
                    }
                    y71.i k2 = bVar5.k(new np.e(new u0(ldVar), this.A), cVar4);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (n1.q(jVar8, k2, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 9:
                s1 s1Var = (s1) this.z;
                b01.e eVar2 = (b01.e) this.B;
                String str12 = eVar2.a;
                b71.a aVar10 = b71.a.r;
                int i13 = this.w;
                if (i13 == 0) {
                    y.j(obj);
                    y71.j jVar9 = (y71.j) this.x;
                    is.a0 a0Var2 = (is.a0) this.y;
                    String str13 = this.A;
                    if (a0Var2 != null) {
                        fd.Companion.getClass();
                        String str14 = ((aa.q) fd.l).a;
                        is.p0 p0Var2 = a0Var2.k;
                        hd.Companion.getClass();
                        String str15 = ((aa.q) hd.a).a;
                        String str16 = eVar2.a;
                        String str17 = eVar2.b;
                        String str18 = eVar2.c;
                        boolean z3 = eVar2.d;
                        boolean z4 = eVar2.e;
                        String str19 = eVar2.f;
                        String str20 = eVar2.g;
                        wb0Var = new wb0(new yb0(new xb0(str14, str13, is.a0.a(a0Var2, new is.p0(p0Var2.a, p0Var2.b, p0Var2.c, p0Var2.d, p0Var2.e, p0Var2.f, p0Var2.g, p0Var2.h, p0Var2.i, p0Var2.j, p0Var2.k, p0Var2.l, p0Var2.m, p0Var2.n, p0Var2.o, new is.i0(str15, str12, new ks.b(str16, str17, str18, z3, z4, str19, str20 != null ? new ks.a(str20) : null, str15)), p0Var2.q, p0Var2.r, p0Var2.s, p0Var2.t, p0Var2.u, p0Var2.v), null, 7167))));
                    } else {
                        wb0Var = null;
                    }
                    y71.i y2 = n1.y(s1Var.s.k(new zb0(str13, str12), wb0Var), s1Var.t);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (n1.q(jVar9, y2, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 10:
                b71.a aVar11 = b71.a.r;
                int i14 = this.w;
                if (i14 == 0) {
                    y.j(obj);
                    y71.j jVar10 = (y71.j) this.x;
                    s20.c cVar5 = (s20.c) this.y;
                    com.github.service.wrapper.b bVar6 = ((k1) this.z).s;
                    DiscussionCloseReason discussionCloseReason3 = (DiscussionCloseReason) this.B;
                    k71.k.g(discussionCloseReason3, "<this>");
                    int i15 = xa0.a.a[discussionCloseReason3.ordinal()];
                    if (i15 == 1) {
                        u8Var = u8.s;
                    } else if (i15 == 2) {
                        u8Var = u8.t;
                    } else if (i15 == 3) {
                        u8Var = u8.u;
                    } else {
                        if (i15 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        u8Var = u8.v;
                    }
                    y71.i k3 = bVar6.k(new s20.e(new u0(u8Var), this.A), cVar5);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (n1.q(jVar10, k3, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 11:
                k1 k1Var = (k1) this.z;
                b01.e eVar3 = (b01.e) this.B;
                String str21 = eVar3.a;
                b71.a aVar12 = b71.a.r;
                int i16 = this.w;
                if (i16 == 0) {
                    y.j(obj);
                    y71.j jVar11 = (y71.j) this.x;
                    x xVar = (x) this.y;
                    String str22 = this.A;
                    if (xVar != null) {
                        o8.Companion.getClass();
                        String str23 = ((aa.q) o8.l).a;
                        l0 l0Var = xVar.k;
                        q8.Companion.getClass();
                        String str24 = ((aa.q) q8.a).a;
                        String str25 = eVar3.a;
                        String str26 = eVar3.b;
                        String str27 = eVar3.c;
                        boolean z5 = eVar3.d;
                        boolean z6 = eVar3.e;
                        String str28 = eVar3.f;
                        String str29 = eVar3.g;
                        n30Var = new n30(new p30(new o30(str23, str22, x.a(xVar, new l0(l0Var.a, l0Var.b, l0Var.c, l0Var.d, l0Var.e, l0Var.f, l0Var.g, l0Var.h, l0Var.i, l0Var.j, l0Var.k, l0Var.l, l0Var.m, l0Var.n, l0Var.o, new e0(str24, str21, new g50.b(str25, str26, str27, z5, z6, str28, str29 != null ? new g50.a(str29) : null, str24)), l0Var.q, l0Var.r, l0Var.s, l0Var.t, l0Var.u, l0Var.v), null, 7167))));
                    } else {
                        n30Var = null;
                    }
                    y71.i y3 = n1.y(k1Var.s.k(new q30(str22, str21), n30Var), k1Var.t);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (n1.q(jVar11, y3, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 12:
                b71.a aVar13 = b71.a.r;
                int i17 = this.w;
                if (i17 == 0) {
                    y.j(obj);
                    y71.j jVar12 = (y71.j) this.x;
                    w61.k kVar = (w61.k) this.y;
                    List list = (List) kVar.r;
                    List list2 = (List) kVar.s;
                    ProjectsMetaInfo projectsMetaInfo = (ProjectsMetaInfo) this.z;
                    g2 g2Var = projectsMetaInfo != null ? new g2(p0.j(((t00.k) this.B).u, projectsMetaInfo, this.A, list2), list, 10) : new f8(21, list);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (n1.q(jVar12, g2Var, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 13:
                b71.a aVar14 = b71.a.r;
                int i18 = this.w;
                if (i18 == 0) {
                    y.j(obj);
                    y71.j jVar13 = (y71.j) this.x;
                    io0.c cVar6 = (io0.c) this.y;
                    com.github.service.wrapper.b bVar7 = ((l1) this.z).s;
                    DiscussionCloseReason discussionCloseReason4 = (DiscussionCloseReason) this.B;
                    k71.k.g(discussionCloseReason4, "<this>");
                    int i19 = dx0.a.a[discussionCloseReason4.ordinal()];
                    if (i19 == 1) {
                        haVar = ha.s;
                    } else if (i19 == 2) {
                        haVar = ha.t;
                    } else if (i19 == 3) {
                        haVar = ha.u;
                    } else {
                        if (i19 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        haVar = ha.v;
                    }
                    y71.i k4 = bVar7.k(new io0.e(new u0(haVar), this.A), cVar6);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (n1.q(jVar13, k4, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            default:
                l1 l1Var = (l1) this.z;
                b01.e eVar4 = (b01.e) this.B;
                String str30 = eVar4.a;
                b71.a aVar15 = b71.a.r;
                int i21 = this.w;
                if (i21 == 0) {
                    y.j(obj);
                    y71.j jVar14 = (y71.j) this.x;
                    ar0.a0 a0Var3 = (ar0.a0) this.y;
                    String str31 = this.A;
                    if (a0Var3 != null) {
                        ba.Companion.getClass();
                        String str32 = ((aa.q) ba.l).a;
                        ar0.p0 p0Var3 = a0Var3.k;
                        da.Companion.getClass();
                        String str33 = ((aa.q) da.a).a;
                        String str34 = eVar4.a;
                        String str35 = eVar4.b;
                        String str36 = eVar4.c;
                        boolean z7 = eVar4.d;
                        boolean z8 = eVar4.e;
                        String str37 = eVar4.f;
                        String str38 = eVar4.g;
                        i90Var = new i90(new k90(new j90(str32, str31, ar0.a0.a(a0Var3, new ar0.p0(p0Var3.a, p0Var3.b, p0Var3.c, p0Var3.d, p0Var3.e, p0Var3.f, p0Var3.g, p0Var3.h, p0Var3.i, p0Var3.j, p0Var3.k, p0Var3.l, p0Var3.m, p0Var3.n, p0Var3.o, new ar0.i0(str33, str30, new cr0.b(str34, str35, str36, z7, z8, str37, str38 != null ? new cr0.a(str38) : null, str33)), p0Var3.q, p0Var3.r, p0Var3.s, p0Var3.t, p0Var3.u, p0Var3.v), (gt0.a) null, 7167))));
                    } else {
                        i90Var = null;
                    }
                    y71.i y4 = n1.y(l1Var.s.k(new l90(str31, str30), i90Var), l1Var.t);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (n1.q(jVar14, y4, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(a71.c cVar, Object obj, Object obj2, String str, int i) {
        super(3, cVar);
        this.v = i;
        this.z = obj;
        this.B = obj2;
        this.A = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(w wVar, com.github.service.wrapper.b bVar, i0 i0Var, String str, a71.c cVar) {
        super(3, cVar);
        this.v = 5;
        this.B = wVar;
        this.y = bVar;
        this.z = i0Var;
        this.A = str;
    }
    public Object M(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object O(Object p1, Object p2, Object p3) { return null; }
}
