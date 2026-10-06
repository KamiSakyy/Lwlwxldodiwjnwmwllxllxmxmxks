package t00;

import aa.t0;
import aa.u0;
import bw.d;
import bw.e;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.SimpleRepository;
import com.github.service.models.response.issueorpullrequest.IssueType;
import d3.c0;
import d3.x;
import d3.z;
import dw.t5;
import hc0.nq;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jn.h;
import jn0.a10;
import jn0.au;
import jn0.aw;
import jn0.b50;
import jn0.bu;
import jn0.cg0;
import jn0.d00;
import jn0.ew;
import jn0.fw;
import jn0.hx;
import jn0.lt;
import jn0.mx;
import jn0.n50;
import jn0.q10;
import jn0.rx;
import jn0.v00;
import jn0.v10;
import jn0.vv;
import jn0.x30;
import jn0.xv;
import jn0.yf0;
import jn0.yt;
import jn0.z60;
import jn0.zt;
import jo.a30;
import jo.b70;
import jo.d20;
import jo.f30;
import jo.fy;
import jo.gy;
import jo.iv;
import jo.iz;
import jo.m90;
import jo.mi0;
import jo.nz;
import jo.q30;
import jo.q50;
import jo.qi0;
import jo.sx;
import jo.sz;
import jo.ux;
import jo.v20;
import jo.v30;
import jo.w70;
import jo.wv;
import jo.x50;
import jo.xx;
import jo.yv;
import ko.f;
import ko.g;
import ko.j;
import kotlin.NoWhenBranchMatchedException;
import m10.i30;
import m10.j40;
import m10.x40;
import m10.z40;
import mo.c;
import mo.g0;
import mo.h0;
import mo.l;
import mo.o;
import mo.p;
import mo.q;
import mo.t;
import py0.s;
import py0.u;
import py0.v;
import py0.w;
import pz0.bz;
import pz0.jx;
import pz0.ly;
import pz0.zy;
import u10.d10;
import u10.e10;
import u10.f10;
import u10.g10;
import u10.i10;
import w61.a0;
import w61.k;
import w80.p3;
import w80.q3;
import x01.i;
import x61.m;
import x61.n;
import x61.rShadow;
import yz0.k4;
import yz0.t7;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c9 implements z01.g1, mi0, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public com.github.service.wrapper.b t;
    public v71.v u;
    public s01.p v;
    public s01.p w;
    public s01.p x;

    public c9(com.github.service.wrapper.j jVar, com.github.service.wrapper.b bVar, v71.v vVar, int i) {
        this.r = i;
        final int i2 = 22;
        final int i3 = 21;
        final int i4 = 20;
        final int i5 = 19;
        int i6 = 11;
        int i7 = 10;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                j71.c cVar = new j71.c() { // from class: oo.a
                    public final Object k(Object obj) {
                        f fVar;
                        ko.b bVar2;
                        g gVar;
                        f fVar2;
                        ko.b bVar3;
                        rShadow rVar;
                        String str;
                        Iterator it;
                        h hVar;
                        int i8;
                        String str2;
                        Iterator it2;
                        Object aVar;
                        k kVar;
                        Object eVar;
                        Object cVar2;
                        c cVar3;
                        c cVar4;
                        lc0.f fVar3;
                        lc0.b bVar4;
                        List list;
                        lc0.f fVar4;
                        lc0.b bVar5;
                        lc0.g gVar2;
                        lc0.f fVar5;
                        lc0.b bVar6;
                        rShadow rVar2;
                        Iterator it3;
                        h hVar2;
                        int i9;
                        String str3;
                        String str4;
                        Object aVar2;
                        Object cVar5;
                        nc0.c cVar6;
                        nc0.c cVar7;
                        s sVar;
                        List list2;
                        s sVar2;
                        u uVar;
                        s sVar3;
                        s sVar4;
                        rShadow rVar3;
                        yr0.a aVar3;
                        e eVar2;
                        List list3;
                        e eVar3;
                        d dVar;
                        xx.a aVar4;
                        e eVar4;
                        e eVar5;
                        rShadow rVar4;
                        t5 t5Var;
                        int i11 = i5;
                        String str5 = "<this>";
                        int i12 = 10;
                        aa1.b bVar7 = t0.d;
                        a0Shadow a0Var = a0.a;
                        rShadow rVar5 = r.r;
                        switch (i11) {
                            case 0:
                                ko.d dVar2 = (ko.d) obj;
                                k71.k.g(dVar2, "data");
                                ko.k kVar2 = dVar2.a;
                                if (kVar2 == null || (fVar = kVar2.c) == null || (bVar2 = fVar.a) == null || (gVar = bVar2.b) == null) {
                                    return null;
                                }
                                return new i(gVar.a, gVar.b, !gVar.c);
                            case 1:
                                ko.d dVar3 = (ko.d) obj;
                                k71.k.g(dVar3, "data");
                                ko.k kVar3 = dVar3.a;
                                List list4 = (kVar3 == null || (fVar2 = kVar3.c) == null || (bVar3 = fVar2.a) == null) ? null : bVar3.c;
                                return list4 == null ? rVar5 : list4;
                            case 2:
                                String str6 = null;
                                int i13 = 0;
                                ko.d dVar4 = (ko.d) obj;
                                k71.k.g(dVar4, "data");
                                ko.k kVar4 = dVar4.a;
                                if (kVar4 == null) {
                                    return null;
                                }
                                ko.b bVar8 = kVar4.c.a;
                                List list5 = bVar8.c;
                                if (list5 != null) {
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it4 = list5.iterator();
                                    while (it4.hasNext()) {
                                        ko.e eVar6 = (ko.e) it4.next();
                                        if (eVar6 != null) {
                                            String str7 = eVar6.b;
                                            ZonedDateTime zonedDateTime = eVar6.c;
                                            ko.a aVar5 = eVar6.e;
                                            String str8 = aVar5.a;
                                            String str9 = aVar5.b;
                                            ko.i iVar = eVar6.f;
                                            String str10 = iVar != null ? iVar.b : str6;
                                            String str11 = str10 == null ? "" : str10;
                                            String str12 = iVar != null ? iVar.c : str6;
                                            String str13 = str12 == null ? "" : str12;
                                            ArrayList arrayList2 = eVar6.g;
                                            ArrayList arrayList3 = new ArrayList(n.F(arrayList2, 10));
                                            int size = arrayList2.size();
                                            while (i13 < size) {
                                                Object obj2 = arrayList2.get(i13);
                                                int i14 = i13 + 1;
                                                ko.h hVar3 = (ko.h) obj2;
                                                k71.k.g(hVar3, str5);
                                                int i15 = size;
                                                String str14 = hVar3.b;
                                                j jVar2 = hVar3.a;
                                                if (jVar2 != null) {
                                                    h0 h0Var = jVar2.b;
                                                    i8 = i14;
                                                    mo.d dVar5 = h0Var.b;
                                                    if (dVar5 != null) {
                                                        List list6 = dVar5.a.a;
                                                        String str15 = (list6 == null || (cVar4 = (c) m.W(list6)) == null) ? null : cVar4.b;
                                                        if (str15 == null) {
                                                            str15 = "";
                                                        }
                                                        String str16 = (list6 == null || (cVar3 = (c) m.W(list6)) == null) ? null : cVar3.a;
                                                        if (str16 == null) {
                                                            str16 = "";
                                                        }
                                                        str2 = str5;
                                                        aVar = new jn.d(str14, str16, str15);
                                                        it2 = it4;
                                                    } else {
                                                        str2 = str5;
                                                        mo.e eVar7 = h0Var.c;
                                                        if (eVar7 != null) {
                                                            cVar2 = new jn.d(str14, eVar7.a, eVar7.b.a);
                                                            it2 = it4;
                                                        } else {
                                                            mo.f fVar6 = h0Var.d;
                                                            if (fVar6 != null) {
                                                                it2 = it4;
                                                                eVar = new jn.b(fVar6.b, str14, fVar6.a, fVar6.c.a);
                                                            } else {
                                                                it2 = it4;
                                                                mo.g gVar3 = h0Var.e;
                                                                if (gVar3 != null) {
                                                                    mo.a aVar6 = gVar3.b;
                                                                    String str17 = aVar6 != null ? aVar6.b.a : null;
                                                                    if (str17 == null) {
                                                                        str17 = "";
                                                                    }
                                                                    cVar2 = new jn.b(aVar6 != null ? aVar6.a : 0, str14, gVar3.a, str17);
                                                                } else {
                                                                    mo.h hVar4 = h0Var.f;
                                                                    if (hVar4 != null) {
                                                                        cVar2 = new jn.c(hVar4.c, str14, hVar4.a, hVar4.b.a);
                                                                    } else {
                                                                        mo.i iVar2 = h0Var.g;
                                                                        if (iVar2 != null) {
                                                                            cVar2 = new jn.c(iVar2.c.a, str14, iVar2.a, iVar2.b.a);
                                                                        } else {
                                                                            mo.k kVar5 = h0Var.h;
                                                                            if (kVar5 != null) {
                                                                                cVar2 = new jn.c(kVar5.b, str14, kVar5.c, kVar5.a.a);
                                                                            } else {
                                                                                l lVar = h0Var.i;
                                                                                if (lVar != null) {
                                                                                    mo.u uVar2 = lVar.b;
                                                                                    cVar2 = new jn.c(uVar2.b, str14, lVar.a, uVar2.a.a);
                                                                                } else {
                                                                                    mo.m mVar = h0Var.j;
                                                                                    if (mVar != null) {
                                                                                        t tVar = mVar.b;
                                                                                        cVar2 = new jn.c(tVar.b, str14, mVar.a, tVar.a.a);
                                                                                    } else {
                                                                                        mo.n nVar = h0Var.k;
                                                                                        if (nVar != null) {
                                                                                            eVar = new jn.d(str14, nVar.c, nVar.a.a);
                                                                                        } else {
                                                                                            o oVar = h0Var.l;
                                                                                            if (oVar != null) {
                                                                                                eVar = new jn.d(str14, oVar.a, oVar.b);
                                                                                            } else {
                                                                                                p pVar = h0Var.m;
                                                                                                if (pVar != null) {
                                                                                                    aVar = new jn.a(str14, pVar.a);
                                                                                                } else {
                                                                                                    q qVar = h0Var.n;
                                                                                                    if (qVar != null) {
                                                                                                        eVar = new jn.d(str14, qVar.a, qVar.b.a);
                                                                                                    } else {
                                                                                                        mo.rShadow rVar6 = h0Var.o;
                                                                                                        if (rVar6 != null) {
                                                                                                            g0 g0Var = rVar6.a;
                                                                                                            mo.s sVar5 = g0Var.b;
                                                                                                            if (sVar5 != null) {
                                                                                                                kVar = new k(sVar5.a, sVar5.b);
                                                                                                            } else {
                                                                                                                mo.j jVar3 = g0Var.c;
                                                                                                                String str18 = jVar3 != null ? jVar3.a : null;
                                                                                                                if (str18 == null) {
                                                                                                                    str18 = "";
                                                                                                                }
                                                                                                                String str19 = jVar3 != null ? jVar3.b : null;
                                                                                                                if (str19 == null) {
                                                                                                                    str19 = "";
                                                                                                                }
                                                                                                                kVar = new k(str18, str19);
                                                                                                            }
                                                                                                            eVar = new jn.e(str14, (String) kVar.s, (String) kVar.r);
                                                                                                        } else {
                                                                                                            aVar = new jn.a(str14, "");
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            aVar = eVar;
                                                        }
                                                        aVar = cVar2;
                                                    }
                                                } else {
                                                    i8 = i14;
                                                    str2 = str5;
                                                    it2 = it4;
                                                    aVar = new jn.a(str14, "");
                                                }
                                                arrayList3.add(aVar);
                                                size = i15;
                                                i13 = i8;
                                                str5 = str2;
                                                it4 = it2;
                                            }
                                            str = str5;
                                            it = it4;
                                            hVar = new h(str7, zonedDateTime, str8, str9, str11, str13, arrayList3, eVar6.d);
                                        } else {
                                            str = str5;
                                            it = it4;
                                            hVar = null;
                                        }
                                        if (hVar != null) {
                                            arrayList.add(hVar);
                                        }
                                        str5 = str;
                                        it4 = it;
                                        str6 = null;
                                        i13 = 0;
                                    }
                                    rVar = new ArrayList();
                                    int size2 = arrayList.size();
                                    int i16 = 0;
                                    while (i16 < size2) {
                                        Object obj3 = arrayList.get(i16);
                                        i16++;
                                        h hVar5 = (h) obj3;
                                        if (!t71.p.T(hVar5.f) && !t71.p.T(hVar5.e)) {
                                            rVar.add(obj3);
                                        }
                                    }
                                } else {
                                    rVar = null;
                                }
                                if (rVar != null) {
                                    rVar5 = rVar;
                                }
                                g gVar4 = bVar8.b;
                                return new jn.i(rVar5.size(), rVar5, new i(gVar4.a, gVar4.b, gVar4.c));
                            case 3:
                                p8.k kVar6 = (p8.k) obj;
                                k71.k.g(kVar6, "it");
                                return kVar6;
                            case 4:
                                pb0.g gVar5 = (pb0.g) obj;
                                k71.k.g(gVar5, "repositoryOwnerRepositoriesParameters");
                                nq f0 = m71.a.f0(gVar5.a);
                                if (f0 != null) {
                                    bVar7 = new u0(f0);
                                }
                                return new i10(null, bVar7, 10);
                            case 5:
                                d10 d10Var = (d10) obj;
                                k71.k.g(d10Var, "data");
                                return Boolean.valueOf(d10Var.a.a.b != null ? !r0.isEmpty() : false);
                            case 6:
                                d10 d10Var2 = (d10) obj;
                                k71.k.g(d10Var2, "data");
                                f10 f10Var = d10Var2.a.a.a;
                                return new i(f10Var.b, f10Var.a, !f10Var.c);
                            case 7:
                                d10 d10Var3 = (d10) obj;
                                k71.k.g(d10Var3, "data");
                                List list7 = d10Var3.a.a.b;
                                return list7 == null ? rVar5 : list7;
                            case 8:
                                d10 d10Var4 = (d10) obj;
                                k71.k.g(d10Var4, "data");
                                g10 g10Var = d10Var4.a.a;
                                rShadow rVar7 = g10Var.b;
                                if (rVar7 != null) {
                                    rVar5 = rVar7;
                                }
                                ArrayList S = m.S(rVar5);
                                ArrayList arrayList4 = new ArrayList(n.F(S, 10));
                                int size3 = S.size();
                                int i17 = 0;
                                while (i17 < size3) {
                                    Object obj4 = S.get(i17);
                                    i17++;
                                    e10 e10Var = (e10) obj4;
                                    q3 q3Var = e10Var.f;
                                    p3 p3Var = q3Var.d;
                                    arrayList4.add(new pb0.h(new t7(q3Var.a, q3Var.b, p3Var.c, t.q.q(p3Var.d), new bb0.j(e10Var.g), q3Var.c), e10Var.d, e10Var.b, e10Var.c));
                                }
                                f10 f10Var2 = g10Var.a;
                                return new pb0.f(arrayList4, new i(f10Var2.b, f10Var2.a, !f10Var2.c));
                            case 9:
                                w1.r rVar8 = (w1.r) obj;
                                k71.k.g(rVar8, "$this$applyIf");
                                return androidx.compose.foundation.layout.b.B(rVar8, ih.a.l, 0.0f, 0.0f, 0.0f, 14);
                            case 10:
                                c0 c0Var = (c0) obj;
                                k71.k.g(c0Var, "$this$semantics");
                                z.l(c0Var, 0);
                                return a0Var;
                            case 11:
                                pc0.a aVar7 = (pc0.a) obj;
                                k71.k.g(aVar7, "userAchievementsParameters");
                                return new lc0.l(aVar7.a, new u0(30), bVar7);
                            case 12:
                                lc0.d dVar6 = (lc0.d) obj;
                                k71.k.g(dVar6, "data");
                                lc0.k kVar7 = dVar6.a;
                                return Boolean.valueOf((kVar7 == null || (fVar3 = kVar7.c) == null || (bVar4 = fVar3.a) == null || (list = bVar4.c) == null) ? false : !list.isEmpty());
                            case 13:
                                lc0.d dVar7 = (lc0.d) obj;
                                k71.k.g(dVar7, "data");
                                lc0.k kVar8 = dVar7.a;
                                if (kVar8 == null || (fVar4 = kVar8.c) == null || (bVar5 = fVar4.a) == null || (gVar2 = bVar5.b) == null) {
                                    return null;
                                }
                                return new i(gVar2.a, gVar2.b, !gVar2.c);
                            case 14:
                                lc0.d dVar8 = (lc0.d) obj;
                                k71.k.g(dVar8, "data");
                                lc0.k kVar9 = dVar8.a;
                                List list8 = (kVar9 == null || (fVar5 = kVar9.c) == null || (bVar6 = fVar5.a) == null) ? null : bVar6.c;
                                return list8 == null ? rVar5 : list8;
                            case 15:
                                lc0.d dVar9 = (lc0.d) obj;
                                k71.k.g(dVar9, "data");
                                lc0.k kVar10 = dVar9.a;
                                if (kVar10 == null) {
                                    return null;
                                }
                                lc0.b bVar9 = kVar10.c.a;
                                List list9 = bVar9.c;
                                if (list9 != null) {
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it5 = list9.iterator();
                                    while (it5.hasNext()) {
                                        lc0.e eVar8 = (lc0.e) it5.next();
                                        if (eVar8 != null) {
                                            String str20 = eVar8.b;
                                            ZonedDateTime zonedDateTime2 = eVar8.c;
                                            lc0.a aVar8 = eVar8.e;
                                            String str21 = aVar8.a;
                                            String str22 = aVar8.b;
                                            lc0.i iVar3 = eVar8.f;
                                            String str23 = iVar3 != null ? iVar3.b : null;
                                            String str24 = str23 == null ? "" : str23;
                                            String str25 = iVar3 != null ? iVar3.c : null;
                                            String str26 = str25 == null ? "" : str25;
                                            ArrayList arrayList6 = eVar8.g;
                                            ArrayList arrayList7 = new ArrayList(n.F(arrayList6, i12));
                                            int size4 = arrayList6.size();
                                            int i18 = 0;
                                            while (i18 < size4) {
                                                Object obj5 = arrayList6.get(i18);
                                                int i19 = i18 + 1;
                                                lc0.h hVar6 = (lc0.h) obj5;
                                                k71.k.g(hVar6, "<this>");
                                                Iterator it6 = it5;
                                                String str27 = hVar6.b;
                                                lc0.j jVar4 = hVar6.a;
                                                if (jVar4 != null) {
                                                    nc0.g0 g0Var2 = jVar4.b;
                                                    i9 = i19;
                                                    nc0.d dVar10 = g0Var2.b;
                                                    if (dVar10 != null) {
                                                        List list10 = dVar10.a.a;
                                                        String str28 = (list10 == null || (cVar7 = (nc0.c) m.W(list10)) == null) ? null : cVar7.b;
                                                        if (str28 == null) {
                                                            str28 = "";
                                                        }
                                                        String str29 = (list10 == null || (cVar6 = (nc0.c) m.W(list10)) == null) ? null : cVar6.a;
                                                        if (str29 == null) {
                                                            str29 = "";
                                                        }
                                                        str3 = str22;
                                                        aVar2 = new jn.d(str27, str29, str28);
                                                    } else {
                                                        str3 = str22;
                                                        nc0.e eVar9 = g0Var2.c;
                                                        if (eVar9 != null) {
                                                            aVar2 = new jn.d(str27, eVar9.a, eVar9.b.a);
                                                        } else {
                                                            nc0.f fVar7 = g0Var2.d;
                                                            if (fVar7 != null) {
                                                                str4 = str21;
                                                                cVar5 = new jn.b(fVar7.b, str27, fVar7.a, fVar7.c.a);
                                                            } else {
                                                                str4 = str21;
                                                                nc0.g gVar6 = g0Var2.e;
                                                                if (gVar6 != null) {
                                                                    nc0.a aVar9 = gVar6.b;
                                                                    String str30 = aVar9 != null ? aVar9.b.a : null;
                                                                    if (str30 == null) {
                                                                        str30 = "";
                                                                    }
                                                                    cVar5 = new jn.b(aVar9 != null ? aVar9.a : 0, str27, gVar6.a, str30);
                                                                } else {
                                                                    nc0.h hVar7 = g0Var2.f;
                                                                    if (hVar7 != null) {
                                                                        cVar5 = new jn.c(hVar7.c, str27, hVar7.a, hVar7.b.a);
                                                                    } else {
                                                                        nc0.i iVar4 = g0Var2.g;
                                                                        if (iVar4 != null) {
                                                                            cVar5 = new jn.c(iVar4.c.a, str27, iVar4.a, iVar4.b.a);
                                                                        } else {
                                                                            nc0.j jVar5 = g0Var2.h;
                                                                            if (jVar5 != null) {
                                                                                cVar5 = new jn.c(jVar5.b, str27, jVar5.c, jVar5.a.a);
                                                                            } else {
                                                                                nc0.k kVar11 = g0Var2.i;
                                                                                if (kVar11 != null) {
                                                                                    nc0.t tVar2 = kVar11.b;
                                                                                    cVar5 = new jn.c(tVar2.b, str27, kVar11.a, tVar2.a.a);
                                                                                } else {
                                                                                    nc0.l lVar2 = g0Var2.j;
                                                                                    if (lVar2 != null) {
                                                                                        nc0.s sVar6 = lVar2.b;
                                                                                        cVar5 = new jn.c(sVar6.b, str27, lVar2.a, sVar6.a.a);
                                                                                    } else {
                                                                                        nc0.m mVar2 = g0Var2.k;
                                                                                        if (mVar2 != null) {
                                                                                            aVar2 = new jn.d(str27, mVar2.c, mVar2.a.a);
                                                                                        } else {
                                                                                            nc0.n nVar2 = g0Var2.l;
                                                                                            if (nVar2 != null) {
                                                                                                aVar2 = new jn.d(str27, nVar2.a, nVar2.b);
                                                                                            } else {
                                                                                                nc0.o oVar2 = g0Var2.m;
                                                                                                if (oVar2 != null) {
                                                                                                    aVar2 = new jn.a(str27, oVar2.a);
                                                                                                } else {
                                                                                                    nc0.p pVar2 = g0Var2.n;
                                                                                                    if (pVar2 != null) {
                                                                                                        aVar2 = new jn.d(str27, pVar2.a, pVar2.b.a);
                                                                                                    } else {
                                                                                                        nc0.q qVar2 = g0Var2.o;
                                                                                                        if (qVar2 != null) {
                                                                                                            aVar2 = new jn.f(str27, qVar2.a, qVar2.b.a);
                                                                                                        } else {
                                                                                                            nc0.rShadow rVar9 = g0Var2.p;
                                                                                                            aVar2 = rVar9 != null ? new jn.a(str27, rVar9.a) : new jn.a(str27, "");
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            aVar2 = cVar5;
                                                        }
                                                    }
                                                    str4 = str21;
                                                } else {
                                                    i9 = i19;
                                                    str3 = str22;
                                                    str4 = str21;
                                                    aVar2 = new jn.a(str27, "");
                                                }
                                                arrayList7.add(aVar2);
                                                it5 = it6;
                                                i18 = i9;
                                                str22 = str3;
                                                str21 = str4;
                                            }
                                            it3 = it5;
                                            hVar2 = new h(str20, zonedDateTime2, str21, str22, str24, str26, arrayList7, eVar8.d);
                                        } else {
                                            it3 = it5;
                                            hVar2 = null;
                                        }
                                        if (hVar2 != null) {
                                            arrayList5.add(hVar2);
                                        }
                                        it5 = it3;
                                        i12 = 10;
                                    }
                                    rVar2 = new ArrayList();
                                    int size5 = arrayList5.size();
                                    int i21 = 0;
                                    while (i21 < size5) {
                                        Object obj6 = arrayList5.get(i21);
                                        i21++;
                                        h hVar8 = (h) obj6;
                                        if (!t71.p.T(hVar8.f) && !t71.p.T(hVar8.e)) {
                                            rVar2.add(obj6);
                                        }
                                    }
                                } else {
                                    rVar2 = null;
                                }
                                if (rVar2 != null) {
                                    rVar5 = rVar2;
                                }
                                lc0.g gVar7 = bVar9.b;
                                return new jn.i(rVar5.size(), rVar5, new i(gVar7.a, gVar7.b, gVar7.c));
                            case 16:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 17:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 18:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 19:
                                py0.p pVar3 = (py0.p) obj;
                                k71.k.g(pVar3, "repositoryIssueTypesParameters");
                                return new w(new u0(30), bVar7, pVar3.a, pVar3.b);
                            case 20:
                                py0.r rVar10 = (py0.r) obj;
                                k71.k.g(rVar10, "data");
                                v vVar2 = rVar10.a;
                                return Boolean.valueOf((vVar2 == null || (sVar = vVar2.a) == null || (list2 = sVar.b) == null) ? false : !list2.isEmpty());
                            case 21:
                                py0.r rVar11 = (py0.r) obj;
                                k71.k.g(rVar11, "data");
                                v vVar3 = rVar11.a;
                                if (vVar3 == null || (sVar2 = vVar3.a) == null || (uVar = sVar2.a) == null) {
                                    return null;
                                }
                                return new i(uVar.a, uVar.b, !uVar.c);
                            case 22:
                                py0.r rVar12 = (py0.r) obj;
                                k71.k.g(rVar12, "data");
                                v vVar4 = rVar12.a;
                                List list11 = (vVar4 == null || (sVar3 = vVar4.a) == null) ? null : sVar3.b;
                                return list11 == null ? rVar5 : list11;
                            case 23:
                                py0.r rVar13 = (py0.r) obj;
                                k71.k.g(rVar13, "data");
                                v vVar5 = rVar13.a;
                                if (vVar5 == null || (sVar4 = vVar5.a) == null) {
                                    return null;
                                }
                                u uVar3 = sVar4.a;
                                i iVar5 = new i(uVar3.a, uVar3.b, !uVar3.c);
                                List<py0.t> list12 = sVar4.b;
                                if (list12 != null) {
                                    rShadow arrayList8 = new ArrayList();
                                    for (py0.t tVar3 : list12) {
                                        IssueType k = (tVar3 == null || (aVar3 = tVar3.c) == null) ? null : aa1.b.k(aVar3);
                                        if (k != null) {
                                            arrayList8.add(k);
                                        }
                                    }
                                    rVar3 = arrayList8;
                                } else {
                                    rVar3 = null;
                                }
                                if (rVar3 != null) {
                                    rVar5 = rVar3;
                                }
                                return new u01.a(rVar5, iVar5);
                            case 24:
                                r71.e[] eVarArr = z.a;
                                ((c0) obj).a(x.e, a0Var);
                                return a0Var;
                            case 25:
                                q00.a aVar10 = (q00.a) obj;
                                k71.k.g(aVar10, "repositoryOwnerRepositoriesParameters");
                                String str31 = aVar10.a;
                                String str32 = aVar10.b;
                                return new bw.g(str31, bVar7, str32 == null ? bVar7 : new u0(str32));
                            case 26:
                                bw.b bVar10 = (bw.b) obj;
                                k71.k.g(bVar10, "data");
                                bw.f fVar8 = bVar10.a;
                                return Boolean.valueOf((fVar8 == null || (eVar2 = fVar8.b) == null || (list3 = eVar2.b) == null) ? false : !list3.isEmpty());
                            case 27:
                                bw.b bVar11 = (bw.b) obj;
                                k71.k.g(bVar11, "data");
                                bw.f fVar9 = bVar11.a;
                                if (fVar9 == null || (eVar3 = fVar9.b) == null || (dVar = eVar3.a) == null || (aVar4 = dVar.b) == null) {
                                    return null;
                                }
                                return new i(aVar4.a, aVar4.b, !aVar4.c);
                            case 28:
                                bw.b bVar12 = (bw.b) obj;
                                k71.k.g(bVar12, "data");
                                bw.f fVar10 = bVar12.a;
                                List list13 = (fVar10 == null || (eVar4 = fVar10.b) == null) ? null : eVar4.b;
                                return list13 == null ? rVar5 : list13;
                            default:
                                bw.b bVar13 = (bw.b) obj;
                                k71.k.g(bVar13, "data");
                                bw.f fVar11 = bVar13.a;
                                if (fVar11 == null || (eVar5 = fVar11.b) == null) {
                                    return null;
                                }
                                xx.a aVar11 = eVar5.a.b;
                                i iVar6 = new i(aVar11.a, aVar11.b, !aVar11.c);
                                List<bw.c> list14 = eVar5.b;
                                if (list14 != null) {
                                    rShadow arrayList9 = new ArrayList();
                                    for (bw.c cVar8 : list14) {
                                        SimpleRepository I = (cVar8 == null || (t5Var = cVar8.c) == null) ? null : sy.n.I(t5Var);
                                        if (I != null) {
                                            arrayList9.add(I);
                                        }
                                    }
                                    rVar4 = arrayList9;
                                } else {
                                    rVar4 = null;
                                }
                                if (rVar4 != null) {
                                    rVar5 = rVar4;
                                }
                                return new k4(rVar5, iVar6);
                        }
                    }
                };
                py0.o oVar = new py0.o(0);
                s01.oShadow oVar2 = s01.oShadow.r;
                final int i8 = 23;
                this.v = new jy.d(jVar, bVar, vVar, cVar, oVar, oVar2, new py0.o(1), new j71.c() { // from class: oo.a
                    public final Object k(Object obj) {
                        f fVar;
                        ko.b bVar2;
                        g gVar;
                        f fVar2;
                        ko.b bVar3;
                        rShadow rVar;
                        String str;
                        Iterator it;
                        h hVar;
                        int i82;
                        String str2;
                        Iterator it2;
                        Object aVar;
                        k kVar;
                        Object eVar;
                        Object cVar2;
                        c cVar3;
                        c cVar4;
                        lc0.f fVar3;
                        lc0.b bVar4;
                        List list;
                        lc0.f fVar4;
                        lc0.b bVar5;
                        lc0.g gVar2;
                        lc0.f fVar5;
                        lc0.b bVar6;
                        rShadow rVar2;
                        Iterator it3;
                        h hVar2;
                        int i9;
                        String str3;
                        String str4;
                        Object aVar2;
                        Object cVar5;
                        nc0.c cVar6;
                        nc0.c cVar7;
                        s sVar;
                        List list2;
                        s sVar2;
                        u uVar;
                        s sVar3;
                        s sVar4;
                        rShadow rVar3;
                        yr0.a aVar3;
                        e eVar2;
                        List list3;
                        e eVar3;
                        d dVar;
                        xx.a aVar4;
                        e eVar4;
                        e eVar5;
                        rShadow rVar4;
                        t5 t5Var;
                        int i11 = i4;
                        String str5 = "<this>";
                        int i12 = 10;
                        aa1.b bVar7 = t0.d;
                        a0Shadow a0Var = a0.a;
                        rShadow rVar5 = r.r;
                        switch (i11) {
                            case 0:
                                ko.d dVar2 = (ko.d) obj;
                                k71.k.g(dVar2, "data");
                                ko.k kVar2 = dVar2.a;
                                if (kVar2 == null || (fVar = kVar2.c) == null || (bVar2 = fVar.a) == null || (gVar = bVar2.b) == null) {
                                    return null;
                                }
                                return new i(gVar.a, gVar.b, !gVar.c);
                            case 1:
                                ko.d dVar3 = (ko.d) obj;
                                k71.k.g(dVar3, "data");
                                ko.k kVar3 = dVar3.a;
                                List list4 = (kVar3 == null || (fVar2 = kVar3.c) == null || (bVar3 = fVar2.a) == null) ? null : bVar3.c;
                                return list4 == null ? rVar5 : list4;
                            case 2:
                                String str6 = null;
                                int i13 = 0;
                                ko.d dVar4 = (ko.d) obj;
                                k71.k.g(dVar4, "data");
                                ko.k kVar4 = dVar4.a;
                                if (kVar4 == null) {
                                    return null;
                                }
                                ko.b bVar8 = kVar4.c.a;
                                List list5 = bVar8.c;
                                if (list5 != null) {
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it4 = list5.iterator();
                                    while (it4.hasNext()) {
                                        ko.e eVar6 = (ko.e) it4.next();
                                        if (eVar6 != null) {
                                            String str7 = eVar6.b;
                                            ZonedDateTime zonedDateTime = eVar6.c;
                                            ko.a aVar5 = eVar6.e;
                                            String str8 = aVar5.a;
                                            String str9 = aVar5.b;
                                            ko.i iVar = eVar6.f;
                                            String str10 = iVar != null ? iVar.b : str6;
                                            String str11 = str10 == null ? "" : str10;
                                            String str12 = iVar != null ? iVar.c : str6;
                                            String str13 = str12 == null ? "" : str12;
                                            ArrayList arrayList2 = eVar6.g;
                                            ArrayList arrayList3 = new ArrayList(n.F(arrayList2, 10));
                                            int size = arrayList2.size();
                                            while (i13 < size) {
                                                Object obj2 = arrayList2.get(i13);
                                                int i14 = i13 + 1;
                                                ko.h hVar3 = (ko.h) obj2;
                                                k71.k.g(hVar3, str5);
                                                int i15 = size;
                                                String str14 = hVar3.b;
                                                j jVar2 = hVar3.a;
                                                if (jVar2 != null) {
                                                    h0 h0Var = jVar2.b;
                                                    i82 = i14;
                                                    mo.d dVar5 = h0Var.b;
                                                    if (dVar5 != null) {
                                                        List list6 = dVar5.a.a;
                                                        String str15 = (list6 == null || (cVar4 = (c) m.W(list6)) == null) ? null : cVar4.b;
                                                        if (str15 == null) {
                                                            str15 = "";
                                                        }
                                                        String str16 = (list6 == null || (cVar3 = (c) m.W(list6)) == null) ? null : cVar3.a;
                                                        if (str16 == null) {
                                                            str16 = "";
                                                        }
                                                        str2 = str5;
                                                        aVar = new jn.d(str14, str16, str15);
                                                        it2 = it4;
                                                    } else {
                                                        str2 = str5;
                                                        mo.e eVar7 = h0Var.c;
                                                        if (eVar7 != null) {
                                                            cVar2 = new jn.d(str14, eVar7.a, eVar7.b.a);
                                                            it2 = it4;
                                                        } else {
                                                            mo.f fVar6 = h0Var.d;
                                                            if (fVar6 != null) {
                                                                it2 = it4;
                                                                eVar = new jn.b(fVar6.b, str14, fVar6.a, fVar6.c.a);
                                                            } else {
                                                                it2 = it4;
                                                                mo.g gVar3 = h0Var.e;
                                                                if (gVar3 != null) {
                                                                    mo.a aVar6 = gVar3.b;
                                                                    String str17 = aVar6 != null ? aVar6.b.a : null;
                                                                    if (str17 == null) {
                                                                        str17 = "";
                                                                    }
                                                                    cVar2 = new jn.b(aVar6 != null ? aVar6.a : 0, str14, gVar3.a, str17);
                                                                } else {
                                                                    mo.h hVar4 = h0Var.f;
                                                                    if (hVar4 != null) {
                                                                        cVar2 = new jn.c(hVar4.c, str14, hVar4.a, hVar4.b.a);
                                                                    } else {
                                                                        mo.i iVar2 = h0Var.g;
                                                                        if (iVar2 != null) {
                                                                            cVar2 = new jn.c(iVar2.c.a, str14, iVar2.a, iVar2.b.a);
                                                                        } else {
                                                                            mo.k kVar5 = h0Var.h;
                                                                            if (kVar5 != null) {
                                                                                cVar2 = new jn.c(kVar5.b, str14, kVar5.c, kVar5.a.a);
                                                                            } else {
                                                                                l lVar = h0Var.i;
                                                                                if (lVar != null) {
                                                                                    mo.u uVar2 = lVar.b;
                                                                                    cVar2 = new jn.c(uVar2.b, str14, lVar.a, uVar2.a.a);
                                                                                } else {
                                                                                    mo.m mVar = h0Var.j;
                                                                                    if (mVar != null) {
                                                                                        t tVar = mVar.b;
                                                                                        cVar2 = new jn.c(tVar.b, str14, mVar.a, tVar.a.a);
                                                                                    } else {
                                                                                        mo.n nVar = h0Var.k;
                                                                                        if (nVar != null) {
                                                                                            eVar = new jn.d(str14, nVar.c, nVar.a.a);
                                                                                        } else {
                                                                                            o oVar3 = h0Var.l;
                                                                                            if (oVar3 != null) {
                                                                                                eVar = new jn.d(str14, oVar3.a, oVar3.b);
                                                                                            } else {
                                                                                                p pVar = h0Var.m;
                                                                                                if (pVar != null) {
                                                                                                    aVar = new jn.a(str14, pVar.a);
                                                                                                } else {
                                                                                                    q qVar = h0Var.n;
                                                                                                    if (qVar != null) {
                                                                                                        eVar = new jn.d(str14, qVar.a, qVar.b.a);
                                                                                                    } else {
                                                                                                        mo.rShadow rVar6 = h0Var.o;
                                                                                                        if (rVar6 != null) {
                                                                                                            g0 g0Var = rVar6.a;
                                                                                                            mo.s sVar5 = g0Var.b;
                                                                                                            if (sVar5 != null) {
                                                                                                                kVar = new k(sVar5.a, sVar5.b);
                                                                                                            } else {
                                                                                                                mo.j jVar3 = g0Var.c;
                                                                                                                String str18 = jVar3 != null ? jVar3.a : null;
                                                                                                                if (str18 == null) {
                                                                                                                    str18 = "";
                                                                                                                }
                                                                                                                String str19 = jVar3 != null ? jVar3.b : null;
                                                                                                                if (str19 == null) {
                                                                                                                    str19 = "";
                                                                                                                }
                                                                                                                kVar = new k(str18, str19);
                                                                                                            }
                                                                                                            eVar = new jn.e(str14, (String) kVar.s, (String) kVar.r);
                                                                                                        } else {
                                                                                                            aVar = new jn.a(str14, "");
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            aVar = eVar;
                                                        }
                                                        aVar = cVar2;
                                                    }
                                                } else {
                                                    i82 = i14;
                                                    str2 = str5;
                                                    it2 = it4;
                                                    aVar = new jn.a(str14, "");
                                                }
                                                arrayList3.add(aVar);
                                                size = i15;
                                                i13 = i82;
                                                str5 = str2;
                                                it4 = it2;
                                            }
                                            str = str5;
                                            it = it4;
                                            hVar = new h(str7, zonedDateTime, str8, str9, str11, str13, arrayList3, eVar6.d);
                                        } else {
                                            str = str5;
                                            it = it4;
                                            hVar = null;
                                        }
                                        if (hVar != null) {
                                            arrayList.add(hVar);
                                        }
                                        str5 = str;
                                        it4 = it;
                                        str6 = null;
                                        i13 = 0;
                                    }
                                    rVar = new ArrayList();
                                    int size2 = arrayList.size();
                                    int i16 = 0;
                                    while (i16 < size2) {
                                        Object obj3 = arrayList.get(i16);
                                        i16++;
                                        h hVar5 = (h) obj3;
                                        if (!t71.p.T(hVar5.f) && !t71.p.T(hVar5.e)) {
                                            rVar.add(obj3);
                                        }
                                    }
                                } else {
                                    rVar = null;
                                }
                                if (rVar != null) {
                                    rVar5 = rVar;
                                }
                                g gVar4 = bVar8.b;
                                return new jn.i(rVar5.size(), rVar5, new i(gVar4.a, gVar4.b, gVar4.c));
                            case 3:
                                p8.k kVar6 = (p8.k) obj;
                                k71.k.g(kVar6, "it");
                                return kVar6;
                            case 4:
                                pb0.g gVar5 = (pb0.g) obj;
                                k71.k.g(gVar5, "repositoryOwnerRepositoriesParameters");
                                nq f0 = m71.a.f0(gVar5.a);
                                if (f0 != null) {
                                    bVar7 = new u0(f0);
                                }
                                return new i10(null, bVar7, 10);
                            case 5:
                                d10 d10Var = (d10) obj;
                                k71.k.g(d10Var, "data");
                                return Boolean.valueOf(d10Var.a.a.b != null ? !r0.isEmpty() : false);
                            case 6:
                                d10 d10Var2 = (d10) obj;
                                k71.k.g(d10Var2, "data");
                                f10 f10Var = d10Var2.a.a.a;
                                return new i(f10Var.b, f10Var.a, !f10Var.c);
                            case 7:
                                d10 d10Var3 = (d10) obj;
                                k71.k.g(d10Var3, "data");
                                List list7 = d10Var3.a.a.b;
                                return list7 == null ? rVar5 : list7;
                            case 8:
                                d10 d10Var4 = (d10) obj;
                                k71.k.g(d10Var4, "data");
                                g10 g10Var = d10Var4.a.a;
                                rShadow rVar7 = g10Var.b;
                                if (rVar7 != null) {
                                    rVar5 = rVar7;
                                }
                                ArrayList S = m.S(rVar5);
                                ArrayList arrayList4 = new ArrayList(n.F(S, 10));
                                int size3 = S.size();
                                int i17 = 0;
                                while (i17 < size3) {
                                    Object obj4 = S.get(i17);
                                    i17++;
                                    e10 e10Var = (e10) obj4;
                                    q3 q3Var = e10Var.f;
                                    p3 p3Var = q3Var.d;
                                    arrayList4.add(new pb0.h(new t7(q3Var.a, q3Var.b, p3Var.c, t.q.q(p3Var.d), new bb0.j(e10Var.g), q3Var.c), e10Var.d, e10Var.b, e10Var.c));
                                }
                                f10 f10Var2 = g10Var.a;
                                return new pb0.f(arrayList4, new i(f10Var2.b, f10Var2.a, !f10Var2.c));
                            case 9:
                                w1.r rVar8 = (w1.r) obj;
                                k71.k.g(rVar8, "$this$applyIf");
                                return androidx.compose.foundation.layout.b.B(rVar8, ih.a.l, 0.0f, 0.0f, 0.0f, 14);
                            case 10:
                                c0 c0Var = (c0) obj;
                                k71.k.g(c0Var, "$this$semantics");
                                z.l(c0Var, 0);
                                return a0Var;
                            case 11:
                                pc0.a aVar7 = (pc0.a) obj;
                                k71.k.g(aVar7, "userAchievementsParameters");
                                return new lc0.l(aVar7.a, new u0(30), bVar7);
                            case 12:
                                lc0.d dVar6 = (lc0.d) obj;
                                k71.k.g(dVar6, "data");
                                lc0.k kVar7 = dVar6.a;
                                return Boolean.valueOf((kVar7 == null || (fVar3 = kVar7.c) == null || (bVar4 = fVar3.a) == null || (list = bVar4.c) == null) ? false : !list.isEmpty());
                            case 13:
                                lc0.d dVar7 = (lc0.d) obj;
                                k71.k.g(dVar7, "data");
                                lc0.k kVar8 = dVar7.a;
                                if (kVar8 == null || (fVar4 = kVar8.c) == null || (bVar5 = fVar4.a) == null || (gVar2 = bVar5.b) == null) {
                                    return null;
                                }
                                return new i(gVar2.a, gVar2.b, !gVar2.c);
                            case 14:
                                lc0.d dVar8 = (lc0.d) obj;
                                k71.k.g(dVar8, "data");
                                lc0.k kVar9 = dVar8.a;
                                List list8 = (kVar9 == null || (fVar5 = kVar9.c) == null || (bVar6 = fVar5.a) == null) ? null : bVar6.c;
                                return list8 == null ? rVar5 : list8;
                            case 15:
                                lc0.d dVar9 = (lc0.d) obj;
                                k71.k.g(dVar9, "data");
                                lc0.k kVar10 = dVar9.a;
                                if (kVar10 == null) {
                                    return null;
                                }
                                lc0.b bVar9 = kVar10.c.a;
                                List list9 = bVar9.c;
                                if (list9 != null) {
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it5 = list9.iterator();
                                    while (it5.hasNext()) {
                                        lc0.e eVar8 = (lc0.e) it5.next();
                                        if (eVar8 != null) {
                                            String str20 = eVar8.b;
                                            ZonedDateTime zonedDateTime2 = eVar8.c;
                                            lc0.a aVar8 = eVar8.e;
                                            String str21 = aVar8.a;
                                            String str22 = aVar8.b;
                                            lc0.i iVar3 = eVar8.f;
                                            String str23 = iVar3 != null ? iVar3.b : null;
                                            String str24 = str23 == null ? "" : str23;
                                            String str25 = iVar3 != null ? iVar3.c : null;
                                            String str26 = str25 == null ? "" : str25;
                                            ArrayList arrayList6 = eVar8.g;
                                            ArrayList arrayList7 = new ArrayList(n.F(arrayList6, i12));
                                            int size4 = arrayList6.size();
                                            int i18 = 0;
                                            while (i18 < size4) {
                                                Object obj5 = arrayList6.get(i18);
                                                int i19 = i18 + 1;
                                                lc0.h hVar6 = (lc0.h) obj5;
                                                k71.k.g(hVar6, "<this>");
                                                Iterator it6 = it5;
                                                String str27 = hVar6.b;
                                                lc0.j jVar4 = hVar6.a;
                                                if (jVar4 != null) {
                                                    nc0.g0 g0Var2 = jVar4.b;
                                                    i9 = i19;
                                                    nc0.d dVar10 = g0Var2.b;
                                                    if (dVar10 != null) {
                                                        List list10 = dVar10.a.a;
                                                        String str28 = (list10 == null || (cVar7 = (nc0.c) m.W(list10)) == null) ? null : cVar7.b;
                                                        if (str28 == null) {
                                                            str28 = "";
                                                        }
                                                        String str29 = (list10 == null || (cVar6 = (nc0.c) m.W(list10)) == null) ? null : cVar6.a;
                                                        if (str29 == null) {
                                                            str29 = "";
                                                        }
                                                        str3 = str22;
                                                        aVar2 = new jn.d(str27, str29, str28);
                                                    } else {
                                                        str3 = str22;
                                                        nc0.e eVar9 = g0Var2.c;
                                                        if (eVar9 != null) {
                                                            aVar2 = new jn.d(str27, eVar9.a, eVar9.b.a);
                                                        } else {
                                                            nc0.f fVar7 = g0Var2.d;
                                                            if (fVar7 != null) {
                                                                str4 = str21;
                                                                cVar5 = new jn.b(fVar7.b, str27, fVar7.a, fVar7.c.a);
                                                            } else {
                                                                str4 = str21;
                                                                nc0.g gVar6 = g0Var2.e;
                                                                if (gVar6 != null) {
                                                                    nc0.a aVar9 = gVar6.b;
                                                                    String str30 = aVar9 != null ? aVar9.b.a : null;
                                                                    if (str30 == null) {
                                                                        str30 = "";
                                                                    }
                                                                    cVar5 = new jn.b(aVar9 != null ? aVar9.a : 0, str27, gVar6.a, str30);
                                                                } else {
                                                                    nc0.h hVar7 = g0Var2.f;
                                                                    if (hVar7 != null) {
                                                                        cVar5 = new jn.c(hVar7.c, str27, hVar7.a, hVar7.b.a);
                                                                    } else {
                                                                        nc0.i iVar4 = g0Var2.g;
                                                                        if (iVar4 != null) {
                                                                            cVar5 = new jn.c(iVar4.c.a, str27, iVar4.a, iVar4.b.a);
                                                                        } else {
                                                                            nc0.j jVar5 = g0Var2.h;
                                                                            if (jVar5 != null) {
                                                                                cVar5 = new jn.c(jVar5.b, str27, jVar5.c, jVar5.a.a);
                                                                            } else {
                                                                                nc0.k kVar11 = g0Var2.i;
                                                                                if (kVar11 != null) {
                                                                                    nc0.t tVar2 = kVar11.b;
                                                                                    cVar5 = new jn.c(tVar2.b, str27, kVar11.a, tVar2.a.a);
                                                                                } else {
                                                                                    nc0.l lVar2 = g0Var2.j;
                                                                                    if (lVar2 != null) {
                                                                                        nc0.s sVar6 = lVar2.b;
                                                                                        cVar5 = new jn.c(sVar6.b, str27, lVar2.a, sVar6.a.a);
                                                                                    } else {
                                                                                        nc0.m mVar2 = g0Var2.k;
                                                                                        if (mVar2 != null) {
                                                                                            aVar2 = new jn.d(str27, mVar2.c, mVar2.a.a);
                                                                                        } else {
                                                                                            nc0.n nVar2 = g0Var2.l;
                                                                                            if (nVar2 != null) {
                                                                                                aVar2 = new jn.d(str27, nVar2.a, nVar2.b);
                                                                                            } else {
                                                                                                nc0.o oVar22 = g0Var2.m;
                                                                                                if (oVar22 != null) {
                                                                                                    aVar2 = new jn.a(str27, oVar22.a);
                                                                                                } else {
                                                                                                    nc0.p pVar2 = g0Var2.n;
                                                                                                    if (pVar2 != null) {
                                                                                                        aVar2 = new jn.d(str27, pVar2.a, pVar2.b.a);
                                                                                                    } else {
                                                                                                        nc0.q qVar2 = g0Var2.o;
                                                                                                        if (qVar2 != null) {
                                                                                                            aVar2 = new jn.f(str27, qVar2.a, qVar2.b.a);
                                                                                                        } else {
                                                                                                            nc0.rShadow rVar9 = g0Var2.p;
                                                                                                            aVar2 = rVar9 != null ? new jn.a(str27, rVar9.a) : new jn.a(str27, "");
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            aVar2 = cVar5;
                                                        }
                                                    }
                                                    str4 = str21;
                                                } else {
                                                    i9 = i19;
                                                    str3 = str22;
                                                    str4 = str21;
                                                    aVar2 = new jn.a(str27, "");
                                                }
                                                arrayList7.add(aVar2);
                                                it5 = it6;
                                                i18 = i9;
                                                str22 = str3;
                                                str21 = str4;
                                            }
                                            it3 = it5;
                                            hVar2 = new h(str20, zonedDateTime2, str21, str22, str24, str26, arrayList7, eVar8.d);
                                        } else {
                                            it3 = it5;
                                            hVar2 = null;
                                        }
                                        if (hVar2 != null) {
                                            arrayList5.add(hVar2);
                                        }
                                        it5 = it3;
                                        i12 = 10;
                                    }
                                    rVar2 = new ArrayList();
                                    int size5 = arrayList5.size();
                                    int i21 = 0;
                                    while (i21 < size5) {
                                        Object obj6 = arrayList5.get(i21);
                                        i21++;
                                        h hVar8 = (h) obj6;
                                        if (!t71.p.T(hVar8.f) && !t71.p.T(hVar8.e)) {
                                            rVar2.add(obj6);
                                        }
                                    }
                                } else {
                                    rVar2 = null;
                                }
                                if (rVar2 != null) {
                                    rVar5 = rVar2;
                                }
                                lc0.g gVar7 = bVar9.b;
                                return new jn.i(rVar5.size(), rVar5, new i(gVar7.a, gVar7.b, gVar7.c));
                            case 16:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 17:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 18:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 19:
                                py0.p pVar3 = (py0.p) obj;
                                k71.k.g(pVar3, "repositoryIssueTypesParameters");
                                return new w(new u0(30), bVar7, pVar3.a, pVar3.b);
                            case 20:
                                py0.r rVar10 = (py0.r) obj;
                                k71.k.g(rVar10, "data");
                                v vVar2 = rVar10.a;
                                return Boolean.valueOf((vVar2 == null || (sVar = vVar2.a) == null || (list2 = sVar.b) == null) ? false : !list2.isEmpty());
                            case 21:
                                py0.r rVar11 = (py0.r) obj;
                                k71.k.g(rVar11, "data");
                                v vVar3 = rVar11.a;
                                if (vVar3 == null || (sVar2 = vVar3.a) == null || (uVar = sVar2.a) == null) {
                                    return null;
                                }
                                return new i(uVar.a, uVar.b, !uVar.c);
                            case 22:
                                py0.r rVar12 = (py0.r) obj;
                                k71.k.g(rVar12, "data");
                                v vVar4 = rVar12.a;
                                List list11 = (vVar4 == null || (sVar3 = vVar4.a) == null) ? null : sVar3.b;
                                return list11 == null ? rVar5 : list11;
                            case 23:
                                py0.r rVar13 = (py0.r) obj;
                                k71.k.g(rVar13, "data");
                                v vVar5 = rVar13.a;
                                if (vVar5 == null || (sVar4 = vVar5.a) == null) {
                                    return null;
                                }
                                u uVar3 = sVar4.a;
                                i iVar5 = new i(uVar3.a, uVar3.b, !uVar3.c);
                                List<py0.t> list12 = sVar4.b;
                                if (list12 != null) {
                                    rShadow arrayList8 = new ArrayList();
                                    for (py0.t tVar3 : list12) {
                                        IssueType k = (tVar3 == null || (aVar3 = tVar3.c) == null) ? null : aa1.b.k(aVar3);
                                        if (k != null) {
                                            arrayList8.add(k);
                                        }
                                    }
                                    rVar3 = arrayList8;
                                } else {
                                    rVar3 = null;
                                }
                                if (rVar3 != null) {
                                    rVar5 = rVar3;
                                }
                                return new u01.a(rVar5, iVar5);
                            case 24:
                                r71.e[] eVarArr = z.a;
                                ((c0) obj).a(x.e, a0Var);
                                return a0Var;
                            case 25:
                                q00.a aVar10 = (q00.a) obj;
                                k71.k.g(aVar10, "repositoryOwnerRepositoriesParameters");
                                String str31 = aVar10.a;
                                String str32 = aVar10.b;
                                return new bw.g(str31, bVar7, str32 == null ? bVar7 : new u0(str32));
                            case 26:
                                bw.b bVar10 = (bw.b) obj;
                                k71.k.g(bVar10, "data");
                                bw.f fVar8 = bVar10.a;
                                return Boolean.valueOf((fVar8 == null || (eVar2 = fVar8.b) == null || (list3 = eVar2.b) == null) ? false : !list3.isEmpty());
                            case 27:
                                bw.b bVar11 = (bw.b) obj;
                                k71.k.g(bVar11, "data");
                                bw.f fVar9 = bVar11.a;
                                if (fVar9 == null || (eVar3 = fVar9.b) == null || (dVar = eVar3.a) == null || (aVar4 = dVar.b) == null) {
                                    return null;
                                }
                                return new i(aVar4.a, aVar4.b, !aVar4.c);
                            case 28:
                                bw.b bVar12 = (bw.b) obj;
                                k71.k.g(bVar12, "data");
                                bw.f fVar10 = bVar12.a;
                                List list13 = (fVar10 == null || (eVar4 = fVar10.b) == null) ? null : eVar4.b;
                                return list13 == null ? rVar5 : list13;
                            default:
                                bw.b bVar13 = (bw.b) obj;
                                k71.k.g(bVar13, "data");
                                bw.f fVar11 = bVar13.a;
                                if (fVar11 == null || (eVar5 = fVar11.b) == null) {
                                    return null;
                                }
                                xx.a aVar11 = eVar5.a.b;
                                i iVar6 = new i(aVar11.a, aVar11.b, !aVar11.c);
                                List<bw.c> list14 = eVar5.b;
                                if (list14 != null) {
                                    rShadow arrayList9 = new ArrayList();
                                    for (bw.c cVar8 : list14) {
                                        SimpleRepository I = (cVar8 == null || (t5Var = cVar8.c) == null) ? null : sy.n.I(t5Var);
                                        if (I != null) {
                                            arrayList9.add(I);
                                        }
                                    }
                                    rVar4 = arrayList9;
                                } else {
                                    rVar4 = null;
                                }
                                if (rVar4 != null) {
                                    rVar5 = rVar4;
                                }
                                return new k4(rVar5, iVar6);
                        }
                    }
                }, new j71.c() { // from class: oo.a
                    public final Object k(Object obj) {
                        f fVar;
                        ko.b bVar2;
                        g gVar;
                        f fVar2;
                        ko.b bVar3;
                        rShadow rVar;
                        String str;
                        Iterator it;
                        h hVar;
                        int i82;
                        String str2;
                        Iterator it2;
                        Object aVar;
                        k kVar;
                        Object eVar;
                        Object cVar2;
                        c cVar3;
                        c cVar4;
                        lc0.f fVar3;
                        lc0.b bVar4;
                        List list;
                        lc0.f fVar4;
                        lc0.b bVar5;
                        lc0.g gVar2;
                        lc0.f fVar5;
                        lc0.b bVar6;
                        rShadow rVar2;
                        Iterator it3;
                        h hVar2;
                        int i9;
                        String str3;
                        String str4;
                        Object aVar2;
                        Object cVar5;
                        nc0.c cVar6;
                        nc0.c cVar7;
                        s sVar;
                        List list2;
                        s sVar2;
                        u uVar;
                        s sVar3;
                        s sVar4;
                        rShadow rVar3;
                        yr0.a aVar3;
                        e eVar2;
                        List list3;
                        e eVar3;
                        d dVar;
                        xx.a aVar4;
                        e eVar4;
                        e eVar5;
                        rShadow rVar4;
                        t5 t5Var;
                        int i11 = i3;
                        String str5 = "<this>";
                        int i12 = 10;
                        aa1.b bVar7 = t0.d;
                        a0Shadow a0Var = a0.a;
                        rShadow rVar5 = r.r;
                        switch (i11) {
                            case 0:
                                ko.d dVar2 = (ko.d) obj;
                                k71.k.g(dVar2, "data");
                                ko.k kVar2 = dVar2.a;
                                if (kVar2 == null || (fVar = kVar2.c) == null || (bVar2 = fVar.a) == null || (gVar = bVar2.b) == null) {
                                    return null;
                                }
                                return new i(gVar.a, gVar.b, !gVar.c);
                            case 1:
                                ko.d dVar3 = (ko.d) obj;
                                k71.k.g(dVar3, "data");
                                ko.k kVar3 = dVar3.a;
                                List list4 = (kVar3 == null || (fVar2 = kVar3.c) == null || (bVar3 = fVar2.a) == null) ? null : bVar3.c;
                                return list4 == null ? rVar5 : list4;
                            case 2:
                                String str6 = null;
                                int i13 = 0;
                                ko.d dVar4 = (ko.d) obj;
                                k71.k.g(dVar4, "data");
                                ko.k kVar4 = dVar4.a;
                                if (kVar4 == null) {
                                    return null;
                                }
                                ko.b bVar8 = kVar4.c.a;
                                List list5 = bVar8.c;
                                if (list5 != null) {
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it4 = list5.iterator();
                                    while (it4.hasNext()) {
                                        ko.e eVar6 = (ko.e) it4.next();
                                        if (eVar6 != null) {
                                            String str7 = eVar6.b;
                                            ZonedDateTime zonedDateTime = eVar6.c;
                                            ko.a aVar5 = eVar6.e;
                                            String str8 = aVar5.a;
                                            String str9 = aVar5.b;
                                            ko.i iVar = eVar6.f;
                                            String str10 = iVar != null ? iVar.b : str6;
                                            String str11 = str10 == null ? "" : str10;
                                            String str12 = iVar != null ? iVar.c : str6;
                                            String str13 = str12 == null ? "" : str12;
                                            ArrayList arrayList2 = eVar6.g;
                                            ArrayList arrayList3 = new ArrayList(n.F(arrayList2, 10));
                                            int size = arrayList2.size();
                                            while (i13 < size) {
                                                Object obj2 = arrayList2.get(i13);
                                                int i14 = i13 + 1;
                                                ko.h hVar3 = (ko.h) obj2;
                                                k71.k.g(hVar3, str5);
                                                int i15 = size;
                                                String str14 = hVar3.b;
                                                j jVar2 = hVar3.a;
                                                if (jVar2 != null) {
                                                    h0 h0Var = jVar2.b;
                                                    i82 = i14;
                                                    mo.d dVar5 = h0Var.b;
                                                    if (dVar5 != null) {
                                                        List list6 = dVar5.a.a;
                                                        String str15 = (list6 == null || (cVar4 = (c) m.W(list6)) == null) ? null : cVar4.b;
                                                        if (str15 == null) {
                                                            str15 = "";
                                                        }
                                                        String str16 = (list6 == null || (cVar3 = (c) m.W(list6)) == null) ? null : cVar3.a;
                                                        if (str16 == null) {
                                                            str16 = "";
                                                        }
                                                        str2 = str5;
                                                        aVar = new jn.d(str14, str16, str15);
                                                        it2 = it4;
                                                    } else {
                                                        str2 = str5;
                                                        mo.e eVar7 = h0Var.c;
                                                        if (eVar7 != null) {
                                                            cVar2 = new jn.d(str14, eVar7.a, eVar7.b.a);
                                                            it2 = it4;
                                                        } else {
                                                            mo.f fVar6 = h0Var.d;
                                                            if (fVar6 != null) {
                                                                it2 = it4;
                                                                eVar = new jn.b(fVar6.b, str14, fVar6.a, fVar6.c.a);
                                                            } else {
                                                                it2 = it4;
                                                                mo.g gVar3 = h0Var.e;
                                                                if (gVar3 != null) {
                                                                    mo.a aVar6 = gVar3.b;
                                                                    String str17 = aVar6 != null ? aVar6.b.a : null;
                                                                    if (str17 == null) {
                                                                        str17 = "";
                                                                    }
                                                                    cVar2 = new jn.b(aVar6 != null ? aVar6.a : 0, str14, gVar3.a, str17);
                                                                } else {
                                                                    mo.h hVar4 = h0Var.f;
                                                                    if (hVar4 != null) {
                                                                        cVar2 = new jn.c(hVar4.c, str14, hVar4.a, hVar4.b.a);
                                                                    } else {
                                                                        mo.i iVar2 = h0Var.g;
                                                                        if (iVar2 != null) {
                                                                            cVar2 = new jn.c(iVar2.c.a, str14, iVar2.a, iVar2.b.a);
                                                                        } else {
                                                                            mo.k kVar5 = h0Var.h;
                                                                            if (kVar5 != null) {
                                                                                cVar2 = new jn.c(kVar5.b, str14, kVar5.c, kVar5.a.a);
                                                                            } else {
                                                                                l lVar = h0Var.i;
                                                                                if (lVar != null) {
                                                                                    mo.u uVar2 = lVar.b;
                                                                                    cVar2 = new jn.c(uVar2.b, str14, lVar.a, uVar2.a.a);
                                                                                } else {
                                                                                    mo.m mVar = h0Var.j;
                                                                                    if (mVar != null) {
                                                                                        t tVar = mVar.b;
                                                                                        cVar2 = new jn.c(tVar.b, str14, mVar.a, tVar.a.a);
                                                                                    } else {
                                                                                        mo.n nVar = h0Var.k;
                                                                                        if (nVar != null) {
                                                                                            eVar = new jn.d(str14, nVar.c, nVar.a.a);
                                                                                        } else {
                                                                                            o oVar3 = h0Var.l;
                                                                                            if (oVar3 != null) {
                                                                                                eVar = new jn.d(str14, oVar3.a, oVar3.b);
                                                                                            } else {
                                                                                                p pVar = h0Var.m;
                                                                                                if (pVar != null) {
                                                                                                    aVar = new jn.a(str14, pVar.a);
                                                                                                } else {
                                                                                                    q qVar = h0Var.n;
                                                                                                    if (qVar != null) {
                                                                                                        eVar = new jn.d(str14, qVar.a, qVar.b.a);
                                                                                                    } else {
                                                                                                        mo.rShadow rVar6 = h0Var.o;
                                                                                                        if (rVar6 != null) {
                                                                                                            g0 g0Var = rVar6.a;
                                                                                                            mo.s sVar5 = g0Var.b;
                                                                                                            if (sVar5 != null) {
                                                                                                                kVar = new k(sVar5.a, sVar5.b);
                                                                                                            } else {
                                                                                                                mo.j jVar3 = g0Var.c;
                                                                                                                String str18 = jVar3 != null ? jVar3.a : null;
                                                                                                                if (str18 == null) {
                                                                                                                    str18 = "";
                                                                                                                }
                                                                                                                String str19 = jVar3 != null ? jVar3.b : null;
                                                                                                                if (str19 == null) {
                                                                                                                    str19 = "";
                                                                                                                }
                                                                                                                kVar = new k(str18, str19);
                                                                                                            }
                                                                                                            eVar = new jn.e(str14, (String) kVar.s, (String) kVar.r);
                                                                                                        } else {
                                                                                                            aVar = new jn.a(str14, "");
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            aVar = eVar;
                                                        }
                                                        aVar = cVar2;
                                                    }
                                                } else {
                                                    i82 = i14;
                                                    str2 = str5;
                                                    it2 = it4;
                                                    aVar = new jn.a(str14, "");
                                                }
                                                arrayList3.add(aVar);
                                                size = i15;
                                                i13 = i82;
                                                str5 = str2;
                                                it4 = it2;
                                            }
                                            str = str5;
                                            it = it4;
                                            hVar = new h(str7, zonedDateTime, str8, str9, str11, str13, arrayList3, eVar6.d);
                                        } else {
                                            str = str5;
                                            it = it4;
                                            hVar = null;
                                        }
                                        if (hVar != null) {
                                            arrayList.add(hVar);
                                        }
                                        str5 = str;
                                        it4 = it;
                                        str6 = null;
                                        i13 = 0;
                                    }
                                    rVar = new ArrayList();
                                    int size2 = arrayList.size();
                                    int i16 = 0;
                                    while (i16 < size2) {
                                        Object obj3 = arrayList.get(i16);
                                        i16++;
                                        h hVar5 = (h) obj3;
                                        if (!t71.p.T(hVar5.f) && !t71.p.T(hVar5.e)) {
                                            rVar.add(obj3);
                                        }
                                    }
                                } else {
                                    rVar = null;
                                }
                                if (rVar != null) {
                                    rVar5 = rVar;
                                }
                                g gVar4 = bVar8.b;
                                return new jn.i(rVar5.size(), rVar5, new i(gVar4.a, gVar4.b, gVar4.c));
                            case 3:
                                p8.k kVar6 = (p8.k) obj;
                                k71.k.g(kVar6, "it");
                                return kVar6;
                            case 4:
                                pb0.g gVar5 = (pb0.g) obj;
                                k71.k.g(gVar5, "repositoryOwnerRepositoriesParameters");
                                nq f0 = m71.a.f0(gVar5.a);
                                if (f0 != null) {
                                    bVar7 = new u0(f0);
                                }
                                return new i10(null, bVar7, 10);
                            case 5:
                                d10 d10Var = (d10) obj;
                                k71.k.g(d10Var, "data");
                                return Boolean.valueOf(d10Var.a.a.b != null ? !r0.isEmpty() : false);
                            case 6:
                                d10 d10Var2 = (d10) obj;
                                k71.k.g(d10Var2, "data");
                                f10 f10Var = d10Var2.a.a.a;
                                return new i(f10Var.b, f10Var.a, !f10Var.c);
                            case 7:
                                d10 d10Var3 = (d10) obj;
                                k71.k.g(d10Var3, "data");
                                List list7 = d10Var3.a.a.b;
                                return list7 == null ? rVar5 : list7;
                            case 8:
                                d10 d10Var4 = (d10) obj;
                                k71.k.g(d10Var4, "data");
                                g10 g10Var = d10Var4.a.a;
                                rShadow rVar7 = g10Var.b;
                                if (rVar7 != null) {
                                    rVar5 = rVar7;
                                }
                                ArrayList S = m.S(rVar5);
                                ArrayList arrayList4 = new ArrayList(n.F(S, 10));
                                int size3 = S.size();
                                int i17 = 0;
                                while (i17 < size3) {
                                    Object obj4 = S.get(i17);
                                    i17++;
                                    e10 e10Var = (e10) obj4;
                                    q3 q3Var = e10Var.f;
                                    p3 p3Var = q3Var.d;
                                    arrayList4.add(new pb0.h(new t7(q3Var.a, q3Var.b, p3Var.c, t.q.q(p3Var.d), new bb0.j(e10Var.g), q3Var.c), e10Var.d, e10Var.b, e10Var.c));
                                }
                                f10 f10Var2 = g10Var.a;
                                return new pb0.f(arrayList4, new i(f10Var2.b, f10Var2.a, !f10Var2.c));
                            case 9:
                                w1.r rVar8 = (w1.r) obj;
                                k71.k.g(rVar8, "$this$applyIf");
                                return androidx.compose.foundation.layout.b.B(rVar8, ih.a.l, 0.0f, 0.0f, 0.0f, 14);
                            case 10:
                                c0 c0Var = (c0) obj;
                                k71.k.g(c0Var, "$this$semantics");
                                z.l(c0Var, 0);
                                return a0Var;
                            case 11:
                                pc0.a aVar7 = (pc0.a) obj;
                                k71.k.g(aVar7, "userAchievementsParameters");
                                return new lc0.l(aVar7.a, new u0(30), bVar7);
                            case 12:
                                lc0.d dVar6 = (lc0.d) obj;
                                k71.k.g(dVar6, "data");
                                lc0.k kVar7 = dVar6.a;
                                return Boolean.valueOf((kVar7 == null || (fVar3 = kVar7.c) == null || (bVar4 = fVar3.a) == null || (list = bVar4.c) == null) ? false : !list.isEmpty());
                            case 13:
                                lc0.d dVar7 = (lc0.d) obj;
                                k71.k.g(dVar7, "data");
                                lc0.k kVar8 = dVar7.a;
                                if (kVar8 == null || (fVar4 = kVar8.c) == null || (bVar5 = fVar4.a) == null || (gVar2 = bVar5.b) == null) {
                                    return null;
                                }
                                return new i(gVar2.a, gVar2.b, !gVar2.c);
                            case 14:
                                lc0.d dVar8 = (lc0.d) obj;
                                k71.k.g(dVar8, "data");
                                lc0.k kVar9 = dVar8.a;
                                List list8 = (kVar9 == null || (fVar5 = kVar9.c) == null || (bVar6 = fVar5.a) == null) ? null : bVar6.c;
                                return list8 == null ? rVar5 : list8;
                            case 15:
                                lc0.d dVar9 = (lc0.d) obj;
                                k71.k.g(dVar9, "data");
                                lc0.k kVar10 = dVar9.a;
                                if (kVar10 == null) {
                                    return null;
                                }
                                lc0.b bVar9 = kVar10.c.a;
                                List list9 = bVar9.c;
                                if (list9 != null) {
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it5 = list9.iterator();
                                    while (it5.hasNext()) {
                                        lc0.e eVar8 = (lc0.e) it5.next();
                                        if (eVar8 != null) {
                                            String str20 = eVar8.b;
                                            ZonedDateTime zonedDateTime2 = eVar8.c;
                                            lc0.a aVar8 = eVar8.e;
                                            String str21 = aVar8.a;
                                            String str22 = aVar8.b;
                                            lc0.i iVar3 = eVar8.f;
                                            String str23 = iVar3 != null ? iVar3.b : null;
                                            String str24 = str23 == null ? "" : str23;
                                            String str25 = iVar3 != null ? iVar3.c : null;
                                            String str26 = str25 == null ? "" : str25;
                                            ArrayList arrayList6 = eVar8.g;
                                            ArrayList arrayList7 = new ArrayList(n.F(arrayList6, i12));
                                            int size4 = arrayList6.size();
                                            int i18 = 0;
                                            while (i18 < size4) {
                                                Object obj5 = arrayList6.get(i18);
                                                int i19 = i18 + 1;
                                                lc0.h hVar6 = (lc0.h) obj5;
                                                k71.k.g(hVar6, "<this>");
                                                Iterator it6 = it5;
                                                String str27 = hVar6.b;
                                                lc0.j jVar4 = hVar6.a;
                                                if (jVar4 != null) {
                                                    nc0.g0 g0Var2 = jVar4.b;
                                                    i9 = i19;
                                                    nc0.d dVar10 = g0Var2.b;
                                                    if (dVar10 != null) {
                                                        List list10 = dVar10.a.a;
                                                        String str28 = (list10 == null || (cVar7 = (nc0.c) m.W(list10)) == null) ? null : cVar7.b;
                                                        if (str28 == null) {
                                                            str28 = "";
                                                        }
                                                        String str29 = (list10 == null || (cVar6 = (nc0.c) m.W(list10)) == null) ? null : cVar6.a;
                                                        if (str29 == null) {
                                                            str29 = "";
                                                        }
                                                        str3 = str22;
                                                        aVar2 = new jn.d(str27, str29, str28);
                                                    } else {
                                                        str3 = str22;
                                                        nc0.e eVar9 = g0Var2.c;
                                                        if (eVar9 != null) {
                                                            aVar2 = new jn.d(str27, eVar9.a, eVar9.b.a);
                                                        } else {
                                                            nc0.f fVar7 = g0Var2.d;
                                                            if (fVar7 != null) {
                                                                str4 = str21;
                                                                cVar5 = new jn.b(fVar7.b, str27, fVar7.a, fVar7.c.a);
                                                            } else {
                                                                str4 = str21;
                                                                nc0.g gVar6 = g0Var2.e;
                                                                if (gVar6 != null) {
                                                                    nc0.a aVar9 = gVar6.b;
                                                                    String str30 = aVar9 != null ? aVar9.b.a : null;
                                                                    if (str30 == null) {
                                                                        str30 = "";
                                                                    }
                                                                    cVar5 = new jn.b(aVar9 != null ? aVar9.a : 0, str27, gVar6.a, str30);
                                                                } else {
                                                                    nc0.h hVar7 = g0Var2.f;
                                                                    if (hVar7 != null) {
                                                                        cVar5 = new jn.c(hVar7.c, str27, hVar7.a, hVar7.b.a);
                                                                    } else {
                                                                        nc0.i iVar4 = g0Var2.g;
                                                                        if (iVar4 != null) {
                                                                            cVar5 = new jn.c(iVar4.c.a, str27, iVar4.a, iVar4.b.a);
                                                                        } else {
                                                                            nc0.j jVar5 = g0Var2.h;
                                                                            if (jVar5 != null) {
                                                                                cVar5 = new jn.c(jVar5.b, str27, jVar5.c, jVar5.a.a);
                                                                            } else {
                                                                                nc0.k kVar11 = g0Var2.i;
                                                                                if (kVar11 != null) {
                                                                                    nc0.t tVar2 = kVar11.b;
                                                                                    cVar5 = new jn.c(tVar2.b, str27, kVar11.a, tVar2.a.a);
                                                                                } else {
                                                                                    nc0.l lVar2 = g0Var2.j;
                                                                                    if (lVar2 != null) {
                                                                                        nc0.s sVar6 = lVar2.b;
                                                                                        cVar5 = new jn.c(sVar6.b, str27, lVar2.a, sVar6.a.a);
                                                                                    } else {
                                                                                        nc0.m mVar2 = g0Var2.k;
                                                                                        if (mVar2 != null) {
                                                                                            aVar2 = new jn.d(str27, mVar2.c, mVar2.a.a);
                                                                                        } else {
                                                                                            nc0.n nVar2 = g0Var2.l;
                                                                                            if (nVar2 != null) {
                                                                                                aVar2 = new jn.d(str27, nVar2.a, nVar2.b);
                                                                                            } else {
                                                                                                nc0.o oVar22 = g0Var2.m;
                                                                                                if (oVar22 != null) {
                                                                                                    aVar2 = new jn.a(str27, oVar22.a);
                                                                                                } else {
                                                                                                    nc0.p pVar2 = g0Var2.n;
                                                                                                    if (pVar2 != null) {
                                                                                                        aVar2 = new jn.d(str27, pVar2.a, pVar2.b.a);
                                                                                                    } else {
                                                                                                        nc0.q qVar2 = g0Var2.o;
                                                                                                        if (qVar2 != null) {
                                                                                                            aVar2 = new jn.f(str27, qVar2.a, qVar2.b.a);
                                                                                                        } else {
                                                                                                            nc0.rShadow rVar9 = g0Var2.p;
                                                                                                            aVar2 = rVar9 != null ? new jn.a(str27, rVar9.a) : new jn.a(str27, "");
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            aVar2 = cVar5;
                                                        }
                                                    }
                                                    str4 = str21;
                                                } else {
                                                    i9 = i19;
                                                    str3 = str22;
                                                    str4 = str21;
                                                    aVar2 = new jn.a(str27, "");
                                                }
                                                arrayList7.add(aVar2);
                                                it5 = it6;
                                                i18 = i9;
                                                str22 = str3;
                                                str21 = str4;
                                            }
                                            it3 = it5;
                                            hVar2 = new h(str20, zonedDateTime2, str21, str22, str24, str26, arrayList7, eVar8.d);
                                        } else {
                                            it3 = it5;
                                            hVar2 = null;
                                        }
                                        if (hVar2 != null) {
                                            arrayList5.add(hVar2);
                                        }
                                        it5 = it3;
                                        i12 = 10;
                                    }
                                    rVar2 = new ArrayList();
                                    int size5 = arrayList5.size();
                                    int i21 = 0;
                                    while (i21 < size5) {
                                        Object obj6 = arrayList5.get(i21);
                                        i21++;
                                        h hVar8 = (h) obj6;
                                        if (!t71.p.T(hVar8.f) && !t71.p.T(hVar8.e)) {
                                            rVar2.add(obj6);
                                        }
                                    }
                                } else {
                                    rVar2 = null;
                                }
                                if (rVar2 != null) {
                                    rVar5 = rVar2;
                                }
                                lc0.g gVar7 = bVar9.b;
                                return new jn.i(rVar5.size(), rVar5, new i(gVar7.a, gVar7.b, gVar7.c));
                            case 16:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 17:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 18:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 19:
                                py0.p pVar3 = (py0.p) obj;
                                k71.k.g(pVar3, "repositoryIssueTypesParameters");
                                return new w(new u0(30), bVar7, pVar3.a, pVar3.b);
                            case 20:
                                py0.r rVar10 = (py0.r) obj;
                                k71.k.g(rVar10, "data");
                                v vVar2 = rVar10.a;
                                return Boolean.valueOf((vVar2 == null || (sVar = vVar2.a) == null || (list2 = sVar.b) == null) ? false : !list2.isEmpty());
                            case 21:
                                py0.r rVar11 = (py0.r) obj;
                                k71.k.g(rVar11, "data");
                                v vVar3 = rVar11.a;
                                if (vVar3 == null || (sVar2 = vVar3.a) == null || (uVar = sVar2.a) == null) {
                                    return null;
                                }
                                return new i(uVar.a, uVar.b, !uVar.c);
                            case 22:
                                py0.r rVar12 = (py0.r) obj;
                                k71.k.g(rVar12, "data");
                                v vVar4 = rVar12.a;
                                List list11 = (vVar4 == null || (sVar3 = vVar4.a) == null) ? null : sVar3.b;
                                return list11 == null ? rVar5 : list11;
                            case 23:
                                py0.r rVar13 = (py0.r) obj;
                                k71.k.g(rVar13, "data");
                                v vVar5 = rVar13.a;
                                if (vVar5 == null || (sVar4 = vVar5.a) == null) {
                                    return null;
                                }
                                u uVar3 = sVar4.a;
                                i iVar5 = new i(uVar3.a, uVar3.b, !uVar3.c);
                                List<py0.t> list12 = sVar4.b;
                                if (list12 != null) {
                                    rShadow arrayList8 = new ArrayList();
                                    for (py0.t tVar3 : list12) {
                                        IssueType k = (tVar3 == null || (aVar3 = tVar3.c) == null) ? null : aa1.b.k(aVar3);
                                        if (k != null) {
                                            arrayList8.add(k);
                                        }
                                    }
                                    rVar3 = arrayList8;
                                } else {
                                    rVar3 = null;
                                }
                                if (rVar3 != null) {
                                    rVar5 = rVar3;
                                }
                                return new u01.a(rVar5, iVar5);
                            case 24:
                                r71.e[] eVarArr = z.a;
                                ((c0) obj).a(x.e, a0Var);
                                return a0Var;
                            case 25:
                                q00.a aVar10 = (q00.a) obj;
                                k71.k.g(aVar10, "repositoryOwnerRepositoriesParameters");
                                String str31 = aVar10.a;
                                String str32 = aVar10.b;
                                return new bw.g(str31, bVar7, str32 == null ? bVar7 : new u0(str32));
                            case 26:
                                bw.b bVar10 = (bw.b) obj;
                                k71.k.g(bVar10, "data");
                                bw.f fVar8 = bVar10.a;
                                return Boolean.valueOf((fVar8 == null || (eVar2 = fVar8.b) == null || (list3 = eVar2.b) == null) ? false : !list3.isEmpty());
                            case 27:
                                bw.b bVar11 = (bw.b) obj;
                                k71.k.g(bVar11, "data");
                                bw.f fVar9 = bVar11.a;
                                if (fVar9 == null || (eVar3 = fVar9.b) == null || (dVar = eVar3.a) == null || (aVar4 = dVar.b) == null) {
                                    return null;
                                }
                                return new i(aVar4.a, aVar4.b, !aVar4.c);
                            case 28:
                                bw.b bVar12 = (bw.b) obj;
                                k71.k.g(bVar12, "data");
                                bw.f fVar10 = bVar12.a;
                                List list13 = (fVar10 == null || (eVar4 = fVar10.b) == null) ? null : eVar4.b;
                                return list13 == null ? rVar5 : list13;
                            default:
                                bw.b bVar13 = (bw.b) obj;
                                k71.k.g(bVar13, "data");
                                bw.f fVar11 = bVar13.a;
                                if (fVar11 == null || (eVar5 = fVar11.b) == null) {
                                    return null;
                                }
                                xx.a aVar11 = eVar5.a.b;
                                i iVar6 = new i(aVar11.a, aVar11.b, !aVar11.c);
                                List<bw.c> list14 = eVar5.b;
                                if (list14 != null) {
                                    rShadow arrayList9 = new ArrayList();
                                    for (bw.c cVar8 : list14) {
                                        SimpleRepository I = (cVar8 == null || (t5Var = cVar8.c) == null) ? null : sy.n.I(t5Var);
                                        if (I != null) {
                                            arrayList9.add(I);
                                        }
                                    }
                                    rVar4 = arrayList9;
                                } else {
                                    rVar4 = null;
                                }
                                if (rVar4 != null) {
                                    rVar5 = rVar4;
                                }
                                return new k4(rVar5, iVar6);
                        }
                    }
                }, new j71.c() { // from class: oo.a
                    public final Object k(Object obj) {
                        f fVar;
                        ko.b bVar2;
                        g gVar;
                        f fVar2;
                        ko.b bVar3;
                        rShadow rVar;
                        String str;
                        Iterator it;
                        h hVar;
                        int i82;
                        String str2;
                        Iterator it2;
                        Object aVar;
                        k kVar;
                        Object eVar;
                        Object cVar2;
                        c cVar3;
                        c cVar4;
                        lc0.f fVar3;
                        lc0.b bVar4;
                        List list;
                        lc0.f fVar4;
                        lc0.b bVar5;
                        lc0.g gVar2;
                        lc0.f fVar5;
                        lc0.b bVar6;
                        rShadow rVar2;
                        Iterator it3;
                        h hVar2;
                        int i9;
                        String str3;
                        String str4;
                        Object aVar2;
                        Object cVar5;
                        nc0.c cVar6;
                        nc0.c cVar7;
                        s sVar;
                        List list2;
                        s sVar2;
                        u uVar;
                        s sVar3;
                        s sVar4;
                        rShadow rVar3;
                        yr0.a aVar3;
                        e eVar2;
                        List list3;
                        e eVar3;
                        d dVar;
                        xx.a aVar4;
                        e eVar4;
                        e eVar5;
                        rShadow rVar4;
                        t5 t5Var;
                        int i11 = i2;
                        String str5 = "<this>";
                        int i12 = 10;
                        aa1.b bVar7 = t0.d;
                        a0Shadow a0Var = a0.a;
                        rShadow rVar5 = r.r;
                        switch (i11) {
                            case 0:
                                ko.d dVar2 = (ko.d) obj;
                                k71.k.g(dVar2, "data");
                                ko.k kVar2 = dVar2.a;
                                if (kVar2 == null || (fVar = kVar2.c) == null || (bVar2 = fVar.a) == null || (gVar = bVar2.b) == null) {
                                    return null;
                                }
                                return new i(gVar.a, gVar.b, !gVar.c);
                            case 1:
                                ko.d dVar3 = (ko.d) obj;
                                k71.k.g(dVar3, "data");
                                ko.k kVar3 = dVar3.a;
                                List list4 = (kVar3 == null || (fVar2 = kVar3.c) == null || (bVar3 = fVar2.a) == null) ? null : bVar3.c;
                                return list4 == null ? rVar5 : list4;
                            case 2:
                                String str6 = null;
                                int i13 = 0;
                                ko.d dVar4 = (ko.d) obj;
                                k71.k.g(dVar4, "data");
                                ko.k kVar4 = dVar4.a;
                                if (kVar4 == null) {
                                    return null;
                                }
                                ko.b bVar8 = kVar4.c.a;
                                List list5 = bVar8.c;
                                if (list5 != null) {
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it4 = list5.iterator();
                                    while (it4.hasNext()) {
                                        ko.e eVar6 = (ko.e) it4.next();
                                        if (eVar6 != null) {
                                            String str7 = eVar6.b;
                                            ZonedDateTime zonedDateTime = eVar6.c;
                                            ko.a aVar5 = eVar6.e;
                                            String str8 = aVar5.a;
                                            String str9 = aVar5.b;
                                            ko.i iVar = eVar6.f;
                                            String str10 = iVar != null ? iVar.b : str6;
                                            String str11 = str10 == null ? "" : str10;
                                            String str12 = iVar != null ? iVar.c : str6;
                                            String str13 = str12 == null ? "" : str12;
                                            ArrayList arrayList2 = eVar6.g;
                                            ArrayList arrayList3 = new ArrayList(n.F(arrayList2, 10));
                                            int size = arrayList2.size();
                                            while (i13 < size) {
                                                Object obj2 = arrayList2.get(i13);
                                                int i14 = i13 + 1;
                                                ko.h hVar3 = (ko.h) obj2;
                                                k71.k.g(hVar3, str5);
                                                int i15 = size;
                                                String str14 = hVar3.b;
                                                j jVar2 = hVar3.a;
                                                if (jVar2 != null) {
                                                    h0 h0Var = jVar2.b;
                                                    i82 = i14;
                                                    mo.d dVar5 = h0Var.b;
                                                    if (dVar5 != null) {
                                                        List list6 = dVar5.a.a;
                                                        String str15 = (list6 == null || (cVar4 = (c) m.W(list6)) == null) ? null : cVar4.b;
                                                        if (str15 == null) {
                                                            str15 = "";
                                                        }
                                                        String str16 = (list6 == null || (cVar3 = (c) m.W(list6)) == null) ? null : cVar3.a;
                                                        if (str16 == null) {
                                                            str16 = "";
                                                        }
                                                        str2 = str5;
                                                        aVar = new jn.d(str14, str16, str15);
                                                        it2 = it4;
                                                    } else {
                                                        str2 = str5;
                                                        mo.e eVar7 = h0Var.c;
                                                        if (eVar7 != null) {
                                                            cVar2 = new jn.d(str14, eVar7.a, eVar7.b.a);
                                                            it2 = it4;
                                                        } else {
                                                            mo.f fVar6 = h0Var.d;
                                                            if (fVar6 != null) {
                                                                it2 = it4;
                                                                eVar = new jn.b(fVar6.b, str14, fVar6.a, fVar6.c.a);
                                                            } else {
                                                                it2 = it4;
                                                                mo.g gVar3 = h0Var.e;
                                                                if (gVar3 != null) {
                                                                    mo.a aVar6 = gVar3.b;
                                                                    String str17 = aVar6 != null ? aVar6.b.a : null;
                                                                    if (str17 == null) {
                                                                        str17 = "";
                                                                    }
                                                                    cVar2 = new jn.b(aVar6 != null ? aVar6.a : 0, str14, gVar3.a, str17);
                                                                } else {
                                                                    mo.h hVar4 = h0Var.f;
                                                                    if (hVar4 != null) {
                                                                        cVar2 = new jn.c(hVar4.c, str14, hVar4.a, hVar4.b.a);
                                                                    } else {
                                                                        mo.i iVar2 = h0Var.g;
                                                                        if (iVar2 != null) {
                                                                            cVar2 = new jn.c(iVar2.c.a, str14, iVar2.a, iVar2.b.a);
                                                                        } else {
                                                                            mo.k kVar5 = h0Var.h;
                                                                            if (kVar5 != null) {
                                                                                cVar2 = new jn.c(kVar5.b, str14, kVar5.c, kVar5.a.a);
                                                                            } else {
                                                                                l lVar = h0Var.i;
                                                                                if (lVar != null) {
                                                                                    mo.u uVar2 = lVar.b;
                                                                                    cVar2 = new jn.c(uVar2.b, str14, lVar.a, uVar2.a.a);
                                                                                } else {
                                                                                    mo.m mVar = h0Var.j;
                                                                                    if (mVar != null) {
                                                                                        t tVar = mVar.b;
                                                                                        cVar2 = new jn.c(tVar.b, str14, mVar.a, tVar.a.a);
                                                                                    } else {
                                                                                        mo.n nVar = h0Var.k;
                                                                                        if (nVar != null) {
                                                                                            eVar = new jn.d(str14, nVar.c, nVar.a.a);
                                                                                        } else {
                                                                                            o oVar3 = h0Var.l;
                                                                                            if (oVar3 != null) {
                                                                                                eVar = new jn.d(str14, oVar3.a, oVar3.b);
                                                                                            } else {
                                                                                                p pVar = h0Var.m;
                                                                                                if (pVar != null) {
                                                                                                    aVar = new jn.a(str14, pVar.a);
                                                                                                } else {
                                                                                                    q qVar = h0Var.n;
                                                                                                    if (qVar != null) {
                                                                                                        eVar = new jn.d(str14, qVar.a, qVar.b.a);
                                                                                                    } else {
                                                                                                        mo.rShadow rVar6 = h0Var.o;
                                                                                                        if (rVar6 != null) {
                                                                                                            g0 g0Var = rVar6.a;
                                                                                                            mo.s sVar5 = g0Var.b;
                                                                                                            if (sVar5 != null) {
                                                                                                                kVar = new k(sVar5.a, sVar5.b);
                                                                                                            } else {
                                                                                                                mo.j jVar3 = g0Var.c;
                                                                                                                String str18 = jVar3 != null ? jVar3.a : null;
                                                                                                                if (str18 == null) {
                                                                                                                    str18 = "";
                                                                                                                }
                                                                                                                String str19 = jVar3 != null ? jVar3.b : null;
                                                                                                                if (str19 == null) {
                                                                                                                    str19 = "";
                                                                                                                }
                                                                                                                kVar = new k(str18, str19);
                                                                                                            }
                                                                                                            eVar = new jn.e(str14, (String) kVar.s, (String) kVar.r);
                                                                                                        } else {
                                                                                                            aVar = new jn.a(str14, "");
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            aVar = eVar;
                                                        }
                                                        aVar = cVar2;
                                                    }
                                                } else {
                                                    i82 = i14;
                                                    str2 = str5;
                                                    it2 = it4;
                                                    aVar = new jn.a(str14, "");
                                                }
                                                arrayList3.add(aVar);
                                                size = i15;
                                                i13 = i82;
                                                str5 = str2;
                                                it4 = it2;
                                            }
                                            str = str5;
                                            it = it4;
                                            hVar = new h(str7, zonedDateTime, str8, str9, str11, str13, arrayList3, eVar6.d);
                                        } else {
                                            str = str5;
                                            it = it4;
                                            hVar = null;
                                        }
                                        if (hVar != null) {
                                            arrayList.add(hVar);
                                        }
                                        str5 = str;
                                        it4 = it;
                                        str6 = null;
                                        i13 = 0;
                                    }
                                    rVar = new ArrayList();
                                    int size2 = arrayList.size();
                                    int i16 = 0;
                                    while (i16 < size2) {
                                        Object obj3 = arrayList.get(i16);
                                        i16++;
                                        h hVar5 = (h) obj3;
                                        if (!t71.p.T(hVar5.f) && !t71.p.T(hVar5.e)) {
                                            rVar.add(obj3);
                                        }
                                    }
                                } else {
                                    rVar = null;
                                }
                                if (rVar != null) {
                                    rVar5 = rVar;
                                }
                                g gVar4 = bVar8.b;
                                return new jn.i(rVar5.size(), rVar5, new i(gVar4.a, gVar4.b, gVar4.c));
                            case 3:
                                p8.k kVar6 = (p8.k) obj;
                                k71.k.g(kVar6, "it");
                                return kVar6;
                            case 4:
                                pb0.g gVar5 = (pb0.g) obj;
                                k71.k.g(gVar5, "repositoryOwnerRepositoriesParameters");
                                nq f0 = m71.a.f0(gVar5.a);
                                if (f0 != null) {
                                    bVar7 = new u0(f0);
                                }
                                return new i10(null, bVar7, 10);
                            case 5:
                                d10 d10Var = (d10) obj;
                                k71.k.g(d10Var, "data");
                                return Boolean.valueOf(d10Var.a.a.b != null ? !r0.isEmpty() : false);
                            case 6:
                                d10 d10Var2 = (d10) obj;
                                k71.k.g(d10Var2, "data");
                                f10 f10Var = d10Var2.a.a.a;
                                return new i(f10Var.b, f10Var.a, !f10Var.c);
                            case 7:
                                d10 d10Var3 = (d10) obj;
                                k71.k.g(d10Var3, "data");
                                List list7 = d10Var3.a.a.b;
                                return list7 == null ? rVar5 : list7;
                            case 8:
                                d10 d10Var4 = (d10) obj;
                                k71.k.g(d10Var4, "data");
                                g10 g10Var = d10Var4.a.a;
                                rShadow rVar7 = g10Var.b;
                                if (rVar7 != null) {
                                    rVar5 = rVar7;
                                }
                                ArrayList S = m.S(rVar5);
                                ArrayList arrayList4 = new ArrayList(n.F(S, 10));
                                int size3 = S.size();
                                int i17 = 0;
                                while (i17 < size3) {
                                    Object obj4 = S.get(i17);
                                    i17++;
                                    e10 e10Var = (e10) obj4;
                                    q3 q3Var = e10Var.f;
                                    p3 p3Var = q3Var.d;
                                    arrayList4.add(new pb0.h(new t7(q3Var.a, q3Var.b, p3Var.c, t.q.q(p3Var.d), new bb0.j(e10Var.g), q3Var.c), e10Var.d, e10Var.b, e10Var.c));
                                }
                                f10 f10Var2 = g10Var.a;
                                return new pb0.f(arrayList4, new i(f10Var2.b, f10Var2.a, !f10Var2.c));
                            case 9:
                                w1.r rVar8 = (w1.r) obj;
                                k71.k.g(rVar8, "$this$applyIf");
                                return androidx.compose.foundation.layout.b.B(rVar8, ih.a.l, 0.0f, 0.0f, 0.0f, 14);
                            case 10:
                                c0 c0Var = (c0) obj;
                                k71.k.g(c0Var, "$this$semantics");
                                z.l(c0Var, 0);
                                return a0Var;
                            case 11:
                                pc0.a aVar7 = (pc0.a) obj;
                                k71.k.g(aVar7, "userAchievementsParameters");
                                return new lc0.l(aVar7.a, new u0(30), bVar7);
                            case 12:
                                lc0.d dVar6 = (lc0.d) obj;
                                k71.k.g(dVar6, "data");
                                lc0.k kVar7 = dVar6.a;
                                return Boolean.valueOf((kVar7 == null || (fVar3 = kVar7.c) == null || (bVar4 = fVar3.a) == null || (list = bVar4.c) == null) ? false : !list.isEmpty());
                            case 13:
                                lc0.d dVar7 = (lc0.d) obj;
                                k71.k.g(dVar7, "data");
                                lc0.k kVar8 = dVar7.a;
                                if (kVar8 == null || (fVar4 = kVar8.c) == null || (bVar5 = fVar4.a) == null || (gVar2 = bVar5.b) == null) {
                                    return null;
                                }
                                return new i(gVar2.a, gVar2.b, !gVar2.c);
                            case 14:
                                lc0.d dVar8 = (lc0.d) obj;
                                k71.k.g(dVar8, "data");
                                lc0.k kVar9 = dVar8.a;
                                List list8 = (kVar9 == null || (fVar5 = kVar9.c) == null || (bVar6 = fVar5.a) == null) ? null : bVar6.c;
                                return list8 == null ? rVar5 : list8;
                            case 15:
                                lc0.d dVar9 = (lc0.d) obj;
                                k71.k.g(dVar9, "data");
                                lc0.k kVar10 = dVar9.a;
                                if (kVar10 == null) {
                                    return null;
                                }
                                lc0.b bVar9 = kVar10.c.a;
                                List list9 = bVar9.c;
                                if (list9 != null) {
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it5 = list9.iterator();
                                    while (it5.hasNext()) {
                                        lc0.e eVar8 = (lc0.e) it5.next();
                                        if (eVar8 != null) {
                                            String str20 = eVar8.b;
                                            ZonedDateTime zonedDateTime2 = eVar8.c;
                                            lc0.a aVar8 = eVar8.e;
                                            String str21 = aVar8.a;
                                            String str22 = aVar8.b;
                                            lc0.i iVar3 = eVar8.f;
                                            String str23 = iVar3 != null ? iVar3.b : null;
                                            String str24 = str23 == null ? "" : str23;
                                            String str25 = iVar3 != null ? iVar3.c : null;
                                            String str26 = str25 == null ? "" : str25;
                                            ArrayList arrayList6 = eVar8.g;
                                            ArrayList arrayList7 = new ArrayList(n.F(arrayList6, i12));
                                            int size4 = arrayList6.size();
                                            int i18 = 0;
                                            while (i18 < size4) {
                                                Object obj5 = arrayList6.get(i18);
                                                int i19 = i18 + 1;
                                                lc0.h hVar6 = (lc0.h) obj5;
                                                k71.k.g(hVar6, "<this>");
                                                Iterator it6 = it5;
                                                String str27 = hVar6.b;
                                                lc0.j jVar4 = hVar6.a;
                                                if (jVar4 != null) {
                                                    nc0.g0 g0Var2 = jVar4.b;
                                                    i9 = i19;
                                                    nc0.d dVar10 = g0Var2.b;
                                                    if (dVar10 != null) {
                                                        List list10 = dVar10.a.a;
                                                        String str28 = (list10 == null || (cVar7 = (nc0.c) m.W(list10)) == null) ? null : cVar7.b;
                                                        if (str28 == null) {
                                                            str28 = "";
                                                        }
                                                        String str29 = (list10 == null || (cVar6 = (nc0.c) m.W(list10)) == null) ? null : cVar6.a;
                                                        if (str29 == null) {
                                                            str29 = "";
                                                        }
                                                        str3 = str22;
                                                        aVar2 = new jn.d(str27, str29, str28);
                                                    } else {
                                                        str3 = str22;
                                                        nc0.e eVar9 = g0Var2.c;
                                                        if (eVar9 != null) {
                                                            aVar2 = new jn.d(str27, eVar9.a, eVar9.b.a);
                                                        } else {
                                                            nc0.f fVar7 = g0Var2.d;
                                                            if (fVar7 != null) {
                                                                str4 = str21;
                                                                cVar5 = new jn.b(fVar7.b, str27, fVar7.a, fVar7.c.a);
                                                            } else {
                                                                str4 = str21;
                                                                nc0.g gVar6 = g0Var2.e;
                                                                if (gVar6 != null) {
                                                                    nc0.a aVar9 = gVar6.b;
                                                                    String str30 = aVar9 != null ? aVar9.b.a : null;
                                                                    if (str30 == null) {
                                                                        str30 = "";
                                                                    }
                                                                    cVar5 = new jn.b(aVar9 != null ? aVar9.a : 0, str27, gVar6.a, str30);
                                                                } else {
                                                                    nc0.h hVar7 = g0Var2.f;
                                                                    if (hVar7 != null) {
                                                                        cVar5 = new jn.c(hVar7.c, str27, hVar7.a, hVar7.b.a);
                                                                    } else {
                                                                        nc0.i iVar4 = g0Var2.g;
                                                                        if (iVar4 != null) {
                                                                            cVar5 = new jn.c(iVar4.c.a, str27, iVar4.a, iVar4.b.a);
                                                                        } else {
                                                                            nc0.j jVar5 = g0Var2.h;
                                                                            if (jVar5 != null) {
                                                                                cVar5 = new jn.c(jVar5.b, str27, jVar5.c, jVar5.a.a);
                                                                            } else {
                                                                                nc0.k kVar11 = g0Var2.i;
                                                                                if (kVar11 != null) {
                                                                                    nc0.t tVar2 = kVar11.b;
                                                                                    cVar5 = new jn.c(tVar2.b, str27, kVar11.a, tVar2.a.a);
                                                                                } else {
                                                                                    nc0.l lVar2 = g0Var2.j;
                                                                                    if (lVar2 != null) {
                                                                                        nc0.s sVar6 = lVar2.b;
                                                                                        cVar5 = new jn.c(sVar6.b, str27, lVar2.a, sVar6.a.a);
                                                                                    } else {
                                                                                        nc0.m mVar2 = g0Var2.k;
                                                                                        if (mVar2 != null) {
                                                                                            aVar2 = new jn.d(str27, mVar2.c, mVar2.a.a);
                                                                                        } else {
                                                                                            nc0.n nVar2 = g0Var2.l;
                                                                                            if (nVar2 != null) {
                                                                                                aVar2 = new jn.d(str27, nVar2.a, nVar2.b);
                                                                                            } else {
                                                                                                nc0.o oVar22 = g0Var2.m;
                                                                                                if (oVar22 != null) {
                                                                                                    aVar2 = new jn.a(str27, oVar22.a);
                                                                                                } else {
                                                                                                    nc0.p pVar2 = g0Var2.n;
                                                                                                    if (pVar2 != null) {
                                                                                                        aVar2 = new jn.d(str27, pVar2.a, pVar2.b.a);
                                                                                                    } else {
                                                                                                        nc0.q qVar2 = g0Var2.o;
                                                                                                        if (qVar2 != null) {
                                                                                                            aVar2 = new jn.f(str27, qVar2.a, qVar2.b.a);
                                                                                                        } else {
                                                                                                            nc0.rShadow rVar9 = g0Var2.p;
                                                                                                            aVar2 = rVar9 != null ? new jn.a(str27, rVar9.a) : new jn.a(str27, "");
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            aVar2 = cVar5;
                                                        }
                                                    }
                                                    str4 = str21;
                                                } else {
                                                    i9 = i19;
                                                    str3 = str22;
                                                    str4 = str21;
                                                    aVar2 = new jn.a(str27, "");
                                                }
                                                arrayList7.add(aVar2);
                                                it5 = it6;
                                                i18 = i9;
                                                str22 = str3;
                                                str21 = str4;
                                            }
                                            it3 = it5;
                                            hVar2 = new h(str20, zonedDateTime2, str21, str22, str24, str26, arrayList7, eVar8.d);
                                        } else {
                                            it3 = it5;
                                            hVar2 = null;
                                        }
                                        if (hVar2 != null) {
                                            arrayList5.add(hVar2);
                                        }
                                        it5 = it3;
                                        i12 = 10;
                                    }
                                    rVar2 = new ArrayList();
                                    int size5 = arrayList5.size();
                                    int i21 = 0;
                                    while (i21 < size5) {
                                        Object obj6 = arrayList5.get(i21);
                                        i21++;
                                        h hVar8 = (h) obj6;
                                        if (!t71.p.T(hVar8.f) && !t71.p.T(hVar8.e)) {
                                            rVar2.add(obj6);
                                        }
                                    }
                                } else {
                                    rVar2 = null;
                                }
                                if (rVar2 != null) {
                                    rVar5 = rVar2;
                                }
                                lc0.g gVar7 = bVar9.b;
                                return new jn.i(rVar5.size(), rVar5, new i(gVar7.a, gVar7.b, gVar7.c));
                            case 16:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 17:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 18:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 19:
                                py0.p pVar3 = (py0.p) obj;
                                k71.k.g(pVar3, "repositoryIssueTypesParameters");
                                return new w(new u0(30), bVar7, pVar3.a, pVar3.b);
                            case 20:
                                py0.r rVar10 = (py0.r) obj;
                                k71.k.g(rVar10, "data");
                                v vVar2 = rVar10.a;
                                return Boolean.valueOf((vVar2 == null || (sVar = vVar2.a) == null || (list2 = sVar.b) == null) ? false : !list2.isEmpty());
                            case 21:
                                py0.r rVar11 = (py0.r) obj;
                                k71.k.g(rVar11, "data");
                                v vVar3 = rVar11.a;
                                if (vVar3 == null || (sVar2 = vVar3.a) == null || (uVar = sVar2.a) == null) {
                                    return null;
                                }
                                return new i(uVar.a, uVar.b, !uVar.c);
                            case 22:
                                py0.r rVar12 = (py0.r) obj;
                                k71.k.g(rVar12, "data");
                                v vVar4 = rVar12.a;
                                List list11 = (vVar4 == null || (sVar3 = vVar4.a) == null) ? null : sVar3.b;
                                return list11 == null ? rVar5 : list11;
                            case 23:
                                py0.r rVar13 = (py0.r) obj;
                                k71.k.g(rVar13, "data");
                                v vVar5 = rVar13.a;
                                if (vVar5 == null || (sVar4 = vVar5.a) == null) {
                                    return null;
                                }
                                u uVar3 = sVar4.a;
                                i iVar5 = new i(uVar3.a, uVar3.b, !uVar3.c);
                                List<py0.t> list12 = sVar4.b;
                                if (list12 != null) {
                                    rShadow arrayList8 = new ArrayList();
                                    for (py0.t tVar3 : list12) {
                                        IssueType k = (tVar3 == null || (aVar3 = tVar3.c) == null) ? null : aa1.b.k(aVar3);
                                        if (k != null) {
                                            arrayList8.add(k);
                                        }
                                    }
                                    rVar3 = arrayList8;
                                } else {
                                    rVar3 = null;
                                }
                                if (rVar3 != null) {
                                    rVar5 = rVar3;
                                }
                                return new u01.a(rVar5, iVar5);
                            case 24:
                                r71.e[] eVarArr = z.a;
                                ((c0) obj).a(x.e, a0Var);
                                return a0Var;
                            case 25:
                                q00.a aVar10 = (q00.a) obj;
                                k71.k.g(aVar10, "repositoryOwnerRepositoriesParameters");
                                String str31 = aVar10.a;
                                String str32 = aVar10.b;
                                return new bw.g(str31, bVar7, str32 == null ? bVar7 : new u0(str32));
                            case 26:
                                bw.b bVar10 = (bw.b) obj;
                                k71.k.g(bVar10, "data");
                                bw.f fVar8 = bVar10.a;
                                return Boolean.valueOf((fVar8 == null || (eVar2 = fVar8.b) == null || (list3 = eVar2.b) == null) ? false : !list3.isEmpty());
                            case 27:
                                bw.b bVar11 = (bw.b) obj;
                                k71.k.g(bVar11, "data");
                                bw.f fVar9 = bVar11.a;
                                if (fVar9 == null || (eVar3 = fVar9.b) == null || (dVar = eVar3.a) == null || (aVar4 = dVar.b) == null) {
                                    return null;
                                }
                                return new i(aVar4.a, aVar4.b, !aVar4.c);
                            case 28:
                                bw.b bVar12 = (bw.b) obj;
                                k71.k.g(bVar12, "data");
                                bw.f fVar10 = bVar12.a;
                                List list13 = (fVar10 == null || (eVar4 = fVar10.b) == null) ? null : eVar4.b;
                                return list13 == null ? rVar5 : list13;
                            default:
                                bw.b bVar13 = (bw.b) obj;
                                k71.k.g(bVar13, "data");
                                bw.f fVar11 = bVar13.a;
                                if (fVar11 == null || (eVar5 = fVar11.b) == null) {
                                    return null;
                                }
                                xx.a aVar11 = eVar5.a.b;
                                i iVar6 = new i(aVar11.a, aVar11.b, !aVar11.c);
                                List<bw.c> list14 = eVar5.b;
                                if (list14 != null) {
                                    rShadow arrayList9 = new ArrayList();
                                    for (bw.c cVar8 : list14) {
                                        SimpleRepository I = (cVar8 == null || (t5Var = cVar8.c) == null) ? null : sy.n.I(t5Var);
                                        if (I != null) {
                                            arrayList9.add(I);
                                        }
                                    }
                                    rVar4 = arrayList9;
                                } else {
                                    rVar4 = null;
                                }
                                if (rVar4 != null) {
                                    rVar5 = rVar4;
                                }
                                return new k4(rVar5, iVar6);
                        }
                    }
                }, new j71.c() { // from class: oo.a
                    public final Object k(Object obj) {
                        f fVar;
                        ko.b bVar2;
                        g gVar;
                        f fVar2;
                        ko.b bVar3;
                        rShadow rVar;
                        String str;
                        Iterator it;
                        h hVar;
                        int i82;
                        String str2;
                        Iterator it2;
                        Object aVar;
                        k kVar;
                        Object eVar;
                        Object cVar2;
                        c cVar3;
                        c cVar4;
                        lc0.f fVar3;
                        lc0.b bVar4;
                        List list;
                        lc0.f fVar4;
                        lc0.b bVar5;
                        lc0.g gVar2;
                        lc0.f fVar5;
                        lc0.b bVar6;
                        rShadow rVar2;
                        Iterator it3;
                        h hVar2;
                        int i9;
                        String str3;
                        String str4;
                        Object aVar2;
                        Object cVar5;
                        nc0.c cVar6;
                        nc0.c cVar7;
                        s sVar;
                        List list2;
                        s sVar2;
                        u uVar;
                        s sVar3;
                        s sVar4;
                        rShadow rVar3;
                        yr0.a aVar3;
                        e eVar2;
                        List list3;
                        e eVar3;
                        d dVar;
                        xx.a aVar4;
                        e eVar4;
                        e eVar5;
                        rShadow rVar4;
                        t5 t5Var;
                        int i11 = i8;
                        String str5 = "<this>";
                        int i12 = 10;
                        aa1.b bVar7 = t0.d;
                        a0Shadow a0Var = a0.a;
                        rShadow rVar5 = r.r;
                        switch (i11) {
                            case 0:
                                ko.d dVar2 = (ko.d) obj;
                                k71.k.g(dVar2, "data");
                                ko.k kVar2 = dVar2.a;
                                if (kVar2 == null || (fVar = kVar2.c) == null || (bVar2 = fVar.a) == null || (gVar = bVar2.b) == null) {
                                    return null;
                                }
                                return new i(gVar.a, gVar.b, !gVar.c);
                            case 1:
                                ko.d dVar3 = (ko.d) obj;
                                k71.k.g(dVar3, "data");
                                ko.k kVar3 = dVar3.a;
                                List list4 = (kVar3 == null || (fVar2 = kVar3.c) == null || (bVar3 = fVar2.a) == null) ? null : bVar3.c;
                                return list4 == null ? rVar5 : list4;
                            case 2:
                                String str6 = null;
                                int i13 = 0;
                                ko.d dVar4 = (ko.d) obj;
                                k71.k.g(dVar4, "data");
                                ko.k kVar4 = dVar4.a;
                                if (kVar4 == null) {
                                    return null;
                                }
                                ko.b bVar8 = kVar4.c.a;
                                List list5 = bVar8.c;
                                if (list5 != null) {
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it4 = list5.iterator();
                                    while (it4.hasNext()) {
                                        ko.e eVar6 = (ko.e) it4.next();
                                        if (eVar6 != null) {
                                            String str7 = eVar6.b;
                                            ZonedDateTime zonedDateTime = eVar6.c;
                                            ko.a aVar5 = eVar6.e;
                                            String str8 = aVar5.a;
                                            String str9 = aVar5.b;
                                            ko.i iVar = eVar6.f;
                                            String str10 = iVar != null ? iVar.b : str6;
                                            String str11 = str10 == null ? "" : str10;
                                            String str12 = iVar != null ? iVar.c : str6;
                                            String str13 = str12 == null ? "" : str12;
                                            ArrayList arrayList2 = eVar6.g;
                                            ArrayList arrayList3 = new ArrayList(n.F(arrayList2, 10));
                                            int size = arrayList2.size();
                                            while (i13 < size) {
                                                Object obj2 = arrayList2.get(i13);
                                                int i14 = i13 + 1;
                                                ko.h hVar3 = (ko.h) obj2;
                                                k71.k.g(hVar3, str5);
                                                int i15 = size;
                                                String str14 = hVar3.b;
                                                j jVar2 = hVar3.a;
                                                if (jVar2 != null) {
                                                    h0 h0Var = jVar2.b;
                                                    i82 = i14;
                                                    mo.d dVar5 = h0Var.b;
                                                    if (dVar5 != null) {
                                                        List list6 = dVar5.a.a;
                                                        String str15 = (list6 == null || (cVar4 = (c) m.W(list6)) == null) ? null : cVar4.b;
                                                        if (str15 == null) {
                                                            str15 = "";
                                                        }
                                                        String str16 = (list6 == null || (cVar3 = (c) m.W(list6)) == null) ? null : cVar3.a;
                                                        if (str16 == null) {
                                                            str16 = "";
                                                        }
                                                        str2 = str5;
                                                        aVar = new jn.d(str14, str16, str15);
                                                        it2 = it4;
                                                    } else {
                                                        str2 = str5;
                                                        mo.e eVar7 = h0Var.c;
                                                        if (eVar7 != null) {
                                                            cVar2 = new jn.d(str14, eVar7.a, eVar7.b.a);
                                                            it2 = it4;
                                                        } else {
                                                            mo.f fVar6 = h0Var.d;
                                                            if (fVar6 != null) {
                                                                it2 = it4;
                                                                eVar = new jn.b(fVar6.b, str14, fVar6.a, fVar6.c.a);
                                                            } else {
                                                                it2 = it4;
                                                                mo.g gVar3 = h0Var.e;
                                                                if (gVar3 != null) {
                                                                    mo.a aVar6 = gVar3.b;
                                                                    String str17 = aVar6 != null ? aVar6.b.a : null;
                                                                    if (str17 == null) {
                                                                        str17 = "";
                                                                    }
                                                                    cVar2 = new jn.b(aVar6 != null ? aVar6.a : 0, str14, gVar3.a, str17);
                                                                } else {
                                                                    mo.h hVar4 = h0Var.f;
                                                                    if (hVar4 != null) {
                                                                        cVar2 = new jn.c(hVar4.c, str14, hVar4.a, hVar4.b.a);
                                                                    } else {
                                                                        mo.i iVar2 = h0Var.g;
                                                                        if (iVar2 != null) {
                                                                            cVar2 = new jn.c(iVar2.c.a, str14, iVar2.a, iVar2.b.a);
                                                                        } else {
                                                                            mo.k kVar5 = h0Var.h;
                                                                            if (kVar5 != null) {
                                                                                cVar2 = new jn.c(kVar5.b, str14, kVar5.c, kVar5.a.a);
                                                                            } else {
                                                                                l lVar = h0Var.i;
                                                                                if (lVar != null) {
                                                                                    mo.u uVar2 = lVar.b;
                                                                                    cVar2 = new jn.c(uVar2.b, str14, lVar.a, uVar2.a.a);
                                                                                } else {
                                                                                    mo.m mVar = h0Var.j;
                                                                                    if (mVar != null) {
                                                                                        t tVar = mVar.b;
                                                                                        cVar2 = new jn.c(tVar.b, str14, mVar.a, tVar.a.a);
                                                                                    } else {
                                                                                        mo.n nVar = h0Var.k;
                                                                                        if (nVar != null) {
                                                                                            eVar = new jn.d(str14, nVar.c, nVar.a.a);
                                                                                        } else {
                                                                                            o oVar3 = h0Var.l;
                                                                                            if (oVar3 != null) {
                                                                                                eVar = new jn.d(str14, oVar3.a, oVar3.b);
                                                                                            } else {
                                                                                                p pVar = h0Var.m;
                                                                                                if (pVar != null) {
                                                                                                    aVar = new jn.a(str14, pVar.a);
                                                                                                } else {
                                                                                                    q qVar = h0Var.n;
                                                                                                    if (qVar != null) {
                                                                                                        eVar = new jn.d(str14, qVar.a, qVar.b.a);
                                                                                                    } else {
                                                                                                        mo.rShadow rVar6 = h0Var.o;
                                                                                                        if (rVar6 != null) {
                                                                                                            g0 g0Var = rVar6.a;
                                                                                                            mo.s sVar5 = g0Var.b;
                                                                                                            if (sVar5 != null) {
                                                                                                                kVar = new k(sVar5.a, sVar5.b);
                                                                                                            } else {
                                                                                                                mo.j jVar3 = g0Var.c;
                                                                                                                String str18 = jVar3 != null ? jVar3.a : null;
                                                                                                                if (str18 == null) {
                                                                                                                    str18 = "";
                                                                                                                }
                                                                                                                String str19 = jVar3 != null ? jVar3.b : null;
                                                                                                                if (str19 == null) {
                                                                                                                    str19 = "";
                                                                                                                }
                                                                                                                kVar = new k(str18, str19);
                                                                                                            }
                                                                                                            eVar = new jn.e(str14, (String) kVar.s, (String) kVar.r);
                                                                                                        } else {
                                                                                                            aVar = new jn.a(str14, "");
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            aVar = eVar;
                                                        }
                                                        aVar = cVar2;
                                                    }
                                                } else {
                                                    i82 = i14;
                                                    str2 = str5;
                                                    it2 = it4;
                                                    aVar = new jn.a(str14, "");
                                                }
                                                arrayList3.add(aVar);
                                                size = i15;
                                                i13 = i82;
                                                str5 = str2;
                                                it4 = it2;
                                            }
                                            str = str5;
                                            it = it4;
                                            hVar = new h(str7, zonedDateTime, str8, str9, str11, str13, arrayList3, eVar6.d);
                                        } else {
                                            str = str5;
                                            it = it4;
                                            hVar = null;
                                        }
                                        if (hVar != null) {
                                            arrayList.add(hVar);
                                        }
                                        str5 = str;
                                        it4 = it;
                                        str6 = null;
                                        i13 = 0;
                                    }
                                    rVar = new ArrayList();
                                    int size2 = arrayList.size();
                                    int i16 = 0;
                                    while (i16 < size2) {
                                        Object obj3 = arrayList.get(i16);
                                        i16++;
                                        h hVar5 = (h) obj3;
                                        if (!t71.p.T(hVar5.f) && !t71.p.T(hVar5.e)) {
                                            rVar.add(obj3);
                                        }
                                    }
                                } else {
                                    rVar = null;
                                }
                                if (rVar != null) {
                                    rVar5 = rVar;
                                }
                                g gVar4 = bVar8.b;
                                return new jn.i(rVar5.size(), rVar5, new i(gVar4.a, gVar4.b, gVar4.c));
                            case 3:
                                p8.k kVar6 = (p8.k) obj;
                                k71.k.g(kVar6, "it");
                                return kVar6;
                            case 4:
                                pb0.g gVar5 = (pb0.g) obj;
                                k71.k.g(gVar5, "repositoryOwnerRepositoriesParameters");
                                nq f0 = m71.a.f0(gVar5.a);
                                if (f0 != null) {
                                    bVar7 = new u0(f0);
                                }
                                return new i10(null, bVar7, 10);
                            case 5:
                                d10 d10Var = (d10) obj;
                                k71.k.g(d10Var, "data");
                                return Boolean.valueOf(d10Var.a.a.b != null ? !r0.isEmpty() : false);
                            case 6:
                                d10 d10Var2 = (d10) obj;
                                k71.k.g(d10Var2, "data");
                                f10 f10Var = d10Var2.a.a.a;
                                return new i(f10Var.b, f10Var.a, !f10Var.c);
                            case 7:
                                d10 d10Var3 = (d10) obj;
                                k71.k.g(d10Var3, "data");
                                List list7 = d10Var3.a.a.b;
                                return list7 == null ? rVar5 : list7;
                            case 8:
                                d10 d10Var4 = (d10) obj;
                                k71.k.g(d10Var4, "data");
                                g10 g10Var = d10Var4.a.a;
                                rShadow rVar7 = g10Var.b;
                                if (rVar7 != null) {
                                    rVar5 = rVar7;
                                }
                                ArrayList S = m.S(rVar5);
                                ArrayList arrayList4 = new ArrayList(n.F(S, 10));
                                int size3 = S.size();
                                int i17 = 0;
                                while (i17 < size3) {
                                    Object obj4 = S.get(i17);
                                    i17++;
                                    e10 e10Var = (e10) obj4;
                                    q3 q3Var = e10Var.f;
                                    p3 p3Var = q3Var.d;
                                    arrayList4.add(new pb0.h(new t7(q3Var.a, q3Var.b, p3Var.c, t.q.q(p3Var.d), new bb0.j(e10Var.g), q3Var.c), e10Var.d, e10Var.b, e10Var.c));
                                }
                                f10 f10Var2 = g10Var.a;
                                return new pb0.f(arrayList4, new i(f10Var2.b, f10Var2.a, !f10Var2.c));
                            case 9:
                                w1.r rVar8 = (w1.r) obj;
                                k71.k.g(rVar8, "$this$applyIf");
                                return androidx.compose.foundation.layout.b.B(rVar8, ih.a.l, 0.0f, 0.0f, 0.0f, 14);
                            case 10:
                                c0 c0Var = (c0) obj;
                                k71.k.g(c0Var, "$this$semantics");
                                z.l(c0Var, 0);
                                return a0Var;
                            case 11:
                                pc0.a aVar7 = (pc0.a) obj;
                                k71.k.g(aVar7, "userAchievementsParameters");
                                return new lc0.l(aVar7.a, new u0(30), bVar7);
                            case 12:
                                lc0.d dVar6 = (lc0.d) obj;
                                k71.k.g(dVar6, "data");
                                lc0.k kVar7 = dVar6.a;
                                return Boolean.valueOf((kVar7 == null || (fVar3 = kVar7.c) == null || (bVar4 = fVar3.a) == null || (list = bVar4.c) == null) ? false : !list.isEmpty());
                            case 13:
                                lc0.d dVar7 = (lc0.d) obj;
                                k71.k.g(dVar7, "data");
                                lc0.k kVar8 = dVar7.a;
                                if (kVar8 == null || (fVar4 = kVar8.c) == null || (bVar5 = fVar4.a) == null || (gVar2 = bVar5.b) == null) {
                                    return null;
                                }
                                return new i(gVar2.a, gVar2.b, !gVar2.c);
                            case 14:
                                lc0.d dVar8 = (lc0.d) obj;
                                k71.k.g(dVar8, "data");
                                lc0.k kVar9 = dVar8.a;
                                List list8 = (kVar9 == null || (fVar5 = kVar9.c) == null || (bVar6 = fVar5.a) == null) ? null : bVar6.c;
                                return list8 == null ? rVar5 : list8;
                            case 15:
                                lc0.d dVar9 = (lc0.d) obj;
                                k71.k.g(dVar9, "data");
                                lc0.k kVar10 = dVar9.a;
                                if (kVar10 == null) {
                                    return null;
                                }
                                lc0.b bVar9 = kVar10.c.a;
                                List list9 = bVar9.c;
                                if (list9 != null) {
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it5 = list9.iterator();
                                    while (it5.hasNext()) {
                                        lc0.e eVar8 = (lc0.e) it5.next();
                                        if (eVar8 != null) {
                                            String str20 = eVar8.b;
                                            ZonedDateTime zonedDateTime2 = eVar8.c;
                                            lc0.a aVar8 = eVar8.e;
                                            String str21 = aVar8.a;
                                            String str22 = aVar8.b;
                                            lc0.i iVar3 = eVar8.f;
                                            String str23 = iVar3 != null ? iVar3.b : null;
                                            String str24 = str23 == null ? "" : str23;
                                            String str25 = iVar3 != null ? iVar3.c : null;
                                            String str26 = str25 == null ? "" : str25;
                                            ArrayList arrayList6 = eVar8.g;
                                            ArrayList arrayList7 = new ArrayList(n.F(arrayList6, i12));
                                            int size4 = arrayList6.size();
                                            int i18 = 0;
                                            while (i18 < size4) {
                                                Object obj5 = arrayList6.get(i18);
                                                int i19 = i18 + 1;
                                                lc0.h hVar6 = (lc0.h) obj5;
                                                k71.k.g(hVar6, "<this>");
                                                Iterator it6 = it5;
                                                String str27 = hVar6.b;
                                                lc0.j jVar4 = hVar6.a;
                                                if (jVar4 != null) {
                                                    nc0.g0 g0Var2 = jVar4.b;
                                                    i9 = i19;
                                                    nc0.d dVar10 = g0Var2.b;
                                                    if (dVar10 != null) {
                                                        List list10 = dVar10.a.a;
                                                        String str28 = (list10 == null || (cVar7 = (nc0.c) m.W(list10)) == null) ? null : cVar7.b;
                                                        if (str28 == null) {
                                                            str28 = "";
                                                        }
                                                        String str29 = (list10 == null || (cVar6 = (nc0.c) m.W(list10)) == null) ? null : cVar6.a;
                                                        if (str29 == null) {
                                                            str29 = "";
                                                        }
                                                        str3 = str22;
                                                        aVar2 = new jn.d(str27, str29, str28);
                                                    } else {
                                                        str3 = str22;
                                                        nc0.e eVar9 = g0Var2.c;
                                                        if (eVar9 != null) {
                                                            aVar2 = new jn.d(str27, eVar9.a, eVar9.b.a);
                                                        } else {
                                                            nc0.f fVar7 = g0Var2.d;
                                                            if (fVar7 != null) {
                                                                str4 = str21;
                                                                cVar5 = new jn.b(fVar7.b, str27, fVar7.a, fVar7.c.a);
                                                            } else {
                                                                str4 = str21;
                                                                nc0.g gVar6 = g0Var2.e;
                                                                if (gVar6 != null) {
                                                                    nc0.a aVar9 = gVar6.b;
                                                                    String str30 = aVar9 != null ? aVar9.b.a : null;
                                                                    if (str30 == null) {
                                                                        str30 = "";
                                                                    }
                                                                    cVar5 = new jn.b(aVar9 != null ? aVar9.a : 0, str27, gVar6.a, str30);
                                                                } else {
                                                                    nc0.h hVar7 = g0Var2.f;
                                                                    if (hVar7 != null) {
                                                                        cVar5 = new jn.c(hVar7.c, str27, hVar7.a, hVar7.b.a);
                                                                    } else {
                                                                        nc0.i iVar4 = g0Var2.g;
                                                                        if (iVar4 != null) {
                                                                            cVar5 = new jn.c(iVar4.c.a, str27, iVar4.a, iVar4.b.a);
                                                                        } else {
                                                                            nc0.j jVar5 = g0Var2.h;
                                                                            if (jVar5 != null) {
                                                                                cVar5 = new jn.c(jVar5.b, str27, jVar5.c, jVar5.a.a);
                                                                            } else {
                                                                                nc0.k kVar11 = g0Var2.i;
                                                                                if (kVar11 != null) {
                                                                                    nc0.t tVar2 = kVar11.b;
                                                                                    cVar5 = new jn.c(tVar2.b, str27, kVar11.a, tVar2.a.a);
                                                                                } else {
                                                                                    nc0.l lVar2 = g0Var2.j;
                                                                                    if (lVar2 != null) {
                                                                                        nc0.s sVar6 = lVar2.b;
                                                                                        cVar5 = new jn.c(sVar6.b, str27, lVar2.a, sVar6.a.a);
                                                                                    } else {
                                                                                        nc0.m mVar2 = g0Var2.k;
                                                                                        if (mVar2 != null) {
                                                                                            aVar2 = new jn.d(str27, mVar2.c, mVar2.a.a);
                                                                                        } else {
                                                                                            nc0.n nVar2 = g0Var2.l;
                                                                                            if (nVar2 != null) {
                                                                                                aVar2 = new jn.d(str27, nVar2.a, nVar2.b);
                                                                                            } else {
                                                                                                nc0.o oVar22 = g0Var2.m;
                                                                                                if (oVar22 != null) {
                                                                                                    aVar2 = new jn.a(str27, oVar22.a);
                                                                                                } else {
                                                                                                    nc0.p pVar2 = g0Var2.n;
                                                                                                    if (pVar2 != null) {
                                                                                                        aVar2 = new jn.d(str27, pVar2.a, pVar2.b.a);
                                                                                                    } else {
                                                                                                        nc0.q qVar2 = g0Var2.o;
                                                                                                        if (qVar2 != null) {
                                                                                                            aVar2 = new jn.f(str27, qVar2.a, qVar2.b.a);
                                                                                                        } else {
                                                                                                            nc0.rShadow rVar9 = g0Var2.p;
                                                                                                            aVar2 = rVar9 != null ? new jn.a(str27, rVar9.a) : new jn.a(str27, "");
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            aVar2 = cVar5;
                                                        }
                                                    }
                                                    str4 = str21;
                                                } else {
                                                    i9 = i19;
                                                    str3 = str22;
                                                    str4 = str21;
                                                    aVar2 = new jn.a(str27, "");
                                                }
                                                arrayList7.add(aVar2);
                                                it5 = it6;
                                                i18 = i9;
                                                str22 = str3;
                                                str21 = str4;
                                            }
                                            it3 = it5;
                                            hVar2 = new h(str20, zonedDateTime2, str21, str22, str24, str26, arrayList7, eVar8.d);
                                        } else {
                                            it3 = it5;
                                            hVar2 = null;
                                        }
                                        if (hVar2 != null) {
                                            arrayList5.add(hVar2);
                                        }
                                        it5 = it3;
                                        i12 = 10;
                                    }
                                    rVar2 = new ArrayList();
                                    int size5 = arrayList5.size();
                                    int i21 = 0;
                                    while (i21 < size5) {
                                        Object obj6 = arrayList5.get(i21);
                                        i21++;
                                        h hVar8 = (h) obj6;
                                        if (!t71.p.T(hVar8.f) && !t71.p.T(hVar8.e)) {
                                            rVar2.add(obj6);
                                        }
                                    }
                                } else {
                                    rVar2 = null;
                                }
                                if (rVar2 != null) {
                                    rVar5 = rVar2;
                                }
                                lc0.g gVar7 = bVar9.b;
                                return new jn.i(rVar5.size(), rVar5, new i(gVar7.a, gVar7.b, gVar7.c));
                            case 16:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 17:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 18:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 19:
                                py0.p pVar3 = (py0.p) obj;
                                k71.k.g(pVar3, "repositoryIssueTypesParameters");
                                return new w(new u0(30), bVar7, pVar3.a, pVar3.b);
                            case 20:
                                py0.r rVar10 = (py0.r) obj;
                                k71.k.g(rVar10, "data");
                                v vVar2 = rVar10.a;
                                return Boolean.valueOf((vVar2 == null || (sVar = vVar2.a) == null || (list2 = sVar.b) == null) ? false : !list2.isEmpty());
                            case 21:
                                py0.r rVar11 = (py0.r) obj;
                                k71.k.g(rVar11, "data");
                                v vVar3 = rVar11.a;
                                if (vVar3 == null || (sVar2 = vVar3.a) == null || (uVar = sVar2.a) == null) {
                                    return null;
                                }
                                return new i(uVar.a, uVar.b, !uVar.c);
                            case 22:
                                py0.r rVar12 = (py0.r) obj;
                                k71.k.g(rVar12, "data");
                                v vVar4 = rVar12.a;
                                List list11 = (vVar4 == null || (sVar3 = vVar4.a) == null) ? null : sVar3.b;
                                return list11 == null ? rVar5 : list11;
                            case 23:
                                py0.r rVar13 = (py0.r) obj;
                                k71.k.g(rVar13, "data");
                                v vVar5 = rVar13.a;
                                if (vVar5 == null || (sVar4 = vVar5.a) == null) {
                                    return null;
                                }
                                u uVar3 = sVar4.a;
                                i iVar5 = new i(uVar3.a, uVar3.b, !uVar3.c);
                                List<py0.t> list12 = sVar4.b;
                                if (list12 != null) {
                                    rShadow arrayList8 = new ArrayList();
                                    for (py0.t tVar3 : list12) {
                                        IssueType k = (tVar3 == null || (aVar3 = tVar3.c) == null) ? null : aa1.b.k(aVar3);
                                        if (k != null) {
                                            arrayList8.add(k);
                                        }
                                    }
                                    rVar3 = arrayList8;
                                } else {
                                    rVar3 = null;
                                }
                                if (rVar3 != null) {
                                    rVar5 = rVar3;
                                }
                                return new u01.a(rVar5, iVar5);
                            case 24:
                                r71.e[] eVarArr = z.a;
                                ((c0) obj).a(x.e, a0Var);
                                return a0Var;
                            case 25:
                                q00.a aVar10 = (q00.a) obj;
                                k71.k.g(aVar10, "repositoryOwnerRepositoriesParameters");
                                String str31 = aVar10.a;
                                String str32 = aVar10.b;
                                return new bw.g(str31, bVar7, str32 == null ? bVar7 : new u0(str32));
                            case 26:
                                bw.b bVar10 = (bw.b) obj;
                                k71.k.g(bVar10, "data");
                                bw.f fVar8 = bVar10.a;
                                return Boolean.valueOf((fVar8 == null || (eVar2 = fVar8.b) == null || (list3 = eVar2.b) == null) ? false : !list3.isEmpty());
                            case 27:
                                bw.b bVar11 = (bw.b) obj;
                                k71.k.g(bVar11, "data");
                                bw.f fVar9 = bVar11.a;
                                if (fVar9 == null || (eVar3 = fVar9.b) == null || (dVar = eVar3.a) == null || (aVar4 = dVar.b) == null) {
                                    return null;
                                }
                                return new i(aVar4.a, aVar4.b, !aVar4.c);
                            case 28:
                                bw.b bVar12 = (bw.b) obj;
                                k71.k.g(bVar12, "data");
                                bw.f fVar10 = bVar12.a;
                                List list13 = (fVar10 == null || (eVar4 = fVar10.b) == null) ? null : eVar4.b;
                                return list13 == null ? rVar5 : list13;
                            default:
                                bw.b bVar13 = (bw.b) obj;
                                k71.k.g(bVar13, "data");
                                bw.f fVar11 = bVar13.a;
                                if (fVar11 == null || (eVar5 = fVar11.b) == null) {
                                    return null;
                                }
                                xx.a aVar11 = eVar5.a.b;
                                i iVar6 = new i(aVar11.a, aVar11.b, !aVar11.c);
                                List<bw.c> list14 = eVar5.b;
                                if (list14 != null) {
                                    rShadow arrayList9 = new ArrayList();
                                    for (bw.c cVar8 : list14) {
                                        SimpleRepository I = (cVar8 == null || (t5Var = cVar8.c) == null) ? null : sy.n.I(t5Var);
                                        if (I != null) {
                                            arrayList9.add(I);
                                        }
                                    }
                                    rVar4 = arrayList9;
                                } else {
                                    rVar4 = null;
                                }
                                if (rVar4 != null) {
                                    rVar5 = rVar4;
                                }
                                return new k4(rVar5, iVar6);
                        }
                    }
                }, null, null, 126976);
                this.w = new sw0.c(jVar, bVar, vVar, new ua(4), new sw0.b(9), oVar2, new sw0.b(10), new ua(5), new ua(6), new ua(7), new ua(8), (j71.e) null, (LinkedHashSet) null, 126976);
                ua uaVar = new ua(9);
                sw0.b bVar2 = new sw0.b(11);
                sw0.b bVar3 = new sw0.b(12);
                ua uaVar2 = new ua(10);
                ua uaVar3 = new ua(11);
                ua uaVar4 = new ua(12);
                ua uaVar5 = new ua(13);
                ga.h hVar = ga.h.r;
                this.x = new sw0.c(jVar, bVar, vVar, uaVar, bVar2, oVar2, bVar3, uaVar2, uaVar3, uaVar4, uaVar5, (j71.e) null, (LinkedHashSet) null, 63488);
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                lm0.g gVar = new lm0.g(19);
                lb0.a aVar = new lb0.a(i7);
                s01.oShadow oVar3 = s01.oShadow.r;
                this.v = new jy.d(jVar, bVar, vVar, gVar, aVar, oVar3, new lb0.a(i6), new lm0.g(20), new lm0.g(21), new lm0.g(22), new lm0.g(23), null, null, 126976);
                final int i9 = 25;
                j71.c cVar2 = new j71.c() { // from class: oo.a
                    public final Object k(Object obj) {
                        f fVar;
                        ko.b bVar22;
                        g gVar2;
                        f fVar2;
                        ko.b bVar32;
                        rShadow rVar;
                        String str;
                        Iterator it;
                        h hVar2;
                        int i82;
                        String str2;
                        Iterator it2;
                        Object aVar2;
                        k kVar;
                        Object eVar;
                        Object cVar22;
                        c cVar3;
                        c cVar4;
                        lc0.f fVar3;
                        lc0.b bVar4;
                        List list;
                        lc0.f fVar4;
                        lc0.b bVar5;
                        lc0.g gVar22;
                        lc0.f fVar5;
                        lc0.b bVar6;
                        rShadow rVar2;
                        Iterator it3;
                        h hVar22;
                        int i92;
                        String str3;
                        String str4;
                        Object aVar22;
                        Object cVar5;
                        nc0.c cVar6;
                        nc0.c cVar7;
                        s sVar;
                        List list2;
                        s sVar2;
                        u uVar;
                        s sVar3;
                        s sVar4;
                        rShadow rVar3;
                        yr0.a aVar3;
                        e eVar2;
                        List list3;
                        e eVar3;
                        d dVar;
                        xx.a aVar4;
                        e eVar4;
                        e eVar5;
                        rShadow rVar4;
                        t5 t5Var;
                        int i11 = i9;
                        String str5 = "<this>";
                        int i12 = 10;
                        aa1.b bVar7 = t0.d;
                        a0Shadow a0Var = a0.a;
                        rShadow rVar5 = r.r;
                        switch (i11) {
                            case 0:
                                ko.d dVar2 = (ko.d) obj;
                                k71.k.g(dVar2, "data");
                                ko.k kVar2 = dVar2.a;
                                if (kVar2 == null || (fVar = kVar2.c) == null || (bVar22 = fVar.a) == null || (gVar2 = bVar22.b) == null) {
                                    return null;
                                }
                                return new i(gVar2.a, gVar2.b, !gVar2.c);
                            case 1:
                                ko.d dVar3 = (ko.d) obj;
                                k71.k.g(dVar3, "data");
                                ko.k kVar3 = dVar3.a;
                                List list4 = (kVar3 == null || (fVar2 = kVar3.c) == null || (bVar32 = fVar2.a) == null) ? null : bVar32.c;
                                return list4 == null ? rVar5 : list4;
                            case 2:
                                String str6 = null;
                                int i13 = 0;
                                ko.d dVar4 = (ko.d) obj;
                                k71.k.g(dVar4, "data");
                                ko.k kVar4 = dVar4.a;
                                if (kVar4 == null) {
                                    return null;
                                }
                                ko.b bVar8 = kVar4.c.a;
                                List list5 = bVar8.c;
                                if (list5 != null) {
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it4 = list5.iterator();
                                    while (it4.hasNext()) {
                                        ko.e eVar6 = (ko.e) it4.next();
                                        if (eVar6 != null) {
                                            String str7 = eVar6.b;
                                            ZonedDateTime zonedDateTime = eVar6.c;
                                            ko.a aVar5 = eVar6.e;
                                            String str8 = aVar5.a;
                                            String str9 = aVar5.b;
                                            ko.i iVar = eVar6.f;
                                            String str10 = iVar != null ? iVar.b : str6;
                                            String str11 = str10 == null ? "" : str10;
                                            String str12 = iVar != null ? iVar.c : str6;
                                            String str13 = str12 == null ? "" : str12;
                                            ArrayList arrayList2 = eVar6.g;
                                            ArrayList arrayList3 = new ArrayList(n.F(arrayList2, 10));
                                            int size = arrayList2.size();
                                            while (i13 < size) {
                                                Object obj2 = arrayList2.get(i13);
                                                int i14 = i13 + 1;
                                                ko.h hVar3 = (ko.h) obj2;
                                                k71.k.g(hVar3, str5);
                                                int i15 = size;
                                                String str14 = hVar3.b;
                                                j jVar2 = hVar3.a;
                                                if (jVar2 != null) {
                                                    h0 h0Var = jVar2.b;
                                                    i82 = i14;
                                                    mo.d dVar5 = h0Var.b;
                                                    if (dVar5 != null) {
                                                        List list6 = dVar5.a.a;
                                                        String str15 = (list6 == null || (cVar4 = (c) m.W(list6)) == null) ? null : cVar4.b;
                                                        if (str15 == null) {
                                                            str15 = "";
                                                        }
                                                        String str16 = (list6 == null || (cVar3 = (c) m.W(list6)) == null) ? null : cVar3.a;
                                                        if (str16 == null) {
                                                            str16 = "";
                                                        }
                                                        str2 = str5;
                                                        aVar2 = new jn.d(str14, str16, str15);
                                                        it2 = it4;
                                                    } else {
                                                        str2 = str5;
                                                        mo.e eVar7 = h0Var.c;
                                                        if (eVar7 != null) {
                                                            cVar22 = new jn.d(str14, eVar7.a, eVar7.b.a);
                                                            it2 = it4;
                                                        } else {
                                                            mo.f fVar6 = h0Var.d;
                                                            if (fVar6 != null) {
                                                                it2 = it4;
                                                                eVar = new jn.b(fVar6.b, str14, fVar6.a, fVar6.c.a);
                                                            } else {
                                                                it2 = it4;
                                                                mo.g gVar3 = h0Var.e;
                                                                if (gVar3 != null) {
                                                                    mo.a aVar6 = gVar3.b;
                                                                    String str17 = aVar6 != null ? aVar6.b.a : null;
                                                                    if (str17 == null) {
                                                                        str17 = "";
                                                                    }
                                                                    cVar22 = new jn.b(aVar6 != null ? aVar6.a : 0, str14, gVar3.a, str17);
                                                                } else {
                                                                    mo.h hVar4 = h0Var.f;
                                                                    if (hVar4 != null) {
                                                                        cVar22 = new jn.c(hVar4.c, str14, hVar4.a, hVar4.b.a);
                                                                    } else {
                                                                        mo.i iVar2 = h0Var.g;
                                                                        if (iVar2 != null) {
                                                                            cVar22 = new jn.c(iVar2.c.a, str14, iVar2.a, iVar2.b.a);
                                                                        } else {
                                                                            mo.k kVar5 = h0Var.h;
                                                                            if (kVar5 != null) {
                                                                                cVar22 = new jn.c(kVar5.b, str14, kVar5.c, kVar5.a.a);
                                                                            } else {
                                                                                l lVar = h0Var.i;
                                                                                if (lVar != null) {
                                                                                    mo.u uVar2 = lVar.b;
                                                                                    cVar22 = new jn.c(uVar2.b, str14, lVar.a, uVar2.a.a);
                                                                                } else {
                                                                                    mo.m mVar = h0Var.j;
                                                                                    if (mVar != null) {
                                                                                        t tVar = mVar.b;
                                                                                        cVar22 = new jn.c(tVar.b, str14, mVar.a, tVar.a.a);
                                                                                    } else {
                                                                                        mo.n nVar = h0Var.k;
                                                                                        if (nVar != null) {
                                                                                            eVar = new jn.d(str14, nVar.c, nVar.a.a);
                                                                                        } else {
                                                                                            o oVar32 = h0Var.l;
                                                                                            if (oVar32 != null) {
                                                                                                eVar = new jn.d(str14, oVar32.a, oVar32.b);
                                                                                            } else {
                                                                                                p pVar = h0Var.m;
                                                                                                if (pVar != null) {
                                                                                                    aVar2 = new jn.a(str14, pVar.a);
                                                                                                } else {
                                                                                                    q qVar = h0Var.n;
                                                                                                    if (qVar != null) {
                                                                                                        eVar = new jn.d(str14, qVar.a, qVar.b.a);
                                                                                                    } else {
                                                                                                        mo.rShadow rVar6 = h0Var.o;
                                                                                                        if (rVar6 != null) {
                                                                                                            g0 g0Var = rVar6.a;
                                                                                                            mo.s sVar5 = g0Var.b;
                                                                                                            if (sVar5 != null) {
                                                                                                                kVar = new k(sVar5.a, sVar5.b);
                                                                                                            } else {
                                                                                                                mo.j jVar3 = g0Var.c;
                                                                                                                String str18 = jVar3 != null ? jVar3.a : null;
                                                                                                                if (str18 == null) {
                                                                                                                    str18 = "";
                                                                                                                }
                                                                                                                String str19 = jVar3 != null ? jVar3.b : null;
                                                                                                                if (str19 == null) {
                                                                                                                    str19 = "";
                                                                                                                }
                                                                                                                kVar = new k(str18, str19);
                                                                                                            }
                                                                                                            eVar = new jn.e(str14, (String) kVar.s, (String) kVar.r);
                                                                                                        } else {
                                                                                                            aVar2 = new jn.a(str14, "");
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            aVar2 = eVar;
                                                        }
                                                        aVar2 = cVar22;
                                                    }
                                                } else {
                                                    i82 = i14;
                                                    str2 = str5;
                                                    it2 = it4;
                                                    aVar2 = new jn.a(str14, "");
                                                }
                                                arrayList3.add(aVar2);
                                                size = i15;
                                                i13 = i82;
                                                str5 = str2;
                                                it4 = it2;
                                            }
                                            str = str5;
                                            it = it4;
                                            hVar2 = new h(str7, zonedDateTime, str8, str9, str11, str13, arrayList3, eVar6.d);
                                        } else {
                                            str = str5;
                                            it = it4;
                                            hVar2 = null;
                                        }
                                        if (hVar2 != null) {
                                            arrayList.add(hVar2);
                                        }
                                        str5 = str;
                                        it4 = it;
                                        str6 = null;
                                        i13 = 0;
                                    }
                                    rVar = new ArrayList();
                                    int size2 = arrayList.size();
                                    int i16 = 0;
                                    while (i16 < size2) {
                                        Object obj3 = arrayList.get(i16);
                                        i16++;
                                        h hVar5 = (h) obj3;
                                        if (!t71.p.T(hVar5.f) && !t71.p.T(hVar5.e)) {
                                            rVar.add(obj3);
                                        }
                                    }
                                } else {
                                    rVar = null;
                                }
                                if (rVar != null) {
                                    rVar5 = rVar;
                                }
                                g gVar4 = bVar8.b;
                                return new jn.i(rVar5.size(), rVar5, new i(gVar4.a, gVar4.b, gVar4.c));
                            case 3:
                                p8.k kVar6 = (p8.k) obj;
                                k71.k.g(kVar6, "it");
                                return kVar6;
                            case 4:
                                pb0.g gVar5 = (pb0.g) obj;
                                k71.k.g(gVar5, "repositoryOwnerRepositoriesParameters");
                                nq f0 = m71.a.f0(gVar5.a);
                                if (f0 != null) {
                                    bVar7 = new u0(f0);
                                }
                                return new i10(null, bVar7, 10);
                            case 5:
                                d10 d10Var = (d10) obj;
                                k71.k.g(d10Var, "data");
                                return Boolean.valueOf(d10Var.a.a.b != null ? !r0.isEmpty() : false);
                            case 6:
                                d10 d10Var2 = (d10) obj;
                                k71.k.g(d10Var2, "data");
                                f10 f10Var = d10Var2.a.a.a;
                                return new i(f10Var.b, f10Var.a, !f10Var.c);
                            case 7:
                                d10 d10Var3 = (d10) obj;
                                k71.k.g(d10Var3, "data");
                                List list7 = d10Var3.a.a.b;
                                return list7 == null ? rVar5 : list7;
                            case 8:
                                d10 d10Var4 = (d10) obj;
                                k71.k.g(d10Var4, "data");
                                g10 g10Var = d10Var4.a.a;
                                rShadow rVar7 = g10Var.b;
                                if (rVar7 != null) {
                                    rVar5 = rVar7;
                                }
                                ArrayList S = m.S(rVar5);
                                ArrayList arrayList4 = new ArrayList(n.F(S, 10));
                                int size3 = S.size();
                                int i17 = 0;
                                while (i17 < size3) {
                                    Object obj4 = S.get(i17);
                                    i17++;
                                    e10 e10Var = (e10) obj4;
                                    q3 q3Var = e10Var.f;
                                    p3 p3Var = q3Var.d;
                                    arrayList4.add(new pb0.h(new t7(q3Var.a, q3Var.b, p3Var.c, t.q.q(p3Var.d), new bb0.j(e10Var.g), q3Var.c), e10Var.d, e10Var.b, e10Var.c));
                                }
                                f10 f10Var2 = g10Var.a;
                                return new pb0.f(arrayList4, new i(f10Var2.b, f10Var2.a, !f10Var2.c));
                            case 9:
                                w1.r rVar8 = (w1.r) obj;
                                k71.k.g(rVar8, "$this$applyIf");
                                return androidx.compose.foundation.layout.b.B(rVar8, ih.a.l, 0.0f, 0.0f, 0.0f, 14);
                            case 10:
                                c0 c0Var = (c0) obj;
                                k71.k.g(c0Var, "$this$semantics");
                                z.l(c0Var, 0);
                                return a0Var;
                            case 11:
                                pc0.a aVar7 = (pc0.a) obj;
                                k71.k.g(aVar7, "userAchievementsParameters");
                                return new lc0.l(aVar7.a, new u0(30), bVar7);
                            case 12:
                                lc0.d dVar6 = (lc0.d) obj;
                                k71.k.g(dVar6, "data");
                                lc0.k kVar7 = dVar6.a;
                                return Boolean.valueOf((kVar7 == null || (fVar3 = kVar7.c) == null || (bVar4 = fVar3.a) == null || (list = bVar4.c) == null) ? false : !list.isEmpty());
                            case 13:
                                lc0.d dVar7 = (lc0.d) obj;
                                k71.k.g(dVar7, "data");
                                lc0.k kVar8 = dVar7.a;
                                if (kVar8 == null || (fVar4 = kVar8.c) == null || (bVar5 = fVar4.a) == null || (gVar22 = bVar5.b) == null) {
                                    return null;
                                }
                                return new i(gVar22.a, gVar22.b, !gVar22.c);
                            case 14:
                                lc0.d dVar8 = (lc0.d) obj;
                                k71.k.g(dVar8, "data");
                                lc0.k kVar9 = dVar8.a;
                                List list8 = (kVar9 == null || (fVar5 = kVar9.c) == null || (bVar6 = fVar5.a) == null) ? null : bVar6.c;
                                return list8 == null ? rVar5 : list8;
                            case 15:
                                lc0.d dVar9 = (lc0.d) obj;
                                k71.k.g(dVar9, "data");
                                lc0.k kVar10 = dVar9.a;
                                if (kVar10 == null) {
                                    return null;
                                }
                                lc0.b bVar9 = kVar10.c.a;
                                List list9 = bVar9.c;
                                if (list9 != null) {
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it5 = list9.iterator();
                                    while (it5.hasNext()) {
                                        lc0.e eVar8 = (lc0.e) it5.next();
                                        if (eVar8 != null) {
                                            String str20 = eVar8.b;
                                            ZonedDateTime zonedDateTime2 = eVar8.c;
                                            lc0.a aVar8 = eVar8.e;
                                            String str21 = aVar8.a;
                                            String str22 = aVar8.b;
                                            lc0.i iVar3 = eVar8.f;
                                            String str23 = iVar3 != null ? iVar3.b : null;
                                            String str24 = str23 == null ? "" : str23;
                                            String str25 = iVar3 != null ? iVar3.c : null;
                                            String str26 = str25 == null ? "" : str25;
                                            ArrayList arrayList6 = eVar8.g;
                                            ArrayList arrayList7 = new ArrayList(n.F(arrayList6, i12));
                                            int size4 = arrayList6.size();
                                            int i18 = 0;
                                            while (i18 < size4) {
                                                Object obj5 = arrayList6.get(i18);
                                                int i19 = i18 + 1;
                                                lc0.h hVar6 = (lc0.h) obj5;
                                                k71.k.g(hVar6, "<this>");
                                                Iterator it6 = it5;
                                                String str27 = hVar6.b;
                                                lc0.j jVar4 = hVar6.a;
                                                if (jVar4 != null) {
                                                    nc0.g0 g0Var2 = jVar4.b;
                                                    i92 = i19;
                                                    nc0.d dVar10 = g0Var2.b;
                                                    if (dVar10 != null) {
                                                        List list10 = dVar10.a.a;
                                                        String str28 = (list10 == null || (cVar7 = (nc0.c) m.W(list10)) == null) ? null : cVar7.b;
                                                        if (str28 == null) {
                                                            str28 = "";
                                                        }
                                                        String str29 = (list10 == null || (cVar6 = (nc0.c) m.W(list10)) == null) ? null : cVar6.a;
                                                        if (str29 == null) {
                                                            str29 = "";
                                                        }
                                                        str3 = str22;
                                                        aVar22 = new jn.d(str27, str29, str28);
                                                    } else {
                                                        str3 = str22;
                                                        nc0.e eVar9 = g0Var2.c;
                                                        if (eVar9 != null) {
                                                            aVar22 = new jn.d(str27, eVar9.a, eVar9.b.a);
                                                        } else {
                                                            nc0.f fVar7 = g0Var2.d;
                                                            if (fVar7 != null) {
                                                                str4 = str21;
                                                                cVar5 = new jn.b(fVar7.b, str27, fVar7.a, fVar7.c.a);
                                                            } else {
                                                                str4 = str21;
                                                                nc0.g gVar6 = g0Var2.e;
                                                                if (gVar6 != null) {
                                                                    nc0.a aVar9 = gVar6.b;
                                                                    String str30 = aVar9 != null ? aVar9.b.a : null;
                                                                    if (str30 == null) {
                                                                        str30 = "";
                                                                    }
                                                                    cVar5 = new jn.b(aVar9 != null ? aVar9.a : 0, str27, gVar6.a, str30);
                                                                } else {
                                                                    nc0.h hVar7 = g0Var2.f;
                                                                    if (hVar7 != null) {
                                                                        cVar5 = new jn.c(hVar7.c, str27, hVar7.a, hVar7.b.a);
                                                                    } else {
                                                                        nc0.i iVar4 = g0Var2.g;
                                                                        if (iVar4 != null) {
                                                                            cVar5 = new jn.c(iVar4.c.a, str27, iVar4.a, iVar4.b.a);
                                                                        } else {
                                                                            nc0.j jVar5 = g0Var2.h;
                                                                            if (jVar5 != null) {
                                                                                cVar5 = new jn.c(jVar5.b, str27, jVar5.c, jVar5.a.a);
                                                                            } else {
                                                                                nc0.k kVar11 = g0Var2.i;
                                                                                if (kVar11 != null) {
                                                                                    nc0.t tVar2 = kVar11.b;
                                                                                    cVar5 = new jn.c(tVar2.b, str27, kVar11.a, tVar2.a.a);
                                                                                } else {
                                                                                    nc0.l lVar2 = g0Var2.j;
                                                                                    if (lVar2 != null) {
                                                                                        nc0.s sVar6 = lVar2.b;
                                                                                        cVar5 = new jn.c(sVar6.b, str27, lVar2.a, sVar6.a.a);
                                                                                    } else {
                                                                                        nc0.m mVar2 = g0Var2.k;
                                                                                        if (mVar2 != null) {
                                                                                            aVar22 = new jn.d(str27, mVar2.c, mVar2.a.a);
                                                                                        } else {
                                                                                            nc0.n nVar2 = g0Var2.l;
                                                                                            if (nVar2 != null) {
                                                                                                aVar22 = new jn.d(str27, nVar2.a, nVar2.b);
                                                                                            } else {
                                                                                                nc0.o oVar22 = g0Var2.m;
                                                                                                if (oVar22 != null) {
                                                                                                    aVar22 = new jn.a(str27, oVar22.a);
                                                                                                } else {
                                                                                                    nc0.p pVar2 = g0Var2.n;
                                                                                                    if (pVar2 != null) {
                                                                                                        aVar22 = new jn.d(str27, pVar2.a, pVar2.b.a);
                                                                                                    } else {
                                                                                                        nc0.q qVar2 = g0Var2.o;
                                                                                                        if (qVar2 != null) {
                                                                                                            aVar22 = new jn.f(str27, qVar2.a, qVar2.b.a);
                                                                                                        } else {
                                                                                                            nc0.rShadow rVar9 = g0Var2.p;
                                                                                                            aVar22 = rVar9 != null ? new jn.a(str27, rVar9.a) : new jn.a(str27, "");
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            aVar22 = cVar5;
                                                        }
                                                    }
                                                    str4 = str21;
                                                } else {
                                                    i92 = i19;
                                                    str3 = str22;
                                                    str4 = str21;
                                                    aVar22 = new jn.a(str27, "");
                                                }
                                                arrayList7.add(aVar22);
                                                it5 = it6;
                                                i18 = i92;
                                                str22 = str3;
                                                str21 = str4;
                                            }
                                            it3 = it5;
                                            hVar22 = new h(str20, zonedDateTime2, str21, str22, str24, str26, arrayList7, eVar8.d);
                                        } else {
                                            it3 = it5;
                                            hVar22 = null;
                                        }
                                        if (hVar22 != null) {
                                            arrayList5.add(hVar22);
                                        }
                                        it5 = it3;
                                        i12 = 10;
                                    }
                                    rVar2 = new ArrayList();
                                    int size5 = arrayList5.size();
                                    int i21 = 0;
                                    while (i21 < size5) {
                                        Object obj6 = arrayList5.get(i21);
                                        i21++;
                                        h hVar8 = (h) obj6;
                                        if (!t71.p.T(hVar8.f) && !t71.p.T(hVar8.e)) {
                                            rVar2.add(obj6);
                                        }
                                    }
                                } else {
                                    rVar2 = null;
                                }
                                if (rVar2 != null) {
                                    rVar5 = rVar2;
                                }
                                lc0.g gVar7 = bVar9.b;
                                return new jn.i(rVar5.size(), rVar5, new i(gVar7.a, gVar7.b, gVar7.c));
                            case 16:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 17:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 18:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 19:
                                py0.p pVar3 = (py0.p) obj;
                                k71.k.g(pVar3, "repositoryIssueTypesParameters");
                                return new w(new u0(30), bVar7, pVar3.a, pVar3.b);
                            case 20:
                                py0.r rVar10 = (py0.r) obj;
                                k71.k.g(rVar10, "data");
                                v vVar2 = rVar10.a;
                                return Boolean.valueOf((vVar2 == null || (sVar = vVar2.a) == null || (list2 = sVar.b) == null) ? false : !list2.isEmpty());
                            case 21:
                                py0.r rVar11 = (py0.r) obj;
                                k71.k.g(rVar11, "data");
                                v vVar3 = rVar11.a;
                                if (vVar3 == null || (sVar2 = vVar3.a) == null || (uVar = sVar2.a) == null) {
                                    return null;
                                }
                                return new i(uVar.a, uVar.b, !uVar.c);
                            case 22:
                                py0.r rVar12 = (py0.r) obj;
                                k71.k.g(rVar12, "data");
                                v vVar4 = rVar12.a;
                                List list11 = (vVar4 == null || (sVar3 = vVar4.a) == null) ? null : sVar3.b;
                                return list11 == null ? rVar5 : list11;
                            case 23:
                                py0.r rVar13 = (py0.r) obj;
                                k71.k.g(rVar13, "data");
                                v vVar5 = rVar13.a;
                                if (vVar5 == null || (sVar4 = vVar5.a) == null) {
                                    return null;
                                }
                                u uVar3 = sVar4.a;
                                i iVar5 = new i(uVar3.a, uVar3.b, !uVar3.c);
                                List<py0.t> list12 = sVar4.b;
                                if (list12 != null) {
                                    rShadow arrayList8 = new ArrayList();
                                    for (py0.t tVar3 : list12) {
                                        IssueType k = (tVar3 == null || (aVar3 = tVar3.c) == null) ? null : aa1.b.k(aVar3);
                                        if (k != null) {
                                            arrayList8.add(k);
                                        }
                                    }
                                    rVar3 = arrayList8;
                                } else {
                                    rVar3 = null;
                                }
                                if (rVar3 != null) {
                                    rVar5 = rVar3;
                                }
                                return new u01.a(rVar5, iVar5);
                            case 24:
                                r71.e[] eVarArr = z.a;
                                ((c0) obj).a(x.e, a0Var);
                                return a0Var;
                            case 25:
                                q00.a aVar10 = (q00.a) obj;
                                k71.k.g(aVar10, "repositoryOwnerRepositoriesParameters");
                                String str31 = aVar10.a;
                                String str32 = aVar10.b;
                                return new bw.g(str31, bVar7, str32 == null ? bVar7 : new u0(str32));
                            case 26:
                                bw.b bVar10 = (bw.b) obj;
                                k71.k.g(bVar10, "data");
                                bw.f fVar8 = bVar10.a;
                                return Boolean.valueOf((fVar8 == null || (eVar2 = fVar8.b) == null || (list3 = eVar2.b) == null) ? false : !list3.isEmpty());
                            case 27:
                                bw.b bVar11 = (bw.b) obj;
                                k71.k.g(bVar11, "data");
                                bw.f fVar9 = bVar11.a;
                                if (fVar9 == null || (eVar3 = fVar9.b) == null || (dVar = eVar3.a) == null || (aVar4 = dVar.b) == null) {
                                    return null;
                                }
                                return new i(aVar4.a, aVar4.b, !aVar4.c);
                            case 28:
                                bw.b bVar12 = (bw.b) obj;
                                k71.k.g(bVar12, "data");
                                bw.f fVar10 = bVar12.a;
                                List list13 = (fVar10 == null || (eVar4 = fVar10.b) == null) ? null : eVar4.b;
                                return list13 == null ? rVar5 : list13;
                            default:
                                bw.b bVar13 = (bw.b) obj;
                                k71.k.g(bVar13, "data");
                                bw.f fVar11 = bVar13.a;
                                if (fVar11 == null || (eVar5 = fVar11.b) == null) {
                                    return null;
                                }
                                xx.a aVar11 = eVar5.a.b;
                                i iVar6 = new i(aVar11.a, aVar11.b, !aVar11.c);
                                List<bw.c> list14 = eVar5.b;
                                if (list14 != null) {
                                    rShadow arrayList9 = new ArrayList();
                                    for (bw.c cVar8 : list14) {
                                        SimpleRepository I = (cVar8 == null || (t5Var = cVar8.c) == null) ? null : sy.n.I(t5Var);
                                        if (I != null) {
                                            arrayList9.add(I);
                                        }
                                    }
                                    rVar4 = arrayList9;
                                } else {
                                    rVar4 = null;
                                }
                                if (rVar4 != null) {
                                    rVar5 = rVar4;
                                }
                                return new k4(rVar5, iVar6);
                        }
                    }
                };
                py0.o oVar4 = new py0.o(2);
                py0.o oVar5 = new py0.o(3);
                final int i11 = 26;
                j71.c cVar3 = new j71.c() { // from class: oo.a
                    public final Object k(Object obj) {
                        f fVar;
                        ko.b bVar22;
                        g gVar2;
                        f fVar2;
                        ko.b bVar32;
                        rShadow rVar;
                        String str;
                        Iterator it;
                        h hVar2;
                        int i82;
                        String str2;
                        Iterator it2;
                        Object aVar2;
                        k kVar;
                        Object eVar;
                        Object cVar22;
                        c cVar32;
                        c cVar4;
                        lc0.f fVar3;
                        lc0.b bVar4;
                        List list;
                        lc0.f fVar4;
                        lc0.b bVar5;
                        lc0.g gVar22;
                        lc0.f fVar5;
                        lc0.b bVar6;
                        rShadow rVar2;
                        Iterator it3;
                        h hVar22;
                        int i92;
                        String str3;
                        String str4;
                        Object aVar22;
                        Object cVar5;
                        nc0.c cVar6;
                        nc0.c cVar7;
                        s sVar;
                        List list2;
                        s sVar2;
                        u uVar;
                        s sVar3;
                        s sVar4;
                        rShadow rVar3;
                        yr0.a aVar3;
                        e eVar2;
                        List list3;
                        e eVar3;
                        d dVar;
                        xx.a aVar4;
                        e eVar4;
                        e eVar5;
                        rShadow rVar4;
                        t5 t5Var;
                        int i112 = i11;
                        String str5 = "<this>";
                        int i12 = 10;
                        aa1.b bVar7 = t0.d;
                        a0Shadow a0Var = a0.a;
                        rShadow rVar5 = r.r;
                        switch (i112) {
                            case 0:
                                ko.d dVar2 = (ko.d) obj;
                                k71.k.g(dVar2, "data");
                                ko.k kVar2 = dVar2.a;
                                if (kVar2 == null || (fVar = kVar2.c) == null || (bVar22 = fVar.a) == null || (gVar2 = bVar22.b) == null) {
                                    return null;
                                }
                                return new i(gVar2.a, gVar2.b, !gVar2.c);
                            case 1:
                                ko.d dVar3 = (ko.d) obj;
                                k71.k.g(dVar3, "data");
                                ko.k kVar3 = dVar3.a;
                                List list4 = (kVar3 == null || (fVar2 = kVar3.c) == null || (bVar32 = fVar2.a) == null) ? null : bVar32.c;
                                return list4 == null ? rVar5 : list4;
                            case 2:
                                String str6 = null;
                                int i13 = 0;
                                ko.d dVar4 = (ko.d) obj;
                                k71.k.g(dVar4, "data");
                                ko.k kVar4 = dVar4.a;
                                if (kVar4 == null) {
                                    return null;
                                }
                                ko.b bVar8 = kVar4.c.a;
                                List list5 = bVar8.c;
                                if (list5 != null) {
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it4 = list5.iterator();
                                    while (it4.hasNext()) {
                                        ko.e eVar6 = (ko.e) it4.next();
                                        if (eVar6 != null) {
                                            String str7 = eVar6.b;
                                            ZonedDateTime zonedDateTime = eVar6.c;
                                            ko.a aVar5 = eVar6.e;
                                            String str8 = aVar5.a;
                                            String str9 = aVar5.b;
                                            ko.i iVar = eVar6.f;
                                            String str10 = iVar != null ? iVar.b : str6;
                                            String str11 = str10 == null ? "" : str10;
                                            String str12 = iVar != null ? iVar.c : str6;
                                            String str13 = str12 == null ? "" : str12;
                                            ArrayList arrayList2 = eVar6.g;
                                            ArrayList arrayList3 = new ArrayList(n.F(arrayList2, 10));
                                            int size = arrayList2.size();
                                            while (i13 < size) {
                                                Object obj2 = arrayList2.get(i13);
                                                int i14 = i13 + 1;
                                                ko.h hVar3 = (ko.h) obj2;
                                                k71.k.g(hVar3, str5);
                                                int i15 = size;
                                                String str14 = hVar3.b;
                                                j jVar2 = hVar3.a;
                                                if (jVar2 != null) {
                                                    h0 h0Var = jVar2.b;
                                                    i82 = i14;
                                                    mo.d dVar5 = h0Var.b;
                                                    if (dVar5 != null) {
                                                        List list6 = dVar5.a.a;
                                                        String str15 = (list6 == null || (cVar4 = (c) m.W(list6)) == null) ? null : cVar4.b;
                                                        if (str15 == null) {
                                                            str15 = "";
                                                        }
                                                        String str16 = (list6 == null || (cVar32 = (c) m.W(list6)) == null) ? null : cVar32.a;
                                                        if (str16 == null) {
                                                            str16 = "";
                                                        }
                                                        str2 = str5;
                                                        aVar2 = new jn.d(str14, str16, str15);
                                                        it2 = it4;
                                                    } else {
                                                        str2 = str5;
                                                        mo.e eVar7 = h0Var.c;
                                                        if (eVar7 != null) {
                                                            cVar22 = new jn.d(str14, eVar7.a, eVar7.b.a);
                                                            it2 = it4;
                                                        } else {
                                                            mo.f fVar6 = h0Var.d;
                                                            if (fVar6 != null) {
                                                                it2 = it4;
                                                                eVar = new jn.b(fVar6.b, str14, fVar6.a, fVar6.c.a);
                                                            } else {
                                                                it2 = it4;
                                                                mo.g gVar3 = h0Var.e;
                                                                if (gVar3 != null) {
                                                                    mo.a aVar6 = gVar3.b;
                                                                    String str17 = aVar6 != null ? aVar6.b.a : null;
                                                                    if (str17 == null) {
                                                                        str17 = "";
                                                                    }
                                                                    cVar22 = new jn.b(aVar6 != null ? aVar6.a : 0, str14, gVar3.a, str17);
                                                                } else {
                                                                    mo.h hVar4 = h0Var.f;
                                                                    if (hVar4 != null) {
                                                                        cVar22 = new jn.c(hVar4.c, str14, hVar4.a, hVar4.b.a);
                                                                    } else {
                                                                        mo.i iVar2 = h0Var.g;
                                                                        if (iVar2 != null) {
                                                                            cVar22 = new jn.c(iVar2.c.a, str14, iVar2.a, iVar2.b.a);
                                                                        } else {
                                                                            mo.k kVar5 = h0Var.h;
                                                                            if (kVar5 != null) {
                                                                                cVar22 = new jn.c(kVar5.b, str14, kVar5.c, kVar5.a.a);
                                                                            } else {
                                                                                l lVar = h0Var.i;
                                                                                if (lVar != null) {
                                                                                    mo.u uVar2 = lVar.b;
                                                                                    cVar22 = new jn.c(uVar2.b, str14, lVar.a, uVar2.a.a);
                                                                                } else {
                                                                                    mo.m mVar = h0Var.j;
                                                                                    if (mVar != null) {
                                                                                        t tVar = mVar.b;
                                                                                        cVar22 = new jn.c(tVar.b, str14, mVar.a, tVar.a.a);
                                                                                    } else {
                                                                                        mo.n nVar = h0Var.k;
                                                                                        if (nVar != null) {
                                                                                            eVar = new jn.d(str14, nVar.c, nVar.a.a);
                                                                                        } else {
                                                                                            o oVar32 = h0Var.l;
                                                                                            if (oVar32 != null) {
                                                                                                eVar = new jn.d(str14, oVar32.a, oVar32.b);
                                                                                            } else {
                                                                                                p pVar = h0Var.m;
                                                                                                if (pVar != null) {
                                                                                                    aVar2 = new jn.a(str14, pVar.a);
                                                                                                } else {
                                                                                                    q qVar = h0Var.n;
                                                                                                    if (qVar != null) {
                                                                                                        eVar = new jn.d(str14, qVar.a, qVar.b.a);
                                                                                                    } else {
                                                                                                        mo.rShadow rVar6 = h0Var.o;
                                                                                                        if (rVar6 != null) {
                                                                                                            g0 g0Var = rVar6.a;
                                                                                                            mo.s sVar5 = g0Var.b;
                                                                                                            if (sVar5 != null) {
                                                                                                                kVar = new k(sVar5.a, sVar5.b);
                                                                                                            } else {
                                                                                                                mo.j jVar3 = g0Var.c;
                                                                                                                String str18 = jVar3 != null ? jVar3.a : null;
                                                                                                                if (str18 == null) {
                                                                                                                    str18 = "";
                                                                                                                }
                                                                                                                String str19 = jVar3 != null ? jVar3.b : null;
                                                                                                                if (str19 == null) {
                                                                                                                    str19 = "";
                                                                                                                }
                                                                                                                kVar = new k(str18, str19);
                                                                                                            }
                                                                                                            eVar = new jn.e(str14, (String) kVar.s, (String) kVar.r);
                                                                                                        } else {
                                                                                                            aVar2 = new jn.a(str14, "");
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            aVar2 = eVar;
                                                        }
                                                        aVar2 = cVar22;
                                                    }
                                                } else {
                                                    i82 = i14;
                                                    str2 = str5;
                                                    it2 = it4;
                                                    aVar2 = new jn.a(str14, "");
                                                }
                                                arrayList3.add(aVar2);
                                                size = i15;
                                                i13 = i82;
                                                str5 = str2;
                                                it4 = it2;
                                            }
                                            str = str5;
                                            it = it4;
                                            hVar2 = new h(str7, zonedDateTime, str8, str9, str11, str13, arrayList3, eVar6.d);
                                        } else {
                                            str = str5;
                                            it = it4;
                                            hVar2 = null;
                                        }
                                        if (hVar2 != null) {
                                            arrayList.add(hVar2);
                                        }
                                        str5 = str;
                                        it4 = it;
                                        str6 = null;
                                        i13 = 0;
                                    }
                                    rVar = new ArrayList();
                                    int size2 = arrayList.size();
                                    int i16 = 0;
                                    while (i16 < size2) {
                                        Object obj3 = arrayList.get(i16);
                                        i16++;
                                        h hVar5 = (h) obj3;
                                        if (!t71.p.T(hVar5.f) && !t71.p.T(hVar5.e)) {
                                            rVar.add(obj3);
                                        }
                                    }
                                } else {
                                    rVar = null;
                                }
                                if (rVar != null) {
                                    rVar5 = rVar;
                                }
                                g gVar4 = bVar8.b;
                                return new jn.i(rVar5.size(), rVar5, new i(gVar4.a, gVar4.b, gVar4.c));
                            case 3:
                                p8.k kVar6 = (p8.k) obj;
                                k71.k.g(kVar6, "it");
                                return kVar6;
                            case 4:
                                pb0.g gVar5 = (pb0.g) obj;
                                k71.k.g(gVar5, "repositoryOwnerRepositoriesParameters");
                                nq f0 = m71.a.f0(gVar5.a);
                                if (f0 != null) {
                                    bVar7 = new u0(f0);
                                }
                                return new i10(null, bVar7, 10);
                            case 5:
                                d10 d10Var = (d10) obj;
                                k71.k.g(d10Var, "data");
                                return Boolean.valueOf(d10Var.a.a.b != null ? !r0.isEmpty() : false);
                            case 6:
                                d10 d10Var2 = (d10) obj;
                                k71.k.g(d10Var2, "data");
                                f10 f10Var = d10Var2.a.a.a;
                                return new i(f10Var.b, f10Var.a, !f10Var.c);
                            case 7:
                                d10 d10Var3 = (d10) obj;
                                k71.k.g(d10Var3, "data");
                                List list7 = d10Var3.a.a.b;
                                return list7 == null ? rVar5 : list7;
                            case 8:
                                d10 d10Var4 = (d10) obj;
                                k71.k.g(d10Var4, "data");
                                g10 g10Var = d10Var4.a.a;
                                rShadow rVar7 = g10Var.b;
                                if (rVar7 != null) {
                                    rVar5 = rVar7;
                                }
                                ArrayList S = m.S(rVar5);
                                ArrayList arrayList4 = new ArrayList(n.F(S, 10));
                                int size3 = S.size();
                                int i17 = 0;
                                while (i17 < size3) {
                                    Object obj4 = S.get(i17);
                                    i17++;
                                    e10 e10Var = (e10) obj4;
                                    q3 q3Var = e10Var.f;
                                    p3 p3Var = q3Var.d;
                                    arrayList4.add(new pb0.h(new t7(q3Var.a, q3Var.b, p3Var.c, t.q.q(p3Var.d), new bb0.j(e10Var.g), q3Var.c), e10Var.d, e10Var.b, e10Var.c));
                                }
                                f10 f10Var2 = g10Var.a;
                                return new pb0.f(arrayList4, new i(f10Var2.b, f10Var2.a, !f10Var2.c));
                            case 9:
                                w1.r rVar8 = (w1.r) obj;
                                k71.k.g(rVar8, "$this$applyIf");
                                return androidx.compose.foundation.layout.b.B(rVar8, ih.a.l, 0.0f, 0.0f, 0.0f, 14);
                            case 10:
                                c0 c0Var = (c0) obj;
                                k71.k.g(c0Var, "$this$semantics");
                                z.l(c0Var, 0);
                                return a0Var;
                            case 11:
                                pc0.a aVar7 = (pc0.a) obj;
                                k71.k.g(aVar7, "userAchievementsParameters");
                                return new lc0.l(aVar7.a, new u0(30), bVar7);
                            case 12:
                                lc0.d dVar6 = (lc0.d) obj;
                                k71.k.g(dVar6, "data");
                                lc0.k kVar7 = dVar6.a;
                                return Boolean.valueOf((kVar7 == null || (fVar3 = kVar7.c) == null || (bVar4 = fVar3.a) == null || (list = bVar4.c) == null) ? false : !list.isEmpty());
                            case 13:
                                lc0.d dVar7 = (lc0.d) obj;
                                k71.k.g(dVar7, "data");
                                lc0.k kVar8 = dVar7.a;
                                if (kVar8 == null || (fVar4 = kVar8.c) == null || (bVar5 = fVar4.a) == null || (gVar22 = bVar5.b) == null) {
                                    return null;
                                }
                                return new i(gVar22.a, gVar22.b, !gVar22.c);
                            case 14:
                                lc0.d dVar8 = (lc0.d) obj;
                                k71.k.g(dVar8, "data");
                                lc0.k kVar9 = dVar8.a;
                                List list8 = (kVar9 == null || (fVar5 = kVar9.c) == null || (bVar6 = fVar5.a) == null) ? null : bVar6.c;
                                return list8 == null ? rVar5 : list8;
                            case 15:
                                lc0.d dVar9 = (lc0.d) obj;
                                k71.k.g(dVar9, "data");
                                lc0.k kVar10 = dVar9.a;
                                if (kVar10 == null) {
                                    return null;
                                }
                                lc0.b bVar9 = kVar10.c.a;
                                List list9 = bVar9.c;
                                if (list9 != null) {
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it5 = list9.iterator();
                                    while (it5.hasNext()) {
                                        lc0.e eVar8 = (lc0.e) it5.next();
                                        if (eVar8 != null) {
                                            String str20 = eVar8.b;
                                            ZonedDateTime zonedDateTime2 = eVar8.c;
                                            lc0.a aVar8 = eVar8.e;
                                            String str21 = aVar8.a;
                                            String str22 = aVar8.b;
                                            lc0.i iVar3 = eVar8.f;
                                            String str23 = iVar3 != null ? iVar3.b : null;
                                            String str24 = str23 == null ? "" : str23;
                                            String str25 = iVar3 != null ? iVar3.c : null;
                                            String str26 = str25 == null ? "" : str25;
                                            ArrayList arrayList6 = eVar8.g;
                                            ArrayList arrayList7 = new ArrayList(n.F(arrayList6, i12));
                                            int size4 = arrayList6.size();
                                            int i18 = 0;
                                            while (i18 < size4) {
                                                Object obj5 = arrayList6.get(i18);
                                                int i19 = i18 + 1;
                                                lc0.h hVar6 = (lc0.h) obj5;
                                                k71.k.g(hVar6, "<this>");
                                                Iterator it6 = it5;
                                                String str27 = hVar6.b;
                                                lc0.j jVar4 = hVar6.a;
                                                if (jVar4 != null) {
                                                    nc0.g0 g0Var2 = jVar4.b;
                                                    i92 = i19;
                                                    nc0.d dVar10 = g0Var2.b;
                                                    if (dVar10 != null) {
                                                        List list10 = dVar10.a.a;
                                                        String str28 = (list10 == null || (cVar7 = (nc0.c) m.W(list10)) == null) ? null : cVar7.b;
                                                        if (str28 == null) {
                                                            str28 = "";
                                                        }
                                                        String str29 = (list10 == null || (cVar6 = (nc0.c) m.W(list10)) == null) ? null : cVar6.a;
                                                        if (str29 == null) {
                                                            str29 = "";
                                                        }
                                                        str3 = str22;
                                                        aVar22 = new jn.d(str27, str29, str28);
                                                    } else {
                                                        str3 = str22;
                                                        nc0.e eVar9 = g0Var2.c;
                                                        if (eVar9 != null) {
                                                            aVar22 = new jn.d(str27, eVar9.a, eVar9.b.a);
                                                        } else {
                                                            nc0.f fVar7 = g0Var2.d;
                                                            if (fVar7 != null) {
                                                                str4 = str21;
                                                                cVar5 = new jn.b(fVar7.b, str27, fVar7.a, fVar7.c.a);
                                                            } else {
                                                                str4 = str21;
                                                                nc0.g gVar6 = g0Var2.e;
                                                                if (gVar6 != null) {
                                                                    nc0.a aVar9 = gVar6.b;
                                                                    String str30 = aVar9 != null ? aVar9.b.a : null;
                                                                    if (str30 == null) {
                                                                        str30 = "";
                                                                    }
                                                                    cVar5 = new jn.b(aVar9 != null ? aVar9.a : 0, str27, gVar6.a, str30);
                                                                } else {
                                                                    nc0.h hVar7 = g0Var2.f;
                                                                    if (hVar7 != null) {
                                                                        cVar5 = new jn.c(hVar7.c, str27, hVar7.a, hVar7.b.a);
                                                                    } else {
                                                                        nc0.i iVar4 = g0Var2.g;
                                                                        if (iVar4 != null) {
                                                                            cVar5 = new jn.c(iVar4.c.a, str27, iVar4.a, iVar4.b.a);
                                                                        } else {
                                                                            nc0.j jVar5 = g0Var2.h;
                                                                            if (jVar5 != null) {
                                                                                cVar5 = new jn.c(jVar5.b, str27, jVar5.c, jVar5.a.a);
                                                                            } else {
                                                                                nc0.k kVar11 = g0Var2.i;
                                                                                if (kVar11 != null) {
                                                                                    nc0.t tVar2 = kVar11.b;
                                                                                    cVar5 = new jn.c(tVar2.b, str27, kVar11.a, tVar2.a.a);
                                                                                } else {
                                                                                    nc0.l lVar2 = g0Var2.j;
                                                                                    if (lVar2 != null) {
                                                                                        nc0.s sVar6 = lVar2.b;
                                                                                        cVar5 = new jn.c(sVar6.b, str27, lVar2.a, sVar6.a.a);
                                                                                    } else {
                                                                                        nc0.m mVar2 = g0Var2.k;
                                                                                        if (mVar2 != null) {
                                                                                            aVar22 = new jn.d(str27, mVar2.c, mVar2.a.a);
                                                                                        } else {
                                                                                            nc0.n nVar2 = g0Var2.l;
                                                                                            if (nVar2 != null) {
                                                                                                aVar22 = new jn.d(str27, nVar2.a, nVar2.b);
                                                                                            } else {
                                                                                                nc0.o oVar22 = g0Var2.m;
                                                                                                if (oVar22 != null) {
                                                                                                    aVar22 = new jn.a(str27, oVar22.a);
                                                                                                } else {
                                                                                                    nc0.p pVar2 = g0Var2.n;
                                                                                                    if (pVar2 != null) {
                                                                                                        aVar22 = new jn.d(str27, pVar2.a, pVar2.b.a);
                                                                                                    } else {
                                                                                                        nc0.q qVar2 = g0Var2.o;
                                                                                                        if (qVar2 != null) {
                                                                                                            aVar22 = new jn.f(str27, qVar2.a, qVar2.b.a);
                                                                                                        } else {
                                                                                                            nc0.rShadow rVar9 = g0Var2.p;
                                                                                                            aVar22 = rVar9 != null ? new jn.a(str27, rVar9.a) : new jn.a(str27, "");
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            aVar22 = cVar5;
                                                        }
                                                    }
                                                    str4 = str21;
                                                } else {
                                                    i92 = i19;
                                                    str3 = str22;
                                                    str4 = str21;
                                                    aVar22 = new jn.a(str27, "");
                                                }
                                                arrayList7.add(aVar22);
                                                it5 = it6;
                                                i18 = i92;
                                                str22 = str3;
                                                str21 = str4;
                                            }
                                            it3 = it5;
                                            hVar22 = new h(str20, zonedDateTime2, str21, str22, str24, str26, arrayList7, eVar8.d);
                                        } else {
                                            it3 = it5;
                                            hVar22 = null;
                                        }
                                        if (hVar22 != null) {
                                            arrayList5.add(hVar22);
                                        }
                                        it5 = it3;
                                        i12 = 10;
                                    }
                                    rVar2 = new ArrayList();
                                    int size5 = arrayList5.size();
                                    int i21 = 0;
                                    while (i21 < size5) {
                                        Object obj6 = arrayList5.get(i21);
                                        i21++;
                                        h hVar8 = (h) obj6;
                                        if (!t71.p.T(hVar8.f) && !t71.p.T(hVar8.e)) {
                                            rVar2.add(obj6);
                                        }
                                    }
                                } else {
                                    rVar2 = null;
                                }
                                if (rVar2 != null) {
                                    rVar5 = rVar2;
                                }
                                lc0.g gVar7 = bVar9.b;
                                return new jn.i(rVar5.size(), rVar5, new i(gVar7.a, gVar7.b, gVar7.c));
                            case 16:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 17:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 18:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 19:
                                py0.p pVar3 = (py0.p) obj;
                                k71.k.g(pVar3, "repositoryIssueTypesParameters");
                                return new w(new u0(30), bVar7, pVar3.a, pVar3.b);
                            case 20:
                                py0.r rVar10 = (py0.r) obj;
                                k71.k.g(rVar10, "data");
                                v vVar2 = rVar10.a;
                                return Boolean.valueOf((vVar2 == null || (sVar = vVar2.a) == null || (list2 = sVar.b) == null) ? false : !list2.isEmpty());
                            case 21:
                                py0.r rVar11 = (py0.r) obj;
                                k71.k.g(rVar11, "data");
                                v vVar3 = rVar11.a;
                                if (vVar3 == null || (sVar2 = vVar3.a) == null || (uVar = sVar2.a) == null) {
                                    return null;
                                }
                                return new i(uVar.a, uVar.b, !uVar.c);
                            case 22:
                                py0.r rVar12 = (py0.r) obj;
                                k71.k.g(rVar12, "data");
                                v vVar4 = rVar12.a;
                                List list11 = (vVar4 == null || (sVar3 = vVar4.a) == null) ? null : sVar3.b;
                                return list11 == null ? rVar5 : list11;
                            case 23:
                                py0.r rVar13 = (py0.r) obj;
                                k71.k.g(rVar13, "data");
                                v vVar5 = rVar13.a;
                                if (vVar5 == null || (sVar4 = vVar5.a) == null) {
                                    return null;
                                }
                                u uVar3 = sVar4.a;
                                i iVar5 = new i(uVar3.a, uVar3.b, !uVar3.c);
                                List<py0.t> list12 = sVar4.b;
                                if (list12 != null) {
                                    rShadow arrayList8 = new ArrayList();
                                    for (py0.t tVar3 : list12) {
                                        IssueType k = (tVar3 == null || (aVar3 = tVar3.c) == null) ? null : aa1.b.k(aVar3);
                                        if (k != null) {
                                            arrayList8.add(k);
                                        }
                                    }
                                    rVar3 = arrayList8;
                                } else {
                                    rVar3 = null;
                                }
                                if (rVar3 != null) {
                                    rVar5 = rVar3;
                                }
                                return new u01.a(rVar5, iVar5);
                            case 24:
                                r71.e[] eVarArr = z.a;
                                ((c0) obj).a(x.e, a0Var);
                                return a0Var;
                            case 25:
                                q00.a aVar10 = (q00.a) obj;
                                k71.k.g(aVar10, "repositoryOwnerRepositoriesParameters");
                                String str31 = aVar10.a;
                                String str32 = aVar10.b;
                                return new bw.g(str31, bVar7, str32 == null ? bVar7 : new u0(str32));
                            case 26:
                                bw.b bVar10 = (bw.b) obj;
                                k71.k.g(bVar10, "data");
                                bw.f fVar8 = bVar10.a;
                                return Boolean.valueOf((fVar8 == null || (eVar2 = fVar8.b) == null || (list3 = eVar2.b) == null) ? false : !list3.isEmpty());
                            case 27:
                                bw.b bVar11 = (bw.b) obj;
                                k71.k.g(bVar11, "data");
                                bw.f fVar9 = bVar11.a;
                                if (fVar9 == null || (eVar3 = fVar9.b) == null || (dVar = eVar3.a) == null || (aVar4 = dVar.b) == null) {
                                    return null;
                                }
                                return new i(aVar4.a, aVar4.b, !aVar4.c);
                            case 28:
                                bw.b bVar12 = (bw.b) obj;
                                k71.k.g(bVar12, "data");
                                bw.f fVar10 = bVar12.a;
                                List list13 = (fVar10 == null || (eVar4 = fVar10.b) == null) ? null : eVar4.b;
                                return list13 == null ? rVar5 : list13;
                            default:
                                bw.b bVar13 = (bw.b) obj;
                                k71.k.g(bVar13, "data");
                                bw.f fVar11 = bVar13.a;
                                if (fVar11 == null || (eVar5 = fVar11.b) == null) {
                                    return null;
                                }
                                xx.a aVar11 = eVar5.a.b;
                                i iVar6 = new i(aVar11.a, aVar11.b, !aVar11.c);
                                List<bw.c> list14 = eVar5.b;
                                if (list14 != null) {
                                    rShadow arrayList9 = new ArrayList();
                                    for (bw.c cVar8 : list14) {
                                        SimpleRepository I = (cVar8 == null || (t5Var = cVar8.c) == null) ? null : sy.n.I(t5Var);
                                        if (I != null) {
                                            arrayList9.add(I);
                                        }
                                    }
                                    rVar4 = arrayList9;
                                } else {
                                    rVar4 = null;
                                }
                                if (rVar4 != null) {
                                    rVar5 = rVar4;
                                }
                                return new k4(rVar5, iVar6);
                        }
                    }
                };
                final int i12 = 27;
                j71.c cVar4 = new j71.c() { // from class: oo.a
                    public final Object k(Object obj) {
                        f fVar;
                        ko.b bVar22;
                        g gVar2;
                        f fVar2;
                        ko.b bVar32;
                        rShadow rVar;
                        String str;
                        Iterator it;
                        h hVar2;
                        int i82;
                        String str2;
                        Iterator it2;
                        Object aVar2;
                        k kVar;
                        Object eVar;
                        Object cVar22;
                        c cVar32;
                        c cVar42;
                        lc0.f fVar3;
                        lc0.b bVar4;
                        List list;
                        lc0.f fVar4;
                        lc0.b bVar5;
                        lc0.g gVar22;
                        lc0.f fVar5;
                        lc0.b bVar6;
                        rShadow rVar2;
                        Iterator it3;
                        h hVar22;
                        int i92;
                        String str3;
                        String str4;
                        Object aVar22;
                        Object cVar5;
                        nc0.c cVar6;
                        nc0.c cVar7;
                        s sVar;
                        List list2;
                        s sVar2;
                        u uVar;
                        s sVar3;
                        s sVar4;
                        rShadow rVar3;
                        yr0.a aVar3;
                        e eVar2;
                        List list3;
                        e eVar3;
                        d dVar;
                        xx.a aVar4;
                        e eVar4;
                        e eVar5;
                        rShadow rVar4;
                        t5 t5Var;
                        int i112 = i12;
                        String str5 = "<this>";
                        int i122 = 10;
                        aa1.b bVar7 = t0.d;
                        a0Shadow a0Var = a0.a;
                        rShadow rVar5 = r.r;
                        switch (i112) {
                            case 0:
                                ko.d dVar2 = (ko.d) obj;
                                k71.k.g(dVar2, "data");
                                ko.k kVar2 = dVar2.a;
                                if (kVar2 == null || (fVar = kVar2.c) == null || (bVar22 = fVar.a) == null || (gVar2 = bVar22.b) == null) {
                                    return null;
                                }
                                return new i(gVar2.a, gVar2.b, !gVar2.c);
                            case 1:
                                ko.d dVar3 = (ko.d) obj;
                                k71.k.g(dVar3, "data");
                                ko.k kVar3 = dVar3.a;
                                List list4 = (kVar3 == null || (fVar2 = kVar3.c) == null || (bVar32 = fVar2.a) == null) ? null : bVar32.c;
                                return list4 == null ? rVar5 : list4;
                            case 2:
                                String str6 = null;
                                int i13 = 0;
                                ko.d dVar4 = (ko.d) obj;
                                k71.k.g(dVar4, "data");
                                ko.k kVar4 = dVar4.a;
                                if (kVar4 == null) {
                                    return null;
                                }
                                ko.b bVar8 = kVar4.c.a;
                                List list5 = bVar8.c;
                                if (list5 != null) {
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it4 = list5.iterator();
                                    while (it4.hasNext()) {
                                        ko.e eVar6 = (ko.e) it4.next();
                                        if (eVar6 != null) {
                                            String str7 = eVar6.b;
                                            ZonedDateTime zonedDateTime = eVar6.c;
                                            ko.a aVar5 = eVar6.e;
                                            String str8 = aVar5.a;
                                            String str9 = aVar5.b;
                                            ko.i iVar = eVar6.f;
                                            String str10 = iVar != null ? iVar.b : str6;
                                            String str11 = str10 == null ? "" : str10;
                                            String str12 = iVar != null ? iVar.c : str6;
                                            String str13 = str12 == null ? "" : str12;
                                            ArrayList arrayList2 = eVar6.g;
                                            ArrayList arrayList3 = new ArrayList(n.F(arrayList2, 10));
                                            int size = arrayList2.size();
                                            while (i13 < size) {
                                                Object obj2 = arrayList2.get(i13);
                                                int i14 = i13 + 1;
                                                ko.h hVar3 = (ko.h) obj2;
                                                k71.k.g(hVar3, str5);
                                                int i15 = size;
                                                String str14 = hVar3.b;
                                                j jVar2 = hVar3.a;
                                                if (jVar2 != null) {
                                                    h0 h0Var = jVar2.b;
                                                    i82 = i14;
                                                    mo.d dVar5 = h0Var.b;
                                                    if (dVar5 != null) {
                                                        List list6 = dVar5.a.a;
                                                        String str15 = (list6 == null || (cVar42 = (c) m.W(list6)) == null) ? null : cVar42.b;
                                                        if (str15 == null) {
                                                            str15 = "";
                                                        }
                                                        String str16 = (list6 == null || (cVar32 = (c) m.W(list6)) == null) ? null : cVar32.a;
                                                        if (str16 == null) {
                                                            str16 = "";
                                                        }
                                                        str2 = str5;
                                                        aVar2 = new jn.d(str14, str16, str15);
                                                        it2 = it4;
                                                    } else {
                                                        str2 = str5;
                                                        mo.e eVar7 = h0Var.c;
                                                        if (eVar7 != null) {
                                                            cVar22 = new jn.d(str14, eVar7.a, eVar7.b.a);
                                                            it2 = it4;
                                                        } else {
                                                            mo.f fVar6 = h0Var.d;
                                                            if (fVar6 != null) {
                                                                it2 = it4;
                                                                eVar = new jn.b(fVar6.b, str14, fVar6.a, fVar6.c.a);
                                                            } else {
                                                                it2 = it4;
                                                                mo.g gVar3 = h0Var.e;
                                                                if (gVar3 != null) {
                                                                    mo.a aVar6 = gVar3.b;
                                                                    String str17 = aVar6 != null ? aVar6.b.a : null;
                                                                    if (str17 == null) {
                                                                        str17 = "";
                                                                    }
                                                                    cVar22 = new jn.b(aVar6 != null ? aVar6.a : 0, str14, gVar3.a, str17);
                                                                } else {
                                                                    mo.h hVar4 = h0Var.f;
                                                                    if (hVar4 != null) {
                                                                        cVar22 = new jn.c(hVar4.c, str14, hVar4.a, hVar4.b.a);
                                                                    } else {
                                                                        mo.i iVar2 = h0Var.g;
                                                                        if (iVar2 != null) {
                                                                            cVar22 = new jn.c(iVar2.c.a, str14, iVar2.a, iVar2.b.a);
                                                                        } else {
                                                                            mo.k kVar5 = h0Var.h;
                                                                            if (kVar5 != null) {
                                                                                cVar22 = new jn.c(kVar5.b, str14, kVar5.c, kVar5.a.a);
                                                                            } else {
                                                                                l lVar = h0Var.i;
                                                                                if (lVar != null) {
                                                                                    mo.u uVar2 = lVar.b;
                                                                                    cVar22 = new jn.c(uVar2.b, str14, lVar.a, uVar2.a.a);
                                                                                } else {
                                                                                    mo.m mVar = h0Var.j;
                                                                                    if (mVar != null) {
                                                                                        t tVar = mVar.b;
                                                                                        cVar22 = new jn.c(tVar.b, str14, mVar.a, tVar.a.a);
                                                                                    } else {
                                                                                        mo.n nVar = h0Var.k;
                                                                                        if (nVar != null) {
                                                                                            eVar = new jn.d(str14, nVar.c, nVar.a.a);
                                                                                        } else {
                                                                                            o oVar32 = h0Var.l;
                                                                                            if (oVar32 != null) {
                                                                                                eVar = new jn.d(str14, oVar32.a, oVar32.b);
                                                                                            } else {
                                                                                                p pVar = h0Var.m;
                                                                                                if (pVar != null) {
                                                                                                    aVar2 = new jn.a(str14, pVar.a);
                                                                                                } else {
                                                                                                    q qVar = h0Var.n;
                                                                                                    if (qVar != null) {
                                                                                                        eVar = new jn.d(str14, qVar.a, qVar.b.a);
                                                                                                    } else {
                                                                                                        mo.rShadow rVar6 = h0Var.o;
                                                                                                        if (rVar6 != null) {
                                                                                                            g0 g0Var = rVar6.a;
                                                                                                            mo.s sVar5 = g0Var.b;
                                                                                                            if (sVar5 != null) {
                                                                                                                kVar = new k(sVar5.a, sVar5.b);
                                                                                                            } else {
                                                                                                                mo.j jVar3 = g0Var.c;
                                                                                                                String str18 = jVar3 != null ? jVar3.a : null;
                                                                                                                if (str18 == null) {
                                                                                                                    str18 = "";
                                                                                                                }
                                                                                                                String str19 = jVar3 != null ? jVar3.b : null;
                                                                                                                if (str19 == null) {
                                                                                                                    str19 = "";
                                                                                                                }
                                                                                                                kVar = new k(str18, str19);
                                                                                                            }
                                                                                                            eVar = new jn.e(str14, (String) kVar.s, (String) kVar.r);
                                                                                                        } else {
                                                                                                            aVar2 = new jn.a(str14, "");
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            aVar2 = eVar;
                                                        }
                                                        aVar2 = cVar22;
                                                    }
                                                } else {
                                                    i82 = i14;
                                                    str2 = str5;
                                                    it2 = it4;
                                                    aVar2 = new jn.a(str14, "");
                                                }
                                                arrayList3.add(aVar2);
                                                size = i15;
                                                i13 = i82;
                                                str5 = str2;
                                                it4 = it2;
                                            }
                                            str = str5;
                                            it = it4;
                                            hVar2 = new h(str7, zonedDateTime, str8, str9, str11, str13, arrayList3, eVar6.d);
                                        } else {
                                            str = str5;
                                            it = it4;
                                            hVar2 = null;
                                        }
                                        if (hVar2 != null) {
                                            arrayList.add(hVar2);
                                        }
                                        str5 = str;
                                        it4 = it;
                                        str6 = null;
                                        i13 = 0;
                                    }
                                    rVar = new ArrayList();
                                    int size2 = arrayList.size();
                                    int i16 = 0;
                                    while (i16 < size2) {
                                        Object obj3 = arrayList.get(i16);
                                        i16++;
                                        h hVar5 = (h) obj3;
                                        if (!t71.p.T(hVar5.f) && !t71.p.T(hVar5.e)) {
                                            rVar.add(obj3);
                                        }
                                    }
                                } else {
                                    rVar = null;
                                }
                                if (rVar != null) {
                                    rVar5 = rVar;
                                }
                                g gVar4 = bVar8.b;
                                return new jn.i(rVar5.size(), rVar5, new i(gVar4.a, gVar4.b, gVar4.c));
                            case 3:
                                p8.k kVar6 = (p8.k) obj;
                                k71.k.g(kVar6, "it");
                                return kVar6;
                            case 4:
                                pb0.g gVar5 = (pb0.g) obj;
                                k71.k.g(gVar5, "repositoryOwnerRepositoriesParameters");
                                nq f0 = m71.a.f0(gVar5.a);
                                if (f0 != null) {
                                    bVar7 = new u0(f0);
                                }
                                return new i10(null, bVar7, 10);
                            case 5:
                                d10 d10Var = (d10) obj;
                                k71.k.g(d10Var, "data");
                                return Boolean.valueOf(d10Var.a.a.b != null ? !r0.isEmpty() : false);
                            case 6:
                                d10 d10Var2 = (d10) obj;
                                k71.k.g(d10Var2, "data");
                                f10 f10Var = d10Var2.a.a.a;
                                return new i(f10Var.b, f10Var.a, !f10Var.c);
                            case 7:
                                d10 d10Var3 = (d10) obj;
                                k71.k.g(d10Var3, "data");
                                List list7 = d10Var3.a.a.b;
                                return list7 == null ? rVar5 : list7;
                            case 8:
                                d10 d10Var4 = (d10) obj;
                                k71.k.g(d10Var4, "data");
                                g10 g10Var = d10Var4.a.a;
                                rShadow rVar7 = g10Var.b;
                                if (rVar7 != null) {
                                    rVar5 = rVar7;
                                }
                                ArrayList S = m.S(rVar5);
                                ArrayList arrayList4 = new ArrayList(n.F(S, 10));
                                int size3 = S.size();
                                int i17 = 0;
                                while (i17 < size3) {
                                    Object obj4 = S.get(i17);
                                    i17++;
                                    e10 e10Var = (e10) obj4;
                                    q3 q3Var = e10Var.f;
                                    p3 p3Var = q3Var.d;
                                    arrayList4.add(new pb0.h(new t7(q3Var.a, q3Var.b, p3Var.c, t.q.q(p3Var.d), new bb0.j(e10Var.g), q3Var.c), e10Var.d, e10Var.b, e10Var.c));
                                }
                                f10 f10Var2 = g10Var.a;
                                return new pb0.f(arrayList4, new i(f10Var2.b, f10Var2.a, !f10Var2.c));
                            case 9:
                                w1.r rVar8 = (w1.r) obj;
                                k71.k.g(rVar8, "$this$applyIf");
                                return androidx.compose.foundation.layout.b.B(rVar8, ih.a.l, 0.0f, 0.0f, 0.0f, 14);
                            case 10:
                                c0 c0Var = (c0) obj;
                                k71.k.g(c0Var, "$this$semantics");
                                z.l(c0Var, 0);
                                return a0Var;
                            case 11:
                                pc0.a aVar7 = (pc0.a) obj;
                                k71.k.g(aVar7, "userAchievementsParameters");
                                return new lc0.l(aVar7.a, new u0(30), bVar7);
                            case 12:
                                lc0.d dVar6 = (lc0.d) obj;
                                k71.k.g(dVar6, "data");
                                lc0.k kVar7 = dVar6.a;
                                return Boolean.valueOf((kVar7 == null || (fVar3 = kVar7.c) == null || (bVar4 = fVar3.a) == null || (list = bVar4.c) == null) ? false : !list.isEmpty());
                            case 13:
                                lc0.d dVar7 = (lc0.d) obj;
                                k71.k.g(dVar7, "data");
                                lc0.k kVar8 = dVar7.a;
                                if (kVar8 == null || (fVar4 = kVar8.c) == null || (bVar5 = fVar4.a) == null || (gVar22 = bVar5.b) == null) {
                                    return null;
                                }
                                return new i(gVar22.a, gVar22.b, !gVar22.c);
                            case 14:
                                lc0.d dVar8 = (lc0.d) obj;
                                k71.k.g(dVar8, "data");
                                lc0.k kVar9 = dVar8.a;
                                List list8 = (kVar9 == null || (fVar5 = kVar9.c) == null || (bVar6 = fVar5.a) == null) ? null : bVar6.c;
                                return list8 == null ? rVar5 : list8;
                            case 15:
                                lc0.d dVar9 = (lc0.d) obj;
                                k71.k.g(dVar9, "data");
                                lc0.k kVar10 = dVar9.a;
                                if (kVar10 == null) {
                                    return null;
                                }
                                lc0.b bVar9 = kVar10.c.a;
                                List list9 = bVar9.c;
                                if (list9 != null) {
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it5 = list9.iterator();
                                    while (it5.hasNext()) {
                                        lc0.e eVar8 = (lc0.e) it5.next();
                                        if (eVar8 != null) {
                                            String str20 = eVar8.b;
                                            ZonedDateTime zonedDateTime2 = eVar8.c;
                                            lc0.a aVar8 = eVar8.e;
                                            String str21 = aVar8.a;
                                            String str22 = aVar8.b;
                                            lc0.i iVar3 = eVar8.f;
                                            String str23 = iVar3 != null ? iVar3.b : null;
                                            String str24 = str23 == null ? "" : str23;
                                            String str25 = iVar3 != null ? iVar3.c : null;
                                            String str26 = str25 == null ? "" : str25;
                                            ArrayList arrayList6 = eVar8.g;
                                            ArrayList arrayList7 = new ArrayList(n.F(arrayList6, i122));
                                            int size4 = arrayList6.size();
                                            int i18 = 0;
                                            while (i18 < size4) {
                                                Object obj5 = arrayList6.get(i18);
                                                int i19 = i18 + 1;
                                                lc0.h hVar6 = (lc0.h) obj5;
                                                k71.k.g(hVar6, "<this>");
                                                Iterator it6 = it5;
                                                String str27 = hVar6.b;
                                                lc0.j jVar4 = hVar6.a;
                                                if (jVar4 != null) {
                                                    nc0.g0 g0Var2 = jVar4.b;
                                                    i92 = i19;
                                                    nc0.d dVar10 = g0Var2.b;
                                                    if (dVar10 != null) {
                                                        List list10 = dVar10.a.a;
                                                        String str28 = (list10 == null || (cVar7 = (nc0.c) m.W(list10)) == null) ? null : cVar7.b;
                                                        if (str28 == null) {
                                                            str28 = "";
                                                        }
                                                        String str29 = (list10 == null || (cVar6 = (nc0.c) m.W(list10)) == null) ? null : cVar6.a;
                                                        if (str29 == null) {
                                                            str29 = "";
                                                        }
                                                        str3 = str22;
                                                        aVar22 = new jn.d(str27, str29, str28);
                                                    } else {
                                                        str3 = str22;
                                                        nc0.e eVar9 = g0Var2.c;
                                                        if (eVar9 != null) {
                                                            aVar22 = new jn.d(str27, eVar9.a, eVar9.b.a);
                                                        } else {
                                                            nc0.f fVar7 = g0Var2.d;
                                                            if (fVar7 != null) {
                                                                str4 = str21;
                                                                cVar5 = new jn.b(fVar7.b, str27, fVar7.a, fVar7.c.a);
                                                            } else {
                                                                str4 = str21;
                                                                nc0.g gVar6 = g0Var2.e;
                                                                if (gVar6 != null) {
                                                                    nc0.a aVar9 = gVar6.b;
                                                                    String str30 = aVar9 != null ? aVar9.b.a : null;
                                                                    if (str30 == null) {
                                                                        str30 = "";
                                                                    }
                                                                    cVar5 = new jn.b(aVar9 != null ? aVar9.a : 0, str27, gVar6.a, str30);
                                                                } else {
                                                                    nc0.h hVar7 = g0Var2.f;
                                                                    if (hVar7 != null) {
                                                                        cVar5 = new jn.c(hVar7.c, str27, hVar7.a, hVar7.b.a);
                                                                    } else {
                                                                        nc0.i iVar4 = g0Var2.g;
                                                                        if (iVar4 != null) {
                                                                            cVar5 = new jn.c(iVar4.c.a, str27, iVar4.a, iVar4.b.a);
                                                                        } else {
                                                                            nc0.j jVar5 = g0Var2.h;
                                                                            if (jVar5 != null) {
                                                                                cVar5 = new jn.c(jVar5.b, str27, jVar5.c, jVar5.a.a);
                                                                            } else {
                                                                                nc0.k kVar11 = g0Var2.i;
                                                                                if (kVar11 != null) {
                                                                                    nc0.t tVar2 = kVar11.b;
                                                                                    cVar5 = new jn.c(tVar2.b, str27, kVar11.a, tVar2.a.a);
                                                                                } else {
                                                                                    nc0.l lVar2 = g0Var2.j;
                                                                                    if (lVar2 != null) {
                                                                                        nc0.s sVar6 = lVar2.b;
                                                                                        cVar5 = new jn.c(sVar6.b, str27, lVar2.a, sVar6.a.a);
                                                                                    } else {
                                                                                        nc0.m mVar2 = g0Var2.k;
                                                                                        if (mVar2 != null) {
                                                                                            aVar22 = new jn.d(str27, mVar2.c, mVar2.a.a);
                                                                                        } else {
                                                                                            nc0.n nVar2 = g0Var2.l;
                                                                                            if (nVar2 != null) {
                                                                                                aVar22 = new jn.d(str27, nVar2.a, nVar2.b);
                                                                                            } else {
                                                                                                nc0.o oVar22 = g0Var2.m;
                                                                                                if (oVar22 != null) {
                                                                                                    aVar22 = new jn.a(str27, oVar22.a);
                                                                                                } else {
                                                                                                    nc0.p pVar2 = g0Var2.n;
                                                                                                    if (pVar2 != null) {
                                                                                                        aVar22 = new jn.d(str27, pVar2.a, pVar2.b.a);
                                                                                                    } else {
                                                                                                        nc0.q qVar2 = g0Var2.o;
                                                                                                        if (qVar2 != null) {
                                                                                                            aVar22 = new jn.f(str27, qVar2.a, qVar2.b.a);
                                                                                                        } else {
                                                                                                            nc0.rShadow rVar9 = g0Var2.p;
                                                                                                            aVar22 = rVar9 != null ? new jn.a(str27, rVar9.a) : new jn.a(str27, "");
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            aVar22 = cVar5;
                                                        }
                                                    }
                                                    str4 = str21;
                                                } else {
                                                    i92 = i19;
                                                    str3 = str22;
                                                    str4 = str21;
                                                    aVar22 = new jn.a(str27, "");
                                                }
                                                arrayList7.add(aVar22);
                                                it5 = it6;
                                                i18 = i92;
                                                str22 = str3;
                                                str21 = str4;
                                            }
                                            it3 = it5;
                                            hVar22 = new h(str20, zonedDateTime2, str21, str22, str24, str26, arrayList7, eVar8.d);
                                        } else {
                                            it3 = it5;
                                            hVar22 = null;
                                        }
                                        if (hVar22 != null) {
                                            arrayList5.add(hVar22);
                                        }
                                        it5 = it3;
                                        i122 = 10;
                                    }
                                    rVar2 = new ArrayList();
                                    int size5 = arrayList5.size();
                                    int i21 = 0;
                                    while (i21 < size5) {
                                        Object obj6 = arrayList5.get(i21);
                                        i21++;
                                        h hVar8 = (h) obj6;
                                        if (!t71.p.T(hVar8.f) && !t71.p.T(hVar8.e)) {
                                            rVar2.add(obj6);
                                        }
                                    }
                                } else {
                                    rVar2 = null;
                                }
                                if (rVar2 != null) {
                                    rVar5 = rVar2;
                                }
                                lc0.g gVar7 = bVar9.b;
                                return new jn.i(rVar5.size(), rVar5, new i(gVar7.a, gVar7.b, gVar7.c));
                            case 16:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 17:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 18:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 19:
                                py0.p pVar3 = (py0.p) obj;
                                k71.k.g(pVar3, "repositoryIssueTypesParameters");
                                return new w(new u0(30), bVar7, pVar3.a, pVar3.b);
                            case 20:
                                py0.r rVar10 = (py0.r) obj;
                                k71.k.g(rVar10, "data");
                                v vVar2 = rVar10.a;
                                return Boolean.valueOf((vVar2 == null || (sVar = vVar2.a) == null || (list2 = sVar.b) == null) ? false : !list2.isEmpty());
                            case 21:
                                py0.r rVar11 = (py0.r) obj;
                                k71.k.g(rVar11, "data");
                                v vVar3 = rVar11.a;
                                if (vVar3 == null || (sVar2 = vVar3.a) == null || (uVar = sVar2.a) == null) {
                                    return null;
                                }
                                return new i(uVar.a, uVar.b, !uVar.c);
                            case 22:
                                py0.r rVar12 = (py0.r) obj;
                                k71.k.g(rVar12, "data");
                                v vVar4 = rVar12.a;
                                List list11 = (vVar4 == null || (sVar3 = vVar4.a) == null) ? null : sVar3.b;
                                return list11 == null ? rVar5 : list11;
                            case 23:
                                py0.r rVar13 = (py0.r) obj;
                                k71.k.g(rVar13, "data");
                                v vVar5 = rVar13.a;
                                if (vVar5 == null || (sVar4 = vVar5.a) == null) {
                                    return null;
                                }
                                u uVar3 = sVar4.a;
                                i iVar5 = new i(uVar3.a, uVar3.b, !uVar3.c);
                                List<py0.t> list12 = sVar4.b;
                                if (list12 != null) {
                                    rShadow arrayList8 = new ArrayList();
                                    for (py0.t tVar3 : list12) {
                                        IssueType k = (tVar3 == null || (aVar3 = tVar3.c) == null) ? null : aa1.b.k(aVar3);
                                        if (k != null) {
                                            arrayList8.add(k);
                                        }
                                    }
                                    rVar3 = arrayList8;
                                } else {
                                    rVar3 = null;
                                }
                                if (rVar3 != null) {
                                    rVar5 = rVar3;
                                }
                                return new u01.a(rVar5, iVar5);
                            case 24:
                                r71.e[] eVarArr = z.a;
                                ((c0) obj).a(x.e, a0Var);
                                return a0Var;
                            case 25:
                                q00.a aVar10 = (q00.a) obj;
                                k71.k.g(aVar10, "repositoryOwnerRepositoriesParameters");
                                String str31 = aVar10.a;
                                String str32 = aVar10.b;
                                return new bw.g(str31, bVar7, str32 == null ? bVar7 : new u0(str32));
                            case 26:
                                bw.b bVar10 = (bw.b) obj;
                                k71.k.g(bVar10, "data");
                                bw.f fVar8 = bVar10.a;
                                return Boolean.valueOf((fVar8 == null || (eVar2 = fVar8.b) == null || (list3 = eVar2.b) == null) ? false : !list3.isEmpty());
                            case 27:
                                bw.b bVar11 = (bw.b) obj;
                                k71.k.g(bVar11, "data");
                                bw.f fVar9 = bVar11.a;
                                if (fVar9 == null || (eVar3 = fVar9.b) == null || (dVar = eVar3.a) == null || (aVar4 = dVar.b) == null) {
                                    return null;
                                }
                                return new i(aVar4.a, aVar4.b, !aVar4.c);
                            case 28:
                                bw.b bVar12 = (bw.b) obj;
                                k71.k.g(bVar12, "data");
                                bw.f fVar10 = bVar12.a;
                                List list13 = (fVar10 == null || (eVar4 = fVar10.b) == null) ? null : eVar4.b;
                                return list13 == null ? rVar5 : list13;
                            default:
                                bw.b bVar13 = (bw.b) obj;
                                k71.k.g(bVar13, "data");
                                bw.f fVar11 = bVar13.a;
                                if (fVar11 == null || (eVar5 = fVar11.b) == null) {
                                    return null;
                                }
                                xx.a aVar11 = eVar5.a.b;
                                i iVar6 = new i(aVar11.a, aVar11.b, !aVar11.c);
                                List<bw.c> list14 = eVar5.b;
                                if (list14 != null) {
                                    rShadow arrayList9 = new ArrayList();
                                    for (bw.c cVar8 : list14) {
                                        SimpleRepository I = (cVar8 == null || (t5Var = cVar8.c) == null) ? null : sy.n.I(t5Var);
                                        if (I != null) {
                                            arrayList9.add(I);
                                        }
                                    }
                                    rVar4 = arrayList9;
                                } else {
                                    rVar4 = null;
                                }
                                if (rVar4 != null) {
                                    rVar5 = rVar4;
                                }
                                return new k4(rVar5, iVar6);
                        }
                    }
                };
                final int i13 = 28;
                j71.c cVar5 = new j71.c() { // from class: oo.a
                    public final Object k(Object obj) {
                        f fVar;
                        ko.b bVar22;
                        g gVar2;
                        f fVar2;
                        ko.b bVar32;
                        rShadow rVar;
                        String str;
                        Iterator it;
                        h hVar2;
                        int i82;
                        String str2;
                        Iterator it2;
                        Object aVar2;
                        k kVar;
                        Object eVar;
                        Object cVar22;
                        c cVar32;
                        c cVar42;
                        lc0.f fVar3;
                        lc0.b bVar4;
                        List list;
                        lc0.f fVar4;
                        lc0.b bVar5;
                        lc0.g gVar22;
                        lc0.f fVar5;
                        lc0.b bVar6;
                        rShadow rVar2;
                        Iterator it3;
                        h hVar22;
                        int i92;
                        String str3;
                        String str4;
                        Object aVar22;
                        Object cVar52;
                        nc0.c cVar6;
                        nc0.c cVar7;
                        s sVar;
                        List list2;
                        s sVar2;
                        u uVar;
                        s sVar3;
                        s sVar4;
                        rShadow rVar3;
                        yr0.a aVar3;
                        e eVar2;
                        List list3;
                        e eVar3;
                        d dVar;
                        xx.a aVar4;
                        e eVar4;
                        e eVar5;
                        rShadow rVar4;
                        t5 t5Var;
                        int i112 = i13;
                        String str5 = "<this>";
                        int i122 = 10;
                        aa1.b bVar7 = t0.d;
                        a0Shadow a0Var = a0.a;
                        rShadow rVar5 = r.r;
                        switch (i112) {
                            case 0:
                                ko.d dVar2 = (ko.d) obj;
                                k71.k.g(dVar2, "data");
                                ko.k kVar2 = dVar2.a;
                                if (kVar2 == null || (fVar = kVar2.c) == null || (bVar22 = fVar.a) == null || (gVar2 = bVar22.b) == null) {
                                    return null;
                                }
                                return new i(gVar2.a, gVar2.b, !gVar2.c);
                            case 1:
                                ko.d dVar3 = (ko.d) obj;
                                k71.k.g(dVar3, "data");
                                ko.k kVar3 = dVar3.a;
                                List list4 = (kVar3 == null || (fVar2 = kVar3.c) == null || (bVar32 = fVar2.a) == null) ? null : bVar32.c;
                                return list4 == null ? rVar5 : list4;
                            case 2:
                                String str6 = null;
                                int i132 = 0;
                                ko.d dVar4 = (ko.d) obj;
                                k71.k.g(dVar4, "data");
                                ko.k kVar4 = dVar4.a;
                                if (kVar4 == null) {
                                    return null;
                                }
                                ko.b bVar8 = kVar4.c.a;
                                List list5 = bVar8.c;
                                if (list5 != null) {
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it4 = list5.iterator();
                                    while (it4.hasNext()) {
                                        ko.e eVar6 = (ko.e) it4.next();
                                        if (eVar6 != null) {
                                            String str7 = eVar6.b;
                                            ZonedDateTime zonedDateTime = eVar6.c;
                                            ko.a aVar5 = eVar6.e;
                                            String str8 = aVar5.a;
                                            String str9 = aVar5.b;
                                            ko.i iVar = eVar6.f;
                                            String str10 = iVar != null ? iVar.b : str6;
                                            String str11 = str10 == null ? "" : str10;
                                            String str12 = iVar != null ? iVar.c : str6;
                                            String str13 = str12 == null ? "" : str12;
                                            ArrayList arrayList2 = eVar6.g;
                                            ArrayList arrayList3 = new ArrayList(n.F(arrayList2, 10));
                                            int size = arrayList2.size();
                                            while (i132 < size) {
                                                Object obj2 = arrayList2.get(i132);
                                                int i14 = i132 + 1;
                                                ko.h hVar3 = (ko.h) obj2;
                                                k71.k.g(hVar3, str5);
                                                int i15 = size;
                                                String str14 = hVar3.b;
                                                j jVar2 = hVar3.a;
                                                if (jVar2 != null) {
                                                    h0 h0Var = jVar2.b;
                                                    i82 = i14;
                                                    mo.d dVar5 = h0Var.b;
                                                    if (dVar5 != null) {
                                                        List list6 = dVar5.a.a;
                                                        String str15 = (list6 == null || (cVar42 = (c) m.W(list6)) == null) ? null : cVar42.b;
                                                        if (str15 == null) {
                                                            str15 = "";
                                                        }
                                                        String str16 = (list6 == null || (cVar32 = (c) m.W(list6)) == null) ? null : cVar32.a;
                                                        if (str16 == null) {
                                                            str16 = "";
                                                        }
                                                        str2 = str5;
                                                        aVar2 = new jn.d(str14, str16, str15);
                                                        it2 = it4;
                                                    } else {
                                                        str2 = str5;
                                                        mo.e eVar7 = h0Var.c;
                                                        if (eVar7 != null) {
                                                            cVar22 = new jn.d(str14, eVar7.a, eVar7.b.a);
                                                            it2 = it4;
                                                        } else {
                                                            mo.f fVar6 = h0Var.d;
                                                            if (fVar6 != null) {
                                                                it2 = it4;
                                                                eVar = new jn.b(fVar6.b, str14, fVar6.a, fVar6.c.a);
                                                            } else {
                                                                it2 = it4;
                                                                mo.g gVar3 = h0Var.e;
                                                                if (gVar3 != null) {
                                                                    mo.a aVar6 = gVar3.b;
                                                                    String str17 = aVar6 != null ? aVar6.b.a : null;
                                                                    if (str17 == null) {
                                                                        str17 = "";
                                                                    }
                                                                    cVar22 = new jn.b(aVar6 != null ? aVar6.a : 0, str14, gVar3.a, str17);
                                                                } else {
                                                                    mo.h hVar4 = h0Var.f;
                                                                    if (hVar4 != null) {
                                                                        cVar22 = new jn.c(hVar4.c, str14, hVar4.a, hVar4.b.a);
                                                                    } else {
                                                                        mo.i iVar2 = h0Var.g;
                                                                        if (iVar2 != null) {
                                                                            cVar22 = new jn.c(iVar2.c.a, str14, iVar2.a, iVar2.b.a);
                                                                        } else {
                                                                            mo.k kVar5 = h0Var.h;
                                                                            if (kVar5 != null) {
                                                                                cVar22 = new jn.c(kVar5.b, str14, kVar5.c, kVar5.a.a);
                                                                            } else {
                                                                                l lVar = h0Var.i;
                                                                                if (lVar != null) {
                                                                                    mo.u uVar2 = lVar.b;
                                                                                    cVar22 = new jn.c(uVar2.b, str14, lVar.a, uVar2.a.a);
                                                                                } else {
                                                                                    mo.m mVar = h0Var.j;
                                                                                    if (mVar != null) {
                                                                                        t tVar = mVar.b;
                                                                                        cVar22 = new jn.c(tVar.b, str14, mVar.a, tVar.a.a);
                                                                                    } else {
                                                                                        mo.n nVar = h0Var.k;
                                                                                        if (nVar != null) {
                                                                                            eVar = new jn.d(str14, nVar.c, nVar.a.a);
                                                                                        } else {
                                                                                            o oVar32 = h0Var.l;
                                                                                            if (oVar32 != null) {
                                                                                                eVar = new jn.d(str14, oVar32.a, oVar32.b);
                                                                                            } else {
                                                                                                p pVar = h0Var.m;
                                                                                                if (pVar != null) {
                                                                                                    aVar2 = new jn.a(str14, pVar.a);
                                                                                                } else {
                                                                                                    q qVar = h0Var.n;
                                                                                                    if (qVar != null) {
                                                                                                        eVar = new jn.d(str14, qVar.a, qVar.b.a);
                                                                                                    } else {
                                                                                                        mo.rShadow rVar6 = h0Var.o;
                                                                                                        if (rVar6 != null) {
                                                                                                            g0 g0Var = rVar6.a;
                                                                                                            mo.s sVar5 = g0Var.b;
                                                                                                            if (sVar5 != null) {
                                                                                                                kVar = new k(sVar5.a, sVar5.b);
                                                                                                            } else {
                                                                                                                mo.j jVar3 = g0Var.c;
                                                                                                                String str18 = jVar3 != null ? jVar3.a : null;
                                                                                                                if (str18 == null) {
                                                                                                                    str18 = "";
                                                                                                                }
                                                                                                                String str19 = jVar3 != null ? jVar3.b : null;
                                                                                                                if (str19 == null) {
                                                                                                                    str19 = "";
                                                                                                                }
                                                                                                                kVar = new k(str18, str19);
                                                                                                            }
                                                                                                            eVar = new jn.e(str14, (String) kVar.s, (String) kVar.r);
                                                                                                        } else {
                                                                                                            aVar2 = new jn.a(str14, "");
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            aVar2 = eVar;
                                                        }
                                                        aVar2 = cVar22;
                                                    }
                                                } else {
                                                    i82 = i14;
                                                    str2 = str5;
                                                    it2 = it4;
                                                    aVar2 = new jn.a(str14, "");
                                                }
                                                arrayList3.add(aVar2);
                                                size = i15;
                                                i132 = i82;
                                                str5 = str2;
                                                it4 = it2;
                                            }
                                            str = str5;
                                            it = it4;
                                            hVar2 = new h(str7, zonedDateTime, str8, str9, str11, str13, arrayList3, eVar6.d);
                                        } else {
                                            str = str5;
                                            it = it4;
                                            hVar2 = null;
                                        }
                                        if (hVar2 != null) {
                                            arrayList.add(hVar2);
                                        }
                                        str5 = str;
                                        it4 = it;
                                        str6 = null;
                                        i132 = 0;
                                    }
                                    rVar = new ArrayList();
                                    int size2 = arrayList.size();
                                    int i16 = 0;
                                    while (i16 < size2) {
                                        Object obj3 = arrayList.get(i16);
                                        i16++;
                                        h hVar5 = (h) obj3;
                                        if (!t71.p.T(hVar5.f) && !t71.p.T(hVar5.e)) {
                                            rVar.add(obj3);
                                        }
                                    }
                                } else {
                                    rVar = null;
                                }
                                if (rVar != null) {
                                    rVar5 = rVar;
                                }
                                g gVar4 = bVar8.b;
                                return new jn.i(rVar5.size(), rVar5, new i(gVar4.a, gVar4.b, gVar4.c));
                            case 3:
                                p8.k kVar6 = (p8.k) obj;
                                k71.k.g(kVar6, "it");
                                return kVar6;
                            case 4:
                                pb0.g gVar5 = (pb0.g) obj;
                                k71.k.g(gVar5, "repositoryOwnerRepositoriesParameters");
                                nq f0 = m71.a.f0(gVar5.a);
                                if (f0 != null) {
                                    bVar7 = new u0(f0);
                                }
                                return new i10(null, bVar7, 10);
                            case 5:
                                d10 d10Var = (d10) obj;
                                k71.k.g(d10Var, "data");
                                return Boolean.valueOf(d10Var.a.a.b != null ? !r0.isEmpty() : false);
                            case 6:
                                d10 d10Var2 = (d10) obj;
                                k71.k.g(d10Var2, "data");
                                f10 f10Var = d10Var2.a.a.a;
                                return new i(f10Var.b, f10Var.a, !f10Var.c);
                            case 7:
                                d10 d10Var3 = (d10) obj;
                                k71.k.g(d10Var3, "data");
                                List list7 = d10Var3.a.a.b;
                                return list7 == null ? rVar5 : list7;
                            case 8:
                                d10 d10Var4 = (d10) obj;
                                k71.k.g(d10Var4, "data");
                                g10 g10Var = d10Var4.a.a;
                                rShadow rVar7 = g10Var.b;
                                if (rVar7 != null) {
                                    rVar5 = rVar7;
                                }
                                ArrayList S = m.S(rVar5);
                                ArrayList arrayList4 = new ArrayList(n.F(S, 10));
                                int size3 = S.size();
                                int i17 = 0;
                                while (i17 < size3) {
                                    Object obj4 = S.get(i17);
                                    i17++;
                                    e10 e10Var = (e10) obj4;
                                    q3 q3Var = e10Var.f;
                                    p3 p3Var = q3Var.d;
                                    arrayList4.add(new pb0.h(new t7(q3Var.a, q3Var.b, p3Var.c, t.q.q(p3Var.d), new bb0.j(e10Var.g), q3Var.c), e10Var.d, e10Var.b, e10Var.c));
                                }
                                f10 f10Var2 = g10Var.a;
                                return new pb0.f(arrayList4, new i(f10Var2.b, f10Var2.a, !f10Var2.c));
                            case 9:
                                w1.r rVar8 = (w1.r) obj;
                                k71.k.g(rVar8, "$this$applyIf");
                                return androidx.compose.foundation.layout.b.B(rVar8, ih.a.l, 0.0f, 0.0f, 0.0f, 14);
                            case 10:
                                c0 c0Var = (c0) obj;
                                k71.k.g(c0Var, "$this$semantics");
                                z.l(c0Var, 0);
                                return a0Var;
                            case 11:
                                pc0.a aVar7 = (pc0.a) obj;
                                k71.k.g(aVar7, "userAchievementsParameters");
                                return new lc0.l(aVar7.a, new u0(30), bVar7);
                            case 12:
                                lc0.d dVar6 = (lc0.d) obj;
                                k71.k.g(dVar6, "data");
                                lc0.k kVar7 = dVar6.a;
                                return Boolean.valueOf((kVar7 == null || (fVar3 = kVar7.c) == null || (bVar4 = fVar3.a) == null || (list = bVar4.c) == null) ? false : !list.isEmpty());
                            case 13:
                                lc0.d dVar7 = (lc0.d) obj;
                                k71.k.g(dVar7, "data");
                                lc0.k kVar8 = dVar7.a;
                                if (kVar8 == null || (fVar4 = kVar8.c) == null || (bVar5 = fVar4.a) == null || (gVar22 = bVar5.b) == null) {
                                    return null;
                                }
                                return new i(gVar22.a, gVar22.b, !gVar22.c);
                            case 14:
                                lc0.d dVar8 = (lc0.d) obj;
                                k71.k.g(dVar8, "data");
                                lc0.k kVar9 = dVar8.a;
                                List list8 = (kVar9 == null || (fVar5 = kVar9.c) == null || (bVar6 = fVar5.a) == null) ? null : bVar6.c;
                                return list8 == null ? rVar5 : list8;
                            case 15:
                                lc0.d dVar9 = (lc0.d) obj;
                                k71.k.g(dVar9, "data");
                                lc0.k kVar10 = dVar9.a;
                                if (kVar10 == null) {
                                    return null;
                                }
                                lc0.b bVar9 = kVar10.c.a;
                                List list9 = bVar9.c;
                                if (list9 != null) {
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it5 = list9.iterator();
                                    while (it5.hasNext()) {
                                        lc0.e eVar8 = (lc0.e) it5.next();
                                        if (eVar8 != null) {
                                            String str20 = eVar8.b;
                                            ZonedDateTime zonedDateTime2 = eVar8.c;
                                            lc0.a aVar8 = eVar8.e;
                                            String str21 = aVar8.a;
                                            String str22 = aVar8.b;
                                            lc0.i iVar3 = eVar8.f;
                                            String str23 = iVar3 != null ? iVar3.b : null;
                                            String str24 = str23 == null ? "" : str23;
                                            String str25 = iVar3 != null ? iVar3.c : null;
                                            String str26 = str25 == null ? "" : str25;
                                            ArrayList arrayList6 = eVar8.g;
                                            ArrayList arrayList7 = new ArrayList(n.F(arrayList6, i122));
                                            int size4 = arrayList6.size();
                                            int i18 = 0;
                                            while (i18 < size4) {
                                                Object obj5 = arrayList6.get(i18);
                                                int i19 = i18 + 1;
                                                lc0.h hVar6 = (lc0.h) obj5;
                                                k71.k.g(hVar6, "<this>");
                                                Iterator it6 = it5;
                                                String str27 = hVar6.b;
                                                lc0.j jVar4 = hVar6.a;
                                                if (jVar4 != null) {
                                                    nc0.g0 g0Var2 = jVar4.b;
                                                    i92 = i19;
                                                    nc0.d dVar10 = g0Var2.b;
                                                    if (dVar10 != null) {
                                                        List list10 = dVar10.a.a;
                                                        String str28 = (list10 == null || (cVar7 = (nc0.c) m.W(list10)) == null) ? null : cVar7.b;
                                                        if (str28 == null) {
                                                            str28 = "";
                                                        }
                                                        String str29 = (list10 == null || (cVar6 = (nc0.c) m.W(list10)) == null) ? null : cVar6.a;
                                                        if (str29 == null) {
                                                            str29 = "";
                                                        }
                                                        str3 = str22;
                                                        aVar22 = new jn.d(str27, str29, str28);
                                                    } else {
                                                        str3 = str22;
                                                        nc0.e eVar9 = g0Var2.c;
                                                        if (eVar9 != null) {
                                                            aVar22 = new jn.d(str27, eVar9.a, eVar9.b.a);
                                                        } else {
                                                            nc0.f fVar7 = g0Var2.d;
                                                            if (fVar7 != null) {
                                                                str4 = str21;
                                                                cVar52 = new jn.b(fVar7.b, str27, fVar7.a, fVar7.c.a);
                                                            } else {
                                                                str4 = str21;
                                                                nc0.g gVar6 = g0Var2.e;
                                                                if (gVar6 != null) {
                                                                    nc0.a aVar9 = gVar6.b;
                                                                    String str30 = aVar9 != null ? aVar9.b.a : null;
                                                                    if (str30 == null) {
                                                                        str30 = "";
                                                                    }
                                                                    cVar52 = new jn.b(aVar9 != null ? aVar9.a : 0, str27, gVar6.a, str30);
                                                                } else {
                                                                    nc0.h hVar7 = g0Var2.f;
                                                                    if (hVar7 != null) {
                                                                        cVar52 = new jn.c(hVar7.c, str27, hVar7.a, hVar7.b.a);
                                                                    } else {
                                                                        nc0.i iVar4 = g0Var2.g;
                                                                        if (iVar4 != null) {
                                                                            cVar52 = new jn.c(iVar4.c.a, str27, iVar4.a, iVar4.b.a);
                                                                        } else {
                                                                            nc0.j jVar5 = g0Var2.h;
                                                                            if (jVar5 != null) {
                                                                                cVar52 = new jn.c(jVar5.b, str27, jVar5.c, jVar5.a.a);
                                                                            } else {
                                                                                nc0.k kVar11 = g0Var2.i;
                                                                                if (kVar11 != null) {
                                                                                    nc0.t tVar2 = kVar11.b;
                                                                                    cVar52 = new jn.c(tVar2.b, str27, kVar11.a, tVar2.a.a);
                                                                                } else {
                                                                                    nc0.l lVar2 = g0Var2.j;
                                                                                    if (lVar2 != null) {
                                                                                        nc0.s sVar6 = lVar2.b;
                                                                                        cVar52 = new jn.c(sVar6.b, str27, lVar2.a, sVar6.a.a);
                                                                                    } else {
                                                                                        nc0.m mVar2 = g0Var2.k;
                                                                                        if (mVar2 != null) {
                                                                                            aVar22 = new jn.d(str27, mVar2.c, mVar2.a.a);
                                                                                        } else {
                                                                                            nc0.n nVar2 = g0Var2.l;
                                                                                            if (nVar2 != null) {
                                                                                                aVar22 = new jn.d(str27, nVar2.a, nVar2.b);
                                                                                            } else {
                                                                                                nc0.o oVar22 = g0Var2.m;
                                                                                                if (oVar22 != null) {
                                                                                                    aVar22 = new jn.a(str27, oVar22.a);
                                                                                                } else {
                                                                                                    nc0.p pVar2 = g0Var2.n;
                                                                                                    if (pVar2 != null) {
                                                                                                        aVar22 = new jn.d(str27, pVar2.a, pVar2.b.a);
                                                                                                    } else {
                                                                                                        nc0.q qVar2 = g0Var2.o;
                                                                                                        if (qVar2 != null) {
                                                                                                            aVar22 = new jn.f(str27, qVar2.a, qVar2.b.a);
                                                                                                        } else {
                                                                                                            nc0.rShadow rVar9 = g0Var2.p;
                                                                                                            aVar22 = rVar9 != null ? new jn.a(str27, rVar9.a) : new jn.a(str27, "");
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            aVar22 = cVar52;
                                                        }
                                                    }
                                                    str4 = str21;
                                                } else {
                                                    i92 = i19;
                                                    str3 = str22;
                                                    str4 = str21;
                                                    aVar22 = new jn.a(str27, "");
                                                }
                                                arrayList7.add(aVar22);
                                                it5 = it6;
                                                i18 = i92;
                                                str22 = str3;
                                                str21 = str4;
                                            }
                                            it3 = it5;
                                            hVar22 = new h(str20, zonedDateTime2, str21, str22, str24, str26, arrayList7, eVar8.d);
                                        } else {
                                            it3 = it5;
                                            hVar22 = null;
                                        }
                                        if (hVar22 != null) {
                                            arrayList5.add(hVar22);
                                        }
                                        it5 = it3;
                                        i122 = 10;
                                    }
                                    rVar2 = new ArrayList();
                                    int size5 = arrayList5.size();
                                    int i21 = 0;
                                    while (i21 < size5) {
                                        Object obj6 = arrayList5.get(i21);
                                        i21++;
                                        h hVar8 = (h) obj6;
                                        if (!t71.p.T(hVar8.f) && !t71.p.T(hVar8.e)) {
                                            rVar2.add(obj6);
                                        }
                                    }
                                } else {
                                    rVar2 = null;
                                }
                                if (rVar2 != null) {
                                    rVar5 = rVar2;
                                }
                                lc0.g gVar7 = bVar9.b;
                                return new jn.i(rVar5.size(), rVar5, new i(gVar7.a, gVar7.b, gVar7.c));
                            case 16:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 17:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 18:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 19:
                                py0.p pVar3 = (py0.p) obj;
                                k71.k.g(pVar3, "repositoryIssueTypesParameters");
                                return new w(new u0(30), bVar7, pVar3.a, pVar3.b);
                            case 20:
                                py0.r rVar10 = (py0.r) obj;
                                k71.k.g(rVar10, "data");
                                v vVar2 = rVar10.a;
                                return Boolean.valueOf((vVar2 == null || (sVar = vVar2.a) == null || (list2 = sVar.b) == null) ? false : !list2.isEmpty());
                            case 21:
                                py0.r rVar11 = (py0.r) obj;
                                k71.k.g(rVar11, "data");
                                v vVar3 = rVar11.a;
                                if (vVar3 == null || (sVar2 = vVar3.a) == null || (uVar = sVar2.a) == null) {
                                    return null;
                                }
                                return new i(uVar.a, uVar.b, !uVar.c);
                            case 22:
                                py0.r rVar12 = (py0.r) obj;
                                k71.k.g(rVar12, "data");
                                v vVar4 = rVar12.a;
                                List list11 = (vVar4 == null || (sVar3 = vVar4.a) == null) ? null : sVar3.b;
                                return list11 == null ? rVar5 : list11;
                            case 23:
                                py0.r rVar13 = (py0.r) obj;
                                k71.k.g(rVar13, "data");
                                v vVar5 = rVar13.a;
                                if (vVar5 == null || (sVar4 = vVar5.a) == null) {
                                    return null;
                                }
                                u uVar3 = sVar4.a;
                                i iVar5 = new i(uVar3.a, uVar3.b, !uVar3.c);
                                List<py0.t> list12 = sVar4.b;
                                if (list12 != null) {
                                    rShadow arrayList8 = new ArrayList();
                                    for (py0.t tVar3 : list12) {
                                        IssueType k = (tVar3 == null || (aVar3 = tVar3.c) == null) ? null : aa1.b.k(aVar3);
                                        if (k != null) {
                                            arrayList8.add(k);
                                        }
                                    }
                                    rVar3 = arrayList8;
                                } else {
                                    rVar3 = null;
                                }
                                if (rVar3 != null) {
                                    rVar5 = rVar3;
                                }
                                return new u01.a(rVar5, iVar5);
                            case 24:
                                r71.e[] eVarArr = z.a;
                                ((c0) obj).a(x.e, a0Var);
                                return a0Var;
                            case 25:
                                q00.a aVar10 = (q00.a) obj;
                                k71.k.g(aVar10, "repositoryOwnerRepositoriesParameters");
                                String str31 = aVar10.a;
                                String str32 = aVar10.b;
                                return new bw.g(str31, bVar7, str32 == null ? bVar7 : new u0(str32));
                            case 26:
                                bw.b bVar10 = (bw.b) obj;
                                k71.k.g(bVar10, "data");
                                bw.f fVar8 = bVar10.a;
                                return Boolean.valueOf((fVar8 == null || (eVar2 = fVar8.b) == null || (list3 = eVar2.b) == null) ? false : !list3.isEmpty());
                            case 27:
                                bw.b bVar11 = (bw.b) obj;
                                k71.k.g(bVar11, "data");
                                bw.f fVar9 = bVar11.a;
                                if (fVar9 == null || (eVar3 = fVar9.b) == null || (dVar = eVar3.a) == null || (aVar4 = dVar.b) == null) {
                                    return null;
                                }
                                return new i(aVar4.a, aVar4.b, !aVar4.c);
                            case 28:
                                bw.b bVar12 = (bw.b) obj;
                                k71.k.g(bVar12, "data");
                                bw.f fVar10 = bVar12.a;
                                List list13 = (fVar10 == null || (eVar4 = fVar10.b) == null) ? null : eVar4.b;
                                return list13 == null ? rVar5 : list13;
                            default:
                                bw.b bVar13 = (bw.b) obj;
                                k71.k.g(bVar13, "data");
                                bw.f fVar11 = bVar13.a;
                                if (fVar11 == null || (eVar5 = fVar11.b) == null) {
                                    return null;
                                }
                                xx.a aVar11 = eVar5.a.b;
                                i iVar6 = new i(aVar11.a, aVar11.b, !aVar11.c);
                                List<bw.c> list14 = eVar5.b;
                                if (list14 != null) {
                                    rShadow arrayList9 = new ArrayList();
                                    for (bw.c cVar8 : list14) {
                                        SimpleRepository I = (cVar8 == null || (t5Var = cVar8.c) == null) ? null : sy.n.I(t5Var);
                                        if (I != null) {
                                            arrayList9.add(I);
                                        }
                                    }
                                    rVar4 = arrayList9;
                                } else {
                                    rVar4 = null;
                                }
                                if (rVar4 != null) {
                                    rVar5 = rVar4;
                                }
                                return new k4(rVar5, iVar6);
                        }
                    }
                };
                final int i14 = 29;
                this.w = new jy.d(jVar, bVar, vVar, cVar2, oVar4, oVar3, oVar5, cVar3, cVar4, cVar5, new j71.c() { // from class: oo.a
                    public final Object k(Object obj) {
                        f fVar;
                        ko.b bVar22;
                        g gVar2;
                        f fVar2;
                        ko.b bVar32;
                        rShadow rVar;
                        String str;
                        Iterator it;
                        h hVar2;
                        int i82;
                        String str2;
                        Iterator it2;
                        Object aVar2;
                        k kVar;
                        Object eVar;
                        Object cVar22;
                        c cVar32;
                        c cVar42;
                        lc0.f fVar3;
                        lc0.b bVar4;
                        List list;
                        lc0.f fVar4;
                        lc0.b bVar5;
                        lc0.g gVar22;
                        lc0.f fVar5;
                        lc0.b bVar6;
                        rShadow rVar2;
                        Iterator it3;
                        h hVar22;
                        int i92;
                        String str3;
                        String str4;
                        Object aVar22;
                        Object cVar52;
                        nc0.c cVar6;
                        nc0.c cVar7;
                        s sVar;
                        List list2;
                        s sVar2;
                        u uVar;
                        s sVar3;
                        s sVar4;
                        rShadow rVar3;
                        yr0.a aVar3;
                        e eVar2;
                        List list3;
                        e eVar3;
                        d dVar;
                        xx.a aVar4;
                        e eVar4;
                        e eVar5;
                        rShadow rVar4;
                        t5 t5Var;
                        int i112 = i14;
                        String str5 = "<this>";
                        int i122 = 10;
                        aa1.b bVar7 = t0.d;
                        a0Shadow a0Var = a0.a;
                        rShadow rVar5 = r.r;
                        switch (i112) {
                            case 0:
                                ko.d dVar2 = (ko.d) obj;
                                k71.k.g(dVar2, "data");
                                ko.k kVar2 = dVar2.a;
                                if (kVar2 == null || (fVar = kVar2.c) == null || (bVar22 = fVar.a) == null || (gVar2 = bVar22.b) == null) {
                                    return null;
                                }
                                return new i(gVar2.a, gVar2.b, !gVar2.c);
                            case 1:
                                ko.d dVar3 = (ko.d) obj;
                                k71.k.g(dVar3, "data");
                                ko.k kVar3 = dVar3.a;
                                List list4 = (kVar3 == null || (fVar2 = kVar3.c) == null || (bVar32 = fVar2.a) == null) ? null : bVar32.c;
                                return list4 == null ? rVar5 : list4;
                            case 2:
                                String str6 = null;
                                int i132 = 0;
                                ko.d dVar4 = (ko.d) obj;
                                k71.k.g(dVar4, "data");
                                ko.k kVar4 = dVar4.a;
                                if (kVar4 == null) {
                                    return null;
                                }
                                ko.b bVar8 = kVar4.c.a;
                                List list5 = bVar8.c;
                                if (list5 != null) {
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it4 = list5.iterator();
                                    while (it4.hasNext()) {
                                        ko.e eVar6 = (ko.e) it4.next();
                                        if (eVar6 != null) {
                                            String str7 = eVar6.b;
                                            ZonedDateTime zonedDateTime = eVar6.c;
                                            ko.a aVar5 = eVar6.e;
                                            String str8 = aVar5.a;
                                            String str9 = aVar5.b;
                                            ko.i iVar = eVar6.f;
                                            String str10 = iVar != null ? iVar.b : str6;
                                            String str11 = str10 == null ? "" : str10;
                                            String str12 = iVar != null ? iVar.c : str6;
                                            String str13 = str12 == null ? "" : str12;
                                            ArrayList arrayList2 = eVar6.g;
                                            ArrayList arrayList3 = new ArrayList(n.F(arrayList2, 10));
                                            int size = arrayList2.size();
                                            while (i132 < size) {
                                                Object obj2 = arrayList2.get(i132);
                                                int i142 = i132 + 1;
                                                ko.h hVar3 = (ko.h) obj2;
                                                k71.k.g(hVar3, str5);
                                                int i15 = size;
                                                String str14 = hVar3.b;
                                                j jVar2 = hVar3.a;
                                                if (jVar2 != null) {
                                                    h0 h0Var = jVar2.b;
                                                    i82 = i142;
                                                    mo.d dVar5 = h0Var.b;
                                                    if (dVar5 != null) {
                                                        List list6 = dVar5.a.a;
                                                        String str15 = (list6 == null || (cVar42 = (c) m.W(list6)) == null) ? null : cVar42.b;
                                                        if (str15 == null) {
                                                            str15 = "";
                                                        }
                                                        String str16 = (list6 == null || (cVar32 = (c) m.W(list6)) == null) ? null : cVar32.a;
                                                        if (str16 == null) {
                                                            str16 = "";
                                                        }
                                                        str2 = str5;
                                                        aVar2 = new jn.d(str14, str16, str15);
                                                        it2 = it4;
                                                    } else {
                                                        str2 = str5;
                                                        mo.e eVar7 = h0Var.c;
                                                        if (eVar7 != null) {
                                                            cVar22 = new jn.d(str14, eVar7.a, eVar7.b.a);
                                                            it2 = it4;
                                                        } else {
                                                            mo.f fVar6 = h0Var.d;
                                                            if (fVar6 != null) {
                                                                it2 = it4;
                                                                eVar = new jn.b(fVar6.b, str14, fVar6.a, fVar6.c.a);
                                                            } else {
                                                                it2 = it4;
                                                                mo.g gVar3 = h0Var.e;
                                                                if (gVar3 != null) {
                                                                    mo.a aVar6 = gVar3.b;
                                                                    String str17 = aVar6 != null ? aVar6.b.a : null;
                                                                    if (str17 == null) {
                                                                        str17 = "";
                                                                    }
                                                                    cVar22 = new jn.b(aVar6 != null ? aVar6.a : 0, str14, gVar3.a, str17);
                                                                } else {
                                                                    mo.h hVar4 = h0Var.f;
                                                                    if (hVar4 != null) {
                                                                        cVar22 = new jn.c(hVar4.c, str14, hVar4.a, hVar4.b.a);
                                                                    } else {
                                                                        mo.i iVar2 = h0Var.g;
                                                                        if (iVar2 != null) {
                                                                            cVar22 = new jn.c(iVar2.c.a, str14, iVar2.a, iVar2.b.a);
                                                                        } else {
                                                                            mo.k kVar5 = h0Var.h;
                                                                            if (kVar5 != null) {
                                                                                cVar22 = new jn.c(kVar5.b, str14, kVar5.c, kVar5.a.a);
                                                                            } else {
                                                                                l lVar = h0Var.i;
                                                                                if (lVar != null) {
                                                                                    mo.u uVar2 = lVar.b;
                                                                                    cVar22 = new jn.c(uVar2.b, str14, lVar.a, uVar2.a.a);
                                                                                } else {
                                                                                    mo.m mVar = h0Var.j;
                                                                                    if (mVar != null) {
                                                                                        t tVar = mVar.b;
                                                                                        cVar22 = new jn.c(tVar.b, str14, mVar.a, tVar.a.a);
                                                                                    } else {
                                                                                        mo.n nVar = h0Var.k;
                                                                                        if (nVar != null) {
                                                                                            eVar = new jn.d(str14, nVar.c, nVar.a.a);
                                                                                        } else {
                                                                                            o oVar32 = h0Var.l;
                                                                                            if (oVar32 != null) {
                                                                                                eVar = new jn.d(str14, oVar32.a, oVar32.b);
                                                                                            } else {
                                                                                                p pVar = h0Var.m;
                                                                                                if (pVar != null) {
                                                                                                    aVar2 = new jn.a(str14, pVar.a);
                                                                                                } else {
                                                                                                    q qVar = h0Var.n;
                                                                                                    if (qVar != null) {
                                                                                                        eVar = new jn.d(str14, qVar.a, qVar.b.a);
                                                                                                    } else {
                                                                                                        mo.rShadow rVar6 = h0Var.o;
                                                                                                        if (rVar6 != null) {
                                                                                                            g0 g0Var = rVar6.a;
                                                                                                            mo.s sVar5 = g0Var.b;
                                                                                                            if (sVar5 != null) {
                                                                                                                kVar = new k(sVar5.a, sVar5.b);
                                                                                                            } else {
                                                                                                                mo.j jVar3 = g0Var.c;
                                                                                                                String str18 = jVar3 != null ? jVar3.a : null;
                                                                                                                if (str18 == null) {
                                                                                                                    str18 = "";
                                                                                                                }
                                                                                                                String str19 = jVar3 != null ? jVar3.b : null;
                                                                                                                if (str19 == null) {
                                                                                                                    str19 = "";
                                                                                                                }
                                                                                                                kVar = new k(str18, str19);
                                                                                                            }
                                                                                                            eVar = new jn.e(str14, (String) kVar.s, (String) kVar.r);
                                                                                                        } else {
                                                                                                            aVar2 = new jn.a(str14, "");
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            aVar2 = eVar;
                                                        }
                                                        aVar2 = cVar22;
                                                    }
                                                } else {
                                                    i82 = i142;
                                                    str2 = str5;
                                                    it2 = it4;
                                                    aVar2 = new jn.a(str14, "");
                                                }
                                                arrayList3.add(aVar2);
                                                size = i15;
                                                i132 = i82;
                                                str5 = str2;
                                                it4 = it2;
                                            }
                                            str = str5;
                                            it = it4;
                                            hVar2 = new h(str7, zonedDateTime, str8, str9, str11, str13, arrayList3, eVar6.d);
                                        } else {
                                            str = str5;
                                            it = it4;
                                            hVar2 = null;
                                        }
                                        if (hVar2 != null) {
                                            arrayList.add(hVar2);
                                        }
                                        str5 = str;
                                        it4 = it;
                                        str6 = null;
                                        i132 = 0;
                                    }
                                    rVar = new ArrayList();
                                    int size2 = arrayList.size();
                                    int i16 = 0;
                                    while (i16 < size2) {
                                        Object obj3 = arrayList.get(i16);
                                        i16++;
                                        h hVar5 = (h) obj3;
                                        if (!t71.p.T(hVar5.f) && !t71.p.T(hVar5.e)) {
                                            rVar.add(obj3);
                                        }
                                    }
                                } else {
                                    rVar = null;
                                }
                                if (rVar != null) {
                                    rVar5 = rVar;
                                }
                                g gVar4 = bVar8.b;
                                return new jn.i(rVar5.size(), rVar5, new i(gVar4.a, gVar4.b, gVar4.c));
                            case 3:
                                p8.k kVar6 = (p8.k) obj;
                                k71.k.g(kVar6, "it");
                                return kVar6;
                            case 4:
                                pb0.g gVar5 = (pb0.g) obj;
                                k71.k.g(gVar5, "repositoryOwnerRepositoriesParameters");
                                nq f0 = m71.a.f0(gVar5.a);
                                if (f0 != null) {
                                    bVar7 = new u0(f0);
                                }
                                return new i10(null, bVar7, 10);
                            case 5:
                                d10 d10Var = (d10) obj;
                                k71.k.g(d10Var, "data");
                                return Boolean.valueOf(d10Var.a.a.b != null ? !r0.isEmpty() : false);
                            case 6:
                                d10 d10Var2 = (d10) obj;
                                k71.k.g(d10Var2, "data");
                                f10 f10Var = d10Var2.a.a.a;
                                return new i(f10Var.b, f10Var.a, !f10Var.c);
                            case 7:
                                d10 d10Var3 = (d10) obj;
                                k71.k.g(d10Var3, "data");
                                List list7 = d10Var3.a.a.b;
                                return list7 == null ? rVar5 : list7;
                            case 8:
                                d10 d10Var4 = (d10) obj;
                                k71.k.g(d10Var4, "data");
                                g10 g10Var = d10Var4.a.a;
                                rShadow rVar7 = g10Var.b;
                                if (rVar7 != null) {
                                    rVar5 = rVar7;
                                }
                                ArrayList S = m.S(rVar5);
                                ArrayList arrayList4 = new ArrayList(n.F(S, 10));
                                int size3 = S.size();
                                int i17 = 0;
                                while (i17 < size3) {
                                    Object obj4 = S.get(i17);
                                    i17++;
                                    e10 e10Var = (e10) obj4;
                                    q3 q3Var = e10Var.f;
                                    p3 p3Var = q3Var.d;
                                    arrayList4.add(new pb0.h(new t7(q3Var.a, q3Var.b, p3Var.c, t.q.q(p3Var.d), new bb0.j(e10Var.g), q3Var.c), e10Var.d, e10Var.b, e10Var.c));
                                }
                                f10 f10Var2 = g10Var.a;
                                return new pb0.f(arrayList4, new i(f10Var2.b, f10Var2.a, !f10Var2.c));
                            case 9:
                                w1.r rVar8 = (w1.r) obj;
                                k71.k.g(rVar8, "$this$applyIf");
                                return androidx.compose.foundation.layout.b.B(rVar8, ih.a.l, 0.0f, 0.0f, 0.0f, 14);
                            case 10:
                                c0 c0Var = (c0) obj;
                                k71.k.g(c0Var, "$this$semantics");
                                z.l(c0Var, 0);
                                return a0Var;
                            case 11:
                                pc0.a aVar7 = (pc0.a) obj;
                                k71.k.g(aVar7, "userAchievementsParameters");
                                return new lc0.l(aVar7.a, new u0(30), bVar7);
                            case 12:
                                lc0.d dVar6 = (lc0.d) obj;
                                k71.k.g(dVar6, "data");
                                lc0.k kVar7 = dVar6.a;
                                return Boolean.valueOf((kVar7 == null || (fVar3 = kVar7.c) == null || (bVar4 = fVar3.a) == null || (list = bVar4.c) == null) ? false : !list.isEmpty());
                            case 13:
                                lc0.d dVar7 = (lc0.d) obj;
                                k71.k.g(dVar7, "data");
                                lc0.k kVar8 = dVar7.a;
                                if (kVar8 == null || (fVar4 = kVar8.c) == null || (bVar5 = fVar4.a) == null || (gVar22 = bVar5.b) == null) {
                                    return null;
                                }
                                return new i(gVar22.a, gVar22.b, !gVar22.c);
                            case 14:
                                lc0.d dVar8 = (lc0.d) obj;
                                k71.k.g(dVar8, "data");
                                lc0.k kVar9 = dVar8.a;
                                List list8 = (kVar9 == null || (fVar5 = kVar9.c) == null || (bVar6 = fVar5.a) == null) ? null : bVar6.c;
                                return list8 == null ? rVar5 : list8;
                            case 15:
                                lc0.d dVar9 = (lc0.d) obj;
                                k71.k.g(dVar9, "data");
                                lc0.k kVar10 = dVar9.a;
                                if (kVar10 == null) {
                                    return null;
                                }
                                lc0.b bVar9 = kVar10.c.a;
                                List list9 = bVar9.c;
                                if (list9 != null) {
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator it5 = list9.iterator();
                                    while (it5.hasNext()) {
                                        lc0.e eVar8 = (lc0.e) it5.next();
                                        if (eVar8 != null) {
                                            String str20 = eVar8.b;
                                            ZonedDateTime zonedDateTime2 = eVar8.c;
                                            lc0.a aVar8 = eVar8.e;
                                            String str21 = aVar8.a;
                                            String str22 = aVar8.b;
                                            lc0.i iVar3 = eVar8.f;
                                            String str23 = iVar3 != null ? iVar3.b : null;
                                            String str24 = str23 == null ? "" : str23;
                                            String str25 = iVar3 != null ? iVar3.c : null;
                                            String str26 = str25 == null ? "" : str25;
                                            ArrayList arrayList6 = eVar8.g;
                                            ArrayList arrayList7 = new ArrayList(n.F(arrayList6, i122));
                                            int size4 = arrayList6.size();
                                            int i18 = 0;
                                            while (i18 < size4) {
                                                Object obj5 = arrayList6.get(i18);
                                                int i19 = i18 + 1;
                                                lc0.h hVar6 = (lc0.h) obj5;
                                                k71.k.g(hVar6, "<this>");
                                                Iterator it6 = it5;
                                                String str27 = hVar6.b;
                                                lc0.j jVar4 = hVar6.a;
                                                if (jVar4 != null) {
                                                    nc0.g0 g0Var2 = jVar4.b;
                                                    i92 = i19;
                                                    nc0.d dVar10 = g0Var2.b;
                                                    if (dVar10 != null) {
                                                        List list10 = dVar10.a.a;
                                                        String str28 = (list10 == null || (cVar7 = (nc0.c) m.W(list10)) == null) ? null : cVar7.b;
                                                        if (str28 == null) {
                                                            str28 = "";
                                                        }
                                                        String str29 = (list10 == null || (cVar6 = (nc0.c) m.W(list10)) == null) ? null : cVar6.a;
                                                        if (str29 == null) {
                                                            str29 = "";
                                                        }
                                                        str3 = str22;
                                                        aVar22 = new jn.d(str27, str29, str28);
                                                    } else {
                                                        str3 = str22;
                                                        nc0.e eVar9 = g0Var2.c;
                                                        if (eVar9 != null) {
                                                            aVar22 = new jn.d(str27, eVar9.a, eVar9.b.a);
                                                        } else {
                                                            nc0.f fVar7 = g0Var2.d;
                                                            if (fVar7 != null) {
                                                                str4 = str21;
                                                                cVar52 = new jn.b(fVar7.b, str27, fVar7.a, fVar7.c.a);
                                                            } else {
                                                                str4 = str21;
                                                                nc0.g gVar6 = g0Var2.e;
                                                                if (gVar6 != null) {
                                                                    nc0.a aVar9 = gVar6.b;
                                                                    String str30 = aVar9 != null ? aVar9.b.a : null;
                                                                    if (str30 == null) {
                                                                        str30 = "";
                                                                    }
                                                                    cVar52 = new jn.b(aVar9 != null ? aVar9.a : 0, str27, gVar6.a, str30);
                                                                } else {
                                                                    nc0.h hVar7 = g0Var2.f;
                                                                    if (hVar7 != null) {
                                                                        cVar52 = new jn.c(hVar7.c, str27, hVar7.a, hVar7.b.a);
                                                                    } else {
                                                                        nc0.i iVar4 = g0Var2.g;
                                                                        if (iVar4 != null) {
                                                                            cVar52 = new jn.c(iVar4.c.a, str27, iVar4.a, iVar4.b.a);
                                                                        } else {
                                                                            nc0.j jVar5 = g0Var2.h;
                                                                            if (jVar5 != null) {
                                                                                cVar52 = new jn.c(jVar5.b, str27, jVar5.c, jVar5.a.a);
                                                                            } else {
                                                                                nc0.k kVar11 = g0Var2.i;
                                                                                if (kVar11 != null) {
                                                                                    nc0.t tVar2 = kVar11.b;
                                                                                    cVar52 = new jn.c(tVar2.b, str27, kVar11.a, tVar2.a.a);
                                                                                } else {
                                                                                    nc0.l lVar2 = g0Var2.j;
                                                                                    if (lVar2 != null) {
                                                                                        nc0.s sVar6 = lVar2.b;
                                                                                        cVar52 = new jn.c(sVar6.b, str27, lVar2.a, sVar6.a.a);
                                                                                    } else {
                                                                                        nc0.m mVar2 = g0Var2.k;
                                                                                        if (mVar2 != null) {
                                                                                            aVar22 = new jn.d(str27, mVar2.c, mVar2.a.a);
                                                                                        } else {
                                                                                            nc0.n nVar2 = g0Var2.l;
                                                                                            if (nVar2 != null) {
                                                                                                aVar22 = new jn.d(str27, nVar2.a, nVar2.b);
                                                                                            } else {
                                                                                                nc0.o oVar22 = g0Var2.m;
                                                                                                if (oVar22 != null) {
                                                                                                    aVar22 = new jn.a(str27, oVar22.a);
                                                                                                } else {
                                                                                                    nc0.p pVar2 = g0Var2.n;
                                                                                                    if (pVar2 != null) {
                                                                                                        aVar22 = new jn.d(str27, pVar2.a, pVar2.b.a);
                                                                                                    } else {
                                                                                                        nc0.q qVar2 = g0Var2.o;
                                                                                                        if (qVar2 != null) {
                                                                                                            aVar22 = new jn.f(str27, qVar2.a, qVar2.b.a);
                                                                                                        } else {
                                                                                                            nc0.rShadow rVar9 = g0Var2.p;
                                                                                                            aVar22 = rVar9 != null ? new jn.a(str27, rVar9.a) : new jn.a(str27, "");
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            aVar22 = cVar52;
                                                        }
                                                    }
                                                    str4 = str21;
                                                } else {
                                                    i92 = i19;
                                                    str3 = str22;
                                                    str4 = str21;
                                                    aVar22 = new jn.a(str27, "");
                                                }
                                                arrayList7.add(aVar22);
                                                it5 = it6;
                                                i18 = i92;
                                                str22 = str3;
                                                str21 = str4;
                                            }
                                            it3 = it5;
                                            hVar22 = new h(str20, zonedDateTime2, str21, str22, str24, str26, arrayList7, eVar8.d);
                                        } else {
                                            it3 = it5;
                                            hVar22 = null;
                                        }
                                        if (hVar22 != null) {
                                            arrayList5.add(hVar22);
                                        }
                                        it5 = it3;
                                        i122 = 10;
                                    }
                                    rVar2 = new ArrayList();
                                    int size5 = arrayList5.size();
                                    int i21 = 0;
                                    while (i21 < size5) {
                                        Object obj6 = arrayList5.get(i21);
                                        i21++;
                                        h hVar8 = (h) obj6;
                                        if (!t71.p.T(hVar8.f) && !t71.p.T(hVar8.e)) {
                                            rVar2.add(obj6);
                                        }
                                    }
                                } else {
                                    rVar2 = null;
                                }
                                if (rVar2 != null) {
                                    rVar5 = rVar2;
                                }
                                lc0.g gVar7 = bVar9.b;
                                return new jn.i(rVar5.size(), rVar5, new i(gVar7.a, gVar7.b, gVar7.c));
                            case 16:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 17:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 18:
                                k71.k.g((c0) obj, "$this$clearAndSetSemantics");
                                return a0Var;
                            case 19:
                                py0.p pVar3 = (py0.p) obj;
                                k71.k.g(pVar3, "repositoryIssueTypesParameters");
                                return new w(new u0(30), bVar7, pVar3.a, pVar3.b);
                            case 20:
                                py0.r rVar10 = (py0.r) obj;
                                k71.k.g(rVar10, "data");
                                v vVar2 = rVar10.a;
                                return Boolean.valueOf((vVar2 == null || (sVar = vVar2.a) == null || (list2 = sVar.b) == null) ? false : !list2.isEmpty());
                            case 21:
                                py0.r rVar11 = (py0.r) obj;
                                k71.k.g(rVar11, "data");
                                v vVar3 = rVar11.a;
                                if (vVar3 == null || (sVar2 = vVar3.a) == null || (uVar = sVar2.a) == null) {
                                    return null;
                                }
                                return new i(uVar.a, uVar.b, !uVar.c);
                            case 22:
                                py0.r rVar12 = (py0.r) obj;
                                k71.k.g(rVar12, "data");
                                v vVar4 = rVar12.a;
                                List list11 = (vVar4 == null || (sVar3 = vVar4.a) == null) ? null : sVar3.b;
                                return list11 == null ? rVar5 : list11;
                            case 23:
                                py0.r rVar13 = (py0.r) obj;
                                k71.k.g(rVar13, "data");
                                v vVar5 = rVar13.a;
                                if (vVar5 == null || (sVar4 = vVar5.a) == null) {
                                    return null;
                                }
                                u uVar3 = sVar4.a;
                                i iVar5 = new i(uVar3.a, uVar3.b, !uVar3.c);
                                List<py0.t> list12 = sVar4.b;
                                if (list12 != null) {
                                    rShadow arrayList8 = new ArrayList();
                                    for (py0.t tVar3 : list12) {
                                        IssueType k = (tVar3 == null || (aVar3 = tVar3.c) == null) ? null : aa1.b.k(aVar3);
                                        if (k != null) {
                                            arrayList8.add(k);
                                        }
                                    }
                                    rVar3 = arrayList8;
                                } else {
                                    rVar3 = null;
                                }
                                if (rVar3 != null) {
                                    rVar5 = rVar3;
                                }
                                return new u01.a(rVar5, iVar5);
                            case 24:
                                r71.e[] eVarArr = z.a;
                                ((c0) obj).a(x.e, a0Var);
                                return a0Var;
                            case 25:
                                q00.a aVar10 = (q00.a) obj;
                                k71.k.g(aVar10, "repositoryOwnerRepositoriesParameters");
                                String str31 = aVar10.a;
                                String str32 = aVar10.b;
                                return new bw.g(str31, bVar7, str32 == null ? bVar7 : new u0(str32));
                            case 26:
                                bw.b bVar10 = (bw.b) obj;
                                k71.k.g(bVar10, "data");
                                bw.f fVar8 = bVar10.a;
                                return Boolean.valueOf((fVar8 == null || (eVar2 = fVar8.b) == null || (list3 = eVar2.b) == null) ? false : !list3.isEmpty());
                            case 27:
                                bw.b bVar11 = (bw.b) obj;
                                k71.k.g(bVar11, "data");
                                bw.f fVar9 = bVar11.a;
                                if (fVar9 == null || (eVar3 = fVar9.b) == null || (dVar = eVar3.a) == null || (aVar4 = dVar.b) == null) {
                                    return null;
                                }
                                return new i(aVar4.a, aVar4.b, !aVar4.c);
                            case 28:
                                bw.b bVar12 = (bw.b) obj;
                                k71.k.g(bVar12, "data");
                                bw.f fVar10 = bVar12.a;
                                List list13 = (fVar10 == null || (eVar4 = fVar10.b) == null) ? null : eVar4.b;
                                return list13 == null ? rVar5 : list13;
                            default:
                                bw.b bVar13 = (bw.b) obj;
                                k71.k.g(bVar13, "data");
                                bw.f fVar11 = bVar13.a;
                                if (fVar11 == null || (eVar5 = fVar11.b) == null) {
                                    return null;
                                }
                                xx.a aVar11 = eVar5.a.b;
                                i iVar6 = new i(aVar11.a, aVar11.b, !aVar11.c);
                                List<bw.c> list14 = eVar5.b;
                                if (list14 != null) {
                                    rShadow arrayList9 = new ArrayList();
                                    for (bw.c cVar8 : list14) {
                                        SimpleRepository I = (cVar8 == null || (t5Var = cVar8.c) == null) ? null : sy.n.I(t5Var);
                                        if (I != null) {
                                            arrayList9.add(I);
                                        }
                                    }
                                    rVar4 = arrayList9;
                                } else {
                                    rVar4 = null;
                                }
                                if (rVar4 != null) {
                                    rVar5 = rVar4;
                                }
                                return new k4(rVar5, iVar6);
                        }
                    }
                }, null, null, 126976);
                q00.c cVar6 = new q00.c(0);
                py0.o oVar6 = new py0.o(4);
                py0.o oVar7 = new py0.o(5);
                q00.c cVar7 = new q00.c(1);
                q00.c cVar8 = new q00.c(2);
                q00.c cVar9 = new q00.c(3);
                q00.c cVar10 = new q00.c(4);
                ga.h hVar2 = ga.h.r;
                this.x = new jy.d(jVar, bVar, vVar, cVar6, oVar6, oVar3, oVar7, cVar7, cVar8, cVar9, cVar10, null, null, 63488);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r0.p(r5, r4, r6, r1) == r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r5 == r7) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object M(c9 c9Var, String str, c71.c cVar) {
        v8Shadow v8Var;
        int i;
        dw.k7 k7Var;
        com.github.service.wrapper.b bVar = c9Var.t;
        if (cVar instanceof v8Shadow) {
            v8Var = (v8Shadow) cVar;
            int i2 = v8Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v8Var.w = i2 - Integer.MIN_VALUE;
                Object obj = v8Var.u;
                b71.a aVar = b71.a.r;
                i = v8Var.w;
                if (i != 0) {
                    sy.y.j(obj);
                    dw.m7 m7Var = new dw.m7();
                    v8Var.w = 1;
                    obj = bVar.c(m7Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    sy.y.j(obj);
                }
                k7Var = (dw.k7) obj;
                if (k7Var != null) {
                    String str2 = k7Var.a;
                    dw.k7 k7Var2 = new dw.k7(str2, new dw.i7(x61.rShadow.r), k7Var.c);
                    dw.m7 m7Var2 = new dw.m7();
                    v8Var.w = 2;
                }
                return w61.a0.a;
            }
        }
        v8Var = new v8Shadow(c9Var, cVar);
        Object obj2 = v8Var.u;
        b71.a aVar2 = b71.a.r;
        i = v8Var.w;
        if (i != 0) {
        }
        k7Var = (dw.k7) obj2;
        if (k7Var != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r0.p(r5, r4, r6, r1) == r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r5 == r7) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object N(c9 c9Var, String str, c71.c cVar) {
        wy0.s7 s7Var;
        int i;
        uu0.o6 o6Var;
        com.github.service.wrapper.b bVar = c9Var.t;
        if (cVar instanceof wy0.s7) {
            s7Var = (wy0.s7) cVar;
            int i2 = s7Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s7Var.w = i2 - Integer.MIN_VALUE;
                Object obj = s7Var.u;
                b71.a aVar = b71.a.r;
                i = s7Var.w;
                if (i != 0) {
                    sy.y.j(obj);
                    uu0.q6 q6Var = new uu0.q6();
                    s7Var.w = 1;
                    obj = bVar.c(q6Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    sy.y.j(obj);
                }
                o6Var = (uu0.o6) obj;
                if (o6Var != null) {
                    String str2 = o6Var.a;
                    uu0.o6 o6Var2 = new uu0.o6(str2, new uu0.m6(x61.rShadow.r), o6Var.c);
                    uu0.q6 q6Var2 = new uu0.q6();
                    s7Var.w = 2;
                }
                return w61.a0.a;
            }
        }
        s7Var = new wy0.s7(c9Var, cVar);
        Object obj2 = s7Var.u;
        b71.a aVar2 = b71.a.r;
        i = s7Var.w;
        if (i != 0) {
        }
        o6Var = (uu0.o6) obj2;
        if (o6Var != null) {
        }
        return w61.a0.a;
    }

    public final y71.i A(v01.d dVar, com.github.rudroid.common.i0 i0Var) {
        switch (this.r) {
            case 0:
                k71.k.g(dVar, "filterType");
                k71.k.g(i0Var, "filter");
                return new rm0.q8(((jy.d) this.x).e(new q00.d(dVar)), i0Var, 1);
            default:
                k71.k.g(dVar, "filterType");
                k71.k.g(i0Var, "filter");
                return new rm0.q8(this.x.e(new ty0.c(dVar)), i0Var, 3);
        }
    }

    public final y71.i B(String str, String str2, v01.d dVar, String str3, v01.c cVar, String str4) {

        aa.u0 u0Var = null;

        Object u0Var2 = null;
        j40 j40Var;
        ly lyVar;
        switch (this.r) {
            case 0:
                k71.k.g(str, "userLogin");
                aa.u0 u0Var = aa.t0.d;
                aa.u0 u0Var2 = str2 == null ? u0Var : new aa.u0(str2);
                x40 P = aa1.b.P(dVar);
                aa.u0 u0Var3 = P == null ? u0Var : new aa.u0(P);
                if (str3 != null) {
                    u0Var = new aa.u0(str3);
                }
                int ordinal = cVar.r.ordinal();
                if (ordinal == 0) {
                    j40Var = j40.s;
                } else if (ordinal == 1) {
                    j40Var = j40.t;
                } else if (ordinal == 2) {
                    j40Var = j40.u;
                } else if (ordinal == 3) {
                    j40Var = j40.v;
                } else {
                    if (ordinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j40Var = j40.w;
                }
                return y71.n1Shadow.y(new q6(new y00.l(com.github.service.wrapper.a.o(this.s, new iz(str, new aa.u0(str4), u0Var2, u0Var3, u0Var, new aa.u0(j40Var), new aa.u0(m7.y.J(cVar.s))), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), 8), this.u);
            default:
                k71.k.g(str, "userLogin");
                aa.u0 u0Var4 = aa.t0.d;
                aa.u0 u0Var5 = str2 == null ? u0Var4 : new aa.u0(str2);
                zy j0 = com.google.android.gms.internal.measurement.b4.j0(dVar);
                aa.u0 u0Var6 = j0 == null ? u0Var4 : new aa.u0(j0);
                if (str3 != null) {
                    u0Var4 = new aa.u0(str3);
                }
                int ordinal2 = cVar.r.ordinal();
                if (ordinal2 == 0) {
                    lyVar = ly.s;
                } else if (ordinal2 == 1) {
                    lyVar = ly.t;
                } else if (ordinal2 == 2) {
                    lyVar = ly.u;
                } else if (ordinal2 == 3) {
                    lyVar = ly.v;
                } else {
                    if (ordinal2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lyVar = ly.w;
                }
                return y71.n1Shadow.y(new wy0.s6(new y00.l(com.github.service.wrapper.a.o(this.s, new hx(str, new aa.u0(str4), u0Var5, u0Var6, u0Var4, new aa.u0(lyVar), new aa.u0(y41.t1.N(cVar.s))), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), 2), this.u);
        }
    }

    public final y71.i C(String str, String str2, String str3, boolean z) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str3, "qualifiedName");
                return y71.n1Shadow.y(new f8(0, new q6(new y00.l(com.github.service.wrapper.a.o(this.s, new q30(str, str2, z, aa.t0.d, str3), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 9)), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str3, "qualifiedName");
                return y71.n1Shadow.y(new f8(14, new wy0.s6(new y00.l(com.github.service.wrapper.a.o(this.s, new q10(str, str2, z, aa.t0.d, str3), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 3)), this.u);
        }
    }

    public final y71.i D(String str) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(new q6(new y00.l(com.github.service.wrapper.a.o(this.s, new b70(str == null ? aa.t0.d : new aa.u0(str)), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), 11), this.u);
            default:
                return y71.n1Shadow.y(new wy0.s6(new y00.l(com.github.service.wrapper.a.o(this.s, new b50(str == null ? aa.t0.d : new aa.u0(str)), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), 5), this.u);
        }
    }

    public final y71.i E(String str, String str2, String str3, w01.a aVar, String str4, boolean z) {
        z40 z40Var;
        bz bzVar;
        switch (this.r) {
            case 0:
                k71.k.g(str, "repositoryId");
                k71.k.g(str3, "ownerId");
                int ordinal = aVar.ordinal();
                if (ordinal == 0) {
                    z40Var = z40.t;
                } else if (ordinal == 1) {
                    z40Var = z40.u;
                } else {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z40Var = z40.s;
                }
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.s.d(new jo.e5(str, str2, str3, z40Var, str4 == null ? aa.t0.d : new aa.u0(str4), z)))), this.u);
            default:
                k71.k.g(str, "repositoryId");
                k71.k.g(str3, "ownerId");
                int ordinal2 = aVar.ordinal();
                if (ordinal2 == 0) {
                    bzVar = bz.t;
                } else if (ordinal2 == 1) {
                    bzVar = bz.u;
                } else {
                    if (ordinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bzVar = bz.s;
                }
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.s.d(new jn0.v4(str, str2, str3, bzVar, str4 == null ? aa.t0.d : new aa.u0(str4), z)))), this.u);
        }
    }

    public final y71.i F(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1Shadow.y(new h7(com.github.service.wrapper.a.o(this.s, new a30(aa.t0.d, str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 4), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1Shadow.y(new wy0.d6(com.github.service.wrapper.a.o(this.s, new a10(aa.t0.d, str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 7), this.u);
        }
    }

    public final y71.i G(v01.d dVar) {
        switch (this.r) {
            case 0:
                k71.k.g(dVar, "filterType");
                return ((jy.d) this.x).b(new q00.d(dVar));
            default:
                k71.k.g(dVar, "filterType");
                return this.x.b(new ty0.c(dVar));
        }
    }

    public final y71.i H(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1Shadow.y(new h7(com.github.service.wrapper.a.o(this.t, new qi0(str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 11), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1Shadow.y(new wy0.d6(com.github.service.wrapper.a.o(this.t, new cg0(str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 14), this.u);
        }
    }

    public final y71.i I(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1Shadow.y(new h7(com.github.service.wrapper.a.o(this.s, new d20(str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1Shadow.y(new wy0.d6(com.github.service.wrapper.a.o(this.s, new d00(str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 13), this.u);
        }
    }

    public final y71.i J(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "id");
                return y71.n1Shadow.y(new q6(new y00.l(com.github.service.wrapper.a.o(this.s, new sx(new aa.u0(str2), str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), 6), this.u);
            default:
                k71.k.g(str, "id");
                return y71.n1Shadow.y(new wy0.s6(new y00.l(com.github.service.wrapper.a.o(this.s, new vv(new aa.u0(str2), str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), 0), this.u);
        }
    }

    public final y71.i K(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "userLogin");
                k71.k.g(str2, "query");
                return y71.n1Shadow.y(new q6(new y00.l(com.github.service.wrapper.a.o(this.s, new w70(new aa.u0(str2), str3 == null ? aa.t0.d : new aa.u0(str3), str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), 12), this.u);
            default:
                k71.k.g(str, "userLogin");
                k71.k.g(str2, "query");
                return y71.n1Shadow.y(new wy0.s6(new y00.l(com.github.service.wrapper.a.o(this.s, new n50(new aa.u0(str2), str3 == null ? aa.t0.d : new aa.u0(str3), str), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), 6), this.u);
        }
    }

    public final y71.i L(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                aa1.b bVar = aa.t0.d;
                return y71.n1Shadow.y(in.rShadow.l(com.github.service.wrapper.a.o(this.t, new gy(str3 == null ? bVar : new aa.u0(str3), bVar, str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62)), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                aa1.b bVar2 = aa.t0.d;
                return y71.n1Shadow.y(in.rShadow.l(com.github.service.wrapper.a.o(this.t, new fw(str3 == null ? bVar2 : new aa.u0(str3), bVar2, str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62)), this.u);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object O(String str, boolean z, c71.c cVar) {
        wy0.o7 o7Var;
        int i;
        uu0.u4 u4Var;
        if (cVar instanceof wy0.o7) {
            o7Var = (wy0.o7) cVar;
            int i2 = o7Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o7Var.x = i2 - Integer.MIN_VALUE;
                Object obj = o7Var.v;
                b71.a aVar = b71.a.r;
                i = o7Var.x;
                if (i != 0) {
                    sy.y.j(obj);
                    o7Var.u = z;
                    o7Var.x = 1;
                    obj = this.t.c(new uu0.w4(), str);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = o7Var.u;
                    sy.y.j(obj);
                }
                u4Var = (uu0.u4) obj;
                if (u4Var == null) {
                    return new uu0.u4(u4Var.c + (z ? 1 : -1), u4Var.a, u4Var.b, z);
                }
                return null;
            }
        }
        o7Var = new wy0.o7(this, cVar);
        Object obj2 = o7Var.v;
        b71.a aVar2 = b71.a.r;
        i = o7Var.x;
        if (i != 0) {
        }
        u4Var = (uu0.u4) obj2;
        if (u4Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object P(String str, boolean z, c71.c cVar) {
        q8 q8Var;
        int i;
        dw.o5 o5Var;
        if (cVar instanceof q8) {
            q8Var = (q8) cVar;
            int i2 = q8Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q8Var.x = i2 - Integer.MIN_VALUE;
                Object obj = q8Var.v;
                b71.a aVar = b71.a.r;
                i = q8Var.x;
                if (i != 0) {
                    sy.y.j(obj);
                    q8Var.u = z;
                    q8Var.x = 1;
                    obj = this.t.c(new dw.q5(), str);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = q8Var.u;
                    sy.y.j(obj);
                }
                o5Var = (dw.o5) obj;
                if (o5Var == null) {
                    return new dw.o5(o5Var.c + (z ? 1 : -1), o5Var.a, o5Var.b, z);
                }
                return null;
            }
        }
        q8Var = new q8(this, cVar);
        Object obj2 = q8Var.v;
        b71.a aVar2 = b71.a.r;
        i = q8Var.x;
        if (i != 0) {
        }
        o5Var = (dw.o5) obj2;
        if (o5Var == null) {
        }
    }

    public final Object a(S

        Object u0Var = null;

        Object u0Var2 = null;tring str, v01.d dVar, com.github.rudroid.common.i0 i0Var) {
        switch (this.r) {
            case 0:
                aa1.b bVar = aa.t0.d;
                aa1.b u0Var = str == null ? bVar : new aa.u0(str);
                x40 P = aa1.b.P(dVar);
                if (P != null) {
                    bVar = new aa.u0(P);
                }
                return y71.n1Shadow.y(new rm0.j8(new y00.l(com.github.service.wrapper.a.o(this.s, new m90(u0Var, bVar, 8), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), i0Var, 2), this.u);
            default:
                aa1.b bVar2 = aa.t0.d;
                aa1.b u0Var2 = str == null ? bVar2 : new aa.u0(str);
                zy j0 = com.google.android.gms.internal.measurement.b4.j0(dVar);
                if (j0 != null) {
                    bVar2 = new aa.u0(j0);
                }
                return y71.n1Shadow.y(new rm0.j8(new y00.l(com.github.service.wrapper.a.o(this.s, new z60(u0Var2, bVar2, 8), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), i0Var, 6), this.u);
        }
    }

    public final y71.i b(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return ((jy.d) this.v).e(new m00.o(str, str2));
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return ((jy.d) this.v).e(new py0.p(str, str2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0116  */
    /*
        Code decompiled incorrectly, please refe
        Object xxVar = null;
        Object awVar = null;
        Object u0Var = null;
        Object u0Var2 = null;r to instructions dump.
    */
    public final Object c(String str, String str2, String str3, String str4, a71.c cVar) {
        z7 z7Var;
        int i;
        gy gyVar;
        Object f;
        fy fyVar;
        wy0.z6Shadow z6Var;
        int i2;
        fw fwVar;
        Object f2;
        ew ewVar;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        switch (this.r) {
            case 0:
                if (cVar instanceof z7) {
                    z7Var = (z7) cVar;
                    int i3 = z7Var.B;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        z7Var.B = i3 - Integer.MIN_VALUE;
                        Object obj = z7Var.z;
                        b71.a aVar = b71.a.r;
                        i = z7Var.B;
                        aa1.b bVar = aa.t0.d;
                        if (i != 0) {
                            sy.y.j(obj);
                            gyVar = new gy(str7 == null ? bVar : new aa.u0(str7), bVar, str5, str6);
                            z7Var.u = str5;
                            z7Var.v = str6;
                            z7Var.w = str7;
                            z7Var.x = str8;
                            z7Var.y = gyVar;
                            z7Var.B = 1;
                            f = this.t.f(gyVar);
                            if (f == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            gy gyVar2 = z7Var.y;
                            String str9 = z7Var.x;
                            str7 = z7Var.w;
                            String str10 = z7Var.v;
                            String str11 = z7Var.u;
                            sy.y.j(obj);
                            gyVar = gyVar2;
                            str5 = str11;
                            f = obj;
                            str8 = str9;
                            str6 = str10;
                        }
                        ux uxVar = (ux) f;
                        a71.c cVar2 = null;
                        xx xxVar = (uxVar != null || (fyVar = uxVar.a) == null) ? null : fyVar.b;
                        aa1.b u0Var = str7 != null ? bVar : new aa.u0(str7);
                        if (str8 != null) {
                            bVar = new aa.u0(str8);
                        }
                        return y71.n1Shadow.y(in.rShadow.l(new y71.y(new rm0.r3(7, com.github.service.wrapper.a.o(this.s, new gy(u0Var, bVar, str5, str6), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), xxVar), new z1(this, gyVar, cVar2, 5), 6)), this.u);
                    }
                }
                z7Var = new z7(this, (c71.c) cVar);
                Object obj2 = z7Var.z;
                b71.a aVar2 = b71.a.r;
                i = z7Var.B;
                aa1.b bVar2 = aa.t0.d;
                if (i != 0) {
                }
                ux uxVar2 = (ux) f;
                a71.c cVar22 = null;
                if (uxVar2 != null) {
                }
                if (str7 != null) {
                }
                if (str8 != null) {
                }
                return y71.n1Shadow.y(in.rShadow.l(new y71.y(new rm0.r3(7, com.github.service.wrapper.a.o(this.s, new gy(u0Var, bVar2, str5, str6), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), xxVar), new z1(this, gyVar, cVar22, 5), 6)), this.u);
            default:
                if (cVar instanceof wy0.z6Shadow) {
                    z6Var = (wy0.z6Shadow) cVar;
                    int i4 = z6Var.B;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        z6Var.B = i4 - Integer.MIN_VALUE;
                        Object obj3 = z6Var.z;
                        b71.a aVar3 = b71.a.r;
                        i2 = z6Var.B;
                        aa1.b bVar3 = aa.t0.d;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            fwVar = new fw(str7 == null ? bVar3 : new aa.u0(str7), bVar3, str5, str6);
                            z6Var.u = str5;
                            z6Var.v = str6;
                            z6Var.w = str7;
                            z6Var.x = str8;
                            z6Var.y = fwVar;
                            z6Var.B = 1;
                            f2 = this.t.f(fwVar);
                            if (f2 == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fw fwVar2 = z6Var.y;
                            String str12 = z6Var.x;
                            str7 = z6Var.w;
                            String str13 = z6Var.v;
                            String str14 = z6Var.u;
                            sy.y.j(obj3);
                            fwVar = fwVar2;
                            str5 = str14;
                            f2 = obj3;
                            str8 = str12;
                            str6 = str13;
                        }
                        xv xvVar = (xv) f2;
                        a71.c cVar3 = null;
                        aw awVar = (xvVar != null || (ewVar = xvVar.a) == null) ? null : ewVar.b;
                        aa1.b u0Var2 = str7 != null ? bVar3 : new aa.u0(str7);
                        if (str8 != null) {
                            bVar3 = new aa.u0(str8);
                        }
                        return y71.n1Shadow.y(in.rShadow.l(new y71.y(new rm0.r3(16, com.github.service.wrapper.a.o(this.s, new fw(u0Var2, bVar3, str5, str6), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), awVar), new z1(this, fwVar, cVar3, 23), 6)), this.u);
                    }
                }
                z6Var = new wy0.z6Shadow(this, (c71.c) cVar);
                Object obj32 = z6Var.z;
                b71.a aVar32 = b71.a.r;
                i2 = z6Var.B;
                aa1.b bVar32 = aa.t0.d;
                if (i2 != 0) {
                }
                xv xvVar2 = (xv) f2;
                a71.c cVar32 = null;
                if (xvVar2 != null) {
                }
                if (str7 != null) {
                }
                if (str8 != null) {
                }
                return y71.n1Shadow.y(in.rShadow.l(new y71.y(new rm0.r3(16, com.github.service.wrapper.a.o(this.s, new fw(u0Var2, bVar32, str5, str6), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), awVar), new z1(this, fwVar, cVar32, 23), 6)), this.u);
        }
    }

    public final y71.i d(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "repositoryId");
                k71.k.g(str2, "description");
                i30.Companion.getClass();
                m00.c0 c0Var = new m00.c0(new m00.e0(new m00.d0(str, str2, str2, str2, ((aa.q) i30.w0).a)));
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.t.k(new m00.f0(new aa.u0(str2), str), c0Var))), this.u);
            default:
                k71.k.g(str, "repositoryId");
                k71.k.g(str2, "description");
                jx.Companion.getClass();
                py0.d0 d0Var = new py0.d0(new py0.f0(new py0.e0(str, str2, str2, str2, ((aa.q) jx.t0).a)));
                return y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(this.t.k(new py0.g0(new aa.u0(str2), str), d0Var))), this.u);
        }
    }

    public final y71.i e(v01.d dVar) {
        switch (this.r) {
            case 0:
                k71.k.g(dVar, "filterType");
                return ((jy.d) this.x).h(new q00.d(dVar));
            default:
                k71.k.g(dVar, "filterType");
                return this.x.h(new ty0.c(dVar));
        }
    }

    public final y71.i f(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str3, "branchQualifiedName");
                return y71.n1Shadow.y(new h7(com.github.service.wrapper.a.o(this.s, new sz(str, str2, str3), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 7), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str3, "branchQualifiedName");
                return y71.n1Shadow.y(new wy0.d6(com.github.service.wrapper.a.o(this.s, new rx(str, str2, str3), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), this.u);
        }
    }

    public final y71.i g(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1Shadow.y(new h7(com.github.service.wrapper.a.o(this.s, new f30(str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 3), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1Shadow.y(new wy0.d6(com.github.service.wrapper.a.o(this.s, new jn0.f10(str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 6), this.u);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }

    public final y71.i i(String str, boolean z) {
        switch (this.r) {
            case 0:
                com.github.service.wrapper.j jVar = this.s;
                return y71.n1Shadow.y(z ? new g3(in.rShadow.h(jVar.d(new iv(str))), 15) : new g3(in.rShadow.h(jVar.d(new jo.f0(str))), 16), this.u);
            default:
                com.github.service.wrapper.j jVar2 = this.s;
                return y71.n1Shadow.y(z ? new wy0.h1(in.rShadow.h(jVar2.d(new lt(str))), 20) : new wy0.h1(in.rShadow.h(jVar2.d(new jn0.a0Shadow(str))), 21), this.u);
        }
    }

    public final y71.i j(String str, String str2) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(new q6(new y00.l(com.github.service.wrapper.a.o(this.s, new x50(str, str2 == null ? aa.t0.d : new aa.u0(str2)), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), 13), this.u);
            default:
                return y71.n1Shadow.y(new wy0.s6(new y00.l(com.github.service.wrapper.a.o(this.s, new x30(str, str2 == null ? aa.t0.d : new aa.u0(str2)), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), 7), this.u);
        }
    }

    public final Object k(String str, com.github.rudroid.common.i0 i0Var, String str2) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(new rm0.j8(new y00.l(com.github.service.wrapper.a.o(this.s, new q50(str, str2 == null ? aa.t0.d : new aa.u0(str2)), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), i0Var, 3), this.u);
            default:
                return y71.n1Shadow.y(new rm0.j8(new y00.l(com.github.service.wrapper.a.o(this.s, new jn0.q30(str, str2 == null ? aa.t0.d : new aa.u0(str2)), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), i0Var, 7), this.u);
        }
    }

    public final y71.i l(String str, String str2) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(new h7(com.github.service.wrapper.a.o(this.t, new m00.n(str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 9), this.u);
            default:
                return y71.n1Shadow.y(new wy0.d6(com.github.service.wrapper.a.o(this.t, new py0.n(str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 12), this.u);
        }
    }

    public final Object m(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                aa1.b bVar = aa.t0.d;
                return y71.n1Shadow.y(new h7(com.github.service.wrapper.b.a(this.t, new gy(str3 == null ? bVar : new aa.u0(str3), bVar, str, str2), ga.h.t, false, (LinkedHashSet) null, 60), 5), this.u);
            default:
                aa1.b bVar2 = aa.t0.d;
                return y71.n1Shadow.y(new wy0.d6(com.github.service.wrapper.b.a(this.t, new fw(str3 == null ? bVar2 : new aa.u0(str3), bVar2, str, str2), ga.h.t, false, (LinkedHashSet) null, 60), 8), this.u);
        }
    }

    public final y71.i n(String str, String str2, String str3, String str4, boolean z) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str4, "qualifiedName");
                return y71.n1Shadow.y(new f8(1, new b10.b(com.google.android.gms.internal.measurement.d5.R(new y71.y(com.github.service.wrapper.b.q(this.t, new q30(str, str2, z, str3 == null ? aa.t0.d : new aa.u0(str3), str4), ga.h.t, false, (Set) null, (Set) null, new bd.m(str, 8), new sw0.e(24), 28), new t8(3, null, 0))), 9)), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str4, "qualifiedName");
                return y71.n1Shadow.y(new f8(15, new b10.b(com.google.android.gms.internal.measurement.d5.R(new y71.y(com.github.service.wrapper.b.q(this.t, new q10(str, str2, z, str3 == null ? aa.t0.d : new aa.u0(str3), str4), ga.h.t, false, (Set) null, (Set) null, new bd.m(str, 8), new wy0.p4(6), 28), new t8(3, null, 1))), 14)), this.u);
        }
    }

    public final y71.i o(String str, String str2) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(new q6(new y00.l(com.github.service.wrapper.a.o(this.t, new m00.a0(str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 10), this.u);
            default:
                return y71.n1Shadow.y(new wy0.s6(new y00.l(com.github.service.wrapper.a.o(this.t, new py0.b0(str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), 4), this.u);
        }
    }

    public final y71.i p(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return ((jy.d) this.v).h(new m00.o(str, str2));
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return ((jy.d) this.v).h(new py0.p(str, str2));
        }
    }

    public final y71.i q(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "repositoryOwnerLogin");
                k71.k.g(str2, "repositoryName");
                return y71.n1Shadow.y(new nm.g(com.github.rudroid.common.flow.f.b(com.github.service.wrapper.a.o(this.s, new m00.d(str, str2), (ga.h) null, false, sy.f0.n(in.rShadow.a, ApiFailureType.NOT_FOUND), (Set) null, 54), Integer.MAX_VALUE, new sw0.b(5), new sw0.e(23), 4), 2), this.u);
            default:
                k71.k.g(str, "repositoryOwnerLogin");
                k71.k.g(str2, "repositoryName");
                return y71.n1Shadow.y(new nm.g(com.github.rudroid.common.flow.f.b(com.github.service.wrapper.a.o(this.s, new py0.d(str, str2), (ga.h) null, false, sy.f0.n(in.rShadow.a, ApiFailureType.NOT_FOUND), (Set) null, 54), Integer.MAX_VALUE, new wy0.n6(0), new wy0.p4(5), 4), 16), this.u);
        }
    }

    public final y71.i r(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return ((jy.d) this.v).b(new m00.o(str, str2));
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return ((jy.d) this.v).b(new py0.p(str, str2));
        }
    }

    public final Object s(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                return y71.n1Shadow.y(new h7(com.github.service.wrapper.a.o(this.s, new v30(str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 6), this.u);
            default:
                return y71.n1Shadow.y(new wy0.d6(com.github.service.wrapper.a.o(this.s, new v10(str3 == null ? aa.t0.d : new aa.u0(str3), str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 9), this.u);
        }
    }

    public final y71.i t(String str, String str2, String str3, String str4, boolean z) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str4, "qualifiedName");
                return y71.n1Shadow.y(in.rShadow.l(com.github.service.wrapper.a.o(this.t, new q30(str, str2, z, str3 == null ? aa.t0.d : new aa.u0(str3), str4), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62)), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str4, "qualifiedName");
                return y71.n1Shadow.y(in.rShadow.l(com.github.service.wrapper.a.o(this.t, new q10(str, str2, z, str3 == null ? aa.t0.d : new aa.u0(str3), str4), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62)), this.u);
        }
    }

    public final y71.i u(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1Shadow.y(new q6(new y00.l(com.github.service.wrapper.a.o(this.s, new v20(str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), 7), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                return y71.n1Shadow.y(new wy0.s6(new y00.l(com.github.service.wrapper.a.o(this.s, new v00(str, str2), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), 1), this.u);
        }
    }

    public final y71.i v(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                return ((jy.d) this.w).e(new q00.a(str, str2));
            default:
                k71.k.g(str, "owner");
                return this.w.e(new ty0.a(str, str2));
        }
    }

    public final y71.i w(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str3, "qualifiedName");
                return y71.n1Shadow.y(new h7(com.github.service.wrapper.a.o(this.s, new nz(str, str2, str3), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 2), this.u);
            default:
                k71.k.g(str, "owner");
                k71.k.g(str2, "name");
                k71.k.g(str3, "qualifiedName");
                return y71.n1Shadow.y(new wy0.d6(com.github.service.wrapper.a.o(this.s, new mx(str, str2, str3), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 5), this.u);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(String str, a71.c cVar) {
        q7 q7Var;
        int i;
        dw.o5 o5Var;
        y71.i d;
        c71.c p6Var;
        int i2;
        uu0.u4 u4Var;
        y71.i d2;
        switch (this.r) {
            case 0:
                if (cVar instanceof q7) {
                    q7Var = (q7) cVar;
                    int i3 = q7Var.x;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        q7Var.x = i3 - Integer.MIN_VALUE;
                        Object obj = q7Var.v;
                        Object obj2 = b71.a.r;
                        i = q7Var.x;
                        if (i != 0) {
                            sy.y.j(obj);
                            q7Var.u = str;
                            q7Var.x = 1;
                            obj = P(str, true, q7Var);
                            if (obj == obj2) {
                                return obj2;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str = q7Var.u;
                            sy.y.j(obj);
                        }
                        o5Var = (dw.o5) obj;
                        com.github.service.wrapper.b bVar = this.t;
                        if (o5Var == null) {
                            jo.a2 a2Var = new jo.a2(str);
                            String str2 = o5Var.a;
                            d = bVar.k(a2Var, new jo.y1(new jo.w1(new jo.z1(str2, new vx.a(o5Var.b, str2), o5Var))));
                        } else {
                            d = bVar.d(new jo.a2(str));
                        }
                        return y71.n1Shadow.y(new aq.c(new y71.y(in.rShadow.h(d), new rm0.m7Shadow(this, (a71.c) null, 3), 6), 25), this.u);
                    }
                }
                q7Var = new q7(this, (c71.c) cVar);
                Object obj3 = q7Var.v;
                Object obj22 = b71.a.r;
                i = q7Var.x;
                if (i != 0) {
                }
                o5Var = (dw.o5) obj3;
                com.github.service.wrapper.b bVar2 = this.t;
                if (o5Var == null) {
                }
                return y71.n1Shadow.y(new aq.c(new y71.y(in.rShadow.h(d), new rm0.m7Shadow(this, (a71.c) null, 3), 6), 25), this.u);
            default:
                if (cVar instanceof wy0.p6) {
                    p6Var = (wy0.p6) cVar;
                    int i4 = ((wy0.p6) p6Var).x;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        ((wy0.p6) p6Var).x = i4 - Integer.MIN_VALUE;
                        Object obj4 = ((wy0.p6) p6Var).v;
                        Object obj5 = b71.a.r;
                        i2 = ((wy0.p6) p6Var).x;
                        if (i2 != 0) {
                            sy.y.j(obj4);
                            ((wy0.p6) p6Var).u = str;
                            ((wy0.p6) p6Var).x = 1;
                            obj4 = O(str, true, p6Var);
                            if (obj4 == obj5) {
                                return obj5;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str = ((wy0.p6) p6Var).u;
                            sy.y.j(obj4);
                        }
                        u4Var = (uu0.u4) obj4;
                        com.github.service.wrapper.b bVar3 = this.t;
                        if (u4Var == null) {
                            jn0.v1 v1Var = new jn0.v1(str);
                            String str3 = u4Var.a;
                            d2 = bVar3.k(v1Var, new jn0.t1(new jn0.r1(new jn0.u1(str3, new kw0.a(u4Var.b, str3), u4Var))));
                        } else {
                            d2 = bVar3.d(new jn0.v1(str));
                        }
                        return y71.n1Shadow.y(new tw0.i(new y71.y(in.rShadow.h(d2), new rm0.m7Shadow(this, (a71.c) null, 5), 6), 17), this.u);
                    }
                }
                p6Var = new wy0.p6(this, (c71.c) cVar);
                Object obj42 = ((wy0.p6) p6Var).v;
                Object obj52 = b71.a.r;
                i2 = ((wy0.p6) p6Var).x;
                if (i2 != 0) {
                }
                u4Var = (uu0.u4) obj42;
                com.github.service.wrapper.b bVar32 = this.t;
                if (u4Var == null) {
                }
                return y71.n1Shadow.y(new tw0.i(new y71.y(in.rShadow.h(d2), new rm0.m7Shadow(this, (a71.c) null, 5), 6), 17), this.u);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(String str, a71.c cVar) {
        x8 x8Var;
        int i;
        dw.o5 o5Var;
        y71.i d;
        c71.c u7Var;
        int i2;
        uu0.u4 u4Var;
        y71.i d2;
        switch (this.r) {
            case 0:
                if (cVar instanceof x8) {
                    x8Var = (x8) cVar;
                    int i3 = x8Var.x;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        x8Var.x = i3 - Integer.MIN_VALUE;
                        Object obj = x8Var.v;
                        Object obj2 = b71.a.r;
                        i = x8Var.x;
                        if (i != 0) {
                            sy.y.j(obj);
                            x8Var.u = str;
                            x8Var.x = 1;
                            obj = P(str, false, x8Var);
                            if (obj == obj2) {
                                return obj2;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str = x8Var.u;
                            sy.y.j(obj);
                        }
                        o5Var = (dw.o5) obj;
                        com.github.service.wrapper.b bVar = this.t;
                        if (o5Var == null) {
                            yv yvVar = new yv(str);
                            String str2 = o5Var.a;
                            d = bVar.k(yvVar, new jo.vv(new wv(new jo.xv(str2, new vx.a(o5Var.b, str2), o5Var))));
                        } else {
                            d = bVar.d(new yv(str));
                        }
                        return y71.n1Shadow.y(new aq.c(new y71.y(in.rShadow.h(d), new rm0.v4(this, str, (a71.c) null, 7), 6), 26), this.u);
                    }
                }
                x8Var = new x8(this, (c71.c) cVar);
                Object obj3 = x8Var.v;
                Object obj22 = b71.a.r;
                i = x8Var.x;
                if (i != 0) {
                }
                o5Var = (dw.o5) obj3;
                com.github.service.wrapper.b bVar2 = this.t;
                if (o5Var == null) {
                }
                return y71.n1Shadow.y(new aq.c(new y71.y(in.rShadow.h(d), new rm0.v4(this, str, (a71.c) null, 7), 6), 26), this.u);
            default:
                if (cVar instanceof wy0.u7) {
                    u7Var = (wy0.u7) cVar;
                    int i4 = ((wy0.u7) u7Var).x;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        ((wy0.u7) u7Var).x = i4 - Integer.MIN_VALUE;
                        Object obj4 = ((wy0.u7) u7Var).v;
                        Object obj5 = b71.a.r;
                        i2 = ((wy0.u7) u7Var).x;
                        if (i2 != 0) {
                            sy.y.j(obj4);
                            ((wy0.u7) u7Var).u = str;
                            ((wy0.u7) u7Var).x = 1;
                            obj4 = O(str, false, u7Var);
                            if (obj4 == obj5) {
                                return obj5;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str = ((wy0.u7) u7Var).u;
                            sy.y.j(obj4);
                        }
                        u4Var = (uu0.u4) obj4;
                        com.github.service.wrapper.b bVar3 = this.t;
                        if (u4Var == null) {
                            bu buVar = new bu(str);
                            String str3 = u4Var.a;
                            d2 = bVar3.k(buVar, new yt(new zt(new au(str3, new kw0.a(u4Var.b, str3), u4Var))));
                        } else {
                            d2 = bVar3.d(new bu(str));
                        }
                        return y71.n1Shadow.y(new tw0.i(new y71.y(in.rShadow.h(d2), new rm0.v4(this, str, (a71.c) null, 21), 6), 18), this.u);
                    }
                }
                u7Var = new wy0.u7(this, (c71.c) cVar);
                Object obj42 = ((wy0.u7) u7Var).v;
                Object obj52 = b71.a.r;
                i2 = ((wy0.u7) u7Var).x;
                if (i2 != 0) {
                }
                u4Var = (uu0.u4) obj42;
                com.github.service.wrapper.b bVar32 = this.t;
                if (u4Var == null) {
                }
                return y71.n1Shadow.y(new tw0.i(new y71.y(in.rShadow.h(d2), new rm0.v4(this, str, (a71.c) null, 21), 6), 18), this.u);
        }
    }

    public final y71.i z(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "repositoryId");
                return y71.n1Shadow.y(new rm0.c8(y71.n1Shadow.I(com.github.service.wrapper.b.n(this.t, new o00.d(), str), new c00.m((a71.c) null, this, str, 12)), 3), this.u);
            default:
                k71.k.g(str, "repositoryId");
                return y71.n1Shadow.y(new rm0.c8(y71.n1Shadow.I(com.github.service.wrapper.b.n(this.t, new ry0.d(), str), new c00.m((a71.c) null, this, str, 17)), 9), this.u);
        }
    }
}
