package do0;

import aa.t0;
import aa.u0;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import com.github.rudroid.adapters.viewholders.c4;
import com.github.rudroid.agents.n4;
import com.github.rudroid.uitoolkit.f1;
import com.github.rudroid.utilities.ui.m0;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.CheckStatusState;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import d2.a0Shadow;
import d3.q;
import f1.p3;
import f1.p5;
import f1.ub;
import gv.d1;
import gv.h1;
import gv.p0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jn0.yf0;
import jo.a10;
import jo.b10;
import jo.bh;
import jo.c10;
import jo.ch;
import jo.eh;
import jo.fh;
import jo.gh;
import jo.mi0;
import jo.u00;
import jo.v00;
import jo.w00;
import jo.x00;
import k71.k;
import k71.u;
import kc0.yb0;
import m10.ee;
import m10.wg0;
import n0.x;
import pz0.ab;
import pz0.ba0;
import qn0.c3;
import qn0.d3;
import qn0.e3;
import qn0.f3;
import qn0.g0;
import qn0.g1;
import qn0.w;
import qo.g;
import qo.h;
import qo.i;
import qo.j0;
import qo.k0;
import qo.l0;
import qo.m;
import qo.o0;
import qo.p;
import qo.q0;
import qo.q1;
import qo.q2;
import qo.r0;
import qo.r1;
import qo.r2;
import qo.s0;
import qo.s2;
import qo.t1;
import qo.t2;
import qo.u2;
import rc0.c2;
import rc0.d2;
import rc0.e2;
import rc0.f2;
import rc0.g2;
import rc0.o2;
import rc0.p2;
import u10.y90;
import v2.f;
import v71.v;
import vn0.v1;
import vn0.w1;
import vo.a1;
import vo.l2;
import vo.m1;
import vo.m2;
import vo.s1;
import vo.v0;
import vo.x0;
import w1.o;
import w1.r;
import wc0.h2;
import wc0.i2;
import y71.n1Shadow;
import y71.y;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t implements kn.b, yf0, mi0, yb0, y90 {
    public s01.l A;
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public com.github.service.wrapper.b t;
    public v u;
    public s01.p v;
    public s01.l w;
    public s01.l x;
    public s01.p y;
    public s01.p z;

    public t(com.github.service.wrapper.j jVar, com.github.service.wrapper.b bVar, v vVar, int i) {

        l0 r1 = null;
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                bo0.a aVar = new bo0.a(24);
                final int i2 = 3;
                j71.e eVar = new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Obj
                        l0 r1 = null;ect obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i2) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar2 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar2, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar2.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i3 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i3, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar2.b;
                                String str13 = eVar2.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i4 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i4, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar3 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar3, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar3.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i5 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i5, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i6 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i6, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                };
                s01.oShadow oVar = s01.oShadow.r;
                final int i3 = 4;
                this.v = new a00.b(jVar, bVar, vVar, aVar, eVar, oVar, new j71.e() { // from class: bo0.e
                    @Override // j71.e
       
                        l0 r1 = null;             public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i3) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar2 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar2, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar2.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar2.b;
                                String str13 = eVar2.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i4 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i4, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar3 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar3, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar3.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i5 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i5, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i6 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i6, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                }, new bo0.a(25), new bo0.a(26), new bo0.a(27), new bo0.a(28), null, null, 129024);
                bp.a aVar2 = new bp.a(10);
                bp.a aVar3 = new bp.a(11);
                final int i4 = 9;
                j71.e eVar2 = new j71.e() { // from class: bo0.e
        
                        l0 r1 = null;            @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i4) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar22.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar3 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar3, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar3.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i5 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i5, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i6 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i6, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                };
                final int i5 = 10;
                this.w = new bo0.b(jVar, bVar, vVar, aVar2, aVar3, eVar2, new j
                        l0 r1 = null;71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i5) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar22.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar3 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar3, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar3.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i6 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i6, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                }, new bp.a(12), new bp.a(13), new bp.a(14), new bp.a(15));
                bp.a aVar4 = new bp.a(4);
                bp.a aVar5 = new bp.a(5);
                final int i6 = 
                        l0 r1 = null;7;
                j71.e eVar3 = new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i6) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar22.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                };
                final int i7 = 8;
   
                        l0 r1 = null;             this.x = new bo0.b(jVar, bVar, vVar, aVar4, aVar5, eVar3, new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i7) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar22.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                }, new bp.a(6), new bp.a(7), new bp.a(8), new bp.a(9));

                        l0 r1 = null;                bo0.a aVar6 = new bo0.a(29);
                final int i8 = 5;
                j71.e eVar4 = new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i8) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar22.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
 
                        l0 r1 = null;                   }
                };
                final int i9 = 6;
                this.y = new a00.b(jVar, bVar, vVar, aVar6, eVar4, oVar, new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i9) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar22.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                
                        l0 r1 = null;}, new bp.a(0), new bp.a(1), new bp.a(2), new bp.a(3), null, null, 126976);
                bp.a aVar7 = new bp.a(23);
                final int i10 = 13;
                j71.e eVar5 = new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i10) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar22.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c
                        l0 r1 = null;2(d2Var2);
                        }
                    }
                };
                final int i12 = 14;
                final int i13 = 15;
                this.z = new a00.b(jVar, bVar, vVar, aVar7, eVar5, oVar, new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i12) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar22.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                         
                        l0 r1 = null;           d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                }, new bp.a(24), new bp.a(25), new bp.a(26), new bp.a(27), new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i13) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar22.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                        
                        l0 r1 = null;        }
                                return new c2(d2Var2);
                        }
                    }
                }, null, 120832);
                bp.a aVar8 = new bp.a(16);
                bp.a aVar9 = new bp.a(17);
                final int i14 = 11;
                j71.e eVar6 = new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i14) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar22.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
   
                        l0 r1 = null;                                 d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                };
                final int i15 = 12;
                this.A = new bo0.b(jVar, bVar, vVar, aVar8, aVar9, eVar6, new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i15) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar22.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                }, new bp.a(18), new bp.a(19), new bp.a(20), new bp.a(21));
      
                        l0 r1 = null;          break;
            case 2:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                bq.a aVar10 = new bq.a(15);
                final int i16 = 20;
                j71.e eVar7 = new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i16) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar22.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                 
                        l0 r1 = null;   k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                };
                s01.oShadow oVar2 = s01.oShadow.r;
                final int i17 = 21;
                this.v = new a00.b(jVar, bVar, vVar, aVar10, eVar7, oVar2, new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i17) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar22.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
            
                        l0 r1 = null;                        d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                }, new bq.a(16), new bq.a(17), new bq.a(18), new bq.a(19), null, null, 129024);
                cd0.a aVar11 = new cd0.a(1);
                cd0.a aVar12 = new cd0.a(2);
                final int i18 = 26;
                j71.e eVar8 = new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i18) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar22.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                             
                        l0 r1 = null;       String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                };
                final int i19 = 27;
                this.w = new bo0.b(jVar, bVar, vVar, aVar11, aVar12, eVar8, new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i19) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar22.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                              
                        l0 r1 = null;      k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                }, new cd0.a(3), new cd0.a(4), new cd0.a(5), new cd0.a(6));
                bq.a aVar13 = new bq.a(25);
                bq.a aVar14 = new bq.a(26);
                final int i20 = 24;
                j71.e eVar9 = new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i20) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar22.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
             
                        l0 r1 = null;                       String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                };
                final int i22 = 25;
                this.x = new bo0.b(jVar, bVar, vVar, aVar13, aVar14, eVar9, new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i22) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar22.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                               
                        l0 r1 = null;     String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                }, new bq.a(27), new bq.a(28), new bq.a(29), new cd0.a(0));
                bq.a aVar15 = new bq.a(20);
                final int i23 = 22;
                j71.e eVar10 = new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i23) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar22.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var 
                        l0 r1 = null;= new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                };
                final int i24 = 23;
                this.y = new a00.b(jVar, bVar, vVar, aVar15, eVar10, oVar2, new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i24) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar22.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                }, new bq.a(21), new bq.a(22), new bq.a(23), new bq.a(24), null, null, 126976);
                cd0.a aVar16 = new cd0.a(14);
                final int i25 = 0;
                j71.e eVar11 = new j71.e() { // from class: cd0.d
                    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, java.util.List] */
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        p2 p2Var;
                        long j;
                        switch (i25) {
                            case 0:
                                e eVar12 = (e) obj;
                                String str = (String) obj2;
                                k.g(eVar12, "<destruct>");
                                k.g(str, "after");
                                break;
                            case 1:
                                o2 o2Var = (o2) obj;
                                List list = (List) obj2;
                                k.g(o2Var, "data");
                                k.g(list, "nodes");
                                p2 p2Var2 = o2Var.a;
                                if (p2Var2 != null) {
                                    rc0.q2 q2Var = p2Var2.b;
                                    wc0.v1 v1Var = q2Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    wc0.w1 w1Var = new wc0.w1(list, v1Var);
                                    String str2 = q2Var.a;
                                    k.g(str2, "__typename");
                                    rc0.q2 q2Var2 = new rc0.q2(str2, w1Var);
                                    String str3 = p2Var2.a;
                                    String str4 = p2Var2.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    p2Var = new p2(str3, q2Var2, str4);
                                } else {
                                    p2Var = null;
                                }
                                break;
                            case 2:
                                o2 o2Var2 = (o2) obj;
                                k.g(o2Var2, "<this>");
                                k.g((e) obj2, "it");
                                p2 p2Var3 = o2Var2.a;
                                break;
                            case 3:
                                s sVar = (s) obj;
                                int intValue = ((Integer) obj2).intValue();
                                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                                    androidx.compose.foundation.layout.b.g(sVar, androidx.compose.foundation.layout.p2.f(o.a, ih.a.n));
                                } else {
                                    sVar.V();
                                }
                                break;
                            case 4:
                                s sVar2 = (s) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    ih.e.a(false, (g9.h) null, (kh.e) null, (jh.d) null, (lh.c) null, (ch.h) null, (ch.e) null, (ch.b) null, (ih.b) null, com.github.rudroid.accounts.d.a, sVar2, 805306368, 511);
                                } else {
                                    sVar2.V();
                                }
                                break;
                            case 5:
                                s sVar3 = (s) obj;
                                int intValue3 = ((Integer) obj2).intValue();
                                if (sVar3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Object N = sVar3.N();
                                    if (N == n.a) {
                                        N = new a(25);
                                        sVar3.n0(N);
                                    }
                                    com.google.common.util.concurrent.a.b(null, null, null, null, null, null, false, null, (j71.c) N, sVar3, 805306368, 511);
                                } else {
                                    sVar3.V();
                                }
                                break;
                            case 6:
                                ((Long) obj2).getClass();
                                break;
                            case 7:
                                mn.d dVar = (mn.d) obj;
                                ((Long) obj2).getClass();
                                if (dVar == null) {
                                    j = 2000;
                                } else {
                                    mn.b bVar2 = (mn.b) x61.m.W(dVar.e);
                                    j = (bVar2 != null ? bVar2.c : null) == CheckStatusState.COMPLETED ? 10000L : 4000L;
                                }
                                break;
                            case 8:
                                int intValue4 = ((Integer) obj).intValue();
                                tz0.c cVar = (tz0.c) obj2;
                                k.g(cVar, "statusCheck");
                                break;
                            case 9:
                                ((Long) obj2).getClass();
                                break;
                            case 10:
                                s sVar4 = (s) obj;
                                int intValue5 = ((Integer) obj2).intValue();
                                if (sVar4.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                                    f1.a(androidx.compose.foundation.layout.p2.f(androidx.compose.foundation.layout.p2.e(o.a, 1.0f), ih.a.J), (s3.h) null, 0.0f, 0L, sVar4, 0, 14);
                                } else {
                                    sVar4.V();
                                }
                                break;
                            case 11:
                                s sVar5 = (s) obj;
                                int intValue6 = ((Integer) obj2).intValue();
                                if (sVar5.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                                    o oVar3 = o.a;
                                    r e = androidx.compose.foundation.layout.p2.e(oVar3, 1.0f);
                                    androidx.compose.foundation.layout.l2 a = j2.a(l.e, w1.c.B, sVar5, 54);
                                    int hashCode = Long.hashCode(sVar5.T);
                                    androidx.compose.runtime.v1 l = sVar5.l();
                                    r c = w1.a.c(sVar5, e);
                                    v2.h.o.getClass();
                                    f fVar = v2.g.b;
                                    sVar5.g0();
                                    if (sVar5.S) {
                                        sVar5.k(fVar);
                                    } else {
                                        sVar5.q0();
                                    }
                                    t.I(sVar5, v2.g.f, a);
                                    t.I(sVar5, v2.g.e, l);
                                    t.w(sVar5, Integer.valueOf(hashCode), v2.g.g);
                                    t.E(sVar5, v2.g.h);
                                    t.I(sVar5, v2.g.d, c);
                                    p5.a(z3.C(2131231404, 0, sVar5), (String) null, (r) null, 0L, sVar5, 56, 12);
                                    r B = androidx.compose.foundation.layout.b.B(oVar3, ih.a.l, 0.0f, 0.0f, 0.0f, 14);
                                    String upperCase = i4.p0(2131953595, sVar5).toUpperCase(Locale.ROOT);
                                    k.f(upperCase, "toUpperCase(...)");
                                    ub.b(upperCase, B, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (g3.q0) null, sVar5, 0, 0, 262140);
                                    sVar5.q(true);
                                } else {
                                    sVar5.V();
                                }
                                break;
                            case 12:
                                ((Long) obj2).getClass();
                                break;
                            case 13:
                                s sVar6 = (s) obj;
                                int intValue7 = ((Integer) obj2).intValue();
                                if (sVar6.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                                    p5.a(z3.C(2131231410, 0, sVar6), i4.p0(2131954163, sVar6), (r) null, ih.d.b(sVar6).F, sVar6, 8, 4);
                                } else {
                                    sVar6.V();
                                }
                                break;
                            case 14:
                                s sVar7 = (s) obj;
                                int intValue8 = ((Integer) obj2).intValue();
                                if (sVar7.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                                    p5.a(z3.C(2131231338, 0, sVar7), i4.p0(2131954163, sVar7), (r) null, ih.d.b(sVar7).A, sVar7, 8, 4);
                                } else {
                                    sVar7.V();
                                }
                                break;
                            case 15:
                                s sVar8 = (s) obj;
                                int intValue9 = ((Integer) obj2).intValue();
                                if (sVar8.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                                    r z = androidx.compose.foundation.layout.b.z(f0.o.f(o.a, ih.d.b(sVar8).b, a0Shadow.b), ih.a.n, 0.0f, 2);
                                    yz0.g2 g2Var = new yz0.g2(false, false, "id1", yz0.f2.a, new com.github.service.models.response.a("login2", (Avatar) null, "Copilot", true, (String) null, 50));
                                    Object N2 = sVar8.N();
                                    Object obj3 = N2;
                                    if (N2 == n.a) {
                                        com.github.rudroid.widget.p pVar = new com.github.rudroid.widget.p(15);
                                        sVar8.n0(pVar);
                                        obj3 = pVar;
                                    }
                                    c4.a(z, false, (j71.a) obj3, g2Var, sVar8, 432);
                                } else {
                                    sVar8.V();
                                }
                                break;
                            case 16:
                                s sVar9 = (s) obj;
                                int intValue10 = ((Integer) obj2).intValue();
                                if (sVar9.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                                    r z2 = androidx.compose.foundation.layout.b.z(f0.o.f(o.a, ih.d.b(sVar9).b, a0Shadow.b), ih.a.n, 0.0f, 2);
                                    yz0.g2 g2Var2 = new yz0.g2(false, false, "id1", yz0.f2.a, new com.github.service.models.response.a("login2", (Avatar) null, "Copilot", true, (String) null, 50));
                                    Object N3 = sVar9.N();
                                    Object obj4 = N3;
                                    if (N3 == n.a) {
                                        com.github.rudroid.widget.p pVar2 = new com.github.rudroid.widget.p(15);
                                        sVar9.n0(pVar2);
                                        obj4 = pVar2;
                                    }
                                    c4.a(z2, true, (j71.a) obj4, g2Var2, sVar9, 432);
                                } else {
                                    sVar9.V();
                                }
                                break;
                            case 17:
                                s sVar10 = (s) obj;
                                int intValue11 = ((Integer) obj2).intValue();
                                if (sVar10.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                                    m0.a((r) null, 2131231509, 2131951728, (Integer) null, sVar10, 0, 9);
                                } else {
                                    sVar10.V();
                                }
                                break;
                            case 18:
                                s sVar11 = (s) obj;
                                int intValue12 = ((Integer) obj2).intValue();
                                if (!sVar11.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                                    sVar11.V();
                                }
                                break;
                            case 19:
                                s sVar12 = (s) obj;
                                int intValue13 = ((Integer) obj2).intValue();
                                if (sVar12.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                                    m0.a((r) null, 2131231509, 2131951728, (Integer) null, sVar12, 0, 9);
                                } else {
                                    sVar12.V();
                                }
                                break;
                            case 20:
                                s sVar13 = (s) obj;
                                int intValue14 = ((Integer) obj2).intValue();
                                if (sVar13.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                                    p5.a(z3.C(2131231338, 0, sVar13), (String) null, (r) null, ih.d.b(sVar13).A, sVar13, 56, 4);
                                } else {
                                    sVar13.V();
                                }
                                break;
                            case 21:
                                s sVar14 = (s) obj;
                                int intValue15 = ((Integer) obj2).intValue();
                                if (!sVar14.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                                    sVar14.V();
                                }
                                break;
                            case 22:
                                s sVar15 = (s) obj;
                                int intValue16 = ((Integer) obj2).intValue();
                                if (sVar15.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                                    Object N4 = sVar15.N();
                                    if (N4 == n.a) {
                                        N4 = new com.github.rudroid.actions.checklog.t(25);
                                        sVar15.n0(N4);
                                    }
                                    ub.b(i4.p0(2131951745, sVar15), q.b(o.a, false, (j71.c) N4), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (g3.q0) null, sVar15, 0, 0, 262140);
                                } else {
                                    sVar15.V();
                                }
                                break;
                            case 23:
                                s sVar16 = (s) obj;
                                int intValue17 = ((Integer) obj2).intValue();
                                if (sVar16.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                                    n4.cShadow(z3.C(2131231100, 0, sVar16), ih.d.b(sVar16).E0, ih.d.b(sVar16).F0, sVar16, 8);
                                } else {
                                    sVar16.V();
                                }
                                break;
                            case 24:
                                s sVar17 = (s) obj;
                                int intValue18 = ((Integer) obj2).intValue();
                                if (sVar17.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                                    n4.b(0, sVar17);
                                } else {
                                    sVar17.V();
                                }
                                break;
                            case 25:
                                s sVar18 = (s) obj;
                                int intValue19 = ((Integer) obj2).intValue();
                                if (sVar18.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                                    n4.cShadow(z3.C(2131231100, 0, sVar18), ih.d.b(sVar18).E0, ih.d.b(sVar18).F0, sVar18, 8);
                                    n4.cShadow(z3.C(2131231327, 0, sVar18), ih.d.b(sVar18).B0, ih.d.b(sVar18).C0, sVar18, 8);
                                    n4.cShadow(z3.C(2131231290, 0, sVar18), ih.d.b(sVar18).H0, ih.d.b(sVar18).I0, sVar18, 8);
                                } else {
                                    sVar18.V();
                                }
                                break;
                            case 26:
                                s sVar19 = (s) obj;
                                int intValue20 = ((Integer) obj2).intValue();
                                if (sVar19.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                                    Object N5 = sVar19.N();
                                    if (N5 == n.a) {
                                        N5 = new com.github.rudroid.actions.checklog.t(26);
                                        sVar19.n0(N5);
                                    }
                                    ub.b(i4.p0(2131951739, sVar19), q.b(o.a, false, (j71.c) N5), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 0, 0, (j71.c) null, (g3.q0) null, sVar19, 0, 384, 258044);
                                } else {
                                    sVar19.V();
                                }
                                break;
                            case 27:
                                s sVar20 = (s) obj;
                                int intValue21 = ((Integer) obj2).intValue();
                                if (sVar20.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                                    Object N6 = sVar20.N();
                                    if (N6 == n.a) {
                                        N6 = new com.github.rudroid.actions.checklog.t(27);
                                        sVar20.n0(N6);
                                    }
                                    ub.b(i4.p0(2131951739, sVar20), q.b(o.a, false, (j71.c) N6), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 0, 0, (j71.c) null, (g3.q0) null, sVar20, 0, 384, 258044);
                                } else {
                                    sVar20.V();
                                }
                                break;
                            case 28:
                                s sVar21 = (s) obj;
                                int intValue22 = ((Integer) obj2).intValue();
                                if (sVar21.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                                    Object N7 = sVar21.N();
                                    if (N7 == n.a) {
                                        N7 = new com.github.rudroid.actions.checklog.t(28);
                                        sVar21.n0(N7);
                                    }
                                    ub.b(i4.p0(2131954732, sVar21), q.b(o.a, false, (j71.c) N7), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 0, 0, (j71.c) null, (g3.q0) null, sVar21, 0, 384, 258044);
                                } else {
                                    sVar21.V();
                                }
                                break;
                            default:
                                s sVar22 = (s) obj;
                                int intValue23 = ((Integer) obj2).intValue();
                                if (sVar22.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                                    p5.a(z3.C(2131231434, 0, sVar22), (String) null, (r) null, ih.d.b(sVar22).z, sVar22, 56, 4);
                                } else {
                                    sVar22.V();
                                }
                                break;
                        }
                        return w61.a0Shadow.a;
                    }
                };
                final int i26 = 1;
                final int i27 = 2;
                this.z = new a00.b(jVar, bVar, vVar, aVar16, eVar11, oVar2, new j71.e() { // from class: cd0.d
                    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, java.util.List] */
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        p2 p2Var;
                        long j;
                        switch (i26) {
                            case 0:
                                e eVar12 = (e) obj;
                                String str = (String) obj2;
                                k.g(eVar12, "<destruct>");
                                k.g(str, "after");
                                break;
                            case 1:
                                o2 o2Var = (o2) obj;
                                List list = (List) obj2;
                                k.g(o2Var, "data");
                                k.g(list, "nodes");
                                p2 p2Var2 = o2Var.a;
                                if (p2Var2 != null) {
                                    rc0.q2 q2Var = p2Var2.b;
                                    wc0.v1 v1Var = q2Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    wc0.w1 w1Var = new wc0.w1(list, v1Var);
                                    String str2 = q2Var.a;
                                    k.g(str2, "__typename");
                                    rc0.q2 q2Var2 = new rc0.q2(str2, w1Var);
                                    String str3 = p2Var2.a;
                                    String str4 = p2Var2.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    p2Var = new p2(str3, q2Var2, str4);
                                } else {
                                    p2Var = null;
                                }
                                break;
                            case 2:
                                o2 o2Var2 = (o2) obj;
                                k.g(o2Var2, "<this>");
                                k.g((e) obj2, "it");
                                p2 p2Var3 = o2Var2.a;
                                break;
                            case 3:
                                s sVar = (s) obj;
                                int intValue = ((Integer) obj2).intValue();
                                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                                    androidx.compose.foundation.layout.b.g(sVar, androidx.compose.foundation.layout.p2.f(o.a, ih.a.n));
                                } else {
                                    sVar.V();
                                }
                                break;
                            case 4:
                                s sVar2 = (s) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    ih.e.a(false, (g9.h) null, (kh.e) null, (jh.d) null, (lh.c) null, (ch.h) null, (ch.e) null, (ch.b) null, (ih.b) null, com.github.rudroid.accounts.d.a, sVar2, 805306368, 511);
                                } else {
                                    sVar2.V();
                                }
                                break;
                            case 5:
                                s sVar3 = (s) obj;
                                int intValue3 = ((Integer) obj2).intValue();
                                if (sVar3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Object N = sVar3.N();
                                    if (N == n.a) {
                                        N = new a(25);
                                        sVar3.n0(N);
                                    }
                                    com.google.common.util.concurrent.a.b(null, null, null, null, null, null, false, null, (j71.c) N, sVar3, 805306368, 511);
                                } else {
                                    sVar3.V();
                                }
                                break;
                            case 6:
                                ((Long) obj2).getClass();
                                break;
                            case 7:
                                mn.d dVar = (mn.d) obj;
                                ((Long) obj2).getClass();
                                if (dVar == null) {
                                    j = 2000;
                                } else {
                                    mn.b bVar2 = (mn.b) x61.m.W(dVar.e);
                                    j = (bVar2 != null ? bVar2.c : null) == CheckStatusState.COMPLETED ? 10000L : 4000L;
                                }
                                break;
                            case 8:
                                int intValue4 = ((Integer) obj).intValue();
                                tz0.c cVar = (tz0.c) obj2;
                                k.g(cVar, "statusCheck");
                                break;
                            case 9:
                                ((Long) obj2).getClass();
                                break;
                            case 10:
                                s sVar4 = (s) obj;
                                int intValue5 = ((Integer) obj2).intValue();
                                if (sVar4.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                                    f1.a(androidx.compose.foundation.layout.p2.f(androidx.compose.foundation.layout.p2.e(o.a, 1.0f), ih.a.J), (s3.h) null, 0.0f, 0L, sVar4, 0, 14);
                                } else {
                                    sVar4.V();
                                }
                                break;
                            case 11:
                                s sVar5 = (s) obj;
                                int intValue6 = ((Integer) obj2).intValue();
                                if (sVar5.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                                    o oVar3 = o.a;
                                    r e = androidx.compose.foundation.layout.p2.e(oVar3, 1.0f);
                                    androidx.compose.foundation.layout.l2 a = j2.a(l.e, w1.c.B, sVar5, 54);
                                    int hashCode = Long.hashCode(sVar5.T);
                                    androidx.compose.runtime.v1 l = sVar5.l();
                                    r c = w1.a.c(sVar5, e);
                                    v2.h.o.getClass();
                                    f fVar = v2.g.b;
                                    sVar5.g0();
                                    if (sVar5.S) {
                                        sVar5.k(fVar);
                                    } else {
                                        sVar5.q0();
                                    }
                                    t.I(sVar5, v2.g.f, a);
                                    t.I(sVar5, v2.g.e, l);
                                    t.w(sVar5, Integer.valueOf(hashCode), v2.g.g);
                                    t.E(sVar5, v2.g.h);
                                    t.I(sVar5, v2.g.d, c);
                                    p5.a(z3.C(2131231404, 0, sVar5), (String) null, (r) null, 0L, sVar5, 56, 12);
                                    r B = androidx.compose.foundation.layout.b.B(oVar3, ih.a.l, 0.0f, 0.0f, 0.0f, 14);
                                    String upperCase = i4.p0(2131953595, sVar5).toUpperCase(Locale.ROOT);
                                    k.f(upperCase, "toUpperCase(...)");
                                    ub.b(upperCase, B, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (g3.q0) null, sVar5, 0, 0, 262140);
                                    sVar5.q(true);
                                } else {
                                    sVar5.V();
                                }
                                break;
                            case 12:
                                ((Long) obj2).getClass();
                                break;
                            case 13:
                                s sVar6 = (s) obj;
                                int intValue7 = ((Integer) obj2).intValue();
                                if (sVar6.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                                    p5.a(z3.C(2131231410, 0, sVar6), i4.p0(2131954163, sVar6), (r) null, ih.d.b(sVar6).F, sVar6, 8, 4);
                                } else {
                                    sVar6.V();
                                }
                                break;
                            case 14:
                                s sVar7 = (s) obj;
                                int intValue8 = ((Integer) obj2).intValue();
                                if (sVar7.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                                    p5.a(z3.C(2131231338, 0, sVar7), i4.p0(2131954163, sVar7), (r) null, ih.d.b(sVar7).A, sVar7, 8, 4);
                                } else {
                                    sVar7.V();
                                }
                                break;
                            case 15:
                                s sVar8 = (s) obj;
                                int intValue9 = ((Integer) obj2).intValue();
                                if (sVar8.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                                    r z = androidx.compose.foundation.layout.b.z(f0.o.f(o.a, ih.d.b(sVar8).b, a0Shadow.b), ih.a.n, 0.0f, 2);
                                    yz0.g2 g2Var = new yz0.g2(false, false, "id1", yz0.f2.a, new com.github.service.models.response.a("login2", (Avatar) null, "Copilot", true, (String) null, 50));
                                    Object N2 = sVar8.N();
                                    Object obj3 = N2;
                                    if (N2 == n.a) {
                                        com.github.rudroid.widget.p pVar = new com.github.rudroid.widget.p(15);
                                        sVar8.n0(pVar);
                                        obj3 = pVar;
                                    }
                                    c4.a(z, false, (j71.a) obj3, g2Var, sVar8, 432);
                                } else {
                                    sVar8.V();
                                }
                                break;
                            case 16:
                                s sVar9 = (s) obj;
                                int intValue10 = ((Integer) obj2).intValue();
                                if (sVar9.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                                    r z2 = androidx.compose.foundation.layout.b.z(f0.o.f(o.a, ih.d.b(sVar9).b, a0Shadow.b), ih.a.n, 0.0f, 2);
                                    yz0.g2 g2Var2 = new yz0.g2(false, false, "id1", yz0.f2.a, new com.github.service.models.response.a("login2", (Avatar) null, "Copilot", true, (String) null, 50));
                                    Object N3 = sVar9.N();
                                    Object obj4 = N3;
                                    if (N3 == n.a) {
                                        com.github.rudroid.widget.p pVar2 = new com.github.rudroid.widget.p(15);
                                        sVar9.n0(pVar2);
                                        obj4 = pVar2;
                                    }
                                    c4.a(z2, true, (j71.a) obj4, g2Var2, sVar9, 432);
                                } else {
                                    sVar9.V();
                                }
                                break;
                            case 17:
                                s sVar10 = (s) obj;
                                int intValue11 = ((Integer) obj2).intValue();
                                if (sVar10.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                                    m0.a((r) null, 2131231509, 2131951728, (Integer) null, sVar10, 0, 9);
                                } else {
                                    sVar10.V();
                                }
                                break;
                            case 18:
                                s sVar11 = (s) obj;
                                int intValue12 = ((Integer) obj2).intValue();
                                if (!sVar11.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                                    sVar11.V();
                                }
                                break;
                            case 19:
                                s sVar12 = (s) obj;
                                int intValue13 = ((Integer) obj2).intValue();
                                if (sVar12.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                                    m0.a((r) null, 2131231509, 2131951728, (Integer) null, sVar12, 0, 9);
                                } else {
                                    sVar12.V();
                                }
                                break;
                            case 20:
                                s sVar13 = (s) obj;
                                int intValue14 = ((Integer) obj2).intValue();
                                if (sVar13.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                                    p5.a(z3.C(2131231338, 0, sVar13), (String) null, (r) null, ih.d.b(sVar13).A, sVar13, 56, 4);
                                } else {
                                    sVar13.V();
                                }
                                break;
                            case 21:
                                s sVar14 = (s) obj;
                                int intValue15 = ((Integer) obj2).intValue();
                                if (!sVar14.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                                    sVar14.V();
                                }
                                break;
                            case 22:
                                s sVar15 = (s) obj;
                                int intValue16 = ((Integer) obj2).intValue();
                                if (sVar15.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                                    Object N4 = sVar15.N();
                                    if (N4 == n.a) {
                                        N4 = new com.github.rudroid.actions.checklog.t(25);
                                        sVar15.n0(N4);
                                    }
                                    ub.b(i4.p0(2131951745, sVar15), q.b(o.a, false, (j71.c) N4), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (g3.q0) null, sVar15, 0, 0, 262140);
                                } else {
                                    sVar15.V();
                                }
                                break;
                            case 23:
                                s sVar16 = (s) obj;
                                int intValue17 = ((Integer) obj2).intValue();
                                if (sVar16.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                                    n4.cShadow(z3.C(2131231100, 0, sVar16), ih.d.b(sVar16).E0, ih.d.b(sVar16).F0, sVar16, 8);
                                } else {
                                    sVar16.V();
                                }
                                break;
                            case 24:
                                s sVar17 = (s) obj;
                                int intValue18 = ((Integer) obj2).intValue();
                                if (sVar17.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                                    n4.b(0, sVar17);
                                } else {
                                    sVar17.V();
                                }
                                break;
                            case 25:
                                s sVar18 = (s) obj;
                                int intValue19 = ((Integer) obj2).intValue();
                                if (sVar18.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                                    n4.cShadow(z3.C(2131231100, 0, sVar18), ih.d.b(sVar18).E0, ih.d.b(sVar18).F0, sVar18, 8);
                                    n4.cShadow(z3.C(2131231327, 0, sVar18), ih.d.b(sVar18).B0, ih.d.b(sVar18).C0, sVar18, 8);
                                    n4.cShadow(z3.C(2131231290, 0, sVar18), ih.d.b(sVar18).H0, ih.d.b(sVar18).I0, sVar18, 8);
                                } else {
                                    sVar18.V();
                                }
                                break;
                            case 26:
                                s sVar19 = (s) obj;
                                int intValue20 = ((Integer) obj2).intValue();
                                if (sVar19.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                                    Object N5 = sVar19.N();
                                    if (N5 == n.a) {
                                        N5 = new com.github.rudroid.actions.checklog.t(26);
                                        sVar19.n0(N5);
                                    }
                                    ub.b(i4.p0(2131951739, sVar19), q.b(o.a, false, (j71.c) N5), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 0, 0, (j71.c) null, (g3.q0) null, sVar19, 0, 384, 258044);
                                } else {
                                    sVar19.V();
                                }
                                break;
                            case 27:
                                s sVar20 = (s) obj;
                                int intValue21 = ((Integer) obj2).intValue();
                                if (sVar20.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                                    Object N6 = sVar20.N();
                                    if (N6 == n.a) {
                                        N6 = new com.github.rudroid.actions.checklog.t(27);
                                        sVar20.n0(N6);
                                    }
                                    ub.b(i4.p0(2131951739, sVar20), q.b(o.a, false, (j71.c) N6), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 0, 0, (j71.c) null, (g3.q0) null, sVar20, 0, 384, 258044);
                                } else {
                                    sVar20.V();
                                }
                                break;
                            case 28:
                                s sVar21 = (s) obj;
                                int intValue22 = ((Integer) obj2).intValue();
                                if (sVar21.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                                    Object N7 = sVar21.N();
                                    if (N7 == n.a) {
                                        N7 = new com.github.rudroid.actions.checklog.t(28);
                                        sVar21.n0(N7);
                                    }
                                    ub.b(i4.p0(2131954732, sVar21), q.b(o.a, false, (j71.c) N7), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 0, 0, (j71.c) null, (g3.q0) null, sVar21, 0, 384, 258044);
                                } else {
                                    sVar21.V();
                                }
                                break;
                            default:
                                s sVar22 = (s) obj;
                                int intValue23 = ((Integer) obj2).intValue();
                                if (sVar22.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                                    p5.a(z3.C(2131231434, 0, sVar22), (String) null, (r) null, ih.d.b(sVar22).z, sVar22, 56, 4);
                                } else {
                                    sVar22.V();
                                }
                                break;
                        }
                        return w61.a0Shadow.a;
                    }
                }, new cd0.a(15), new cd0.a(16), new cd0.a(17), new cd0.a(18), new j71.e() { // from class: cd0.d
                    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, java.util.List] */
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        p2 p2Var;
                        long j;
                        switch (i27) {
                            case 0:
                                e eVar12 = (e) obj;
                                String str = (String) obj2;
                                k.g(eVar12, "<destruct>");
                                k.g(str, "after");
                                break;
                            case 1:
                                o2 o2Var = (o2) obj;
                                List list = (List) obj2;
                                k.g(o2Var, "data");
                                k.g(list, "nodes");
                                p2 p2Var2 = o2Var.a;
                                if (p2Var2 != null) {
                                    rc0.q2 q2Var = p2Var2.b;
                                    wc0.v1 v1Var = q2Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    wc0.w1 w1Var = new wc0.w1(list, v1Var);
                                    String str2 = q2Var.a;
                                    k.g(str2, "__typename");
                                    rc0.q2 q2Var2 = new rc0.q2(str2, w1Var);
                                    String str3 = p2Var2.a;
                                    String str4 = p2Var2.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    p2Var = new p2(str3, q2Var2, str4);
                                } else {
                                    p2Var = null;
                                }
                                break;
                            case 2:
                                o2 o2Var2 = (o2) obj;
                                k.g(o2Var2, "<this>");
                                k.g((e) obj2, "it");
                                p2 p2Var3 = o2Var2.a;
                                break;
                            case 3:
                                s sVar = (s) obj;
                                int intValue = ((Integer) obj2).intValue();
                                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                                    androidx.compose.foundation.layout.b.g(sVar, androidx.compose.foundation.layout.p2.f(o.a, ih.a.n));
                                } else {
                                    sVar.V();
                                }
                                break;
                            case 4:
                                s sVar2 = (s) obj;
                                int intValue2 = ((Integer) obj2).intValue();
                                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    ih.e.a(false, (g9.h) null, (kh.e) null, (jh.d) null, (lh.c) null, (ch.h) null, (ch.e) null, (ch.b) null, (ih.b) null, com.github.rudroid.accounts.d.a, sVar2, 805306368, 511);
                                } else {
                                    sVar2.V();
                                }
                                break;
                            case 5:
                                s sVar3 = (s) obj;
                                int intValue3 = ((Integer) obj2).intValue();
                                if (sVar3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    Object N = sVar3.N();
                                    if (N == n.a) {
                                        N = new a(25);
                                        sVar3.n0(N);
                                    }
                                    com.google.common.util.concurrent.a.b(null, null, null, null, null, null, false, null, (j71.c) N, sVar3, 805306368, 511);
                                } else {
                                    sVar3.V();
                                }
                                break;
                            case 6:
                                ((Long) obj2).getClass();
                                break;
                            case 7:
                                mn.d dVar = (mn.d) obj;
                                ((Long) obj2).getClass();
                                if (dVar == null) {
                                    j = 2000;
                                } else {
                                    mn.b bVar2 = (mn.b) x61.m.W(dVar.e);
                                    j = (bVar2 != null ? bVar2.c : null) == CheckStatusState.COMPLETED ? 10000L : 4000L;
                                }
                                break;
                            case 8:
                                int intValue4 = ((Integer) obj).intValue();
                                tz0.c cVar = (tz0.c) obj2;
                                k.g(cVar, "statusCheck");
                                break;
                            case 9:
                                ((Long) obj2).getClass();
                                break;
                            case 10:
                                s sVar4 = (s) obj;
                                int intValue5 = ((Integer) obj2).intValue();
                                if (sVar4.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                                    f1.a(androidx.compose.foundation.layout.p2.f(androidx.compose.foundation.layout.p2.e(o.a, 1.0f), ih.a.J), (s3.h) null, 0.0f, 0L, sVar4, 0, 14);
                                } else {
                                    sVar4.V();
                                }
                                break;
                            case 11:
                                s sVar5 = (s) obj;
                                int intValue6 = ((Integer) obj2).intValue();
                                if (sVar5.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                                    o oVar3 = o.a;
                                    r e = androidx.compose.foundation.layout.p2.e(oVar3, 1.0f);
                                    androidx.compose.foundation.layout.l2 a = j2.a(l.e, w1.c.B, sVar5, 54);
                                    int hashCode = Long.hashCode(sVar5.T);
                                    androidx.compose.runtime.v1 l = sVar5.l();
                                    r c = w1.a.c(sVar5, e);
                                    v2.h.o.getClass();
                                    f fVar = v2.g.b;
                                    sVar5.g0();
                                    if (sVar5.S) {
                                        sVar5.k(fVar);
                                    } else {
                                        sVar5.q0();
                                    }
                                    t.I(sVar5, v2.g.f, a);
                                    t.I(sVar5, v2.g.e, l);
                                    t.w(sVar5, Integer.valueOf(hashCode), v2.g.g);
                                    t.E(sVar5, v2.g.h);
                                    t.I(sVar5, v2.g.d, c);
                                    p5.a(z3.C(2131231404, 0, sVar5), (String) null, (r) null, 0L, sVar5, 56, 12);
                                    r B = androidx.compose.foundation.layout.b.B(oVar3, ih.a.l, 0.0f, 0.0f, 0.0f, 14);
                                    String upperCase = i4.p0(2131953595, sVar5).toUpperCase(Locale.ROOT);
                                    k.f(upperCase, "toUpperCase(...)");
                                    ub.b(upperCase, B, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (g3.q0) null, sVar5, 0, 0, 262140);
                                    sVar5.q(true);
                                } else {
                                    sVar5.V();
                                }
                                break;
                            case 12:
                                ((Long) obj2).getClass();
                                break;
                            case 13:
                                s sVar6 = (s) obj;
                                int intValue7 = ((Integer) obj2).intValue();
                                if (sVar6.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                                    p5.a(z3.C(2131231410, 0, sVar6), i4.p0(2131954163, sVar6), (r) null, ih.d.b(sVar6).F, sVar6, 8, 4);
                                } else {
                                    sVar6.V();
                                }
                                break;
                            case 14:
                                s sVar7 = (s) obj;
                                int intValue8 = ((Integer) obj2).intValue();
                                if (sVar7.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                                    p5.a(z3.C(2131231338, 0, sVar7), i4.p0(2131954163, sVar7), (r) null, ih.d.b(sVar7).A, sVar7, 8, 4);
                                } else {
                                    sVar7.V();
                                }
                                break;
                            case 15:
                                s sVar8 = (s) obj;
                                int intValue9 = ((Integer) obj2).intValue();
                                if (sVar8.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                                    r z = androidx.compose.foundation.layout.b.z(f0.o.f(o.a, ih.d.b(sVar8).b, a0Shadow.b), ih.a.n, 0.0f, 2);
                                    yz0.g2 g2Var = new yz0.g2(false, false, "id1", yz0.f2.a, new com.github.service.models.response.a("login2", (Avatar) null, "Copilot", true, (String) null, 50));
                                    Object N2 = sVar8.N();
                                    Object obj3 = N2;
                                    if (N2 == n.a) {
                                        com.github.rudroid.widget.p pVar = new com.github.rudroid.widget.p(15);
                                        sVar8.n0(pVar);
                                        obj3 = pVar;
                                    }
                                    c4.a(z, false, (j71.a) obj3, g2Var, sVar8, 432);
                                } else {
                                    sVar8.V();
                                }
                                break;
                            case 16:
                                s sVar9 = (s) obj;
                                int intValue10 = ((Integer) obj2).intValue();
                                if (sVar9.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                                    r z2 = androidx.compose.foundation.layout.b.z(f0.o.f(o.a, ih.d.b(sVar9).b, a0Shadow.b), ih.a.n, 0.0f, 2);
                                    yz0.g2 g2Var2 = new yz0.g2(false, false, "id1", yz0.f2.a, new com.github.service.models.response.a("login2", (Avatar) null, "Copilot", true, (String) null, 50));
                                    Object N3 = sVar9.N();
                                    Object obj4 = N3;
                                    if (N3 == n.a) {
                                        com.github.rudroid.widget.p pVar2 = new com.github.rudroid.widget.p(15);
                                        sVar9.n0(pVar2);
                                        obj4 = pVar2;
                                    }
                                    c4.a(z2, true, (j71.a) obj4, g2Var2, sVar9, 432);
                                } else {
                                    sVar9.V();
                                }
                                break;
                            case 17:
                                s sVar10 = (s) obj;
                                int intValue11 = ((Integer) obj2).intValue();
                                if (sVar10.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                                    m0.a((r) null, 2131231509, 2131951728, (Integer) null, sVar10, 0, 9);
                                } else {
                                    sVar10.V();
                                }
                                break;
                            case 18:
                                s sVar11 = (s) obj;
                                int intValue12 = ((Integer) obj2).intValue();
                                if (!sVar11.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                                    sVar11.V();
                                }
                                break;
                            case 19:
                                s sVar12 = (s) obj;
                                int intValue13 = ((Integer) obj2).intValue();
                                if (sVar12.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                                    m0.a((r) null, 2131231509, 2131951728, (Integer) null, sVar12, 0, 9);
                                } else {
                                    sVar12.V();
                                }
                                break;
                            case 20:
                                s sVar13 = (s) obj;
                                int intValue14 = ((Integer) obj2).intValue();
                                if (sVar13.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                                    p5.a(z3.C(2131231338, 0, sVar13), (String) null, (r) null, ih.d.b(sVar13).A, sVar13, 56, 4);
                                } else {
                                    sVar13.V();
                                }
                                break;
                            case 21:
                                s sVar14 = (s) obj;
                                int intValue15 = ((Integer) obj2).intValue();
                                if (!sVar14.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                                    sVar14.V();
                                }
                                break;
                            case 22:
                                s sVar15 = (s) obj;
                                int intValue16 = ((Integer) obj2).intValue();
                                if (sVar15.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                                    Object N4 = sVar15.N();
                                    if (N4 == n.a) {
                                        N4 = new com.github.rudroid.actions.checklog.t(25);
                                        sVar15.n0(N4);
                                    }
                                    ub.b(i4.p0(2131951745, sVar15), q.b(o.a, false, (j71.c) N4), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (g3.q0) null, sVar15, 0, 0, 262140);
                                } else {
                                    sVar15.V();
                                }
                                break;
                            case 23:
                                s sVar16 = (s) obj;
                                int intValue17 = ((Integer) obj2).intValue();
                                if (sVar16.S(intValue17 & 1, (intValue17 & 3) != 2)) {
                                    n4.cShadow(z3.C(2131231100, 0, sVar16), ih.d.b(sVar16).E0, ih.d.b(sVar16).F0, sVar16, 8);
                                } else {
                                    sVar16.V();
                                }
                                break;
                            case 24:
                                s sVar17 = (s) obj;
                                int intValue18 = ((Integer) obj2).intValue();
                                if (sVar17.S(intValue18 & 1, (intValue18 & 3) != 2)) {
                                    n4.b(0, sVar17);
                                } else {
                                    sVar17.V();
                                }
                                break;
                            case 25:
                                s sVar18 = (s) obj;
                                int intValue19 = ((Integer) obj2).intValue();
                                if (sVar18.S(intValue19 & 1, (intValue19 & 3) != 2)) {
                                    n4.cShadow(z3.C(2131231100, 0, sVar18), ih.d.b(sVar18).E0, ih.d.b(sVar18).F0, sVar18, 8);
                                    n4.cShadow(z3.C(2131231327, 0, sVar18), ih.d.b(sVar18).B0, ih.d.b(sVar18).C0, sVar18, 8);
                                    n4.cShadow(z3.C(2131231290, 0, sVar18), ih.d.b(sVar18).H0, ih.d.b(sVar18).I0, sVar18, 8);
                                } else {
                                    sVar18.V();
                                }
                                break;
                            case 26:
                                s sVar19 = (s) obj;
                                int intValue20 = ((Integer) obj2).intValue();
                                if (sVar19.S(intValue20 & 1, (intValue20 & 3) != 2)) {
                                    Object N5 = sVar19.N();
                                    if (N5 == n.a) {
                                        N5 = new com.github.rudroid.actions.checklog.t(26);
                                        sVar19.n0(N5);
                                    }
                                    ub.b(i4.p0(2131951739, sVar19), q.b(o.a, false, (j71.c) N5), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 0, 0, (j71.c) null, (g3.q0) null, sVar19, 0, 384, 258044);
                                } else {
                                    sVar19.V();
                                }
                                break;
                            case 27:
                                s sVar20 = (s) obj;
                                int intValue21 = ((Integer) obj2).intValue();
                                if (sVar20.S(intValue21 & 1, (intValue21 & 3) != 2)) {
                                    Object N6 = sVar20.N();
                                    if (N6 == n.a) {
                                        N6 = new com.github.rudroid.actions.checklog.t(27);
                                        sVar20.n0(N6);
                                    }
                                    ub.b(i4.p0(2131951739, sVar20), q.b(o.a, false, (j71.c) N6), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 0, 0, (j71.c) null, (g3.q0) null, sVar20, 0, 384, 258044);
                                } else {
                                    sVar20.V();
                                }
                                break;
                            case 28:
                                s sVar21 = (s) obj;
                                int intValue22 = ((Integer) obj2).intValue();
                                if (sVar21.S(intValue22 & 1, (intValue22 & 3) != 2)) {
                                    Object N7 = sVar21.N();
                                    if (N7 == n.a) {
                                        N7 = new com.github.rudroid.actions.checklog.t(28);
                                        sVar21.n0(N7);
                                    }
                                    ub.b(i4.p0(2131954732, sVar21), q.b(o.a, false, (j71.c) N7), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 0, 0, (j71.c) null, (g3.q0) null, sVar21, 0, 384, 258044);
                                } else {
                                    sVar21.V();
                                }
                                break;
                            default:
                                s sVar22 = (s) obj;
                                int intValue23 = ((Integer) obj
                        l0 r1 = null;2).intValue();
                                if (sVar22.S(intValue23 & 1, (intValue23 & 3) != 2)) {
                                    p5.a(z3.C(2131231434, 0, sVar22), (String) null, (r) null, ih.d.b(sVar22).z, sVar22, 56, 4);
                                } else {
                                    sVar22.V();
                                }
                                break;
                        }
                        return w61.a0Shadow.a;
                    }
                }, null, 120832);
                cd0.a aVar17 = new cd0.a(7);
                cd0.a aVar18 = new cd0.a(8);
                final int i28 = 28;
                j71.e eVar12 = new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i28) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar22.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                             
                        l0 r1 = null;           k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                };
                final int i29 = 29;
                this.A = new bo0.b(jVar, bVar, vVar, aVar17, aVar18, eVar12, new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i29) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar = eVar22.a;
                                m mVar = null;
                                if (gVar != null) {
                                    h hVar3 = gVar.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar.a;
                                    String str11 = gVar.b;
                                    i iVar = gVar.d;
                                    m1 m1Var = gVar.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar2 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar2 != null ? vo.g.a(gVar2, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar2 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar2, "id");
                                k.g(str24, "after");
                                String str25 = cVar2.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar2.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                }, new cd0.a(9), new cd0.a(10), new cd0.a(11), new cd0.a(12));
                break;
            case 3:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                lm0.g gVar = new lm0.g(24);
                lb0.a aVar19 = new lb0.a(12);
                s01.oShadow oVar3 = s01.oShadow.r;
                this.v = new jy.d(jVar, bVar, vVar, gVar, aVar19, oVar3, new lb0.a(13), new lm0.g(25), new lm0.g(26), new lm0.g(27), new lm0.g(28), null, null, 129024);
                this.w = new bo0.b(jVar, bVar, vVar, new m20.a(10), new m20.a(11), new lb0.a(18), new lb0.a(19), new m20.a(12), new m20.a(13), new m20.a(14), new m20.a(15));
                this.x = new bo0.b(jVar, bVar, vVar, new m20.a(4), new m20.a(5), new lb0.a(16), new lb0.a(17), new m20.a(6), new m20.a(7), new m20.a(8), new m20.a(9));
                this.y = new jy.d(jVar, bVar, vVar, new lm0.g(29), new lb0.a(14), oVar3, new lb0.a(15), new m20.a(0), new m20.a(1), new m20.a(2), new m20.a(3), null, null, 126976);
                this.z = new jy.d(jVar, bVar, vVar, new m20.a(23), new lb0.a(22), oVar3, new lb0.a(23), new m20.a(24), new m20.a(25), new m20.a(26), new m20.a(27), new lb0.a(24), null, 120832);
                this.A = new bo0.b(jVar, bVar, vVar, new m20.a(16), new m20.a(17), new lb0.a(20), new lb0.a(21), new m20.a(18), new m20.a(19), new m20.a(20), new m20.a(21));
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                bf.c cVar = new bf.c(19);
                a00.a aVar20 = new a00.a(20, (byte) 0);
                s01.oShadow oVar4 = s01.oShadow.r;
                this.v = new a00.b(jVar, bVar, vVar, cVar, aVar20, oVar4, new a00.a(21, (byte) 0), new bf.c(20)
                        l0 r1 = null;, new bf.c(21), new bf.c(22), new bf.c(23), null, null, 129024);
                this.w = new bo0.b(jVar, bVar, vVar, new bo0.a(5), new bo0.a(6), new a00.a(26, (byte) 0), new a00.a(27, (byte) 0), new bo0.a(7), new bo0.a(8), new bo0.a(9), new bo0.a(10));
                this.x = new bo0.b(jVar, bVar, vVar, new bf.c(29), new bo0.a(0), new a00.a(24, (byte) 0), new a00.a(25, (byte) 0), new bo0.a(1), new bo0.a(2), new bo0.a(3), new bo0.a(4));
                this.y = new a00.b(jVar, bVar, vVar, new bf.c(24), new a00.a(22, (byte) 0), oVar4, new a00.a(23, (byte) 0), new bf.c(25), new bf.c(26), new bf.c(27), new bf.c(28), null, null, 126976);
                bo0.a aVar21 = new bo0.a(18);
                final int i30 = 0;
                j71.e eVar13 = new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i30) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar2 = eVar22.a;
                                m mVar = null;
                                if (gVar2 != null) {
                                    h hVar3 = gVar2.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i32 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i32, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar2 = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar2, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar2, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar2.a;
                                    String str11 = gVar2.b;
                                    i iVar = gVar2.d;
                                    m1 m1Var = gVar2.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar22 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar22 != null ? vo.g.a(gVar22, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar22 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar22, "id");
                                k.g(str24, "after");
                                String str25 = cVar22.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar22.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str7
                        l0 r1 = null;8 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                };
                final int i32 = 1;
                final int i33 = 2;
                this.z = new a00.b(jVar, bVar, vVar, aVar21, eVar13, oVar4, new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i32) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar2 = eVar22.a;
                                m mVar = null;
                                if (gVar2 != null) {
                                    h hVar3 = gVar2.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i322 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i322, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar2 = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar2, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar2, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar2.a;
                                    String str11 = gVar2.b;
                                    i iVar = gVar2.d;
                                    m1 m1Var = gVar2.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar22 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar22 != null ? vo.g.a(gVar22, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar22 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar22, "id");
                                k.g(str24, "after");
                                String str25 = cVar22.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar22.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
 
                        l0 r1 = null;                                       f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                }, new bo0.a(19), new bo0.a(20), new bo0.a(21), new bo0.a(22), new j71.e() { // from class: bo0.e
                    @Override // j71.e
                    public final Object s(Object obj, Object obj2) {
                        d3 d3Var;
                        h hVar;
                        qo.d3 d3Var2;
                        rc0.h hVar2;
                        switch (i33) {
                            case 0:
                                f fVar = (f) obj;
                                String str = (String) obj2;
                                k.g(fVar, "<destruct>");
                                k.g(str, "after");
                                return new f3(new u0(str), fVar.a, fVar.b);
                            case 1:
                                c3 c3Var = (c3) obj;
                                List list = (List) obj2;
                                k.g(c3Var, "data");
                                k.g(list, "nodes");
                                d3 d3Var3 = c3Var.a;
                                if (d3Var3 != null) {
                                    e3 e3Var = d3Var3.b;
                                    v1 v1Var = e3Var.b.b;
                                    k.g(v1Var, "pageInfo");
                                    w1 w1Var = new w1(list, v1Var);
                                    String str2 = e3Var.a;
                                    k.g(str2, "__typename");
                                    e3 e3Var2 = new e3(str2, w1Var);
                                    String str3 = d3Var3.a;
                                    String str4 = d3Var3.c;
                                    k.g(str3, "id");
                                    k.g(str4, "__typename");
                                    d3Var = new d3(str3, e3Var2, str4);
                                } else {
                                    d3Var = null;
                                }
                                String str5 = c3Var.b;
                                String str6 = c3Var.c;
                                k.g(str5, "id");
                                k.g(str6, "__typename");
                                return new c3(d3Var, str5, str6);
                            case 2:
                                c3 c3Var2 = (c3) obj;
                                k.g(c3Var2, "<this>");
                                k.g((f) obj2, "it");
                                d3 d3Var4 = c3Var2.a;
                                return Boolean.valueOf((d3Var4 != null ? d3Var4.b : null) != null);
                            case 3:
                                String str7 = (String) obj;
                                String str8 = (String) obj2;
                                k.g(str7, "id");
                                k.g(str8, "after");
                                return new p(str7, new u0(100), new u0(str8), 24);
                            case 4:
                                qo.e eVar22 = (qo.e) obj;
                                List list2 = (List) obj2;
                                k.g(eVar22, "data");
                                k.g(list2, "nodes");
                                g gVar2 = eVar22.a;
                                m mVar = null;
                                if (gVar2 != null) {
                                    h hVar3 = gVar2.c;
                                    if (hVar3 != null) {
                                        m mVar2 = hVar3.c;
                                        if (mVar2 != null) {
                                            int i322 = mVar2.a;
                                            qo.k kVar = mVar2.b;
                                            k.g(kVar, "pageInfo");
                                            mVar = new m(i322, kVar, list2);
                                        }
                                        String str9 = hVar3.a;
                                        qo.c cVar2 = hVar3.b;
                                        s1 s1Var = hVar3.d;
                                        k.g(str9, "__typename");
                                        k.g(cVar2, "checkSuite");
                                        k.g(s1Var, "workFlowCheckRunFragment");
                                        hVar = new h(str9, cVar2, mVar, s1Var);
                                    } else {
                                        hVar = null;
                                    }
                                    String str10 = gVar2.a;
                                    String str11 = gVar2.b;
                                    i iVar = gVar2.d;
                                    m1 m1Var = gVar2.e;
                                    k.g(str10, "__typename");
                                    k.g(str11, "id");
                                    mVar = new g(str10, str11, hVar, iVar, m1Var);
                                }
                                String str12 = eVar22.b;
                                String str13 = eVar22.c;
                                k.g(str12, "id");
                                k.g(str13, "__typename");
                                return new qo.e(mVar, str12, str13);
                            case 5:
                                bp.b bVar2 = (bp.b) obj;
                                String str14 = (String) obj2;
                                k.g(bVar2, "id");
                                k.g(str14, "after");
                                String str15 = bVar2.a;
                                u0 u0Var = new u0(100);
                                u0 u0Var2 = new u0(str14);
                                String str16 = bVar2.b;
                                return new o0(str15, u0Var, u0Var2, str16 == null ? t0.d : new u0(str16), new u0(Boolean.valueOf(str16 != null)));
                            case 6:
                                j0 j0Var = (j0) obj;
                                List list3 = (List) obj2;
                                k.g(j0Var, "data");
                                k.g(list3, "nodes");
                                k0 k0Var = j0Var.a;
                                if (k0Var != null) {
                                    l0 l0Var = k0Var.c;
                                    if (l0Var != null) {
                                        vo.v vVar2 = l0Var.d;
                                        vo.g gVar22 = vVar2.n;
                                        r1 = new l0(l0Var.a, l0Var.b, l0Var.c, vo.v.a(vVar2, gVar22 != null ? vo.g.a(gVar22, list3) : null));
                                    }
                                    String str17 = k0Var.a;
                                    String str18 = k0Var.b;
                                    k.g(str17, "__typename");
                                    r1 = new k0(str17, str18, r1);
                                }
                                return new j0(r1, j0Var.b, j0Var.c);
                            case 7:
                                bp.b bVar3 = (bp.b) obj;
                                String str19 = (String) obj2;
                                k.g(bVar3, "id");
                                k.g(str19, "after");
                                String str20 = bVar3.a;
                                u0 u0Var3 = new u0(100);
                                u0 u0Var4 = new u0(str19);
                                String str21 = bVar3.b;
                                return new qo.t0(str20, u0Var3, u0Var4, str21 == null ? t0.d : new u0(str21), new u0(Boolean.valueOf(str21 != null)));
                            case 8:
                                q0 q0Var = (q0) obj;
                                List list4 = (List) obj2;
                                k.g(q0Var, "data");
                                k.g(list4, "nodes");
                                r0 r0Var = q0Var.a;
                                if (r0Var != null) {
                                    s0 s0Var = r0Var.c;
                                    if (s0Var != null) {
                                        vo.v vVar3 = s0Var.c;
                                        vo.g gVar3 = vVar3.n;
                                        r1 = new s0(s0Var.a, s0Var.b, vo.v.a(vVar3, gVar3 != null ? vo.g.a(gVar3, list4) : null));
                                    }
                                    String str22 = r0Var.a;
                                    String str23 = r0Var.b;
                                    k.g(str22, "__typename");
                                    r1 = new r0(str22, str23, r1);
                                }
                                return new q0(r1, q0Var.b, q0Var.c);
                            case 9:
                                bp.c cVar22 = (bp.c) obj;
                                String str24 = (String) obj2;
                                k.g(cVar22, "id");
                                k.g(str24, "after");
                                String str25 = cVar22.a;
                                u0 u0Var5 = new u0(str24);
                                u0 u0Var6 = new u0(100);
                                String str26 = cVar22.b;
                                return new t1(str25, u0Var6, u0Var5, str26 == null ? t0.d : new u0(str26), new u0(Boolean.valueOf(str26 != null)), 8);
                            case 10:
                                q1 q1Var = (q1) obj;
                                List list5 = (List) obj2;
                                k.g(q1Var, "data");
                                k.g(list5, "nodes");
                                r1 r1Var = q1Var.a;
                                v0 v0Var = null;
                                if (r1Var != null) {
                                    qo.s1 s1Var2 = r1Var.c;
                                    if (s1Var2 != null) {
                                        a1 a1Var = s1Var2.c;
                                        v0 v0Var2 = a1Var.b;
                                        if (v0Var2 != null) {
                                            int i42 = v0Var2.a;
                                            x0 x0Var = v0Var2.b;
                                            k.g(x0Var, "pageInfo");
                                            v0Var = new v0(i42, x0Var, list5);
                                        }
                                        String str27 = a1Var.a;
                                        String str28 = a1Var.c;
                                        k.g(str27, "id");
                                        k.g(str28, "__typename");
                                        a1 a1Var2 = new a1(str27, v0Var, str28);
                                        String str29 = s1Var2.a;
                                        String str30 = s1Var2.b;
                                        k.g(str29, "__typename");
                                        k.g(str30, "id");
                                        v0Var = new qo.s1(str29, str30, a1Var2);
                                    }
                                    String str31 = r1Var.a;
                                    String str32 = r1Var.b;
                                    k.g(str31, "__typename");
                                    k.g(str32, "id");
                                    v0Var = new r1(str31, str32, v0Var);
                                }
                                String str33 = q1Var.b;
                                String str34 = q1Var.c;
                                k.g(str33, "id");
                                k.g(str34, "__typename");
                                return new q1(v0Var, str33, str34);
                            case 11:
                                String str35 = (String) obj;
                                String str36 = (String) obj2;
                                k.g(str35, "id");
                                k.g(str36, "after");
                                return new u2(str35, new u0(str36));
                            case 12:
                                q2 q2Var = (q2) obj;
                                List list6 = (List) obj2;
                                k.g(q2Var, "data");
                                k.g(list6, "nodes");
                                r2 r2Var = q2Var.a;
                                s2 s2Var = null;
                                if (r2Var != null) {
                                    s2 s2Var2 = r2Var.c;
                                    if (s2Var2 != null) {
                                        t2 t2Var = s2Var2.b;
                                        l2 l2Var = t2Var.b.a;
                                        k.g(l2Var, "pageInfo");
                                        m2 m2Var = new m2(l2Var, list6);
                                        String str37 = t2Var.a;
                                        k.g(str37, "__typename");
                                        t2 t2Var2 = new t2(str37, m2Var);
                                        String str38 = s2Var2.a;
                                        k.g(str38, "id");
                                        s2Var = new s2(str38, t2Var2);
                                    }
                                    String str39 = r2Var.a;
                                    String str40 = r2Var.b;
                                    k.g(str39, "__typename");
                                    k.g(str40, "id");
                                    s2Var = new r2(str39, str40, s2Var);
                                }
                                String str41 = q2Var.b;
                                String str42 = q2Var.c;
                                k.g(str41, "id");
                                k.g(str42, "__typename");
                                return new q2(s2Var, str41, str42);
                            case 13:
                                bp.d dVar = (bp.d) obj;
                                String str43 = (String) obj2;
                                k.g(dVar, "<destruct>");
                                k.g(str43, "after");
                                return new qo.f3(new u0(str43), dVar.a, dVar.b);
                            case 14:
                                qo.c3 c3Var3 = (qo.c3) obj;
                                List list7 = (List) obj2;
                                k.g(c3Var3, "data");
                                k.g(list7, "nodes");
                                qo.d3 d3Var5 = c3Var3.a;
                                if (d3Var5 != null) {
                                    qo.e3 e3Var3 = d3Var5.b;
                                    vo.v1 v1Var2 = e3Var3.b.b;
                                    k.g(v1Var2, "pageInfo");
                                    vo.w1 w1Var2 = new vo.w1(list7, v1Var2);
                                    String str44 = e3Var3.a;
                                    k.g(str44, "__typename");
                                    qo.e3 e3Var4 = new qo.e3(str44, w1Var2);
                                    String str45 = d3Var5.a;
                                    String str46 = d3Var5.c;
                                    k.g(str45, "id");
                                    k.g(str46, "__typename");
                                    d3Var2 = new qo.d3(str45, e3Var4, str46);
                                } else {
                                    d3Var2 = null;
                                }
                                String str47 = c3Var3.b;
                                String str48 = c3Var3.c;
                                k.g(str47, "id");
                                k.g(str48, "__typename");
                                return new qo.c3(d3Var2, str47, str48);
                            case 15:
                                qo.c3 c3Var4 = (qo.c3) obj;
                                k.g(c3Var4, "<this>");
                                k.g((bp.d) obj2, "it");
                                qo.d3 d3Var6 = c3Var4.a;
                                return Boolean.valueOf((d3Var6 != null ? d3Var6.b : null) != null);
                            case 16:
                                bq.b bVar4 = (bq.b) obj;
                                String str49 = (String) obj2;
                                k.g(bVar4, "id");
                                k.g(str49, "after");
                                return new gh(bVar4.a, bVar4.b, bVar4.c, new u0(str49), 16);
                            case 17:
                                bh bhVar = (bh) obj;
                                List list8 = (List) obj2;
                                k.g(bhVar, "data");
                                k.g(list8, "nodes");
                                fh fhVar = bhVar.a;
                                eh ehVar = null;
                                if (fhVar != null) {
                                    ch chVar = fhVar.b;
                                    if (chVar != null) {
                                        eh ehVar2 = chVar.c;
                                        if (ehVar2 != null) {
                                            h1 h1Var = ehVar2.c;
                                            p0 p0Var = h1Var.l;
                                            ehVar = eh.a(ehVar2, h1.a(h1Var, p0Var != null ? p0.a(p0Var, new d1(p0Var.c.a, list8)) : null, (gv.t0) null, 30719));
                                        }
                                        ehVar = ch.a(chVar, ehVar);
                                    }
                                    ehVar = fh.a(fhVar, ehVar);
                                }
                                return bh.a(bhVar, ehVar);
                            case 18:
                                bq.c cVar3 = (bq.c) obj;
                                String str50 = (String) obj2;
                                k.g(cVar3, "refComparisonFilesChangedParameters");
                                k.g(str50, "after");
                                return new c10(new u0(str50), cVar3.a, cVar3.b, cVar3.c, cVar3.d);
                            case 19:
                                w00 w00Var = (w00) obj;
                                List list9 = (List) obj2;
                                k.g(w00Var, "data");
                                k.g(list9, "nodes");
                                b10 b10Var = w00Var.a;
                                if (b10Var != null) {
                                    v00 v00Var = b10Var.b;
                                    if (v00Var != null) {
                                        u00 u00Var = v00Var.b;
                                        if (u00Var != null) {
                                            x00 x00Var = u00Var.b;
                                            r1 = u00.a(u00Var, x00Var != null ? x00.a(x00Var, new a10(x00Var.d.a, list9)) : null);
                                        }
                                        r1 = v00.a(v00Var, r1);
                                    }
                                    r1 = b10.a(b10Var, r1);
                                }
                                return w00.a(w00Var, r1);
                            case 20:
                                String str51 = (String) obj;
                                String str52 = (String) obj2;
                                k.g(str51, "id");
                                k.g(str52, "after");
                                return new rc0.p(str51, new u0(100), new u0(str52), 24);
                            case 21:
                                rc0.e eVar32 = (rc0.e) obj;
                                List list10 = (List) obj2;
                                k.g(eVar32, "data");
                                k.g(list10, "nodes");
                                rc0.g gVar4 = eVar32.a;
                                rc0.g gVar5 = null;
                                rc0.m mVar3 = null;
                                if (gVar4 != null) {
                                    rc0.h hVar4 = gVar4.c;
                                    if (hVar4 != null) {
                                        rc0.m mVar4 = hVar4.c;
                                        if (mVar4 != null) {
                                            int i52 = mVar4.a;
                                            rc0.k kVar2 = mVar4.b;
                                            k.g(kVar2, "pageInfo");
                                            mVar3 = new rc0.m(i52, kVar2, list10);
                                        }
                                        String str53 = hVar4.a;
                                        rc0.c cVar4 = hVar4.b;
                                        wc0.s1 s1Var3 = hVar4.d;
                                        k.g(str53, "__typename");
                                        k.g(cVar4, "checkSuite");
                                        k.g(s1Var3, "workFlowCheckRunFragment");
                                        hVar2 = new rc0.h(str53, cVar4, mVar3, s1Var3);
                                    } else {
                                        hVar2 = null;
                                    }
                                    String str54 = gVar4.a;
                                    String str55 = gVar4.b;
                                    rc0.i iVar2 = gVar4.d;
                                    wc0.m1 m1Var2 = gVar4.e;
                                    k.g(str54, "__typename");
                                    k.g(str55, "id");
                                    gVar5 = new rc0.g(str54, str55, hVar2, iVar2, m1Var2);
                                }
                                return new rc0.e(gVar5);
                            case 22:
                                cd0.b bVar5 = (cd0.b) obj;
                                String str56 = (String) obj2;
                                k.g(bVar5, "id");
                                k.g(str56, "after");
                                String str57 = bVar5.a;
                                u0 u0Var7 = new u0(100);
                                u0 u0Var8 = new u0(str56);
                                String str58 = bVar5.b;
                                return new rc0.o0(str57, u0Var7, u0Var8, str58 == null ? t0.d : new u0(str58), new u0(Boolean.valueOf(str58 != null)));
                            case 23:
                                rc0.j0 j0Var2 = (rc0.j0) obj;
                                List list11 = (List) obj2;
                                k.g(j0Var2, "data");
                                k.g(list11, "nodes");
                                rc0.k0 k0Var2 = j0Var2.a;
                                rc0.k0 k0Var3 = null;
                                rc0.l0 l0Var2 = null;
                                if (k0Var2 != null) {
                                    rc0.l0 l0Var3 = k0Var2.c;
                                    if (l0Var3 != null) {
                                        wc0.v vVar4 = l0Var3.d;
                                        wc0.g gVar6 = vVar4.n;
                                        l0Var2 = new rc0.l0(l0Var3.a, l0Var3.b, l0Var3.c, wc0.v.a(vVar4, gVar6 != null ? wc0.g.a(gVar6, list11) : null));
                                    }
                                    String str59 = k0Var2.a;
                                    String str60 = k0Var2.b;
                                    k.g(str59, "__typename");
                                    k0Var3 = new rc0.k0(str59, str60, l0Var2);
                                }
                                return new rc0.j0(k0Var3);
                            case 24:
                                cd0.b bVar6 = (cd0.b) obj;
                                String str61 = (String) obj2;
                                k.g(bVar6, "id");
                                k.g(str61, "after");
                                String str62 = bVar6.a;
                                u0 u0Var9 = new u0(100);
                                u0 u0Var10 = new u0(str61);
                                String str63 = bVar6.b;
                                return new rc0.t0(str62, u0Var9, u0Var10, str63 == null ? t0.d : new u0(str63), new u0(Boolean.valueOf(str63 != null)));
                            case 25:
                                rc0.q0 q0Var2 = (rc0.q0) obj;
                                List list12 = (List) obj2;
                                k.g(q0Var2, "data");
                                k.g(list12, "nodes");
                                rc0.r0 r0Var2 = q0Var2.a;
                                rc0.r0 r0Var3 = null;
                                rc0.s0 s0Var2 = null;
                                if (r0Var2 != null) {
                                    rc0.s0 s0Var3 = r0Var2.c;
                                    if (s0Var3 != null) {
                                        wc0.v vVar5 = s0Var3.c;
                                        wc0.g gVar7 = vVar5.n;
                                        s0Var2 = new rc0.s0(s0Var3.a, s0Var3.b, wc0.v.a(vVar5, gVar7 != null ? wc0.g.a(gVar7, list12) : null));
                                    }
                                    String str64 = r0Var2.a;
                                    String str65 = r0Var2.b;
                                    k.g(str64, "__typename");
                                    r0Var3 = new rc0.r0(str64, str65, s0Var2);
                                }
                                return new rc0.q0(r0Var3);
                            case 26:
                                cd0.c cVar5 = (cd0.c) obj;
                                String str66 = (String) obj2;
                                k.g(cVar5, "id");
                                k.g(str66, "after");
                                String str67 = cVar5.a;
                                u0 u0Var11 = new u0(str66);
                                u0 u0Var12 = new u0(100);
                                String str68 = cVar5.b;
                                return new rc0.t1(str67, u0Var12, u0Var11, str68 == null ? t0.d : new u0(str68), new u0(Boolean.valueOf(str68 != null)), 8);
                            case 27:
                                rc0.q1 q1Var2 = (rc0.q1) obj;
                                List list13 = (List) obj2;
                                k.g(q1Var2, "data");
                                k.g(list13, "nodes");
                                rc0.r1 r1Var2 = q1Var2.a;
                                rc0.r1 r1Var3 = null;
                                wc0.v0 v0Var3 = null;
                                rc0.s1 s1Var4 = null;
                                if (r1Var2 != null) {
                                    rc0.s1 s1Var5 = r1Var2.c;
                                    if (s1Var5 != null) {
                                        wc0.a1 a1Var3 = s1Var5.c;
                                        wc0.v0 v0Var4 = a1Var3.b;
                                        if (v0Var4 != null) {
                                            int i62 = v0Var4.a;
                                            wc0.x0 x0Var2 = v0Var4.b;
                                            k.g(x0Var2, "pageInfo");
                                            v0Var3 = new wc0.v0(i62, x0Var2, list13);
                                        }
                                        String str69 = a1Var3.a;
                                        String str70 = a1Var3.c;
                                        k.g(str69, "id");
                                        k.g(str70, "__typename");
                                        wc0.a1 a1Var4 = new wc0.a1(str69, v0Var3, str70);
                                        String str71 = s1Var5.a;
                                        String str72 = s1Var5.b;
                                        k.g(str71, "__typename");
                                        k.g(str72, "id");
                                        s1Var4 = new rc0.s1(str71, str72, a1Var4);
                                    }
                                    String str73 = r1Var2.a;
                                    String str74 = r1Var2.b;
                                    k.g(str73, "__typename");
                                    k.g(str74, "id");
                                    r1Var3 = new rc0.r1(str73, str74, s1Var4);
                                }
                                return new rc0.q1(r1Var3);
                            case 28:
                                String str75 = (String) obj;
                                String str76 = (String) obj2;
                                k.g(str75, "id");
                                k.g(str76, "after");
                                return new g2(str75, new u0(str76));
                            default:
                                c2 c2Var = (c2) obj;
                                List list14 = (List) obj2;
                                k.g(c2Var, "data");
                                k.g(list14, "nodes");
                                d2 d2Var = c2Var.a;
                                d2 d2Var2 = null;
                                e2 e2Var = null;
                                if (d2Var != null) {
                                    e2 e2Var2 = d2Var.c;
                                    if (e2Var2 != null) {
                                        f2 f2Var = e2Var2.b;
                                        h2 h2Var = f2Var.b.a;
                                        k.g(h2Var, "pageInfo");
                                        i2 i2Var = new i2(h2Var, list14);
                                        String str77 = f2Var.a;
                                        k.g(str77, "__typename");
                                        f2 f2Var2 = new f2(str77, i2Var);
                                        String str78 = e2Var2.a;
                                        k.g(str78, "id");
                                        e2Var = new e2(str78, f2Var2);
                                    }
                                    String str79 = d2Var.a;
                                    String str80 = d2Var.b;
                                    k.g(str79, "__typename");
                                    k.g(str80, "id");
                                    d2Var2 = new d2(str79, str80, e2Var);
                                }
                                return new c2(d2Var2);
                        }
                    }
                }, null, 120832);
                this.A = new bo0.b(jVar, bVar, vVar, new bo0.a(11), new bo0.a(12), new a00.a(28, (byte) 0), new a00.a(29, (byte) 0), new bo0.a(13), new bo0.a(14), new bo0.a(15), new bo0.a(16));
                break;
        }
    }

    public final y71.i A(String str, String str2, LinkedHashMap linkedHashMap) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "workflowId");
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    String str4 = (String) entry.getValue();
                    ba0 ba0Var = str4 != null ? new ba0(str3, str4) : null;
                    if (ba0Var != null) {
                        arrayList.add(ba0Var);
                    }
                }
                return n1Shadow.y(in.rShadow.l(in.rShadow.h(this.t.d(new qn0.j2(new ab(new u0(arrayList), str2, str))))), this.u);
            case 1:
                k71.k.g(str, "workflowId");
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    String str5 = (String) entry2.getKey();
                    String str6 = (String) entry2.getValue();
                    wg0 wg0Var = str6 != null ? new wg0(str5, str6) : null;
                    if (wg0Var != null) {
                        arrayList2.add(wg0Var);
                    }
                }
                return n1Shadow.y(in.rShadow.l(in.rShadow.h(this.t.d(new qo.j2(new ee(new u0(arrayList2), str2, str))))), this.u);
            case 2:
                k71.k.g(str, "workflowId");
                return y41.t1.S("dispatchWorkflowRun", "3.12");
            default:
                k71.k.g(str, "workflowId");
                return y41.t1.S("dispatchWorkflowRun", "3.10");
        }
    }

    public final y71.i a(String str, boolean z, boolean z2) {
        switch (this.r) {
            case 0:
                return n1Shadow.y(new bz0.t(in.rShadow.h(this.s.d(new yn0.r(new u0(Boolean.valueOf(z2)), new u0(Boolean.valueOf(z)), str))), 5), this.u);
            case 1:
                return n1Shadow.y(new bz0.t(in.rShadow.h(this.s.d(new yo.r(new u0(Boolean.valueOf(z2)), new u0(Boolean.valueOf(z)), str))), 9), this.u);
            case 2:
                return n1Shadow.y(new bz0.t(in.rShadow.h(this.s.d(new zc0.r(new u0(Boolean.valueOf(z2)), new u0(Boolean.valueOf(z)), str))), 13), this.u);
            default:
                return n1Shadow.y(new bz0.t(in.rShadow.h(this.s.d(new j20.r(new u0(Boolean.valueOf(z2)), new u0(Boolean.valueOf(z)), str))), 20), this.u);
        }
    }

    public final y71.i b(String str, String str2) {
        switch (this.r) {
            case 0:
                return ((bo0.b) this.x).e(new bo0.c(str, str2));
            case 1:
                return ((bo0.b) this.x).e(new bp.b(str, str2));
            case 2:
                return ((bo0.b) this.x).e(new cd0.b(str, str2));
            default:
                return ((bo0.b) this.x).e(new m20.b(str, str2));
        }
    }

    public final y71.i c(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "workflowId");
                break;
            case 1:
                k71.k.g(str, "workflowId");
                break;
            case 2:
                k71.k.g(str, "workflowId");
                break;
            default:
                k71.k.g(str, "workflowId");
                break;
        }
        return ((bo0.b) this.A).b(str);
    }

    public final y71.i d(String str, String str2) {
        switch (this.r) {
            case 0:
                return ((bo0.b) this.x).b(new bo0.c(str, str2));
            case 1:
                return ((bo0.b) this.x).b(new bp.b(str, str2));
            case 2:
                return ((bo0.b) this.x).b(new cd0.b(str, str2));
            default:
                return ((bo0.b) this.x).b(new m20.b(str, str2));
        }
    }

    public final y71.i e(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "repositoryOwner");
                k71.k.g(str2, "repositoryName");
                return this.z.h(new bo0.f(str, str2));
            case 1:
                k71.k.g(str, "repositoryOwner");
                k71.k.g(str2, "repositoryName");
                return this.z.h(new bp.d(str, str2));
            case 2:
                k71.k.g(str, "repositoryOwner");
                k71.k.g(str2, "repositoryName");
                return this.z.h(new cd0.e(str, str2));
            default:
                k71.k.g(str, "repositoryOwner");
                k71.k.g(str2, "repositoryName");
                return this.z.h(new m20.d(str, str2));
        }
    }

    public final y71.i f(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "commitId");
                return ((bo0.b) this.w).e(new bo0.d(str, str2));
            case 1:
                k71.k.g(str, "commitId");
                return ((bo0.b) this.w).e(new bp.c(str, str2));
            case 2:
                k71.k.g(str, "commitId");
                return ((bo0.b) this.w).e(new cd0.c(str, str2));
            default:
                k71.k.g(str, "commitId");
                return ((bo0.b) this.w).e(new m20.c(str, str2));
        }
    }

    public final y71.i g(String str, boolean z) {
        switch (this.r) {
            case 0:
                return n1Shadow.y(new bz0.t(in.rShadow.k(this.s.d(new yn0.m(new u0(Boolean.valueOf(z)), str))), 4), this.u);
            case 1:
                return n1Shadow.y(new bz0.t(in.rShadow.k(this.s.d(new yo.m(new u0(Boolean.valueOf(z)), str))), 8), this.u);
            case 2:
                return n1Shadow.y(new bz0.t(in.rShadow.k(this.s.d(new zc0.m(new u0(Boolean.valueOf(z)), str))), 12), this.u);
            default:
                return n1Shadow.y(new bz0.t(in.rShadow.k(this.s.d(new j20.m(new u0(Boolean.valueOf(z)), str))), 19), this.u);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }

    public final y71.i i(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "repositoryOwner");
                k71.k.g(str2, "repositoryName");
                return this.z.e(new bo0.f(str, str2));
            case 1:
                k71.k.g(str, "repositoryOwner");
                k71.k.g(str2, "repositoryName");
                return this.z.e(new bp.d(str, str2));
            case 2:
                k71.k.g(str, "repositoryOwner");
                k71.k.g(str2, "repositoryName");
                return this.z.e(new cd0.e(str, str2));
            default:
                k71.k.g(str, "repositoryOwner");
                k71.k.g(str2, "repositoryName");
                return this.z.e(new m20.d(str, str2));
        }
    }

    public final y71.i j(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "workflowId");
                break;
            case 1:
                k71.k.g(str, "workflowId");
                break;
            case 2:
                k71.k.g(str, "workflowId");
                break;
            default:
                k71.k.g(str, "workflowId");
                break;
        }
        return ((bo0.b) this.A).e(str);
    }

    public final y71.i k(String str) {
        switch (this.r) {
        }
        return this.v.e(str);
    }

    public final y71.i l(String str) {
        switch (this.r) {
        }
        return this.v.b(str);
    }

    public final y71.i m(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "workflowId");
                return n1Shadow.y(new bz0.e(com.github.service.wrapper.a.o(this.t, new qn0.f2(str), null, false, null, null, 62), 17), this.u);
            case 1:
                k71.k.g(str, "workflowId");
                return n1Shadow.y(new bz0.e(com.github.service.wrapper.a.o(this.t, new qo.f2(str), null, false, null, null, 62), 19), this.u);
            case 2:
                k71.k.g(str, "workflowId");
                return y41.t1.S("fetchWorkflowInputs", "3.12");
            default:
                k71.k.g(str, "workflowId");
                return y41.t1.S("fetchWorkflowInputs", "3.10");
        }
    }

    public final y71.i n(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "checkRunId");
                break;
            case 1:
                k71.k.g(str, "checkRunId");
                break;
            case 2:
                k71.k.g(str, "checkRunId");
                break;
            default:
                k71.k.g(str, "checkRunId");
                break;
        }
        return this.v.h(str);
    }

    public final y71.i o(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "workflowId");
                break;
            case 1:
                k71.k.g(str, "workflowId");
                break;
            case 2:
                k71.k.g(str, "workflowId");
                break;
            default:
                k71.k.g(str, "workflowId");
                break;
        }
        return ((bo0.b) this.A).h(str);
    }

    public final y71.i p(String str, int i) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "checkRunId");
                return n1Shadow.y(new h(com.github.service.wrapper.a.o(this.t, new g0(str, i), null, false, null, null, 62), str, i, 0), this.u);
            case 1:
                k71.k.g(str, "checkRunId");
                return n1Shadow.y(new h(com.github.service.wrapper.a.o(this.t, new qo.g0(str, i), null, false, null, null, 62), str, i, 1), this.u);
            case 2:
                k71.k.g(str, "checkRunId");
                return n1Shadow.y(new h(com.github.service.wrapper.a.o(this.t, new rc0.g0(str, i), null, false, null, null, 62), str, i, 2), this.u);
            default:
                k71.k.g(str, "checkRunId");
                return n1Shadow.y(new h(com.github.service.wrapper.a.o(this.t, new b20.g0(str, i), null, false, null, null, 62), str, i, 3), this.u);
        }
    }

    public final y71.i q(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "commitId");
                return ((bo0.b) this.w).h(new bo0.d(str, str2));
            case 1:
                k71.k.g(str, "commitId");
                return ((bo0.b) this.w).h(new bp.c(str, str2));
            case 2:
                k71.k.g(str, "commitId");
                return ((bo0.b) this.w).h(new cd0.c(str, str2));
            default:
                k71.k.g(str, "commitId");
                return ((bo0.b) this.w).h(new m20.c(str, str2));
        }
    }

    public final y71.i r(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "checkSuiteId");
                return ((bo0.b) this.x).h(new bo0.c(str, str2));
            case 1:
                k71.k.g(str, "checkSuiteId");
                return ((bo0.b) this.x).h(new bp.b(str, str2));
            case 2:
                k71.k.g(str, "checkSuiteId");
                return ((bo0.b) this.x).h(new cd0.b(str, str2));
            default:
                k71.k.g(str, "checkSuiteId");
                return ((bo0.b) this.x).h(new m20.b(str, str2));
        }
    }

    public final y71.i s(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "checkSuiteId");
                return ((bo0.b) this.x).i(new bo0.c(str, str2));
            case 1:
                k71.k.g(str, "checkSuiteId");
                return ((bo0.b) this.x).i(new bp.b(str, str2));
            case 2:
                k71.k.g(str, "checkSuiteId");
                return ((bo0.b) this.x).i(new cd0.b(str, str2));
            default:
                k71.k.g(str, "checkSuiteId");
                return ((bo0.b) this.x).i(new m20.b(str, str2));
        }
    }

    public final y71.i t(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "commitId");
                return ((bo0.b) this.w).b(new bo0.d(str, str2));
            case 1:
                k71.k.g(str, "commitId");
                return ((bo0.b) this.w).b(new bp.c(str, str2));
            case 2:
                k71.k.g(str, "commitId");
                return ((bo0.b) this.w).b(new cd0.c(str, str2));
            default:
                k71.k.g(str, "commitId");
                return ((bo0.b) this.w).b(new m20.c(str, str2));
        }
    }

    public final y71.i u(String str, String str2) {
        switch (this.r) {
            case 0:
                return n1Shadow.y(in.rShadow.l(com.github.service.wrapper.a.o(this.t, new g1(new u0(Boolean.valueOf(str2 != null)), str2 == null ? t0.d : new u0(str2), str), null, false, null, null, 62)), this.u);
            case 1:
                return n1Shadow.y(in.rShadow.l(com.github.service.wrapper.a.o(this.t, new qo.g1(new u0(Boolean.valueOf(str2 != null)), str2 == null ? t0.d : new u0(str2), str), null, false, null, null, 62)), this.u);
            case 2:
                return n1Shadow.y(in.rShadow.l(com.github.service.wrapper.a.o(this.t, new rc0.g1(new u0(Boolean.valueOf(str2 != null)), str2 == null ? t0.d : new u0(str2), str), null, false, null, null, 62)), this.u);
            default:
                return n1Shadow.y(in.rShadow.l(com.github.service.wrapper.a.o(this.t, new b20.g1(new u0(Boolean.valueOf(str2 != null)), str2 == null ? t0.d : new u0(str2), str), null, false, null, null, 62)), this.u);
        }
    }

    public final y71.i v(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "checkSuiteId");
                return this.y.b(new bo0.c(str, str2));
            case 1:
                k71.k.g(str, "checkSuiteId");
                return this.y.b(new bp.b(str, str2));
            case 2:
                k71.k.g(str, "checkSuiteId");
                return this.y.b(new cd0.b(str, str2));
            default:
                k71.k.g(str, "checkSuiteId");
                return this.y.b(new m20.b(str, str2));
        }
    }

    public final y71.i w(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "workflowId");
                return n1Shadow.y(new bz0.e(com.github.service.wrapper.a.o(this.s, new qn0.o2(str, str2), null, false, null, null, 62), 18), this.u);
            case 1:
                k71.k.g(str, "workflowId");
                return n1Shadow.y(new bz0.e(com.github.service.wrapper.a.o(this.s, new qo.o2(str, str2), null, false, null, null, 62), 20), this.u);
            case 2:
                k71.k.g(str, "workflowId");
                return y41.t1.S("fetchHasWorkflowDispatchTriggerUseCase", "3.12");
            default:
                k71.k.g(str, "workflowId");
                return y41.t1.S("fetchHasWorkflowDispatchTriggerUseCase", "3.10");
        }
    }

    public final y71.i x(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "checkSuiteId");
                return n1Shadow.y(new bz0.t(in.rShadow.h(this.s.d(new yn0.d(str))), 3), this.u);
            case 1:
                k71.k.g(str, "checkSuiteId");
                return n1Shadow.y(new bz0.t(in.rShadow.h(this.s.d(new yo.d(str))), 7), this.u);
            case 2:
                k71.k.g(str, "checkSuiteId");
                return n1Shadow.y(new bz0.t(in.rShadow.h(this.s.d(new zc0.d(str))), 11), this.u);
            default:
                k71.k.g(str, "checkSuiteId");
                return n1Shadow.y(new bz0.t(in.rShadow.h(this.s.d(new j20.d(str))), 18), this.u);
        }
    }

    public final y71.i y(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "checkRunId");
                qn0.p pVar = new qn0.p(str, new u0(100), null, 28);
                u uVar = new u();
                return n1Shadow.y(new cn.q(new r(new y(new a61.o(this, pVar, uVar, null, 10), com.github.service.wrapper.a.o(this.s, new qn0.p(str, new u0(100), null, 28), null, false, null, null, 62)), uVar, this, pVar, 0), 1), this.u);
            case 1:
                k71.k.g(str, "checkRunId");
                qo.p pVar2 = new qo.p(str, new u0(100), (u0) null, 28);
                u uVar2 = new u();
                return n1Shadow.y(new cn.q(new r(new y(new a61.o(this, pVar2, uVar2, null, 11), com.github.service.wrapper.a.o(this.s, new qo.p(str, new u0(100), (u0) null, 28), null, false, null, null, 62)), uVar2, this, pVar2, 1), 2), this.u);
            case 2:
                k71.k.g(str, "checkRunId");
                rc0.p pVar3 = new rc0.p(str, new u0(100), null, 28);
                u uVar3 = new u();
                return n1Shadow.y(new cn.q(new r(new y(new a61.o(this, pVar3, uVar3, null, 12), com.github.service.wrapper.a.o(this.s, new rc0.p(str, new u0(100), null, 28), null, false, null, null, 62)), uVar3, this, pVar3, 2), 3), this.u);
            default:
                k71.k.g(str, "checkRunId");
                b20.p pVar4 = new b20.p(str, new u0(100), (u0) null, 28);
                u uVar4 = new u();
                return n1Shadow.y(new cn.q(new r(new y(new h1.u(this, pVar4, uVar4, (a71.c) null, 15), com.github.service.wrapper.a.o(this.s, new b20.p(str, new u0(100), (u0) null, 28), null, false, null, null, 62)), uVar4, this, pVar4, 5), 15), this.u);
        }
    }

    public final y71.i z(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "checkSuiteId");
                k71.k.g(str2, "checkRunName");
                d9.l lVar = new d9.l(18);
                return n1Shadow.y(new y71.u(new m(2, null, 0), new az0.c(new y00.l(com.github.rudroid.common.flow.f.a(new a61.l0(com.github.service.wrapper.a.o(this.s, new w(new u0(100), new u0(str2), str), null, false, null, null, 62), lVar, 3), 30, new com.github.rudroid.widget.contribution.a(13), new d9.m(str3, 16)), 10), 4)), this.u);
            case 1:
                k71.k.g(str, "checkSuiteId");
                k71.k.g(str2, "checkRunName");
                d9.l lVar2 = new d9.l(19);
                return n1Shadow.y(new y71.u(new m(2, null, 1), new az0.c(new y00.l(com.github.rudroid.common.flow.f.a(new a61.l0(com.github.service.wrapper.a.o(this.s, new qo.w(new u0(100), new u0(str2), str), null, false, null, null, 62), lVar2, 4), 30, new com.github.rudroid.widget.contribution.a(14), new d9.m(str3, 17)), 10), 5)), this.u);
            case 2:
                k71.k.g(str, "checkSuiteId");
                k71.k.g(str2, "checkRunName");
                d9.l lVar3 = new d9.l(26);
                return n1Shadow.y(new y71.u(new m(2, null, 2), new az0.c(new y00.l(com.github.rudroid.common.flow.f.a(new a61.l0(com.github.service.wrapper.a.o(this.s, new rc0.w(new u0(100), new u0(str2), str), null, false, null, null, 62), lVar3, 5), 30, new com.github.rudroid.widget.contribution.a(18), new d9.m(str3, 19)), 10), 6)), this.u);
            default:
                k71.k.g(str, "checkSuiteId");
                k71.k.g(str2, "checkRunName");
                np.h hVar = new np.h(12);
                return n1Shadow.y(new y71.u(new m(2, null, 8), new az0.c(new y00.l(com.github.rudroid.common.flow.f.a(new a61.l0(com.github.service.wrapper.a.o(this.s, new b20.w(new u0(100), new u0(str2), str), null, false, null, null, 62), hVar, 27), 30, new x(17), new p3(str3, 19)), 10), 20)), this.u);
        }
    }
}
