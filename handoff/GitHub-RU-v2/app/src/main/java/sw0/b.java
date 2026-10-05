package sw0;

import aa.t0;
import aa.u0;
import androidx.compose.runtime.a3;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.p1;
import androidx.compose.runtime.s;
import com.google.android.gms.internal.measurement.d5;
import f1.p5;
import f1.ub;
import g3.q0;
import java.util.List;
import java.util.Map;
import jn0.c20;
import jn0.g20;
import jn0.h20;
import jn0.k20;
import jn0.le;
import jn0.me;
import jn0.ne;
import jn0.pe;
import jn0.re;
import jn0.se;
import jn0.te;
import jn0.u20;
import jn0.u60;
import jn0.v20;
import jn0.w60;
import jn0.x60;
import jn0.y60;
import jn0.z60;
import jo.a4;
import jo.b4;
import jo.w3;
import jo.y3;
import jo.z3;
import jo.zi0;
import k71.k;
import l3.v;
import pz0.zy;
import s01.n;
import su0.f;
import su0.g;
import u10.i3;
import u10.l3;
import u10.m3;
import u10.n3;
import ux0.z;
import v1.o;
import w1.r;
import w61.a0;
import x.h0;
import yx0.h;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class b implements j71.e {
    public final /* synthetic */ int r;

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        z3 z3Var;
        f fVar;
        le leVar;
        switch (this.r) {
            case 0:
                c20 c20Var = (c20) obj;
                List list = (List) obj2;
                k.g(c20Var, "data");
                k.g(list, "nodes");
                g20 g20Var = c20Var.a.a;
                k.g(g20Var, "pageInfo");
                h20 h20Var = new h20(g20Var, list);
                String str = c20Var.b;
                String str2 = c20Var.c;
                k.g(str, "id");
                k.g(str2, "__typename");
                return new c20(h20Var, str, str2);
            case 1:
                c20 c20Var2 = (c20) obj;
                k.g(c20Var2, "<this>");
                k.g((a) obj2, "it");
                return Boolean.valueOf(c20Var2.a.b != null);
            case 2:
                d dVar = (d) obj;
                String str3 = (String) obj2;
                k.g(dVar, "issueParameters");
                String str4 = dVar.c;
                k.g(str3, "after");
                String g = f1.e.g("type:issue ", dVar.d);
                u0 u0Var = new u0(str3);
                String str5 = dVar.b;
                aa1.b bVar = t0.d;
                aa1.b u0Var2 = str5 == null ? bVar : new u0(str5);
                if (str4 != null) {
                    bVar = new u0(str4);
                }
                return new v20(g, u0Var, u0Var2, bVar, new u0(Boolean.valueOf((str5 == null || str4 == null) ? false : true)));
            case 3:
                k20 k20Var = (k20) obj;
                List list2 = (List) obj2;
                k.g(k20Var, "data");
                k.g(list2, "nodes");
                u20 u20Var = k20Var.b;
                return k20.a(k20Var, null, new u20(u20Var.a, u20Var.b, list2), 13);
            case 4:
                k20 k20Var2 = (k20) obj;
                k.g(k20Var2, "<this>");
                k.g((d) obj2, "it");
                return Boolean.valueOf(k20Var2.a != null);
            case 5:
                ((Long) obj2).longValue();
                k.g((m00.b) obj, "<unused var>");
                return 5000L;
            case 6:
                String str6 = (String) obj2;
                k.g((n) obj, "<unused var>");
                k.g(str6, "after");
                return new b4(new u0(str6));
            case 7:
                w3 w3Var = (w3) obj;
                List list3 = (List) obj2;
                k.g(w3Var, "data");
                k.g(list3, "nodes");
                a4 a4Var = w3Var.a;
                z3 z3Var2 = a4Var.b;
                if (z3Var2 != null) {
                    y3 y3Var = z3Var2.a;
                    k.g(y3Var, "pageInfo");
                    z3Var = new z3(y3Var, list3);
                } else {
                    z3Var = null;
                }
                String str7 = a4Var.a;
                String str8 = a4Var.c;
                k.g(str7, "id");
                k.g(str8, "__typename");
                a4 a4Var2 = new a4(str7, z3Var, str8);
                String str9 = w3Var.b;
                String str10 = w3Var.c;
                k.g(str9, "id");
                k.g(str10, "__typename");
                return new w3(a4Var2, str9, str10);
            case 8:
                s sVar = (s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    ub.b("Primary Card", (r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar).d, sVar, 6, 0, 131070);
                } else {
                    sVar.V();
                }
                return a0.a;
            case 9:
                ty0.a aVar = (ty0.a) obj;
                String str11 = (String) obj2;
                k.g(aVar, "repositoryOwnerRepositoriesParameters");
                k.g(str11, "after");
                u0 u0Var3 = new u0(str11);
                String str12 = aVar.a;
                String str13 = aVar.b;
                return new g(str12, u0Var3, str13 == null ? t0.d : new u0(str13));
            case 10:
                su0.b bVar2 = (su0.b) obj;
                List list4 = (List) obj2;
                k.g(bVar2, "data");
                k.g(list4, "nodes");
                f fVar2 = bVar2.a;
                if (fVar2 != null) {
                    su0.d dVar2 = fVar2.b.a;
                    k.g(dVar2, "pageInfo");
                    su0.e eVar = new su0.e(dVar2, list4);
                    String str14 = fVar2.a;
                    kw0.a aVar2 = fVar2.c;
                    k.g(str14, "__typename");
                    fVar = new f(str14, eVar, aVar2);
                } else {
                    fVar = null;
                }
                String str15 = bVar2.b;
                String str16 = bVar2.c;
                k.g(str15, "id");
                k.g(str16, "__typename");
                return new su0.b(fVar, str15, str16);
            case 11:
                ty0.c cVar = (ty0.c) obj;
                String str17 = (String) obj2;
                k.g(cVar, "repositoryOwnerRepositoriesParameters");
                k.g(str17, "after");
                u0 u0Var4 = new u0(str17);
                zy j0 = com.google.android.gms.internal.measurement.b4.j0(cVar.a);
                return new z60(u0Var4, j0 == null ? t0.d : new u0(j0), 8);
            case 12:
                u60 u60Var = (u60) obj;
                List list5 = (List) obj2;
                k.g(u60Var, "data");
                k.g(list5, "nodes");
                y60 y60Var = u60Var.a;
                w60 w60Var = y60Var.a.a;
                k.g(w60Var, "pageInfo");
                x60 x60Var = new x60(w60Var, list5);
                String str18 = y60Var.b;
                String str19 = y60Var.c;
                k.g(str18, "id");
                k.g(str19, "__typename");
                y60 y60Var2 = new y60(x60Var, str18, str19);
                String str20 = u60Var.b;
                String str21 = u60Var.c;
                k.g(str20, "id");
                k.g(str21, "__typename");
                return new u60(y60Var2, str20, str21);
            case 13:
                return Integer.valueOf(sy.r.o(d5.u(((xz.n) obj).c), d5.u(((xz.n) obj2).c), 0));
            case 14:
                u1.a aVar3 = (u1.a) obj;
                o oVar = (f1) obj2;
                if (!(oVar instanceof o)) {
                    throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                }
                o oVar2 = oVar;
                Object s = ((j71.e) v.d.r).s(aVar3, oVar2.getValue());
                if (s == null) {
                    return null;
                }
                a3 h = oVar2.h();
                k.e(h, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
                return new p1(s, h);
            case 15:
                u1.c cVar2 = (u1.c) obj2;
                Map map = cVar2.r;
                h0 h0Var = cVar2.s;
                Object[] objArr = h0Var.b;
                Object[] objArr2 = h0Var.c;
                long[] jArr = h0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj3 = objArr[i4];
                                    Map b = ((u1.e) objArr2[i4]).b();
                                    if (b.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, b);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                            }
                        }
                        if (i != length) {
                            i++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 16:
                return obj2;
            case 17:
                s sVar2 = (s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ub.b("Input Chip", (r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (q0) null, sVar2, 6, 0, 262142);
                } else {
                    sVar2.V();
                }
                return a0.a;
            case 18:
                s sVar3 = (s) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (sVar3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    p5.a(com.google.android.gms.internal.measurement.z3.C(2131231325, 0, sVar3), (String) null, (r) null, 0L, sVar3, 56, 12);
                } else {
                    sVar3.V();
                }
                return a0.a;
            case 19:
                s sVar4 = (s) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (sVar4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                    p5.a(com.google.android.gms.internal.measurement.z3.C(2131231499, 0, sVar4), (String) null, (r) null, 0L, sVar4, 56, 12);
                } else {
                    sVar4.V();
                }
                return a0.a;
            case 20:
                z zVar = (z) obj;
                String str22 = (String) obj2;
                k.g(zVar, "id");
                k.g(str22, "after");
                return new h(zVar.a, new u0(10), new u0(str22), new u0(zVar.b));
            case 21:
                yx0.b bVar3 = (yx0.b) obj;
                List list6 = (List) obj2;
                k.g(bVar3, "data");
                k.g(list6, "nodes");
                yx0.e eVar2 = bVar3.a;
                yx0.e eVar3 = null;
                if (eVar2 != null) {
                    yx0.f fVar3 = eVar2.c;
                    eVar3 = yx0.e.a(eVar2, fVar3 != null ? yx0.f.a(fVar3, yx0.c.a(fVar3.b, null, list6, 3)) : null);
                }
                return yx0.b.a(bVar3, eVar3);
            case 22:
                ((Long) obj2).longValue();
                k.g((zi0) obj, "<unused var>");
                return 1000L;
            case 23:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 24:
                return ((a71.h) obj).A((a71.f) obj2);
            case 25:
                return ((a71.h) obj).A((a71.f) obj2);
            case 26:
                String str23 = (String) obj2;
                k.g((n) obj, "<unused var>");
                k.g(str23, "after");
                return new n3(new u0(str23));
            case 27:
                i3 i3Var = (i3) obj;
                List list7 = (List) obj2;
                k.g(i3Var, "data");
                k.g(list7, "nodes");
                m3 m3Var = i3Var.a;
                l3 l3Var = m3Var.b;
                return new i3(new m3(m3Var.a, l3Var != null ? new l3(l3Var.a, list7) : null, m3Var.c));
            case 28:
                String str24 = (String) obj2;
                k.g((n) obj, "<unused var>");
                k.g(str24, "after");
                return new te(new u0(30), new u0(str24));
            default:
                me meVar = (me) obj;
                List list8 = (List) obj2;
                k.g(meVar, "data");
                k.g(list8, "nodes");
                se seVar = meVar.a;
                le leVar2 = seVar.c;
                if (leVar2 != null) {
                    ne neVar = leVar2.a;
                    re reVar = neVar.b.a;
                    k.g(reVar, "pageInfo");
                    ne neVar2 = new ne(neVar.a, new pe(reVar, list8));
                    String str25 = leVar2.b;
                    String str26 = leVar2.c;
                    k.g(str25, "id");
                    k.g(str26, "__typename");
                    leVar = new le(neVar2, str25, str26);
                } else {
                    leVar = null;
                }
                String str27 = seVar.a;
                String str28 = seVar.b;
                k.g(str27, "__typename");
                k.g(str28, "id");
                se seVar2 = new se(str27, str28, leVar);
                String str29 = meVar.b;
                String str30 = meVar.c;
                k.g(str29, "id");
                k.g(str30, "__typename");
                return new me(seVar2, str29, str30);
        }
    }
}
