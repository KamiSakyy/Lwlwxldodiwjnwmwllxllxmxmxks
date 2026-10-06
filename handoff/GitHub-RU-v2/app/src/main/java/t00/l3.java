package t00;

import com.github.service.models.response.IssueOrPullRequest;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.type.MergeStateStatus;
import com.github.service.models.response.type.PullRequestMergeMethod;
import com.github.service.models.response.type.PullRequestReviewDecision;
import com.github.service.models.response.type.SubscriptionState;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import m10.jz;
import m10.n40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l3 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;
    public final /* synthetic */ String t;
    public final /* synthetic */ dw.h5 u;

    public /* synthetic */ l3(y71.j jVar, r3 r3Var, String str, dw.h5 h5Var, int i) {
        this.r = i;
        this.s = jVar;
        this.t = str;
        this.u = h5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x0403, code lost:
    
        if (r0 == null) goto L224;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0547 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0747 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0751 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:423:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x07ef  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x08b8  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x08f2  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x08fd  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0967  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0952 A[LOOP:6: B:539:0x092c->B:549:0x0952, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:550:0x094f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0168 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        Object intValue = null;
        Object j = null;
        Object iVar = null;
        Object str29 = null;
        Object f2 = null;
        Object R = null;
        Object subscriptionState10 = null;
        Object z52 = null;
        Object z28 = null;
        Object i24 = null;
        Object subscriptionState9 = null;
        Object list7 = null;
        Object str25 = null;
        Object str22 = null;
        Object str30 = null;
        Object str27 = null;
        Object booleanValue = null;
        Object z44 = null;
        Object z1Var = null;
        Object str26 = null;
        Object str31 = null;
        Object zonedDateTime3 = null;
        Object str13 = null;
        Object f3 = null;
        Object z59 = null;
        Object rVar6 = null;
        k3 k3Var;
        int i;
        yz0.j2 j2Var;
        zx.xShadow xVar;
        String str;
        boolean z;
        boolean z2;
        int ordinal;
        boolean z3;
        IssueOrPullRequestState issueOrPullRequestState;
        boolean z4;
        x61.rShadow<dw.a> rVar;
        ArrayList arrayList;
        rt.n nVar;
        boolean z5;
        x61.rShadow rVar2;
        rt.k kVar;
        ArrayList arrayList2;
        x61.rShadow rVar3;
        x61.rShadow<dw.q4> rVar4;
        boolean z6;
        boolean z7;
        boolean z8;
        dw.r4 r4Var;
        List list;
        ArrayList arrayList3;
        yz0.n2 n2Var;
        List<rt.m> list2;
        SubscriptionState subscriptionState;
        n3 n3Var;
        int i2;
        l3 l3Var;
        n3 n3Var2;
        b71.a aVar;
        yz0.j2 j2Var2;
        zx.h0 h0Var;
        n40 n40Var;
        int i3;
        String str2;
        boolean z9;
        n40 n40Var2;
        boolean z11;
        SubscriptionState subscriptionState2;
        gv.e5 e5Var;
        SubscriptionState subscriptionState3;
        int ordinal2;
        String str3;
        IssueOrPullRequestState issueOrPullRequestState2;
        boolean z12;
        gv.d6 d6Var;
        boolean z13;
        boolean z14;
        String str4;
        fz.b bVar;
        yz0.h2 h2Var;
        List list3;
        int size;
        int i4;
        jz jzVar;
        PullRequestReviewDecision pullRequestReviewDecision;
        ArrayList a;
        int i5;
        boolean z15;
        gv.p5 p5Var;
        gv.x5 x5Var;
        gv.x5 x5Var2;
        gv.x5 x5Var3;
        Integer num;
        gv.w5 w5Var;
        gv.p5 p5Var2;
        gv.z4 z4Var;
        int ordinal3;
        IssueOrPullRequest.ReviewerReviewState reviewerReviewState;
        SubscriptionState subscriptionState4;
        switch (this.r) {
            case 0:
                if (cVar instanceof k3) {
                    k3Var = (k3) cVar;
                    int i6 = k3Var.v;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        k3Var.v = i6 - Integer.MIN_VALUE;
                        Object obj2 = k3Var.u;
                        b71.a aVar2 = b71.a.r;
                        i = k3Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            zx.w wVar = ((zx.v) obj).a;
                            if (wVar == null || (xVar = wVar.c) == null) {
                                j2Var = null;
                            } else {
                                sy.a aVar3 = sy.b.Companion;
                                dw.h5 h5Var = this.u;
                                dw.c4 c4Var = h5Var.d;
                                yw.b bVar2 = h5Var.e;
                                SubscriptionState y0 = com.google.android.gms.internal.measurement.i4.y0(bVar2.c);
                                yw.a aVar4 = bVar2.e;
                                List list4 = aVar4 != null ? aVar4.a : null;
                                SubscriptionState y02 = com.google.android.gms.internal.measurement.i4.y0(xVar.b.c);
                                dw.t4 t4Var = xVar.c;
                                String str5 = t4Var.c;
                                dw.c cVar2 = xVar.d;
                                aVar3.getClass();
                                dw.a4 a4Var = c4Var.e;
                                pv.c cVar3 = t4Var.A;
                                n40 n40Var3 = c4Var.g;
                                int i7 = n40Var3 == null ? -1 : kz.a.a[n40Var3.ordinal()];
                                boolean z16 = i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4;
                                int i8 = n40Var3 == null ? -1 : kz.a.a[n40Var3.ordinal()];
                                boolean z17 = i8 == 1 || i8 == 2 || i8 == 3;
                                String str6 = c4Var.f;
                                String str7 = c4Var.b;
                                com.github.service.models.response.a aVar5 = new com.github.service.models.response.a(a4Var.c, w8.s.A(a4Var.d), (String) null, false, (String) null, 60);
                                String str8 = a4Var.b;
                                boolean z18 = c4Var.d;
                                SubscriptionState subscriptionState5 = SubscriptionState.IGNORED;
                                if (y02 == subscriptionState5 || y0 == subscriptionState5 || (y0 == null && y02 == null)) {
                                    str = str8;
                                } else {
                                    str = str8;
                                    SubscriptionState subscriptionState6 = SubscriptionState.UNSUBSCRIBED;
                                    if (y0 != subscriptionState6 || y02 != subscriptionState6) {
                                        z = z18;
                                        SubscriptionState subscriptionState7 = SubscriptionState.CUSTOM;
                                        if (y0 != subscriptionState7 || y02 != subscriptionState6) {
                                            if (y0 != subscriptionState7 || y02 != subscriptionState7) {
                                                z2 = true;
                                            } else if (list4 != null) {
                                                z2 = list4.contains(m10.ia.u);
                                            }
                                            SubscriptionState subscriptionState8 = SubscriptionState.SUBSCRIBED;
                                            SubscriptionState subscriptionState9 = (y0 == subscriptionState8 || y02 != null) ? subscriptionState8 : null;
                                            SubscriptionState subscriptionState10 = (y02 == subscriptionState5 || y0 == subscriptionState8 || y02 == (subscriptionState = SubscriptionState.UNSUBSCRIBED)) ? subscriptionState5 : subscriptionState;
                                            String str9 = t4Var.d;
                                            String str10 = t4Var.e;
                                            int i9 = t4Var.m;
                                            boolean z19 = t4Var.h;
                                            ordinal = t4Var.n.ordinal();
                                            if (ordinal == 0) {
                                                z3 = z2;
                                                if (ordinal == 1) {
                                                    issueOrPullRequestState = IssueOrPullRequestState.ISSUE_OPEN;
                                                } else {
                                                    if (ordinal != 2) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
                                                }
                                            } else {
                                                z3 = z2;
                                                issueOrPullRequestState = IssueOrPullRequestState.ISSUE_CLOSED;
                                            }
                                            IssueOrPullRequestState issueOrPullRequestState3 = issueOrPullRequestState;
                                            dw.m4 m4Var = t4Var.i;
                                            com.github.service.models.response.a aVar6 = new com.github.service.models.response.a(m4Var == null ? m4Var.b : "", w8.s.A(m4Var == null ? m4Var.c : null), (String) null, false, (String) null, 60);
                                            boolean b = k71.k.b(t4Var.j, Boolean.TRUE);
                                            fz.b bVar3 = new fz.b(t4Var.z, t4Var.l, new yz0.a0Shadow(str5));
                                            ArrayList h = w8.s.h(str5, cVar3);
                                            z4 = cVar3.c;
                                            dw.p4 p4Var = t4Var.o;
                                            fz.g g = k21.f.g(p4Var == null ? p4Var.c : null);
                                            List f = m71.a.f(t4Var.C);
                                            List P = com.google.android.gms.internal.measurement.i4.P(t4Var.D);
                                            dw.b bVar4 = cVar2.b;
                                            rVar = bVar4 == null ? bVar4.a : null;
                                            x61.rShadow rVar5 = x61.rShadow.r;
                                            if (rVar == null) {
                                                rVar = rVar5;
                                            }
                                            arrayList = new ArrayList();
                                            for (dw.a aVar7 : rVar) {
                                                l01.s h2 = aVar7 != null ? com.google.common.util.concurrent.a.h(aVar7.c) : null;
                                                if (h2 != null) {
                                                    arrayList.add(h2);
                                                }
                                            }
                                            boolean z20 = t4Var.g;
                                            String str11 = t4Var.b;
                                            boolean z21 = t4Var.F.b;
                                            int i11 = t4Var.p;
                                            int i12 = t4Var.q;
                                            pu.a aVar8 = t4Var.B;
                                            boolean z22 = aVar8.b;
                                            boolean z23 = aVar8.c;
                                            rt.o oVar = t4Var.E;
                                            nVar = oVar.a;
                                            if (nVar != null || (list2 = nVar.b) == null) {
                                                z5 = z4;
                                                rVar2 = null;
                                            } else {
                                                rVar2 = new ArrayList();
                                                for (rt.m mVar : list2) {
                                                    boolean z24 = z4;
                                                    String str12 = mVar != null ? mVar.a : null;
                                                    if (str12 != null) {
                                                        rVar2.add(str12);
                                                    }
                                                    z4 = z24;
                                                }
                                                z5 = z4;
                                            }
                                            if (rVar2 == null) {
                                                rVar2 = rVar5;
                                            }
                                            kVar = oVar.b;
                                            if (kVar != null || (list = kVar.b) == null) {
                                                arrayList2 = arrayList;
                                                rVar3 = null;
                                            } else {
                                                rVar3 = new ArrayList();
                                                Iterator it = list.iterator();
                                                while (it.hasNext()) {
                                                    Iterator it2 = it;
                                                    rt.l lVar = (rt.l) it.next();
                                                    if (lVar != null) {
                                                        gv.e2 e2Var = lVar.c;
                                                        arrayList3 = arrayList;
                                                        n2Var = sy.c.d(e2Var, rVar2.contains(e2Var.a));
                                                    } else {
                                                        arrayList3 = arrayList;
                                                        n2Var = null;
                                                    }
                                                    if (n2Var != null) {
                                                        rVar3.add(n2Var);
                                                    }
                                                    it = it2;
                                                    arrayList = arrayList3;
                                                }
                                                arrayList2 = arrayList;
                                            }
                                            x61.rShadow rVar6 = rVar3 != null ? rVar5 : rVar3;
                                            boolean z25 = t4Var.r;
                                            PullRequestReviewDecision pullRequestReviewDecision2 = PullRequestReviewDecision.UNKNOWN__;
                                            CloseReason w = sy.w.w(t4Var.s);
                                            boolean z26 = t4Var.t;
                                            boolean z27 = t4Var.u;
                                            Boolean bool = t4Var.v;
                                            boolean booleanValue = bool == null ? bool.booleanValue() : false;
                                            dw.o4 o4Var = t4Var.w;
                                            IssueType f2 = o4Var == null ? com.google.android.gms.internal.measurement.z3.f(o4Var.c) : null;
                                            dw.z3 z3Var = c4Var.p;
                                            boolean z28 = (z3Var == null ? z3Var.a : 0) <= 0;
                                            dw.q0 q0Var = t4Var.G.a;
                                            h01.j f3 = q0Var == null ? sy.s.f(q0Var) : null;
                                            dw.n4 n4Var = t4Var.x;
                                            z01.p j = n4Var == null ? sy.c.j(n4Var.c) : null;
                                            rVar4 = t4Var.y.a;
                                            if (rVar4 == null) {
                                                rVar4 = rVar5;
                                            }
                                            if (!rVar4.isEmpty()) {
                                                for (dw.q4 q4Var : rVar4) {
                                                    if (q4Var == null || (r4Var = q4Var.b) == null) {
                                                        z6 = z25;
                                                    } else {
                                                        z6 = z25;
                                                        if (r4Var.b) {
                                                            z7 = true;
                                                            if (z7) {
                                                                z25 = z6;
                                                            } else {
                                                                z8 = true;
                                                                dw.y3 y3Var = c4Var.q;
                                                                String str13 = y3Var != null ? y3Var.a : null;
                                                                dw.b4 b4Var = c4Var.r;
                                                                j2Var = new yz0.j2(this.t, str6, str7, aVar5, str, z, z16, str5, z3, subscriptionState9, subscriptionState10, str9, str10, i9, z19, issueOrPullRequestState3, aVar6, b, bVar3, h, z5, g, f, P, rVar5, arrayList2, false, z20, str11, z21, z17, i11, i12, z22, z23, rVar6, z6, z26, z27, str13, (b4Var != null ? b4Var.a : 0) > 0, (String) null, (String) null, false, false, (yz0.a2) null, (yz0.z1) null, (String) null, (yz0.c2) null, rVar5, rVar5, false, pullRequestReviewDecision2, (h01.h) null, (h01.c) null, 0, false, false, false, (String) null, (String) null, false, false, false, w, booleanValue, f2, z28, f3, j, z8, 1073741824);
                                                            }
                                                        }
                                                    }
                                                    z7 = false;
                                                    if (z7) {
                                                    }
                                                }
                                            }
                                            z6 = z25;
                                            z8 = false;
                                            dw.y3 y3Var2 = c4Var.q;
                                            if (y3Var2 != null) {
                                            }
                                            dw.b4 b4Var2 = c4Var.r;
                                            j2Var = new yz0.j2(this.t, str6, str7, aVar5, str, z, z16, str5, z3, subscriptionState9, subscriptionState10, str9, str10, i9, z19, issueOrPullRequestState3, aVar6, b, bVar3, h, z5, g, f, P, rVar5, arrayList2, false, z20, str11, z21, z17, i11, i12, z22, z23, rVar6, z6, z26, z27, str13, (b4Var2 != null ? b4Var2.a : 0) > 0, (String) null, (String) null, false, false, (yz0.a2) null, (yz0.z1) null, (String) null, (yz0.c2) null, rVar5, rVar5, false, pullRequestReviewDecision2, (h01.h) null, (h01.c) null, 0, false, false, false, (String) null, (String) null, false, false, false, w, booleanValue, f2, z28, f3, j, z8, 1073741824);
                                        }
                                        z2 = false;
                                        SubscriptionState subscriptionState82 = SubscriptionState.SUBSCRIBED;
                                        if (y0 == subscriptionState82) {
                                        }
                                        if (y02 == subscriptionState5) {
                                            String str92 = t4Var.d;
                                            String str102 = t4Var.e;
                                            int i92 = t4Var.m;
                                            boolean z192 = t4Var.h;
                                            ordinal = t4Var.n.ordinal();
                                            if (ordinal == 0) {
                                            }
                                            IssueOrPullRequestState issueOrPullRequestState32 = issueOrPullRequestState;
                                            dw.m4 m4Var2 = t4Var.i;
                                            com.github.service.models.response.a aVar62 = new com.github.service.models.response.a(m4Var2 == null ? m4Var2.b : "", w8.s.A(m4Var2 == null ? m4Var2.c : null), (String) null, false, (String) null, 60);
                                            boolean b2 = k71.k.b(t4Var.j, Boolean.TRUE);
                                            fz.b bVar32 = new fz.b(t4Var.z, t4Var.l, new yz0.a0Shadow(str5));
                                            ArrayList h3 = w8.s.h(str5, cVar3);
                                            z4 = cVar3.c;
                                            dw.p4 p4Var2 = t4Var.o;
                                            fz.g g2 = k21.f.g(p4Var2 == null ? p4Var2.c : null);
                                            List f4 = m71.a.f(t4Var.C);
                                            List P2 = com.google.android.gms.internal.measurement.i4.P(t4Var.D);
                                            dw.b bVar42 = cVar2.b;
                                            if (bVar42 == null) {
                                            }
                                            x61.rShadow rVar52 = x61.rShadow.r;
                                            if (rVar == null) {
                                            }
                                            arrayList = new ArrayList();
                                            while (r1.hasNext()) {
                                            }
                                            boolean z202 = t4Var.g;
                                            String str112 = t4Var.b;
                                            boolean z212 = t4Var.F.b;
                                            int i112 = t4Var.p;
                                            int i122 = t4Var.q;
                                            pu.a aVar82 = t4Var.B;
                                            boolean z222 = aVar82.b;
                                            boolean z232 = aVar82.c;
                                            rt.o oVar2 = t4Var.E;
                                            nVar = oVar2.a;
                                            if (nVar != null) {
                                            }
                                            z5 = z4;
                                            rVar2 = null;
                                            if (rVar2 == null) {
                                            }
                                            kVar = oVar2.b;
                                            if (kVar != null) {
                                            }
                                            arrayList2 = arrayList;
                                            rVar3 = null;
                                            if (rVar3 != null) {
                                            }
                                            boolean z252 = t4Var.r;
                                            PullRequestReviewDecision pullRequestReviewDecision22 = PullRequestReviewDecision.UNKNOWN__;
                                            CloseReason w2 = sy.w.w(t4Var.s);
                                            boolean z262 = t4Var.t;
                                            boolean z272 = t4Var.u;
                                            Boolean bool2 = t4Var.v;
                                            if (bool2 == null) {
                                            }
                                            dw.o4 o4Var2 = t4Var.w;
                                            if (o4Var2 == null) {
                                            }
                                            dw.z3 z3Var2 = c4Var.p;
                                            if ((z3Var2 == null ? z3Var2.a : 0) <= 0) {
                                            }
                                            dw.q0 q0Var2 = t4Var.G.a;
                                            if (q0Var2 == null) {
                                            }
                                            dw.n4 n4Var2 = t4Var.x;
                                            if (n4Var2 == null) {
                                            }
                                            rVar4 = t4Var.y.a;
                                            if (rVar4 == null) {
                                            }
                                            if (!rVar4.isEmpty()) {
                                            }
                                            z6 = z252;
                                            z8 = false;
                                            dw.y3 y3Var22 = c4Var.q;
                                            if (y3Var22 != null) {
                                            }
                                            dw.b4 b4Var22 = c4Var.r;
                                            j2Var = new yz0.j2(this.t, str6, str7, aVar5, str, z, z16, str5, z3, subscriptionState9, subscriptionState10, str92, str102, i92, z192, issueOrPullRequestState32, aVar62, b2, bVar32, h3, z5, g2, f4, P2, rVar52, arrayList2, false, z202, str112, z212, z17, i112, i122, z222, z232, rVar6, z6, z262, z272, str13, (b4Var22 != null ? b4Var22.a : 0) > 0, (String) null, (String) null, false, false, (yz0.a2) null, (yz0.z1) null, (String) null, (yz0.c2) null, rVar52, rVar52, false, pullRequestReviewDecision22, (h01.h) null, (h01.c) null, 0, false, false, false, (String) null, (String) null, false, false, false, w2, booleanValue, f2, z28, f3, j, z8, 1073741824);
                                        }
                                        String str922 = t4Var.d;
                                        String str1022 = t4Var.e;
                                        int i922 = t4Var.m;
                                        boolean z1922 = t4Var.h;
                                        ordinal = t4Var.n.ordinal();
                                        if (ordinal == 0) {
                                        }
                                        IssueOrPullRequestState issueOrPullRequestState322 = issueOrPullRequestState;
                                        dw.m4 m4Var22 = t4Var.i;
                                        com.github.service.models.response.a aVar622 = new com.github.service.models.response.a(m4Var22 == null ? m4Var22.b : "", w8.s.A(m4Var22 == null ? m4Var22.c : null), (String) null, false, (String) null, 60);
                                        boolean b22 = k71.k.b(t4Var.j, Boolean.TRUE);
                                        fz.b bVar322 = new fz.b(t4Var.z, t4Var.l, new yz0.a0Shadow(str5));
                                        ArrayList h32 = w8.s.h(str5, cVar3);
                                        z4 = cVar3.c;
                                        dw.p4 p4Var22 = t4Var.o;
                                        fz.g g22 = k21.f.g(p4Var22 == null ? p4Var22.c : null);
                                        List f42 = m71.a.f(t4Var.C);
                                        List P22 = com.google.android.gms.internal.measurement.i4.P(t4Var.D);
                                        dw.b bVar422 = cVar2.b;
                                        if (bVar422 == null) {
                                        }
                                        x61.rShadow rVar522 = x61.rShadow.r;
                                        if (rVar == null) {
                                        }
                                        arrayList = new ArrayList();
                                        while (r1.hasNext()) {
                                        }
                                        boolean z2022 = t4Var.g;
                                        String str1122 = t4Var.b;
                                        boolean z2122 = t4Var.F.b;
                                        int i1122 = t4Var.p;
                                        int i1222 = t4Var.q;
                                        pu.a aVar822 = t4Var.B;
                                        boolean z2222 = aVar822.b;
                                        boolean z2322 = aVar822.c;
                                        rt.o oVar22 = t4Var.E;
                                        nVar = oVar22.a;
                                        if (nVar != null) {
                                        }
                                        z5 = z4;
                                        rVar2 = null;
                                        if (rVar2 == null) {
                                        }
                                        kVar = oVar22.b;
                                        if (kVar != null) {
                                        }
                                        arrayList2 = arrayList;
                                        rVar3 = null;
                                        if (rVar3 != null) {
                                        }
                                        boolean z2522 = t4Var.r;
                                        PullRequestReviewDecision pullRequestReviewDecision222 = PullRequestReviewDecision.UNKNOWN__;
                                        CloseReason w22 = sy.w.w(t4Var.s);
                                        boolean z2622 = t4Var.t;
                                        boolean z2722 = t4Var.u;
                                        Boolean bool22 = t4Var.v;
                                        if (bool22 == null) {
                                        }
                                        dw.o4 o4Var22 = t4Var.w;
                                        if (o4Var22 == null) {
                                        }
                                        dw.z3 z3Var22 = c4Var.p;
                                        if ((z3Var22 == null ? z3Var22.a : 0) <= 0) {
                                        }
                                        dw.q0 q0Var22 = t4Var.G.a;
                                        if (q0Var22 == null) {
                                        }
                                        dw.n4 n4Var22 = t4Var.x;
                                        if (n4Var22 == null) {
                                        }
                                        rVar4 = t4Var.y.a;
                                        if (rVar4 == null) {
                                        }
                                        if (!rVar4.isEmpty()) {
                                        }
                                        z6 = z2522;
                                        z8 = false;
                                        dw.y3 y3Var222 = c4Var.q;
                                        if (y3Var222 != null) {
                                        }
                                        dw.b4 b4Var222 = c4Var.r;
                                        j2Var = new yz0.j2(this.t, str6, str7, aVar5, str, z, z16, str5, z3, subscriptionState9, subscriptionState10, str922, str1022, i922, z1922, issueOrPullRequestState322, aVar622, b22, bVar322, h32, z5, g22, f42, P22, rVar522, arrayList2, false, z2022, str1122, z2122, z17, i1122, i1222, z2222, z2322, rVar6, z6, z2622, z2722, str13, (b4Var222 != null ? b4Var222.a : 0) > 0, (String) null, (String) null, false, false, (yz0.a2) null, (yz0.z1) null, (String) null, (yz0.c2) null, rVar522, rVar522, false, pullRequestReviewDecision222, (h01.h) null, (h01.c) null, 0, false, false, false, (String) null, (String) null, false, false, false, w22, booleanValue, f2, z28, f3, j, z8, 1073741824);
                                    }
                                }
                                z = z18;
                                z2 = false;
                                SubscriptionState subscriptionState822 = SubscriptionState.SUBSCRIBED;
                                if (y0 == subscriptionState822) {
                                }
                                if (y02 == subscriptionState5) {
                                }
                                String str9222 = t4Var.d;
                                String str10222 = t4Var.e;
                                int i9222 = t4Var.m;
                                boolean z19222 = t4Var.h;
                                ordinal = t4Var.n.ordinal();
                                if (ordinal == 0) {
                                }
                                IssueOrPullRequestState issueOrPullRequestState3222 = issueOrPullRequestState;
                                dw.m4 m4Var222 = t4Var.i;
                                com.github.service.models.response.a aVar6222 = new com.github.service.models.response.a(m4Var222 == null ? m4Var222.b : "", w8.s.A(m4Var222 == null ? m4Var222.c : null), (String) null, false, (String) null, 60);
                                boolean b222 = k71.k.b(t4Var.j, Boolean.TRUE);
                                fz.b bVar3222 = new fz.b(t4Var.z, t4Var.l, new yz0.a0Shadow(str5));
                                ArrayList h322 = w8.s.h(str5, cVar3);
                                z4 = cVar3.c;
                                dw.p4 p4Var222 = t4Var.o;
                                fz.g g222 = k21.f.g(p4Var222 == null ? p4Var222.c : null);
                                List f422 = m71.a.f(t4Var.C);
                                List P222 = com.google.android.gms.internal.measurement.i4.P(t4Var.D);
                                dw.b bVar4222 = cVar2.b;
                                if (bVar4222 == null) {
                                }
                                x61.rShadow rVar5222 = x61.rShadow.r;
                                if (rVar == null) {
                                }
                                arrayList = new ArrayList();
                                while (r1.hasNext()) {
                                }
                                boolean z20222 = t4Var.g;
                                String str11222 = t4Var.b;
                                boolean z21222 = t4Var.F.b;
                                int i11222 = t4Var.p;
                                int i12222 = t4Var.q;
                                pu.a aVar8222 = t4Var.B;
                                boolean z22222 = aVar8222.b;
                                boolean z23222 = aVar8222.c;
                                rt.o oVar222 = t4Var.E;
                                nVar = oVar222.a;
                                if (nVar != null) {
                                }
                                z5 = z4;
                                rVar2 = null;
                                if (rVar2 == null) {
                                }
                                kVar = oVar222.b;
                                if (kVar != null) {
                                }
                                arrayList2 = arrayList;
                                rVar3 = null;
                                if (rVar3 != null) {
                                }
                                boolean z25222 = t4Var.r;
                                PullRequestReviewDecision pullRequestReviewDecision2222 = PullRequestReviewDecision.UNKNOWN__;
                                CloseReason w222 = sy.w.w(t4Var.s);
                                boolean z26222 = t4Var.t;
                                boolean z27222 = t4Var.u;
                                Boolean bool222 = t4Var.v;
                                if (bool222 == null) {
                                }
                                dw.o4 o4Var222 = t4Var.w;
                                if (o4Var222 == null) {
                                }
                                dw.z3 z3Var222 = c4Var.p;
                                if ((z3Var222 == null ? z3Var222.a : 0) <= 0) {
                                }
                                dw.q0 q0Var222 = t4Var.G.a;
                                if (q0Var222 == null) {
                                }
                                dw.n4 n4Var222 = t4Var.x;
                                if (n4Var222 == null) {
                                }
                                rVar4 = t4Var.y.a;
                                if (rVar4 == null) {
                                }
                                if (!rVar4.isEmpty()) {
                                }
                                z6 = z25222;
                                z8 = false;
                                dw.y3 y3Var2222 = c4Var.q;
                                if (y3Var2222 != null) {
                                }
                                dw.b4 b4Var2222 = c4Var.r;
                                j2Var = new yz0.j2(this.t, str6, str7, aVar5, str, z, z16, str5, z3, subscriptionState9, subscriptionState10, str9222, str10222, i9222, z19222, issueOrPullRequestState3222, aVar6222, b222, bVar3222, h322, z5, g222, f422, P222, rVar5222, arrayList2, false, z20222, str11222, z21222, z17, i11222, i12222, z22222, z23222, rVar6, z6, z26222, z27222, str13, (b4Var2222 != null ? b4Var2222.a : 0) > 0, (String) null, (String) null, false, false, (yz0.a2) null, (yz0.z1) null, (String) null, (yz0.c2) null, rVar5222, rVar5222, false, pullRequestReviewDecision2222, (h01.h) null, (h01.c) null, 0, false, false, false, (String) null, (String) null, false, false, false, w222, booleanValue, f2, z28, f3, j, z8, 1073741824);
                            }
                            if (j2Var != null) {
                                k3Var.v = 1;
                                if (this.s.c(j2Var, k3Var) == aVar2) {
                                    return aVar2;
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
                k3Var = new k3(this, cVar);
                Object obj22 = k3Var.u;
                b71.a aVar22 = b71.a.r;
                i = k3Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            default:
                if (cVar instanceof n3) {
                    n3Var = (n3) cVar;
                    int i13 = n3Var.v;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        n3Var.v = i13 - Integer.MIN_VALUE;
                        Object obj3 = n3Var.u;
                        b71.a aVar9 = b71.a.r;
                        i2 = n3Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            zx.g0 g0Var = ((zx.f0) obj).a;
                            if (g0Var == null || (h0Var = g0Var.c) == null) {
                                l3Var = this;
                                n3Var2 = n3Var;
                                aVar = aVar9;
                                j2Var2 = null;
                            } else {
                                sy.a aVar10 = sy.b.Companion;
                                dw.h5 h5Var2 = this.u;
                                dw.c4 c4Var2 = h5Var2.d;
                                yw.b bVar5 = h5Var2.e;
                                SubscriptionState y03 = com.google.android.gms.internal.measurement.i4.y0(bVar5.c);
                                SubscriptionState y04 = com.google.android.gms.internal.measurement.i4.y0(h0Var.b.c);
                                yw.a aVar11 = bVar5.e;
                                List list5 = aVar11 != null ? aVar11.a : null;
                                gv.g6 g6Var = h0Var.c;
                                String str14 = g6Var.b;
                                String str15 = g6Var.c;
                                dw.e1 e1Var = h0Var.d;
                                aVar10.getClass();
                                dw.a4 a4Var2 = c4Var2.e;
                                gv.e5 e5Var2 = g6Var.K;
                                gv.f5 f5Var = g6Var.J;
                                gv.z5 z5Var = g6Var.I;
                                gv.c5 c5Var = g6Var.F;
                                aVar = aVar9;
                                pv.c cVar4 = g6Var.V;
                                n3Var2 = n3Var;
                                gv.w4 w4Var = g6Var.D;
                                mx.a aVar12 = g6Var.a0;
                                gv.a5 a5Var = g6Var.N;
                                List list6 = a5Var.c;
                                n40 n40Var4 = c4Var2.g;
                                if (n40Var4 == null) {
                                    n40Var = n40Var4;
                                    i3 = -1;
                                } else {
                                    n40Var = n40Var4;
                                    i3 = kz.a.a[n40Var4.ordinal()];
                                }
                                boolean z29 = i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4;
                                int i14 = n40Var == null ? -1 : kz.a.a[n40Var.ordinal()];
                                boolean z31 = z29;
                                boolean z32 = i14 == 1 || i14 == 2 || i14 == 3;
                                int i15 = n40Var == null ? -1 : kz.a.a[n40Var.ordinal()];
                                boolean z33 = i15 == 1 || i15 == 2 || i15 == 3;
                                String str16 = c4Var2.f;
                                String str17 = c4Var2.b;
                                com.github.service.models.response.a aVar13 = new com.github.service.models.response.a(a4Var2.c, w8.s.A(a4Var2.d), (String) null, false, (String) null, 60);
                                String str18 = a4Var2.b;
                                boolean z34 = c4Var2.d;
                                SubscriptionState subscriptionState11 = SubscriptionState.IGNORED;
                                if (y04 == subscriptionState11 || y03 == subscriptionState11 || (y03 == null && y04 == null)) {
                                    str2 = str18;
                                } else {
                                    str2 = str18;
                                    SubscriptionState subscriptionState12 = SubscriptionState.UNSUBSCRIBED;
                                    if (y03 != subscriptionState12 || y04 != subscriptionState12) {
                                        z9 = z34;
                                        SubscriptionState subscriptionState13 = SubscriptionState.CUSTOM;
                                        if (y03 != subscriptionState13 || y04 != subscriptionState12) {
                                            if (y03 != subscriptionState13 || y04 != subscriptionState13) {
                                                n40Var2 = n40Var;
                                                z11 = true;
                                            } else if (list5 != null) {
                                                n40 n40Var5 = n40Var;
                                                z11 = list5.contains(m10.ia.v);
                                                n40Var2 = n40Var5;
                                            }
                                            subscriptionState2 = SubscriptionState.SUBSCRIBED;
                                            if (y03 == subscriptionState2 || y04 != null) {
                                                e5Var = e5Var2;
                                                subscriptionState3 = subscriptionState2;
                                            } else {
                                                e5Var = e5Var2;
                                                subscriptionState3 = null;
                                            }
                                            if (y04 != subscriptionState11 && y03 != subscriptionState2 && y04 != (subscriptionState4 = SubscriptionState.UNSUBSCRIBED)) {
                                                subscriptionState11 = subscriptionState4;
                                            }
                                            String str19 = g6Var.g;
                                            String str20 = g6Var.h;
                                            int i16 = g6Var.q;
                                            n40 n40Var6 = n40Var2;
                                            boolean z35 = g6Var.m;
                                            ordinal2 = g6Var.r.ordinal();
                                            if (ordinal2 != 0) {
                                                str3 = str19;
                                                if (ordinal2 == 1) {
                                                    issueOrPullRequestState2 = IssueOrPullRequestState.PULL_REQUEST_MERGED;
                                                } else if (ordinal2 == 2) {
                                                    issueOrPullRequestState2 = g6Var.B ? IssueOrPullRequestState.PULL_REQUEST_DRAFT : IssueOrPullRequestState.PULL_REQUEST_OPEN;
                                                } else {
                                                    if (ordinal2 != 3) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    issueOrPullRequestState2 = IssueOrPullRequestState.UNKNOWN;
                                                }
                                            } else {
                                                str3 = str19;
                                                issueOrPullRequestState2 = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
                                            }
                                            gv.v4 v4Var = g6Var.n;
                                            IssueOrPullRequestState issueOrPullRequestState4 = issueOrPullRequestState2;
                                            com.github.service.models.response.a aVar14 = new com.github.service.models.response.a(v4Var != null ? v4Var.b : "", w8.s.A(v4Var != null ? v4Var.c : null), (String) null, false, (String) null, 60);
                                            boolean b3 = k71.k.b(g6Var.o, Boolean.TRUE);
                                            gv.e5 e5Var3 = e5Var;
                                            fz.b bVar6 = new fz.b(g6Var.U, str14, new yz0.b0(str15));
                                            String str21 = str3;
                                            ArrayList h4 = w8.s.h(str15, cVar4);
                                            boolean z36 = cVar4.c;
                                            gv.k5 k5Var = g6Var.H;
                                            fz.g g3 = k21.f.g(k5Var != null ? k5Var.c : null);
                                            List f5 = m71.a.f(g6Var.X);
                                            List P3 = com.google.android.gms.internal.measurement.i4.P(g6Var.Y);
                                            dw.d1 d1Var = e1Var.b;
                                            List list7 = d1Var != null ? d1Var.a : null;
                                            List list8 = x61.rShadow.r;
                                            List<dw.c1> list9 = list7 == null ? list8 : list7;
                                            ArrayList arrayList4 = new ArrayList();
                                            for (dw.c1 c1Var : list9) {
                                                List list10 = P3;
                                                l01.s h5 = c1Var != null ? com.google.common.util.concurrent.a.h(c1Var.c) : null;
                                                if (h5 != null) {
                                                    arrayList4.add(h5);
                                                }
                                                P3 = list10;
                                            }
                                            List list11 = P3;
                                            boolean z37 = g6Var.j;
                                            boolean z38 = g6Var.k;
                                            z12 = aVar12.b;
                                            pu.a aVar15 = g6Var.W;
                                            boolean z39 = aVar15.b;
                                            boolean z41 = aVar15.c;
                                            List c = sy.c.c(g6Var.Z);
                                            boolean z42 = g6Var.P;
                                            boolean z43 = g6Var.B;
                                            int i17 = g6Var.s;
                                            int i18 = g6Var.t;
                                            int i19 = g6Var.u;
                                            boolean z44 = g6Var.b0.b != null;
                                            d6Var = g6Var.O;
                                            if (d6Var != null) {
                                                if (list6 != null) {
                                                    z13 = z39;
                                                    gv.p5 p5Var3 = (gv.p5) x61.m.f0(list6);
                                                    if (p5Var3 != null) {
                                                        z4Var = p5Var3.b;
                                                        z14 = z37;
                                                        str4 = str21;
                                                        ordinal3 = d6Var.a.ordinal();
                                                        if (ordinal3 == 0) {
                                                            bVar = bVar6;
                                                            if (ordinal3 == 1) {
                                                                reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.CHANGES_REQUESTED;
                                                            } else if (ordinal3 == 2) {
                                                                reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.COMMENTED;
                                                            } else if (ordinal3 == 3) {
                                                                reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.DISMISSED;
                                                            } else if (ordinal3 == 4) {
                                                                reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.PENDING;
                                                            } else {
                                                                if (ordinal3 != 5) {
                                                                    throw new NoWhenBranchMatchedException();
                                                                }
                                                                reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.UNKNOWN;
                                                            }
                                                        } else {
                                                            bVar = bVar6;
                                                            reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.APPROVED;
                                                        }
                                                        ZonedDateTime zonedDateTime = d6Var.b;
                                                        h2Var = new yz0.h2(reviewerReviewState, zonedDateTime, z4Var == null && z4Var.b.isAfter(zonedDateTime));
                                                    }
                                                } else {
                                                    z13 = z39;
                                                }
                                                z4Var = null;
                                                z14 = z37;
                                                str4 = str21;
                                                ordinal3 = d6Var.a.ordinal();
                                                if (ordinal3 == 0) {
                                                }
                                                ZonedDateTime zonedDateTime2 = d6Var.b;
                                                h2Var = new yz0.h2(reviewerReviewState, zonedDateTime2, z4Var == null && z4Var.b.isAfter(zonedDateTime2));
                                            } else {
                                                z13 = z39;
                                                z14 = z37;
                                                str4 = str21;
                                                bVar = bVar6;
                                                h2Var = null;
                                            }
                                            yz0.a2 a2Var = new yz0.a2(i17, i18, i19, z44, h2Var);
                                            yz0.z1 z1Var = (list6 != null || (p5Var2 = (gv.p5) x61.m.f0(list6)) == null) ? null : new yz0.z1(a5Var.b, p5Var2.b.b);
                                            String str22 = c5Var != null ? c5Var.a : null;
                                            yz0.c2 c2Var = new yz0.c2(g6Var.E, g6Var.G);
                                            ArrayList a2 = sy.a.a(z5Var, f5Var, e5Var3);
                                            String str23 = str22;
                                            list3 = g6Var.L.a;
                                            if (list3 == null) {
                                                list3 = list8;
                                            }
                                            ArrayList S = x61.m.S(list3);
                                            yz0.z1 z1Var2 = z1Var;
                                            ArrayList arrayList5 = new ArrayList();
                                            size = S.size();
                                            i4 = 0;
                                            while (i4 < size) {
                                                Object obj4 = S.get(i4);
                                                int i21 = i4 + 1;
                                                ArrayList arrayList6 = S;
                                                gv.o5 o5Var = (gv.o5) obj4;
                                                int i22 = size;
                                                gv.a6 a6Var = o5Var.c;
                                                gv.v5 v5Var = a6Var.c;
                                                gv.s5 s5Var = a6Var.d;
                                                yz0.g2 g2Var = v5Var != null ? new yz0.g2(o5Var.a, o5Var.b, v5Var.b, yz0.f2.d, new com.github.service.models.response.a(v5Var.c, w8.s.A(v5Var.d), (String) null, false, (String) null, 60)) : s5Var != null ? new yz0.g2(o5Var.a, o5Var.b, s5Var.b, yz0.f2.a, new com.github.service.models.response.a(s5Var.c, w8.s.A(s5Var.g), s5Var.d, s5Var.e, s5Var.f, 16)) : null;
                                                if (g2Var != null) {
                                                    arrayList5.add(g2Var);
                                                }
                                                size = i22;
                                                S = arrayList6;
                                                i4 = i21;
                                            }
                                            jzVar = g6Var.A;
                                            if (jzVar != null) {
                                                int ordinal4 = jzVar.ordinal();
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
                                            gv.g5 g5Var = g6Var.x;
                                            gv.b bVar7 = g6Var.c0;
                                            MergeStateStatus L = k21.f.L(g6Var.v);
                                            ArrayList K = x61.l.K(new PullRequestMergeMethod[]{c4Var2.j ? PullRequestMergeMethod.MERGE : null, c4Var2.h ? PullRequestMergeMethod.SQUASH : null, c4Var2.i ? PullRequestMergeMethod.REBASE : null});
                                            boolean z45 = !((c5Var != null || (w5Var = c5Var.b) == null) ? true : w5Var.a);
                                            PullRequestMergeMethod G = w8.s.G(c4Var2.l);
                                            String str24 = c4Var2.k;
                                            List list12 = c4Var2.m;
                                            gv.a aVar16 = bVar7.d;
                                            yz0.i iVar = aVar16 != null ? new yz0.i(w8.s.G(aVar16.a)) : null;
                                            boolean z46 = bVar7.c;
                                            boolean z47 = bVar7.b;
                                            boolean z48 = g6Var.Q;
                                            gv.j5 j5Var = g6Var.w;
                                            String str25 = j5Var != null ? j5Var.b : null;
                                            String str26 = g5Var != null ? g5Var.a : null;
                                            ZonedDateTime zonedDateTime3 = g5Var != null ? g5Var.b : null;
                                            gv.i5 i5Var = g6Var.z;
                                            i01.b R = i5Var != null ? com.google.common.util.concurrent.a.R(i5Var.c) : null;
                                            gv.h5 h5Var3 = g6Var.y;
                                            h01.h hVar = new h01.h(L, K, z45, G, str24, list12, iVar, z46, z47, z48, str25, str26, zonedDateTime3, R, h5Var3 != null ? i21.a.I(h5Var3.c) : null);
                                            iz.b bVar8 = new iz.b(g6Var);
                                            a = sy.a.a(z5Var, f5Var, e5Var3);
                                            int intValue = (w4Var != null || (x5Var3 = w4Var.a) == null || (num = x5Var3.a) == null) ? 0 : num.intValue();
                                            boolean z49 = (w4Var != null || (x5Var2 = w4Var.a) == null) ? false : x5Var2.b;
                                            if (a.isEmpty()) {
                                                i5 = 0;
                                            } else {
                                                int size2 = a.size();
                                                i5 = 0;
                                                int i23 = 0;
                                                while (i23 < size2) {
                                                    Object obj5 = a.get(i23);
                                                    i23++;
                                                    yz0.e2 e2Var2 = (yz0.e2) obj5;
                                                    iz.b bVar9 = bVar8;
                                                    IssueOrPullRequest.ReviewerReviewState reviewerReviewState2 = e2Var2.b;
                                                    ArrayList arrayList7 = a;
                                                    boolean z51 = e2Var2.c;
                                                    IssueOrPullRequest.ReviewerReviewState reviewerReviewState3 = IssueOrPullRequest.ReviewerReviewState.APPROVED;
                                                    if (reviewerReviewState2 != reviewerReviewState3 || !z51) {
                                                        yz0.d2 d2Var = e2Var2.g;
                                                        if ((d2Var != null ? d2Var.c : null) != reviewerReviewState3) {
                                                            continue;
                                                        } else if (!z51) {
                                                            continue;
                                                        }
                                                        a = arrayList7;
                                                        bVar8 = bVar9;
                                                    }
                                                    i5++;
                                                    if (i5 < 0) {
                                                        sy.d0Shadow.w();
                                                        throw null;
                                                    }
                                                    a = arrayList7;
                                                    bVar8 = bVar9;
                                                }
                                            }
                                            iz.b bVar10 = bVar8;
                                            int i24 = intValue > 0 ? z49 ? (i5 * 100) / (intValue + i5) : (i5 * 100) / intValue : 0;
                                            boolean z52 = !((w4Var != null || (x5Var = w4Var.a) == null) ? z31 : x5Var.c) && z12;
                                            boolean z53 = c4Var2.n;
                                            if (z12) {
                                                int i25 = n40Var6 != null ? kz.a.a[n40Var6.ordinal()] : -1;
                                                if (i25 == 1 || i25 == 2 || i25 == 3) {
                                                    z15 = true;
                                                    String str27 = (list6 != null || (p5Var = (gv.p5) x61.m.W(list6)) == null) ? null : p5Var.b.a;
                                                    String str28 = g6Var.d;
                                                    boolean z54 = c4Var2.o;
                                                    boolean z55 = g6Var.R;
                                                    boolean z56 = g6Var.S;
                                                    gv.x4 x4Var = g6Var.f;
                                                    String str29 = x4Var == null ? x4Var.b : null;
                                                    gv.d5 d5Var = g6Var.e;
                                                    String str30 = d5Var == null ? d5Var.b : null;
                                                    boolean z57 = g6Var.l;
                                                    boolean z58 = g6Var.T;
                                                    dw.y3 y3Var3 = c4Var2.q;
                                                    String str31 = y3Var3 == null ? y3Var3.a : null;
                                                    dw.b4 b4Var3 = c4Var2.r;
                                                    boolean z59 = (b4Var3 == null ? b4Var3.a : 0) <= 0;
                                                    l3Var = this;
                                                    j2Var2 = new yz0.j2(l3Var.t, str16, str17, aVar13, str2, z9, z31, str15, z11, subscriptionState3, subscriptionState11, str4, str20, i16, z35, issueOrPullRequestState4, aVar14, b3, bVar, h4, z36, g3, f5, list11, list8, arrayList4, z14, z38, str14, z12, z33, 0, 0, z13, z41, c, z42, z55, z56, str31, z59, str29, str30, z32, z43, a2Var, z1Var2, str23, c2Var, a2, arrayList5, true, pullRequestReviewDecision3, hVar, bVar10, i24, z52, z53, z15, str27, str28, z54, z57, z58, (CloseReason) null, false, (IssueType) null, false, (h01.j) null, (z01.p) null, false, 1073741824);
                                                }
                                            }
                                            z15 = false;
                                            if (list6 != null) {
                                            }
                                            String str282 = g6Var.d;
                                            boolean z542 = c4Var2.o;
                                            boolean z552 = g6Var.R;
                                            boolean z562 = g6Var.S;
                                            gv.x4 x4Var2 = g6Var.f;
                                            if (x4Var2 == null) {
                                            }
                                            gv.d5 d5Var2 = g6Var.e;
                                            if (d5Var2 == null) {
                                            }
                                            boolean z572 = g6Var.l;
                                            boolean z582 = g6Var.T;
                                            dw.y3 y3Var32 = c4Var2.q;
                                            if (y3Var32 == null) {
                                            }
                                            dw.b4 b4Var32 = c4Var2.r;
                                            if ((b4Var32 == null ? b4Var32.a : 0) <= 0) {
                                            }
                                            l3Var = this;
                                            j2Var2 = new yz0.j2(l3Var.t, str16, str17, aVar13, str2, z9, z31, str15, z11, subscriptionState3, subscriptionState11, str4, str20, i16, z35, issueOrPullRequestState4, aVar14, b3, bVar, h4, z36, g3, f5, list11, list8, arrayList4, z14, z38, str14, z12, z33, 0, 0, z13, z41, c, z42, z552, z562, str31, z59, str29, str30, z32, z43, a2Var, z1Var2, str23, c2Var, a2, arrayList5, true, pullRequestReviewDecision3, hVar, bVar10, i24, z52, z53, z15, str27, str282, z542, z572, z582, (CloseReason) null, false, (IssueType) null, false, (h01.j) null, (z01.p) null, false, 1073741824);
                                        }
                                        n40Var2 = n40Var;
                                        z11 = false;
                                        subscriptionState2 = SubscriptionState.SUBSCRIBED;
                                        if (y03 == subscriptionState2) {
                                        }
                                        e5Var = e5Var2;
                                        subscriptionState3 = subscriptionState2;
                                        if (y04 != subscriptionState11) {
                                            subscriptionState11 = subscriptionState4;
                                        }
                                        String str192 = g6Var.g;
                                        String str202 = g6Var.h;
                                        int i162 = g6Var.q;
                                        n40 n40Var62 = n40Var2;
                                        boolean z352 = g6Var.m;
                                        ordinal2 = g6Var.r.ordinal();
                                        if (ordinal2 != 0) {
                                        }
                                        gv.v4 v4Var2 = g6Var.n;
                                        IssueOrPullRequestState issueOrPullRequestState42 = issueOrPullRequestState2;
                                        com.github.service.models.response.a aVar142 = new com.github.service.models.response.a(v4Var2 != null ? v4Var2.b : "", w8.s.A(v4Var2 != null ? v4Var2.c : null), (String) null, false, (String) null, 60);
                                        boolean b32 = k71.k.b(g6Var.o, Boolean.TRUE);
                                        gv.e5 e5Var32 = e5Var;
                                        fz.b bVar62 = new fz.b(g6Var.U, str14, new yz0.b0(str15));
                                        String str212 = str3;
                                        ArrayList h42 = w8.s.h(str15, cVar4);
                                        boolean z362 = cVar4.c;
                                        gv.k5 k5Var2 = g6Var.H;
                                        fz.g g32 = k21.f.g(k5Var2 != null ? k5Var2.c : null);
                                        List f52 = m71.a.f(g6Var.X);
                                        List P32 = com.google.android.gms.internal.measurement.i4.P(g6Var.Y);
                                        dw.d1 d1Var2 = e1Var.b;
                                        if (d1Var2 != null) {
                                        }
                                        List list82 = x61.rShadow.r;
                                        if (list7 == null) {
                                        }
                                        ArrayList arrayList42 = new ArrayList();
                                        while (r42.hasNext()) {
                                        }
                                        List list112 = P32;
                                        boolean z372 = g6Var.j;
                                        boolean z382 = g6Var.k;
                                        z12 = aVar12.b;
                                        pu.a aVar152 = g6Var.W;
                                        boolean z392 = aVar152.b;
                                        boolean z412 = aVar152.c;
                                        List c2 = sy.c.c(g6Var.Z);
                                        boolean z422 = g6Var.P;
                                        boolean z432 = g6Var.B;
                                        int i172 = g6Var.s;
                                        int i182 = g6Var.t;
                                        int i192 = g6Var.u;
                                        if (g6Var.b0.b != null) {
                                        }
                                        d6Var = g6Var.O;
                                        if (d6Var != null) {
                                        }
                                        yz0.a2 a2Var2 = new yz0.a2(i172, i182, i192, z44, h2Var);
                                        if (list6 != null) {
                                        }
                                        if (c5Var != null) {
                                        }
                                        yz0.c2 c2Var2 = new yz0.c2(g6Var.E, g6Var.G);
                                        ArrayList a22 = sy.a.a(z5Var, f5Var, e5Var32);
                                        String str232 = str22;
                                        list3 = g6Var.L.a;
                                        if (list3 == null) {
                                        }
                                        ArrayList S2 = x61.m.S(list3);
                                        yz0.z1 z1Var22 = z1Var;
                                        ArrayList arrayList52 = new ArrayList();
                                        size = S2.size();
                                        i4 = 0;
                                        while (i4 < size) {
                                        }
                                        jzVar = g6Var.A;
                                        if (jzVar != null) {
                                        }
                                        pullRequestReviewDecision = PullRequestReviewDecision.UNKNOWN__;
                                        PullRequestReviewDecision pullRequestReviewDecision32 = pullRequestReviewDecision;
                                        gv.g5 g5Var2 = g6Var.x;
                                        gv.b bVar72 = g6Var.c0;
                                        MergeStateStatus L2 = k21.f.L(g6Var.v);
                                        ArrayList K2 = x61.l.K(new PullRequestMergeMethod[]{c4Var2.j ? PullRequestMergeMethod.MERGE : null, c4Var2.h ? PullRequestMergeMethod.SQUASH : null, c4Var2.i ? PullRequestMergeMethod.REBASE : null});
                                        boolean z452 = !((c5Var != null || (w5Var = c5Var.b) == null) ? true : w5Var.a);
                                        PullRequestMergeMethod G2 = w8.s.G(c4Var2.l);
                                        String str242 = c4Var2.k;
                                        List list122 = c4Var2.m;
                                        gv.a aVar162 = bVar72.d;
                                        if (aVar162 != null) {
                                        }
                                        boolean z462 = bVar72.c;
                                        boolean z472 = bVar72.b;
                                        boolean z482 = g6Var.Q;
                                        gv.j5 j5Var2 = g6Var.w;
                                        if (j5Var2 != null) {
                                        }
                                        if (g5Var2 != null) {
                                        }
                                        if (g5Var2 != null) {
                                        }
                                        gv.i5 i5Var2 = g6Var.z;
                                        if (i5Var2 != null) {
                                        }
                                        gv.h5 h5Var32 = g6Var.y;
                                        h01.h hVar2 = new h01.h(L2, K2, z452, G2, str242, list122, iVar, z462, z472, z482, str25, str26, zonedDateTime3, R, h5Var32 != null ? i21.a.I(h5Var32.c) : null);
                                        iz.b bVar82 = new iz.b(g6Var);
                                        a = sy.a.a(z5Var, f5Var, e5Var32);
                                        if (w4Var != null) {
                                        }
                                        if (w4Var != null) {
                                        }
                                        if (a.isEmpty()) {
                                        }
                                        iz.b bVar102 = bVar82;
                                        if (intValue > 0) {
                                        }
                                        if ((w4Var != null || (x5Var = w4Var.a) == null) ? z31 : x5Var.c) {
                                        }
                                        boolean z532 = c4Var2.n;
                                        if (z12) {
                                        }
                                        z15 = false;
                                        if (list6 != null) {
                                        }
                                        String str2822 = g6Var.d;
                                        boolean z5422 = c4Var2.o;
                                        boolean z5522 = g6Var.R;
                                        boolean z5622 = g6Var.S;
                                        gv.x4 x4Var22 = g6Var.f;
                                        if (x4Var22 == null) {
                                        }
                                        gv.d5 d5Var22 = g6Var.e;
                                        if (d5Var22 == null) {
                                        }
                                        boolean z5722 = g6Var.l;
                                        boolean z5822 = g6Var.T;
                                        dw.y3 y3Var322 = c4Var2.q;
                                        if (y3Var322 == null) {
                                        }
                                        dw.b4 b4Var322 = c4Var2.r;
                                        if ((b4Var322 == null ? b4Var322.a : 0) <= 0) {
                                        }
                                        l3Var = this;
                                        j2Var2 = new yz0.j2(l3Var.t, str16, str17, aVar13, str2, z9, z31, str15, z11, subscriptionState3, subscriptionState11, str4, str202, i162, z352, issueOrPullRequestState42, aVar142, b32, bVar, h42, z362, g32, f52, list112, list82, arrayList42, z14, z382, str14, z12, z33, 0, 0, z13, z412, c2, z422, z5522, z5622, str31, z59, str29, str30, z32, z432, a2Var2, z1Var22, str232, c2Var2, a22, arrayList52, true, pullRequestReviewDecision32, hVar2, bVar102, i24, z52, z532, z15, str27, str2822, z5422, z5722, z5822, (CloseReason) null, false, (IssueType) null, false, (h01.j) null, (z01.p) null, false, 1073741824);
                                    }
                                }
                                z9 = z34;
                                n40Var2 = n40Var;
                                z11 = false;
                                subscriptionState2 = SubscriptionState.SUBSCRIBED;
                                if (y03 == subscriptionState2) {
                                }
                                e5Var = e5Var2;
                                subscriptionState3 = subscriptionState2;
                                if (y04 != subscriptionState11) {
                                }
                                String str1922 = g6Var.g;
                                String str2022 = g6Var.h;
                                int i1622 = g6Var.q;
                                n40 n40Var622 = n40Var2;
                                boolean z3522 = g6Var.m;
                                ordinal2 = g6Var.r.ordinal();
                                if (ordinal2 != 0) {
                                }
                                gv.v4 v4Var22 = g6Var.n;
                                IssueOrPullRequestState issueOrPullRequestState422 = issueOrPullRequestState2;
                                com.github.service.models.response.a aVar1422 = new com.github.service.models.response.a(v4Var22 != null ? v4Var22.b : "", w8.s.A(v4Var22 != null ? v4Var22.c : null), (String) null, false, (String) null, 60);
                                boolean b322 = k71.k.b(g6Var.o, Boolean.TRUE);
                                gv.e5 e5Var322 = e5Var;
                                fz.b bVar622 = new fz.b(g6Var.U, str14, new yz0.b0(str15));
                                String str2122 = str3;
                                ArrayList h422 = w8.s.h(str15, cVar4);
                                boolean z3622 = cVar4.c;
                                gv.k5 k5Var22 = g6Var.H;
                                fz.g g322 = k21.f.g(k5Var22 != null ? k5Var22.c : null);
                                List f522 = m71.a.f(g6Var.X);
                                List P322 = com.google.android.gms.internal.measurement.i4.P(g6Var.Y);
                                dw.d1 d1Var22 = e1Var.b;
                                if (d1Var22 != null) {
                                }
                                List list822 = x61.rShadow.r;
                                if (list7 == null) {
                                }
                                ArrayList arrayList422 = new ArrayList();
                                while (r42.hasNext()) {
                                }
                                List list1122 = P322;
                                boolean z3722 = g6Var.j;
                                boolean z3822 = g6Var.k;
                                z12 = aVar12.b;
                                pu.a aVar1522 = g6Var.W;
                                boolean z3922 = aVar1522.b;
                                boolean z4122 = aVar1522.c;
                                List c22 = sy.c.c(g6Var.Z);
                                boolean z4222 = g6Var.P;
                                boolean z4322 = g6Var.B;
                                int i1722 = g6Var.s;
                                int i1822 = g6Var.t;
                                int i1922 = g6Var.u;
                                if (g6Var.b0.b != null) {
                                }
                                d6Var = g6Var.O;
                                if (d6Var != null) {
                                }
                                yz0.a2 a2Var22 = new yz0.a2(i1722, i1822, i1922, z44, h2Var);
                                if (list6 != null) {
                                }
                                if (c5Var != null) {
                                }
                                yz0.c2 c2Var22 = new yz0.c2(g6Var.E, g6Var.G);
                                ArrayList a222 = sy.a.a(z5Var, f5Var, e5Var322);
                                String str2322 = str22;
                                list3 = g6Var.L.a;
                                if (list3 == null) {
                                }
                                ArrayList S22 = x61.m.S(list3);
                                yz0.z1 z1Var222 = z1Var;
                                ArrayList arrayList522 = new ArrayList();
                                size = S22.size();
                                i4 = 0;
                                while (i4 < size) {
                                }
                                jzVar = g6Var.A;
                                if (jzVar != null) {
                                }
                                pullRequestReviewDecision = PullRequestReviewDecision.UNKNOWN__;
                                PullRequestReviewDecision pullRequestReviewDecision322 = pullRequestReviewDecision;
                                gv.g5 g5Var22 = g6Var.x;
                                gv.b bVar722 = g6Var.c0;
                                MergeStateStatus L22 = k21.f.L(g6Var.v);
                                ArrayList K22 = x61.l.K(new PullRequestMergeMethod[]{c4Var2.j ? PullRequestMergeMethod.MERGE : null, c4Var2.h ? PullRequestMergeMethod.SQUASH : null, c4Var2.i ? PullRequestMergeMethod.REBASE : null});
                                boolean z4522 = !((c5Var != null || (w5Var = c5Var.b) == null) ? true : w5Var.a);
                                PullRequestMergeMethod G22 = w8.s.G(c4Var2.l);
                                String str2422 = c4Var2.k;
                                List list1222 = c4Var2.m;
                                gv.a aVar1622 = bVar722.d;
                                if (aVar1622 != null) {
                                }
                                boolean z4622 = bVar722.c;
                                boolean z4722 = bVar722.b;
                                boolean z4822 = g6Var.Q;
                                gv.j5 j5Var22 = g6Var.w;
                                if (j5Var22 != null) {
                                }
                                if (g5Var22 != null) {
                                }
                                if (g5Var22 != null) {
                                }
                                gv.i5 i5Var22 = g6Var.z;
                                if (i5Var22 != null) {
                                }
                                gv.h5 h5Var322 = g6Var.y;
                                h01.h hVar22 = new h01.h(L22, K22, z4522, G22, str2422, list1222, iVar, z4622, z4722, z4822, str25, str26, zonedDateTime3, R, h5Var322 != null ? i21.a.I(h5Var322.c) : null);
                                iz.b bVar822 = new iz.b(g6Var);
                                a = sy.a.a(z5Var, f5Var, e5Var322);
                                if (w4Var != null) {
                                }
                                if (w4Var != null) {
                                }
                                if (a.isEmpty()) {
                                }
                                iz.b bVar1022 = bVar822;
                                if (intValue > 0) {
                                }
                                if ((w4Var != null || (x5Var = w4Var.a) == null) ? z31 : x5Var.c) {
                                }
                                boolean z5322 = c4Var2.n;
                                if (z12) {
                                }
                                z15 = false;
                                if (list6 != null) {
                                }
                                String str28222 = g6Var.d;
                                boolean z54222 = c4Var2.o;
                                boolean z55222 = g6Var.R;
                                boolean z56222 = g6Var.S;
                                gv.x4 x4Var222 = g6Var.f;
                                if (x4Var222 == null) {
                                }
                                gv.d5 d5Var222 = g6Var.e;
                                if (d5Var222 == null) {
                                }
                                boolean z57222 = g6Var.l;
                                boolean z58222 = g6Var.T;
                                dw.y3 y3Var3222 = c4Var2.q;
                                if (y3Var3222 == null) {
                                }
                                dw.b4 b4Var3222 = c4Var2.r;
                                if ((b4Var3222 == null ? b4Var3222.a : 0) <= 0) {
                                }
                                l3Var = this;
                                j2Var2 = new yz0.j2(l3Var.t, str16, str17, aVar13, str2, z9, z31, str15, z11, subscriptionState3, subscriptionState11, str4, str2022, i1622, z3522, issueOrPullRequestState422, aVar1422, b322, bVar, h422, z3622, g322, f522, list1122, list822, arrayList422, z14, z3822, str14, z12, z33, 0, 0, z13, z4122, c22, z4222, z55222, z56222, str31, z59, str29, str30, z32, z4322, a2Var22, z1Var222, str2322, c2Var22, a222, arrayList522, true, pullRequestReviewDecision322, hVar22, bVar1022, i24, z52, z5322, z15, str27, str28222, z54222, z57222, z58222, (CloseReason) null, false, (IssueType) null, false, (h01.j) null, (z01.p) null, false, 1073741824);
                            }
                            if (j2Var2 != null) {
                                n3 n3Var3 = n3Var2;
                                n3Var3.v = 1;
                                b71.a aVar17 = aVar;
                                if (l3Var.s.c(j2Var2, n3Var3) == aVar17) {
                                    return aVar17;
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
                n3Var = new n3(this, cVar);
                Object obj32 = n3Var.u;
                b71.a aVar92 = b71.a.r;
                i2 = n3Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
        }
    }
}
