package io0;

import aa.t0;
import aa.u0;
import ar0.i1;
import ar0.p0;
import ar0.q;
import ar0.r;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import er0.a0;
import er0.b0;
import er0.c0;
import er0.d0;
import er0.t;
import er0.u;
import er0.v;
import iy0.v0;
import java.util.ArrayList;
import java.util.List;
import jn0.bo;
import jn0.eb;
import jn0.gb;
import jn0.hb;
import jn0.ib;
import jn0.ic;
import jn0.jb;
import jn0.jc;
import jn0.kc;
import jn0.lb;
import jn0.lc;
import jn0.mb;
import jn0.mc;
import jn0.nc;
import jn0.ob;
import jn0.pb;
import jn0.qb;
import jn0.rb;
import jn0.wn;
import jo.i40;
import m7.y;
import p01.p;
import pz0.py;
import sy.e0;
import u10.ta0;
import u10.ua0;
import u10.va0;
import u10.wa0;
import u10.ya0;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class f implements j71.c {
    public final /* synthetic */ int r;

    @Override // j71.c
    public final Object k(Object obj) {
        d0 d0Var;
        c0 c0Var;
        List list;
        d0 d0Var2;
        c0 c0Var2;
        b0 b0Var;
        d0 d0Var3;
        c0 c0Var3;
        eb ebVar;
        t tVar;
        er0.g gVar;
        jb jbVar;
        jb jbVar2;
        hb hbVar;
        pb pbVar;
        r rVar;
        ar0.o oVar;
        List list2;
        pb pbVar2;
        r rVar2;
        ar0.o oVar2;
        q qVar;
        nt0.a aVar;
        pb pbVar3;
        r rVar3;
        ar0.o oVar3;
        pb pbVar4;
        ar0.o oVar4;
        List list3;
        ar0.o oVar5;
        q qVar2;
        nt0.a aVar2;
        ar0.o oVar6;
        switch (this.r) {
            case 0:
                g gVar2 = (g) obj;
                k71.k.g(gVar2, "commentReplyThreadParameters");
                return new mb(gVar2.a);
            case 1:
                gb gbVar = (gb) obj;
                k71.k.g(gbVar, "data");
                ib ibVar = gbVar.a;
                return Boolean.valueOf((ibVar == null || (d0Var = ibVar.d) == null || (c0Var = d0Var.c) == null || (list = c0Var.c) == null) ? false : !list.isEmpty());
            case 2:
                gb gbVar2 = (gb) obj;
                k71.k.g(gbVar2, "data");
                ib ibVar2 = gbVar2.a;
                if (ibVar2 == null || (d0Var2 = ibVar2.d) == null || (c0Var2 = d0Var2.c) == null || (b0Var = c0Var2.a) == null) {
                    return null;
                }
                return new x01.i(b0Var.c, b0Var.b, !b0Var.a);
            case 3:
                gb gbVar3 = (gb) obj;
                k71.k.g(gbVar3, "data");
                ib ibVar3 = gbVar3.a;
                List list4 = (ibVar3 == null || (d0Var3 = ibVar3.d) == null || (c0Var3 = d0Var3.c) == null) ? null : c0Var3.c;
                return list4 == null ? x61.rShadow.r : list4;
            case 4:
                gb gbVar4 = (gb) obj;
                k71.k.g(gbVar4, "data");
                ib ibVar4 = gbVar4.a;
                d0 d0Var4 = ibVar4 != null ? ibVar4.d : null;
                lb lbVar = (ibVar4 == null || (jbVar2 = ibVar4.c) == null || (hbVar = jbVar2.a) == null) ? null : hbVar.d;
                py pyVar = lbVar != null ? lbVar.b : null;
                hb hbVar2 = (ibVar4 == null || (jbVar = ibVar4.c) == null) ? null : jbVar.a;
                if (d0Var4 == null || hbVar2 == null || lbVar == null || pyVar == null || (ebVar = hbVar2.c) == null) {
                    throw new ApiFailure(ApiFailureType.SERVER_ERROR, f1.e.g("Invalid Discussion comment id: ", d0Var4 != null ? d0Var4.b : null), null, null, null, null, null, 120);
                }
                String str = lbVar.a;
                String str2 = lbVar.c.a;
                boolean z = lbVar.d;
                String str3 = hbVar2.a;
                boolean z2 = hbVar2.b;
                com.github.service.models.response.a e = k41.b.e(ebVar.b);
                c0 c0Var4 = d0Var4.c;
                er0.i iVar = d0Var4.d;
                yp0.c cVar = iVar.j;
                String str4 = iVar.c;
                gu0.c cVar2 = d0Var4.e;
                at0.a aVar3 = iVar.l;
                Integer valueOf = Integer.valueOf(c0Var4.b);
                boolean z3 = iVar.d;
                boolean z4 = iVar.e;
                boolean z5 = iVar.f;
                boolean z6 = iVar.g;
                er0.h hVar = iVar.i;
                String str5 = (hVar == null || (gVar = hVar.c) == null) ? null : gVar.b;
                boolean z7 = iVar.h != null;
                i1 i1Var = iVar.m;
                gt0.a aVar4 = iVar.k;
                b01.g h = aa1.b.h(cVar, str4, cVar2, aVar3, valueOf, z3, z4, z5, z6, str5, z7, (List) null, i1Var, aVar4.b, aVar4.c, aa1.b.c0(iVar));
                Iterable iterable = c0Var4.c;
                if (iterable == null) {
                    iterable = x61.rShadow.r;
                }
                ArrayList S = x61.m.S(iterable);
                ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                int size = S.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = S.get(i);
                    i++;
                    v vVar = ((a0) obj2).c;
                    yp0.c cVar3 = vVar.h;
                    String str6 = vVar.b;
                    ArrayList arrayList2 = S;
                    gu0.c cVar4 = vVar.i;
                    at0.a aVar5 = vVar.k;
                    gt0.a aVar6 = vVar.j;
                    int i2 = size;
                    boolean z8 = aVar6.b;
                    boolean z9 = aVar6.c;
                    bw0.a aVar7 = cVar3.l;
                    boolean z10 = aVar7 != null ? aVar7.b : false;
                    boolean z12 = vVar.c;
                    boolean z13 = vVar.d;
                    boolean z14 = vVar.e;
                    u uVar = vVar.f;
                    arrayList.add(aa1.b.i(cVar3, str6, cVar4, aVar5, z8, z9, z10, z12, z13, z14, (uVar == null || (tVar = uVar.c) == null) ? null : tVar.b));
                    S = arrayList2;
                    size = i2;
                }
                b0 b0Var2 = c0Var4.a;
                x01.i iVar2 = new x01.i(b0Var2.c, b0Var2.b, !b0Var2.a);
                int i3 = c0Var4.b;
                int i4 = nx0.a.a[pyVar.ordinal()];
                return new b01.a(h, arrayList, iVar2, i3, str, str2, str3, z2, i4 == 1 || i4 == 2 || i4 == 3, e, z);
            case 5:
                h hVar2 = (h) obj;
                k71.k.g(hVar2, "parameters");
                return new rb(hVar2.c, t0.d, hVar2.a, hVar2.b);
            case 6:
                ob obVar = (ob) obj;
                k71.k.g(obVar, "data");
                qb qbVar = obVar.a;
                return Boolean.valueOf((qbVar == null || (pbVar = qbVar.b) == null || (rVar = pbVar.c) == null || (oVar = rVar.c) == null || (list2 = oVar.b) == null) ? false : !list2.isEmpty());
            case 7:
                ob obVar2 = (ob) obj;
                k71.k.g(obVar2, "data");
                qb qbVar2 = obVar2.a;
                if (qbVar2 == null || (pbVar2 = qbVar2.b) == null || (rVar2 = pbVar2.c) == null || (oVar2 = rVar2.c) == null || (qVar = oVar2.a) == null || (aVar = qVar.b) == null) {
                    return null;
                }
                boolean z15 = aVar.a;
                return new x01.i(aVar.b, z15, !z15);
            case 8:
                ob obVar3 = (ob) obj;
                k71.k.g(obVar3, "data");
                qb qbVar3 = obVar3.a;
                List list5 = (qbVar3 == null || (pbVar3 = qbVar3.b) == null || (rVar3 = pbVar3.c) == null || (oVar3 = rVar3.c) == null) ? null : oVar3.b;
                return list5 == null ? x61.rShadow.r : list5;
            case 9:
                ob obVar4 = (ob) obj;
                k71.k.g(obVar4, "data");
                qb qbVar4 = obVar4.a;
                if (((qbVar4 == null || (pbVar4 = qbVar4.b) == null) ? null : pbVar4.c) != null) {
                    return a.a.b(qbVar4.b.c);
                }
                throw new ApiFailure(ApiFailureType.SERVER_ERROR, "Invalid Discussion info 1 repo info is " + qbVar4, null, null, null, null, null, 120);
            case 10:
                i iVar3 = (i) obj;
                k71.k.g(iVar3, "parameters");
                return new bo(iVar3.a, iVar3.b, t0.d);
            case 11:
                wn wnVar = (wn) obj;
                k71.k.g(wnVar, "data");
                r S2 = b31.b.S(wnVar);
                return Boolean.valueOf((S2 == null || (oVar4 = S2.c) == null || (list3 = oVar4.b) == null) ? false : !list3.isEmpty());
            case 12:
                wn wnVar2 = (wn) obj;
                k71.k.g(wnVar2, "data");
                r S3 = b31.b.S(wnVar2);
                if (S3 == null || (oVar5 = S3.c) == null || (qVar2 = oVar5.a) == null || (aVar2 = qVar2.b) == null) {
                    return null;
                }
                boolean z16 = aVar2.a;
                return new x01.i(aVar2.b, z16, !z16);
            case 13:
                wn wnVar3 = (wn) obj;
                k71.k.g(wnVar3, "data");
                r S4 = b31.b.S(wnVar3);
                List list6 = (S4 == null || (oVar6 = S4.c) == null) ? null : oVar6.b;
                return list6 == null ? x61.rShadow.r : list6;
            case 14:
                wn wnVar4 = (wn) obj;
                k71.k.g(wnVar4, "data");
                r S5 = b31.b.S(wnVar4);
                if (S5 != null) {
                    return a.a.b(S5);
                }
                throw new ApiFailure(ApiFailureType.SERVER_ERROR, "Invalid Discussion info 2", null, null, null, null, null, 120);
            case 15:
                o oVar7 = (o) obj;
                k71.k.g(oVar7, "discussionParameters");
                String str7 = oVar7.c;
                String str8 = oVar7.a;
                u0 u0Var = new u0((Object) null);
                String str9 = oVar7.b;
                u0 u0Var2 = t0.d;
                u0 u0Var3 = str9 == null ? u0Var2 : new u0(str9);
                if (str7 != null) {
                    u0Var2 = new u0(str7);
                }
                return new nc(str8, u0Var, u0Var3, u0Var2, new u0(Boolean.valueOf((str9 == null || str7 == null) ? false : true)));
            case 16:
                ic icVar = (ic) obj;
                k71.k.g(icVar, "data");
                return Boolean.valueOf(icVar.b.c != null ? !r1.isEmpty() : false);
            case 17:
                ic icVar2 = (ic) obj;
                k71.k.g(icVar2, "data");
                kc kcVar = icVar2.b.b;
                boolean z17 = kcVar.a;
                String str10 = kcVar.b;
                return new x01.i(str10, z17, str10 == null);
            case 18:
                ic icVar3 = (ic) obj;
                k71.k.g(icVar3, "data");
                List list7 = icVar3.b.c;
                return list7 == null ? x61.rShadow.r : list7;
            case 19:
                ic icVar4 = (ic) obj;
                k71.k.g(icVar4, "data");
                mc mcVar = icVar4.b;
                lc lcVar = icVar4.a;
                String str11 = lcVar != null ? lcVar.b : null;
                Iterable iterable2 = mcVar.c;
                if (iterable2 == null) {
                    iterable2 = x61.rShadow.r;
                }
                ArrayList S6 = x61.m.S(iterable2);
                ArrayList arrayList3 = new ArrayList(x61.n.F(S6, 10));
                int size2 = S6.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj3 = S6.get(i5);
                    i5++;
                    p0 p0Var = ((jc) obj3).c;
                    k71.k.d(p0Var);
                    arrayList3.add(b91.g.d(p0Var));
                }
                kc kcVar2 = mcVar.b;
                return new b01.o(str11, arrayList3, new x01.i(kcVar2.b, kcVar2.a, false));
            case 20:
                gy0.u uVar2 = (gy0.u) obj;
                k71.k.g(uVar2, "$this$mapOrApiFailure");
                return uVar2;
            case 21:
                v0 v0Var = (v0) obj;
                k71.k.g(v0Var, "$this$mapOrApiFailure");
                return y.m(v0Var);
            case 22:
                fz.a aVar8 = (fz.a) obj;
                k71.k.g(aVar8, "it");
                return aVar8.d;
            case 23:
                fz.a aVar9 = (fz.a) obj;
                k71.k.g(aVar9, "it");
                return Boolean.valueOf(k71.k.b(aVar9.h, Boolean.FALSE));
            case 24:
                jc0.a aVar10 = (jc0.a) obj;
                k71.k.g(aVar10, "parameters");
                String str12 = aVar10.a;
                aa1.b bVar = t0.d;
                return new ya0(bVar, str12 == null ? bVar : new u0(str12));
            case 25:
                ta0 ta0Var = (ta0) obj;
                k71.k.g(ta0Var, "data");
                return Boolean.valueOf(ta0Var.a.a.b != null ? !r1.isEmpty() : false);
            case 26:
                ta0 ta0Var2 = (ta0) obj;
                k71.k.g(ta0Var2, "data");
                va0 va0Var = ta0Var2.a.a.a;
                return new x01.i(va0Var.c, va0Var.a, !va0Var.b);
            case 27:
                ta0 ta0Var3 = (ta0) obj;
                k71.k.g(ta0Var3, "data");
                List list8 = ta0Var3.a.a.b;
                return list8 == null ? x61.rShadow.r : list8;
            case 28:
                ta0 ta0Var4 = (ta0) obj;
                k71.k.g(ta0Var4, "data");
                wa0 wa0Var = ta0Var4.a.a;
                Iterable iterable3 = wa0Var.b;
                if (iterable3 == null) {
                    iterable3 = x61.rShadow.r;
                }
                ArrayList S7 = x61.m.S(iterable3);
                ArrayList arrayList4 = new ArrayList(x61.n.F(S7, 10));
                int size3 = S7.size();
                int i6 = 0;
                while (i6 < size3) {
                    Object obj4 = S7.get(i6);
                    i6++;
                    arrayList4.add(e0.q(((ua0) obj4).c));
                }
                va0 va0Var2 = wa0Var.a;
                return new p(arrayList4, new x01.i(va0Var2.c, va0Var2.a, !va0Var2.b));
            default:
                jy.a aVar11 = (jy.a) obj;
                k71.k.g(aVar11, "advancedSearchParameters");
                return new i40(aVar11.b, 30, new u0((Object) null));
        }
    }
}
