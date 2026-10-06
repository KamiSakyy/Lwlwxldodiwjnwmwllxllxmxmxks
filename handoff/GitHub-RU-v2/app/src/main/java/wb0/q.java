package wb0;

import aa.i0;
import aa.v0;
import e50.d1;
import e50.y0;
import e50.z0;
import hc0.c9;
import hc0.e9;
import hc0.kz;
import hc0.w8;
import i50.b0;
import i50.c0;
import i50.u;
import i50.z;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import sy.y;
import u10.bl;
import u10.eaShadow;
import u10.ga;
import u10.ma;
import w61.a0;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q {
    public static final a Companion = new a();
    public final com.github.service.wrapper.b a;
    public final String b;
    public final jy.d c;
    public final jy.d d;
    public final jy.d e;

    public q(com.github.service.wrapper.b bVar, String str, jy.d dVar, jy.d dVar2, jy.d dVar3) {
        k71.k.g(bVar, "cachedClient");
        k71.k.g(str, "userLogin");
        this.a = bVar;
        this.b = str;
        this.c = dVar;
        this.d = dVar2;
        this.e = dVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005e, code lost:
    
        if (r13 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, i50.h hVar, c71.c cVar) {
        b bVar;
        b71.a aVar;
        int i;
        y0 y0Var;
        Integer num;
        String str2;
        String str3;
        s20.g gVar;
        e50.n a;
        i50.h hVar2;
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
                    i0 z0Var = new z0(0);
                    bVar.u = hVar;
                    bVar.A = 1;
                    obj = this.a.c(z0Var, str);
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
                        y0Var = bVar.v;
                        hVar2 = bVar.u;
                        y.j(obj);
                        if (y0Var.c.d) {
                            s20.h hVar3 = new s20.h(str4, num2.intValue());
                            e50.n a2 = a.a(Companion, hVar2);
                            bVar.u = null;
                            bVar.v = null;
                            bVar.w = null;
                            bVar.x = null;
                            bVar.A = 3;
                            if (this.e.a(hVar3, a2, bVar) == aVar) {
                                return aVar;
                            }
                        }
                        return a0Var;
                    }
                    hVar = bVar.u;
                    y.j(obj);
                }
                y0Var = (y0) obj;
                num = y0Var == null ? new Integer(y0Var.b) : null;
                str2 = y0Var == null ? y0Var.c.b : null;
                str3 = y0Var == null ? y0Var.c.c.b : null;
                if (num != null && str2 != null && str3 != null) {
                    gVar = new s20.g(str3, num.intValue(), str2);
                    a = a.a(Companion, hVar);
                    bVar.u = hVar;
                    bVar.v = y0Var;
                    bVar.w = num;
                    bVar.x = str3;
                    bVar.A = 2;
                    if (this.d.a(gVar, a, bVar) != aVar) {
                        hVar2 = hVar;
                        num2 = num;
                        str4 = str3;
                        if (y0Var.c.d) {
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
        y0Var = (y0) obj2;
        if (y0Var == null) {
        }
        if (y0Var == null) {
        }
        if (y0Var == null) {
        }
        if (num != null) {
            gVar = new s20.g(str3, num.intValue(), str2);
            a = a.a(Companion, hVar);
            bVar.u = hVar;
            bVar.v = y0Var;
            bVar.w = num;
            bVar.x = str3;
            bVar.A = 2;
            if (this.d.a(gVar, a, bVar) != aVar) {
            }
            return aVar;
        }
        return a0Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00a3, code lost:
    
        if (r2 == r7) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0171  */
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
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(String str, String str2, c71.c cVar) {
        c cVar2;
        int i;
        String str3;
        i50.b bVar;
        String str4;
        String str5;
        y0 y0Var;
        String str6;
        i50.b bVar2;
        i50.a aVar;
        Boolean valueOf;
        Integer num;
        String str7;
        Integer num2;
        y0 y0Var2;
        Boolean bool;
        String str8;
        String str9;
        j71.c cVar3;
        String str10;
        Object e;
        String str11;
        Integer num3;
        Boolean bool2;
        y0 y0Var3;
        j71.c cVar4;
        j71.c cVar5;
        j71.c cVar6;
        String str12 = str;
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
                    i50.c cVar9 = new i50.c(0);
                    cVar7.u = str12;
                    str3 = str2;
                    cVar7.v = str3;
                    cVar7.G = 1;
                    obj = bVar3.c(cVar9, str12);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            String str13 = cVar7.x;
                            bVar2 = cVar7.w;
                            str3 = cVar7.v;
                            str6 = cVar7.u;
                            y.j(obj);
                            y0Var = (y0) obj;
                            str5 = str6;
                            bVar = bVar2;
                            valueOf = bVar != null ? Boolean.valueOf(bVar.b) : null;
                            num = y0Var != null ? new Integer(y0Var.b) : null;
                            String str14 = y0Var != null ? y0Var.c.b : null;
                            str7 = y0Var != null ? y0Var.c.c.b : null;
                            if (valueOf != null || num == null || str14 == null || str7 == null) {
                                return r.r;
                            }
                            if (str3 == null) {
                                Boolean bool3 = valueOf;
                                num2 = num;
                                y0Var2 = y0Var;
                                bool = bool3;
                                str8 = str14;
                                str9 = str5;
                                cVar3 = null;
                                int intValue = num2.intValue();
                                boolean booleanValue = bool.booleanValue();
                                cVar7.u = str9;
                                cVar7.v = null;
                                cVar7.w = null;
                                cVar7.x = y0Var2;
                                cVar7.y = bool;
                                cVar7.z = num2;
                                cVar7.A = null;
                                cVar7.B = str7;
                                cVar7.C = cVar3;
                                cVar7.G = 4;
                                y0 y0Var4 = y0Var2;
                                e = e(str9, str7, str8, intValue, booleanValue, cVar7);
                                cVar7 = cVar7;
                                if (e != aVar2) {
                                }
                                return aVar2;
                            }
                            cVar7.u = str5;
                            cVar7.v = null;
                            cVar7.w = null;
                            cVar7.x = y0Var;
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
                                j71.c cVar10 = (j71.c) obj;
                                str7 = str10;
                                str9 = str5;
                                cVar3 = cVar10;
                                Boolean bool4 = valueOf;
                                num2 = num;
                                y0Var2 = y0Var;
                                bool = bool4;
                                int intValue2 = num2.intValue();
                                boolean booleanValue2 = bool.booleanValue();
                                cVar7.u = str9;
                                cVar7.v = null;
                                cVar7.w = null;
                                cVar7.x = y0Var2;
                                cVar7.y = bool;
                                cVar7.z = num2;
                                cVar7.A = null;
                                cVar7.B = str7;
                                cVar7.C = cVar3;
                                cVar7.G = 4;
                                y0 y0Var42 = y0Var2;
                                e = e(str9, str7, str8, intValue2, booleanValue2, cVar7);
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
                            y0Var = cVar7.x;
                            str5 = cVar7.u;
                            y.j(obj);
                            j71.c cVar102 = (j71.c) obj;
                            str7 = str10;
                            str9 = str5;
                            cVar3 = cVar102;
                            Boolean bool42 = valueOf;
                            num2 = num;
                            y0Var2 = y0Var;
                            bool = bool42;
                            int intValue22 = num2.intValue();
                            boolean booleanValue22 = bool.booleanValue();
                            cVar7.u = str9;
                            cVar7.v = null;
                            cVar7.w = null;
                            cVar7.x = y0Var2;
                            cVar7.y = bool;
                            cVar7.z = num2;
                            cVar7.A = null;
                            cVar7.B = str7;
                            cVar7.C = cVar3;
                            cVar7.G = 4;
                            y0 y0Var422 = y0Var2;
                            e = e(str9, str7, str8, intValue22, booleanValue22, cVar7);
                            cVar7 = cVar7;
                            if (e != aVar2) {
                                str11 = str7;
                                obj = e;
                                num3 = num2;
                                bool2 = bool;
                                y0Var3 = y0Var422;
                                cVar4 = (j71.c) obj;
                                if (y0Var3.c.d) {
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
                        j71.c cVar11 = cVar7.C;
                        str11 = cVar7.B;
                        num3 = cVar7.z;
                        bool2 = cVar7.y;
                        y0Var3 = cVar7.x;
                        String str15 = cVar7.u;
                        y.j(obj);
                        cVar3 = cVar11;
                        str9 = str15;
                        cVar4 = (j71.c) obj;
                        if (y0Var3.c.d) {
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
                            obj = c(str9, str11, intValue3, booleanValue3, cVar7);
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
                    str12 = str17;
                }
                bVar = (i50.b) obj;
                str4 = (bVar != null || (aVar = bVar.c) == null) ? null : aVar.a;
                if (str4 != null) {
                    str5 = str12;
                    y0Var = null;
                    if (bVar != null) {
                    }
                    if (y0Var != null) {
                    }
                    if (y0Var != null) {
                    }
                    if (y0Var != null) {
                    }
                    if (valueOf != null) {
                    }
                    return r.r;
                }
                z0 z0Var = new z0(0);
                cVar7.u = str12;
                cVar7.v = str3;
                cVar7.w = bVar;
                cVar7.x = null;
                cVar7.G = 2;
                Object c = bVar3.c(z0Var, str4);
                if (c != aVar2) {
                    str6 = str12;
                    bVar2 = bVar;
                    obj = c;
                    y0Var = (y0) obj;
                    str5 = str6;
                    bVar = bVar2;
                    if (bVar != null) {
                    }
                    if (y0Var != null) {
                    }
                    if (y0Var != null) {
                    }
                    if (y0Var != null) {
                    }
                    if (valueOf != null) {
                    }
                    return r.r;
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
        bVar = (i50.b) obj2;
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
                jy.d dVar3 = this.e;
                if (i2 != 0) {
                    y.j(obj2);
                    s20.h hVar = new s20.h(str2, i3);
                    dVar2.u = str;
                    dVar2.v = str2;
                    dVar2.x = i3;
                    dVar2.y = z;
                    dVar2.B = 1;
                    Object f = dVar3.f(hVar, dVar2);
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
                e eVar2 = new e((bl) obj, this, str4, i5, null, 0);
                s20.h hVar2 = new s20.h(str4, i5);
                wa.g gVar = new wa.g(4);
                sm0.a aVar2 = new sm0.a(4, str3, z2);
                dVar2.u = null;
                dVar2.v = null;
                dVar2.w = eVar2;
                dVar2.x = i5;
                dVar2.y = z2;
                dVar2.B = 2;
                return dVar3.d(hVar2, gVar, aVar2, dVar2) != aVar ? aVar : eVar2;
            }
        }
        dVar = new d(this, cVar);
        d dVar22 = dVar;
        Object obj22 = dVar22.z;
        b71.a aVar3 = b71.a.r;
        i2 = dVar22.B;
        jy.d dVar32 = this.e;
        if (i2 != 0) {
        }
        int i52 = i3;
        e eVar22 = new e((bl) obj, this, str4, i52, null, 0);
        s20.h hVar22 = new s20.h(str4, i52);
        wa.g gVar2 = new wa.g(4);
        sm0.a aVar22 = new sm0.a(4, str3, z2);
        dVar22.u = null;
        dVar22.v = null;
        dVar22.w = eVar22;
        dVar22.x = i52;
        dVar22.y = z2;
        dVar22.B = 2;
        if (dVar32.d(hVar22, gVar2, aVar22, dVar22) != aVar3) {
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
        f fVar;
        int i;
        s20.f fVar2;
        String str3;
        eaShadow eaVar;
        ga gaVar;
        c0 c0Var;
        boolean z;
        boolean z2;
        List<z> list;
        i50.h a;
        ArrayList arrayList;
        b0 a2;
        z zVar;
        ArrayList arrayList2;
        z zVar2;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i2 = fVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.z = i2 - Integer.MIN_VALUE;
                f fVar3 = fVar;
                Object obj = fVar3.x;
                b71.a aVar = b71.a.r;
                i = fVar3.z;
                jy.d dVar = this.c;
                if (i != 0) {
                    y.j(obj);
                    fVar2 = new s20.f(str);
                    fVar3.u = str2;
                    fVar3.v = fVar2;
                    fVar3.z = 1;
                    Object f = dVar.f(fVar2, fVar3);
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
                    g gVar = fVar3.w;
                    y.j(obj);
                    return gVar;
                }
                fVar2 = fVar3.v;
                String str4 = fVar3.u;
                y.j(obj);
                str3 = str4;
                s20.f fVar4 = fVar2;
                eaVar = (eaShadow) obj;
                g gVar2 = new g(eaVar, this, fVar4, null, 0);
                if (eaVar != null) {
                    Companion.getClass();
                    k71.k.g(str3, "commentId");
                    ga gaVar2 = eaVar.a;
                    if (gaVar2 != null) {
                        c0 c0Var2 = gaVar2.d;
                        if (c0Var2 != null) {
                            i50.h hVar = c0Var2.d;
                            b0 b0Var = c0Var2.c;
                            List<z> list2 = b0Var.c;
                            boolean equals = str3.equals(hVar.b);
                            if (equals) {
                                z2 = hVar.g;
                            } else if (list2 != null) {
                                if (!list2.isEmpty()) {
                                    for (z zVar3 : list2) {
                                        if (k71.k.b(zVar3 != null ? zVar3.b : null, str3) && zVar3.c.e) {
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
                                    a = i50.h.a(hVar, z ? true : hVar.e, false, false, (ZonedDateTime) null, (c40.c) null, (g70.a) null, (y60.a) null, (d1) null, 16367);
                                } else {
                                    a = a.b(hVar);
                                    list = list2;
                                }
                                if (equals) {
                                    if (list != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj2 : list) {
                                            z zVar4 = (z) obj2;
                                            if (!k71.k.b(zVar4 != null ? zVar4.b : null, str3)) {
                                                arrayList3.add(obj2);
                                            }
                                        }
                                        arrayList2 = new ArrayList(x61.n.F(arrayList3, 10));
                                        int size = arrayList3.size();
                                        int i3 = 0;
                                        while (i3 < size) {
                                            Object obj3 = arrayList3.get(i3);
                                            i3++;
                                            z zVar5 = (z) obj3;
                                            if (zVar5 != null) {
                                                Companion.getClass();
                                                zVar2 = a.e(zVar5, z);
                                            } else {
                                                zVar2 = null;
                                            }
                                            arrayList2.add(zVar2);
                                        }
                                    } else {
                                        arrayList2 = null;
                                    }
                                    a2 = b0.a(b0Var, b0Var.b - 1, arrayList2, 1);
                                } else {
                                    if (list != null) {
                                        ArrayList arrayList4 = new ArrayList(x61.n.F(list, 10));
                                        for (z zVar6 : list) {
                                            if (zVar6 != null) {
                                                Companion.getClass();
                                                zVar = a.e(zVar6, z);
                                            } else {
                                                zVar = null;
                                            }
                                            arrayList4.add(zVar);
                                        }
                                        arrayList = arrayList4;
                                    } else {
                                        arrayList = null;
                                    }
                                    a2 = b0.a(b0Var, 0, arrayList, 3);
                                }
                                c0Var = c0.a(c0Var2, a2, a, 19);
                            }
                            z = z2;
                            if (equals) {
                            }
                            if (equals) {
                            }
                            c0Var = c0.a(c0Var2, a2, a, 19);
                        } else {
                            c0Var = null;
                        }
                        gaVar = ga.a(gaVar2, c0Var);
                    } else {
                        gaVar = null;
                    }
                    v0 eaVar2 = new eaShadow(gaVar);
                    fVar3.u = null;
                    fVar3.v = null;
                    fVar3.w = gVar2;
                    fVar3.z = 2;
                    if (dVar.j(fVar4, eaVar2, fVar3) == aVar) {
                        return aVar;
                    }
                }
                return gVar2;
            }
        }
        fVar = new f(this, cVar);
        f fVar32 = fVar;
        Object obj4 = fVar32.x;
        b71.a aVar2 = b71.a.r;
        i = fVar32.z;
        jy.d dVar2 = this.c;
        if (i != 0) {
        }
        s20.f fVar42 = fVar2;
        eaVar = (eaShadow) obj4;
        g gVar22 = new g(eaVar, this, fVar42, null, 0);
        if (eaVar != null) {
        }
        return gVar22;
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
                jy.d dVar = this.d;
                if (i2 != 0) {
                    y.j(obj2);
                    s20.g gVar = new s20.g(str2, i, str3);
                    hVar2.u = str;
                    hVar2.v = str2;
                    hVar2.w = str3;
                    hVar2.y = i;
                    hVar2.z = z;
                    hVar2.C = 1;
                    Object f = dVar.f(gVar, hVar2);
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
                i iVar2 = new i((ma) obj, this, str5, str6, i3, null, 0);
                s20.g gVar2 = new s20.g(str5, i3, str6);
                wa.g gVar3 = new wa.g(5);
                sm0.a aVar2 = new sm0.a(5, str4, z2);
                hVar2.u = null;
                hVar2.v = null;
                hVar2.w = null;
                hVar2.x = iVar2;
                hVar2.y = i3;
                hVar2.z = z2;
                hVar2.C = 2;
                return dVar.d(gVar2, gVar3, aVar2, hVar2) != aVar ? aVar : iVar2;
            }
        }
        hVar = new h(this, cVar);
        h hVar22 = hVar;
        Object obj22 = hVar22.A;
        b71.a aVar3 = b71.a.r;
        i2 = hVar22.C;
        jy.d dVar2 = this.d;
        if (i2 != 0) {
        }
        i iVar22 = new i((ma) obj, this, str5, str6, i3, null, 0);
        s20.g gVar22 = new s20.g(str5, i3, str6);
        wa.g gVar32 = new wa.g(5);
        sm0.a aVar22 = new sm0.a(5, str4, z2);
        hVar22.u = null;
        hVar22.v = null;
        hVar22.w = null;
        hVar22.x = iVar22;
        hVar22.y = i3;
        hVar22.z = z2;
        hVar22.C = 2;
        if (dVar2.d(gVar22, gVar32, aVar22, hVar22) != aVar3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, String str2, c71.c cVar) {
        j jVar;
        int i;
        k50.h hVar;
        k50.h hVar2;
        k50.g gVar;
        ArrayList arrayList;
        k50.f fVar;
        k50.a aVar;
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
                    i0 cVar2 = new k50.c(0);
                    jVar.u = str2;
                    jVar.x = 1;
                    obj = this.a.c(cVar2, str);
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
                k50.b bVar = (k50.b) obj;
                hVar = (bVar != null || (aVar = bVar.b) == null) ? null : aVar.c;
                if (hVar == null) {
                    k50.g gVar2 = hVar.f;
                    if (gVar2 != null) {
                        List<k50.f> list = gVar2.a;
                        if (list != null) {
                            arrayList = new ArrayList(x61.n.F(list, 10));
                            for (k50.f fVar2 : list) {
                                int i3 = fVar2 != null ? fVar2.c.d : 0;
                                if (k71.k.b(fVar2 != null ? fVar2.b : null, str2)) {
                                    if (!fVar2.c.c) {
                                        i3++;
                                    }
                                } else if (fVar2 != null && fVar2.c.c) {
                                    i3--;
                                }
                                int i4 = i3;
                                if (fVar2 != null) {
                                    m50.a aVar3 = fVar2.c;
                                    String str3 = aVar3.a;
                                    fVar = new k50.f(fVar2.a, fVar2.b, new m50.a(i4, str3, aVar3.b, aVar3.e, str3.equals(str2)));
                                } else {
                                    fVar = null;
                                }
                                arrayList.add(fVar);
                            }
                        } else {
                            arrayList = null;
                        }
                        gVar = new k50.g(arrayList);
                    } else {
                        gVar = null;
                    }
                    hVar2 = new k50.h(hVar.a, hVar.b, hVar.c, hVar.d, hVar.e, gVar, hVar.g);
                } else {
                    hVar2 = null;
                }
                if (hVar2 != null) {
                    return null;
                }
                e9.Companion.getClass();
                String str4 = ((aa.q) e9.a).a;
                c9.Companion.getClass();
                return new u10.p(new u10.n(new u10.r(str2, new u10.q(((aa.q) c9.b).a, hVar2.a, hVar2), str4)));
            }
        }
        jVar = new j(this, cVar);
        Object obj2 = jVar.v;
        b71.a aVar22 = b71.a.r;
        i = jVar.x;
        if (i != 0) {
        }
        k50.b bVar2 = (k50.b) obj2;
        if (bVar2 != null) {
        }
        if (hVar == null) {
        }
        if (hVar2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x016b, code lost:
    
        if (r2 == r6) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0124, code lost:
    
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
    /* JADX WARN: Removed duplicated region for block: B:28:0x021f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r1v40, types: [j71.c] */
    /* JADX WARN: Type inference failed for: r29v0, types: [wb0.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable g(String str, String str2, c71.c cVar) {
        k kVar;
        int i;
        String str3;
        String str4;
        String str5;
        y0 y0Var;
        String str6;
        i50.a aVar;
        e50.d dVar;
        y0 y0Var2;
        String str7;
        String str8;
        Integer num;
        String str9;
        String str10;
        Integer num2;
        String str11;
        y0 y0Var3;
        String str12;
        j71.c cVar2;
        char c;
        l lVar;
        int i2;
        char c2;
        String str13;
        String str14;
        j71.c cVar3;
        String str15;
        Integer num3;
        y0 y0Var4;
        String str16;
        String str17;
        y0 y0Var5;
        l lVar2;
        String str18;
        String str19;
        j71.c cVar4;
        j71.c cVar5;
        j71.c cVar6;
        j71.c cVar7;
        String str20 = str;
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
                        i50.c cVar8 = new i50.c(0);
                        kVar2.u = str20;
                        str3 = str2;
                        kVar2.v = str3;
                        kVar2.H = 1;
                        obj = bVar.c(cVar8, str20);
                        break;
                    case 1:
                        String str21 = kVar2.v;
                        String str22 = kVar2.u;
                        y.j(obj);
                        str3 = str21;
                        str20 = str22;
                        i50.b bVar2 = (i50.b) obj;
                        str4 = (bVar2 == null || (aVar = bVar2.c) == null) ? null : aVar.a;
                        if (str4 != null) {
                            z0 z0Var = new z0(0);
                            kVar2.u = str20;
                            kVar2.v = str3;
                            kVar2.w = str4;
                            kVar2.x = null;
                            kVar2.H = 2;
                            Object c3 = bVar.c(z0Var, str4);
                            if (c3 != aVar2) {
                                str5 = str20;
                                str6 = str4;
                                obj = c3;
                                y0 y0Var6 = (y0) obj;
                                str4 = str6;
                                y0Var = y0Var6;
                                if (str4 != null) {
                                    e50.e eVar = new e50.e(0);
                                    kVar2.u = str5;
                                    kVar2.v = str3;
                                    kVar2.w = null;
                                    kVar2.x = y0Var;
                                    kVar2.y = null;
                                    kVar2.H = 3;
                                    obj = bVar.c(eVar, str4);
                                    break;
                                } else {
                                    dVar = null;
                                    y0Var2 = y0Var;
                                    str7 = str3;
                                    str8 = str5;
                                    num = y0Var2 == null ? new Integer(y0Var2.b) : null;
                                    str9 = y0Var2 == null ? y0Var2.c.b : null;
                                    str10 = y0Var2 == null ? y0Var2.c.c.b : null;
                                    if (str7 == null) {
                                        kVar2.u = str8;
                                        kVar2.v = str7;
                                        kVar2.w = null;
                                        kVar2.x = y0Var2;
                                        kVar2.y = dVar;
                                        kVar2.z = num;
                                        kVar2.A = str9;
                                        kVar2.B = str10;
                                        kVar2.C = null;
                                        kVar2.H = 4;
                                        obj = j(str7, str8, kVar2);
                                        break;
                                    } else {
                                        num2 = num;
                                        str11 = str8;
                                        y0Var3 = y0Var2;
                                        str12 = str9;
                                        cVar2 = null;
                                        c = 1;
                                        lVar = dVar == null ? new l(this, dVar, null, 0) : null;
                                        i2 = 2;
                                        if (dVar != null) {
                                            c2 = 0;
                                            String str23 = str12;
                                            str13 = str10;
                                            str14 = str11;
                                            cVar3 = cVar2;
                                            str15 = str23;
                                            num3 = num2;
                                            y0Var4 = y0Var3;
                                            if (num3 != null) {
                                            }
                                            j71.c[] cVarArr = new j71.c[i2];
                                            cVarArr[c2] = lVar;
                                            cVarArr[c] = cVar3;
                                            return x61.l.K(cVarArr);
                                        }
                                        e50.e eVar2 = new e50.e(0);
                                        ZonedDateTime now = ZonedDateTime.now();
                                        c2 = 0;
                                        kz.Companion.getClass();
                                        String str24 = ((aa.q) kz.O).a;
                                        e50.b bVar3 = new e50.b(str24, this.b, new ja0.a("", str24));
                                        w8.Companion.getClass();
                                        String str25 = ((aa.q) w8.c).a;
                                        e50.a aVar3 = new e50.a(str11, str7 != null ? new e50.c(str7, str25) : null, str25);
                                        String str26 = dVar.a;
                                        e50.d dVar2 = new e50.d(str26, now, bVar3, aVar3, dVar.e);
                                        kVar2.u = str11;
                                        kVar2.v = null;
                                        kVar2.w = null;
                                        kVar2.x = y0Var3;
                                        kVar2.y = null;
                                        kVar2.z = num2;
                                        kVar2.A = str12;
                                        kVar2.B = str10;
                                        kVar2.C = cVar2;
                                        kVar2.D = lVar;
                                        kVar2.E = null;
                                        kVar2.H = 5;
                                        aVar2 = aVar2;
                                        if (bVar.p(eVar2, dVar2, str26, kVar2) != aVar2) {
                                            str16 = str10;
                                            str17 = str12;
                                            y0Var5 = y0Var3;
                                            lVar2 = lVar;
                                            lVar = lVar2;
                                            str13 = str16;
                                            str14 = str11;
                                            cVar3 = cVar2;
                                            str15 = str17;
                                            num3 = num2;
                                            y0Var4 = y0Var5;
                                            if (num3 != null || str15 == null || str13 == null) {
                                                j71.c[] cVarArr2 = new j71.c[i2];
                                                cVarArr2[c2] = lVar;
                                                cVarArr2[c] = cVar3;
                                                return x61.l.K(cVarArr2);
                                            }
                                            int intValue = num3.intValue();
                                            kVar2.u = str14;
                                            kVar2.v = null;
                                            kVar2.w = null;
                                            kVar2.x = y0Var4;
                                            kVar2.y = null;
                                            kVar2.z = num3;
                                            kVar2.A = null;
                                            kVar2.B = str13;
                                            kVar2.C = cVar3;
                                            kVar2.D = lVar;
                                            kVar2.E = null;
                                            kVar2.H = 6;
                                            Object k = k(str14, str13, str15, intValue, kVar2);
                                            if (k != aVar2) {
                                                str18 = str14;
                                                str19 = str13;
                                                obj = k;
                                                cVar4 = lVar;
                                                cVar5 = (j71.c) obj;
                                                if (y0Var4.c.d) {
                                                    cVar6 = null;
                                                    j71.c[] cVarArr3 = new j71.c[4];
                                                    cVarArr3[c2] = cVar4;
                                                    cVarArr3[c] = cVar3;
                                                    cVarArr3[i2] = cVar5;
                                                    cVarArr3[3] = cVar6;
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
                                                obj = i(str18, str19, intValue2, kVar2);
                                                if (obj != aVar2) {
                                                    cVar7 = cVar3;
                                                    cVar6 = (j71.c) obj;
                                                    cVar3 = cVar7;
                                                    j71.c[] cVarArr32 = new j71.c[4];
                                                    cVarArr32[c2] = cVar4;
                                                    cVarArr32[c] = cVar3;
                                                    cVarArr32[i2] = cVar5;
                                                    cVarArr32[3] = cVar6;
                                                    return x61.l.K(cVarArr32);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return aVar2;
                        }
                        str5 = str20;
                        y0Var = null;
                        if (str4 != null) {
                        }
                        break;
                    case 2:
                        String str27 = kVar2.x;
                        str6 = kVar2.w;
                        str3 = kVar2.v;
                        str5 = kVar2.u;
                        y.j(obj);
                        y0 y0Var62 = (y0) obj;
                        str4 = str6;
                        y0Var = y0Var62;
                        if (str4 != null) {
                        }
                        break;
                    case 3:
                        String str28 = kVar2.y;
                        y0Var = kVar2.x;
                        str3 = kVar2.v;
                        str5 = kVar2.u;
                        y.j(obj);
                        dVar = (e50.d) obj;
                        y0Var2 = y0Var;
                        str7 = str3;
                        str8 = str5;
                        if (y0Var2 == null) {
                        }
                        if (y0Var2 == null) {
                        }
                        if (y0Var2 == null) {
                        }
                        if (str7 == null) {
                        }
                        break;
                    case 4:
                        str10 = kVar2.B;
                        str9 = kVar2.A;
                        num = kVar2.z;
                        dVar = kVar2.y;
                        y0Var2 = kVar2.x;
                        str7 = kVar2.v;
                        str8 = kVar2.u;
                        y.j(obj);
                        String str29 = str9;
                        cVar2 = (j71.c) obj;
                        str12 = str29;
                        y0 y0Var7 = y0Var2;
                        num2 = num;
                        str11 = str8;
                        y0Var3 = y0Var7;
                        c = 1;
                        if (dVar == null) {
                        }
                        i2 = 2;
                        if (dVar != null) {
                        }
                        break;
                    case 5:
                        e50.d dVar3 = kVar2.E;
                        j71.c r1 = (j71.c) (kVar2.D);
                        cVar2 = kVar2.C;
                        str16 = kVar2.B;
                        str17 = kVar2.A;
                        num2 = kVar2.z;
                        y0Var5 = kVar2.x;
                        str11 = kVar2.u;
                        y.j(obj);
                        i2 = 2;
                        c = 1;
                        c2 = 0;
                        lVar2 = r1;
                        lVar = lVar2;
                        str13 = str16;
                        str14 = str11;
                        cVar3 = cVar2;
                        str15 = str17;
                        num3 = num2;
                        y0Var4 = y0Var5;
                        if (num3 != null) {
                        }
                        j71.c[] cVarArr22 = new j71.c[i2];
                        cVarArr22[c2] = lVar;
                        cVarArr22[c] = cVar3;
                        return x61.l.K(cVarArr22);
                    case 6:
                        j71.c cVar9 = kVar2.D;
                        j71.c cVar10 = kVar2.C;
                        str19 = kVar2.B;
                        num3 = kVar2.z;
                        y0Var4 = kVar2.x;
                        str18 = kVar2.u;
                        y.j(obj);
                        cVar3 = cVar10;
                        i2 = 2;
                        c = 1;
                        c2 = 0;
                        cVar4 = cVar9;
                        cVar5 = (j71.c) obj;
                        if (y0Var4.c.d) {
                        }
                        break;
                    case 7:
                        cVar5 = kVar2.E;
                        cVar4 = kVar2.D;
                        cVar7 = kVar2.C;
                        y.j(obj);
                        i2 = 2;
                        c = 1;
                        c2 = 0;
                        cVar6 = (j71.c) obj;
                        cVar3 = cVar7;
                        j71.c[] cVarArr322 = new j71.c[4];
                        cVarArr322[c2] = cVar4;
                        cVarArr322[c] = cVar3;
                        cVarArr322[i2] = cVar5;
                        cVarArr322[3] = cVar6;
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

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01a4, code lost:
    
        if (r1 == r6) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0181, code lost:
    
        if (r3.p(r10, r17, r11, r5) == r6) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0112, code lost:
    
        if (r1 == r6) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c6, code lost:
    
        if (r1 == r6) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable h(String str, String str2, c71.c cVar) {
        m mVar;
        int i;
        String str3;
        String str4;
        String str5;
        e50.d dVar;
        String str6;
        i50.a aVar;
        y0 y0Var;
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
                        i50.c cVar9 = new i50.c(0);
                        str3 = str2;
                        mVar2.u = str3;
                        mVar2.G = 1;
                        obj = bVar.c(cVar9, str);
                        break;
                    case 1:
                        str3 = mVar2.u;
                        y.j(obj);
                        i50.b bVar2 = (i50.b) obj;
                        str4 = (bVar2 == null || (aVar = bVar2.c) == null) ? null : aVar.a;
                        if (str4 != null) {
                            e50.e eVar = new e50.e(0);
                            mVar2.u = str3;
                            mVar2.v = str4;
                            mVar2.w = null;
                            mVar2.G = 2;
                            Object c4 = bVar.c(eVar, str4);
                            if (c4 != aVar2) {
                                String str11 = str3;
                                str6 = str4;
                                obj = c4;
                                str5 = str11;
                                String str12 = str6;
                                dVar = (e50.d) obj;
                                str4 = str12;
                                if (str4 != null) {
                                    z0 z0Var = new z0(0);
                                    mVar2.u = str5;
                                    mVar2.v = null;
                                    mVar2.w = dVar;
                                    mVar2.x = null;
                                    mVar2.G = 3;
                                    obj = bVar.c(z0Var, str4);
                                    break;
                                } else {
                                    y0Var = null;
                                    str7 = str5;
                                    num = y0Var == null ? new Integer(y0Var.b) : null;
                                    str8 = y0Var == null ? y0Var.c.b : null;
                                    String str13 = y0Var == null ? y0Var.c.c.b : null;
                                    c = 3;
                                    l lVar = dVar == null ? new l(this, dVar, null, 1) : null;
                                    c2 = 1;
                                    if (dVar == null) {
                                        e50.e eVar2 = new e50.e(0);
                                        c3 = 0;
                                        String str14 = dVar.a;
                                        e50.d dVar2 = new e50.d(str14, (ZonedDateTime) null, (e50.b) null, (e50.a) null, dVar.e);
                                        mVar2.u = str7;
                                        mVar2.v = null;
                                        mVar2.w = null;
                                        mVar2.x = y0Var;
                                        mVar2.y = num;
                                        mVar2.z = str8;
                                        mVar2.A = str13;
                                        mVar2.B = lVar;
                                        mVar2.C = null;
                                        mVar2.G = 4;
                                        break;
                                    } else {
                                        c3 = 0;
                                    }
                                    str9 = str13;
                                    cVar2 = lVar;
                                    if (str7 != null) {
                                        mVar2.u = null;
                                        mVar2.v = null;
                                        mVar2.w = null;
                                        mVar2.x = y0Var;
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
                                            cVarArr[c3] = cVar4;
                                            cVarArr[c2] = cVar3;
                                            return x61.l.K(cVarArr);
                                        }
                                        int intValue = num.intValue();
                                        mVar2.u = null;
                                        mVar2.v = null;
                                        mVar2.w = null;
                                        mVar2.x = y0Var;
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
                                            if (y0Var.c.d) {
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
                                            cVarArr2[c3] = cVar4;
                                            cVarArr2[c2] = cVar5;
                                            cVarArr2[2] = cVar6;
                                            cVarArr2[c] = cVar8;
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
                        String str17 = mVar2.w;
                        str6 = mVar2.v;
                        str5 = mVar2.u;
                        y.j(obj);
                        String str122 = str6;
                        dVar = (e50.d) obj;
                        str4 = str122;
                        if (str4 != null) {
                        }
                        break;
                    case 3:
                        String str18 = mVar2.x;
                        dVar = mVar2.w;
                        str5 = mVar2.u;
                        y.j(obj);
                        y0Var = (y0) obj;
                        str7 = str5;
                        if (y0Var == null) {
                        }
                        if (y0Var == null) {
                        }
                        if (y0Var == null) {
                        }
                        c = 3;
                        if (dVar == null) {
                        }
                        c2 = 1;
                        if (dVar == null) {
                        }
                        str9 = str13;
                        cVar2 = lVar;
                        if (str7 != null) {
                        }
                        break;
                    case 4:
                        e50.d dVar3 = mVar2.C;
                        cVar2 = mVar2.B;
                        str9 = mVar2.A;
                        str8 = mVar2.z;
                        num = mVar2.y;
                        y0Var = mVar2.x;
                        str7 = mVar2.u;
                        y.j(obj);
                        c = 3;
                        c2 = 1;
                        c3 = 0;
                        if (str7 != null) {
                        }
                        break;
                    case 5:
                        cVar2 = mVar2.B;
                        str9 = mVar2.A;
                        str8 = mVar2.z;
                        num = mVar2.y;
                        y0Var = mVar2.x;
                        y.j(obj);
                        c = 3;
                        c2 = 1;
                        c3 = 0;
                        cVar3 = (j71.c) obj;
                        cVar4 = cVar2;
                        String str152 = str9;
                        String str162 = str8;
                        if (num != null) {
                        }
                        j71.c[] cVarArr3 = new j71.c[2];
                        cVarArr3[c3] = cVar4;
                        cVarArr3[c2] = cVar3;
                        return x61.l.K(cVarArr3);
                    case 6:
                        j71.c cVar10 = mVar2.C;
                        j71.c cVar11 = mVar2.B;
                        str10 = mVar2.A;
                        num = mVar2.y;
                        y0Var = mVar2.x;
                        y.j(obj);
                        c = 3;
                        c2 = 1;
                        c3 = 0;
                        cVar4 = cVar11;
                        cVar5 = cVar10;
                        cVar6 = (j71.c) obj;
                        if (y0Var.c.d) {
                        }
                        j71.c[] cVarArr22 = new j71.c[4];
                        cVarArr22[c3] = cVar4;
                        cVarArr22[c2] = cVar5;
                        cVarArr22[2] = cVar6;
                        cVarArr22[c] = cVar8;
                        return x61.l.K(cVarArr22);
                    case 7:
                        cVar6 = mVar2.D;
                        cVar5 = mVar2.C;
                        cVar7 = mVar2.B;
                        y.j(obj);
                        c = 3;
                        c2 = 1;
                        c3 = 0;
                        cVar8 = (j71.c) obj;
                        cVar4 = cVar7;
                        j71.c[] cVarArr222 = new j71.c[4];
                        cVarArr222[c3] = cVar4;
                        cVarArr222[c2] = cVar5;
                        cVarArr222[2] = cVar6;
                        cVarArr222[c] = cVar8;
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
                jy.d dVar = this.e;
                if (i2 != 0) {
                    y.j(obj2);
                    s20.h hVar = new s20.h(str2, i);
                    nVar2.u = str;
                    nVar2.v = str2;
                    nVar2.x = i;
                    nVar2.A = 1;
                    Object f = dVar.f(hVar, nVar2);
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
                e eVar2 = new e((bl) obj, this, str4, i3, null, 1);
                s20.h hVar2 = new s20.h(str4, i3);
                wa.g gVar = new wa.g(3);
                tj.b bVar = new tj.b(str3, 12);
                nVar2.u = null;
                nVar2.v = null;
                nVar2.w = eVar2;
                nVar2.x = i3;
                nVar2.A = 2;
                return dVar.d(hVar2, gVar, bVar, nVar2) != aVar ? aVar : eVar2;
            }
        }
        nVar = new n(this, cVar);
        n nVar22 = nVar;
        Object obj22 = nVar22.y;
        b71.a aVar2 = b71.a.r;
        i2 = nVar22.A;
        jy.d dVar2 = this.e;
        if (i2 != 0) {
        }
        e eVar22 = new e((bl) obj, this, str4, i3, null, 1);
        s20.h hVar22 = new s20.h(str4, i3);
        wa.g gVar2 = new wa.g(3);
        tj.b bVar2 = new tj.b(str3, 12);
        nVar22.u = null;
        nVar22.v = null;
        nVar22.w = eVar22;
        nVar22.x = i3;
        nVar22.A = 2;
        if (dVar2.d(hVar22, gVar2, bVar2, nVar22) != aVar2) {
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
        s20.f fVar;
        String str3;
        eaShadow eaVar;
        ga gaVar;
        c0 c0Var;
        ArrayList arrayList;
        z zVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i2 = oVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.z = i2 - Integer.MIN_VALUE;
                o oVar2 = oVar;
                Object obj = oVar2.x;
                b71.a aVar = b71.a.r;
                i = oVar2.z;
                jy.d dVar = this.c;
                if (i != 0) {
                    y.j(obj);
                    fVar = new s20.f(str);
                    oVar2.u = str2;
                    oVar2.v = fVar;
                    oVar2.z = 1;
                    Object f = dVar.f(fVar, oVar2);
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
                    g gVar = oVar2.w;
                    y.j(obj);
                    return gVar;
                }
                fVar = oVar2.v;
                String str4 = oVar2.u;
                y.j(obj);
                str3 = str4;
                s20.f fVar2 = fVar;
                eaVar = (eaShadow) obj;
                g gVar2 = new g(eaVar, this, fVar2, null, 1);
                if (eaVar != null) {
                    Companion.getClass();
                    ga gaVar2 = eaVar.a;
                    if (gaVar2 != null) {
                        c0 c0Var2 = gaVar2.d;
                        if (c0Var2 != null) {
                            i50.h c = a.c(c0Var2.d, str3);
                            b0 b0Var = c0Var2.c;
                            List<z> list = b0Var.c;
                            if (list != null) {
                                arrayList = new ArrayList(x61.n.F(list, 10));
                                for (z zVar2 : list) {
                                    if (zVar2 != null) {
                                        a aVar2 = Companion;
                                        u uVar = zVar2.c;
                                        aVar2.getClass();
                                        zVar = z.a(zVar2, a.d(uVar, str3));
                                    } else {
                                        zVar = null;
                                    }
                                    arrayList.add(zVar);
                                }
                            } else {
                                arrayList = null;
                            }
                            c0Var = c0.a(c0Var2, b0.a(b0Var, 0, arrayList, 3), c, 19);
                        } else {
                            c0Var = null;
                        }
                        gaVar = ga.a(gaVar2, c0Var);
                    } else {
                        gaVar = null;
                    }
                    v0 eaVar2 = new eaShadow(gaVar);
                    oVar2.u = null;
                    oVar2.v = null;
                    oVar2.w = gVar2;
                    oVar2.z = 2;
                    if (dVar.j(fVar2, eaVar2, oVar2) == aVar) {
                        return aVar;
                    }
                }
                return gVar2;
            }
        }
        oVar = new o(this, cVar);
        o oVar22 = oVar;
        Object obj2 = oVar22.x;
        b71.a aVar3 = b71.a.r;
        i = oVar22.z;
        jy.d dVar2 = this.c;
        if (i != 0) {
        }
        s20.f fVar22 = fVar;
        eaVar = (eaShadow) obj2;
        g gVar22 = new g(eaVar, this, fVar22, null, 1);
        if (eaVar != null) {
        }
        return gVar22;
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
                jy.d dVar = this.d;
                if (i2 != 0) {
                    y.j(obj);
                    s20.g gVar = new s20.g(str2, i, str6);
                    pVar2.u = str;
                    pVar2.v = str2;
                    pVar2.w = str6;
                    pVar2.y = i;
                    pVar2.B = 1;
                    obj = dVar.f(gVar, pVar2);
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
                i iVar2 = new i((ma) obj2, this, str5, str8, i3, null, 1);
                s20.g gVar2 = new s20.g(str5, i3, str8);
                wa.g gVar3 = new wa.g(2);
                tj.b bVar = new tj.b(str4, 11);
                pVar2.u = null;
                pVar2.v = null;
                pVar2.w = null;
                pVar2.x = iVar2;
                pVar2.y = i3;
                pVar2.B = 2;
                return dVar.d(gVar2, gVar3, bVar, pVar2) != aVar ? aVar : iVar2;
            }
        }
        pVar = new p(this, cVar);
        p pVar22 = pVar;
        Object obj3 = pVar22.z;
        b71.a aVar2 = b71.a.r;
        i2 = pVar22.B;
        jy.d dVar2 = this.d;
        if (i2 != 0) {
        }
        Object obj22 = obj3;
        String str82 = str6;
        i iVar22 = new i((ma) obj22, this, str5, str82, i3, null, 1);
        s20.g gVar22 = new s20.g(str5, i3, str82);
        wa.g gVar32 = new wa.g(2);
        tj.b bVar2 = new tj.b(str4, 11);
        pVar22.u = null;
        pVar22.v = null;
        pVar22.w = null;
        pVar22.x = iVar22;
        pVar22.y = i3;
        pVar22.B = 2;
        if (dVar2.d(gVar22, gVar32, bVar2, pVar22) != aVar2) {
        }
    }
}
