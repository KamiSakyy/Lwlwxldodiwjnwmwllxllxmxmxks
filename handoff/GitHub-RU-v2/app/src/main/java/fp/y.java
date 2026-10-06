package fp;

import ap0.e2;
import java.util.ArrayList;
import java.util.List;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class y implements j71.c {
    public final /* synthetic */ int r;

    public final Object k(Object obj) {
        List<c0> list;
        on.l lVar;
        e2 e2Var;
        gy0.t tVar;
        int i = this.r;
        s3.p pVar = x61.r.r;
        boolean z = false;
        z = false;
        switch (i) {
            case 0:
                b0 b0Var = (b0) obj;
                k71.k.g(b0Var, "data");
                e0 e0Var = b0Var.a;
                f0 f0Var = e0Var != null ? e0Var.b : null;
                boolean z2 = f0Var != null ? f0Var.c.a : false;
                String str = f0Var != null ? f0Var.c.c : null;
                if (f0Var != null && !f0Var.c.b) {
                    z = true;
                }
                x01.i iVar = new x01.i(str, z2, z);
                if (f0Var != null && (list = f0Var.b) != null) {
                    s3.p arrayList = new ArrayList();
                    for (c0 c0Var : list) {
                        on.j S = c0Var != null ? k41.b.S(c0Var.b) : null;
                        if (S != null) {
                            arrayList.add(S);
                        }
                    }
                    r9 = arrayList;
                }
                if (r9 != null) {
                    pVar = r9;
                }
                return new on.f(pVar, iVar);
            case 1:
                h0 h0Var = (h0) obj;
                k71.k.g(h0Var, "params");
                return new l1(30, new aa.u0((Object) null), h0Var.a, h0Var.b);
            case 2:
                b1 b1Var = (b1) obj;
                k71.k.g(b1Var, "data");
                return Boolean.valueOf(b1Var.b.a.b != null ? !r1.isEmpty() : false);
            case 3:
                b1 b1Var2 = (b1) obj;
                k71.k.g(b1Var2, "data");
                g1Shadow g1Var = b1Var2.b.a.c;
                boolean z3 = g1Var.a;
                String str2 = g1Var.c;
                return new x01.i(str2, z3, str2 == null);
            case 4:
                b1 b1Var3 = (b1) obj;
                k71.k.g(b1Var3, "data");
                List list2 = b1Var3.b.a.b;
                return list2 == null ? pVar : list2;
            case 5:
                b1 b1Var4 = (b1) obj;
                k71.k.g(b1Var4, "data");
                i1 i1Var = b1Var4.b.a;
                g1Shadow g1Var2 = i1Var.c;
                x01.i iVar2 = new x01.i(g1Var2.c, g1Var2.a, !g1Var2.b);
                List<d1> list3 = i1Var.b;
                if (list3 != null) {
                    s3.p arrayList2 = new ArrayList();
                    for (d1 d1Var : list3) {
                        if (d1Var != null) {
                            hp.u uVar = d1Var.b;
                            lVar = new on.l(uVar.a, uVar.b, uVar.c);
                        } else {
                            lVar = null;
                        }
                        if (lVar != null) {
                            arrayList2.add(lVar);
                        }
                    }
                    r9 = arrayList2;
                }
                if (r9 != null) {
                    pVar = r9;
                }
                return new on.m(pVar, iVar2);
            case 6:
                gy0.q qVar = (gy0.q) obj;
                k71.k.g(qVar, "data");
                gy0.v vVar = qVar.a;
                if (vVar == null || (e2Var = vVar.d) == null) {
                    return null;
                }
                return i21.a.K(e2Var);
            case 7:
                gy0.q qVar2 = (gy0.q) obj;
                k71.k.g(qVar2, "$this$observeWithPartialResultErrors");
                gy0.v vVar2 = qVar2.a;
                if (vVar2 != null && (tVar = vVar2.c) != null) {
                    r9 = tVar.a;
                }
                return Boolean.valueOf(r9 != null);
            case 8:
                return Boolean.valueOf(!(((g3.b) obj) instanceof g3.u));
            case 9:
                g3.r rVar = (g3.r) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(rVar.b);
                sb.append(", ");
                return x.i.j(sb, rVar.c, ')');
            case 10:
                k71.k.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list4 = (List) obj;
                Object obj2 = list4.get(0);
                j71.c cVar = (j71.c) g3.f0.i.s;
                Boolean bool = Boolean.FALSE;
                g3.h0 h0Var2 = (k71.k.b(obj2, bool) || obj2 == null) ? null : (g3.h0) cVar.k(obj2);
                Object obj3 = list4.get(1);
                g3.h0 h0Var3 = (k71.k.b(obj3, bool) || obj3 == null) ? null : (g3.h0) cVar.k(obj3);
                Object obj4 = list4.get(2);
                g3.h0 h0Var4 = (k71.k.b(obj4, bool) || obj4 == null) ? null : (g3.h0) cVar.k(obj4);
                Object obj5 = list4.get(3);
                if (!k71.k.b(obj5, bool) && obj5 != null) {
                    r9 = (g3.h0) cVar.k(obj5);
                }
                return new g3.n0(h0Var2, h0Var3, h0Var4, r9);
            case 11:
                k71.k.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list5 = (List) obj;
                Object obj6 = list5.get(1);
                List list6 = (k71.k.b(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((j71.c) g3.f0.b.s).k(obj6);
                Object obj7 = list5.get(0);
                r9 = obj7 != null ? (String) obj7 : null;
                k71.k.d(r9);
                return new g3.g(list6, r9);
            case 12:
                k71.k.e(obj, "null cannot be cast to non-null type kotlin.Int");
                return new r3.l(((Integer) obj).intValue());
            case 13:
                k71.k.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list7 = (List) obj;
                return new r3.p(((Number) list7.get(0)).floatValue(), ((Number) list7.get(1)).floatValue());
            case 14:
                k71.k.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list8 = (List) obj;
                Object obj8 = list8.get(0);
                s3.p[] pVarArr = s3.o.b;
                j71.c cVar2 = g3.f0.x.s;
                Boolean bool2 = Boolean.FALSE;
                k71.k.b(obj8, bool2);
                s3.o oVar = obj8 != null ? (s3.o) cVar2.k(obj8) : null;
                k71.k.d(oVar);
                long j = oVar.a;
                Object obj9 = list8.get(1);
                k71.k.b(obj9, bool2);
                r9 = obj9 != null ? (s3.o) cVar2.k(obj9) : null;
                k71.k.d(r9);
                return new r3.q(j, ((s3.o) r9).a);
            case 15:
                k71.k.e(obj, "null cannot be cast to non-null type kotlin.Int");
                return new k3.s(((Integer) obj).intValue());
            case 16:
                k71.k.e(obj, "null cannot be cast to non-null type kotlin.Float");
                return new r3.a(((Float) obj).floatValue());
            case 17:
                k71.k.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list9 = (List) obj;
                Object obj10 = list9.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                k71.k.d(num);
                int intValue = num.intValue();
                Object obj11 = list9.get(1);
                r9 = obj11 != null ? (Integer) obj11 : null;
                k71.k.d(r9);
                return new g3.p0(g3.g0.b(intValue, r9.intValue()));
            case 18:
                k71.k.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list10 = (List) obj;
                Object obj12 = list10.get(0);
                int i2 = d2.t.l;
                Boolean bool3 = Boolean.FALSE;
                k71.k.b(obj12, bool3);
                d2.t tVar2 = obj12 != null ? k71.k.b(obj12, Boolean.FALSE) ? new d2.t(d2.t.k) : new d2.t(d2.a0.c(((Integer) obj12).intValue())) : null;
                k71.k.d(tVar2);
                long j2 = tVar2.a;
                Object obj13 = list10.get(1);
                g3.e0 e0Var2 = g3.f0.z;
                k71.k.b(obj13, bool3);
                c2.b bVar = obj13 != null ? (c2.b) e0Var2.s.k(obj13) : null;
                k71.k.d(bVar);
                long j3 = bVar.a;
                Object obj14 = list10.get(2);
                r9 = obj14 != null ? (Float) obj14 : null;
                k71.k.d(r9);
                return new d2.o0(r9.floatValue(), j2, j3);
            case 19:
                k71.k.e(obj, "null cannot be cast to non-null type kotlin.Int");
                return new r3.k(((Integer) obj).intValue());
            case 20:
                k71.k.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list11 = (List) obj;
                Object obj15 = list11.get(0);
                String str3 = obj15 != null ? (String) obj15 : null;
                k71.k.d(str3);
                Object obj16 = list11.get(1);
                return new g3.m(str3, (k71.k.b(obj16, Boolean.FALSE) || obj16 == null) ? null : (g3.n0) ((j71.c) g3.f0.j.s).k(obj16), (g3.o) null);
            case 21:
                k71.k.e(obj, "null cannot be cast to non-null type kotlin.Int");
                return new r3.m(((Integer) obj).intValue());
            case 22:
                k71.k.e(obj, "null cannot be cast to non-null type kotlin.Int");
                return new r3.d(((Integer) obj).intValue());
            case 23:
                k71.k.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list12 = (List) obj;
                ArrayList arrayList3 = new ArrayList(list12.size());
                int size = list12.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj17 = list12.get(i3);
                    g3.e eVar = (k71.k.b(obj17, Boolean.FALSE) || obj17 == null) ? null : (g3.e) ((j71.c) g3.f0.c.s).k(obj17);
                    k71.k.d(eVar);
                    arrayList3.add(eVar);
                }
                return arrayList3;
            case 24:
                k71.k.e(obj, "null cannot be cast to non-null type kotlin.Int");
                return new k3.o(((Integer) obj).intValue());
            case 25:
                k71.k.e(obj, "null cannot be cast to non-null type kotlin.Int");
                return new k3.p(((Integer) obj).intValue());
            case 26:
                Boolean bool4 = Boolean.FALSE;
                if (k71.k.b(obj, bool4)) {
                    return new s3.o(s3.o.c);
                }
                k71.k.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list13 = (List) obj;
                Object obj18 = list13.get(0);
                Float f = obj18 != null ? (Float) obj18 : null;
                k71.k.d(f);
                float floatValue = f.floatValue();
                Object obj19 = list13.get(1);
                g3.e0 e0Var3 = g3.f0.y;
                k71.k.b(obj19, bool4);
                r9 = obj19 != null ? (s3.p) e0Var3.s.k(obj19) : null;
                k71.k.d(r9);
                return new s3.o(t1.E(floatValue, r9.a));
            case 27:
                return k71.k.b(obj, 0) ? new s3.p(8589934592L) : k71.k.b(obj, 1) ? new s3.p(4294967296L) : new s3.p(0L);
            case 28:
                if (k71.k.b(obj, Boolean.FALSE)) {
                    return new c2.b(9205357640488583168L);
                }
                k71.k.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list14 = (List) obj;
                Object obj20 = list14.get(0);
                Float f2 = obj20 != null ? (Float) obj20 : null;
                k71.k.d(f2);
                float floatValue2 = f2.floatValue();
                Object obj21 = list14.get(1);
                k71.k.d(obj21 != null ? (Float) obj21 : null);
                return new c2.b((Float.floatToRawIntBits(floatValue2) << 32) | (Float.floatToRawIntBits(r9.floatValue()) & 4294967295L));
            default:
                k71.k.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list15 = (List) obj;
                ArrayList arrayList4 = new ArrayList(list15.size());
                int size2 = list15.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Object obj22 = list15.get(i4);
                    n3.a aVar = (k71.k.b(obj22, Boolean.FALSE) || obj22 == null) ? null : (n3.a) ((j71.c) g3.f0.B.s).k(obj22);
                    k71.k.d(aVar);
                    arrayList4.add(aVar);
                }
                return new n3.b(arrayList4);
        }
    }
}
