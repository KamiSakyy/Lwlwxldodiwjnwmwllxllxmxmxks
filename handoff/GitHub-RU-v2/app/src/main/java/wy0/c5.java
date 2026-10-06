package wy0;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.Avatar;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import jn0.as;
import jn0.at;
import jn0.bt;
import jn0.cs;
import jn0.ct;
import jn0.dr;
import jn0.ds;
import jn0.ed0;
import jn0.er;
import jn0.es;
import jn0.fd0;
import jn0.fr;
import jn0.fs;
import jn0.ft;
import jn0.fz;
import jn0.gd0;
import jn0.gr;
import jn0.gs;
import jn0.gz;
import jn0.hc0;
import jn0.hs;
import jn0.hz;
import jn0.is;
import jn0.jn;
import jn0.jr;
import jn0.js;
import jn0.jz;
import jn0.kn;
import jn0.kz;
import jn0.m00;
import jn0.mc0;
import jn0.mp;
import jn0.ms;
import jn0.mz;
import jn0.n00;
import jn0.np;
import jn0.ns;
import jn0.nz;
import jn0.o00;
import jn0.oc0;
import jn0.op;
import jn0.p00;
import jn0.pc0;
import jn0.pp;
import jn0.ps;
import jn0.q00;
import jn0.qc0;
import jn0.qp;
import jn0.rc0;
import jn0.rr;
import jn0.rs;
import jn0.sr;
import jn0.ss;
import jn0.tc0;
import jn0.tr;
import jn0.tx;
import jn0.ur;
import jn0.us;
import jn0.ux;
import jn0.vc0;
import jn0.vr;
import jn0.vs;
import jn0.vx;
import jn0.wc0;
import jn0.wr;
import jn0.xq;
import jn0.xs;
import jn0.xx;
import jn0.yr;
import jn0.ys;
import jn0.yx;
import jn0.zq;
import jn0.zr;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c5 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ c5(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        b6 b6Var;
        int i;
        o01.c cVar2;
        o01.a aVar;
        java.util.List r5;
        es esVar;
        es esVar2;
        List list;
        us usVar;
        js jsVar;
        vs vsVar;
        vs vsVar2;
        o01.a aVar2;
        Object r52;
        es esVar3;
        es esVar4;
        List list2;
        boolean z;
        boolean z2;
        String str;
        String str2;
        o01.d dVar;
        if (cVar instanceof b6) {
            b6Var = (b6) cVar;
            int i2 = b6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = b6Var.u;
                b71.a aVar3 = b71.a.r;
                i = b6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    cs csVar = (cs) obj;
                    String str3 = "<this>";
                    k71.k.g(csVar, "<this>");
                    ps psVar = csVar.a;
                    ns nsVar = psVar != null ? psVar.d : null;
                    x61.rShadow rVar = x61.rShadow.r;
                    if (nsVar != null) {
                        ns nsVar2 = psVar.d;
                        if (nsVar2 != null) {
                            String str4 = nsVar2.e;
                            String str5 = nsVar2.b;
                            gu0.c cVar3 = nsVar2.q;
                            rs rsVar = nsVar2.f;
                            String str6 = nsVar2.d;
                            String str7 = (str6 == null || t71.p.T(str6)) ? str4 : str6;
                            zr zrVar = nsVar2.g;
                            com.github.service.models.response.a e = k41.b.e(zrVar != null ? zrVar.c : null);
                            ZonedDateTime zonedDateTime = nsVar2.m;
                            if (zonedDateTime == null) {
                                zonedDateTime = nsVar2.l;
                            }
                            ZonedDateTime zonedDateTime2 = zonedDateTime;
                            boolean z3 = nsVar2.j;
                            boolean z4 = nsVar2.i;
                            boolean z5 = nsVar2.k;
                            String str8 = nsVar2.h;
                            String str9 = str8 == null ? "" : str8;
                            String str10 = rsVar != null ? rsVar.b : null;
                            String str11 = rsVar != null ? rsVar.c : null;
                            String str12 = nsVar2.c;
                            ds dsVar = nsVar2.o;
                            if (dsVar != null) {
                                String str13 = dsVar.a;
                                int i3 = dsVar.b;
                                as asVar = dsVar.c;
                                z = z5;
                                List list3 = asVar.b;
                                if (list3 == null) {
                                    list3 = rVar;
                                }
                                ArrayList S = x61.m.S(list3);
                                z2 = z4;
                                str = str12;
                                str2 = str4;
                                ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                                int size = S.size();
                                int i4 = 0;
                                while (i4 < size) {
                                    Object obj3 = S.get(i4);
                                    i4++;
                                    ArrayList arrayList2 = S;
                                    fs fsVar = (fs) obj3;
                                    k71.k.g(fsVar, "<this>");
                                    int i5 = size;
                                    String str14 = fsVar.b;
                                    String str15 = fsVar.f;
                                    yr yrVar = fsVar.c;
                                    com.github.service.models.response.a e2 = k41.b.e(yrVar != null ? yrVar.b : null);
                                    ZonedDateTime zonedDateTime3 = fsVar.e;
                                    if (zonedDateTime3 == null) {
                                        zonedDateTime3 = fsVar.d;
                                    }
                                    arrayList.add(new o01.e(str14, str15, e2, zonedDateTime3, com.google.common.util.concurrent.a.g(fsVar.g)));
                                    size = i5;
                                    S = arrayList2;
                                }
                                dVar = new o01.d(i3, asVar.a, str13, arrayList);
                            } else {
                                z = z5;
                                z2 = z4;
                                str = str12;
                                str2 = str4;
                                dVar = null;
                            }
                            aVar2 = new o01.a(str5, str7, str2, e, zonedDateTime2, z3, z2, z, str9, str10, str11, str, dVar, m7.y.o(cVar3, str5), cVar3.c);
                        } else {
                            aVar2 = null;
                        }
                        Avatar L = m7.y.L(psVar.b.c);
                        if (nsVar2 == null || (esVar4 = nsVar2.p) == null || (list2 = esVar4.b) == null) {
                            r52 = 0;
                        } else {
                            ArrayList S2 = x61.m.S(list2);
                            r52 = new ArrayList(x61.n.F(S2, 10));
                            int size2 = S2.size();
                            int i6 = 0;
                            while (i6 < size2) {
                                Object obj4 = S2.get(i6Shadow);
                                i6++;
                                r52.add(k41.b.e(((gs) obj4).c));
                            }
                        }
                        if (r52 == 0) {
                            r52 = rVar;
                        }
                        com.github.rudroid.common.b0 b0Var = new com.github.rudroid.common.b0((nsVar2 == null || (esVar3 = nsVar2.p) == null) ? 0 : esVar3.a, (List) r52);
                        x61.rShadow rVar2 = nsVar2 != null ? nsVar2.n.b : null;
                        if (rVar2 != null) {
                            rVar = rVar2;
                        }
                        ArrayList S3 = x61.m.S(rVar);
                        ArrayList arrayList3 = new ArrayList(x61.n.F(S3, 10));
                        int size3 = S3.size();
                        for (int i7 = 0; i7 < size3; i7++) {
                            hs hsVar = (hs) S3.get(i7);
                            k71.k.g(hsVar, "<this>");
                            arrayList3.add(new o01.b(hsVar.a, hsVar.b, aa1.b.E(hsVar.c), hsVar.d, hsVar.e));
                            S3 = S3;
                            size3 = size3;
                        }
                        cVar2 = new o01.c(aVar2, L, b0Var, arrayList3, new x01.i(nsVar2 != null ? nsVar2.n.a.b : null, nsVar2 != null ? nsVar2.n.a.a : false, false));
                    } else if (psVar != null) {
                        ms msVar = psVar.c;
                        ns nsVar3 = psVar.d;
                        if (msVar == null || (usVar = msVar.b) == null || (jsVar = usVar.c) == null) {
                            aVar = null;
                        } else {
                            String str16 = jsVar.a;
                            is isVar = jsVar.b.c;
                            String str17 = jsVar.d;
                            ss ssVar = jsVar.f;
                            com.github.service.models.response.a e3 = k41.b.e((ssVar == null || (vsVar2 = ssVar.a) == null) ? null : vsVar2.c);
                            ZonedDateTime now = isVar != null ? isVar.g : ZonedDateTime.now();
                            k71.k.d(now);
                            aVar = new o01.a(str16, str17, str17, e3, now, false, false, false, isVar != null ? isVar.f : "", isVar != null ? isVar.b : null, isVar != null ? isVar.c : null, (ssVar == null || (vsVar = ssVar.a) == null) ? null : vsVar.c.c, null, rVar, false);
                        }
                        Avatar L2 = m7.y.L(psVar.b.c);
                        if (nsVar3 == null || (esVar2 = nsVar3.p) == null || (list = esVar2.b) == null) {
                            r5 = 0;
                        } else {
                            ArrayList S4 = x61.m.S(list);
                            r5 = new ArrayList(x61.n.F(S4, 10));
                            int size4 = S4.size();
                            int i8 = 0;
                            while (i8 < size4) {
                                Object obj5 = S4.get(i8);
                                i8++;
                                r5.add(k41.b.e(((gs) obj5).c));
                            }
                        }
                        if (r5 == 0) {
                            r5 = rVar;
                        }
                        com.github.rudroid.common.b0 b0Var2 = new com.github.rudroid.common.b0((nsVar3 == null || (esVar = nsVar3.p) == null) ? 0 : esVar.a, (List) r5);
                        x61.rShadow rVar3 = nsVar3 != null ? nsVar3.n.b : null;
                        if (rVar3 != null) {
                            rVar = rVar3;
                        }
                        ArrayList S5 = x61.m.S(rVar);
                        ArrayList arrayList4 = new ArrayList(x61.n.F(S5, 10));
                        int i9 = 0;
                        for (int size5 = S5.size(); i9 < size5; size5 = size5) {
                            Object obj6 = S5.get(i9);
                            i9++;
                            hs hsVar2 = (hs) obj6;
                            k71.k.g(hsVar2, str3);
                            arrayList4.add(new o01.b(hsVar2.a, hsVar2.b, aa1.b.E(hsVar2.c), hsVar2.d, hsVar2.e));
                            str3 = str3;
                        }
                        cVar2 = new o01.c(aVar, L2, b0Var2, arrayList4, new x01.i(nsVar3 != null ? nsVar3.n.a.b : null, nsVar3 != null ? nsVar3.n.a.a : false, false));
                    } else {
                        cVar2 = null;
                    }
                    if (cVar2 != null) {
                        b6Var.v = 1;
                        if (this.s.c(cVar2, b6Var) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        b6Var = new b6(this, cVar);
        Object obj22 = b6Var.u;
        b71.a aVar32 = b71.a.r;
        i = b6Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b(a71.c cVar, Object obj) {
        e6 e6Var;
        int i;
        o01.a aVar;
        bt btVar;
        if (cVar instanceof e6) {
            e6Var = (e6) cVar;
            int i2 = e6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = e6Var.u;
                b71.a aVar2 = b71.a.r;
                i = e6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    at atVar = (at) obj;
                    k71.k.g(atVar, "<this>");
                    ft ftVar = atVar.a;
                    x61.rShadow rVar = x61.rShadow.r;
                    if (ftVar == null || (btVar = ftVar.b) == null) {
                        aVar = null;
                    } else {
                        String str = btVar.c;
                        String str2 = btVar.a;
                        String str3 = btVar.b;
                        if (str3 == null || t71.p.T(str3)) {
                            str3 = str;
                        }
                        ys ysVar = btVar.e;
                        com.github.service.models.response.a e = k41.b.e(ysVar != null ? ysVar.c : null);
                        ZonedDateTime zonedDateTime = btVar.g;
                        if (zonedDateTime == null) {
                            zonedDateTime = btVar.f;
                        }
                        String str4 = btVar.d;
                        if (str4 == null) {
                            str4 = "";
                        }
                        aVar = new o01.a(str2, str3, str, e, zonedDateTime, false, false, true, str4, null, null, null, null, rVar, false);
                    }
                    List list = ftVar != null ? ftVar.c.b : null;
                    if (list == null) {
                        list = rVar;
                    }
                    ArrayList S = x61.m.S(list);
                    ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                    int size = S.size();
                    int i3 = 0;
                    while (i3 < size) {
                        int i4 = i3 + 1;
                        ct ctVar = (ct) S.get(i3);
                        ArrayList arrayList2 = S;
                        o01.a aVar3 = aVar;
                        String str5 = ctVar.a;
                        int i5 = size;
                        String str6 = ctVar.c;
                        String str7 = ctVar.b;
                        if (str7 == null || t71.p.T(str7)) {
                            str7 = str6;
                        }
                        xs xsVar = ctVar.d;
                        com.github.service.models.response.a e2 = k41.b.e(xsVar != null ? xsVar.c : null);
                        ZonedDateTime zonedDateTime2 = ctVar.i;
                        if (zonedDateTime2 == null) {
                            zonedDateTime2 = ctVar.h;
                        }
                        ArrayList arrayList3 = arrayList;
                        arrayList3.add(new o01.a(str5, str7, str6, e2, zonedDateTime2, ctVar.f, ctVar.e, ctVar.g, "", null, null, ctVar.j, null, rVar, false));
                        arrayList = arrayList3;
                        aVar = aVar3;
                        i3 = i4;
                        S = arrayList2;
                        size = i5;
                    }
                    o01.f fVar = new o01.f(aVar, arrayList, new x01.i(ftVar != null ? ftVar.c.a.b : null, ftVar != null ? ftVar.c.a.a : false, false));
                    e6Var.v = 1;
                    if (this.s.c(fVar, e6Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        e6Var = new e6(this, cVar);
        Object obj22 = e6Var.u;
        b71.a aVar22 = b71.a.r;
        i = e6Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object d(a71.c cVar, Object obj) {
        f6 f6Var;
        int i;
        jn0.p7 p7Var;
        if (cVar instanceof f6) {
            f6Var = (f6) cVar;
            int i2 = f6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = f6Var.u;
                b71.a aVar = b71.a.r;
                i = f6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    jn0.n7 n7Var = (jn0.n7) obj;
                    k71.k.g(n7Var, "<this>");
                    jn0.m7Shadow m7Var = n7Var.a;
                    if (m7Var == null || (p7Var = m7Var.a) == null) {
                        throw new ApiFailure(ApiFailureType.RESPONSE_ERROR, "Invalid pull request data", null, null, null, null, null, 120);
                    }
                    String str = p7Var.a;
                    jn0.q7 q7Var = p7Var.b;
                    p01.b bVar = new p01.b(p7Var.c, str, q7Var.c.b, q7Var.b, p7Var.d);
                    f6Var.v = 1;
                    if (this.s.c(bVar, f6Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        f6Var = new f6(this, cVar);
        Object obj22 = f6Var.u;
        b71.a aVar2 = b71.a.r;
        i = f6Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(a71.c cVar, Object obj) {
        g6 g6Var;
        int i;
        jn0.v7Shadow v7Var;
        if (cVar instanceof g6) {
            g6Var = (g6) cVar;
            int i2 = g6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = g6Var.u;
                b71.a aVar = b71.a.r;
                i = g6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    jn0.t7 t7Var = ((jn0.u7) obj).a;
                    if (t7Var != null && (v7Var = t7Var.a) != null) {
                        qu0.c cVar2 = v7Var.c;
                        if (cVar2.c != null) {
                            yz0.j O = v8.l0.O(cVar2, false);
                            g6Var.v = 1;
                            if (this.s.c(O, g6Var) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    throw new ApiFailure(ApiFailureType.RESPONSE_ERROR, "Invalid branch data", null, null, null, null, null, 120);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj2);
                return w61.a0.a;
            }
        }
        g6Var = new g6(this, cVar);
        Object obj22 = g6Var.u;
        b71.a aVar2 = b71.a.r;
        i = g6Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object f(a71.c cVar, Object obj) {
        h6 h6Var;
        int i;
        yz0.v0 v0Var;
        pp ppVar;
        mp mpVar;
        if (cVar instanceof h6) {
            h6Var = (h6) cVar;
            int i2 = h6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = h6Var.u;
                b71.a aVar = b71.a.r;
                i = h6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    np npVar = (np) obj;
                    k71.k.g(npVar, "<this>");
                    qp qpVar = npVar.a;
                    List<op> list = (qpVar == null || (ppVar = qpVar.b) == null || (mpVar = ppVar.b) == null) ? null : mpVar.c.b;
                    if (list == null) {
                        list = x61.rShadow.r;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (op opVar : list) {
                        if (opVar != null) {
                            cq0.e1 e1Var = opVar.c;
                            v0Var = new yz0.v0(e1Var.a, e1Var.b, e1Var.c, e1Var.d, e1Var.e);
                        } else {
                            v0Var = null;
                        }
                        if (v0Var != null) {
                            arrayList.add(v0Var);
                        }
                    }
                    h6Var.v = 1;
                    if (this.s.c(arrayList, h6Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        h6Var = new h6(this, cVar);
        Object obj22 = h6Var.u;
        b71.a aVar2 = b71.a.r;
        i = h6Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(a71.c cVar, Object obj) {
        i6Shadow i6Var;
        int i;
        n00 n00Var;
        p00 p00Var;
        if (cVar instanceof i6Shadow) {
            i6Var = (i6Shadow) cVar;
            int i2 = i6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = i6Var.u;
                b71.a aVar = b71.a.r;
                i = i6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    m00 m00Var = (m00) obj;
                    q00 q00Var = m00Var.a;
                    List list = (q00Var == null || (p00Var = q00Var.b) == null) ? null : p00Var.a;
                    if (list == null) {
                        list = x61.rShadow.r;
                    }
                    ArrayList S = x61.m.S(list);
                    ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                    int size = S.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = S.get(i3);
                        i3++;
                        o00 o00Var = (o00) obj3;
                        String str = o00Var.c.b;
                        q00 q00Var2 = m00Var.a;
                        arrayList.add(v8.l0.O(o00Var.c, str.equals((q00Var2 == null || (n00Var = q00Var2.a) == null) ? null : n00Var.a)));
                    }
                    i6Var.v = 1;
                    if (this.s.c(arrayList, i6Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        i6Var = new i6Shadow(this, cVar);
        Object obj22 = i6Var.u;
        b71.a aVar2 = b71.a.r;
        i = i6Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(a71.c cVar, Object obj) {
        j6 j6Var;
        int i;
        gz gzVar;
        fz fzVar;
        mz mzVar;
        List list;
        kz kzVar;
        gz gzVar2;
        fz fzVar2;
        List list2;
        if (cVar instanceof j6) {
            j6Var = (j6) cVar;
            int i2 = j6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = j6Var.u;
                b71.a aVar = b71.a.r;
                i = j6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    hz hzVar = (hz) obj;
                    k71.k.g(hzVar, "<this>");
                    nz nzVar = hzVar.a;
                    jz jzVar = (nzVar == null || (gzVar2 = nzVar.c) == null || (fzVar2 = gzVar2.b) == null || (list2 = fzVar2.e.b) == null) ? null : (jz) x61.m.W(list2);
                    p01.c cVar2 = new p01.c((nzVar == null || (mzVar = nzVar.b) == null || (list = mzVar.b.a) == null || (kzVar = (kz) x61.m.W(list)) == null) ? null : k21.f.J(kzVar.c), jzVar != null ? new yz0.z1(nzVar.c.b.e.a, jzVar.c) : null, jzVar != null ? jzVar.b : "", (nzVar == null || (gzVar = nzVar.c) == null || (fzVar = gzVar.b) == null) ? new yz0.a2(0, 0, 0, false, null) : new yz0.a2(fzVar.d, fzVar.b, fzVar.c, false, null));
                    j6Var.v = 1;
                    if (this.s.c(cVar2, j6Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        j6Var = new j6(this, cVar);
        Object obj22 = j6Var.u;
        b71.a aVar2 = b71.a.r;
        i = j6Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0870 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:598:0x084b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:663:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x0956  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x098e  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x09d4  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x0a55  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0111  */
    /* JADX WARN: Type inference failed for: r1v17, types: [m01.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        b5 b5Var;
        int i;
        vt0.c cVar2;
        vt0.d dVar;
        e5 e5Var;
        int i2;
        vt0.j jVar;
        xt0.h8 h8Var;
        List list;
        xt0.f8 f8Var;
        f5 f5Var;
        int i3;
        g5 g5Var;
        int i4;
        h5 h5Var;
        int i5;
        tc0 tc0Var;
        mc0 mc0Var;
        yz0.e2 e2Var;
        tc0 tc0Var2;
        tc0 tc0Var3;
        i5 i5Var;
        int i6;
        j5 j5Var;
        int i7;
        k5 k5Var;
        int i8;
        l5 l5Var;
        int i9;
        m5 m5Var;
        int i10;
        n5 n5Var;
        int i12;
        my0.j jVar2;
        my0.h hVar;
        o5 o5Var;
        int i13;
        my0.b0 b0Var;
        my0.z zVar;
        p5 p5Var;
        int i14;
        my0.h0 h0Var;
        my0.f0 f0Var;
        q5 q5Var;
        int i15;
        my0.n0 n0Var;
        my0.l0 l0Var;
        r5 r5Var;
        int i16;
        my0.t0 t0Var;
        my0.r0 r0Var;
        s5 s5Var;
        int i17;
        my0.v vVar;
        my0.t tVar;
        t5 t5Var;
        int i18;
        my0.p pVar;
        my0.n nVar;
        u5 u5Var;
        int i19;
        my0.z0 z0Var;
        my0.x0 x0Var;
        v5 v5Var;
        int i20;
        w5 w5Var;
        int i22;
        my0.f1 f1Var;
        my0.d1 d1Var;
        x5 x5Var;
        int i23;
        gr grVar;
        gr grVar2;
        yz0.l4 l4Var;
        jr jrVar;
        gr grVar3;
        c6 c6Var;
        int i24;
        w61.k kVar;
        vr vrVar;
        sr srVar;
        k6 k6Var;
        int i25;
        xx xxVar;
        xx xxVar2;
        ux uxVar;
        xx xxVar3;
        switch (this.r) {
            case 0:
                if (cVar instanceof b5) {
                    b5Var = (b5) cVar;
                    int i26 = b5Var.v;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        b5Var.v = i26 - Integer.MIN_VALUE;
                        Object obj2 = b5Var.u;
                        b71.a aVar = b71.a.r;
                        i = b5Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            vt0.e eVar = ((vt0.b) obj).a;
                            String str = (eVar == null || (cVar2 = eVar.b) == null || (dVar = cVar2.b) == null) ? null : dVar.a;
                            if (str != null) {
                                b5Var.v = 1;
                                if (this.s.c(str, b5Var) == aVar) {
                                    return aVar;
                                }
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj2);
                        }
                        return w61.a0.a;
                    }
                }
                b5Var = new b5(this, cVar);
                Object obj22 = b5Var.u;
                b71.a aVar2 = b71.a.r;
                i = b5Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof e5) {
                    e5Var = (e5) cVar;
                    int i27 = e5Var.v;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        e5Var.v = i27 - Integer.MIN_VALUE;
                        Object obj3 = e5Var.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = e5Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            vt0.i iVar = ((vt0.h) obj).a;
                            yz0.q8 q8Var = null;
                            if (iVar != null && (jVar = iVar.c) != null) {
                                xt0.j8 j8Var = jVar.b;
                                boolean z = j8Var.b;
                                xt0.g8 g8Var = j8Var.d;
                                int i28 = (g8Var == null || (list = g8Var.a) == null || (f8Var = (xt0.f8) x61.m.f0(list)) == null) ? 0 : f8Var.b.a;
                                xt0.i8 i8Var = j8Var.c;
                                if (i8Var != null && (h8Var = i8Var.b) != null) {
                                    q8Var = new yz0.q8(h8Var.b, h8Var.c, h8Var.d);
                                }
                                q8Var = new m01.b(z, i28, q8Var);
                            }
                            if (q8Var != null) {
                                e5Var.v = 1;
                                if (this.s.c(q8Var, e5Var) == aVar3) {
                                    return aVar3;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj3);
                        }
                        return w61.a0.a;
                    }
                }
                e5Var = new e5(this, cVar);
                Object obj32 = e5Var.u;
                b71.a aVar32 = b71.a.r;
                i2 = e5Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof f5) {
                    f5Var = (f5) cVar;
                    int i29 = f5Var.v;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        f5Var.v = i29 - Integer.MIN_VALUE;
                        Object obj4 = f5Var.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = f5Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj4);
                            yz0.y7 G = b31.b.G((hc0) obj);
                            f5Var.v = 1;
                            if (this.s.c(G, f5Var) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj4);
                        }
                        return w61.a0.a;
                    }
                }
                f5Var = new f5(this, cVar);
                Object obj42 = f5Var.u;
                b71.a aVar42 = b71.a.r;
                i3 = f5Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof g5) {
                    g5Var = (g5) cVar;
                    int i30 = g5Var.v;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        g5Var.v = i30 - Integer.MIN_VALUE;
                        Object obj5 = g5Var.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = g5Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj5);
                            yz0.y7 G2 = b31.b.G((hc0) obj);
                            g5Var.v = 1;
                            if (this.s.c(G2, g5Var) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj5);
                        }
                        return w61.a0.a;
                    }
                }
                g5Var = new g5(this, cVar);
                Object obj52 = g5Var.u;
                b71.a aVar52 = b71.a.r;
                i4 = g5Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof h5) {
                    h5Var = (h5) cVar;
                    int i32 = h5Var.v;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        h5Var.v = i32 - Integer.MIN_VALUE;
                        Object obj6 = h5Var.u;
                        b71.a aVar6 = b71.a.r;
                        i5 = h5Var.v;
                        if (i5 != 0) {
                            sy.y.j(obj6);
                            oc0 oc0Var = (oc0) obj;
                            k71.k.g(oc0Var, "<this>");
                            vc0 vc0Var = oc0Var.a;
                            String str2 = null;
                            wc0 wc0Var = (vc0Var == null || (tc0Var3 = vc0Var.b) == null) ? null : tc0Var3.c;
                            pc0 pc0Var = (vc0Var == null || (tc0Var2 = vc0Var.b) == null) ? null : tc0Var2.d;
                            List<rc0> list2 = wc0Var != null ? wc0Var.a : null;
                            List<qc0> list3 = x61.rShadow.r;
                            if (list2 == null) {
                                list2 = list3;
                            }
                            ArrayList arrayList = new ArrayList();
                            for (rc0 rc0Var : list2) {
                                bv0.d dVar2 = rc0Var != null ? rc0Var.c : null;
                                if (dVar2 != null) {
                                    arrayList.add(dVar2);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int size = arrayList.size();
                            int i33 = 0;
                            while (i33 < size) {
                                Object obj7 = arrayList.get(i33);
                                i33++;
                                bv0.d dVar3 = (bv0.d) obj7;
                                bv0.c cVar3 = dVar3.d;
                                boolean z2 = dVar3.c;
                                if (cVar3 != null) {
                                    bv0.a aVar7 = cVar3.c;
                                    if (aVar7 != null) {
                                        e2Var = bx0.c.e(aVar7, z2);
                                    } else {
                                        bv0.b bVar = cVar3.b;
                                        if (bVar != null) {
                                            e2Var = bx0.c.f(bVar, z2, null);
                                        }
                                    }
                                    if (e2Var == null) {
                                        arrayList2.add(e2Var);
                                    }
                                }
                                e2Var = null;
                                if (e2Var == null) {
                                }
                            }
                            List list4 = pc0Var != null ? pc0Var.a : null;
                            if (list4 != null) {
                                list3 = list4;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (qc0 qc0Var : list3) {
                                cu0.l lVar = qc0Var != null ? qc0Var.c : null;
                                if (lVar != null) {
                                    arrayList3.add(lVar);
                                }
                            }
                            ArrayList arrayList4 = new ArrayList(x61.n.F(arrayList3, 10));
                            int size2 = arrayList3.size();
                            int i34 = 0;
                            while (i34 < size2) {
                                Object obj8 = arrayList3.get(i34);
                                i34++;
                                arrayList4.add(bx0.c.g((cu0.l) obj8));
                            }
                            ArrayList l0 = x61.m.l0(arrayList4, arrayList2);
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList5 = new ArrayList();
                            int size3 = l0.size();
                            int i35 = 0;
                            while (i35 < size3) {
                                Object obj9 = l0.get(i35);
                                i35++;
                                if (hashSet.add(((yz0.e2) obj9).a.x)) {
                                    arrayList5.add(obj9);
                                }
                            }
                            ArrayList arrayList6 = new ArrayList();
                            com.github.service.models.response.a aVar8 = new com.github.service.models.response.a((vc0Var == null || (mc0Var = vc0Var.a) == null) ? "" : mc0Var.b, (Avatar) null, (String) null, false, (String) null, 62);
                            if (vc0Var != null && (tc0Var = vc0Var.b) != null) {
                                str2 = tc0Var.b.b.c;
                            }
                            yz0.z7 z7Var = new yz0.z7(arrayList5, arrayList6, aVar8, str2);
                            h5Var.v = 1;
                            if (this.s.c(z7Var, h5Var) == aVar6) {
                                return aVar6;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj6);
                        }
                        return w61.a0.a;
                    }
                }
                h5Var = new h5(this, cVar);
                Object obj62 = h5Var.u;
                b71.a aVar62 = b71.a.r;
                i5 = h5Var.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof i5) {
                    i5Var = (i5) cVar;
                    int i36 = i5Var.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        i5Var.v = i36 - Integer.MIN_VALUE;
                        Object obj10 = i5Var.u;
                        b71.a aVar9 = b71.a.r;
                        i6 = i5Var.v;
                        w61.a0 a0Var = w61.a0.a;
                        if (i6 != 0) {
                            sy.y.j(obj10);
                            i5Var.v = 1;
                            if (this.s.c(a0Var, i5Var) == aVar9) {
                                return aVar9;
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj10);
                        }
                        return a0Var;
                    }
                }
                i5Var = new i5(this, cVar);
                Object obj102 = i5Var.u;
                b71.a aVar92 = b71.a.r;
                i6 = i5Var.v;
                w61.a0 a0Var2 = w61.a0.a;
                if (i6 != 0) {
                }
                return a0Var2;
            case 6:
                if (cVar instanceof j5) {
                    j5Var = (j5) cVar;
                    int i37 = j5Var.v;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        j5Var.v = i37 - Integer.MIN_VALUE;
                        Object obj11 = j5Var.u;
                        b71.a aVar10 = b71.a.r;
                        i7 = j5Var.v;
                        w61.a0 a0Var3 = w61.a0.a;
                        if (i7 != 0) {
                            sy.y.j(obj11);
                            j5Var.v = 1;
                            if (this.s.c(a0Var3, j5Var) == aVar10) {
                                return aVar10;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj11);
                        }
                        return a0Var3;
                    }
                }
                j5Var = new j5(this, cVar);
                Object obj112 = j5Var.u;
                b71.a aVar102 = b71.a.r;
                i7 = j5Var.v;
                w61.a0 a0Var32 = w61.a0.a;
                if (i7 != 0) {
                }
                return a0Var32;
            case 7:
                if (cVar instanceof k5) {
                    k5Var = (k5) cVar;
                    int i38 = k5Var.v;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        k5Var.v = i38 - Integer.MIN_VALUE;
                        Object obj12 = k5Var.u;
                        b71.a aVar11 = b71.a.r;
                        i8 = k5Var.v;
                        if (i8 != 0) {
                            sy.y.j(obj12);
                            my0.c cVar4 = ((my0.b) obj).a.a;
                            n01.a aVar12 = new n01.a(cVar4 != null ? cVar4.a : false, cVar4 != null ? cVar4.b : false, cVar4 != null ? cVar4.d : false, cVar4 != null ? cVar4.c : false, cVar4 != null ? cVar4.e : false, cVar4 != null ? cVar4.f : false, cVar4 != null ? cVar4.g : false, cVar4 != null ? cVar4.h : false, cVar4 != null ? cVar4.i : false, 512);
                            k5Var.v = 1;
                            if (this.s.c(aVar12, k5Var) == aVar11) {
                                return aVar11;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj12);
                        }
                        return w61.a0.a;
                    }
                }
                k5Var = new k5(this, cVar);
                Object obj122 = k5Var.u;
                b71.a aVar112 = b71.a.r;
                i8 = k5Var.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof l5) {
                    l5Var = (l5) cVar;
                    int i39 = l5Var.v;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        l5Var.v = i39 - Integer.MIN_VALUE;
                        Object obj13 = l5Var.u;
                        b71.a aVar13 = b71.a.r;
                        i9 = l5Var.v;
                        if (i9 != 0) {
                            sy.y.j(obj13);
                            kn knVar = ((jn) obj).a.a;
                            n01.a aVar14 = new n01.a(false, knVar != null && knVar.a, false, false, false, false, false, false, false, 1021);
                            l5Var.v = 1;
                            if (this.s.c(aVar14, l5Var) == aVar13) {
                                return aVar13;
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj13);
                        }
                        return w61.a0.a;
                    }
                }
                l5Var = new l5(this, cVar);
                Object obj132 = l5Var.u;
                b71.a aVar132 = b71.a.r;
                i9 = l5Var.v;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof m5) {
                    m5Var = (m5) cVar;
                    int i40 = m5Var.v;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        m5Var.v = i40 - Integer.MIN_VALUE;
                        Object obj14 = m5Var.u;
                        b71.a aVar15 = b71.a.r;
                        i10 = m5Var.v;
                        if (i10 != 0) {
                            sy.y.j(obj14);
                            Iterable<zq> iterable = ((xq) obj).a.a.a;
                            if (iterable == null) {
                                iterable = x61.rShadow.r;
                            }
                            ArrayList arrayList7 = new ArrayList();
                            for (zq zqVar : iterable) {
                                ct0.a aVar16 = zqVar != null ? zqVar.c : null;
                                if (aVar16 != null) {
                                    arrayList7.add(aVar16);
                                }
                            }
                            ArrayList arrayList8 = new ArrayList(x61.n.F(arrayList7, 10));
                            int size4 = arrayList7.size();
                            int i42 = 0;
                            while (i42 < size4) {
                                Object obj15 = arrayList7.get(i42);
                                i42++;
                                arrayList8.add(k41.b.h((ct0.a) obj15));
                            }
                            m5Var.v = 1;
                            if (this.s.c(arrayList8, m5Var) == aVar15) {
                                return aVar15;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj14);
                        }
                        return w61.a0.a;
                    }
                }
                m5Var = new m5(this, cVar);
                Object obj142 = m5Var.u;
                b71.a aVar152 = b71.a.r;
                i10 = m5Var.v;
                if (i10 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof n5) {
                    n5Var = (n5) cVar;
                    int i43 = n5Var.v;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        n5Var.v = i43 - Integer.MIN_VALUE;
                        Object obj16 = n5Var.u;
                        b71.a aVar17 = b71.a.r;
                        i12 = n5Var.v;
                        if (i12 != 0) {
                            sy.y.j(obj16);
                            my0.i iVar2 = ((my0.g) obj).a;
                            Boolean valueOf = Boolean.valueOf((iVar2 == null || (jVar2 = iVar2.b) == null || (hVar = jVar2.a) == null) ? false : hVar.a);
                            n5Var.v = 1;
                            if (this.s.c(valueOf, n5Var) == aVar17) {
                                return aVar17;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj16);
                        }
                        return w61.a0.a;
                    }
                }
                n5Var = new n5(this, cVar);
                Object obj162 = n5Var.u;
                b71.a aVar172 = b71.a.r;
                i12 = n5Var.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof o5) {
                    o5Var = (o5) cVar;
                    int i44 = o5Var.v;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        o5Var.v = i44 - Integer.MIN_VALUE;
                        Object obj17 = o5Var.u;
                        b71.a aVar18 = b71.a.r;
                        i13 = o5Var.v;
                        if (i13 != 0) {
                            sy.y.j(obj17);
                            my0.a0 a0Var4 = ((my0.y) obj).a;
                            Boolean valueOf2 = Boolean.valueOf((a0Var4 == null || (b0Var = a0Var4.b) == null || (zVar = b0Var.a) == null) ? false : zVar.a);
                            o5Var.v = 1;
                            if (this.s.c(valueOf2, o5Var) == aVar18) {
                                return aVar18;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj17);
                        }
                        return w61.a0.a;
                    }
                }
                o5Var = new o5(this, cVar);
                Object obj172 = o5Var.u;
                b71.a aVar182 = b71.a.r;
                i13 = o5Var.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof p5) {
                    p5Var = (p5) cVar;
                    int i45 = p5Var.v;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        p5Var.v = i45 - Integer.MIN_VALUE;
                        Object obj18 = p5Var.u;
                        b71.a aVar19 = b71.a.r;
                        i14 = p5Var.v;
                        if (i14 != 0) {
                            sy.y.j(obj18);
                            my0.g0 g0Var = ((my0.e0) obj).a;
                            Boolean valueOf3 = Boolean.valueOf((g0Var == null || (h0Var = g0Var.b) == null || (f0Var = h0Var.a) == null) ? false : f0Var.a);
                            p5Var.v = 1;
                            if (this.s.c(valueOf3, p5Var) == aVar19) {
                                return aVar19;
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj18);
                        }
                        return w61.a0.a;
                    }
                }
                p5Var = new p5(this, cVar);
                Object obj182 = p5Var.u;
                b71.a aVar192 = b71.a.r;
                i14 = p5Var.v;
                if (i14 != 0) {
                }
                return w61.a0.a;
            case 13:
                if (cVar instanceof q5) {
                    q5Var = (q5) cVar;
                    int i46 = q5Var.v;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        q5Var.v = i46 - Integer.MIN_VALUE;
                        Object obj19 = q5Var.u;
                        b71.a aVar20 = b71.a.r;
                        i15 = q5Var.v;
                        if (i15 != 0) {
                            sy.y.j(obj19);
                            my0.m0 m0Var = ((my0.k0) obj).a;
                            Boolean valueOf4 = Boolean.valueOf((m0Var == null || (n0Var = m0Var.b) == null || (l0Var = n0Var.a) == null) ? false : l0Var.a);
                            q5Var.v = 1;
                            if (this.s.c(valueOf4, q5Var) == aVar20) {
                                return aVar20;
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj19);
                        }
                        return w61.a0.a;
                    }
                }
                q5Var = new q5(this, cVar);
                Object obj192 = q5Var.u;
                b71.a aVar202 = b71.a.r;
                i15 = q5Var.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof r5) {
                    r5Var = (r5) cVar;
                    int i47 = r5Var.v;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        r5Var.v = i47 - Integer.MIN_VALUE;
                        Object obj20 = r5Var.u;
                        b71.a aVar21 = b71.a.r;
                        i16 = r5Var.v;
                        if (i16 != 0) {
                            sy.y.j(obj20);
                            my0.s0 s0Var = ((my0.q0) obj).a;
                            Boolean valueOf5 = Boolean.valueOf((s0Var == null || (t0Var = s0Var.b) == null || (r0Var = t0Var.b) == null) ? false : r0Var.a);
                            r5Var.v = 1;
                            if (this.s.c(valueOf5, r5Var) == aVar21) {
                                return aVar21;
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj20);
                        }
                        return w61.a0.a;
                    }
                }
                r5Var = new r5(this, cVar);
                Object obj202 = r5Var.u;
                b71.a aVar212 = b71.a.r;
                i16 = r5Var.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 15:
                if (cVar instanceof s5) {
                    s5Var = (s5) cVar;
                    int i48 = s5Var.v;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        s5Var.v = i48 - Integer.MIN_VALUE;
                        Object obj21 = s5Var.u;
                        b71.a aVar22 = b71.a.r;
                        i17 = s5Var.v;
                        if (i17 != 0) {
                            sy.y.j(obj21);
                            my0.u uVar = ((my0.s) obj).a;
                            Boolean valueOf6 = Boolean.valueOf((uVar == null || (vVar = uVar.b) == null || (tVar = vVar.a) == null) ? false : tVar.b);
                            s5Var.v = 1;
                            if (this.s.c(valueOf6, s5Var) == aVar22) {
                                return aVar22;
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj21);
                        }
                        return w61.a0.a;
                    }
                }
                s5Var = new s5(this, cVar);
                Object obj212 = s5Var.u;
                b71.a aVar222 = b71.a.r;
                i17 = s5Var.v;
                if (i17 != 0) {
                }
                return w61.a0.a;
            case 16:
                if (cVar instanceof t5) {
                    t5Var = (t5) cVar;
                    int i49 = t5Var.v;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        t5Var.v = i49 - Integer.MIN_VALUE;
                        Object obj23 = t5Var.u;
                        b71.a aVar23 = b71.a.r;
                        i18 = t5Var.v;
                        if (i18 != 0) {
                            sy.y.j(obj23);
                            my0.o oVar = ((my0.m) obj).a;
                            Boolean valueOf7 = Boolean.valueOf((oVar == null || (pVar = oVar.b) == null || (nVar = pVar.a) == null) ? false : nVar.a);
                            t5Var.v = 1;
                            if (this.s.c(valueOf7, t5Var) == aVar23) {
                                return aVar23;
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj23);
                        }
                        return w61.a0.a;
                    }
                }
                t5Var = new t5(this, cVar);
                Object obj232 = t5Var.u;
                b71.a aVar232 = b71.a.r;
                i18 = t5Var.v;
                if (i18 != 0) {
                }
                return w61.a0.a;
            case 17:
                if (cVar instanceof u5) {
                    u5Var = (u5) cVar;
                    int i50 = u5Var.v;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        u5Var.v = i50 - Integer.MIN_VALUE;
                        Object obj24 = u5Var.u;
                        b71.a aVar24 = b71.a.r;
                        i19 = u5Var.v;
                        if (i19 != 0) {
                            sy.y.j(obj24);
                            my0.y0 y0Var = ((my0.w0) obj).a;
                            Boolean valueOf8 = Boolean.valueOf((y0Var == null || (z0Var = y0Var.b) == null || (x0Var = z0Var.b) == null) ? false : x0Var.a);
                            u5Var.v = 1;
                            if (this.s.c(valueOf8, u5Var) == aVar24) {
                                return aVar24;
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj24);
                        }
                        return w61.a0.a;
                    }
                }
                u5Var = new u5(this, cVar);
                Object obj242 = u5Var.u;
                b71.a aVar242 = b71.a.r;
                i19 = u5Var.v;
                if (i19 != 0) {
                }
                return w61.a0.a;
            case 18:
                if (cVar instanceof v5) {
                    v5Var = (v5) cVar;
                    int i52 = v5Var.v;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        v5Var.v = i52 - Integer.MIN_VALUE;
                        Object obj25 = v5Var.u;
                        b71.a aVar25 = b71.a.r;
                        i20 = v5Var.v;
                        if (i20 != 0) {
                            sy.y.j(obj25);
                            gd0 gd0Var = ((ed0) obj).a;
                            List list5 = gd0Var != null ? gd0Var.a : null;
                            if (list5 == null) {
                                list5 = x61.rShadow.r;
                            }
                            ArrayList arrayList9 = new ArrayList(x61.n.F(list5, 10));
                            Iterator it = list5.iterator();
                            while (it.hasNext()) {
                                arrayList9.add(((fd0) it.next()).c);
                            }
                            ArrayList arrayList10 = new ArrayList(x61.n.F(arrayList9, 10));
                            int size5 = arrayList9.size();
                            int i53 = 0;
                            while (i53 < size5) {
                                Object obj26 = arrayList9.get(i53);
                                i53++;
                                arrayList10.add(k41.b.h((ct0.a) obj26));
                            }
                            v5Var.v = 1;
                            if (this.s.c(arrayList10, v5Var) == aVar25) {
                                return aVar25;
                            }
                        } else {
                            if (i20 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj25);
                        }
                        return w61.a0.a;
                    }
                }
                v5Var = new v5(this, cVar);
                Object obj252 = v5Var.u;
                b71.a aVar252 = b71.a.r;
                i20 = v5Var.v;
                if (i20 != 0) {
                }
                return w61.a0.a;
            case 19:
                if (cVar instanceof w5) {
                    w5Var = (w5) cVar;
                    int i54 = w5Var.v;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        w5Var.v = i54 - Integer.MIN_VALUE;
                        Object obj27 = w5Var.u;
                        b71.a aVar26 = b71.a.r;
                        i22 = w5Var.v;
                        if (i22 != 0) {
                            sy.y.j(obj27);
                            my0.e1 e1Var = ((my0.c1) obj).a;
                            Boolean valueOf9 = Boolean.valueOf((e1Var == null || (f1Var = e1Var.b) == null || (d1Var = f1Var.a) == null) ? false : d1Var.a);
                            w5Var.v = 1;
                            if (this.s.c(valueOf9, w5Var) == aVar26) {
                                return aVar26;
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj27);
                        }
                        return w61.a0.a;
                    }
                }
                w5Var = new w5(this, cVar);
                Object obj272 = w5Var.u;
                b71.a aVar262 = b71.a.r;
                i22 = w5Var.v;
                if (i22 != 0) {
                }
                return w61.a0.a;
            case 20:
                if (cVar instanceof x5) {
                    x5Var = (x5) cVar;
                    int i55 = x5Var.v;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        x5Var.v = i55 - Integer.MIN_VALUE;
                        Object obj28 = x5Var.u;
                        b71.a aVar27 = b71.a.r;
                        i23 = x5Var.v;
                        if (i23 != 0) {
                            sy.y.j(obj28);
                            dr drVar = (dr) obj;
                            fr frVar = drVar.a;
                            String str3 = null;
                            List<er> list6 = (frVar == null || (grVar3 = frVar.c) == null) ? null : grVar3.a.b;
                            if (list6 == null) {
                                list6 = x61.rShadow.r;
                            }
                            ArrayList arrayList11 = new ArrayList();
                            for (er erVar : list6) {
                                if (erVar == null || (jrVar = erVar.a) == null) {
                                    l4Var = null;
                                } else {
                                    fw0.q0 q0Var = jrVar.c;
                                    l4Var = new yz0.l4(m7.y.L(q0Var.e), q0Var.b, q0Var.c, q0Var.d, "");
                                }
                                if (l4Var != null) {
                                    arrayList11.add(l4Var);
                                }
                            }
                            fr frVar2 = drVar.a;
                            boolean z3 = (frVar2 == null || (grVar2 = frVar2.c) == null) ? false : grVar2.a.a.a;
                            if (frVar2 != null && (grVar = frVar2.c) != null) {
                                str3 = grVar.a.a.b;
                            }
                            w61.k kVar2 = new w61.k(arrayList11, new x01.i(str3, z3, false));
                            x5Var.v = 1;
                            if (this.s.c(kVar2, x5Var) == aVar27) {
                                return aVar27;
                            }
                        } else {
                            if (i23 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj28);
                        }
                        return w61.a0.a;
                    }
                }
                x5Var = new x5(this, cVar);
                Object obj282 = x5Var.u;
                b71.a aVar272 = b71.a.r;
                i23 = x5Var.v;
                if (i23 != 0) {
                }
                return w61.a0.a;
            case 21:
                return a(cVar, obj);
            case 22:
                if (cVar instanceof c6) {
                    c6Var = (c6) cVar;
                    int i56 = c6Var.v;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        c6Var.v = i56 - Integer.MIN_VALUE;
                        Object obj29 = c6Var.u;
                        b71.a aVar28 = b71.a.r;
                        i24 = c6Var.v;
                        if (i24 != 0) {
                            sy.y.j(obj29);
                            wr wrVar = ((rr) obj).a;
                            if (wrVar == null || (vrVar = wrVar.a) == null || (srVar = vrVar.a) == null) {
                                kVar = null;
                            } else {
                                Iterable iterable2 = srVar.b;
                                if (iterable2 == null) {
                                    iterable2 = x61.rShadow.r;
                                }
                                ArrayList S = x61.m.S(iterable2);
                                ArrayList arrayList12 = new ArrayList(x61.n.F(S, 10));
                                int size6 = S.size();
                                int i57 = 0;
                                while (i57 < size6) {
                                    Object obj30 = S.get(i57);
                                    i57++;
                                    arrayList12.add(aa1.b.m(((tr) obj30).c));
                                }
                                ur urVar = srVar.a;
                                kVar = new w61.k(arrayList12, new x01.i(urVar.b, urVar.a, false));
                            }
                            if (kVar != null) {
                                c6Var.v = 1;
                                if (this.s.c(kVar, c6Var) == aVar28) {
                                    return aVar28;
                                }
                            }
                        } else {
                            if (i24 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj29);
                        }
                        return w61.a0.a;
                    }
                }
                c6Var = new c6(this, cVar);
                Object obj292 = c6Var.u;
                b71.a aVar282 = b71.a.r;
                i24 = c6Var.v;
                if (i24 != 0) {
                }
                return w61.a0.a;
            case 23:
                return b(cVar, obj);
            case 24:
                return d(cVar, obj);
            case 25:
                return e(cVar, obj);
            case 26:
                return f(cVar, obj);
            case 27:
                return g(cVar, obj);
            case 28:
                return h(cVar, obj);
            default:
                if (cVar instanceof k6) {
                    k6Var = (k6) cVar;
                    int i58 = k6Var.v;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        k6Var.v = i58 - Integer.MIN_VALUE;
                        Object obj31 = k6Var.u;
                        b71.a aVar29 = b71.a.r;
                        i25 = k6Var.v;
                        if (i25 != 0) {
                            sy.y.j(obj31);
                            yx yxVar = ((tx) obj).a;
                            String str4 = null;
                            List list7 = (yxVar == null || (xxVar3 = yxVar.b) == null) ? null : xxVar3.b;
                            if (list7 == null) {
                                list7 = x61.rShadow.r;
                            }
                            ArrayList S2 = x61.m.S(list7);
                            ArrayList arrayList13 = new ArrayList(x61.n.F(S2, 10));
                            int size7 = S2.size();
                            int i59 = 0;
                            while (i59 < size7) {
                                Object obj33 = S2.get(i59);
                                i59++;
                                vx vxVar = (vx) obj33;
                                arrayList13.add(v8.l0.O(vxVar.c, vxVar.c.b.equals((yxVar == null || (uxVar = yxVar.a) == null) ? null : uxVar.a)));
                            }
                            List v0 = x61.m.v0(arrayList13, new b2(1));
                            boolean z4 = (yxVar == null || (xxVar2 = yxVar.b) == null) ? false : xxVar2.a.a;
                            if (yxVar != null && (xxVar = yxVar.b) != null) {
                                str4 = xxVar.a.b;
                            }
                            p01.a aVar30 = new p01.a(v0, new x01.i(str4, z4, false));
                            k6Var.v = 1;
                            if (this.s.c(aVar30, k6Var) == aVar29) {
                                return aVar29;
                            }
                        } else {
                            if (i25 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj31);
                        }
                        return w61.a0.a;
                    }
                }
                k6Var = new k6(this, cVar);
                Object obj312 = k6Var.u;
                b71.a aVar292 = b71.a.r;
                i25 = k6Var.v;
                if (i25 != 0) {
                }
                return w61.a0.a;
        }
    }
}
