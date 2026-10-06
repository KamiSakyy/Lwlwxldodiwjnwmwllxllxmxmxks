package bz0;

import ap0.w5;
import ap0.y5;
import c30.n0;
import c30.o0;
import c30.r0;
import c30.s0;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import cq.s6;
import cq.u6;
import dw.b7;
import dw.e6;
import dw.e7;
import dw.g7;
import dw.o6;
import dw.p6;
import dw.q0;
import dw.q6;
import dw.r6;
import dw.t4;
import dw.t6;
import dw.v4;
import dw.y6;
import dw.z6;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import m10.wh;
import m10.wi;
import m10.yi;
import pz0.bf;
import pz0.df;
import pz0.le;
import sd0.a1;
import sd0.b1;
import sd0.d1;
import sd0.w0;
import sd0.y0;
import uu0.c6;
import uu0.d6;
import uu0.f6;
import uu0.i6;
import uu0.j5;
import uu0.k6;
import uu0.l4;
import uu0.n4;
import uu0.p0;
import uu0.s5;
import uu0.t5;
import uu0.u5;
import uu0.v5;
import uu0.x5;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c0 {
    public final /* synthetic */ int a;
    public com.github.service.wrapper.b b;

    public c0(com.github.service.wrapper.b bVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                k71.k.g(bVar, "cachedClient");
                this.b = bVar;
                break;
            case 2:
                k71.k.g(bVar, "cachedClient");
                this.b = bVar;
                break;
            case 3:
                k71.k.g(bVar, "cachedClient");
                this.b = bVar;
                break;
            case 4:
                k71.k.g(bVar, "cachedClient");
                this.b = bVar;
                break;
            case 5:
                k71.k.g(bVar, "cachedClient");
                this.b = bVar;
                break;
            case 6:
                k71.k.g(bVar, "cachedClient");
                this.b = bVar;
                break;
            case 7:
                k71.k.g(bVar, "cachedClient");
                this.b = bVar;
                break;
            default:
                k71.k.g(bVar, "cachedClient");
                this.b = bVar;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005d, code lost:
    
        if (r2 == r4) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(String str, e6 e6Var, c71.c cVar) {
        iy.a aVar;
        int i;
        e6 e6Var2;
        e7 e7Var;
        p6 p6Var;
        String str2 = str;
        if (cVar instanceof iy.a) {
            aVar = (iy.a) cVar;
            int i2 = aVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.y = i2 - Integer.MIN_VALUE;
                Object obj = aVar.w;
                b71.a aVar2 = b71.a.r;
                i = aVar.y;
                com.github.service.wrapper.b bVar = this.b;
                w61.a0 a0Var = w61.a0.a;
                if (i != 0) {
                    sy.y.j(obj);
                    g7 g7Var = new g7();
                    aVar.u = str2;
                    e6Var2 = e6Var;
                    aVar.v = e6Var2;
                    aVar.y = 1;
                    obj = bVar.c(g7Var, str2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return a0Var;
                    }
                    e6 e6Var3 = aVar.v;
                    String str3 = aVar.u;
                    sy.y.j(obj);
                    e6Var2 = e6Var3;
                    str2 = str3;
                }
                e7Var = (e7) obj;
                p6Var = e7Var == null ? e7Var.e.b.a : null;
                if (!(p6Var == null ? p6Var.b.b : false) && e7Var != null) {
                    r6 r6Var = e7Var.e;
                    List list = r6Var.b.b;
                    ArrayList H0 = list == null ? x61.m.H0(list) : new ArrayList();
                    if (e6Var2 != null) {
                        wh.Companion.getClass();
                        e7 e7Var2 = new e7(e7Var.a, e7Var.b, e7Var.c, e7Var.d, new r6(r6Var.a, new q6(r6Var.b.a, x61.m.m0(H0, new o6(((aa.q) wh.B).a, e6Var2.b, e6Var2))), r6Var.c));
                        g7 g7Var2 = new g7();
                        aVar.u = null;
                        aVar.v = null;
                        aVar.y = 2;
                        if (bVar.p(g7Var2, e7Var2, str2, aVar) == aVar2) {
                            return aVar2;
                        }
                    }
                }
                return a0Var;
            }
        }
        aVar = new iy.a(this, cVar);
        Object obj2 = aVar.w;
        b71.a aVar22 = b71.a.r;
        i = aVar.y;
        com.github.service.wrapper.b bVar2 = this.b;
        w61.a0 a0Var2 = w61.a0.a;
        if (i != 0) {
        }
        e7Var = (e7) obj2;
        if (e7Var == null) {
        }
        if (!(p6Var == null ? p6Var.b.b : false)) {
            r6 r6Var2 = e7Var.e;
            List list2 = r6Var2.b.b;
            if (list2 == null) {
            }
            if (e6Var2 != null) {
            }
        }
        return a0Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005d, code lost:
    
        if (r2 == r4) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(String str, j5 j5Var, c71.c cVar) {
        rw0.a aVar;
        int i;
        j5 j5Var2;
        i6 i6Var;
        t5 t5Var;
        String str2 = str;
        if (cVar instanceof rw0.a) {
            aVar = (rw0.a) cVar;
            int i2 = aVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.y = i2 - Integer.MIN_VALUE;
                Object obj = aVar.w;
                b71.a aVar2 = b71.a.r;
                i = aVar.y;
                com.github.service.wrapper.b bVar = this.b;
                w61.a0 a0Var = w61.a0.a;
                if (i != 0) {
                    sy.y.j(obj);
                    k6 k6Var = new k6();
                    aVar.u = str2;
                    j5Var2 = j5Var;
                    aVar.v = j5Var2;
                    aVar.y = 1;
                    obj = bVar.c(k6Var, str2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return a0Var;
                    }
                    j5 j5Var3 = aVar.v;
                    String str3 = aVar.u;
                    sy.y.j(obj);
                    j5Var2 = j5Var3;
                    str2 = str3;
                }
                i6Var = (i6) obj;
                t5Var = i6Var == null ? i6Var.e.b.a : null;
                if (!(t5Var == null ? t5Var.b.b : false) && i6Var != null) {
                    v5 v5Var = i6Var.e;
                    List list = v5Var.b.b;
                    ArrayList H0 = list == null ? x61.m.H0(list) : new ArrayList();
                    if (j5Var2 != null) {
                        le.Companion.getClass();
                        i6 i6Var2 = new i6(i6Var.a, i6Var.b, i6Var.c, i6Var.d, new v5(v5Var.a, new u5(v5Var.b.a, x61.m.m0(H0, new s5(((aa.q) le.A).a, j5Var2.b, j5Var2))), v5Var.c));
                        k6 k6Var2 = new k6();
                        aVar.u = null;
                        aVar.v = null;
                        aVar.y = 2;
                        if (bVar.p(k6Var2, i6Var2, str2, aVar) == aVar2) {
                            return aVar2;
                        }
                    }
                }
                return a0Var;
            }
        }
        aVar = new rw0.a(this, cVar);
        Object obj2 = aVar.w;
        b71.a aVar22 = b71.a.r;
        i = aVar.y;
        com.github.service.wrapper.b bVar2 = this.b;
        w61.a0 a0Var2 = w61.a0.a;
        if (i != 0) {
        }
        i6Var = (i6) obj2;
        if (i6Var == null) {
        }
        if (!(t5Var == null ? t5Var.b.b : false)) {
            v5 v5Var2 = i6Var.e;
            List list2 = v5Var2.b.b;
            if (list2 == null) {
            }
            if (j5Var2 != null) {
            }
        }
        return a0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object c(String str, CloseReason closeReason, c71.c cVar) {
        iy.b bVar;
        int i;
        t4 t4Var;
        yi yiVar;
        t4 a;
        int i2;
        String str2;
        String str3;
        int i3;
        int i4;
        z6 z6Var;
        String str4;
        v4 v4Var;
        rw0.b bVar2;
        int i5;
        l4 l4Var;
        df dfVar;
        l4 a2;
        p0 p0Var;
        int i6;
        String str5;
        String str6;
        int i7;
        int i8;
        d6 d6Var;
        String str7;
        n4 n4Var;
        String str8 = str;
        CloseReason closeReason2 = closeReason;
        switch (this.a) {
            case 1:
                if (cVar instanceof iy.b) {
                    bVar = (iy.b) cVar;
                    int i9 = bVar.C;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        bVar.C = i9 - Integer.MIN_VALUE;
                        Object obj = bVar.A;
                        b71.a aVar = b71.a.r;
                        i = bVar.C;
                        com.github.service.wrapper.b bVar3 = this.b;
                        if (i != 0) {
                            sy.y.j(obj);
                            v4 v4Var2 = new v4();
                            bVar.u = str8;
                            bVar.v = closeReason2;
                            bVar.C = 1;
                            obj = bVar3.c(v4Var2, str8);
                            if (obj == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i != 4) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        sy.y.j(obj);
                                        return w61.a0.a;
                                    }
                                    i3 = bVar.y;
                                    a = bVar.w;
                                    str4 = bVar.u;
                                    sy.y.j(obj);
                                    String str9 = str4;
                                    i2 = i3;
                                    str8 = str9;
                                    v4Var = new v4();
                                    bVar.u = null;
                                    bVar.v = null;
                                    bVar.w = null;
                                    bVar.x = null;
                                    bVar.y = i2;
                                    bVar.C = 4;
                                    if (bVar3.p(v4Var, a, str8, bVar) == aVar) {
                                        return aVar;
                                    }
                                    return w61.a0.a;
                                }
                                int i10 = bVar.z;
                                int i12 = bVar.y;
                                String str10 = bVar.x;
                                t4 t4Var2 = bVar.w;
                                str3 = bVar.u;
                                sy.y.j(obj);
                                i2 = i10;
                                i3 = i12;
                                a = t4Var2;
                                str2 = str10;
                                z6Var = (z6) obj;
                                if (z6Var != null) {
                                    i2 = i3;
                                    str8 = str3;
                                    v4Var = new v4();
                                    bVar.u = null;
                                    bVar.v = null;
                                    bVar.w = null;
                                    bVar.x = null;
                                    bVar.y = i2;
                                    bVar.C = 4;
                                    if (bVar3.p(v4Var, a, str8, bVar) == aVar) {
                                    }
                                    return w61.a0.a;
                                }
                                y6 y6Var = z6Var.b;
                                z6 z6Var2 = new z6(z6Var.a, new y6(y6Var.a, y6Var.b + 1), z6Var.c);
                                b7 b7Var = new b7();
                                bVar.u = str3;
                                bVar.v = null;
                                bVar.w = a;
                                bVar.x = null;
                                bVar.y = i3;
                                bVar.z = i2;
                                bVar.C = 3;
                                if (bVar3.p(b7Var, z6Var2, str2, bVar) == aVar) {
                                    return aVar;
                                }
                                str4 = str3;
                                String str92 = str4;
                                i2 = i3;
                                str8 = str92;
                                v4Var = new v4();
                                bVar.u = null;
                                bVar.v = null;
                                bVar.w = null;
                                bVar.x = null;
                                bVar.y = i2;
                                bVar.C = 4;
                                if (bVar3.p(v4Var, a, str8, bVar) == aVar) {
                                }
                                return w61.a0.a;
                            }
                            CloseReason closeReason3 = bVar.v;
                            String str11 = bVar.u;
                            sy.y.j(obj);
                            closeReason2 = closeReason3;
                            str8 = str11;
                        }
                        t4Var = (t4) obj;
                        if (t4Var != null) {
                            wi wiVar = wi.t;
                            if (closeReason2 == null || (i4 = sy.z.a[closeReason2.ordinal()]) == -1) {
                                yiVar = null;
                            } else if (i4 == 1) {
                                yiVar = yi.t;
                            } else if (i4 == 2) {
                                yiVar = yi.v;
                            } else {
                                if (i4 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                yiVar = yi.u;
                            }
                            a = t4.a(t4Var, wiVar, yiVar);
                            q0 q0Var = t4Var.G.a;
                            i2 = 0;
                            if (q0Var != null) {
                                String str12 = q0Var.a;
                                b7 b7Var2 = new b7();
                                bVar.u = str8;
                                bVar.v = null;
                                bVar.w = a;
                                bVar.x = str12;
                                bVar.y = 0;
                                bVar.z = 0;
                                bVar.C = 2;
                                Object c = bVar3.c(b7Var2, str12);
                                if (c == aVar) {
                                    return aVar;
                                }
                                str2 = str12;
                                obj = c;
                                str3 = str8;
                                i3 = 0;
                                z6Var = (z6) obj;
                                if (z6Var != null) {
                                }
                            }
                            v4Var = new v4();
                            bVar.u = null;
                            bVar.v = null;
                            bVar.w = null;
                            bVar.x = null;
                            bVar.y = i2;
                            bVar.C = 4;
                            if (bVar3.p(v4Var, a, str8, bVar) == aVar) {
                            }
                        }
                        return w61.a0.a;
                    }
                }
                bVar = new iy.b(this, cVar);
                Object obj2 = bVar.A;
                b71.a aVar2 = b71.a.r;
                i = bVar.C;
                com.github.service.wrapper.b bVar32 = this.b;
                if (i != 0) {
                }
                t4Var = (t4) obj2;
                if (t4Var != null) {
                }
                return w61.a0.a;
            default:
                if (cVar instanceof rw0.b) {
                    bVar2 = (rw0.b) cVar;
                    int i13 = bVar2.C;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        bVar2.C = i13 - Integer.MIN_VALUE;
                        Object obj3 = bVar2.A;
                        b71.a aVar3 = b71.a.r;
                        i5 = bVar2.C;
                        com.github.service.wrapper.b bVar4 = this.b;
                        if (i5 != 0) {
                            sy.y.j(obj3);
                            n4 n4Var2 = new n4();
                            bVar2.u = str8;
                            bVar2.v = closeReason2;
                            bVar2.C = 1;
                            obj3 = bVar4.c(n4Var2, str8);
                            if (obj3 == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    if (i5 != 3) {
                                        if (i5 != 4) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        sy.y.j(obj3);
                                        return w61.a0.a;
                                    }
                                    i7 = bVar2.y;
                                    a2 = bVar2.w;
                                    str7 = bVar2.u;
                                    sy.y.j(obj3);
                                    String str13 = str7;
                                    i6 = i7;
                                    str8 = str13;
                                    n4Var = new n4();
                                    bVar2.u = null;
                                    bVar2.v = null;
                                    bVar2.w = null;
                                    bVar2.x = null;
                                    bVar2.y = i6;
                                    bVar2.C = 4;
                                    if (bVar4.p(n4Var, a2, str8, bVar2) == aVar3) {
                                        return aVar3;
                                    }
                                    return w61.a0.a;
                                }
                                int i14 = bVar2.z;
                                int i15 = bVar2.y;
                                String str14 = bVar2.x;
                                l4 l4Var2 = bVar2.w;
                                str6 = bVar2.u;
                                sy.y.j(obj3);
                                i6 = i14;
                                i7 = i15;
                                a2 = l4Var2;
                                str5 = str14;
                                d6Var = (d6) obj3;
                                if (d6Var != null) {
                                    i6 = i7;
                                    str8 = str6;
                                    n4Var = new n4();
                                    bVar2.u = null;
                                    bVar2.v = null;
                                    bVar2.w = null;
                                    bVar2.x = null;
                                    bVar2.y = i6;
                                    bVar2.C = 4;
                                    if (bVar4.p(n4Var, a2, str8, bVar2) == aVar3) {
                                    }
                                    return w61.a0.a;
                                }
                                c6 c6Var = d6Var.b;
                                d6 d6Var2 = new d6(d6Var.a, new c6(c6Var.a, c6Var.b + 1), d6Var.c);
                                f6 f6Var = new f6();
                                bVar2.u = str6;
                                bVar2.v = null;
                                bVar2.w = a2;
                                bVar2.x = null;
                                bVar2.y = i7;
                                bVar2.z = i6;
                                bVar2.C = 3;
                                if (bVar4.p(f6Var, d6Var2, str5, bVar2) == aVar3) {
                                    return aVar3;
                                }
                                str7 = str6;
                                String str132 = str7;
                                i6 = i7;
                                str8 = str132;
                                n4Var = new n4();
                                bVar2.u = null;
                                bVar2.v = null;
                                bVar2.w = null;
                                bVar2.x = null;
                                bVar2.y = i6;
                                bVar2.C = 4;
                                if (bVar4.p(n4Var, a2, str8, bVar2) == aVar3) {
                                }
                                return w61.a0.a;
                            }
                            CloseReason closeReason4 = bVar2.v;
                            String str15 = bVar2.u;
                            sy.y.j(obj3);
                            closeReason2 = closeReason4;
                            str8 = str15;
                        }
                        l4Var = (l4) obj3;
                        if (l4Var != null) {
                            bf bfVar = bf.t;
                            if (closeReason2 != null && (i8 = bx0.p.a[closeReason2.ordinal()]) != -1) {
                                if (i8 == 1) {
                                    dfVar = df.t;
                                } else if (i8 == 2) {
                                    dfVar = df.u;
                                } else if (i8 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                a2 = l4.a(l4Var, bfVar, dfVar);
                                p0Var = l4Var.E.a;
                                i6 = 0;
                                if (p0Var != null) {
                                    String str16 = p0Var.a;
                                    f6 f6Var2 = new f6();
                                    bVar2.u = str8;
                                    bVar2.v = null;
                                    bVar2.w = a2;
                                    bVar2.x = str16;
                                    bVar2.y = 0;
                                    bVar2.z = 0;
                                    bVar2.C = 2;
                                    Object c2 = bVar4.c(f6Var2, str16);
                                    if (c2 == aVar3) {
                                        return aVar3;
                                    }
                                    str5 = str16;
                                    obj3 = c2;
                                    str6 = str8;
                                    i7 = 0;
                                    d6Var = (d6) obj3;
                                    if (d6Var != null) {
                                    }
                                }
                                n4Var = new n4();
                                bVar2.u = null;
                                bVar2.v = null;
                                bVar2.w = null;
                                bVar2.x = null;
                                bVar2.y = i6;
                                bVar2.C = 4;
                                if (bVar4.p(n4Var, a2, str8, bVar2) == aVar3) {
                                }
                            }
                            dfVar = null;
                            a2 = l4.a(l4Var, bfVar, dfVar);
                            p0Var = l4Var.E.a;
                            i6 = 0;
                            if (p0Var != null) {
                            }
                            n4Var = new n4();
                            bVar2.u = null;
                            bVar2.v = null;
                            bVar2.w = null;
                            bVar2.x = null;
                            bVar2.y = i6;
                            bVar2.C = 4;
                            if (bVar4.p(n4Var, a2, str8, bVar2) == aVar3) {
                            }
                        }
                        return w61.a0.a;
                    }
                }
                bVar2 = new rw0.b(this, cVar);
                Object obj32 = bVar2.A;
                b71.a aVar32 = b71.a.r;
                i5 = bVar2.C;
                com.github.service.wrapper.b bVar42 = this.b;
                if (i5 != 0) {
                }
                l4Var = (l4) obj32;
                if (l4Var != null) {
                }
                return w61.a0.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(String str, String str2, c71.c cVar) {
        iy.d dVar;
        int i;
        r6 r6Var;
        ArrayList arrayList;
        rw0.d dVar2;
        int i2;
        v5 v5Var;
        ArrayList arrayList2;
        switch (this.a) {
            case 2:
                if (cVar instanceof iy.d) {
                    dVar = (iy.d) cVar;
                    int i3 = dVar.y;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        dVar.y = i3 - Integer.MIN_VALUE;
                        Object obj = dVar.w;
                        b71.a aVar = b71.a.r;
                        i = dVar.y;
                        com.github.service.wrapper.b bVar = this.b;
                        if (i != 0) {
                            sy.y.j(obj);
                            t6 t6Var = new t6();
                            dVar.u = str;
                            dVar.v = str2;
                            dVar.y = 1;
                            obj = bVar.c(t6Var, str);
                            if (obj == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                sy.y.j(obj);
                                return w61.a0.a;
                            }
                            str2 = dVar.v;
                            str = dVar.u;
                            sy.y.j(obj);
                        }
                        r6Var = (r6) obj;
                        if (r6Var != null) {
                            q6 q6Var = r6Var.b;
                            List list = q6Var.b;
                            if (list != null) {
                                arrayList = new ArrayList();
                                for (Object obj2 : list) {
                                    o6 o6Var = (o6) obj2;
                                    if (!k71.k.b(o6Var != null ? o6Var.b : null, str2)) {
                                        arrayList.add(obj2);
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                            t6 t6Var2 = new t6();
                            r6 r6Var2 = new r6(r6Var.a, new q6(q6Var.a, arrayList), r6Var.c);
                            dVar.u = null;
                            dVar.v = null;
                            dVar.y = 2;
                            if (bVar.p(t6Var2, r6Var2, str, dVar) == aVar) {
                                return aVar;
                            }
                        }
                        return w61.a0.a;
                    }
                }
                dVar = new iy.d(this, cVar);
                Object obj3 = dVar.w;
                b71.a aVar2 = b71.a.r;
                i = dVar.y;
                com.github.service.wrapper.b bVar2 = this.b;
                if (i != 0) {
                }
                r6Var = (r6) obj3;
                if (r6Var != null) {
                }
                return w61.a0.a;
            default:
                if (cVar instanceof rw0.d) {
                    dVar2 = (rw0.d) cVar;
                    int i4 = dVar2.y;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        dVar2.y = i4 - Integer.MIN_VALUE;
                        Object obj4 = dVar2.w;
                        b71.a aVar3 = b71.a.r;
                        i2 = dVar2.y;
                        com.github.service.wrapper.b bVar3 = this.b;
                        if (i2 != 0) {
                            sy.y.j(obj4);
                            x5 x5Var = new x5();
                            dVar2.u = str;
                            dVar2.v = str2;
                            dVar2.y = 1;
                            obj4 = bVar3.c(x5Var, str);
                            if (obj4 == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                sy.y.j(obj4);
                                return w61.a0.a;
                            }
                            str2 = dVar2.v;
                            str = dVar2.u;
                            sy.y.j(obj4);
                        }
                        v5Var = (v5) obj4;
                        if (v5Var != null) {
                            u5 u5Var = v5Var.b;
                            List list2 = u5Var.b;
                            if (list2 != null) {
                                arrayList2 = new ArrayList();
                                for (Object obj5 : list2) {
                                    s5 s5Var = (s5) obj5;
                                    if (!k71.k.b(s5Var != null ? s5Var.b : null, str2)) {
                                        arrayList2.add(obj5);
                                    }
                                }
                            } else {
                                arrayList2 = null;
                            }
                            x5 x5Var2 = new x5();
                            v5 v5Var2 = new v5(v5Var.a, new u5(u5Var.a, arrayList2), v5Var.c);
                            dVar2.u = null;
                            dVar2.v = null;
                            dVar2.y = 2;
                            if (bVar3.p(x5Var2, v5Var2, str, dVar2) == aVar3) {
                                return aVar3;
                            }
                        }
                        return w61.a0.a;
                    }
                }
                dVar2 = new rw0.d(this, cVar);
                Object obj42 = dVar2.w;
                b71.a aVar32 = b71.a.r;
                i2 = dVar2.y;
                com.github.service.wrapper.b bVar32 = this.b;
                if (i2 != 0) {
                }
                v5Var = (v5) obj42;
                if (v5Var != null) {
                }
                return w61.a0.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(String str, c71.c cVar) {
        iy.c cVar2;
        int i;
        t4 t4Var;
        t4 a;
        int i2;
        String str2;
        String str3;
        int i3;
        z6 z6Var;
        String str4;
        v4 v4Var;
        rw0.c cVar3;
        int i4;
        l4 l4Var;
        l4 a2;
        int i5;
        String str5;
        String str6;
        int i6;
        d6 d6Var;
        String str7;
        n4 n4Var;
        String str8 = str;
        switch (this.a) {
            case 1:
                if (cVar instanceof iy.c) {
                    cVar2 = (iy.c) cVar;
                    int i7 = cVar2.B;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        cVar2.B = i7 - Integer.MIN_VALUE;
                        Object obj = cVar2.z;
                        b71.a aVar = b71.a.r;
                        i = cVar2.B;
                        com.github.service.wrapper.b bVar = this.b;
                        if (i != 0) {
                            sy.y.j(obj);
                            v4 v4Var2 = new v4();
                            cVar2.u = str8;
                            cVar2.B = 1;
                            obj = bVar.c(v4Var2, str8);
                            if (obj == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i != 4) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        sy.y.j(obj);
                                        return w61.a0.a;
                                    }
                                    i3 = cVar2.x;
                                    a = cVar2.v;
                                    str4 = cVar2.u;
                                    sy.y.j(obj);
                                    i2 = i3;
                                    str8 = str4;
                                    v4Var = new v4();
                                    cVar2.u = null;
                                    cVar2.v = null;
                                    cVar2.w = null;
                                    cVar2.x = i2;
                                    cVar2.B = 4;
                                    if (bVar.p(v4Var, a, str8, cVar2) == aVar) {
                                        return aVar;
                                    }
                                    return w61.a0.a;
                                }
                                int i8 = cVar2.y;
                                int i9 = cVar2.x;
                                str2 = cVar2.w;
                                t4 t4Var2 = cVar2.v;
                                str3 = cVar2.u;
                                sy.y.j(obj);
                                i2 = i8;
                                i3 = i9;
                                a = t4Var2;
                                z6Var = (z6) obj;
                                if (z6Var != null) {
                                    i2 = i3;
                                    str8 = str3;
                                    v4Var = new v4();
                                    cVar2.u = null;
                                    cVar2.v = null;
                                    cVar2.w = null;
                                    cVar2.x = i2;
                                    cVar2.B = 4;
                                    if (bVar.p(v4Var, a, str8, cVar2) == aVar) {
                                    }
                                    return w61.a0.a;
                                }
                                y6 y6Var = z6Var.b;
                                z6 z6Var2 = new z6(z6Var.a, new y6(y6Var.a, y6Var.b - 1), z6Var.c);
                                b7 b7Var = new b7();
                                cVar2.u = str3;
                                cVar2.v = a;
                                cVar2.w = null;
                                cVar2.x = i3;
                                cVar2.y = i2;
                                cVar2.B = 3;
                                if (bVar.p(b7Var, z6Var2, str2, cVar2) == aVar) {
                                    return aVar;
                                }
                                str4 = str3;
                                i2 = i3;
                                str8 = str4;
                                v4Var = new v4();
                                cVar2.u = null;
                                cVar2.v = null;
                                cVar2.w = null;
                                cVar2.x = i2;
                                cVar2.B = 4;
                                if (bVar.p(v4Var, a, str8, cVar2) == aVar) {
                                }
                                return w61.a0.a;
                            }
                            str8 = cVar2.u;
                            sy.y.j(obj);
                        }
                        t4Var = (t4) obj;
                        if (t4Var != null) {
                            a = t4.a(t4Var, wi.u, yi.w);
                            q0 q0Var = t4Var.G.a;
                            i2 = 0;
                            if (q0Var != null) {
                                String str9 = q0Var.a;
                                b7 b7Var2 = new b7();
                                cVar2.u = str8;
                                cVar2.v = a;
                                cVar2.w = str9;
                                cVar2.x = 0;
                                cVar2.y = 0;
                                cVar2.B = 2;
                                Object c = bVar.c(b7Var2, str9);
                                if (c == aVar) {
                                    return aVar;
                                }
                                str2 = str9;
                                obj = c;
                                str3 = str8;
                                i3 = 0;
                                z6Var = (z6) obj;
                                if (z6Var != null) {
                                }
                            }
                            v4Var = new v4();
                            cVar2.u = null;
                            cVar2.v = null;
                            cVar2.w = null;
                            cVar2.x = i2;
                            cVar2.B = 4;
                            if (bVar.p(v4Var, a, str8, cVar2) == aVar) {
                            }
                        }
                        return w61.a0.a;
                    }
                }
                cVar2 = new iy.c(this, cVar);
                Object obj2 = cVar2.z;
                b71.a aVar2 = b71.a.r;
                i = cVar2.B;
                com.github.service.wrapper.b bVar2 = this.b;
                if (i != 0) {
                }
                t4Var = (t4) obj2;
                if (t4Var != null) {
                }
                return w61.a0.a;
            default:
                if (cVar instanceof rw0.c) {
                    cVar3 = (rw0.c) cVar;
                    int i10 = cVar3.B;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        cVar3.B = i10 - Integer.MIN_VALUE;
                        Object obj3 = cVar3.z;
                        b71.a aVar3 = b71.a.r;
                        i4 = cVar3.B;
                        com.github.service.wrapper.b bVar3 = this.b;
                        if (i4 != 0) {
                            sy.y.j(obj3);
                            n4 n4Var2 = new n4();
                            cVar3.u = str8;
                            cVar3.B = 1;
                            obj3 = bVar3.c(n4Var2, str8);
                            if (obj3 == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 != 3) {
                                        if (i4 != 4) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        sy.y.j(obj3);
                                        return w61.a0.a;
                                    }
                                    i6 = cVar3.x;
                                    a2 = cVar3.v;
                                    str7 = cVar3.u;
                                    sy.y.j(obj3);
                                    i5 = i6;
                                    str8 = str7;
                                    n4Var = new n4();
                                    cVar3.u = null;
                                    cVar3.v = null;
                                    cVar3.w = null;
                                    cVar3.x = i5;
                                    cVar3.B = 4;
                                    if (bVar3.p(n4Var, a2, str8, cVar3) == aVar3) {
                                        return aVar3;
                                    }
                                    return w61.a0.a;
                                }
                                int i12 = cVar3.y;
                                int i13 = cVar3.x;
                                str5 = cVar3.w;
                                l4 l4Var2 = cVar3.v;
                                str6 = cVar3.u;
                                sy.y.j(obj3);
                                i5 = i12;
                                i6 = i13;
                                a2 = l4Var2;
                                d6Var = (d6) obj3;
                                if (d6Var != null) {
                                    i5 = i6;
                                    str8 = str6;
                                    n4Var = new n4();
                                    cVar3.u = null;
                                    cVar3.v = null;
                                    cVar3.w = null;
                                    cVar3.x = i5;
                                    cVar3.B = 4;
                                    if (bVar3.p(n4Var, a2, str8, cVar3) == aVar3) {
                                    }
                                    return w61.a0.a;
                                }
                                c6 c6Var = d6Var.b;
                                d6 d6Var2 = new d6(d6Var.a, new c6(c6Var.a, c6Var.b - 1), d6Var.c);
                                f6 f6Var = new f6();
                                cVar3.u = str6;
                                cVar3.v = a2;
                                cVar3.w = null;
                                cVar3.x = i6;
                                cVar3.y = i5;
                                cVar3.B = 3;
                                if (bVar3.p(f6Var, d6Var2, str5, cVar3) == aVar3) {
                                    return aVar3;
                                }
                                str7 = str6;
                                i5 = i6;
                                str8 = str7;
                                n4Var = new n4();
                                cVar3.u = null;
                                cVar3.v = null;
                                cVar3.w = null;
                                cVar3.x = i5;
                                cVar3.B = 4;
                                if (bVar3.p(n4Var, a2, str8, cVar3) == aVar3) {
                                }
                                return w61.a0.a;
                            }
                            str8 = cVar3.u;
                            sy.y.j(obj3);
                        }
                        l4Var = (l4) obj3;
                        if (l4Var != null) {
                            a2 = l4.a(l4Var, bf.u, df.v);
                            p0 p0Var = l4Var.E.a;
                            i5 = 0;
                            if (p0Var != null) {
                                String str10 = p0Var.a;
                                f6 f6Var2 = new f6();
                                cVar3.u = str8;
                                cVar3.v = a2;
                                cVar3.w = str10;
                                cVar3.x = 0;
                                cVar3.y = 0;
                                cVar3.B = 2;
                                Object c2 = bVar3.c(f6Var2, str10);
                                if (c2 == aVar3) {
                                    return aVar3;
                                }
                                str5 = str10;
                                obj3 = c2;
                                str6 = str8;
                                i6 = 0;
                                d6Var = (d6) obj3;
                                if (d6Var != null) {
                                }
                            }
                            n4Var = new n4();
                            cVar3.u = null;
                            cVar3.v = null;
                            cVar3.w = null;
                            cVar3.x = i5;
                            cVar3.B = 4;
                            if (bVar3.p(n4Var, a2, str8, cVar3) == aVar3) {
                            }
                        }
                        return w61.a0.a;
                    }
                }
                cVar3 = new rw0.c(this, cVar);
                Object obj32 = cVar3.z;
                b71.a aVar32 = b71.a.r;
                i4 = cVar3.B;
                com.github.service.wrapper.b bVar32 = this.b;
                if (i4 != 0) {
                }
                l4Var = (l4) obj32;
                if (l4Var != null) {
                }
                return w61.a0.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r2 == r4) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(String str, c71.c cVar) {
        y00.x xVar;
        int i;
        cq.c cVar2;
        a10.b bVar;
        String str2 = str;
        if (cVar instanceof y00.x) {
            xVar = (y00.x) cVar;
            int i2 = xVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xVar.y = i2 - Integer.MIN_VALUE;
                Object obj = xVar.w;
                b71.a aVar = b71.a.r;
                i = xVar.y;
                com.github.service.wrapper.b bVar2 = this.b;
                if (i != 0) {
                    sy.y.j(obj);
                    cq.e eVar = new cq.e();
                    xVar.u = str2;
                    xVar.y = 1;
                    obj = bVar2.c(eVar, str2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = xVar.v;
                        sy.y.j(obj);
                        if (bVar != null) {
                            return bVar;
                        }
                        return new c(1, null, 21);
                    }
                    str2 = xVar.u;
                    sy.y.j(obj);
                }
                cVar2 = (cq.c) obj;
                if (cVar2 != null) {
                    a10.b bVar3 = new a10.b(this, cVar2, (a71.c) null, 15);
                    cq.e eVar2 = new cq.e();
                    boolean z = !cVar2.f;
                    boolean z2 = !cVar2.g;
                    int i3 = cVar2.d.a;
                    if (cVar2.b) {
                        i3--;
                    }
                    cq.a aVar2 = new cq.a(i3);
                    int i4 = cVar2.e.a;
                    if (cVar2.c) {
                        i4--;
                    }
                    cq.c cVar3 = new cq.c(cVar2.a, false, false, aVar2, new cq.b(i4), z, z2, cVar2.h);
                    xVar.u = null;
                    xVar.v = bVar3;
                    xVar.y = 2;
                    if (bVar2.p(eVar2, cVar3, str2, xVar) != aVar) {
                        bVar = bVar3;
                        if (bVar != null) {
                        }
                    }
                    return aVar;
                }
                return new c(1, null, 21);
            }
        }
        xVar = new y00.x(this, cVar);
        Object obj2 = xVar.w;
        b71.a aVar3 = b71.a.r;
        i = xVar.y;
        com.github.service.wrapper.b bVar22 = this.b;
        if (i != 0) {
        }
        cVar2 = (cq.c) obj2;
        if (cVar2 != null) {
        }
        return new c(1, null, 21);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        if (r2 == r4) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(String str, c71.c cVar) {
        zb0.p pVar;
        int i;
        c30.c cVar2;
        a10.b bVar;
        String str2 = str;
        if (cVar instanceof zb0.p) {
            pVar = (zb0.p) cVar;
            int i2 = pVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.y = i2 - Integer.MIN_VALUE;
                Object obj = pVar.w;
                b71.a aVar = b71.a.r;
                i = pVar.y;
                com.github.service.wrapper.b bVar2 = this.b;
                if (i != 0) {
                    sy.y.j(obj);
                    c30.d dVar = new c30.d(0);
                    pVar.u = str2;
                    pVar.y = 1;
                    obj = bVar2.c(dVar, str2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = pVar.v;
                        sy.y.j(obj);
                        if (bVar != null) {
                            return bVar;
                        }
                        return new c(1, null, 29);
                    }
                    str2 = pVar.u;
                    sy.y.j(obj);
                }
                cVar2 = (c30.c) obj;
                if (cVar2 != null) {
                    a10.b bVar3 = new a10.b(this, cVar2, (a71.c) null, 19);
                    c30.d dVar2 = new c30.d(0);
                    boolean z = !cVar2.f;
                    boolean z2 = !cVar2.g;
                    int i3 = cVar2.d.a;
                    if (cVar2.b) {
                        i3--;
                    }
                    c30.a aVar2 = new c30.a(i3);
                    int i4 = cVar2.e.a;
                    if (cVar2.c) {
                        i4--;
                    }
                    c30.c cVar3 = new c30.c(cVar2.a, false, false, aVar2, new c30.b(i4), z, z2, cVar2.h);
                    pVar.u = null;
                    pVar.v = bVar3;
                    pVar.y = 2;
                    if (bVar2.p(dVar2, cVar3, str2, pVar) != aVar) {
                        bVar = bVar3;
                        if (bVar != null) {
                        }
                    }
                    return aVar;
                }
                return new c(1, null, 29);
            }
        }
        pVar = new zb0.p(this, cVar);
        Object obj2 = pVar.w;
        b71.a aVar3 = b71.a.r;
        i = pVar.y;
        com.github.service.wrapper.b bVar22 = this.b;
        if (i != 0) {
        }
        cVar2 = (c30.c) obj2;
        if (cVar2 != null) {
        }
        return new c(1, null, 29);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r2 == r4) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(String str, c71.c cVar) {
        vm0.q qVar;
        int i;
        sd0.c cVar2;
        a10.b bVar;
        String str2 = str;
        if (cVar instanceof vm0.q) {
            qVar = (vm0.q) cVar;
            int i2 = qVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.y = i2 - Integer.MIN_VALUE;
                Object obj = qVar.w;
                b71.a aVar = b71.a.r;
                i = qVar.y;
                com.github.service.wrapper.b bVar2 = this.b;
                if (i != 0) {
                    sy.y.j(obj);
                    sd0.e eVar = new sd0.e();
                    qVar.u = str2;
                    qVar.y = 1;
                    obj = bVar2.c(eVar, str2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = qVar.v;
                        sy.y.j(obj);
                        if (bVar != null) {
                            return bVar;
                        }
                        return new c(1, null, 13);
                    }
                    str2 = qVar.u;
                    sy.y.j(obj);
                }
                cVar2 = (sd0.c) obj;
                if (cVar2 != null) {
                    a10.b bVar3 = new a10.b(this, cVar2, (a71.c) null, 11);
                    sd0.e eVar2 = new sd0.e();
                    boolean z = !cVar2.f;
                    boolean z2 = !cVar2.g;
                    int i3 = cVar2.d.a;
                    if (cVar2.b) {
                        i3--;
                    }
                    sd0.a aVar2 = new sd0.a(i3);
                    int i4 = cVar2.e.a;
                    if (cVar2.c) {
                        i4--;
                    }
                    sd0.c cVar3 = new sd0.c(cVar2.a, false, false, aVar2, new sd0.b(i4), z, z2, cVar2.h);
                    qVar.u = null;
                    qVar.v = bVar3;
                    qVar.y = 2;
                    if (bVar2.p(eVar2, cVar3, str2, qVar) != aVar) {
                        bVar = bVar3;
                        if (bVar != null) {
                        }
                    }
                    return aVar;
                }
                return new c(1, null, 13);
            }
        }
        qVar = new vm0.q(this, cVar);
        Object obj2 = qVar.w;
        b71.a aVar3 = b71.a.r;
        i = qVar.y;
        com.github.service.wrapper.b bVar22 = this.b;
        if (i != 0) {
        }
        cVar2 = (sd0.c) obj2;
        if (cVar2 != null) {
        }
        return new c(1, null, 13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r2 == r4) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(String str, c71.c cVar) {
        x xVar;
        int i;
        ap0.c cVar2;
        a10.b bVar;
        String str2 = str;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i2 = xVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xVar.y = i2 - Integer.MIN_VALUE;
                Object obj = xVar.w;
                b71.a aVar = b71.a.r;
                i = xVar.y;
                com.github.service.wrapper.b bVar2 = this.b;
                if (i != 0) {
                    sy.y.j(obj);
                    ap0.e eVar = new ap0.e();
                    xVar.u = str2;
                    xVar.y = 1;
                    obj = bVar2.c(eVar, str2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = xVar.v;
                        sy.y.j(obj);
                        if (bVar != null) {
                            return bVar;
                        }
                        return new c(1, null, 4);
                    }
                    str2 = xVar.u;
                    sy.y.j(obj);
                }
                cVar2 = (ap0.c) obj;
                if (cVar2 != null) {
                    a10.b bVar3 = new a10.b(this, cVar2, (a71.c) null, 2);
                    ap0.e eVar2 = new ap0.e();
                    boolean z = !cVar2.f;
                    boolean z2 = !cVar2.g;
                    int i3 = cVar2.d.a;
                    if (cVar2.b) {
                        i3--;
                    }
                    ap0.a aVar2 = new ap0.a(i3);
                    int i4 = cVar2.e.a;
                    if (cVar2.c) {
                        i4--;
                    }
                    ap0.c cVar3 = new ap0.c(cVar2.a, false, false, aVar2, new ap0.b(i4), z, z2, cVar2.h);
                    xVar.u = null;
                    xVar.v = bVar3;
                    xVar.y = 2;
                    if (bVar2.p(eVar2, cVar3, str2, xVar) != aVar) {
                        bVar = bVar3;
                        if (bVar != null) {
                        }
                    }
                    return aVar;
                }
                return new c(1, null, 4);
            }
        }
        xVar = new x(this, cVar);
        Object obj2 = xVar.w;
        b71.a aVar3 = b71.a.r;
        i = xVar.y;
        com.github.service.wrapper.b bVar22 = this.b;
        if (i != 0) {
        }
        cVar2 = (ap0.c) obj2;
        if (cVar2 != null) {
        }
        return new c(1, null, 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r13 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(String str, c71.c cVar) {
        y00.y yVar;
        int i;
        cq.z6 z6Var;
        y00.z zVar;
        if (cVar instanceof y00.y) {
            yVar = (y00.y) cVar;
            int i2 = yVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.y = i2 - Integer.MIN_VALUE;
                Object obj = yVar.w;
                b71.a aVar = b71.a.r;
                i = yVar.y;
                com.github.service.wrapper.b bVar = this.b;
                if (i != 0) {
                    sy.y.j(obj);
                    cq.b7 b7Var = new cq.b7();
                    yVar.u = str;
                    yVar.y = 1;
                    obj = bVar.c(b7Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zVar = yVar.v;
                        sy.y.j(obj);
                        if (zVar != null) {
                            return zVar;
                        }
                        return new c(1, null, 22);
                    }
                    str = yVar.u;
                    sy.y.j(obj);
                }
                z6Var = (cq.z6) obj;
                if (z6Var != null) {
                    y00.z zVar2 = new y00.z(this, z6Var, (a71.c) null, 0);
                    cq.b7 b7Var2 = new cq.b7();
                    cq.z6 z6Var2 = new cq.z6(z6Var.a, true, new cq.y6(z6Var.c.a + 1), z6Var.d);
                    yVar.u = null;
                    yVar.v = zVar2;
                    yVar.y = 2;
                    if (bVar.p(b7Var2, z6Var2, str, yVar) != aVar) {
                        zVar = zVar2;
                        if (zVar != null) {
                        }
                    }
                    return aVar;
                }
                return new c(1, null, 22);
            }
        }
        yVar = new y00.y(this, cVar);
        Object obj2 = yVar.w;
        b71.a aVar2 = b71.a.r;
        i = yVar.y;
        com.github.service.wrapper.b bVar2 = this.b;
        if (i != 0) {
        }
        z6Var = (cq.z6) obj2;
        if (z6Var != null) {
        }
        return new c(1, null, 22);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r13 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k(String str, c71.c cVar) {
        zb0.q qVar;
        int i;
        r0 r0Var;
        zb0.r rVar;
        if (cVar instanceof zb0.q) {
            qVar = (zb0.q) cVar;
            int i2 = qVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.y = i2 - Integer.MIN_VALUE;
                Object obj = qVar.w;
                b71.a aVar = b71.a.r;
                i = qVar.y;
                com.github.service.wrapper.b bVar = this.b;
                if (i != 0) {
                    sy.y.j(obj);
                    s0 s0Var = new s0(0);
                    qVar.u = str;
                    qVar.y = 1;
                    obj = bVar.c(s0Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rVar = qVar.v;
                        sy.y.j(obj);
                        if (rVar != null) {
                            return rVar;
                        }
                        return new zb0.s(1, null, 0);
                    }
                    str = qVar.u;
                    sy.y.j(obj);
                }
                r0Var = (r0) obj;
                if (r0Var != null) {
                    zb0.r rVar2 = new zb0.r(this, r0Var, null, 0);
                    s0 s0Var2 = new s0(0);
                    r0 r0Var2 = new r0(r0Var.a, true, new c30.q0(r0Var.c.a + 1), r0Var.d);
                    qVar.u = null;
                    qVar.v = rVar2;
                    qVar.y = 2;
                    if (bVar.p(s0Var2, r0Var2, str, qVar) != aVar) {
                        rVar = rVar2;
                        if (rVar != null) {
                        }
                    }
                    return aVar;
                }
                return new zb0.s(1, null, 0);
            }
        }
        qVar = new zb0.q(this, cVar);
        Object obj2 = qVar.w;
        b71.a aVar2 = b71.a.r;
        i = qVar.y;
        com.github.service.wrapper.b bVar2 = this.b;
        if (i != 0) {
        }
        r0Var = (r0) obj2;
        if (r0Var != null) {
        }
        return new zb0.s(1, null, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r13 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(String str, c71.c cVar) {
        vm0.r rVar;
        int i;
        b1 b1Var;
        vm0.s sVar;
        if (cVar instanceof vm0.r) {
            rVar = (vm0.r) cVar;
            int i2 = rVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.y = i2 - Integer.MIN_VALUE;
                Object obj = rVar.w;
                b71.a aVar = b71.a.r;
                i = rVar.y;
                com.github.service.wrapper.b bVar = this.b;
                if (i != 0) {
                    sy.y.j(obj);
                    d1 d1Var = new d1();
                    rVar.u = str;
                    rVar.y = 1;
                    obj = bVar.c(d1Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sVar = rVar.v;
                        sy.y.j(obj);
                        if (sVar != null) {
                            return sVar;
                        }
                        return new c(1, null, 14);
                    }
                    str = rVar.u;
                    sy.y.j(obj);
                }
                b1Var = (b1) obj;
                if (b1Var != null) {
                    vm0.s sVar2 = new vm0.s(this, b1Var, null, 0);
                    d1 d1Var2 = new d1();
                    b1 b1Var2 = new b1(b1Var.a, true, new a1(b1Var.c.a + 1), b1Var.d);
                    rVar.u = null;
                    rVar.v = sVar2;
                    rVar.y = 2;
                    if (bVar.p(d1Var2, b1Var2, str, rVar) != aVar) {
                        sVar = sVar2;
                        if (sVar != null) {
                        }
                    }
                    return aVar;
                }
                return new c(1, null, 14);
            }
        }
        rVar = new vm0.r(this, cVar);
        Object obj2 = rVar.w;
        b71.a aVar2 = b71.a.r;
        i = rVar.y;
        com.github.service.wrapper.b bVar2 = this.b;
        if (i != 0) {
        }
        b1Var = (b1) obj2;
        if (b1Var != null) {
        }
        return new c(1, null, 14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r13 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(String str, c71.c cVar) {
        y yVar;
        int i;
        ap0.d6 d6Var;
        z zVar;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i2 = yVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yVar.y = i2 - Integer.MIN_VALUE;
                Object obj = yVar.w;
                b71.a aVar = b71.a.r;
                i = yVar.y;
                com.github.service.wrapper.b bVar = this.b;
                if (i != 0) {
                    sy.y.j(obj);
                    ap0.f6 f6Var = new ap0.f6();
                    yVar.u = str;
                    yVar.y = 1;
                    obj = bVar.c(f6Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zVar = yVar.v;
                        sy.y.j(obj);
                        if (zVar != null) {
                            return zVar;
                        }
                        return new c(1, null, 5);
                    }
                    str = yVar.u;
                    sy.y.j(obj);
                }
                d6Var = (ap0.d6) obj;
                if (d6Var != null) {
                    z zVar2 = new z(this, d6Var, null, 0);
                    ap0.f6 f6Var2 = new ap0.f6();
                    ap0.d6 d6Var2 = new ap0.d6(d6Var.a, true, new ap0.c6(d6Var.c.a + 1), d6Var.d);
                    yVar.u = null;
                    yVar.v = zVar2;
                    yVar.y = 2;
                    if (bVar.p(f6Var2, d6Var2, str, yVar) != aVar) {
                        zVar = zVar2;
                        if (zVar != null) {
                        }
                    }
                    return aVar;
                }
                return new c(1, null, 5);
            }
        }
        yVar = new y(this, cVar);
        Object obj2 = yVar.w;
        b71.a aVar2 = b71.a.r;
        i = yVar.y;
        com.github.service.wrapper.b bVar2 = this.b;
        if (i != 0) {
        }
        d6Var = (ap0.d6) obj2;
        if (d6Var != null) {
        }
        return new c(1, null, 5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r2 == r4) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(String str, c71.c cVar) {
        y00.a0 a0Var;
        int i;
        s6 s6Var;
        a10.b bVar;
        String str2 = str;
        if (cVar instanceof y00.a0) {
            a0Var = (y00.a0) cVar;
            int i2 = a0Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a0Var.y = i2 - Integer.MIN_VALUE;
                Object obj = a0Var.w;
                b71.a aVar = b71.a.r;
                i = a0Var.y;
                com.github.service.wrapper.b bVar2 = this.b;
                if (i != 0) {
                    sy.y.j(obj);
                    u6 u6Var = new u6();
                    a0Var.u = str2;
                    a0Var.y = 1;
                    obj = bVar2.c(u6Var, str2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = a0Var.v;
                        sy.y.j(obj);
                        if (bVar != null) {
                            return bVar;
                        }
                        return new c(1, null, 23);
                    }
                    str2 = a0Var.u;
                    sy.y.j(obj);
                }
                s6Var = (s6) obj;
                if (s6Var != null) {
                    a10.b bVar3 = new a10.b(this, s6Var, (a71.c) null, 16);
                    u6 u6Var2 = new u6();
                    s6 s6Var2 = new s6(s6Var.a, !s6Var.b, !s6Var.c, false, false, s6Var.f);
                    a0Var.u = null;
                    a0Var.v = bVar3;
                    a0Var.y = 2;
                    if (bVar2.p(u6Var2, s6Var2, str2, a0Var) != aVar) {
                        bVar = bVar3;
                        if (bVar != null) {
                        }
                    }
                    return aVar;
                }
                return new c(1, null, 23);
            }
        }
        a0Var = new y00.a0(this, cVar);
        Object obj2 = a0Var.w;
        b71.a aVar2 = b71.a.r;
        i = a0Var.y;
        com.github.service.wrapper.b bVar22 = this.b;
        if (i != 0) {
        }
        s6Var = (s6) obj2;
        if (s6Var != null) {
        }
        return new c(1, null, 23);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r2 == r4) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object o(String str, c71.c cVar) {
        zb0.t tVar;
        int i;
        n0 n0Var;
        a10.b bVar;
        String str2 = str;
        if (cVar instanceof zb0.t) {
            tVar = (zb0.t) cVar;
            int i2 = tVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tVar.y = i2 - Integer.MIN_VALUE;
                Object obj = tVar.w;
                b71.a aVar = b71.a.r;
                i = tVar.y;
                com.github.service.wrapper.b bVar2 = this.b;
                if (i != 0) {
                    sy.y.j(obj);
                    o0 o0Var = new o0(0);
                    tVar.u = str2;
                    tVar.y = 1;
                    obj = bVar2.c(o0Var, str2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = tVar.v;
                        sy.y.j(obj);
                        if (bVar != null) {
                            return bVar;
                        }
                        return new zb0.s(1, null, 1);
                    }
                    str2 = tVar.u;
                    sy.y.j(obj);
                }
                n0Var = (n0) obj;
                if (n0Var != null) {
                    a10.b bVar3 = new a10.b(this, n0Var, (a71.c) null, 20);
                    o0 o0Var2 = new o0(0);
                    n0 n0Var2 = new n0(n0Var.a, !n0Var.b, !n0Var.c, false, false, n0Var.f);
                    tVar.u = null;
                    tVar.v = bVar3;
                    tVar.y = 2;
                    if (bVar2.p(o0Var2, n0Var2, str2, tVar) != aVar) {
                        bVar = bVar3;
                        if (bVar != null) {
                        }
                    }
                    return aVar;
                }
                return new zb0.s(1, null, 1);
            }
        }
        tVar = new zb0.t(this, cVar);
        Object obj2 = tVar.w;
        b71.a aVar2 = b71.a.r;
        i = tVar.y;
        com.github.service.wrapper.b bVar22 = this.b;
        if (i != 0) {
        }
        n0Var = (n0) obj2;
        if (n0Var != null) {
        }
        return new zb0.s(1, null, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r2 == r4) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(String str, c71.c cVar) {
        vm0.t tVar;
        int i;
        w0 w0Var;
        a10.b bVar;
        String str2 = str;
        if (cVar instanceof vm0.t) {
            tVar = (vm0.t) cVar;
            int i2 = tVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tVar.y = i2 - Integer.MIN_VALUE;
                Object obj = tVar.w;
                b71.a aVar = b71.a.r;
                i = tVar.y;
                com.github.service.wrapper.b bVar2 = this.b;
                if (i != 0) {
                    sy.y.j(obj);
                    y0 y0Var = new y0();
                    tVar.u = str2;
                    tVar.y = 1;
                    obj = bVar2.c(y0Var, str2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = tVar.v;
                        sy.y.j(obj);
                        if (bVar != null) {
                            return bVar;
                        }
                        return new c(1, null, 15);
                    }
                    str2 = tVar.u;
                    sy.y.j(obj);
                }
                w0Var = (w0) obj;
                if (w0Var != null) {
                    a10.b bVar3 = new a10.b(this, w0Var, (a71.c) null, 12);
                    y0 y0Var2 = new y0();
                    w0 w0Var2 = new w0(w0Var.a, !w0Var.b, !w0Var.c, false, false, w0Var.f);
                    tVar.u = null;
                    tVar.v = bVar3;
                    tVar.y = 2;
                    if (bVar2.p(y0Var2, w0Var2, str2, tVar) != aVar) {
                        bVar = bVar3;
                        if (bVar != null) {
                        }
                    }
                    return aVar;
                }
                return new c(1, null, 15);
            }
        }
        tVar = new vm0.t(this, cVar);
        Object obj2 = tVar.w;
        b71.a aVar2 = b71.a.r;
        i = tVar.y;
        com.github.service.wrapper.b bVar22 = this.b;
        if (i != 0) {
        }
        w0Var = (w0) obj2;
        if (w0Var != null) {
        }
        return new c(1, null, 15);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r2 == r4) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(String str, c71.c cVar) {
        a0 a0Var;
        int i;
        w5 w5Var;
        a10.b bVar;
        String str2 = str;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i2 = a0Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a0Var.y = i2 - Integer.MIN_VALUE;
                Object obj = a0Var.w;
                b71.a aVar = b71.a.r;
                i = a0Var.y;
                com.github.service.wrapper.b bVar2 = this.b;
                if (i != 0) {
                    sy.y.j(obj);
                    y5 y5Var = new y5();
                    a0Var.u = str2;
                    a0Var.y = 1;
                    obj = bVar2.c(y5Var, str2);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = a0Var.v;
                        sy.y.j(obj);
                        if (bVar != null) {
                            return bVar;
                        }
                        return new c(1, null, 6);
                    }
                    str2 = a0Var.u;
                    sy.y.j(obj);
                }
                w5Var = (w5) obj;
                if (w5Var != null) {
                    a10.b bVar3 = new a10.b(this, w5Var, (a71.c) null, 3);
                    y5 y5Var2 = new y5();
                    w5 w5Var2 = new w5(w5Var.a, !w5Var.b, !w5Var.c, false, false, w5Var.f);
                    a0Var.u = null;
                    a0Var.v = bVar3;
                    a0Var.y = 2;
                    if (bVar2.p(y5Var2, w5Var2, str2, a0Var) != aVar) {
                        bVar = bVar3;
                        if (bVar != null) {
                        }
                    }
                    return aVar;
                }
                return new c(1, null, 6);
            }
        }
        a0Var = new a0(this, cVar);
        Object obj2 = a0Var.w;
        b71.a aVar2 = b71.a.r;
        i = a0Var.y;
        com.github.service.wrapper.b bVar22 = this.b;
        if (i != 0) {
        }
        w5Var = (w5) obj2;
        if (w5Var != null) {
        }
        return new c(1, null, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(String str, c71.c cVar) {
        y00.b0 b0Var;
        int i;
        cq.z6 z6Var;
        y00.z zVar;
        if (cVar instanceof y00.b0) {
            b0Var = (y00.b0) cVar;
            int i2 = b0Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b0Var.y = i2 - Integer.MIN_VALUE;
                Object obj = b0Var.w;
                b71.a aVar = b71.a.r;
                i = b0Var.y;
                com.github.service.wrapper.b bVar = this.b;
                if (i != 0) {
                    sy.y.j(obj);
                    cq.b7 b7Var = new cq.b7();
                    b0Var.u = str;
                    b0Var.y = 1;
                    obj = bVar.c(b7Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zVar = b0Var.v;
                        sy.y.j(obj);
                        if (zVar != null) {
                            return zVar;
                        }
                        return new c(1, null, 24);
                    }
                    str = b0Var.u;
                    sy.y.j(obj);
                }
                z6Var = (cq.z6) obj;
                if (z6Var != null) {
                    y00.z zVar2 = new y00.z(this, z6Var, (a71.c) null, 1);
                    cq.b7 b7Var2 = new cq.b7();
                    cq.z6 z6Var2 = new cq.z6(z6Var.a, false, new cq.y6(z6Var.c.a - 1), z6Var.d);
                    b0Var.u = null;
                    b0Var.v = zVar2;
                    b0Var.y = 2;
                    if (bVar.p(b7Var2, z6Var2, str, b0Var) != aVar) {
                        zVar = zVar2;
                        if (zVar != null) {
                        }
                    }
                    return aVar;
                }
                return new c(1, null, 24);
            }
        }
        b0Var = new y00.b0(this, cVar);
        Object obj2 = b0Var.w;
        b71.a aVar2 = b71.a.r;
        i = b0Var.y;
        com.github.service.wrapper.b bVar2 = this.b;
        if (i != 0) {
        }
        z6Var = (cq.z6) obj2;
        if (z6Var != null) {
        }
        return new c(1, null, 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object s(String str, c71.c cVar) {
        zb0.u uVar;
        int i;
        r0 r0Var;
        zb0.r rVar;
        if (cVar instanceof zb0.u) {
            uVar = (zb0.u) cVar;
            int i2 = uVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.y = i2 - Integer.MIN_VALUE;
                Object obj = uVar.w;
                b71.a aVar = b71.a.r;
                i = uVar.y;
                com.github.service.wrapper.b bVar = this.b;
                if (i != 0) {
                    sy.y.j(obj);
                    s0 s0Var = new s0(0);
                    uVar.u = str;
                    uVar.y = 1;
                    obj = bVar.c(s0Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rVar = uVar.v;
                        sy.y.j(obj);
                        if (rVar != null) {
                            return rVar;
                        }
                        return new zb0.s(1, null, 2);
                    }
                    str = uVar.u;
                    sy.y.j(obj);
                }
                r0Var = (r0) obj;
                if (r0Var != null) {
                    zb0.r rVar2 = new zb0.r(this, r0Var, null, 1);
                    s0 s0Var2 = new s0(0);
                    r0 r0Var2 = new r0(r0Var.a, false, new c30.q0(r0Var.c.a - 1), r0Var.d);
                    uVar.u = null;
                    uVar.v = rVar2;
                    uVar.y = 2;
                    if (bVar.p(s0Var2, r0Var2, str, uVar) != aVar) {
                        rVar = rVar2;
                        if (rVar != null) {
                        }
                    }
                    return aVar;
                }
                return new zb0.s(1, null, 2);
            }
        }
        uVar = new zb0.u(this, cVar);
        Object obj2 = uVar.w;
        b71.a aVar2 = b71.a.r;
        i = uVar.y;
        com.github.service.wrapper.b bVar2 = this.b;
        if (i != 0) {
        }
        r0Var = (r0) obj2;
        if (r0Var != null) {
        }
        return new zb0.s(1, null, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(String str, c71.c cVar) {
        vm0.u uVar;
        int i;
        b1 b1Var;
        vm0.s sVar;
        if (cVar instanceof vm0.u) {
            uVar = (vm0.u) cVar;
            int i2 = uVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.y = i2 - Integer.MIN_VALUE;
                Object obj = uVar.w;
                b71.a aVar = b71.a.r;
                i = uVar.y;
                com.github.service.wrapper.b bVar = this.b;
                if (i != 0) {
                    sy.y.j(obj);
                    d1 d1Var = new d1();
                    uVar.u = str;
                    uVar.y = 1;
                    obj = bVar.c(d1Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sVar = uVar.v;
                        sy.y.j(obj);
                        if (sVar != null) {
                            return sVar;
                        }
                        return new c(1, null, 16);
                    }
                    str = uVar.u;
                    sy.y.j(obj);
                }
                b1Var = (b1) obj;
                if (b1Var != null) {
                    vm0.s sVar2 = new vm0.s(this, b1Var, null, 1);
                    d1 d1Var2 = new d1();
                    b1 b1Var2 = new b1(b1Var.a, false, new a1(b1Var.c.a - 1), b1Var.d);
                    uVar.u = null;
                    uVar.v = sVar2;
                    uVar.y = 2;
                    if (bVar.p(d1Var2, b1Var2, str, uVar) != aVar) {
                        sVar = sVar2;
                        if (sVar != null) {
                        }
                    }
                    return aVar;
                }
                return new c(1, null, 16);
            }
        }
        uVar = new vm0.u(this, cVar);
        Object obj2 = uVar.w;
        b71.a aVar2 = b71.a.r;
        i = uVar.y;
        com.github.service.wrapper.b bVar2 = this.b;
        if (i != 0) {
        }
        b1Var = (b1) obj2;
        if (b1Var != null) {
        }
        return new c(1, null, 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r14 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object u(String str, c71.c cVar) {
        b0 b0Var;
        int i;
        ap0.d6 d6Var;
        z zVar;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i2 = b0Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b0Var.y = i2 - Integer.MIN_VALUE;
                Object obj = b0Var.w;
                b71.a aVar = b71.a.r;
                i = b0Var.y;
                com.github.service.wrapper.b bVar = this.b;
                if (i != 0) {
                    sy.y.j(obj);
                    ap0.f6 f6Var = new ap0.f6();
                    b0Var.u = str;
                    b0Var.y = 1;
                    obj = bVar.c(f6Var, str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zVar = b0Var.v;
                        sy.y.j(obj);
                        if (zVar != null) {
                            return zVar;
                        }
                        return new c(1, null, 7);
                    }
                    str = b0Var.u;
                    sy.y.j(obj);
                }
                d6Var = (ap0.d6) obj;
                if (d6Var != null) {
                    z zVar2 = new z(this, d6Var, null, 1);
                    ap0.f6 f6Var2 = new ap0.f6();
                    ap0.d6 d6Var2 = new ap0.d6(d6Var.a, false, new ap0.c6(d6Var.c.a - 1), d6Var.d);
                    b0Var.u = null;
                    b0Var.v = zVar2;
                    b0Var.y = 2;
                    if (bVar.p(f6Var2, d6Var2, str, b0Var) != aVar) {
                        zVar = zVar2;
                        if (zVar != null) {
                        }
                    }
                    return aVar;
                }
                return new c(1, null, 7);
            }
        }
        b0Var = new b0(this, cVar);
        Object obj2 = b0Var.w;
        b71.a aVar2 = b71.a.r;
        i = b0Var.y;
        com.github.service.wrapper.b bVar2 = this.b;
        if (i != 0) {
        }
        d6Var = (ap0.d6) obj2;
        if (d6Var != null) {
        }
        return new c(1, null, 7);
    }
}
