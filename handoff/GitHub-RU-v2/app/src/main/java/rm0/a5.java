package rm0;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.MergeCheckStatus;
import com.github.service.models.response.organizations.OrganizationNameAndAvatarUrl;
import com.github.service.models.response.type.MergeStateStatus;
import com.github.service.models.response.type.PullRequestMergeMethod;
import gn0.hn;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kc0.ac;
import kc0.al;
import kc0.an;
import kc0.bl;
import kc0.cc;
import kc0.dc;
import kc0.dn;
import kc0.e80;
import kc0.e90;
import kc0.ec;
import kc0.el;
import kc0.f90;
import kc0.fl;
import kc0.g90;
import kc0.iz;
import kc0.jz;
import kc0.kz;
import kc0.lz;
import kc0.m80;
import kc0.mc0;
import kc0.nc0;
import kc0.o80;
import kc0.od;
import kc0.p80;
import kc0.pc0;
import kc0.pd;
import kc0.q80;
import kc0.r80;
import kc0.sl;
import kc0.t80;
import kc0.tl;
import kc0.v80;
import kc0.vb;
import kc0.vo;
import kc0.w80;
import kc0.wb;
import kc0.xo;
import kc0.yb;
import kc0.zm;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a5Shadow implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ a5(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        a6 a6Var;
        int i;
        t80 t80Var;
        m80 m80Var;
        yz0.e2 e2Var;
        t80 t80Var2;
        t80 t80Var3;
        if (cVar instanceof a6) {
            a6Var = (a6) cVar;
            int i2 = a6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = a6Var.u;
                b71.a aVar = b71.a.r;
                i = a6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    o80 o80Var = (o80) obj;
                    k71.k.g(o80Var, "<this>");
                    v80 v80Var = o80Var.a;
                    String str = null;
                    w80 w80Var = (v80Var == null || (t80Var3 = v80Var.b) == null) ? null : t80Var3.c;
                    p80 p80Var = (v80Var == null || (t80Var2 = v80Var.b) == null) ? null : t80Var2.d;
                    List<r80> list = w80Var != null ? w80Var.a : null;
                    List<q80> list2 = x61.rShadow.r;
                    if (list == null) {
                        list = list2;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (r80 r80Var : list) {
                        uj0.d dVar = r80Var != null ? r80Var.c : null;
                        if (dVar != null) {
                            arrayList.add(dVar);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        uj0.d dVar2 = (uj0.d) obj3;
                        uj0.c cVar2 = dVar2.d;
                        boolean z = dVar2.c;
                        if (cVar2 != null) {
                            uj0.a aVar2 = cVar2.c;
                            if (aVar2 != null) {
                                e2Var = pl0.c.c(aVar2, z);
                            } else {
                                uj0.bShadow bVar = cVar2.b;
                                if (bVar != null) {
                                    e2Var = pl0.c.d(bVar, z, null);
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
                    List list3 = p80Var != null ? p80Var.a : null;
                    if (list3 != null) {
                        list2 = list3;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (q80 q80Var : list2) {
                        wi0.l lVar = q80Var != null ? q80Var.c : null;
                        if (lVar != null) {
                            arrayList3.add(lVar);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(x61.n.F(arrayList3, 10));
                    int size2 = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj4 = arrayList3.get(i4);
                        i4++;
                        arrayList4.add(pl0.c.e((wi0.l) obj4));
                    }
                    ArrayList l0 = x61.m.l0(arrayList4, arrayList2);
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList5 = new ArrayList();
                    int size3 = l0.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        Object obj5 = l0.get(i5);
                        i5++;
                        if (hashSet.add(((yz0.e2) obj5).a.x)) {
                            arrayList5.add(obj5);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    com.github.service.models.response.a aVar3 = new com.github.service.models.response.a((v80Var == null || (m80Var = v80Var.a) == null) ? "" : m80Var.b, (Avatar) null, (String) null, false, (String) null, 62);
                    if (v80Var != null && (t80Var = v80Var.b) != null) {
                        str = t80Var.b.b.c;
                    }
                    yz0.z7 z7Var = new yz0.z7(arrayList5, arrayList6, aVar3, str);
                    a6Var.v = 1;
                    if (this.s.c(z7Var, a6Var) == aVar) {
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
        a6Var = new a6(this, cVar);
        Object obj22 = a6Var.u;
        b71.a aVar4 = b71.a.r;
        i = a6Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b(a71.c cVar, Object obj) {
        f6 f6Var;
        int i;
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
                    tl tlVar = ((sl) obj).a.a;
                    n01.a aVar2 = new n01.a(false, tlVar != null && tlVar.a, false, false, false, false, false, false, false, 1021);
                    f6Var.v = 1;
                    if (this.s.c(aVar2, f6Var) == aVar) {
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
        b71.a aVar3 = b71.a.r;
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
    private final Object d(a71.c cVar, Object obj) {
        g6 g6Var;
        int i;
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
                    Iterable<xo> iterable = ((vo) obj).a.a.a;
                    if (iterable == null) {
                        iterable = x61.rShadow.r;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (xo xoVar : iterable) {
                        sh0.a aVar2 = xoVar != null ? xoVar.c : null;
                        if (aVar2 != null) {
                            arrayList.add(aVar2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        arrayList2.add(a.a.d((sh0.a) obj3));
                    }
                    g6Var.v = 1;
                    if (this.s.c(arrayList2, g6Var) == aVar) {
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
        g6Var = new g6(this, cVar);
        Object obj22 = g6Var.u;
        b71.a aVar3 = b71.a.r;
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
    private final Object e(a71.c cVar, Object obj) {
        h6 h6Var;
        int i;
        im0.j jVar;
        im0.h hVar;
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
                    im0.i iVar = ((im0.g) obj).a;
                    Boolean valueOf = Boolean.valueOf((iVar == null || (jVar = iVar.b) == null || (hVar = jVar.a) == null) ? false : hVar.a);
                    h6Var.v = 1;
                    if (this.s.c(valueOf, h6Var) == aVar) {
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
    private final Object f(a71.c cVar, Object obj) {
        i6 i6Var;
        int i;
        im0.b0 b0Var;
        im0.z zVar;
        if (cVar instanceof i6) {
            i6Var = (i6) cVar;
            int i2 = i6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = i6Var.u;
                b71.a aVar = b71.a.r;
                i = i6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    im0.a0Shadow a0Var = ((im0.y) obj).a;
                    Boolean valueOf = Boolean.valueOf((a0Var == null || (b0Var = a0Var.b) == null || (zVar = b0Var.a) == null) ? false : zVar.a);
                    i6Var.v = 1;
                    if (this.s.c(valueOf, i6Var) == aVar) {
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
        i6Var = new i6(this, cVar);
        Object obj22 = i6Var.u;
        b71.a aVar2 = b71.a.r;
        i = i6Var.v;
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
        j6 j6Var;
        int i;
        im0.h0Shadow h0Var;
        im0.f0 f0Var;
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
                    im0.g0 g0Var = ((im0.e0) obj).a;
                    Boolean valueOf = Boolean.valueOf((g0Var == null || (h0Var = g0Var.b) == null || (f0Var = h0Var.a) == null) ? false : f0Var.a);
                    j6Var.v = 1;
                    if (this.s.c(valueOf, j6Var) == aVar) {
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(a71.c cVar, Object obj) {
        k6 k6Var;
        int i;
        im0.n0Shadow n0Var;
        im0.l0 l0Var;
        if (cVar instanceof k6) {
            k6Var = (k6) cVar;
            int i2 = k6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = k6Var.u;
                b71.a aVar = b71.a.r;
                i = k6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    im0.m0 m0Var = ((im0.k0) obj).a;
                    Boolean valueOf = Boolean.valueOf((m0Var == null || (n0Var = m0Var.b) == null || (l0Var = n0Var.a) == null) ? false : l0Var.a);
                    k6Var.v = 1;
                    if (this.s.c(valueOf, k6Var) == aVar) {
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
        k6Var = new k6(this, cVar);
        Object obj22 = k6Var.u;
        b71.a aVar2 = b71.a.r;
        i = k6Var.v;
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
        l6 l6Var;
        int i;
        im0.t0 t0Var;
        im0.r0 r0Var;
        if (cVar instanceof l6) {
            l6Var = (l6) cVar;
            int i2 = l6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = l6Var.u;
                b71.a aVar = b71.a.r;
                i = l6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    im0.s0Shadow s0Var = ((im0.q0) obj).a;
                    Boolean valueOf = Boolean.valueOf((s0Var == null || (t0Var = s0Var.b) == null || (r0Var = t0Var.b) == null) ? false : r0Var.a);
                    l6Var.v = 1;
                    if (this.s.c(valueOf, l6Var) == aVar) {
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
        l6Var = new l6(this, cVar);
        Object obj22 = l6Var.u;
        b71.a aVar2 = b71.a.r;
        i = l6Var.v;
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
        m6 m6Var;
        int i;
        im0.v vVar;
        im0.tShadow tVar;
        if (cVar instanceof m6) {
            m6Var = (m6) cVar;
            int i2 = m6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = m6Var.u;
                b71.a aVar = b71.a.r;
                i = m6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    im0.u uVar = ((im0.s) obj).a;
                    Boolean valueOf = Boolean.valueOf((uVar == null || (vVar = uVar.b) == null || (tVar = vVar.a) == null) ? false : tVar.b);
                    m6Var.v = 1;
                    if (this.s.c(valueOf, m6Var) == aVar) {
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
        m6Var = new m6(this, cVar);
        Object obj22 = m6Var.u;
        b71.a aVar2 = b71.a.r;
        i = m6Var.v;
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
        n6 n6Var;
        int i;
        im0.p pVar;
        im0.n nVar;
        if (cVar instanceof n6) {
            n6Var = (n6) cVar;
            int i2 = n6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = n6Var.u;
                b71.a aVar = b71.a.r;
                i = n6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    im0.o oVar = ((im0.m) obj).a;
                    Boolean valueOf = Boolean.valueOf((oVar == null || (pVar = oVar.b) == null || (nVar = pVar.a) == null) ? false : nVar.a);
                    n6Var.v = 1;
                    if (this.s.c(valueOf, n6Var) == aVar) {
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
        n6Var = new n6(this, cVar);
        Object obj22 = n6Var.u;
        b71.a aVar2 = b71.a.r;
        i = n6Var.v;
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
        o6 o6Var;
        int i;
        im0.z0 z0Var;
        im0.x0 x0Var;
        if (cVar instanceof o6) {
            o6Var = (o6) cVar;
            int i2 = o6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = o6Var.u;
                b71.a aVar = b71.a.r;
                i = o6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    im0.y0 y0Var = ((im0.w0) obj).a;
                    Boolean valueOf = Boolean.valueOf((y0Var == null || (z0Var = y0Var.b) == null || (x0Var = z0Var.b) == null) ? false : x0Var.a);
                    o6Var.v = 1;
                    if (this.s.c(valueOf, o6Var) == aVar) {
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
        o6Var = new o6(this, cVar);
        Object obj22 = o6Var.u;
        b71.a aVar2 = b71.a.r;
        i = o6Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x099d  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x0a54  */
    /* JADX WARN: Removed duplicated region for block: B:726:0x0a62  */
    /* JADX WARN: Type inference failed for: r1v125, types: [m01.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        z4 z4Var;
        int i;
        b5 b5Var;
        int i2;
        c5 c5Var;
        int i3;
        e5 e5Var;
        int i4;
        kz kzVar;
        m5 m5Var;
        int i5;
        ml0.n nVar;
        ml0.o oVar;
        ml0.m mVar;
        p5 p5Var;
        int i6;
        IssueOrPullRequestState issueOrPullRequestState;
        kc0.y4 y4Var;
        kc0.y4 y4Var2;
        q5 q5Var;
        int i7;
        kc0.q9 q9Var;
        kc0.q9 q9Var2;
        kc0.l9 l9Var;
        r5 r5Var;
        int i8;
        h01.f fVar;
        yb ybVar;
        s5 s5Var;
        int i9;
        String str;
        yz0.s7 w5Var;
        ac acVar;
        PullRequestMergeMethod pullRequestMergeMethod;
        ec ecVar;
        ri0.a aVar;
        ec ecVar2;
        ec ecVar3;
        ec ecVar4;
        ri0.a aVar2;
        t5 t5Var;
        int i10;
        wl0.a aVar3;
        kc0.d4 d4Var;
        List list;
        kc0.d4 d4Var2;
        List list2;
        kc0.z3 z3Var;
        u5 u5Var;
        int i12;
        MergeStateStatus mergeStateStatus;
        bl blVar;
        el elVar;
        v5 v5Var;
        int i13;
        pi0.c cVar2;
        pi0.d dVar;
        x5 x5Var;
        int i14;
        pi0.j jVar;
        ri0.p8 p8Var;
        List list3;
        ri0.n8 n8Var;
        y5 y5Var;
        int i15;
        z5 z5Var;
        int i16;
        c6 c6Var;
        int i17;
        d6 d6Var;
        int i18;
        e6 e6Var;
        int i19;
        p6 p6Var;
        int i20;
        switch (this.r) {
            case 0:
                if (cVar instanceof z4) {
                    z4Var = (z4) cVar;
                    int i22 = z4Var.v;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        z4Var.v = i22 - Integer.MIN_VALUE;
                        Object obj2 = z4Var.u;
                        b71.a aVar4 = b71.a.r;
                        i = z4Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            pd pdVar = ((od) obj).a;
                            if (pdVar == null) {
                                throw new ApiFailure(ApiFailureType.NOT_FOUND, "Invalid Organisation login", null, null, null, null, null, 124);
                            }
                            sd0.s sVar = pdVar.c;
                            OrganizationNameAndAvatarUrl organizationNameAndAvatarUrl = new OrganizationNameAndAvatarUrl(sVar.b, sVar.c, sVar.d);
                            z4Var.v = 1;
                            if (this.s.c(organizationNameAndAvatarUrl, z4Var) == aVar4) {
                                return aVar4;
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
                z4Var = new z4(this, cVar);
                Object obj22 = z4Var.u;
                b71.a aVar42 = b71.a.r;
                i = z4Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof b5) {
                    b5Var = (b5) cVar;
                    int i23 = b5Var.v;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        b5Var.v = i23 - Integer.MIN_VALUE;
                        Object obj3 = b5Var.u;
                        b71.a aVar5 = b71.a.r;
                        i2 = b5Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            zm zmVar = (zm) obj;
                            dn dnVar = zmVar.a;
                            List<an> list4 = dnVar != null ? dnVar.a.b : null;
                            if (list4 == null) {
                                list4 = x61.rShadow.r;
                            }
                            ArrayList arrayList = new ArrayList();
                            for (an anVar : list4) {
                                ci0.q qVar = anVar != null ? anVar.c : null;
                                if (qVar != null) {
                                    arrayList.add(qVar);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
                            int size = arrayList.size();
                            int i24 = 0;
                            while (i24 < size) {
                                Object obj4 = arrayList.get(i24);
                                i24++;
                                arrayList2.add(w8.s.C((ci0.q) obj4));
                            }
                            dn dnVar2 = zmVar.a;
                            k01.a aVar6 = new k01.a(arrayList2, new x01.i(dnVar2 != null ? dnVar2.a.a.b : null, dnVar2 != null && dnVar2.a.a.a, false));
                            b5Var.v = 1;
                            if (this.s.c(aVar6, b5Var) == aVar5) {
                                return aVar5;
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
                b5Var = new b5(this, cVar);
                Object obj32 = b5Var.u;
                b71.a aVar52 = b71.a.r;
                i2 = b5Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof c5) {
                    c5Var = (c5) cVar;
                    int i25 = c5Var.v;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        c5Var.v = i25 - Integer.MIN_VALUE;
                        Object obj5 = c5Var.u;
                        b71.a aVar7 = b71.a.r;
                        i3 = c5Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj5);
                            mc0 mc0Var = (mc0) obj;
                            Iterable<nc0> iterable = mc0Var.a.a.b;
                            if (iterable == null) {
                                iterable = x61.rShadow.r;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (nc0 nc0Var : iterable) {
                                ci0.q qVar2 = nc0Var != null ? nc0Var.c : null;
                                if (qVar2 != null) {
                                    arrayList3.add(qVar2);
                                }
                            }
                            ArrayList arrayList4 = new ArrayList(x61.n.F(arrayList3, 10));
                            int size2 = arrayList3.size();
                            int i26 = 0;
                            while (i26 < size2) {
                                Object obj6 = arrayList3.get(i26);
                                i26++;
                                arrayList4.add(w8.s.C((ci0.q) obj6));
                            }
                            pc0 pc0Var = mc0Var.a.a.a;
                            k01.a aVar8 = new k01.a(arrayList4, new x01.i(pc0Var.b, pc0Var.a, false));
                            c5Var.v = 1;
                            if (this.s.c(aVar8, c5Var) == aVar7) {
                                return aVar7;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj5);
                        }
                        return w61.a0.a;
                    }
                }
                c5Var = new c5(this, cVar);
                Object obj52 = c5Var.u;
                b71.a aVar72 = b71.a.r;
                i3 = c5Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof e5) {
                    e5Var = (e5) cVar;
                    int i27 = e5Var.v;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        e5Var.v = i27 - Integer.MIN_VALUE;
                        Object obj7 = e5Var.u;
                        b71.a aVar9 = b71.a.r;
                        i4 = e5Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj7);
                            iz izVar = (iz) obj;
                            Iterable<jz> iterable2 = izVar.a.c;
                            if (iterable2 == null) {
                                iterable2 = x61.rShadow.r;
                            }
                            ArrayList arrayList5 = new ArrayList();
                            for (jz jzVar : iterable2) {
                                ci0.q qVar3 = (jzVar == null || (kzVar = jzVar.b) == null) ? null : kzVar.c;
                                if (qVar3 != null) {
                                    arrayList5.add(qVar3);
                                }
                            }
                            ArrayList arrayList6 = new ArrayList(x61.n.F(arrayList5, 10));
                            int size3 = arrayList5.size();
                            int i28 = 0;
                            while (i28 < size3) {
                                Object obj8 = arrayList5.get(i28);
                                i28++;
                                arrayList6.add(w8.s.C((ci0.q) obj8));
                            }
                            lz lzVar = izVar.a.b;
                            w61.k kVar = new w61.k(arrayList6, new x01.i(lzVar.b, lzVar.a, false));
                            e5Var.v = 1;
                            if (this.s.c(kVar, e5Var) == aVar9) {
                                return aVar9;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj7);
                        }
                        return w61.a0.a;
                    }
                }
                e5Var = new e5(this, cVar);
                Object obj72 = e5Var.u;
                b71.a aVar92 = b71.a.r;
                i4 = e5Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof m5) {
                    m5Var = (m5) cVar;
                    int i29 = m5Var.v;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        m5Var.v = i29 - Integer.MIN_VALUE;
                        Object obj9 = m5Var.u;
                        b71.a aVar10 = b71.a.r;
                        i5 = m5Var.v;
                        if (i5 != 0) {
                            sy.y.j(obj9);
                            ml0.j jVar2 = (ml0.j) obj;
                            k71.k.g(jVar2, "<this>");
                            ml0.k kVar2 = jVar2.a;
                            i01.bShadow T = (kVar2 == null || (nVar = kVar2.a) == null || (oVar = nVar.b) == null || (mVar = oVar.d) == null) ? null : k41.b.T(mVar.c);
                            if (T != null) {
                                m5Var.v = 1;
                                if (this.s.c(T, m5Var) == aVar10) {
                                    return aVar10;
                                }
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
                m5Var = new m5(this, cVar);
                Object obj92 = m5Var.u;
                b71.a aVar102 = b71.a.r;
                i5 = m5Var.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof p5) {
                    p5Var = (p5) cVar;
                    int i30 = p5Var.v;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        p5Var.v = i30 - Integer.MIN_VALUE;
                        Object obj10 = p5Var.u;
                        b71.a aVar11 = b71.a.r;
                        i6 = p5Var.v;
                        if (i6 != 0) {
                            sy.y.j(obj10);
                            kc0.x4 x4Var = (kc0.x4) obj;
                            k71.k.g(x4Var, "<this>");
                            kc0.v4 v4Var = x4Var.a;
                            hn hnVar = (v4Var == null || (y4Var2 = v4Var.a) == null) ? null : y4Var2.b;
                            int i32 = hnVar == null ? -1 : pl0.p.a[hnVar.ordinal()];
                            if (i32 == -1) {
                                issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
                            } else if (i32 == 1) {
                                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_OPEN;
                            } else if (i32 == 2) {
                                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
                            } else if (i32 == 3) {
                                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
                            } else {
                                if (i32 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
                            }
                            boolean z = false;
                            if (v4Var != null && (y4Var = v4Var.a) != null && y4Var.c) {
                                z = true;
                            }
                            yz0.a8 a8Var = new yz0.a8(issueOrPullRequestState, z);
                            p5Var.v = 1;
                            if (this.s.c(a8Var, p5Var) == aVar11) {
                                return aVar11;
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
                p5Var = new p5(this, cVar);
                Object obj102 = p5Var.u;
                b71.a aVar112 = b71.a.r;
                i6 = p5Var.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof q5) {
                    q5Var = (q5) cVar;
                    int i33 = q5Var.v;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        q5Var.v = i33 - Integer.MIN_VALUE;
                        Object obj11 = q5Var.u;
                        b71.a aVar12 = b71.a.r;
                        i7 = q5Var.v;
                        if (i7 != 0) {
                            sy.y.j(obj11);
                            kc0.o9 o9Var = (kc0.o9) obj;
                            k71.k.g(o9Var, "<this>");
                            kc0.p9 p9Var = o9Var.a;
                            yz0.v5 v5Var2 = new yz0.v5(new com.github.service.models.response.a((p9Var == null || (l9Var = p9Var.a) == null) ? "" : l9Var.b.b, (Avatar) null, (String) null, false, (String) null, 62));
                            boolean z2 = false;
                            boolean z3 = (p9Var == null || (q9Var2 = p9Var.b) == null) ? false : q9Var2.b;
                            if (p9Var != null && (q9Var = p9Var.b) != null) {
                                z2 = q9Var.c;
                            }
                            yz0.c1 c1Var = new yz0.c1(v5Var2, z3, z2);
                            q5Var.v = 1;
                            if (this.s.c(c1Var, q5Var) == aVar12) {
                                return aVar12;
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
                q5Var = new q5(this, cVar);
                Object obj112 = q5Var.u;
                b71.a aVar122 = b71.a.r;
                i7 = q5Var.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof r5) {
                    r5Var = (r5) cVar;
                    int i34 = r5Var.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        r5Var.v = i34 - Integer.MIN_VALUE;
                        Object obj12 = r5Var.u;
                        b71.a aVar13 = b71.a.r;
                        i8 = r5Var.v;
                        if (i8 != 0) {
                            sy.y.j(obj12);
                            wb wbVar = ((vb) obj).a;
                            if (wbVar == null || (ybVar = wbVar.a) == null) {
                                fVar = null;
                            } else {
                                ri0.m3 m3Var = ybVar.b.c;
                                ri0.l3Shadow l3Var = m3Var.c;
                                fVar = new h01.f(l3Var.c.b, m3Var.b, l3Var.b);
                            }
                            if (fVar != null) {
                                r5Var.v = 1;
                                if (this.s.c(fVar, r5Var) == aVar13) {
                                    return aVar13;
                                }
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
                r5Var = new r5(this, cVar);
                Object obj122 = r5Var.u;
                b71.a aVar132 = b71.a.r;
                i8 = r5Var.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof s5) {
                    s5Var = (s5) cVar;
                    int i35 = s5Var.v;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        s5Var.v = i35 - Integer.MIN_VALUE;
                        Object obj13 = s5Var.u;
                        b71.a aVar14 = b71.a.r;
                        i9 = s5Var.v;
                        if (i9 != 0) {
                            sy.y.j(obj13);
                            cc ccVar = (cc) obj;
                            k71.k.g(ccVar, "<this>");
                            dc dcVar = ccVar.a;
                            PullRequestMergeMethod w = (dcVar == null || (ecVar4 = dcVar.b) == null || (aVar2 = ecVar4.c.d) == null) ? null : sy.f0.w(aVar2.a);
                            int i36 = w == null ? -1 : pl0.d.a[w.ordinal()];
                            str = "";
                            if (i36 == -1 || i36 == 1 || i36 == 2) {
                                if (dcVar != null && (acVar = dcVar.a) != null) {
                                    str = acVar.b;
                                }
                                w5Var = new yz0.w5(new com.github.service.models.response.a(str, (Avatar) null, (String) null, false, (String) null, 62));
                            } else if (i36 == 3) {
                                ac acVar2 = dcVar.a;
                                w5Var = new yz0.y5(new com.github.service.models.response.a(acVar2 != null ? acVar2.b : "", (Avatar) null, (String) null, false, (String) null, 62));
                            } else {
                                if (i36 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ac acVar3 = dcVar.a;
                                w5Var = new yz0.x5(new com.github.service.models.response.a(acVar3 != null ? acVar3.b : "", (Avatar) null, (String) null, false, (String) null, 62));
                            }
                            boolean z4 = false;
                            boolean z5 = (dcVar == null || (ecVar3 = dcVar.b) == null || !ecVar3.c.c) ? false : true;
                            if (dcVar != null && (ecVar2 = dcVar.b) != null && ecVar2.c.b) {
                                z4 = true;
                            }
                            if (dcVar == null || (ecVar = dcVar.b) == null || (aVar = ecVar.c.d) == null || (pullRequestMergeMethod = sy.f0.w(aVar.a)) == null) {
                                pullRequestMergeMethod = PullRequestMergeMethod.UNKNOWN__;
                            }
                            yz0.e1 e1Var = new yz0.e1(w5Var, z5, z4, pullRequestMergeMethod);
                            s5Var.v = 1;
                            if (this.s.c(e1Var, s5Var) == aVar14) {
                                return aVar14;
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
                s5Var = new s5(this, cVar);
                Object obj132 = s5Var.u;
                b71.a aVar142 = b71.a.r;
                i9 = s5Var.v;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof t5) {
                    t5Var = (t5) cVar;
                    int i37 = t5Var.v;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        t5Var.v = i37 - Integer.MIN_VALUE;
                        Object obj14 = t5Var.u;
                        b71.a aVar15 = b71.a.r;
                        i10 = t5Var.v;
                        if (i10 != 0) {
                            sy.y.j(obj14);
                            kc0.x3 x3Var = (kc0.x3) obj;
                            kc0.b4 b4Var = x3Var.a;
                            kc0.h4 h4Var = (b4Var == null || (d4Var2 = b4Var.c) == null || (list2 = d4Var2.b.a) == null || (z3Var = (kc0.z3) x61.m.f0(list2)) == null) ? null : z3Var.a.b;
                            kc0.b4 b4Var2 = x3Var.a;
                            List<kc0.y3> S = (b4Var2 == null || (d4Var = b4Var2.c) == null || (list = d4Var.a.b) == null) ? null : x61.m.S(list);
                            List<kc0.a4> list5 = x61.rShadow.r;
                            if (S == null) {
                                S = list5;
                            }
                            ArrayList arrayList7 = new ArrayList(x61.n.F(S, 10));
                            for (kc0.y3 y3Var : S) {
                                k71.k.g(y3Var, "requiredStatusCheck");
                                String str2 = y3Var.a;
                                String str3 = y3Var.b;
                                MergeCheckStatus e = k21.f.e(sy.q.o(y3Var.c));
                                String str4 = y3Var.d;
                                arrayList7.add(new wl0.a(str2, str3, null, e, "", "", str4 == null ? "" : str4, Boolean.TRUE, null));
                            }
                            if (h4Var != null) {
                                List list6 = h4Var.b.b;
                                List S2 = list6 != null ? x61.m.S(list6) : null;
                                if (S2 != null) {
                                    list5 = S2;
                                }
                                ArrayList arrayList8 = new ArrayList();
                                for (kc0.a4 a4Var : list5) {
                                    kc0.c4 c4Var = a4Var.c;
                                    if (c4Var != null) {
                                        String str5 = c4Var.a;
                                        String str6 = c4Var.c;
                                        kc0.s3 s3Var = c4Var.g;
                                        kc0.j4 j4Var = s3Var.a;
                                        String str7 = j4Var != null ? j4Var.a.a : null;
                                        gn0.l2 l2Var = c4Var.b;
                                        if (l2Var == null) {
                                            l2Var = gn0.l2.t;
                                        }
                                        MergeCheckStatus f = k21.f.f(l2Var);
                                        String str8 = c4Var.e;
                                        kc0.r3Shadow r3Var = s3Var.b;
                                        String str9 = r3Var != null ? r3Var.a : "";
                                        String str10 = c4Var.d;
                                        aVar3 = new wl0.a(str5, str6, str7, f, str8, str9, str10 == null ? "" : str10, Boolean.valueOf(c4Var.h), Integer.valueOf(c4Var.f));
                                    } else {
                                        kc0.e4 e4Var = a4Var.b;
                                        if (e4Var != null) {
                                            String str11 = e4Var.a;
                                            String str12 = e4Var.b;
                                            MergeCheckStatus e2 = k21.f.e(sy.q.o(e4Var.c));
                                            String str13 = e4Var.f;
                                            String str14 = str13 == null ? "" : str13;
                                            String str15 = e4Var.d;
                                            String str16 = str15 == null ? "" : str15;
                                            String str17 = e4Var.e;
                                            aVar3 = new wl0.a(str11, str12, null, e2, str14, str16, str17 == null ? "" : str17, Boolean.valueOf(e4Var.g), null);
                                        } else {
                                            aVar3 = null;
                                        }
                                    }
                                    if (aVar3 != null) {
                                        arrayList8.add(aVar3);
                                    }
                                }
                                list5 = arrayList8;
                            }
                            ArrayList l0 = x61.m.l0(list5, arrayList7);
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList9 = new ArrayList();
                            int size4 = l0.size();
                            int i38 = 0;
                            while (i38 < size4) {
                                Object obj15 = l0.get(i38);
                                i38++;
                                if (hashSet.add(((wl0.a) obj15).b)) {
                                    arrayList9.add(obj15);
                                }
                            }
                            h01.d dVar2 = new h01.d(arrayList9, new x01.i(h4Var != null ? h4Var.b.a.b : null, h4Var != null ? h4Var.b.a.a : false, false));
                            t5Var.v = 1;
                            if (this.s.c(dVar2, t5Var) == aVar15) {
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
                t5Var = new t5(this, cVar);
                Object obj142 = t5Var.u;
                b71.a aVar152 = b71.a.r;
                i10 = t5Var.v;
                if (i10 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof u5) {
                    u5Var = (u5) cVar;
                    int i39 = u5Var.v;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        u5Var.v = i39 - Integer.MIN_VALUE;
                        Object obj16 = u5Var.u;
                        b71.a aVar16 = b71.a.r;
                        i12 = u5Var.v;
                        if (i12 != 0) {
                            sy.y.j(obj16);
                            fl flVar = ((al) obj).a;
                            if (flVar == null || (blVar = flVar.b) == null || (elVar = blVar.b) == null || (mergeStateStatus = sy.c0.o(elVar.c)) == null) {
                                mergeStateStatus = MergeStateStatus.UNKNOWN;
                            }
                            u5Var.v = 1;
                            if (this.s.c(mergeStateStatus, u5Var) == aVar16) {
                                return aVar16;
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
                u5Var = new u5(this, cVar);
                Object obj162 = u5Var.u;
                b71.a aVar162 = b71.a.r;
                i12 = u5Var.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof v5) {
                    v5Var = (v5) cVar;
                    int i40 = v5Var.v;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        v5Var.v = i40 - Integer.MIN_VALUE;
                        Object obj17 = v5Var.u;
                        b71.a aVar17 = b71.a.r;
                        i13 = v5Var.v;
                        if (i13 != 0) {
                            sy.y.j(obj17);
                            pi0.e eVar = ((pi0.b) obj).a;
                            String str18 = (eVar == null || (cVar2 = eVar.b) == null || (dVar = cVar2.b) == null) ? null : dVar.a;
                            if (str18 != null) {
                                v5Var.v = 1;
                                if (this.s.c(str18, v5Var) == aVar17) {
                                    return aVar17;
                                }
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
                v5Var = new v5(this, cVar);
                Object obj172 = v5Var.u;
                b71.a aVar172 = b71.a.r;
                i13 = v5Var.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof x5) {
                    x5Var = (x5) cVar;
                    int i42 = x5Var.v;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        x5Var.v = i42 - Integer.MIN_VALUE;
                        Object obj18 = x5Var.u;
                        b71.a aVar18 = b71.a.r;
                        i14 = x5Var.v;
                        if (i14 != 0) {
                            sy.y.j(obj18);
                            pi0.i iVar = ((pi0.h) obj).a;
                            yz0.q8 q8Var = null;
                            if (iVar != null && (jVar = iVar.c) != null) {
                                ri0.r8 r8Var = jVar.b;
                                boolean z6 = r8Var.b;
                                ri0.o8 o8Var = r8Var.d;
                                int i43 = (o8Var == null || (list3 = o8Var.a) == null || (n8Var = (ri0.n8) x61.m.f0(list3)) == null) ? 0 : n8Var.b.a;
                                ri0.q8 q8Var2 = r8Var.c;
                                if (q8Var2 != null && (p8Var = q8Var2.b) != null) {
                                    q8Var = new yz0.q8(p8Var.b, p8Var.c, p8Var.d);
                                }
                                q8Var = new m01.b(z6, i43, q8Var);
                            }
                            if (q8Var != null) {
                                x5Var.v = 1;
                                if (this.s.c(q8Var, x5Var) == aVar18) {
                                    return aVar18;
                                }
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
                x5Var = new x5(this, cVar);
                Object obj182 = x5Var.u;
                b71.a aVar182 = b71.a.r;
                i14 = x5Var.v;
                if (i14 != 0) {
                }
                return w61.a0.a;
            case 13:
                if (cVar instanceof y5) {
                    y5Var = (y5) cVar;
                    int i44 = y5Var.v;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        y5Var.v = i44 - Integer.MIN_VALUE;
                        Object obj19 = y5Var.u;
                        b71.a aVar19 = b71.a.r;
                        i15 = y5Var.v;
                        if (i15 != 0) {
                            sy.y.j(obj19);
                            yz0.y7 i45 = k21.f.i((e80) obj);
                            y5Var.v = 1;
                            if (this.s.c(i45, y5Var) == aVar19) {
                                return aVar19;
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
                y5Var = new y5(this, cVar);
                Object obj192 = y5Var.u;
                b71.a aVar192 = b71.a.r;
                i15 = y5Var.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof z5) {
                    z5Var = (z5) cVar;
                    int i46 = z5Var.v;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        z5Var.v = i46 - Integer.MIN_VALUE;
                        Object obj20 = z5Var.u;
                        b71.a aVar20 = b71.a.r;
                        i16 = z5Var.v;
                        if (i16 != 0) {
                            sy.y.j(obj20);
                            yz0.y7 i47 = k21.f.i((e80) obj);
                            z5Var.v = 1;
                            if (this.s.c(i47, z5Var) == aVar20) {
                                return aVar20;
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
                z5Var = new z5(this, cVar);
                Object obj202 = z5Var.u;
                b71.a aVar202 = b71.a.r;
                i16 = z5Var.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 15:
                return a(cVar, obj);
            case 16:
                if (cVar instanceof c6) {
                    c6Var = (c6) cVar;
                    int i48 = c6Var.v;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        c6Var.v = i48 - Integer.MIN_VALUE;
                        Object obj21 = c6Var.u;
                        b71.a aVar21 = b71.a.r;
                        i17 = c6Var.v;
                        w61.a0 a0Var = w61.a0.a;
                        if (i17 != 0) {
                            sy.y.j(obj21);
                            c6Var.v = 1;
                            if (this.s.c(a0Var, c6Var) == aVar21) {
                                return aVar21;
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj21);
                        }
                        return a0Var;
                    }
                }
                c6Var = new c6(this, cVar);
                Object obj212 = c6Var.u;
                b71.a aVar212 = b71.a.r;
                i17 = c6Var.v;
                w61.a0 a0Var2 = w61.a0.a;
                if (i17 != 0) {
                }
                return a0Var2;
            case 17:
                if (cVar instanceof d6) {
                    d6Var = (d6) cVar;
                    int i49 = d6Var.v;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        d6Var.v = i49 - Integer.MIN_VALUE;
                        Object obj23 = d6Var.u;
                        b71.a aVar22 = b71.a.r;
                        i18 = d6Var.v;
                        w61.a0 a0Var3 = w61.a0.a;
                        if (i18 != 0) {
                            sy.y.j(obj23);
                            d6Var.v = 1;
                            if (this.s.c(a0Var3, d6Var) == aVar22) {
                                return aVar22;
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj23);
                        }
                        return a0Var3;
                    }
                }
                d6Var = new d6(this, cVar);
                Object obj232 = d6Var.u;
                b71.a aVar222 = b71.a.r;
                i18 = d6Var.v;
                w61.a0 a0Var32 = w61.a0.a;
                if (i18 != 0) {
                }
                return a0Var32;
            case 18:
                if (cVar instanceof e6) {
                    e6Var = (e6) cVar;
                    int i50 = e6Var.v;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        e6Var.v = i50 - Integer.MIN_VALUE;
                        Object obj24 = e6Var.u;
                        b71.a aVar23 = b71.a.r;
                        i19 = e6Var.v;
                        if (i19 != 0) {
                            sy.y.j(obj24);
                            im0.c cVar3 = ((im0.b) obj).a.a;
                            n01.a aVar24 = new n01.a(cVar3 != null ? cVar3.a : false, cVar3 != null ? cVar3.b : false, cVar3 != null ? cVar3.d : false, cVar3 != null ? cVar3.c : false, cVar3 != null ? cVar3.e : false, cVar3 != null ? cVar3.f : false, cVar3 != null ? cVar3.g : false, cVar3 != null ? cVar3.h : false, cVar3 != null ? cVar3.i : false, 512);
                            e6Var.v = 1;
                            if (this.s.c(aVar24, e6Var) == aVar23) {
                                return aVar23;
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
                e6Var = new e6(this, cVar);
                Object obj242 = e6Var.u;
                b71.a aVar232 = b71.a.r;
                i19 = e6Var.v;
                if (i19 != 0) {
                }
                return w61.a0.a;
            case 19:
                return b(cVar, obj);
            case 20:
                return d(cVar, obj);
            case 21:
                return e(cVar, obj);
            case 22:
                return f(cVar, obj);
            case 23:
                return g(cVar, obj);
            case 24:
                return h(cVar, obj);
            case 25:
                return i(cVar, obj);
            case 26:
                return j(cVar, obj);
            case 27:
                return k(cVar, obj);
            case 28:
                return n(cVar, obj);
            default:
                if (cVar instanceof p6) {
                    p6Var = (p6) cVar;
                    int i52 = p6Var.v;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        p6Var.v = i52 - Integer.MIN_VALUE;
                        Object obj25 = p6Var.u;
                        b71.a aVar25 = b71.a.r;
                        i20 = p6Var.v;
                        if (i20 != 0) {
                            sy.y.j(obj25);
                            g90 g90Var = ((e90) obj).a;
                            List list7 = g90Var != null ? g90Var.a : null;
                            if (list7 == null) {
                                list7 = x61.rShadow.r;
                            }
                            ArrayList arrayList10 = new ArrayList(x61.n.F(list7, 10));
                            Iterator it = list7.iterator();
                            while (it.hasNext()) {
                                arrayList10.add(((f90) it.next()).c);
                            }
                            ArrayList arrayList11 = new ArrayList(x61.n.F(arrayList10, 10));
                            int size5 = arrayList10.size();
                            int i53 = 0;
                            while (i53 < size5) {
                                Object obj26 = arrayList10.get(i53);
                                i53++;
                                arrayList11.add(a.a.d((sh0.a) obj26));
                            }
                            p6Var.v = 1;
                            if (this.s.c(arrayList11, p6Var) == aVar25) {
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
                p6Var = new p6(this, cVar);
                Object obj252 = p6Var.u;
                b71.a aVar252 = b71.a.r;
                i20 = p6Var.v;
                if (i20 != 0) {
                }
                return w61.a0.a;
        }
    }
}
