package lb0;

import aa.t0;
import aa.u0;
import b20.c;
import b20.c2;
import b20.d2;
import b20.e2;
import b20.f2;
import b20.g;
import b20.g2;
import b20.h;
import b20.i;
import b20.j0;
import b20.k0;
import b20.l0;
import b20.m;
import b20.o0;
import b20.o2;
import b20.p;
import b20.p2;
import b20.q0;
import b20.q1;
import b20.q2;
import b20.r0;
import b20.r1;
import b20.r2;
import b20.s0;
import b20.t1;
import com.google.android.gms.internal.measurement.z3;
import g20.a1;
import g20.h2;
import g20.i2;
import g20.m1;
import g20.s1;
import g20.v0;
import g20.v1;
import g20.w1;
import g20.x0;
import gn0.rr;
import j71.e;
import java.util.List;
import jn0.k20;
import jn0.t20;
import jn0.u20;
import jn0.v20;
import jo.k00;
import jo.m00;
import jo.n00;
import jo.o00;
import jo.q00;
import jo.r00;
import jo.s00;
import k71.k;
import kc0.b30;
import kc0.e30;
import kc0.f30;
import kc0.g30;
import m0.s;
import m00.o;
import m00.q;
import m00.r;
import m00.t;
import m00.u;
import m00.v;
import m20.d;
import t.a0;
import u10.fx;
import u10.xw;
import x61.l;
import z5.n;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class a implements e {
    public final /* synthetic */ int r;

    public /* synthetic */ a(int i) {
        this.r = i;
    }

    public final Object s(Object obj, Object obj2) {
        h hVar;
        p2 p2Var;
        switch (this.r) {
            case 0:
                xw xwVar = (xw) obj;
                b bVar = (b) obj2;
                k.g(xwVar, "<this>");
                k.g(bVar, "key");
                fx fxVar = xwVar.a;
                return Boolean.valueOf(k.b(fxVar != null ? fxVar.b : null, bVar.c));
            case 1:
                lm0.h hVar2 = (lm0.h) obj;
                String str = (String) obj2;
                k.g(hVar2, "repositoryOwnerRepositoriesParameters");
                k.g(str, "after");
                u0 u0Var = new u0(str);
                rr M = a0.M(hVar2.a);
                return new g30(u0Var, M == null ? t0.d : new u0(M), 8);
            case 2:
                b30 b30Var = (b30) obj;
                List list = (List) obj2;
                k.g(b30Var, "data");
                k.g(list, "nodes");
                f30 f30Var = b30Var.a;
                return new b30(new f30(new e30(f30Var.a.a, list), f30Var.b, f30Var.c));
            case 3:
                lp.a aVar = (lp.a) obj;
                String str2 = (String) obj2;
                k.g(aVar, "refComparisonCommitsParameters");
                k.g(str2, "after");
                return new s00(new u0(str2), aVar.a, aVar.b, aVar.c, aVar.d);
            case 4:
                o00 o00Var = (o00) obj;
                List list2 = (List) obj2;
                k.g(o00Var, "data");
                k.g(list2, "nodes");
                r00 r00Var = o00Var.a;
                r00 r00Var2 = null;
                m00 m00Var = null;
                n00 n00Var = null;
                if (r00Var != null) {
                    n00 n00Var2 = r00Var.b;
                    if (n00Var2 != null) {
                        m00 m00Var2 = n00Var2.b;
                        if (m00Var2 != null) {
                            q00 q00Var = m00Var2.b.a;
                            k.g(q00Var, "pageInfo");
                            k00 k00Var = new k00(q00Var, list2);
                            String str3 = m00Var2.a;
                            String str4 = m00Var2.c;
                            k.g(str3, "id");
                            k.g(str4, "__typename");
                            m00Var = new m00(str3, k00Var, str4);
                        }
                        String str5 = n00Var2.a;
                        String str6 = n00Var2.c;
                        k.g(str5, "id");
                        k.g(str6, "__typename");
                        n00Var = new n00(str5, m00Var, str6);
                    }
                    String str7 = r00Var.a;
                    String str8 = r00Var.c;
                    k.g(str7, "id");
                    k.g(str8, "__typename");
                    r00Var2 = new r00(str7, n00Var, str8);
                }
                String str9 = o00Var.b;
                String str10 = o00Var.c;
                k.g(str9, "id");
                k.g(str10, "__typename");
                return new o00(r00Var2, str9, str10);
            case 5:
                o00 o00Var2 = (o00) obj;
                k.g(o00Var2, "<this>");
                k.g((lp.a) obj2, "it");
                return Boolean.valueOf(o00Var2.a != null);
            case 6:
                ly0.a aVar2 = (ly0.a) obj;
                String str11 = (String) obj2;
                k.g(aVar2, "pullRequestParameters");
                String str12 = aVar2.c;
                k.g(str11, "after");
                String g = f1.e.g("type:pr ", aVar2.d);
                u0 u0Var2 = new u0(str11);
                String str13 = aVar2.b;
                aa1.b bVar2 = t0.d;
                aa1.b u0Var3 = str13 == null ? bVar2 : new u0(str13);
                if (str12 != null) {
                    bVar2 = new u0(str12);
                }
                return new v20(g, u0Var2, u0Var3, bVar2, new u0(Boolean.valueOf((str13 == null || str12 == null) ? false : true)));
            case 7:
                k20 k20Var = (k20) obj;
                List list3 = (List) obj2;
                k.g(k20Var, "data");
                k.g(list3, "nodes");
                u20 u20Var = k20Var.b;
                return k20.a(k20Var, (t20) null, new u20(u20Var.a, u20Var.b, list3), 13);
            case 8:
                k20 k20Var2 = (k20) obj;
                ly0.a aVar3 = (ly0.a) obj2;
                k.g(k20Var2, "<this>");
                k.g(aVar3, "key");
                t20 t20Var = k20Var2.a;
                return Boolean.valueOf(k.b(t20Var != null ? t20Var.b : null, aVar3.c));
            case 9:
                s sVar = (s) obj2;
                return l.r(new Integer[]{Integer.valueOf(sVar.e.b.y()), Integer.valueOf(sVar.e.c.y())});
            case 10:
                o oVar = (o) obj;
                String str14 = (String) obj2;
                k.g(oVar, "repositoryIssueTypesParameters");
                k.g(str14, "after");
                return new v(new u0(30), new u0(str14), oVar.a, oVar.b);
            case 11:
                q qVar = (q) obj;
                List list4 = (List) obj2;
                k.g(qVar, "data");
                k.g(list4, "nodes");
                u uVar = qVar.a;
                u uVar2 = null;
                r rVar = null;
                if (uVar != null) {
                    r rVar2 = uVar.a;
                    if (rVar2 != null) {
                        t tVar = rVar2.a;
                        k.g(tVar, "pageInfo");
                        rVar = new r(tVar, list4);
                    }
                    String str15 = uVar.b;
                    String str16 = uVar.c;
                    k.g(str15, "id");
                    k.g(str16, "__typename");
                    uVar2 = new u(rVar, str15, str16);
                }
                String str17 = qVar.b;
                String str18 = qVar.c;
                k.g(str17, "id");
                k.g(str18, "__typename");
                return new q(uVar2, str17, str18);
            case 12:
                String str19 = (String) obj;
                String str20 = (String) obj2;
                k.g(str19, "id");
                k.g(str20, "after");
                return new p(str19, new u0(100), new u0(str20), 24);
            case 13:
                b20.e eVar = (b20.e) obj;
                List list5 = (List) obj2;
                k.g(eVar, "data");
                k.g(list5, "nodes");
                g gVar = eVar.a;
                g gVar2 = null;
                m mVar = null;
                if (gVar != null) {
                    h hVar3 = gVar.c;
                    if (hVar3 != null) {
                        m mVar2 = hVar3.c;
                        if (mVar2 != null) {
                            int i = mVar2.a;
                            b20.k kVar = mVar2.b;
                            k.g(kVar, "pageInfo");
                            mVar = new m(i, kVar, list5);
                        }
                        String str21 = hVar3.a;
                        c cVar = hVar3.b;
                        s1 s1Var = hVar3.d;
                        k.g(str21, "__typename");
                        k.g(cVar, "checkSuite");
                        k.g(s1Var, "workFlowCheckRunFragment");
                        hVar = new h(str21, cVar, mVar, s1Var);
                    } else {
                        hVar = null;
                    }
                    String str22 = gVar.a;
                    String str23 = gVar.b;
                    i iVar = gVar.d;
                    m1 m1Var = gVar.e;
                    k.g(str22, "__typename");
                    k.g(str23, "id");
                    gVar2 = new g(str22, str23, hVar, iVar, m1Var);
                }
                return new b20.e(gVar2);
            case 14:
                m20.b bVar3 = (m20.b) obj;
                String str24 = (String) obj2;
                k.g(bVar3, "id");
                k.g(str24, "after");
                String str25 = bVar3.a;
                u0 u0Var4 = new u0(100);
                u0 u0Var5 = new u0(str24);
                String str26 = bVar3.b;
                return new o0(str25, u0Var4, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)));
            case 15:
                j0 j0Var = (j0) obj;
                List list6 = (List) obj2;
                k.g(j0Var, "data");
                k.g(list6, "nodes");
                k0 k0Var = j0Var.a;
                k0 k0Var2 = null;
                l0 l0Var = null;
                if (k0Var != null) {
                    l0 l0Var2 = k0Var.c;
                    if (l0Var2 != null) {
                        g20.v vVar = l0Var2.d;
                        g20.g gVar3 = vVar.n;
                        l0Var = new l0(l0Var2.a, l0Var2.b, l0Var2.c, g20.v.a(vVar, gVar3 != null ? g20.g.a(gVar3, list6) : null));
                    }
                    String str27 = k0Var.a;
                    String str28 = k0Var.b;
                    k.g(str27, "__typename");
                    k0Var2 = new k0(str27, str28, l0Var);
                }
                return new j0(k0Var2);
            case 16:
                m20.b bVar4 = (m20.b) obj;
                String str29 = (String) obj2;
                k.g(bVar4, "id");
                k.g(str29, "after");
                String str30 = bVar4.a;
                u0 u0Var6 = new u0(100);
                u0 u0Var7 = new u0(str29);
                String str31 = bVar4.b;
                return new b20.t0(str30, u0Var6, u0Var7, str31 == null ? t0.d : new u0(str31), new u0(Boolean.valueOf(str31 != null)));
            case 17:
                q0 q0Var = (q0) obj;
                List list7 = (List) obj2;
                k.g(q0Var, "data");
                k.g(list7, "nodes");
                r0 r0Var = q0Var.a;
                r0 r0Var2 = null;
                s0 s0Var = null;
                if (r0Var != null) {
                    s0 s0Var2 = r0Var.c;
                    if (s0Var2 != null) {
                        g20.v vVar2 = s0Var2.c;
                        g20.g gVar4 = vVar2.n;
                        s0Var = new s0(s0Var2.a, s0Var2.b, g20.v.a(vVar2, gVar4 != null ? g20.g.a(gVar4, list7) : null));
                    }
                    String str32 = r0Var.a;
                    String str33 = r0Var.b;
                    k.g(str32, "__typename");
                    r0Var2 = new r0(str32, str33, s0Var);
                }
                return new q0(r0Var2);
            case 18:
                m20.c cVar2 = (m20.c) obj;
                String str34 = (String) obj2;
                k.g(cVar2, "id");
                k.g(str34, "after");
                String str35 = cVar2.a;
                u0 u0Var8 = new u0(str34);
                u0 u0Var9 = new u0(100);
                String str36 = cVar2.b;
                return new t1(str35, u0Var9, u0Var8, str36 == null ? t0.d : new u0(str36), new u0(Boolean.valueOf(str36 != null)), 8);
            case 19:
                q1 q1Var = (q1) obj;
                List list8 = (List) obj2;
                k.g(q1Var, "data");
                k.g(list8, "nodes");
                r1 r1Var = q1Var.a;
                r1 r1Var2 = null;
                v0 v0Var = null;
                b20.s1 s1Var2 = null;
                if (r1Var != null) {
                    b20.s1 s1Var3 = r1Var.c;
                    if (s1Var3 != null) {
                        a1 a1Var = s1Var3.c;
                        v0 v0Var2 = a1Var.b;
                        if (v0Var2 != null) {
                            int i2 = v0Var2.a;
                            x0 x0Var = v0Var2.b;
                            k.g(x0Var, "pageInfo");
                            v0Var = new v0(i2, x0Var, list8);
                        }
                        String str37 = a1Var.a;
                        String str38 = a1Var.c;
                        k.g(str37, "id");
                        k.g(str38, "__typename");
                        a1 a1Var2 = new a1(str37, v0Var, str38);
                        String str39 = s1Var3.a;
                        String str40 = s1Var3.b;
                        k.g(str39, "__typename");
                        k.g(str40, "id");
                        s1Var2 = new b20.s1(str39, str40, a1Var2);
                    }
                    String str41 = r1Var.a;
                    String str42 = r1Var.b;
                    k.g(str41, "__typename");
                    k.g(str42, "id");
                    r1Var2 = new r1(str41, str42, s1Var2);
                }
                return new q1(r1Var2);
            case 20:
                String str43 = (String) obj;
                String str44 = (String) obj2;
                k.g(str43, "id");
                k.g(str44, "after");
                return new g2(str43, new u0(str44));
            case 21:
                c2 c2Var = (c2) obj;
                List list9 = (List) obj2;
                k.g(c2Var, "data");
                k.g(list9, "nodes");
                d2 d2Var = c2Var.a;
                d2 d2Var2 = null;
                e2 e2Var = null;
                if (d2Var != null) {
                    e2 e2Var2 = d2Var.c;
                    if (e2Var2 != null) {
                        f2 f2Var = e2Var2.b;
                        h2 h2Var = f2Var.b.a;
                        k.g(h2Var, "pageInfo");
                        i2 i2Var = new i2(h2Var, list9);
                        String str45 = f2Var.a;
                        k.g(str45, "__typename");
                        f2 f2Var2 = new f2(str45, i2Var);
                        String str46 = e2Var2.a;
                        k.g(str46, "id");
                        e2Var = new e2(str46, f2Var2);
                    }
                    String str47 = d2Var.a;
                    String str48 = d2Var.b;
                    k.g(str47, "__typename");
                    k.g(str48, "id");
                    d2Var2 = new d2(str47, str48, e2Var);
                }
                return new c2(d2Var2);
            case 22:
                d dVar = (d) obj;
                String str49 = (String) obj2;
                k.g(dVar, "<destruct>");
                k.g(str49, "after");
                return new r2(new u0(str49), dVar.a, dVar.b);
            case 23:
                o2 o2Var = (o2) obj;
                List list10 = (List) obj2;
                k.g(o2Var, "data");
                k.g(list10, "nodes");
                p2 p2Var2 = o2Var.a;
                if (p2Var2 != null) {
                    q2 q2Var = p2Var2.b;
                    v1 v1Var = q2Var.b.b;
                    k.g(v1Var, "pageInfo");
                    w1 w1Var = new w1(list10, v1Var);
                    String str50 = q2Var.a;
                    k.g(str50, "__typename");
                    q2 q2Var2 = new q2(str50, w1Var);
                    String str51 = p2Var2.a;
                    String str52 = p2Var2.c;
                    k.g(str51, "id");
                    k.g(str52, "__typename");
                    p2Var = new p2(str51, q2Var2, str52);
                } else {
                    p2Var = null;
                }
                return new o2(p2Var);
            case 24:
                o2 o2Var2 = (o2) obj;
                k.g(o2Var2, "<this>");
                k.g((d) obj2, "it");
                p2 p2Var3 = o2Var2.a;
                return Boolean.valueOf((p2Var3 != null ? p2Var3.b : null) != null);
            case 25:
                ((m6.a) obj).a = (String) obj2;
                return w61.a0.a;
            case 26:
                ((m6.a) obj).d = (n) obj2;
                return w61.a0.a;
            case 27:
                ((m6.a) obj).b = (m6.e) obj2;
                return w61.a0.a;
            case 28:
                ((m6.a) obj).c = ((Integer) obj2).intValue();
                return w61.a0.a;
            default:
                ((Integer) obj2).intValue();
                return new n0.d(z3.d(1));
        }
    }
}
