package sm0;

import f1.p3;
import gn0.i9;
import gn0.o9;
import gn0.q9;
import gn0.s00;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import kc0.fm;
import kc0.ma;
import kc0.oa;
import kc0.ua;
import sy.y;
import uf0.c1;
import uf0.e1;
import w61.a0;
import yf0.c0;
import yf0.d0;
import yf0.v;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r {
    public static final b Companion = new b();
    public final com.github.service.wrapper.b a;
    public final String b;
    public final a00.b c;
    public final a00.b d;
    public final a00.b e;

    public r(com.github.service.wrapper.b bVar, String str, a00.b bVar2, a00.b bVar3, a00.b bVar4) {
        k71.k.g(bVar, "cachedClient");
        k71.k.g(str, "userLogin");
        this.a = bVar;
        this.b = str;
        this.c = bVar2;
        this.d = bVar3;
        this.e = bVar4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005d, code lost:
    
        if (r13 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, yf0.i iVar, c71.c cVar) {
        c cVar2;
        b71.a aVar;
        int i;
        c1 c1Var;
        Integer num;
        String str2;
        String str3;
        id0.g gVar;
        uf0.p a;
        yf0.i iVar2;
        Integer num2;
        String str4;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i2 = cVar2.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.A = i2 - Integer.MIN_VALUE;
                Object obj = cVar2.y;
                aVar = b71.a.r;
                i = cVar2.A;
                a0 a0Var = a0.a;
                if (i != 0) {
                    y.j(obj);
                    e1 e1Var = new e1();
                    cVar2.u = iVar;
                    cVar2.A = 1;
                    obj = this.a.c(e1Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj);
                            return a0Var;
                        }
                        str4 = cVar2.x;
                        num2 = cVar2.w;
                        c1Var = cVar2.v;
                        iVar2 = cVar2.u;
                        y.j(obj);
                        if (c1Var.c.d) {
                            id0.h hVar = new id0.h(str4, num2.intValue());
                            uf0.p a2 = b.a(Companion, iVar2);
                            cVar2.u = null;
                            cVar2.v = null;
                            cVar2.w = null;
                            cVar2.x = null;
                            cVar2.A = 3;
                            if (this.e.a(hVar, a2, cVar2) == aVar) {
                                return aVar;
                            }
                        }
                        return a0Var;
                    }
                    iVar = cVar2.u;
                    y.j(obj);
                }
                c1Var = (c1) obj;
                num = c1Var == null ? new Integer(c1Var.b) : null;
                str2 = c1Var == null ? c1Var.c.b : null;
                str3 = c1Var == null ? c1Var.c.c.b : null;
                if (num != null && str2 != null && str3 != null) {
                    gVar = new id0.g(str3, num.intValue(), str2);
                    a = b.a(Companion, iVar);
                    cVar2.u = iVar;
                    cVar2.v = c1Var;
                    cVar2.w = num;
                    cVar2.x = str3;
                    cVar2.A = 2;
                    if (this.d.a(gVar, a, cVar2) != aVar) {
                        iVar2 = iVar;
                        num2 = num;
                        str4 = str3;
                        if (c1Var.c.d) {
                        }
                    }
                    return aVar;
                }
                return a0Var;
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.y;
        aVar = b71.a.r;
        i = cVar2.A;
        a0 a0Var2 = a0.a;
        if (i != 0) {
        }
        c1Var = (c1) obj2;
        if (c1Var == null) {
        }
        if (c1Var == null) {
        }
        if (c1Var == null) {
        }
        if (num != null) {
            gVar = new id0.g(str3, num.intValue(), str2);
            a = b.a(Companion, iVar);
            cVar2.u = iVar;
            cVar2.v = c1Var;
            cVar2.w = num;
            cVar2.x = str3;
            cVar2.A = 2;
            if (this.d.a(gVar, a, cVar2) != aVar) {
            }
            return aVar;
        }
        return a0Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00a3, code lost:
    
        if (r2 == r7) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(String str, String str2, c71.c cVar) {
        d dVar;
        int i;
        String str3;
        yf0.b bVar;
        String str4;
        String str5;
        c1 c1Var;
        String str6;
        yf0.b bVar2;
        yf0.a aVar;
        Boolean valueOf;
        Integer num;
        String str7;
        String str8;
        c1 c1Var2;
        Integer num2;
        String str9;
        Boolean bool;
        j71.c cVar2;
        String str10;
        String str11;
        Object e;
        String str12;
        Integer num3;
        Boolean bool2;
        c1 c1Var3;
        j71.c cVar3;
        j71.c cVar4;
        j71.c cVar5;
        String str13 = str;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i2 = dVar.G;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.G = i2 - Integer.MIN_VALUE;
                d dVar2 = dVar;
                Object obj = dVar2.E;
                b71.a aVar2 = b71.a.r;
                i = dVar2.G;
                com.github.service.wrapper.b bVar3 = this.a;
                j71.c cVar6 = null;
                if (i != 0) {
                    y.j(obj);
                    yf0.d dVar3 = new yf0.d();
                    dVar2.u = str13;
                    str3 = str2;
                    dVar2.v = str3;
                    dVar2.G = 1;
                    obj = bVar3.c(dVar3, str13);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            bVar2 = dVar2.w;
                            str3 = dVar2.v;
                            str6 = dVar2.u;
                            y.j(obj);
                            c1Var = (c1) obj;
                            str5 = str6;
                            bVar = bVar2;
                            valueOf = bVar != null ? Boolean.valueOf(bVar.b) : null;
                            num = c1Var != null ? new Integer(c1Var.b) : null;
                            String str14 = c1Var != null ? c1Var.c.b : null;
                            str7 = c1Var != null ? c1Var.c.c.b : null;
                            if (valueOf != null || num == null || str14 == null || str7 == null) {
                                return x61.r.r;
                            }
                            if (str3 == null) {
                                str8 = str14;
                                c1Var2 = c1Var;
                                num2 = num;
                                str9 = str5;
                                bool = valueOf;
                                cVar2 = null;
                                int intValue = num2.intValue();
                                boolean booleanValue = bool.booleanValue();
                                dVar2.u = str9;
                                dVar2.v = null;
                                dVar2.w = null;
                                dVar2.x = c1Var2;
                                dVar2.y = bool;
                                dVar2.z = num2;
                                dVar2.A = null;
                                dVar2.B = str7;
                                dVar2.C = cVar2;
                                dVar2.G = 4;
                                c1 c1Var4 = c1Var2;
                                str11 = str9;
                                e = e(str11, str7, str8, intValue, booleanValue, dVar2);
                                dVar2 = dVar2;
                                if (e != aVar2) {
                                }
                                return aVar2;
                            }
                            dVar2.u = str5;
                            dVar2.v = null;
                            dVar2.w = null;
                            dVar2.x = c1Var;
                            dVar2.y = valueOf;
                            dVar2.z = num;
                            dVar2.A = str14;
                            dVar2.B = str7;
                            dVar2.C = null;
                            dVar2.G = 3;
                            Object d = d(str3, str5, dVar2);
                            if (d != aVar2) {
                                str8 = str14;
                                str10 = str7;
                                obj = d;
                                j71.c cVar7 = (j71.c) obj;
                                str7 = str10;
                                c1Var2 = c1Var;
                                num2 = num;
                                str9 = str5;
                                bool = valueOf;
                                cVar2 = cVar7;
                                int intValue2 = num2.intValue();
                                boolean booleanValue2 = bool.booleanValue();
                                dVar2.u = str9;
                                dVar2.v = null;
                                dVar2.w = null;
                                dVar2.x = c1Var2;
                                dVar2.y = bool;
                                dVar2.z = num2;
                                dVar2.A = null;
                                dVar2.B = str7;
                                dVar2.C = cVar2;
                                dVar2.G = 4;
                                c1 c1Var42 = c1Var2;
                                str11 = str9;
                                e = e(str11, str7, str8, intValue2, booleanValue2, dVar2);
                                dVar2 = dVar2;
                                if (e != aVar2) {
                                }
                            }
                            return aVar2;
                        }
                        if (i == 3) {
                            str10 = dVar2.B;
                            str8 = dVar2.A;
                            num = dVar2.z;
                            valueOf = dVar2.y;
                            c1Var = dVar2.x;
                            str5 = dVar2.u;
                            y.j(obj);
                            j71.c cVar72 = (j71.c) obj;
                            str7 = str10;
                            c1Var2 = c1Var;
                            num2 = num;
                            str9 = str5;
                            bool = valueOf;
                            cVar2 = cVar72;
                            int intValue22 = num2.intValue();
                            boolean booleanValue22 = bool.booleanValue();
                            dVar2.u = str9;
                            dVar2.v = null;
                            dVar2.w = null;
                            dVar2.x = c1Var2;
                            dVar2.y = bool;
                            dVar2.z = num2;
                            dVar2.A = null;
                            dVar2.B = str7;
                            dVar2.C = cVar2;
                            dVar2.G = 4;
                            c1 c1Var422 = c1Var2;
                            str11 = str9;
                            e = e(str11, str7, str8, intValue22, booleanValue22, dVar2);
                            dVar2 = dVar2;
                            if (e != aVar2) {
                                str12 = str7;
                                obj = e;
                                num3 = num2;
                                bool2 = bool;
                                c1Var3 = c1Var422;
                                cVar3 = (j71.c) obj;
                                if (c1Var3.c.d) {
                                }
                                return x61.l.K(new j71.c[]{cVar2, cVar3, cVar6});
                            }
                            return aVar2;
                        }
                        if (i != 4) {
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            cVar5 = dVar2.D;
                            cVar4 = dVar2.C;
                            y.j(obj);
                            cVar6 = (j71.c) obj;
                            cVar3 = cVar5;
                            cVar2 = cVar4;
                            return x61.l.K(new j71.c[]{cVar2, cVar3, cVar6});
                        }
                        j71.c cVar8 = dVar2.C;
                        str12 = dVar2.B;
                        num3 = dVar2.z;
                        bool2 = dVar2.y;
                        c1 c1Var5 = dVar2.x;
                        String str15 = dVar2.u;
                        y.j(obj);
                        c1Var3 = c1Var5;
                        cVar2 = cVar8;
                        str11 = str15;
                        cVar3 = (j71.c) obj;
                        if (c1Var3.c.d) {
                            int intValue3 = num3.intValue();
                            boolean booleanValue3 = bool2.booleanValue();
                            dVar2.u = null;
                            dVar2.v = null;
                            dVar2.w = null;
                            dVar2.x = null;
                            dVar2.y = null;
                            dVar2.z = null;
                            dVar2.A = null;
                            dVar2.B = null;
                            dVar2.C = cVar2;
                            dVar2.D = cVar3;
                            dVar2.G = 5;
                            obj = c(str11, str12, intValue3, booleanValue3, dVar2);
                            if (obj != aVar2) {
                                cVar4 = cVar2;
                                cVar5 = cVar3;
                                cVar6 = (j71.c) obj;
                                cVar3 = cVar5;
                                cVar2 = cVar4;
                            }
                            return aVar2;
                        }
                        return x61.l.K(new j71.c[]{cVar2, cVar3, cVar6});
                    }
                    String str16 = dVar2.v;
                    String str17 = dVar2.u;
                    y.j(obj);
                    str3 = str16;
                    str13 = str17;
                }
                bVar = (yf0.b) obj;
                str4 = (bVar != null || (aVar = bVar.c) == null) ? null : aVar.a;
                if (str4 != null) {
                    str5 = str13;
                    c1Var = null;
                    if (bVar != null) {
                    }
                    if (c1Var != null) {
                    }
                    if (c1Var != null) {
                    }
                    if (c1Var != null) {
                    }
                    if (valueOf != null) {
                    }
                    return x61.r.r;
                }
                e1 e1Var = new e1();
                dVar2.u = str13;
                dVar2.v = str3;
                dVar2.w = bVar;
                dVar2.x = null;
                dVar2.G = 2;
                Object c = bVar3.c(e1Var, str4);
                if (c != aVar2) {
                    str6 = str13;
                    bVar2 = bVar;
                    obj = c;
                    c1Var = (c1) obj;
                    str5 = str6;
                    bVar = bVar2;
                    if (bVar != null) {
                    }
                    if (c1Var != null) {
                    }
                    if (c1Var != null) {
                    }
                    if (c1Var != null) {
                    }
                    if (valueOf != null) {
                    }
                    return x61.r.r;
                }
                return aVar2;
            }
        }
        dVar = new d(this, cVar);
        d dVar22 = dVar;
        Object obj2 = dVar22.E;
        b71.a aVar22 = b71.a.r;
        i = dVar22.G;
        com.github.service.wrapper.b bVar32 = this.a;
        j71.c cVar62 = null;
        if (i != 0) {
        }
        bVar = (yf0.b) obj2;
        if (bVar != null) {
        }
        if (str4 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, int i, boolean z, c71.c cVar) {
        e eVar;
        int i2;
        String str3;
        Object obj;
        boolean z2;
        String str4;
        int i3 = i;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i4 = eVar.B;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                eVar.B = i4 - Integer.MIN_VALUE;
                e eVar2 = eVar;
                Object obj2 = eVar2.z;
                b71.a aVar = b71.a.r;
                i2 = eVar2.B;
                a00.b bVar = this.e;
                if (i2 != 0) {
                    y.j(obj2);
                    id0.h hVar = new id0.h(str2, i3);
                    eVar2.u = str;
                    eVar2.v = str2;
                    eVar2.x = i3;
                    eVar2.y = z;
                    eVar2.B = 1;
                    Object f = bVar.f(hVar, eVar2);
                    if (f != aVar) {
                        str3 = str;
                        obj = f;
                        z2 = z;
                        str4 = str2;
                    }
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f fVar = eVar2.w;
                    y.j(obj2);
                    return fVar;
                }
                boolean z3 = eVar2.y;
                i3 = eVar2.x;
                String str5 = eVar2.v;
                String str6 = eVar2.u;
                y.j(obj2);
                z2 = z3;
                obj = obj2;
                str4 = str5;
                str3 = str6;
                int i5 = i3;
                f fVar2 = new f((fm) obj, this, str4, i5, null, 0);
                id0.h hVar2 = new id0.h(str4, i5);
                s5.a aVar2 = new s5.a(20);
                a aVar3 = new a(0, str3, z2);
                eVar2.u = null;
                eVar2.v = null;
                eVar2.w = fVar2;
                eVar2.x = i5;
                eVar2.y = z2;
                eVar2.B = 2;
                return bVar.d(hVar2, aVar2, aVar3, eVar2) != aVar ? aVar : fVar2;
            }
        }
        eVar = new e(this, cVar);
        e eVar22 = eVar;
        Object obj22 = eVar22.z;
        b71.a aVar4 = b71.a.r;
        i2 = eVar22.B;
        a00.b bVar2 = this.e;
        if (i2 != 0) {
        }
        int i52 = i3;
        f fVar22 = new f((fm) obj, this, str4, i52, null, 0);
        id0.h hVar22 = new id0.h(str4, i52);
        s5.a aVar22 = new s5.a(20);
        a aVar32 = new a(0, str3, z2);
        eVar22.u = null;
        eVar22.v = null;
        eVar22.w = fVar22;
        eVar22.x = i52;
        eVar22.y = z2;
        eVar22.B = 2;
        if (bVar2.d(hVar22, aVar22, aVar32, eVar22) != aVar4) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, c71.c cVar) {
        g gVar;
        int i;
        id0.f fVar;
        String str3;
        ma maVar;
        oa oaVar;
        d0 d0Var;
        boolean z;
        boolean z2;
        List<yf0.a0> list;
        yf0.i a;
        ArrayList arrayList;
        c0 a2;
        yf0.a0 a0Var;
        ArrayList arrayList2;
        yf0.a0 a0Var2;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i2 = gVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.z = i2 - Integer.MIN_VALUE;
                g gVar2 = gVar;
                Object obj = gVar2.x;
                b71.a aVar = b71.a.r;
                i = gVar2.z;
                a00.b bVar = this.c;
                if (i != 0) {
                    y.j(obj);
                    fVar = new id0.f(str);
                    gVar2.u = str2;
                    gVar2.v = fVar;
                    gVar2.z = 1;
                    Object f = bVar.f(fVar, gVar2);
                    if (f != aVar) {
                        str3 = str2;
                        obj = f;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h hVar = gVar2.w;
                    y.j(obj);
                    return hVar;
                }
                fVar = gVar2.v;
                String str4 = gVar2.u;
                y.j(obj);
                str3 = str4;
                id0.f fVar2 = fVar;
                maVar = (ma) obj;
                h hVar2 = new h(maVar, this, fVar2, null, 0);
                if (maVar != null) {
                    Companion.getClass();
                    k71.k.g(str3, "commentId");
                    oa oaVar2 = maVar.a;
                    if (oaVar2 != null) {
                        d0 d0Var2 = oaVar2.d;
                        if (d0Var2 != null) {
                            yf0.i iVar = d0Var2.d;
                            c0 c0Var = d0Var2.c;
                            List<yf0.a0> list2 = c0Var.c;
                            boolean equals = str3.equals(iVar.b);
                            if (equals) {
                                z2 = iVar.g;
                            } else if (list2 != null) {
                                if (!list2.isEmpty()) {
                                    for (yf0.a0 a0Var3 : list2) {
                                        if (k71.k.b(a0Var3 != null ? a0Var3.b : null, str3) && a0Var3.c.e) {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                }
                                z2 = false;
                            } else {
                                z = false;
                                if (equals) {
                                    list = list2;
                                    a = yf0.i.a(iVar, z ? true : iVar.e, false, false, null, null, null, null, null, 16367);
                                } else {
                                    a = b.b(iVar);
                                    list = list2;
                                }
                                if (equals) {
                                    if (list != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj2 : list) {
                                            yf0.a0 a0Var4 = (yf0.a0) obj2;
                                            if (!k71.k.b(a0Var4 != null ? a0Var4.b : null, str3)) {
                                                arrayList3.add(obj2);
                                            }
                                        }
                                        arrayList2 = new ArrayList(x61.n.F(arrayList3, 10));
                                        int size = arrayList3.size();
                                        int i3 = 0;
                                        while (i3 < size) {
                                            Object obj3 = arrayList3.get(i3);
                                            i3++;
                                            yf0.a0 a0Var5 = (yf0.a0) obj3;
                                            if (a0Var5 != null) {
                                                Companion.getClass();
                                                a0Var2 = b.e(a0Var5, z);
                                            } else {
                                                a0Var2 = null;
                                            }
                                            arrayList2.add(a0Var2);
                                        }
                                    } else {
                                        arrayList2 = null;
                                    }
                                    a2 = c0.a(c0Var, c0Var.b - 1, arrayList2, 1);
                                } else {
                                    if (list != null) {
                                        ArrayList arrayList4 = new ArrayList(x61.n.F(list, 10));
                                        for (yf0.a0 a0Var6 : list) {
                                            if (a0Var6 != null) {
                                                Companion.getClass();
                                                a0Var = b.e(a0Var6, z);
                                            } else {
                                                a0Var = null;
                                            }
                                            arrayList4.add(a0Var);
                                        }
                                        arrayList = arrayList4;
                                    } else {
                                        arrayList = null;
                                    }
                                    a2 = c0.a(c0Var, 0, arrayList, 3);
                                }
                                d0Var = d0.a(d0Var2, a2, a, 19);
                            }
                            z = z2;
                            if (equals) {
                            }
                            if (equals) {
                            }
                            d0Var = d0.a(d0Var2, a2, a, 19);
                        } else {
                            d0Var = null;
                        }
                        oaVar = oa.a(oaVar2, d0Var);
                    } else {
                        oaVar = null;
                    }
                    ma maVar2 = new ma(oaVar);
                    gVar2.u = null;
                    gVar2.v = null;
                    gVar2.w = hVar2;
                    gVar2.z = 2;
                    if (bVar.j(fVar2, maVar2, gVar2) == aVar) {
                        return aVar;
                    }
                }
                return hVar2;
            }
        }
        gVar = new g(this, cVar);
        g gVar22 = gVar;
        Object obj4 = gVar22.x;
        b71.a aVar2 = b71.a.r;
        i = gVar22.z;
        a00.b bVar2 = this.c;
        if (i != 0) {
        }
        id0.f fVar22 = fVar;
        maVar = (ma) obj4;
        h hVar22 = new h(maVar, this, fVar22, null, 0);
        if (maVar != null) {
        }
        return hVar22;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, String str3, int i, boolean z, c71.c cVar) {
        i iVar;
        int i2;
        String str4;
        int i3;
        boolean z2;
        String str5;
        Object obj;
        String str6;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i4 = iVar.C;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iVar.C = i4 - Integer.MIN_VALUE;
                i iVar2 = iVar;
                Object obj2 = iVar2.A;
                b71.a aVar = b71.a.r;
                i2 = iVar2.C;
                a00.b bVar = this.d;
                if (i2 != 0) {
                    y.j(obj2);
                    id0.g gVar = new id0.g(str2, i, str3);
                    iVar2.u = str;
                    iVar2.v = str2;
                    iVar2.w = str3;
                    iVar2.y = i;
                    iVar2.z = z;
                    iVar2.C = 1;
                    Object f = bVar.f(gVar, iVar2);
                    if (f != aVar) {
                        str4 = str;
                        i3 = i;
                        z2 = z;
                        str5 = str2;
                        obj = f;
                        str6 = str3;
                    }
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j jVar = iVar2.x;
                    y.j(obj2);
                    return jVar;
                }
                boolean z3 = iVar2.z;
                int i5 = iVar2.y;
                String str7 = iVar2.w;
                String str8 = iVar2.v;
                String str9 = iVar2.u;
                y.j(obj2);
                z2 = z3;
                obj = obj2;
                str4 = str9;
                str6 = str7;
                str5 = str8;
                i3 = i5;
                j jVar2 = new j((ua) obj, this, str5, str6, i3, null, 0);
                id0.g gVar2 = new id0.g(str5, i3, str6);
                s5.a aVar2 = new s5.a(21);
                a aVar3 = new a(1, str4, z2);
                iVar2.u = null;
                iVar2.v = null;
                iVar2.w = null;
                iVar2.x = jVar2;
                iVar2.y = i3;
                iVar2.z = z2;
                iVar2.C = 2;
                return bVar.d(gVar2, aVar2, aVar3, iVar2) != aVar ? aVar : jVar2;
            }
        }
        iVar = new i(this, cVar);
        i iVar22 = iVar;
        Object obj22 = iVar22.A;
        b71.a aVar4 = b71.a.r;
        i2 = iVar22.C;
        a00.b bVar2 = this.d;
        if (i2 != 0) {
        }
        j jVar22 = new j((ua) obj, this, str5, str6, i3, null, 0);
        id0.g gVar22 = new id0.g(str5, i3, str6);
        s5.a aVar22 = new s5.a(21);
        a aVar32 = new a(1, str4, z2);
        iVar22.u = null;
        iVar22.v = null;
        iVar22.w = null;
        iVar22.x = jVar22;
        iVar22.y = i3;
        iVar22.z = z2;
        iVar22.C = 2;
        if (bVar2.d(gVar22, aVar22, aVar32, iVar22) != aVar4) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, String str2, c71.c cVar) {
        k kVar;
        int i;
        ag0.i iVar;
        ag0.i iVar2;
        ag0.h hVar;
        ArrayList arrayList;
        ag0.g gVar;
        ag0.a aVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i2 = kVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.x = i2 - Integer.MIN_VALUE;
                Object obj = kVar.v;
                b71.a aVar2 = b71.a.r;
                i = kVar.x;
                if (i != 0) {
                    y.j(obj);
                    ag0.d dVar = new ag0.d();
                    kVar.u = str2;
                    kVar.x = 1;
                    obj = this.a.c(dVar, str);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = kVar.u;
                    y.j(obj);
                }
                ag0.b bVar = (ag0.b) obj;
                iVar = (bVar != null || (aVar = bVar.b) == null) ? null : aVar.c;
                if (iVar == null) {
                    ag0.h hVar2 = iVar.f;
                    if (hVar2 != null) {
                        List<ag0.g> list = hVar2.a;
                        if (list != null) {
                            arrayList = new ArrayList(x61.n.F(list, 10));
                            for (ag0.g gVar2 : list) {
                                int i3 = gVar2 != null ? gVar2.c.d : 0;
                                if (k71.k.b(gVar2 != null ? gVar2.b : null, str2)) {
                                    if (!gVar2.c.c) {
                                        i3++;
                                    }
                                } else if (gVar2 != null && gVar2.c.c) {
                                    i3--;
                                }
                                int i4 = i3;
                                if (gVar2 != null) {
                                    cg0.a aVar3 = gVar2.c;
                                    String str3 = aVar3.a;
                                    gVar = new ag0.g(gVar2.a, gVar2.b, new cg0.a(i4, str3, aVar3.b, aVar3.e, str3.equals(str2)));
                                } else {
                                    gVar = null;
                                }
                                arrayList.add(gVar);
                            }
                        } else {
                            arrayList = null;
                        }
                        hVar = new ag0.h(arrayList);
                    } else {
                        hVar = null;
                    }
                    iVar2 = new ag0.i(iVar.a, iVar.b, iVar.c, iVar.d, iVar.e, hVar, iVar.g);
                } else {
                    iVar2 = null;
                }
                if (iVar2 != null) {
                    return null;
                }
                q9.Companion.getClass();
                String str4 = ((aa.q) q9.a).a;
                o9.Companion.getClass();
                return new kc0.p(new kc0.n(new kc0.r(str2, new kc0.q(((aa.q) o9.b).a, iVar2.a, iVar2), str4)));
            }
        }
        kVar = new k(this, cVar);
        Object obj2 = kVar.v;
        b71.a aVar22 = b71.a.r;
        i = kVar.x;
        if (i != 0) {
        }
        ag0.b bVar2 = (ag0.b) obj2;
        if (bVar2 != null) {
        }
        if (iVar == null) {
        }
        if (iVar2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0169, code lost:
    
        if (r2 == r6) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0123, code lost:
    
        if (r2 == r6) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00d3, code lost:
    
        if (r2 == r6) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x021f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r1v38, types: [j71.c] */
    /* JADX WARN: Type inference failed for: r28v0, types: [sm0.r] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(String str, String str2, c71.c cVar) {
        l lVar;
        int i;
        String str3;
        String str4;
        String str5;
        c1 c1Var;
        String str6;
        yf0.a aVar;
        uf0.d dVar;
        c1 c1Var2;
        String str7;
        Integer num;
        String str8;
        String str9;
        String str10;
        c1 c1Var3;
        Integer num2;
        String str11;
        j71.c cVar2;
        char c;
        char c2;
        m mVar;
        int i2;
        Integer num3;
        c1 c1Var4;
        j71.c cVar3;
        String str12;
        String str13;
        String str14;
        String str15;
        c1 c1Var5;
        m mVar2;
        String str16;
        String str17;
        j71.c cVar4;
        j71.c cVar5;
        j71.c cVar6;
        j71.c cVar7;
        String str18 = str;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i3 = lVar.H;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lVar.H = i3 - Integer.MIN_VALUE;
                l lVar2 = lVar;
                Object obj = lVar2.F;
                b71.a aVar2 = b71.a.r;
                i = lVar2.H;
                com.github.service.wrapper.b bVar = this.a;
                switch (i) {
                    case 0:
                        y.j(obj);
                        yf0.d dVar2 = new yf0.d();
                        lVar2.u = str18;
                        str3 = str2;
                        lVar2.v = str3;
                        lVar2.H = 1;
                        obj = bVar.c(dVar2, str18);
                        break;
                    case 1:
                        String str19 = lVar2.v;
                        String str20 = lVar2.u;
                        y.j(obj);
                        str3 = str19;
                        str18 = str20;
                        yf0.b bVar2 = (yf0.b) obj;
                        str4 = (bVar2 == null || (aVar = bVar2.c) == null) ? null : aVar.a;
                        if (str4 != null) {
                            e1 e1Var = new e1();
                            lVar2.u = str18;
                            lVar2.v = str3;
                            lVar2.w = str4;
                            lVar2.x = null;
                            lVar2.H = 2;
                            Object c3 = bVar.c(e1Var, str4);
                            if (c3 != aVar2) {
                                str5 = str18;
                                str6 = str4;
                                obj = c3;
                                c1 c1Var6 = (c1) obj;
                                str4 = str6;
                                c1Var = c1Var6;
                                if (str4 != null) {
                                    uf0.f fVar = new uf0.f();
                                    lVar2.u = str5;
                                    lVar2.v = str3;
                                    lVar2.w = null;
                                    lVar2.x = c1Var;
                                    lVar2.y = null;
                                    lVar2.H = 3;
                                    obj = bVar.c(fVar, str4);
                                    break;
                                } else {
                                    dVar = null;
                                    c1Var2 = c1Var;
                                    str7 = str3;
                                    num = c1Var2 == null ? new Integer(c1Var2.b) : null;
                                    str8 = c1Var2 == null ? c1Var2.c.b : null;
                                    str9 = c1Var2 == null ? c1Var2.c.c.b : null;
                                    if (str7 == null) {
                                        lVar2.u = str5;
                                        lVar2.v = str7;
                                        lVar2.w = null;
                                        lVar2.x = c1Var2;
                                        lVar2.y = dVar;
                                        lVar2.z = num;
                                        lVar2.A = str8;
                                        lVar2.B = str9;
                                        lVar2.C = null;
                                        lVar2.H = 4;
                                        obj = j(str7, str5, lVar2);
                                        break;
                                    } else {
                                        Integer num4 = num;
                                        str10 = str5;
                                        c1Var3 = c1Var2;
                                        num2 = num4;
                                        str11 = str8;
                                        cVar2 = null;
                                        c = 3;
                                        if (dVar == null) {
                                            c2 = 1;
                                            mVar = new m(this, dVar, null, 0);
                                        } else {
                                            c2 = 1;
                                            mVar = null;
                                        }
                                        if (dVar != null) {
                                            i2 = 2;
                                            num3 = num2;
                                            c1Var4 = c1Var3;
                                            cVar3 = cVar2;
                                            str12 = str11;
                                            str13 = str9;
                                            String str21 = str10;
                                            if (num3 != null) {
                                            }
                                            j71.c[] cVarArr = new j71.c[i2];
                                            cVarArr[0] = mVar;
                                            cVarArr[c2] = cVar3;
                                            return x61.l.K(cVarArr);
                                        }
                                        uf0.f fVar2 = new uf0.f();
                                        ZonedDateTime now = ZonedDateTime.now();
                                        i2 = 2;
                                        s00.Companion.getClass();
                                        String str22 = ((aa.q) s00.P).a;
                                        uf0.b bVar3 = new uf0.b(str22, this.b, new bl0.a("", str22));
                                        i9.Companion.getClass();
                                        String str23 = ((aa.q) i9.c).a;
                                        uf0.a aVar3 = new uf0.a(str10, str7 != null ? new uf0.c(str7, str23) : null, str23);
                                        String str24 = dVar.a;
                                        uf0.d dVar3 = new uf0.d(str24, now, bVar3, aVar3, dVar.e);
                                        lVar2.u = str10;
                                        lVar2.v = null;
                                        lVar2.w = null;
                                        lVar2.x = c1Var3;
                                        lVar2.y = null;
                                        lVar2.z = num2;
                                        lVar2.A = str11;
                                        lVar2.B = str9;
                                        lVar2.C = cVar2;
                                        lVar2.D = mVar;
                                        lVar2.E = null;
                                        lVar2.H = 5;
                                        aVar2 = aVar2;
                                        if (bVar.p(fVar2, dVar3, str24, lVar2) != aVar2) {
                                            str14 = str9;
                                            str15 = str11;
                                            c1Var5 = c1Var3;
                                            mVar2 = mVar;
                                            mVar = mVar2;
                                            cVar3 = cVar2;
                                            str13 = str14;
                                            str12 = str15;
                                            num3 = num2;
                                            c1Var4 = c1Var5;
                                            String str212 = str10;
                                            if (num3 != null || str12 == null || str13 == null) {
                                                j71.c[] cVarArr2 = new j71.c[i2];
                                                cVarArr2[0] = mVar;
                                                cVarArr2[c2] = cVar3;
                                                return x61.l.K(cVarArr2);
                                            }
                                            int intValue = num3.intValue();
                                            lVar2.u = str212;
                                            lVar2.v = null;
                                            lVar2.w = null;
                                            lVar2.x = c1Var4;
                                            lVar2.y = null;
                                            lVar2.z = num3;
                                            lVar2.A = null;
                                            lVar2.B = str13;
                                            lVar2.C = cVar3;
                                            lVar2.D = mVar;
                                            lVar2.E = null;
                                            lVar2.H = 6;
                                            Object k = k(str212, str13, str12, intValue, lVar2);
                                            if (k != aVar2) {
                                                str16 = str212;
                                                str17 = str13;
                                                obj = k;
                                                cVar4 = mVar;
                                                cVar5 = (j71.c) obj;
                                                if (c1Var4.c.d) {
                                                    cVar6 = null;
                                                    j71.c[] cVarArr3 = new j71.c[4];
                                                    cVarArr3[0] = cVar4;
                                                    cVarArr3[c2] = cVar3;
                                                    cVarArr3[i2] = cVar5;
                                                    cVarArr3[c] = cVar6;
                                                    return x61.l.K(cVarArr3);
                                                }
                                                int intValue2 = num3.intValue();
                                                lVar2.u = null;
                                                lVar2.v = null;
                                                lVar2.w = null;
                                                lVar2.x = null;
                                                lVar2.y = null;
                                                lVar2.z = null;
                                                lVar2.A = null;
                                                lVar2.B = null;
                                                lVar2.C = cVar3;
                                                lVar2.D = cVar4;
                                                lVar2.E = cVar5;
                                                lVar2.H = 7;
                                                obj = i(str16, str17, intValue2, lVar2);
                                                if (obj != aVar2) {
                                                    cVar7 = cVar3;
                                                    cVar6 = (j71.c) obj;
                                                    cVar3 = cVar7;
                                                    j71.c[] cVarArr32 = new j71.c[4];
                                                    cVarArr32[0] = cVar4;
                                                    cVarArr32[c2] = cVar3;
                                                    cVarArr32[i2] = cVar5;
                                                    cVarArr32[c] = cVar6;
                                                    return x61.l.K(cVarArr32);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return aVar2;
                        }
                        str5 = str18;
                        c1Var = null;
                        if (str4 != null) {
                        }
                        break;
                    case 2:
                        str6 = lVar2.w;
                        str3 = lVar2.v;
                        str5 = lVar2.u;
                        y.j(obj);
                        c1 c1Var62 = (c1) obj;
                        str4 = str6;
                        c1Var = c1Var62;
                        if (str4 != null) {
                        }
                        break;
                    case 3:
                        c1Var = lVar2.x;
                        str3 = lVar2.v;
                        str5 = lVar2.u;
                        y.j(obj);
                        dVar = (uf0.d) obj;
                        c1Var2 = c1Var;
                        str7 = str3;
                        if (c1Var2 == null) {
                        }
                        if (c1Var2 == null) {
                        }
                        if (c1Var2 == null) {
                        }
                        if (str7 == null) {
                        }
                        break;
                    case 4:
                        str9 = lVar2.B;
                        str8 = lVar2.A;
                        num = lVar2.z;
                        dVar = lVar2.y;
                        c1Var2 = lVar2.x;
                        str7 = lVar2.v;
                        str5 = lVar2.u;
                        y.j(obj);
                        String str25 = str8;
                        cVar2 = (j71.c) obj;
                        str11 = str25;
                        Integer num5 = num;
                        str10 = str5;
                        c1Var3 = c1Var2;
                        num2 = num5;
                        c = 3;
                        if (dVar == null) {
                        }
                        if (dVar != null) {
                        }
                        break;
                    case 5:
                        j71.c r1 = (j71.c) (lVar2.D);
                        cVar2 = lVar2.C;
                        str14 = lVar2.B;
                        str15 = lVar2.A;
                        num2 = lVar2.z;
                        c1Var5 = lVar2.x;
                        str10 = lVar2.u;
                        y.j(obj);
                        c = 3;
                        i2 = 2;
                        c2 = 1;
                        mVar2 = r1;
                        mVar = mVar2;
                        cVar3 = cVar2;
                        str13 = str14;
                        str12 = str15;
                        num3 = num2;
                        c1Var4 = c1Var5;
                        String str2122 = str10;
                        if (num3 != null) {
                        }
                        j71.c[] cVarArr22 = new j71.c[i2];
                        cVarArr22[0] = mVar;
                        cVarArr22[c2] = cVar3;
                        return x61.l.K(cVarArr22);
                    case 6:
                        j71.c cVar8 = lVar2.D;
                        j71.c cVar9 = lVar2.C;
                        str17 = lVar2.B;
                        num3 = lVar2.z;
                        c1Var4 = lVar2.x;
                        str16 = lVar2.u;
                        y.j(obj);
                        cVar3 = cVar9;
                        c = 3;
                        i2 = 2;
                        c2 = 1;
                        cVar4 = cVar8;
                        cVar5 = (j71.c) obj;
                        if (c1Var4.c.d) {
                        }
                        break;
                    case 7:
                        cVar5 = lVar2.E;
                        cVar4 = lVar2.D;
                        cVar7 = lVar2.C;
                        y.j(obj);
                        c = 3;
                        i2 = 2;
                        c2 = 1;
                        cVar6 = (j71.c) obj;
                        cVar3 = cVar7;
                        j71.c[] cVarArr322 = new j71.c[4];
                        cVarArr322[0] = cVar4;
                        cVarArr322[c2] = cVar3;
                        cVarArr322[i2] = cVar5;
                        cVarArr322[c] = cVar6;
                        return x61.l.K(cVarArr322);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        lVar = new l(this, cVar);
        l lVar22 = lVar;
        Object obj2 = lVar22.F;
        b71.a aVar22 = b71.a.r;
        i = lVar22.H;
        com.github.service.wrapper.b bVar4 = this.a;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01a3, code lost:
    
        if (r1 == r6) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0180, code lost:
    
        if (r3.p(r9, r17, r11, r5) == r6) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0111, code lost:
    
        if (r1 == r6) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c5, code lost:
    
        if (r1 == r6) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable h(String str, String str2, c71.c cVar) {
        n nVar;
        int i;
        String str3;
        String str4;
        String str5;
        uf0.d dVar;
        String str6;
        yf0.a aVar;
        c1 c1Var;
        String str7;
        Integer num;
        String str8;
        char c;
        char c2;
        char c3;
        String str9;
        j71.c cVar2;
        j71.c cVar3;
        j71.c cVar4;
        String str10;
        j71.c cVar5;
        j71.c cVar6;
        j71.c cVar7;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i2 = nVar.G;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.G = i2 - Integer.MIN_VALUE;
                n nVar2 = nVar;
                Object obj = nVar2.E;
                b71.a aVar2 = b71.a.r;
                i = nVar2.G;
                com.github.service.wrapper.b bVar = this.a;
                j71.c cVar8 = null;
                switch (i) {
                    case 0:
                        y.j(obj);
                        yf0.d dVar2 = new yf0.d();
                        str3 = str2;
                        nVar2.u = str3;
                        nVar2.G = 1;
                        obj = bVar.c(dVar2, str);
                        break;
                    case 1:
                        str3 = nVar2.u;
                        y.j(obj);
                        yf0.b bVar2 = (yf0.b) obj;
                        str4 = (bVar2 == null || (aVar = bVar2.c) == null) ? null : aVar.a;
                        if (str4 != null) {
                            uf0.f fVar = new uf0.f();
                            nVar2.u = str3;
                            nVar2.v = str4;
                            nVar2.w = null;
                            nVar2.G = 2;
                            Object c4 = bVar.c(fVar, str4);
                            if (c4 != aVar2) {
                                String str11 = str3;
                                str6 = str4;
                                obj = c4;
                                str5 = str11;
                                String str12 = str6;
                                dVar = (uf0.d) obj;
                                str4 = str12;
                                if (str4 != null) {
                                    e1 e1Var = new e1();
                                    nVar2.u = str5;
                                    nVar2.v = null;
                                    nVar2.w = dVar;
                                    nVar2.x = null;
                                    nVar2.G = 3;
                                    obj = bVar.c(e1Var, str4);
                                    break;
                                } else {
                                    c1Var = null;
                                    str7 = str5;
                                    num = c1Var == null ? new Integer(c1Var.b) : null;
                                    str8 = c1Var == null ? c1Var.c.b : null;
                                    String str13 = c1Var == null ? c1Var.c.c.b : null;
                                    c = 0;
                                    m mVar = dVar == null ? new m(this, dVar, null, 1) : null;
                                    c2 = 3;
                                    if (dVar == null) {
                                        uf0.f fVar2 = new uf0.f();
                                        c3 = 1;
                                        String str14 = dVar.a;
                                        uf0.d dVar3 = new uf0.d(str14, null, null, null, dVar.e);
                                        nVar2.u = str7;
                                        nVar2.v = null;
                                        nVar2.w = null;
                                        nVar2.x = c1Var;
                                        nVar2.y = num;
                                        nVar2.z = str8;
                                        nVar2.A = str13;
                                        nVar2.B = mVar;
                                        nVar2.C = null;
                                        nVar2.G = 4;
                                        break;
                                    } else {
                                        c3 = 1;
                                    }
                                    str9 = str13;
                                    cVar2 = mVar;
                                    if (str7 != null) {
                                        nVar2.u = null;
                                        nVar2.v = null;
                                        nVar2.w = null;
                                        nVar2.x = c1Var;
                                        nVar2.y = num;
                                        nVar2.z = str8;
                                        nVar2.A = str9;
                                        nVar2.B = cVar2;
                                        nVar2.C = null;
                                        nVar2.G = 5;
                                        obj = j(str7, null, nVar2);
                                        break;
                                    } else {
                                        cVar3 = null;
                                        cVar4 = cVar2;
                                        String str15 = str9;
                                        String str16 = str8;
                                        if (num != null || str16 == null || str15 == null) {
                                            j71.c[] cVarArr = new j71.c[2];
                                            cVarArr[c] = cVar4;
                                            cVarArr[c3] = cVar3;
                                            return x61.l.K(cVarArr);
                                        }
                                        int intValue = num.intValue();
                                        nVar2.u = null;
                                        nVar2.v = null;
                                        nVar2.w = null;
                                        nVar2.x = c1Var;
                                        nVar2.y = num;
                                        nVar2.z = null;
                                        nVar2.A = str15;
                                        nVar2.B = cVar4;
                                        nVar2.C = cVar3;
                                        nVar2.G = 6;
                                        obj = k(null, str15, str16, intValue, nVar2);
                                        if (obj != aVar2) {
                                            str10 = str15;
                                            cVar5 = cVar3;
                                            cVar6 = (j71.c) obj;
                                            if (c1Var.c.d) {
                                                int intValue2 = num.intValue();
                                                nVar2.u = null;
                                                nVar2.v = null;
                                                nVar2.w = null;
                                                nVar2.x = null;
                                                nVar2.y = null;
                                                nVar2.z = null;
                                                nVar2.A = null;
                                                nVar2.B = cVar4;
                                                nVar2.C = cVar5;
                                                nVar2.D = cVar6;
                                                nVar2.G = 7;
                                                obj = i(null, str10, intValue2, nVar2);
                                                if (obj != aVar2) {
                                                    cVar7 = cVar4;
                                                    cVar8 = (j71.c) obj;
                                                    cVar4 = cVar7;
                                                }
                                            }
                                            j71.c[] cVarArr2 = new j71.c[4];
                                            cVarArr2[c] = cVar4;
                                            cVarArr2[c3] = cVar5;
                                            cVarArr2[2] = cVar6;
                                            cVarArr2[c2] = cVar8;
                                            return x61.l.K(cVarArr2);
                                        }
                                    }
                                }
                            }
                            return aVar2;
                        }
                        str5 = str3;
                        dVar = null;
                        if (str4 != null) {
                        }
                        break;
                    case 2:
                        str6 = nVar2.v;
                        str5 = nVar2.u;
                        y.j(obj);
                        String str122 = str6;
                        dVar = (uf0.d) obj;
                        str4 = str122;
                        if (str4 != null) {
                        }
                        break;
                    case 3:
                        dVar = nVar2.w;
                        str5 = nVar2.u;
                        y.j(obj);
                        c1Var = (c1) obj;
                        str7 = str5;
                        if (c1Var == null) {
                        }
                        if (c1Var == null) {
                        }
                        if (c1Var == null) {
                        }
                        c = 0;
                        if (dVar == null) {
                        }
                        c2 = 3;
                        if (dVar == null) {
                        }
                        str9 = str13;
                        cVar2 = mVar;
                        if (str7 != null) {
                        }
                        break;
                    case 4:
                        cVar2 = nVar2.B;
                        str9 = nVar2.A;
                        str8 = nVar2.z;
                        num = nVar2.y;
                        c1Var = nVar2.x;
                        str7 = nVar2.u;
                        y.j(obj);
                        c2 = 3;
                        c3 = 1;
                        c = 0;
                        if (str7 != null) {
                        }
                        break;
                    case 5:
                        cVar2 = nVar2.B;
                        str9 = nVar2.A;
                        str8 = nVar2.z;
                        num = nVar2.y;
                        c1Var = nVar2.x;
                        y.j(obj);
                        c2 = 3;
                        c3 = 1;
                        c = 0;
                        cVar3 = (j71.c) obj;
                        cVar4 = cVar2;
                        String str152 = str9;
                        String str162 = str8;
                        if (num != null) {
                        }
                        j71.c[] cVarArr3 = new j71.c[2];
                        cVarArr3[c] = cVar4;
                        cVarArr3[c3] = cVar3;
                        return x61.l.K(cVarArr3);
                    case 6:
                        j71.c cVar9 = nVar2.C;
                        j71.c cVar10 = nVar2.B;
                        str10 = nVar2.A;
                        num = nVar2.y;
                        c1Var = nVar2.x;
                        y.j(obj);
                        c2 = 3;
                        c3 = 1;
                        c = 0;
                        cVar4 = cVar10;
                        cVar5 = cVar9;
                        cVar6 = (j71.c) obj;
                        if (c1Var.c.d) {
                        }
                        j71.c[] cVarArr22 = new j71.c[4];
                        cVarArr22[c] = cVar4;
                        cVarArr22[c3] = cVar5;
                        cVarArr22[2] = cVar6;
                        cVarArr22[c2] = cVar8;
                        return x61.l.K(cVarArr22);
                    case 7:
                        cVar6 = nVar2.D;
                        cVar5 = nVar2.C;
                        cVar7 = nVar2.B;
                        y.j(obj);
                        c2 = 3;
                        c3 = 1;
                        c = 0;
                        cVar8 = (j71.c) obj;
                        cVar4 = cVar7;
                        j71.c[] cVarArr222 = new j71.c[4];
                        cVarArr222[c] = cVar4;
                        cVarArr222[c3] = cVar5;
                        cVarArr222[2] = cVar6;
                        cVarArr222[c2] = cVar8;
                        return x61.l.K(cVarArr222);
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        nVar = new n(this, cVar);
        n nVar22 = nVar;
        Object obj2 = nVar22.E;
        b71.a aVar22 = b71.a.r;
        i = nVar22.G;
        com.github.service.wrapper.b bVar3 = this.a;
        j71.c cVar82 = null;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, String str2, int i, c71.c cVar) {
        o oVar;
        int i2;
        String str3;
        int i3;
        Object obj;
        String str4;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i4 = oVar.A;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                oVar.A = i4 - Integer.MIN_VALUE;
                o oVar2 = oVar;
                Object obj2 = oVar2.y;
                b71.a aVar = b71.a.r;
                i2 = oVar2.A;
                a00.b bVar = this.e;
                if (i2 != 0) {
                    y.j(obj2);
                    id0.h hVar = new id0.h(str2, i);
                    oVar2.u = str;
                    oVar2.v = str2;
                    oVar2.x = i;
                    oVar2.A = 1;
                    Object f = bVar.f(hVar, oVar2);
                    if (f != aVar) {
                        str3 = str;
                        i3 = i;
                        obj = f;
                        str4 = str2;
                    }
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f fVar = oVar2.w;
                    y.j(obj2);
                    return fVar;
                }
                int i5 = oVar2.x;
                String str5 = oVar2.v;
                String str6 = oVar2.u;
                y.j(obj2);
                str3 = str6;
                i3 = i5;
                obj = obj2;
                str4 = str5;
                f fVar2 = new f((fm) obj, this, str4, i3, null, 1);
                id0.h hVar2 = new id0.h(str4, i3);
                s5.a aVar2 = new s5.a(18);
                p3 p3Var = new p3(str3, 26);
                oVar2.u = null;
                oVar2.v = null;
                oVar2.w = fVar2;
                oVar2.x = i3;
                oVar2.A = 2;
                return bVar.d(hVar2, aVar2, p3Var, oVar2) != aVar ? aVar : fVar2;
            }
        }
        oVar = new o(this, cVar);
        o oVar22 = oVar;
        Object obj22 = oVar22.y;
        b71.a aVar3 = b71.a.r;
        i2 = oVar22.A;
        a00.b bVar2 = this.e;
        if (i2 != 0) {
        }
        f fVar22 = new f((fm) obj, this, str4, i3, null, 1);
        id0.h hVar22 = new id0.h(str4, i3);
        s5.a aVar22 = new s5.a(18);
        p3 p3Var2 = new p3(str3, 26);
        oVar22.u = null;
        oVar22.v = null;
        oVar22.w = fVar22;
        oVar22.x = i3;
        oVar22.A = 2;
        if (bVar2.d(hVar22, aVar22, p3Var2, oVar22) != aVar3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, String str2, c71.c cVar) {
        p pVar;
        int i;
        id0.f fVar;
        String str3;
        ma maVar;
        oa oaVar;
        d0 d0Var;
        ArrayList arrayList;
        yf0.a0 a0Var;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i2 = pVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.z = i2 - Integer.MIN_VALUE;
                p pVar2 = pVar;
                Object obj = pVar2.x;
                b71.a aVar = b71.a.r;
                i = pVar2.z;
                a00.b bVar = this.c;
                if (i != 0) {
                    y.j(obj);
                    fVar = new id0.f(str);
                    pVar2.u = str2;
                    pVar2.v = fVar;
                    pVar2.z = 1;
                    Object f = bVar.f(fVar, pVar2);
                    if (f != aVar) {
                        str3 = str2;
                        obj = f;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h hVar = pVar2.w;
                    y.j(obj);
                    return hVar;
                }
                fVar = pVar2.v;
                String str4 = pVar2.u;
                y.j(obj);
                str3 = str4;
                id0.f fVar2 = fVar;
                maVar = (ma) obj;
                h hVar2 = new h(maVar, this, fVar2, null, 1);
                if (maVar != null) {
                    Companion.getClass();
                    oa oaVar2 = maVar.a;
                    if (oaVar2 != null) {
                        d0 d0Var2 = oaVar2.d;
                        if (d0Var2 != null) {
                            yf0.i c = b.c(d0Var2.d, str3);
                            c0 c0Var = d0Var2.c;
                            List<yf0.a0> list = c0Var.c;
                            if (list != null) {
                                arrayList = new ArrayList(x61.n.F(list, 10));
                                for (yf0.a0 a0Var2 : list) {
                                    if (a0Var2 != null) {
                                        b bVar2 = Companion;
                                        v vVar = a0Var2.c;
                                        bVar2.getClass();
                                        a0Var = yf0.a0.a(a0Var2, b.d(vVar, str3));
                                    } else {
                                        a0Var = null;
                                    }
                                    arrayList.add(a0Var);
                                }
                            } else {
                                arrayList = null;
                            }
                            d0Var = d0.a(d0Var2, c0.a(c0Var, 0, arrayList, 3), c, 19);
                        } else {
                            d0Var = null;
                        }
                        oaVar = oa.a(oaVar2, d0Var);
                    } else {
                        oaVar = null;
                    }
                    ma maVar2 = new ma(oaVar);
                    pVar2.u = null;
                    pVar2.v = null;
                    pVar2.w = hVar2;
                    pVar2.z = 2;
                    if (bVar.j(fVar2, maVar2, pVar2) == aVar) {
                        return aVar;
                    }
                }
                return hVar2;
            }
        }
        pVar = new p(this, cVar);
        p pVar22 = pVar;
        Object obj2 = pVar22.x;
        b71.a aVar2 = b71.a.r;
        i = pVar22.z;
        a00.b bVar3 = this.c;
        if (i != 0) {
        }
        id0.f fVar22 = fVar;
        maVar = (ma) obj2;
        h hVar22 = new h(maVar, this, fVar22, null, 1);
        if (maVar != null) {
        }
        return hVar22;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, String str2, String str3, int i, c71.c cVar) {
        q qVar;
        int i2;
        String str4;
        int i3;
        String str5;
        String str6 = str3;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i4 = qVar.B;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                qVar.B = i4 - Integer.MIN_VALUE;
                q qVar2 = qVar;
                Object obj = qVar2.z;
                b71.a aVar = b71.a.r;
                i2 = qVar2.B;
                a00.b bVar = this.d;
                if (i2 != 0) {
                    y.j(obj);
                    id0.g gVar = new id0.g(str2, i, str6);
                    qVar2.u = str;
                    qVar2.v = str2;
                    qVar2.w = str6;
                    qVar2.y = i;
                    qVar2.B = 1;
                    obj = bVar.f(gVar, qVar2);
                    if (obj != aVar) {
                        str4 = str;
                        i3 = i;
                        str5 = str2;
                    }
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j jVar = qVar2.x;
                    y.j(obj);
                    return jVar;
                }
                int i5 = qVar2.y;
                str6 = qVar2.w;
                str5 = qVar2.v;
                String str7 = qVar2.u;
                y.j(obj);
                str4 = str7;
                i3 = i5;
                Object obj2 = obj;
                String str8 = str6;
                j jVar2 = new j((ua) obj2, this, str5, str8, i3, null, 1);
                id0.g gVar2 = new id0.g(str5, i3, str8);
                s5.a aVar2 = new s5.a(19);
                p3 p3Var = new p3(str4, 27);
                qVar2.u = null;
                qVar2.v = null;
                qVar2.w = null;
                qVar2.x = jVar2;
                qVar2.y = i3;
                qVar2.B = 2;
                return bVar.d(gVar2, aVar2, p3Var, qVar2) != aVar ? aVar : jVar2;
            }
        }
        qVar = new q(this, cVar);
        q qVar22 = qVar;
        Object obj3 = qVar22.z;
        b71.a aVar3 = b71.a.r;
        i2 = qVar22.B;
        a00.b bVar2 = this.d;
        if (i2 != 0) {
        }
        Object obj22 = obj3;
        String str82 = str6;
        j jVar22 = new j((ua) obj22, this, str5, str82, i3, null, 1);
        id0.g gVar22 = new id0.g(str5, i3, str82);
        s5.a aVar22 = new s5.a(19);
        p3 p3Var2 = new p3(str4, 27);
        qVar22.u = null;
        qVar22.v = null;
        qVar22.w = null;
        qVar22.x = jVar22;
        qVar22.y = i3;
        qVar22.B = 2;
        if (bVar2.d(gVar22, aVar22, p3Var2, qVar22) != aVar3) {
        }
    }
}
