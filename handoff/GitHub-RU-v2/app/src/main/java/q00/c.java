package q00;

import aa.u0;
import android.content.Context;
import com.github.rudroid.repositories.fragments.RepositoriesFragment;
import com.github.rudroid.repository.RepositoryDetailFragment;
import com.github.rudroid.repository.navigation.DefaultRepositoryDetailRoute;
import com.github.rudroid.repository.navigation.RepositoriesRoute;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.RepoFileType;
import com.github.service.models.response.type.PatchStatus;
import com.google.android.gms.internal.measurement.b4;
import d3.c0;
import d3.z;
import dw.s5;
import dw.t5;
import fz.j;
import gn0.dn;
import gn0.na;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jo.h90;
import jo.i90;
import jo.j90;
import jo.k90;
import jo.m90;
import k71.k;
import k71.x;
import kc0.me;
import kc0.ne;
import kc0.pe;
import kc0.qe;
import kc0.re;
import m10.x40;
import oj0.b2;
import oj0.e2;
import qg.p;
import ri0.f0;
import ri0.g;
import ri0.g0;
import ri0.h0;
import ri0.i0;
import ri0.j0;
import ri0.k0;
import ri0.l0;
import ri0.m0;
import ri0.n0;
import ri0.o0;
import ri0.p0;
import ri0.q0;
import ri0.r0;
import ri0.s0;
import ri0.t0;
import ri0.v;
import ri0.v0;
import ri0.w0;
import ri0.x0;
import sy.e0;
import u10.ax;
import u10.bx;
import u10.dx;
import u10.ex;
import u10.fx;
import u10.gx;
import u10.hx;
import u10.xw;
import u10.zw;
import w50.l;
import w61.a0;
import w8.s;
import x01.i;
import x6.y;
import x61.m;
import x61.n;
import x61.r;
import yz0.e4;
import yz0.n1;
import yz0.o1;
import yz0.t7;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class c implements j71.c {
    public final /* synthetic */ int r;

    public /* synthetic */ c(int i) {
        this.r = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x01c7, code lost:
    
        if (r2 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01aa, code lost:
    
        if (r2 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ad, code lost:
    
        r18 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        bx bxVar;
        ex exVar;
        ne neVar;
        pe peVar;
        x0 x0Var;
        f0 f0Var;
        t0 t0Var;
        List list;
        ne neVar2;
        pe peVar2;
        x0 x0Var2;
        f0 f0Var2;
        t0 t0Var2;
        ne neVar3;
        pe peVar3;
        x0 x0Var3;
        f0 f0Var3;
        t0 t0Var3;
        String str;
        String str2;
        String str3;
        boolean z;
        String str4;
        i0 i0Var;
        r0 r0Var;
        String str5;
        RepoFileType repoFileType;
        h0 h0Var;
        h0 h0Var2;
        g gVar;
        w0 w0Var;
        String str6;
        o0 o0Var;
        List list2;
        ne neVar4;
        pe peVar4;
        int i = this.r;
        aa1.b bVar = aa.t0.d;
        List list3 = r.r;
        a0 a0Var = a0.a;
        int i2 = 0;
        switch (i) {
            case 0:
                d dVar = (d) obj;
                k.g(dVar, "repositoryOwnerRepositoriesParameters");
                x40 P = aa1.b.P(dVar.a);
                if (P != null) {
                    bVar = new u0(P);
                }
                return new m90(null, bVar, 10);
            case 1:
                h90 h90Var = (h90) obj;
                k.g(h90Var, "data");
                return Boolean.valueOf(h90Var.a.a.b != null ? !r0.isEmpty() : false);
            case 2:
                h90 h90Var2 = (h90) obj;
                k.g(h90Var2, "data");
                j90 j90Var = h90Var2.a.a.a;
                return new i(j90Var.c, j90Var.a, !j90Var.b);
            case 3:
                h90 h90Var3 = (h90) obj;
                k.g(h90Var3, "data");
                List list4 = h90Var3.a.a.b;
                return list4 == null ? list3 : list4;
            case 4:
                h90 h90Var4 = (h90) obj;
                k.g(h90Var4, "data");
                k90 k90Var = h90Var4.a.a;
                List list5 = k90Var.b;
                ArrayList S = m.S(list5 == null ? list3 : list5);
                ArrayList arrayList = new ArrayList(n.F(S, 10));
                int size = S.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = S.get(i3);
                    i3++;
                    i90 i90Var = (i90) obj2;
                    t5 t5Var = i90Var.f;
                    s5 s5Var = t5Var.d;
                    arrayList.add(new e(new t7(t5Var.a, t5Var.b, s5Var.c, s.A(s5Var.d), new j(i90Var.g), t5Var.c), i90Var.d, i90Var.b, i90Var.c));
                }
                j90 j90Var2 = k90Var.a;
                return new b(arrayList, new i(j90Var2.c, j90Var2.a, !j90Var2.b));
            case 5:
                qa0.a aVar = (qa0.a) obj;
                k.g(aVar, "issueParameters");
                String str7 = aVar.c;
                String g = f1.e.g("type:issue ", aVar.d);
                u0 u0Var = new u0((Object) null);
                String str8 = aVar.b;
                aa1.b u0Var2 = str8 == null ? bVar : new u0(str8);
                if (str7 != null) {
                    bVar = new u0(str7);
                }
                return new hx(g, u0Var, u0Var2, bVar, new u0(Boolean.valueOf((str8 == null || str7 == null) ? false : true)));
            case 6:
                xw xwVar = (xw) obj;
                k.g(xwVar, "data");
                return Boolean.valueOf(xwVar.b.c != null ? !r0.isEmpty() : false);
            case 7:
                xw xwVar2 = (xw) obj;
                k.g(xwVar2, "data");
                dx dxVar = xwVar2.b.b;
                boolean z2 = dxVar.a;
                String str9 = dxVar.b;
                return new i(str9, z2, str9 == null);
            case 8:
                xw xwVar3 = (xw) obj;
                k.g(xwVar3, "data");
                List list6 = xwVar3.b.c;
                return list6 == null ? list3 : list6;
            case 9:
                xw xwVar4 = (xw) obj;
                k.g(xwVar4, "data");
                gx gxVar = xwVar4.b;
                fx fxVar = xwVar4.a;
                String str10 = fxVar != null ? fxVar.b : null;
                List<ax> list7 = (fxVar == null || (exVar = fxVar.d) == null) ? null : exVar.a;
                if (list7 == null) {
                    list7 = list3;
                }
                ArrayList arrayList2 = new ArrayList();
                for (ax axVar : list7) {
                    l lVar = axVar != null ? axVar.a.c : null;
                    if (lVar != null) {
                        arrayList2.add(lVar);
                    }
                }
                ArrayList arrayList3 = new ArrayList(n.F(arrayList2, 10));
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj3 = arrayList2.get(i4);
                    i4++;
                    arrayList3.add(sy.n.F((l) obj3));
                }
                List list8 = gxVar.c;
                List<zw> list9 = list8 == null ? list3 : list8;
                ArrayList arrayList4 = new ArrayList();
                for (zw zwVar : list9) {
                    l lVar2 = (zwVar == null || (bxVar = zwVar.b) == null) ? null : bxVar.c;
                    if (lVar2 != null) {
                        arrayList4.add(lVar2);
                    }
                }
                ArrayList arrayList5 = new ArrayList(n.F(arrayList4, 10));
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj4 = arrayList4.get(i5);
                    i5++;
                    arrayList5.add(sy.n.F((l) obj4));
                }
                p01.m mVar = new p01.m(arrayList3, arrayList5, false);
                dx dxVar2 = gxVar.b;
                boolean z3 = dxVar2.a;
                String str11 = dxVar2.b;
                return new e4(str10, mVar, new i(str11, z3, str11 == null));
            case 10:
                k.g((c0) obj, "$this$clearAndSetSemantics");
                return a0Var;
            case 11:
                k.g((c0) obj, "$this$clearAndSetSemantics");
                return a0Var;
            case 12:
                c0 c0Var = (c0) obj;
                k.g(c0Var, "$this$semantics");
                z.b(c0Var);
                return a0Var;
            case 13:
                c0 c0Var2 = (c0) obj;
                float f = p.a;
                k.g(c0Var2, "$this$semantics");
                z.b(c0Var2);
                return a0Var;
            case 14:
                c0 c0Var3 = (c0) obj;
                float f2 = p.a;
                k.g(c0Var3, "$this$semantics");
                z.b(c0Var3);
                return a0Var;
            case 15:
                c0 c0Var4 = (c0) obj;
                k.g(c0Var4, "$this$semantics");
                z.b(c0Var4);
                return a0Var;
            case 16:
                k.g((Context) obj, "it");
                return list3;
            case 17:
                r81.b bVar2 = (r81.b) obj;
                k.g(bVar2, "it");
                r81.b bVar3 = bVar2.d;
                if (bVar3 instanceof r81.b) {
                    return bVar3;
                }
                return null;
            case 18:
                r81.b bVar4 = (r81.b) obj;
                k.g(bVar4, "it");
                StringBuilder sb = new StringBuilder();
                sb.append(bVar4.b);
                sb.append('=');
                sb.append(bVar4.c);
                return sb.toString();
            case 19:
                c0 c0Var5 = (c0) obj;
                k.g(c0Var5, "$this$semantics");
                z.l(c0Var5, 0);
                return a0Var;
            case 20:
                k.g((Throwable) obj, "<unused var>");
                return Boolean.FALSE;
            case 21:
                rd0.a aVar2 = (rd0.a) obj;
                k.g(aVar2, "id");
                return new re(aVar2.a, aVar2.b, aVar2.c, (u0) null, 24);
            case 22:
                me meVar = (me) obj;
                k.g(meVar, "data");
                qe qeVar = meVar.a;
                return Boolean.valueOf((qeVar == null || (neVar = qeVar.b) == null || (peVar = neVar.c) == null || (x0Var = peVar.c) == null || (f0Var = x0Var.l) == null || (t0Var = f0Var.a) == null || (list = t0Var.b) == null) ? false : !list.isEmpty());
            case 23:
                me meVar2 = (me) obj;
                k.g(meVar2, "data");
                qe qeVar2 = meVar2.a;
                s0 s0Var = (qeVar2 == null || (neVar2 = qeVar2.b) == null || (peVar2 = neVar2.c) == null || (x0Var2 = peVar2.c) == null || (f0Var2 = x0Var2.l) == null || (t0Var2 = f0Var2.a) == null) ? null : t0Var2.a;
                return new i(s0Var != null ? s0Var.a : null, s0Var != null ? s0Var.b : false, false);
            case 24:
                me meVar3 = (me) obj;
                k.g(meVar3, "data");
                qe qeVar3 = meVar3.a;
                List list10 = (qeVar3 == null || (neVar3 = qeVar3.b) == null || (peVar3 = neVar3.c) == null || (x0Var3 = peVar3.c) == null || (f0Var3 = x0Var3.l) == null || (t0Var3 = f0Var3.a) == null) ? null : t0Var3.b;
                return list10 == null ? list3 : list10;
            case 25:
                me meVar4 = (me) obj;
                k.g(meVar4, "data");
                qe qeVar4 = meVar4.a;
                x0 x0Var4 = (qeVar4 == null || (neVar4 = qeVar4.b) == null || (peVar4 = neVar4.c) == null) ? null : peVar4.c;
                if (x0Var4 == null) {
                    throw new ApiFailure(ApiFailureType.UNKNOWN, "return data empty", (String) null, 0, (ArrayList) null, (Map) null, (Throwable) null, 112);
                }
                f0 f0Var4 = x0Var4.l;
                i iVar = new i(f0Var4 != null ? f0Var4.a.a.a : null, f0Var4 != null ? f0Var4.a.a.b : false, false);
                v0 v0Var = x0Var4.k;
                v vVar = x0Var4.o;
                LinkedHashMap C = b4.C(vVar, dn.u);
                LinkedHashMap C2 = b4.C(vVar, dn.t);
                ri0.u0 u0Var3 = x0Var4.m;
                n0 n0Var = (u0Var3 == null || (list2 = u0Var3.a) == null) ? null : (n0) m.W(list2);
                j0 j0Var = x0Var4.n;
                List list11 = j0Var != null ? j0Var.a : null;
                if (list11 == null) {
                    list11 = list3;
                }
                ArrayList S2 = m.S(list11);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size4 = S2.size();
                int i6 = 0;
                while (i6 < size4) {
                    int i7 = i2;
                    Object obj5 = S2.get(i6);
                    i6++;
                    String str12 = ((o0) obj5).b;
                    Object obj6 = linkedHashMap.get(str12);
                    if (obj6 == null) {
                        ArrayList arrayList6 = new ArrayList();
                        linkedHashMap.put(str12, arrayList6);
                        obj6 = arrayList6;
                    }
                    ((List) obj6).add(obj5);
                    i2 = i7;
                }
                int i8 = i2;
                e2 e2Var = v0Var.c;
                String str13 = e2Var.d;
                b2 b2Var = e2Var.h;
                t7 t7Var = new t7(str13, e2Var.c, b2Var.c, b41.b.O(b2Var.d), new wl0.j(v0Var.d), e2Var.e);
                String str14 = b2Var.b;
                int i9 = n0Var != null ? n0Var.b.a : i8;
                List list12 = f0Var4 != null ? f0Var4.a.b : null;
                if (list12 == null) {
                    list12 = list3;
                }
                ArrayList S3 = m.S(list12);
                ArrayList arrayList7 = new ArrayList(n.F(S3, 10));
                int size5 = S3.size();
                int i11 = i8;
                while (true) {
                    str = "";
                    if (i11 >= size5) {
                        String str15 = str14;
                        if (!k71.z.f(arrayList7)) {
                            arrayList7 = null;
                        }
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        ArrayList arrayList8 = arrayList7;
                        String str16 = n0Var != null ? n0Var.a : "";
                        String str17 = x0Var4.b;
                        String str18 = x0Var4.c;
                        String str19 = x0Var4.e;
                        String str20 = x0Var4.f;
                        k0 k0Var = x0Var4.i;
                        String str21 = k0Var != null ? k0Var.a : null;
                        l0 l0Var = x0Var4.j;
                        return new w61.k(new o1(arrayList8, i9, str16, t7Var, str17, str18, str19, str20, str21, l0Var != null ? l0Var.b : null, str15, x0Var4.d, x0Var4.g, x0Var4.h), iVar);
                    }
                    Object obj7 = S3.get(i11);
                    int i12 = i11 + 1;
                    p0 p0Var = (p0) obj7;
                    k.g(p0Var, "<this>");
                    q0 q0Var = p0Var.c;
                    m0 m0Var = p0Var.d;
                    ArrayList arrayList9 = S3;
                    String str22 = m0Var != null ? m0Var.a : null;
                    if (str22 == null || t71.p.T(str22)) {
                        String str23 = q0Var != null ? q0Var.a : null;
                        if (str23 != null) {
                            if (!t71.p.T(str23)) {
                                if (q0Var != null) {
                                    str2 = q0Var.a;
                                    break;
                                }
                            }
                        }
                        str3 = str14;
                        str2 = "";
                    } else {
                        if (m0Var != null) {
                            str2 = m0Var.a;
                            break;
                        }
                        str3 = str14;
                        str2 = "";
                    }
                    List list13 = p0Var.e;
                    if (list13 == null) {
                        list13 = list3;
                    }
                    ArrayList S4 = m.S(list13);
                    List list14 = list3;
                    int i13 = size5;
                    ArrayList arrayList10 = new ArrayList(n.F(S4, 10));
                    int size6 = S4.size();
                    int i14 = i8;
                    while (i14 < size6) {
                        Object obj8 = S4.get(i14);
                        i14++;
                        arrayList10.add(b4.c(((g0) obj8).b, (List) C.get(str2)));
                        S4 = S4;
                        C = C;
                    }
                    LinkedHashMap linkedHashMap2 = C;
                    boolean z4 = m0Var != null ? m0Var.b : i8;
                    PatchStatus p = e0.p(p0Var.i);
                    boolean z5 = p0Var.h;
                    List list15 = (List) linkedHashMap.get(str2);
                    if ((list15 != null ? (o0) m.W(list15) : null) != null) {
                        List list16 = (List) linkedHashMap.get(str2);
                        na naVar = (list16 == null || (o0Var = (o0) m.U(list16)) == null) ? null : o0Var.a;
                        int i15 = naVar == null ? -1 : pl0.e.a[naVar.ordinal()];
                        if (i15 == 1) {
                            z = 1;
                            String str24 = (q0Var != null || (str6 = q0Var.a) == null) ? "" : str6;
                            int i16 = p0Var.a;
                            int i17 = p0Var.b;
                            boolean z6 = p0Var.f;
                            boolean z7 = p0Var.g;
                            if (m0Var != null && (w0Var = m0Var.c) != null) {
                                str = w0Var.a;
                            }
                            String str25 = str;
                            Integer num = m0Var == null ? m0Var.d : null;
                            if (m0Var != null || (h0Var2 = m0Var.e) == null || (gVar = h0Var2.b.b) == null || (str5 = gVar.a) == null) {
                                if (q0Var != null || (i0Var = q0Var.b) == null || (r0Var = i0Var.b) == null) {
                                    str4 = null;
                                    if (m0Var != null || (h0Var = m0Var.e) == null) {
                                        repoFileType = null;
                                    } else {
                                        ri0.k kVar = h0Var.b;
                                        repoFileType = kVar.b != null ? RepoFileType.IMAGE : kVar.c != null ? RepoFileType.PDF : kVar.d != null ? RepoFileType.MARKDOWN : kVar.e != null ? RepoFileType.TEXT : RepoFileType.UNKNOWN;
                                    }
                                    List list17 = (List) C2.get(str2);
                                    arrayList7.add(new n1(str2, str24, i16, i17, z, arrayList10, z6, z7, z4, p, z5, str25, num, str4, repoFileType, list17 == null ? list14 : list17));
                                    S3 = arrayList9;
                                    str14 = str3;
                                    list3 = list14;
                                    size5 = i13;
                                    i11 = i12;
                                    C = linkedHashMap2;
                                } else {
                                    str5 = r0Var.a;
                                }
                            }
                            str4 = str5;
                            if (m0Var != null) {
                            }
                            repoFileType = null;
                            List list172 = (List) C2.get(str2);
                            arrayList7.add(new n1(str2, str24, i16, i17, z, arrayList10, z6, z7, z4, p, z5, str25, num, str4, repoFileType, list172 == null ? list14 : list172));
                            S3 = arrayList9;
                            str14 = str3;
                            list3 = list14;
                            size5 = i13;
                            i11 = i12;
                            C = linkedHashMap2;
                        } else if (i15 != 2) {
                        }
                    }
                    z = i8;
                    if (q0Var != null) {
                    }
                    int i162 = p0Var.a;
                    int i172 = p0Var.b;
                    boolean z62 = p0Var.f;
                    boolean z72 = p0Var.g;
                    if (m0Var != null) {
                        str = w0Var.a;
                    }
                    String str252 = str;
                    if (m0Var == null) {
                    }
                    if (m0Var != null) {
                    }
                    if (q0Var != null) {
                    }
                    str4 = null;
                    if (m0Var != null) {
                    }
                    repoFileType = null;
                    List list1722 = (List) C2.get(str2);
                    arrayList7.add(new n1(str2, str24, i162, i172, z, arrayList10, z62, z72, z4, p, z5, str252, num, str4, repoFileType, list1722 == null ? list14 : list1722));
                    S3 = arrayList9;
                    str14 = str3;
                    list3 = list14;
                    size5 = i13;
                    i11 = i12;
                    C = linkedHashMap2;
                }
                break;
            case 26:
                y yVar = (y) obj;
                k.g(yVar, "$this$navigation");
                yVar.j.add(new z6.i(com.github.rudroid.m0.r(yVar.g, z6.e.class), x.a(RepositoriesRoute.class), rf.e.a, x.a(RepositoriesFragment.class)).a());
                return a0Var;
            case 27:
                y yVar2 = (y) obj;
                k.g(yVar2, "$this$navigation");
                yVar2.j.add(new z6.i(com.github.rudroid.m0.r(yVar2.g, z6.e.class), x.a(DefaultRepositoryDetailRoute.class), rf.a.a, x.a(RepositoryDetailFragment.class)).a());
                rf.g.b(yVar2);
                return a0Var;
            case 28:
                return Integer.valueOf(((Integer) obj).intValue() - 1);
            default:
                return Integer.valueOf(((Integer) obj).intValue() - 1);
        }
    }
}
