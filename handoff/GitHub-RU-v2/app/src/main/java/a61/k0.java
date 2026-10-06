package a61;

import com.github.service.models.response.Avatar;
import com.github.service.models.response.ContributionLevel;
import com.google.android.gms.internal.measurement.d5;
import java.util.ArrayList;
import java.util.List;
import jn0.av;
import jn0.bd;
import jn0.cd;
import jn0.e30;
import jn0.ef0;
import jn0.eg0;
import jn0.f30;
import jn0.g30;
import jn0.gf0;
import jn0.h30;
import jn0.hf0;
import jn0.hw;
import jn0.if0;
import jn0.ig0;
import jn0.iw;
import jn0.jw;
import jn0.kw;
import jn0.lg;
import jn0.lw;
import jn0.mg;
import jn0.mw;
import jn0.ng;
import jn0.og;
import jn0.pg;
import jn0.pw;
import jn0.qf0;
import jn0.qg;
import jn0.qw;
import jn0.rf0;
import jn0.rg;
import jn0.rw;
import jn0.sg;
import jn0.sw;
import jn0.te0;
import jn0.tg;
import jn0.tw;
import jn0.uw;
import jn0.ve0;
import jn0.vu;
import jn0.wu;
import jn0.xe0;
import jn0.xu;
import jn0.yu;
import jn0.zu;
import jo.a7;
import jo.b7;
import jo.c7;
import jo.d7;
import jo.x6;
import jo.y6;
import jo.z6;
import kotlin.NoWhenBranchMatchedException;
import pz0.l40;
import y41.t1;
import yz0.a3;
import yz0.b2;
import yz0.d8;
import yz0.e8;
import yz0.f8;
import yz0.g8;
import yz0.l4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k0 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.jShadow s;

    public /* synthetic */ k0(y71.jShadow jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r4v0, types: [x61.rShadow] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        bz0.v vVar;
        int i;
        java.util.ArrayList r4;
        if (cVar instanceof bz0.v) {
            vVar = (bz0.v) cVar;
            int i2 = vVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = vVar.u;
                b71.a aVar = b71.a.r;
                i = vVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    if0 if0Var = ((ef0) obj).a;
                    f8 f8Var = null;
                    if (if0Var != null) {
                        List<gf0> list = if0Var.d.a;
                        if (list != null) {
                            r4 = new ArrayList();
                            for (gf0 gf0Var : list) {
                                e8 Z = gf0Var != null ? com.google.common.util.concurrent.a.Z(gf0Var.c) : null;
                                if (Z != null) {
                                    r4.add(Z);
                                }
                            }
                        } else {
                            r4 = x61.rShadow.r;
                        }
                        List<hf0> list2 = if0Var.c;
                        ArrayList arrayList = new ArrayList(x61.n.F(list2, 10));
                        for (hf0 hf0Var : list2) {
                            String str = hf0Var.b;
                            String str2 = "";
                            if (str == null) {
                                str = "";
                            }
                            String str3 = hf0Var.a;
                            if (str3 != null) {
                                str2 = str3;
                            }
                            arrayList.add(new g8(str, str2));
                        }
                        f8Var = new f8(if0Var.b, arrayList, r4);
                    }
                    if (f8Var != null) {
                        vVar.v = 1;
                        if (this.s.c(f8Var, vVar) == aVar) {
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
        vVar = new bz0.v(this, cVar);
        Object obj22 = vVar.u;
        b71.a aVar2 = b71.a.r;
        i = vVar.v;
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
        c00.i iVar;
        int i;
        vz.n nVar;
        vz.k kVar;
        if (cVar instanceof c00.i) {
            iVar = (c00.i) cVar;
            int i2 = iVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = iVar.u;
                b71.a aVar = b71.a.r;
                i = iVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    vz.m mVar = ((vz.j) obj).a;
                    xz.p pVar = (mVar == null || (nVar = mVar.c) == null || (kVar = nVar.b) == null) ? null : kVar.b.b;
                    if (pVar != null) {
                        iVar.v = 1;
                        if (this.s.c(pVar, iVar) == aVar) {
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
        iVar = new c00.i(this, cVar);
        Object obj22 = iVar.u;
        b71.a aVar2 = b71.a.r;
        i = iVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [x61.rShadow] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object d(a71.c cVar, Object obj) {
        c00.jShadow jVar;
        int i;
        f00.m0 m0Var;
        f00.g0 g0Var;
        if (cVar instanceof c00.j) {
            jVar = (c00.j) cVar;
            int i2 = jVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = jVar.u;
                b71.a aVar = b71.a.r;
                i = jVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    d00.n nVar = ((d00.m) obj).a;
                    java.util.List r8 = (java.util.List) (x61.rShadow.r);
                    l01.w wVar = null;
                    if (nVar != null && (g0Var = nVar.c) != null) {
                        List<f00.e0> list = g0Var.c.a;
                        if (list != null) {
                            ArrayList arrayList = new ArrayList();
                            for (f00.e0 e0Var : list) {
                                l01.w0 S = e0Var != null ? i21.a.S(e0Var.c) : null;
                                if (S != null) {
                                    arrayList.add(S);
                                }
                            }
                            wVar = arrayList;
                        }
                        Object r82 = r8;
                        if (wVar != null) {
                            r82 = wVar;
                        }
                        wVar = new l01.w(r82);
                    } else if (nVar != null && (m0Var = nVar.d) != null) {
                        List<f00.k0> list2 = m0Var.c.a;
                        if (list2 != null) {
                            r8 = new ArrayList();
                            for (f00.k0 k0Var : list2) {
                                l01.w0 S2 = k0Var != null ? i21.a.S(k0Var.c) : null;
                                if (S2 != null) {
                                    r8.add(S2);
                                }
                            }
                        }
                        wVar = new l01.w(r8);
                    }
                    if (wVar != null) {
                        jVar.v = 1;
                        if (this.s.c(wVar, jVar) == aVar) {
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
        jVar = new c00.j(this, cVar);
        Object obj22 = jVar.u;
        b71.a aVar2 = b71.a.r;
        i = jVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(a71.c cVar, Object obj) {
        c00.k kVar;
        int i;
        d00.t tVar;
        if (cVar instanceof c00.k) {
            kVar = (c00.k) cVar;
            int i2 = kVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = kVar.u;
                b71.a aVar = b71.a.r;
                i = kVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    d00.q qVar = (d00.q) obj;
                    k71.k.g(qVar, "<this>");
                    d00.v vVar = qVar.a;
                    d00.u uVar = (d00.u) in.rShadow.j((vVar == null || (tVar = vVar.c) == null) ? null : tVar.a, "Project is null", new com.github.rudroid.utilities.ui.emojipicker.e(21));
                    d00.r rVar = uVar.b;
                    l01.l0 l0Var = (l01.l0) in.rShadow.j(rVar != null ? rVar.c : null, "Default view is null", new com.github.rudroid.utilities.ui.emojipicker.e(22));
                    Iterable<d00.s> iterable = uVar.c.a;
                    if (iterable == null) {
                        iterable = x61.rShadow.r;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (d00.s sVar : iterable) {
                        l01.l0 h = sVar != null ? b31.b.h(sVar.c) : null;
                        if (h != null) {
                            arrayList.add(h);
                        }
                    }
                    l01.s0 s0Var = new l01.s0(l0Var, arrayList, com.google.common.util.concurrent.a.j(uVar.e));
                    kVar.v = 1;
                    if (this.s.c(s0Var, kVar) == aVar) {
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
        kVar = new c00.k(this, cVar);
        Object obj22 = kVar.u;
        b71.a aVar2 = b71.a.r;
        i = kVar.v;
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
        c00.l lVar;
        int i;
        d00.b0 b0Var;
        d00.g0 g0Var;
        List list;
        d00.d0 d0Var;
        List list2;
        if (cVar instanceof c00.l) {
            lVar = (c00.l) cVar;
            int i2 = lVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = lVar.u;
                b71.a aVar = b71.a.r;
                i = lVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    d00.f0Shadow f0Var = ((d00.z) obj).a;
                    l01.v vVar = null;
                    d00.e0 e0Var = (f0Var == null || (g0Var = f0Var.c) == null || (list = g0Var.a.a) == null || (d0Var = (d00.d0) x61.m.W(list)) == null || (list2 = d0Var.a.a) == null) ? null : (d00.e0) x61.m.W(list2);
                    List u = d5.u(e0Var != null ? e0Var.c : null);
                    if (e0Var != null && (b0Var = e0Var.b) != null) {
                        vVar = b31.b.g(b0Var.c, u);
                    }
                    if (vVar != null) {
                        lVar.v = 1;
                        if (this.s.c(vVar, lVar) == aVar) {
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
        lVar = new c00.l(this, cVar);
        Object obj22 = lVar.u;
        b71.a aVar2 = b71.a.r;
        i = lVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Iterable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(a71.c cVar, Object obj) {
        cn.c cVar2;
        int i;
        if (cVar instanceof cn.c) {
            cVar2 = (cn.c) cVar;
            int i2 = cVar2.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.v = i2 - Integer.MIN_VALUE;
                Object obj2 = cVar2.u;
                b71.a aVar = b71.a.r;
                i = cVar2.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    cn.l lVar = (cn.l) obj;
                    h01.q qVar = lVar.a;
                    h01.q a = h01.q.a(qVar, x61.m.l0(qVar.c, lVar.b));
                    cVar2.v = 1;
                    if (this.s.c(a, cVar2) == aVar) {
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
        cVar2 = new cn.c(this, cVar);
        Object obj22 = cVar2.u;
        b71.a aVar2 = b71.a.r;
        i = cVar2.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(a71.c cVar, Object obj) {
        cn.p pVar;
        int i;
        if (cVar instanceof cn.p) {
            pVar = (cn.p) cVar;
            int i2 = pVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = pVar.u;
                b71.a aVar = b71.a.r;
                i = pVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    cn.hShadow hVar = ((cn.i) obj).b;
                    cn.l lVar = new cn.l(hVar.a, (List) hVar.b);
                    pVar.v = 1;
                    if (this.s.c(lVar, pVar) == aVar) {
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
        pVar = new cn.p(this, cVar);
        Object obj22 = pVar.u;
        b71.a aVar2 = b71.a.r;
        i = pVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object i(a71.c cVar, Object obj) {
        com.github.service.wrapper.d dVar;
        int i;
        if (cVar instanceof com.github.service.wrapper.d) {
            dVar = (com.github.service.wrapper.d) cVar;
            int i2 = dVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = dVar.u;
                b71.a aVar = b71.a.r;
                i = dVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    Object obj3 = ((in.p0) obj).a;
                    dVar.v = 1;
                    if (this.s.c(obj3, dVar) == aVar) {
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
        dVar = new com.github.service.wrapper.d(this, cVar);
        Object obj22 = dVar.u;
        b71.a aVar2 = b71.a.r;
        i = dVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:469:0x0742, code lost:
    
        if (r14 != null) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x07fd, code lost:
    
        if (r14 != null) goto L490;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0940  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x094e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x09f8  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x0a7e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x0a8c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0124  */
    /* JADX WARN: Type inference failed for: r6v4, types: [x61.rShadow] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v7, types: [x61.rShadow] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        j0Shadow j0Var;
        int i;
        aq.b bVar;
        int i2;
        y6 y6Var;
        x6 x6Var;
        a7 a7Var;
        c7 c7Var;
        az0.b bVar2;
        int i3;
        az0.d dVar;
        int i4;
        az0.e eVar;
        int i5;
        ox0.x0 x0Var;
        az0.f fVar;
        int i6;
        j01.a aVar;
        b10.a aVar2;
        int i7;
        Object obj2;
        c10.k kVar;
        java.util.ArrayList r6;
        List<c10.h> list;
        c10.i iVar;
        c10.g gVar;
        c10.jShadow jVar;
        bc0.a aVar3;
        int i8;
        Object obj3;
        cc0.k kVar2;
        Object r62;
        List<cc0.h> list2;
        cc0.i iVar2;
        cc0.g gVar2;
        cc0.jShadow jVar2;
        bz0.d dVar2;
        int i9;
        w61.k kVar3;
        zu zuVar;
        bz0.f fVar2;
        int i10;
        bz0.g gVar3;
        int i12;
        w61.k kVar4;
        rg rgVar;
        bz0.h hVar;
        int i13;
        w61.k kVar5;
        rg rgVar2;
        bz0.i iVar3;
        int i14;
        w61.k kVar6;
        kw kwVar;
        bz0.jShadow jVar3;
        int i15;
        b2 b2Var;
        bz0.k kVar7;
        int i16;
        ContributionLevel contributionLevel;
        bz0.o oVar;
        int i17;
        g30 g30Var;
        bz0.p pVar;
        int i18;
        bz0.q qVar;
        int i19;
        bz0.r rVar;
        int i20;
        w61.k kVar8;
        sw swVar;
        bz0.s sVar;
        int i22;
        bz0.u uVar;
        int i23;
        com.github.service.wrapper.h hVar2;
        int i24;
        switch (this.r) {
            case 0:
                if (cVar instanceof j0Shadow) {
                    j0Var = (j0Shadow) cVar;
                    int i25 = j0Var.v;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        j0Var.v = i25 - Integer.MIN_VALUE;
                        Object obj4 = j0Var.u;
                        b71.a aVar4 = b71.a.r;
                        i = j0Var.v;
                        if (i != 0) {
                            sy.y.j(obj4);
                            v vVar = new v((String) ((s5.b) obj).d(h0Shadow.a));
                            j0Var.v = 1;
                            if (this.s.c(vVar, j0Var) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj4);
                        }
                        return w61.a0.a;
                    }
                }
                j0Var = new j0Shadow(this, cVar);
                Object obj42 = j0Var.u;
                b71.a aVar42 = b71.a.r;
                i = j0Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof aq.b) {
                    bVar = (aq.b) cVar;
                    int i26 = bVar.v;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        bVar.v = i26 - Integer.MIN_VALUE;
                        Object obj5 = bVar.u;
                        b71.a aVar5 = b71.a.r;
                        i2 = bVar.v;
                        if (i2 != 0) {
                            sy.y.j(obj5);
                            d7 d7Var = ((z6) obj).a;
                            List list3 = (d7Var == null || (y6Var = d7Var.b) == null || (x6Var = y6Var.b) == null || (a7Var = x6Var.b) == null || (c7Var = a7Var.a) == null) ? null : c7Var.b;
                            if (list3 == null) {
                                list3 = x61.rShadow.r;
                            }
                            ArrayList S = x61.m.S(list3);
                            ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                            int size = S.size();
                            int i27 = 0;
                            while (i27 < size) {
                                Object obj6 = S.get(i27);
                                i27++;
                                arrayList.add(t1.h(((b7) obj6).b));
                            }
                            bVar.v = 1;
                            if (this.s.c(arrayList, bVar) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj5);
                        }
                        return w61.a0.a;
                    }
                }
                bVar = new aq.b(this, cVar);
                Object obj52 = bVar.u;
                b71.a aVar52 = b71.a.r;
                i2 = bVar.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof az0.b) {
                    bVar2 = (az0.b) cVar;
                    int i28 = bVar2.v;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        bVar2.v = i28 - Integer.MIN_VALUE;
                        Object obj7 = bVar2.u;
                        b71.a aVar6 = b71.a.r;
                        i3 = bVar2.v;
                        if (i3 != 0) {
                            sy.y.j(obj7);
                            ox0.d dVar3 = (ox0.d) obj;
                            kx0.i iVar4 = new kx0.i(dVar3);
                            ox0.i0 i0Var = dVar3.a.b.a;
                            w61.k kVar9 = new w61.k(iVar4, new x01.i(i0Var.b, i0Var.a, false));
                            bVar2.v = 1;
                            if (this.s.c(kVar9, bVar2) == aVar6) {
                                return aVar6;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj7);
                        }
                        return w61.a0.a;
                    }
                }
                bVar2 = new az0.b(this, cVar);
                Object obj72 = bVar2.u;
                b71.a aVar62 = b71.a.r;
                i3 = bVar2.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof az0.d) {
                    dVar = (az0.d) cVar;
                    int i29 = dVar.v;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        dVar.v = i29 - Integer.MIN_VALUE;
                        Object obj8 = dVar.u;
                        b71.a aVar7 = b71.a.r;
                        i4 = dVar.v;
                        if (i4 != 0) {
                            sy.y.j(obj8);
                            ox0.d dVar4 = (ox0.d) obj;
                            kx0.i iVar5 = new kx0.i(dVar4);
                            ox0.i0 i0Var2 = dVar4.a.b.a;
                            w61.k kVar10 = new w61.k(iVar5, new x01.i(i0Var2.b, i0Var2.a, false));
                            dVar.v = 1;
                            if (this.s.c(kVar10, dVar) == aVar7) {
                                return aVar7;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj8);
                        }
                        return w61.a0.a;
                    }
                }
                dVar = new az0.d(this, cVar);
                Object obj82 = dVar.u;
                b71.a aVar72 = b71.a.r;
                i4 = dVar.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof az0.e) {
                    eVar = (az0.e) cVar;
                    int i30 = eVar.v;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        eVar.v = i30 - Integer.MIN_VALUE;
                        Object obj9 = eVar.u;
                        b71.a aVar8 = b71.a.r;
                        i5 = eVar.v;
                        if (i5 != 0) {
                            sy.y.j(obj9);
                            Iterable<ox0.v0> iterable = ((ox0.t0) obj).a.a.a;
                            if (iterable == null) {
                                iterable = x61.rShadow.r;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (ox0.v0 v0Var : iterable) {
                                j01.b bVar3 = null;
                                if (v0Var != null && (x0Var = v0Var.c.b) != null) {
                                    int i32 = v0Var.a;
                                    int i33 = v0Var.b;
                                    String str = x0Var.a;
                                    String str2 = x0Var.b;
                                    ox0.y0 y0Var = x0Var.c;
                                    bVar3 = new j01.b(i32, i33, m7.y.L(y0Var.d), str, str2, y0Var.c);
                                }
                                if (bVar3 != null) {
                                    arrayList2.add(bVar3);
                                }
                            }
                            eVar.v = 1;
                            if (this.s.c(arrayList2, eVar) == aVar8) {
                                return aVar8;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj9);
                        }
                        return w61.a0.a;
                    }
                }
                eVar = new az0.e(this, cVar);
                Object obj92 = eVar.u;
                b71.a aVar82 = b71.a.r;
                i5 = eVar.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof az0.f) {
                    fVar = (az0.f) cVar;
                    int i34 = fVar.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        fVar.v = i34 - Integer.MIN_VALUE;
                        Object obj10 = fVar.u;
                        b71.a aVar9 = b71.a.r;
                        i6 = fVar.v;
                        if (i6 != 0) {
                            sy.y.j(obj10);
                            ox0.c1 c1Var = (ox0.c1) obj;
                            k71.k.g(c1Var, "<this>");
                            ox0.g1 g1Var = c1Var.a;
                            int i35 = g1Var.a.a;
                            Iterable<ox0.e1> iterable2 = g1Var.b.a;
                            if (iterable2 == null) {
                                iterable2 = x61.rShadow.r;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (ox0.e1 e1Var : iterable2) {
                                if (e1Var != null) {
                                    et0.a aVar10 = e1Var.c;
                                    aVar = new j01.a(aVar10.c, aVar10.a, aVar10.b, aVar10.d, aVar10.e);
                                } else {
                                    aVar = null;
                                }
                                if (aVar != null) {
                                    arrayList3.add(aVar);
                                }
                            }
                            a3 a3Var = new a3(i35, arrayList3);
                            fVar.v = 1;
                            if (this.s.c(a3Var, fVar) == aVar9) {
                                return aVar9;
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj10);
                        }
                        return w61.a0.a;
                    }
                }
                fVar = new az0.f(this, cVar);
                Object obj102 = fVar.u;
                b71.a aVar92 = b71.a.r;
                i6 = fVar.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof b10.a) {
                    aVar2 = (b10.a) cVar;
                    int i36 = aVar2.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        aVar2.v = i36 - Integer.MIN_VALUE;
                        Object obj11 = aVar2.u;
                        b71.a aVar11 = b71.a.r;
                        i7 = aVar2.v;
                        if (i7 != 0) {
                            sy.y.j(obj11);
                            c10.m mVar = ((c10.e) obj).b;
                            if (mVar == null || (jVar = mVar.b) == null) {
                                String str3 = null;
                                c11.e eVar2 = c11.e.a;
                                if (mVar != null && (iVar = mVar.d) != null) {
                                    List list4 = iVar.b.a;
                                    if (list4 != null && (gVar = (c10.g) x61.m.W(list4)) != null) {
                                        str3 = gVar.b.a;
                                    }
                                    if (str3 != null) {
                                        obj2 = new c11.b(iVar.a, str3);
                                    }
                                    obj2 = eVar2;
                                } else if (mVar != null && (kVar = mVar.c) != null) {
                                    String str4 = kVar.a;
                                    c10.a aVar12 = kVar.b;
                                    String str5 = aVar12.a;
                                    c10.f fVar3 = aVar12.b;
                                    if (fVar3 == null || (list = fVar3.a) == null) {
                                        r6 = x61.rShadow.r;
                                    } else {
                                        r6 = new ArrayList();
                                        for (c10.h hVar3 : list) {
                                            String str6 = hVar3 != null ? hVar3.a : null;
                                            if (str6 != null) {
                                                r6.add(str6);
                                            }
                                        }
                                    }
                                    obj2 = new c11.d(str4, str5, r6);
                                    break;
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            } else {
                                obj2 = new c11.c(jVar.a);
                            }
                            aVar2.v = 1;
                            if (this.s.c(obj2, aVar2) == aVar11) {
                                return aVar11;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj11);
                        }
                        return w61.a0.a;
                    }
                }
                aVar2 = new b10.a(this, cVar);
                Object obj112 = aVar2.u;
                b71.a aVar112 = b71.a.r;
                i7 = aVar2.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof bc0.a) {
                    aVar3 = (bc0.a) cVar;
                    int i37 = aVar3.v;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        aVar3.v = i37 - Integer.MIN_VALUE;
                        Object obj12 = aVar3.u;
                        b71.a aVar13 = b71.a.r;
                        i8 = aVar3.v;
                        if (i8 != 0) {
                            sy.y.j(obj12);
                            cc0.m mVar2 = ((cc0.e) obj).b;
                            if (mVar2 == null || (jVar2 = mVar2.b) == null) {
                                String str7 = null;
                                c11.e eVar3 = c11.e.a;
                                if (mVar2 != null && (iVar2 = mVar2.d) != null) {
                                    List list5 = iVar2.b.a;
                                    if (list5 != null && (gVar2 = (cc0.g) x61.m.W(list5)) != null) {
                                        str7 = gVar2.b.a;
                                    }
                                    if (str7 != null) {
                                        obj3 = new c11.b(iVar2.a, str7);
                                    }
                                    obj3 = eVar3;
                                } else if (mVar2 != null && (kVar2 = mVar2.c) != null) {
                                    String str8 = kVar2.a;
                                    cc0.a aVar14 = kVar2.b;
                                    String str9 = aVar14.a;
                                    cc0.f fVar4 = aVar14.b;
                                    if (fVar4 == null || (list2 = fVar4.a) == null) {
                                        r62 = x61.rShadow.r;
                                    } else {
                                        r62 = new ArrayList();
                                        for (cc0.h hVar4 : list2) {
                                            String str10 = hVar4 != null ? hVar4.a : null;
                                            if (str10 != null) {
                                                r62.add(str10);
                                            }
                                        }
                                    }
                                    obj3 = new c11.d(str8, str9, r62);
                                    break;
                                } else {
                                    obj3 = null;
                                    break;
                                }
                            } else {
                                obj3 = new c11.c(jVar2.a);
                            }
                            aVar3.v = 1;
                            if (this.s.c(obj3, aVar3) == aVar13) {
                                return aVar13;
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
                aVar3 = new bc0.a(this, cVar);
                Object obj122 = aVar3.u;
                b71.a aVar132 = b71.a.r;
                i8 = aVar3.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof bz0.d) {
                    dVar2 = (bz0.d) cVar;
                    int i38 = dVar2.v;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        dVar2.v = i38 - Integer.MIN_VALUE;
                        Object obj13 = dVar2.u;
                        b71.a aVar15 = b71.a.r;
                        i9 = dVar2.v;
                        if (i9 != 0) {
                            sy.y.j(obj13);
                            yu yuVar = ((wu) obj).a;
                            if (yuVar == null || (zuVar = yuVar.c) == null) {
                                kVar3 = null;
                            } else {
                                vu vuVar = zuVar.a;
                                Iterable iterable3 = vuVar.b;
                                if (iterable3 == null) {
                                    iterable3 = x61.rShadow.r;
                                }
                                ArrayList S2 = x61.m.S(iterable3);
                                ArrayList arrayList4 = new ArrayList(x61.n.F(S2, 10));
                                int size2 = S2.size();
                                int i39 = 0;
                                while (i39 < size2) {
                                    Object obj14 = S2.get(i39);
                                    i39++;
                                    arrayList4.add(aa1.b.m(((xu) obj14).c));
                                }
                                ArrayList arrayList5 = new ArrayList();
                                int size3 = arrayList4.size();
                                int i40 = 0;
                                while (i40 < size3) {
                                    Object obj15 = arrayList4.get(i40);
                                    i40++;
                                    if (!((l4) obj15).f) {
                                        arrayList5.add(obj15);
                                    }
                                }
                                av avVar = vuVar.a;
                                kVar3 = new w61.k(arrayList5, new x01.i(avVar.b, avVar.a, false));
                            }
                            if (kVar3 != null) {
                                dVar2.v = 1;
                                if (this.s.c(kVar3, dVar2) == aVar15) {
                                    return aVar15;
                                }
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
                dVar2 = new bz0.d(this, cVar);
                Object obj132 = dVar2.u;
                b71.a aVar152 = b71.a.r;
                i9 = dVar2.v;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof bz0.f) {
                    fVar2 = (bz0.f) cVar;
                    int i42 = fVar2.v;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        fVar2.v = i42 - Integer.MIN_VALUE;
                        Object obj16 = fVar2.u;
                        b71.a aVar16 = b71.a.r;
                        i10 = fVar2.v;
                        if (i10 != 0) {
                            sy.y.j(obj16);
                            cd cdVar = ((bd) obj).a;
                            yz0.d5 d5Var = new yz0.d5(cdVar != null ? cdVar.a : "", (cdVar != null ? cdVar.b : null) == l40.t);
                            fVar2.v = 1;
                            if (this.s.c(d5Var, fVar2) == aVar16) {
                                return aVar16;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj16);
                        }
                        return w61.a0.a;
                    }
                }
                fVar2 = new bz0.f(this, cVar);
                Object obj162 = fVar2.u;
                b71.a aVar162 = b71.a.r;
                i10 = fVar2.v;
                if (i10 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof bz0.g) {
                    gVar3 = (bz0.g) cVar;
                    int i43 = gVar3.v;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        gVar3.v = i43 - Integer.MIN_VALUE;
                        Object obj17 = gVar3.u;
                        b71.a aVar17 = b71.a.r;
                        i12 = gVar3.v;
                        if (i12 != 0) {
                            sy.y.j(obj17);
                            qg qgVar = ((lg) obj).a;
                            if (qgVar == null || (rgVar = qgVar.c) == null) {
                                kVar4 = null;
                            } else {
                                mg mgVar = rgVar.b;
                                Iterable iterable4 = mgVar.b;
                                if (iterable4 == null) {
                                    iterable4 = x61.rShadow.r;
                                }
                                ArrayList S3 = x61.m.S(iterable4);
                                ArrayList arrayList6 = new ArrayList(x61.n.F(S3, 10));
                                int size4 = S3.size();
                                int i44 = 0;
                                while (i44 < size4) {
                                    Object obj18 = S3.get(i44);
                                    i44++;
                                    arrayList6.add(aa1.b.m(((pg) obj18).c));
                                }
                                sg sgVar = mgVar.a;
                                kVar4 = new w61.k(arrayList6, new x01.i(sgVar.b, sgVar.a, false));
                            }
                            if (kVar4 != null) {
                                gVar3.v = 1;
                                if (this.s.c(kVar4, gVar3) == aVar17) {
                                    return aVar17;
                                }
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj17);
                        }
                        return w61.a0.a;
                    }
                }
                gVar3 = new bz0.g(this, cVar);
                Object obj172 = gVar3.u;
                b71.a aVar172 = b71.a.r;
                i12 = gVar3.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof bz0.h) {
                    hVar = (bz0.h) cVar;
                    int i45 = hVar.v;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        hVar.v = i45 - Integer.MIN_VALUE;
                        Object obj19 = hVar.u;
                        b71.a aVar18 = b71.a.r;
                        i13 = hVar.v;
                        if (i13 != 0) {
                            sy.y.j(obj19);
                            qg qgVar2 = ((lg) obj).a;
                            if (qgVar2 == null || (rgVar2 = qgVar2.c) == null) {
                                kVar5 = null;
                            } else {
                                ng ngVar = rgVar2.a;
                                Iterable iterable5 = ngVar.b;
                                if (iterable5 == null) {
                                    iterable5 = x61.rShadow.r;
                                }
                                ArrayList S4 = x61.m.S(iterable5);
                                ArrayList arrayList7 = new ArrayList(x61.n.F(S4, 10));
                                int size5 = S4.size();
                                int i46 = 0;
                                while (i46 < size5) {
                                    Object obj20 = S4.get(i46);
                                    i46++;
                                    arrayList7.add(aa1.b.m(((og) obj20).c));
                                }
                                tg tgVar = ngVar.a;
                                kVar5 = new w61.k(arrayList7, new x01.i(tgVar.b, tgVar.a, false));
                            }
                            if (kVar5 != null) {
                                hVar.v = 1;
                                if (this.s.c(kVar5, hVar) == aVar18) {
                                    return aVar18;
                                }
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj19);
                        }
                        return w61.a0.a;
                    }
                }
                hVar = new bz0.h(this, cVar);
                Object obj192 = hVar.u;
                b71.a aVar182 = b71.a.r;
                i13 = hVar.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof bz0.i) {
                    iVar3 = (bz0.i) cVar;
                    int i47 = iVar3.v;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        iVar3.v = i47 - Integer.MIN_VALUE;
                        Object obj21 = iVar3.u;
                        b71.a aVar19 = b71.a.r;
                        i14 = iVar3.v;
                        if (i14 != 0) {
                            sy.y.j(obj21);
                            jw jwVar = ((hw) obj).a;
                            if (jwVar == null || (kwVar = jwVar.c) == null) {
                                kVar6 = null;
                            } else {
                                mw mwVar = kwVar.a;
                                Iterable iterable6 = mwVar.b;
                                if (iterable6 == null) {
                                    iterable6 = x61.rShadow.r;
                                }
                                ArrayList S5 = x61.m.S(iterable6);
                                ArrayList arrayList8 = new ArrayList(x61.n.F(S5, 10));
                                int size6 = S5.size();
                                int i48 = 0;
                                while (i48 < size6) {
                                    Object obj22 = S5.get(i48);
                                    i48++;
                                    arrayList8.add(aa1.b.m(((iw) obj22).c));
                                }
                                lw lwVar = mwVar.a;
                                kVar6 = new w61.k(arrayList8, new x01.i(lwVar.b, lwVar.a, false));
                            }
                            if (kVar6 != null) {
                                iVar3.v = 1;
                                if (this.s.c(kVar6, iVar3) == aVar19) {
                                    return aVar19;
                                }
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj21);
                        }
                        return w61.a0.a;
                    }
                }
                iVar3 = new bz0.i(this, cVar);
                Object obj212 = iVar3.u;
                b71.a aVar192 = b71.a.r;
                i14 = iVar3.v;
                if (i14 != 0) {
                }
                return w61.a0.a;
            case 13:
                if (cVar instanceof bz0.j) {
                    jVar3 = (bz0.j) cVar;
                    int i49 = jVar3.v;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        jVar3.v = i49 - Integer.MIN_VALUE;
                        Object obj23 = jVar3.u;
                        b71.a aVar20 = b71.a.r;
                        i15 = jVar3.v;
                        if (i15 != 0) {
                            sy.y.j(obj23);
                            rf0 rf0Var = ((qf0) obj).a;
                            if (rf0Var != null) {
                                String str11 = rf0Var.b;
                                Avatar L = m7.y.L(rf0Var.e);
                                String str12 = rf0Var.c;
                                String str13 = rf0Var.d;
                                if (str13 == null) {
                                    str13 = "";
                                }
                                b2Var = new b2(str11, L, str12, str13, false, false, 112);
                            } else {
                                b2Var = null;
                            }
                            if (b2Var != null) {
                                jVar3.v = 1;
                                if (this.s.c(b2Var, jVar3) == aVar20) {
                                    return aVar20;
                                }
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj23);
                        }
                        return w61.a0.a;
                    }
                }
                jVar3 = new bz0.j(this, cVar);
                Object obj232 = jVar3.u;
                b71.a aVar202 = b71.a.r;
                i15 = jVar3.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof bz0.k) {
                    kVar7 = (bz0.k) cVar;
                    int i50 = kVar7.v;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        kVar7.v = i50 - Integer.MIN_VALUE;
                        Object obj24 = kVar7.u;
                        b71.a aVar21 = b71.a.r;
                        i16 = kVar7.v;
                        if (i16 != 0) {
                            sy.y.j(obj24);
                            ve0 ve0Var = (ve0) obj;
                            k71.k.g(ve0Var, "<this>");
                            ArrayList arrayList9 = ve0Var.a.a.a.a;
                            ArrayList arrayList10 = new ArrayList(x61.n.F(arrayList9, 10));
                            int size7 = arrayList9.size();
                            int i52 = 0;
                            while (i52 < size7) {
                                Object obj25 = arrayList9.get(i52);
                                i52++;
                                ArrayList arrayList11 = ((xe0) obj25).a;
                                ArrayList arrayList12 = new ArrayList(x61.n.F(arrayList11, 10));
                                int size8 = arrayList11.size();
                                int i53 = 0;
                                while (i53 < size8) {
                                    Object obj26 = arrayList11.get(i53);
                                    i53++;
                                    int ordinal = ((te0) obj26).a.ordinal();
                                    if (ordinal == 0) {
                                        contributionLevel = ContributionLevel.FIRST_QUARTILE;
                                    } else if (ordinal == 1) {
                                        contributionLevel = ContributionLevel.FOURTH_QUARTILE;
                                    } else if (ordinal == 2) {
                                        contributionLevel = ContributionLevel.NONE;
                                    } else if (ordinal == 3) {
                                        contributionLevel = ContributionLevel.SECOND_QUARTILE;
                                    } else if (ordinal == 4) {
                                        contributionLevel = ContributionLevel.THIRD_QUARTILE;
                                    } else {
                                        if (ordinal != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        contributionLevel = ContributionLevel.UNKNOWN__;
                                    }
                                    arrayList12.add(contributionLevel);
                                }
                                arrayList10.add(arrayList12);
                            }
                            d8 d8Var = new d8(arrayList10);
                            kVar7.v = 1;
                            if (this.s.c(d8Var, kVar7) == aVar21) {
                                return aVar21;
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj24);
                        }
                        return w61.a0.a;
                    }
                }
                kVar7 = new bz0.k(this, cVar);
                Object obj242 = kVar7.u;
                b71.a aVar212 = b71.a.r;
                i16 = kVar7.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 15:
                if (cVar instanceof bz0.o) {
                    oVar = (bz0.o) cVar;
                    int i54 = oVar.v;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        oVar.v = i54 - Integer.MIN_VALUE;
                        Object obj27 = oVar.u;
                        b71.a aVar22 = b71.a.r;
                        i17 = oVar.v;
                        if (i17 != 0) {
                            sy.y.j(obj27);
                            e30 e30Var = (e30) obj;
                            Iterable<f30> iterable7 = e30Var.a.c;
                            if (iterable7 == null) {
                                iterable7 = x61.rShadow.r;
                            }
                            ArrayList arrayList13 = new ArrayList();
                            for (f30 f30Var : iterable7) {
                                fw0.c1 c1Var2 = (f30Var == null || (g30Var = f30Var.b) == null) ? null : g30Var.c;
                                if (c1Var2 != null) {
                                    arrayList13.add(c1Var2);
                                }
                            }
                            ArrayList arrayList14 = new ArrayList(x61.n.F(arrayList13, 10));
                            int size9 = arrayList13.size();
                            int i55 = 0;
                            while (i55 < size9) {
                                Object obj28 = arrayList13.get(i55);
                                i55++;
                                arrayList14.add(aa1.b.m((fw0.c1) obj28));
                            }
                            h30 h30Var = e30Var.a.b;
                            w61.k kVar11 = new w61.k(arrayList14, new x01.i(h30Var.b, h30Var.a, false));
                            oVar.v = 1;
                            if (this.s.c(kVar11, oVar) == aVar22) {
                                return aVar22;
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj27);
                        }
                        return w61.a0.a;
                    }
                }
                oVar = new bz0.o(this, cVar);
                Object obj272 = oVar.u;
                b71.a aVar222 = b71.a.r;
                i17 = oVar.v;
                if (i17 != 0) {
                }
                return w61.a0.a;
            case 16:
                if (cVar instanceof bz0.p) {
                    pVar = (bz0.p) cVar;
                    int i56 = pVar.v;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        pVar.v = i56 - Integer.MIN_VALUE;
                        Object obj29 = pVar.u;
                        b71.a aVar23 = b71.a.r;
                        i18 = pVar.v;
                        if (i18 != 0) {
                            sy.y.j(obj29);
                            Boolean valueOf = Boolean.valueOf(((eg0) obj).a.a);
                            pVar.v = 1;
                            if (this.s.c(valueOf, pVar) == aVar23) {
                                return aVar23;
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj29);
                        }
                        return w61.a0.a;
                    }
                }
                pVar = new bz0.p(this, cVar);
                Object obj292 = pVar.u;
                b71.a aVar232 = b71.a.r;
                i18 = pVar.v;
                if (i18 != 0) {
                }
                return w61.a0.a;
            case 17:
                if (cVar instanceof bz0.q) {
                    qVar = (bz0.q) cVar;
                    int i57 = qVar.v;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        qVar.v = i57 - Integer.MIN_VALUE;
                        Object obj30 = qVar.u;
                        b71.a aVar24 = b71.a.r;
                        i19 = qVar.v;
                        if (i19 != 0) {
                            sy.y.j(obj30);
                            Boolean valueOf2 = Boolean.valueOf(((ig0) obj).a.a);
                            qVar.v = 1;
                            if (this.s.c(valueOf2, qVar) == aVar24) {
                                return aVar24;
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj30);
                        }
                        return w61.a0.a;
                    }
                }
                qVar = new bz0.q(this, cVar);
                Object obj302 = qVar.u;
                b71.a aVar242 = b71.a.r;
                i19 = qVar.v;
                if (i19 != 0) {
                }
                return w61.a0.a;
            case 18:
                if (cVar instanceof bz0.r) {
                    rVar = (bz0.r) cVar;
                    int i58 = rVar.v;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        rVar.v = i58 - Integer.MIN_VALUE;
                        Object obj31 = rVar.u;
                        b71.a aVar25 = b71.a.r;
                        i20 = rVar.v;
                        if (i20 != 0) {
                            sy.y.j(obj31);
                            rw rwVar = ((pw) obj).a;
                            if (rwVar == null || (swVar = rwVar.c) == null) {
                                kVar8 = null;
                            } else {
                                uw uwVar = swVar.a;
                                Iterable iterable8 = uwVar.b;
                                if (iterable8 == null) {
                                    iterable8 = x61.rShadow.r;
                                }
                                ArrayList S6 = x61.m.S(iterable8);
                                ArrayList arrayList15 = new ArrayList(x61.n.F(S6, 10));
                                int size10 = S6.size();
                                int i59 = 0;
                                while (i59 < size10) {
                                    Object obj32 = S6.get(i59);
                                    i59++;
                                    arrayList15.add(aa1.b.m(((qw) obj32).c));
                                }
                                tw twVar = uwVar.a;
                                kVar8 = new w61.k(arrayList15, new x01.i(twVar.b, twVar.a, false));
                            }
                            if (kVar8 != null) {
                                rVar.v = 1;
                                if (this.s.c(kVar8, rVar) == aVar25) {
                                    return aVar25;
                                }
                            }
                        } else {
                            if (i20 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj31);
                        }
                        return w61.a0.a;
                    }
                }
                rVar = new bz0.r(this, cVar);
                Object obj312 = rVar.u;
                b71.a aVar252 = b71.a.r;
                i20 = rVar.v;
                if (i20 != 0) {
                }
                return w61.a0.a;
            case 19:
                if (cVar instanceof bz0.s) {
                    sVar = (bz0.s) cVar;
                    int i60 = sVar.v;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        sVar.v = i60 - Integer.MIN_VALUE;
                        Object obj33 = sVar.u;
                        b71.a aVar26 = b71.a.r;
                        i22 = sVar.v;
                        w61.a0Shadow a0Var = w61.a0.a;
                        if (i22 != 0) {
                            sy.y.j(obj33);
                            sVar.v = 1;
                            if (this.s.c(a0Var, sVar) == aVar26) {
                                return aVar26;
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj33);
                        }
                        return a0Var;
                    }
                }
                sVar = new bz0.s(this, cVar);
                Object obj332 = sVar.u;
                b71.a aVar262 = b71.a.r;
                i22 = sVar.v;
                w61.a0Shadow a0Var2 = w61.a0.a;
                if (i22 != 0) {
                }
                return a0Var2;
            case 20:
                if (cVar instanceof bz0.u) {
                    uVar = (bz0.u) cVar;
                    int i62 = uVar.v;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        uVar.v = i62 - Integer.MIN_VALUE;
                        Object obj34 = uVar.u;
                        b71.a aVar27 = b71.a.r;
                        i23 = uVar.v;
                        w61.a0Shadow a0Var3 = w61.a0.a;
                        if (i23 != 0) {
                            sy.y.j(obj34);
                            uVar.v = 1;
                            if (this.s.c(a0Var3, uVar) == aVar27) {
                                return aVar27;
                            }
                        } else {
                            if (i23 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj34);
                        }
                        return a0Var3;
                    }
                }
                uVar = new bz0.u(this, cVar);
                Object obj342 = uVar.u;
                b71.a aVar272 = b71.a.r;
                i23 = uVar.v;
                w61.a0Shadow a0Var32 = w61.a0.a;
                if (i23 != 0) {
                }
                return a0Var32;
            case 21:
                return a(cVar, obj);
            case 22:
                return b(cVar, obj);
            case 23:
                return d(cVar, obj);
            case 24:
                return e(cVar, obj);
            case 25:
                return f(cVar, obj);
            case 26:
                return g(cVar, obj);
            case 27:
                return h(cVar, obj);
            case 28:
                return i(cVar, obj);
            default:
                if (cVar instanceof com.github.service.wrapper.h) {
                    hVar2 = (com.github.service.wrapper.h) cVar;
                    int i63 = hVar2.v;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        hVar2.v = i63 - Integer.MIN_VALUE;
                        Object obj35 = hVar2.u;
                        b71.a aVar28 = b71.a.r;
                        i24 = hVar2.v;
                        if (i24 != 0) {
                            sy.y.j(obj35);
                            Object obj36 = ((in.p0) obj).a;
                            hVar2.v = 1;
                            if (this.s.c(obj36, hVar2) == aVar28) {
                                return aVar28;
                            }
                        } else {
                            if (i24 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj35);
                        }
                        return w61.a0.a;
                    }
                }
                hVar2 = new com.github.service.wrapper.h(this, cVar);
                Object obj352 = hVar2.u;
                b71.a aVar282 = b71.a.r;
                i24 = hVar2.v;
                if (i24 != 0) {
                }
                return w61.a0.a;
        }
    }

    public k0(y71.jShadow jVar, o0 o0Var) {
        this.r = 0;
        this.s = jVar;
    }
}
