package t00;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.TimelineItem;
import com.github.service.models.response.issueorpullrequest.PullRequestMergeAction;
import com.github.service.models.response.issueorpullrequest.PullRequestMergeMethodStatus;
import com.github.service.models.response.issueorpullrequest.PullRequestMergeRequirementsState;
import com.github.service.models.response.organizations.OrganizationNameAndAvatarUrl;
import com.github.service.models.response.type.PullRequestMergeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jo.a50;
import jo.ad;
import jo.ak;
import jo.bd;
import jo.cd;
import jo.cn;
import jo.dg;
import jo.eg;
import jo.en;
import jo.fn;
import jo.ge0;
import jo.gn;
import jo.hg;
import jo.ig;
import jo.jn;
import jo.jq;
import jo.kn;
import jo.kq;
import jo.lj0;
import jo.ln;
import jo.me0;
import jo.mj0;
import jo.na0;
import jo.ne0;
import jo.nj0;
import jo.nn;
import jo.nq;
import jo.pa0;
import jo.pj0;
import jo.pm;
import jo.pn;
import jo.qa0;
import jo.qj0;
import jo.qm;
import jo.qn;
import jo.ra0;
import jo.re0;
import jo.rj0;
import jo.rm;
import jo.rn;
import jo.sm;
import jo.tm;
import jo.tn;
import jo.uj0;
import jo.um;
import jo.vj;
import jo.vj0;
import jo.vm;
import jo.wm;
import jo.wn;
import jo.x40;
import jo.xj;
import jo.xj0;
import jo.xn;
import jo.y40;
import jo.yj;
import jo.yn;
import jo.z40;
import jo.zj;
import jo.zm;
import jo.zn;
import m10.kk;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z2 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ z2(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        j4 j4Var;
        int i;
        ne0 ne0Var;
        List list;
        me0 me0Var;
        jv.d dVar;
        if (cVar instanceof j4) {
            j4Var = (j4) cVar;
            int i2 = j4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = j4Var.u;
                b71.a aVar = b71.a.r;
                i = j4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    re0 re0Var = ((ge0) obj).a;
                    yz0.z6 j = (re0Var == null || (ne0Var = re0Var.a) == null || (list = ne0Var.o.a) == null || (me0Var = (me0) x61.m.W(list)) == null || (dVar = me0Var.c) == null) ? null : sy.w.j(dVar);
                    if (j != null) {
                        j4Var.v = 1;
                        if (this.s.c(j, j4Var) == aVar) {
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
        j4Var = new j4(this, cVar);
        Object obj22 = j4Var.u;
        b71.a aVar2 = b71.a.r;
        i = j4Var.v;
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
        k4 k4Var;
        int i;
        cd cdVar;
        if (cVar instanceof k4) {
            k4Var = (k4) cVar;
            int i2 = k4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = k4Var.u;
                b71.a aVar = b71.a.r;
                i = k4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    bd bdVar = ((ad) obj).a;
                    String str = (bdVar == null || (cdVar = bdVar.a) == null) ? null : cdVar.a;
                    k4Var.v = 1;
                    if (this.s.c(str, k4Var) == aVar) {
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
        k4Var = new k4(this, cVar);
        Object obj22 = k4Var.u;
        b71.a aVar2 = b71.a.r;
        i = k4Var.v;
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
        l4 l4Var;
        int i;
        if (cVar instanceof l4) {
            l4Var = (l4) cVar;
            int i2 = l4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = l4Var.u;
                b71.a aVar = b71.a.r;
                i = l4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    eg egVar = ((dg) obj).a;
                    if (egVar == null) {
                        throw new ApiFailure(ApiFailureType.NOT_FOUND, "Invalid Organisation login", (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 124);
                    }
                    OrganizationNameAndAvatarUrl P = m7.y.P(egVar.c);
                    l4Var.v = 1;
                    if (this.s.c(P, l4Var) == aVar) {
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
        l4Var = new l4(this, cVar);
        Object obj22 = l4Var.u;
        b71.a aVar2 = b71.a.r;
        i = l4Var.v;
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
        m4 m4Var;
        int i;
        if (cVar instanceof m4) {
            m4Var = (m4) cVar;
            int i2 = m4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = m4Var.u;
                b71.a aVar = b71.a.r;
                i = m4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    jq jqVar = (jq) obj;
                    nq nqVar = jqVar.a;
                    List<kq> list = nqVar != null ? nqVar.a.b : null;
                    if (list == null) {
                        list = x61.rShadow.r;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (kq kqVar : list) {
                        tu.s sVar = kqVar != null ? kqVar.c : null;
                        if (sVar != null) {
                            arrayList.add(sVar);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        arrayList2.add(m7.y.O((tu.s) obj3));
                    }
                    nq nqVar2 = jqVar.a;
                    k01.a aVar2 = new k01.a(arrayList2, new x01.i(nqVar2 != null ? nqVar2.a.a.b : null, nqVar2 != null && nqVar2.a.a.a, false));
                    m4Var.v = 1;
                    if (this.s.c(aVar2, m4Var) == aVar) {
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
        m4Var = new m4(this, cVar);
        Object obj22 = m4Var.u;
        b71.a aVar3 = b71.a.r;
        i = m4Var.v;
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
        n4 n4Var;
        int i;
        if (cVar instanceof n4) {
            n4Var = (n4) cVar;
            int i2 = n4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = n4Var.u;
                b71.a aVar = b71.a.r;
                i = n4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    uj0 uj0Var = (uj0) obj;
                    x61.rShadow<vj0> rVar = uj0Var.a.a.b;
                    if (rVar == null) {
                        rVar = x61.rShadow.r;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (vj0 vj0Var : rVar) {
                        tu.s sVar = vj0Var != null ? vj0Var.c : null;
                        if (sVar != null) {
                            arrayList.add(sVar);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        arrayList2.add(m7.y.O((tu.s) obj3));
                    }
                    xj0 xj0Var = uj0Var.a.a.a;
                    k01.a aVar2 = new k01.a(arrayList2, new x01.i(xj0Var.b, xj0Var.a, false));
                    n4Var.v = 1;
                    if (this.s.c(aVar2, n4Var) == aVar) {
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
        n4Var = new n4(this, cVar);
        Object obj22 = n4Var.u;
        b71.a aVar3 = b71.a.r;
        i = n4Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(a71.c cVar, Object obj) {
        o4 o4Var;
        int i;
        z40 z40Var;
        if (cVar instanceof o4) {
            o4Var = (o4) cVar;
            int i2 = o4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = o4Var.u;
                b71.a aVar = b71.a.r;
                i = o4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    x40 x40Var = (x40) obj;
                    x61.rShadow<y40> rVar = x40Var.a.c;
                    if (rVar == null) {
                        rVar = x61.rShadow.r;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (y40 y40Var : rVar) {
                        tu.s sVar = (y40Var == null || (z40Var = y40Var.b) == null) ? null : z40Var.c;
                        if (sVar != null) {
                            arrayList.add(sVar);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        arrayList2.add(m7.y.O((tu.s) obj3));
                    }
                    a50 a50Var = x40Var.a.b;
                    w61.k kVar = new w61.k(arrayList2, new x01.i(a50Var.b, a50Var.a, false));
                    o4Var.v = 1;
                    if (this.s.c(kVar, o4Var) == aVar) {
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
        o4Var = new o4(this, cVar);
        Object obj22 = o4Var.u;
        b71.a aVar2 = b71.a.r;
        i = o4Var.v;
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
        p4 p4Var;
        int i;
        if (cVar instanceof p4) {
            p4Var = (p4) cVar;
            int i2 = p4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = p4Var.u;
                b71.a aVar = b71.a.r;
                i = p4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    rz.a aVar2 = ((rz.c) obj).a;
                    Object j = in.rShadow.j(aVar2 != null ? aVar2.a : null, "Invalid project or item id", u1.t);
                    p4Var.v = 1;
                    if (this.s.c(j, p4Var) == aVar) {
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
        p4Var = new p4(this, cVar);
        Object obj22 = p4Var.u;
        b71.a aVar3 = b71.a.r;
        i = p4Var.v;
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
        q4 q4Var;
        int i;
        if (cVar instanceof q4) {
            q4Var = (q4) cVar;
            int i2 = q4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = q4Var.u;
                b71.a aVar = b71.a.r;
                i = q4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    rz.f1Shadow f1Var = ((rz.d1) obj).a;
                    Object j = in.rShadow.j(f1Var != null ? f1Var.a : null, "Invalid project, item id, fieldId or value", u1.u);
                    q4Var.v = 1;
                    if (this.s.c(j, q4Var) == aVar) {
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
        q4Var = new q4(this, cVar);
        Object obj22 = q4Var.u;
        b71.a aVar2 = b71.a.r;
        i = q4Var.v;
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
        s4 s4Var;
        int i;
        if (cVar instanceof s4) {
            s4Var = (s4) cVar;
            int i2 = s4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = s4Var.u;
                b71.a aVar = b71.a.r;
                i = s4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    rz.f1Shadow f1Var = ((rz.d1) obj).a;
                    Object j = in.rShadow.j(f1Var != null ? f1Var.a : null, "Invalid project, item id, fieldId or value", u1.v);
                    s4Var.v = 1;
                    if (this.s.c(j, s4Var) == aVar) {
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
        s4Var = new s4(this, cVar);
        Object obj22 = s4Var.u;
        b71.a aVar2 = b71.a.r;
        i = s4Var.v;
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
        v4 v4Var;
        int i;
        if (cVar instanceof v4) {
            v4Var = (v4) cVar;
            int i2 = v4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = v4Var.u;
                b71.a aVar = b71.a.r;
                i = v4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    rz.f fVar = ((rz.h) obj).a;
                    Object j = in.rShadow.j(fVar != null ? fVar.a : null, "Invalid project, item id, fieldId or value", u1.w);
                    v4Var.v = 1;
                    if (this.s.c(j, v4Var) == aVar) {
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
        v4Var = new v4(this, cVar);
        Object obj22 = v4Var.u;
        b71.a aVar2 = b71.a.r;
        i = v4Var.v;
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
        w4 w4Var;
        int i;
        if (cVar instanceof w4) {
            w4Var = (w4) cVar;
            int i2 = w4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = w4Var.u;
                b71.a aVar = b71.a.r;
                i = w4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    rz.f fVar = ((rz.h) obj).a;
                    Object j = in.rShadow.j(fVar != null ? fVar.a : null, "Invalid project, item id, fieldId or value", u1.x);
                    w4Var.v = 1;
                    if (this.s.c(j, w4Var) == aVar) {
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
        w4Var = new w4(this, cVar);
        Object obj22 = w4Var.u;
        b71.a aVar2 = b71.a.r;
        i = w4Var.v;
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
        y4 y4Var;
        int i;
        if (cVar instanceof y4) {
            y4Var = (y4) cVar;
            int i2 = y4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = y4Var.u;
                b71.a aVar = b71.a.r;
                i = y4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    rz.q qVar = ((rz.p) obj).a;
                    Object j = in.rShadow.j(qVar != null ? qVar.a : null, "Invalid owner or repository name", u1.y);
                    y4Var.v = 1;
                    if (this.s.c(j, y4Var) == aVar) {
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
        y4Var = new y4(this, cVar);
        Object obj22 = y4Var.u;
        b71.a aVar2 = b71.a.r;
        i = y4Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0860  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x0972  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        h01.o r2 = null;
        y2 y2Var;
        int i;
        x61.rShadow rVar;
        mj0 mj0Var;
        pj0 pj0Var;
        Object obj2;
        int i2;
        Object obj3;
        b3 b3Var;
        int i3;
        f3 f3Var;
        int i4;
        j3 j3Var;
        int i5;
        List list;
        zx.u1 u1Var;
        zx.u1 u1Var2;
        o3 o3Var;
        int i6;
        zx.q1 q1Var;
        t3 t3Var;
        int i7;
        ArrayList arrayList;
        List<ly.r> list2;
        dw.m3 m3Var;
        String str;
        u3 u3Var;
        int i8;
        String str2;
        v3 v3Var;
        int i9;
        ArrayList arrayList2;
        List<dw.j7> list3;
        y3 y3Var;
        int i11;
        String str3;
        z3 z3Var;
        int i12;
        yj yjVar;
        vj vjVar;
        ak akVar;
        yj yjVar2;
        vj vjVar2;
        yj yjVar3;
        zj zjVar;
        c4 c4Var;
        int i13;
        ra0 ra0Var;
        na0 na0Var;
        qa0 qa0Var;
        ra0 ra0Var2;
        na0 na0Var2;
        d4 d4Var;
        int i14;
        x61.rShadow arrayList3;
        e4 e4Var;
        int i15;
        String str4;
        f4 f4Var;
        int i16;
        g4 g4Var;
        int i17;
        h4 h4Var;
        int i18;
        zn znVar;
        i4 i4Var;
        int i19;
        PullRequestState pullRequestState;
        tn tnVar;
        qn qnVar;
        tn tnVar2;
        nn nnVar;
        tn tnVar3;
        tn tnVar4;
        qn qnVar2;
        tn tnVar5;
        z4 z4Var;
        int i21;
        switch (this.r) {
            case 0:
                if (cVar instanceof y2) {
                    y2Var = (y2) cVar;
                    int i22 = y2Var.v;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        y2Var.v = i22 - Integer.MIN_VALUE;
                        Object obj4 = y2Var.u;
                        b71.a aVar = b71.a.r;
                        i = y2Var.v;
                        if (i != 0) {
                            sy.y.j(obj4);
                            qj0 qj0Var = ((lj0) obj).a;
                            if (qj0Var == null || (mj0Var = qj0Var.b) == null || (pj0Var = mj0Var.c) == null) {
                                rVar = null;
                            } else {
                                ArrayList arrayList4 = pj0Var.b;
                                int i23 = 10;
                                x61.rShadow arrayList5 = new ArrayList(x61.n.F(arrayList4, 10));
                                int size = arrayList4.size();
                                int i24 = 0;
                                while (i24 < size) {
                                    Object obj5 = arrayList4.get(i24);
                                    i24++;
                                    rj0 rj0Var = (rj0) obj5;
                                    k71.k.g(rj0Var, "<this>");
                                    h01.k kVar = PullRequestMergeAction.Companion;
                                    String str5 = rj0Var.c.r;
                                    kVar.getClass();
                                    Iterator it = PullRequestMergeAction.getEntries().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj2 = it.next();
                                            if (k71.k.b(((PullRequestMergeAction) obj2).getRawValue(), str5)) {
                                            }
                                        } else {
                                            obj2 = null;
                                        }
                                    }
                                    PullRequestMergeAction pullRequestMergeAction = (PullRequestMergeAction) obj2;
                                    if (pullRequestMergeAction == null) {
                                        pullRequestMergeAction = PullRequestMergeAction.UNKNOWN__;
                                    }
                                    h01.l lVar = PullRequestMergeMethodStatus.Companion;
                                    String str6 = rj0Var.a.r;
                                    lVar.getClass();
                                    PullRequestMergeMethodStatus a = h01.l.a(str6);
                                    ArrayList arrayList6 = rj0Var.b;
                                    ArrayList arrayList7 = new ArrayList(x61.n.F(arrayList6, i23));
                                    int size2 = arrayList6.size();
                                    int i25 = 0;
                                    while (i25 < size2) {
                                        Object obj6 = arrayList6.get(i25);
                                        int i26 = i25 + 1;
                                        nj0 nj0Var = (nj0) obj6;
                                        r01.n nVar = PullRequestMergeMethod.Companion;
                                        ArrayList arrayList8 = arrayList4;
                                        String str7 = nj0Var.b.r;
                                        nVar.getClass();
                                        Iterator it2 = PullRequestMergeMethod.getEntries().iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                obj3 = it2.next();
                                                i2 = i26;
                                                if (!k71.k.b(((PullRequestMergeMethod) obj3).getRawValue(), str7)) {
                                                    i26 = i2;
                                                }
                                            } else {
                                                i2 = i26;
                                                obj3 = null;
                                            }
                                        }
                                        PullRequestMergeMethod pullRequestMergeMethod = (PullRequestMergeMethod) obj3;
                                        if (pullRequestMergeMethod == null) {
                                            pullRequestMergeMethod = PullRequestMergeMethod.UNKNOWN__;
                                        }
                                        h01.l lVar2 = PullRequestMergeMethodStatus.Companion;
                                        String str8 = nj0Var.a.r;
                                        lVar2.getClass();
                                        arrayList7.add(new h01.b(pullRequestMergeMethod, h01.l.a(str8), nj0Var.c));
                                        arrayList4 = arrayList8;
                                        i25 = i2;
                                    }
                                    arrayList5.add(new h01.a(pullRequestMergeAction, a, arrayList7));
                                    i23 = 10;
                                }
                                rVar = arrayList5;
                            }
                            if (rVar == null) {
                                rVar = x61.rShadow.r;
                            }
                            y2Var.v = 1;
                            if (this.s.c(rVar, y2Var) == aVar) {
                                return aVar;
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
                y2Var = new y2(this, cVar);
                Object obj42 = y2Var.u;
                b71.a aVar2 = b71.a.r;
                i = y2Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof b3) {
                    b3Var = (b3) cVar;
                    int i27 = b3Var.v;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        b3Var.v = i27 - Integer.MIN_VALUE;
                        Object obj7 = b3Var.u;
                        b71.a aVar3 = b71.a.r;
                        i3 = b3Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj7);
                            List t = com.google.android.gms.internal.measurement.d5.t((zx.a0Shadow) obj);
                            b3Var.v = 1;
                            if (this.s.c(t, b3Var) == aVar3) {
                                return aVar3;
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
                b3Var = new b3(this, cVar);
                Object obj72 = b3Var.u;
                b71.a aVar32 = b71.a.r;
                i3 = b3Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof f3) {
                    f3Var = (f3) cVar;
                    int i28 = f3Var.v;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        f3Var.v = i28 - Integer.MIN_VALUE;
                        Object obj8 = f3Var.u;
                        b71.a aVar4 = b71.a.r;
                        i4 = f3Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj8);
                            List t2 = com.google.android.gms.internal.measurement.d5.t((zx.a0Shadow) obj);
                            f3Var.v = 1;
                            if (this.s.c(t2, f3Var) == aVar4) {
                                return aVar4;
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
                f3Var = new f3(this, cVar);
                Object obj82 = f3Var.u;
                b71.a aVar42 = b71.a.r;
                i4 = f3Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof j3) {
                    j3Var = (j3) cVar;
                    int i29 = j3Var.v;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        j3Var.v = i29 - Integer.MIN_VALUE;
                        Object obj9 = j3Var.u;
                        b71.a aVar5 = b71.a.r;
                        i5 = j3Var.v;
                        if (i5 != 0) {
                            sy.y.j(obj9);
                            zx.x1 x1Var = ((zx.t1) obj).a;
                            zx.w1Shadow w1Var = null;
                            if (((x1Var == null || (u1Var2 = x1Var.b) == null) ? null : u1Var2.b) != null) {
                                list = w8.s.f(x1Var.b.b.c.c);
                            } else {
                                if (x1Var != null && (u1Var = x1Var.b) != null) {
                                    w1Var = u1Var.c;
                                }
                                list = w1Var != null ? w8.s.e(x1Var.b.c.c).c : x61.rShadow.r;
                            }
                            j3Var.v = 1;
                            if (this.s.c(list, j3Var) == aVar5) {
                                return aVar5;
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
                j3Var = new j3(this, cVar);
                Object obj92 = j3Var.u;
                b71.a aVar52 = b71.a.r;
                i5 = j3Var.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof o3) {
                    o3Var = (o3) cVar;
                    int i31 = o3Var.v;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        o3Var.v = i31 - Integer.MIN_VALUE;
                        Object obj10 = o3Var.u;
                        b71.a aVar6 = b71.a.r;
                        i6 = o3Var.v;
                        if (i6 != 0) {
                            sy.y.j(obj10);
                            zx.p1 p1Var = ((zx.o1) obj).a;
                            if (p1Var != null && (q1Var = p1Var.c) != null) {
                                dw.e7 e7Var = q1Var.b;
                                h01.p e = sy.u.e(e7Var.c);
                                dw.q0 q0Var = e7Var.d.a;
                                r2 = new h01.o(e, sy.tShadow.e(e7Var.e), q0Var != null ? sy.s.f(q0Var) : null);
                            }
                            o3Var.v = 1;
                            if (this.s.c(r2, o3Var) == aVar6) {
                                return aVar6;
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
                o3Var = new o3(this, cVar);
                Object obj102 = o3Var.u;
                b71.a aVar62 = b71.a.r;
                i6 = o3Var.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof t3) {
                    t3Var = (t3) cVar;
                    int i32 = t3Var.v;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        t3Var.v = i32 - Integer.MIN_VALUE;
                        Object obj11 = t3Var.u;
                        b71.a aVar7 = b71.a.r;
                        i7 = t3Var.v;
                        if (i7 != 0) {
                            sy.y.j(obj11);
                            ly.q qVar = ((ly.o) obj).a;
                            String str9 = qVar != null ? qVar.a : "";
                            String str10 = qVar != null ? qVar.b : "";
                            String str11 = (qVar == null || (str = qVar.c) == null) ? "" : str;
                            com.github.service.models.response.a e2 = v8.l0.e(qVar != null ? qVar.d.c : null);
                            int i33 = qVar != null ? qVar.e.c : 0;
                            if (qVar == null || (list2 = qVar.e.b) == null) {
                                arrayList = null;
                            } else {
                                arrayList = new ArrayList();
                                for (ly.r rVar2 : list2) {
                                    p01.n G = ((rVar2 != null ? rVar2.c : null) == null || (m3Var = rVar2.b) == null) ? null : sy.n.G(new w61.k(m3Var, rVar2.c));
                                    if (G != null) {
                                        arrayList.add(G);
                                    }
                                }
                            }
                            if (arrayList == null) {
                                arrayList = x61.rShadow.r;
                            }
                            yz0.g1 g1Var = new yz0.g1(new yz0.p2(str9, str10, str11, i33, e2), new yz0.c4(arrayList, new x01.i(qVar != null ? qVar.e.a.b : null, qVar != null ? qVar.e.a.a : false, false)));
                            t3Var.v = 1;
                            if (this.s.c(g1Var, t3Var) == aVar7) {
                                return aVar7;
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
                t3Var = new t3(this, cVar);
                Object obj112 = t3Var.u;
                b71.a aVar72 = b71.a.r;
                i7 = t3Var.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof u3) {
                    u3Var = (u3) cVar;
                    int i34 = u3Var.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        u3Var.v = i34 - Integer.MIN_VALUE;
                        Object obj12 = u3Var.u;
                        b71.a aVar8 = b71.a.r;
                        i8 = u3Var.v;
                        if (i8 != 0) {
                            sy.y.j(obj12);
                            ly.l lVar3 = ((ly.k) obj).a;
                            String str12 = "";
                            String str13 = lVar3 != null ? lVar3.a : "";
                            String str14 = lVar3 != null ? lVar3.b : "";
                            String str15 = lVar3 != null ? lVar3.c : "";
                            if (lVar3 != null && (str2 = lVar3.d) != null) {
                                str12 = str2;
                            }
                            xz0.h hVar = new xz0.h(str13, str14, str15, str12);
                            u3Var.v = 1;
                            if (this.s.c(hVar, u3Var) == aVar8) {
                                return aVar8;
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
                u3Var = new u3(this, cVar);
                Object obj122 = u3Var.u;
                b71.a aVar82 = b71.a.r;
                i8 = u3Var.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof v3) {
                    v3Var = (v3) cVar;
                    int i35 = v3Var.v;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        v3Var.v = i35 - Integer.MIN_VALUE;
                        Object obj13 = v3Var.u;
                        b71.a aVar9 = b71.a.r;
                        i9 = v3Var.v;
                        if (i9 != 0) {
                            sy.y.j(obj13);
                            ig igVar = ((hg) obj).a;
                            if (igVar == null || (list3 = igVar.c.b.a) == null) {
                                arrayList2 = x61.rShadow.r;
                            } else {
                                arrayList2 = new ArrayList();
                                for (dw.j7 j7Var : list3) {
                                    yz0.e8 D = j7Var != null ? sy.d0Shadow.D(j7Var.c) : null;
                                    if (D != null) {
                                        arrayList2.add(D);
                                    }
                                }
                            }
                            v3Var.v = 1;
                            if (this.s.c(arrayList2, v3Var) == aVar9) {
                                return aVar9;
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
                v3Var = new v3(this, cVar);
                Object obj132 = v3Var.u;
                b71.a aVar92 = b71.a.r;
                i9 = v3Var.v;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof y3) {
                    y3Var = (y3) cVar;
                    int i36 = y3Var.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        y3Var.v = i36 - Integer.MIN_VALUE;
                        Object obj14 = y3Var.u;
                        b71.a aVar10 = b71.a.r;
                        i11 = y3Var.v;
                        if (i11 != 0) {
                            sy.y.j(obj14);
                            ly.y yVar = ((ly.w) obj).a;
                            ly.xShadow xVar = yVar != null ? yVar.a : null;
                            String str16 = "";
                            String str17 = xVar != null ? xVar.a : "";
                            String str18 = xVar != null ? xVar.b : "";
                            String str19 = xVar != null ? xVar.c : "";
                            if (xVar != null && (str3 = xVar.d) != null) {
                                str16 = str3;
                            }
                            xz0.h hVar2 = new xz0.h(str17, str18, str19, str16);
                            y3Var.v = 1;
                            if (this.s.c(hVar2, y3Var) == aVar10) {
                                return aVar10;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj14);
                        }
                        return w61.a0.a;
                    }
                }
                y3Var = new y3(this, cVar);
                Object obj142 = y3Var.u;
                b71.a aVar102 = b71.a.r;
                i11 = y3Var.v;
                if (i11 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof z3) {
                    z3Var = (z3) cVar;
                    int i37 = z3Var.v;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        z3Var.v = i37 - Integer.MIN_VALUE;
                        Object obj15 = z3Var.u;
                        b71.a aVar11 = b71.a.r;
                        i12 = z3Var.v;
                        if (i12 != 0) {
                            sy.y.j(obj15);
                            xj xjVar = (xj) obj;
                            kk kkVar = (xjVar == null || (yjVar3 = xjVar.a) == null || (zjVar = yjVar3.b) == null) ? null : zjVar.b;
                            int i38 = kkVar == null ? -1 : sy.v.a[kkVar.ordinal()];
                            TimelineItem.TimelineLockedEvent.Reason reason = i38 != 1 ? i38 != 2 ? i38 != 3 ? i38 != 4 ? TimelineItem.TimelineLockedEvent.Reason.UNKNOWN : TimelineItem.TimelineLockedEvent.Reason.RESOLVED : TimelineItem.TimelineLockedEvent.Reason.TOO_HEATED : TimelineItem.TimelineLockedEvent.Reason.SPAM : TimelineItem.TimelineLockedEvent.Reason.OFF_TOPIC;
                            String str20 = "";
                            String str21 = (xjVar == null || (yjVar2 = xjVar.a) == null || (vjVar2 = yjVar2.a) == null) ? "" : vjVar2.b;
                            if (xjVar != null && (yjVar = xjVar.a) != null && (vjVar = yjVar.a) != null && (akVar = vjVar.c) != null) {
                                str20 = akVar.a;
                            }
                            yz0.t6 t6Var = new yz0.t6(reason, new com.github.service.models.response.a(str21, (Avatar) null, str20, false, (String) null, 58));
                            z3Var.v = 1;
                            if (this.s.c(t6Var, z3Var) == aVar11) {
                                return aVar11;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj15);
                        }
                        return w61.a0.a;
                    }
                }
                z3Var = new z3(this, cVar);
                Object obj152 = z3Var.u;
                b71.a aVar112 = b71.a.r;
                i12 = z3Var.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof c4) {
                    c4Var = (c4) cVar;
                    int i39 = c4Var.v;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        c4Var.v = i39 - Integer.MIN_VALUE;
                        Object obj16 = c4Var.u;
                        b71.a aVar12 = b71.a.r;
                        i13 = c4Var.v;
                        if (i13 != 0) {
                            sy.y.j(obj16);
                            pa0 pa0Var = (pa0) obj;
                            String str22 = "";
                            String str23 = (pa0Var == null || (ra0Var2 = pa0Var.a) == null || (na0Var2 = ra0Var2.a) == null) ? "" : na0Var2.b;
                            if (pa0Var != null && (ra0Var = pa0Var.a) != null && (na0Var = ra0Var.a) != null && (qa0Var = na0Var.c) != null) {
                                str22 = qa0Var.a;
                            }
                            yz0.p7 p7Var = new yz0.p7(new com.github.service.models.response.a(str23, (Avatar) null, str22, false, (String) null, 58));
                            c4Var.v = 1;
                            if (this.s.c(p7Var, c4Var) == aVar12) {
                                return aVar12;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj16);
                        }
                        return w61.a0.a;
                    }
                }
                c4Var = new c4(this, cVar);
                Object obj162 = c4Var.u;
                b71.a aVar122 = b71.a.r;
                i13 = c4Var.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof d4) {
                    d4Var = (d4) cVar;
                    int i41 = d4Var.v;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        d4Var.v = i41 - Integer.MIN_VALUE;
                        Object obj17 = d4Var.u;
                        b71.a aVar13 = b71.a.r;
                        i14 = d4Var.v;
                        if (i14 != 0) {
                            sy.y.j(obj17);
                            wm wmVar = ((pm) obj).a;
                            zm zmVar = wmVar != null ? wmVar.d : null;
                            x61.rShadow<vm> rVar3 = x61.rShadow.r;
                            if (zmVar != null) {
                                qm qmVar = wmVar.d.a;
                                x61.rShadow rVar4 = qmVar != null ? qmVar.a : null;
                                if (rVar4 != null) {
                                    rVar3 = rVar4;
                                }
                                arrayList3 = new ArrayList();
                                for (um umVar : rVar3) {
                                    yz0.r2 c = (umVar != null ? umVar.b.b : null) != null ? sy.f.c(umVar.b.b) : (umVar != null ? umVar.b.c : null) != null ? sy.f.b(umVar.b.c) : (umVar != null ? umVar.b.d : null) != null ? sy.f.a(umVar.b.d) : null;
                                    if (c != null) {
                                        arrayList3.add(c);
                                    }
                                }
                            } else if ((wmVar != null ? wmVar.c : null) != null) {
                                sm smVar = wmVar.c.a;
                                x61.rShadow rVar5 = smVar != null ? smVar.a : null;
                                if (rVar5 != null) {
                                    rVar3 = rVar5;
                                }
                                arrayList3 = new ArrayList();
                                for (tm tmVar : rVar3) {
                                    yz0.r2 c2 = (tmVar != null ? tmVar.b.b : null) != null ? sy.f.c(tmVar.b.b) : (tmVar != null ? tmVar.b.c : null) != null ? sy.f.b(tmVar.b.c) : (tmVar != null ? tmVar.b.d : null) != null ? sy.f.a(tmVar.b.d) : null;
                                    if (c2 != null) {
                                        arrayList3.add(c2);
                                    }
                                }
                            } else {
                                if ((wmVar != null ? wmVar.e : null) != null) {
                                    rm rmVar = wmVar.e.a;
                                    x61.rShadow rVar6 = rmVar != null ? rmVar.a : null;
                                    if (rVar6 != null) {
                                        rVar3 = rVar6;
                                    }
                                    arrayList3 = new ArrayList();
                                    for (vm vmVar : rVar3) {
                                        yz0.r2 c3 = (vmVar != null ? vmVar.b.b : null) != null ? sy.f.c(vmVar.b.b) : (vmVar != null ? vmVar.b.c : null) != null ? sy.f.b(vmVar.b.c) : (vmVar != null ? vmVar.b.d : null) != null ? sy.f.a(vmVar.b.d) : null;
                                        if (c3 != null) {
                                            arrayList3.add(c3);
                                        }
                                    }
                                }
                                d4Var.v = 1;
                                if (this.s.c(rVar3, d4Var) == aVar13) {
                                    return aVar13;
                                }
                            }
                            rVar3 = arrayList3;
                            d4Var.v = 1;
                            if (this.s.c(rVar3, d4Var) == aVar13) {
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj17);
                        }
                        return w61.a0.a;
                    }
                }
                d4Var = new d4(this, cVar);
                Object obj172 = d4Var.u;
                b71.a aVar132 = b71.a.r;
                i14 = d4Var.v;
                if (i14 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof e4) {
                    e4Var = (e4) cVar;
                    int i42 = e4Var.v;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        e4Var.v = i42 - Integer.MIN_VALUE;
                        Object obj18 = e4Var.u;
                        b71.a aVar14 = b71.a.r;
                        i15 = e4Var.v;
                        if (i15 != 0) {
                            sy.y.j(obj18);
                            fn fnVar = ((cn) obj).a;
                            gn gnVar = fnVar != null ? fnVar.c : null;
                            x61.rShadow<en> rVar7 = x61.rShadow.r;
                            if (gnVar != null) {
                                x61.rShadow rVar8 = fnVar.c.a.a;
                                if (rVar8 != null) {
                                    rVar7 = rVar8;
                                }
                                x61.rShadow arrayList9 = new ArrayList();
                                for (en enVar : rVar7) {
                                    if (enVar == null || (str4 = enVar.b) == null) {
                                        str4 = "";
                                    }
                                    arrayList9.add(new yz0.r2(str4, enVar != null ? enVar.c : "", w8.s.A(enVar != null ? enVar.e : null), false));
                                }
                                rVar7 = arrayList9;
                            }
                            e4Var.v = 1;
                            if (this.s.c(rVar7, e4Var) == aVar14) {
                                return aVar14;
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj18);
                        }
                        return w61.a0.a;
                    }
                }
                e4Var = new e4(this, cVar);
                Object obj182 = e4Var.u;
                b71.a aVar142 = b71.a.r;
                i15 = e4Var.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 13:
                if (cVar instanceof f4) {
                    f4Var = (f4) cVar;
                    int i43 = f4Var.v;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        f4Var.v = i43 - Integer.MIN_VALUE;
                        Object obj19 = f4Var.u;
                        b71.a aVar15 = b71.a.r;
                        i16 = f4Var.v;
                        if (i16 != 0) {
                            sy.y.j(obj19);
                            ln lnVar = (ln) obj;
                            k71.k.g(lnVar, "<this>");
                            yz0.t2 t2Var = new yz0.t2(new yz0.s2(lnVar.c, lnVar.d), new yz0.s2(lnVar.e, lnVar.f));
                            f4Var.v = 1;
                            if (this.s.c(t2Var, f4Var) == aVar15) {
                                return aVar15;
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj19);
                        }
                        return w61.a0.a;
                    }
                }
                f4Var = new f4(this, cVar);
                Object obj192 = f4Var.u;
                b71.a aVar152 = b71.a.r;
                i16 = f4Var.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof g4) {
                    g4Var = (g4) cVar;
                    int i44 = g4Var.v;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        g4Var.v = i44 - Integer.MIN_VALUE;
                        Object obj20 = g4Var.u;
                        b71.a aVar16 = b71.a.r;
                        i17 = g4Var.v;
                        if (i17 != 0) {
                            sy.y.j(obj20);
                            kn knVar = ((jn) obj).a;
                            ln lnVar2 = knVar != null ? knVar.c : null;
                            if (lnVar2 != null) {
                                g4Var.v = 1;
                                if (this.s.c(lnVar2, g4Var) == aVar16) {
                                    return aVar16;
                                }
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj20);
                        }
                        return w61.a0.a;
                    }
                }
                g4Var = new g4(this, cVar);
                Object obj202 = g4Var.u;
                b71.a aVar162 = b71.a.r;
                i17 = g4Var.v;
                if (i17 != 0) {
                }
                return w61.a0.a;
            case 15:
                if (cVar instanceof h4) {
                    h4Var = (h4) cVar;
                    int i45 = h4Var.v;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        h4Var.v = i45 - Integer.MIN_VALUE;
                        Object obj21 = h4Var.u;
                        b71.a aVar17 = b71.a.r;
                        i18 = h4Var.v;
                        if (i18 != 0) {
                            sy.y.j(obj21);
                            yn ynVar = ((wn) obj).a;
                            Object obj22 = null;
                            if (ynVar != null && (znVar = ynVar.c) != null) {
                                xn xnVar = znVar.c;
                                String str24 = xnVar.a;
                                String str25 = xnVar.b;
                                ArrayList arrayList10 = xnVar.c;
                                h01.m mVar = PullRequestMergeRequirementsState.Companion;
                                String str26 = xnVar.d.r;
                                mVar.getClass();
                                Iterator it3 = PullRequestMergeRequirementsState.getEntries().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        Object next = it3.next();
                                        if (k71.k.b(((PullRequestMergeRequirementsState) next).getRawValue(), str26)) {
                                            obj22 = next;
                                        }
                                    }
                                }
                                PullRequestMergeRequirementsState pullRequestMergeRequirementsState = (PullRequestMergeRequirementsState) obj22;
                                if (pullRequestMergeRequirementsState == null) {
                                    pullRequestMergeRequirementsState = PullRequestMergeRequirementsState.UNKNOWN__;
                                }
                                obj22 = new h01.i(str24, str25, arrayList10, pullRequestMergeRequirementsState);
                            }
                            if (obj22 != null) {
                                h4Var.v = 1;
                                if (this.s.c(obj22, h4Var) == aVar17) {
                                    return aVar17;
                                }
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj21);
                        }
                        return w61.a0.a;
                    }
                }
                h4Var = new h4(this, cVar);
                Object obj212 = h4Var.u;
                b71.a aVar172 = b71.a.r;
                i18 = h4Var.v;
                if (i18 != 0) {
                }
                return w61.a0.a;
            case 16:
                if (cVar instanceof i4) {
                    i4Var = (i4) cVar;
                    int i46 = i4Var.v;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        i4Var.v = i46 - Integer.MIN_VALUE;
                        Object obj23 = i4Var.u;
                        b71.a aVar18 = b71.a.r;
                        i19 = i4Var.v;
                        if (i19 != 0) {
                            sy.y.j(obj23);
                            pn pnVar = (pn) obj;
                            k71.k.g(pnVar, "<this>");
                            rn rnVar = pnVar.a;
                            if (rnVar == null || (tnVar5 = rnVar.b) == null || (pullRequestState = a.a.C(tnVar5.i.b)) == null) {
                                pullRequestState = PullRequestState.UNKNOWN__;
                            }
                            String str27 = "";
                            String str28 = (rnVar == null || (tnVar4 = rnVar.b) == null || (qnVar2 = tnVar4.d) == null) ? "" : qnVar2.a;
                            String str29 = (rnVar == null || (tnVar3 = rnVar.b) == null) ? "" : tnVar3.c;
                            if (rnVar != null && (nnVar = rnVar.a) != null) {
                                str27 = nnVar.b;
                            }
                            yz0.v6 v6Var = new yz0.v6(str28, str29, new com.github.service.models.response.a(str27, (Avatar) null, (String) null, false, (String) null, 62));
                            boolean z = false;
                            if (rnVar != null && (tnVar2 = rnVar.b) != null && tnVar2.g) {
                                z = true;
                            }
                            yz0.u2 u2Var = new yz0.u2(pullRequestState, v6Var, z, (rnVar == null || (tnVar = rnVar.b) == null || (qnVar = tnVar.d) == null) ? null : qnVar.b);
                            i4Var.v = 1;
                            if (this.s.c(u2Var, i4Var) == aVar18) {
                                return aVar18;
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj23);
                        }
                        return w61.a0.a;
                    }
                }
                i4Var = new i4(this, cVar);
                Object obj232 = i4Var.u;
                b71.a aVar182 = b71.a.r;
                i19 = i4Var.v;
                if (i19 != 0) {
                }
                return w61.a0.a;
            case 17:
                return a(cVar, obj);
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
                if (cVar instanceof z4) {
                    z4Var = (z4) cVar;
                    int i47 = z4Var.v;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        z4Var.v = i47 - Integer.MIN_VALUE;
                        Object obj24 = z4Var.u;
                        b71.a aVar19 = b71.a.r;
                        i21 = z4Var.v;
                        if (i21 != 0) {
                            sy.y.j(obj24);
                            rz.t1 t1Var = ((rz.r1) obj).a;
                            Object j = in.rShadow.j(t1Var != null ? t1Var.a : null, "Invalid owner or repository name", u1.z);
                            z4Var.v = 1;
                            if (this.s.c(j, z4Var) == aVar19) {
                                return aVar19;
                            }
                        } else {
                            if (i21 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj24);
                        }
                        return w61.a0.a;
                    }
                }
                z4Var = new z4(this, cVar);
                Object obj242 = z4Var.u;
                b71.a aVar192 = b71.a.r;
                i21 = z4Var.v;
                if (i21 != 0) {
                }
                return w61.a0.a;
        }
    }
}
