package a00;

import a71.d;
import a71.f;
import a71.i;
import a81.v;
import aa.e0;
import aa.g0;
import aa.j;
import aa.t0;
import aa.u0;
import aa.z;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import b6.b0;
import b6.w;
import b6.x1;
import j71.e;
import java.util.List;
import java.util.Map;
import k71.k;
import m7.y;
import qn0.g;
import qn0.h;
import qn0.j0;
import qn0.k0;
import qn0.o0;
import qn0.p;
import qn0.q0;
import qn0.q1;
import qn0.q2;
import qn0.r0;
import qn0.r1;
import qn0.r2;
import qn0.s2;
import qn0.t2;
import qn0.u2;
import rz.l1;
import rz.n1;
import rz.o1;
import rz.p1;
import s3.m;
import u10.td;
import u10.ud;
import u10.wd;
import u10.xd;
import u10.yd;
import v8.l0;
import vn0.a1;
import vn0.l2;
import vn0.m1;
import vn0.m2;
import vn0.s1;
import vn0.v0;
import vn0.x0;
import w61.a0;
import y41.t1;
import z70.s0;
import z70.w0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class a implements e {
    public final /* synthetic */ int r;

    public final Object s(Object obj, Object obj2) {
        a71.b bVar;
        h hVar;
        switch (this.r) {
            case 0:
                c cVar = (c) obj;
                String str = (String) obj2;
                k.g(cVar, "userProjectsParameters");
                k.g(str, "after");
                return new p1(cVar.a, l0.L(cVar.b), y.J(cVar.c), new u0(str));
            case 1:
                n1 n1Var = (n1) obj;
                List list = (List) obj2;
                k.g(n1Var, "data");
                k.g(list, "nodes");
                o1 o1Var = n1Var.a;
                l1 l1Var = o1Var.a;
                return new n1(new o1(new l1(l1Var.a, new tz.c(list, l1Var.b.b)), o1Var.b, o1Var.c), n1Var.b, n1Var.c);
            case 2:
                String str2 = (String) obj;
                f fVar = (f) obj2;
                k.g(str2, "acc");
                k.g(fVar, "element");
                if (str2.length() == 0) {
                    return fVar.toString();
                }
                return str2 + ", " + fVar;
            case 3:
                a71.h hVar2 = (a71.h) obj;
                f fVar2 = (f) obj2;
                k.g(hVar2, "acc");
                k.g(fVar2, "element");
                a71.h b0 = hVar2.b0(fVar2.getKey());
                a71.h hVar3 = i.r;
                if (b0 == hVar3) {
                    return fVar2;
                }
                d dVar = d.r;
                a71.e w0 = b0.w0(dVar);
                if (w0 == null) {
                    bVar = new a71.b(fVar2, b0);
                } else {
                    a71.h b02 = b0.b0(dVar);
                    if (b02 == hVar3) {
                        return new a71.b(w0, fVar2);
                    }
                    bVar = new a71.b(w0, new a71.b(fVar2, b02));
                }
                return bVar;
            case 4:
                f fVar3 = (f) obj2;
                if (!(fVar3 instanceof v)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? fVar3 : Integer.valueOf(intValue + 1);
            case 5:
                v vVar = (v) obj;
                v vVar2 = (f) obj2;
                if (vVar != null) {
                    return vVar;
                }
                if (vVar2 instanceof v) {
                    return vVar2;
                }
                return null;
            case 6:
                a81.y yVar = (a81.y) obj;
                v vVar3 = (f) obj2;
                if (vVar3 instanceof v) {
                    v vVar4 = vVar3;
                    Object b = vVar4.b(yVar.a);
                    Object[] objArr = yVar.b;
                    int i = yVar.d;
                    objArr[i] = b;
                    v[] vVarArr = yVar.c;
                    yVar.d = i + 1;
                    vVarArr[i] = vVar4;
                }
                return yVar;
            case 7:
                g0 g0Var = (g0) obj;
                e0 e0Var = (e0) obj2;
                k.g(g0Var, "acc");
                k.g(e0Var, "element");
                z b2 = g0Var.b(e0Var.getKey());
                return b2 == z.a ? e0Var : new j(b2, e0Var);
            case 8:
                return Integer.valueOf(Math.round((1 + (((m) obj2) != m.r ? (-1.0f) * (-1) : -1.0f)) * (((Integer) obj).intValue() / 2.0f)));
            case 9:
                return Integer.valueOf(Math.round((1 + 0.0f) * ((((Integer) obj).intValue() + 0) / 2.0f)));
            case 10:
                return Integer.valueOf(Math.round((1 + (((m) obj2) != m.r ? 0.0f * (-1) : 0.0f)) * ((((Integer) obj).intValue() + 0) / 2.0f)));
            case 11:
                Map b3 = ((androidx.compose.foundation.lazy.layout.n1) obj2).b();
                if (b3.isEmpty()) {
                    return null;
                }
                return b3;
            case 12:
                ((v2.g0) obj).W = true;
                return a0.a;
            case 13:
                b30.b bVar2 = (b30.b) obj;
                String str3 = (String) obj2;
                k.g(bVar2, "id");
                k.g(str3, "after");
                return new yd(bVar2.a, bVar2.b, bVar2.c, new u0(str3), 16);
            case 14:
                td tdVar = (td) obj;
                List list2 = (List) obj2;
                k.g(tdVar, "data");
                k.g(list2, "nodes");
                xd xdVar = tdVar.a;
                xd xdVar2 = null;
                wd wdVar = null;
                ud udVar = null;
                if (xdVar != null) {
                    ud udVar2 = xdVar.b;
                    if (udVar2 != null) {
                        wd wdVar2 = udVar2.c;
                        if (wdVar2 != null) {
                            w0 w0Var = wdVar2.c;
                            z70.e0 e0Var2 = w0Var.l;
                            wdVar = wd.a(wdVar2, w0.a(w0Var, e0Var2 != null ? new z70.e0(new s0(e0Var2.a.a, list2)) : null, null, 30719));
                        }
                        udVar = ud.a(udVar2, wdVar);
                    }
                    xdVar2 = xd.a(xdVar, udVar);
                }
                return new td(xdVar2);
            case 15:
                ((Integer) obj2).getClass();
                t1.a(t.L(1), (s) obj);
                return a0.a;
            case 16:
                int intValue2 = ((Integer) obj).intValue();
                if (((z5.m) obj2) instanceof a6.b) {
                    intValue2++;
                }
                return Integer.valueOf(intValue2);
            case 17:
                b0 b0Var = (b0) obj;
                z5.m mVar = (z5.m) obj2;
                if ((mVar instanceof i6.s) || (mVar instanceof i6.m) || (mVar instanceof w) || (mVar instanceof b6.b)) {
                    return new b0(b0Var.a.d(mVar), b0Var.b);
                }
                return new b0(b0Var.a, b0Var.b.d(mVar));
            case 18:
                ((b6.z) obj).d = ((s3.h) obj2).a;
                return a0.a;
            case 19:
                ((b6.z) obj).e = (x1) obj2;
                return a0.a;
            case 20:
                String str4 = (String) obj;
                String str5 = (String) obj2;
                k.g(str4, "id");
                k.g(str5, "after");
                return new p(str4, new u0(100), new u0(str5), 24);
            case 21:
                qn0.e eVar = (qn0.e) obj;
                List list3 = (List) obj2;
                k.g(eVar, "data");
                k.g(list3, "nodes");
                g gVar = eVar.a;
                qn0.m mVar2 = null;
                if (gVar != null) {
                    h hVar4 = gVar.c;
                    if (hVar4 != null) {
                        qn0.m mVar3 = hVar4.c;
                        if (mVar3 != null) {
                            int i2 = mVar3.a;
                            qn0.k kVar = mVar3.b;
                            k.g(kVar, "pageInfo");
                            mVar2 = new qn0.m(i2, kVar, list3);
                        }
                        String str6 = hVar4.a;
                        qn0.c cVar2 = hVar4.b;
                        s1 s1Var = hVar4.d;
                        k.g(str6, "__typename");
                        k.g(cVar2, "checkSuite");
                        k.g(s1Var, "workFlowCheckRunFragment");
                        hVar = new h(str6, cVar2, mVar2, s1Var);
                    } else {
                        hVar = null;
                    }
                    String str7 = gVar.a;
                    String str8 = gVar.b;
                    qn0.i iVar = gVar.d;
                    m1 m1Var = gVar.e;
                    k.g(str7, "__typename");
                    k.g(str8, "id");
                    mVar2 = new g(str7, str8, hVar, iVar, m1Var);
                }
                String str9 = eVar.b;
                String str10 = eVar.c;
                k.g(str9, "id");
                k.g(str10, "__typename");
                return new qn0.e(mVar2, str9, str10);
            case 22:
                bo0.c cVar3 = (bo0.c) obj;
                String str11 = (String) obj2;
                k.g(cVar3, "id");
                k.g(str11, "after");
                String str12 = cVar3.a;
                u0 u0Var = new u0(100);
                u0 u0Var2 = new u0(str11);
                String str13 = cVar3.b;
                return new o0(str12, u0Var, u0Var2, str13 == null ? t0.d : new u0(str13), new u0(Boolean.valueOf(str13 != null)));
            case 23:
                j0 j0Var = (j0) obj;
                List list4 = (List) obj2;
                k.g(j0Var, "data");
                k.g(list4, "nodes");
                k0 k0Var = j0Var.a;
                if (k0Var != null) {
                    qn0.l0 l0Var = k0Var.c;
                    if (l0Var != null) {
                        vn0.v vVar5 = l0Var.d;
                        vn0.g gVar2 = vVar5.n;
                        r1 = new qn0.l0(l0Var.a, l0Var.b, l0Var.c, vn0.v.a(vVar5, gVar2 != null ? vn0.g.a(gVar2, list4) : null));
                    }
                    String str14 = k0Var.a;
                    String str15 = k0Var.b;
                    k.g(str14, "__typename");
                    r1 = new k0(str14, str15, r1);
                }
                return new j0(r1, j0Var.b, j0Var.c);
            case 24:
                bo0.c cVar4 = (bo0.c) obj;
                String str16 = (String) obj2;
                k.g(cVar4, "id");
                k.g(str16, "after");
                String str17 = cVar4.a;
                u0 u0Var3 = new u0(100);
                u0 u0Var4 = new u0(str16);
                String str18 = cVar4.b;
                return new qn0.t0(str17, u0Var3, u0Var4, str18 == null ? t0.d : new u0(str18), new u0(Boolean.valueOf(str18 != null)));
            case 25:
                q0 q0Var = (q0) obj;
                List list5 = (List) obj2;
                k.g(q0Var, "data");
                k.g(list5, "nodes");
                r0 r0Var = q0Var.a;
                if (r0Var != null) {
                    qn0.s0 s0Var = r0Var.c;
                    if (s0Var != null) {
                        vn0.v vVar6 = s0Var.c;
                        vn0.g gVar3 = vVar6.n;
                        r1 = new qn0.s0(s0Var.a, s0Var.b, vn0.v.a(vVar6, gVar3 != null ? vn0.g.a(gVar3, list5) : null));
                    }
                    String str19 = r0Var.a;
                    String str20 = r0Var.b;
                    k.g(str19, "__typename");
                    r1 = new r0(str19, str20, r1);
                }
                return new q0(r1, q0Var.b, q0Var.c);
            case 26:
                bo0.d dVar2 = (bo0.d) obj;
                String str21 = (String) obj2;
                k.g(dVar2, "id");
                k.g(str21, "after");
                String str22 = dVar2.a;
                u0 u0Var5 = new u0(str21);
                u0 u0Var6 = new u0(100);
                String str23 = dVar2.b;
                return new qn0.t1(str22, u0Var6, u0Var5, str23 == null ? t0.d : new u0(str23), new u0(Boolean.valueOf(str23 != null)), 8);
            case 27:
                q1 q1Var = (q1) obj;
                List list6 = (List) obj2;
                k.g(q1Var, "data");
                k.g(list6, "nodes");
                r1 r1Var = q1Var.a;
                v0 v0Var = null;
                if (r1Var != null) {
                    qn0.s1 s1Var2 = r1Var.c;
                    if (s1Var2 != null) {
                        a1 a1Var = s1Var2.c;
                        v0 v0Var2 = a1Var.b;
                        if (v0Var2 != null) {
                            int i3 = v0Var2.a;
                            x0 x0Var = v0Var2.b;
                            k.g(x0Var, "pageInfo");
                            v0Var = new v0(i3, x0Var, list6);
                        }
                        String str24 = a1Var.a;
                        String str25 = a1Var.c;
                        k.g(str24, "id");
                        k.g(str25, "__typename");
                        a1 a1Var2 = new a1(str24, v0Var, str25);
                        String str26 = s1Var2.a;
                        String str27 = s1Var2.b;
                        k.g(str26, "__typename");
                        k.g(str27, "id");
                        v0Var = new qn0.s1(str26, str27, a1Var2);
                    }
                    String str28 = r1Var.a;
                    String str29 = r1Var.b;
                    k.g(str28, "__typename");
                    k.g(str29, "id");
                    v0Var = new r1(str28, str29, v0Var);
                }
                String str30 = q1Var.b;
                String str31 = q1Var.c;
                k.g(str30, "id");
                k.g(str31, "__typename");
                return new q1(v0Var, str30, str31);
            case 28:
                String str32 = (String) obj;
                String str33 = (String) obj2;
                k.g(str32, "id");
                k.g(str33, "after");
                return new u2(str32, new u0(str33));
            default:
                q2 q2Var = (q2) obj;
                List list7 = (List) obj2;
                k.g(q2Var, "data");
                k.g(list7, "nodes");
                r2 r2Var = q2Var.a;
                s2 s2Var = null;
                if (r2Var != null) {
                    s2 s2Var2 = r2Var.c;
                    if (s2Var2 != null) {
                        t2 t2Var = s2Var2.b;
                        l2 l2Var = t2Var.b.a;
                        k.g(l2Var, "pageInfo");
                        m2 m2Var = new m2(l2Var, list7);
                        String str34 = t2Var.a;
                        k.g(str34, "__typename");
                        t2 t2Var2 = new t2(str34, m2Var);
                        String str35 = s2Var2.a;
                        k.g(str35, "id");
                        s2Var = new s2(str35, t2Var2);
                    }
                    String str36 = r2Var.a;
                    String str37 = r2Var.b;
                    k.g(str36, "__typename");
                    k.g(str37, "id");
                    s2Var = new r2(str36, str37, s2Var);
                }
                String str38 = q2Var.b;
                String str39 = q2Var.c;
                k.g(str38, "id");
                k.g(str39, "__typename");
                return new q2(s2Var, str38, str39);
        }
    }
}
