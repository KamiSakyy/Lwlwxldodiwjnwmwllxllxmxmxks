package xn;

import com.github.rudroid.organizations.OrganizationsFragment;
import com.github.rudroid.profile.navigation.OrganizationsRoute;
import com.github.rudroid.profile.navigation.UserOrOgProfileScreenRoute;
import com.github.rudroid.profile.navigation.fragments.UserOrOrganizationProfileNavigationFragment;
import com.github.rudroid.projects.navigation.OwnerProjectsEntryPointRoute;
import com.github.rudroid.projects.navigation.OwnerProjectsRoute;
import com.github.rudroid.repository.navigation.UsersRoute;
import com.github.rudroid.users.UsersFragment;
import cq.a6;
import cq.b6;
import cq.f6;
import cq.i6;
import cq.j6;
import cq.o6;
import cq.w6;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jo.jf;
import jo.kf;
import jo.lf;
import jo.mf;
import jo.nf;
import jo.of;
import jo.pf;
import jo.rf;
import jo.zi0;
import z6.e;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class q1 implements j71.c {
    public final /* synthetic */ int r;

    public /* synthetic */ q1(int i) {
        this.r = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:210:0x06c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03bc A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v12, types: [t10.t] */
    /* JADX WARN: Type inference failed for: r7v18, types: [t10.q] */
    /* JADX WARN: Type inference failed for: r7v24, types: [t10.p] */
    /* JADX WARN: Type inference failed for: r7v30, types: [t10.o] */
    /* JADX WARN: Type inference failed for: r7v36, types: [t10.v] */
    /* JADX WARN: Type inference failed for: r7v41, types: [t10.w] */
    /* JADX WARN: Type inference failed for: r7v47, types: [t10.m] */
    /* JADX WARN: Type inference failed for: r7v51, types: [t10.n] */
    /* JADX WARN: Type inference failed for: r7v58, types: [t10.c] */
    /* JADX WARN: Type inference failed for: r7v8, types: [t10.u] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        lf lfVar;
        nf nfVar;
        List list;
        lf lfVar2;
        nf nfVar2;
        pf pfVar;
        lf lfVar3;
        nf nfVar3;
        ArrayList arrayList;
        t10.b bVar;
        t10.b bVar2;
        v10.f fVar;
        v10.b bVar3;
        List list2;
        v10.f fVar2;
        v10.b bVar4;
        v10.g gVar;
        v10.f fVar3;
        v10.b bVar5;
        ArrayList arrayList2;
        Iterator it;
        jn.h hVar;
        Iterator it2;
        int i;
        String str;
        Object aVar;
        Object cVar;
        x10.c cVar2;
        x10.c cVar3;
        switch (this.r) {
            case 0:
                String str2 = (String) obj;
                k71.k.g(str2, "it");
                return "\"" + str2 + "\"";
            case 1:
                l81.f fVar4 = (l81.f) obj;
                k71.k.g(fVar4, "$this$Json");
                fVar4.c = true;
                fVar4.e = true;
                fVar4.b = false;
                return w61.a0.a;
            case 2:
                k71.k.g((ar0.p) obj, "it");
                return Boolean.TRUE;
            case 3:
                k71.k.g((ar0.p) obj, "it");
                return Boolean.TRUE;
            case 4:
                k71.k.g((ar0.p) obj, "it");
                return Boolean.TRUE;
            case 5:
                k71.k.g((ar0.p) obj, "it");
                return Boolean.TRUE;
            case 6:
                zi0 zi0Var = (zi0) obj;
                k71.k.g(zi0Var, "data");
                return Boolean.valueOf(aa1.b.F(zi0Var));
            case 7:
                k71.k.g((d3.c0) obj, "$this$clearAndSetSemantics");
                return w61.a0.a;
            case 8:
                w1.r rVar = (w1.r) obj;
                k71.k.g(rVar, "$this$applyIf");
                return androidx.compose.foundation.layout.b.B(rVar, 0.0f, ih.a.l, 0.0f, 0.0f, 13);
            case 9:
                w1.r rVar2 = (w1.r) obj;
                k71.k.g(rVar2, "$this$applyIf");
                return androidx.compose.foundation.layout.b.B(rVar2, 0.0f, 0.0f, 0.0f, ih.a.l, 7);
            case 10:
                d3.c0 c0Var = (d3.c0) obj;
                k71.k.g(c0Var, "$this$semantics");
                d3.z.l(c0Var, 0);
                return w61.a0.a;
            case 11:
                w1.r rVar3 = (w1.r) obj;
                k71.k.g(rVar3, "$this$applyIf");
                return androidx.compose.foundation.layout.b.B(rVar3, 0.0f, ih.a.l, 0.0f, 0.0f, 13);
            case 12:
                w1.r rVar4 = (w1.r) obj;
                k71.k.g(rVar4, "$this$applyIf");
                return androidx.compose.foundation.layout.b.B(rVar4, 0.0f, 0.0f, 0.0f, ih.a.l, 7);
            case 13:
                d3.c0 c0Var2 = (d3.c0) obj;
                k71.k.g(c0Var2, "$this$semantics");
                d3.z.l(c0Var2, 0);
                return w61.a0.a;
            case 14:
                v7.a aVar2 = (v7.a) obj;
                k71.k.g(aVar2, "_connection");
                v7.c F0 = aVar2.F0("SELECT * FROM ai_models ORDER BY updated_at DESC LIMIT ?");
                try {
                    F0.c(1, 3);
                    int o = y9.a.o(F0, "id");
                    int o2 = y9.a.o(F0, "updated_at");
                    ArrayList arrayList3 = new ArrayList();
                    while (F0.B0()) {
                        arrayList3.add(new yj.a(F0.l0(o), F0.getLong(o2)));
                    }
                    return arrayList3;
                } finally {
                    F0.close();
                }
            case 15:
                zm0.e eVar = (zm0.e) obj;
                k71.k.g(eVar, "$this$fetchWithPartialResultErrors");
                return Boolean.valueOf(eVar.b != null);
            case 16:
                k71.k.g((s01.n) obj, "it");
                return new rf(new aa.u0(30), aa.t0.d);
            case 17:
                kf kfVar = (kf) obj;
                k71.k.g(kfVar, "data");
                jf jfVar = kfVar.a.c;
                return Boolean.valueOf((jfVar == null || (lfVar = jfVar.a) == null || (nfVar = lfVar.b) == null || (list = nfVar.b) == null) ? false : !list.isEmpty());
            case 18:
                kf kfVar2 = (kf) obj;
                k71.k.g(kfVar2, "data");
                jf jfVar2 = kfVar2.a.c;
                if (jfVar2 == null || (lfVar2 = jfVar2.a) == null || (nfVar2 = lfVar2.b) == null || (pfVar = nfVar2.a) == null) {
                    return null;
                }
                return new x01.i(pfVar.a, pfVar.b, !pfVar.c);
            case 19:
                kf kfVar3 = (kf) obj;
                k71.k.g(kfVar3, "data");
                jf jfVar3 = kfVar3.a.c;
                List list3 = (jfVar3 == null || (lfVar3 = jfVar3.a) == null || (nfVar3 = lfVar3.b) == null) ? null : nfVar3.b;
                return list3 == null ? x61.rShadow.r : list3;
            case 20:
                kf kfVar4 = (kf) obj;
                k71.k.g(kfVar4, "data");
                jf jfVar4 = kfVar4.a.c;
                if (jfVar4 == null) {
                    return null;
                }
                nf nfVar4 = jfVar4.a.b;
                pf pfVar2 = nfVar4.a;
                x01.i iVar = new x01.i(pfVar2.a, pfVar2.b, !pfVar2.c);
                List<of> list4 = nfVar4.b;
                ArrayList arrayList4 = x61.rShadow.r;
                if (list4 != null) {
                    arrayList = new ArrayList();
                    for (of ofVar : list4) {
                        if (ofVar != null) {
                            cq.r rVar5 = ofVar.b;
                            if (rVar5 != null) {
                                cq.wShadow wVar = rVar5.c;
                                ZonedDateTime zonedDateTime = wVar.b;
                                boolean z = wVar.c;
                                String str3 = wVar.d;
                                com.github.service.models.response.a e = v8.l0.e(wVar.a.c);
                                t10.eShadow a = xp.a.a(wVar.f.c);
                                String str4 = wVar.e;
                                ArrayList arrayList5 = rVar5.b;
                                ArrayList arrayList6 = new ArrayList();
                                int size = arrayList5.size();
                                int i2 = 0;
                                while (i2 < size) {
                                    Object obj2 = arrayList5.get(i2);
                                    i2++;
                                    t10.h f = sy.e0.f(((cq.q) obj2).b);
                                    if (f != null) {
                                        arrayList6.add(f);
                                    }
                                }
                                bVar = new t10.b(zonedDateTime, z, str3, e, a, str4, arrayList6);
                            } else {
                                cq.b0 b0Var = ofVar.c;
                                if (b0Var != null) {
                                    cq.g0 g0Var = b0Var.c;
                                    ZonedDateTime zonedDateTime2 = g0Var.b;
                                    boolean z2 = g0Var.c;
                                    String str5 = g0Var.d;
                                    com.github.service.models.response.a e2 = v8.l0.e(g0Var.a.c);
                                    t10.k g = xp.a.g(g0Var.e.c);
                                    ArrayList arrayList7 = b0Var.b;
                                    ArrayList arrayList8 = new ArrayList();
                                    int size2 = arrayList7.size();
                                    int i3 = 0;
                                    while (i3 < size2) {
                                        Object obj3 = arrayList7.get(i3);
                                        i3++;
                                        t10.h f2 = sy.e0.f(((cq.a0Shadow) obj3).b);
                                        if (f2 != null) {
                                            arrayList8.add(f2);
                                        }
                                    }
                                    bVar2 = new t10.c(zonedDateTime2, z2, str5, e2, g, arrayList8);
                                } else {
                                    cq.z0 z0Var = ofVar.d;
                                    if (z0Var != null) {
                                        cq.d1 d1Var = z0Var.c;
                                        String str6 = d1Var.d;
                                        ZonedDateTime zonedDateTime3 = d1Var.b;
                                        ArrayList arrayList9 = z0Var.b;
                                        cq.c1 c1Var = d1Var.f;
                                        cq.u3 u3Var = c1Var.b;
                                        if (u3Var != null) {
                                            boolean z3 = d1Var.c;
                                            t10.s e3 = xp.a.e(u3Var);
                                            ArrayList arrayList10 = new ArrayList();
                                            int size3 = arrayList9.size();
                                            int i4 = 0;
                                            while (i4 < size3) {
                                                Object obj4 = arrayList9.get(i4);
                                                i4++;
                                                t10.h f3 = sy.e0.f(((cq.y0) obj4).b);
                                                if (f3 != null) {
                                                    arrayList10.add(f3);
                                                }
                                            }
                                            bVar2 = new t10.n(zonedDateTime3, z3, str6, e3, arrayList10);
                                        } else {
                                            cq.q3 q3Var = c1Var.c;
                                            if (q3Var != null) {
                                                boolean z4 = d1Var.c;
                                                t10.r d = xp.a.d(q3Var);
                                                ArrayList arrayList11 = new ArrayList();
                                                int size4 = arrayList9.size();
                                                int i5 = 0;
                                                while (i5 < size4) {
                                                    Object obj5 = arrayList9.get(i5);
                                                    i5++;
                                                    t10.h f4 = sy.e0.f(((cq.y0) obj5).b);
                                                    if (f4 != null) {
                                                        arrayList11.add(f4);
                                                    }
                                                }
                                                bVar2 = new t10.m(zonedDateTime3, z4, str6, d, arrayList11);
                                            }
                                        }
                                    } else {
                                        cq.j1 j1Var = ofVar.e;
                                        if (j1Var != null) {
                                            cq.o1 o1Var = j1Var.c;
                                            String str7 = o1Var.d;
                                            ZonedDateTime zonedDateTime4 = o1Var.b;
                                            ArrayList arrayList12 = j1Var.b;
                                            cq.m1 m1Var = o1Var.e;
                                            cq.u3 u3Var2 = m1Var.b;
                                            w6 w6Var = o1Var.f.c;
                                            cq.q3 q3Var2 = m1Var.c;
                                            if (u3Var2 != null) {
                                                boolean z5 = o1Var.c;
                                                com.github.service.models.response.a aVar3 = new com.github.service.models.response.a(w6Var.c, w8.s.A(w6Var.e), (String) null, false, (String) null, 60);
                                                t10.s e4 = xp.a.e(u3Var2);
                                                ArrayList arrayList13 = new ArrayList();
                                                int size5 = arrayList12.size();
                                                int i6 = 0;
                                                while (i6 < size5) {
                                                    Object obj6 = arrayList12.get(i6);
                                                    i6++;
                                                    t10.h f5 = sy.e0.f(((cq.i1) obj6).b);
                                                    if (f5 != null) {
                                                        arrayList13.add(f5);
                                                    }
                                                }
                                                bVar2 = new t10.w(zonedDateTime4, z5, str7, aVar3, e4, arrayList13);
                                            } else if (q3Var2 != null) {
                                                boolean z6 = o1Var.c;
                                                com.github.service.models.response.a aVar4 = new com.github.service.models.response.a(w6Var.c, w8.s.A(w6Var.e), (String) null, false, (String) null, 60);
                                                t10.r d2 = xp.a.d(q3Var2);
                                                ArrayList arrayList14 = new ArrayList();
                                                int size6 = arrayList12.size();
                                                int i7 = 0;
                                                while (i7 < size6) {
                                                    Object obj7 = arrayList12.get(i7);
                                                    i7++;
                                                    t10.h f6 = sy.e0.f(((cq.i1) obj7).b);
                                                    if (f6 != null) {
                                                        arrayList14.add(f6);
                                                    }
                                                }
                                                bVar2 = new t10.v(zonedDateTime4, z6, str7, aVar4, d2, arrayList14);
                                            }
                                        } else {
                                            cq.t1 t1Var = ofVar.f;
                                            if (t1Var != null) {
                                                cq.y1 y1Var = t1Var.c;
                                                ZonedDateTime zonedDateTime5 = y1Var.b;
                                                boolean z7 = y1Var.c;
                                                String str8 = y1Var.d;
                                                com.github.service.models.response.a e5 = v8.l0.e(y1Var.a.c);
                                                t10.k g2 = xp.a.g(y1Var.e.c);
                                                ArrayList arrayList15 = t1Var.b;
                                                ArrayList arrayList16 = new ArrayList();
                                                int size7 = arrayList15.size();
                                                int i8 = 0;
                                                while (i8 < size7) {
                                                    Object obj8 = arrayList15.get(i8);
                                                    i8++;
                                                    t10.h f7 = sy.e0.f(((cq.s1) obj8).b);
                                                    if (f7 != null) {
                                                        arrayList16.add(f7);
                                                    }
                                                }
                                                bVar2 = new t10.o(zonedDateTime5, z7, str8, e5, g2, arrayList16);
                                            } else {
                                                cq.d2 d2Var = ofVar.g;
                                                if (d2Var != null) {
                                                    cq.i2 i2Var = d2Var.c;
                                                    ZonedDateTime zonedDateTime6 = i2Var.b;
                                                    boolean z8 = i2Var.c;
                                                    String str9 = i2Var.d;
                                                    com.github.service.models.response.a e6 = v8.l0.e(i2Var.a.c);
                                                    t10.i c = xp.a.c(i2Var.e.c);
                                                    ArrayList arrayList17 = d2Var.b;
                                                    ArrayList arrayList18 = new ArrayList();
                                                    int size8 = arrayList17.size();
                                                    int i9 = 0;
                                                    while (i9 < size8) {
                                                        Object obj9 = arrayList17.get(i9);
                                                        i9++;
                                                        t10.h f8 = sy.e0.f(((cq.c2) obj9).b);
                                                        if (f8 != null) {
                                                            arrayList18.add(f8);
                                                        }
                                                    }
                                                    bVar2 = new t10.p(zonedDateTime6, z8, str9, e6, c, arrayList18);
                                                } else {
                                                    cq.d3Shadow d3Var = ofVar.h;
                                                    if (d3Var != null) {
                                                        cq.i3 i3Var = d3Var.c;
                                                        ZonedDateTime zonedDateTime7 = i3Var.b;
                                                        boolean z9 = i3Var.c;
                                                        String str10 = i3Var.d;
                                                        com.github.service.models.response.a e7 = v8.l0.e(i3Var.a.c);
                                                        t10.j f9 = xp.a.f(i3Var.e.c);
                                                        ArrayList arrayList19 = d3Var.b;
                                                        ArrayList arrayList20 = new ArrayList();
                                                        int size9 = arrayList19.size();
                                                        int i11 = 0;
                                                        while (i11 < size9) {
                                                            Object obj10 = arrayList19.get(i11);
                                                            i11++;
                                                            t10.h f11 = sy.e0.f(((cq.c3) obj10).b);
                                                            if (f11 != null) {
                                                                arrayList20.add(f11);
                                                            }
                                                        }
                                                        bVar2 = new t10.q(zonedDateTime7, z9, str10, e7, f9, arrayList20);
                                                    } else {
                                                        b6 b6Var = ofVar.i;
                                                        if (b6Var != null) {
                                                            f6 f6Var = b6Var.c;
                                                            ZonedDateTime zonedDateTime8 = f6Var.a;
                                                            boolean z11 = f6Var.b;
                                                            String str11 = f6Var.c;
                                                            t10.k g3 = xp.a.g(f6Var.e.c);
                                                            ArrayList arrayList21 = b6Var.b;
                                                            ArrayList arrayList22 = new ArrayList();
                                                            int size10 = arrayList21.size();
                                                            int i12 = 0;
                                                            while (i12 < size10) {
                                                                Object obj11 = arrayList21.get(i12);
                                                                i12++;
                                                                t10.h f12 = sy.e0.f(((a6) obj11).b);
                                                                if (f12 != null) {
                                                                    arrayList22.add(f12);
                                                                }
                                                            }
                                                            bVar2 = new t10.t(zonedDateTime8, z11, str11, g3, arrayList22);
                                                        } else {
                                                            j6 j6Var = ofVar.j;
                                                            if (j6Var != null) {
                                                                o6 o6Var = j6Var.c;
                                                                ZonedDateTime zonedDateTime9 = o6Var.b;
                                                                boolean z12 = o6Var.c;
                                                                String str12 = o6Var.d;
                                                                com.github.service.models.response.a e8 = v8.l0.e(o6Var.a.c);
                                                                t10.k g4 = xp.a.g(o6Var.e.c);
                                                                ArrayList arrayList23 = j6Var.b;
                                                                ArrayList arrayList24 = new ArrayList();
                                                                int size11 = arrayList23.size();
                                                                int i13 = 0;
                                                                while (i13 < size11) {
                                                                    Object obj12 = arrayList23.get(i13);
                                                                    i13++;
                                                                    t10.h f13 = sy.e0.f(((i6) obj12).b);
                                                                    if (f13 != null) {
                                                                        arrayList24.add(f13);
                                                                    }
                                                                }
                                                                bVar2 = new t10.u(zonedDateTime9, z12, str12, e8, g4, arrayList24);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                bVar = bVar2;
                            }
                            if (bVar == null) {
                                arrayList.add(bVar);
                            }
                        }
                        bVar = null;
                        if (bVar == null) {
                        }
                    }
                } else {
                    arrayList = arrayList4;
                }
                List list5 = jfVar4.a.a;
                if (list5 != null) {
                    ArrayList arrayList25 = new ArrayList();
                    for (Object obj13 : list5) {
                        if (!sy.pShadow.o(sy.d0Shadow.C(((mf) obj13).b))) {
                            arrayList25.add(obj13);
                        }
                    }
                    arrayList4 = new ArrayList(x61.n.F(arrayList25, 10));
                    int size12 = arrayList25.size();
                    int i14 = 0;
                    while (i14 < size12) {
                        Object obj14 = arrayList25.get(i14);
                        i14++;
                        arrayList4.add(Boolean.valueOf(((mf) obj14).a));
                    }
                }
                return new t10.d(arrayList, arrayList4, iVar);
            case 21:
                l81.f fVar5 = (l81.f) obj;
                k71.k.g(fVar5, "$this$Json");
                fVar5.c = true;
                return w61.a0.a;
            case 22:
                z10.a aVar5 = (z10.a) obj;
                k71.k.g(aVar5, "userAchievementsParameters");
                return new v10.l(aVar5.a, new aa.u0(30), aa.t0.d);
            case 23:
                v10.d dVar = (v10.d) obj;
                k71.k.g(dVar, "data");
                v10.k kVar = dVar.a;
                return Boolean.valueOf((kVar == null || (fVar = kVar.c) == null || (bVar3 = fVar.a) == null || (list2 = bVar3.c) == null) ? false : !list2.isEmpty());
            case 24:
                v10.d dVar2 = (v10.d) obj;
                k71.k.g(dVar2, "data");
                v10.k kVar2 = dVar2.a;
                if (kVar2 == null || (fVar2 = kVar2.c) == null || (bVar4 = fVar2.a) == null || (gVar = bVar4.b) == null) {
                    return null;
                }
                return new x01.i(gVar.a, gVar.b, !gVar.c);
            case 25:
                v10.d dVar3 = (v10.d) obj;
                k71.k.g(dVar3, "data");
                v10.k kVar3 = dVar3.a;
                List list6 = (kVar3 == null || (fVar3 = kVar3.c) == null || (bVar5 = fVar3.a) == null) ? null : bVar5.c;
                return list6 == null ? x61.rShadow.r : list6;
            case 26:
                v10.d dVar4 = (v10.d) obj;
                k71.k.g(dVar4, "data");
                v10.k kVar4 = dVar4.a;
                if (kVar4 == null) {
                    return null;
                }
                v10.b bVar6 = kVar4.c.a;
                List list7 = bVar6.c;
                if (list7 != null) {
                    ArrayList arrayList26 = new ArrayList();
                    Iterator it3 = list7.iterator();
                    while (it3.hasNext()) {
                        v10.e eVar2 = (v10.e) it3.next();
                        if (eVar2 != null) {
                            String str13 = eVar2.b;
                            ZonedDateTime zonedDateTime10 = eVar2.c;
                            v10.a aVar6 = eVar2.e;
                            String str14 = aVar6.a;
                            String str15 = aVar6.b;
                            v10.i iVar2 = eVar2.f;
                            String str16 = iVar2 != null ? iVar2.b : null;
                            if (str16 == null) {
                                str16 = "";
                            }
                            String str17 = iVar2 != null ? iVar2.c : null;
                            if (str17 == null) {
                                str17 = "";
                            }
                            ArrayList arrayList27 = eVar2.g;
                            ArrayList arrayList28 = new ArrayList(x61.n.F(arrayList27, 10));
                            int size13 = arrayList27.size();
                            int i15 = 0;
                            while (i15 < size13) {
                                Object obj15 = arrayList27.get(i15);
                                int i16 = i15 + 1;
                                v10.h hVar2 = (v10.h) obj15;
                                int i17 = size13;
                                k71.k.g(hVar2, "<this>");
                                String str18 = hVar2.b;
                                v10.j jVar = hVar2.a;
                                if (jVar != null) {
                                    x10.g0 g0Var2 = jVar.b;
                                    it2 = it3;
                                    x10.d dVar5 = g0Var2.b;
                                    if (dVar5 != null) {
                                        List list8 = dVar5.a.a;
                                        String str19 = (list8 == null || (cVar3 = (x10.c) x61.m.W(list8)) == null) ? null : cVar3.b;
                                        if (str19 == null) {
                                            str19 = "";
                                        }
                                        String str20 = (list8 == null || (cVar2 = (x10.c) x61.m.W(list8)) == null) ? null : cVar2.a;
                                        if (str20 == null) {
                                            str20 = "";
                                        }
                                        i = i16;
                                        aVar = new jn.d(str18, str20, str19);
                                    } else {
                                        i = i16;
                                        x10.eShadow eVar3 = g0Var2.c;
                                        if (eVar3 != null) {
                                            aVar = new jn.d(str18, eVar3.a, eVar3.b.a);
                                        } else {
                                            x10.f fVar6 = g0Var2.d;
                                            if (fVar6 != null) {
                                                str = str17;
                                                cVar = new jn.b(fVar6.b, str18, fVar6.a, fVar6.c.a);
                                            } else {
                                                str = str17;
                                                x10.g gVar2 = g0Var2.e;
                                                if (gVar2 != null) {
                                                    x10.a aVar7 = gVar2.b;
                                                    String str21 = aVar7 != null ? aVar7.b.a : null;
                                                    if (str21 == null) {
                                                        str21 = "";
                                                    }
                                                    cVar = new jn.b(aVar7 != null ? aVar7.a : 0, str18, gVar2.a, str21);
                                                } else {
                                                    x10.h hVar3 = g0Var2.f;
                                                    if (hVar3 != null) {
                                                        cVar = new jn.c(hVar3.c, str18, hVar3.a, hVar3.b.a);
                                                    } else {
                                                        x10.i iVar3 = g0Var2.g;
                                                        if (iVar3 != null) {
                                                            cVar = new jn.c(iVar3.c.a, str18, iVar3.a, iVar3.b.a);
                                                        } else {
                                                            x10.j jVar2 = g0Var2.h;
                                                            if (jVar2 != null) {
                                                                cVar = new jn.c(jVar2.b, str18, jVar2.c, jVar2.a.a);
                                                            } else {
                                                                x10.k kVar5 = g0Var2.i;
                                                                if (kVar5 != null) {
                                                                    x10.t tVar = kVar5.b;
                                                                    cVar = new jn.c(tVar.b, str18, kVar5.a, tVar.a.a);
                                                                } else {
                                                                    x10.l lVar = g0Var2.j;
                                                                    if (lVar != null) {
                                                                        x10.s sVar = lVar.b;
                                                                        cVar = new jn.c(sVar.b, str18, lVar.a, sVar.a.a);
                                                                    } else {
                                                                        x10.m mVar = g0Var2.k;
                                                                        if (mVar != null) {
                                                                            aVar = new jn.d(str18, mVar.c, mVar.a.a);
                                                                        } else {
                                                                            x10.n nVar = g0Var2.l;
                                                                            if (nVar != null) {
                                                                                aVar = new jn.d(str18, nVar.a, nVar.b);
                                                                            } else {
                                                                                x10.o oVar = g0Var2.m;
                                                                                if (oVar != null) {
                                                                                    aVar = new jn.a(str18, oVar.a);
                                                                                } else {
                                                                                    x10.p pVar = g0Var2.n;
                                                                                    if (pVar != null) {
                                                                                        aVar = new jn.d(str18, pVar.a, pVar.b.a);
                                                                                    } else {
                                                                                        x10.q qVar = g0Var2.o;
                                                                                        if (qVar != null) {
                                                                                            aVar = new jn.f(str18, qVar.a, qVar.b.a);
                                                                                        } else {
                                                                                            x10.r rVar6 = g0Var2.p;
                                                                                            aVar = rVar6 != null ? new jn.a(str18, rVar6.a) : new jn.a(str18, "");
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
                                            aVar = cVar;
                                        }
                                    }
                                    str = str17;
                                } else {
                                    it2 = it3;
                                    i = i16;
                                    str = str17;
                                    aVar = new jn.a(str18, "");
                                }
                                arrayList28.add(aVar);
                                size13 = i17;
                                it3 = it2;
                                i15 = i;
                                str17 = str;
                            }
                            it = it3;
                            hVar = new jn.h(str13, zonedDateTime10, str14, str15, str16, str17, arrayList28, eVar2.d);
                        } else {
                            it = it3;
                            hVar = null;
                        }
                        if (hVar != null) {
                            arrayList26.add(hVar);
                        }
                        it3 = it;
                    }
                    arrayList2 = new ArrayList();
                    int size14 = arrayList26.size();
                    int i18 = 0;
                    while (i18 < size14) {
                        Object obj16 = arrayList26.get(i18);
                        i18++;
                        jn.h hVar4 = (jn.h) obj16;
                        if (!t71.p.T(hVar4.f) && !t71.p.T(hVar4.e)) {
                            arrayList2.add(obj16);
                        }
                    }
                } else {
                    arrayList2 = null;
                }
                if (arrayList2 == null) {
                    arrayList2 = x61.rShadow.r;
                }
                v10.g gVar3 = bVar6.b;
                return new jn.i(arrayList2.size(), arrayList2, new x01.i(gVar3.a, gVar3.b, gVar3.c));
            case 27:
                k71.k.g((t6.c) obj, "$this$initializer");
                return new e.a();
            case 28:
                d3.c0 c0Var3 = (d3.c0) obj;
                k71.k.g(c0Var3, "$this$semantics");
                d3.z.c(c0Var3);
                return w61.a0.a;
            default:
                x6.y yVar = (x6.y) obj;
                k71.k.g(yVar, "$this$navigation");
                x6.p0 p0Var = yVar.g;
                z6.e r = com.github.rudroid.m0.r(p0Var, z6.e.class);
                k71.eShadow a2 = k71.xShadow.a(UserOrOgProfileScreenRoute.class);
                k71.eShadow a3 = k71.xShadow.a(UserOrOrganizationProfileNavigationFragment.class);
                x61.s sVar2 = x61.s.r;
                z6.i iVar4 = new z6.i(r, a2, sVar2, a3);
                ArrayList arrayList29 = yVar.j;
                arrayList29.add(iVar4.a());
                arrayList29.add(new z6.i(p0Var.b(sy.w.r(z6.e.class)), k71.xShadow.a(OrganizationsRoute.class), sVar2, k71.xShadow.a(OrganizationsFragment.class)).a());
                arrayList29.add(new z6.i(p0Var.b(sy.w.r(z6.e.class)), k71.xShadow.a(UsersRoute.class), (Map) ze.e.a, k71.xShadow.a(UsersFragment.class)).a());
                rf.g.a(yVar);
                mg.a.a(yVar);
                sy.rShadow.u(yVar, k71.xShadow.a(OwnerProjectsEntryPointRoute.class), k71.xShadow.a(OwnerProjectsRoute.class), sVar2, new bf.c(1));
                rf.b.a(yVar);
                return w61.a0.a;
        }
    }
}
