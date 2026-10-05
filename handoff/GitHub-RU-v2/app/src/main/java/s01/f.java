package s01;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.TimelineItem$TimelinePullRequestReview$ReviewState;
import com.github.service.models.response.type.StatusState;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.i4;
import er.b0;
import gv.u2;
import gv.v7;
import gv.w7;
import gv.x2;
import gv.x7;
import gv.y2;
import gv.y7;
import gv.z2;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jo.a6;
import jo.a60;
import jo.ab;
import jo.b6;
import jo.b60;
import jo.dg0;
import jo.e6;
import jo.eg0;
import jo.f6;
import jo.fg0;
import jo.k6;
import jo.kb0;
import jo.l6;
import jo.lo;
import jo.ma;
import jo.mb0;
import jo.mo;
import jo.n6;
import jo.nb0;
import jo.no;
import jo.o90;
import jo.oa;
import jo.p6;
import jo.p90;
import jo.pa;
import jo.q6;
import jo.q7;
import jo.q90;
import jo.qa;
import jo.r6;
import jo.r7;
import jo.ra;
import jo.s7;
import jo.sa;
import jo.sg;
import jo.ta;
import jo.tg;
import jo.u6;
import jo.ua;
import jo.va;
import jo.vc0;
import jo.vg;
import jo.wc0;
import jo.wg;
import jo.x0;
import jo.x30;
import jo.xc0;
import jo.y0;
import jo.y30;
import jo.y50;
import jo.ya;
import jo.yg;
import jo.z0;
import jo.z30;
import jo.z5;
import m10.t3;
import sy.d0;
import sy.f0;
import sy.q;
import sy.y;
import t00.a1;
import t00.c0;
import t00.c1;
import t00.i0;
import t00.j0;
import t00.k0;
import t00.m0;
import t00.n0;
import t00.o0;
import t00.p0;
import t00.q0;
import t00.s0;
import t00.t0;
import t00.u;
import t00.u0;
import t00.w;
import t00.x;
import t00.z;
import v8.l0;
import w61.a0;
import w8.s;
import x61.r;
import y41.t1;
import yz0.a7;
import yz0.b2;
import yz0.d3;
import yz0.g4;
import yz0.j4;
import yz0.o6;
import yz0.w0;
import zx.d1;
import zx.e1;
import zx.f1;
import zx.j1;
import zx.k1;
import zx.l1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public f(y71.j jVar) {
        this.r = 2;
        ak.a aVar = ak.a.s;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        q0 q0Var;
        int i;
        tg tgVar;
        wg wgVar;
        tg tgVar2;
        wg wgVar2;
        tg tgVar3;
        wg wgVar3;
        if (cVar instanceof q0) {
            q0Var = (q0) cVar;
            int i2 = q0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = q0Var.u;
                b71.a aVar = b71.a.r;
                i = q0Var.v;
                if (i != 0) {
                    y.j(obj2);
                    sg sgVar = (sg) obj;
                    yg ygVar = sgVar.a;
                    String str = null;
                    List<vg> list = (ygVar == null || (tgVar3 = ygVar.b) == null || (wgVar3 = tgVar3.b) == null) ? null : wgVar3.b.b;
                    if (list == null) {
                        list = r.r;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (vg vgVar : list) {
                        j4 n = vgVar != null ? q.n(vgVar.c) : null;
                        if (n != null) {
                            arrayList.add(n);
                        }
                    }
                    yg ygVar2 = sgVar.a;
                    boolean z = (ygVar2 == null || (tgVar2 = ygVar2.b) == null || (wgVar2 = tgVar2.b) == null) ? false : wgVar2.b.a.a;
                    if (ygVar2 != null && (tgVar = ygVar2.b) != null && (wgVar = tgVar.b) != null) {
                        str = wgVar.b.a.b;
                    }
                    w0 w0Var = new w0(arrayList, new x01.i(str, z, false));
                    q0Var.v = 1;
                    if (this.s.c(w0Var, q0Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                }
                return a0.a;
            }
        }
        q0Var = new q0(this, cVar);
        Object obj22 = q0Var.u;
        b71.a aVar2 = b71.a.r;
        i = q0Var.v;
        if (i != 0) {
        }
        return a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b(a71.c cVar, Object obj) {
        s0 s0Var;
        int i;
        if (cVar instanceof s0) {
            s0Var = (s0) cVar;
            int i2 = s0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = s0Var.u;
                b71.a aVar = b71.a.r;
                i = s0Var.v;
                a0 a0Var = a0.a;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                    return a0Var;
                }
                y.j(obj2);
                s0Var.v = 1;
                return this.s.c(a0Var, s0Var) == aVar ? aVar : a0Var;
            }
        }
        s0Var = new s0(this, cVar);
        Object obj22 = s0Var.u;
        b71.a aVar2 = b71.a.r;
        i = s0Var.v;
        a0 a0Var2 = a0.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object d(a71.c cVar, Object obj) {
        t0 t0Var;
        int i;
        a01.d dVar;
        va vaVar;
        int i2;
        int i3;
        r rVar;
        String str;
        wq.b bVar;
        String str2;
        wq.b bVar2;
        List<wq.c> list;
        CheckStatusState checkStatusState;
        String str3;
        if (cVar instanceof t0) {
            t0Var = (t0) cVar;
            int i4 = t0Var.v;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                t0Var.v = i4 - Integer.MIN_VALUE;
                Object obj2 = t0Var.u;
                b71.a aVar = b71.a.r;
                i = t0Var.v;
                if (i != 0) {
                    y.j(obj2);
                    ua uaVar = ((pa) obj).a;
                    if (uaVar == null || (vaVar = uaVar.c) == null) {
                        dVar = null;
                    } else {
                        String str4 = vaVar.a;
                        String str5 = vaVar.b;
                        CheckStatusState d0 = d5.d0(vaVar.c);
                        ya yaVar = vaVar.d;
                        String str6 = yaVar.b;
                        String str7 = yaVar.c;
                        com.github.service.models.response.a e = l0.e(yaVar.a.b);
                        oa oaVar = vaVar.e;
                        com.github.service.models.response.a e2 = l0.e(oaVar != null ? oaVar.c : null);
                        ab abVar = vaVar.f;
                        if (abVar == null) {
                            throw new IllegalStateException("WorkFlowRun information can't be null");
                        }
                        String str8 = abVar.a;
                        String str9 = abVar.b;
                        int i5 = abVar.c;
                        String str10 = abVar.d.a;
                        List list2 = abVar.e.a;
                        r rVar2 = r.r;
                        if (list2 == null) {
                            list2 = rVar2;
                        }
                        ArrayList S = x61.m.S(list2);
                        ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                        int size = S.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj3 = S.get(i6);
                            int i7 = i6 + 1;
                            cs.f fVar = ((ra) obj3).b;
                            ArrayList arrayList2 = S;
                            boolean z = fVar.a;
                            int i8 = size;
                            cs.a aVar2 = fVar.b;
                            String str11 = str5;
                            String str12 = aVar2.a;
                            String str13 = aVar2.b;
                            List list3 = fVar.c.a;
                            if (list3 == null) {
                                list3 = rVar2;
                            }
                            ArrayList S2 = x61.m.S(list3);
                            CheckStatusState checkStatusState2 = d0;
                            ArrayList arrayList3 = new ArrayList();
                            String str14 = str6;
                            int size2 = S2.size();
                            String str15 = str7;
                            int i9 = 0;
                            while (i9 < size2) {
                                Object obj4 = S2.get(i9);
                                i9++;
                                ArrayList arrayList4 = S2;
                                cs.b bVar3 = (cs.b) obj4;
                                int i10 = size2;
                                cs.c cVar2 = bVar3.c;
                                if (cVar2 != null) {
                                    str3 = cVar2.a;
                                } else {
                                    cs.d dVar2 = bVar3.b;
                                    str3 = dVar2 != null ? dVar2.a : null;
                                }
                                if (str3 != null) {
                                    arrayList3.add(str3);
                                }
                                size2 = i10;
                                S2 = arrayList4;
                            }
                            arrayList.add(new a01.c(str12, str13, arrayList3, z));
                            S = arrayList2;
                            i6 = i7;
                            size = i8;
                            str5 = str11;
                            d0 = checkStatusState2;
                            str6 = str14;
                            str7 = str15;
                        }
                        String str16 = str5;
                        CheckStatusState checkStatusState3 = d0;
                        String str17 = str6;
                        String str18 = str7;
                        a01.f fVar2 = new a01.f(i5, str8, str9, str10, arrayList);
                        ma maVar = vaVar.g;
                        List list4 = maVar != null ? maVar.a : null;
                        if (list4 == null) {
                            list4 = rVar2;
                        }
                        ArrayList S3 = x61.m.S(list4);
                        ArrayList arrayList5 = new ArrayList(x61.n.F(S3, 10));
                        int size3 = S3.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            Object obj5 = S3.get(i12);
                            int i13 = i12 + 1;
                            wq.f fVar3 = ((sa) obj5).c;
                            String str19 = fVar3.c;
                            String str20 = fVar3.a;
                            CheckStatusState d02 = d5.d0(fVar3.b);
                            t3 t3Var = fVar3.d;
                            CheckConclusionState w0 = t3Var != null ? i4.w0(t3Var) : null;
                            String str21 = fVar3.e;
                            wq.e eVar = fVar3.g;
                            ArrayList arrayList6 = S3;
                            int i14 = eVar != null ? eVar.a : 0;
                            if (eVar == null || (list = eVar.b) == null) {
                                i2 = size3;
                                i3 = i13;
                                rVar = rVar2;
                            } else {
                                i2 = size3;
                                i3 = i13;
                                ArrayList arrayList7 = new ArrayList(x61.n.F(list, 10));
                                for (wq.c cVar3 : list) {
                                    wq.d dVar3 = cVar3 != null ? cVar3.b : null;
                                    if (dVar3 == null || (checkStatusState = d5.d0(dVar3.a)) == null) {
                                        checkStatusState = CheckStatusState.UNKNOWN__;
                                    }
                                    arrayList7.add(new a01.b(checkStatusState));
                                }
                                rVar = arrayList7;
                            }
                            wq.a aVar3 = fVar3.f;
                            if (aVar3 == null || (bVar2 = aVar3.a) == null || (str2 = bVar2.a) == null) {
                                if (aVar3 == null || (bVar = aVar3.a) == null) {
                                    str = null;
                                    arrayList5.add(new a01.a(str19, str20, d02, w0, str21, i14, rVar, str));
                                    S3 = arrayList6;
                                    size3 = i2;
                                    i12 = i3;
                                } else {
                                    str2 = bVar.b;
                                }
                            }
                            str = str2;
                            arrayList5.add(new a01.a(str19, str20, d02, w0, str21, i14, rVar, str));
                            S3 = arrayList6;
                            size3 = i2;
                            i12 = i3;
                        }
                        qa qaVar = vaVar.h;
                        List list5 = qaVar != null ? qaVar.a : null;
                        if (list5 == null) {
                            list5 = rVar2;
                        }
                        ArrayList S4 = x61.m.S(list5);
                        ArrayList arrayList8 = new ArrayList(x61.n.F(S4, 10));
                        int size4 = S4.size();
                        int i15 = 0;
                        while (i15 < size4) {
                            Object obj6 = S4.get(i15);
                            i15++;
                            gv.o oVar = ((ta) obj6).c;
                            z2 z2Var = oVar.e;
                            String str22 = z2Var.b;
                            x2 x2Var = z2Var.m;
                            String str23 = x2Var.b;
                            ArrayList arrayList9 = S4;
                            String str24 = z2Var.n;
                            String str25 = z2Var.d;
                            int i16 = z2Var.f;
                            d3 d3Var = new d3(x2Var.e.b, str23);
                            ZonedDateTime zonedDateTime = oVar.b;
                            if (zonedDateTime == null) {
                                zonedDateTime = z2Var.g;
                            }
                            ZonedDateTime zonedDateTime2 = zonedDateTime;
                            PullRequestState C = a.a.C(oVar.c);
                            List list6 = z2Var.r.a;
                            if (list6 == null) {
                                list6 = rVar2;
                            }
                            ArrayList S5 = x61.m.S(list6);
                            ArrayList arrayList10 = new ArrayList(x61.n.F(S5, 10));
                            int size5 = S5.size();
                            int i17 = 0;
                            while (i17 < size5) {
                                Object obj7 = S5.get(i17);
                                i17++;
                                int i18 = size5;
                                y2 y2Var = ((u2) obj7).b.b;
                                arrayList10.add(y2Var != null ? b4.o0(y2Var.b) : null);
                                size5 = i18;
                            }
                            StatusState statusState = (StatusState) x61.m.W(arrayList10);
                            if (statusState == null) {
                                statusState = StatusState.UNKNOWN__;
                            }
                            arrayList8.add(new a01.e(str22, str24, str25, i16, d3Var, str23, zonedDateTime2, C, statusState));
                            S4 = arrayList9;
                        }
                        dVar = new a01.d(str4, str16, checkStatusState3, str17, str18, e, e2, fVar2, arrayList5, arrayList8);
                    }
                    if (dVar != null) {
                        t0Var.v = 1;
                        if (this.s.c(dVar, t0Var) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                }
                return a0.a;
            }
        }
        t0Var = new t0(this, cVar);
        Object obj22 = t0Var.u;
        b71.a aVar4 = b71.a.r;
        i = t0Var.v;
        if (i != 0) {
        }
        return a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(a71.c cVar, Object obj) {
        u0 u0Var;
        int i;
        if (cVar instanceof u0) {
            u0Var = (u0) cVar;
            int i2 = u0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = u0Var.u;
                b71.a aVar = b71.a.r;
                i = u0Var.v;
                a0 a0Var = a0.a;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                    return a0Var;
                }
                y.j(obj2);
                u0Var.v = 1;
                return this.s.c(a0Var, u0Var) == aVar ? aVar : a0Var;
            }
        }
        u0Var = new u0(this, cVar);
        Object obj22 = u0Var.u;
        b71.a aVar2 = b71.a.r;
        i = u0Var.v;
        a0 a0Var2 = a0.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object f(a71.c cVar, Object obj) {
        t00.w0 w0Var;
        int i;
        jo.m mVar;
        jo.m mVar2;
        if (cVar instanceof t00.w0) {
            w0Var = (t00.w0) cVar;
            int i2 = w0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = w0Var.u;
                b71.a aVar = b71.a.r;
                i = w0Var.v;
                if (i != 0) {
                    y.j(obj2);
                    jo.l lVar = ((jo.p) obj).a;
                    pv.c cVar2 = null;
                    ar.c cVar3 = (lVar == null || (mVar2 = lVar.a) == null) ? null : mVar2.d.j;
                    if (lVar != null && (mVar = lVar.a) != null) {
                        cVar2 = mVar.d.n;
                    }
                    pv.c cVar4 = cVar2;
                    if (cVar3 == null || cVar4 == null) {
                        throw new ApiFailure(ApiFailureType.PARSE_ERROR, "Invalid server response.", null, null, null, null, null, 120);
                    }
                    ms.i iVar = lVar.a.d;
                    b01.g f = d0.f(cVar3, iVar.c, cVar4, (ju.a) null, iVar.d, iVar.e, iVar.f, false, (String) null, iVar.m, false, false, d0.E(iVar), 14220);
                    w0Var.v = 1;
                    if (this.s.c(f, w0Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                }
                return a0.a;
            }
        }
        w0Var = new t00.w0(this, cVar);
        Object obj22 = w0Var.u;
        b71.a aVar2 = b71.a.r;
        i = w0Var.v;
        if (i != 0) {
        }
        return a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(a71.c cVar, Object obj) {
        a1 a1Var;
        int i;
        np.d dVar;
        if (cVar instanceof a1) {
            a1Var = (a1) cVar;
            int i2 = a1Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a1Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = a1Var.u;
                b71.a aVar = b71.a.r;
                i = a1Var.v;
                if (i != 0) {
                    y.j(obj2);
                    np.a aVar2 = ((np.c) obj).a;
                    b01.f e = (aVar2 == null || (dVar = aVar2.a) == null) ? null : f0.e(dVar.c);
                    if (e != null) {
                        a1Var.v = 1;
                        if (this.s.c(e, a1Var) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                }
                return a0.a;
            }
        }
        a1Var = new a1(this, cVar);
        Object obj22 = a1Var.u;
        b71.a aVar3 = b71.a.r;
        i = a1Var.v;
        if (i != 0) {
        }
        return a0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x095a  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x099e  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x0a13  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x0a77  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x0a85  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015f  */
    /* JADX WARN: Type inference failed for: r2v111, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v114, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v126 */
    /* JADX WARN: Type inference failed for: r2v129, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v130, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        e eVar;
        int i;
        sm.a aVar;
        int i2;
        sm.c cVar2;
        int i3;
        Object obj2;
        t00.c cVar3;
        int i4;
        jo.b bVar;
        t00.g gVar;
        int i5;
        jz.a aVar2;
        b2 b2Var;
        t00.h hVar;
        int i6;
        y50 y50Var;
        u uVar;
        int i7;
        o6 f;
        jo.g gVar2;
        jo.j jVar;
        w wVar;
        int i8;
        x xVar;
        int i9;
        f01.g gVar3;
        w7 w7Var;
        t00.y yVar;
        int i10;
        z zVar;
        int i12;
        f01.g gVar4;
        w7 w7Var2;
        t00.a0 a0Var;
        int i13;
        c0 c0Var;
        int i14;
        t00.d0 d0Var;
        int i15;
        t00.f0 f0Var;
        int i16;
        no noVar;
        i0 i0Var;
        int i17;
        z30 z30Var;
        j0 j0Var;
        int i18;
        p90 p90Var;
        k0 k0Var;
        int i19;
        nb0 nb0Var;
        t00.l0 l0Var;
        int i20;
        yz0.q bVar2;
        wc0 wc0Var;
        m0 m0Var;
        int i22;
        a7 k;
        eg0 eg0Var;
        n0 n0Var;
        int i23;
        b0 b0Var;
        o0 o0Var;
        int i24;
        a6 a6Var;
        b0 b0Var2;
        p0 p0Var;
        int i25;
        ?? arrayList;
        q6 q6Var;
        p6 p6Var;
        x01.i iVar;
        q6 q6Var2;
        q6 q6Var3;
        w0 w0Var;
        c1 c1Var;
        int i26;
        s7 s7Var;
        switch (this.r) {
            case 0:
                if (cVar instanceof e) {
                    eVar = (e) cVar;
                    int i27 = eVar.v;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        eVar.v = i27 - Integer.MIN_VALUE;
                        Object obj3 = eVar.u;
                        b71.a aVar3 = b71.a.r;
                        i = eVar.v;
                        if (i != 0) {
                            y.j(obj3);
                            Boolean bool = (Boolean) ((w61.k) obj).s;
                            bool.getClass();
                            eVar.v = 1;
                            if (this.s.c(bool, eVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj3);
                        }
                        return a0.a;
                    }
                }
                eVar = new e(this, cVar);
                Object obj32 = eVar.u;
                b71.a aVar32 = b71.a.r;
                i = eVar.v;
                if (i != 0) {
                }
                return a0.a;
            case 1:
                if (cVar instanceof sm.a) {
                    aVar = (sm.a) cVar;
                    int i28 = aVar.v;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        aVar.v = i28 - Integer.MIN_VALUE;
                        Object obj4 = aVar.u;
                        b71.a aVar4 = b71.a.r;
                        i2 = aVar.v;
                        if (i2 != 0) {
                            y.j(obj4);
                            List<ak.e> list = (List) obj;
                            int s = x61.x.s(x61.n.F(list, 10));
                            if (s < 16) {
                                s = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(s);
                            for (ak.e eVar2 : list) {
                                linkedHashMap.put(eVar2.a, Boolean.valueOf(eVar2.b));
                            }
                            aVar.v = 1;
                            if (this.s.c(linkedHashMap, aVar) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj4);
                        }
                        return a0.a;
                    }
                }
                aVar = new sm.a(this, cVar);
                Object obj42 = aVar.u;
                b71.a aVar42 = b71.a.r;
                i2 = aVar.v;
                if (i2 != 0) {
                }
                return a0.a;
            case 2:
                if (cVar instanceof sm.c) {
                    cVar2 = (sm.c) cVar;
                    int i29 = cVar2.v;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        cVar2.v = i29 - Integer.MIN_VALUE;
                        Object obj5 = cVar2.u;
                        b71.a aVar5 = b71.a.r;
                        i3 = cVar2.v;
                        if (i3 != 0) {
                            y.j(obj5);
                            Iterator it = ((List) obj).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (((ak.e) obj2).a == ak.a.s) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            ak.e eVar3 = (ak.e) obj2;
                            Boolean valueOf = Boolean.valueOf(eVar3 != null ? eVar3.b : false);
                            cVar2.v = 1;
                            if (this.s.c(valueOf, cVar2) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj5);
                        }
                        return a0.a;
                    }
                }
                cVar2 = new sm.c(this, cVar);
                Object obj52 = cVar2.u;
                b71.a aVar52 = b71.a.r;
                i3 = cVar2.v;
                if (i3 != 0) {
                }
                return a0.a;
            case 3:
                if (cVar instanceof t00.c) {
                    cVar3 = (t00.c) cVar;
                    int i30 = cVar3.v;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        cVar3.v = i30 - Integer.MIN_VALUE;
                        Object obj6 = cVar3.u;
                        b71.a aVar6 = b71.a.r;
                        i4 = cVar3.v;
                        if (i4 != 0) {
                            y.j(obj6);
                            jo.a aVar7 = ((jo.d) obj).a;
                            List e = m71.a.e((aVar7 == null || (bVar = aVar7.a) == null) ? null : bVar.b);
                            cVar3.v = 1;
                            if (this.s.c(e, cVar3) == aVar6) {
                                return aVar6;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj6);
                        }
                        return a0.a;
                    }
                }
                cVar3 = new t00.c(this, cVar);
                Object obj62 = cVar3.u;
                b71.a aVar62 = b71.a.r;
                i4 = cVar3.v;
                if (i4 != 0) {
                }
                return a0.a;
            case 4:
                if (cVar instanceof t00.g) {
                    gVar = (t00.g) cVar;
                    int i32 = gVar.v;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        gVar.v = i32 - Integer.MIN_VALUE;
                        Object obj7 = gVar.u;
                        b71.a aVar8 = b71.a.r;
                        i5 = gVar.v;
                        if (i5 != 0) {
                            y.j(obj7);
                            k1 k1Var = ((d1) obj).a;
                            if (k1Var != null) {
                                int i33 = k1Var.b;
                                l1 l1Var = k1Var.c;
                                Iterable iterable = l1Var.c;
                                if (iterable == null) {
                                    iterable = r.r;
                                }
                                ArrayList S = x61.m.S(iterable);
                                ArrayList arrayList2 = new ArrayList();
                                int size = S.size();
                                int i34 = 0;
                                while (i34 < size) {
                                    Object obj8 = S.get(i34);
                                    i34++;
                                    e1 e1Var = (e1) obj8;
                                    k71.k.g(e1Var, "<this>");
                                    qx.c1 c1Var2 = e1Var.f;
                                    if (c1Var2 != null) {
                                        b2Var = sy.c.a(c1Var2);
                                    } else {
                                        f1 f1Var = e1Var.b;
                                        b2Var = f1Var != null ? new b2(f1Var.d, s.A(f1Var.g), f1Var.b, f1Var.c, true, f1Var.e, f1Var.f) : null;
                                    }
                                    if (b2Var != null) {
                                        arrayList2.add(b2Var);
                                    }
                                }
                                j1 j1Var = l1Var.a;
                                aVar2 = new jz.a(i33, arrayList2, new x01.i(j1Var.b, j1Var.a, false));
                            } else {
                                aVar2 = null;
                            }
                            if (aVar2 != null) {
                                gVar.v = 1;
                                if (this.s.c(aVar2, gVar) == aVar8) {
                                    return aVar8;
                                }
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj7);
                        }
                        return a0.a;
                    }
                }
                gVar = new t00.g(this, cVar);
                Object obj72 = gVar.u;
                b71.a aVar82 = b71.a.r;
                i5 = gVar.v;
                if (i5 != 0) {
                }
                return a0.a;
            case 5:
                if (cVar instanceof t00.h) {
                    hVar = (t00.h) cVar;
                    int i35 = hVar.v;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        hVar.v = i35 - Integer.MIN_VALUE;
                        Object obj9 = hVar.u;
                        b71.a aVar9 = b71.a.r;
                        i6 = hVar.v;
                        if (i6 != 0) {
                            y.j(obj9);
                            b60 b60Var = ((a60) obj).a;
                            List e2 = m71.a.e((b60Var == null || (y50Var = b60Var.a) == null) ? null : y50Var.b);
                            hVar.v = 1;
                            if (this.s.c(e2, hVar) == aVar9) {
                                return aVar9;
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj9);
                        }
                        return a0.a;
                    }
                }
                hVar = new t00.h(this, cVar);
                Object obj92 = hVar.u;
                b71.a aVar92 = b71.a.r;
                i6 = hVar.v;
                if (i6 != 0) {
                }
                return a0.a;
            case 6:
                if (cVar instanceof u) {
                    uVar = (u) cVar;
                    int i36 = uVar.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        uVar.v = i36 - Integer.MIN_VALUE;
                        Object obj10 = uVar.u;
                        b71.a aVar10 = b71.a.r;
                        i7 = uVar.v;
                        if (i7 != 0) {
                            y.j(obj10);
                            jo.f fVar = ((jo.i) obj).a;
                            et.a aVar11 = (fVar == null || (gVar2 = fVar.a) == null || (jVar = gVar2.a) == null) ? null : jVar.c;
                            if (aVar11 == null) {
                                yz0.s.Companion.getClass();
                                yz0.q qVar = yz0.r.b;
                                yz0.x2.Companion.getClass();
                                f = new o6(qVar);
                            } else {
                                f = sy.w.f(aVar11);
                            }
                            uVar.v = 1;
                            if (this.s.c(f, uVar) == aVar10) {
                                return aVar10;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj10);
                        }
                        return a0.a;
                    }
                }
                uVar = new u(this, cVar);
                Object obj102 = uVar.u;
                b71.a aVar102 = b71.a.r;
                i7 = uVar.v;
                if (i7 != 0) {
                }
                return a0.a;
            case 7:
                if (cVar instanceof w) {
                    wVar = (w) cVar;
                    int i37 = wVar.v;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        wVar.v = i37 - Integer.MIN_VALUE;
                        Object obj11 = wVar.u;
                        b71.a aVar12 = b71.a.r;
                        i8 = wVar.v;
                        if (i8 != 0) {
                            y.j(obj11);
                            jo.t0 t0Var = ((jo.w0) obj).a;
                            z0 z0Var = t0Var != null ? t0Var.a : null;
                            if (z0Var != null) {
                                wVar.v = 1;
                                if (this.s.c(z0Var, wVar) == aVar12) {
                                    return aVar12;
                                }
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj11);
                        }
                        return a0.a;
                    }
                }
                wVar = new w(this, cVar);
                Object obj112 = wVar.u;
                b71.a aVar122 = b71.a.r;
                i8 = wVar.v;
                if (i8 != 0) {
                }
                return a0.a;
            case 8:
                if (cVar instanceof x) {
                    xVar = (x) cVar;
                    int i38 = xVar.v;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        xVar.v = i38 - Integer.MIN_VALUE;
                        Object obj12 = xVar.u;
                        b71.a aVar13 = b71.a.r;
                        i9 = xVar.v;
                        if (i9 != 0) {
                            y.j(obj12);
                            z0 z0Var2 = (z0) obj;
                            y0 y0Var = z0Var2.b;
                            List list2 = z0Var2.c.a;
                            x0 x0Var = list2 != null ? (x0) x61.m.W(list2) : null;
                            if (x0Var != null) {
                                y7 y7Var = x0Var.c;
                                x7 x7Var = y7Var.g;
                                ar.c cVar4 = y7Var.k;
                                v7 v7Var = y7Var.f;
                                gVar3 = aa1.b.e(cVar4, x7Var != null ? x7Var.b : "", v7Var != null ? v7Var.a : null, y7Var.l, y7Var.o, y7Var.h, t1.P(y7Var.i), x7Var != null ? aa1.b.C(sy.w.x(x7Var.g.b)) : null, y7Var.j, y7Var.m.b, x7Var != null ? x7Var.h : null, y0Var.b, y0Var.c, true, x7Var != null ? x7Var.c : false, (x7Var == null || (w7Var = x7Var.d) == null) ? "" : w7Var.a, x7Var != null ? x7Var.e : false, x7Var != null ? x7Var.f : false, (pu.a) null, aa1.b.S(z0Var2.a));
                            } else {
                                gVar3 = null;
                            }
                            if (gVar3 != null) {
                                xVar.v = 1;
                                if (this.s.c(gVar3, xVar) == aVar13) {
                                    return aVar13;
                                }
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj12);
                        }
                        return a0.a;
                    }
                }
                xVar = new x(this, cVar);
                Object obj122 = xVar.u;
                b71.a aVar132 = b71.a.r;
                i9 = xVar.v;
                if (i9 != 0) {
                }
                return a0.a;
            case 9:
                if (cVar instanceof t00.y) {
                    yVar = (t00.y) cVar;
                    int i39 = yVar.v;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        yVar.v = i39 - Integer.MIN_VALUE;
                        Object obj13 = yVar.u;
                        b71.a aVar14 = b71.a.r;
                        i10 = yVar.v;
                        if (i10 != 0) {
                            y.j(obj13);
                            jo.t0 t0Var2 = ((jo.w0) obj).a;
                            z0 z0Var3 = t0Var2 != null ? t0Var2.a : null;
                            if (z0Var3 != null) {
                                yVar.v = 1;
                                if (this.s.c(z0Var3, yVar) == aVar14) {
                                    return aVar14;
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj13);
                        }
                        return a0.a;
                    }
                }
                yVar = new t00.y(this, cVar);
                Object obj132 = yVar.u;
                b71.a aVar142 = b71.a.r;
                i10 = yVar.v;
                if (i10 != 0) {
                }
                return a0.a;
            case 10:
                if (cVar instanceof z) {
                    zVar = (z) cVar;
                    int i40 = zVar.v;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        zVar.v = i40 - Integer.MIN_VALUE;
                        Object obj14 = zVar.u;
                        b71.a aVar15 = b71.a.r;
                        i12 = zVar.v;
                        if (i12 != 0) {
                            y.j(obj14);
                            z0 z0Var4 = (z0) obj;
                            y0 y0Var2 = z0Var4.b;
                            List list3 = z0Var4.c.a;
                            x0 x0Var2 = list3 != null ? (x0) x61.m.W(list3) : null;
                            if (x0Var2 != null) {
                                y7 y7Var2 = x0Var2.c;
                                x7 x7Var2 = y7Var2.g;
                                ar.c cVar5 = y7Var2.k;
                                v7 v7Var2 = y7Var2.f;
                                gVar4 = aa1.b.e(cVar5, x7Var2 != null ? x7Var2.b : "", v7Var2 != null ? v7Var2.a : null, y7Var2.l, y7Var2.o, y7Var2.h, t1.P(y7Var2.i), x7Var2 != null ? aa1.b.C(sy.w.x(x7Var2.g.b)) : null, y7Var2.j, y7Var2.m.b, x7Var2 != null ? x7Var2.h : null, y0Var2.b, y0Var2.c, true, x7Var2 != null ? x7Var2.c : false, (x7Var2 == null || (w7Var2 = x7Var2.d) == null) ? "" : w7Var2.a, x7Var2 != null ? x7Var2.e : false, x7Var2 != null ? x7Var2.f : false, (pu.a) null, aa1.b.S(z0Var4.a));
                            } else {
                                gVar4 = null;
                            }
                            if (gVar4 != null) {
                                zVar.v = 1;
                                if (this.s.c(gVar4, zVar) == aVar15) {
                                    return aVar15;
                                }
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj14);
                        }
                        return a0.a;
                    }
                }
                zVar = new z(this, cVar);
                Object obj142 = zVar.u;
                b71.a aVar152 = b71.a.r;
                i12 = zVar.v;
                if (i12 != 0) {
                }
                return a0.a;
            case 11:
                if (cVar instanceof t00.a0) {
                    a0Var = (t00.a0) cVar;
                    int i42 = a0Var.v;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        a0Var.v = i42 - Integer.MIN_VALUE;
                        Object obj15 = a0Var.u;
                        b71.a aVar16 = b71.a.r;
                        i13 = a0Var.v;
                        if (i13 != 0) {
                            y.j(obj15);
                            Boolean bool2 = Boolean.TRUE;
                            a0Var.v = 1;
                            if (this.s.c(bool2, a0Var) == aVar16) {
                                return aVar16;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj15);
                        }
                        return a0.a;
                    }
                }
                a0Var = new t00.a0(this, cVar);
                Object obj152 = a0Var.u;
                b71.a aVar162 = b71.a.r;
                i13 = a0Var.v;
                if (i13 != 0) {
                }
                return a0.a;
            case 12:
                if (cVar instanceof c0) {
                    c0Var = (c0) cVar;
                    int i43 = c0Var.v;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        c0Var.v = i43 - Integer.MIN_VALUE;
                        Object obj16 = c0Var.u;
                        b71.a aVar17 = b71.a.r;
                        i14 = c0Var.v;
                        a0 a0Var2 = a0.a;
                        if (i14 != 0) {
                            y.j(obj16);
                            c0Var.v = 1;
                            if (this.s.c(a0Var2, c0Var) == aVar17) {
                                return aVar17;
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj16);
                        }
                        return a0Var2;
                    }
                }
                c0Var = new c0(this, cVar);
                Object obj162 = c0Var.u;
                b71.a aVar172 = b71.a.r;
                i14 = c0Var.v;
                a0 a0Var22 = a0.a;
                if (i14 != 0) {
                }
                return a0Var22;
            case 13:
                if (cVar instanceof t00.d0) {
                    d0Var = (t00.d0) cVar;
                    int i44 = d0Var.v;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        d0Var.v = i44 - Integer.MIN_VALUE;
                        Object obj17 = d0Var.u;
                        b71.a aVar18 = b71.a.r;
                        i15 = d0Var.v;
                        if (i15 != 0) {
                            y.j(obj17);
                            Boolean bool3 = Boolean.TRUE;
                            d0Var.v = 1;
                            if (this.s.c(bool3, d0Var) == aVar18) {
                                return aVar18;
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj17);
                        }
                        return a0.a;
                    }
                }
                d0Var = new t00.d0(this, cVar);
                Object obj172 = d0Var.u;
                b71.a aVar182 = b71.a.r;
                i15 = d0Var.v;
                if (i15 != 0) {
                }
                return a0.a;
            case 14:
                if (cVar instanceof t00.f0) {
                    f0Var = (t00.f0) cVar;
                    int i45 = f0Var.v;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        f0Var.v = i45 - Integer.MIN_VALUE;
                        Object obj18 = f0Var.u;
                        b71.a aVar19 = b71.a.r;
                        i16 = f0Var.v;
                        if (i16 != 0) {
                            y.j(obj18);
                            mo moVar = ((lo) obj).a;
                            yz0.x2 f2 = (moVar == null || (noVar = moVar.a) == null) ? null : k41.b.f(noVar.c);
                            if (f2 != null) {
                                f0Var.v = 1;
                                if (this.s.c(f2, f0Var) == aVar19) {
                                    return aVar19;
                                }
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj18);
                        }
                        return a0.a;
                    }
                }
                f0Var = new t00.f0(this, cVar);
                Object obj182 = f0Var.u;
                b71.a aVar192 = b71.a.r;
                i16 = f0Var.v;
                if (i16 != 0) {
                }
                return a0.a;
            case 15:
                if (cVar instanceof i0) {
                    i0Var = (i0) cVar;
                    int i46 = i0Var.v;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        i0Var.v = i46 - Integer.MIN_VALUE;
                        Object obj19 = i0Var.u;
                        b71.a aVar20 = b71.a.r;
                        i17 = i0Var.v;
                        if (i17 != 0) {
                            y.j(obj19);
                            y30 y30Var = ((x30) obj).a;
                            if (y30Var == null || (z30Var = y30Var.a) == null) {
                                throw new ApiFailure(ApiFailureType.RESPONSE_ERROR, "resolveReviewThread field null", null, null, null, null, null, 120);
                            }
                            g4 a = sy.o.a(z30Var.c);
                            i0Var.v = 1;
                            if (this.s.c(a, i0Var) == aVar20) {
                                return aVar20;
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj19);
                        }
                        return a0.a;
                    }
                }
                i0Var = new i0(this, cVar);
                Object obj192 = i0Var.u;
                b71.a aVar202 = b71.a.r;
                i17 = i0Var.v;
                if (i17 != 0) {
                }
                return a0.a;
            case 16:
                if (cVar instanceof j0) {
                    j0Var = (j0) cVar;
                    int i47 = j0Var.v;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        j0Var.v = i47 - Integer.MIN_VALUE;
                        Object obj20 = j0Var.u;
                        b71.a aVar21 = b71.a.r;
                        i18 = j0Var.v;
                        if (i18 != 0) {
                            y.j(obj20);
                            q90 q90Var = ((o90) obj).a;
                            if (q90Var == null || (p90Var = q90Var.a) == null) {
                                throw new ApiFailure(ApiFailureType.RESPONSE_ERROR, "unresolveReviewThread field null", null, null, null, null, null, 120);
                            }
                            g4 a2 = sy.o.a(p90Var.c);
                            j0Var.v = 1;
                            if (this.s.c(a2, j0Var) == aVar21) {
                                return aVar21;
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj20);
                        }
                        return a0.a;
                    }
                }
                j0Var = new j0(this, cVar);
                Object obj202 = j0Var.u;
                b71.a aVar212 = b71.a.r;
                i18 = j0Var.v;
                if (i18 != 0) {
                }
                return a0.a;
            case 17:
                if (cVar instanceof k0) {
                    k0Var = (k0) cVar;
                    int i48 = k0Var.v;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        k0Var.v = i48 - Integer.MIN_VALUE;
                        Object obj21 = k0Var.u;
                        b71.a aVar22 = b71.a.r;
                        i19 = k0Var.v;
                        if (i19 != 0) {
                            y.j(obj21);
                            mb0 mb0Var = ((kb0) obj).a;
                            yz0.x2 f3 = (mb0Var == null || (nb0Var = mb0Var.a) == null) ? null : k41.b.f(nb0Var.c);
                            if (f3 != null) {
                                k0Var.v = 1;
                                if (this.s.c(f3, k0Var) == aVar22) {
                                    return aVar22;
                                }
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj21);
                        }
                        return a0.a;
                    }
                }
                k0Var = new k0(this, cVar);
                Object obj212 = k0Var.u;
                b71.a aVar222 = b71.a.r;
                i19 = k0Var.v;
                if (i19 != 0) {
                }
                return a0.a;
            case 18:
                if (cVar instanceof t00.l0) {
                    l0Var = (t00.l0) cVar;
                    int i49 = l0Var.v;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        l0Var.v = i49 - Integer.MIN_VALUE;
                        Object obj22 = l0Var.u;
                        b71.a aVar23 = b71.a.r;
                        i20 = l0Var.v;
                        if (i20 != 0) {
                            y.j(obj22);
                            xc0 xc0Var = ((vc0) obj).a;
                            ar.c cVar6 = (xc0Var == null || (wc0Var = xc0Var.a) == null) ? null : wc0Var.d;
                            if (cVar6 == null) {
                                yz0.s.Companion.getClass();
                                bVar2 = yz0.r.b;
                            } else {
                                bVar2 = new fz.b(cVar6, xc0Var.a.c, new yz0.d0(cVar6.b));
                            }
                            l0Var.v = 1;
                            if (this.s.c(bVar2, l0Var) == aVar23) {
                                return aVar23;
                            }
                        } else {
                            if (i20 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj22);
                        }
                        return a0.a;
                    }
                }
                l0Var = new t00.l0(this, cVar);
                Object obj222 = l0Var.u;
                b71.a aVar232 = b71.a.r;
                i20 = l0Var.v;
                if (i20 != 0) {
                }
                return a0.a;
            case 19:
                if (cVar instanceof m0) {
                    m0Var = (m0) cVar;
                    int i50 = m0Var.v;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        m0Var.v = i50 - Integer.MIN_VALUE;
                        Object obj23 = m0Var.u;
                        b71.a aVar24 = b71.a.r;
                        i22 = m0Var.v;
                        if (i22 != 0) {
                            y.j(obj23);
                            fg0 fg0Var = ((dg0) obj).a;
                            lv.c cVar7 = (fg0Var == null || (eg0Var = fg0Var.a) == null) ? null : eg0Var.c;
                            if (cVar7 == null) {
                                yz0.s.Companion.getClass();
                                k = new a7(yz0.r.b, false, TimelineItem$TimelinePullRequestReview$ReviewState.UNKNOWN);
                            } else {
                                k = sy.w.k(cVar7);
                            }
                            m0Var.v = 1;
                            if (this.s.c(k, m0Var) == aVar24) {
                                return aVar24;
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj23);
                        }
                        return a0.a;
                    }
                }
                m0Var = new m0(this, cVar);
                Object obj232 = m0Var.u;
                b71.a aVar242 = b71.a.r;
                i22 = m0Var.v;
                if (i22 != 0) {
                }
                return a0.a;
            case 20:
                if (cVar instanceof n0) {
                    n0Var = (n0) cVar;
                    int i52 = n0Var.v;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        n0Var.v = i52 - Integer.MIN_VALUE;
                        Object obj24 = n0Var.u;
                        b71.a aVar25 = b71.a.r;
                        i23 = n0Var.v;
                        if (i23 != 0) {
                            y.j(obj24);
                            f6 f6Var = ((e6) obj).a;
                            yz0.u0 E = (f6Var == null || (b0Var = f6Var.c) == null) ? null : y9.a.E(b0Var);
                            if (E != null) {
                                n0Var.v = 1;
                                if (this.s.c(E, n0Var) == aVar25) {
                                    return aVar25;
                                }
                            }
                        } else {
                            if (i23 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj24);
                        }
                        return a0.a;
                    }
                }
                n0Var = new n0(this, cVar);
                Object obj242 = n0Var.u;
                b71.a aVar252 = b71.a.r;
                i23 = n0Var.v;
                if (i23 != 0) {
                }
                return a0.a;
            case 21:
                if (cVar instanceof o0) {
                    o0Var = (o0) cVar;
                    int i53 = o0Var.v;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        o0Var.v = i53 - Integer.MIN_VALUE;
                        Object obj25 = o0Var.u;
                        b71.a aVar26 = b71.a.r;
                        i24 = o0Var.v;
                        if (i24 != 0) {
                            y.j(obj25);
                            b6 b6Var = ((z5) obj).a;
                            yz0.u0 E2 = (b6Var == null || (a6Var = b6Var.b) == null || (b0Var2 = a6Var.c) == null) ? null : y9.a.E(b0Var2);
                            if (E2 != null) {
                                o0Var.v = 1;
                                if (this.s.c(E2, o0Var) == aVar26) {
                                    return aVar26;
                                }
                            }
                        } else {
                            if (i24 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj25);
                        }
                        return a0.a;
                    }
                }
                o0Var = new o0(this, cVar);
                Object obj252 = o0Var.u;
                b71.a aVar262 = b71.a.r;
                i24 = o0Var.v;
                if (i24 != 0) {
                }
                return a0.a;
            case 22:
                if (cVar instanceof p0) {
                    p0Var = (p0) cVar;
                    int i54 = p0Var.v;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        p0Var.v = i54 - Integer.MIN_VALUE;
                        Object obj26 = p0Var.u;
                        b71.a aVar27 = b71.a.r;
                        i25 = p0Var.v;
                        if (i25 != 0) {
                            y.j(obj26);
                            k6 k6Var = (k6) obj;
                            p6 p6Var2 = k6Var.a;
                            String str = null;
                            r6 r6Var = p6Var2 != null ? p6Var2.c : null;
                            r<jo.o6> rVar = r.r;
                            if (r6Var != null) {
                                ?? r2 = p6Var2.c.a.b;
                                if (r2 != 0) {
                                    rVar = r2;
                                }
                                arrayList = new ArrayList();
                                for (n6 n6Var : rVar) {
                                    j4 n = n6Var != null ? q.n(n6Var.b.c) : null;
                                    if (n != null) {
                                        arrayList.add(n);
                                    }
                                }
                            } else {
                                if ((p6Var2 != null ? p6Var2.d : null) != null) {
                                    l6 l6Var = p6Var2.d.a;
                                    r rVar2 = (l6Var == null || (q6Var = l6Var.b) == null) ? null : q6Var.a.b;
                                    if (rVar2 != null) {
                                        rVar = rVar2;
                                    }
                                    arrayList = new ArrayList();
                                    for (jo.o6 o6Var : rVar) {
                                        j4 n2 = o6Var != null ? q.n(o6Var.c) : null;
                                        if (n2 != null) {
                                            arrayList.add(n2);
                                        }
                                    }
                                }
                                p6Var = k6Var.a;
                                if ((p6Var == null ? p6Var.c : null) == null) {
                                    u6 u6Var = p6Var.c.a.a;
                                    iVar = new x01.i(u6Var.b, u6Var.a, false);
                                } else if ((p6Var != null ? p6Var.d : null) != null) {
                                    l6 l6Var2 = p6Var.d.a;
                                    boolean z = (l6Var2 == null || (q6Var3 = l6Var2.b) == null) ? false : q6Var3.a.a.a;
                                    if (l6Var2 != null && (q6Var2 = l6Var2.b) != null) {
                                        str = q6Var2.a.a.b;
                                    }
                                    iVar = new x01.i(str, z, false);
                                } else {
                                    iVar = new x01.i(null, false, false);
                                }
                                w0Var = new w0(rVar, iVar);
                                p0Var.v = 1;
                                if (this.s.c(w0Var, p0Var) == aVar27) {
                                    return aVar27;
                                }
                            }
                            rVar = arrayList;
                            p6Var = k6Var.a;
                            if ((p6Var == null ? p6Var.c : null) == null) {
                            }
                            w0Var = new w0(rVar, iVar);
                            p0Var.v = 1;
                            if (this.s.c(w0Var, p0Var) == aVar27) {
                            }
                        } else {
                            if (i25 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj26);
                        }
                        return a0.a;
                    }
                }
                p0Var = new p0(this, cVar);
                Object obj262 = p0Var.u;
                b71.a aVar272 = b71.a.r;
                i25 = p0Var.v;
                if (i25 != 0) {
                }
                return a0.a;
            case 23:
                return a(cVar, obj);
            case 24:
                return b(cVar, obj);
            case 25:
                return d(cVar, obj);
            case 26:
                return e(cVar, obj);
            case 27:
                return f(cVar, obj);
            case 28:
                return g(cVar, obj);
            default:
                if (cVar instanceof c1) {
                    c1Var = (c1) cVar;
                    int i55 = c1Var.v;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        c1Var.v = i55 - Integer.MIN_VALUE;
                        Object obj27 = c1Var.u;
                        b71.a aVar28 = b71.a.r;
                        i26 = c1Var.v;
                        if (i26 != 0) {
                            y.j(obj27);
                            q7 q7Var = ((r7) obj).a;
                            is.p0 p0Var2 = (q7Var == null || (s7Var = q7Var.a) == null) ? null : s7Var.c;
                            if (p0Var2 == null) {
                                throw new ApiFailure(ApiFailureType.PARSE_ERROR, "Invalid server response.", null, null, null, null, null, 120);
                            }
                            b01.b d = f0.d(p0Var2);
                            c1Var.v = 1;
                            if (this.s.c(d, c1Var) == aVar28) {
                                return aVar28;
                            }
                        } else {
                            if (i26 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj27);
                        }
                        return a0.a;
                    }
                }
                c1Var = new c1(this, cVar);
                Object obj272 = c1Var.u;
                b71.a aVar282 = b71.a.r;
                i26 = c1Var.v;
                if (i26 != 0) {
                }
                return a0.a;
        }
    }

    public /* synthetic */ f(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }
}
