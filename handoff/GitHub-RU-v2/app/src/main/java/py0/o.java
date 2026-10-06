package py0;

import aa.t0;
import aa.u0;
import androidx.compose.runtime.v1;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import f1.p5;
import f1.ub;
import g3.q0;
import java.util.List;
import jo.h90;
import jo.j90;
import jo.k90;
import jo.l90;
import jo.m90;
import kc0.me;
import kc0.n3;
import kc0.ne;
import kc0.pe;
import kc0.qe;
import kc0.re;
import m10.x40;
import ri0.x0;
import u10.fx;
import u10.gx;
import u10.hx;
import u10.xw;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class o implements j71.e {
    public final /* synthetic */ int r;

    public /* synthetic */ o(int i) {
        this.r = i;
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        bw.f fVar;
        int i;
        String str;
        switch (this.r) {
            case 0:
                p pVar = (p) obj;
                String str2 = (String) obj2;
                k71.k.g(pVar, "repositoryIssueTypesParameters");
                k71.k.g(str2, "after");
                return new w(new u0(30), new u0(str2), pVar.a, pVar.b);
            case 1:
                r rVar = (r) obj;
                List list = (List) obj2;
                k71.k.g(rVar, "data");
                k71.k.g(list, "nodes");
                v vVar = rVar.a;
                v vVar2 = null;
                s sVar = null;
                if (vVar != null) {
                    s sVar2 = vVar.a;
                    if (sVar2 != null) {
                        u uVar = sVar2.a;
                        k71.k.g(uVar, "pageInfo");
                        sVar = new s(uVar, list);
                    }
                    String str3 = vVar.b;
                    String str4 = vVar.c;
                    k71.k.g(str3, "id");
                    k71.k.g(str4, "__typename");
                    vVar2 = new v(sVar, str3, str4);
                }
                String str5 = rVar.b;
                String str6 = rVar.c;
                k71.k.g(str5, "id");
                k71.k.g(str6, "__typename");
                return new r(vVar2, str5, str6);
            case 2:
                q00.a aVar = (q00.a) obj;
                String str7 = (String) obj2;
                k71.k.g(aVar, "repositoryOwnerRepositoriesParameters");
                k71.k.g(str7, "after");
                u0 u0Var = new u0(str7);
                String str8 = aVar.a;
                String str9 = aVar.b;
                return new bw.g(str8, u0Var, str9 == null ? t0.d : new u0(str9));
            case 3:
                bw.b bVar = (bw.b) obj;
                List list2 = (List) obj2;
                k71.k.g(bVar, "data");
                k71.k.g(list2, "nodes");
                bw.f fVar2 = bVar.a;
                if (fVar2 != null) {
                    bw.d dVar = fVar2.b.a;
                    k71.k.g(dVar, "pageInfo");
                    bw.e eVar = new bw.e(dVar, list2);
                    String str10 = fVar2.a;
                    vx.a aVar2 = fVar2.c;
                    k71.k.g(str10, "__typename");
                    fVar = new bw.f(str10, eVar, aVar2);
                } else {
                    fVar = null;
                }
                String str11 = bVar.b;
                String str12 = bVar.c;
                k71.k.g(str11, "id");
                k71.k.g(str12, "__typename");
                return new bw.b(fVar, str11, str12);
            case 4:
                q00.d dVar2 = (q00.d) obj;
                String str13 = (String) obj2;
                k71.k.g(dVar2, "repositoryOwnerRepositoriesParameters");
                k71.k.g(str13, "after");
                u0 u0Var2 = new u0(str13);
                x40 P = aa1.b.P(dVar2.a);
                return new m90(u0Var2, P == null ? t0.d : new u0(P), 8);
            case 5:
                h90 h90Var = (h90) obj;
                List list3 = (List) obj2;
                k71.k.g(h90Var, "data");
                k71.k.g(list3, "nodes");
                l90 l90Var = h90Var.a;
                j90 j90Var = l90Var.a.a;
                k71.k.g(j90Var, "pageInfo");
                k90 k90Var = new k90(j90Var, list3);
                String str14 = l90Var.b;
                String str15 = l90Var.c;
                k71.k.g(str14, "id");
                k71.k.g(str15, "__typename");
                l90 l90Var2 = new l90(k90Var, str14, str15);
                String str16 = h90Var.b;
                String str17 = h90Var.c;
                k71.k.g(str16, "id");
                k71.k.g(str17, "__typename");
                return new h90(l90Var2, str16, str17);
            case 6:
                qa0.a aVar3 = (qa0.a) obj;
                String str18 = (String) obj2;
                k71.k.g(aVar3, "issueParameters");
                String str19 = aVar3.c;
                k71.k.g(str18, "after");
                String g = f1.e.g("type:issue ", aVar3.d);
                u0 u0Var3 = new u0(str18);
                String str20 = aVar3.b;
                aa1.b bVar2 = t0.d;
                aa1.b u0Var4 = str20 == null ? bVar2 : new u0(str20);
                if (str19 != null) {
                    bVar2 = new u0(str19);
                }
                return new hx(g, u0Var3, u0Var4, bVar2, new u0(Boolean.valueOf((str20 == null || str19 == null) ? false : true)));
            case 7:
                xw xwVar = (xw) obj;
                List list4 = (List) obj2;
                k71.k.g(xwVar, "data");
                k71.k.g(list4, "nodes");
                gx gxVar = xwVar.b;
                return xw.a(xwVar, (fx) null, new gx(gxVar.a, gxVar.b, list4), 1);
            case 8:
                xw xwVar2 = (xw) obj;
                k71.k.g(xwVar2, "<this>");
                k71.k.g((qa0.a) obj2, "it");
                return Boolean.valueOf(xwVar2.a != null);
            case 9:
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar3.S(intValue & 1, (intValue & 3) != 2)) {
                    p5.a(z3.C(2131231499, 0, sVar3), i4.p0(2131954175, sVar3), (w1.r) null, ih.d.b(sVar3).A, sVar3, 8, 4);
                } else {
                    sVar3.V();
                }
                return w61.a0.a;
            case 10:
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar4.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object N = sVar4.N();
                    Object obj3 = N;
                    if (N == androidx.compose.runtime.n.a) {
                        q00.c cVar = new q00.c(12);
                        sVar4.n0(cVar);
                        obj3 = cVar;
                    }
                    ub.b(i4.p0(2131953565, sVar4), d3.q.b(w1.o.a, false, (j71.c) obj3), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar4, 0, 0, 262140);
                } else {
                    sVar4.V();
                }
                return w61.a0.a;
            case 11:
                androidx.compose.runtime.s sVar5 = (androidx.compose.runtime.s) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (sVar5.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ub.b("Hello", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar5, 6, 0, 262142);
                } else {
                    sVar5.V();
                }
                return w61.a0.a;
            case 12:
                androidx.compose.runtime.s sVar6 = (androidx.compose.runtime.s) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (sVar6.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ub.b("Hello", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar6, 6, 0, 262142);
                } else {
                    sVar6.V();
                }
                return w61.a0.a;
            case 13:
                androidx.compose.runtime.s sVar7 = (androidx.compose.runtime.s) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (sVar7.S(intValue5 & 1, (intValue5 & 3) != 2)) {
                    p5.a(z3.C(2131231405, 0, sVar7), i4.p0(2131953801, sVar7), (w1.r) null, ih.d.b(sVar7).s, sVar7, 8, 4);
                } else {
                    sVar7.V();
                }
                return w61.a0.a;
            case 14:
                androidx.compose.runtime.s sVar8 = (androidx.compose.runtime.s) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (sVar8.S(intValue6 & 1, (intValue6 & 3) != 2)) {
                    androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar8, 0);
                    int hashCode = Long.hashCode(sVar8.T);
                    v1 l = sVar8.l();
                    w1.r c = w1.a.c(sVar8, w1.o.a);
                    v2.h.o.getClass();
                    v2.f fVar3 = v2.g.b;
                    sVar8.g0();
                    if (sVar8.S) {
                        sVar8.k(fVar3);
                    } else {
                        sVar8.q0();
                    }
                    androidx.compose.runtime.t.I(sVar8, v2.g.f, a);
                    androidx.compose.runtime.t.I(sVar8, v2.g.e, l);
                    androidx.compose.runtime.t.w(sVar8, Integer.valueOf(hashCode), v2.g.g);
                    androidx.compose.runtime.t.E(sVar8, v2.g.h);
                    androidx.compose.runtime.t.I(sVar8, v2.g.d, c);
                    ub.b("This is a very long title that probably won't fit on the screen", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 1, 0, (j71.c) null, (q0) null, sVar8, 6, 24576, 245758);
                    ub.b("This is a very long subtitle that probably won't fit on the screen", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar8).x, sVar8, 6, 0, 131070);
                    sVar8.q(true);
                } else {
                    sVar8.V();
                }
                return w61.a0.a;
            case 15:
                androidx.compose.runtime.s sVar9 = (androidx.compose.runtime.s) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (sVar9.S(intValue7 & 1, (intValue7 & 3) != 2)) {
                    p5.a(z3.C(2131231437, 0, sVar9), i4.p0(2131954517, sVar9), (w1.r) null, ih.d.b(sVar9).s, sVar9, 8, 4);
                } else {
                    sVar9.V();
                }
                return w61.a0.a;
            case 16:
                androidx.compose.runtime.s sVar10 = (androidx.compose.runtime.s) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (sVar10.S(intValue8 & 1, (intValue8 & 3) != 2)) {
                    p5.a(z3.C(2131231405, 0, sVar10), i4.p0(2131953801, sVar10), (w1.r) null, ih.d.b(sVar10).s, sVar10, 8, 4);
                } else {
                    sVar10.V();
                }
                return w61.a0.a;
            case 17:
                r20.d dVar3 = (r20.d) obj2;
                k71.k.g((String) obj, "<unused var>");
                if (dVar3 == null || (i = dVar3.b) <= 1) {
                    return null;
                }
                return new r20.d(dVar3.a, i - 1);
            case 18:
                r20.d dVar4 = (r20.d) obj2;
                k71.k.g((String) obj, "<unused var>");
                if (dVar4 == null || (str = dVar4.a) == null) {
                    str = "";
                }
                return new r20.d(str, dVar4 != null ? 1 + dVar4.b : 1);
            case 19:
                rd0.a aVar4 = (rd0.a) obj;
                String str21 = (String) obj2;
                k71.k.g(aVar4, "id");
                k71.k.g(str21, "after");
                return new re(aVar4.a, aVar4.b, aVar4.c, new u0(str21), 16);
            case 20:
                me meVar = (me) obj;
                List list5 = (List) obj2;
                k71.k.g(meVar, "data");
                k71.k.g(list5, "nodes");
                qe qeVar = meVar.a;
                qe qeVar2 = null;
                pe peVar = null;
                ne neVar = null;
                if (qeVar != null) {
                    ne neVar2 = qeVar.b;
                    if (neVar2 != null) {
                        pe peVar2 = neVar2.c;
                        if (peVar2 != null) {
                            x0 x0Var = peVar2.c;
                            ri0.f0 f0Var = x0Var.l;
                            peVar = pe.a(peVar2, x0.a(x0Var, f0Var != null ? new ri0.f0(new ri0.t0(f0Var.a.a, list5)) : null, null, 30719));
                        }
                        neVar = ne.a(neVar2, peVar);
                    }
                    qeVar2 = qe.a(qeVar, neVar);
                }
                return new me(qeVar2);
            case 21:
                androidx.compose.runtime.s sVar11 = (androidx.compose.runtime.s) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if (sVar11.S(intValue9 & 1, (intValue9 & 3) != 2)) {
                    ub.b("Title", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar11, 6, 0, 262142);
                } else {
                    sVar11.V();
                }
                return w61.a0.a;
            case 22:
                androidx.compose.runtime.s sVar12 = (androidx.compose.runtime.s) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if (sVar12.S(intValue10 & 1, (intValue10 & 3) != 2)) {
                    ub.b("Title", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar12, 6, 0, 262142);
                } else {
                    sVar12.V();
                }
                return w61.a0.a;
            case 23:
                androidx.compose.runtime.s sVar13 = (androidx.compose.runtime.s) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if (!sVar13.S(intValue11 & 1, (intValue11 & 3) != 2)) {
                    sVar13.V();
                }
                return w61.a0.a;
            case 24:
                androidx.compose.runtime.s sVar14 = (androidx.compose.runtime.s) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if (sVar14.S(intValue12 & 1, (intValue12 & 3) != 2)) {
                    ub.b("Edit title", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar14, 6, 0, 262142);
                } else {
                    sVar14.V();
                }
                return w61.a0.a;
            case 25:
                androidx.compose.runtime.s sVar15 = (androidx.compose.runtime.s) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if (sVar15.S(intValue13 & 1, (intValue13 & 3) != 2)) {
                    ub.b("Edit title", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar15, 6, 0, 262142);
                } else {
                    sVar15.V();
                }
                return w61.a0.a;
            case 26:
                androidx.compose.runtime.s sVar16 = (androidx.compose.runtime.s) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if (sVar16.S(intValue14 & 1, (intValue14 & 3) != 2)) {
                    ub.b("Edit title", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar16, 6, 0, 262142);
                } else {
                    sVar16.V();
                }
                return w61.a0.a;
            case 27:
                androidx.compose.runtime.s sVar17 = (androidx.compose.runtime.s) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if (!sVar17.S(intValue15 & 1, (intValue15 & 3) != 2)) {
                    sVar17.V();
                }
                return w61.a0.a;
            case 28:
                androidx.compose.runtime.s sVar18 = (androidx.compose.runtime.s) obj;
                int intValue16 = ((Integer) obj2).intValue();
                if (sVar18.S(intValue16 & 1, (intValue16 & 3) != 2)) {
                    ub.b("Edit title", (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar18, 6, 0, 262142);
                } else {
                    sVar18.V();
                }
                return w61.a0.a;
            default:
                String str22 = (String) obj2;
                k71.k.g((s01.n) obj, "<unused var>");
                k71.k.g(str22, "after");
                return new n3(new u0(str22));
        }
    }
    public static final Object a = null;
}
