package bz0;

import ap0.k6;
import ap0.l6;
import ap0.n6;
import ap0.o6;
import ap0.p6;
import com.github.service.models.response.CheckStatusState;
import com.github.service.models.response.PullRequestWidgetData;
import com.github.service.models.response.PullsWidgetFilter;
import com.github.service.models.response.PullsWidgetPullRow;
import com.google.android.gms.internal.measurement.d5;
import cq.g7;
import cq.h7;
import cq.j7;
import cq.k7;
import cq.l7;
import java.util.ArrayList;
import java.util.List;
import jn0.lq;
import jn0.nq;
import jn0.oq;
import jn0.pq;
import jn0.qq;
import jn0.rq;
import jn0.sq;
import jn0.tq;
import jn0.uq;
import jo.is;
import jo.ks;
import jo.ls;
import jo.ms;
import jo.ns;
import jo.os;
import jo.ps;
import jo.qs;
import jo.rs;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;
    public final /* synthetic */ PullsWidgetFilter t;

    public /* synthetic */ m(y71.j jVar, PullsWidgetFilter pullsWidgetFilter, int i) {
        this.r = i;
        this.s = jVar;
        this.t = pullsWidgetFilter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Type inference failed for: r1v11, types: [x61.rShadow] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v29, types: [x61.rShadow] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        l lVar;
        int i;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        List<rq> list;
        List<qq> list2;
        List<sq> list3;
        java.util.ArrayList r1;
        PullsWidgetPullRow pullsWidgetPullRow;
        CheckStatusState checkStatusState;
        k6 k6Var;
        l6 l6Var;
        o6 o6Var;
        List<tq> list4;
        y00.m mVar;
        int i3;
        int i4;
        ArrayList arrayList3;
        ArrayList arrayList4;
        List<os> list5;
        List<ns> list6;
        List<ps> list7;
        Object r12;
        PullsWidgetPullRow pullsWidgetPullRow2;
        CheckStatusState checkStatusState2;
        g7 g7Var;
        h7 h7Var;
        k7 k7Var;
        List<qs> list8;
        switch (this.r) {
            case 0:
                if (cVar instanceof l) {
                    lVar = (l) cVar;
                    int i5 = lVar.v;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        lVar.v = i5 - Integer.MIN_VALUE;
                        Object obj2 = lVar.u;
                        b71.a aVar = b71.a.r;
                        i = lVar.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            oq oqVar = (oq) obj;
                            k71.k.g(oqVar, "<this>");
                            pq pqVar = oqVar.c;
                            lq lqVar = oqVar.b;
                            uq uqVar = oqVar.d;
                            nq nqVar = oqVar.a;
                            int i6 = 0;
                            if (nqVar != null) {
                                i2 = nqVar.a;
                            } else if (uqVar != null) {
                                i2 = uqVar.a;
                            } else {
                                Integer valueOf = lqVar != null ? Integer.valueOf(lqVar.a) : null;
                                if (valueOf == null) {
                                    valueOf = pqVar != null ? Integer.valueOf(pqVar.a) : null;
                                    if (valueOf == null) {
                                        i2 = 0;
                                    }
                                }
                                i2 = valueOf.intValue();
                            }
                            if (nqVar != null && (list4 = nqVar.b) != null) {
                                arrayList2 = new ArrayList(x61.n.F(list4, 10));
                                for (tq tqVar : list4) {
                                    arrayList2.add(tqVar != null ? tqVar.b : null);
                                }
                            } else if (uqVar == null || (list3 = uqVar.b) == null) {
                                if (lqVar == null || (list2 = lqVar.b) == null) {
                                    arrayList = null;
                                } else {
                                    arrayList = new ArrayList(x61.n.F(list2, 10));
                                    for (qq qqVar : list2) {
                                        arrayList.add(qqVar != null ? qqVar.b : null);
                                    }
                                }
                                if (arrayList != null) {
                                    arrayList2 = arrayList;
                                } else if (pqVar == null || (list = pqVar.b) == null) {
                                    arrayList2 = null;
                                } else {
                                    arrayList2 = new ArrayList(x61.n.F(list, 10));
                                    for (rq rqVar : list) {
                                        arrayList2.add(rqVar != null ? rqVar.b : null);
                                    }
                                }
                            } else {
                                arrayList2 = new ArrayList(x61.n.F(list3, 10));
                                for (sq sqVar : list3) {
                                    arrayList2.add(sqVar != null ? sqVar.b : null);
                                }
                            }
                            if (arrayList2 != null) {
                                r1 = new ArrayList();
                                int size = arrayList2.size();
                                while (i6 < size) {
                                    Object obj3 = arrayList2.get(i6);
                                    i6++;
                                    p6 p6Var = (p6) obj3;
                                    if (p6Var != null) {
                                        String str = p6Var.b;
                                        int i7 = p6Var.c;
                                        String str2 = p6Var.d;
                                        n6 n6Var = p6Var.e;
                                        String str3 = n6Var.b;
                                        String str4 = n6Var.c.b;
                                        List list9 = p6Var.f.a;
                                        if (list9 == null || (k6Var = (k6) x61.m.U(list9)) == null || (l6Var = k6Var.a) == null || (o6Var = l6Var.a.a) == null || (checkStatusState = k21.f.I(o6Var.a)) == null) {
                                            checkStatusState = CheckStatusState.UNKNOWN__;
                                        }
                                        pullsWidgetPullRow = new PullsWidgetPullRow(str, i7, str2, str4, str3, checkStatusState);
                                    } else {
                                        pullsWidgetPullRow = null;
                                    }
                                    if (pullsWidgetPullRow != null) {
                                        r1.add(pullsWidgetPullRow);
                                    }
                                }
                            } else {
                                r1 = x61.rShadow.r;
                            }
                            PullRequestWidgetData pullRequestWidgetData = new PullRequestWidgetData(this.t, i2, r1);
                            lVar.v = 1;
                            if (this.s.c(pullRequestWidgetData, lVar) == aVar) {
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
                lVar = new l(this, cVar);
                Object obj22 = lVar.u;
                b71.a aVar2 = b71.a.r;
                i = lVar.v;
                if (i != 0) {
                }
                return w61.a0.a;
            default:
                if (cVar instanceof y00.m) {
                    mVar = (y00.m) cVar;
                    int i8 = mVar.v;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        mVar.v = i8 - Integer.MIN_VALUE;
                        Object obj4 = mVar.u;
                        b71.a aVar3 = b71.a.r;
                        i3 = mVar.v;
                        if (i3 != 0) {
                            sy.y.j(obj4);
                            ls lsVar = (ls) obj;
                            k71.k.g(lsVar, "<this>");
                            ms msVar = lsVar.c;
                            is isVar = lsVar.b;
                            rs rsVar = lsVar.d;
                            ks ksVar = lsVar.a;
                            int i9 = 0;
                            if (ksVar != null) {
                                i4 = ksVar.a;
                            } else if (rsVar != null) {
                                i4 = rsVar.a;
                            } else {
                                Integer valueOf2 = isVar != null ? Integer.valueOf(isVar.a) : null;
                                if (valueOf2 == null) {
                                    valueOf2 = msVar != null ? Integer.valueOf(msVar.a) : null;
                                    if (valueOf2 == null) {
                                        i4 = 0;
                                    }
                                }
                                i4 = valueOf2.intValue();
                            }
                            if (ksVar != null && (list8 = ksVar.b) != null) {
                                arrayList4 = new ArrayList(x61.n.F(list8, 10));
                                for (qs qsVar : list8) {
                                    arrayList4.add(qsVar != null ? qsVar.b : null);
                                }
                            } else if (rsVar == null || (list7 = rsVar.b) == null) {
                                if (isVar == null || (list6 = isVar.b) == null) {
                                    arrayList3 = null;
                                } else {
                                    arrayList3 = new ArrayList(x61.n.F(list6, 10));
                                    for (ns nsVar : list6) {
                                        arrayList3.add(nsVar != null ? nsVar.b : null);
                                    }
                                }
                                if (arrayList3 != null) {
                                    arrayList4 = arrayList3;
                                } else if (msVar == null || (list5 = msVar.b) == null) {
                                    arrayList4 = null;
                                } else {
                                    arrayList4 = new ArrayList(x61.n.F(list5, 10));
                                    for (os osVar : list5) {
                                        arrayList4.add(osVar != null ? osVar.b : null);
                                    }
                                }
                            } else {
                                arrayList4 = new ArrayList(x61.n.F(list7, 10));
                                for (ps psVar : list7) {
                                    arrayList4.add(psVar != null ? psVar.b : null);
                                }
                            }
                            if (arrayList4 != null) {
                                r12 = new ArrayList();
                                int size2 = arrayList4.size();
                                while (i9 < size2) {
                                    Object obj5 = arrayList4.get(i9);
                                    i9++;
                                    l7 l7Var = (l7) obj5;
                                    if (l7Var != null) {
                                        String str5 = l7Var.b;
                                        int i10 = l7Var.c;
                                        String str6 = l7Var.d;
                                        j7 j7Var = l7Var.e;
                                        String str7 = j7Var.b;
                                        String str8 = j7Var.c.b;
                                        List list10 = l7Var.f.a;
                                        if (list10 == null || (g7Var = (g7) x61.m.U(list10)) == null || (h7Var = g7Var.a) == null || (k7Var = h7Var.a.a) == null || (checkStatusState2 = d5.a0(k7Var.a)) == null) {
                                            checkStatusState2 = CheckStatusState.UNKNOWN__;
                                        }
                                        pullsWidgetPullRow2 = new PullsWidgetPullRow(str5, i10, str6, str8, str7, checkStatusState2);
                                    } else {
                                        pullsWidgetPullRow2 = null;
                                    }
                                    if (pullsWidgetPullRow2 != null) {
                                        r12.add(pullsWidgetPullRow2);
                                    }
                                }
                            } else {
                                r12 = x61.rShadow.r;
                            }
                            PullRequestWidgetData pullRequestWidgetData2 = new PullRequestWidgetData(this.t, i4, r12);
                            mVar.v = 1;
                            if (this.s.c(pullRequestWidgetData2, mVar) == aVar3) {
                                return aVar3;
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
                mVar = new y00.m(this, cVar);
                Object obj42 = mVar.u;
                b71.a aVar32 = b71.a.r;
                i3 = mVar.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
        }
    }
}
