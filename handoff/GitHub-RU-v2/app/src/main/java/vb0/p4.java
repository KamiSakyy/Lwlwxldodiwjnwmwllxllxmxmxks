package vb0;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.Avatar;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u10.ap;
import u10.as;
import u10.at;
import u10.au;
import u10.bp;
import u10.bt;
import u10.co;
import u10.cp;
import u10.cs;
import u10.ct;
import u10.dp;
import u10.ds;
import u10.e70;
import u10.es;
import u10.f70;
import u10.g70;
import u10.gp;
import u10.hp;
import u10.ht;
import u10.iv;
import u10.jp;
import u10.jv;
import u10.kt;
import u10.kv;
import u10.lo;
import u10.lp;
import u10.lv;
import u10.mo;
import u10.mp;
import u10.mt;
import u10.mu;
import u10.mv;
import u10.noShadow;
import u10.nt;
import u10.nu;
import u10.nw;
import u10.ok;
import u10.oo;
import u10.op;
import u10.ou;
import u10.ow;
import u10.pk;
import u10.po;
import u10.pp;
import u10.pt;
import u10.pv;
import u10.pw;
import u10.qm;
import u10.qn;
import u10.qo;
import u10.qv;
import u10.rm;
import u10.rp;
import u10.rt;
import u10.sm;
import u10.sn;
import u10.so;
import u10.sp;
import u10.st;
import u10.tm;
import u10.to;
import u10.um;
import u10.uo;
import u10.up;
import u10.vp;
import u10.vt;
import u10.wn;
import u10.wo;
import u10.wp;
import u10.wt;
import u10.xn;
import u10.xo;
import u10.xt;
import u10.yn;
import u10.yo;
import u10.ys;
import u10.zn;
import u10.zo;
import u10.zp;
import u10.zs;
import u10.zt;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p4 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ p4(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        i5 i5Var;
        int i;
        o01.a aVar;
        vp vpVar;
        if (cVar instanceof i5) {
            i5Var = (i5) cVar;
            int i2 = i5Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i5Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = i5Var.u;
                b71.a aVar2 = b71.a.r;
                i = i5Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    up upVar = (up) obj;
                    k71.k.g(upVar, "<this>");
                    zp zpVar = upVar.a;
                    x61.rShadow rVar = x61.rShadow.r;
                    if (zpVar == null || (vpVar = zpVar.b) == null) {
                        aVar = null;
                    } else {
                        String str = vpVar.c;
                        String str2 = vpVar.a;
                        String str3 = vpVar.b;
                        if (str3 == null || t71.p.T(str3)) {
                            str3 = str;
                        }
                        sp spVar = vpVar.e;
                        com.github.service.models.response.a c = t.e.c(spVar != null ? spVar.c : null);
                        ZonedDateTime zonedDateTime = vpVar.g;
                        if (zonedDateTime == null) {
                            zonedDateTime = vpVar.f;
                        }
                        String str4 = vpVar.d;
                        if (str4 == null) {
                            str4 = "";
                        }
                        aVar = new o01.a(str2, str3, str, c, zonedDateTime, false, false, true, str4, null, null, null, null, rVar, false);
                    }
                    List list = zpVar != null ? zpVar.c.b : null;
                    if (list == null) {
                        list = rVar;
                    }
                    ArrayList S = x61.m.S(list);
                    ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                    int size = S.size();
                    int i3 = 0;
                    while (i3 < size) {
                        int i4 = i3 + 1;
                        wp wpVar = (wp) S.get(i3);
                        ArrayList arrayList2 = S;
                        o01.a aVar3 = aVar;
                        String str5 = wpVar.a;
                        int i5 = size;
                        String str6 = wpVar.c;
                        String str7 = wpVar.b;
                        if (str7 == null || t71.p.T(str7)) {
                            str7 = str6;
                        }
                        rp rpVar = wpVar.d;
                        com.github.service.models.response.a c2 = t.e.c(rpVar != null ? rpVar.c : null);
                        ZonedDateTime zonedDateTime2 = wpVar.i;
                        if (zonedDateTime2 == null) {
                            zonedDateTime2 = wpVar.h;
                        }
                        ArrayList arrayList3 = arrayList;
                        arrayList3.add(new o01.a(str5, str7, str6, c2, zonedDateTime2, wpVar.f, wpVar.e, wpVar.g, "", null, null, null, null, rVar, false));
                        arrayList = arrayList3;
                        aVar = aVar3;
                        i3 = i4;
                        S = arrayList2;
                        size = i5;
                    }
                    o01.f fVar = new o01.f(aVar, arrayList, new x01.i(zpVar != null ? zpVar.c.a.b : null, zpVar != null ? zpVar.c.a.a : false, false));
                    i5Var.v = 1;
                    if (this.s.c(fVar, i5Var) == aVar2) {
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
        i5Var = new i5(this, cVar);
        Object obj22 = i5Var.u;
        b71.a aVar22 = b71.a.r;
        i = i5Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b(a71.c cVar, Object obj) {
        k5 k5Var;
        int i;
        u10.x6 x6Var;
        if (cVar instanceof k5) {
            k5Var = (k5) cVar;
            int i2 = k5Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k5Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = k5Var.u;
                b71.a aVar = b71.a.r;
                i = k5Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    u10.v6 v6Var = ((u10.w6) obj).a;
                    if (v6Var != null && (x6Var = v6Var.a) != null) {
                        u80.c cVar2 = x6Var.c;
                        if (cVar2.c != null) {
                            yz0.j z = sy.d0Shadow.z(cVar2, false);
                            k5Var.v = 1;
                            if (this.s.c(z, k5Var) == aVar) {
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
        k5Var = new k5(this, cVar);
        Object obj22 = k5Var.u;
        b71.a aVar2 = b71.a.r;
        i = k5Var.v;
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
        l5 l5Var;
        int i;
        yz0.v0 v0Var;
        tm tmVar;
        qm qmVar;
        if (cVar instanceof l5) {
            l5Var = (l5) cVar;
            int i2 = l5Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l5Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = l5Var.u;
                b71.a aVar = b71.a.r;
                i = l5Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    rm rmVar = (rm) obj;
                    k71.k.g(rmVar, "<this>");
                    um umVar = rmVar.a;
                    List<sm> list = (umVar == null || (tmVar = umVar.b) == null || (qmVar = tmVar.b) == null) ? null : qmVar.c.b;
                    if (list == null) {
                        list = x61.rShadow.r;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (sm smVar : list) {
                        if (smVar != null) {
                            g40.e1 e1Var = smVar.c;
                            v0Var = new yz0.v0(e1Var.a, e1Var.b, e1Var.c, e1Var.d, e1Var.e);
                        } else {
                            v0Var = null;
                        }
                        if (v0Var != null) {
                            arrayList.add(v0Var);
                        }
                    }
                    l5Var.v = 1;
                    if (this.s.c(arrayList, l5Var) == aVar) {
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
        l5Var = new l5(this, cVar);
        Object obj22 = l5Var.u;
        b71.a aVar2 = b71.a.r;
        i = l5Var.v;
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
        m5 m5Var;
        int i;
        jv jvVar;
        lv lvVar;
        if (cVar instanceof m5) {
            m5Var = (m5) cVar;
            int i2 = m5Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m5Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = m5Var.u;
                b71.a aVar = b71.a.r;
                i = m5Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    iv ivVar = (iv) obj;
                    mv mvVar = ivVar.a;
                    List list = (mvVar == null || (lvVar = mvVar.b) == null) ? null : lvVar.a;
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
                        kv kvVar = (kv) obj3;
                        String str = kvVar.c.b;
                        mv mvVar2 = ivVar.a;
                        arrayList.add(sy.d0Shadow.z(kvVar.c, str.equals((mvVar2 == null || (jvVar = mvVar2.a) == null) ? null : jvVar.a)));
                    }
                    m5Var.v = 1;
                    if (this.s.c(arrayList, m5Var) == aVar) {
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
        m5Var = new m5(this, cVar);
        Object obj22 = m5Var.u;
        b71.a aVar2 = b71.a.r;
        i = m5Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object f(a71.c cVar, Object obj) {
        n5 n5Var;
        int i;
        zt ztVar;
        zt ztVar2;
        wt wtVar;
        zt ztVar3;
        if (cVar instanceof n5) {
            n5Var = (n5) cVar;
            int i2 = n5Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n5Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = n5Var.u;
                b71.a aVar = b71.a.r;
                i = n5Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    au auVar = ((vt) obj).a;
                    String str = null;
                    List list = (auVar == null || (ztVar3 = auVar.b) == null) ? null : ztVar3.b;
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
                        xt xtVar = (xt) obj3;
                        arrayList.add(sy.d0Shadow.z(xtVar.c, xtVar.c.b.equals((auVar == null || (wtVar = auVar.a) == null) ? null : wtVar.a)));
                    }
                    List v0 = x61.m.v0(arrayList, new v1(1));
                    boolean z = (auVar == null || (ztVar2 = auVar.b) == null) ? false : ztVar2.a.a;
                    if (auVar != null && (ztVar = auVar.b) != null) {
                        str = ztVar.a.b;
                    }
                    p01.a aVar2 = new p01.a(v0, new x01.i(str, z, false));
                    n5Var.v = 1;
                    if (this.s.c(aVar2, n5Var) == aVar) {
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
        n5Var = new n5(this, cVar);
        Object obj22 = n5Var.u;
        b71.a aVar3 = b71.a.r;
        i = n5Var.v;
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
        o5 o5Var;
        int i;
        nu nuVar;
        if (cVar instanceof o5) {
            o5Var = (o5) cVar;
            int i2 = o5Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o5Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = o5Var.u;
                b71.a aVar = b71.a.r;
                i = o5Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    ou ouVar = ((mu) obj).a;
                    yz0.j z = (ouVar == null || (nuVar = ouVar.a) == null) ? null : sy.d0Shadow.z(nuVar.c, true);
                    if (z != null) {
                        o5Var.v = 1;
                        if (this.s.c(z, o5Var) == aVar) {
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
        o5Var = new o5(this, cVar);
        Object obj22 = o5Var.u;
        b71.a aVar2 = b71.a.r;
        i = o5Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(a71.c cVar, Object obj) {
        p5 p5Var;
        int i;
        if (cVar instanceof p5) {
            p5Var = (p5) cVar;
            int i2 = p5Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p5Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = p5Var.u;
                b71.a aVar = b71.a.r;
                i = p5Var.v;
                w61.a0 a0Var = w61.a0.a;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                    return a0Var;
                }
                sy.y.j(obj2);
                p5Var.v = 1;
                return this.s.c(a0Var, p5Var) == aVar ? aVar : a0Var;
            }
        }
        p5Var = new p5(this, cVar);
        Object obj22 = p5Var.u;
        b71.a aVar2 = b71.a.r;
        i = p5Var.v;
        w61.a0 a0Var2 = w61.a0.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object i(a71.c cVar, Object obj) {
        r5 r5Var;
        int i;
        String str;
        es esVar;
        es esVar2;
        es esVar3;
        if (cVar instanceof r5) {
            r5Var = (r5) cVar;
            int i2 = r5Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r5Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = r5Var.u;
                b71.a aVar = b71.a.r;
                i = r5Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    as asVar = (as) obj;
                    ds dsVar = asVar.a;
                    List list = (dsVar == null || (esVar3 = dsVar.c) == null) ? null : esVar3.a.b;
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
                        cs csVar = (cs) obj3;
                        arrayList.add(sy.e0.o(new w61.k(csVar.c, csVar.d)));
                    }
                    ds dsVar2 = asVar.a;
                    boolean z = (dsVar2 == null || (esVar2 = dsVar2.c) == null) ? false : esVar2.a.a.a;
                    if (dsVar2 == null || (esVar = dsVar2.c) == null || (str = esVar.a.a.b) == null) {
                        str = "";
                    }
                    yz0.c4 c4Var = new yz0.c4(arrayList, new x01.i(str, z, false));
                    r5Var.v = 1;
                    if (this.s.c(c4Var, r5Var) == aVar) {
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
        r5Var = new r5(this, cVar);
        Object obj22 = r5Var.u;
        b71.a aVar2 = b71.a.r;
        i = r5Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object j(a71.c cVar, Object obj) {
        s5 s5Var;
        int i;
        p01.g gVar;
        kt ktVar;
        if (cVar instanceof s5) {
            s5Var = (s5) cVar;
            int i2 = s5Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s5Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = s5Var.u;
                b71.a aVar = b71.a.r;
                i = s5Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    nt ntVar = ((mt) obj).a;
                    if (ntVar == null || (ktVar = ntVar.b) == null) {
                        p01.g.Companion.getClass();
                        gVar = p01.g.e;
                    } else {
                        gVar = sy.e0.n(ktVar.c);
                    }
                    s5Var.v = 1;
                    if (this.s.c(gVar, s5Var) == aVar) {
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
        s5Var = new s5(this, cVar);
        Object obj22 = s5Var.u;
        b71.a aVar2 = b71.a.r;
        i = s5Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(a71.c cVar, Object obj) {
        t5 t5Var;
        int i;
        String str;
        if (cVar instanceof t5) {
            t5Var = (t5) cVar;
            int i2 = t5Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t5Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = t5Var.u;
                b71.a aVar = b71.a.r;
                i = t5Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    qv qvVar = ((pv) obj).a;
                    if (qvVar == null || (str = qvVar.a) == null) {
                        str = "";
                    }
                    t5Var.v = 1;
                    if (this.s.c(str, t5Var) == aVar) {
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
        t5Var = new t5(this, cVar);
        Object obj22 = t5Var.u;
        b71.a aVar2 = b71.a.r;
        i = t5Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object n(a71.c cVar, Object obj) {
        u5 u5Var;
        int i;
        String str;
        String str2;
        if (cVar instanceof u5) {
            u5Var = (u5) cVar;
            int i2 = u5Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u5Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = u5Var.u;
                b71.a aVar = b71.a.r;
                i = u5Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    pw pwVar = ((nw) obj).a;
                    ow owVar = pwVar != null ? pwVar.a : null;
                    String str3 = "";
                    if (owVar == null || (str = owVar.a) == null) {
                        str = "";
                    }
                    if (owVar != null && (str2 = owVar.b) != null) {
                        str3 = str2;
                    }
                    yz0.v3 v3Var = new yz0.v3(str, str3);
                    u5Var.v = 1;
                    if (this.s.c(v3Var, u5Var) == aVar) {
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
        u5Var = new u5(this, cVar);
        Object obj22 = u5Var.u;
        b71.a aVar2 = b71.a.r;
        i = u5Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object o(a71.c cVar, Object obj) {
        v5 v5Var;
        int i;
        p01.i iVar;
        p01.g gVar;
        if (cVar instanceof v5) {
            v5Var = (v5) cVar;
            int i2 = v5Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v5Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = v5Var.u;
                b71.a aVar = b71.a.r;
                i = v5Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    st stVar = ((rt) obj).a;
                    if (stVar != null) {
                        pt ptVar = stVar.c;
                        if (ptVar != null) {
                            gVar = sy.e0.n(ptVar.c);
                        } else {
                            p01.g.Companion.getClass();
                            gVar = p01.g.e;
                        }
                        iVar = new p01.i(gVar, stVar.b);
                    } else {
                        p01.i.Companion.getClass();
                        iVar = p01.i.c;
                    }
                    v5Var.v = 1;
                    if (this.s.c(iVar, v5Var) == aVar) {
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
        v5Var = new v5(this, cVar);
        Object obj22 = v5Var.u;
        b71.a aVar2 = b71.a.r;
        i = v5Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0867  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x09bf  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x0aa0  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x0aaf  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x0b29  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x0b38  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016f  */
    /* JADX WARN: Type inference failed for: r1v143, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v169, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v73 */
    /* JADX WARN: Type inference failed for: r5v74 */
    /* JADX WARN: Type inference failed for: r5v75, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v33, types: [x61.rShadow] */
    /* JADX WARN: Type inference failed for: r9v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v37, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v39, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        o4 o4Var;
        int i;
        q4 q4Var;
        int i2;
        r4 r4Var;
        int i3;
        s4 s4Var;
        int i4;
        t4 t4Var;
        int i5;
        mb0.j jVar;
        mb0.h hVar;
        u4 u4Var;
        int i6;
        mb0.b0 b0Var;
        mb0.z zVar;
        v4 v4Var;
        int i7;
        mb0.h0 h0Var;
        mb0.f0 f0Var;
        w4 w4Var;
        int i8;
        mb0.n0 n0Var;
        mb0.l0 l0Var;
        x4 x4Var;
        int i9;
        mb0.t0 t0Var;
        mb0.r0 r0Var;
        y4 y4Var;
        int i10;
        mb0.v vVar;
        mb0.tShadow tVar;
        z4 z4Var;
        int i12;
        mb0.p pVar;
        mb0.n nVar;
        a5 a5Var;
        int i13;
        b5 b5Var;
        int i14;
        mb0.z0 z0Var;
        mb0.x0 x0Var;
        c5 c5Var;
        int i15;
        zn znVar;
        zn znVar2;
        yz0.l4 l4Var;
        co coVar;
        zn znVar3;
        g5 g5Var;
        int i16;
        o01.c cVar2;
        o01.a aVar;
        java.util.ArrayList r5;
        yo yoVar;
        yo yoVar2;
        List list;
        op opVar;
        dp dpVar;
        pp ppVar;
        pp ppVar2;
        o01.a aVar2;
        Object r52;
        yo yoVar3;
        yo yoVar4;
        List list2;
        boolean z;
        boolean z2;
        String str;
        String str2;
        o01.d dVar;
        h5 h5Var;
        int i17;
        w61.k kVar;
        po poVar;
        mo moVar;
        j5 j5Var;
        int i18;
        u10.r6 r6Var;
        w5 w5Var;
        int i19;
        bt btVar;
        bt btVar2;
        ct ctVar;
        String str3;
        ct ctVar2;
        switch (this.r) {
            case 0:
                if (cVar instanceof o4) {
                    o4Var = (o4) cVar;
                    int i20 = o4Var.v;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        o4Var.v = i20 - Integer.MIN_VALUE;
                        Object obj2 = o4Var.u;
                        b71.a aVar3 = b71.a.r;
                        i = o4Var.v;
                        w61.a0 a0Var = w61.a0.a;
                        if (i != 0) {
                            sy.y.j(obj2);
                            o4Var.v = 1;
                            if (this.s.c(a0Var, o4Var) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj2);
                        }
                        return a0Var;
                    }
                }
                o4Var = new o4(this, cVar);
                Object obj22 = o4Var.u;
                b71.a aVar32 = b71.a.r;
                i = o4Var.v;
                w61.a0 a0Var2 = w61.a0.a;
                if (i != 0) {
                }
                return a0Var2;
            case 1:
                if (cVar instanceof q4) {
                    q4Var = (q4) cVar;
                    int i22 = q4Var.v;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        q4Var.v = i22 - Integer.MIN_VALUE;
                        Object obj3 = q4Var.u;
                        b71.a aVar4 = b71.a.r;
                        i2 = q4Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            mb0.c cVar3 = ((mb0.b) obj).a.a;
                            n01.a aVar5 = new n01.a(cVar3 != null ? cVar3.a : false, cVar3 != null ? cVar3.b : false, cVar3 != null ? cVar3.d : false, cVar3 != null ? cVar3.c : false, cVar3 != null ? cVar3.e : false, cVar3 != null ? cVar3.f : false, cVar3 != null ? cVar3.g : false, cVar3 != null ? cVar3.h : false, false, 512);
                            q4Var.v = 1;
                            if (this.s.c(aVar5, q4Var) == aVar4) {
                                return aVar4;
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
                q4Var = new q4(this, cVar);
                Object obj32 = q4Var.u;
                b71.a aVar42 = b71.a.r;
                i2 = q4Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof r4) {
                    r4Var = (r4) cVar;
                    int i23 = r4Var.v;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        r4Var.v = i23 - Integer.MIN_VALUE;
                        Object obj4 = r4Var.u;
                        b71.a aVar6 = b71.a.r;
                        i3 = r4Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj4);
                            pk pkVar = ((ok) obj).a.a;
                            n01.a aVar7 = new n01.a(false, pkVar != null && pkVar.a, false, false, false, false, false, false, false, 1021);
                            r4Var.v = 1;
                            if (this.s.c(aVar7, r4Var) == aVar6) {
                                return aVar6;
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
                r4Var = new r4(this, cVar);
                Object obj42 = r4Var.u;
                b71.a aVar62 = b71.a.r;
                i3 = r4Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof s4) {
                    s4Var = (s4) cVar;
                    int i24 = s4Var.v;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        s4Var.v = i24 - Integer.MIN_VALUE;
                        Object obj5 = s4Var.u;
                        b71.a aVar8 = b71.a.r;
                        i4 = s4Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj5);
                            Iterable<sn> iterable = ((qn) obj).a.a.a;
                            if (iterable == null) {
                                iterable = x61.rShadow.r;
                            }
                            ArrayList arrayList = new ArrayList();
                            for (sn snVar : iterable) {
                                a70.a aVar9 = snVar != null ? snVar.c : null;
                                if (aVar9 != null) {
                                    arrayList.add(aVar9);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
                            int size = arrayList.size();
                            int i25 = 0;
                            while (i25 < size) {
                                Object obj6 = arrayList.get(i25);
                                i25++;
                                arrayList2.add(sy.a0.e((a70.a) obj6));
                            }
                            s4Var.v = 1;
                            if (this.s.c(arrayList2, s4Var) == aVar8) {
                                return aVar8;
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
                s4Var = new s4(this, cVar);
                Object obj52 = s4Var.u;
                b71.a aVar82 = b71.a.r;
                i4 = s4Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof t4) {
                    t4Var = (t4) cVar;
                    int i26 = t4Var.v;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        t4Var.v = i26 - Integer.MIN_VALUE;
                        Object obj7 = t4Var.u;
                        b71.a aVar10 = b71.a.r;
                        i5 = t4Var.v;
                        if (i5 != 0) {
                            sy.y.j(obj7);
                            mb0.i iVar = ((mb0.g) obj).a;
                            Boolean valueOf = Boolean.valueOf((iVar == null || (jVar = iVar.b) == null || (hVar = jVar.a) == null) ? false : hVar.a);
                            t4Var.v = 1;
                            if (this.s.c(valueOf, t4Var) == aVar10) {
                                return aVar10;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj7);
                        }
                        return w61.a0.a;
                    }
                }
                t4Var = new t4(this, cVar);
                Object obj72 = t4Var.u;
                b71.a aVar102 = b71.a.r;
                i5 = t4Var.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof u4) {
                    u4Var = (u4) cVar;
                    int i27 = u4Var.v;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        u4Var.v = i27 - Integer.MIN_VALUE;
                        Object obj8 = u4Var.u;
                        b71.a aVar11 = b71.a.r;
                        i6 = u4Var.v;
                        if (i6 != 0) {
                            sy.y.j(obj8);
                            mb0.a0 a0Var3 = ((mb0.y) obj).a;
                            Boolean valueOf2 = Boolean.valueOf((a0Var3 == null || (b0Var = a0Var3.b) == null || (zVar = b0Var.a) == null) ? false : zVar.a);
                            u4Var.v = 1;
                            if (this.s.c(valueOf2, u4Var) == aVar11) {
                                return aVar11;
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj8);
                        }
                        return w61.a0.a;
                    }
                }
                u4Var = new u4(this, cVar);
                Object obj82 = u4Var.u;
                b71.a aVar112 = b71.a.r;
                i6 = u4Var.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof v4) {
                    v4Var = (v4) cVar;
                    int i28 = v4Var.v;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        v4Var.v = i28 - Integer.MIN_VALUE;
                        Object obj9 = v4Var.u;
                        b71.a aVar12 = b71.a.r;
                        i7 = v4Var.v;
                        if (i7 != 0) {
                            sy.y.j(obj9);
                            mb0.g0 g0Var = ((mb0.e0) obj).a;
                            Boolean valueOf3 = Boolean.valueOf((g0Var == null || (h0Var = g0Var.b) == null || (f0Var = h0Var.a) == null) ? false : f0Var.a);
                            v4Var.v = 1;
                            if (this.s.c(valueOf3, v4Var) == aVar12) {
                                return aVar12;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj9);
                        }
                        return w61.a0.a;
                    }
                }
                v4Var = new v4(this, cVar);
                Object obj92 = v4Var.u;
                b71.a aVar122 = b71.a.r;
                i7 = v4Var.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof w4) {
                    w4Var = (w4) cVar;
                    int i29 = w4Var.v;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        w4Var.v = i29 - Integer.MIN_VALUE;
                        Object obj10 = w4Var.u;
                        b71.a aVar13 = b71.a.r;
                        i8 = w4Var.v;
                        if (i8 != 0) {
                            sy.y.j(obj10);
                            mb0.m0 m0Var = ((mb0.k0) obj).a;
                            Boolean valueOf4 = Boolean.valueOf((m0Var == null || (n0Var = m0Var.b) == null || (l0Var = n0Var.a) == null) ? false : l0Var.a);
                            w4Var.v = 1;
                            if (this.s.c(valueOf4, w4Var) == aVar13) {
                                return aVar13;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj10);
                        }
                        return w61.a0.a;
                    }
                }
                w4Var = new w4(this, cVar);
                Object obj102 = w4Var.u;
                b71.a aVar132 = b71.a.r;
                i8 = w4Var.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof x4) {
                    x4Var = (x4) cVar;
                    int i30 = x4Var.v;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        x4Var.v = i30 - Integer.MIN_VALUE;
                        Object obj11 = x4Var.u;
                        b71.a aVar14 = b71.a.r;
                        i9 = x4Var.v;
                        if (i9 != 0) {
                            sy.y.j(obj11);
                            mb0.s0 s0Var = ((mb0.q0) obj).a;
                            Boolean valueOf5 = Boolean.valueOf((s0Var == null || (t0Var = s0Var.b) == null || (r0Var = t0Var.b) == null) ? false : r0Var.a);
                            x4Var.v = 1;
                            if (this.s.c(valueOf5, x4Var) == aVar14) {
                                return aVar14;
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj11);
                        }
                        return w61.a0.a;
                    }
                }
                x4Var = new x4(this, cVar);
                Object obj112 = x4Var.u;
                b71.a aVar142 = b71.a.r;
                i9 = x4Var.v;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof y4) {
                    y4Var = (y4) cVar;
                    int i32 = y4Var.v;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        y4Var.v = i32 - Integer.MIN_VALUE;
                        Object obj12 = y4Var.u;
                        b71.a aVar15 = b71.a.r;
                        i10 = y4Var.v;
                        if (i10 != 0) {
                            sy.y.j(obj12);
                            mb0.u uVar = ((mb0.s) obj).a;
                            Boolean valueOf6 = Boolean.valueOf((uVar == null || (vVar = uVar.b) == null || (tVar = vVar.a) == null) ? false : tVar.b);
                            y4Var.v = 1;
                            if (this.s.c(valueOf6, y4Var) == aVar15) {
                                return aVar15;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj12);
                        }
                        return w61.a0.a;
                    }
                }
                y4Var = new y4(this, cVar);
                Object obj122 = y4Var.u;
                b71.a aVar152 = b71.a.r;
                i10 = y4Var.v;
                if (i10 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof z4) {
                    z4Var = (z4) cVar;
                    int i33 = z4Var.v;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        z4Var.v = i33 - Integer.MIN_VALUE;
                        Object obj13 = z4Var.u;
                        b71.a aVar16 = b71.a.r;
                        i12 = z4Var.v;
                        if (i12 != 0) {
                            sy.y.j(obj13);
                            mb0.o oVar = ((mb0.m) obj).a;
                            Boolean valueOf7 = Boolean.valueOf((oVar == null || (pVar = oVar.b) == null || (nVar = pVar.a) == null) ? false : nVar.a);
                            z4Var.v = 1;
                            if (this.s.c(valueOf7, z4Var) == aVar16) {
                                return aVar16;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj13);
                        }
                        return w61.a0.a;
                    }
                }
                z4Var = new z4(this, cVar);
                Object obj132 = z4Var.u;
                b71.a aVar162 = b71.a.r;
                i12 = z4Var.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof a5) {
                    a5Var = (a5) cVar;
                    int i34 = a5Var.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        a5Var.v = i34 - Integer.MIN_VALUE;
                        Object obj14 = a5Var.u;
                        b71.a aVar17 = b71.a.r;
                        i13 = a5Var.v;
                        if (i13 != 0) {
                            sy.y.j(obj14);
                            g70 g70Var = ((e70) obj).a;
                            List list3 = g70Var != null ? g70Var.a : null;
                            if (list3 == null) {
                                list3 = x61.rShadow.r;
                            }
                            ArrayList arrayList3 = new ArrayList(x61.n.F(list3, 10));
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((f70) it.next()).c);
                            }
                            ArrayList arrayList4 = new ArrayList(x61.n.F(arrayList3, 10));
                            int size2 = arrayList3.size();
                            int i35 = 0;
                            while (i35 < size2) {
                                Object obj15 = arrayList3.get(i35);
                                i35++;
                                arrayList4.add(sy.a0.e((a70.a) obj15));
                            }
                            a5Var.v = 1;
                            if (this.s.c(arrayList4, a5Var) == aVar17) {
                                return aVar17;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj14);
                        }
                        return w61.a0.a;
                    }
                }
                a5Var = new a5(this, cVar);
                Object obj142 = a5Var.u;
                b71.a aVar172 = b71.a.r;
                i13 = a5Var.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof b5) {
                    b5Var = (b5) cVar;
                    int i36 = b5Var.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        b5Var.v = i36 - Integer.MIN_VALUE;
                        Object obj16 = b5Var.u;
                        b71.a aVar18 = b71.a.r;
                        i14 = b5Var.v;
                        if (i14 != 0) {
                            sy.y.j(obj16);
                            mb0.y0 y0Var = ((mb0.w0) obj).a;
                            Boolean valueOf8 = Boolean.valueOf((y0Var == null || (z0Var = y0Var.b) == null || (x0Var = z0Var.a) == null) ? false : x0Var.a);
                            b5Var.v = 1;
                            if (this.s.c(valueOf8, b5Var) == aVar18) {
                                return aVar18;
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj16);
                        }
                        return w61.a0.a;
                    }
                }
                b5Var = new b5(this, cVar);
                Object obj162 = b5Var.u;
                b71.a aVar182 = b71.a.r;
                i14 = b5Var.v;
                if (i14 != 0) {
                }
                return w61.a0.a;
            case 13:
                if (cVar instanceof c5) {
                    c5Var = (c5) cVar;
                    int i37 = c5Var.v;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        c5Var.v = i37 - Integer.MIN_VALUE;
                        Object obj17 = c5Var.u;
                        b71.a aVar19 = b71.a.r;
                        i15 = c5Var.v;
                        if (i15 != 0) {
                            sy.y.j(obj17);
                            wn wnVar = (wn) obj;
                            yn ynVar = wnVar.a;
                            String str4 = null;
                            List<xn> list4 = (ynVar == null || (znVar3 = ynVar.c) == null) ? null : znVar3.a.b;
                            if (list4 == null) {
                                list4 = x61.rShadow.r;
                            }
                            ArrayList arrayList5 = new ArrayList();
                            for (xn xnVar : list4) {
                                if (xnVar == null || (coVar = xnVar.a) == null) {
                                    l4Var = null;
                                } else {
                                    ea0.q0 q0Var = coVar.c;
                                    l4Var = new yz0.l4(t.q.q(q0Var.e), q0Var.b, q0Var.c, q0Var.d, "");
                                }
                                if (l4Var != null) {
                                    arrayList5.add(l4Var);
                                }
                            }
                            yn ynVar2 = wnVar.a;
                            boolean z3 = (ynVar2 == null || (znVar2 = ynVar2.c) == null) ? false : znVar2.a.a.a;
                            if (ynVar2 != null && (znVar = ynVar2.c) != null) {
                                str4 = znVar.a.a.b;
                            }
                            w61.k kVar2 = new w61.k(arrayList5, new x01.i(str4, z3, false));
                            c5Var.v = 1;
                            if (this.s.c(kVar2, c5Var) == aVar19) {
                                return aVar19;
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj17);
                        }
                        return w61.a0.a;
                    }
                }
                c5Var = new c5(this, cVar);
                Object obj172 = c5Var.u;
                b71.a aVar192 = b71.a.r;
                i15 = c5Var.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof g5) {
                    g5Var = (g5) cVar;
                    int i38 = g5Var.v;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        g5Var.v = i38 - Integer.MIN_VALUE;
                        Object obj18 = g5Var.u;
                        b71.a aVar20 = b71.a.r;
                        i16 = g5Var.v;
                        if (i16 != 0) {
                            sy.y.j(obj18);
                            wo woVar = (wo) obj;
                            String str5 = "<this>";
                            k71.k.g(woVar, "<this>");
                            jp jpVar = woVar.a;
                            hp hpVar = jpVar != null ? jpVar.d : null;
                            x61.rShadow rVar = x61.rShadow.r;
                            if (hpVar != null) {
                                hp hpVar2 = jpVar.d;
                                if (hpVar2 != null) {
                                    String str6 = hpVar2.e;
                                    String str7 = hpVar2.b;
                                    i80.c cVar4 = hpVar2.q;
                                    lp lpVar = hpVar2.f;
                                    String str8 = hpVar2.d;
                                    String str9 = (str8 == null || t71.p.T(str8)) ? str6 : str8;
                                    to toVar = hpVar2.g;
                                    com.github.service.models.response.a c = t.e.c(toVar != null ? toVar.c : null);
                                    ZonedDateTime zonedDateTime = hpVar2.m;
                                    if (zonedDateTime == null) {
                                        zonedDateTime = hpVar2.l;
                                    }
                                    ZonedDateTime zonedDateTime2 = zonedDateTime;
                                    boolean z4 = hpVar2.j;
                                    boolean z5 = hpVar2.i;
                                    boolean z6 = hpVar2.k;
                                    String str10 = hpVar2.h;
                                    String str11 = str10 == null ? "" : str10;
                                    String str12 = lpVar != null ? lpVar.b : null;
                                    String str13 = lpVar != null ? lpVar.c : null;
                                    String str14 = hpVar2.c;
                                    xo xoVar = hpVar2.o;
                                    if (xoVar != null) {
                                        String str15 = xoVar.a;
                                        int i39 = xoVar.b;
                                        uo uoVar = xoVar.c;
                                        z = z5;
                                        List list5 = uoVar.b;
                                        if (list5 == null) {
                                            list5 = rVar;
                                        }
                                        ArrayList S = x61.m.S(list5);
                                        z2 = z6;
                                        str = str14;
                                        str2 = str6;
                                        ArrayList arrayList6 = new ArrayList(x61.n.F(S, 10));
                                        int size3 = S.size();
                                        int i40 = 0;
                                        while (i40 < size3) {
                                            Object obj19 = S.get(i40);
                                            i40++;
                                            ArrayList arrayList7 = S;
                                            zo zoVar = (zo) obj19;
                                            k71.k.g(zoVar, "<this>");
                                            int i42 = size3;
                                            String str16 = zoVar.b;
                                            String str17 = zoVar.f;
                                            so soVar = zoVar.c;
                                            com.github.service.models.response.a c2 = t.e.c(soVar != null ? soVar.b : null);
                                            ZonedDateTime zonedDateTime3 = zoVar.e;
                                            if (zonedDateTime3 == null) {
                                                zonedDateTime3 = zoVar.d;
                                            }
                                            arrayList6.add(new o01.e(str16, str17, c2, zonedDateTime3, sy.tShadow.d(zoVar.g)));
                                            size3 = i42;
                                            S = arrayList7;
                                        }
                                        dVar = new o01.d(i39, uoVar.a, str15, arrayList6);
                                    } else {
                                        z = z5;
                                        z2 = z6;
                                        str = str14;
                                        str2 = str6;
                                        dVar = null;
                                    }
                                    aVar2 = new o01.a(str7, str9, str2, c, zonedDateTime2, z4, z, z2, str11, str12, str13, str, dVar, sy.c0.f(cVar4, str7), cVar4.c);
                                } else {
                                    aVar2 = null;
                                }
                                Avatar q = t.q.q(jpVar.b.c);
                                if (hpVar2 == null || (yoVar4 = hpVar2.p) == null || (list2 = yoVar4.b) == null) {
                                    r52 = 0;
                                } else {
                                    ArrayList S2 = x61.m.S(list2);
                                    r52 = new ArrayList(x61.n.F(S2, 10));
                                    int size4 = S2.size();
                                    int i43 = 0;
                                    while (i43 < size4) {
                                        Object obj20 = S2.get(i43);
                                        i43++;
                                        r52.add(t.e.c(((ap) obj20).c));
                                    }
                                }
                                if (r52 == 0) {
                                    r52 = rVar;
                                }
                                com.github.rudroid.common.b0 b0Var2 = new com.github.rudroid.common.b0((hpVar2 == null || (yoVar3 = hpVar2.p) == null) ? 0 : yoVar3.a, (List) r52);
                                x61.rShadow rVar2 = hpVar2 != null ? hpVar2.n.b : null;
                                if (rVar2 != null) {
                                    rVar = rVar2;
                                }
                                ArrayList S3 = x61.m.S(rVar);
                                ArrayList arrayList8 = new ArrayList(x61.n.F(S3, 10));
                                int size5 = S3.size();
                                for (int i44 = 0; i44 < size5; i44++) {
                                    bp bpVar = (bp) S3.get(i44);
                                    k71.k.g(bpVar, "<this>");
                                    arrayList8.add(new o01.b(bpVar.a, bpVar.b, aa1.b.E(bpVar.c), bpVar.d, bpVar.e));
                                    S3 = S3;
                                    size5 = size5;
                                }
                                cVar2 = new o01.c(aVar2, q, b0Var2, arrayList8, new x01.i(hpVar2 != null ? hpVar2.n.a.b : null, hpVar2 != null ? hpVar2.n.a.a : false, false));
                            } else if (jpVar != null) {
                                gp gpVar = jpVar.c;
                                hp hpVar3 = jpVar.d;
                                if (gpVar == null || (opVar = gpVar.b) == null || (dpVar = opVar.c) == null) {
                                    aVar = null;
                                } else {
                                    String str18 = dpVar.a;
                                    cp cpVar = dpVar.b.c;
                                    String str19 = dpVar.d;
                                    mp mpVar = dpVar.f;
                                    com.github.service.models.response.a c3 = t.e.c((mpVar == null || (ppVar2 = mpVar.a) == null) ? null : ppVar2.c);
                                    ZonedDateTime now = cpVar != null ? cpVar.g : ZonedDateTime.now();
                                    k71.k.d(now);
                                    aVar = new o01.a(str18, str19, str19, c3, now, false, false, false, cpVar != null ? cpVar.f : "", cpVar != null ? cpVar.b : null, cpVar != null ? cpVar.c : null, (mpVar == null || (ppVar = mpVar.a) == null) ? null : ppVar.c.c, null, rVar, false);
                                }
                                Avatar q2 = t.q.q(jpVar.b.c);
                                if (hpVar3 == null || (yoVar2 = hpVar3.p) == null || (list = yoVar2.b) == null) {
                                    r5 = 0;
                                } else {
                                    ArrayList S4 = x61.m.S(list);
                                    r5 = new ArrayList(x61.n.F(S4, 10));
                                    int size6 = S4.size();
                                    int i45 = 0;
                                    while (i45 < size6) {
                                        Object obj21 = S4.get(i45);
                                        i45++;
                                        r5.add(t.e.c(((ap) obj21).c));
                                    }
                                }
                                if (r5 == 0) {
                                    r5 = rVar;
                                }
                                com.github.rudroid.common.b0 b0Var3 = new com.github.rudroid.common.b0((hpVar3 == null || (yoVar = hpVar3.p) == null) ? 0 : yoVar.a, (List) r5);
                                x61.rShadow rVar3 = hpVar3 != null ? hpVar3.n.b : null;
                                if (rVar3 != null) {
                                    rVar = rVar3;
                                }
                                ArrayList S5 = x61.m.S(rVar);
                                ArrayList arrayList9 = new ArrayList(x61.n.F(S5, 10));
                                int size7 = S5.size();
                                int i46 = 0;
                                while (i46 < size7) {
                                    Object obj23 = S5.get(i46);
                                    i46++;
                                    bp bpVar2 = (bp) obj23;
                                    k71.k.g(bpVar2, str5);
                                    arrayList9.add(new o01.b(bpVar2.a, bpVar2.b, aa1.b.E(bpVar2.c), bpVar2.d, bpVar2.e));
                                    str5 = str5;
                                    S5 = S5;
                                }
                                cVar2 = new o01.c(aVar, q2, b0Var3, arrayList9, new x01.i(hpVar3 != null ? hpVar3.n.a.b : null, hpVar3 != null ? hpVar3.n.a.a : false, false));
                            } else {
                                cVar2 = null;
                            }
                            if (cVar2 != null) {
                                g5Var.v = 1;
                                if (this.s.c(cVar2, g5Var) == aVar20) {
                                    return aVar20;
                                }
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj18);
                        }
                        return w61.a0.a;
                    }
                }
                g5Var = new g5(this, cVar);
                Object obj182 = g5Var.u;
                b71.a aVar202 = b71.a.r;
                i16 = g5Var.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 15:
                if (cVar instanceof h5) {
                    h5Var = (h5) cVar;
                    int i47 = h5Var.v;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        h5Var.v = i47 - Integer.MIN_VALUE;
                        Object obj24 = h5Var.u;
                        b71.a aVar21 = b71.a.r;
                        i17 = h5Var.v;
                        if (i17 != 0) {
                            sy.y.j(obj24);
                            qo qoVar = ((lo) obj).a;
                            if (qoVar == null || (poVar = qoVar.a) == null || (moVar = poVar.a) == null) {
                                kVar = null;
                            } else {
                                Iterable iterable2 = moVar.b;
                                if (iterable2 == null) {
                                    iterable2 = x61.rShadow.r;
                                }
                                ArrayList S6 = x61.m.S(iterable2);
                                ArrayList arrayList10 = new ArrayList(x61.n.F(S6, 10));
                                int size8 = S6.size();
                                int i48 = 0;
                                while (i48 < size8) {
                                    Object obj25 = S6.get(i48);
                                    i48++;
                                    arrayList10.add(t.z.d(((no) obj25).c));
                                }
                                oo ooVar = moVar.a;
                                kVar = new w61.k(arrayList10, new x01.i(ooVar.b, ooVar.a, false));
                            }
                            if (kVar != null) {
                                h5Var.v = 1;
                                if (this.s.c(kVar, h5Var) == aVar21) {
                                    return aVar21;
                                }
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj24);
                        }
                        return w61.a0.a;
                    }
                }
                h5Var = new h5(this, cVar);
                Object obj242 = h5Var.u;
                b71.a aVar212 = b71.a.r;
                i17 = h5Var.v;
                if (i17 != 0) {
                }
                return w61.a0.a;
            case 16:
                return a(cVar, obj);
            case 17:
                if (cVar instanceof j5) {
                    j5Var = (j5) cVar;
                    int i49 = j5Var.v;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        j5Var.v = i49 - Integer.MIN_VALUE;
                        Object obj26 = j5Var.u;
                        b71.a aVar22 = b71.a.r;
                        i18 = j5Var.v;
                        if (i18 != 0) {
                            sy.y.j(obj26);
                            u10.p6 p6Var = (u10.p6) obj;
                            k71.k.g(p6Var, "<this>");
                            u10.o6 o6Var = p6Var.a;
                            if (o6Var == null || (r6Var = o6Var.a) == null) {
                                throw new ApiFailure(ApiFailureType.RESPONSE_ERROR, "Invalid pull request data", null, null, null, null, null, 120);
                            }
                            String str20 = r6Var.a;
                            u10.s6 s6Var = r6Var.b;
                            p01.b bVar = new p01.b(r6Var.c, str20, s6Var.c.b, s6Var.b, r6Var.d);
                            j5Var.v = 1;
                            if (this.s.c(bVar, j5Var) == aVar22) {
                                return aVar22;
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj26);
                        }
                        return w61.a0.a;
                    }
                }
                j5Var = new j5(this, cVar);
                Object obj262 = j5Var.u;
                b71.a aVar222 = b71.a.r;
                i18 = j5Var.v;
                if (i18 != 0) {
                }
                return w61.a0.a;
            case 18:
                return b(cVar, obj);
            case 19:
                return d(cVar, obj);
            case 20:
                return e(cVar, obj);
            case 21:
                return f(cVar, obj);
            case 22:
                return g(cVar, obj);
            case 23:
                return h(cVar, obj);
            case 24:
                return i(cVar, obj);
            case 25:
                return j(cVar, obj);
            case 26:
                return k(cVar, obj);
            case 27:
                return n(cVar, obj);
            case 28:
                return o(cVar, obj);
            default:
                if (cVar instanceof w5) {
                    w5Var = (w5) cVar;
                    int i50 = w5Var.v;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        w5Var.v = i50 - Integer.MIN_VALUE;
                        Object obj27 = w5Var.u;
                        b71.a aVar23 = b71.a.r;
                        i19 = w5Var.v;
                        if (i19 != 0) {
                            sy.y.j(obj27);
                            ys ysVar = (ys) obj;
                            ht htVar = ysVar.a;
                            String str21 = null;
                            ct ctVar3 = htVar != null ? htVar.b : null;
                            java.util.List r9 = (java.util.List) (x61.rShadow.r);
                            if (ctVar3 != null) {
                                List list6 = htVar.b.a.b;
                                List list7 = r9;
                                if (list6 != null) {
                                    list7 = list6;
                                }
                                ArrayList S7 = x61.m.S(list7);
                                r9 = new ArrayList(x61.n.F(S7, 10));
                                int size9 = S7.size();
                                int i52 = 0;
                                while (i52 < size9) {
                                    Object obj28 = S7.get(i52);
                                    i52++;
                                    at atVar = (at) obj28;
                                    r9.add(sy.e0.o(new w61.k(atVar.c, atVar.d)));
                                }
                            } else if ((htVar != null ? htVar.c : null) != null) {
                                List list8 = htVar.c.a.b;
                                List list9 = r9;
                                if (list8 != null) {
                                    list9 = list8;
                                }
                                ArrayList S8 = x61.m.S(list9);
                                r9 = new ArrayList(x61.n.F(S8, 10));
                                int size10 = S8.size();
                                int i53 = 0;
                                while (i53 < size10) {
                                    Object obj29 = S8.get(i53);
                                    i53++;
                                    zs zsVar = (zs) obj29;
                                    r9.add(sy.e0.o(new w61.k(zsVar.c, zsVar.d)));
                                }
                            }
                            ht htVar2 = ysVar.a;
                            boolean z7 = (htVar2 == null || (ctVar2 = htVar2.b) == null) ? (htVar2 == null || (btVar = htVar2.c) == null) ? false : btVar.a.a.a : ctVar2.a.a.a;
                            if (htVar2 != null && (ctVar = htVar2.b) != null && (str3 = ctVar.a.a.b) != null) {
                                str21 = str3;
                            } else if (htVar2 != null && (btVar2 = htVar2.c) != null) {
                                str21 = btVar2.a.a.b;
                            }
                            yz0.c4 c4Var = new yz0.c4(r9, new x01.i(str21, z7, false));
                            w5Var.v = 1;
                            if (this.s.c(c4Var, w5Var) == aVar23) {
                                return aVar23;
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj27);
                        }
                        return w61.a0.a;
                    }
                }
                w5Var = new w5(this, cVar);
                Object obj272 = w5Var.u;
                b71.a aVar232 = b71.a.r;
                i19 = w5Var.v;
                if (i19 != 0) {
                }
                return w61.a0.a;
        }
    }
}
