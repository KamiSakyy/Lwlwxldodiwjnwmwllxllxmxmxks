package sy;

import com.github.service.models.response.Avatar;
import dw.a2;
import dw.b2;
import dw.e2;
import dw.f2;
import dw.j7;
import dw.k2;
import dw.o5;
import dw.u1;
import dw.v1;
import dw.w1;
import dw.x1;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import m10.ia;
import m10.n40;
import m10.ya0;
import qx.s0;
import qx.t0;
import ub.a;
import yz0.e8;
import yz0.l2;
import yz0.l4;
import yz0.t7;
import yz0.x0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    /* JADX WARN: Removed duplicated region for block: B:24:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0209 A[LOOP:0: B:45:0x0207->B:46:0x0209, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p01.j a(k2 k2Var) {
        String str;
        Avatar avatar;
        String str2;
        int i;
        eq.g gVar;
        HashSet hashSet;
        ub.a aVar;
        eq.g gVar2;
        a.b bVar;
        v1 v1Var;
        String str3;
        l2 l2Var;
        b2 b2Var;
        String str4;
        p01.e eVar;
        u1 u1Var;
        p01.e eVar2;
        String str5;
        l2 l2Var2;
        p01.d dVar;
        int size;
        int i2;
        List<j7> list;
        boolean z;
        ArrayList arrayList;
        List list2;
        x1 x1Var;
        String str6;
        String str7;
        String str8 = k2Var.b;
        String str9 = k2Var.y;
        o5 o5Var = k2Var.Y;
        a2 a2Var = k2Var.t;
        eq.g gVar3 = a2Var.d;
        String str10 = a2Var.c;
        String str11 = k2Var.s;
        String str12 = k2Var.z;
        String str13 = k2Var.B;
        String str14 = str13 == null ? "" : str13;
        e2 e2Var = k2Var.w;
        if (e2Var == null || (str = e2Var.a) == null) {
            str = "";
        }
        String str15 = (e2Var == null || (str7 = e2Var.b) == null) ? "" : str7;
        Avatar A = w8.s.A(gVar3);
        int i3 = o5Var.c;
        int i4 = k2Var.G.a;
        int i5 = k2Var.r.a;
        int i6 = k2Var.u.a;
        int i7 = k2Var.R.a;
        int i8 = k2Var.g;
        int i9 = k2Var.d;
        boolean z2 = k2Var.k;
        boolean z3 = k2Var.l;
        boolean z4 = k2Var.m;
        boolean z5 = k2Var.q;
        String str16 = k2Var.j;
        String str17 = str16 != null ? str16 : "";
        f2 f2Var = k2Var.v;
        if (f2Var != null) {
            avatar = A;
            str2 = str17;
            i = f2Var.a;
        } else {
            avatar = A;
            str2 = str17;
            i = 0;
        }
        boolean z6 = k2Var.h;
        yw.b bVar2 = k2Var.V;
        ya0 ya0Var = bVar2.c;
        String str18 = null;
        ub.a aVar2 = a.e.a;
        if (ya0Var != null) {
            int ordinal = ya0Var.ordinal();
            if (ordinal == 0) {
                yw.a aVar3 = bVar2.e;
                List list3 = aVar3 != null ? aVar3.a : null;
                if (list3 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        int ordinal2 = ((ia) it.next()).ordinal();
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
                            arrayList2.add(bVar);
                        }
                        gVar3 = gVar2;
                        it = it2;
                    }
                    gVar = gVar3;
                    hashSet = x61.m.D0(arrayList2);
                } else {
                    gVar = gVar3;
                    hashSet = new HashSet();
                }
                aVar = new a.a(hashSet);
                boolean z7 = o5Var.d;
                t7 t7Var = new t7(str11, str8, str10, w8.s.A(gVar), new fz.j(k2Var.U), str9);
                v1Var = k2Var.H;
                if (v1Var != null) {
                }
                boolean z8 = k2Var.p;
                boolean z9 = k2Var.I;
                int i11 = k2Var.J;
                boolean z11 = k2Var.n;
                boolean z12 = k2Var.o;
                b2Var = k2Var.K;
                if (b2Var != null) {
                }
                int i12 = k2Var.L.a;
                u1Var = k2Var.M;
                if (u1Var != null) {
                }
                boolean z13 = k2Var.N;
                boolean z14 = k2Var.O;
                ArrayList arrayList3 = k2Var.W.a;
                p01.d dVar2 = dVar;
                ArrayList arrayList4 = new ArrayList(x61.n.F(arrayList3, 10));
                size = arrayList3.size();
                i2 = 0;
                while (i2 < size) {
                }
                boolean z15 = z14;
                boolean z16 = k2Var.C;
                boolean z17 = k2Var.D;
                boolean z18 = k2Var.P;
                w1 w1Var = k2Var.Q;
                if (w1Var != null) {
                }
                list = k2Var.X.b.a;
                if (list != null) {
                }
                boolean z19 = k2Var.i;
                ArrayList arrayList5 = arrayList;
                n40 n40Var = k2Var.F;
                if (n40Var == null) {
                }
                if (r1 != 1) {
                }
                p01.g b = n.b(k2Var);
                p01.g b2 = n.b(k2Var);
                Integer num = k2Var.c;
                if (num != null) {
                }
                list2 = k2Var.S.a;
                if (list2 != null) {
                    str18 = x1Var.b;
                }
                return new p01.j(str3, str12, str14, str, str15, str5, avatar, i3, i4, i5, i6, i7, i8, i9, z2, z3, z4, str2, str9, i, str4, r2, z6, aVar, z7, t7Var, l2Var2, z8, z5, z9, i11, z11, z12, eVar2, i12, dVar2, z13, z15, arrayList4, z16, z, z18, r4, arrayList5, z19, r49, b, b2, str18, k71.k.b(k2Var.T, Boolean.TRUE));
            }
            if (ordinal == 1) {
                aVar2 = a.c.a;
            } else {
                if (ordinal == 2) {
                    aVar = new a.a(f0.j(a.b.t));
                    gVar = gVar3;
                    boolean z72 = o5Var.d;
                    t7 t7Var2 = new t7(str11, str8, str10, w8.s.A(gVar), new fz.j(k2Var.U), str9);
                    v1Var = k2Var.H;
                    if (v1Var != null) {
                        pt.a aVar4 = v1Var.c;
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
                    boolean z82 = k2Var.p;
                    boolean z92 = k2Var.I;
                    int i112 = k2Var.J;
                    boolean z112 = k2Var.n;
                    boolean z122 = k2Var.o;
                    b2Var = k2Var.K;
                    if (b2Var != null) {
                        str4 = str8;
                        eVar = new p01.e(b2Var.c.b, b2Var.b);
                    } else {
                        str4 = str8;
                        eVar = null;
                    }
                    int i122 = k2Var.L.a;
                    u1Var = k2Var.M;
                    if (u1Var != null) {
                        String str20 = u1Var.b;
                        eVar2 = eVar;
                        String str21 = u1Var.c;
                        if (str20 == null || t71.p.T(str20)) {
                            str5 = str10;
                            str6 = str21;
                        } else {
                            str5 = str10;
                            str6 = str20;
                        }
                        l2Var2 = l2Var;
                        ZonedDateTime zonedDateTime = u1Var.d;
                        if (zonedDateTime == null) {
                            zonedDateTime = u1Var.e;
                        }
                        dVar = new p01.d(str6, str21, zonedDateTime);
                    } else {
                        eVar2 = eVar;
                        str5 = str10;
                        l2Var2 = l2Var;
                        dVar = null;
                    }
                    boolean z132 = k2Var.N;
                    boolean z142 = k2Var.O;
                    ArrayList arrayList32 = k2Var.W.a;
                    p01.d dVar22 = dVar;
                    ArrayList arrayList42 = new ArrayList(x61.n.F(arrayList32, 10));
                    size = arrayList32.size();
                    i2 = 0;
                    while (i2 < size) {
                        int i13 = size;
                        t0 t0Var = (t0) arrayList32.get(i2);
                        boolean z20 = z142;
                        l4 l = r.l(t0Var.c.c);
                        s0 s0Var = t0Var.c;
                        arrayList42.add(new x0(l, s0Var.c.f, s0Var.b));
                        i2++;
                        size = i13;
                        z142 = z20;
                        arrayList32 = arrayList32;
                    }
                    boolean z152 = z142;
                    boolean z162 = k2Var.C;
                    boolean z172 = k2Var.D;
                    boolean z182 = k2Var.P;
                    w1 w1Var2 = k2Var.Q;
                    i01.a I = w1Var2 != null ? i21.a.I(w1Var2.c) : null;
                    list = k2Var.X.b.a;
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (j7 j7Var : list) {
                            boolean z21 = z172;
                            e8 D = j7Var != null ? d0.D(j7Var.c) : null;
                            if (D != null) {
                                arrayList.add(D);
                            }
                            z172 = z21;
                        }
                        z = z172;
                    } else {
                        z = z172;
                        arrayList = x61.r.r;
                    }
                    boolean z192 = k2Var.i;
                    ArrayList arrayList52 = arrayList;
                    n40 n40Var2 = k2Var.F;
                    int i14 = n40Var2 == null ? -1 : kz.a.a[n40Var2.ordinal()];
                    boolean z22 = i14 != 1 || i14 == 2;
                    p01.g b3 = n.b(k2Var);
                    p01.g b22 = n.b(k2Var);
                    Integer num2 = k2Var.c;
                    int intValue = num2 != null ? num2.intValue() : 0;
                    list2 = k2Var.S.a;
                    if (list2 != null && (x1Var = (x1) x61.m.W(list2)) != null) {
                        str18 = x1Var.b;
                    }
                    return new p01.j(str3, str12, str14, str, str15, str5, avatar, i3, i4, i5, i6, i7, i8, i9, z2, z3, z4, str2, str9, i, str4, intValue, z6, aVar, z72, t7Var2, l2Var2, z82, z5, z92, i112, z112, z122, eVar2, i122, dVar22, z132, z152, arrayList42, z162, z, z182, I, arrayList52, z192, z22, b3, b22, str18, k71.k.b(k2Var.T, Boolean.TRUE));
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
        boolean z722 = o5Var.d;
        t7 t7Var22 = new t7(str11, str8, str10, w8.s.A(gVar), new fz.j(k2Var.U), str9);
        v1Var = k2Var.H;
        if (v1Var != null) {
        }
        boolean z822 = k2Var.p;
        boolean z922 = k2Var.I;
        int i1122 = k2Var.J;
        boolean z1122 = k2Var.n;
        boolean z1222 = k2Var.o;
        b2Var = k2Var.K;
        if (b2Var != null) {
        }
        int i1222 = k2Var.L.a;
        u1Var = k2Var.M;
        if (u1Var != null) {
        }
        boolean z1322 = k2Var.N;
        boolean z1422 = k2Var.O;
        ArrayList arrayList322 = k2Var.W.a;
        p01.d dVar222 = dVar;
        ArrayList arrayList422 = new ArrayList(x61.n.F(arrayList322, 10));
        size = arrayList322.size();
        i2 = 0;
        while (i2 < size) {
        }
        boolean z1522 = z1422;
        boolean z1622 = k2Var.C;
        boolean z1722 = k2Var.D;
        boolean z1822 = k2Var.P;
        w1 w1Var22 = k2Var.Q;
        if (w1Var22 != null) {
        }
        list = k2Var.X.b.a;
        if (list != null) {
        }
        boolean z1922 = k2Var.i;
        ArrayList arrayList522 = arrayList;
        n40 n40Var22 = k2Var.F;
        if (n40Var22 == null) {
        }
        if (i14 != 1) {
        }
        p01.g b32 = n.b(k2Var);
        p01.g b222 = n.b(k2Var);
        Integer num22 = k2Var.c;
        if (num22 != null) {
        }
        list2 = k2Var.S.a;
        if (list2 != null) {
        }
        return new p01.j(str3, str12, str14, str, str15, str5, avatar, i3, i4, i5, i6, i7, i8, i9, z2, z3, z4, str2, str9, i, str4, intValue, z6, aVar, z722, t7Var22, l2Var2, z822, z5, z922, i1122, z1122, z1222, eVar2, i1222, dVar222, z1322, z1522, arrayList422, z1622, z, z1822, I, arrayList522, z1922, z22, b32, b222, str18, k71.k.b(k2Var.T, Boolean.TRUE));
    }
}
