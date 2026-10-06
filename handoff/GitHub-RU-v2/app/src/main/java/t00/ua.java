package t00;

import com.github.service.models.response.SimpleRepository;
import com.github.service.models.response.home.NavLinkIdentifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jn0.u60;
import jn0.v60;
import jn0.w60;
import jn0.x60;
import jn0.z60;
import jo.zi0;
import pz0.zy;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class ua implements j71.c {
    public final /* synthetic */ int r;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0102 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        su0.e eVar;
        List list;
        su0.e eVar2;
        su0.d dVar;
        mw0.a aVar;
        su0.e eVar3;
        su0.e eVar4;
        uu0.z4 z4Var;
        Object obj2;
        v7.c F0;
        NavLinkIdentifier navLinkIdentifier;
        yx0.f fVar;
        yx0.c cVar;
        List list2;
        yx0.f fVar2;
        yx0.c cVar2;
        yx0.g gVar;
        yx0.f fVar3;
        yx0.c cVar3;
        yx0.f fVar4;
        String str;
        String str2;
        String str3;
        l01.n0Shadow n0Var;
        x61.rShadow rVar;
        ay0.m mVar;
        ay0.e eVar5;
        String r;
        ay0.a aVar2;
        yx0.f fVar5;
        switch (this.r) {
            case 0:
                jo.w3 w3Var = (jo.w3) obj;
                k71.k.g(w3Var, "data");
                jo.z3 z3Var = w3Var.a.b;
                List list3 = z3Var != null ? z3Var.b : null;
                return list3 == null ? x61.rShadow.r : list3;
            case 1:
                jo.w3 w3Var2 = (jo.w3) obj;
                k71.k.g(w3Var2, "data");
                jo.z3 z3Var2 = w3Var2.a.b;
                List list4 = z3Var2 != null ? z3Var2.b : null;
                if (list4 == null) {
                    list4 = x61.rShadow.r;
                }
                ArrayList S = x61.m.S(list4);
                ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                int size = S.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = S.get(i);
                    i++;
                    jo.x3Shadow x3Var = (jo.x3) obj3;
                    arrayList.add(new yz0.h4(x3Var.b, x3Var.c));
                }
                jo.y3 y3Var = z3Var2 != null ? z3Var2.a : null;
                return new yz0.i4(arrayList, y3Var != null ? new x01.i(y3Var.c, y3Var.a, !y3Var.b) : new x01.i((String) null, false, true));
            case 2:
                k71.k.g((Throwable) obj, "<unused var>");
                return Boolean.FALSE;
            case 3:
                l81.f fVar6 = (l81.f) obj;
                k71.k.g(fVar6, "$this$Json");
                fVar6.c = true;
                return w61.a0.a;
            case 4:
                ty0.a aVar3 = (ty0.a) obj;
                k71.k.g(aVar3, "repositoryOwnerRepositoriesParameters");
                String str4 = aVar3.a;
                String str5 = aVar3.b;
                aa1.b bVar = aa.t0.d;
                return new su0.g(str4, bVar, str5 == null ? bVar : new aa.u0(str5));
            case 5:
                su0.b bVar2 = (su0.b) obj;
                k71.k.g(bVar2, "data");
                su0.f fVar7 = bVar2.a;
                return Boolean.valueOf((fVar7 == null || (eVar = fVar7.b) == null || (list = eVar.b) == null) ? false : !list.isEmpty());
            case 6:
                su0.b bVar3 = (su0.b) obj;
                k71.k.g(bVar3, "data");
                su0.f fVar8 = bVar3.a;
                if (fVar8 == null || (eVar2 = fVar8.b) == null || (dVar = eVar2.a) == null || (aVar = dVar.b) == null) {
                    return null;
                }
                return new x01.i(aVar.a, aVar.b, !aVar.c);
            case 7:
                su0.b bVar4 = (su0.b) obj;
                k71.k.g(bVar4, "data");
                su0.f fVar9 = bVar4.a;
                List list5 = (fVar9 == null || (eVar3 = fVar9.b) == null) ? null : eVar3.b;
                return list5 == null ? x61.rShadow.r : list5;
            case 8:
                su0.b bVar5 = (su0.b) obj;
                k71.k.g(bVar5, "data");
                su0.f fVar10 = bVar5.a;
                ArrayList arrayList2 = null;
                if (fVar10 == null || (eVar4 = fVar10.b) == null) {
                    return null;
                }
                mw0.a aVar4 = eVar4.a.b;
                x01.i iVar = new x01.i(aVar4.a, aVar4.b, !aVar4.c);
                List<su0.c> list6 = eVar4.b;
                if (list6 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (su0.c cVar4 : list6) {
                        SimpleRepository H = (cVar4 == null || (z4Var = cVar4.c) == null) ? null : w8.s.H(z4Var);
                        if (H != null) {
                            arrayList3.add(H);
                        }
                    }
                    arrayList2 = arrayList3;
                }
                if (arrayList2 == null) {
                    arrayList2 = x61.rShadow.r;
                }
                return new yz0.k4(arrayList2, iVar);
            case 9:
                ty0.c cVar5 = (ty0.c) obj;
                k71.k.g(cVar5, "repositoryOwnerRepositoriesParameters");
                zy j0 = com.google.android.gms.internal.measurement.b4.j0(cVar5.a);
                return new z60((aa1.b) null, j0 == null ? aa.t0.d : new aa.u0(j0), 10);
            case 10:
                u60 u60Var = (u60) obj;
                k71.k.g(u60Var, "data");
                return Boolean.valueOf(u60Var.a.a.b != null ? !r0.isEmpty() : false);
            case 11:
                u60 u60Var2 = (u60) obj;
                k71.k.g(u60Var2, "data");
                w60 w60Var = u60Var2.a.a.a;
                return new x01.i(w60Var.b, w60Var.a, !w60Var.c);
            case 12:
                u60 u60Var3 = (u60) obj;
                k71.k.g(u60Var3, "data");
                List list7 = u60Var3.a.a.b;
                return list7 == null ? x61.rShadow.r : list7;
            case 13:
                u60 u60Var4 = (u60) obj;
                k71.k.g(u60Var4, "data");
                x60 x60Var = u60Var4.a.a;
                x61.rShadow rVar2 = x60Var.b;
                if (rVar2 == null) {
                    rVar2 = x61.rShadow.r;
                }
                ArrayList S2 = x61.m.S(rVar2);
                ArrayList arrayList4 = new ArrayList(x61.n.F(S2, 10));
                int size2 = S2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj4 = S2.get(i2);
                    i2++;
                    v60 v60Var = (v60) obj4;
                    uu0.z4 z4Var2 = v60Var.f;
                    uu0.y4 y4Var = z4Var2.d;
                    arrayList4.add(new ty0.d(new yz0.t7(z4Var2.a, z4Var2.b, y4Var.c, m7.y.L(y4Var.d), new kx0.j(v60Var.g), z4Var2.c), v60Var.d, v60Var.b, v60Var.c));
                }
                w60 w60Var2 = x60Var.a;
                return new ty0.b(arrayList4, new x01.i(w60Var2.b, w60Var2.a, !w60Var2.c));
            case 14:
                k71.k.g((is.p) obj, "it");
                return Boolean.TRUE;
            case 15:
                k71.k.g((is.p) obj, "it");
                return Boolean.TRUE;
            case 16:
                k71.k.g((is.p) obj, "it");
                return Boolean.TRUE;
            case 17:
                k71.k.g((is.p) obj, "it");
                return Boolean.TRUE;
            case 18:
                v1.o oVar = (androidx.compose.runtime.f1) obj;
                if (!(oVar instanceof v1Shadow.o)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                v1.o oVar2 = oVar;
                if (oVar2.getValue() != null) {
                    Object value = oVar2.getValue();
                    k71.k.d(value);
                    obj2 = ((j71.c) l3.v.d.s).k(value);
                } else {
                    obj2 = null;
                }
                androidx.compose.runtime.a3 h = oVar2.h();
                k71.k.e(h, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver?>");
                return new androidx.compose.runtime.p1(obj2, h);
            case 19:
                return new u1.c((Map) obj);
            case 20:
                return obj;
            case 21:
                v7.a aVar5 = (v7.a) obj;
                k71.k.g(aVar5, "_connection");
                F0 = aVar5.F0("SELECT * FROM dashboard_nav_links");
                try {
                    int o = y9.a.o(F0, "identifier");
                    int o2 = y9.a.o(F0, "hidden");
                    ArrayList arrayList5 = new ArrayList();
                    while (F0.B0()) {
                        String l0 = F0.l0(o);
                        k71.k.g(l0, "value");
                        NavLinkIdentifier[] values = NavLinkIdentifier.values();
                        int length = values.length;
                        boolean z = false;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                navLinkIdentifier = values[i3];
                                if (!k71.k.b(navLinkIdentifier.getRawValue(), l0)) {
                                    i3++;
                                }
                            } else {
                                navLinkIdentifier = null;
                            }
                        }
                        if (navLinkIdentifier == null) {
                            navLinkIdentifier = NavLinkIdentifier.UNKNOWN__;
                        }
                        if (((int) F0.getLong(o2)) != 0) {
                            z = true;
                        }
                        arrayList5.add(new uj.c(navLinkIdentifier, z));
                    }
                    return arrayList5;
                } finally {
                }
            case 22:
                v7.a aVar6 = (v7.a) obj;
                k71.k.g(aVar6, "_connection");
                F0 = aVar6.F0("DELETE FROM dashboard_nav_links");
                try {
                    F0.B0();
                    F0.close();
                    return w61.a0.a;
                } finally {
                }
            case 23:
                ux0.z zVar = (ux0.z) obj;
                k71.k.g(zVar, "params");
                return new yx0.h(new aa.u0(10), new aa.u0(zVar.b), zVar.a);
            case 24:
                yx0.b bVar6 = (yx0.b) obj;
                k71.k.g(bVar6, "data");
                yx0.e eVar6 = bVar6.a;
                return Boolean.valueOf((eVar6 == null || (fVar = eVar6.c) == null || (cVar = fVar.b) == null || (list2 = cVar.c) == null) ? false : !list2.isEmpty());
            case 25:
                yx0.b bVar7 = (yx0.b) obj;
                k71.k.g(bVar7, "data");
                yx0.e eVar7 = bVar7.a;
                if (eVar7 == null || (fVar2 = eVar7.c) == null || (cVar2 = fVar2.b) == null || (gVar = cVar2.b) == null) {
                    return null;
                }
                return new x01.i(gVar.b, gVar.a, !gVar.c);
            case 26:
                yx0.b bVar8 = (yx0.b) obj;
                k71.k.g(bVar8, "data");
                yx0.e eVar8 = bVar8.a;
                List list8 = (eVar8 == null || (fVar3 = eVar8.c) == null || (cVar3 = fVar3.b) == null) ? null : cVar3.c;
                return list8 == null ? x61.rShadow.r : list8;
            case 27:
                yx0.b bVar9 = (yx0.b) obj;
                k71.k.g(bVar9, "data");
                yx0.e eVar9 = bVar9.a;
                x61.rShadow<yx0.d> rVar3 = (eVar9 == null || (fVar5 = eVar9.c) == null) ? null : fVar5.b.c;
                x61.rShadow rVar4 = x61.rShadow.r;
                if (rVar3 == null) {
                    rVar3 = rVar4;
                }
                ArrayList arrayList6 = new ArrayList();
                for (yx0.d dVar2 : rVar3) {
                    if (dVar2 != null && (aVar2 = dVar2.c.d.c) != null) {
                        ay0.b bVar10 = aVar2.b;
                        if (bVar10 != null) {
                            str = bVar10.a;
                        } else {
                            ay0.c cVar6 = aVar2.d;
                            if (cVar6 != null) {
                                str = cVar6.a;
                            } else {
                                ay0.d dVar3 = aVar2.c;
                                if (dVar3 != null) {
                                    str = dVar3.a;
                                }
                            }
                        }
                        str2 = "";
                        if (str == null) {
                            str = "";
                        }
                        str3 = dVar2 == null ? dVar2.c.d.b : null;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str6 = dVar2 == null ? dVar2.c.b : null;
                        if (dVar2 != null && (eVar5 = dVar2.c.d.d) != null && (r = t.e.r(eVar5.b)) != null) {
                            str2 = r;
                        }
                        if (dVar2 == null) {
                            ay0.u uVar = dVar2.c.c;
                            l01.m0 m0Var = new l01.m0(str, str2, str3, str6);
                            List<ay0.n> list9 = uVar.b.c;
                            if (list9 != null) {
                                rVar = new ArrayList();
                                for (ay0.n nVar : list9) {
                                    l01.v l = (nVar == null || (mVar = nVar.b) == null) ? null : m7.y.l(mVar.c, k41.b.g(nVar != null ? nVar.c : null));
                                    if (l != null) {
                                        rVar.add(l);
                                    }
                                }
                            } else {
                                rVar = null;
                            }
                            if (rVar == null) {
                                rVar = rVar4;
                            }
                            ay0.p pVar = uVar.b;
                            n0Var = new l01.n0(m0Var, rVar, pVar.b.a, pVar.a);
                        } else {
                            n0Var = null;
                        }
                        if (n0Var == null) {
                            arrayList6.add(n0Var);
                        }
                    }
                    str = null;
                    str2 = "";
                    if (str == null) {
                    }
                    if (dVar2 == null) {
                    }
                    if (str3 == null) {
                    }
                    if (dVar2 == null) {
                    }
                    if (dVar2 != null) {
                        str2 = r;
                    }
                    if (dVar2 == null) {
                    }
                    if (n0Var == null) {
                    }
                }
                return new l01.o0(arrayList6, (eVar9 == null || (fVar4 = eVar9.c) == null) ? false : fVar4.b.b.a);
            case 28:
                zi0 zi0Var = (zi0) obj;
                k71.k.g(zi0Var, "data");
                return Boolean.valueOf(aa1.b.F(zi0Var));
            default:
                l81.f fVar11 = (l81.f) obj;
                k71.k.g(fVar11, "$this$Json");
                fVar11.c = true;
                fVar11.e = true;
                return w61.a0.a;
        }
    }
}
