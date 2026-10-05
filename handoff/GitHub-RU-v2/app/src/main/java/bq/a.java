package bq;

import com.github.rudroid.agents.AgentPullRequestsPageFragment;
import com.github.rudroid.agents.navigation.AgentPullRequestsNavRoute;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;
import com.github.service.models.response.RepoFileType;
import com.github.service.models.response.type.PatchStatus;
import cq.u2;
import d00.t;
import dw.j3;
import dw.m3;
import fz.j;
import gv.a1;
import gv.b1;
import gv.c1;
import gv.d1;
import gv.e1;
import gv.f0;
import gv.f1;
import gv.g1;
import gv.h1;
import gv.p0;
import gv.q;
import gv.q0;
import gv.r0;
import gv.s0;
import gv.t0;
import gv.u0;
import gv.v0;
import gv.w0;
import gv.x0;
import gv.y0;
import gv.z0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jo.a10;
import jo.b10;
import jo.bh;
import jo.c10;
import jo.ch;
import jo.eh;
import jo.fh;
import jo.u00;
import jo.v00;
import jo.w00;
import jo.x00;
import jo.y00;
import jo.z00;
import k71.x;
import k71.z;
import m10.qf;
import m10.xz;
import m7.y;
import mn.e;
import rc0.h;
import rc0.h0;
import rc0.i;
import rc0.j0;
import rc0.k;
import rc0.k0;
import rc0.l0;
import rc0.m;
import rc0.m0;
import rc0.n0;
import rc0.o0;
import sy.u;
import t71.p;
import w61.a0;
import w8.s;
import wc0.m1;
import wc0.o;
import wc0.v;
import x61.n;
import x61.r;
import y41.t1;
import yu.d;
import yu.f;
import yu.g;
import yz0.n1;
import yz0.o1;
import yz0.p1;
import yz0.q1;
import yz0.t7;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class a implements j71.c {
    public final /* synthetic */ int r;

    public /* synthetic */ a(int i) {
        this.r = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:254:0x03c9, code lost:
    
        if (r14 != null) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x03cc, code lost:
    
        r17 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x03e5, code lost:
    
        if (r14 != null) goto L249;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x078d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        ch chVar;
        eh ehVar;
        h1 h1Var;
        p0 p0Var;
        d1 d1Var;
        List list;
        ch chVar2;
        eh ehVar2;
        h1 h1Var2;
        p0 p0Var2;
        d1 d1Var2;
        ch chVar3;
        eh ehVar3;
        h1 h1Var3;
        p0 p0Var3;
        d1 d1Var3;
        int i;
        String str;
        String str2;
        List list2;
        boolean z;
        String str3;
        s0 s0Var;
        b1 b1Var;
        String str4;
        r0 r0Var;
        r0 r0Var2;
        q qVar;
        g1 g1Var;
        y0 y0Var;
        List list3;
        ch chVar4;
        eh ehVar4;
        v00 v00Var;
        u00 u00Var;
        x00 x00Var;
        a10 a10Var;
        List list4;
        v00 v00Var2;
        u00 u00Var2;
        x00 x00Var2;
        a10 a10Var2;
        v00 v00Var3;
        u00 u00Var3;
        x00 x00Var3;
        a10 a10Var3;
        v00 v00Var4;
        u00 u00Var4;
        x00 x00Var4;
        String str5;
        String str6;
        String str7;
        yu.c cVar;
        f fVar;
        String str8;
        yu.b bVar;
        yu.b bVar2;
        q qVar2;
        Integer num;
        g gVar;
        String str9;
        u2 u2Var;
        t tVar;
        h hVar;
        m mVar;
        List list5;
        h hVar2;
        m mVar2;
        k kVar;
        h hVar3;
        m mVar3;
        i iVar;
        m1 m1Var;
        h hVar4;
        l0 l0Var;
        v vVar;
        wc0.g gVar2;
        List list6;
        l0 l0Var2;
        v vVar2;
        wc0.g gVar3;
        o oVar;
        l0 l0Var3;
        v vVar3;
        wc0.g gVar4;
        l0 l0Var4;
        String str10;
        CheckStatusState checkStatusState;
        e eVar;
        String str11;
        String str12;
        String str13;
        CheckConclusionState checkConclusionState;
        String str14;
        m0 m0Var;
        m0 m0Var2;
        rc0.s0 s0Var2;
        v vVar4;
        wc0.g gVar5;
        List list7;
        rc0.s0 s0Var3;
        v vVar5;
        wc0.g gVar6;
        o oVar2;
        rc0.s0 s0Var4;
        v vVar6;
        wc0.g gVar7;
        switch (this.r) {
            case 0:
                bh bhVar = (bh) obj;
                k71.k.g(bhVar, "data");
                fh fhVar = bhVar.a;
                return Boolean.valueOf((fhVar == null || (chVar = fhVar.b) == null || (ehVar = chVar.c) == null || (h1Var = ehVar.c) == null || (p0Var = h1Var.l) == null || (d1Var = p0Var.c) == null || (list = d1Var.b) == null) ? false : !list.isEmpty());
            case 1:
                bh bhVar2 = (bh) obj;
                k71.k.g(bhVar2, "data");
                fh fhVar2 = bhVar2.a;
                c1 c1Var = (fhVar2 == null || (chVar2 = fhVar2.b) == null || (ehVar2 = chVar2.c) == null || (h1Var2 = ehVar2.c) == null || (p0Var2 = h1Var2.l) == null || (d1Var2 = p0Var2.c) == null) ? null : d1Var2.a;
                return new x01.i(c1Var != null ? c1Var.a : null, c1Var != null ? c1Var.b : false, false);
            case 2:
                bh bhVar3 = (bh) obj;
                k71.k.g(bhVar3, "data");
                fh fhVar3 = bhVar3.a;
                List list8 = (fhVar3 == null || (chVar3 = fhVar3.b) == null || (ehVar3 = chVar3.c) == null || (h1Var3 = ehVar3.c) == null || (p0Var3 = h1Var3.l) == null || (d1Var3 = p0Var3.c) == null) ? null : d1Var3.b;
                return list8 == null ? r.r : list8;
            case 3:
                bh bhVar4 = (bh) obj;
                k71.k.g(bhVar4, "data");
                fh fhVar4 = bhVar4.a;
                h1 h1Var4 = (fhVar4 == null || (chVar4 = fhVar4.b) == null || (ehVar4 = chVar4.c) == null) ? null : ehVar4.c;
                if (h1Var4 == null) {
                    throw new ApiFailure(ApiFailureType.UNKNOWN, "return data empty", (String) null, 0, (ArrayList) null, (Map) null, (Throwable) null, 112);
                }
                p0 p0Var4 = h1Var4.l;
                x01.i iVar2 = new x01.i(p0Var4 != null ? p0Var4.c.a.a : null, p0Var4 != null ? p0Var4.c.a.b : false, false);
                f1 f1Var = h1Var4.k;
                f0 f0Var = h1Var4.o;
                LinkedHashMap z2 = aa1.b.z(f0Var, xz.u);
                LinkedHashMap z3 = aa1.b.z(f0Var, xz.t);
                e1 e1Var = h1Var4.m;
                x0 x0Var = (e1Var == null || (list3 = e1Var.a) == null) ? null : (x0) x61.m.W(list3);
                t0 t0Var = h1Var4.n;
                List list9 = t0Var != null ? t0Var.a : null;
                List list10 = r.r;
                if (list9 == null) {
                    list9 = list10;
                }
                ArrayList S = x61.m.S(list9);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = S.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = S.get(i2);
                    i2++;
                    String str15 = ((y0) obj2).b;
                    Object obj3 = linkedHashMap.get(str15);
                    if (obj3 == null) {
                        ArrayList arrayList = new ArrayList();
                        linkedHashMap.put(str15, arrayList);
                        obj3 = arrayList;
                    }
                    ((List) obj3).add(obj2);
                }
                m3 m3Var = f1Var.c;
                String str16 = m3Var.d;
                j3 j3Var = m3Var.h;
                t7 t7Var = new t7(str16, m3Var.c, j3Var.c, s.A(j3Var.d), new j(f1Var.d), m3Var.e);
                String str17 = j3Var.b;
                int i3 = x0Var != null ? x0Var.b.a : 0;
                List list11 = p0Var4 != null ? p0Var4.c.b : null;
                if (list11 == null) {
                    list11 = list10;
                }
                ArrayList S2 = x61.m.S(list11);
                ArrayList arrayList2 = new ArrayList(n.F(S2, 10));
                int size2 = S2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj4 = S2.get(i4);
                    int i5 = i4 + 1;
                    z0 z0Var = (z0) obj4;
                    String str18 = str17;
                    k71.k.g(z0Var, "<this>");
                    a1 a1Var = z0Var.c;
                    ArrayList arrayList3 = S2;
                    w0 w0Var = z0Var.d;
                    List list12 = list10;
                    String str19 = w0Var != null ? w0Var.a : null;
                    if (str19 == null) {
                        str19 = "";
                    }
                    int i6 = size2;
                    String str20 = a1Var != null ? a1Var.a : null;
                    if (str20 == null) {
                        str20 = "";
                    }
                    if (p.T(str19)) {
                        i = i5;
                        str = str20;
                    } else {
                        i = i5;
                        str = str19;
                    }
                    if (str19.equals(str20)) {
                        str2 = str20;
                        list2 = (List) z2.get(str19);
                        if (list2 == null) {
                            list2 = list12;
                        }
                    } else {
                        List list13 = (List) z2.get(str19);
                        if (list13 == null) {
                            list13 = list12;
                        }
                        List list14 = (List) z2.get(str20);
                        str2 = str20;
                        list2 = x61.m.F0(x61.m.J0(x61.m.l0(list13, list14 == null ? list12 : list14)));
                    }
                    List list15 = z0Var.e;
                    if (list15 == null) {
                        list15 = list12;
                    }
                    ArrayList S3 = x61.m.S(list15);
                    LinkedHashMap linkedHashMap2 = z2;
                    t7 t7Var2 = t7Var;
                    ArrayList arrayList4 = new ArrayList(n.F(S3, 10));
                    int size3 = S3.size();
                    int i7 = 0;
                    while (i7 < size3) {
                        Object obj5 = S3.get(i7);
                        i7++;
                        arrayList4.add(aa1.b.f(((q0) obj5).b, list2));
                        S3 = S3;
                    }
                    boolean z4 = w0Var != null ? w0Var.b : false;
                    PatchStatus j0 = m71.a.j0(z0Var.i);
                    boolean z5 = z0Var.h;
                    List list16 = (List) linkedHashMap.get(str);
                    if ((list16 != null ? (y0) x61.m.W(list16) : null) != null) {
                        List list17 = (List) linkedHashMap.get(str);
                        qf qfVar = (list17 == null || (y0Var = (y0) x61.m.U(list17)) == null) ? null : y0Var.a;
                        int i8 = qfVar == null ? -1 : sy.e.a[qfVar.ordinal()];
                        if (i8 == 1) {
                            z = true;
                            int i9 = z0Var.a;
                            int i11 = z0Var.b;
                            boolean z6 = z0Var.f;
                            boolean z7 = z0Var.g;
                            String str21 = (w0Var != null || (g1Var = w0Var.c) == null) ? "" : g1Var.a;
                            Integer num2 = w0Var == null ? w0Var.d : null;
                            if (w0Var != null || (r0Var2 = w0Var.e) == null || (qVar = r0Var2.b.b) == null || (str4 = qVar.a) == null) {
                                if (a1Var != null || (s0Var = a1Var.b) == null || (b1Var = s0Var.b) == null) {
                                    str3 = null;
                                    RepoFileType B = (w0Var != null || (r0Var = w0Var.e) == null) ? null : a.a.B(r0Var.b);
                                    List list18 = (List) z3.get(str);
                                    arrayList2.add(new n1(str, str2, i9, i11, z, arrayList4, z6, z7, z4, j0, z5, str21, num2, str3, B, list18 == null ? list12 : list18));
                                    S2 = arrayList3;
                                    t7Var = t7Var2;
                                    list10 = list12;
                                    size2 = i6;
                                    i4 = i;
                                    z2 = linkedHashMap2;
                                    str17 = str18;
                                } else {
                                    str4 = b1Var.a;
                                }
                            }
                            str3 = str4;
                            if (w0Var != null) {
                            }
                            List list182 = (List) z3.get(str);
                            arrayList2.add(new n1(str, str2, i9, i11, z, arrayList4, z6, z7, z4, j0, z5, str21, num2, str3, B, list182 == null ? list12 : list182));
                            S2 = arrayList3;
                            t7Var = t7Var2;
                            list10 = list12;
                            size2 = i6;
                            i4 = i;
                            z2 = linkedHashMap2;
                            str17 = str18;
                        } else if (i8 != 2) {
                        }
                    }
                    z = false;
                    int i92 = z0Var.a;
                    int i112 = z0Var.b;
                    boolean z62 = z0Var.f;
                    boolean z72 = z0Var.g;
                    if (w0Var != null) {
                    }
                    if (w0Var == null) {
                    }
                    if (w0Var != null) {
                    }
                    if (a1Var != null) {
                    }
                    str3 = null;
                    if (w0Var != null) {
                    }
                    List list1822 = (List) z3.get(str);
                    arrayList2.add(new n1(str, str2, i92, i112, z, arrayList4, z62, z72, z4, j0, z5, str21, num2, str3, B, list1822 == null ? list12 : list1822));
                    S2 = arrayList3;
                    t7Var = t7Var2;
                    list10 = list12;
                    size2 = i6;
                    i4 = i;
                    z2 = linkedHashMap2;
                    str17 = str18;
                }
                String str22 = str17;
                t7 t7Var3 = t7Var;
                if (!z.f(arrayList2)) {
                    arrayList2 = null;
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                ArrayList arrayList5 = arrayList2;
                String str23 = x0Var != null ? x0Var.a : "";
                String str24 = h1Var4.b;
                String str25 = h1Var4.c;
                String str26 = h1Var4.e;
                String str27 = h1Var4.f;
                u0 u0Var = h1Var4.i;
                String str28 = u0Var != null ? u0Var.a : null;
                v0 v0Var = h1Var4.j;
                return new w61.k(new o1(arrayList5, i3, str23, t7Var3, str24, str25, str26, str27, str28, v0Var != null ? v0Var.b : null, str22, h1Var4.d, h1Var4.g, h1Var4.h, p0Var4 != null ? p0Var4.a : null, p0Var4 != null ? p0Var4.b : null), iVar2);
            case 4:
                c cVar2 = (c) obj;
                k71.k.g(cVar2, "refComparisonFilesChangedParameters");
                return new c10(aa.t0.d, cVar2.a, cVar2.b, cVar2.c, cVar2.d);
            case 5:
                w00 w00Var = (w00) obj;
                k71.k.g(w00Var, "data");
                b10 b10Var = w00Var.a;
                return Boolean.valueOf((b10Var == null || (v00Var = b10Var.b) == null || (u00Var = v00Var.b) == null || (x00Var = u00Var.b) == null || (a10Var = x00Var.d) == null || (list4 = a10Var.b) == null) ? false : !list4.isEmpty());
            case 6:
                w00 w00Var2 = (w00) obj;
                k71.k.g(w00Var2, "data");
                b10 b10Var2 = w00Var2.a;
                z00 z00Var = (b10Var2 == null || (v00Var2 = b10Var2.b) == null || (u00Var2 = v00Var2.b) == null || (x00Var2 = u00Var2.b) == null || (a10Var2 = x00Var2.d) == null) ? null : a10Var2.a;
                return new x01.i(z00Var != null ? z00Var.a : null, z00Var != null ? z00Var.b : false, false);
            case 7:
                w00 w00Var3 = (w00) obj;
                k71.k.g(w00Var3, "data");
                b10 b10Var3 = w00Var3.a;
                List list19 = (b10Var3 == null || (v00Var3 = b10Var3.b) == null || (u00Var3 = v00Var3.b) == null || (x00Var3 = u00Var3.b) == null || (a10Var3 = x00Var3.d) == null) ? null : a10Var3.b;
                return list19 == null ? r.r : list19;
            case 8:
                w00 w00Var4 = (w00) obj;
                k71.k.g(w00Var4, "data");
                b10 b10Var4 = w00Var4.a;
                int i12 = 0;
                if (b10Var4 == null || (v00Var4 = b10Var4.b) == null || (u00Var4 = v00Var4.b) == null || (x00Var4 = u00Var4.b) == null) {
                    throw new ApiFailure(ApiFailureType.UNKNOWN, "return data empty", (String) null, 0, (ArrayList) null, (Map) null, (Throwable) null, 112);
                }
                a10 a10Var4 = x00Var4.d;
                z00 z00Var2 = a10Var4.a;
                x01.i iVar3 = new x01.i(z00Var2.a, z00Var2.b, false);
                List list20 = a10Var4.b;
                List list21 = r.r;
                if (list20 == null) {
                    list20 = list21;
                }
                ArrayList S4 = x61.m.S(list20);
                int i13 = 10;
                ArrayList arrayList6 = new ArrayList(n.F(S4, 10));
                int size4 = S4.size();
                int i14 = 0;
                while (i14 < size4) {
                    Object obj6 = S4.get(i14);
                    i14++;
                    y00 y00Var = (y00) obj6;
                    k71.k.g(y00Var, "<this>");
                    yu.h hVar5 = y00Var.c;
                    d dVar = hVar5.e;
                    yu.e eVar2 = hVar5.d;
                    String str29 = dVar != null ? dVar.a : null;
                    String str30 = "";
                    if (str29 == null || p.T(str29)) {
                        String str31 = eVar2 != null ? eVar2.a : null;
                        if (str31 != null) {
                            if (!p.T(str31)) {
                                if (eVar2 != null) {
                                    str5 = eVar2.a;
                                    break;
                                }
                            }
                        }
                        str6 = "";
                    } else {
                        if (dVar != null) {
                            str5 = dVar.a;
                            break;
                        }
                        str6 = "";
                    }
                    List list22 = hVar5.f;
                    if (list22 == null) {
                        list22 = list21;
                    }
                    ArrayList S5 = x61.m.S(list22);
                    int i15 = i12;
                    ArrayList arrayList7 = new ArrayList(n.F(S5, i13));
                    int size5 = S5.size();
                    int i16 = i15;
                    while (i16 < size5) {
                        Object obj7 = S5.get(i16);
                        i16++;
                        arrayList7.add(t1.h(((yu.a) obj7).b));
                    }
                    boolean z8 = dVar != null ? dVar.b : i15;
                    PatchStatus j02 = m71.a.j0(hVar5.j);
                    boolean z9 = hVar5.i;
                    String str32 = (eVar2 == null || (str9 = eVar2.a) == null) ? "" : str9;
                    int i17 = hVar5.c;
                    int i18 = hVar5.b;
                    boolean z11 = hVar5.g;
                    boolean z12 = hVar5.h;
                    if (dVar != null && (gVar = dVar.c) != null) {
                        str30 = gVar.a;
                    }
                    String str33 = str30;
                    int intValue = (dVar == null || (num = dVar.d) == null) ? i15 : num.intValue();
                    if (dVar == null || (bVar2 = dVar.e) == null || (qVar2 = bVar2.b.b) == null || (str8 = qVar2.a) == null) {
                        if (eVar2 == null || (cVar = eVar2.b) == null || (fVar = cVar.b) == null) {
                            str7 = null;
                            arrayList6.add(new p1(str6, str32, i18, i17, arrayList7, z11, z12, z8, j02, z9, str33, intValue, str7, (dVar != null || (bVar = dVar.e) == null) ? null : a.a.B(bVar.b)));
                            i12 = i15;
                            i13 = 10;
                        } else {
                            str8 = fVar.a;
                        }
                    }
                    str7 = str8;
                    arrayList6.add(new p1(str6, str32, i18, i17, arrayList7, z11, z12, z8, j02, z9, str33, intValue, str7, (dVar != null || (bVar = dVar.e) == null) ? null : a.a.B(bVar.b)));
                    i12 = i15;
                    i13 = 10;
                }
                if (!z.f(arrayList6)) {
                    arrayList6 = null;
                }
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                return new w61.k(new q1(arrayList6, x00Var4.a, x00Var4.b, x00Var4.c), iVar3);
            case 9:
                d00.q qVar3 = (d00.q) obj;
                k71.k.g(qVar3, "data");
                d00.v vVar7 = qVar3.a;
                if (vVar7 == null || (u2Var = vVar7.d) == null) {
                    return null;
                }
                return y.P(u2Var);
            case 10:
                d00.q qVar4 = (d00.q) obj;
                k71.k.g(qVar4, "$this$observeWithPartialResultErrors");
                d00.v vVar8 = qVar4.a;
                return Boolean.valueOf(((vVar8 == null || (tVar = vVar8.c) == null) ? null : tVar.a) != null);
            case 11:
                return (a6.f) obj;
            case 12:
                x6.y yVar = (x6.y) obj;
                k71.k.g(yVar, "$this$navigation");
                yVar.j.add(new z6.i(com.github.rudroid.m0.r(yVar.g, z6.e.class), x.a(AgentPullRequestsNavRoute.class), x61.s.r, x.a(AgentPullRequestsPageFragment.class)).a());
                return a0.a;
            case 13:
                bb0.a aVar = (bb0.a) obj;
                k71.k.g(aVar, "it");
                return aVar.d;
            case 14:
                bb0.a aVar2 = (bb0.a) obj;
                k71.k.g(aVar2, "it");
                return Boolean.valueOf(k71.k.b(aVar2.h, Boolean.FALSE));
            case 15:
                String str34 = (String) obj;
                k71.k.g(str34, "id");
                return new rc0.p(str34, new aa.u0(100), (aa.u0) null, 28);
            case 16:
                rc0.e eVar3 = (rc0.e) obj;
                k71.k.g(eVar3, "data");
                rc0.g gVar8 = eVar3.a;
                return Boolean.valueOf((gVar8 == null || (hVar = gVar8.c) == null || (mVar = hVar.c) == null || (list5 = mVar.c) == null) ? false : !list5.isEmpty());
            case 17:
                rc0.e eVar4 = (rc0.e) obj;
                k71.k.g(eVar4, "data");
                rc0.g gVar9 = eVar4.a;
                if (gVar9 == null || (hVar2 = gVar9.c) == null || (mVar2 = hVar2.c) == null || (kVar = mVar2.b) == null) {
                    return null;
                }
                return new x01.i(kVar.b, kVar.a, !kVar.c);
            case 18:
                rc0.e eVar5 = (rc0.e) obj;
                k71.k.g(eVar5, "data");
                rc0.g gVar10 = eVar5.a;
                List list23 = (gVar10 == null || (hVar3 = gVar10.c) == null || (mVar3 = hVar3.c) == null) ? null : mVar3.c;
                return list23 == null ? r.r : list23;
            case 19:
                rc0.e eVar6 = (rc0.e) obj;
                k71.k.g(eVar6, "data");
                rc0.g gVar11 = eVar6.a;
                if (gVar11 != null && (hVar4 = gVar11.c) != null) {
                    rc0.o oVar3 = hVar4.b.e;
                    return yc0.a.d(hVar4, oVar3 != null ? oVar3.c.b : null);
                }
                if (gVar11 != null && (m1Var = gVar11.e) != null) {
                    return yc0.a.f(m1Var);
                }
                if (gVar11 == null || (iVar = gVar11.d) == null) {
                    return null;
                }
                return yc0.a.e(iVar);
            case 20:
                cd0.b bVar3 = (cd0.b) obj;
                k71.k.g(bVar3, "id");
                String str35 = bVar3.a;
                aa.u0 u0Var2 = new aa.u0(100);
                String str36 = bVar3.b;
                aa1.b bVar4 = aa.t0.d;
                return new o0(str35, u0Var2, bVar4, str36 == null ? bVar4 : new aa.u0(str36), new aa.u0(Boolean.valueOf(str36 != null)));
            case 21:
                j0 j0Var = (j0) obj;
                k71.k.g(j0Var, "data");
                k0 k0Var = j0Var.a;
                return Boolean.valueOf((k0Var == null || (l0Var = k0Var.c) == null || (vVar = l0Var.d) == null || (gVar2 = vVar.n) == null || (list6 = gVar2.c) == null) ? false : !list6.isEmpty());
            case 22:
                j0 j0Var2 = (j0) obj;
                k71.k.g(j0Var2, "data");
                k0 k0Var2 = j0Var2.a;
                if (k0Var2 == null || (l0Var2 = k0Var2.c) == null || (vVar2 = l0Var2.d) == null || (gVar3 = vVar2.n) == null || (oVar = gVar3.b) == null) {
                    return null;
                }
                return new x01.i(oVar.c, oVar.a, !oVar.b);
            case 23:
                j0 j0Var3 = (j0) obj;
                k71.k.g(j0Var3, "data");
                k0 k0Var3 = j0Var3.a;
                List list24 = (k0Var3 == null || (l0Var3 = k0Var3.c) == null || (vVar3 = l0Var3.d) == null || (gVar4 = vVar3.n) == null) ? null : gVar4.c;
                return list24 == null ? r.r : list24;
            case 24:
                j0 j0Var4 = (j0) obj;
                k71.k.g(j0Var4, "data");
                k0 k0Var4 = j0Var4.a;
                if (k0Var4 == null || (l0Var4 = k0Var4.c) == null) {
                    return null;
                }
                v vVar9 = l0Var4.d;
                h0 h0Var = l0Var4.c;
                String str37 = vVar9.a;
                n0 n0Var = l0Var4.b;
                if (n0Var == null || (m0Var2 = n0Var.b) == null || (str10 = m0Var2.a) == null) {
                    str10 = h0Var != null ? h0Var.b : "";
                }
                String str38 = h0Var != null ? h0Var.c : null;
                CheckStatusState n = u.n(vVar9.b);
                CheckConclusionState u = sy.t.u(vVar9.c);
                e c = sy.a0.c(vVar9.n, (n0Var == null || (m0Var = n0Var.b) == null) ? null : m0Var.a);
                String str39 = n0Var != null ? n0Var.a : null;
                if (str39 == null) {
                    eVar = c;
                    str11 = str37;
                    str12 = str38;
                    str13 = str10;
                    checkConclusionState = u;
                    str14 = "";
                    checkStatusState = n;
                } else {
                    checkStatusState = n;
                    eVar = c;
                    str11 = str37;
                    str12 = str38;
                    str13 = str10;
                    checkConclusionState = u;
                    str14 = str39;
                }
                return new mn.f(str11, str13, str12, checkStatusState, checkConclusionState, eVar, str14);
            case 25:
                cd0.b bVar5 = (cd0.b) obj;
                k71.k.g(bVar5, "id");
                String str40 = bVar5.a;
                aa.u0 u0Var3 = new aa.u0(100);
                String str41 = bVar5.b;
                return new rc0.o1(str40, u0Var3, str41 == null ? aa.t0.d : new aa.u0(str41), new aa.u0(Boolean.valueOf(str41 != null)));
            case 26:
                cd0.b bVar6 = (cd0.b) obj;
                k71.k.g(bVar6, "id");
                String str42 = bVar6.a;
                aa.u0 u0Var4 = new aa.u0(100);
                String str43 = bVar6.b;
                aa1.b bVar7 = aa.t0.d;
                return new rc0.t0(str42, u0Var4, bVar7, str43 == null ? bVar7 : new aa.u0(str43), new aa.u0(Boolean.valueOf(str43 != null)));
            case 27:
                rc0.q0 q0Var = (rc0.q0) obj;
                k71.k.g(q0Var, "data");
                rc0.r0 r0Var3 = q0Var.a;
                return Boolean.valueOf((r0Var3 == null || (s0Var2 = r0Var3.c) == null || (vVar4 = s0Var2.c) == null || (gVar5 = vVar4.n) == null || (list7 = gVar5.c) == null) ? false : !list7.isEmpty());
            case 28:
                rc0.q0 q0Var2 = (rc0.q0) obj;
                k71.k.g(q0Var2, "data");
                rc0.r0 r0Var4 = q0Var2.a;
                if (r0Var4 == null || (s0Var3 = r0Var4.c) == null || (vVar5 = s0Var3.c) == null || (gVar6 = vVar5.n) == null || (oVar2 = gVar6.b) == null) {
                    return null;
                }
                return new x01.i(oVar2.c, oVar2.a, !oVar2.b);
            default:
                rc0.q0 q0Var3 = (rc0.q0) obj;
                k71.k.g(q0Var3, "data");
                rc0.r0 r0Var5 = q0Var3.a;
                List list25 = (r0Var5 == null || (s0Var4 = r0Var5.c) == null || (vVar6 = s0Var4.c) == null || (gVar7 = vVar6.n) == null) ? null : gVar7.c;
                return list25 == null ? r.r : list25;
        }
    }
}
