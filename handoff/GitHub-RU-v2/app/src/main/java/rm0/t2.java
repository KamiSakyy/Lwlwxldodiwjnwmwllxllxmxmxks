package rm0;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.Entry$EntryType;
import com.github.service.models.response.IssueOrPullRequest$ReviewerReviewState;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.Language;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.SimpleLegacyProject;
import com.github.service.models.response.SimpleRepository;
import com.github.service.models.response.TimelineItem$TimelineLockedEvent$Reason;
import com.github.service.models.response.home.NavLinkIdentifier;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.type.MergeStateStatus;
import com.github.service.models.response.type.PullRequestMergeMethod;
import com.github.service.models.response.type.PullRequestReviewDecision;
import com.github.service.models.response.type.SubscriptionState;
import gn0.jr;
import gn0.kw;
import gn0.pm;
import gn0.xd;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kc0.ab0;
import kc0.ah;
import kc0.ak;
import kc0.at;
import kc0.bt;
import kc0.ch;
import kc0.d40;
import kc0.dh;
import kc0.dk;
import kc0.eh;
import kc0.f40;
import kc0.g40;
import kc0.gk;
import kc0.ik;
import kc0.ja0;
import kc0.jb;
import kc0.jk;
import kc0.ka0;
import kc0.kb;
import kc0.kk;
import kc0.la0;
import kc0.lb;
import kc0.n20;
import kc0.nf;
import kc0.nk;
import kc0.o20;
import kc0.o70;
import kc0.ok;
import kc0.p20;
import kc0.pf;
import kc0.pg;
import kc0.pk;
import kc0.pn;
import kc0.q20;
import kc0.qf;
import kc0.r20;
import kc0.rf;
import kc0.rk;
import kc0.s20;
import kc0.sd;
import kc0.t20;
import kc0.td;
import kc0.tj;
import kc0.tk;
import kc0.u20;
import kc0.u70;
import kc0.uj;
import kc0.uk;
import kc0.v20;
import kc0.v70;
import kc0.vf;
import kc0.vj;
import kc0.vk;
import kc0.w20;
import kc0.wj;
import kc0.ws;
import kc0.x20;
import kc0.xj;
import kc0.xk;
import kc0.xs;
import kc0.y20;
import kc0.yj;
import kc0.ys;
import kc0.z70;
import kc0.zj;
import kc0.zs;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t2 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ t2(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:352:0x078b, code lost:
    
        if (r0 == null) goto L399;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0483 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x048f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0721 A[LOOP:6: B:338:0x071f->B:339:0x0721, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x08cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x091a  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0263  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v64, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        z3 z3Var;
        int i;
        z3 z3Var2;
        b71.a aVar;
        yz0.j2 j2Var;
        yz0.j2 j2Var2;
        List list;
        int i2;
        String str;
        boolean z;
        jr jrVar;
        boolean z2;
        int ordinal;
        String str2;
        IssueOrPullRequestState issueOrPullRequestState;
        List list2;
        List list3;
        int size;
        int i3;
        boolean z3;
        yg0.d dVar;
        boolean z4;
        x61.r rVar;
        yg0.a aVar2;
        List list4;
        ri0.v5 v5Var;
        ArrayList arrayList;
        boolean z5;
        boolean z6;
        boolean z7;
        yz0.h2 h2Var;
        int size2;
        int i4;
        pm pmVar;
        PullRequestReviewDecision pullRequestReviewDecision;
        ArrayList a;
        int i5;
        boolean z8;
        ArrayList arrayList2;
        boolean z9;
        boolean z10;
        String str3;
        yz0.j2 j2Var3;
        ri0.g5 g5Var;
        ri0.p5 p5Var;
        ri0.p5 p5Var2;
        ri0.p5 p5Var3;
        Integer num;
        ri0.o5 o5Var;
        ri0.g5 g5Var2;
        ri0.q4 q4Var;
        int ordinal2;
        IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState;
        List list5;
        Iterator it;
        yz0.m2 m2Var;
        List<yg0.c> list6;
        SubscriptionState subscriptionState;
        String str4;
        int i6;
        SubscriptionState subscriptionState2;
        boolean z12;
        SubscriptionState subscriptionState3;
        boolean z13;
        SubscriptionState subscriptionState4;
        int ordinal3;
        String str5;
        IssueOrPullRequestState issueOrPullRequestState2;
        List list7;
        ArrayList arrayList3;
        int size3;
        int i7;
        boolean z14;
        yg0.n nVar;
        boolean z15;
        x61.r rVar2;
        yg0.k kVar;
        ArrayList arrayList4;
        x61.r rVar3;
        List list8;
        ArrayList arrayList5;
        yz0.n2 n2Var;
        List<yg0.m> list9;
        SubscriptionState subscriptionState5;
        if (cVar instanceof z3) {
            z3Var = (z3) cVar;
            int i8 = z3Var.v;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                z3Var.v = i8 - Integer.MIN_VALUE;
                Object obj2 = z3Var.u;
                b71.a aVar3 = b71.a.r;
                i = z3Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    dl0.h hVar = (dl0.h) obj;
                    dl0.i iVar = hVar.b;
                    if (iVar != null) {
                        String str6 = hVar.a.c;
                        oj0.p2 p2Var = iVar.c;
                        oj0.m2 m2Var2 = p2Var.c;
                        oj0.s2 s2Var = p2Var.d;
                        oj0.q2 q2Var = s2Var.p;
                        String str7 = s2Var.b;
                        String str8 = s2Var.f;
                        jr jrVar2 = s2Var.g;
                        oj0.r2 r2Var = s2Var.e;
                        ek0.b bVar = p2Var.e;
                        ek0.a aVar4 = bVar.e;
                        kw kwVar = bVar.c;
                        oj0.n2 n2Var2 = m2Var2 != null ? m2Var2.b : null;
                        oj0.o2 o2Var = m2Var2 != null ? m2Var2.c : null;
                        boolean z16 = false;
                        j2Var = null;
                        x61.r rVar4 = x61.r.r;
                        if (n2Var2 != null) {
                            pl0.a aVar5 = pl0.b.Companion;
                            SubscriptionState z17 = sy.r.z(kwVar);
                            List list10 = aVar4 != null ? aVar4.a : null;
                            SubscriptionState z18 = sy.r.z(n2Var2.c.c);
                            oj0.g3 g3Var = n2Var2.d;
                            String str9 = g3Var.c;
                            aVar5.getClass();
                            aj0.c cVar2 = g3Var.y;
                            if (jrVar2 == null) {
                                str4 = str6;
                                i6 = -1;
                            } else {
                                str4 = str6;
                                i6 = zl0.a.a[jrVar2.ordinal()];
                            }
                            boolean z19 = i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4;
                            int i9 = jrVar2 != null ? zl0.a.a[jrVar2.ordinal()] : -1;
                            boolean z20 = i9 == 1 || i9 == 2 || i9 == 3;
                            com.github.service.models.response.a aVar6 = new com.github.service.models.response.a(r2Var.c, b41.b.O(r2Var.d), (String) null, false, (String) null, 60);
                            String str10 = r2Var.b;
                            boolean z22 = s2Var.d;
                            SubscriptionState subscriptionState6 = SubscriptionState.IGNORED;
                            if (z18 == subscriptionState6 || z17 == subscriptionState6 || ((z17 == null && z18 == null) || (z17 == (subscriptionState2 = SubscriptionState.UNSUBSCRIBED) && z18 == subscriptionState2))) {
                                z12 = z19;
                            } else {
                                z12 = z19;
                                SubscriptionState subscriptionState7 = SubscriptionState.CUSTOM;
                                if (z17 != subscriptionState7 || z18 != subscriptionState2) {
                                    if (z17 != subscriptionState7 || z18 != subscriptionState7) {
                                        z16 = true;
                                    } else if (list10 != null) {
                                        z16 = list10.contains(gn0.j6.u);
                                    }
                                    subscriptionState3 = SubscriptionState.SUBSCRIBED;
                                    if (z17 == subscriptionState3 || z18 != null) {
                                        z13 = z12;
                                        subscriptionState4 = subscriptionState3;
                                    } else {
                                        z13 = z12;
                                        subscriptionState4 = null;
                                    }
                                    SubscriptionState subscriptionState8 = (z18 == subscriptionState6 || z17 == subscriptionState3 || z18 == (subscriptionState5 = SubscriptionState.UNSUBSCRIBED)) ? subscriptionState6 : subscriptionState5;
                                    String str11 = g3Var.d;
                                    String str12 = g3Var.e;
                                    int i10 = g3Var.m;
                                    boolean z23 = g3Var.h;
                                    ordinal3 = g3Var.n.ordinal();
                                    if (ordinal3 != 0) {
                                        str5 = str11;
                                        if (ordinal3 == 1) {
                                            issueOrPullRequestState2 = IssueOrPullRequestState.ISSUE_OPEN;
                                        } else {
                                            if (ordinal3 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            issueOrPullRequestState2 = IssueOrPullRequestState.UNKNOWN;
                                        }
                                    } else {
                                        str5 = str11;
                                        issueOrPullRequestState2 = IssueOrPullRequestState.ISSUE_CLOSED;
                                    }
                                    oj0.a3 a3Var = g3Var.i;
                                    IssueOrPullRequestState issueOrPullRequestState3 = issueOrPullRequestState2;
                                    com.github.service.models.response.a aVar7 = new com.github.service.models.response.a(a3Var != null ? a3Var.b : "", b41.b.O(a3Var != null ? a3Var.c : null), (String) null, false, (String) null, 60);
                                    boolean b = k71.k.b(g3Var.j, Boolean.TRUE);
                                    wl0.b bVar2 = new wl0.b(g3Var.x, g3Var.l, new yz0.a0(str9));
                                    ArrayList p = aa1.b.p(cVar2, str9);
                                    boolean z24 = cVar2.c;
                                    oj0.c3 c3Var = g3Var.o;
                                    wl0.g j = m71.a.j(c3Var != null ? c3Var.c : null);
                                    ArrayList a2 = a.a.a(g3Var.A);
                                    List f = com.google.common.util.concurrent.a.f(g3Var.B);
                                    list7 = g3Var.p.a;
                                    if (list7 == null) {
                                        list7 = rVar4;
                                    }
                                    ArrayList S = x61.m.S(list7);
                                    arrayList3 = new ArrayList(x61.n.F(S, 10));
                                    size3 = S.size();
                                    i7 = 0;
                                    while (i7 < size3) {
                                        Object obj3 = S.get(i7);
                                        int i12 = i7 + 1;
                                        int i13 = size3;
                                        oj0.d3 d3Var = (oj0.d3) obj3;
                                        String str13 = str9;
                                        ArrayList arrayList6 = S;
                                        oj0.e3 e3Var = d3Var.b;
                                        oj0.b3 b3Var = d3Var.a;
                                        wl0.b bVar3 = bVar2;
                                        boolean z25 = z23;
                                        String str14 = str8;
                                        arrayList3.add(new xz0.f(new SimpleLegacyProject(e3Var.b, e3Var.a, y41.t1.R(e3Var.c), b3Var != null ? b3Var.a : null), b3Var != null ? b3Var.a : ""));
                                        i7 = i12;
                                        size3 = i13;
                                        str9 = str13;
                                        S = arrayList6;
                                        bVar2 = bVar3;
                                        z23 = z25;
                                        str8 = str14;
                                    }
                                    String str15 = str9;
                                    wl0.b bVar4 = bVar2;
                                    boolean z26 = z23;
                                    String str16 = str8;
                                    boolean z27 = g3Var.g;
                                    String str17 = g3Var.b;
                                    z14 = g3Var.D.b;
                                    int i14 = g3Var.q;
                                    int i15 = g3Var.r;
                                    yh0.a aVar8 = g3Var.z;
                                    boolean z28 = aVar8.b;
                                    boolean z29 = aVar8.c;
                                    yg0.o oVar = g3Var.C;
                                    nVar = oVar.a;
                                    if (nVar != null || (list9 = nVar.b) == null) {
                                        z15 = z14;
                                        rVar2 = null;
                                    } else {
                                        ArrayList arrayList7 = new ArrayList();
                                        for (yg0.m mVar : list9) {
                                            boolean z30 = z14;
                                            String str18 = mVar != null ? mVar.a : null;
                                            if (str18 != null) {
                                                arrayList7.add(str18);
                                            }
                                            z14 = z30;
                                        }
                                        z15 = z14;
                                        rVar2 = arrayList7;
                                    }
                                    if (rVar2 == null) {
                                        rVar2 = rVar4;
                                    }
                                    kVar = oVar.b;
                                    if (kVar != null || (list8 = kVar.b) == null) {
                                        arrayList4 = arrayList3;
                                        rVar3 = null;
                                    } else {
                                        ArrayList arrayList8 = new ArrayList();
                                        Iterator it2 = list8.iterator();
                                        while (it2.hasNext()) {
                                            Iterator it3 = it2;
                                            yg0.l lVar = (yg0.l) it2.next();
                                            if (lVar != null) {
                                                ri0.u1 u1Var = lVar.c;
                                                arrayList5 = arrayList3;
                                                n2Var = pl0.c.b(u1Var, rVar2.contains(u1Var.a));
                                            } else {
                                                arrayList5 = arrayList3;
                                                n2Var = null;
                                            }
                                            if (n2Var != null) {
                                                arrayList8.add(n2Var);
                                            }
                                            it2 = it3;
                                            arrayList3 = arrayList5;
                                        }
                                        arrayList4 = arrayList3;
                                        rVar3 = arrayList8;
                                    }
                                    if (rVar3 == null) {
                                        rVar3 = rVar4;
                                    }
                                    boolean z32 = g3Var.s;
                                    PullRequestReviewDecision pullRequestReviewDecision2 = PullRequestReviewDecision.UNKNOWN__;
                                    CloseReason d0 = b31.b.d0(g3Var.t);
                                    boolean z33 = g3Var.u;
                                    boolean z34 = g3Var.v;
                                    Boolean bool = g3Var.w;
                                    j2Var3 = new yz0.j2(str4, str16, str7, aVar6, str10, z22, z13, str15, z16, subscriptionState4, subscriptionState8, str5, str12, i10, z26, issueOrPullRequestState3, aVar7, b, bVar4, p, z24, j, a2, f, arrayList4, rVar4, false, z27, str17, z15, z20, i14, i15, z28, z29, rVar3, z32, z33, z34, q2Var != null ? q2Var.a : null, false, null, null, false, false, null, null, null, null, rVar4, rVar4, false, pullRequestReviewDecision2, null, null, 0, false, false, false, null, null, false, false, false, d0, bool != null ? bool.booleanValue() : false, null, false, null, null, false, 1073742080);
                                    z3Var2 = z3Var;
                                    aVar = aVar3;
                                }
                            }
                            subscriptionState3 = SubscriptionState.SUBSCRIBED;
                            if (z17 == subscriptionState3) {
                            }
                            z13 = z12;
                            subscriptionState4 = subscriptionState3;
                            if (z18 == subscriptionState6) {
                                String str112 = g3Var.d;
                                String str122 = g3Var.e;
                                int i102 = g3Var.m;
                                boolean z232 = g3Var.h;
                                ordinal3 = g3Var.n.ordinal();
                                if (ordinal3 != 0) {
                                }
                                oj0.a3 a3Var2 = g3Var.i;
                                IssueOrPullRequestState issueOrPullRequestState32 = issueOrPullRequestState2;
                                com.github.service.models.response.a aVar72 = new com.github.service.models.response.a(a3Var2 != null ? a3Var2.b : "", b41.b.O(a3Var2 != null ? a3Var2.c : null), (String) null, false, (String) null, 60);
                                boolean b2 = k71.k.b(g3Var.j, Boolean.TRUE);
                                wl0.b bVar22 = new wl0.b(g3Var.x, g3Var.l, new yz0.a0(str9));
                                ArrayList p2 = aa1.b.p(cVar2, str9);
                                boolean z242 = cVar2.c;
                                oj0.c3 c3Var2 = g3Var.o;
                                wl0.g j2 = m71.a.j(c3Var2 != null ? c3Var2.c : null);
                                ArrayList a22 = a.a.a(g3Var.A);
                                List f2 = com.google.common.util.concurrent.a.f(g3Var.B);
                                list7 = g3Var.p.a;
                                if (list7 == null) {
                                }
                                ArrayList S2 = x61.m.S(list7);
                                arrayList3 = new ArrayList(x61.n.F(S2, 10));
                                size3 = S2.size();
                                i7 = 0;
                                while (i7 < size3) {
                                }
                                String str152 = str9;
                                wl0.b bVar42 = bVar22;
                                boolean z262 = z232;
                                String str162 = str8;
                                boolean z272 = g3Var.g;
                                String str172 = g3Var.b;
                                z14 = g3Var.D.b;
                                int i142 = g3Var.q;
                                int i152 = g3Var.r;
                                yh0.a aVar82 = g3Var.z;
                                boolean z282 = aVar82.b;
                                boolean z292 = aVar82.c;
                                yg0.o oVar2 = g3Var.C;
                                nVar = oVar2.a;
                                if (nVar != null) {
                                }
                                z15 = z14;
                                rVar2 = null;
                                if (rVar2 == null) {
                                }
                                kVar = oVar2.b;
                                if (kVar != null) {
                                }
                                arrayList4 = arrayList3;
                                rVar3 = null;
                                if (rVar3 == null) {
                                }
                                boolean z322 = g3Var.s;
                                PullRequestReviewDecision pullRequestReviewDecision22 = PullRequestReviewDecision.UNKNOWN__;
                                CloseReason d02 = b31.b.d0(g3Var.t);
                                boolean z332 = g3Var.u;
                                boolean z342 = g3Var.v;
                                Boolean bool2 = g3Var.w;
                                j2Var3 = new yz0.j2(str4, str162, str7, aVar6, str10, z22, z13, str152, z16, subscriptionState4, subscriptionState8, str5, str122, i102, z262, issueOrPullRequestState32, aVar72, b2, bVar42, p2, z242, j2, a22, f2, arrayList4, rVar4, false, z272, str172, z15, z20, i142, i152, z282, z292, rVar3, z322, z332, z342, q2Var != null ? q2Var.a : null, false, null, null, false, false, null, null, null, null, rVar4, rVar4, false, pullRequestReviewDecision22, null, null, 0, false, false, false, null, null, false, false, false, d02, bool2 != null ? bool2.booleanValue() : false, null, false, null, null, false, 1073742080);
                                z3Var2 = z3Var;
                                aVar = aVar3;
                            }
                            String str1122 = g3Var.d;
                            String str1222 = g3Var.e;
                            int i1022 = g3Var.m;
                            boolean z2322 = g3Var.h;
                            ordinal3 = g3Var.n.ordinal();
                            if (ordinal3 != 0) {
                            }
                            oj0.a3 a3Var22 = g3Var.i;
                            IssueOrPullRequestState issueOrPullRequestState322 = issueOrPullRequestState2;
                            com.github.service.models.response.a aVar722 = new com.github.service.models.response.a(a3Var22 != null ? a3Var22.b : "", b41.b.O(a3Var22 != null ? a3Var22.c : null), (String) null, false, (String) null, 60);
                            boolean b22 = k71.k.b(g3Var.j, Boolean.TRUE);
                            wl0.b bVar222 = new wl0.b(g3Var.x, g3Var.l, new yz0.a0(str9));
                            ArrayList p22 = aa1.b.p(cVar2, str9);
                            boolean z2422 = cVar2.c;
                            oj0.c3 c3Var22 = g3Var.o;
                            wl0.g j22 = m71.a.j(c3Var22 != null ? c3Var22.c : null);
                            ArrayList a222 = a.a.a(g3Var.A);
                            List f22 = com.google.common.util.concurrent.a.f(g3Var.B);
                            list7 = g3Var.p.a;
                            if (list7 == null) {
                            }
                            ArrayList S22 = x61.m.S(list7);
                            arrayList3 = new ArrayList(x61.n.F(S22, 10));
                            size3 = S22.size();
                            i7 = 0;
                            while (i7 < size3) {
                            }
                            String str1522 = str9;
                            wl0.b bVar422 = bVar222;
                            boolean z2622 = z2322;
                            String str1622 = str8;
                            boolean z2722 = g3Var.g;
                            String str1722 = g3Var.b;
                            z14 = g3Var.D.b;
                            int i1422 = g3Var.q;
                            int i1522 = g3Var.r;
                            yh0.a aVar822 = g3Var.z;
                            boolean z2822 = aVar822.b;
                            boolean z2922 = aVar822.c;
                            yg0.o oVar22 = g3Var.C;
                            nVar = oVar22.a;
                            if (nVar != null) {
                            }
                            z15 = z14;
                            rVar2 = null;
                            if (rVar2 == null) {
                            }
                            kVar = oVar22.b;
                            if (kVar != null) {
                            }
                            arrayList4 = arrayList3;
                            rVar3 = null;
                            if (rVar3 == null) {
                            }
                            boolean z3222 = g3Var.s;
                            PullRequestReviewDecision pullRequestReviewDecision222 = PullRequestReviewDecision.UNKNOWN__;
                            CloseReason d022 = b31.b.d0(g3Var.t);
                            boolean z3322 = g3Var.u;
                            boolean z3422 = g3Var.v;
                            Boolean bool22 = g3Var.w;
                            j2Var3 = new yz0.j2(str4, str1622, str7, aVar6, str10, z22, z13, str1522, z16, subscriptionState4, subscriptionState8, str5, str1222, i1022, z2622, issueOrPullRequestState322, aVar722, b22, bVar422, p22, z2422, j22, a222, f22, arrayList4, rVar4, false, z2722, str1722, z15, z20, i1422, i1522, z2822, z2922, rVar3, z3222, z3322, z3422, q2Var != null ? q2Var.a : null, false, null, null, false, false, null, null, null, null, rVar4, rVar4, false, pullRequestReviewDecision222, null, null, 0, false, false, false, null, null, false, false, false, d022, bool22 != null ? bool22.booleanValue() : false, null, false, null, null, false, 1073742080);
                            z3Var2 = z3Var;
                            aVar = aVar3;
                        } else if (o2Var != null) {
                            pl0.a aVar9 = pl0.b.Companion;
                            SubscriptionState z35 = sy.r.z(kwVar);
                            List list11 = aVar4 != null ? aVar4.a : null;
                            SubscriptionState z36 = sy.r.z(o2Var.c.c);
                            ri0.y5 y5Var = o2Var.d;
                            String str19 = y5Var.b;
                            String str20 = y5Var.c;
                            aVar9.getClass();
                            ri0.v4 v4Var = y5Var.L;
                            ri0.w4 w4Var = y5Var.K;
                            ri0.r5 r5Var = y5Var.J;
                            ri0.t4 t4Var = y5Var.F;
                            aVar = aVar3;
                            aj0.c cVar3 = y5Var.W;
                            ri0.m4 m4Var = y5Var.D;
                            z3Var2 = z3Var;
                            sk0.a aVar10 = y5Var.b0;
                            ri0.r4 r4Var = y5Var.O;
                            List list12 = r4Var.c;
                            if (jrVar2 == null) {
                                list = list12;
                                i2 = -1;
                            } else {
                                list = list12;
                                i2 = zl0.a.a[jrVar2.ordinal()];
                            }
                            boolean z37 = i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
                            int i16 = jrVar2 == null ? -1 : zl0.a.a[jrVar2.ordinal()];
                            boolean z38 = z37;
                            boolean z39 = i16 == 1 || i16 == 2 || i16 == 3;
                            int i17 = jrVar2 == null ? -1 : zl0.a.a[jrVar2.ordinal()];
                            boolean z40 = i17 == 1 || i17 == 2 || i17 == 3;
                            com.github.service.models.response.a aVar11 = new com.github.service.models.response.a(r2Var.c, b41.b.O(r2Var.d), (String) null, false, (String) null, 60);
                            String str21 = r2Var.b;
                            boolean z42 = s2Var.d;
                            SubscriptionState subscriptionState9 = SubscriptionState.IGNORED;
                            if (z36 == subscriptionState9 || z35 == subscriptionState9 || (z35 == null && z36 == null)) {
                                str = str21;
                            } else {
                                str = str21;
                                SubscriptionState subscriptionState10 = SubscriptionState.UNSUBSCRIBED;
                                if (z35 != subscriptionState10 || z36 != subscriptionState10) {
                                    z = z42;
                                    SubscriptionState subscriptionState11 = SubscriptionState.CUSTOM;
                                    if (z35 != subscriptionState11 || z36 != subscriptionState10) {
                                        if (z35 != subscriptionState11 || z36 != subscriptionState11) {
                                            jrVar = jrVar2;
                                            z2 = true;
                                        } else if (list11 != null) {
                                            z2 = list11.contains(gn0.j6.v);
                                            jrVar = jrVar2;
                                        }
                                        SubscriptionState subscriptionState12 = SubscriptionState.SUBSCRIBED;
                                        SubscriptionState subscriptionState13 = (z35 == subscriptionState12 || z36 != null) ? subscriptionState12 : null;
                                        if (z36 != subscriptionState9 && z35 != subscriptionState12 && z36 != (subscriptionState = SubscriptionState.UNSUBSCRIBED)) {
                                            subscriptionState9 = subscriptionState;
                                        }
                                        String str22 = y5Var.g;
                                        String str23 = y5Var.h;
                                        int i18 = y5Var.q;
                                        boolean z43 = y5Var.m;
                                        jr jrVar3 = jrVar;
                                        ordinal = y5Var.r.ordinal();
                                        if (ordinal != 0) {
                                            str2 = str22;
                                            if (ordinal == 1) {
                                                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
                                            } else if (ordinal == 2) {
                                                issueOrPullRequestState = y5Var.B ? IssueOrPullRequestState.PULL_REQUEST_DRAFT : IssueOrPullRequestState.PULL_REQUEST_OPEN;
                                            } else {
                                                if (ordinal != 3) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
                                            }
                                        } else {
                                            str2 = str22;
                                            issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
                                        }
                                        ri0.l4 l4Var = y5Var.n;
                                        IssueOrPullRequestState issueOrPullRequestState4 = issueOrPullRequestState;
                                        com.github.service.models.response.a aVar12 = new com.github.service.models.response.a(l4Var != null ? l4Var.b : "", b41.b.O(l4Var != null ? l4Var.c : null), (String) null, false, (String) null, 60);
                                        boolean b3 = k71.k.b(y5Var.o, Boolean.TRUE);
                                        SubscriptionState subscriptionState14 = subscriptionState9;
                                        wl0.b bVar5 = new wl0.b(y5Var.V, str19, new yz0.b0(str20));
                                        list2 = list;
                                        ArrayList p3 = aa1.b.p(cVar3, str20);
                                        boolean z44 = cVar3.c;
                                        ri0.b5 b5Var = y5Var.H;
                                        wl0.g j3 = m71.a.j(b5Var != null ? b5Var.c : null);
                                        ArrayList a3 = a.a.a(y5Var.Y);
                                        List f3 = com.google.common.util.concurrent.a.f(y5Var.Z);
                                        list3 = y5Var.I.a;
                                        if (list3 == null) {
                                            list3 = rVar4;
                                        }
                                        ArrayList S3 = x61.m.S(list3);
                                        ArrayList arrayList9 = new ArrayList(x61.n.F(S3, 10));
                                        size = S3.size();
                                        i3 = 0;
                                        while (i3 < size) {
                                            Object obj4 = S3.get(i3);
                                            int i19 = i3 + 1;
                                            ArrayList arrayList10 = S3;
                                            ri0.c5 c5Var = (ri0.c5) obj4;
                                            int i20 = size;
                                            String str24 = str23;
                                            ri0.m5 m5Var = c5Var.b;
                                            ri0.p4 p4Var = c5Var.a;
                                            int i22 = i18;
                                            boolean z45 = z43;
                                            String str25 = str19;
                                            arrayList9.add(new xz0.f(new SimpleLegacyProject(m5Var.b, m5Var.a, y41.t1.R(m5Var.c), p4Var != null ? p4Var.a : null), p4Var != null ? p4Var.a : ""));
                                            size = i20;
                                            S3 = arrayList10;
                                            i3 = i19;
                                            str23 = str24;
                                            i18 = i22;
                                            z43 = z45;
                                            str19 = str25;
                                        }
                                        String str26 = str23;
                                        int i23 = i18;
                                        boolean z46 = z43;
                                        String str27 = str19;
                                        z3 = y5Var.j;
                                        boolean z47 = y5Var.k;
                                        boolean z48 = aVar10.b;
                                        yh0.a aVar13 = y5Var.X;
                                        boolean z49 = aVar13.b;
                                        boolean z50 = aVar13.c;
                                        yg0.e eVar = y5Var.a0;
                                        dVar = eVar.b;
                                        if (dVar != null || (list6 = dVar.a) == null) {
                                            z4 = z3;
                                            rVar = null;
                                        } else {
                                            ArrayList arrayList11 = new ArrayList();
                                            for (yg0.c cVar4 : list6) {
                                                boolean z52 = z3;
                                                String str28 = cVar4 != null ? cVar4.a : null;
                                                if (str28 != null) {
                                                    arrayList11.add(str28);
                                                }
                                                z3 = z52;
                                            }
                                            z4 = z3;
                                            rVar = arrayList11;
                                        }
                                        if (rVar == null) {
                                            rVar = rVar4;
                                        }
                                        aVar2 = eVar.c;
                                        if (aVar2 != null || (list5 = aVar2.a) == null) {
                                            list4 = 0;
                                        } else {
                                            list4 = new ArrayList();
                                            Iterator it4 = list5.iterator();
                                            while (it4.hasNext()) {
                                                yg0.b bVar6 = (yg0.b) it4.next();
                                                if (bVar6 != null) {
                                                    mg0.g0 g0Var = bVar6.c;
                                                    it = it4;
                                                    m2Var = pl0.c.a(g0Var, rVar.contains(g0Var.a));
                                                } else {
                                                    it = it4;
                                                    m2Var = null;
                                                }
                                                if (m2Var != null) {
                                                    list4.add(m2Var);
                                                }
                                                it4 = it;
                                            }
                                        }
                                        if (list4 == 0) {
                                            list4 = rVar4;
                                        }
                                        boolean z53 = y5Var.Q;
                                        boolean z54 = y5Var.B;
                                        int i24 = y5Var.s;
                                        int i25 = y5Var.t;
                                        int i26 = y5Var.u;
                                        boolean z55 = y5Var.c0.b != null;
                                        v5Var = y5Var.P;
                                        if (v5Var != null) {
                                            if (list2 != null) {
                                                arrayList = arrayList9;
                                                ri0.g5 g5Var3 = (ri0.g5) x61.m.f0(list2);
                                                if (g5Var3 != null) {
                                                    q4Var = g5Var3.b;
                                                    z5 = z48;
                                                    z6 = z47;
                                                    ordinal2 = v5Var.a.ordinal();
                                                    if (ordinal2 == 0) {
                                                        z7 = z50;
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
                                                        z7 = z50;
                                                        issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.APPROVED;
                                                    }
                                                    ZonedDateTime zonedDateTime = v5Var.b;
                                                    h2Var = new yz0.h2(issueOrPullRequest$ReviewerReviewState, zonedDateTime, q4Var == null && q4Var.b.isAfter(zonedDateTime));
                                                }
                                            } else {
                                                arrayList = arrayList9;
                                            }
                                            q4Var = null;
                                            z5 = z48;
                                            z6 = z47;
                                            ordinal2 = v5Var.a.ordinal();
                                            if (ordinal2 == 0) {
                                            }
                                            ZonedDateTime zonedDateTime2 = v5Var.b;
                                            h2Var = new yz0.h2(issueOrPullRequest$ReviewerReviewState, zonedDateTime2, q4Var == null && q4Var.b.isAfter(zonedDateTime2));
                                        } else {
                                            arrayList = arrayList9;
                                            z5 = z48;
                                            z6 = z47;
                                            z7 = z50;
                                            h2Var = null;
                                        }
                                        yz0.a2 a2Var = new yz0.a2(i24, i25, i26, z55, h2Var);
                                        yz0.z1 z1Var = (list2 != null || (g5Var2 = (ri0.g5) x61.m.f0(list2)) == null) ? null : new yz0.z1(r4Var.b, g5Var2.b.b);
                                        String str29 = t4Var != null ? t4Var.a : null;
                                        yz0.c2 c2Var = new yz0.c2(y5Var.E, y5Var.G);
                                        ArrayList a4 = pl0.a.a(r5Var, w4Var, v4Var);
                                        ArrayList S4 = x61.m.S(y5Var.M);
                                        String str30 = str29;
                                        ArrayList arrayList12 = new ArrayList(x61.n.F(S4, 10));
                                        size2 = S4.size();
                                        yz0.z1 z1Var2 = z1Var;
                                        i4 = 0;
                                        while (i4 < size2) {
                                            Object obj5 = S4.get(i4);
                                            int i27 = i4 + 1;
                                            int i28 = size2;
                                            ri0.u5 u5Var = (ri0.u5) obj5;
                                            boolean z56 = u5Var.a;
                                            boolean z57 = u5Var.b;
                                            ri0.l5 l5Var = u5Var.c.c;
                                            arrayList12.add(new yz0.g2(z56, z57, l5Var.b, yz0.f2.d, new com.github.service.models.response.a(l5Var.c, b41.b.O(l5Var.d), (String) null, false, (String) null, 60)));
                                            i4 = i27;
                                            size2 = i28;
                                        }
                                        pmVar = y5Var.A;
                                        if (pmVar != null) {
                                            int ordinal4 = pmVar.ordinal();
                                            if (ordinal4 == 0) {
                                                pullRequestReviewDecision = PullRequestReviewDecision.APPROVED;
                                            } else if (ordinal4 == 1) {
                                                pullRequestReviewDecision = PullRequestReviewDecision.CHANGES_REQUESTED;
                                            } else if (ordinal4 == 2) {
                                                pullRequestReviewDecision = PullRequestReviewDecision.REVIEW_REQUIRED;
                                            } else {
                                                if (ordinal4 != 3) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                pullRequestReviewDecision = PullRequestReviewDecision.UNKNOWN__;
                                            }
                                        }
                                        pullRequestReviewDecision = PullRequestReviewDecision.UNKNOWN__;
                                        PullRequestReviewDecision pullRequestReviewDecision3 = pullRequestReviewDecision;
                                        ri0.x4 x4Var = y5Var.x;
                                        ri0.b bVar7 = y5Var.d0;
                                        MergeStateStatus o = sy.c0.o(y5Var.v);
                                        ArrayList K = x61.l.K(new PullRequestMergeMethod[]{s2Var.j ? PullRequestMergeMethod.MERGE : null, s2Var.h ? PullRequestMergeMethod.SQUASH : null, s2Var.i ? PullRequestMergeMethod.REBASE : null});
                                        boolean z58 = !((t4Var != null || (o5Var = t4Var.b) == null) ? true : o5Var.a);
                                        PullRequestMergeMethod w = sy.f0.w(s2Var.l);
                                        String str31 = s2Var.k;
                                        List list13 = s2Var.m;
                                        ri0.a aVar14 = bVar7.d;
                                        yz0.i iVar2 = aVar14 != null ? new yz0.i(sy.f0.w(aVar14.a)) : null;
                                        boolean z59 = bVar7.c;
                                        boolean z60 = bVar7.b;
                                        boolean z62 = y5Var.R;
                                        ri0.a5 a5Var = y5Var.w;
                                        String str32 = a5Var != null ? a5Var.b : null;
                                        String str33 = x4Var != null ? x4Var.a : null;
                                        ZonedDateTime zonedDateTime3 = x4Var != null ? x4Var.b : null;
                                        ri0.z4 z4Var = y5Var.z;
                                        i01.b T = z4Var != null ? k41.b.T(z4Var.c) : null;
                                        ri0.y4 y4Var = y5Var.y;
                                        h01.h hVar2 = new h01.h(o, K, z58, w, str31, list13, iVar2, z59, z60, z62, str32, str33, zonedDateTime3, T, y4Var != null ? m7.y.N(y4Var.c) : null);
                                        xl0.b bVar8 = new xl0.b(y5Var);
                                        a = pl0.a.a(r5Var, w4Var, v4Var);
                                        int intValue = (m4Var != null || (p5Var3 = m4Var.a) == null || (num = p5Var3.a) == null) ? 0 : num.intValue();
                                        boolean z63 = (m4Var != null || (p5Var2 = m4Var.a) == null) ? false : p5Var2.b;
                                        if (a.isEmpty()) {
                                            i5 = 0;
                                        } else {
                                            int size4 = a.size();
                                            i5 = 0;
                                            int i29 = 0;
                                            while (i29 < size4) {
                                                Object obj6 = a.get(i29);
                                                i29++;
                                                yz0.e2 e2Var = (yz0.e2) obj6;
                                                xl0.b bVar9 = bVar8;
                                                IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState2 = e2Var.b;
                                                ArrayList arrayList13 = a;
                                                boolean z64 = e2Var.c;
                                                IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState3 = IssueOrPullRequest$ReviewerReviewState.APPROVED;
                                                if (issueOrPullRequest$ReviewerReviewState2 != issueOrPullRequest$ReviewerReviewState3 || !z64) {
                                                    yz0.d2 d2Var = e2Var.g;
                                                    if ((d2Var != null ? d2Var.c : null) != issueOrPullRequest$ReviewerReviewState3) {
                                                        continue;
                                                    } else if (!z64) {
                                                        continue;
                                                    }
                                                    a = arrayList13;
                                                    bVar8 = bVar9;
                                                }
                                                i5++;
                                                if (i5 < 0) {
                                                    sy.d0.w();
                                                    throw null;
                                                }
                                                a = arrayList13;
                                                bVar8 = bVar9;
                                            }
                                        }
                                        xl0.b bVar10 = bVar8;
                                        int i30 = intValue > 0 ? z63 ? (i5 * 100) / (intValue + i5) : (i5 * 100) / intValue : 0;
                                        boolean z65 = !((m4Var != null || (p5Var = m4Var.a) == null) ? z38 : p5Var.c) && z5;
                                        boolean z66 = s2Var.n;
                                        if (z5) {
                                            int i32 = jrVar3 != null ? zl0.a.a[jrVar3.ordinal()] : -1;
                                            if (i32 == 1 || i32 == 2 || i32 == 3) {
                                                z8 = true;
                                                String str34 = (list2 != null || (g5Var = (ri0.g5) x61.m.W(list2)) == null) ? null : g5Var.b.a;
                                                String str35 = y5Var.d;
                                                boolean z67 = s2Var.o;
                                                boolean z68 = y5Var.S;
                                                boolean z69 = y5Var.T;
                                                boolean z70 = y5Var.l;
                                                boolean z71 = y5Var.U;
                                                ri0.n4 n4Var = y5Var.f;
                                                String str36 = n4Var == null ? n4Var.b : null;
                                                ri0.u4 u4Var = y5Var.e;
                                                String str37 = u4Var == null ? u4Var.b : null;
                                                int i33 = i30;
                                                if (q2Var == null) {
                                                    arrayList2 = arrayList12;
                                                    z9 = z38;
                                                    z10 = z44;
                                                    str3 = q2Var.a;
                                                } else {
                                                    arrayList2 = arrayList12;
                                                    z9 = z38;
                                                    z10 = z44;
                                                    str3 = null;
                                                }
                                                j2Var3 = new yz0.j2(str6, str8, str7, aVar11, str, z, z9, str20, z2, subscriptionState13, subscriptionState14, str2, str26, i23, z46, issueOrPullRequestState4, aVar12, b3, bVar5, p3, z10, j3, a3, f3, arrayList, rVar4, z4, z6, str27, z5, z40, 0, 0, z49, z7, list4, z53, z68, z69, str3, false, str36, str37, z39, z54, a2Var, z1Var2, str30, c2Var, a4, arrayList2, true, pullRequestReviewDecision3, hVar2, bVar10, i33, z65, z66, z8, str34, str35, z67, z70, z71, null, false, null, false, null, null, false, 1073742080);
                                            }
                                        }
                                        z8 = false;
                                        if (list2 != null) {
                                        }
                                        String str352 = y5Var.d;
                                        boolean z672 = s2Var.o;
                                        boolean z682 = y5Var.S;
                                        boolean z692 = y5Var.T;
                                        boolean z702 = y5Var.l;
                                        boolean z712 = y5Var.U;
                                        ri0.n4 n4Var2 = y5Var.f;
                                        if (n4Var2 == null) {
                                        }
                                        ri0.u4 u4Var2 = y5Var.e;
                                        if (u4Var2 == null) {
                                        }
                                        int i332 = i30;
                                        if (q2Var == null) {
                                        }
                                        j2Var3 = new yz0.j2(str6, str8, str7, aVar11, str, z, z9, str20, z2, subscriptionState13, subscriptionState14, str2, str26, i23, z46, issueOrPullRequestState4, aVar12, b3, bVar5, p3, z10, j3, a3, f3, arrayList, rVar4, z4, z6, str27, z5, z40, 0, 0, z49, z7, list4, z53, z682, z692, str3, false, str36, str37, z39, z54, a2Var, z1Var2, str30, c2Var, a4, arrayList2, true, pullRequestReviewDecision3, hVar2, bVar10, i332, z65, z66, z8, str34, str352, z672, z702, z712, null, false, null, false, null, null, false, 1073742080);
                                    }
                                    jrVar = jrVar2;
                                    z2 = false;
                                    SubscriptionState subscriptionState122 = SubscriptionState.SUBSCRIBED;
                                    if (z35 == subscriptionState122) {
                                    }
                                    if (z36 != subscriptionState9) {
                                        subscriptionState9 = subscriptionState;
                                    }
                                    String str222 = y5Var.g;
                                    String str232 = y5Var.h;
                                    int i182 = y5Var.q;
                                    boolean z432 = y5Var.m;
                                    jr jrVar32 = jrVar;
                                    ordinal = y5Var.r.ordinal();
                                    if (ordinal != 0) {
                                    }
                                    ri0.l4 l4Var2 = y5Var.n;
                                    IssueOrPullRequestState issueOrPullRequestState42 = issueOrPullRequestState;
                                    com.github.service.models.response.a aVar122 = new com.github.service.models.response.a(l4Var2 != null ? l4Var2.b : "", b41.b.O(l4Var2 != null ? l4Var2.c : null), (String) null, false, (String) null, 60);
                                    boolean b32 = k71.k.b(y5Var.o, Boolean.TRUE);
                                    SubscriptionState subscriptionState142 = subscriptionState9;
                                    wl0.b bVar52 = new wl0.b(y5Var.V, str19, new yz0.b0(str20));
                                    list2 = list;
                                    ArrayList p32 = aa1.b.p(cVar3, str20);
                                    boolean z442 = cVar3.c;
                                    ri0.b5 b5Var2 = y5Var.H;
                                    wl0.g j32 = m71.a.j(b5Var2 != null ? b5Var2.c : null);
                                    ArrayList a32 = a.a.a(y5Var.Y);
                                    List f32 = com.google.common.util.concurrent.a.f(y5Var.Z);
                                    list3 = y5Var.I.a;
                                    if (list3 == null) {
                                    }
                                    ArrayList S32 = x61.m.S(list3);
                                    ArrayList arrayList92 = new ArrayList(x61.n.F(S32, 10));
                                    size = S32.size();
                                    i3 = 0;
                                    while (i3 < size) {
                                    }
                                    String str262 = str232;
                                    int i232 = i182;
                                    boolean z462 = z432;
                                    String str272 = str19;
                                    z3 = y5Var.j;
                                    boolean z472 = y5Var.k;
                                    boolean z482 = aVar10.b;
                                    yh0.a aVar132 = y5Var.X;
                                    boolean z492 = aVar132.b;
                                    boolean z502 = aVar132.c;
                                    yg0.e eVar2 = y5Var.a0;
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
                                    list4 = 0;
                                    if (list4 == 0) {
                                    }
                                    boolean z532 = y5Var.Q;
                                    boolean z542 = y5Var.B;
                                    int i242 = y5Var.s;
                                    int i252 = y5Var.t;
                                    int i262 = y5Var.u;
                                    if (y5Var.c0.b != null) {
                                    }
                                    v5Var = y5Var.P;
                                    if (v5Var != null) {
                                    }
                                    yz0.a2 a2Var2 = new yz0.a2(i242, i252, i262, z55, h2Var);
                                    if (list2 != null) {
                                    }
                                    if (t4Var != null) {
                                    }
                                    yz0.c2 c2Var2 = new yz0.c2(y5Var.E, y5Var.G);
                                    ArrayList a42 = pl0.a.a(r5Var, w4Var, v4Var);
                                    ArrayList S42 = x61.m.S(y5Var.M);
                                    String str302 = str29;
                                    ArrayList arrayList122 = new ArrayList(x61.n.F(S42, 10));
                                    size2 = S42.size();
                                    yz0.z1 z1Var22 = z1Var;
                                    i4 = 0;
                                    while (i4 < size2) {
                                    }
                                    pmVar = y5Var.A;
                                    if (pmVar != null) {
                                    }
                                    pullRequestReviewDecision = PullRequestReviewDecision.UNKNOWN__;
                                    PullRequestReviewDecision pullRequestReviewDecision32 = pullRequestReviewDecision;
                                    ri0.x4 x4Var2 = y5Var.x;
                                    ri0.b bVar72 = y5Var.d0;
                                    MergeStateStatus o2 = sy.c0.o(y5Var.v);
                                    ArrayList K2 = x61.l.K(new PullRequestMergeMethod[]{s2Var.j ? PullRequestMergeMethod.MERGE : null, s2Var.h ? PullRequestMergeMethod.SQUASH : null, s2Var.i ? PullRequestMergeMethod.REBASE : null});
                                    boolean z582 = !((t4Var != null || (o5Var = t4Var.b) == null) ? true : o5Var.a);
                                    PullRequestMergeMethod w2 = sy.f0.w(s2Var.l);
                                    String str312 = s2Var.k;
                                    List list132 = s2Var.m;
                                    ri0.a aVar142 = bVar72.d;
                                    if (aVar142 != null) {
                                    }
                                    boolean z592 = bVar72.c;
                                    boolean z602 = bVar72.b;
                                    boolean z622 = y5Var.R;
                                    ri0.a5 a5Var2 = y5Var.w;
                                    if (a5Var2 != null) {
                                    }
                                    if (x4Var2 != null) {
                                    }
                                    if (x4Var2 != null) {
                                    }
                                    ri0.z4 z4Var2 = y5Var.z;
                                    if (z4Var2 != null) {
                                    }
                                    ri0.y4 y4Var2 = y5Var.y;
                                    h01.h hVar22 = new h01.h(o2, K2, z582, w2, str312, list132, iVar2, z592, z602, z622, str32, str33, zonedDateTime3, T, y4Var2 != null ? m7.y.N(y4Var2.c) : null);
                                    xl0.b bVar82 = new xl0.b(y5Var);
                                    a = pl0.a.a(r5Var, w4Var, v4Var);
                                    if (m4Var != null) {
                                    }
                                    if (m4Var != null) {
                                    }
                                    if (a.isEmpty()) {
                                    }
                                    xl0.b bVar102 = bVar82;
                                    if (intValue > 0) {
                                    }
                                    if ((m4Var != null || (p5Var = m4Var.a) == null) ? z38 : p5Var.c) {
                                    }
                                    boolean z662 = s2Var.n;
                                    if (z5) {
                                    }
                                    z8 = false;
                                    if (list2 != null) {
                                    }
                                    String str3522 = y5Var.d;
                                    boolean z6722 = s2Var.o;
                                    boolean z6822 = y5Var.S;
                                    boolean z6922 = y5Var.T;
                                    boolean z7022 = y5Var.l;
                                    boolean z7122 = y5Var.U;
                                    ri0.n4 n4Var22 = y5Var.f;
                                    if (n4Var22 == null) {
                                    }
                                    ri0.u4 u4Var22 = y5Var.e;
                                    if (u4Var22 == null) {
                                    }
                                    int i3322 = i30;
                                    if (q2Var == null) {
                                    }
                                    j2Var3 = new yz0.j2(str6, str8, str7, aVar11, str, z, z9, str20, z2, subscriptionState13, subscriptionState142, str2, str262, i232, z462, issueOrPullRequestState42, aVar122, b32, bVar52, p32, z10, j32, a32, f32, arrayList, rVar4, z4, z6, str272, z5, z40, 0, 0, z492, z7, list4, z532, z6822, z6922, str3, false, str36, str37, z39, z542, a2Var2, z1Var22, str302, c2Var2, a42, arrayList2, true, pullRequestReviewDecision32, hVar22, bVar102, i3322, z65, z662, z8, str34, str3522, z6722, z7022, z7122, null, false, null, false, null, null, false, 1073742080);
                                }
                            }
                            z = z42;
                            jrVar = jrVar2;
                            z2 = false;
                            SubscriptionState subscriptionState1222 = SubscriptionState.SUBSCRIBED;
                            if (z35 == subscriptionState1222) {
                            }
                            if (z36 != subscriptionState9) {
                            }
                            String str2222 = y5Var.g;
                            String str2322 = y5Var.h;
                            int i1822 = y5Var.q;
                            boolean z4322 = y5Var.m;
                            jr jrVar322 = jrVar;
                            ordinal = y5Var.r.ordinal();
                            if (ordinal != 0) {
                            }
                            ri0.l4 l4Var22 = y5Var.n;
                            IssueOrPullRequestState issueOrPullRequestState422 = issueOrPullRequestState;
                            com.github.service.models.response.a aVar1222 = new com.github.service.models.response.a(l4Var22 != null ? l4Var22.b : "", b41.b.O(l4Var22 != null ? l4Var22.c : null), (String) null, false, (String) null, 60);
                            boolean b322 = k71.k.b(y5Var.o, Boolean.TRUE);
                            SubscriptionState subscriptionState1422 = subscriptionState9;
                            wl0.b bVar522 = new wl0.b(y5Var.V, str19, new yz0.b0(str20));
                            list2 = list;
                            ArrayList p322 = aa1.b.p(cVar3, str20);
                            boolean z4422 = cVar3.c;
                            ri0.b5 b5Var22 = y5Var.H;
                            wl0.g j322 = m71.a.j(b5Var22 != null ? b5Var22.c : null);
                            ArrayList a322 = a.a.a(y5Var.Y);
                            List f322 = com.google.common.util.concurrent.a.f(y5Var.Z);
                            list3 = y5Var.I.a;
                            if (list3 == null) {
                            }
                            ArrayList S322 = x61.m.S(list3);
                            ArrayList arrayList922 = new ArrayList(x61.n.F(S322, 10));
                            size = S322.size();
                            i3 = 0;
                            while (i3 < size) {
                            }
                            String str2622 = str2322;
                            int i2322 = i1822;
                            boolean z4622 = z4322;
                            String str2722 = str19;
                            z3 = y5Var.j;
                            boolean z4722 = y5Var.k;
                            boolean z4822 = aVar10.b;
                            yh0.a aVar1322 = y5Var.X;
                            boolean z4922 = aVar1322.b;
                            boolean z5022 = aVar1322.c;
                            yg0.e eVar22 = y5Var.a0;
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
                            list4 = 0;
                            if (list4 == 0) {
                            }
                            boolean z5322 = y5Var.Q;
                            boolean z5422 = y5Var.B;
                            int i2422 = y5Var.s;
                            int i2522 = y5Var.t;
                            int i2622 = y5Var.u;
                            if (y5Var.c0.b != null) {
                            }
                            v5Var = y5Var.P;
                            if (v5Var != null) {
                            }
                            yz0.a2 a2Var22 = new yz0.a2(i2422, i2522, i2622, z55, h2Var);
                            if (list2 != null) {
                            }
                            if (t4Var != null) {
                            }
                            yz0.c2 c2Var22 = new yz0.c2(y5Var.E, y5Var.G);
                            ArrayList a422 = pl0.a.a(r5Var, w4Var, v4Var);
                            ArrayList S422 = x61.m.S(y5Var.M);
                            String str3022 = str29;
                            ArrayList arrayList1222 = new ArrayList(x61.n.F(S422, 10));
                            size2 = S422.size();
                            yz0.z1 z1Var222 = z1Var;
                            i4 = 0;
                            while (i4 < size2) {
                            }
                            pmVar = y5Var.A;
                            if (pmVar != null) {
                            }
                            pullRequestReviewDecision = PullRequestReviewDecision.UNKNOWN__;
                            PullRequestReviewDecision pullRequestReviewDecision322 = pullRequestReviewDecision;
                            ri0.x4 x4Var22 = y5Var.x;
                            ri0.b bVar722 = y5Var.d0;
                            MergeStateStatus o22 = sy.c0.o(y5Var.v);
                            ArrayList K22 = x61.l.K(new PullRequestMergeMethod[]{s2Var.j ? PullRequestMergeMethod.MERGE : null, s2Var.h ? PullRequestMergeMethod.SQUASH : null, s2Var.i ? PullRequestMergeMethod.REBASE : null});
                            boolean z5822 = !((t4Var != null || (o5Var = t4Var.b) == null) ? true : o5Var.a);
                            PullRequestMergeMethod w22 = sy.f0.w(s2Var.l);
                            String str3122 = s2Var.k;
                            List list1322 = s2Var.m;
                            ri0.a aVar1422 = bVar722.d;
                            if (aVar1422 != null) {
                            }
                            boolean z5922 = bVar722.c;
                            boolean z6022 = bVar722.b;
                            boolean z6222 = y5Var.R;
                            ri0.a5 a5Var22 = y5Var.w;
                            if (a5Var22 != null) {
                            }
                            if (x4Var22 != null) {
                            }
                            if (x4Var22 != null) {
                            }
                            ri0.z4 z4Var22 = y5Var.z;
                            if (z4Var22 != null) {
                            }
                            ri0.y4 y4Var22 = y5Var.y;
                            h01.h hVar222 = new h01.h(o22, K22, z5822, w22, str3122, list1322, iVar2, z5922, z6022, z6222, str32, str33, zonedDateTime3, T, y4Var22 != null ? m7.y.N(y4Var22.c) : null);
                            xl0.b bVar822 = new xl0.b(y5Var);
                            a = pl0.a.a(r5Var, w4Var, v4Var);
                            if (m4Var != null) {
                            }
                            if (m4Var != null) {
                            }
                            if (a.isEmpty()) {
                            }
                            xl0.b bVar1022 = bVar822;
                            if (intValue > 0) {
                            }
                            if ((m4Var != null || (p5Var = m4Var.a) == null) ? z38 : p5Var.c) {
                            }
                            boolean z6622 = s2Var.n;
                            if (z5) {
                            }
                            z8 = false;
                            if (list2 != null) {
                            }
                            String str35222 = y5Var.d;
                            boolean z67222 = s2Var.o;
                            boolean z68222 = y5Var.S;
                            boolean z69222 = y5Var.T;
                            boolean z70222 = y5Var.l;
                            boolean z71222 = y5Var.U;
                            ri0.n4 n4Var222 = y5Var.f;
                            if (n4Var222 == null) {
                            }
                            ri0.u4 u4Var222 = y5Var.e;
                            if (u4Var222 == null) {
                            }
                            int i33222 = i30;
                            if (q2Var == null) {
                            }
                            j2Var3 = new yz0.j2(str6, str8, str7, aVar11, str, z, z9, str20, z2, subscriptionState13, subscriptionState1422, str2, str2622, i2322, z4622, issueOrPullRequestState422, aVar1222, b322, bVar522, p322, z10, j322, a322, f322, arrayList, rVar4, z4, z6, str2722, z5, z40, 0, 0, z4922, z7, list4, z5322, z68222, z69222, str3, false, str36, str37, z39, z5422, a2Var22, z1Var222, str3022, c2Var22, a422, arrayList2, true, pullRequestReviewDecision322, hVar222, bVar1022, i33222, z65, z6622, z8, str34, str35222, z67222, z70222, z71222, null, false, null, false, null, null, false, 1073742080);
                        } else {
                            z3Var2 = z3Var;
                            aVar = aVar3;
                        }
                        j2Var2 = j2Var3;
                        if (j2Var2 == null) {
                            z3 z3Var3 = z3Var2;
                            z3Var3.v = 1;
                            Object c = this.s.c(j2Var2, z3Var3);
                            b71.a aVar15 = aVar;
                            if (c == aVar15) {
                                return aVar15;
                            }
                        }
                    } else {
                        z3Var2 = z3Var;
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
        z3Var = new z3(this, cVar);
        Object obj22 = z3Var.u;
        b71.a aVar32 = b71.a.r;
        i = z3Var.v;
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
        i4 i4Var;
        int i;
        String str;
        if (cVar instanceof i4) {
            i4Var = (i4) cVar;
            int i2 = i4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = i4Var.u;
                b71.a aVar = b71.a.r;
                i = i4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    il0.y yVar = ((il0.w) obj).a;
                    il0.x xVar = yVar != null ? yVar.a : null;
                    String str2 = "";
                    String str3 = xVar != null ? xVar.a : "";
                    String str4 = xVar != null ? xVar.b : "";
                    String str5 = xVar != null ? xVar.c : "";
                    if (xVar != null && (str = xVar.d) != null) {
                        str2 = str;
                    }
                    xz0.h hVar = new xz0.h(str3, str4, str5, str2);
                    i4Var.v = 1;
                    if (this.s.c(hVar, i4Var) == aVar) {
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
        i4Var = new i4(this, cVar);
        Object obj22 = i4Var.u;
        b71.a aVar2 = b71.a.r;
        i = i4Var.v;
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
        k4 k4Var;
        int i;
        dh dhVar;
        ah ahVar;
        dh dhVar2;
        eh ehVar;
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
                    ch chVar = (ch) obj;
                    xd xdVar = (chVar == null || (dhVar2 = chVar.a) == null || (ehVar = dhVar2.b) == null) ? null : ehVar.b;
                    int i3 = xdVar == null ? -1 : pl0.m.a[xdVar.ordinal()];
                    yz0.t6 t6Var = new yz0.t6(i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? TimelineItem$TimelineLockedEvent$Reason.UNKNOWN : TimelineItem$TimelineLockedEvent$Reason.RESOLVED : TimelineItem$TimelineLockedEvent$Reason.TOO_HEATED : TimelineItem$TimelineLockedEvent$Reason.SPAM : TimelineItem$TimelineLockedEvent$Reason.OFF_TOPIC, new com.github.service.models.response.a((chVar == null || (dhVar = chVar.a) == null || (ahVar = dhVar.a) == null) ? "" : ahVar.b, (Avatar) null, (String) null, false, (String) null, 62));
                    k4Var.v = 1;
                    if (this.s.c(t6Var, k4Var) == aVar) {
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
    private final Object e(a71.c cVar, Object obj) {
        n4 n4Var;
        int i;
        g40 g40Var;
        d40 d40Var;
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
                    f40 f40Var = (f40) obj;
                    yz0.p7 p7Var = new yz0.p7(new com.github.service.models.response.a((f40Var == null || (g40Var = f40Var.a) == null || (d40Var = g40Var.a) == null) ? "" : d40Var.b, (Avatar) null, (String) null, false, (String) null, 62));
                    n4Var.v = 1;
                    if (this.s.c(p7Var, n4Var) == aVar) {
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
        b71.a aVar2 = b71.a.r;
        i = n4Var.v;
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
    private final Object f(a71.c cVar, Object obj) {
        p4 p4Var;
        int i;
        ArrayList arrayList;
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
                    ak akVar = ((tj) obj).a;
                    dk dkVar = akVar != null ? akVar.d : null;
                    Collection<zj> collection = x61.r.r;
                    if (dkVar != null) {
                        uj ujVar = akVar.d.a;
                        Collection collection2 = ujVar != null ? ujVar.a : null;
                        if (collection2 != null) {
                            collection = collection2;
                        }
                        arrayList = new ArrayList();
                        for (yj yjVar : collection) {
                            yz0.r2 c = (yjVar != null ? yjVar.b.b : null) != null ? pl0.f.c(yjVar.b.b) : (yjVar != null ? yjVar.b.c : null) != null ? pl0.f.b(yjVar.b.c) : (yjVar != null ? yjVar.b.d : null) != null ? pl0.f.a(yjVar.b.d) : null;
                            if (c != null) {
                                arrayList.add(c);
                            }
                        }
                    } else if ((akVar != null ? akVar.c : null) != null) {
                        wj wjVar = akVar.c.a;
                        Collection collection3 = wjVar != null ? wjVar.a : null;
                        if (collection3 != null) {
                            collection = collection3;
                        }
                        arrayList = new ArrayList();
                        for (xj xjVar : collection) {
                            yz0.r2 c2 = (xjVar != null ? xjVar.b.b : null) != null ? pl0.f.c(xjVar.b.b) : (xjVar != null ? xjVar.b.c : null) != null ? pl0.f.b(xjVar.b.c) : (xjVar != null ? xjVar.b.d : null) != null ? pl0.f.a(xjVar.b.d) : null;
                            if (c2 != null) {
                                arrayList.add(c2);
                            }
                        }
                    } else {
                        if ((akVar != null ? akVar.e : null) != null) {
                            vj vjVar = akVar.e.a;
                            Collection collection4 = vjVar != null ? vjVar.a : null;
                            if (collection4 != null) {
                                collection = collection4;
                            }
                            arrayList = new ArrayList();
                            for (zj zjVar : collection) {
                                yz0.r2 c3 = (zjVar != null ? zjVar.b.b : null) != null ? pl0.f.c(zjVar.b.b) : (zjVar != null ? zjVar.b.c : null) != null ? pl0.f.b(zjVar.b.c) : (zjVar != null ? zjVar.b.d : null) != null ? pl0.f.a(zjVar.b.d) : null;
                                if (c3 != null) {
                                    arrayList.add(c3);
                                }
                            }
                        }
                        p4Var.v = 1;
                        if (this.s.c(collection, p4Var) == aVar) {
                            return aVar;
                        }
                    }
                    collection = arrayList;
                    p4Var.v = 1;
                    if (this.s.c(collection, p4Var) == aVar) {
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
        b71.a aVar2 = b71.a.r;
        i = p4Var.v;
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
        q4 q4Var;
        int i;
        String str;
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
                    jk jkVar = ((gk) obj).a;
                    kk kkVar = jkVar != null ? jkVar.c : null;
                    Collection<ik> collection = x61.r.r;
                    if (kkVar != null) {
                        Collection collection2 = jkVar.c.a.a;
                        if (collection2 != null) {
                            collection = collection2;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (ik ikVar : collection) {
                            if (ikVar == null || (str = ikVar.b) == null) {
                                str = "";
                            }
                            arrayList.add(new yz0.r2(str, ikVar != null ? ikVar.c : "", b41.b.O(ikVar != null ? ikVar.e : null), false));
                        }
                        collection = arrayList;
                    }
                    q4Var.v = 1;
                    if (this.s.c(collection, q4Var) == aVar) {
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
    private final Object h(a71.c cVar, Object obj) {
        t4 t4Var;
        int i;
        if (cVar instanceof t4) {
            t4Var = (t4) cVar;
            int i2 = t4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = t4Var.u;
                b71.a aVar = b71.a.r;
                i = t4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    ok okVar = ((nk) obj).a;
                    pk pkVar = okVar != null ? okVar.c : null;
                    if (pkVar != null) {
                        t4Var.v = 1;
                        if (this.s.c(pkVar, t4Var) == aVar) {
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
        t4Var = new t4(this, cVar);
        Object obj22 = t4Var.u;
        b71.a aVar2 = b71.a.r;
        i = t4Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object i(a71.c cVar, Object obj) {
        u4 u4Var;
        int i;
        PullRequestState pullRequestState;
        xk xkVar;
        uk ukVar;
        xk xkVar2;
        rk rkVar;
        xk xkVar3;
        xk xkVar4;
        uk ukVar2;
        xk xkVar5;
        if (cVar instanceof u4) {
            u4Var = (u4) cVar;
            int i2 = u4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = u4Var.u;
                b71.a aVar = b71.a.r;
                i = u4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    tk tkVar = (tk) obj;
                    k71.k.g(tkVar, "<this>");
                    vk vkVar = tkVar.a;
                    if (vkVar == null || (xkVar5 = vkVar.b) == null || (pullRequestState = t.z.p(xkVar5.i.b)) == null) {
                        pullRequestState = PullRequestState.UNKNOWN__;
                    }
                    String str = "";
                    String str2 = (vkVar == null || (xkVar4 = vkVar.b) == null || (ukVar2 = xkVar4.d) == null) ? "" : ukVar2.a;
                    String str3 = (vkVar == null || (xkVar3 = vkVar.b) == null) ? "" : xkVar3.c;
                    if (vkVar != null && (rkVar = vkVar.a) != null) {
                        str = rkVar.b;
                    }
                    yz0.v6 v6Var = new yz0.v6(str2, str3, new com.github.service.models.response.a(str, (Avatar) null, (String) null, false, (String) null, 62));
                    boolean z = false;
                    if (vkVar != null && (xkVar2 = vkVar.b) != null && xkVar2.g) {
                        z = true;
                    }
                    yz0.u2 u2Var = new yz0.u2(pullRequestState, v6Var, z, (vkVar == null || (xkVar = vkVar.b) == null || (ukVar = xkVar.d) == null) ? null : ukVar.b);
                    u4Var.v = 1;
                    if (this.s.c(u2Var, u4Var) == aVar) {
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
        u4Var = new u4(this, cVar);
        Object obj22 = u4Var.u;
        b71.a aVar2 = b71.a.r;
        i = u4Var.v;
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
        w4 w4Var;
        int i;
        v70 v70Var;
        List list;
        u70 u70Var;
        ui0.d dVar;
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
                    z70 z70Var = ((o70) obj).a;
                    yz0.z6 v = (z70Var == null || (v70Var = z70Var.a) == null || (list = v70Var.o.a) == null || (u70Var = (u70) x61.m.W(list)) == null || (dVar = u70Var.c) == null) ? null : b31.b.v(dVar);
                    if (v != null) {
                        w4Var.v = 1;
                        if (this.s.c(v, w4Var) == aVar) {
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
        w4Var = new w4(this, cVar);
        Object obj22 = w4Var.u;
        b71.a aVar2 = b71.a.r;
        i = w4Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x09f7  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x0abb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x0ac9  */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v6, types: [x61.r] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v81, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v83, types: [x61.r] */
    /* JADX WARN: Type inference failed for: r1v86, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v86, types: [x61.r] */
    /* JADX WARN: Type inference failed for: r2v87, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v88, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        s2 s2Var;
        int i;
        ys ysVar;
        u2 u2Var;
        int i2;
        z2 z2Var;
        int i3;
        RandomAccess randomAccess;
        ArrayList arrayList;
        yz0.o oVar;
        Object next;
        b3 b3Var;
        int i4;
        Boolean bool;
        e3 e3Var;
        int i5;
        g3 g3Var;
        int i6;
        i3 i3Var;
        int i7;
        ArrayList arrayList2;
        k3 k3Var;
        int i8;
        oj0.v3 v3Var;
        l3 l3Var;
        int i9;
        m3 m3Var;
        int i10;
        n3 n3Var;
        int i12;
        java.util.ArrayList r1;
        List<ka0> list;
        q3 q3Var;
        int i13;
        o20 o20Var;
        t20 t20Var;
        x20 x20Var;
        u20 u20Var;
        o20 o20Var2;
        t20 t20Var2;
        x20 x20Var2;
        r20 r20Var;
        o20 o20Var3;
        t20 t20Var3;
        x20 x20Var3;
        u20 u20Var2;
        List list2;
        p20 p20Var;
        v20 v20Var;
        o20 o20Var4;
        q20 q20Var;
        y20 y20Var;
        s20 s20Var;
        s3 s3Var;
        int i14;
        h01.q d;
        dl0.l0 l0Var;
        dl0.l0 l0Var2;
        t3 t3Var;
        int i15;
        w3 w3Var;
        int i16;
        y3 y3Var;
        int i17;
        Object obj2;
        dl0.l0 l0Var3;
        dl0.l0 l0Var4;
        e4 e4Var;
        int i18;
        java.util.ArrayList r13;
        List<il0.r> list3;
        oj0.e2 e2Var;
        String str;
        f4 f4Var;
        int i19;
        String str2;
        g4 g4Var;
        int i20;
        java.util.ArrayList r2;
        List<oj0.z3> list4;
        s4 s4Var;
        int i22;
        y4 y4Var;
        int i23;
        lb lbVar;
        switch (this.r) {
            case 0:
                if (cVar instanceof s2) {
                    s2Var = (s2) cVar;
                    int i24 = s2Var.v;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        s2Var.v = i24 - Integer.MIN_VALUE;
                        Object obj3 = s2Var.u;
                        b71.a aVar = b71.a.r;
                        i = s2Var.v;
                        if (i != 0) {
                            sy.y.j(obj3);
                            at atVar = ((ws) obj).a;
                            zs zsVar = (atVar == null || (ysVar = atVar.a) == null) ? null : ysVar.b;
                            if (zsVar != null) {
                                s2Var.v = 1;
                                if (this.s.c(zsVar, s2Var) == aVar) {
                                    return aVar;
                                }
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj3);
                        }
                        return w61.a0.a;
                    }
                }
                s2Var = new s2(this, cVar);
                Object obj32 = s2Var.u;
                b71.a aVar2 = b71.a.r;
                i = s2Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof u2) {
                    u2Var = (u2) cVar;
                    int i25 = u2Var.v;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        u2Var.v = i25 - Integer.MIN_VALUE;
                        Object obj4 = u2Var.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = u2Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj4);
                            Iterable<xs> iterable = ((zs) obj).a;
                            if (iterable == null) {
                                iterable = x61.r.r;
                            }
                            ArrayList arrayList3 = new ArrayList(x61.n.F(iterable, 10));
                            for (xs xsVar : iterable) {
                                String str3 = xsVar.a;
                                String str4 = xsVar.b;
                                int i26 = xsVar.c;
                                bt btVar = xsVar.d;
                                arrayList3.add(new yz0.f1(i26, str3, str4, btVar != null ? btVar.a : ""));
                            }
                            List v0 = x61.m.v0(arrayList3, new v2(0));
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj5 : v0) {
                                Entry$EntryType entry$EntryType = ((yz0.f1) obj5).e;
                                if (entry$EntryType == Entry$EntryType.TREE) {
                                    arrayList4.add(obj5);
                                } else if (entry$EntryType == Entry$EntryType.COMMIT) {
                                    arrayList5.add(obj5);
                                } else {
                                    arrayList6.add(obj5);
                                }
                            }
                            ArrayList l0 = x61.m.l0(x61.m.l0(arrayList4, arrayList6), arrayList5);
                            u2Var.v = 1;
                            if (this.s.c(l0, u2Var) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj4);
                        }
                        return w61.a0.a;
                    }
                }
                u2Var = new u2(this, cVar);
                Object obj42 = u2Var.u;
                b71.a aVar32 = b71.a.r;
                i2 = u2Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof z2) {
                    z2Var = (z2) cVar;
                    int i27 = z2Var.v;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        z2Var.v = i27 - Integer.MIN_VALUE;
                        Object obj6 = z2Var.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = z2Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj6);
                            kc0.a5 a5Var = ((kc0.c5) obj).a;
                            kc0.f5 f5Var = a5Var.a;
                            x01.i iVar = new x01.i(f5Var.b, f5Var.a, false);
                            List<kc0.e5> list5 = a5Var.b;
                            if (list5 != null) {
                                ArrayList arrayList7 = new ArrayList();
                                ArrayList arrayList8 = arrayList7;
                                for (kc0.e5 e5Var : list5) {
                                    if (e5Var != null) {
                                        ArrayList arrayList9 = e5Var.d;
                                        String str5 = e5Var.b;
                                        kc0.d5 d5Var = e5Var.a;
                                        Language language = new Language(d5Var != null ? d5Var.b : "", d5Var != null ? d5Var.a : null);
                                        int i28 = e5Var.c;
                                        ArrayList arrayList10 = new ArrayList();
                                        int size = arrayList9.size();
                                        int i29 = 0;
                                        ArrayList arrayList11 = arrayList8;
                                        while (i29 < size) {
                                            Object obj7 = arrayList9.get(i29);
                                            i29++;
                                            kc0.g5 g5Var = (kc0.g5) obj7;
                                            ArrayList arrayList12 = arrayList11;
                                            yz0.p c = g5Var.e > 0.0d ? b91.g.c(g5Var) : null;
                                            if (c != null) {
                                                arrayList10.add(c);
                                            }
                                            arrayList11 = arrayList12;
                                        }
                                        arrayList = arrayList11;
                                        Object x0 = x61.m.x0(arrayList10, 4);
                                        if (x0.isEmpty()) {
                                            List x02 = x61.m.x0(arrayList9, 4);
                                            x0 = new ArrayList(x61.n.F(x02, 10));
                                            Iterator it = x02.iterator();
                                            while (it.hasNext()) {
                                                x0.add(b91.g.c((kc0.g5) it.next()));
                                            }
                                        }
                                        List list6 = x0;
                                        List x03 = x61.m.x0(arrayList9, 16);
                                        ArrayList arrayList13 = new ArrayList(x61.n.F(x03, 10));
                                        Iterator it2 = x03.iterator();
                                        while (it2.hasNext()) {
                                            arrayList13.add(b91.g.c((kc0.g5) it2.next()));
                                        }
                                        Iterator it3 = x61.m.x0(arrayList9, 16).iterator();
                                        if (it3.hasNext()) {
                                            next = it3.next();
                                            if (it3.hasNext()) {
                                                int i30 = ((kc0.g5) next).b;
                                                do {
                                                    Object next2 = it3.next();
                                                    int i32 = ((kc0.g5) next2).b;
                                                    if (i30 < i32) {
                                                        next = next2;
                                                        i30 = i32;
                                                    }
                                                } while (it3.hasNext());
                                            }
                                        } else {
                                            next = null;
                                        }
                                        kc0.g5 g5Var2 = (kc0.g5) next;
                                        oVar = new yz0.o(str5, language, g5Var2 != null ? g5Var2.b : 0, i28, list6, arrayList13);
                                    } else {
                                        arrayList = arrayList8;
                                        oVar = null;
                                    }
                                    ArrayList arrayList14 = arrayList;
                                    if (oVar != null) {
                                        arrayList14.add(oVar);
                                    }
                                    arrayList8 = arrayList14;
                                }
                                randomAccess = arrayList8;
                            } else {
                                randomAccess = null;
                            }
                            if (randomAccess == null) {
                                randomAccess = x61.r.r;
                            }
                            w61.k kVar = new w61.k(iVar, randomAccess);
                            z2Var.v = 1;
                            if (this.s.c(kVar, z2Var) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj6);
                        }
                        return w61.a0.a;
                    }
                }
                z2Var = new z2(this, cVar);
                Object obj62 = z2Var.u;
                b71.a aVar42 = b71.a.r;
                i3 = z2Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof b3) {
                    b3Var = (b3) cVar;
                    int i33 = b3Var.v;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        b3Var.v = i33 - Integer.MIN_VALUE;
                        Object obj8 = b3Var.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = b3Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj8);
                            kc0.t tVar = ((kc0.v) obj).a;
                            Boolean valueOf = Boolean.valueOf((tVar == null || (bool = tVar.a) == null) ? false : bool.booleanValue());
                            b3Var.v = 1;
                            if (this.s.c(valueOf, b3Var) == aVar5) {
                                return aVar5;
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
                b3Var = new b3(this, cVar);
                Object obj82 = b3Var.u;
                b71.a aVar52 = b71.a.r;
                i4 = b3Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof e3) {
                    e3Var = (e3) cVar;
                    int i34 = e3Var.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        e3Var.v = i34 - Integer.MIN_VALUE;
                        Object obj9 = e3Var.u;
                        b71.a aVar6 = b71.a.r;
                        i5 = e3Var.v;
                        if (i5 != 0) {
                            sy.y.j(obj9);
                            wl0.e eVar = new wl0.e((vf) obj);
                            e3Var.v = 1;
                            if (this.s.c(eVar, e3Var) == aVar6) {
                                return aVar6;
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
                e3Var = new e3(this, cVar);
                Object obj92 = e3Var.u;
                b71.a aVar62 = b71.a.r;
                i5 = e3Var.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof g3) {
                    g3Var = (g3) cVar;
                    int i35 = g3Var.v;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        g3Var.v = i35 - Integer.MIN_VALUE;
                        Object obj10 = g3Var.u;
                        b71.a aVar7 = b71.a.r;
                        i6 = g3Var.v;
                        if (i6 != 0) {
                            sy.y.j(obj10);
                            nf nfVar = ((pf) obj).a;
                            rf rfVar = nfVar.a;
                            x01.i iVar2 = new x01.i(rfVar.b, rfVar.a, false);
                            List<qf> list7 = nfVar.b;
                            x61.r rVar = null;
                            if (list7 != null) {
                                ArrayList arrayList15 = new ArrayList();
                                for (qf qfVar : list7) {
                                    yz0.t1 N = qfVar != null ? com.google.android.gms.internal.measurement.i4.N(qfVar.b) : null;
                                    if (N != null) {
                                        arrayList15.add(N);
                                    }
                                }
                                rVar = arrayList15;
                            }
                            if (rVar == null) {
                                rVar = x61.r.r;
                            }
                            w61.k kVar2 = new w61.k(iVar2, rVar);
                            g3Var.v = 1;
                            if (this.s.c(kVar2, g3Var) == aVar7) {
                                return aVar7;
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
                g3Var = new g3(this, cVar);
                Object obj102 = g3Var.u;
                b71.a aVar72 = b71.a.r;
                i6 = g3Var.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof i3) {
                    i3Var = (i3) cVar;
                    int i36 = i3Var.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        i3Var.v = i36 - Integer.MIN_VALUE;
                        Object obj11 = i3Var.u;
                        b71.a aVar8 = b71.a.r;
                        i7 = i3Var.v;
                        if (i7 != 0) {
                            sy.y.j(obj11);
                            wk0.a aVar9 = ((ab0) obj).a.c.a;
                            if (aVar9 != null) {
                                ArrayList arrayList16 = aVar9.a;
                                ArrayList arrayList17 = new ArrayList(x61.n.F(arrayList16, 10));
                                int size2 = arrayList16.size();
                                int i37 = 0;
                                int i38 = 0;
                                while (i38 < size2) {
                                    Object obj12 = arrayList16.get(i38);
                                    i38++;
                                    wk0.b bVar = (wk0.b) obj12;
                                    k71.k.g(bVar, "<this>");
                                    arrayList17.add(new g01.d(sy.d0.y(bVar.a), bVar.b));
                                }
                                arrayList2 = new ArrayList();
                                int size3 = arrayList17.size();
                                while (i37 < size3) {
                                    Object obj13 = arrayList17.get(i37);
                                    i37++;
                                    if (((g01.d) obj13).a != NavLinkIdentifier.UNKNOWN__) {
                                        arrayList2.add(obj13);
                                    }
                                }
                            } else {
                                arrayList2 = null;
                            }
                            if (arrayList2 != null) {
                                i3Var.v = 1;
                                if (this.s.c(arrayList2, i3Var) == aVar8) {
                                    return aVar8;
                                }
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
                i3Var = new i3(this, cVar);
                Object obj112 = i3Var.u;
                b71.a aVar82 = b71.a.r;
                i7 = i3Var.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof k3) {
                    k3Var = (k3) cVar;
                    int i39 = k3Var.v;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        k3Var.v = i39 - Integer.MIN_VALUE;
                        Object obj14 = k3Var.u;
                        b71.a aVar10 = b71.a.r;
                        i8 = k3Var.v;
                        if (i8 != 0) {
                            sy.y.j(obj14);
                            Iterable<wk0.h> iterable2 = ((pn) obj).a.c.a.a;
                            if (iterable2 == null) {
                                iterable2 = x61.r.r;
                            }
                            ArrayList arrayList18 = new ArrayList();
                            for (wk0.h hVar : iterable2) {
                                SimpleRepository Z = (hVar == null || (v3Var = hVar.c) == null) ? null : b91.g.Z(v3Var);
                                if (Z != null) {
                                    arrayList18.add(Z);
                                }
                            }
                            k3Var.v = 1;
                            if (this.s.c(arrayList18, k3Var) == aVar10) {
                                return aVar10;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj14);
                        }
                        return w61.a0.a;
                    }
                }
                k3Var = new k3(this, cVar);
                Object obj142 = k3Var.u;
                b71.a aVar102 = b71.a.r;
                i8 = k3Var.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof l3) {
                    l3Var = (l3) cVar;
                    int i40 = l3Var.v;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        l3Var.v = i40 - Integer.MIN_VALUE;
                        Object obj15 = l3Var.u;
                        b71.a aVar11 = b71.a.r;
                        i9 = l3Var.v;
                        if (i9 != 0) {
                            sy.y.j(obj15);
                            g01.a c2 = sy.c0.c((pg) obj);
                            l3Var.v = 1;
                            if (this.s.c(c2, l3Var) == aVar11) {
                                return aVar11;
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj15);
                        }
                        return w61.a0.a;
                    }
                }
                l3Var = new l3(this, cVar);
                Object obj152 = l3Var.u;
                b71.a aVar112 = b71.a.r;
                i9 = l3Var.v;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof m3) {
                    m3Var = (m3) cVar;
                    int i42 = m3Var.v;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        m3Var.v = i42 - Integer.MIN_VALUE;
                        Object obj16 = m3Var.u;
                        b71.a aVar12 = b71.a.r;
                        i10 = m3Var.v;
                        if (i10 != 0) {
                            sy.y.j(obj16);
                            g01.a c3 = sy.c0.c((pg) obj);
                            m3Var.v = 1;
                            if (this.s.c(c3, m3Var) == aVar12) {
                                return aVar12;
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
                m3Var = new m3(this, cVar);
                Object obj162 = m3Var.u;
                b71.a aVar122 = b71.a.r;
                i10 = m3Var.v;
                if (i10 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof n3) {
                    n3Var = (n3) cVar;
                    int i43 = n3Var.v;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        n3Var.v = i43 - Integer.MIN_VALUE;
                        Object obj17 = n3Var.u;
                        b71.a aVar13 = b71.a.r;
                        i12 = n3Var.v;
                        if (i12 != 0) {
                            sy.y.j(obj17);
                            ja0 ja0Var = (ja0) obj;
                            k71.k.g(ja0Var, "<this>");
                            la0 la0Var = ja0Var.a;
                            if (la0Var == null || (list = la0Var.a) == null) {
                                r1 = 0;
                            } else {
                                ArrayList arrayList19 = new ArrayList(x61.n.F(list, 10));
                                for (ka0 ka0Var : list) {
                                    arrayList19.add(new g01.d(sy.d0.y(ka0Var.a), ka0Var.b));
                                }
                                r1 = new ArrayList();
                                int size4 = arrayList19.size();
                                int i44 = 0;
                                while (i44 < size4) {
                                    Object obj18 = arrayList19.get(i44);
                                    i44++;
                                    if (((g01.d) obj18).a != NavLinkIdentifier.UNKNOWN__) {
                                        r1.add(obj18);
                                    }
                                }
                            }
                            if (r1 == 0) {
                                r1 = x61.r.r;
                            }
                            n3Var.v = 1;
                            if (this.s.c((Object) r1, n3Var) == aVar13) {
                                return aVar13;
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
                n3Var = new n3(this, cVar);
                Object obj172 = n3Var.u;
                b71.a aVar132 = b71.a.r;
                i12 = n3Var.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof q3) {
                    q3Var = (q3) cVar;
                    int i45 = q3Var.v;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        q3Var.v = i45 - Integer.MIN_VALUE;
                        Object obj19 = q3Var.u;
                        b71.a aVar14 = b71.a.r;
                        i13 = q3Var.v;
                        if (i13 != 0) {
                            sy.y.j(obj19);
                            n20 n20Var = (n20) obj;
                            w20 w20Var = n20Var.a;
                            Object obj20 = null;
                            String str6 = (w20Var == null || (o20Var4 = w20Var.b) == null || (q20Var = o20Var4.b) == null || (y20Var = q20Var.a) == null || (s20Var = y20Var.b) == null) ? null : s20Var.a;
                            String str7 = (w20Var == null || (o20Var3 = w20Var.b) == null || (t20Var3 = o20Var3.c) == null || (x20Var3 = t20Var3.b) == null || (u20Var2 = x20Var3.c) == null || (list2 = u20Var2.b.a) == null || (p20Var = (p20) x61.m.W(list2)) == null || (v20Var = p20Var.a) == null) ? null : v20Var.a;
                            w20 w20Var2 = n20Var.a;
                            String str8 = (w20Var2 == null || (o20Var2 = w20Var2.b) == null || (t20Var2 = o20Var2.c) == null || (x20Var2 = t20Var2.b) == null || (r20Var = x20Var2.b) == null) ? null : r20Var.a;
                            String str9 = (w20Var2 == null || (o20Var = w20Var2.b) == null || (t20Var = o20Var.c) == null || (x20Var = t20Var.b) == null || (u20Var = x20Var.c) == null) ? null : u20Var.a;
                            if (str7 == null || str9 == null) {
                                if (str6 == null) {
                                    str6 = str7 == null ? str8 : str7;
                                }
                                if (str6 != null) {
                                    obj20 = new z01.d0(str6);
                                }
                            } else {
                                obj20 = new z01.e0(str9, str7);
                            }
                            if (obj20 == null) {
                                throw new ApiFailure(ApiFailureType.SERVER_ERROR, "Could not fetch time line id for given url.", null, null, null, null, null, 120);
                            }
                            q3Var.v = 1;
                            if (this.s.c(obj20, q3Var) == aVar14) {
                                return aVar14;
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
                q3Var = new q3(this, cVar);
                Object obj192 = q3Var.u;
                b71.a aVar142 = b71.a.r;
                i13 = q3Var.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof s3) {
                    s3Var = (s3) cVar;
                    int i46 = s3Var.v;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        s3Var.v = i46 - Integer.MIN_VALUE;
                        Object obj21 = s3Var.u;
                        b71.a aVar15 = b71.a.r;
                        i14 = s3Var.v;
                        if (i14 != 0) {
                            sy.y.j(obj21);
                            dl0.o0 o0Var = ((dl0.k0) obj).a;
                            dl0.n0 n0Var = null;
                            if (((o0Var == null || (l0Var2 = o0Var.b) == null) ? null : l0Var2.b) != null) {
                                mg0.z zVar = o0Var.b.b.c;
                                String str10 = zVar.b;
                                mg0.y yVar = zVar.c;
                                int i47 = yVar.b;
                                List e = sy.p.e(yVar);
                                mg0.x xVar = yVar.c;
                                d = new h01.q(str10, i47, e, xVar.a, xVar.b, xVar.c, xVar.d);
                            } else {
                                if (o0Var != null && (l0Var = o0Var.b) != null) {
                                    n0Var = l0Var.c;
                                }
                                d = n0Var != null ? sy.p.d(o0Var.b.c.c) : xl0.c.a;
                            }
                            s3Var.v = 1;
                            if (this.s.c(d, s3Var) == aVar15) {
                                return aVar15;
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
                s3Var = new s3(this, cVar);
                Object obj212 = s3Var.u;
                b71.a aVar152 = b71.a.r;
                i14 = s3Var.v;
                if (i14 != 0) {
                }
                return w61.a0.a;
            case 13:
                if (cVar instanceof t3) {
                    t3Var = (t3) cVar;
                    int i48 = t3Var.v;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        t3Var.v = i48 - Integer.MIN_VALUE;
                        Object obj22 = t3Var.u;
                        b71.a aVar16 = b71.a.r;
                        i15 = t3Var.v;
                        if (i15 != 0) {
                            sy.y.j(obj22);
                            List f = i21.a.f((dl0.m) obj);
                            t3Var.v = 1;
                            if (this.s.c(f, t3Var) == aVar16) {
                                return aVar16;
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj22);
                        }
                        return w61.a0.a;
                    }
                }
                t3Var = new t3(this, cVar);
                Object obj222 = t3Var.u;
                b71.a aVar162 = b71.a.r;
                i15 = t3Var.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof w3) {
                    w3Var = (w3) cVar;
                    int i49 = w3Var.v;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        w3Var.v = i49 - Integer.MIN_VALUE;
                        Object obj23 = w3Var.u;
                        b71.a aVar17 = b71.a.r;
                        i16 = w3Var.v;
                        if (i16 != 0) {
                            sy.y.j(obj23);
                            List f2 = i21.a.f((dl0.m) obj);
                            w3Var.v = 1;
                            if (this.s.c(f2, w3Var) == aVar17) {
                                return aVar17;
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj23);
                        }
                        return w61.a0.a;
                    }
                }
                w3Var = new w3(this, cVar);
                Object obj232 = w3Var.u;
                b71.a aVar172 = b71.a.r;
                i16 = w3Var.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 15:
                if (cVar instanceof y3) {
                    y3Var = (y3) cVar;
                    int i50 = y3Var.v;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        y3Var.v = i50 - Integer.MIN_VALUE;
                        Object obj24 = y3Var.u;
                        b71.a aVar18 = b71.a.r;
                        i17 = y3Var.v;
                        if (i17 != 0) {
                            sy.y.j(obj24);
                            dl0.o0 o0Var2 = ((dl0.k0) obj).a;
                            dl0.n0 n0Var2 = null;
                            if (((o0Var2 == null || (l0Var4 = o0Var2.b) == null) ? null : l0Var4.b) != null) {
                                obj2 = sy.p.e(o0Var2.b.b.c.c);
                            } else {
                                if (o0Var2 != null && (l0Var3 = o0Var2.b) != null) {
                                    n0Var2 = l0Var3.c;
                                }
                                obj2 = n0Var2 != null ? sy.p.d(o0Var2.b.c.c).c : x61.r.r;
                            }
                            y3Var.v = 1;
                            if (this.s.c(obj2, y3Var) == aVar18) {
                                return aVar18;
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
                y3Var = new y3(this, cVar);
                Object obj242 = y3Var.u;
                b71.a aVar182 = b71.a.r;
                i17 = y3Var.v;
                if (i17 != 0) {
                }
                return w61.a0.a;
            case 16:
                return a(cVar, obj);
            case 17:
                if (cVar instanceof e4) {
                    e4Var = (e4) cVar;
                    int i52 = e4Var.v;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        e4Var.v = i52 - Integer.MIN_VALUE;
                        Object obj25 = e4Var.u;
                        b71.a aVar19 = b71.a.r;
                        i18 = e4Var.v;
                        if (i18 != 0) {
                            sy.y.j(obj25);
                            il0.q qVar = ((il0.o) obj).a;
                            String str11 = qVar != null ? qVar.a : "";
                            String str12 = qVar != null ? qVar.b : "";
                            String str13 = (qVar == null || (str = qVar.c) == null) ? "" : str;
                            com.github.service.models.response.a d2 = aa1.b.d(qVar != null ? qVar.d.c : null);
                            int i53 = qVar != null ? qVar.e.c : 0;
                            if (qVar == null || (list3 = qVar.e.b) == null) {
                                r13 = 0;
                            } else {
                                r13 = new ArrayList();
                                for (il0.r rVar2 : list3) {
                                    p01.n X = ((rVar2 != null ? rVar2.c : null) == null || (e2Var = rVar2.b) == null) ? null : b91.g.X(new w61.k(e2Var, rVar2.c));
                                    if (X != null) {
                                        r13.add(X);
                                    }
                                }
                            }
                            if (r13 == 0) {
                                r13 = x61.r.r;
                            }
                            yz0.g1 g1Var = new yz0.g1(new yz0.p2(str11, str12, str13, i53, d2), new yz0.c4(r13, new x01.i(qVar != null ? qVar.e.a.b : null, qVar != null ? qVar.e.a.a : false, false)));
                            e4Var.v = 1;
                            if (this.s.c(g1Var, e4Var) == aVar19) {
                                return aVar19;
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj25);
                        }
                        return w61.a0.a;
                    }
                }
                e4Var = new e4(this, cVar);
                Object obj252 = e4Var.u;
                b71.a aVar192 = b71.a.r;
                i18 = e4Var.v;
                if (i18 != 0) {
                }
                return w61.a0.a;
            case 18:
                if (cVar instanceof f4) {
                    f4Var = (f4) cVar;
                    int i54 = f4Var.v;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        f4Var.v = i54 - Integer.MIN_VALUE;
                        Object obj26 = f4Var.u;
                        b71.a aVar20 = b71.a.r;
                        i19 = f4Var.v;
                        if (i19 != 0) {
                            sy.y.j(obj26);
                            il0.l lVar = ((il0.k) obj).a;
                            String str14 = "";
                            String str15 = lVar != null ? lVar.a : "";
                            String str16 = lVar != null ? lVar.b : "";
                            String str17 = lVar != null ? lVar.c : "";
                            if (lVar != null && (str2 = lVar.d) != null) {
                                str14 = str2;
                            }
                            xz0.h hVar2 = new xz0.h(str15, str16, str17, str14);
                            f4Var.v = 1;
                            if (this.s.c(hVar2, f4Var) == aVar20) {
                                return aVar20;
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj26);
                        }
                        return w61.a0.a;
                    }
                }
                f4Var = new f4(this, cVar);
                Object obj262 = f4Var.u;
                b71.a aVar202 = b71.a.r;
                i19 = f4Var.v;
                if (i19 != 0) {
                }
                return w61.a0.a;
            case 19:
                if (cVar instanceof g4) {
                    g4Var = (g4) cVar;
                    int i55 = g4Var.v;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        g4Var.v = i55 - Integer.MIN_VALUE;
                        Object obj27 = g4Var.u;
                        b71.a aVar21 = b71.a.r;
                        i20 = g4Var.v;
                        if (i20 != 0) {
                            sy.y.j(obj27);
                            td tdVar = ((sd) obj).a;
                            if (tdVar == null || (list4 = tdVar.c.b.a) == null) {
                                r2 = x61.r.r;
                            } else {
                                r2 = new ArrayList();
                                for (oj0.z3 z3Var : list4) {
                                    yz0.e8 a0 = z3Var != null ? k41.b.a0(z3Var.c) : null;
                                    if (a0 != null) {
                                        r2.add(a0);
                                    }
                                }
                            }
                            g4Var.v = 1;
                            if (this.s.c((Object) r2, g4Var) == aVar21) {
                                return aVar21;
                            }
                        } else {
                            if (i20 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj27);
                        }
                        return w61.a0.a;
                    }
                }
                g4Var = new g4(this, cVar);
                Object obj272 = g4Var.u;
                b71.a aVar212 = b71.a.r;
                i20 = g4Var.v;
                if (i20 != 0) {
                }
                return w61.a0.a;
            case 20:
                return b(cVar, obj);
            case 21:
                return d(cVar, obj);
            case 22:
                return e(cVar, obj);
            case 23:
                return f(cVar, obj);
            case 24:
                return g(cVar, obj);
            case 25:
                if (cVar instanceof s4) {
                    s4Var = (s4) cVar;
                    int i56 = s4Var.v;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        s4Var.v = i56 - Integer.MIN_VALUE;
                        Object obj28 = s4Var.u;
                        b71.a aVar22 = b71.a.r;
                        i22 = s4Var.v;
                        if (i22 != 0) {
                            sy.y.j(obj28);
                            pk pkVar = (pk) obj;
                            k71.k.g(pkVar, "<this>");
                            yz0.t2 t2Var = new yz0.t2(new yz0.s2(pkVar.c, pkVar.d), new yz0.s2(pkVar.e, pkVar.f));
                            s4Var.v = 1;
                            if (this.s.c(t2Var, s4Var) == aVar22) {
                                return aVar22;
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj28);
                        }
                        return w61.a0.a;
                    }
                }
                s4Var = new s4(this, cVar);
                Object obj282 = s4Var.u;
                b71.a aVar222 = b71.a.r;
                i22 = s4Var.v;
                if (i22 != 0) {
                }
                return w61.a0.a;
            case 26:
                return h(cVar, obj);
            case 27:
                return i(cVar, obj);
            case 28:
                return j(cVar, obj);
            default:
                if (cVar instanceof y4) {
                    y4Var = (y4) cVar;
                    int i57 = y4Var.v;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        y4Var.v = i57 - Integer.MIN_VALUE;
                        Object obj29 = y4Var.u;
                        b71.a aVar23 = b71.a.r;
                        i23 = y4Var.v;
                        if (i23 != 0) {
                            sy.y.j(obj29);
                            kb kbVar = ((jb) obj).a;
                            String str18 = (kbVar == null || (lbVar = kbVar.a) == null) ? null : lbVar.a;
                            y4Var.v = 1;
                            if (this.s.c(str18, y4Var) == aVar23) {
                                return aVar23;
                            }
                        } else {
                            if (i23 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj29);
                        }
                        return w61.a0.a;
                    }
                }
                y4Var = new y4(this, cVar);
                Object obj292 = y4Var.u;
                b71.a aVar232 = b71.a.r;
                i23 = y4Var.v;
                if (i23 != 0) {
                }
                return w61.a0.a;
        }
    }

    public /* synthetic */ t2(y71.j jVar, c4 c4Var, int i) {
        this.r = i;
        this.s = jVar;
    }
}
