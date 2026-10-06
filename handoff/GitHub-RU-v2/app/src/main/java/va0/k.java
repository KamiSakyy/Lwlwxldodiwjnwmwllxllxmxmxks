package va0;

import com.github.service.models.response.Avatar;
import ea0.s0;
import hc0.ev;
import hc0.fq;
import hc0.z5;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import sy.e0;
import sy.f0;
import t.q;
import t.z;
import ub.a;
import w80.c1;
import w80.m3;
import w80.p0;
import w80.q0;
import w80.t0;
import w80.u0;
import w80.u3;
import w80.w0;
import w80.x0;
import x61.r;
import yz0.e8;
import yz0.l2;
import yz0.l4;
import yz0.t7;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    /* JADX WARN: Removed duplicated region for block: B:24:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01fc A[LOOP:0: B:45:0x01fa->B:46:0x01fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p01.j a(c1 c1Var) {
        String str;
        boolean z;
        int i;
        int i2;
        e30.c cVar;
        HashSet hashSet;
        ub.a aVar;
        e30.c cVar2;
        a.b bVar;
        q0 q0Var;
        String str2;
        l2 l2Var;
        u0 u0Var;
        String str3;
        p01.e eVar;
        p0 p0Var;
        p01.e eVar2;
        String str4;
        l2 l2Var2;
        p01.d dVar;
        int size;
        int i3;
        List<u3> list;
        boolean z2;
        ArrayList arrayList;
        int i4;
        int i5;
        boolean z3;
        String str5;
        String str6;
        String str7 = c1Var.b;
        String str8 = c1Var.x;
        m3 m3Var = c1Var.T;
        t0 t0Var = c1Var.s;
        e30.c cVar3 = t0Var.d;
        String str9 = t0Var.c;
        String str10 = c1Var.r;
        String str11 = c1Var.y;
        String str12 = c1Var.A;
        String str13 = str12 == null ? "" : str12;
        w0 w0Var = c1Var.v;
        if (w0Var == null || (str = w0Var.a) == null) {
            str = "";
        }
        String str14 = (w0Var == null || (str6 = w0Var.b) == null) ? "" : str6;
        Avatar q = q.q(cVar3);
        int i6 = m3Var.c;
        int i7 = c1Var.F.a;
        int i8 = c1Var.q.a;
        int i9 = c1Var.t.a;
        int i11 = c1Var.g;
        int i12 = c1Var.d;
        boolean z4 = c1Var.k;
        boolean z5 = c1Var.l;
        boolean z6 = c1Var.m;
        boolean z7 = c1Var.p;
        String str15 = c1Var.j;
        String str16 = str15 != null ? str15 : "";
        x0 x0Var = c1Var.u;
        if (x0Var != null) {
            z = z7;
            i = i6;
            i2 = x0Var.a;
        } else {
            z = z7;
            i = i6;
            i2 = 0;
        }
        boolean z8 = c1Var.h;
        m90.b bVar2 = c1Var.Q;
        ev evVar = bVar2.c;
        int i13 = i;
        ub.a aVar2 = a.e.a;
        if (evVar != null) {
            int ordinal = evVar.ordinal();
            if (ordinal == 0) {
                m90.a aVar3 = bVar2.e;
                List list2 = aVar3 != null ? aVar3.a : null;
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        int ordinal2 = ((z5) it.next()).ordinal();
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
                            arrayList2.add(bVar);
                        }
                        cVar3 = cVar2;
                        it = it2;
                    }
                    cVar = cVar3;
                    hashSet = x61.m.D0(arrayList2);
                } else {
                    cVar = cVar3;
                    hashSet = new HashSet();
                }
                aVar = new a.a(hashSet);
                boolean z9 = m3Var.d;
                t7 t7Var = new t7(str10, str7, str9, q.q(cVar), new bb0.j(c1Var.P), str8);
                q0Var = c1Var.G;
                if (q0Var != null) {
                }
                boolean z11 = c1Var.o;
                boolean z12 = c1Var.H;
                int i14 = c1Var.I;
                boolean z13 = c1Var.n;
                u0Var = c1Var.J;
                if (u0Var != null) {
                }
                int i15 = c1Var.K.a;
                p0Var = c1Var.L;
                if (p0Var != null) {
                }
                boolean z14 = c1Var.M;
                boolean z15 = c1Var.N;
                ArrayList arrayList3 = c1Var.R.a;
                p01.d dVar2 = dVar;
                ArrayList arrayList4 = new ArrayList(x61.n.F(arrayList3, 10));
                size = arrayList3.size();
                i3 = 0;
                while (i3 < size) {
                }
                boolean z16 = z15;
                boolean z17 = c1Var.B;
                boolean z18 = c1Var.C;
                boolean z19 = c1Var.O;
                list = c1Var.S.b.a;
                if (list != null) {
                }
                boolean z20 = c1Var.i;
                fq fqVar = c1Var.E;
                if (fqVar == null) {
                }
                ArrayList arrayList5 = arrayList;
                if (i4 != 1) {
                }
                i5 = 0;
                z3 = true;
                ub.a aVar4 = aVar;
                l2 l2Var3 = l2Var2;
                boolean z21 = z2;
                p01.g a = e0.a(c1Var);
                p01.g a2 = e0.a(c1Var);
                Integer num = c1Var.c;
                return new p01.j(str2, str11, str13, str, str14, str4, q, i13, i7, i8, i9, 0, i11, i12, z4, z5, z6, str16, str8, i2, str3, num != null ? num.intValue() : i5, z8, aVar4, z9, t7Var, l2Var3, z11, z, z12, i14, z13, false, eVar2, i15, dVar2, z14, z16, arrayList4, z17, z21, z19, (i01.a) null, arrayList5, z20, z3, a, a2, (String) null, false);
            }
            if (ordinal == 1) {
                aVar2 = a.c.a;
            } else {
                if (ordinal == 2) {
                    aVar = new a.a(f0.j(a.b.t));
                    cVar = cVar3;
                    boolean z92 = m3Var.d;
                    t7 t7Var2 = new t7(str10, str7, str9, q.q(cVar), new bb0.j(c1Var.P), str8);
                    q0Var = c1Var.G;
                    if (q0Var != null) {
                        g60.a aVar5 = q0Var.c;
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
                    boolean z112 = c1Var.o;
                    boolean z122 = c1Var.H;
                    int i142 = c1Var.I;
                    boolean z132 = c1Var.n;
                    u0Var = c1Var.J;
                    if (u0Var != null) {
                        str3 = str7;
                        eVar = new p01.e(u0Var.c.b, u0Var.b);
                    } else {
                        str3 = str7;
                        eVar = null;
                    }
                    int i152 = c1Var.K.a;
                    p0Var = c1Var.L;
                    if (p0Var != null) {
                        String str18 = p0Var.b;
                        eVar2 = eVar;
                        String str19 = p0Var.c;
                        if (str18 == null || t71.p.T(str18)) {
                            str4 = str9;
                            str5 = str19;
                        } else {
                            str4 = str9;
                            str5 = str18;
                        }
                        l2Var2 = l2Var;
                        ZonedDateTime zonedDateTime = p0Var.d;
                        if (zonedDateTime == null) {
                            zonedDateTime = p0Var.e;
                        }
                        dVar = new p01.d(str5, str19, zonedDateTime);
                    } else {
                        eVar2 = eVar;
                        str4 = str9;
                        l2Var2 = l2Var;
                        dVar = null;
                    }
                    boolean z142 = c1Var.M;
                    boolean z152 = c1Var.N;
                    ArrayList arrayList32 = c1Var.R.a;
                    p01.d dVar22 = dVar;
                    ArrayList arrayList42 = new ArrayList(x61.n.F(arrayList32, 10));
                    size = arrayList32.size();
                    i3 = 0;
                    while (i3 < size) {
                        int i16 = size;
                        ea0.t0 t0Var2 = (ea0.t0) arrayList32.get(i3);
                        boolean z22 = z152;
                        l4 d = z.d(t0Var2.c.c);
                        s0 s0Var = t0Var2.c;
                        arrayList42.add(new yz0.x0(d, s0Var.c.f, s0Var.b));
                        i3++;
                        size = i16;
                        z152 = z22;
                        arrayList32 = arrayList32;
                    }
                    boolean z162 = z152;
                    boolean z172 = c1Var.B;
                    boolean z182 = c1Var.C;
                    boolean z192 = c1Var.O;
                    list = c1Var.S.b.a;
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (u3 u3Var : list) {
                            boolean z23 = z182;
                            e8 p = u3Var != null ? sy.q.pShadow(u3Var.c) : null;
                            if (p != null) {
                                arrayList.add(p);
                            }
                            z182 = z23;
                        }
                        z2 = z182;
                    } else {
                        z2 = z182;
                        arrayList = r.r;
                    }
                    boolean z202 = c1Var.i;
                    fq fqVar2 = c1Var.E;
                    i4 = fqVar2 == null ? -1 : eb0.a.a[fqVar2.ordinal()];
                    ArrayList arrayList52 = arrayList;
                    if (i4 != 1 || i4 == 2) {
                        i5 = 0;
                        z3 = true;
                    } else {
                        i5 = 0;
                        z3 = false;
                    }
                    ub.a aVar42 = aVar;
                    l2 l2Var32 = l2Var2;
                    boolean z212 = z2;
                    p01.g a3 = e0.a(c1Var);
                    p01.g a22 = e0.a(c1Var);
                    Integer num2 = c1Var.c;
                    return new p01.j(str2, str11, str13, str, str14, str4, q, i13, i7, i8, i9, 0, i11, i12, z4, z5, z6, str16, str8, i2, str3, num2 != null ? num2.intValue() : i5, z8, aVar42, z92, t7Var2, l2Var32, z112, z, z122, i142, z132, false, eVar2, i152, dVar22, z142, z162, arrayList42, z172, z212, z192, (i01.a) null, arrayList52, z202, z3, a3, a22, (String) null, false);
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
        boolean z922 = m3Var.d;
        t7 t7Var22 = new t7(str10, str7, str9, q.q(cVar), new bb0.j(c1Var.P), str8);
        q0Var = c1Var.G;
        if (q0Var != null) {
        }
        boolean z1122 = c1Var.o;
        boolean z1222 = c1Var.H;
        int i1422 = c1Var.I;
        boolean z1322 = c1Var.n;
        u0Var = c1Var.J;
        if (u0Var != null) {
        }
        int i1522 = c1Var.K.a;
        p0Var = c1Var.L;
        if (p0Var != null) {
        }
        boolean z1422 = c1Var.M;
        boolean z1522 = c1Var.N;
        ArrayList arrayList322 = c1Var.R.a;
        p01.d dVar222 = dVar;
        ArrayList arrayList422 = new ArrayList(x61.n.F(arrayList322, 10));
        size = arrayList322.size();
        i3 = 0;
        while (i3 < size) {
        }
        boolean z1622 = z1522;
        boolean z1722 = c1Var.B;
        boolean z1822 = c1Var.C;
        boolean z1922 = c1Var.O;
        list = c1Var.S.b.a;
        if (list != null) {
        }
        boolean z2022 = c1Var.i;
        fq fqVar22 = c1Var.E;
        if (fqVar22 == null) {
        }
        ArrayList arrayList522 = arrayList;
        if (i4 != 1) {
        }
        i5 = 0;
        z3 = true;
        ub.a aVar422 = aVar;
        l2 l2Var322 = l2Var2;
        boolean z2122 = z2;
        p01.g a32 = e0.a(c1Var);
        p01.g a222 = e0.a(c1Var);
        Integer num22 = c1Var.c;
        return new p01.j(str2, str11, str13, str, str14, str4, q, i13, i7, i8, i9, 0, i11, i12, z4, z5, z6, str16, str8, i2, str3, num22 != null ? num22.intValue() : i5, z8, aVar422, z922, t7Var22, l2Var322, z1122, z, z1222, i1422, z1322, false, eVar2, i1522, dVar222, z1422, z1622, arrayList422, z1722, z2122, z1922, (i01.a) null, arrayList522, z2022, z3, a32, a222, (String) null, false);
    }
}
