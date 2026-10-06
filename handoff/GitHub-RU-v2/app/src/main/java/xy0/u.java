package xy0;

import aa.t0;
import aa.u0;
import ay0.a0;
import ay0.b0;
import ay0.e0;
import ay0.f0;
import ay0.g0;
import ay0.h0;
import ay0.i0;
import com.github.service.models.response.projects.ProjectFieldType;
import com.github.service.models.response.projects.ProjectViewItemSortableValueType;
import com.github.service.models.response.projects.ProjectsMetaInfo;
import d1.j1;
import iy0.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import l01.c0;
import l01.j0;
import l01.q0;
import pz0.bp;
import pz0.bs;
import pz0.dp;
import pz0.fp;
import pz0.hp;
import pz0.no;
import pz0.po;
import pz0.to;
import pz0.xo;
import pz0.xr;
import pz0.zo;
import sy.d0Shadow;
import sy.y;
import wy0.n6;
import z01.y0;
import z01.z0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u {
    public static final u a = new u();

    public static yx0.d a(yx0.d dVar, j71.c cVar) {
        ay0.o oVar;
        ay0.v vVar = dVar.c;
        ay0.u uVar = vVar.c;
        List list = vVar.c.b.c;
        List list2 = list != null ? (List) cVar.k(list) : null;
        Integer valueOf = list2 != null ? Integer.valueOf(list2.size() - uVar.b.c.size()) : null;
        int intValue = uVar.b.a + (valueOf != null ? valueOf.intValue() : 0);
        if (intValue != 0) {
            ay0.o oVar2 = vVar.c.b.b;
            if (oVar2.a) {
                oVar = ay0.o.a(oVar2, 5);
                ay0.u uVar2 = vVar.c;
                k71.k.g(oVar, "pageInfo");
                return yx0.d.a(dVar, null, ay0.v.a(vVar, null, ay0.u.a(uVar2, new ay0.p(intValue, oVar, list2)), null, 11), 3);
            }
        }
        oVar = vVar.c.b.b;
        ay0.u uVar22 = vVar.c;
        k71.k.g(oVar, "pageInfo");
        return yx0.d.a(dVar, null, ay0.v.a(vVar, null, ay0.u.a(uVar22, new ay0.p(intValue, oVar, list2)), null, 11), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x05ef, code lost:
    
        if (r4.b == null) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x02b7, code lost:
    
        if (k71.k.b((r8 == null || (r8 = r8.e) == null) ? null : r8.a, r7 != null ? r7.e : null) != false) goto L180;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0616 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:? A[LOOP:6: B:152:0x01ec->B:270:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x05d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0668 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0624 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(ProjectsMetaInfo projectsMetaInfo, com.github.service.wrapper.b bVar, String str, c0 c0Var, List list, String str2, c71.c cVar) {
        tShadow tVar;
        int i;
        ProjectsMetaInfo projectsMetaInfo2;
        yx0.h hVar;
        c0 c0Var2;
        com.github.service.wrapper.b bVar2;
        j0 j0Var;
        String str3;
        List list2;
        yx0.b bVar3;
        yx0.h hVar2;
        tShadow tVar2;
        b71.a aVar;
        com.github.service.wrapper.b bVar4;
        String str4;
        int i2;
        yx0.b bVar5;
        Object obj;
        j0 j0Var2;
        Object obj2;
        yx0.b bVar6;
        final ay0.n nVar;
        Object obj3;
        yx0.d dVar;
        yx0.b bVar7;
        ay0.n nVar2;
        yx0.d dVar2;
        yx0.e eVar;
        yx0.f fVar;
        ay0.e eVar2;
        i0 i0Var;
        i0 i0Var2;
        boolean z;
        boolean b;
        h0 h0Var;
        g0 g0Var;
        e0 e0Var;
        b0 b0Var;
        ay0.c0 c0Var3;
        bs bsVar;
        ay0.n nVar3;
        ay0.m mVar;
        List<ay0.n> list3;
        ay0.m mVar2;
        Object y0Var;
        String str5;
        ArrayList n;
        int i3;
        ArrayList n2;
        if (cVar instanceof tShadow) {
            tVar = (tShadow) cVar;
            int i4 = tVar.E;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                tVar.E = i4 - Integer.MIN_VALUE;
                Object obj4 = tVar.C;
                b71.a aVar2 = b71.a.r;
                i = tVar.E;
                x61.rShadow rVar = x61.rShadow.r;
                if (i != 0) {
                    y.j(obj4);
                    j0 j0Var3 = projectsMetaInfo.u;
                    if (j0Var3 != null) {
                        yx0.h hVar3 = new yx0.h(new u0(new Integer(10)), str2 == null ? t0.d : new u0(str2), projectsMetaInfo.r);
                        tVar.u = projectsMetaInfo;
                        tVar.v = bVar;
                        tVar.w = str;
                        tVar.x = c0Var;
                        tVar.y = list;
                        tVar.z = j0Var3;
                        tVar.A = hVar3;
                        tVar.E = 1;
                        Object f = bVar.f(hVar3);
                        if (f == aVar2) {
                            return aVar2;
                        }
                        projectsMetaInfo2 = projectsMetaInfo;
                        hVar = hVar3;
                        c0Var2 = c0Var;
                        bVar2 = bVar;
                        j0Var = j0Var3;
                        obj4 = f;
                        str3 = str;
                        list2 = list;
                    }
                    return rVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar5 = tVar.B;
                    str4 = tVar.w;
                    y.j(obj4);
                    obj = null;
                    i2 = 0;
                    String str6 = str4;
                    if (bVar5 != null) {
                        List k = t.e.k(bVar5);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj5 : k) {
                            yx0.d dVar3 = (yx0.d) obj5;
                            if (dVar3 != null) {
                                ay0.o oVar = dVar3.c.c.b.b;
                                if (oVar.a) {
                                }
                            }
                            if (!k71.k.b(dVar3 != null ? dVar3.b : obj, "")) {
                                if (((dVar3 == null || (n2 = t.e.n(dVar3)) == null || n2.size() != 0) ? i2 : 1) == 0) {
                                    i3 = i2;
                                    if (i3 == 0) {
                                        arrayList.add(obj5);
                                    }
                                }
                            }
                            i3 = 1;
                            if (i3 == 0) {
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i5 = i2;
                        while (i5 < size) {
                            Object obj6 = arrayList.get(i5);
                            i5++;
                            yx0.d dVar4 = (yx0.d) obj6;
                            if (!k71.k.b(dVar4 != null ? dVar4.b : obj, "")) {
                                if (((dVar4 == null || (n = t.e.n(dVar4)) == null || n.size() != 0) ? i2 : 1) == 0) {
                                    y0Var = (dVar4 == null || (str5 = dVar4.b) == null) ? obj : new z0(str5);
                                    if (y0Var == null) {
                                        arrayList2.add(y0Var);
                                    }
                                }
                            }
                            y0Var = new y0(str6 == null ? "" : str6);
                            if (y0Var == null) {
                            }
                        }
                        return arrayList2;
                    }
                    return rVar;
                }
                hVar = tVar.A;
                j0Var = tVar.z;
                list2 = tVar.y;
                c0Var2 = tVar.x;
                str3 = tVar.w;
                bVar2 = tVar.v;
                projectsMetaInfo2 = tVar.u;
                y.j(obj4);
                bVar3 = (yx0.b) obj4;
                if (bVar3 == null) {
                    String str7 = projectsMetaInfo2.s;
                    k71.k.g(str7, "itemId");
                    k71.k.g(j0Var, "groupedByField");
                    k71.k.g(list2, "newSortValues");
                    List<yx0.d> k2 = t.e.k(bVar3);
                    yx0.d dVar5 = (yx0.d) x61.m.W(k2);
                    ay0.a aVar3 = dVar5 != null ? dVar5.c.d.c : null;
                    Iterator it = k2.iterator();
                    loop2: while (true) {
                        if (!it.hasNext()) {
                            j0Var2 = j0Var;
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        yx0.d dVar6 = (yx0.d) obj2;
                        if (dVar6 != null && (list3 = dVar6.c.c.b.c) != null && !list3.isEmpty()) {
                            for (ay0.n nVar4 : list3) {
                                j0Var2 = j0Var;
                                if (k71.k.b((nVar4 == null || (mVar2 = nVar4.b) == null) ? null : mVar2.b, str7)) {
                                    break loop2;
                                }
                                j0Var = j0Var2;
                            }
                        }
                        j0Var = j0Var;
                    }
                    yx0.d dVar7 = (yx0.d) obj2;
                    if (dVar7 != null) {
                        List list4 = dVar7.c.c.b.c;
                        if (list4 != null) {
                            Iterator it2 = list4.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    nVar3 = 0;
                                    break;
                                }
                                nVar3 = it2.next();
                                ay0.n nVar5 = (ay0.n) nVar3;
                                if (k71.k.b((nVar5 == null || (mVar = nVar5.b) == null) ? null : mVar.b, str7)) {
                                    break;
                                }
                            }
                            nVar = nVar3;
                        } else {
                            nVar = null;
                        }
                        if (nVar != null) {
                            ay0.a aVar4 = aVar3;
                            ArrayList arrayList3 = new ArrayList(x61.n.F(list2, 10));
                            Iterator it3 = list2.iterator();
                            while (true) {
                                Iterator it4 = it3;
                                if (it3.hasNext()) {
                                    q0 q0Var = (q0) it4.next();
                                    String str8 = q0Var.a;
                                    ProjectViewItemSortableValueType projectViewItemSortableValueType = q0Var.b;
                                    b71.a aVar5 = aVar2;
                                    k71.k.g(projectViewItemSortableValueType, "<this>");
                                    int i6 = ix0.b.a[projectViewItemSortableValueType.ordinal()];
                                    if (i6 == 1) {
                                        bsVar = bs.t;
                                    } else if (i6 == 2) {
                                        bsVar = bs.w;
                                    } else if (i6 == 3) {
                                        bsVar = bs.u;
                                    } else {
                                        if (i6 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bsVar = bs.v;
                                    }
                                    arrayList3.add(new iy0.y(bsVar, str8));
                                    it3 = it4;
                                    aVar2 = aVar5;
                                } else {
                                    aVar = aVar2;
                                    ay0.n nVar6 = new ay0.n(nVar.a, nVar.b, new z(arrayList3));
                                    Iterator it5 = k2.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            obj3 = it5.next();
                                            yx0.d dVar8 = (yx0.d) obj3;
                                            if (dVar8 != null) {
                                                ay0.f fVar2 = dVar8.c.d;
                                                String str9 = fVar2.b;
                                                ay0.e eVar3 = fVar2.d;
                                                i0 i0Var3 = eVar3 != null ? eVar3.b : null;
                                                ProjectFieldType l = j0Var2.l();
                                                switch (l == null ? -1 : r.a[l.ordinal()]) {
                                                    case -1:
                                                    case 3:
                                                    case 9:
                                                    case 10:
                                                    case 11:
                                                    case 12:
                                                    case 13:
                                                    case 14:
                                                        b = k71.k.b(str9, str3);
                                                        if (b) {
                                                            z = true;
                                                            if (!z) {
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    case 0:
                                                    default:
                                                        throw new NoWhenBranchMatchedException();
                                                    case 1:
                                                        b = k71.k.b(str9, str3);
                                                        if (b) {
                                                        }
                                                        break;
                                                    case 2:
                                                        if (!k71.k.b(str9, str3)) {
                                                            break;
                                                        }
                                                        b = true;
                                                        if (b) {
                                                        }
                                                        break;
                                                    case 4:
                                                        b = k71.k.b((i0Var3 == null || (h0Var = i0Var3.i) == null) ? null : h0Var.a, c0Var2 != null ? c0Var2.e : null);
                                                        if (b) {
                                                        }
                                                        break;
                                                    case 5:
                                                        b = k71.k.b((i0Var3 == null || (g0Var = i0Var3.h) == null) ? null : g0Var.a, c0Var2 != null ? c0Var2.d : null);
                                                        if (b) {
                                                        }
                                                        break;
                                                    case 6:
                                                        Double d = (i0Var3 == null || (e0Var = i0Var3.f) == null) ? null : e0Var.a;
                                                        Double d2 = c0Var2 != null ? c0Var2.c : null;
                                                        b = d != null ? false : false;
                                                        if (b) {
                                                        }
                                                        break;
                                                    case 7:
                                                        b = k71.k.b((i0Var3 == null || (b0Var = i0Var3.c) == null) ? null : b0Var.a, c0Var2 != null ? c0Var2.a : null);
                                                        if (b) {
                                                        }
                                                        break;
                                                    case 8:
                                                        b = k71.k.b((i0Var3 == null || (c0Var3 = i0Var3.d) == null) ? null : c0Var3.a, c0Var2 != null ? c0Var2.b : null);
                                                        if (b) {
                                                        }
                                                        break;
                                                }
                                            }
                                            z = false;
                                            if (!z) {
                                            }
                                        } else {
                                            obj3 = null;
                                        }
                                    }
                                    yx0.d dVar9 = (yx0.d) obj3;
                                    if (dVar9 != null) {
                                        hVar2 = hVar;
                                        dVar = dVar7;
                                        bVar7 = bVar3;
                                        tVar2 = tVar;
                                        nVar2 = nVar6;
                                        bVar4 = bVar2;
                                        str4 = str3;
                                        i2 = 0;
                                    } else if (str3 != null) {
                                        no.Companion.getClass();
                                        aa.q0 q0Var2 = no.c;
                                        String str10 = ((aa.q) q0Var2).a;
                                        hVar2 = hVar;
                                        xr.Companion.getClass();
                                        bVar4 = bVar2;
                                        tVar2 = tVar;
                                        bVar7 = bVar3;
                                        dVar = dVar7;
                                        nVar2 = nVar6;
                                        i2 = 0;
                                        ay0.u uVar = new ay0.u(((aa.q) xr.a).a, new ay0.p(0, new ay0.o(null, false, false), rVar));
                                        String str11 = ((aa.q) q0Var2).a;
                                        if (c0Var2 != null) {
                                            String str12 = c0Var2.e;
                                            switch (r.a[j0Var2.l().ordinal()]) {
                                                case 1:
                                                    po.Companion.getClass();
                                                    i0Var = new i0(((aa.q) po.a).a, new a0(str12 != null ? d0.n(str12) : t71.p.g0(str3, new String[]{", "}, 6)), null, null, null, null, null, null, null);
                                                    i0Var2 = i0Var;
                                                    if (i0Var2 != null) {
                                                        eVar2 = new ay0.e(i0Var2.a, i0Var2);
                                                        String str13 = str3;
                                                        ay0.f fVar3 = new ay0.f("", str13, aVar4, eVar2, str11);
                                                        str4 = str13;
                                                        dVar9 = new yx0.d(str10, "", new ay0.v(str10, "", uVar, fVar3));
                                                        break;
                                                    }
                                                    break;
                                                case 2:
                                                    zo.Companion.getClass();
                                                    i0Var2 = new i0(((aa.q) zo.a).a, null, null, null, new ay0.d0(str3), null, null, null, null);
                                                    if (i0Var2 != null) {
                                                    }
                                                    break;
                                                case 3:
                                                    dp.Companion.getClass();
                                                    i0Var2 = new i0(((aa.q) dp.a).a, null, null, null, null, null, new f0(str3), null, null);
                                                    if (i0Var2 != null) {
                                                    }
                                                    break;
                                                case 4:
                                                    hp.Companion.getClass();
                                                    i0Var2 = new i0(((aa.q) hp.a).a, null, null, null, null, null, null, null, new h0(str12));
                                                    if (i0Var2 != null) {
                                                    }
                                                    break;
                                                case 5:
                                                    fp.Companion.getClass();
                                                    i0Var2 = new i0(((aa.q) fp.a).a, null, null, null, null, null, null, new g0(c0Var2.d), null);
                                                    if (i0Var2 != null) {
                                                    }
                                                    break;
                                                case 6:
                                                    bp.Companion.getClass();
                                                    i0Var2 = new i0(((aa.q) bp.a).a, null, null, null, null, new e0(c0Var2.c), null, null, null);
                                                    if (i0Var2 != null) {
                                                    }
                                                    break;
                                                case 7:
                                                    to.Companion.getClass();
                                                    i0Var2 = new i0(((aa.q) to.a).a, null, new b0(c0Var2.a), null, null, null, null, null, null);
                                                    if (i0Var2 != null) {
                                                    }
                                                    break;
                                                case 8:
                                                    xo.Companion.getClass();
                                                    i0Var = new i0(((aa.q) xo.a).a, null, null, new ay0.c0(c0Var2.b), null, null, null, null, null);
                                                    i0Var2 = i0Var;
                                                    if (i0Var2 != null) {
                                                    }
                                                    break;
                                                case 9:
                                                case 10:
                                                case 11:
                                                case 12:
                                                case 13:
                                                case 14:
                                                    i0Var2 = null;
                                                    if (i0Var2 != null) {
                                                    }
                                                    break;
                                                default:
                                                    throw new NoWhenBranchMatchedException();
                                            }
                                        }
                                        eVar2 = null;
                                        String str132 = str3;
                                        ay0.f fVar32 = new ay0.f("", str132, aVar4, eVar2, str11);
                                        str4 = str132;
                                        dVar9 = new yx0.d(str10, "", new ay0.v(str10, "", uVar, fVar32));
                                    } else {
                                        hVar2 = hVar;
                                        dVar = dVar7;
                                        bVar7 = bVar3;
                                        tVar2 = tVar;
                                        nVar2 = nVar6;
                                        bVar4 = bVar2;
                                        str4 = str3;
                                        i2 = 0;
                                        dVar9 = null;
                                    }
                                    if (dVar9 != null && k71.k.b(dVar9.b, "")) {
                                        k2 = x61.m.m0(k2, dVar9);
                                    }
                                    final int i7 = 0;
                                    j71.c cVar2 = new j71.c() { // from class: xy0.s
                                        @Override // j71.c
                                        public final Object k(Object obj7) {
                                            List list5 = (List) obj7;
                                            switch (i7) {
                                                case 0:
                                                    k71.k.g(list5, "items");
                                                    return x61.m.j0(list5, nVar);
                                                default:
                                                    k71.k.g(list5, "items");
                                                    return x61.m.v0(x61.m.S(x61.m.m0(list5, nVar)), new j1(4, new n6(4)));
                                            }
                                        }
                                    };
                                    yx0.d dVar10 = dVar;
                                    yx0.d a2 = a(dVar10, cVar2);
                                    if (k71.k.b(dVar10.b, dVar9 != null ? dVar9.b : null)) {
                                        final int i8 = 1;
                                        final ay0.n nVar7 = nVar2;
                                        dVar2 = a(a2, new j71.c() { // from class: xy0.s
                                            @Override // j71.c
                                            public final Object k(Object obj7) {
                                                List list5 = (List) obj7;
                                                switch (i8) {
                                                    case 0:
                                                        k71.k.g(list5, "items");
                                                        return x61.m.j0(list5, nVar7);
                                                    default:
                                                        k71.k.g(list5, "items");
                                                        return x61.m.v0(x61.m.S(x61.m.m0(list5, nVar7)), new j1(4, new n6(4)));
                                                }
                                            }
                                        });
                                    } else {
                                        final ay0.n nVar8 = nVar2;
                                        if (dVar9 != null) {
                                            final int i9 = 1;
                                            dVar2 = a(dVar9, new j71.c() { // from class: xy0.s
                                                @Override // j71.c
                                                public final Object k(Object obj7) {
                                                    List list5 = (List) obj7;
                                                    switch (i9) {
                                                        case 0:
                                                            k71.k.g(list5, "items");
                                                            return x61.m.j0(list5, nVar8);
                                                        default:
                                                            k71.k.g(list5, "items");
                                                            return x61.m.v0(x61.m.S(x61.m.m0(list5, nVar8)), new j1(4, new n6(4)));
                                                    }
                                                }
                                            });
                                        } else {
                                            dVar2 = null;
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    for (yx0.d dVar11 : k2) {
                                        String str14 = dVar11 != null ? dVar11.b : null;
                                        if (k71.k.b(str14, dVar2 != null ? dVar2.b : null)) {
                                            dVar11 = dVar2;
                                        } else if (k71.k.b(str14, a2.b)) {
                                            ArrayList n3 = t.e.n(a2);
                                            dVar11 = ((n3 == null || n3.size() != 0) ? i2 : 1) != 0 ? null : a2;
                                        }
                                        if (dVar11 != null) {
                                            arrayList4.add(dVar11);
                                        }
                                    }
                                    yx0.b bVar8 = bVar7;
                                    yx0.e eVar4 = bVar8.a;
                                    if (eVar4 != null) {
                                        yx0.f fVar4 = eVar4.c;
                                        if (fVar4 != null) {
                                            yx0.c cVar3 = fVar4.b;
                                            if (cVar3.c == null) {
                                                arrayList4 = null;
                                            }
                                            fVar = yx0.f.a(fVar4, yx0.c.a(cVar3, null, arrayList4, 3));
                                        } else {
                                            fVar = null;
                                        }
                                        eVar = yx0.e.a(eVar4, fVar);
                                    } else {
                                        eVar = null;
                                    }
                                    bVar6 = yx0.b.a(bVar8, eVar);
                                }
                            }
                        }
                    }
                    hVar2 = hVar;
                    tVar2 = tVar;
                    aVar = aVar2;
                    bVar4 = bVar2;
                    str4 = str3;
                    i2 = 0;
                    bVar6 = bVar3;
                    bVar5 = bVar6;
                } else {
                    hVar2 = hVar;
                    tVar2 = tVar;
                    aVar = aVar2;
                    bVar4 = bVar2;
                    str4 = str3;
                    i2 = 0;
                    bVar5 = null;
                }
                if (bVar5 == null) {
                    tShadow tVar3 = tVar2;
                    obj = null;
                    tVar3.u = null;
                    tVar3.v = null;
                    tVar3.w = str4;
                    tVar3.x = null;
                    tVar3.y = null;
                    tVar3.z = null;
                    tVar3.A = null;
                    tVar3.B = bVar5;
                    tVar3.E = 2;
                    b71.a aVar6 = aVar;
                    if (bVar4.j(hVar2, bVar5, tVar3) == aVar6) {
                        return aVar6;
                    }
                } else {
                    obj = null;
                }
                String str62 = str4;
                if (bVar5 != null) {
                }
                return rVar;
            }
        }
        tVar = new tShadow(this, cVar);
        Object obj42 = tVar.C;
        b71.a aVar22 = b71.a.r;
        i = tVar.E;
        x61.rShadow rVar2 = x61.rShadow.r;
        if (i != 0) {
        }
        bVar3 = (yx0.b) obj42;
        if (bVar3 == null) {
        }
        if (bVar5 == null) {
        }
        String str622 = str4;
        if (bVar5 != null) {
        }
        return rVar2;
    }
}
