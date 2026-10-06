package u00;

import aa.t0;
import aa.u0;
import com.github.service.models.response.projects.ProjectFieldType;
import com.github.service.models.response.projects.ProjectViewItemSortableValueType;
import com.github.service.models.response.projects.ProjectsMetaInfo;
import d1.j1;
import f00.a0Shadow;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import l01.c0;
import l01.j0;
import l01.q0;
import m10.cu;
import m10.eu;
import m10.gu;
import m10.ix;
import m10.ku;
import m10.mu;
import m10.mx;
import m10.ou;
import m10.st;
import m10.ut;
import m10.yt;
import sy.d0Shadow;
import sy.y;
import xz.b0;
import xz.e0;
import xz.f0;
import xz.g0;
import xz.h0;
import xz.i0;
import z01.y0;
import z01.z0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u {
    public static final u a = new u();

    public static vz.d a(vz.d dVar, j71.c cVar) {
        xz.o oVar;
        xz.v vVar = dVar.c;
        xz.u uVar = vVar.c;
        List list = vVar.c.b.c;
        List list2 = list != null ? (List) cVar.k(list) : null;
        Integer valueOf = list2 != null ? Integer.valueOf(list2.size() - uVar.b.c.size()) : null;
        int intValue = uVar.b.a + (valueOf != null ? valueOf.intValue() : 0);
        if (intValue != 0) {
            xz.o oVar2 = vVar.c.b.b;
            if (oVar2.a) {
                oVar = xz.o.a(oVar2, 5);
                xz.u uVar2 = vVar.c;
                k71.k.g(oVar, "pageInfo");
                return vz.d.a(dVar, null, xz.v.a(vVar, null, xz.u.a(uVar2, new xz.p(intValue, oVar, list2)), null, 11), 3);
            }
        }
        oVar = vVar.c.b.b;
        xz.u uVar22 = vVar.c;
        k71.k.g(oVar, "pageInfo");
        return vz.d.a(dVar, null, xz.v.a(vVar, null, xz.u.a(uVar22, new xz.p(intValue, oVar, list2)), null, 11), 3);
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
        t tVar;
        int i;
        ProjectsMetaInfo projectsMetaInfo2;
        vz.h hVar;
        c0 c0Var2;
        com.github.service.wrapper.b bVar2;
        j0 j0Var;
        String str3;
        List list2;
        vz.b bVar3;
        vz.h hVar2;
        t tVar2;
        b71.a aVar;
        com.github.service.wrapper.b bVar4;
        String str4;
        int i2;
        vz.b bVar5;
        String str5;
        j0 j0Var2;
        Object obj;
        vz.b bVar6;
        final xz.n nVar;
        Object obj2;
        vz.d dVar;
        vz.b bVar7;
        xz.n nVar2;
        vz.d dVar2;
        vz.e eVar;
        vz.f fVar;
        xz.e eVar2;
        i0 i0Var;
        i0 i0Var2;
        boolean z;
        boolean b;
        h0 h0Var;
        g0 g0Var;
        e0 e0Var;
        b0 b0Var;
        xz.c0 c0Var3;
        mx mxVar;
        xz.n nVar3;
        xz.m mVar;
        List<xz.n> list3;
        xz.m mVar2;
        String y0Var;
        String str6;
        ArrayList j;
        int i3;
        ArrayList j2;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i4 = tVar.E;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                tVar.E = i4 - Integer.MIN_VALUE;
                Object obj3 = tVar.C;
                b71.a aVar2 = b71.a.r;
                i = tVar.E;
                x61.rShadow rVar = x61.rShadow.r;
                if (i != 0) {
                    y.j(obj3);
                    j0 j0Var3 = projectsMetaInfo.u;
                    if (j0Var3 != null) {
                        vz.h hVar3 = new vz.h(new u0(new Integer(10)), str2 == null ? t0.d : new u0(str2), projectsMetaInfo.r);
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
                        obj3 = f;
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
                    y.j(obj3);
                    str5 = null;
                    i2 = 0;
                    String str7 = str4;
                    if (bVar5 != null) {
                        List i5 = sy.q.i(bVar5);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : i5) {
                            vz.d dVar3 = (vz.d) obj4;
                            if (dVar3 != null) {
                                xz.o oVar = dVar3.c.c.b.b;
                                if (oVar.a) {
                                }
                            }
                            if (!k71.k.b(dVar3 != null ? dVar3.b : str5, "")) {
                                if (((dVar3 == null || (j2 = sy.q.j(dVar3)) == null || j2.size() != 0) ? i2 : 1) == 0) {
                                    i3 = i2;
                                    if (i3 == 0) {
                                        arrayList.add(obj4);
                                    }
                                }
                            }
                            i3 = 1;
                            if (i3 == 0) {
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i6 = i2;
                        while (i6 < size) {
                            Object obj5 = arrayList.get(i6);
                            i6++;
                            vz.d dVar4 = (vz.d) obj5;
                            if (!k71.k.b(dVar4 != null ? dVar4.b : str5, "")) {
                                if (((dVar4 == null || (j = sy.q.j(dVar4)) == null || j.size() != 0) ? i2 : 1) == 0) {
                                    y0Var = (dVar4 == null || (str6 = dVar4.b) == null) ? str5 : new z0(str6);
                                    if (y0Var == null) {
                                        arrayList2.add(y0Var);
                                    }
                                }
                            }
                            y0Var = new y0(str7 == null ? "" : str7);
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
                y.j(obj3);
                bVar3 = (vz.b) obj3;
                if (bVar3 == null) {
                    String str8 = projectsMetaInfo2.s;
                    k71.k.g(str8, "itemId");
                    k71.k.g(j0Var, "groupedByField");
                    k71.k.g(list2, "newSortValues");
                    List<vz.d> i7 = sy.q.i(bVar3);
                    vz.d dVar5 = (vz.d) x61.m.W(i7);
                    xz.a aVar3 = dVar5 != null ? dVar5.c.d.c : null;
                    Iterator it = i7.iterator();
                    loop2: while (true) {
                        if (!it.hasNext()) {
                            j0Var2 = j0Var;
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        vz.d dVar6 = (vz.d) obj;
                        if (dVar6 != null && (list3 = dVar6.c.c.b.c) != null && !list3.isEmpty()) {
                            for (xz.n nVar4 : list3) {
                                j0Var2 = j0Var;
                                if (k71.k.b((nVar4 == null || (mVar2 = nVar4.b) == null) ? null : mVar2.b, str8)) {
                                    break loop2;
                                }
                                j0Var = j0Var2;
                            }
                        }
                        j0Var = j0Var;
                    }
                    vz.d dVar7 = (vz.d) obj;
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
                                xz.n nVar5 = (xz.n) nVar3;
                                if (k71.k.b((nVar5 == null || (mVar = nVar5.b) == null) ? null : mVar.b, str8)) {
                                    break;
                                }
                            }
                            nVar = nVar3;
                        } else {
                            nVar = null;
                        }
                        if (nVar != null) {
                            xz.a aVar4 = aVar3;
                            ArrayList arrayList3 = new ArrayList(x61.n.F(list2, 10));
                            Iterator it3 = list2.iterator();
                            while (true) {
                                Iterator it4 = it3;
                                if (it3.hasNext()) {
                                    q0 q0Var = (q0) it4.next();
                                    String str9 = q0Var.a;
                                    ProjectViewItemSortableValueType projectViewItemSortableValueType = q0Var.b;
                                    b71.a aVar5 = aVar2;
                                    k71.k.g(projectViewItemSortableValueType, "<this>");
                                    int i8 = cz.b.a[projectViewItemSortableValueType.ordinal()];
                                    if (i8 == 1) {
                                        mxVar = mx.t;
                                    } else if (i8 == 2) {
                                        mxVar = mx.w;
                                    } else if (i8 == 3) {
                                        mxVar = mx.u;
                                    } else {
                                        if (i8 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        mxVar = mx.v;
                                    }
                                    arrayList3.add(new a0Shadow(mxVar, str9));
                                    it3 = it4;
                                    aVar2 = aVar5;
                                } else {
                                    aVar = aVar2;
                                    xz.n nVar6 = new xz.n(nVar.a, nVar.b, new f00.b0(arrayList3));
                                    Iterator it5 = i7.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            obj2 = it5.next();
                                            vz.d dVar8 = (vz.d) obj2;
                                            if (dVar8 != null) {
                                                xz.f fVar2 = dVar8.c.d;
                                                String str10 = fVar2.b;
                                                xz.e eVar3 = fVar2.d;
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
                                                        b = k71.k.b(str10, str3);
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
                                                        b = k71.k.b(str10, str3);
                                                        if (b) {
                                                        }
                                                        break;
                                                    case 2:
                                                        if (!k71.k.b(str10, str3)) {
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
                                            obj2 = null;
                                        }
                                    }
                                    vz.d dVar9 = (vz.d) obj2;
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
                                        st.Companion.getClass();
                                        aa.q0 q0Var2 = st.c;
                                        String str11 = ((aa.q) q0Var2).a;
                                        hVar2 = hVar;
                                        ix.Companion.getClass();
                                        bVar4 = bVar2;
                                        tVar2 = tVar;
                                        bVar7 = bVar3;
                                        dVar = dVar7;
                                        nVar2 = nVar6;
                                        i2 = 0;
                                        xz.u uVar = new xz.u(((aa.q) ix.a).a, new xz.p(0, new xz.o(null, false, false), rVar));
                                        String str12 = ((aa.q) q0Var2).a;
                                        if (c0Var2 != null) {
                                            String str13 = c0Var2.e;
                                            switch (r.a[j0Var2.l().ordinal()]) {
                                                case 1:
                                                    ut.Companion.getClass();
                                                    i0Var = new i0(((aa.q) ut.a).a, new xz.a0(str13 != null ? d0Shadow.n(str13) : t71.p.g0(str3, new String[]{", "}, 6)), null, null, null, null, null, null, null);
                                                    i0Var2 = i0Var;
                                                    if (i0Var2 != null) {
                                                        eVar2 = new xz.e(i0Var2.a, i0Var2);
                                                        String str14 = str3;
                                                        xz.f fVar3 = new xz.f("", str14, aVar4, eVar2, str12);
                                                        str4 = str14;
                                                        dVar9 = new vz.d(str11, "", new xz.v(str11, "", uVar, fVar3));
                                                        break;
                                                    }
                                                    break;
                                                case 2:
                                                    eu.Companion.getClass();
                                                    i0Var2 = new i0(((aa.q) eu.a).a, null, null, null, new xz.d0(str3), null, null, null, null);
                                                    if (i0Var2 != null) {
                                                    }
                                                    break;
                                                case 3:
                                                    ku.Companion.getClass();
                                                    i0Var2 = new i0(((aa.q) ku.a).a, null, null, null, null, null, new f0(str3), null, null);
                                                    if (i0Var2 != null) {
                                                    }
                                                    break;
                                                case 4:
                                                    ou.Companion.getClass();
                                                    i0Var2 = new i0(((aa.q) ou.a).a, null, null, null, null, null, null, null, new h0(str13));
                                                    if (i0Var2 != null) {
                                                    }
                                                    break;
                                                case 5:
                                                    mu.Companion.getClass();
                                                    i0Var2 = new i0(((aa.q) mu.a).a, null, null, null, null, null, null, new g0(c0Var2.d), null);
                                                    if (i0Var2 != null) {
                                                    }
                                                    break;
                                                case 6:
                                                    gu.Companion.getClass();
                                                    i0Var2 = new i0(((aa.q) gu.a).a, null, null, null, null, new e0(c0Var2.c), null, null, null);
                                                    if (i0Var2 != null) {
                                                    }
                                                    break;
                                                case 7:
                                                    yt.Companion.getClass();
                                                    i0Var2 = new i0(((aa.q) yt.a).a, null, new b0(c0Var2.a), null, null, null, null, null, null);
                                                    if (i0Var2 != null) {
                                                    }
                                                    break;
                                                case 8:
                                                    cu.Companion.getClass();
                                                    i0Var = new i0(((aa.q) cu.a).a, null, null, new xz.c0(c0Var2.b), null, null, null, null, null);
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
                                        String str142 = str3;
                                        xz.f fVar32 = new xz.f("", str142, aVar4, eVar2, str12);
                                        str4 = str142;
                                        dVar9 = new vz.d(str11, "", new xz.v(str11, "", uVar, fVar32));
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
                                        i7 = x61.m.m0(i7, dVar9);
                                    }
                                    final int i9 = 0;
                                    j71.c cVar2 = new j71.c() { // from class: u00.s
                                        public final Object k(Object obj6) {
                                            List list5 = (List) obj6;
                                            switch (i9) {
                                                case 0:
                                                    k71.k.g(list5, "items");
                                                    return x61.m.j0(list5, nVar);
                                                default:
                                                    k71.k.g(list5, "items");
                                                    return x61.m.v0(x61.m.S(x61.m.m0(list5, nVar)), new j1(3, new sw0.b(13)));
                                            }
                                        }
                                    };
                                    vz.d dVar10 = dVar;
                                    vz.d a2 = a(dVar10, cVar2);
                                    if (k71.k.b(dVar10.b, dVar9 != null ? dVar9.b : null)) {
                                        final int i11 = 1;
                                        final xz.n nVar7 = nVar2;
                                        dVar2 = a(a2, new j71.c() { // from class: u00.s
                                            public final Object k(Object obj6) {
                                                List list5 = (List) obj6;
                                                switch (i11) {
                                                    case 0:
                                                        k71.k.g(list5, "items");
                                                        return x61.m.j0(list5, nVar7);
                                                    default:
                                                        k71.k.g(list5, "items");
                                                        return x61.m.v0(x61.m.S(x61.m.m0(list5, nVar7)), new j1(3, new sw0.b(13)));
                                                }
                                            }
                                        });
                                    } else {
                                        final xz.n nVar8 = nVar2;
                                        if (dVar9 != null) {
                                            final int i12 = 1;
                                            dVar2 = a(dVar9, new j71.c() { // from class: u00.s
                                                public final Object k(Object obj6) {
                                                    List list5 = (List) obj6;
                                                    switch (i12) {
                                                        case 0:
                                                            k71.k.g(list5, "items");
                                                            return x61.m.j0(list5, nVar8);
                                                        default:
                                                            k71.k.g(list5, "items");
                                                            return x61.m.v0(x61.m.S(x61.m.m0(list5, nVar8)), new j1(3, new sw0.b(13)));
                                                    }
                                                }
                                            });
                                        } else {
                                            dVar2 = null;
                                        }
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    for (vz.d dVar11 : i7) {
                                        String str15 = dVar11 != null ? dVar11.b : null;
                                        if (k71.k.b(str15, dVar2 != null ? dVar2.b : null)) {
                                            dVar11 = dVar2;
                                        } else if (k71.k.b(str15, a2.b)) {
                                            ArrayList j3 = sy.q.j(a2);
                                            dVar11 = ((j3 == null || j3.size() != 0) ? i2 : 1) != 0 ? null : a2;
                                        }
                                        if (dVar11 != null) {
                                            arrayList4.add(dVar11);
                                        }
                                    }
                                    vz.b bVar8 = bVar7;
                                    vz.e eVar4 = bVar8.a;
                                    if (eVar4 != null) {
                                        vz.f fVar4 = eVar4.c;
                                        if (fVar4 != null) {
                                            vz.c cVar3 = fVar4.b;
                                            if (cVar3.c == null) {
                                                arrayList4 = null;
                                            }
                                            fVar = vz.f.a(fVar4, vz.c.a(cVar3, null, arrayList4, 3));
                                        } else {
                                            fVar = null;
                                        }
                                        eVar = vz.e.a(eVar4, fVar);
                                    } else {
                                        eVar = null;
                                    }
                                    bVar6 = vz.b.a(bVar8, eVar);
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
                    t tVar3 = tVar2;
                    str5 = null;
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
                    str5 = null;
                }
                String str72 = str4;
                if (bVar5 != null) {
                }
                return rVar;
            }
        }
        tVar = new t(this, cVar);
        Object obj32 = tVar.C;
        b71.a aVar22 = b71.a.r;
        i = tVar.E;
        x61.rShadow rVar2 = x61.rShadow.r;
        if (i != 0) {
        }
        bVar3 = (vz.b) obj32;
        if (bVar3 == null) {
        }
        if (bVar5 == null) {
        }
        String str722 = str4;
        if (bVar5 != null) {
        }
        return rVar2;
    }
}
