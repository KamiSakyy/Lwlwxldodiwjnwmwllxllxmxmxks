package bo0;

import aa.t0;
import aa.u0;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;
import com.github.service.models.response.WorkflowRunEvent;
import com.github.service.models.response.type.StatusState;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import m7.y;
import mn.h;
import mn.j;
import mn.s;
import mn.u;
import mn.w;
import mn.xShadow;
import pz0.py;
import qn0.a3;
import qn0.c3;
import qn0.d3;
import qn0.e3;
import qn0.f3;
import qn0.j1;
import qn0.k1;
import qn0.l1;
import qn0.m1;
import qn0.n1;
import qn0.q0;
import qn0.q1;
import qn0.q2;
import qn0.r0;
import qn0.r1;
import qn0.r2;
import qn0.s0;
import qn0.s1;
import qn0.s2;
import qn0.t1;
import qn0.t2;
import qn0.u2;
import qn0.w2;
import qn0.x1;
import qn0.x2;
import qn0.y1;
import qn0.y2;
import qn0.z1;
import qo.o0;
import qo.p;
import sy.tShadow;
import vn0.a1;
import vn0.a2;
import vn0.b2;
import vn0.c2;
import vn0.g;
import vn0.k;
import vn0.k2;
import vn0.l;
import vn0.l2;
import vn0.m;
import vn0.m2;
import vn0.o;
import vn0.u1;
import vn0.v;
import vn0.v0;
import vn0.v1;
import vn0.v2;
import vn0.w0;
import vn0.w1;
import vn0.x0;
import vn0.z0;
import vn0.z2;
import x01.i;
import x61.n;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class a implements j71.c {
    public final /* synthetic */ int r;

    public /* synthetic */ a(int i) {
        this.r = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.util.List, x61.rShadow] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [x61.rShadow] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.ArrayList] */
    @Override // j71.c
    public final Object k(Object obj) {
        s0 s0Var;
        v vVar;
        g gVar;
        List list;
        s0 s0Var2;
        v vVar2;
        g gVar2;
        o oVar;
        s0 s0Var3;
        v vVar3;
        g gVar3;
        m1 m1Var;
        ArrayList arrayList;
        i iVar;
        j jVar;
        List<l> list2;
        List list3;
        m mVar;
        List<k> list4;
        s1 s1Var;
        a1 a1Var;
        v0 v0Var;
        List list5;
        s1 s1Var2;
        a1 a1Var2;
        v0 v0Var2;
        x0 x0Var;
        s1 s1Var3;
        a1 a1Var3;
        v0 v0Var3;
        y1 y1Var;
        StatusState statusState;
        ArrayList arrayList2;
        h hVar;
        mn.f fVar;
        mn.m mVar2;
        s2 s2Var;
        t2 t2Var;
        m2 m2Var;
        List list6;
        s2 s2Var2;
        t2 t2Var2;
        m2 m2Var2;
        l2 l2Var;
        s2 s2Var3;
        t2 t2Var3;
        m2 m2Var3;
        y2 y2Var;
        u uVar;
        z2 z2Var;
        List list7;
        v2 v2Var;
        e3 e3Var;
        w1 w1Var;
        List list8;
        e3 e3Var2;
        w1 w1Var2;
        v1 v1Var;
        e3 e3Var3;
        w1 w1Var3;
        a2 a2Var;
        qo.h hVar2;
        qo.m mVar3;
        List list9;
        qo.h hVar3;
        qo.m mVar4;
        qo.k kVar;
        qo.h hVar4;
        qo.m mVar5;
        qo.i iVar2;
        vo.m1 m1Var2;
        qo.h hVar5;
        switch (this.r) {
            case 0:
                c cVar = (c) obj;
                k71.k.g(cVar, "id");
                String str = cVar.a;
                u0 u0Var = new u0(100);
                String str2 = cVar.b;
                aa1.b bVar = t0.d;
                return new qn0.t0(str, u0Var, bVar, str2 == null ? bVar : new u0(str2), new u0(Boolean.valueOf(str2 != null)));
            case 1:
                q0 q0Var = (q0) obj;
                k71.k.g(q0Var, "data");
                r0 r0Var = q0Var.a;
                return Boolean.valueOf((r0Var == null || (s0Var = r0Var.c) == null || (vVar = s0Var.c) == null || (gVar = vVar.n) == null || (list = gVar.c) == null) ? false : !list.isEmpty());
            case 2:
                q0 q0Var2 = (q0) obj;
                k71.k.g(q0Var2, "data");
                r0 r0Var2 = q0Var2.a;
                if (r0Var2 == null || (s0Var2 = r0Var2.c) == null || (vVar2 = s0Var2.c) == null || (gVar2 = vVar2.n) == null || (oVar = gVar2.b) == null) {
                    return null;
                }
                return new i(oVar.c, oVar.a, !oVar.b);
            case 3:
                q0 q0Var3 = (q0) obj;
                k71.k.g(q0Var3, "data");
                r0 r0Var3 = q0Var3.a;
                List list10 = (r0Var3 == null || (s0Var3 = r0Var3.c) == null || (vVar3 = s0Var3.c) == null || (gVar3 = vVar3.n) == null) ? null : gVar3.c;
                return list10 == null ? rShadow.r : list10;
            case 4:
                k1 k1Var = (k1) obj;
                k71.k.g(k1Var, "data");
                l1 l1Var = k1Var.a;
                if (l1Var == null || (m1Var = l1Var.c) == null) {
                    return null;
                }
                n1 n1Var = m1Var.d;
                v vVar4 = m1Var.f;
                g gVar4 = vVar4.n;
                vn0.i iVar3 = vVar4.o;
                vn0.rShadow rVar = vVar4.h;
                vn0.h hVar6 = vVar4.k;
                java.util.ArrayList r9 = (java.util.ArrayList) (rShadow.r);
                if (gVar4 == null || (list4 = gVar4.c) == null) {
                    arrayList = r9;
                } else {
                    arrayList = new ArrayList();
                    for (k kVar2 : list4) {
                        mn.a b = kVar2 != null ? xn0.a.b(kVar2.c, n1Var != null ? n1Var.c.i.c : null) : null;
                        if (b != null) {
                            arrayList.add(b);
                        }
                    }
                }
                int i = gVar4 != null ? gVar4.a : 0;
                if (gVar4 != null) {
                    o oVar2 = gVar4.b;
                    iVar = new i(oVar2.c, oVar2.a, !oVar2.b);
                } else {
                    iVar = new i(null, false, true);
                }
                mn.e eVar = new mn.e(i, arrayList, iVar);
                String str3 = vVar4.a;
                vn0.e eVar2 = hVar6.c;
                String str4 = (eVar2 == null || (list3 = eVar2.a) == null || (mVar = (m) x61.m.W(list3)) == null) ? n1Var != null ? n1Var.c.i.c : "" : mVar.b;
                CheckStatusState K = k21.f.K(vVar4.b);
                CheckConclusionState N = i21.a.N(vVar4.c);
                int i2 = gVar4 != null ? gVar4.a : 0;
                mn.m q = tShadow.q(vVar4);
                if (iVar3 != null && (list2 = iVar3.b) != null) {
                    r9 = new ArrayList();
                    for (l lVar : list2) {
                        mn.a b2 = lVar != null ? xn0.a.b(lVar.c, n1Var != null ? n1Var.c.i.c : null) : null;
                        if (b2 != null) {
                            r9.add(b2);
                        }
                    }
                }
                mn.e eVar3 = new mn.e(iVar3 != null ? iVar3.a : 0, (List) r9, new i(null, false, true));
                com.github.service.models.response.a e = k41.b.e(rVar.c.b);
                String str5 = rVar.b;
                String str6 = hVar6.b;
                String str7 = hVar6.a;
                vn0.f fVar2 = vVar4.j;
                String str8 = fVar2 != null ? fVar2.b : null;
                j1 j1Var = m1Var.c;
                com.github.service.models.response.a e2 = k41.b.e(j1Var != null ? j1Var.c : null);
                if (n1Var != null) {
                    String str9 = n1Var.b;
                    vn0.r0 r0Var4 = n1Var.c;
                    jVar = new j(str9, r0Var4.i.c, r0Var4.d, r0Var4.e, r0Var4.c, r0Var4.b, r0Var4.f, r0Var4.h);
                } else {
                    jVar = null;
                }
                String str10 = vVar4.d;
                py pyVar = rVar.d;
                int i3 = pyVar == null ? -1 : nx0.a.a[pyVar.ordinal()];
                boolean z = i3 == 1 || i3 == 2 || i3 == 3;
                boolean z2 = vVar4.l;
                int i4 = vVar4.e;
                vn0.d dVar = vVar4.g;
                Integer valueOf = dVar != null ? Integer.valueOf(dVar.a) : null;
                vn0.c cVar2 = vVar4.m;
                return new mn.g(str3, str4, e, str5, str6, str7, str8, e2, K, N, i2, q, eVar, eVar3, jVar, str10, z, z2, i4, valueOf, cVar2 != null ? new Avatar(cVar2.c, Avatar.Type.Organization) : null, k41.b.V(n1Var != null ? n1Var.c.g : null));
            case 5:
                d dVar2 = (d) obj;
                k71.k.g(dVar2, "id");
                String str11 = dVar2.a;
                u0 u0Var2 = new u0(100);
                String str12 = dVar2.b;
                return new qn0.a2(str11, u0Var2, str12 == null ? t0.d : new u0(str12), new u0(Boolean.valueOf(str12 != null)));
            case 6:
                d dVar3 = (d) obj;
                k71.k.g(dVar3, "id");
                String str13 = dVar3.a;
                u0 u0Var3 = new u0(100);
                String str14 = dVar3.b;
                return new t1(str13, u0Var3, null, str14 == null ? t0.d : new u0(str14), new u0(Boolean.valueOf(str14 != null)), 12);
            case 7:
                q1 q1Var = (q1) obj;
                k71.k.g(q1Var, "data");
                r1 r1Var = q1Var.a;
                return Boolean.valueOf((r1Var == null || (s1Var = r1Var.c) == null || (a1Var = s1Var.c) == null || (v0Var = a1Var.b) == null || (list5 = v0Var.c) == null) ? false : !list5.isEmpty());
            case 8:
                q1 q1Var2 = (q1) obj;
                k71.k.g(q1Var2, "data");
                r1 r1Var2 = q1Var2.a;
                if (r1Var2 == null || (s1Var2 = r1Var2.c) == null || (a1Var2 = s1Var2.c) == null || (v0Var2 = a1Var2.b) == null || (x0Var = v0Var2.b) == null) {
                    return null;
                }
                return new i(x0Var.c, x0Var.a, !x0Var.b);
            case 9:
                q1 q1Var3 = (q1) obj;
                k71.k.g(q1Var3, "data");
                r1 r1Var3 = q1Var3.a;
                List list11 = (r1Var3 == null || (s1Var3 = r1Var3.c) == null || (a1Var3 = s1Var3.c) == null || (v0Var3 = a1Var3.b) == null) ? null : v0Var3.c;
                return list11 == null ? rShadow.r : list11;
            case 10:
                qn0.w1 w1Var4 = (qn0.w1) obj;
                k71.k.g(w1Var4, "data");
                x1 x1Var = w1Var4.a;
                if (x1Var == null || (y1Var = x1Var.c) == null) {
                    return null;
                }
                z1 z1Var = y1Var.c;
                v0 v0Var4 = y1Var.d.b;
                mn.m mVar6 = mn.m.g;
                if (v0Var4 != null) {
                    List<w0> list12 = v0Var4.c;
                    if (list12 != null) {
                        mVar2 = null;
                        for (w0 w0Var : list12) {
                            if (w0Var != null) {
                                mn.m q2 = tShadow.q(w0Var.e);
                                mVar2 = mVar2 != null ? new mn.m(mVar2.a + q2.a, mVar2.b + q2.b, mVar2.c + q2.c, mVar2.d + q2.d, mVar2.e + q2.e, mVar2.f + q2.f) : q2;
                            }
                        }
                    } else {
                        mVar2 = null;
                    }
                    if (mVar2 == null) {
                        mn.m.Companion.getClass();
                    } else {
                        mVar6 = mVar2;
                    }
                } else {
                    mn.m.Companion.getClass();
                }
                mn.m mVar7 = mVar6;
                String str15 = y1Var.b;
                if (z1Var == null || (statusState = com.google.common.util.concurrent.a.W(z1Var.a)) == null) {
                    statusState = StatusState.UNKNOWN__;
                }
                StatusState statusState2 = statusState;
                java.util.ArrayList r5 = (java.util.ArrayList) (rShadow.r);
                if (z1Var != null) {
                    ArrayList arrayList3 = z1Var.b;
                    ArrayList arrayList4 = new ArrayList(n.F(arrayList3, 10));
                    int size = arrayList3.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj2 = arrayList3.get(i5);
                        i5++;
                        arrayList4.add(xn0.a.a(((qn0.v1) obj2).c));
                    }
                    arrayList2 = arrayList4;
                } else {
                    arrayList2 = r5;
                }
                if (v0Var4 == null) {
                    hVar = new h((List) r5, new i(null, false, true));
                } else {
                    x0 x0Var2 = v0Var4.b;
                    i iVar4 = new i(x0Var2.c, x0Var2.a, !x0Var2.b);
                    List<w0> list13 = v0Var4.c;
                    if (list13 != null) {
                        r5 = new ArrayList();
                        for (w0 w0Var2 : list13) {
                            if (w0Var2 != null) {
                                vn0.u0 u0Var4 = w0Var2.c;
                                v vVar5 = w0Var2.e;
                                String str16 = vVar5.a;
                                z0 z0Var = w0Var2.b;
                                fVar = new mn.f(str16, z0Var != null ? z0Var.b.b : u0Var4 != null ? u0Var4.b : "", u0Var4 != null ? u0Var4.c : null, k21.f.K(vVar5.b), i21.a.N(vVar5.c), sy.u.c(vVar5.n, z0Var != null ? z0Var.b.b : null), z0Var != null ? z0Var.a : null);
                            } else {
                                fVar = null;
                            }
                            if (fVar != null) {
                                r5.add(fVar);
                            }
                        }
                    }
                    hVar = new h((List) r5, iVar4);
                }
                return new mn.i(str15, statusState2, mVar7, arrayList2, hVar);
            case 11:
                String str17 = (String) obj;
                k71.k.g(str17, "id");
                return new a3(str17);
            case 12:
                String str18 = (String) obj;
                k71.k.g(str18, "id");
                return new u2(str18, t0.d);
            case 13:
                q2 q2Var = (q2) obj;
                k71.k.g(q2Var, "it");
                r2 r2Var = q2Var.a;
                return Boolean.valueOf((r2Var == null || (s2Var = r2Var.c) == null || (t2Var = s2Var.b) == null || (m2Var = t2Var.b) == null || (list6 = m2Var.b) == null) ? false : !list6.isEmpty());
            case 14:
                q2 q2Var2 = (q2) obj;
                k71.k.g(q2Var2, "data");
                r2 r2Var2 = q2Var2.a;
                if (r2Var2 == null || (s2Var2 = r2Var2.c) == null || (t2Var2 = s2Var2.b) == null || (m2Var2 = t2Var2.b) == null || (l2Var = m2Var2.a) == null) {
                    return null;
                }
                return new i(l2Var.b, l2Var.a, !l2Var.c);
            case 15:
                q2 q2Var3 = (q2) obj;
                k71.k.g(q2Var3, "data");
                r2 r2Var3 = q2Var3.a;
                List list14 = (r2Var3 == null || (s2Var3 = r2Var3.c) == null || (t2Var3 = s2Var3.b) == null || (m2Var3 = t2Var3.b) == null) ? null : m2Var3.b;
                return list14 == null ? rShadow.r : list14;
            case 16:
                w2 w2Var = (w2) obj;
                k71.k.g(w2Var, "data");
                x2 x2Var = w2Var.a;
                if (x2Var == null || (y2Var = x2Var.c) == null) {
                    return null;
                }
                return (w) in.rShadow.j(y2Var, "Invalid request for workflow runs.", new a(17));
            case 17:
                y2 y2Var2 = (y2) obj;
                k71.k.g(y2Var2, "$this$mapOrApiFailure");
                m2 m2Var4 = y2Var2.f.c;
                Iterable<k2> iterable = m2Var4.b;
                if (iterable == null) {
                    iterable = rShadow.r;
                }
                ArrayList arrayList5 = new ArrayList();
                for (k2 k2Var : iterable) {
                    if (k2Var == null || (z2Var = k2Var.c) == null) {
                        uVar = null;
                    } else {
                        vn0.r2 r2Var4 = z2Var.g;
                        vn0.u2 u2Var = r2Var4.f;
                        vn0.q2 q2Var4 = r2Var4.h;
                        mn.r rVar2 = (u2Var == null || (list7 = u2Var.a) == null || (v2Var = (v2) x61.m.W(list7)) == null) ? null : new mn.r(v2Var.a, v2Var.b);
                        String str19 = z2Var.a;
                        int i6 = z2Var.c;
                        String str20 = z2Var.b;
                        String str21 = q2Var4 != null ? q2Var4.b : null;
                        WorkflowRunEvent V = k41.b.V(z2Var.d);
                        ZonedDateTime zonedDateTime = z2Var.e;
                        String str22 = r2Var4.a;
                        CheckStatusState K2 = k21.f.K(r2Var4.b);
                        vn0.s2 s2Var4 = r2Var4.i;
                        s sVar = new s(str22, K2, s2Var4 != null ? s2Var4.b : null, r2Var4.g, i21.a.N(r2Var4.c), q2Var4 != null ? q2Var4.b : null, rVar2);
                        String str23 = z2Var.f.b;
                        String str24 = r2Var4.d;
                        vn0.x2 x2Var2 = r2Var4.e;
                        String str25 = x2Var2.b;
                        String str26 = x2Var2.c.b;
                        vn0.t2 t2Var4 = x2Var2.e;
                        String str27 = t2Var4 != null ? t2Var4.b : null;
                        py pyVar2 = x2Var2.d;
                        int i7 = pyVar2 == null ? -1 : nx0.a.a[pyVar2.ordinal()];
                        uVar = new u(str19, str20, i6, str21, zonedDateTime, V, sVar, str23, str24, new mn.t(str25, str26, str27, i7 == 1 || i7 == 2 || i7 == 3));
                    }
                    if (uVar != null) {
                        arrayList5.add(uVar);
                    }
                }
                l2 l2Var2 = m2Var4.a;
                return new w(y2Var2.b, y2Var2.c, y.R(y2Var2.d), arrayList5, new i(l2Var2.b, l2Var2.a, false), y2Var2.e);
            case 18:
                f fVar3 = (f) obj;
                k71.k.g(fVar3, "<destruct>");
                return new f3(t0.d, fVar3.a, fVar3.b);
            case 19:
                c3 c3Var = (c3) obj;
                k71.k.g(c3Var, "it");
                d3 d3Var = c3Var.a;
                return Boolean.valueOf((d3Var == null || (e3Var = d3Var.b) == null || (w1Var = e3Var.b) == null || (list8 = w1Var.a) == null) ? false : !list8.isEmpty());
            case 20:
                c3 c3Var2 = (c3) obj;
                k71.k.g(c3Var2, "data");
                d3 d3Var2 = c3Var2.a;
                if (d3Var2 == null || (e3Var2 = d3Var2.b) == null || (w1Var2 = e3Var2.b) == null || (v1Var = w1Var2.b) == null) {
                    return null;
                }
                return new i(v1Var.b, v1Var.a, !v1Var.c);
            case 21:
                c3 c3Var3 = (c3) obj;
                k71.k.g(c3Var3, "data");
                d3 d3Var3 = c3Var3.a;
                List list15 = (d3Var3 == null || (e3Var3 = d3Var3.b) == null || (w1Var3 = e3Var3.b) == null) ? null : w1Var3.a;
                return list15 == null ? rShadow.r : list15;
            case 22:
                c3 c3Var4 = (c3) obj;
                k71.k.g(c3Var4, "data");
                d3 d3Var4 = c3Var4.a;
                return (xShadow) in.rShadow.j(d3Var4 != null ? d3Var4.b : null, "Invalid request for workflows.", new a(23));
            case 23:
                e3 e3Var4 = (e3) obj;
                k71.k.g(e3Var4, "$this$mapOrApiFailure");
                w1 w1Var5 = e3Var4.b;
                Iterable<u1> iterable2 = w1Var5.a;
                if (iterable2 == null) {
                    iterable2 = rShadow.r;
                }
                ArrayList arrayList6 = new ArrayList();
                for (u1 u1Var : iterable2) {
                    ZonedDateTime zonedDateTime2 = null;
                    if (u1Var != null) {
                        c2 c2Var = u1Var.c;
                        String str28 = c2Var.a;
                        String str29 = c2Var.b;
                        b2 b2Var = c2Var.d;
                        List list16 = b2Var.b;
                        if (list16 != null && (a2Var = (a2) x61.m.W(list16)) != null) {
                            zonedDateTime2 = a2Var.a;
                        }
                        zonedDateTime2 = new mn.n(str28, str29, zonedDateTime2, b2Var.a, y.R(c2Var.c));
                    }
                    if (zonedDateTime2 != null) {
                        arrayList6.add(zonedDateTime2);
                    }
                }
                v1 v1Var2 = w1Var5.b;
                return new xShadow(arrayList6, new i(v1Var2.b, v1Var2.a, false));
            case 24:
                String str30 = (String) obj;
                k71.k.g(str30, "id");
                return new p(str30, new u0(100), (u0) null, 28);
            case 25:
                qo.e eVar4 = (qo.e) obj;
                k71.k.g(eVar4, "data");
                qo.g gVar5 = eVar4.a;
                return Boolean.valueOf((gVar5 == null || (hVar2 = gVar5.c) == null || (mVar3 = hVar2.c) == null || (list9 = mVar3.c) == null) ? false : !list9.isEmpty());
            case 26:
                qo.e eVar5 = (qo.e) obj;
                k71.k.g(eVar5, "data");
                qo.g gVar6 = eVar5.a;
                if (gVar6 == null || (hVar3 = gVar6.c) == null || (mVar4 = hVar3.c) == null || (kVar = mVar4.b) == null) {
                    return null;
                }
                return new i(kVar.b, kVar.a, !kVar.c);
            case 27:
                qo.e eVar6 = (qo.e) obj;
                k71.k.g(eVar6, "data");
                qo.g gVar7 = eVar6.a;
                List list17 = (gVar7 == null || (hVar4 = gVar7.c) == null || (mVar5 = hVar4.c) == null) ? null : mVar5.c;
                return list17 == null ? rShadow.r : list17;
            case 28:
                qo.e eVar7 = (qo.e) obj;
                k71.k.g(eVar7, "data");
                qo.g gVar8 = eVar7.a;
                if (gVar8 != null && (hVar5 = gVar8.c) != null) {
                    qo.o oVar3 = hVar5.b.e;
                    return xo.a.d(hVar5, oVar3 != null ? oVar3.c.b : null);
                }
                if (gVar8 != null && (m1Var2 = gVar8.e) != null) {
                    return xo.a.f(m1Var2);
                }
                if (gVar8 == null || (iVar2 = gVar8.d) == null) {
                    return null;
                }
                return xo.a.e(iVar2);
            default:
                bp.b bVar2 = (bp.b) obj;
                k71.k.g(bVar2, "id");
                String str31 = bVar2.a;
                u0 u0Var5 = new u0(100);
                String str32 = bVar2.b;
                aa1.b bVar3 = t0.d;
                return new o0(str31, u0Var5, bVar3, str32 == null ? bVar3 : new u0(str32), new u0(Boolean.valueOf(str32 != null)));
        }
    }
}
