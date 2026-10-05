package pl0;

import com.github.service.models.response.Avatar;
import com.google.android.gms.internal.measurement.d5;
import gn0.j6;
import gn0.jr;
import gn0.kw;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import m7.y;
import oj0.a1;
import oj0.f1;
import oj0.q3;
import oj0.r0;
import oj0.s0;
import oj0.t0;
import oj0.w0;
import oj0.x0;
import oj0.z0;
import oj0.z3;
import sy.f0;
import ub.a;
import x61.r;
import yz0.e8;
import yz0.l2;
import yz0.l4;
import yz0.t7;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01fc A[LOOP:0: B:45:0x01fa->B:46:0x01fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p01.j a(f1 f1Var) {
        String str;
        boolean z;
        int i;
        int i2;
        ud0.c cVar;
        HashSet hashSet;
        ub.a aVar;
        ud0.c cVar2;
        a.b bVar;
        s0 s0Var;
        String str2;
        l2 l2Var;
        x0 x0Var;
        String str3;
        p01.e eVar;
        r0 r0Var;
        p01.e eVar2;
        String str4;
        l2 l2Var2;
        p01.d dVar;
        int size;
        int i3;
        List<z3> list;
        boolean z2;
        r rVar;
        String str5;
        String str6;
        String str7 = f1Var.b;
        String str8 = f1Var.x;
        q3 q3Var = f1Var.U;
        w0 w0Var = f1Var.s;
        ud0.c cVar3 = w0Var.d;
        String str9 = w0Var.c;
        String str10 = f1Var.r;
        String str11 = f1Var.y;
        String str12 = f1Var.A;
        String str13 = str12 == null ? "" : str12;
        z0 z0Var = f1Var.v;
        if (z0Var == null || (str = z0Var.a) == null) {
            str = "";
        }
        String str14 = (z0Var == null || (str6 = z0Var.b) == null) ? "" : str6;
        Avatar O = b41.b.O(cVar3);
        int i4 = q3Var.c;
        int i5 = f1Var.F.a;
        int i6 = f1Var.q.a;
        int i7 = f1Var.t.a;
        int i8 = f1Var.g;
        int i9 = f1Var.d;
        boolean z3 = f1Var.k;
        boolean z4 = f1Var.l;
        boolean z5 = f1Var.m;
        boolean z6 = f1Var.p;
        String str15 = f1Var.j;
        String str16 = str15 != null ? str15 : "";
        a1 a1Var = f1Var.u;
        if (a1Var != null) {
            z = z6;
            i = i4;
            i2 = a1Var.a;
        } else {
            z = z6;
            i = i4;
            i2 = 0;
        }
        boolean z7 = f1Var.h;
        ek0.b bVar2 = f1Var.R;
        kw kwVar = bVar2.c;
        int i10 = i;
        ub.a aVar2 = a.e.a;
        if (kwVar != null) {
            int ordinal = kwVar.ordinal();
            if (ordinal == 0) {
                ek0.a aVar3 = bVar2.e;
                List list2 = aVar3 != null ? aVar3.a : null;
                if (list2 != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        int ordinal2 = ((j6) it.next()).ordinal();
                        if (ordinal2 != 0) {
                            cVar2 = cVar3;
                            if (ordinal2 == 1) {
                                bVar = a.b.r;
                            } else if (ordinal2 == 2) {
                                bVar = a.b.s;
                            } else if (ordinal2 == 3) {
                                bVar = a.b.t;
                            } else if (ordinal2 == 4) {
                                bVar = a.b.v;
                            } else {
                                if (ordinal2 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar = null;
                            }
                        } else {
                            cVar2 = cVar3;
                            bVar = a.b.u;
                        }
                        if (bVar != null) {
                            arrayList.add(bVar);
                        }
                        cVar3 = cVar2;
                        it = it2;
                    }
                    cVar = cVar3;
                    hashSet = x61.m.D0(arrayList);
                } else {
                    cVar = cVar3;
                    hashSet = new HashSet();
                }
                aVar = new a.a(hashSet);
                boolean z8 = q3Var.d;
                t7 t7Var = new t7(str10, str7, str9, b41.b.O(cVar), new wl0.j(f1Var.Q), str8);
                s0Var = f1Var.G;
                if (s0Var != null) {
                }
                boolean z9 = f1Var.o;
                boolean z10 = f1Var.H;
                int i12 = f1Var.I;
                boolean z12 = f1Var.n;
                x0Var = f1Var.J;
                if (x0Var != null) {
                }
                int i13 = f1Var.K.a;
                r0Var = f1Var.L;
                if (r0Var != null) {
                }
                boolean z13 = f1Var.M;
                boolean z14 = f1Var.N;
                ArrayList arrayList2 = f1Var.S.a;
                p01.d dVar2 = dVar;
                ArrayList arrayList3 = new ArrayList(x61.n.F(arrayList2, 10));
                size = arrayList2.size();
                i3 = 0;
                while (i3 < size) {
                }
                boolean z15 = z14;
                boolean z16 = f1Var.B;
                boolean z17 = f1Var.C;
                boolean z18 = f1Var.O;
                t0 t0Var = f1Var.P;
                if (t0Var != null) {
                }
                list = f1Var.T.b.a;
                if (list != null) {
                }
                boolean z19 = f1Var.i;
                r rVar2 = rVar;
                jr jrVar = f1Var.E;
                if (jrVar == null) {
                }
                if (r1 != 1) {
                }
                p01.g a = b91.g.a(f1Var);
                ub.a aVar4 = aVar;
                l2 l2Var3 = l2Var2;
                boolean z20 = z2;
                p01.g a2 = b91.g.a(f1Var);
                Integer num = f1Var.c;
                return new p01.j(str2, str11, str13, str, str14, str4, O, i10, i5, i6, i7, 0, i8, i9, z3, z4, z5, str16, str8, i2, str3, num != null ? num.intValue() : 0, z7, aVar4, z8, t7Var, l2Var3, z9, z, z10, i12, z12, false, eVar2, i13, dVar2, z13, z15, arrayList3, z16, z20, z18, r4, rVar2, z19, r28, a, a2, null, false);
            }
            if (ordinal == 1) {
                aVar2 = a.c.a;
            } else {
                if (ordinal == 2) {
                    aVar = new a.a(f0.j(new a.b[]{a.b.t}));
                    cVar = cVar3;
                    boolean z82 = q3Var.d;
                    t7 t7Var2 = new t7(str10, str7, str9, b41.b.O(cVar), new wl0.j(f1Var.Q), str8);
                    s0Var = f1Var.G;
                    if (s0Var != null) {
                        wg0.a aVar5 = s0Var.c;
                        String str17 = aVar5.b;
                        str2 = str10;
                        if (str17 == null || str17.equals("NOASSERTION")) {
                            str17 = aVar5.a;
                        }
                        l2Var = new l2(str17);
                    } else {
                        str2 = str10;
                        l2Var = null;
                    }
                    boolean z92 = f1Var.o;
                    boolean z102 = f1Var.H;
                    int i122 = f1Var.I;
                    boolean z122 = f1Var.n;
                    x0Var = f1Var.J;
                    if (x0Var != null) {
                        str3 = str7;
                        eVar = new p01.e(x0Var.c.b, x0Var.b);
                    } else {
                        str3 = str7;
                        eVar = null;
                    }
                    int i132 = f1Var.K.a;
                    r0Var = f1Var.L;
                    if (r0Var != null) {
                        String str18 = r0Var.b;
                        eVar2 = eVar;
                        String str19 = r0Var.c;
                        if (str18 == null || t71.p.T(str18)) {
                            str4 = str9;
                            str5 = str19;
                        } else {
                            str4 = str9;
                            str5 = str18;
                        }
                        l2Var2 = l2Var;
                        ZonedDateTime zonedDateTime = r0Var.d;
                        if (zonedDateTime == null) {
                            zonedDateTime = r0Var.e;
                        }
                        dVar = new p01.d(str5, str19, zonedDateTime);
                    } else {
                        eVar2 = eVar;
                        str4 = str9;
                        l2Var2 = l2Var;
                        dVar = null;
                    }
                    boolean z132 = f1Var.M;
                    boolean z142 = f1Var.N;
                    ArrayList arrayList22 = f1Var.S.a;
                    p01.d dVar22 = dVar;
                    ArrayList arrayList32 = new ArrayList(x61.n.F(arrayList22, 10));
                    size = arrayList22.size();
                    i3 = 0;
                    while (i3 < size) {
                        int i14 = size;
                        wk0.t0 t0Var2 = (wk0.t0) arrayList22.get(i3);
                        boolean z22 = z142;
                        l4 w = d5.w(t0Var2.c.c);
                        wk0.s0 s0Var2 = t0Var2.c;
                        arrayList32.add(new yz0.x0(w, s0Var2.c.f, s0Var2.b));
                        i3++;
                        size = i14;
                        z142 = z22;
                        arrayList22 = arrayList22;
                    }
                    boolean z152 = z142;
                    boolean z162 = f1Var.B;
                    boolean z172 = f1Var.C;
                    boolean z182 = f1Var.O;
                    t0 t0Var3 = f1Var.P;
                    i01.a N = t0Var3 != null ? y.N(t0Var3.c) : null;
                    list = f1Var.T.b.a;
                    if (list != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (z3 z3Var : list) {
                            boolean z23 = z172;
                            e8 a0 = z3Var != null ? k41.b.a0(z3Var.c) : null;
                            if (a0 != null) {
                                arrayList4.add(a0);
                            }
                            z172 = z23;
                        }
                        z2 = z172;
                        rVar = arrayList4;
                    } else {
                        z2 = z172;
                        rVar = r.r;
                    }
                    boolean z192 = f1Var.i;
                    r rVar22 = rVar;
                    jr jrVar2 = f1Var.E;
                    int i15 = jrVar2 == null ? -1 : zl0.a.a[jrVar2.ordinal()];
                    boolean z24 = i15 != 1 || i15 == 2;
                    p01.g a3 = b91.g.a(f1Var);
                    ub.a aVar42 = aVar;
                    l2 l2Var32 = l2Var2;
                    boolean z202 = z2;
                    p01.g a22 = b91.g.a(f1Var);
                    Integer num2 = f1Var.c;
                    return new p01.j(str2, str11, str13, str, str14, str4, O, i10, i5, i6, i7, 0, i8, i9, z3, z4, z5, str16, str8, i2, str3, num2 != null ? num2.intValue() : 0, z7, aVar42, z82, t7Var2, l2Var32, z92, z, z102, i122, z122, false, eVar2, i132, dVar22, z132, z152, arrayList32, z162, z202, z182, N, rVar22, z192, z24, a3, a22, null, false);
                }
                if (ordinal == 3) {
                    aVar2 = a.d.a;
                } else if (ordinal != 4 && ordinal != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        aVar = aVar2;
        cVar = cVar3;
        boolean z822 = q3Var.d;
        t7 t7Var22 = new t7(str10, str7, str9, b41.b.O(cVar), new wl0.j(f1Var.Q), str8);
        s0Var = f1Var.G;
        if (s0Var != null) {
        }
        boolean z922 = f1Var.o;
        boolean z1022 = f1Var.H;
        int i1222 = f1Var.I;
        boolean z1222 = f1Var.n;
        x0Var = f1Var.J;
        if (x0Var != null) {
        }
        int i1322 = f1Var.K.a;
        r0Var = f1Var.L;
        if (r0Var != null) {
        }
        boolean z1322 = f1Var.M;
        boolean z1422 = f1Var.N;
        ArrayList arrayList222 = f1Var.S.a;
        p01.d dVar222 = dVar;
        ArrayList arrayList322 = new ArrayList(x61.n.F(arrayList222, 10));
        size = arrayList222.size();
        i3 = 0;
        while (i3 < size) {
        }
        boolean z1522 = z1422;
        boolean z1622 = f1Var.B;
        boolean z1722 = f1Var.C;
        boolean z1822 = f1Var.O;
        t0 t0Var32 = f1Var.P;
        if (t0Var32 != null) {
        }
        list = f1Var.T.b.a;
        if (list != null) {
        }
        boolean z1922 = f1Var.i;
        r rVar222 = rVar;
        jr jrVar22 = f1Var.E;
        if (jrVar22 == null) {
        }
        if (i15 != 1) {
        }
        p01.g a32 = b91.g.a(f1Var);
        ub.a aVar422 = aVar;
        l2 l2Var322 = l2Var2;
        boolean z2022 = z2;
        p01.g a222 = b91.g.a(f1Var);
        Integer num22 = f1Var.c;
        return new p01.j(str2, str11, str13, str, str14, str4, O, i10, i5, i6, i7, 0, i8, i9, z3, z4, z5, str16, str8, i2, str3, num22 != null ? num22.intValue() : 0, z7, aVar422, z822, t7Var22, l2Var322, z922, z, z1022, i1222, z1222, false, eVar2, i1322, dVar222, z1322, z1522, arrayList322, z1622, z2022, z1822, N, rVar222, z1922, z24, a32, a222, null, false);
    }
}
