package vb0;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.IssueOrPullRequest$ReviewerReviewState;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.MergeCheckStatus;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.SimpleLegacyProject;
import com.github.service.models.response.TimelineItem$TimelineLockedEvent$Reason;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.organizations.OrganizationNameAndAvatarUrl;
import com.github.service.models.response.type.MergeStateStatus;
import com.github.service.models.response.type.PullRequestMergeMethod;
import com.github.service.models.response.type.PullRequestReviewDecision;
import com.github.service.models.response.type.SubscriptionState;
import hc0.ev;
import hc0.ff;
import hc0.fm;
import hc0.fq;
import hc0.jd;
import hc0.nl;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import u10.ad;
import u10.ag;
import u10.ak;
import u10.bb;
import u10.bg;
import u10.bj;
import u10.bk;
import u10.cb;
import u10.cg;
import u10.d9;
import u10.db;
import u10.e60;
import u10.ej;
import u10.f20;
import u10.g9;
import u10.gj;
import u10.h20;
import u10.h9;
import u10.hj;
import u10.i20;
import u10.i9;
import u10.ij;
import u10.jx;
import u10.kx;
import u10.lj;
import u10.lx;
import u10.m60;
import u10.ma0;
import u10.mj;
import u10.mx;
import u10.na0;
import u10.nb;
import u10.nj;
import u10.o60;
import u10.ob;
import u10.p60;
import u10.pa0;
import u10.pj;
import u10.q50;
import u10.q60;
import u10.qb;
import u10.r60;
import u10.ri;
import u10.rj;
import u10.sb;
import u10.si;
import u10.sj;
import u10.t60;
import u10.ti;
import u10.tj;
import u10.u50;
import u10.ub;
import u10.ui;
import u10.v50;
import u10.v60;
import u10.vb;
import u10.vc;
import u10.vi;
import u10.vj;
import u10.vl;
import u10.w60;
import u10.wb;
import u10.wc;
import u10.wi;
import u10.wl;
import u10.xi;
import u10.yf;
import u10.yi;
import u10.yj;
import u10.z50;
import u10.zc;
import u10.zj;
import u10.zl;
import yz0.q8;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v2 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ v2(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        h3 h3Var;
        int i;
        i20 i20Var;
        f20 f20Var;
        if (cVar instanceof h3) {
            h3Var = (h3) cVar;
            int i2 = h3Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h3Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = h3Var.u;
                b71.a aVar = b71.a.r;
                i = h3Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    h20 h20Var = (h20) obj;
                    yz0.p7 p7Var = new yz0.p7(new com.github.service.models.response.a((h20Var == null || (i20Var = h20Var.a) == null || (f20Var = i20Var.a) == null) ? "" : f20Var.b, (Avatar) null, (String) null, false, (String) null, 62));
                    h3Var.v = 1;
                    if (this.s.c(p7Var, h3Var) == aVar) {
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
        h3Var = new h3(this, cVar);
        Object obj22 = h3Var.u;
        b71.a aVar2 = b71.a.r;
        i = h3Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b(a71.c cVar, Object obj) {
        i3 i3Var;
        int i;
        ArrayList arrayList;
        if (cVar instanceof i3) {
            i3Var = (i3) cVar;
            int i2 = i3Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i3Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = i3Var.u;
                b71.a aVar = b71.a.r;
                i = i3Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    yi yiVar = ((ri) obj).a;
                    bj bjVar = yiVar != null ? yiVar.d : null;
                    Collection<xi> collection = x61.rShadow.r;
                    if (bjVar != null) {
                        si siVar = yiVar.d.a;
                        Collection collection2 = siVar != null ? siVar.a : null;
                        if (collection2 != null) {
                            collection = collection2;
                        }
                        arrayList = new ArrayList();
                        for (wi wiVar : collection) {
                            yz0.r2 c = (wiVar != null ? wiVar.b.b : null) != null ? va0.f.c(wiVar.b.b) : (wiVar != null ? wiVar.b.c : null) != null ? va0.f.b(wiVar.b.c) : (wiVar != null ? wiVar.b.d : null) != null ? va0.f.a(wiVar.b.d) : null;
                            if (c != null) {
                                arrayList.add(c);
                            }
                        }
                    } else if ((yiVar != null ? yiVar.c : null) != null) {
                        ui uiVar = yiVar.c.a;
                        Collection collection3 = uiVar != null ? uiVar.a : null;
                        if (collection3 != null) {
                            collection = collection3;
                        }
                        arrayList = new ArrayList();
                        for (vi viVar : collection) {
                            yz0.r2 c2 = (viVar != null ? viVar.b.b : null) != null ? va0.f.c(viVar.b.b) : (viVar != null ? viVar.b.c : null) != null ? va0.f.b(viVar.b.c) : (viVar != null ? viVar.b.d : null) != null ? va0.f.a(viVar.b.d) : null;
                            if (c2 != null) {
                                arrayList.add(c2);
                            }
                        }
                    } else {
                        if ((yiVar != null ? yiVar.e : null) != null) {
                            ti tiVar = yiVar.e.a;
                            Collection collection4 = tiVar != null ? tiVar.a : null;
                            if (collection4 != null) {
                                collection = collection4;
                            }
                            arrayList = new ArrayList();
                            for (xi xiVar : collection) {
                                yz0.r2 c3 = (xiVar != null ? xiVar.b.b : null) != null ? va0.f.c(xiVar.b.b) : (xiVar != null ? xiVar.b.c : null) != null ? va0.f.b(xiVar.b.c) : (xiVar != null ? xiVar.b.d : null) != null ? va0.f.a(xiVar.b.d) : null;
                                if (c3 != null) {
                                    arrayList.add(c3);
                                }
                            }
                        }
                        i3Var.v = 1;
                        if (this.s.c(collection, i3Var) == aVar) {
                            return aVar;
                        }
                    }
                    collection = arrayList;
                    i3Var.v = 1;
                    if (this.s.c(collection, i3Var) == aVar) {
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
        i3Var = new i3(this, cVar);
        Object obj22 = i3Var.u;
        b71.a aVar2 = b71.a.r;
        i = i3Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object d(a71.c cVar, Object obj) {
        j3 j3Var;
        int i;
        String str;
        if (cVar instanceof j3) {
            j3Var = (j3) cVar;
            int i2 = j3Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j3Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = j3Var.u;
                b71.a aVar = b71.a.r;
                i = j3Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    hj hjVar = ((ej) obj).a;
                    ij ijVar = hjVar != null ? hjVar.c : null;
                    Collection<gj> collection = x61.rShadow.r;
                    if (ijVar != null) {
                        Collection collection2 = hjVar.c.a.a;
                        if (collection2 != null) {
                            collection = collection2;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (gj gjVar : collection) {
                            if (gjVar == null || (str = gjVar.b) == null) {
                                str = "";
                            }
                            arrayList.add(new yz0.r2(str, gjVar != null ? gjVar.c : "", t.q.q(gjVar != null ? gjVar.e : null), false));
                        }
                        collection = arrayList;
                    }
                    j3Var.v = 1;
                    if (this.s.c(collection, j3Var) == aVar) {
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
        j3Var = new j3(this, cVar);
        Object obj22 = j3Var.u;
        b71.a aVar2 = b71.a.r;
        i = j3Var.v;
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
        k3 k3Var;
        int i;
        if (cVar instanceof k3) {
            k3Var = (k3) cVar;
            int i2 = k3Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k3Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = k3Var.u;
                b71.a aVar = b71.a.r;
                i = k3Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    nj njVar = (nj) obj;
                    k71.k.g(njVar, "<this>");
                    yz0.t2 t2Var = new yz0.t2(new yz0.s2(njVar.c, njVar.d), new yz0.s2(njVar.e, njVar.f));
                    k3Var.v = 1;
                    if (this.s.c(t2Var, k3Var) == aVar) {
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
        k3Var = new k3(this, cVar);
        Object obj22 = k3Var.u;
        b71.a aVar2 = b71.a.r;
        i = k3Var.v;
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
        l3 l3Var;
        int i;
        if (cVar instanceof l3) {
            l3Var = (l3) cVar;
            int i2 = l3Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l3Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = l3Var.u;
                b71.a aVar = b71.a.r;
                i = l3Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    mj mjVar = ((lj) obj).a;
                    nj njVar = mjVar != null ? mjVar.c : null;
                    if (njVar != null) {
                        l3Var.v = 1;
                        if (this.s.c(njVar, l3Var) == aVar) {
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
        l3Var = new l3(this, cVar);
        Object obj22 = l3Var.u;
        b71.a aVar2 = b71.a.r;
        i = l3Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(a71.c cVar, Object obj) {
        m3 m3Var;
        int i;
        PullRequestState pullRequestState;
        vj vjVar;
        sj sjVar;
        vj vjVar2;
        pj pjVar;
        vj vjVar3;
        vj vjVar4;
        sj sjVar2;
        vj vjVar5;
        if (cVar instanceof m3) {
            m3Var = (m3) cVar;
            int i2 = m3Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m3Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = m3Var.u;
                b71.a aVar = b71.a.r;
                i = m3Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    rj rjVar = (rj) obj;
                    k71.k.g(rjVar, "<this>");
                    tj tjVar = rjVar.a;
                    if (tjVar == null || (vjVar5 = tjVar.b) == null || (pullRequestState = m7.y.Q(vjVar5.i.b)) == null) {
                        pullRequestState = PullRequestState.UNKNOWN__;
                    }
                    String str = "";
                    String str2 = (tjVar == null || (vjVar4 = tjVar.b) == null || (sjVar2 = vjVar4.d) == null) ? "" : sjVar2.a;
                    String str3 = (tjVar == null || (vjVar3 = tjVar.b) == null) ? "" : vjVar3.c;
                    if (tjVar != null && (pjVar = tjVar.a) != null) {
                        str = pjVar.b;
                    }
                    yz0.v6 v6Var = new yz0.v6(str2, str3, new com.github.service.models.response.a(str, (Avatar) null, (String) null, false, (String) null, 62));
                    boolean z = false;
                    if (tjVar != null && (vjVar2 = tjVar.b) != null && vjVar2.g) {
                        z = true;
                    }
                    yz0.u2 u2Var = new yz0.u2(pullRequestState, v6Var, z, (tjVar == null || (vjVar = tjVar.b) == null || (sjVar = vjVar.d) == null) ? null : sjVar.b);
                    m3Var.v = 1;
                    if (this.s.c(u2Var, m3Var) == aVar) {
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
        m3Var = new m3(this, cVar);
        Object obj22 = m3Var.u;
        b71.a aVar2 = b71.a.r;
        i = m3Var.v;
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
        n3 n3Var;
        int i;
        v50 v50Var;
        List list;
        u50 u50Var;
        c80.d dVar;
        if (cVar instanceof n3) {
            n3Var = (n3) cVar;
            int i2 = n3Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n3Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = n3Var.u;
                b71.a aVar = b71.a.r;
                i = n3Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    z50 z50Var = ((q50) obj).a;
                    yz0.z6 o = (z50Var == null || (v50Var = z50Var.a) == null || (list = v50Var.m.a) == null || (u50Var = (u50) x61.m.W(list)) == null || (dVar = u50Var.c) == null) ? null : t.a0.o(dVar);
                    if (o != null) {
                        n3Var.v = 1;
                        if (this.s.c(o, n3Var) == aVar) {
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
        n3Var = new n3(this, cVar);
        Object obj22 = n3Var.u;
        b71.a aVar2 = b71.a.r;
        i = n3Var.v;
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
        o3 o3Var;
        int i;
        db dbVar;
        if (cVar instanceof o3) {
            o3Var = (o3) cVar;
            int i2 = o3Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o3Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = o3Var.u;
                b71.a aVar = b71.a.r;
                i = o3Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    cb cbVar = ((bb) obj).a;
                    String str = (cbVar == null || (dbVar = cbVar.a) == null) ? null : dbVar.a;
                    o3Var.v = 1;
                    if (this.s.c(str, o3Var) == aVar) {
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
        o3Var = new o3(this, cVar);
        Object obj22 = o3Var.u;
        b71.a aVar2 = b71.a.r;
        i = o3Var.v;
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
        p3 p3Var;
        int i;
        if (cVar instanceof p3) {
            p3Var = (p3) cVar;
            int i2 = p3Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p3Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = p3Var.u;
                b71.a aVar = b71.a.r;
                i = p3Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    wc wcVar = ((vc) obj).a;
                    if (wcVar == null) {
                        throw new ApiFailure(ApiFailureType.NOT_FOUND, "Invalid Organisation login", null, null, null, null, null, 124);
                    }
                    c30.j jVar = wcVar.c;
                    OrganizationNameAndAvatarUrl organizationNameAndAvatarUrl = new OrganizationNameAndAvatarUrl(jVar.b, jVar.c, jVar.d);
                    p3Var.v = 1;
                    if (this.s.c(organizationNameAndAvatarUrl, p3Var) == aVar) {
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
        p3Var = new p3(this, cVar);
        Object obj22 = p3Var.u;
        b71.a aVar2 = b71.a.r;
        i = p3Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(a71.c cVar, Object obj) {
        q3 q3Var;
        int i;
        if (cVar instanceof q3) {
            q3Var = (q3) cVar;
            int i2 = q3Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q3Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = q3Var.u;
                b71.a aVar = b71.a.r;
                i = q3Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    vl vlVar = (vl) obj;
                    zl zlVar = vlVar.a;
                    List<wl> list = zlVar != null ? zlVar.a.b : null;
                    if (list == null) {
                        list = x61.rShadow.r;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (wl wlVar : list) {
                        k70.q qVar = wlVar != null ? wlVar.c : null;
                        if (qVar != null) {
                            arrayList.add(qVar);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        arrayList2.add(sy.u.m((k70.q) obj3));
                    }
                    zl zlVar2 = vlVar.a;
                    k01.a aVar2 = new k01.a(arrayList2, new x01.i(zlVar2 != null ? zlVar2.a.a.b : null, zlVar2 != null && zlVar2.a.a.a, false));
                    q3Var.v = 1;
                    if (this.s.c(aVar2, q3Var) == aVar) {
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
        q3Var = new q3(this, cVar);
        Object obj22 = q3Var.u;
        b71.a aVar3 = b71.a.r;
        i = q3Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object n(a71.c cVar, Object obj) {
        r3 r3Var;
        int i;
        if (cVar instanceof r3) {
            r3Var = (r3) cVar;
            int i2 = r3Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r3Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = r3Var.u;
                b71.a aVar = b71.a.r;
                i = r3Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    ma0 ma0Var = (ma0) obj;
                    Iterable<na0> iterable = ma0Var.a.a.b;
                    if (iterable == null) {
                        iterable = x61.rShadow.r;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (na0 na0Var : iterable) {
                        k70.q qVar = na0Var != null ? na0Var.c : null;
                        if (qVar != null) {
                            arrayList.add(qVar);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        arrayList2.add(sy.u.m((k70.q) obj3));
                    }
                    pa0 pa0Var = ma0Var.a.a.a;
                    k01.a aVar2 = new k01.a(arrayList2, new x01.i(pa0Var.b, pa0Var.a, false));
                    r3Var.v = 1;
                    if (this.s.c(aVar2, r3Var) == aVar) {
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
        r3Var = new r3(this, cVar);
        Object obj22 = r3Var.u;
        b71.a aVar3 = b71.a.r;
        i = r3Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object o(a71.c cVar, Object obj) {
        s3 s3Var;
        int i;
        lx lxVar;
        if (cVar instanceof s3) {
            s3Var = (s3) cVar;
            int i2 = s3Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s3Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = s3Var.u;
                b71.a aVar = b71.a.r;
                i = s3Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    jx jxVar = (jx) obj;
                    Iterable<kx> iterable = jxVar.a.c;
                    if (iterable == null) {
                        iterable = x61.rShadow.r;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (kx kxVar : iterable) {
                        k70.q qVar = (kxVar == null || (lxVar = kxVar.b) == null) ? null : lxVar.c;
                        if (qVar != null) {
                            arrayList.add(qVar);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        arrayList2.add(sy.u.m((k70.q) obj3));
                    }
                    mx mxVar = jxVar.a.b;
                    w61.k kVar = new w61.k(arrayList2, new x01.i(mxVar.b, mxVar.a, false));
                    s3Var.v = 1;
                    if (this.s.c(kVar, s3Var) == aVar) {
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
        s3Var = new s3(this, cVar);
        Object obj22 = s3Var.u;
        b71.a aVar2 = b71.a.r;
        i = s3Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object p(a71.c cVar, Object obj) {
        b4 b4Var;
        int i;
        IssueOrPullRequestState issueOrPullRequestState;
        u10.y4 y4Var;
        u10.y4 y4Var2;
        if (cVar instanceof b4) {
            b4Var = (b4) cVar;
            int i2 = b4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = b4Var.u;
                b71.a aVar = b71.a.r;
                i = b4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    u10.x4 x4Var = (u10.x4) obj;
                    k71.k.g(x4Var, "<this>");
                    u10.v4 v4Var = x4Var.a;
                    fm fmVar = (v4Var == null || (y4Var2 = v4Var.a) == null) ? null : y4Var2.b;
                    int i3 = fmVar == null ? -1 : va0.p.a[fmVar.ordinal()];
                    if (i3 == -1) {
                        issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
                    } else if (i3 == 1) {
                        issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_OPEN;
                    } else if (i3 == 2) {
                        issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
                    } else if (i3 == 3) {
                        issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
                    } else {
                        if (i3 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
                    }
                    boolean z = false;
                    if (v4Var != null && (y4Var = v4Var.a) != null && y4Var.c) {
                        z = true;
                    }
                    yz0.a8 a8Var = new yz0.a8(issueOrPullRequestState, z);
                    b4Var.v = 1;
                    if (this.s.c(a8Var, b4Var) == aVar) {
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
        b4Var = new b4(this, cVar);
        Object obj22 = b4Var.u;
        b71.a aVar2 = b71.a.r;
        i = b4Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object q(a71.c cVar, Object obj) {
        c4 c4Var;
        int i;
        i9 i9Var;
        i9 i9Var2;
        d9 d9Var;
        if (cVar instanceof c4) {
            c4Var = (c4) cVar;
            int i2 = c4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = c4Var.u;
                b71.a aVar = b71.a.r;
                i = c4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    g9 g9Var = (g9) obj;
                    k71.k.g(g9Var, "<this>");
                    h9 h9Var = g9Var.a;
                    yz0.v5 v5Var = new yz0.v5(new com.github.service.models.response.a((h9Var == null || (d9Var = h9Var.a) == null) ? "" : d9Var.b.b, (Avatar) null, (String) null, false, (String) null, 62));
                    boolean z = false;
                    boolean z2 = (h9Var == null || (i9Var2 = h9Var.b) == null) ? false : i9Var2.b;
                    if (h9Var != null && (i9Var = h9Var.b) != null) {
                        z = i9Var.c;
                    }
                    yz0.c1 c1Var = new yz0.c1(v5Var, z2, z);
                    c4Var.v = 1;
                    if (this.s.c(c1Var, c4Var) == aVar) {
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
        c4Var = new c4(this, cVar);
        Object obj22 = c4Var.u;
        b71.a aVar2 = b71.a.r;
        i = c4Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object r(a71.c cVar, Object obj) {
        d4 d4Var;
        int i;
        h01.f fVar;
        qb qbVar;
        if (cVar instanceof d4) {
            d4Var = (d4) cVar;
            int i2 = d4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = d4Var.u;
                b71.a aVar = b71.a.r;
                i = d4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    ob obVar = ((nb) obj).a;
                    if (obVar == null || (qbVar = obVar.a) == null) {
                        fVar = null;
                    } else {
                        z70.e3 e3Var = qbVar.b.c;
                        z70.d3 d3Var = e3Var.c;
                        fVar = new h01.f(d3Var.c.b, e3Var.b, d3Var.b);
                    }
                    if (fVar != null) {
                        d4Var.v = 1;
                        if (this.s.c(fVar, d4Var) == aVar) {
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
        d4Var = new d4(this, cVar);
        Object obj22 = d4Var.u;
        b71.a aVar2 = b71.a.r;
        i = d4Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object s(a71.c cVar, Object obj) {
        e4 e4Var;
        int i;
        String str;
        yz0.s7 w5Var;
        sb sbVar;
        PullRequestMergeMethod pullRequestMergeMethod;
        wb wbVar;
        z70.a aVar;
        wb wbVar2;
        wb wbVar3;
        wb wbVar4;
        z70.a aVar2;
        if (cVar instanceof e4) {
            e4Var = (e4) cVar;
            int i2 = e4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = e4Var.u;
                b71.a aVar3 = b71.a.r;
                i = e4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    ub ubVar = (ub) obj;
                    k71.k.g(ubVar, "<this>");
                    vb vbVar = ubVar.a;
                    PullRequestMergeMethod P = (vbVar == null || (wbVar4 = vbVar.b) == null || (aVar2 = wbVar4.c.d) == null) ? null : i21.a.P(aVar2.a);
                    int i3 = P == null ? -1 : va0.d.a[P.ordinal()];
                    str = "";
                    if (i3 == -1 || i3 == 1 || i3 == 2) {
                        if (vbVar != null && (sbVar = vbVar.a) != null) {
                            str = sbVar.b;
                        }
                        w5Var = new yz0.w5(new com.github.service.models.response.a(str, (Avatar) null, (String) null, false, (String) null, 62));
                    } else if (i3 == 3) {
                        sb sbVar2 = vbVar.a;
                        w5Var = new yz0.y5(new com.github.service.models.response.a(sbVar2 != null ? sbVar2.b : "", (Avatar) null, (String) null, false, (String) null, 62));
                    } else {
                        if (i3 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        sb sbVar3 = vbVar.a;
                        w5Var = new yz0.x5(new com.github.service.models.response.a(sbVar3 != null ? sbVar3.b : "", (Avatar) null, (String) null, false, (String) null, 62));
                    }
                    boolean z = false;
                    boolean z2 = (vbVar == null || (wbVar3 = vbVar.b) == null || !wbVar3.c.c) ? false : true;
                    if (vbVar != null && (wbVar2 = vbVar.b) != null && wbVar2.c.b) {
                        z = true;
                    }
                    if (vbVar == null || (wbVar = vbVar.b) == null || (aVar = wbVar.c.d) == null || (pullRequestMergeMethod = i21.a.P(aVar.a)) == null) {
                        pullRequestMergeMethod = PullRequestMergeMethod.UNKNOWN__;
                    }
                    yz0.e1 e1Var = new yz0.e1(w5Var, z2, z, pullRequestMergeMethod);
                    e4Var.v = 1;
                    if (this.s.c(e1Var, e4Var) == aVar3) {
                        return aVar3;
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
        e4Var = new e4(this, cVar);
        Object obj22 = e4Var.u;
        b71.a aVar32 = b71.a.r;
        i = e4Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object t(a71.c cVar, Object obj) {
        f4 f4Var;
        int i;
        bb0.a aVar;
        u10.d4 d4Var;
        List list;
        u10.d4 d4Var2;
        List list2;
        u10.z3 z3Var;
        if (cVar instanceof f4) {
            f4Var = (f4) cVar;
            int i2 = f4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = f4Var.u;
                b71.a aVar2 = b71.a.r;
                i = f4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    u10.x3 x3Var = (u10.x3) obj;
                    u10.b4 b4Var = x3Var.a;
                    u10.h4 h4Var = (b4Var == null || (d4Var2 = b4Var.c) == null || (list2 = d4Var2.b.a) == null || (z3Var = (u10.z3) x61.m.f0(list2)) == null) ? null : z3Var.a.b;
                    u10.b4 b4Var2 = x3Var.a;
                    List<u10.y3> S = (b4Var2 == null || (d4Var = b4Var2.c) == null || (list = d4Var.a.b) == null) ? null : x61.m.S(list);
                    List<u10.a4> list3 = x61.rShadow.r;
                    if (S == null) {
                        S = list3;
                    }
                    ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                    for (u10.y3 y3Var : S) {
                        k71.k.g(y3Var, "requiredStatusCheck");
                        String str = y3Var.a;
                        String str2 = y3Var.b;
                        MergeCheckStatus g = sy.rShadow.g(y9.a.K(y3Var.c));
                        String str3 = y3Var.d;
                        arrayList.add(new bb0.a(str, str2, (String) null, g, "", "", str3 == null ? "" : str3, Boolean.TRUE, (Integer) null));
                    }
                    if (h4Var != null) {
                        List list4 = h4Var.b.b;
                        List S2 = list4 != null ? x61.m.S(list4) : null;
                        if (S2 != null) {
                            list3 = S2;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (u10.a4 a4Var : list3) {
                            u10.c4 c4Var = a4Var.c;
                            if (c4Var != null) {
                                String str4 = c4Var.a;
                                String str5 = c4Var.c;
                                u10.s3 s3Var = c4Var.g;
                                u10.j4 j4Var = s3Var.a;
                                String str6 = j4Var != null ? j4Var.a.a : null;
                                hc0.j2 j2Var = c4Var.b;
                                if (j2Var == null) {
                                    j2Var = hc0.j2.t;
                                }
                                MergeCheckStatus h = sy.rShadow.h(j2Var);
                                String str7 = c4Var.e;
                                u10.r3 r3Var = s3Var.b;
                                String str8 = r3Var != null ? r3Var.a : "";
                                String str9 = c4Var.d;
                                aVar = new bb0.a(str4, str5, str6, h, str7, str8, str9 == null ? "" : str9, Boolean.valueOf(c4Var.h), Integer.valueOf(c4Var.f));
                            } else {
                                u10.e4 e4Var = a4Var.b;
                                if (e4Var != null) {
                                    String str10 = e4Var.a;
                                    String str11 = e4Var.b;
                                    MergeCheckStatus g2 = sy.rShadow.g(y9.a.K(e4Var.c));
                                    String str12 = e4Var.f;
                                    String str13 = str12 == null ? "" : str12;
                                    String str14 = e4Var.d;
                                    String str15 = str14 == null ? "" : str14;
                                    String str16 = e4Var.e;
                                    aVar = new bb0.a(str10, str11, (String) null, g2, str13, str15, str16 == null ? "" : str16, Boolean.valueOf(e4Var.g), (Integer) null);
                                } else {
                                    aVar = null;
                                }
                            }
                            if (aVar != null) {
                                arrayList2.add(aVar);
                            }
                        }
                        list3 = arrayList2;
                    }
                    ArrayList l0 = x61.m.l0(list3, arrayList);
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList3 = new ArrayList();
                    int size = l0.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = l0.get(i3);
                        i3++;
                        if (hashSet.add(((bb0.a) obj3).b)) {
                            arrayList3.add(obj3);
                        }
                    }
                    h01.d dVar = new h01.d(arrayList3, new x01.i(h4Var != null ? h4Var.b.a.b : null, h4Var != null ? h4Var.b.a.a : false, false));
                    f4Var.v = 1;
                    if (this.s.c(dVar, f4Var) == aVar2) {
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
        f4Var = new f4(this, cVar);
        Object obj22 = f4Var.u;
        b71.a aVar22 = b71.a.r;
        i = f4Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object u(a71.c cVar, Object obj) {
        g4 g4Var;
        int i;
        MergeStateStatus mergeStateStatus;
        zj zjVar;
        ak akVar;
        if (cVar instanceof g4) {
            g4Var = (g4) cVar;
            int i2 = g4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = g4Var.u;
                b71.a aVar = b71.a.r;
                i = g4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    bk bkVar = ((yj) obj).a;
                    if (bkVar == null || (zjVar = bkVar.b) == null || (akVar = zjVar.b) == null || (mergeStateStatus = com.google.android.gms.internal.measurement.d5.g0(akVar.c)) == null) {
                        mergeStateStatus = MergeStateStatus.UNKNOWN;
                    }
                    g4Var.v = 1;
                    if (this.s.c(mergeStateStatus, g4Var) == aVar) {
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
        g4Var = new g4(this, cVar);
        Object obj22 = g4Var.u;
        b71.a aVar2 = b71.a.r;
        i = g4Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object v(a71.c cVar, Object obj) {
        h4 h4Var;
        int i;
        x70.c cVar2;
        x70.d dVar;
        if (cVar instanceof h4) {
            h4Var = (h4) cVar;
            int i2 = h4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = h4Var.u;
                b71.a aVar = b71.a.r;
                i = h4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    x70.e eVar = ((x70.b) obj).a;
                    String str = (eVar == null || (cVar2 = eVar.b) == null || (dVar = cVar2.b) == null) ? null : dVar.a;
                    if (str != null) {
                        h4Var.v = 1;
                        if (this.s.c(str, h4Var) == aVar) {
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
        h4Var = new h4(this, cVar);
        Object obj22 = h4Var.u;
        b71.a aVar2 = b71.a.r;
        i = h4Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r8v8, types: [m01.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object w(a71.c cVar, Object obj) {
        j4 j4Var;
        int i;
        x70.j jVar;
        z70.a8 a8Var;
        List list;
        z70.y7 y7Var;
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
                    x70.i iVar = ((x70.h) obj).a;
                    q8 q8Var = null;
                    if (iVar != null && (jVar = iVar.c) != null) {
                        z70.c8 c8Var = jVar.b;
                        boolean z = c8Var.b;
                        z70.z7 z7Var = c8Var.d;
                        int i3 = (z7Var == null || (list = z7Var.a) == null || (y7Var = (z70.y7) x61.m.f0(list)) == null) ? 0 : y7Var.b.a;
                        z70.b8 b8Var = c8Var.c;
                        if (b8Var != null && (a8Var = b8Var.b) != null) {
                            q8Var = new q8(a8Var.b, a8Var.c, a8Var.d);
                        }
                        q8Var = new m01.b(z, i3, q8Var);
                    }
                    if (q8Var != null) {
                        j4Var.v = 1;
                        if (this.s.c(q8Var, j4Var) == aVar) {
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
    private final Object x(a71.c cVar, Object obj) {
        k4 k4Var;
        int i;
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
                    yz0.y7 f = sy.pShadow.f((e60) obj);
                    k4Var.v = 1;
                    if (this.s.c(f, k4Var) == aVar) {
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
    private final Object y(a71.c cVar, Object obj) {
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
                    yz0.y7 f = sy.pShadow.f((e60) obj);
                    l4Var.v = 1;
                    if (this.s.c(f, l4Var) == aVar) {
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object z(a71.c cVar, Object obj) {
        m4 m4Var;
        int i;
        t60 t60Var;
        m60 m60Var;
        yz0.e2 e2Var;
        t60 t60Var2;
        t60 t60Var3;
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
                    o60 o60Var = (o60) obj;
                    k71.k.g(o60Var, "<this>");
                    v60 v60Var = o60Var.a;
                    String str = null;
                    w60 w60Var = (v60Var == null || (t60Var3 = v60Var.b) == null) ? null : t60Var3.c;
                    p60 p60Var = (v60Var == null || (t60Var2 = v60Var.b) == null) ? null : t60Var2.d;
                    List<r60> list = w60Var != null ? w60Var.a : null;
                    List<q60> list2 = x61.rShadow.r;
                    if (list == null) {
                        list = list2;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (r60 r60Var : list) {
                        c90.d dVar = r60Var != null ? r60Var.c : null;
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
                        c90.d dVar2 = (c90.d) obj3;
                        c90.c cVar2 = dVar2.d;
                        boolean z = dVar2.c;
                        if (cVar2 != null) {
                            c90.a aVar2 = cVar2.c;
                            if (aVar2 != null) {
                                e2Var = va0.c.c(aVar2, z);
                            } else {
                                c90.b bVar = cVar2.b;
                                if (bVar != null) {
                                    e2Var = va0.c.d(bVar, z, (e80.l) null);
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
                    List list3 = p60Var != null ? p60Var.a : null;
                    if (list3 != null) {
                        list2 = list3;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (q60 q60Var : list2) {
                        e80.l lVar = q60Var != null ? q60Var.c : null;
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
                        arrayList4.add(va0.c.e((e80.l) obj4));
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
                    com.github.service.models.response.a aVar3 = new com.github.service.models.response.a((v60Var == null || (m60Var = v60Var.a) == null) ? "" : m60Var.b, (Avatar) null, (String) null, false, (String) null, 62);
                    if (v60Var != null && (t60Var = v60Var.b) != null) {
                        str = t60Var.b.b.c;
                    }
                    yz0.z7 z7Var = new yz0.z7(arrayList5, arrayList6, aVar3, str);
                    m4Var.v = 1;
                    if (this.s.c(z7Var, m4Var) == aVar) {
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
        b71.a aVar4 = b71.a.r;
        i = m4Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:637:0x0b01, code lost:
    
        if (r0 == null) goto L675;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0d2b  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0d3e  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x07fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0807 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x096e  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x09d1  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x09f5  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0a97 A[LOOP:8: B:623:0x0a95->B:624:0x0a97, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0b16  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0b22  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x0b2e  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:658:0x0b5a  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x0b76  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x0b7f  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x0b88  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x0baf  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x0bbf  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x0bcd  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x0c0d  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x0c1f  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0c2a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0c33  */
    /* JADX WARN: Removed duplicated region for block: B:705:0x0c5e  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x0c7b  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x0c84  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x0c8f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:719:0x0c98  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x0ca9  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x0c87  */
    /* JADX WARN: Removed duplicated region for block: B:724:0x0c7e  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x0c1b  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x0bd1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:756:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x0b84  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x0b7b  */
    /* JADX WARN: Removed duplicated region for block: B:759:0x0b68  */
    /* JADX WARN: Removed duplicated region for block: B:761:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:762:0x0b27  */
    /* JADX WARN: Removed duplicated region for block: B:763:0x0b1b  */
    /* JADX WARN: Removed duplicated region for block: B:770:0x0a66  */
    /* JADX WARN: Removed duplicated region for block: B:779:0x0a1b  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x0a39  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:787:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:788:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:796:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v21, types: [x61.rShadow] */
    /* JADX WARN: Type inference failed for: r13v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v48, types: [x61.rShadow] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        Object str36 = null;
        Object i37 = null;
        Object iVar2 = null;
        Object subscriptionState13 = null;
        Object intValue = null;
        Object z1Var = null;
        Object str31 = null;
        Object str37 = null;
        Object z67 = null;
        Object subscriptionState8 = null;
        Object z52 = null;
        Object str34 = null;
        u2 u2Var;
        int i;
        u2 u2Var2;
        b71.a aVar;
        yz0.j2 j2Var;
        yz0.j2 j2Var2;
        z70.b4 b4Var;
        int i2;
        String str;
        boolean z;
        fq fqVar;
        boolean z2;
        int ordinal;
        fq fqVar2;
        IssueOrPullRequestState issueOrPullRequestState;
        List list;
        int size;
        int i3;
        boolean z3;
        i60.d dVar;
        boolean z4;
        x61.rShadow rVar;
        i60.a aVar2;
        List list2;
        z70.i5 i5Var;
        ArrayList arrayList;
        boolean z5;
        boolean z6;
        boolean z7;
        yz0.h2 h2Var;
        int size2;
        int i4;
        nl nlVar;
        PullRequestReviewDecision pullRequestReviewDecision;
        ArrayList a;
        int i5;
        String str2;
        boolean z8;
        boolean z9;
        ArrayList arrayList2;
        boolean z10;
        String str3;
        boolean z12;
        yz0.c2 c2Var;
        String str4;
        yz0.j2 j2Var3;
        z70.t4 t4Var;
        z70.c5 c5Var;
        z70.c5 c5Var2;
        z70.c5 c5Var3;
        Integer num;
        z70.b5 b5Var;
        z70.t4 t4Var2;
        z70.f4 f4Var;
        int ordinal2;
        IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState;
        List list3;
        Iterator it;
        yz0.m2 m2Var;
        List<i60.c> list4;
        SubscriptionState subscriptionState;
        String str5;
        int i6;
        SubscriptionState subscriptionState2;
        boolean z13;
        SubscriptionState subscriptionState3;
        boolean z14;
        SubscriptionState subscriptionState4;
        int ordinal3;
        String str6;
        IssueOrPullRequestState issueOrPullRequestState2;
        List list5;
        ArrayList arrayList3;
        int size3;
        int i7;
        boolean z15;
        i60.n nVar;
        ArrayList arrayList4;
        x61.rShadow rVar2;
        i60.k kVar;
        boolean z16;
        x61.rShadow rVar3;
        List list6;
        boolean z17;
        yz0.n2 n2Var;
        List<i60.m> list7;
        SubscriptionState subscriptionState5;
        z2 z2Var;
        int i8;
        java.util.ArrayList r13;
        List<ra0.r> list8;
        w80.a2 a2Var;
        String str7;
        a3 a3Var;
        int i9;
        String str8;
        b3 b3Var;
        int i10;
        java.util.ArrayList r2;
        List<w80.u3> list9;
        d3 d3Var;
        int i12;
        String str9;
        e3 e3Var;
        int i13;
        bg bgVar;
        yf yfVar;
        bg bgVar2;
        cg cgVar;
        n4 n4Var;
        int i14;
        switch (this.r) {
            case 0:
                if (cVar instanceof u2) {
                    u2Var = (u2) cVar;
                    int i15 = u2Var.v;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        u2Var.v = i15 - Integer.MIN_VALUE;
                        Object obj2 = u2Var.u;
                        b71.a aVar3 = b71.a.r;
                        i = u2Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            na0.h hVar = (na0.h) obj;
                            na0.i iVar = hVar.b;
                            if (iVar != null) {
                                String str10 = hVar.a.c;
                                w80.l2 l2Var = iVar.c;
                                w80.i2 i2Var = l2Var.c;
                                w80.o2 o2Var = l2Var.d;
                                w80.m2 m2Var2 = o2Var.p;
                                String str11 = o2Var.b;
                                String str12 = o2Var.f;
                                fq fqVar3 = o2Var.g;
                                w80.n2 n2Var2 = o2Var.e;
                                m90.b bVar = l2Var.e;
                                m90.a aVar4 = bVar.e;
                                ev evVar = bVar.c;
                                w80.j2 j2Var4 = i2Var != null ? i2Var.b : null;
                                w80.k2 k2Var = i2Var != null ? i2Var.c : null;
                                boolean z18 = false;
                                j2Var = null;
                                x61.rShadow rVar4 = x61.rShadow.r;
                                if (j2Var4 != null) {
                                    va0.a aVar5 = va0.b.Companion;
                                    SubscriptionState D = a.a.D(evVar);
                                    List list10 = aVar4 != null ? aVar4.a : null;
                                    SubscriptionState D2 = a.a.D(j2Var4.c.c);
                                    w80.c3 c3Var = j2Var4.d;
                                    String str13 = c3Var.c;
                                    aVar5.getClass();
                                    i80.c cVar2 = c3Var.y;
                                    if (fqVar3 == null) {
                                        str5 = str10;
                                        i6 = -1;
                                    } else {
                                        str5 = str10;
                                        i6 = eb0.a.a[fqVar3.ordinal()];
                                    }
                                    boolean z19 = i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4;
                                    int i16 = fqVar3 != null ? eb0.a.a[fqVar3.ordinal()] : -1;
                                    boolean z20 = i16 == 1 || i16 == 2 || i16 == 3;
                                    com.github.service.models.response.a aVar6 = new com.github.service.models.response.a(n2Var2.c, t.q.q(n2Var2.d), (String) null, false, (String) null, 60);
                                    String str14 = n2Var2.b;
                                    boolean z22 = o2Var.d;
                                    SubscriptionState subscriptionState6 = SubscriptionState.IGNORED;
                                    if (D2 == subscriptionState6 || D == subscriptionState6 || ((D == null && D2 == null) || (D == (subscriptionState2 = SubscriptionState.UNSUBSCRIBED) && D2 == subscriptionState2))) {
                                        z13 = z19;
                                    } else {
                                        z13 = z19;
                                        SubscriptionState subscriptionState7 = SubscriptionState.CUSTOM;
                                        if (D != subscriptionState7 || D2 != subscriptionState2) {
                                            if (D != subscriptionState7 || D2 != subscriptionState7) {
                                                z18 = true;
                                            } else if (list10 != null) {
                                                z18 = list10.contains(hc0.z5.u);
                                            }
                                            subscriptionState3 = SubscriptionState.SUBSCRIBED;
                                            if (D == subscriptionState3 || D2 != null) {
                                                z14 = z13;
                                                subscriptionState4 = subscriptionState3;
                                            } else {
                                                z14 = z13;
                                                subscriptionState4 = null;
                                            }
                                            SubscriptionState subscriptionState8 = (D2 == subscriptionState6 || D == subscriptionState3 || D2 == (subscriptionState5 = SubscriptionState.UNSUBSCRIBED)) ? subscriptionState6 : subscriptionState5;
                                            String str15 = c3Var.d;
                                            String str16 = c3Var.e;
                                            int i17 = c3Var.m;
                                            boolean z23 = c3Var.h;
                                            ordinal3 = c3Var.n.ordinal();
                                            if (ordinal3 != 0) {
                                                str6 = str15;
                                                if (ordinal3 == 1) {
                                                    issueOrPullRequestState2 = IssueOrPullRequestState.ISSUE_OPEN;
                                                } else {
                                                    if (ordinal3 != 2) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    issueOrPullRequestState2 = IssueOrPullRequestState.UNKNOWN;
                                                }
                                            } else {
                                                str6 = str15;
                                                issueOrPullRequestState2 = IssueOrPullRequestState.ISSUE_CLOSED;
                                            }
                                            w80.w2 w2Var = c3Var.i;
                                            IssueOrPullRequestState issueOrPullRequestState3 = issueOrPullRequestState2;
                                            com.github.service.models.response.a aVar7 = new com.github.service.models.response.a(w2Var != null ? w2Var.b : "", t.q.q(w2Var != null ? w2Var.c : null), (String) null, false, (String) null, 60);
                                            boolean b = k71.k.b(c3Var.j, Boolean.TRUE);
                                            bb0.b bVar2 = new bb0.b(c3Var.x, c3Var.l, new yz0.a0Shadow(str13));
                                            ArrayList f = sy.c0.f(cVar2, str13);
                                            boolean z24 = cVar2.c;
                                            w80.y2 y2Var = c3Var.o;
                                            bb0.g e = sy.s.e(y2Var != null ? y2Var.c : null);
                                            ArrayList b2 = sy.f0.b(c3Var.A);
                                            List c = sy.pShadow.c(c3Var.B);
                                            list5 = c3Var.p.a;
                                            if (list5 == null) {
                                                list5 = rVar4;
                                            }
                                            ArrayList S = x61.m.S(list5);
                                            arrayList3 = new ArrayList(x61.n.F(S, 10));
                                            size3 = S.size();
                                            i7 = 0;
                                            while (i7 < size3) {
                                                Object obj3 = S.get(i7);
                                                int i18 = i7 + 1;
                                                int i19 = size3;
                                                w80.z2 z2Var2 = (w80.z2) obj3;
                                                String str17 = str13;
                                                ArrayList arrayList5 = S;
                                                w80.a3 a3Var2 = z2Var2.b;
                                                w80.x2 x2Var = z2Var2.a;
                                                bb0.b bVar3 = bVar2;
                                                boolean z25 = z23;
                                                String str18 = str12;
                                                arrayList3.add(new xz0.f(new SimpleLegacyProject(a3Var2.b, a3Var2.a, sy.w.C(a3Var2.c), x2Var != null ? x2Var.a : null), x2Var != null ? x2Var.a : ""));
                                                i7 = i18;
                                                size3 = i19;
                                                str13 = str17;
                                                S = arrayList5;
                                                bVar2 = bVar3;
                                                z23 = z25;
                                                str12 = str18;
                                            }
                                            String str19 = str13;
                                            bb0.b bVar4 = bVar2;
                                            boolean z26 = z23;
                                            String str20 = str12;
                                            boolean z27 = c3Var.g;
                                            String str21 = c3Var.b;
                                            z15 = c3Var.D.b;
                                            int i20 = c3Var.q;
                                            int i22 = c3Var.r;
                                            g70.a aVar8 = c3Var.z;
                                            boolean z28 = aVar8.b;
                                            boolean z29 = aVar8.c;
                                            i60.o oVar = c3Var.C;
                                            nVar = oVar.a;
                                            if (nVar != null || (list7 = nVar.b) == null) {
                                                arrayList4 = arrayList3;
                                                rVar2 = null;
                                            } else {
                                                ArrayList arrayList6 = new ArrayList();
                                                for (i60.m mVar : list7) {
                                                    ArrayList arrayList7 = arrayList3;
                                                    String str22 = mVar != null ? mVar.a : null;
                                                    if (str22 != null) {
                                                        arrayList6.add(str22);
                                                    }
                                                    arrayList3 = arrayList7;
                                                }
                                                arrayList4 = arrayList3;
                                                rVar2 = arrayList6;
                                            }
                                            if (rVar2 == null) {
                                                rVar2 = rVar4;
                                            }
                                            kVar = oVar.b;
                                            if (kVar != null || (list6 = kVar.b) == null) {
                                                z16 = z15;
                                                rVar3 = null;
                                            } else {
                                                ArrayList arrayList8 = new ArrayList();
                                                Iterator it2 = list6.iterator();
                                                while (it2.hasNext()) {
                                                    Iterator it3 = it2;
                                                    i60.l lVar = (i60.l) it2.next();
                                                    if (lVar != null) {
                                                        z70.t1 t1Var = lVar.c;
                                                        z17 = z15;
                                                        n2Var = va0.c.b(t1Var, rVar2.contains(t1Var.a));
                                                    } else {
                                                        z17 = z15;
                                                        n2Var = null;
                                                    }
                                                    if (n2Var != null) {
                                                        arrayList8.add(n2Var);
                                                    }
                                                    z15 = z17;
                                                    it2 = it3;
                                                }
                                                z16 = z15;
                                                rVar3 = arrayList8;
                                            }
                                            if (rVar3 == null) {
                                                rVar3 = rVar4;
                                            }
                                            boolean z30 = c3Var.s;
                                            PullRequestReviewDecision pullRequestReviewDecision2 = PullRequestReviewDecision.UNKNOWN__;
                                            CloseReason N = t.a0.N(c3Var.t);
                                            boolean z32 = c3Var.u;
                                            boolean z33 = c3Var.v;
                                            Boolean bool = c3Var.w;
                                            j2Var3 = new yz0.j2(str5, str20, str11, aVar6, str14, z22, z14, str19, z18, subscriptionState4, subscriptionState8, str6, str16, i17, z26, issueOrPullRequestState3, aVar7, b, bVar4, f, z24, e, b2, c, arrayList4, rVar4, false, z27, str21, z16, z20, i20, i22, z28, z29, rVar3, z30, z32, z33, m2Var2 != null ? m2Var2.a : null, false, null, null, false, false, null, null, null, null, rVar4, rVar4, false, pullRequestReviewDecision2, null, null, 0, false, false, false, null, null, false, false, false, N, bool != null ? bool.booleanValue() : false, null, false, null, null, false, 1073742080);
                                            u2Var2 = u2Var;
                                            aVar = aVar3;
                                        }
                                    }
                                    subscriptionState3 = SubscriptionState.SUBSCRIBED;
                                    if (D == subscriptionState3) {
                                    }
                                    z14 = z13;
                                    subscriptionState4 = subscriptionState3;
                                    if (D2 == subscriptionState6) {
                                        String str152 = c3Var.d;
                                        String str162 = c3Var.e;
                                        int i172 = c3Var.m;
                                        boolean z232 = c3Var.h;
                                        ordinal3 = c3Var.n.ordinal();
                                        if (ordinal3 != 0) {
                                        }
                                        w80.w2 w2Var2 = c3Var.i;
                                        IssueOrPullRequestState issueOrPullRequestState32 = issueOrPullRequestState2;
                                        com.github.service.models.response.a aVar72 = new com.github.service.models.response.a(w2Var2 != null ? w2Var2.b : "", t.q.q(w2Var2 != null ? w2Var2.c : null), (String) null, false, (String) null, 60);
                                        boolean b3 = k71.k.b(c3Var.j, Boolean.TRUE);
                                        bb0.b bVar22 = new bb0.b(c3Var.x, c3Var.l, new yz0.a0Shadow(str13));
                                        ArrayList f2 = sy.c0.f(cVar2, str13);
                                        boolean z242 = cVar2.c;
                                        w80.y2 y2Var2 = c3Var.o;
                                        bb0.g e2 = sy.s.e(y2Var2 != null ? y2Var2.c : null);
                                        ArrayList b22 = sy.f0.b(c3Var.A);
                                        List c2 = sy.pShadow.c(c3Var.B);
                                        list5 = c3Var.p.a;
                                        if (list5 == null) {
                                        }
                                        ArrayList S2 = x61.m.S(list5);
                                        arrayList3 = new ArrayList(x61.n.F(S2, 10));
                                        size3 = S2.size();
                                        i7 = 0;
                                        while (i7 < size3) {
                                        }
                                        String str192 = str13;
                                        bb0.b bVar42 = bVar22;
                                        boolean z262 = z232;
                                        String str202 = str12;
                                        boolean z272 = c3Var.g;
                                        String str212 = c3Var.b;
                                        z15 = c3Var.D.b;
                                        int i202 = c3Var.q;
                                        int i222 = c3Var.r;
                                        g70.a aVar82 = c3Var.z;
                                        boolean z282 = aVar82.b;
                                        boolean z292 = aVar82.c;
                                        i60.o oVar2 = c3Var.C;
                                        nVar = oVar2.a;
                                        if (nVar != null) {
                                        }
                                        arrayList4 = arrayList3;
                                        rVar2 = null;
                                        if (rVar2 == null) {
                                        }
                                        kVar = oVar2.b;
                                        if (kVar != null) {
                                        }
                                        z16 = z15;
                                        rVar3 = null;
                                        if (rVar3 == null) {
                                        }
                                        boolean z302 = c3Var.s;
                                        PullRequestReviewDecision pullRequestReviewDecision22 = PullRequestReviewDecision.UNKNOWN__;
                                        CloseReason N2 = t.a0.N(c3Var.t);
                                        boolean z322 = c3Var.u;
                                        boolean z332 = c3Var.v;
                                        Boolean bool2 = c3Var.w;
                                        j2Var3 = new yz0.j2(str5, str202, str11, aVar6, str14, z22, z14, str192, z18, subscriptionState4, subscriptionState8, str6, str162, i172, z262, issueOrPullRequestState32, aVar72, b3, bVar42, f2, z242, e2, b22, c2, arrayList4, rVar4, false, z272, str212, z16, z20, i202, i222, z282, z292, rVar3, z302, z322, z332, m2Var2 != null ? m2Var2.a : null, false, null, null, false, false, null, null, null, null, rVar4, rVar4, false, pullRequestReviewDecision22, null, null, 0, false, false, false, null, null, false, false, false, N2, bool2 != null ? bool2.booleanValue() : false, null, false, null, null, false, 1073742080);
                                        u2Var2 = u2Var;
                                        aVar = aVar3;
                                    }
                                    String str1522 = c3Var.d;
                                    String str1622 = c3Var.e;
                                    int i1722 = c3Var.m;
                                    boolean z2322 = c3Var.h;
                                    ordinal3 = c3Var.n.ordinal();
                                    if (ordinal3 != 0) {
                                    }
                                    w80.w2 w2Var22 = c3Var.i;
                                    IssueOrPullRequestState issueOrPullRequestState322 = issueOrPullRequestState2;
                                    com.github.service.models.response.a aVar722 = new com.github.service.models.response.a(w2Var22 != null ? w2Var22.b : "", t.q.q(w2Var22 != null ? w2Var22.c : null), (String) null, false, (String) null, 60);
                                    boolean b32 = k71.k.b(c3Var.j, Boolean.TRUE);
                                    bb0.b bVar222 = new bb0.b(c3Var.x, c3Var.l, new yz0.a0Shadow(str13));
                                    ArrayList f22 = sy.c0.f(cVar2, str13);
                                    boolean z2422 = cVar2.c;
                                    w80.y2 y2Var22 = c3Var.o;
                                    bb0.g e22 = sy.s.e(y2Var22 != null ? y2Var22.c : null);
                                    ArrayList b222 = sy.f0.b(c3Var.A);
                                    List c22 = sy.pShadow.c(c3Var.B);
                                    list5 = c3Var.p.a;
                                    if (list5 == null) {
                                    }
                                    ArrayList S22 = x61.m.S(list5);
                                    arrayList3 = new ArrayList(x61.n.F(S22, 10));
                                    size3 = S22.size();
                                    i7 = 0;
                                    while (i7 < size3) {
                                    }
                                    String str1922 = str13;
                                    bb0.b bVar422 = bVar222;
                                    boolean z2622 = z2322;
                                    String str2022 = str12;
                                    boolean z2722 = c3Var.g;
                                    String str2122 = c3Var.b;
                                    z15 = c3Var.D.b;
                                    int i2022 = c3Var.q;
                                    int i2222 = c3Var.r;
                                    g70.a aVar822 = c3Var.z;
                                    boolean z2822 = aVar822.b;
                                    boolean z2922 = aVar822.c;
                                    i60.o oVar22 = c3Var.C;
                                    nVar = oVar22.a;
                                    if (nVar != null) {
                                    }
                                    arrayList4 = arrayList3;
                                    rVar2 = null;
                                    if (rVar2 == null) {
                                    }
                                    kVar = oVar22.b;
                                    if (kVar != null) {
                                    }
                                    z16 = z15;
                                    rVar3 = null;
                                    if (rVar3 == null) {
                                    }
                                    boolean z3022 = c3Var.s;
                                    PullRequestReviewDecision pullRequestReviewDecision222 = PullRequestReviewDecision.UNKNOWN__;
                                    CloseReason N22 = t.a0.N(c3Var.t);
                                    boolean z3222 = c3Var.u;
                                    boolean z3322 = c3Var.v;
                                    Boolean bool22 = c3Var.w;
                                    j2Var3 = new yz0.j2(str5, str2022, str11, aVar6, str14, z22, z14, str1922, z18, subscriptionState4, subscriptionState8, str6, str1622, i1722, z2622, issueOrPullRequestState322, aVar722, b32, bVar422, f22, z2422, e22, b222, c22, arrayList4, rVar4, false, z2722, str2122, z16, z20, i2022, i2222, z2822, z2922, rVar3, z3022, z3222, z3322, m2Var2 != null ? m2Var2.a : null, false, null, null, false, false, null, null, null, null, rVar4, rVar4, false, pullRequestReviewDecision222, null, null, 0, false, false, false, null, null, false, false, false, N22, bool22 != null ? bool22.booleanValue() : false, null, false, null, null, false, 1073742080);
                                    u2Var2 = u2Var;
                                    aVar = aVar3;
                                } else if (k2Var != null) {
                                    va0.a aVar9 = va0.b.Companion;
                                    SubscriptionState D3 = a.a.D(evVar);
                                    List list11 = aVar4 != null ? aVar4.a : null;
                                    SubscriptionState D4 = a.a.D(k2Var.c.c);
                                    z70.l5 l5Var = k2Var.d;
                                    String str23 = l5Var.b;
                                    String str24 = l5Var.c;
                                    aVar9.getClass();
                                    ff ffVar = l5Var.u;
                                    z70.k4 k4Var = l5Var.I;
                                    z70.l4 l4Var = l5Var.H;
                                    z70.e5 e5Var = l5Var.G;
                                    aVar = aVar3;
                                    z70.i4 i4Var = l5Var.C;
                                    i80.c cVar3 = l5Var.S;
                                    u2Var2 = u2Var;
                                    z70.b4 b4Var2 = l5Var.A;
                                    z70.g4 g4Var = l5Var.L;
                                    List list12 = g4Var.c;
                                    aa0.a aVar10 = l5Var.X;
                                    if (fqVar3 == null) {
                                        b4Var = b4Var2;
                                        i2 = -1;
                                    } else {
                                        b4Var = b4Var2;
                                        i2 = eb0.a.a[fqVar3.ordinal()];
                                    }
                                    boolean z34 = i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
                                    int i23 = fqVar3 == null ? -1 : eb0.a.a[fqVar3.ordinal()];
                                    boolean z35 = z34;
                                    boolean z36 = i23 == 1 || i23 == 2 || i23 == 3;
                                    int i24 = fqVar3 == null ? -1 : eb0.a.a[fqVar3.ordinal()];
                                    boolean z37 = i24 == 1 || i24 == 2 || i24 == 3;
                                    com.github.service.models.response.a aVar11 = new com.github.service.models.response.a(n2Var2.c, t.q.q(n2Var2.d), (String) null, false, (String) null, 60);
                                    String str25 = n2Var2.b;
                                    boolean z38 = o2Var.d;
                                    SubscriptionState subscriptionState9 = SubscriptionState.IGNORED;
                                    if (D4 == subscriptionState9 || D3 == subscriptionState9 || (D3 == null && D4 == null)) {
                                        str = str25;
                                    } else {
                                        str = str25;
                                        SubscriptionState subscriptionState10 = SubscriptionState.UNSUBSCRIBED;
                                        if (D3 != subscriptionState10 || D4 != subscriptionState10) {
                                            z = z38;
                                            SubscriptionState subscriptionState11 = SubscriptionState.CUSTOM;
                                            if (D3 != subscriptionState11 || D4 != subscriptionState10) {
                                                if (D3 != subscriptionState11 || D4 != subscriptionState11) {
                                                    fqVar = fqVar3;
                                                    z2 = true;
                                                } else if (list11 != null) {
                                                    z2 = list11.contains(hc0.z5.v);
                                                    fqVar = fqVar3;
                                                }
                                                SubscriptionState subscriptionState12 = SubscriptionState.SUBSCRIBED;
                                                SubscriptionState subscriptionState13 = (D3 == subscriptionState12 || D4 != null) ? subscriptionState12 : null;
                                                if (D4 != subscriptionState9 && D3 != subscriptionState12 && D4 != (subscriptionState = SubscriptionState.UNSUBSCRIBED)) {
                                                    subscriptionState9 = subscriptionState;
                                                }
                                                String str26 = l5Var.g;
                                                String str27 = l5Var.h;
                                                int i25 = l5Var.p;
                                                boolean z39 = l5Var.l;
                                                ordinal = l5Var.q.ordinal();
                                                if (ordinal != 0) {
                                                    fqVar2 = fqVar;
                                                    if (ordinal == 1) {
                                                        issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
                                                    } else if (ordinal == 2) {
                                                        issueOrPullRequestState = l5Var.y ? IssueOrPullRequestState.PULL_REQUEST_DRAFT : IssueOrPullRequestState.PULL_REQUEST_OPEN;
                                                    } else {
                                                        if (ordinal != 3) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
                                                    }
                                                } else {
                                                    fqVar2 = fqVar;
                                                    issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
                                                }
                                                z70.a4 a4Var = l5Var.m;
                                                IssueOrPullRequestState issueOrPullRequestState4 = issueOrPullRequestState;
                                                com.github.service.models.response.a aVar12 = new com.github.service.models.response.a(a4Var != null ? a4Var.b : "", t.q.q(a4Var != null ? a4Var.c : null), (String) null, false, (String) null, 60);
                                                boolean b4 = k71.k.b(l5Var.n, Boolean.TRUE);
                                                bb0.b bVar5 = new bb0.b(l5Var.R, str23, new yz0.b0(str24));
                                                ArrayList f3 = sy.c0.f(cVar3, str24);
                                                boolean z40 = cVar3.c;
                                                z70.o4 o4Var = l5Var.E;
                                                bb0.g e3 = sy.s.e(o4Var != null ? o4Var.c : null);
                                                ArrayList b5 = sy.f0.b(l5Var.U);
                                                List c3 = sy.pShadow.c(l5Var.V);
                                                list = l5Var.F.a;
                                                if (list == null) {
                                                    list = rVar4;
                                                }
                                                ArrayList S3 = x61.m.S(list);
                                                ArrayList arrayList9 = new ArrayList(x61.n.F(S3, 10));
                                                size = S3.size();
                                                i3 = 0;
                                                while (i3 < size) {
                                                    Object obj4 = S3.get(i3);
                                                    int i26 = i3 + 1;
                                                    ArrayList arrayList10 = S3;
                                                    z70.p4 p4Var = (z70.p4) obj4;
                                                    int i27 = size;
                                                    SubscriptionState subscriptionState14 = subscriptionState9;
                                                    z70.z4 z4Var = p4Var.b;
                                                    z70.e4 e4Var = p4Var.a;
                                                    int i28 = i25;
                                                    boolean z42 = z39;
                                                    String str28 = str23;
                                                    arrayList9.add(new xz0.f(new SimpleLegacyProject(z4Var.b, z4Var.a, sy.w.C(z4Var.c), e4Var != null ? e4Var.a : null), e4Var != null ? e4Var.a : ""));
                                                    size = i27;
                                                    S3 = arrayList10;
                                                    i3 = i26;
                                                    subscriptionState9 = subscriptionState14;
                                                    i25 = i28;
                                                    z39 = z42;
                                                    str23 = str28;
                                                }
                                                SubscriptionState subscriptionState15 = subscriptionState9;
                                                int i29 = i25;
                                                boolean z43 = z39;
                                                String str29 = str23;
                                                z3 = l5Var.j;
                                                boolean z44 = l5Var.k;
                                                boolean z45 = aVar10.b;
                                                g70.a aVar13 = l5Var.T;
                                                boolean z46 = aVar13.b;
                                                boolean z47 = aVar13.c;
                                                i60.e eVar = l5Var.W;
                                                dVar = eVar.b;
                                                if (dVar != null || (list4 = dVar.a) == null) {
                                                    z4 = z3;
                                                    rVar = null;
                                                } else {
                                                    ArrayList arrayList11 = new ArrayList();
                                                    for (i60.c cVar4 : list4) {
                                                        boolean z48 = z3;
                                                        String str30 = cVar4 != null ? cVar4.a : null;
                                                        if (str30 != null) {
                                                            arrayList11.add(str30);
                                                        }
                                                        z3 = z48;
                                                    }
                                                    z4 = z3;
                                                    rVar = arrayList11;
                                                }
                                                if (rVar == null) {
                                                    rVar = rVar4;
                                                }
                                                aVar2 = eVar.c;
                                                if (aVar2 != null || (list3 = aVar2.a) == null) {
                                                    list2 = 0;
                                                } else {
                                                    list2 = new ArrayList();
                                                    Iterator it4 = list3.iterator();
                                                    while (it4.hasNext()) {
                                                        i60.b bVar6 = (i60.b) it4.next();
                                                        if (bVar6 != null) {
                                                            w50.e0 e0Var = bVar6.c;
                                                            it = it4;
                                                            m2Var = va0.c.a(e0Var, rVar.contains(e0Var.a));
                                                        } else {
                                                            it = it4;
                                                            m2Var = null;
                                                        }
                                                        if (m2Var != null) {
                                                            list2.add(m2Var);
                                                        }
                                                        it4 = it;
                                                    }
                                                }
                                                if (list2 == 0) {
                                                    list2 = rVar4;
                                                }
                                                boolean z49 = l5Var.N;
                                                boolean z50 = l5Var.y;
                                                int i30 = l5Var.r;
                                                int i32 = l5Var.s;
                                                int i33 = l5Var.t;
                                                boolean z52 = l5Var.Y.b != null;
                                                i5Var = l5Var.M;
                                                if (i5Var != null) {
                                                    if (list12 != null) {
                                                        arrayList = arrayList9;
                                                        z70.t4 t4Var3 = (z70.t4) x61.m.f0(list12);
                                                        if (t4Var3 != null) {
                                                            f4Var = t4Var3.b;
                                                            z5 = z44;
                                                            z6 = z45;
                                                            ordinal2 = i5Var.a.ordinal();
                                                            if (ordinal2 == 0) {
                                                                z7 = z47;
                                                                if (ordinal2 == 1) {
                                                                    issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.CHANGES_REQUESTED;
                                                                } else if (ordinal2 == 2) {
                                                                    issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.COMMENTED;
                                                                } else if (ordinal2 == 3) {
                                                                    issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.DISMISSED;
                                                                } else if (ordinal2 == 4) {
                                                                    issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.PENDING;
                                                                } else {
                                                                    if (ordinal2 != 5) {
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                    issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.UNKNOWN;
                                                                }
                                                            } else {
                                                                z7 = z47;
                                                                issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.APPROVED;
                                                            }
                                                            ZonedDateTime zonedDateTime = i5Var.b;
                                                            h2Var = new yz0.h2(issueOrPullRequest$ReviewerReviewState, zonedDateTime, f4Var == null && f4Var.b.isAfter(zonedDateTime));
                                                        }
                                                    } else {
                                                        arrayList = arrayList9;
                                                    }
                                                    f4Var = null;
                                                    z5 = z44;
                                                    z6 = z45;
                                                    ordinal2 = i5Var.a.ordinal();
                                                    if (ordinal2 == 0) {
                                                    }
                                                    ZonedDateTime zonedDateTime2 = i5Var.b;
                                                    h2Var = new yz0.h2(issueOrPullRequest$ReviewerReviewState, zonedDateTime2, f4Var == null && f4Var.b.isAfter(zonedDateTime2));
                                                } else {
                                                    arrayList = arrayList9;
                                                    z5 = z44;
                                                    z6 = z45;
                                                    z7 = z47;
                                                    h2Var = null;
                                                }
                                                yz0.a2 a2Var2 = new yz0.a2(i30, i32, i33, z52, h2Var);
                                                yz0.z1 z1Var = (list12 != null || (t4Var2 = (z70.t4) x61.m.f0(list12)) == null) ? null : new yz0.z1(g4Var.b, t4Var2.b.b);
                                                String str31 = i4Var != null ? i4Var.a : null;
                                                yz0.c2 c2Var2 = new yz0.c2(l5Var.B, l5Var.D);
                                                fq fqVar4 = fqVar2;
                                                ArrayList a2 = va0.a.a(e5Var, l4Var, k4Var);
                                                ArrayList S4 = x61.m.S(l5Var.J);
                                                String str32 = str31;
                                                ArrayList arrayList12 = new ArrayList(x61.n.F(S4, 10));
                                                size2 = S4.size();
                                                yz0.z1 z1Var2 = z1Var;
                                                i4 = 0;
                                                while (i4 < size2) {
                                                    Object obj5 = S4.get(i4);
                                                    int i34 = i4 + 1;
                                                    int i35 = size2;
                                                    z70.h5 h5Var = (z70.h5) obj5;
                                                    boolean z53 = h5Var.a;
                                                    boolean z54 = h5Var.b;
                                                    z70.y4 y4Var = h5Var.c.c;
                                                    arrayList12.add(new yz0.g2(z53, z54, y4Var.b, yz0.f2.d, new com.github.service.models.response.a(y4Var.c, t.q.q(y4Var.d), (String) null, false, (String) null, 60)));
                                                    i4 = i34;
                                                    size2 = i35;
                                                }
                                                nlVar = l5Var.x;
                                                if (nlVar != null) {
                                                    int ordinal4 = nlVar.ordinal();
                                                    if (ordinal4 != 0) {
                                                        if (ordinal4 != 1) {
                                                            if (ordinal4 != 2) {
                                                                if (ordinal4 != 3) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                pullRequestReviewDecision = PullRequestReviewDecision.UNKNOWN__;
                                                                break;
                                                            } else {
                                                                pullRequestReviewDecision = PullRequestReviewDecision.REVIEW_REQUIRED;
                                                                break;
                                                            }
                                                        } else {
                                                            pullRequestReviewDecision = PullRequestReviewDecision.CHANGES_REQUESTED;
                                                            break;
                                                        }
                                                    } else {
                                                        pullRequestReviewDecision = PullRequestReviewDecision.APPROVED;
                                                        break;
                                                    }
                                                }
                                                pullRequestReviewDecision = PullRequestReviewDecision.UNKNOWN__;
                                                PullRequestReviewDecision pullRequestReviewDecision3 = pullRequestReviewDecision;
                                                z70.m4 m4Var = l5Var.w;
                                                z70.b bVar7 = l5Var.Z;
                                                MergeStateStatus g0 = com.google.android.gms.internal.measurement.d5.g0(ffVar);
                                                ArrayList K = x61.l.K(new PullRequestMergeMethod[]{o2Var.j ? PullRequestMergeMethod.MERGE : null, o2Var.h ? PullRequestMergeMethod.SQUASH : null, o2Var.i ? PullRequestMergeMethod.REBASE : null});
                                                boolean z55 = !((i4Var != null || (b5Var = i4Var.b) == null) ? true : b5Var.a);
                                                PullRequestMergeMethod P = i21.a.P(o2Var.l);
                                                String str33 = o2Var.k;
                                                List list13 = o2Var.m;
                                                z70.a aVar14 = bVar7.d;
                                                yz0.i iVar2 = aVar14 != null ? new yz0.i(i21.a.P(aVar14.a)) : null;
                                                boolean z56 = bVar7.c;
                                                boolean z57 = bVar7.b;
                                                boolean z58 = l5Var.O;
                                                z70.n4 n4Var2 = l5Var.v;
                                                h01.h hVar2 = new h01.h(g0, K, z55, P, str33, list13, iVar2, z56, z57, z58, n4Var2 != null ? n4Var2.b : null, m4Var != null ? m4Var.a : null, m4Var != null ? m4Var.b : null, null, null);
                                                h01.c bVar8 = new cb0.b(l5Var);
                                                a = va0.a.a(e5Var, l4Var, k4Var);
                                                z70.b4 b4Var3 = b4Var;
                                                int intValue = (b4Var != null || (c5Var3 = b4Var3.a) == null || (num = c5Var3.a) == null) ? 0 : num.intValue();
                                                boolean z59 = (b4Var3 != null || (c5Var2 = b4Var3.a) == null) ? false : c5Var2.b;
                                                if (a.isEmpty()) {
                                                    i5 = 0;
                                                } else {
                                                    int size4 = a.size();
                                                    i5 = 0;
                                                    int i36 = 0;
                                                    while (i36 < size4) {
                                                        Object obj6 = a.get(i36);
                                                        i36++;
                                                        yz0.e2 e2Var = (yz0.e2) obj6;
                                                        h01.c cVar5 = bVar8;
                                                        IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState2 = e2Var.b;
                                                        ArrayList arrayList13 = a;
                                                        boolean z60 = e2Var.c;
                                                        IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState3 = IssueOrPullRequest$ReviewerReviewState.APPROVED;
                                                        if (issueOrPullRequest$ReviewerReviewState2 != issueOrPullRequest$ReviewerReviewState3 || !z60) {
                                                            yz0.d2 d2Var = e2Var.g;
                                                            if ((d2Var != null ? d2Var.c : null) != issueOrPullRequest$ReviewerReviewState3) {
                                                                continue;
                                                            } else if (!z60) {
                                                                continue;
                                                            }
                                                            a = arrayList13;
                                                            bVar8 = cVar5;
                                                        }
                                                        i5++;
                                                        if (i5 < 0) {
                                                            sy.d0Shadow.w();
                                                            throw null;
                                                        }
                                                        a = arrayList13;
                                                        bVar8 = cVar5;
                                                    }
                                                }
                                                h01.c cVar6 = bVar8;
                                                int i37 = intValue > 0 ? z59 ? (i5 * 100) / (intValue + i5) : (i5 * 100) / intValue : 0;
                                                boolean z62 = !((b4Var3 != null || (c5Var = b4Var3.a) == null) ? z35 : c5Var.c) && z6;
                                                boolean z63 = o2Var.n;
                                                if (z6) {
                                                    int i38 = fqVar4 != null ? eb0.a.a[fqVar4.ordinal()] : -1;
                                                    if (i38 == 1 || i38 == 2 || i38 == 3) {
                                                        str2 = str12;
                                                        z8 = z7;
                                                        z9 = true;
                                                        String str34 = (list12 != null || (t4Var = (z70.t4) x61.m.W(list12)) == null) ? null : t4Var.b.a;
                                                        String str35 = l5Var.d;
                                                        boolean z64 = o2Var.o;
                                                        boolean z65 = l5Var.P;
                                                        boolean z66 = l5Var.Q;
                                                        z70.c4 c4Var = l5Var.f;
                                                        String str36 = c4Var == null ? c4Var.b : null;
                                                        z70.j4 j4Var = l5Var.e;
                                                        String str37 = j4Var == null ? j4Var.b : null;
                                                        boolean z67 = ffVar != ff.t && z6;
                                                        if (m2Var2 == null) {
                                                            arrayList2 = arrayList;
                                                            z10 = z62;
                                                            str3 = str11;
                                                            z12 = z43;
                                                            c2Var = c2Var2;
                                                            str4 = m2Var2.a;
                                                        } else {
                                                            arrayList2 = arrayList;
                                                            z10 = z62;
                                                            str3 = str11;
                                                            z12 = z43;
                                                            c2Var = c2Var2;
                                                            str4 = null;
                                                        }
                                                        j2Var3 = new yz0.j2(str10, str2, str3, aVar11, str, z, z35, str24, z2, subscriptionState13, subscriptionState15, str26, str27, i29, z12, issueOrPullRequestState4, aVar12, b4, bVar5, f3, z40, e3, b5, c3, arrayList2, rVar4, z4, z5, str29, z6, z37, 0, 0, z46, z8, list2, z49, z65, z66, str4, false, str36, str37, z36, z50, a2Var2, z1Var2, str32, c2Var, a2, arrayList12, true, pullRequestReviewDecision3, hVar2, cVar6, i37, z10, z63, z9, str34, str35, z64, false, z67, null, false, null, false, null, null, false, 1073742080);
                                                    }
                                                }
                                                str2 = str12;
                                                z8 = z7;
                                                z9 = false;
                                                if (list12 != null) {
                                                }
                                                String str352 = l5Var.d;
                                                boolean z642 = o2Var.o;
                                                boolean z652 = l5Var.P;
                                                boolean z662 = l5Var.Q;
                                                z70.c4 c4Var2 = l5Var.f;
                                                if (c4Var2 == null) {
                                                }
                                                z70.j4 j4Var2 = l5Var.e;
                                                if (j4Var2 == null) {
                                                }
                                                if (ffVar != ff.t) {
                                                }
                                                if (m2Var2 == null) {
                                                }
                                                j2Var3 = new yz0.j2(str10, str2, str3, aVar11, str, z, z35, str24, z2, subscriptionState13, subscriptionState15, str26, str27, i29, z12, issueOrPullRequestState4, aVar12, b4, bVar5, f3, z40, e3, b5, c3, arrayList2, rVar4, z4, z5, str29, z6, z37, 0, 0, z46, z8, list2, z49, z652, z662, str4, false, str36, str37, z36, z50, a2Var2, z1Var2, str32, c2Var, a2, arrayList12, true, pullRequestReviewDecision3, hVar2, cVar6, i37, z10, z63, z9, str34, str352, z642, false, z67, null, false, null, false, null, null, false, 1073742080);
                                            }
                                            fqVar = fqVar3;
                                            z2 = false;
                                            SubscriptionState subscriptionState122 = SubscriptionState.SUBSCRIBED;
                                            if (D3 == subscriptionState122) {
                                            }
                                            if (D4 != subscriptionState9) {
                                                subscriptionState9 = subscriptionState;
                                            }
                                            String str262 = l5Var.g;
                                            String str272 = l5Var.h;
                                            int i252 = l5Var.p;
                                            boolean z392 = l5Var.l;
                                            ordinal = l5Var.q.ordinal();
                                            if (ordinal != 0) {
                                            }
                                            z70.a4 a4Var2 = l5Var.m;
                                            IssueOrPullRequestState issueOrPullRequestState42 = issueOrPullRequestState;
                                            com.github.service.models.response.a aVar122 = new com.github.service.models.response.a(a4Var2 != null ? a4Var2.b : "", t.q.q(a4Var2 != null ? a4Var2.c : null), (String) null, false, (String) null, 60);
                                            boolean b42 = k71.k.b(l5Var.n, Boolean.TRUE);
                                            bb0.b bVar52 = new bb0.b(l5Var.R, str23, new yz0.b0(str24));
                                            ArrayList f32 = sy.c0.f(cVar3, str24);
                                            boolean z402 = cVar3.c;
                                            z70.o4 o4Var2 = l5Var.E;
                                            bb0.g e32 = sy.s.e(o4Var2 != null ? o4Var2.c : null);
                                            ArrayList b52 = sy.f0.b(l5Var.U);
                                            List c32 = sy.pShadow.c(l5Var.V);
                                            list = l5Var.F.a;
                                            if (list == null) {
                                            }
                                            ArrayList S32 = x61.m.S(list);
                                            ArrayList arrayList92 = new ArrayList(x61.n.F(S32, 10));
                                            size = S32.size();
                                            i3 = 0;
                                            while (i3 < size) {
                                            }
                                            SubscriptionState subscriptionState152 = subscriptionState9;
                                            int i292 = i252;
                                            boolean z432 = z392;
                                            String str292 = str23;
                                            z3 = l5Var.j;
                                            boolean z442 = l5Var.k;
                                            boolean z452 = aVar10.b;
                                            g70.a aVar132 = l5Var.T;
                                            boolean z462 = aVar132.b;
                                            boolean z472 = aVar132.c;
                                            i60.e eVar2 = l5Var.W;
                                            dVar = eVar2.b;
                                            if (dVar != null) {
                                            }
                                            z4 = z3;
                                            rVar = null;
                                            if (rVar == null) {
                                            }
                                            aVar2 = eVar2.c;
                                            if (aVar2 != null) {
                                            }
                                            list2 = 0;
                                            if (list2 == 0) {
                                            }
                                            boolean z492 = l5Var.N;
                                            boolean z502 = l5Var.y;
                                            int i302 = l5Var.r;
                                            int i322 = l5Var.s;
                                            int i332 = l5Var.t;
                                            if (l5Var.Y.b != null) {
                                            }
                                            i5Var = l5Var.M;
                                            if (i5Var != null) {
                                            }
                                            yz0.a2 a2Var22 = new yz0.a2(i302, i322, i332, z52, h2Var);
                                            if (list12 != null) {
                                            }
                                            if (i4Var != null) {
                                            }
                                            yz0.c2 c2Var22 = new yz0.c2(l5Var.B, l5Var.D);
                                            fq fqVar42 = fqVar2;
                                            ArrayList a22 = va0.a.a(e5Var, l4Var, k4Var);
                                            ArrayList S42 = x61.m.S(l5Var.J);
                                            String str322 = str31;
                                            ArrayList arrayList122 = new ArrayList(x61.n.F(S42, 10));
                                            size2 = S42.size();
                                            yz0.z1 z1Var22 = z1Var;
                                            i4 = 0;
                                            while (i4 < size2) {
                                            }
                                            nlVar = l5Var.x;
                                            if (nlVar != null) {
                                            }
                                            pullRequestReviewDecision = PullRequestReviewDecision.UNKNOWN__;
                                            PullRequestReviewDecision pullRequestReviewDecision32 = pullRequestReviewDecision;
                                            z70.m4 m4Var2 = l5Var.w;
                                            z70.b bVar72 = l5Var.Z;
                                            MergeStateStatus g02 = com.google.android.gms.internal.measurement.d5.g0(ffVar);
                                            ArrayList K2 = x61.l.K(new PullRequestMergeMethod[]{o2Var.j ? PullRequestMergeMethod.MERGE : null, o2Var.h ? PullRequestMergeMethod.SQUASH : null, o2Var.i ? PullRequestMergeMethod.REBASE : null});
                                            boolean z552 = !((i4Var != null || (b5Var = i4Var.b) == null) ? true : b5Var.a);
                                            PullRequestMergeMethod P2 = i21.a.P(o2Var.l);
                                            String str332 = o2Var.k;
                                            List list132 = o2Var.m;
                                            z70.a aVar142 = bVar72.d;
                                            if (aVar142 != null) {
                                            }
                                            boolean z562 = bVar72.c;
                                            boolean z572 = bVar72.b;
                                            boolean z582 = l5Var.O;
                                            z70.n4 n4Var22 = l5Var.v;
                                            h01.h hVar22 = new h01.h(g02, K2, z552, P2, str332, list132, iVar2, z562, z572, z582, n4Var22 != null ? n4Var22.b : null, m4Var2 != null ? m4Var2.a : null, m4Var2 != null ? m4Var2.b : null, null, null);
                                            h01.c bVar82 = new cb0.b(l5Var);
                                            a = va0.a.a(e5Var, l4Var, k4Var);
                                            z70.b4 b4Var32 = b4Var;
                                            if (b4Var != null) {
                                            }
                                            if (b4Var32 != null) {
                                            }
                                            if (a.isEmpty()) {
                                            }
                                            h01.c cVar62 = bVar82;
                                            if (intValue > 0) {
                                            }
                                            if ((b4Var32 != null || (c5Var = b4Var32.a) == null) ? z35 : c5Var.c) {
                                            }
                                            boolean z632 = o2Var.n;
                                            if (z6) {
                                            }
                                            str2 = str12;
                                            z8 = z7;
                                            z9 = false;
                                            if (list12 != null) {
                                            }
                                            String str3522 = l5Var.d;
                                            boolean z6422 = o2Var.o;
                                            boolean z6522 = l5Var.P;
                                            boolean z6622 = l5Var.Q;
                                            z70.c4 c4Var22 = l5Var.f;
                                            if (c4Var22 == null) {
                                            }
                                            z70.j4 j4Var22 = l5Var.e;
                                            if (j4Var22 == null) {
                                            }
                                            if (ffVar != ff.t) {
                                            }
                                            if (m2Var2 == null) {
                                            }
                                            j2Var3 = new yz0.j2(str10, str2, str3, aVar11, str, z, z35, str24, z2, subscriptionState13, subscriptionState152, str262, str272, i292, z12, issueOrPullRequestState42, aVar122, b42, bVar52, f32, z402, e32, b52, c32, arrayList2, rVar4, z4, z5, str292, z6, z37, 0, 0, z462, z8, list2, z492, z6522, z6622, str4, false, str36, str37, z36, z502, a2Var22, z1Var22, str322, c2Var, a22, arrayList122, true, pullRequestReviewDecision32, hVar22, cVar62, i37, z10, z632, z9, str34, str3522, z6422, false, z67, null, false, null, false, null, null, false, 1073742080);
                                        }
                                    }
                                    z = z38;
                                    fqVar = fqVar3;
                                    z2 = false;
                                    SubscriptionState subscriptionState1222 = SubscriptionState.SUBSCRIBED;
                                    if (D3 == subscriptionState1222) {
                                    }
                                    if (D4 != subscriptionState9) {
                                    }
                                    String str2622 = l5Var.g;
                                    String str2722 = l5Var.h;
                                    int i2522 = l5Var.p;
                                    boolean z3922 = l5Var.l;
                                    ordinal = l5Var.q.ordinal();
                                    if (ordinal != 0) {
                                    }
                                    z70.a4 a4Var22 = l5Var.m;
                                    IssueOrPullRequestState issueOrPullRequestState422 = issueOrPullRequestState;
                                    com.github.service.models.response.a aVar1222 = new com.github.service.models.response.a(a4Var22 != null ? a4Var22.b : "", t.q.q(a4Var22 != null ? a4Var22.c : null), (String) null, false, (String) null, 60);
                                    boolean b422 = k71.k.b(l5Var.n, Boolean.TRUE);
                                    bb0.b bVar522 = new bb0.b(l5Var.R, str23, new yz0.b0(str24));
                                    ArrayList f322 = sy.c0.f(cVar3, str24);
                                    boolean z4022 = cVar3.c;
                                    z70.o4 o4Var22 = l5Var.E;
                                    bb0.g e322 = sy.s.e(o4Var22 != null ? o4Var22.c : null);
                                    ArrayList b522 = sy.f0.b(l5Var.U);
                                    List c322 = sy.pShadow.c(l5Var.V);
                                    list = l5Var.F.a;
                                    if (list == null) {
                                    }
                                    ArrayList S322 = x61.m.S(list);
                                    ArrayList arrayList922 = new ArrayList(x61.n.F(S322, 10));
                                    size = S322.size();
                                    i3 = 0;
                                    while (i3 < size) {
                                    }
                                    SubscriptionState subscriptionState1522 = subscriptionState9;
                                    int i2922 = i2522;
                                    boolean z4322 = z3922;
                                    String str2922 = str23;
                                    z3 = l5Var.j;
                                    boolean z4422 = l5Var.k;
                                    boolean z4522 = aVar10.b;
                                    g70.a aVar1322 = l5Var.T;
                                    boolean z4622 = aVar1322.b;
                                    boolean z4722 = aVar1322.c;
                                    i60.e eVar22 = l5Var.W;
                                    dVar = eVar22.b;
                                    if (dVar != null) {
                                    }
                                    z4 = z3;
                                    rVar = null;
                                    if (rVar == null) {
                                    }
                                    aVar2 = eVar22.c;
                                    if (aVar2 != null) {
                                    }
                                    list2 = 0;
                                    if (list2 == 0) {
                                    }
                                    boolean z4922 = l5Var.N;
                                    boolean z5022 = l5Var.y;
                                    int i3022 = l5Var.r;
                                    int i3222 = l5Var.s;
                                    int i3322 = l5Var.t;
                                    if (l5Var.Y.b != null) {
                                    }
                                    i5Var = l5Var.M;
                                    if (i5Var != null) {
                                    }
                                    yz0.a2 a2Var222 = new yz0.a2(i3022, i3222, i3322, z52, h2Var);
                                    if (list12 != null) {
                                    }
                                    if (i4Var != null) {
                                    }
                                    yz0.c2 c2Var222 = new yz0.c2(l5Var.B, l5Var.D);
                                    fq fqVar422 = fqVar2;
                                    ArrayList a222 = va0.a.a(e5Var, l4Var, k4Var);
                                    ArrayList S422 = x61.m.S(l5Var.J);
                                    String str3222 = str31;
                                    ArrayList arrayList1222 = new ArrayList(x61.n.F(S422, 10));
                                    size2 = S422.size();
                                    yz0.z1 z1Var222 = z1Var;
                                    i4 = 0;
                                    while (i4 < size2) {
                                    }
                                    nlVar = l5Var.x;
                                    if (nlVar != null) {
                                    }
                                    pullRequestReviewDecision = PullRequestReviewDecision.UNKNOWN__;
                                    PullRequestReviewDecision pullRequestReviewDecision322 = pullRequestReviewDecision;
                                    z70.m4 m4Var22 = l5Var.w;
                                    z70.b bVar722 = l5Var.Z;
                                    MergeStateStatus g022 = com.google.android.gms.internal.measurement.d5.g0(ffVar);
                                    ArrayList K22 = x61.l.K(new PullRequestMergeMethod[]{o2Var.j ? PullRequestMergeMethod.MERGE : null, o2Var.h ? PullRequestMergeMethod.SQUASH : null, o2Var.i ? PullRequestMergeMethod.REBASE : null});
                                    boolean z5522 = !((i4Var != null || (b5Var = i4Var.b) == null) ? true : b5Var.a);
                                    PullRequestMergeMethod P22 = i21.a.P(o2Var.l);
                                    String str3322 = o2Var.k;
                                    List list1322 = o2Var.m;
                                    z70.a aVar1422 = bVar722.d;
                                    if (aVar1422 != null) {
                                    }
                                    boolean z5622 = bVar722.c;
                                    boolean z5722 = bVar722.b;
                                    boolean z5822 = l5Var.O;
                                    z70.n4 n4Var222 = l5Var.v;
                                    h01.h hVar222 = new h01.h(g022, K22, z5522, P22, str3322, list1322, iVar2, z5622, z5722, z5822, n4Var222 != null ? n4Var222.b : null, m4Var22 != null ? m4Var22.a : null, m4Var22 != null ? m4Var22.b : null, null, null);
                                    h01.c bVar822 = new cb0.b(l5Var);
                                    a = va0.a.a(e5Var, l4Var, k4Var);
                                    z70.b4 b4Var322 = b4Var;
                                    if (b4Var != null) {
                                    }
                                    if (b4Var322 != null) {
                                    }
                                    if (a.isEmpty()) {
                                    }
                                    h01.c cVar622 = bVar822;
                                    if (intValue > 0) {
                                    }
                                    if ((b4Var322 != null || (c5Var = b4Var322.a) == null) ? z35 : c5Var.c) {
                                    }
                                    boolean z6322 = o2Var.n;
                                    if (z6) {
                                    }
                                    str2 = str12;
                                    z8 = z7;
                                    z9 = false;
                                    if (list12 != null) {
                                    }
                                    String str35222 = l5Var.d;
                                    boolean z64222 = o2Var.o;
                                    boolean z65222 = l5Var.P;
                                    boolean z66222 = l5Var.Q;
                                    z70.c4 c4Var222 = l5Var.f;
                                    if (c4Var222 == null) {
                                    }
                                    z70.j4 j4Var222 = l5Var.e;
                                    if (j4Var222 == null) {
                                    }
                                    if (ffVar != ff.t) {
                                    }
                                    if (m2Var2 == null) {
                                    }
                                    j2Var3 = new yz0.j2(str10, str2, str3, aVar11, str, z, z35, str24, z2, subscriptionState13, subscriptionState1522, str2622, str2722, i2922, z12, issueOrPullRequestState422, aVar1222, b422, bVar522, f322, z4022, e322, b522, c322, arrayList2, rVar4, z4, z5, str2922, z6, z37, 0, 0, z4622, z8, list2, z4922, z65222, z66222, str4, false, str36, str37, z36, z5022, a2Var222, z1Var222, str3222, c2Var, a222, arrayList1222, true, pullRequestReviewDecision322, hVar222, cVar622, i37, z10, z6322, z9, str34, str35222, z64222, false, z67, null, false, null, false, null, null, false, 1073742080);
                                } else {
                                    u2Var2 = u2Var;
                                    aVar = aVar3;
                                }
                                j2Var2 = j2Var3;
                                if (j2Var2 == null) {
                                    u2 u2Var3 = u2Var2;
                                    u2Var3.v = 1;
                                    b71.a aVar15 = aVar;
                                    if (this.s.c(j2Var2, u2Var3) == aVar15) {
                                        return aVar15;
                                    }
                                }
                            } else {
                                u2Var2 = u2Var;
                                aVar = aVar3;
                                j2Var = null;
                            }
                            j2Var2 = j2Var;
                            if (j2Var2 == null) {
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
                u2Var = new u2(this, cVar);
                Object obj22 = u2Var.u;
                b71.a aVar32 = b71.a.r;
                i = u2Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof z2) {
                    z2Var = (z2) cVar;
                    int i39 = z2Var.v;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        z2Var.v = i39 - Integer.MIN_VALUE;
                        Object obj7 = z2Var.u;
                        b71.a aVar16 = b71.a.r;
                        i8 = z2Var.v;
                        if (i8 != 0) {
                            sy.y.j(obj7);
                            ra0.q qVar = ((ra0.o) obj).a;
                            String str38 = qVar != null ? qVar.a : "";
                            String str39 = qVar != null ? qVar.b : "";
                            String str40 = (qVar == null || (str7 = qVar.c) == null) ? "" : str7;
                            com.github.service.models.response.a c4 = t.e.c(qVar != null ? qVar.d.c : null);
                            int i40 = qVar != null ? qVar.e.c : 0;
                            if (qVar == null || (list8 = qVar.e.b) == null) {
                                r13 = 0;
                            } else {
                                r13 = new ArrayList();
                                for (ra0.r rVar5 : list8) {
                                    p01.n o = ((rVar5 != null ? rVar5.c : null) == null || (a2Var = rVar5.b) == null) ? null : sy.e0.o(new w61.k(a2Var, rVar5.c));
                                    if (o != null) {
                                        r13.add(o);
                                    }
                                }
                            }
                            if (r13 == 0) {
                                r13 = x61.rShadow.r;
                            }
                            yz0.g1 g1Var = new yz0.g1(new yz0.p2(str38, str39, str40, i40, c4), new yz0.c4(r13, new x01.i(qVar != null ? qVar.e.a.b : null, qVar != null ? qVar.e.a.a : false, false)));
                            z2Var.v = 1;
                            if (this.s.c(g1Var, z2Var) == aVar16) {
                                return aVar16;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj7);
                        }
                        return w61.a0.a;
                    }
                }
                z2Var = new z2(this, cVar);
                Object obj72 = z2Var.u;
                b71.a aVar162 = b71.a.r;
                i8 = z2Var.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof a3) {
                    a3Var = (a3) cVar;
                    int i42 = a3Var.v;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        a3Var.v = i42 - Integer.MIN_VALUE;
                        Object obj8 = a3Var.u;
                        b71.a aVar17 = b71.a.r;
                        i9 = a3Var.v;
                        if (i9 != 0) {
                            sy.y.j(obj8);
                            ra0.l lVar2 = ((ra0.k) obj).a;
                            String str41 = "";
                            String str42 = lVar2 != null ? lVar2.a : "";
                            String str43 = lVar2 != null ? lVar2.b : "";
                            String str44 = lVar2 != null ? lVar2.c : "";
                            if (lVar2 != null && (str8 = lVar2.d) != null) {
                                str41 = str8;
                            }
                            xz0.h hVar3 = new xz0.h(str42, str43, str44, str41);
                            a3Var.v = 1;
                            if (this.s.c(hVar3, a3Var) == aVar17) {
                                return aVar17;
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj8);
                        }
                        return w61.a0.a;
                    }
                }
                a3Var = new a3(this, cVar);
                Object obj82 = a3Var.u;
                b71.a aVar172 = b71.a.r;
                i9 = a3Var.v;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof b3) {
                    b3Var = (b3) cVar;
                    int i43 = b3Var.v;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        b3Var.v = i43 - Integer.MIN_VALUE;
                        Object obj9 = b3Var.u;
                        b71.a aVar18 = b71.a.r;
                        i10 = b3Var.v;
                        if (i10 != 0) {
                            sy.y.j(obj9);
                            ad adVar = ((zc) obj).a;
                            if (adVar == null || (list9 = adVar.c.b.a) == null) {
                                r2 = x61.rShadow.r;
                            } else {
                                r2 = new ArrayList();
                                for (w80.u3 u3Var : list9) {
                                    yz0.e8 p = u3Var != null ? sy.q.pShadow(u3Var.c) : null;
                                    if (p != null) {
                                        r2.add(p);
                                    }
                                }
                            }
                            b3Var.v = 1;
                            if (this.s.c((Object) r2, b3Var) == aVar18) {
                                return aVar18;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj9);
                        }
                        return w61.a0.a;
                    }
                }
                b3Var = new b3(this, cVar);
                Object obj92 = b3Var.u;
                b71.a aVar182 = b71.a.r;
                i10 = b3Var.v;
                if (i10 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof d3) {
                    d3Var = (d3) cVar;
                    int i44 = d3Var.v;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        d3Var.v = i44 - Integer.MIN_VALUE;
                        Object obj10 = d3Var.u;
                        b71.a aVar19 = b71.a.r;
                        i12 = d3Var.v;
                        if (i12 != 0) {
                            sy.y.j(obj10);
                            ra0.y yVar = ((ra0.w) obj).a;
                            ra0.x xVar = yVar != null ? yVar.a : null;
                            String str45 = "";
                            String str46 = xVar != null ? xVar.a : "";
                            String str47 = xVar != null ? xVar.b : "";
                            String str48 = xVar != null ? xVar.c : "";
                            if (xVar != null && (str9 = xVar.d) != null) {
                                str45 = str9;
                            }
                            xz0.h hVar4 = new xz0.h(str46, str47, str48, str45);
                            d3Var.v = 1;
                            if (this.s.c(hVar4, d3Var) == aVar19) {
                                return aVar19;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj10);
                        }
                        return w61.a0.a;
                    }
                }
                d3Var = new d3(this, cVar);
                Object obj102 = d3Var.u;
                b71.a aVar192 = b71.a.r;
                i12 = d3Var.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof e3) {
                    e3Var = (e3) cVar;
                    int i45 = e3Var.v;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        e3Var.v = i45 - Integer.MIN_VALUE;
                        Object obj11 = e3Var.u;
                        b71.a aVar20 = b71.a.r;
                        i13 = e3Var.v;
                        if (i13 != 0) {
                            sy.y.j(obj11);
                            ag agVar = (ag) obj;
                            jd jdVar = (agVar == null || (bgVar2 = agVar.a) == null || (cgVar = bgVar2.b) == null) ? null : cgVar.b;
                            int i46 = jdVar == null ? -1 : va0.m.a[jdVar.ordinal()];
                            yz0.t6 t6Var = new yz0.t6(i46 != 1 ? i46 != 2 ? i46 != 3 ? i46 != 4 ? TimelineItem$TimelineLockedEvent$Reason.UNKNOWN : TimelineItem$TimelineLockedEvent$Reason.RESOLVED : TimelineItem$TimelineLockedEvent$Reason.TOO_HEATED : TimelineItem$TimelineLockedEvent$Reason.SPAM : TimelineItem$TimelineLockedEvent$Reason.OFF_TOPIC, new com.github.service.models.response.a((agVar == null || (bgVar = agVar.a) == null || (yfVar = bgVar.a) == null) ? "" : yfVar.b, (Avatar) null, (String) null, false, (String) null, 62));
                            e3Var.v = 1;
                            if (this.s.c(t6Var, e3Var) == aVar20) {
                                return aVar20;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj11);
                        }
                        return w61.a0.a;
                    }
                }
                e3Var = new e3(this, cVar);
                Object obj112 = e3Var.u;
                b71.a aVar202 = b71.a.r;
                i13 = e3Var.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 6:
                return a(cVar, obj);
            case 7:
                return b(cVar, obj);
            case 8:
                return d(cVar, obj);
            case 9:
                return e(cVar, obj);
            case 10:
                return f(cVar, obj);
            case 11:
                return g(cVar, obj);
            case 12:
                return h(cVar, obj);
            case 13:
                return i(cVar, obj);
            case 14:
                return j(cVar, obj);
            case 15:
                return k(cVar, obj);
            case 16:
                return n(cVar, obj);
            case 17:
                return o(cVar, obj);
            case 18:
                return p(cVar, obj);
            case 19:
                return q(cVar, obj);
            case 20:
                return r(cVar, obj);
            case 21:
                return s(cVar, obj);
            case 22:
                return t(cVar, obj);
            case 23:
                return u(cVar, obj);
            case 24:
                return v(cVar, obj);
            case 25:
                return w(cVar, obj);
            case 26:
                return x(cVar, obj);
            case 27:
                return y(cVar, obj);
            case 28:
                return z(cVar, obj);
            default:
                if (cVar instanceof n4) {
                    n4Var = (n4) cVar;
                    int i47 = n4Var.v;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        n4Var.v = i47 - Integer.MIN_VALUE;
                        Object obj12 = n4Var.u;
                        b71.a aVar21 = b71.a.r;
                        i14 = n4Var.v;
                        w61.a0 a0Var = w61.a0.a;
                        if (i14 != 0) {
                            sy.y.j(obj12);
                            n4Var.v = 1;
                            if (this.s.c(a0Var, n4Var) == aVar21) {
                                return aVar21;
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj12);
                        }
                        return a0Var;
                    }
                }
                n4Var = new n4(this, cVar);
                Object obj122 = n4Var.u;
                b71.a aVar212 = b71.a.r;
                i14 = n4Var.v;
                w61.a0 a0Var2 = w61.a0.a;
                if (i14 != 0) {
                }
                return a0Var2;
        }
    }

    public v2(y71.j jVar, rm0.c4 c4Var) {
        this.r = 0;
        this.s = jVar;
    }
}
