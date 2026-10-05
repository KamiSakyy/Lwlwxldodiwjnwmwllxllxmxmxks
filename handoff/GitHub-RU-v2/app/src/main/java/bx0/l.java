package bx0;

import com.github.service.models.response.Avatar;
import com.google.android.gms.internal.measurement.d5;
import fw0.s0;
import fw0.t0;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import m7.y;
import pz0.e7;
import pz0.f40;
import pz0.py;
import sy.f0;
import ub.a;
import uu0.c2;
import uu0.d2;
import uu0.i2;
import uu0.n6;
import uu0.s1;
import uu0.t1;
import uu0.u1;
import uu0.u4;
import uu0.v1;
import uu0.y1;
import uu0.z1;
import w8.s;
import x61.r;
import yz0.e8;
import yz0.l2;
import yz0.l4;
import yz0.t7;
import yz0.x0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0209 A[LOOP:0: B:45:0x0207->B:46:0x0209, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p01.j a(i2 i2Var) {
        String str;
        Avatar avatar;
        String str2;
        int i;
        cp0.g gVar;
        HashSet hashSet;
        ub.a aVar;
        cp0.g gVar2;
        a.b bVar;
        t1 t1Var;
        String str3;
        l2 l2Var;
        z1 z1Var;
        String str4;
        p01.e eVar;
        s1 s1Var;
        p01.e eVar2;
        String str5;
        l2 l2Var2;
        p01.d dVar;
        int size;
        int i2;
        List<n6> list;
        boolean z;
        r rVar;
        List list2;
        v1 v1Var;
        String str6;
        String str7;
        String str8 = i2Var.b;
        String str9 = i2Var.y;
        u4 u4Var = i2Var.X;
        y1 y1Var = i2Var.t;
        cp0.g gVar3 = y1Var.d;
        String str10 = y1Var.c;
        String str11 = i2Var.s;
        String str12 = i2Var.z;
        String str13 = i2Var.B;
        String str14 = str13 == null ? "" : str13;
        c2 c2Var = i2Var.w;
        if (c2Var == null || (str = c2Var.a) == null) {
            str = "";
        }
        String str15 = (c2Var == null || (str7 = c2Var.b) == null) ? "" : str7;
        Avatar L = y.L(gVar3);
        int i3 = u4Var.c;
        int i4 = i2Var.G.a;
        int i5 = i2Var.r.a;
        int i6 = i2Var.u.a;
        int i7 = i2Var.R.a;
        int i8 = i2Var.g;
        int i9 = i2Var.d;
        boolean z2 = i2Var.k;
        boolean z3 = i2Var.l;
        boolean z4 = i2Var.m;
        boolean z5 = i2Var.q;
        String str16 = i2Var.j;
        String str17 = str16 != null ? str16 : "";
        d2 d2Var = i2Var.v;
        if (d2Var != null) {
            avatar = L;
            str2 = str17;
            i = d2Var.a;
        } else {
            avatar = L;
            str2 = str17;
            i = 0;
        }
        boolean z6 = i2Var.h;
        nv0.b bVar2 = i2Var.U;
        f40 f40Var = bVar2.c;
        String str18 = null;
        ub.a aVar2 = a.e.a;
        if (f40Var != null) {
            int ordinal = f40Var.ordinal();
            if (ordinal == 0) {
                nv0.a aVar3 = bVar2.e;
                List list3 = aVar3 != null ? aVar3.a : null;
                if (list3 != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        int ordinal2 = ((e7) it.next()).ordinal();
                        if (ordinal2 != 0) {
                            gVar2 = gVar3;
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
                            gVar2 = gVar3;
                            bVar = a.b.u;
                        }
                        if (bVar != null) {
                            arrayList.add(bVar);
                        }
                        gVar3 = gVar2;
                        it = it2;
                    }
                    gVar = gVar3;
                    hashSet = x61.m.D0(arrayList);
                } else {
                    gVar = gVar3;
                    hashSet = new HashSet();
                }
                aVar = new a.a(hashSet);
                boolean z7 = u4Var.d;
                t7 t7Var = new t7(str11, str8, str10, y.L(gVar), new kx0.j(i2Var.T), str9);
                t1Var = i2Var.H;
                if (t1Var != null) {
                }
                boolean z8 = i2Var.p;
                boolean z9 = i2Var.I;
                int i10 = i2Var.J;
                boolean z10 = i2Var.n;
                boolean z12 = i2Var.o;
                z1Var = i2Var.K;
                if (z1Var != null) {
                }
                int i12 = i2Var.L.a;
                s1Var = i2Var.M;
                if (s1Var != null) {
                }
                boolean z13 = i2Var.N;
                boolean z14 = i2Var.O;
                ArrayList arrayList2 = i2Var.V.a;
                p01.d dVar2 = dVar;
                ArrayList arrayList3 = new ArrayList(x61.n.F(arrayList2, 10));
                size = arrayList2.size();
                i2 = 0;
                while (i2 < size) {
                }
                boolean z15 = z14;
                boolean z16 = i2Var.C;
                boolean z17 = i2Var.D;
                boolean z18 = i2Var.P;
                u1 u1Var = i2Var.Q;
                if (u1Var != null) {
                }
                list = i2Var.W.b.a;
                if (list != null) {
                }
                boolean z19 = i2Var.i;
                r rVar2 = rVar;
                py pyVar = i2Var.F;
                if (pyVar == null) {
                }
                if (r1 != 1) {
                }
                p01.g b = s.b(i2Var);
                p01.g b2 = s.b(i2Var);
                Integer num = i2Var.c;
                if (num != null) {
                }
                list2 = i2Var.S.a;
                if (list2 != null) {
                    str18 = v1Var.b;
                }
                return new p01.j(str3, str12, str14, str, str15, str5, avatar, i3, i4, i5, i6, i7, i8, i9, z2, z3, z4, str2, str9, i, str4, r2, z6, aVar, z7, t7Var, l2Var2, z8, z5, z9, i10, z10, z12, eVar2, i12, dVar2, z13, z15, arrayList3, z16, z, z18, r4, rVar2, z19, r49, b, b2, str18, false);
            }
            if (ordinal == 1) {
                aVar2 = a.c.a;
            } else {
                if (ordinal == 2) {
                    aVar = new a.a(f0.j(new a.b[]{a.b.t}));
                    gVar = gVar3;
                    boolean z72 = u4Var.d;
                    t7 t7Var2 = new t7(str11, str8, str10, y.L(gVar), new kx0.j(i2Var.T), str9);
                    t1Var = i2Var.H;
                    if (t1Var != null) {
                        gs0.a aVar4 = t1Var.c;
                        String str19 = aVar4.b;
                        str3 = str11;
                        if (str19 == null || str19.equals("NOASSERTION")) {
                            str19 = aVar4.a;
                        }
                        l2Var = new l2(str19);
                    } else {
                        str3 = str11;
                        l2Var = null;
                    }
                    boolean z82 = i2Var.p;
                    boolean z92 = i2Var.I;
                    int i102 = i2Var.J;
                    boolean z102 = i2Var.n;
                    boolean z122 = i2Var.o;
                    z1Var = i2Var.K;
                    if (z1Var != null) {
                        str4 = str8;
                        eVar = new p01.e(z1Var.c.b, z1Var.b);
                    } else {
                        str4 = str8;
                        eVar = null;
                    }
                    int i122 = i2Var.L.a;
                    s1Var = i2Var.M;
                    if (s1Var != null) {
                        String str20 = s1Var.b;
                        eVar2 = eVar;
                        String str21 = s1Var.c;
                        if (str20 == null || t71.p.T(str20)) {
                            str5 = str10;
                            str6 = str21;
                        } else {
                            str5 = str10;
                            str6 = str20;
                        }
                        l2Var2 = l2Var;
                        ZonedDateTime zonedDateTime = s1Var.d;
                        if (zonedDateTime == null) {
                            zonedDateTime = s1Var.e;
                        }
                        dVar = new p01.d(str6, str21, zonedDateTime);
                    } else {
                        eVar2 = eVar;
                        str5 = str10;
                        l2Var2 = l2Var;
                        dVar = null;
                    }
                    boolean z132 = i2Var.N;
                    boolean z142 = i2Var.O;
                    ArrayList arrayList22 = i2Var.V.a;
                    p01.d dVar22 = dVar;
                    ArrayList arrayList32 = new ArrayList(x61.n.F(arrayList22, 10));
                    size = arrayList22.size();
                    i2 = 0;
                    while (i2 < size) {
                        int i13 = size;
                        t0 t0Var = (t0) arrayList22.get(i2);
                        boolean z20 = z142;
                        l4 m = aa1.b.m(t0Var.c.c);
                        s0 s0Var = t0Var.c;
                        arrayList32.add(new x0(m, s0Var.c.f, s0Var.b));
                        i2++;
                        size = i13;
                        z142 = z20;
                        arrayList22 = arrayList22;
                    }
                    boolean z152 = z142;
                    boolean z162 = i2Var.C;
                    boolean z172 = i2Var.D;
                    boolean z182 = i2Var.P;
                    u1 u1Var2 = i2Var.Q;
                    i01.a c0 = u1Var2 != null ? d5.c0(u1Var2.c) : null;
                    list = i2Var.W.b.a;
                    if (list != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (n6 n6Var : list) {
                            boolean z22 = z172;
                            e8 Z = n6Var != null ? com.google.common.util.concurrent.a.Z(n6Var.c) : null;
                            if (Z != null) {
                                arrayList4.add(Z);
                            }
                            z172 = z22;
                        }
                        z = z172;
                        rVar = arrayList4;
                    } else {
                        z = z172;
                        rVar = r.r;
                    }
                    boolean z192 = i2Var.i;
                    r rVar22 = rVar;
                    py pyVar2 = i2Var.F;
                    int i14 = pyVar2 == null ? -1 : nx0.a.a[pyVar2.ordinal()];
                    boolean z23 = i14 != 1 || i14 == 2;
                    p01.g b3 = s.b(i2Var);
                    p01.g b22 = s.b(i2Var);
                    Integer num2 = i2Var.c;
                    int intValue = num2 != null ? num2.intValue() : 0;
                    list2 = i2Var.S.a;
                    if (list2 != null && (v1Var = (v1) x61.m.W(list2)) != null) {
                        str18 = v1Var.b;
                    }
                    return new p01.j(str3, str12, str14, str, str15, str5, avatar, i3, i4, i5, i6, i7, i8, i9, z2, z3, z4, str2, str9, i, str4, intValue, z6, aVar, z72, t7Var2, l2Var2, z82, z5, z92, i102, z102, z122, eVar2, i122, dVar22, z132, z152, arrayList32, z162, z, z182, c0, rVar22, z192, z23, b3, b22, str18, false);
                }
                if (ordinal == 3) {
                    aVar2 = a.d.a;
                } else if (ordinal != 4 && ordinal != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        aVar = aVar2;
        gVar = gVar3;
        boolean z722 = u4Var.d;
        t7 t7Var22 = new t7(str11, str8, str10, y.L(gVar), new kx0.j(i2Var.T), str9);
        t1Var = i2Var.H;
        if (t1Var != null) {
        }
        boolean z822 = i2Var.p;
        boolean z922 = i2Var.I;
        int i1022 = i2Var.J;
        boolean z1022 = i2Var.n;
        boolean z1222 = i2Var.o;
        z1Var = i2Var.K;
        if (z1Var != null) {
        }
        int i1222 = i2Var.L.a;
        s1Var = i2Var.M;
        if (s1Var != null) {
        }
        boolean z1322 = i2Var.N;
        boolean z1422 = i2Var.O;
        ArrayList arrayList222 = i2Var.V.a;
        p01.d dVar222 = dVar;
        ArrayList arrayList322 = new ArrayList(x61.n.F(arrayList222, 10));
        size = arrayList222.size();
        i2 = 0;
        while (i2 < size) {
        }
        boolean z1522 = z1422;
        boolean z1622 = i2Var.C;
        boolean z1722 = i2Var.D;
        boolean z1822 = i2Var.P;
        u1 u1Var22 = i2Var.Q;
        if (u1Var22 != null) {
        }
        list = i2Var.W.b.a;
        if (list != null) {
        }
        boolean z1922 = i2Var.i;
        r rVar222 = rVar;
        py pyVar22 = i2Var.F;
        if (pyVar22 == null) {
        }
        if (i14 != 1) {
        }
        p01.g b32 = s.b(i2Var);
        p01.g b222 = s.b(i2Var);
        Integer num22 = i2Var.c;
        if (num22 != null) {
        }
        list2 = i2Var.S.a;
        if (list2 != null) {
        }
        return new p01.j(str3, str12, str14, str, str15, str5, avatar, i3, i4, i5, i6, i7, i8, i9, z2, z3, z4, str2, str9, i, str4, intValue, z6, aVar, z722, t7Var22, l2Var2, z822, z5, z922, i1022, z1022, z1222, eVar2, i1222, dVar222, z1322, z1522, arrayList322, z1622, z, z1822, c0, rVar222, z1922, z23, b32, b222, str18, false);
    }
}
