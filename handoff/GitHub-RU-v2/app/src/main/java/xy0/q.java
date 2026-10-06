package xy0;

import ar0.c1;
import ar0.e1;
import er0.c0;
import er0.d0;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import jn0.gb;
import jn0.ib;
import jn0.ob;
import jn0.wn;
import pz0.ja;
import pz0.pa;
import pz0.ra;
import pz0.w80;
import sy.y;
import w61.a0;
import xn.q1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q {
    public static final a Companion = new a();
    public com.github.service.wrapper.b a;
    public String b;
    public a00.b c;
    public a00.b d;
    public a00.b e;

    public q(com.github.service.wrapper.b bVar, String str, a00.b bVar2, a00.b bVar3, a00.b bVar4) {
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
    public final Object a(String str, er0.i iVar, c71.c cVar) {
        b bVar;
        b71.a aVar;
        int i;
        c1 c1Var;
        Integer num;
        String str2;
        String str3;
        io0.h hVar;
        ar0.p a;
        er0.i iVar2;
        Integer num2;
        String str4;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i2 = bVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.A = i2 - Integer.MIN_VALUE;
                Object obj = bVar.y;
                aVar = b71.a.r;
                i = bVar.A;
                a0 a0Var = a0.a;
                if (i != 0) {
                    y.j(obj);
                    e1 e1Var = new e1();
                    bVar.u = iVar;
                    bVar.A = 1;
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
                        str4 = bVar.x;
                        num2 = bVar.w;
                        c1Var = bVar.v;
                        iVar2 = bVar.u;
                        y.j(obj);
                        if (c1Var.c.d) {
                            io0.i iVar3 = new io0.i(str4, num2.intValue());
                            ar0.p a2 = a.a(Companion, iVar2);
                            bVar.u = null;
                            bVar.v = null;
                            bVar.w = null;
                            bVar.x = null;
                            bVar.A = 3;
                            if (this.e.a(iVar3, a2, bVar) == aVar) {
                                return aVar;
                            }
                        }
                        return a0Var;
                    }
                    iVar = bVar.u;
                    y.j(obj);
                }
                c1Var = (c1) obj;
                num = c1Var == null ? new Integer(c1Var.b) : null;
                str2 = c1Var == null ? c1Var.c.b : null;
                str3 = c1Var == null ? c1Var.c.c.b : null;
                if (num != null && str2 != null && str3 != null) {
                    hVar = new io0.h(str3, num.intValue(), str2);
                    a = a.a(Companion, iVar);
                    bVar.u = iVar;
                    bVar.v = c1Var;
                    bVar.w = num;
                    bVar.x = str3;
                    bVar.A = 2;
                    if (this.d.a(hVar, a, bVar) != aVar) {
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
        bVar = new b(this, cVar);
        Object obj2 = bVar.y;
        aVar = b71.a.r;
        i = bVar.A;
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
            hVar = new io0.h(str3, num.intValue(), str2);
            a = a.a(Companion, iVar);
            bVar.u = iVar;
            bVar.v = c1Var;
            bVar.w = num;
            bVar.x = str3;
            bVar.A = 2;
            if (this.d.a(hVar, a, bVar) != aVar) {
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
        c cVar2;
        int i;
        String str3;
        er0.b bVar;
        String str4;
        String str5;
        c1 c1Var;
        String str6;
        er0.b bVar2;
        er0.a aVar;
        Boolean valueOf;
        Integer num;
        String str7;
        String str8;
        c1 c1Var2;
        Integer num2;
        String str9;
        Boolean bool;
        j71.c cVar3;
        String str10;
        String str11;
        Object e;
        String str12;
        Integer num3;
        Boolean bool2;
        c1 c1Var3;
        j71.c cVar4;
        j71.c cVar5;
        j71.c cVar6;
        String str13 = str;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i2 = cVar2.G;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.G = i2 - Integer.MIN_VALUE;
                c cVar7 = cVar2;
                Object obj = cVar7.E;
                b71.a aVar2 = b71.a.r;
                i = cVar7.G;
                com.github.service.wrapper.b bVar3 = this.a;
                j71.c cVar8 = null;
                if (i != 0) {
                    y.j(obj);
                    er0.d dVar = new er0.d();
                    cVar7.u = str13;
                    str3 = str2;
                    cVar7.v = str3;
                    cVar7.G = 1;
                    obj = bVar3.c(dVar, str13);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            bVar2 = cVar7.w;
                            str3 = cVar7.v;
                            str6 = cVar7.u;
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
                                cVar3 = null;
                                int intValue = num2.intValue();
                                boolean booleanValue = bool.booleanValue();
                                cVar7.u = str9;
                                cVar7.v = null;
                                cVar7.w = null;
                                cVar7.x = c1Var2;
                                cVar7.y = bool;
                                cVar7.z = num2;
                                cVar7.A = null;
                                cVar7.B = str7;
                                cVar7.C = cVar3;
                                cVar7.G = 4;
                                c1 c1Var4 = c1Var2;
                                str11 = str9;
                                e = e(str11, str7, str8, intValue, booleanValue, cVar7);
                                cVar7 = cVar7;
                                if (e != aVar2) {
                                }
                                return aVar2;
                            }
                            cVar7.u = str5;
                            cVar7.v = null;
                            cVar7.w = null;
                            cVar7.x = c1Var;
                            cVar7.y = valueOf;
                            cVar7.z = num;
                            cVar7.A = str14;
                            cVar7.B = str7;
                            cVar7.C = null;
                            cVar7.G = 3;
                            Object d = d(str3, str5, cVar7);
                            if (d != aVar2) {
                                str8 = str14;
                                str10 = str7;
                                obj = d;
                                j71.c cVar9 = (j71.c) obj;
                                str7 = str10;
                                c1Var2 = c1Var;
                                num2 = num;
                                str9 = str5;
                                bool = valueOf;
                                cVar3 = cVar9;
                                int intValue2 = num2.intValue();
                                boolean booleanValue2 = bool.booleanValue();
                                cVar7.u = str9;
                                cVar7.v = null;
                                cVar7.w = null;
                                cVar7.x = c1Var2;
                                cVar7.y = bool;
                                cVar7.z = num2;
                                cVar7.A = null;
                                cVar7.B = str7;
                                cVar7.C = cVar3;
                                cVar7.G = 4;
                                c1 c1Var42 = c1Var2;
                                str11 = str9;
                                e = e(str11, str7, str8, intValue2, booleanValue2, cVar7);
                                cVar7 = cVar7;
                                if (e != aVar2) {
                                }
                            }
                            return aVar2;
                        }
                        if (i == 3) {
                            str10 = cVar7.B;
                            str8 = cVar7.A;
                            num = cVar7.z;
                            valueOf = cVar7.y;
                            c1Var = cVar7.x;
                            str5 = cVar7.u;
                            y.j(obj);
                            j71.c cVar92 = (j71.c) obj;
                            str7 = str10;
                            c1Var2 = c1Var;
                            num2 = num;
                            str9 = str5;
                            bool = valueOf;
                            cVar3 = cVar92;
                            int intValue22 = num2.intValue();
                            boolean booleanValue22 = bool.booleanValue();
                            cVar7.u = str9;
                            cVar7.v = null;
                            cVar7.w = null;
                            cVar7.x = c1Var2;
                            cVar7.y = bool;
                            cVar7.z = num2;
                            cVar7.A = null;
                            cVar7.B = str7;
                            cVar7.C = cVar3;
                            cVar7.G = 4;
                            c1 c1Var422 = c1Var2;
                            str11 = str9;
                            e = e(str11, str7, str8, intValue22, booleanValue22, cVar7);
                            cVar7 = cVar7;
                            if (e != aVar2) {
                                str12 = str7;
                                obj = e;
                                num3 = num2;
                                bool2 = bool;
                                c1Var3 = c1Var422;
                                cVar4 = (j71.c) obj;
                                if (c1Var3.c.d) {
                                }
                                return x61.l.K(new j71.c[]{cVar3, cVar4, cVar8});
                            }
                            return aVar2;
                        }
                        if (i != 4) {
                            if (i != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            cVar6 = cVar7.D;
                            cVar5 = cVar7.C;
                            y.j(obj);
                            cVar8 = (j71.c) obj;
                            cVar4 = cVar6;
                            cVar3 = cVar5;
                            return x61.l.K(new j71.c[]{cVar3, cVar4, cVar8});
                        }
                        j71.c cVar10 = cVar7.C;
                        str12 = cVar7.B;
                        num3 = cVar7.z;
                        bool2 = cVar7.y;
                        c1 c1Var5 = cVar7.x;
                        String str15 = cVar7.u;
                        y.j(obj);
                        c1Var3 = c1Var5;
                        cVar3 = cVar10;
                        str11 = str15;
                        cVar4 = (j71.c) obj;
                        if (c1Var3.c.d) {
                            int intValue3 = num3.intValue();
                            boolean booleanValue3 = bool2.booleanValue();
                            cVar7.u = null;
                            cVar7.v = null;
                            cVar7.w = null;
                            cVar7.x = null;
                            cVar7.y = null;
                            cVar7.z = null;
                            cVar7.A = null;
                            cVar7.B = null;
                            cVar7.C = cVar3;
                            cVar7.D = cVar4;
                            cVar7.G = 5;
                            obj = c(str11, str12, intValue3, booleanValue3, cVar7);
                            if (obj != aVar2) {
                                cVar5 = cVar3;
                                cVar6 = cVar4;
                                cVar8 = (j71.c) obj;
                                cVar4 = cVar6;
                                cVar3 = cVar5;
                            }
                            return aVar2;
                        }
                        return x61.l.K(new j71.c[]{cVar3, cVar4, cVar8});
                    }
                    String str16 = cVar7.v;
                    String str17 = cVar7.u;
                    y.j(obj);
                    str3 = str16;
                    str13 = str17;
                }
                bVar = (er0.b) obj;
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
                cVar7.u = str13;
                cVar7.v = str3;
                cVar7.w = bVar;
                cVar7.x = null;
                cVar7.G = 2;
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
        cVar2 = new c(this, cVar);
        c cVar72 = cVar2;
        Object obj2 = cVar72.E;
        b71.a aVar22 = b71.a.r;
        i = cVar72.G;
        com.github.service.wrapper.b bVar32 = this.a;
        j71.c cVar82 = null;
        if (i != 0) {
        }
        bVar = (er0.b) obj2;
        if (bVar != null) {
        }
        if (str4 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, int i, boolean z, c71.c cVar) {
        d dVar;
        int i2;
        String str3;
        Object obj;
        boolean z2;
        String str4;
        int i3 = i;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i4 = dVar.B;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                dVar.B = i4 - Integer.MIN_VALUE;
                d dVar2 = dVar;
                Object obj2 = dVar2.z;
                b71.a aVar = b71.a.r;
                i2 = dVar2.B;
                a00.b bVar = this.e;
                if (i2 != 0) {
                    y.j(obj2);
                    io0.i iVar = new io0.i(str2, i3);
                    dVar2.u = str;
                    dVar2.v = str2;
                    dVar2.x = i3;
                    dVar2.y = z;
                    dVar2.B = 1;
                    Object f = bVar.f(iVar, dVar2);
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
                    e eVar = dVar2.w;
                    y.j(obj2);
                    return eVar;
                }
                boolean z3 = dVar2.y;
                i3 = dVar2.x;
                String str5 = dVar2.v;
                String str6 = dVar2.u;
                y.j(obj2);
                z2 = z3;
                obj = obj2;
                str4 = str5;
                str3 = str6;
                int i5 = i3;
                e eVar2 = new e((wn) obj, this, str4, i5, null, 0);
                io0.i iVar2 = new io0.i(str4, i5);
                q1 q1Var = new q1(3);
                sm0.a aVar2 = new sm0.a(6, str3, z2);
                dVar2.u = null;
                dVar2.v = null;
                dVar2.w = eVar2;
                dVar2.x = i5;
                dVar2.y = z2;
                dVar2.B = 2;
                return bVar.d(iVar2, q1Var, aVar2, dVar2) != aVar ? aVar : eVar2;
            }
        }
        dVar = new d(this, cVar);
        d dVar22 = dVar;
        Object obj22 = dVar22.z;
        b71.a aVar3 = b71.a.r;
        i2 = dVar22.B;
        a00.b bVar2 = this.e;
        if (i2 != 0) {
        }
        int i52 = i3;
        e eVar22 = new e((wn) obj, this, str4, i52, null, 0);
        io0.i iVar22 = new io0.i(str4, i52);
        q1 q1Var2 = new q1(3);
        sm0.a aVar22 = new sm0.a(6, str3, z2);
        dVar22.u = null;
        dVar22.v = null;
        dVar22.w = eVar22;
        dVar22.x = i52;
        dVar22.y = z2;
        dVar22.B = 2;
        if (bVar2.d(iVar22, q1Var2, aVar22, dVar22) != aVar3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, c71.c cVar) {
        f fVar;
        int i;
        io0.g gVar;
        String str3;
        gb gbVar;
        ib ibVar;
        d0 d0Var;
        boolean z;
        boolean z2;
        c0 c0Var;
        List<er0.a0> list;
        er0.i a;
        ArrayList arrayList;
        c0 a2;
        er0.a0 a0Var;
        ArrayList arrayList2;
        er0.a0 a0Var2;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i2 = fVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.z = i2 - Integer.MIN_VALUE;
                f fVar2 = fVar;
                Object obj = fVar2.x;
                b71.a aVar = b71.a.r;
                i = fVar2.z;
                a00.b bVar = this.c;
                if (i != 0) {
                    y.j(obj);
                    gVar = new io0.g(str);
                    fVar2.u = str2;
                    fVar2.v = gVar;
                    fVar2.z = 1;
                    Object f = bVar.f(gVar, fVar2);
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
                    g gVar2 = fVar2.w;
                    y.j(obj);
                    return gVar2;
                }
                gVar = fVar2.v;
                String str4 = fVar2.u;
                y.j(obj);
                str3 = str4;
                io0.g gVar3 = gVar;
                gbVar = (gb) obj;
                g gVar4 = new g(gbVar, this, gVar3, null, 0);
                if (gbVar != null) {
                    Companion.getClass();
                    k71.k.g(str3, "commentId");
                    ib ibVar2 = gbVar.a;
                    if (ibVar2 != null) {
                        d0 d0Var2 = ibVar2.d;
                        if (d0Var2 != null) {
                            er0.i iVar = d0Var2.d;
                            c0 c0Var2 = d0Var2.c;
                            List<er0.a0> list2 = c0Var2.c;
                            boolean equals = str3.equals(iVar.b);
                            if (equals) {
                                z2 = iVar.g;
                            } else if (list2 != null) {
                                if (!list2.isEmpty()) {
                                    for (er0.a0 a0Var3 : list2) {
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
                                    c0Var = c0Var2;
                                    list = list2;
                                    a = er0.i.a(iVar, z ? true : iVar.e, false, false, null, null, null, null, null, 16367);
                                } else {
                                    a = a.b(iVar);
                                    c0Var = c0Var2;
                                    list = list2;
                                }
                                if (equals) {
                                    if (list != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj2 : list) {
                                            er0.a0 a0Var4 = (er0.a0) obj2;
                                            if (!k71.k.b(a0Var4 != null ? a0Var4.b : null, str3)) {
                                                arrayList3.add(obj2);
                                            }
                                        }
                                        ArrayList arrayList4 = new ArrayList(x61.n.F(arrayList3, 10));
                                        int size = arrayList3.size();
                                        int i3 = 0;
                                        while (i3 < size) {
                                            Object obj3 = arrayList3.get(i3);
                                            i3++;
                                            er0.a0 a0Var5 = (er0.a0) obj3;
                                            if (a0Var5 != null) {
                                                Companion.getClass();
                                                a0Var2 = a.e(a0Var5, z);
                                            } else {
                                                a0Var2 = null;
                                            }
                                            arrayList4.add(a0Var2);
                                        }
                                        arrayList2 = arrayList4;
                                    } else {
                                        arrayList2 = null;
                                    }
                                    a2 = c0.a(c0Var, c0Var.b - 1, arrayList2, 1);
                                } else {
                                    if (list != null) {
                                        ArrayList arrayList5 = new ArrayList(x61.n.F(list, 10));
                                        for (er0.a0 a0Var6 : list) {
                                            if (a0Var6 != null) {
                                                Companion.getClass();
                                                a0Var = a.e(a0Var6, z);
                                            } else {
                                                a0Var = null;
                                            }
                                            arrayList5.add(a0Var);
                                        }
                                        arrayList = arrayList5;
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
                        ibVar = ib.a(ibVar2, d0Var);
                    } else {
                        ibVar = null;
                    }
                    gb a3 = gb.a(gbVar, ibVar);
                    fVar2.u = null;
                    fVar2.v = null;
                    fVar2.w = gVar4;
                    fVar2.z = 2;
                    if (bVar.j(gVar3, a3, fVar2) == aVar) {
                        return aVar;
                    }
                }
                return gVar4;
            }
        }
        fVar = new f(this, cVar);
        f fVar22 = fVar;
        Object obj4 = fVar22.x;
        b71.a aVar2 = b71.a.r;
        i = fVar22.z;
        a00.b bVar2 = this.c;
        if (i != 0) {
        }
        io0.g gVar32 = gVar;
        gbVar = (gb) obj4;
        g gVar42 = new g(gbVar, this, gVar32, null, 0);
        if (gbVar != null) {
        }
        return gVar42;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, String str3, int i, boolean z, c71.c cVar) {
        h hVar;
        int i2;
        String str4;
        int i3;
        boolean z2;
        String str5;
        Object obj;
        String str6;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i4 = hVar.C;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                hVar.C = i4 - Integer.MIN_VALUE;
                h hVar2 = hVar;
                Object obj2 = hVar2.A;
                b71.a aVar = b71.a.r;
                i2 = hVar2.C;
                a00.b bVar = this.d;
                if (i2 != 0) {
                    y.j(obj2);
                    io0.h hVar3 = new io0.h(str2, i, str3);
                    hVar2.u = str;
                    hVar2.v = str2;
                    hVar2.w = str3;
                    hVar2.y = i;
                    hVar2.z = z;
                    hVar2.C = 1;
                    Object f = bVar.f(hVar3, hVar2);
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
                    i iVar = hVar2.x;
                    y.j(obj2);
                    return iVar;
                }
                boolean z3 = hVar2.z;
                int i5 = hVar2.y;
                String str7 = hVar2.w;
                String str8 = hVar2.v;
                String str9 = hVar2.u;
                y.j(obj2);
                z2 = z3;
                obj = obj2;
                str4 = str9;
                str6 = str7;
                str5 = str8;
                i3 = i5;
                i iVar2 = new i((ob) obj, this, str5, str6, i3, null, 0);
                io0.h hVar4 = new io0.h(str5, i3, str6);
                q1 q1Var = new q1(4);
                sm0.a aVar2 = new sm0.a(7, str4, z2);
                hVar2.u = null;
                hVar2.v = null;
                hVar2.w = null;
                hVar2.x = iVar2;
                hVar2.y = i3;
                hVar2.z = z2;
                hVar2.C = 2;
                return bVar.d(hVar4, q1Var, aVar2, hVar2) != aVar ? aVar : iVar2;
            }
        }
        hVar = new h(this, cVar);
        h hVar22 = hVar;
        Object obj22 = hVar22.A;
        b71.a aVar3 = b71.a.r;
        i2 = hVar22.C;
        a00.b bVar2 = this.d;
        if (i2 != 0) {
        }
        i iVar22 = new i((ob) obj, this, str5, str6, i3, null, 0);
        io0.h hVar42 = new io0.h(str5, i3, str6);
        q1 q1Var2 = new q1(4);
        sm0.a aVar22 = new sm0.a(7, str4, z2);
        hVar22.u = null;
        hVar22.v = null;
        hVar22.w = null;
        hVar22.x = iVar22;
        hVar22.y = i3;
        hVar22.z = z2;
        hVar22.C = 2;
        if (bVar2.d(hVar42, q1Var2, aVar22, hVar22) != aVar3) {
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
        j jVar;
        int i;
        gr0.i iVar;
        gr0.i iVar2;
        gr0.h hVar;
        ArrayList arrayList;
        gr0.g gVar;
        gr0.a aVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i2 = jVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.x = i2 - Integer.MIN_VALUE;
                Object obj = jVar.v;
                b71.a aVar2 = b71.a.r;
                i = jVar.x;
                if (i != 0) {
                    y.j(obj);
                    gr0.d dVar = new gr0.d();
                    jVar.u = str2;
                    jVar.x = 1;
                    obj = this.a.c(dVar, str);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = jVar.u;
                    y.j(obj);
                }
                gr0.b bVar = (gr0.b) obj;
                iVar = (bVar != null || (aVar = bVar.b) == null) ? null : aVar.c;
                if (iVar == null) {
                    gr0.h hVar2 = iVar.f;
                    if (hVar2 != null) {
                        List<gr0.g> list = hVar2.a;
                        if (list != null) {
                            arrayList = new ArrayList(x61.n.F(list, 10));
                            for (gr0.g gVar2 : list) {
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
                                    ir0.a aVar3 = gVar2.c;
                                    String str3 = aVar3.a;
                                    gVar = new gr0.g(gVar2.a, gVar2.b, new ir0.a(i4, str3, aVar3.b, aVar3.e, str3.equals(str2)));
                                } else {
                                    gVar = null;
                                }
                                arrayList.add(gVar);
                            }
                        } else {
                            arrayList = null;
                        }
                        hVar = new gr0.h(arrayList);
                    } else {
                        hVar = null;
                    }
                    iVar2 = new gr0.i(iVar.a, iVar.b, iVar.c, iVar.d, iVar.e, hVar, iVar.g);
                } else {
                    iVar2 = null;
                }
                if (iVar2 != null) {
                    return null;
                }
                ra.Companion.getClass();
                String str4 = ((aa.q) ra.a).a;
                pa.Companion.getClass();
                return new jn0.p(new jn0.n(new jn0.r(str2, new jn0.q(((aa.q) pa.b).a, iVar2.a, iVar2), str4)));
            }
        }
        jVar = new j(this, cVar);
        Object obj2 = jVar.v;
        b71.a aVar22 = b71.a.r;
        i = jVar.x;
        if (i != 0) {
        }
        gr0.b bVar2 = (gr0.b) obj2;
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
    /* JADX WARN: Type inference failed for: r28v0, types: [xy0.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(String str, String str2, c71.c cVar) {
        k kVar;
        int i;
        String str3;
        String str4;
        String str5;
        c1 c1Var;
        String str6;
        er0.a aVar;
        ar0.d dVar;
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
        l lVar;
        int i2;
        Integer num3;
        c1 c1Var4;
        j71.c cVar3;
        String str12;
        String str13;
        String str14;
        String str15;
        c1 c1Var5;
        l lVar2;
        String str16;
        String str17;
        j71.c cVar4;
        j71.c cVar5;
        j71.c cVar6;
        j71.c cVar7;
        String str18 = str;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i3 = kVar.H;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kVar.H = i3 - Integer.MIN_VALUE;
                k kVar2 = kVar;
                Object obj = kVar2.F;
                b71.a aVar2 = b71.a.r;
                i = kVar2.H;
                com.github.service.wrapper.b bVar = this.a;
                switch (i) {
                    case 0:
                        y.j(obj);
                        er0.d dVar2 = new er0.d();
                        kVar2.u = str18;
                        str3 = str2;
                        kVar2.v = str3;
                        kVar2.H = 1;
                        obj = bVar.c(dVar2, str18);
                        break;
                    case 1:
                        String str19 = kVar2.v;
                        String str20 = kVar2.u;
                        y.j(obj);
                        str3 = str19;
                        str18 = str20;
                        er0.b bVar2 = (er0.b) obj;
                        str4 = (bVar2 == null || (aVar = bVar2.c) == null) ? null : aVar.a;
                        if (str4 != null) {
                            e1 e1Var = new e1();
                            kVar2.u = str18;
                            kVar2.v = str3;
                            kVar2.w = str4;
                            kVar2.x = null;
                            kVar2.H = 2;
                            Object c3 = bVar.c(e1Var, str4);
                            if (c3 != aVar2) {
                                str5 = str18;
                                str6 = str4;
                                obj = c3;
                                c1 c1Var6 = (c1) obj;
                                str4 = str6;
                                c1Var = c1Var6;
                                if (str4 != null) {
                                    ar0.f fVar = new ar0.f();
                                    kVar2.u = str5;
                                    kVar2.v = str3;
                                    kVar2.w = null;
                                    kVar2.x = c1Var;
                                    kVar2.y = null;
                                    kVar2.H = 3;
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
                                        kVar2.u = str5;
                                        kVar2.v = str7;
                                        kVar2.w = null;
                                        kVar2.x = c1Var2;
                                        kVar2.y = dVar;
                                        kVar2.z = num;
                                        kVar2.A = str8;
                                        kVar2.B = str9;
                                        kVar2.C = null;
                                        kVar2.H = 4;
                                        obj = j(str7, str5, kVar2);
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
                                            lVar = new l(this, dVar, null, 0);
                                        } else {
                                            c2 = 1;
                                            lVar = null;
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
                                            cVarArr[0] = lVar;
                                            cVarArr[c2] = cVar3;
                                            return x61.l.K(cVarArr);
                                        }
                                        ar0.f fVar2 = new ar0.f();
                                        ZonedDateTime now = ZonedDateTime.now();
                                        i2 = 2;
                                        w80.Companion.getClass();
                                        String str22 = ((aa.q) w80.W).a;
                                        ar0.b bVar3 = new ar0.b(str22, this.b, new kw0.a("", str22));
                                        ja.Companion.getClass();
                                        String str23 = ((aa.q) ja.c).a;
                                        ar0.a aVar3 = new ar0.a(str10, str7 != null ? new ar0.c(str7, str23) : null, str23);
                                        String str24 = dVar.a;
                                        ar0.d dVar3 = new ar0.d(str24, now, bVar3, aVar3, dVar.e);
                                        kVar2.u = str10;
                                        kVar2.v = null;
                                        kVar2.w = null;
                                        kVar2.x = c1Var3;
                                        kVar2.y = null;
                                        kVar2.z = num2;
                                        kVar2.A = str11;
                                        kVar2.B = str9;
                                        kVar2.C = cVar2;
                                        kVar2.D = lVar;
                                        kVar2.E = null;
                                        kVar2.H = 5;
                                        aVar2 = aVar2;
                                        if (bVar.p(fVar2, dVar3, str24, kVar2) != aVar2) {
                                            str14 = str9;
                                            str15 = str11;
                                            c1Var5 = c1Var3;
                                            lVar2 = lVar;
                                            lVar = lVar2;
                                            cVar3 = cVar2;
                                            str13 = str14;
                                            str12 = str15;
                                            num3 = num2;
                                            c1Var4 = c1Var5;
                                            String str212 = str10;
                                            if (num3 != null || str12 == null || str13 == null) {
                                                j71.c[] cVarArr2 = new j71.c[i2];
                                                cVarArr2[0] = lVar;
                                                cVarArr2[c2] = cVar3;
                                                return x61.l.K(cVarArr2);
                                            }
                                            int intValue = num3.intValue();
                                            kVar2.u = str212;
                                            kVar2.v = null;
                                            kVar2.w = null;
                                            kVar2.x = c1Var4;
                                            kVar2.y = null;
                                            kVar2.z = num3;
                                            kVar2.A = null;
                                            kVar2.B = str13;
                                            kVar2.C = cVar3;
                                            kVar2.D = lVar;
                                            kVar2.E = null;
                                            kVar2.H = 6;
                                            Object k = k(str212, str13, str12, intValue, kVar2);
                                            if (k != aVar2) {
                                                str16 = str212;
                                                str17 = str13;
                                                obj = k;
                                                cVar4 = lVar;
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
                                                kVar2.u = null;
                                                kVar2.v = null;
                                                kVar2.w = null;
                                                kVar2.x = null;
                                                kVar2.y = null;
                                                kVar2.z = null;
                                                kVar2.A = null;
                                                kVar2.B = null;
                                                kVar2.C = cVar3;
                                                kVar2.D = cVar4;
                                                kVar2.E = cVar5;
                                                kVar2.H = 7;
                                                obj = i(str16, str17, intValue2, kVar2);
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
                        str6 = kVar2.w;
                        str3 = kVar2.v;
                        str5 = kVar2.u;
                        y.j(obj);
                        c1 c1Var62 = (c1) obj;
                        str4 = str6;
                        c1Var = c1Var62;
                        if (str4 != null) {
                        }
                        break;
                    case 3:
                        c1Var = kVar2.x;
                        str3 = kVar2.v;
                        str5 = kVar2.u;
                        y.j(obj);
                        dVar = (ar0.d) obj;
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
                        str9 = kVar2.B;
                        str8 = kVar2.A;
                        num = kVar2.z;
                        dVar = kVar2.y;
                        c1Var2 = kVar2.x;
                        str7 = kVar2.v;
                        str5 = kVar2.u;
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
                        j71.c r1 = (j71.c) (kVar2.D);
                        cVar2 = kVar2.C;
                        str14 = kVar2.B;
                        str15 = kVar2.A;
                        num2 = kVar2.z;
                        c1Var5 = kVar2.x;
                        str10 = kVar2.u;
                        y.j(obj);
                        c = 3;
                        i2 = 2;
                        c2 = 1;
                        lVar2 = r1;
                        lVar = lVar2;
                        cVar3 = cVar2;
                        str13 = str14;
                        str12 = str15;
                        num3 = num2;
                        c1Var4 = c1Var5;
                        String str2122 = str10;
                        if (num3 != null) {
                        }
                        j71.c[] cVarArr22 = new j71.c[i2];
                        cVarArr22[0] = lVar;
                        cVarArr22[c2] = cVar3;
                        return x61.l.K(cVarArr22);
                    case 6:
                        j71.c cVar8 = kVar2.D;
                        j71.c cVar9 = kVar2.C;
                        str17 = kVar2.B;
                        num3 = kVar2.z;
                        c1Var4 = kVar2.x;
                        str16 = kVar2.u;
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
                        cVar5 = kVar2.E;
                        cVar4 = kVar2.D;
                        cVar7 = kVar2.C;
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
        kVar = new k(this, cVar);
        k kVar22 = kVar;
        Object obj2 = kVar22.F;
        b71.a aVar22 = b71.a.r;
        i = kVar22.H;
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
        m mVar;
        int i;
        String str3;
        String str4;
        String str5;
        ar0.d dVar;
        String str6;
        er0.a aVar;
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
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i2 = mVar.G;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.G = i2 - Integer.MIN_VALUE;
                m mVar2 = mVar;
                Object obj = mVar2.E;
                b71.a aVar2 = b71.a.r;
                i = mVar2.G;
                com.github.service.wrapper.b bVar = this.a;
                j71.c cVar8 = null;
                switch (i) {
                    case 0:
                        y.j(obj);
                        er0.d dVar2 = new er0.d();
                        str3 = str2;
                        mVar2.u = str3;
                        mVar2.G = 1;
                        obj = bVar.c(dVar2, str);
                        break;
                    case 1:
                        str3 = mVar2.u;
                        y.j(obj);
                        er0.b bVar2 = (er0.b) obj;
                        str4 = (bVar2 == null || (aVar = bVar2.c) == null) ? null : aVar.a;
                        if (str4 != null) {
                            ar0.f fVar = new ar0.f();
                            mVar2.u = str3;
                            mVar2.v = str4;
                            mVar2.w = null;
                            mVar2.G = 2;
                            Object c4 = bVar.c(fVar, str4);
                            if (c4 != aVar2) {
                                String str11 = str3;
                                str6 = str4;
                                obj = c4;
                                str5 = str11;
                                String str12 = str6;
                                dVar = (ar0.d) obj;
                                str4 = str12;
                                if (str4 != null) {
                                    e1 e1Var = new e1();
                                    mVar2.u = str5;
                                    mVar2.v = null;
                                    mVar2.w = dVar;
                                    mVar2.x = null;
                                    mVar2.G = 3;
                                    obj = bVar.c(e1Var, str4);
                                    break;
                                } else {
                                    c1Var = null;
                                    str7 = str5;
                                    num = c1Var == null ? new Integer(c1Var.b) : null;
                                    str8 = c1Var == null ? c1Var.c.b : null;
                                    String str13 = c1Var == null ? c1Var.c.c.b : null;
                                    c = 0;
                                    l lVar = dVar == null ? new l(this, dVar, null, 1) : null;
                                    c2 = 3;
                                    if (dVar == null) {
                                        ar0.f fVar2 = new ar0.f();
                                        c3 = 1;
                                        String str14 = dVar.a;
                                        ar0.d dVar3 = new ar0.d(str14, null, null, null, dVar.e);
                                        mVar2.u = str7;
                                        mVar2.v = null;
                                        mVar2.w = null;
                                        mVar2.x = c1Var;
                                        mVar2.y = num;
                                        mVar2.z = str8;
                                        mVar2.A = str13;
                                        mVar2.B = lVar;
                                        mVar2.C = null;
                                        mVar2.G = 4;
                                        break;
                                    } else {
                                        c3 = 1;
                                    }
                                    str9 = str13;
                                    cVar2 = lVar;
                                    if (str7 != null) {
                                        mVar2.u = null;
                                        mVar2.v = null;
                                        mVar2.w = null;
                                        mVar2.x = c1Var;
                                        mVar2.y = num;
                                        mVar2.z = str8;
                                        mVar2.A = str9;
                                        mVar2.B = cVar2;
                                        mVar2.C = null;
                                        mVar2.G = 5;
                                        obj = j(str7, null, mVar2);
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
                                        mVar2.u = null;
                                        mVar2.v = null;
                                        mVar2.w = null;
                                        mVar2.x = c1Var;
                                        mVar2.y = num;
                                        mVar2.z = null;
                                        mVar2.A = str15;
                                        mVar2.B = cVar4;
                                        mVar2.C = cVar3;
                                        mVar2.G = 6;
                                        obj = k(null, str15, str16, intValue, mVar2);
                                        if (obj != aVar2) {
                                            str10 = str15;
                                            cVar5 = cVar3;
                                            cVar6 = (j71.c) obj;
                                            if (c1Var.c.d) {
                                                int intValue2 = num.intValue();
                                                mVar2.u = null;
                                                mVar2.v = null;
                                                mVar2.w = null;
                                                mVar2.x = null;
                                                mVar2.y = null;
                                                mVar2.z = null;
                                                mVar2.A = null;
                                                mVar2.B = cVar4;
                                                mVar2.C = cVar5;
                                                mVar2.D = cVar6;
                                                mVar2.G = 7;
                                                obj = i(null, str10, intValue2, mVar2);
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
                        str6 = mVar2.v;
                        str5 = mVar2.u;
                        y.j(obj);
                        String str122 = str6;
                        dVar = (ar0.d) obj;
                        str4 = str122;
                        if (str4 != null) {
                        }
                        break;
                    case 3:
                        dVar = mVar2.w;
                        str5 = mVar2.u;
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
                        cVar2 = lVar;
                        if (str7 != null) {
                        }
                        break;
                    case 4:
                        cVar2 = mVar2.B;
                        str9 = mVar2.A;
                        str8 = mVar2.z;
                        num = mVar2.y;
                        c1Var = mVar2.x;
                        str7 = mVar2.u;
                        y.j(obj);
                        c2 = 3;
                        c3 = 1;
                        c = 0;
                        if (str7 != null) {
                        }
                        break;
                    case 5:
                        cVar2 = mVar2.B;
                        str9 = mVar2.A;
                        str8 = mVar2.z;
                        num = mVar2.y;
                        c1Var = mVar2.x;
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
                        j71.c cVar9 = mVar2.C;
                        j71.c cVar10 = mVar2.B;
                        str10 = mVar2.A;
                        num = mVar2.y;
                        c1Var = mVar2.x;
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
                        cVar6 = mVar2.D;
                        cVar5 = mVar2.C;
                        cVar7 = mVar2.B;
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
        mVar = new m(this, cVar);
        m mVar22 = mVar;
        Object obj2 = mVar22.E;
        b71.a aVar22 = b71.a.r;
        i = mVar22.G;
        com.github.service.wrapper.b bVar3 = this.a;
        j71.c cVar82 = null;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, String str2, int i, c71.c cVar) {
        n nVar;
        int i2;
        String str3;
        int i3;
        Object obj;
        String str4;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i4 = nVar.A;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                nVar.A = i4 - Integer.MIN_VALUE;
                n nVar2 = nVar;
                Object obj2 = nVar2.y;
                b71.a aVar = b71.a.r;
                i2 = nVar2.A;
                a00.b bVar = this.e;
                if (i2 != 0) {
                    y.j(obj2);
                    io0.i iVar = new io0.i(str2, i);
                    nVar2.u = str;
                    nVar2.v = str2;
                    nVar2.x = i;
                    nVar2.A = 1;
                    Object f = bVar.f(iVar, nVar2);
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
                    e eVar = nVar2.w;
                    y.j(obj2);
                    return eVar;
                }
                int i5 = nVar2.x;
                String str5 = nVar2.v;
                String str6 = nVar2.u;
                y.j(obj2);
                str3 = str6;
                i3 = i5;
                obj = obj2;
                str4 = str5;
                e eVar2 = new e((wn) obj, this, str4, i3, null, 1);
                io0.i iVar2 = new io0.i(str4, i3);
                q1 q1Var = new q1(2);
                tj.b bVar2 = new tj.b(str3, 15);
                nVar2.u = null;
                nVar2.v = null;
                nVar2.w = eVar2;
                nVar2.x = i3;
                nVar2.A = 2;
                return bVar.d(iVar2, q1Var, bVar2, nVar2) != aVar ? aVar : eVar2;
            }
        }
        nVar = new n(this, cVar);
        n nVar22 = nVar;
        Object obj22 = nVar22.y;
        b71.a aVar2 = b71.a.r;
        i2 = nVar22.A;
        a00.b bVar3 = this.e;
        if (i2 != 0) {
        }
        e eVar22 = new e((wn) obj, this, str4, i3, null, 1);
        io0.i iVar22 = new io0.i(str4, i3);
        q1 q1Var2 = new q1(2);
        tj.b bVar22 = new tj.b(str3, 15);
        nVar22.u = null;
        nVar22.v = null;
        nVar22.w = eVar22;
        nVar22.x = i3;
        nVar22.A = 2;
        if (bVar3.d(iVar22, q1Var2, bVar22, nVar22) != aVar2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, String str2, c71.c cVar) {
        o oVar;
        int i;
        io0.g gVar;
        String str3;
        gb gbVar;
        ib ibVar;
        d0 d0Var;
        ArrayList arrayList;
        er0.a0 a0Var;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i2 = oVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.z = i2 - Integer.MIN_VALUE;
                o oVar2 = oVar;
                Object obj = oVar2.x;
                b71.a aVar = b71.a.r;
                i = oVar2.z;
                a00.b bVar = this.c;
                if (i != 0) {
                    y.j(obj);
                    gVar = new io0.g(str);
                    oVar2.u = str2;
                    oVar2.v = gVar;
                    oVar2.z = 1;
                    Object f = bVar.f(gVar, oVar2);
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
                    g gVar2 = oVar2.w;
                    y.j(obj);
                    return gVar2;
                }
                gVar = oVar2.v;
                String str4 = oVar2.u;
                y.j(obj);
                str3 = str4;
                io0.g gVar3 = gVar;
                gbVar = (gb) obj;
                g gVar4 = new g(gbVar, this, gVar3, null, 1);
                if (gbVar != null) {
                    Companion.getClass();
                    ib ibVar2 = gbVar.a;
                    if (ibVar2 != null) {
                        d0 d0Var2 = ibVar2.d;
                        if (d0Var2 != null) {
                            er0.i c = a.c(d0Var2.d, str3);
                            c0 c0Var = d0Var2.c;
                            List<er0.a0> list = c0Var.c;
                            if (list != null) {
                                arrayList = new ArrayList(x61.n.F(list, 10));
                                for (er0.a0 a0Var2 : list) {
                                    if (a0Var2 != null) {
                                        a aVar2 = Companion;
                                        er0.v vVar = a0Var2.c;
                                        aVar2.getClass();
                                        a0Var = er0.a0.a(a0Var2, a.d(vVar, str3));
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
                        ibVar = ib.a(ibVar2, d0Var);
                    } else {
                        ibVar = null;
                    }
                    gb a = gb.a(gbVar, ibVar);
                    oVar2.u = null;
                    oVar2.v = null;
                    oVar2.w = gVar4;
                    oVar2.z = 2;
                    if (bVar.j(gVar3, a, oVar2) == aVar) {
                        return aVar;
                    }
                }
                return gVar4;
            }
        }
        oVar = new o(this, cVar);
        o oVar22 = oVar;
        Object obj2 = oVar22.x;
        b71.a aVar3 = b71.a.r;
        i = oVar22.z;
        a00.b bVar2 = this.c;
        if (i != 0) {
        }
        io0.g gVar32 = gVar;
        gbVar = (gb) obj2;
        g gVar42 = new g(gbVar, this, gVar32, null, 1);
        if (gbVar != null) {
        }
        return gVar42;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, String str2, String str3, int i, c71.c cVar) {
        p pVar;
        int i2;
        String str4;
        int i3;
        String str5;
        String str6 = str3;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i4 = pVar.B;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pVar.B = i4 - Integer.MIN_VALUE;
                p pVar2 = pVar;
                Object obj = pVar2.z;
                b71.a aVar = b71.a.r;
                i2 = pVar2.B;
                a00.b bVar = this.d;
                if (i2 != 0) {
                    y.j(obj);
                    io0.h hVar = new io0.h(str2, i, str6);
                    pVar2.u = str;
                    pVar2.v = str2;
                    pVar2.w = str6;
                    pVar2.y = i;
                    pVar2.B = 1;
                    obj = bVar.f(hVar, pVar2);
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
                    i iVar = pVar2.x;
                    y.j(obj);
                    return iVar;
                }
                int i5 = pVar2.y;
                str6 = pVar2.w;
                str5 = pVar2.v;
                String str7 = pVar2.u;
                y.j(obj);
                str4 = str7;
                i3 = i5;
                Object obj2 = obj;
                String str8 = str6;
                i iVar2 = new i((ob) obj2, this, str5, str8, i3, null, 1);
                io0.h hVar2 = new io0.h(str5, i3, str8);
                q1 q1Var = new q1(5);
                tj.b bVar2 = new tj.b(str4, 16);
                pVar2.u = null;
                pVar2.v = null;
                pVar2.w = null;
                pVar2.x = iVar2;
                pVar2.y = i3;
                pVar2.B = 2;
                return bVar.d(hVar2, q1Var, bVar2, pVar2) != aVar ? aVar : iVar2;
            }
        }
        pVar = new p(this, cVar);
        p pVar22 = pVar;
        Object obj3 = pVar22.z;
        b71.a aVar2 = b71.a.r;
        i2 = pVar22.B;
        a00.b bVar3 = this.d;
        if (i2 != 0) {
        }
        Object obj22 = obj3;
        String str82 = str6;
        i iVar22 = new i((ob) obj22, this, str5, str82, i3, null, 1);
        io0.h hVar22 = new io0.h(str5, i3, str82);
        q1 q1Var2 = new q1(5);
        tj.b bVar22 = new tj.b(str4, 16);
        pVar22.u = null;
        pVar22.v = null;
        pVar22.w = null;
        pVar22.x = iVar22;
        pVar22.y = i3;
        pVar22.B = 2;
        if (bVar3.d(hVar22, q1Var2, bVar22, pVar22) != aVar2) {
        }
    }
}
