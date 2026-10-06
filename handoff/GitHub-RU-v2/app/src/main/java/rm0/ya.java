package rm0;

import f1.ub;
import java.util.List;
import java.util.Locale;
import jn0.i20;
import jn0.tg0;
import jn0.vg0;
import jn0.wg0;
import jn0.xg0;
import jn0.yg0;
import u10.bl;
import u10.cl;
import u10.dl;
import u10.el;
import u10.fl;
import u10.gb;
import u10.gl;
import u10.ib;
import u10.kb;
import u10.lb;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class ya implements j71.e {
    public final /* synthetic */ int r;

    public /* synthetic */ ya(int i) {
        this.r = i;
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        fl r4 = null;
        Object r3 = null;
        switch (this.r) {
            case 0:
                kc0.i3 i3Var = (kc0.i3) obj;
                List list = (List) obj2;
                k71.k.g(i3Var, "data");
                k71.k.g(list, "nodes");
                kc0.m3 m3Var = i3Var.a;
                kc0.l3Shadow l3Var = m3Var.b;
                return new kc0.i3(new kc0.m3(m3Var.a, l3Var != null ? new kc0.l3(l3Var.a, list) : null, m3Var.c));
            case 1:
                rz.z zVar = (rz.z) obj;
                String str = (String) obj2;
                k71.k.g(zVar, "id");
                k71.k.g(str, "after");
                return new vz.h(zVar.a, new aa.u0(10), new aa.u0(str), new aa.u0(zVar.b));
            case 2:
                vz.bShadow bVar = (vz.b) obj;
                List list2 = (List) obj2;
                k71.k.g(bVar, "data");
                k71.k.g(list2, "nodes");
                vz.e eVar = bVar.a;
                if (eVar != null) {
                    vz.f fVar = eVar.c;
                    r4 = vz.e.a(eVar, fVar != null ? vz.f.a(fVar, vz.c.a(fVar.b, (vz.g) null, list2, 3)) : null);
                }
                return vz.b.a(bVar, r4);
            case 3:
                rz0.a aVar = (rz0.a) obj;
                String str2 = (String) obj2;
                k71.k.g(aVar, "parameters");
                k71.k.g(str2, "after");
                aa.u0 u0Var = new aa.u0(str2);
                String str3 = aVar.a;
                return new yg0(u0Var, str3 == null ? aa.t0.d : new aa.u0(str3));
            case 4:
                tg0 tg0Var = (tg0) obj;
                List list3 = (List) obj2;
                k71.k.g(tg0Var, "data");
                k71.k.g(list3, "nodes");
                xg0 xg0Var = tg0Var.a;
                vg0 vg0Var = xg0Var.a.a;
                k71.k.g(vg0Var, "pageInfo");
                wg0 wg0Var = new wg0(vg0Var, list3);
                String str4 = xg0Var.b;
                String str5 = xg0Var.c;
                k71.k.g(str4, "id");
                k71.k.g(str5, "__typename");
                xg0 xg0Var2 = new xg0(wg0Var, str4, str5);
                String str6 = tg0Var.b;
                String str7 = tg0Var.c;
                k71.k.g(str6, "id");
                k71.k.g(str7, "__typename");
                return new tg0(xg0Var2, str6, str7);
            case 5:
                s0.e1 e1Var = (s0.e1) obj2;
                return x61.l.r(new Object[]{Float.valueOf(e1Var.a.y()), Boolean.valueOf(((h0.b2) e1Var.f.getValue()) == h0.b2.r)});
            case 6:
                aa.v0 v0Var = (aa.v0) obj;
                ((Integer) obj2).intValue();
                k71.k.g(v0Var, "data");
                return v0Var;
            case 7:
                k71.k.g((aa.v0) obj, "<this>");
                k71.k.g(obj2, "it");
                return Boolean.TRUE;
            case 8:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                k71.k.g(list4, "newNodes");
                k71.k.g(list5, "previousNodes");
                return x61.m.l0(list5, list4);
            case 9:
                List list6 = (List) obj;
                List list7 = (List) obj2;
                k71.k.g(list6, "newNodes");
                k71.k.g(list7, "previousNodes");
                return x61.m.l0(list6, list7);
            case 10:
                aa.v0 v0Var2 = (aa.v0) obj;
                ((Integer) obj2).intValue();
                k71.k.g(v0Var2, "data");
                return v0Var2;
            case 11:
                k71.k.g((aa.v0) obj, "<this>");
                k71.k.g(obj2, "it");
                return Boolean.TRUE;
            case 12:
                s20.f fVar2 = (s20.f) obj;
                String str8 = (String) obj2;
                k71.k.g(fVar2, "commentReplyThreadParameters");
                k71.k.g(str8, "before");
                return new u10.ka(fVar2.a, new aa.u0(str8));
            case 13:
                u10.eaShadow eaVar = (u10.eaShadow) obj;
                List list8 = (List) obj2;
                k71.k.g(eaVar, "data");
                k71.k.g(list8, "nodes");
                u10.gaShadow gaVar = eaVar.a;
                if (gaVar != null) {
                    i50.c0 c0Var = gaVar.d;
                    r3 = u10.ga.a(gaVar, c0Var != null ? i50.c0.a(c0Var, i50.b0.a(c0Var.c, 0, list8, 3), (i50.h) null, 27) : null);
                }
                return new u10.eaShadow(r3Shadow);
            case 14:
                s20.g gVar = (s20.g) obj;
                String str9 = (String) obj2;
                k71.k.g(gVar, "parameters");
                k71.k.g(str9, "before");
                return new u10.pa(gVar.c, new aa.u0(str9), gVar.a, gVar.b);
            case 15:
                u10.ma maVar = (u10.ma) obj;
                List list9 = (List) obj2;
                k71.k.g(maVar, "data");
                k71.k.g(list9, "nodes");
                u10.oa oaVar = maVar.a;
                u10.na naVar = null;
                if (oaVar != null) {
                    u10.na naVar2 = oaVar.b;
                    if (naVar2 != null) {
                        e50.p pVar = naVar2.c;
                        naVar = new u10.na(naVar2.a, naVar2.b, e50.p.a(pVar, new e50.m(pVar.c.a, list9)));
                    }
                    naVar = new u10.oa(oaVar.a, naVar, oaVar.c);
                }
                return new u10.ma(naVar);
            case 16:
                s20.h hVar = (s20.h) obj;
                String str10 = (String) obj2;
                k71.k.g(hVar, "parameters");
                k71.k.g(str10, "before");
                return new gl(hVar.a, hVar.b, new aa.u0(str10));
            case 17:
                bl blVar = (bl) obj;
                List list10 = (List) obj2;
                k71.k.g(blVar, "data");
                k71.k.g(list10, "nodes");
                e50.p o = com.google.common.util.concurrent.a.o(blVar);
                if (o == null) {
                    return blVar;
                }
                el elVar = blVar.a;
                if (elVar != null) {
                    fl flVar = elVar.a;
                    if (flVar != null) {
                        cl clVar = flVar.a;
                        r4 = new fl(clVar != null ? new cl(clVar.a, clVar.b, new dl(clVar.c.a, e50.p.a(o, new e50.m(o.c.a, list10)))) : null, flVar.b, flVar.c);
                    }
                    r4 = new el(r4, elVar.b, elVar.c);
                }
                return new bl(r4);
            case 18:
                s20.n nVar = (s20.n) obj;
                String str11 = (String) obj2;
                k71.k.g(nVar, "discussionParameters");
                String str12 = nVar.c;
                k71.k.g(str11, "after");
                String str13 = nVar.a;
                aa.u0 u0Var2 = new aa.u0(str11);
                String str14 = nVar.b;
                aa1.bShadow bVar2 = aa.t0.d;
                aa1.bShadow u0Var3 = str14 == null ? bVar2 : new aa.u0(str14);
                if (str12 != null) {
                    bVar2 = new aa.u0(str12);
                }
                return new lb(str13, u0Var2, u0Var3, bVar2, new aa.u0(Boolean.valueOf((str14 == null || str12 == null) ? false : true)));
            case 19:
                gb gbVar = (gb) obj;
                List list11 = (List) obj2;
                k71.k.g(gbVar, "data");
                k71.k.g(list11, "nodes");
                kb kbVar = gbVar.b;
                int i = kbVar.a;
                ib ibVar = kbVar.b;
                k71.k.g(ibVar, "pageInfo");
                return new gb(gbVar.a, new kb(i, ibVar, list11));
            case 20:
                gb gbVar2 = (gb) obj;
                k71.k.g(gbVar2, "<this>");
                List list12 = gbVar2.b.c;
                k71.k.g((s20.n) obj2, "it");
                return Boolean.valueOf(gbVar2.a != null || (list12 != null && (list12.isEmpty() || !x61.m.S(list12).isEmpty())));
            case 21:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    Object N = sVar.N();
                    if (N == androidx.compose.runtime.n.a) {
                        N = new s5.a(8);
                        sVar.n0(N);
                    }
                    ub.b(com.google.android.gms.internal.measurement.i4.p0(2131952370, sVar), d3.q.b(w1.o.a, false, (j71.c) N), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (g3.q0) null, sVar, 0, 0, 262140);
                } else {
                    sVar.V();
                }
                return w61.a0.a;
            case 22:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    com.github.rudroid.uitoolkit.text.n0.a("Test button", (w1.r) null, 0L, 0L, 0L, (r3.k) null, 0L, 0, false, 0, (j71.c) null, (g3.q0) null, sVar2, 6, 0, 65534);
                } else {
                    sVar2.V();
                }
                return w61.a0.a;
            case 23:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (sVar3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    com.github.rudroid.uitoolkit.text.n0.a("Test button", (w1.r) null, 0L, 0L, 0L, (r3.k) null, 0L, 0, false, 0, (j71.c) null, (g3.q0) null, sVar3, 6, 0, 65534);
                } else {
                    sVar3.V();
                }
                return w61.a0.a;
            case 24:
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (sVar4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                    String upperCase = com.google.android.gms.internal.measurement.i4.p0(2131952732, sVar4).toUpperCase(Locale.ROOT);
                    k71.k.f(upperCase, "toUpperCase(...)");
                    ub.b(upperCase, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar4).h, sVar4, 0, 0, 131070);
                } else {
                    sVar4.V();
                }
                return w61.a0.a;
            case 25:
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (sVar5.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                    com.github.rudroid.uitoolkit.text.n0.a("Primary", (w1.r) null, 0L, 0L, 0L, (r3.k) null, 0L, 0, false, 0, (j71.c) null, (g3.q0) null, sVar5, 6, 0, 65534);
                } else {
                    sVar5.V();
                }
                return w61.a0.a;
            case 26:
                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (sVar6.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                    f1.p5.a(com.google.android.gms.internal.measurement.z3.C(2131231173, 0, sVar6), (String) null, (w1.r) null, 0L, sVar6, 56, 12);
                } else {
                    sVar6.V();
                }
                return w61.a0.a;
            case 27:
                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (sVar7.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                    com.github.rudroid.uitoolkit.text.n0.a("Primary", (w1.r) null, 0L, 0L, 0L, (r3.k) null, 0L, 0, false, 0, (j71.c) null, (g3.q0) null, sVar7, 6, 0, 65534);
                } else {
                    sVar7.V();
                }
                return w61.a0.a;
            case 28:
                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (sVar8.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                    f1.p5.a(com.google.android.gms.internal.measurement.z3.C(2131231173, 0, sVar8), (String) null, (w1.r) null, 0L, sVar8, 56, 12);
                } else {
                    sVar8.V();
                }
                return w61.a0.a;
            default:
                sw0.a aVar2 = (sw0.a) obj;
                String str15 = (String) obj2;
                k71.k.g(aVar2, "advancedSearchParameters");
                k71.k.g(str15, "after");
                return new i20(aVar2.b, 30, new aa.u0(str15));
        }
    }
}
