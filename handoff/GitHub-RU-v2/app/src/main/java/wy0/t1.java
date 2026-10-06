package wy0;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.Entry$EntryType;
import com.github.service.models.response.IssueOrPullRequest$ReviewerReviewState;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.Language;
import com.github.service.models.response.SimpleRepository;
import com.github.service.models.response.TimelineItem$TimelineLockedEvent$Reason;
import com.github.service.models.response.home.NavLinkIdentifier;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.type.MergeStateStatus;
import com.github.service.models.response.type.PullRequestMergeMethod;
import com.github.service.models.response.type.PullRequestReviewDecision;
import com.github.service.models.response.type.SubscriptionState;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import jn0.a80;
import jn0.af;
import jn0.af0;
import jn0.bf;
import jn0.c80;
import jn0.cf;
import jn0.d80;
import jn0.eh;
import jn0.g60;
import jn0.gh;
import jn0.gi;
import jn0.h60;
import jn0.hh;
import jn0.hp;
import jn0.hv;
import jn0.i60;
import jn0.ib0;
import jn0.ih;
import jn0.iv;
import jn0.j60;
import jn0.jb0;
import jn0.je0;
import jn0.jv;
import jn0.k60;
import jn0.kb0;
import jn0.ke0;
import jn0.kf;
import jn0.kl;
import jn0.kv;
import jn0.l60;
import jn0.le0;
import jn0.lf;
import jn0.ll;
import jn0.lv;
import jn0.m60;
import jn0.mh;
import jn0.ml;
import jn0.mv;
import jn0.n60;
import jn0.nl;
import jn0.o60;
import jn0.of;
import jn0.ol;
import jn0.p60;
import jn0.pf;
import jn0.pl;
import jn0.q60;
import jn0.qf;
import jn0.ql;
import jn0.r60;
import jn0.rf;
import jn0.ri;
import jn0.rl;
import jn0.sf;
import jn0.ti;
import jn0.ud;
import jn0.ui;
import jn0.ul;
import jn0.ve;
import jn0.vi;
import jn0.we;
import jn0.xe;
import jn0.ye;
import jn0.ze;
import kotlin.NoWhenBranchMatchedException;
import pz0.f40;
import pz0.ig;
import pz0.ot;
import pz0.py;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t1 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ t1(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        p2 p2Var;
        int i;
        h01.q i2;
        ow0.u0 u0Var;
        ow0.u0 u0Var2;
        if (cVar instanceof p2) {
            p2Var = (p2) cVar;
            int i3 = p2Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p2Var.v = i3 - Integer.MIN_VALUE;
                Object obj2 = p2Var.u;
                b71.a aVar = b71.a.r;
                i = p2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    ow0.x0 x0Var = ((ow0.t0) obj).a;
                    ow0.w0 w0Var = null;
                    if (((x0Var == null || (u0Var2 = x0Var.b) == null) ? null : u0Var2.b) != null) {
                        ur0.d0 d0Var = x0Var.b.b.c;
                        String str = d0Var.b;
                        ur0.c0 c0Var = d0Var.c;
                        int i4 = c0Var.b;
                        List F = b31.b.F(c0Var);
                        ur0.b0 b0Var = c0Var.c;
                        i2 = new h01.q(str, i4, F, b0Var.a, b0Var.b, b0Var.c, b0Var.d);
                    } else {
                        if (x0Var != null && (u0Var = x0Var.b) != null) {
                            w0Var = u0Var.c;
                        }
                        i2 = w0Var != null ? b31.b.i(x0Var.b.c.c) : lx0.c.a;
                    }
                    p2Var.v = 1;
                    if (this.s.c(i2, p2Var) == aVar) {
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
        p2Var = new p2(this, cVar);
        Object obj22 = p2Var.u;
        b71.a aVar2 = b71.a.r;
        i = p2Var.v;
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
        v2 v2Var;
        int i;
        if (cVar instanceof v2) {
            v2Var = (v2) cVar;
            int i2 = v2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = v2Var.u;
                b71.a aVar = b71.a.r;
                i = v2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    List g = com.google.android.gms.internal.measurement.z3.g((ow0.q) obj);
                    v2Var.v = 1;
                    if (this.s.c(g, v2Var) == aVar) {
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
        v2Var = new v2(this, cVar);
        Object obj22 = v2Var.u;
        b71.a aVar2 = b71.a.r;
        i = v2Var.v;
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
        y2 y2Var;
        int i;
        Object obj2;
        ow0.u0 u0Var;
        ow0.u0 u0Var2;
        if (cVar instanceof y2) {
            y2Var = (y2) cVar;
            int i2 = y2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y2Var.v = i2 - Integer.MIN_VALUE;
                Object obj3 = y2Var.u;
                b71.a aVar = b71.a.r;
                i = y2Var.v;
                if (i != 0) {
                    sy.y.j(obj3);
                    ow0.x0 x0Var = ((ow0.t0) obj).a;
                    ow0.w0 w0Var = null;
                    if (((x0Var == null || (u0Var2 = x0Var.b) == null) ? null : u0Var2.b) != null) {
                        obj2 = b31.b.F(x0Var.b.b.c.c);
                    } else {
                        if (x0Var != null && (u0Var = x0Var.b) != null) {
                            w0Var = u0Var.c;
                        }
                        obj2 = w0Var != null ? b31.b.i(x0Var.b.c.c).c : x61.r.r;
                    }
                    y2Var.v = 1;
                    if (this.s.c(obj2, y2Var) == aVar) {
                        return aVar;
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
        y2Var = new y2(this, cVar);
        Object obj32 = y2Var.u;
        b71.a aVar2 = b71.a.r;
        i = y2Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:325:0x06b9, code lost:
    
        if (r0 == null) goto L373;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0469 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0477 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x064f A[LOOP:4: B:311:0x064d->B:312:0x064f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x07f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0732  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0132 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0140 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(a71.c cVar, Object obj) {
        z2 z2Var;
        int i;
        z2 z2Var2;
        b71.a aVar;
        yz0.j2 j2Var;
        yz0.j2 j2Var2;
        List list;
        int i2;
        String str;
        boolean z;
        boolean z2;
        SubscriptionState subscriptionState;
        uu0.w3 w3Var;
        SubscriptionState subscriptionState2;
        int ordinal;
        String str2;
        IssueOrPullRequestState issueOrPullRequestState;
        List<uu0.a1> list2;
        boolean z3;
        xt0.r5 r5Var;
        boolean z4;
        boolean z5;
        String str3;
        xt0.u4 u4Var;
        yz0.h2 h2Var;
        int size;
        int i3;
        ot otVar;
        PullRequestReviewDecision pullRequestReviewDecision;
        ArrayList a;
        int i4;
        boolean z6;
        String str4;
        boolean z7;
        String str5;
        yz0.j2 j2Var3;
        xt0.e5 e5Var;
        xt0.l5 l5Var;
        xt0.l5 l5Var2;
        xt0.l5 l5Var3;
        Integer num;
        xt0.k5 k5Var;
        xt0.e5 e5Var2;
        xt0.p4 p4Var;
        int ordinal2;
        IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState;
        SubscriptionState subscriptionState3;
        String str6;
        int i5;
        boolean z8;
        String str7;
        SubscriptionState subscriptionState4;
        String str8;
        SubscriptionState subscriptionState5;
        int ordinal3;
        String str9;
        IssueOrPullRequestState issueOrPullRequestState2;
        boolean z9;
        List<uu0.a> list3;
        boolean z10;
        is0.n nVar;
        boolean z12;
        x61.r rVar;
        is0.k kVar;
        boolean z13;
        x61.r rVar2;
        List list4;
        boolean z14;
        yz0.n2 n2Var;
        List<is0.m> list5;
        SubscriptionState subscriptionState6;
        if (cVar instanceof z2) {
            z2Var = (z2) cVar;
            int i6 = z2Var.v;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                z2Var.v = i6 - Integer.MIN_VALUE;
                Object obj2 = z2Var.u;
                b71.a aVar2 = b71.a.r;
                i = z2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    ow0.l lVar = (ow0.l) obj;
                    ow0.m mVar = lVar.b;
                    if (mVar != null) {
                        String str10 = lVar.a.c;
                        uu0.v3 v3Var = mVar.c;
                        uu0.s3 s3Var = v3Var.c;
                        uu0.z3 z3Var = v3Var.d;
                        uu0.w3 w3Var2 = z3Var.q;
                        String str11 = z3Var.b;
                        String str12 = z3Var.f;
                        py pyVar = z3Var.g;
                        uu0.y3 y3Var = z3Var.e;
                        nv0.b bVar = v3Var.e;
                        nv0.a aVar3 = bVar.e;
                        f40 f40Var = bVar.c;
                        uu0.t3 t3Var = s3Var != null ? s3Var.b : null;
                        uu0.u3 u3Var = s3Var != null ? s3Var.c : null;
                        boolean z15 = false;
                        j2Var = null;
                        x61.r rVar3 = x61.r.r;
                        if (t3Var != null) {
                            bx0.a aVar4 = bx0.b.Companion;
                            SubscriptionState Q = i21.a.Q(f40Var);
                            List list6 = aVar3 != null ? aVar3.a : null;
                            SubscriptionState Q2 = i21.a.Q(t3Var.c.c);
                            uu0.l4 l4Var = t3Var.d;
                            String str13 = l4Var.c;
                            uu0.c cVar2 = t3Var.e;
                            aVar4.getClass();
                            gu0.c cVar3 = l4Var.y;
                            if (pyVar == null) {
                                str6 = str11;
                                i5 = -1;
                            } else {
                                str6 = str11;
                                i5 = nx0.a.a[pyVar.ordinal()];
                            }
                            boolean z16 = i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4;
                            int i7 = pyVar != null ? nx0.a.a[pyVar.ordinal()] : -1;
                            boolean z17 = i7 == 1 || i7 == 2 || i7 == 3;
                            com.github.service.models.response.a aVar5 = new com.github.service.models.response.a(y3Var.c, m7.y.L(y3Var.d), (String) null, false, (String) null, 60);
                            String str14 = y3Var.b;
                            boolean z18 = z3Var.d;
                            SubscriptionState subscriptionState7 = SubscriptionState.IGNORED;
                            if (Q2 == subscriptionState7 || Q == subscriptionState7 || (Q == null && Q2 == null)) {
                                z8 = z16;
                            } else {
                                z8 = z16;
                                SubscriptionState subscriptionState8 = SubscriptionState.UNSUBSCRIBED;
                                if (Q != subscriptionState8 || Q2 != subscriptionState8) {
                                    str7 = str14;
                                    SubscriptionState subscriptionState9 = SubscriptionState.CUSTOM;
                                    if (Q != subscriptionState9 || Q2 != subscriptionState8) {
                                        if (Q != subscriptionState9 || Q2 != subscriptionState9) {
                                            z15 = true;
                                        } else if (list6 != null) {
                                            z15 = list6.contains(pz0.e7.u);
                                        }
                                        subscriptionState4 = SubscriptionState.SUBSCRIBED;
                                        if (Q == subscriptionState4 || Q2 != null) {
                                            str8 = "";
                                            subscriptionState5 = subscriptionState4;
                                        } else {
                                            str8 = "";
                                            subscriptionState5 = null;
                                        }
                                        if (Q2 != subscriptionState7 && Q != subscriptionState4 && Q2 != (subscriptionState6 = SubscriptionState.UNSUBSCRIBED)) {
                                            subscriptionState7 = subscriptionState6;
                                        }
                                        String str15 = l4Var.d;
                                        String str16 = l4Var.e;
                                        int i8 = l4Var.m;
                                        boolean z19 = l4Var.h;
                                        ordinal3 = l4Var.n.ordinal();
                                        if (ordinal3 != 0) {
                                            str9 = str15;
                                            if (ordinal3 == 1) {
                                                issueOrPullRequestState2 = IssueOrPullRequestState.ISSUE_OPEN;
                                            } else {
                                                if (ordinal3 != 2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                issueOrPullRequestState2 = IssueOrPullRequestState.UNKNOWN;
                                            }
                                        } else {
                                            str9 = str15;
                                            issueOrPullRequestState2 = IssueOrPullRequestState.ISSUE_CLOSED;
                                        }
                                        uu0.i4 i4Var = l4Var.i;
                                        IssueOrPullRequestState issueOrPullRequestState3 = issueOrPullRequestState2;
                                        com.github.service.models.response.a aVar6 = new com.github.service.models.response.a(i4Var != null ? i4Var.b : str8, m7.y.L(i4Var != null ? i4Var.c : null), (String) null, false, (String) null, 60);
                                        boolean b = k71.k.b(l4Var.j, Boolean.TRUE);
                                        SubscriptionState subscriptionState10 = subscriptionState7;
                                        kx0.b bVar2 = new kx0.b(l4Var.x, l4Var.l, new yz0.a0(str13));
                                        String str17 = str6;
                                        String str18 = str9;
                                        ArrayList o = m7.y.o(cVar3, str13);
                                        z9 = cVar3.c;
                                        uu0.k4 k4Var = l4Var.o;
                                        kx0.g f = b31.b.f(k4Var != null ? k4Var.c : null);
                                        ArrayList d = k21.f.d(l4Var.A);
                                        List f2 = b91.g.f(l4Var.B);
                                        list3 = cVar2.b.a;
                                        if (list3 == null) {
                                            list3 = rVar3;
                                        }
                                        ArrayList arrayList = new ArrayList();
                                        for (uu0.a aVar7 : list3) {
                                            l01.s k = aVar7 != null ? m71.a.k(aVar7.c) : null;
                                            if (k != null) {
                                                arrayList.add(k);
                                            }
                                        }
                                        z10 = l4Var.g;
                                        String str19 = l4Var.b;
                                        boolean z20 = l4Var.D.b;
                                        int i9 = l4Var.p;
                                        int i10 = l4Var.q;
                                        gt0.a aVar8 = l4Var.z;
                                        boolean z22 = aVar8.b;
                                        boolean z23 = aVar8.c;
                                        is0.o oVar = l4Var.C;
                                        nVar = oVar.a;
                                        if (nVar != null || (list5 = nVar.b) == null) {
                                            z12 = z9;
                                            rVar = null;
                                        } else {
                                            ArrayList arrayList2 = new ArrayList();
                                            for (is0.m mVar2 : list5) {
                                                boolean z24 = z9;
                                                String str20 = mVar2 != null ? mVar2.a : null;
                                                if (str20 != null) {
                                                    arrayList2.add(str20);
                                                }
                                                z9 = z24;
                                            }
                                            z12 = z9;
                                            rVar = arrayList2;
                                        }
                                        if (rVar == null) {
                                            rVar = rVar3;
                                        }
                                        kVar = oVar.b;
                                        if (kVar != null || (list4 = kVar.b) == null) {
                                            z13 = z10;
                                            rVar2 = null;
                                        } else {
                                            ArrayList arrayList3 = new ArrayList();
                                            Iterator it = list4.iterator();
                                            while (it.hasNext()) {
                                                Iterator it2 = it;
                                                is0.l lVar2 = (is0.l) it.next();
                                                if (lVar2 != null) {
                                                    xt0.u1 u1Var = lVar2.c;
                                                    z14 = z10;
                                                    n2Var = bx0.c.d(u1Var, rVar.contains(u1Var.a));
                                                } else {
                                                    z14 = z10;
                                                    n2Var = null;
                                                }
                                                if (n2Var != null) {
                                                    arrayList3.add(n2Var);
                                                }
                                                z10 = z14;
                                                it = it2;
                                            }
                                            z13 = z10;
                                            rVar2 = arrayList3;
                                        }
                                        x61.r rVar4 = rVar2 == null ? rVar3 : rVar2;
                                        boolean z25 = l4Var.r;
                                        PullRequestReviewDecision pullRequestReviewDecision2 = PullRequestReviewDecision.UNKNOWN__;
                                        CloseReason k0 = com.google.android.gms.internal.measurement.b4.k0(l4Var.s);
                                        boolean z26 = l4Var.t;
                                        boolean z27 = l4Var.u;
                                        Boolean bool = l4Var.v;
                                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                                        uu0.j4 j4Var = l4Var.w;
                                        IssueType k2 = j4Var != null ? aa1.b.k(j4Var.c) : null;
                                        uu0.x3 x3Var = z3Var.p;
                                        boolean z28 = (x3Var != null ? x3Var.a : 0) > 0;
                                        uu0.p0 p0Var = l4Var.E.a;
                                        j2Var3 = new yz0.j2(str10, str12, str17, aVar5, str7, z18, z8, str13, z15, subscriptionState5, subscriptionState10, str18, str16, i8, z19, issueOrPullRequestState3, aVar6, b, bVar2, o, z12, f, d, f2, rVar3, arrayList, false, z13, str19, z20, z17, i9, i10, z22, z23, rVar4, z25, z26, z27, w3Var2 != null ? w3Var2.a : null, false, null, null, false, false, null, null, null, null, rVar3, rVar3, false, pullRequestReviewDecision2, null, null, 0, false, false, false, null, null, false, false, false, k0, booleanValue, k2, z28, p0Var != null ? b41.b.l(p0Var) : null, null, false, 1073742080);
                                        z2Var2 = z2Var;
                                        aVar = aVar2;
                                    }
                                    subscriptionState4 = SubscriptionState.SUBSCRIBED;
                                    if (Q == subscriptionState4) {
                                    }
                                    str8 = "";
                                    subscriptionState5 = subscriptionState4;
                                    if (Q2 != subscriptionState7) {
                                        subscriptionState7 = subscriptionState6;
                                    }
                                    String str152 = l4Var.d;
                                    String str162 = l4Var.e;
                                    int i82 = l4Var.m;
                                    boolean z192 = l4Var.h;
                                    ordinal3 = l4Var.n.ordinal();
                                    if (ordinal3 != 0) {
                                    }
                                    uu0.i4 i4Var2 = l4Var.i;
                                    IssueOrPullRequestState issueOrPullRequestState32 = issueOrPullRequestState2;
                                    com.github.service.models.response.a aVar62 = new com.github.service.models.response.a(i4Var2 != null ? i4Var2.b : str8, m7.y.L(i4Var2 != null ? i4Var2.c : null), (String) null, false, (String) null, 60);
                                    boolean b2 = k71.k.b(l4Var.j, Boolean.TRUE);
                                    SubscriptionState subscriptionState102 = subscriptionState7;
                                    kx0.b bVar22 = new kx0.b(l4Var.x, l4Var.l, new yz0.a0(str13));
                                    String str172 = str6;
                                    String str182 = str9;
                                    ArrayList o2 = m7.y.o(cVar3, str13);
                                    z9 = cVar3.c;
                                    uu0.k4 k4Var2 = l4Var.o;
                                    kx0.g f3 = b31.b.f(k4Var2 != null ? k4Var2.c : null);
                                    ArrayList d2 = k21.f.d(l4Var.A);
                                    List f22 = b91.g.f(l4Var.B);
                                    list3 = cVar2.b.a;
                                    if (list3 == null) {
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    while (r8.hasNext()) {
                                    }
                                    z10 = l4Var.g;
                                    String str192 = l4Var.b;
                                    boolean z202 = l4Var.D.b;
                                    int i92 = l4Var.p;
                                    int i102 = l4Var.q;
                                    gt0.a aVar82 = l4Var.z;
                                    boolean z222 = aVar82.b;
                                    boolean z232 = aVar82.c;
                                    is0.o oVar2 = l4Var.C;
                                    nVar = oVar2.a;
                                    if (nVar != null) {
                                    }
                                    z12 = z9;
                                    rVar = null;
                                    if (rVar == null) {
                                    }
                                    kVar = oVar2.b;
                                    if (kVar != null) {
                                    }
                                    z13 = z10;
                                    rVar2 = null;
                                    if (rVar2 == null) {
                                    }
                                    boolean z252 = l4Var.r;
                                    PullRequestReviewDecision pullRequestReviewDecision22 = PullRequestReviewDecision.UNKNOWN__;
                                    CloseReason k02 = com.google.android.gms.internal.measurement.b4.k0(l4Var.s);
                                    boolean z262 = l4Var.t;
                                    boolean z272 = l4Var.u;
                                    Boolean bool2 = l4Var.v;
                                    if (bool2 != null) {
                                    }
                                    uu0.j4 j4Var2 = l4Var.w;
                                    if (j4Var2 != null) {
                                    }
                                    uu0.x3 x3Var2 = z3Var.p;
                                    if ((x3Var2 != null ? x3Var2.a : 0) > 0) {
                                    }
                                    uu0.p0 p0Var2 = l4Var.E.a;
                                    j2Var3 = new yz0.j2(str10, str12, str172, aVar5, str7, z18, z8, str13, z15, subscriptionState5, subscriptionState102, str182, str162, i82, z192, issueOrPullRequestState32, aVar62, b2, bVar22, o2, z12, f3, d2, f22, rVar3, arrayList4, false, z13, str192, z202, z17, i92, i102, z222, z232, rVar4, z252, z262, z272, w3Var2 != null ? w3Var2.a : null, false, null, null, false, false, null, null, null, null, rVar3, rVar3, false, pullRequestReviewDecision22, null, null, 0, false, false, false, null, null, false, false, false, k02, booleanValue, k2, z28, p0Var2 != null ? b41.b.l(p0Var2) : null, null, false, 1073742080);
                                    z2Var2 = z2Var;
                                    aVar = aVar2;
                                }
                            }
                            str7 = str14;
                            subscriptionState4 = SubscriptionState.SUBSCRIBED;
                            if (Q == subscriptionState4) {
                            }
                            str8 = "";
                            subscriptionState5 = subscriptionState4;
                            if (Q2 != subscriptionState7) {
                            }
                            String str1522 = l4Var.d;
                            String str1622 = l4Var.e;
                            int i822 = l4Var.m;
                            boolean z1922 = l4Var.h;
                            ordinal3 = l4Var.n.ordinal();
                            if (ordinal3 != 0) {
                            }
                            uu0.i4 i4Var22 = l4Var.i;
                            IssueOrPullRequestState issueOrPullRequestState322 = issueOrPullRequestState2;
                            com.github.service.models.response.a aVar622 = new com.github.service.models.response.a(i4Var22 != null ? i4Var22.b : str8, m7.y.L(i4Var22 != null ? i4Var22.c : null), (String) null, false, (String) null, 60);
                            boolean b22 = k71.k.b(l4Var.j, Boolean.TRUE);
                            SubscriptionState subscriptionState1022 = subscriptionState7;
                            kx0.b bVar222 = new kx0.b(l4Var.x, l4Var.l, new yz0.a0(str13));
                            String str1722 = str6;
                            String str1822 = str9;
                            ArrayList o22 = m7.y.o(cVar3, str13);
                            z9 = cVar3.c;
                            uu0.k4 k4Var22 = l4Var.o;
                            kx0.g f32 = b31.b.f(k4Var22 != null ? k4Var22.c : null);
                            ArrayList d22 = k21.f.d(l4Var.A);
                            List f222 = b91.g.f(l4Var.B);
                            list3 = cVar2.b.a;
                            if (list3 == null) {
                            }
                            ArrayList arrayList42 = new ArrayList();
                            while (r8.hasNext()) {
                            }
                            z10 = l4Var.g;
                            String str1922 = l4Var.b;
                            boolean z2022 = l4Var.D.b;
                            int i922 = l4Var.p;
                            int i1022 = l4Var.q;
                            gt0.a aVar822 = l4Var.z;
                            boolean z2222 = aVar822.b;
                            boolean z2322 = aVar822.c;
                            is0.o oVar22 = l4Var.C;
                            nVar = oVar22.a;
                            if (nVar != null) {
                            }
                            z12 = z9;
                            rVar = null;
                            if (rVar == null) {
                            }
                            kVar = oVar22.b;
                            if (kVar != null) {
                            }
                            z13 = z10;
                            rVar2 = null;
                            if (rVar2 == null) {
                            }
                            boolean z2522 = l4Var.r;
                            PullRequestReviewDecision pullRequestReviewDecision222 = PullRequestReviewDecision.UNKNOWN__;
                            CloseReason k022 = com.google.android.gms.internal.measurement.b4.k0(l4Var.s);
                            boolean z2622 = l4Var.t;
                            boolean z2722 = l4Var.u;
                            Boolean bool22 = l4Var.v;
                            if (bool22 != null) {
                            }
                            uu0.j4 j4Var22 = l4Var.w;
                            if (j4Var22 != null) {
                            }
                            uu0.x3 x3Var22 = z3Var.p;
                            if ((x3Var22 != null ? x3Var22.a : 0) > 0) {
                            }
                            uu0.p0 p0Var22 = l4Var.E.a;
                            j2Var3 = new yz0.j2(str10, str12, str1722, aVar5, str7, z18, z8, str13, z15, subscriptionState5, subscriptionState1022, str1822, str1622, i822, z1922, issueOrPullRequestState322, aVar622, b22, bVar222, o22, z12, f32, d22, f222, rVar3, arrayList42, false, z13, str1922, z2022, z17, i922, i1022, z2222, z2322, rVar4, z2522, z2622, z2722, w3Var2 != null ? w3Var2.a : null, false, null, null, false, false, null, null, null, null, rVar3, rVar3, false, pullRequestReviewDecision222, null, null, 0, false, false, false, null, null, false, false, false, k022, booleanValue, k2, z28, p0Var22 != null ? b41.b.l(p0Var22) : null, null, false, 1073742080);
                            z2Var2 = z2Var;
                            aVar = aVar2;
                        } else if (u3Var != null) {
                            bx0.a aVar9 = bx0.b.Companion;
                            SubscriptionState Q3 = i21.a.Q(f40Var);
                            SubscriptionState Q4 = i21.a.Q(u3Var.c.c);
                            List list7 = aVar3 != null ? aVar3.a : null;
                            xt0.u5 u5Var = u3Var.d;
                            String str21 = u5Var.b;
                            String str22 = u5Var.c;
                            uu0.c1 c1Var = u3Var.e;
                            aVar9.getClass();
                            xt0.u4 u4Var2 = u5Var.K;
                            xt0.v4 v4Var = u5Var.J;
                            xt0.n5 n5Var = u5Var.I;
                            aVar = aVar2;
                            xt0.s4 s4Var = u5Var.F;
                            gu0.c cVar4 = u5Var.V;
                            z2Var2 = z2Var;
                            xt0.m4 m4Var = u5Var.D;
                            bw0.a aVar10 = u5Var.a0;
                            xt0.q4 q4Var = u5Var.N;
                            List list8 = q4Var.c;
                            if (pyVar == null) {
                                list = list8;
                                i2 = -1;
                            } else {
                                list = list8;
                                i2 = nx0.a.a[pyVar.ordinal()];
                            }
                            boolean z29 = i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
                            int i12 = pyVar == null ? -1 : nx0.a.a[pyVar.ordinal()];
                            boolean z30 = z29;
                            boolean z32 = i12 == 1 || i12 == 2 || i12 == 3;
                            int i13 = pyVar == null ? -1 : nx0.a.a[pyVar.ordinal()];
                            boolean z33 = i13 == 1 || i13 == 2 || i13 == 3;
                            com.github.service.models.response.a aVar11 = new com.github.service.models.response.a(y3Var.c, m7.y.L(y3Var.d), (String) null, false, (String) null, 60);
                            String str23 = y3Var.b;
                            boolean z34 = z3Var.d;
                            SubscriptionState subscriptionState11 = SubscriptionState.IGNORED;
                            if (Q4 == subscriptionState11 || Q3 == subscriptionState11 || (Q3 == null && Q4 == null)) {
                                str = str23;
                            } else {
                                str = str23;
                                SubscriptionState subscriptionState12 = SubscriptionState.UNSUBSCRIBED;
                                if (Q3 != subscriptionState12 || Q4 != subscriptionState12) {
                                    z = z34;
                                    SubscriptionState subscriptionState13 = SubscriptionState.CUSTOM;
                                    if (Q3 != subscriptionState13 || Q4 != subscriptionState12) {
                                        if (Q3 != subscriptionState13 || Q4 != subscriptionState13) {
                                            z2 = true;
                                        } else if (list7 != null) {
                                            z2 = list7.contains(pz0.e7.v);
                                        }
                                        subscriptionState = SubscriptionState.SUBSCRIBED;
                                        if (Q3 == subscriptionState || Q4 != null) {
                                            w3Var = w3Var2;
                                            subscriptionState2 = subscriptionState;
                                        } else {
                                            w3Var = w3Var2;
                                            subscriptionState2 = null;
                                        }
                                        if (Q4 != subscriptionState11 && Q3 != subscriptionState && Q4 != (subscriptionState3 = SubscriptionState.UNSUBSCRIBED)) {
                                            subscriptionState11 = subscriptionState3;
                                        }
                                        String str24 = u5Var.g;
                                        String str25 = u5Var.h;
                                        int i14 = u5Var.q;
                                        boolean z35 = u5Var.m;
                                        ordinal = u5Var.r.ordinal();
                                        if (ordinal != 0) {
                                            str2 = str25;
                                            if (ordinal == 1) {
                                                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
                                            } else if (ordinal == 2) {
                                                issueOrPullRequestState = u5Var.B ? IssueOrPullRequestState.PULL_REQUEST_DRAFT : IssueOrPullRequestState.PULL_REQUEST_OPEN;
                                            } else {
                                                if (ordinal != 3) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
                                            }
                                        } else {
                                            str2 = str25;
                                            issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
                                        }
                                        xt0.l4 l4Var2 = u5Var.n;
                                        IssueOrPullRequestState issueOrPullRequestState4 = issueOrPullRequestState;
                                        com.github.service.models.response.a aVar12 = new com.github.service.models.response.a(l4Var2 != null ? l4Var2.b : "", m7.y.L(l4Var2 != null ? l4Var2.c : null), (String) null, false, (String) null, 60);
                                        boolean b3 = k71.k.b(u5Var.o, Boolean.TRUE);
                                        kx0.b bVar3 = new kx0.b(u5Var.U, str21, new yz0.b0(str22));
                                        ArrayList o3 = m7.y.o(cVar4, str22);
                                        boolean z36 = cVar4.c;
                                        xt0.a5 a5Var = u5Var.H;
                                        kx0.g f4 = b31.b.f(a5Var != null ? a5Var.c : null);
                                        ArrayList d3 = k21.f.d(u5Var.X);
                                        List f5 = b91.g.f(u5Var.Y);
                                        list2 = c1Var.b.a;
                                        if (list2 == null) {
                                            list2 = rVar3;
                                        }
                                        ArrayList arrayList5 = new ArrayList();
                                        for (uu0.a1 a1Var : list2) {
                                            kx0.b bVar4 = bVar3;
                                            l01.s k3 = a1Var != null ? m71.a.k(a1Var.c) : null;
                                            if (k3 != null) {
                                                arrayList5.add(k3Shadow);
                                            }
                                            bVar3 = bVar4;
                                        }
                                        kx0.b bVar5 = bVar3;
                                        boolean z37 = u5Var.j;
                                        boolean z38 = u5Var.k;
                                        z3 = aVar10.b;
                                        gt0.a aVar13 = u5Var.W;
                                        boolean z39 = aVar13.b;
                                        boolean z40 = aVar13.c;
                                        List c = bx0.c.c(u5Var.Z);
                                        boolean z42 = u5Var.P;
                                        boolean z43 = u5Var.B;
                                        int i15 = u5Var.s;
                                        int i16 = u5Var.t;
                                        int i17 = u5Var.u;
                                        boolean z44 = u5Var.b0.b != null;
                                        r5Var = u5Var.O;
                                        if (r5Var != null) {
                                            if (list != null) {
                                                z4 = z39;
                                                xt0.e5 e5Var3 = (xt0.e5) x61.m.f0(list);
                                                if (e5Var3 != null) {
                                                    p4Var = e5Var3.b;
                                                    z5 = z38;
                                                    str3 = str22;
                                                    ordinal2 = r5Var.a.ordinal();
                                                    if (ordinal2 == 0) {
                                                        u4Var = u4Var2;
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
                                                        u4Var = u4Var2;
                                                        issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.APPROVED;
                                                    }
                                                    ZonedDateTime zonedDateTime = r5Var.b;
                                                    h2Var = new yz0.h2(issueOrPullRequest$ReviewerReviewState, zonedDateTime, p4Var == null && p4Var.b.isAfter(zonedDateTime));
                                                }
                                            } else {
                                                z4 = z39;
                                            }
                                            p4Var = null;
                                            z5 = z38;
                                            str3 = str22;
                                            ordinal2 = r5Var.a.ordinal();
                                            if (ordinal2 == 0) {
                                            }
                                            ZonedDateTime zonedDateTime2 = r5Var.b;
                                            h2Var = new yz0.h2(issueOrPullRequest$ReviewerReviewState, zonedDateTime2, p4Var == null && p4Var.b.isAfter(zonedDateTime2));
                                        } else {
                                            z4 = z39;
                                            z5 = z38;
                                            str3 = str22;
                                            u4Var = u4Var2;
                                            h2Var = null;
                                        }
                                        yz0.a2 a2Var = new yz0.a2(i15, i16, i17, z44, h2Var);
                                        yz0.z1 z1Var = (list != null || (e5Var2 = (xt0.e5) x61.m.f0(list)) == null) ? null : new yz0.z1(q4Var.b, e5Var2.b.b);
                                        String str26 = s4Var != null ? s4Var.a : null;
                                        yz0.c2 c2Var = new yz0.c2(u5Var.E, u5Var.G);
                                        xt0.u4 u4Var3 = u4Var;
                                        ArrayList a2 = bx0.a.a(n5Var, v4Var, u4Var3);
                                        ArrayList S = x61.m.S(u5Var.L);
                                        ArrayList arrayList6 = new ArrayList(x61.n.F(S, 10));
                                        size = S.size();
                                        i3 = 0;
                                        while (i3 < size) {
                                            Object obj3 = S.get(i3);
                                            int i18 = i3 + 1;
                                            xt0.q5 q5Var = (xt0.q5) obj3;
                                            ArrayList arrayList7 = S;
                                            boolean z45 = q5Var.a;
                                            boolean z46 = q5Var.b;
                                            xt0.j5 j5Var = q5Var.c.c;
                                            arrayList6.add(new yz0.g2(z45, z46, j5Var.b, yz0.f2.d, new com.github.service.models.response.a(j5Var.c, m7.y.L(j5Var.d), (String) null, false, (String) null, 60)));
                                            i3 = i18;
                                            S = arrayList7;
                                        }
                                        otVar = u5Var.A;
                                        if (otVar != null) {
                                            int ordinal4 = otVar.ordinal();
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
                                        xt0.w4 w4Var = u5Var.x;
                                        xt0.b bVar6 = u5Var.c0;
                                        PullRequestReviewDecision pullRequestReviewDecision3 = pullRequestReviewDecision;
                                        MergeStateStatus P = v8.l0.P(u5Var.v);
                                        ArrayList K = x61.l.K(new PullRequestMergeMethod[]{z3Var.j ? PullRequestMergeMethod.MERGE : null, z3Var.h ? PullRequestMergeMethod.SQUASH : null, z3Var.i ? PullRequestMergeMethod.REBASE : null});
                                        boolean z47 = !((s4Var != null || (k5Var = s4Var.b) == null) ? true : k5Var.a);
                                        PullRequestMergeMethod V = aa1.b.V(z3Var.l);
                                        String str27 = z3Var.k;
                                        List list9 = z3Var.m;
                                        xt0.a aVar14 = bVar6.d;
                                        yz0.i iVar = aVar14 != null ? new yz0.i(aa1.b.V(aVar14.a)) : null;
                                        boolean z48 = bVar6.c;
                                        boolean z49 = bVar6.b;
                                        boolean z50 = u5Var.Q;
                                        xt0.z4 z4Var = u5Var.w;
                                        String str28 = z4Var != null ? z4Var.b : null;
                                        String str29 = w4Var != null ? w4Var.a : null;
                                        ZonedDateTime zonedDateTime3 = w4Var != null ? w4Var.b : null;
                                        xt0.y4 y4Var = u5Var.z;
                                        i01.b v0 = y4Var != null ? com.google.android.gms.internal.measurement.i4.v0(y4Var.c) : null;
                                        xt0.x4 x4Var = u5Var.y;
                                        h01.h hVar = new h01.h(P, K, z47, V, str27, list9, iVar, z48, z49, z50, str28, str29, zonedDateTime3, v0, x4Var != null ? com.google.android.gms.internal.measurement.d5.c0(x4Var.c) : null);
                                        lx0.b bVar7 = new lx0.b(u5Var);
                                        a = bx0.a.a(n5Var, v4Var, u4Var3);
                                        int intValue = (m4Var != null || (l5Var3 = m4Var.a) == null || (num = l5Var3.a) == null) ? 0 : num.intValue();
                                        boolean z52 = (m4Var != null || (l5Var2 = m4Var.a) == null) ? false : l5Var2.b;
                                        if (a.isEmpty()) {
                                            i4 = 0;
                                        } else {
                                            int size2 = a.size();
                                            i4 = 0;
                                            int i19 = 0;
                                            while (i19 < size2) {
                                                Object obj4 = a.get(i19);
                                                i19++;
                                                yz0.e2 e2Var = (yz0.e2) obj4;
                                                lx0.b bVar8 = bVar7;
                                                IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState2 = e2Var.b;
                                                ArrayList arrayList8 = a;
                                                boolean z53 = e2Var.c;
                                                IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState3 = IssueOrPullRequest$ReviewerReviewState.APPROVED;
                                                if (issueOrPullRequest$ReviewerReviewState2 != issueOrPullRequest$ReviewerReviewState3 || !z53) {
                                                    yz0.d2 d2Var = e2Var.g;
                                                    if ((d2Var != null ? d2Var.c : null) != issueOrPullRequest$ReviewerReviewState3) {
                                                        continue;
                                                    } else if (!z53) {
                                                        continue;
                                                    }
                                                    bVar7 = bVar8;
                                                    a = arrayList8;
                                                }
                                                i4++;
                                                if (i4 < 0) {
                                                    sy.d0.w();
                                                    throw null;
                                                }
                                                bVar7 = bVar8;
                                                a = arrayList8;
                                            }
                                        }
                                        lx0.b bVar9 = bVar7;
                                        int i20 = intValue > 0 ? z52 ? (i4 * 100) / (intValue + i4) : (i4 * 100) / intValue : 0;
                                        boolean z54 = !((m4Var != null || (l5Var = m4Var.a) == null) ? z30 : l5Var.c) && z3;
                                        boolean z55 = z3Var.n;
                                        if (z3) {
                                            int i22 = pyVar != null ? nx0.a.a[pyVar.ordinal()] : -1;
                                            if (i22 == 1 || i22 == 2 || i22 == 3) {
                                                z6 = true;
                                                String str30 = (list != null || (e5Var = (xt0.e5) x61.m.W(list)) == null) ? null : e5Var.b.a;
                                                String str31 = u5Var.d;
                                                boolean z56 = z3Var.o;
                                                boolean z57 = u5Var.R;
                                                boolean z58 = u5Var.S;
                                                xt0.n4 n4Var = u5Var.f;
                                                String str32 = n4Var == null ? n4Var.b : null;
                                                xt0.t4 t4Var = u5Var.e;
                                                String str33 = t4Var == null ? t4Var.b : null;
                                                boolean z59 = u5Var.l;
                                                boolean z60 = u5Var.T;
                                                if (w3Var == null) {
                                                    str4 = str24;
                                                    z7 = z37;
                                                    str5 = w3Var.a;
                                                } else {
                                                    str4 = str24;
                                                    z7 = z37;
                                                    str5 = null;
                                                }
                                                j2Var3 = new yz0.j2(str10, str12, str11, aVar11, str, z, z30, str3, z2, subscriptionState2, subscriptionState11, str4, str2, i14, z35, issueOrPullRequestState4, aVar12, b3, bVar5, o3, z36, f4, d3, f5, rVar3, arrayList5, z7, z5, str21, z3, z33, 0, 0, z4, z40, c, z42, z57, z58, str5, false, str32, str33, z32, z43, a2Var, z1Var, str26, c2Var, a2, arrayList6, true, pullRequestReviewDecision3, hVar, bVar9, i20, z54, z55, z6, str30, str31, z56, z59, z60, null, false, null, false, null, null, false, 1073742080);
                                            }
                                        }
                                        z6 = false;
                                        if (list != null) {
                                        }
                                        String str312 = u5Var.d;
                                        boolean z562 = z3Var.o;
                                        boolean z572 = u5Var.R;
                                        boolean z582 = u5Var.S;
                                        xt0.n4 n4Var2 = u5Var.f;
                                        if (n4Var2 == null) {
                                        }
                                        xt0.t4 t4Var2 = u5Var.e;
                                        if (t4Var2 == null) {
                                        }
                                        boolean z592 = u5Var.l;
                                        boolean z602 = u5Var.T;
                                        if (w3Var == null) {
                                        }
                                        j2Var3 = new yz0.j2(str10, str12, str11, aVar11, str, z, z30, str3, z2, subscriptionState2, subscriptionState11, str4, str2, i14, z35, issueOrPullRequestState4, aVar12, b3, bVar5, o3, z36, f4, d3, f5, rVar3, arrayList5, z7, z5, str21, z3, z33, 0, 0, z4, z40, c, z42, z572, z582, str5, false, str32, str33, z32, z43, a2Var, z1Var, str26, c2Var, a2, arrayList6, true, pullRequestReviewDecision3, hVar, bVar9, i20, z54, z55, z6, str30, str312, z562, z592, z602, null, false, null, false, null, null, false, 1073742080);
                                    }
                                    z2 = false;
                                    subscriptionState = SubscriptionState.SUBSCRIBED;
                                    if (Q3 == subscriptionState) {
                                    }
                                    w3Var = w3Var2;
                                    subscriptionState2 = subscriptionState;
                                    if (Q4 != subscriptionState11) {
                                        subscriptionState11 = subscriptionState3;
                                    }
                                    String str242 = u5Var.g;
                                    String str252 = u5Var.h;
                                    int i142 = u5Var.q;
                                    boolean z352 = u5Var.m;
                                    ordinal = u5Var.r.ordinal();
                                    if (ordinal != 0) {
                                    }
                                    xt0.l4 l4Var22 = u5Var.n;
                                    IssueOrPullRequestState issueOrPullRequestState42 = issueOrPullRequestState;
                                    com.github.service.models.response.a aVar122 = new com.github.service.models.response.a(l4Var22 != null ? l4Var22.b : "", m7.y.L(l4Var22 != null ? l4Var22.c : null), (String) null, false, (String) null, 60);
                                    boolean b32 = k71.k.b(u5Var.o, Boolean.TRUE);
                                    kx0.b bVar32 = new kx0.b(u5Var.U, str21, new yz0.b0(str22));
                                    ArrayList o32 = m7.y.o(cVar4, str22);
                                    boolean z362 = cVar4.c;
                                    xt0.a5 a5Var2 = u5Var.H;
                                    kx0.g f42 = b31.b.f(a5Var2 != null ? a5Var2.c : null);
                                    ArrayList d32 = k21.f.d(u5Var.X);
                                    List f52 = b91.g.f(u5Var.Y);
                                    list2 = c1Var.b.a;
                                    if (list2 == null) {
                                    }
                                    ArrayList arrayList52 = new ArrayList();
                                    while (r4.hasNext()) {
                                    }
                                    kx0.b bVar52 = bVar32;
                                    boolean z372 = u5Var.j;
                                    boolean z382 = u5Var.k;
                                    z3 = aVar10.b;
                                    gt0.a aVar132 = u5Var.W;
                                    boolean z392 = aVar132.b;
                                    boolean z402 = aVar132.c;
                                    List c2 = bx0.c.c(u5Var.Z);
                                    boolean z422 = u5Var.P;
                                    boolean z432 = u5Var.B;
                                    int i152 = u5Var.s;
                                    int i162 = u5Var.t;
                                    int i172 = u5Var.u;
                                    if (u5Var.b0.b != null) {
                                    }
                                    r5Var = u5Var.O;
                                    if (r5Var != null) {
                                    }
                                    yz0.a2 a2Var2 = new yz0.a2(i152, i162, i172, z44, h2Var);
                                    if (list != null) {
                                    }
                                    if (s4Var != null) {
                                    }
                                    yz0.c2 c2Var2 = new yz0.c2(u5Var.E, u5Var.G);
                                    xt0.u4 u4Var32 = u4Var;
                                    ArrayList a22 = bx0.a.a(n5Var, v4Var, u4Var32);
                                    ArrayList S2 = x61.m.S(u5Var.L);
                                    ArrayList arrayList62 = new ArrayList(x61.n.F(S2, 10));
                                    size = S2.size();
                                    i3 = 0;
                                    while (i3 < size) {
                                    }
                                    otVar = u5Var.A;
                                    if (otVar != null) {
                                    }
                                    pullRequestReviewDecision = PullRequestReviewDecision.UNKNOWN__;
                                    xt0.w4 w4Var2 = u5Var.x;
                                    xt0.b bVar62 = u5Var.c0;
                                    PullRequestReviewDecision pullRequestReviewDecision32 = pullRequestReviewDecision;
                                    MergeStateStatus P2 = v8.l0.P(u5Var.v);
                                    ArrayList K2 = x61.l.K(new PullRequestMergeMethod[]{z3Var.j ? PullRequestMergeMethod.MERGE : null, z3Var.h ? PullRequestMergeMethod.SQUASH : null, z3Var.i ? PullRequestMergeMethod.REBASE : null});
                                    boolean z472 = !((s4Var != null || (k5Var = s4Var.b) == null) ? true : k5Var.a);
                                    PullRequestMergeMethod V2 = aa1.b.V(z3Var.l);
                                    String str272 = z3Var.k;
                                    List list92 = z3Var.m;
                                    xt0.a aVar142 = bVar62.d;
                                    if (aVar142 != null) {
                                    }
                                    boolean z482 = bVar62.c;
                                    boolean z492 = bVar62.b;
                                    boolean z502 = u5Var.Q;
                                    xt0.z4 z4Var2 = u5Var.w;
                                    if (z4Var2 != null) {
                                    }
                                    if (w4Var2 != null) {
                                    }
                                    if (w4Var2 != null) {
                                    }
                                    xt0.y4 y4Var2 = u5Var.z;
                                    if (y4Var2 != null) {
                                    }
                                    xt0.x4 x4Var2 = u5Var.y;
                                    h01.h hVar2 = new h01.h(P2, K2, z472, V2, str272, list92, iVar, z482, z492, z502, str28, str29, zonedDateTime3, v0, x4Var2 != null ? com.google.android.gms.internal.measurement.d5.c0(x4Var2.c) : null);
                                    lx0.b bVar72 = new lx0.b(u5Var);
                                    a = bx0.a.a(n5Var, v4Var, u4Var32);
                                    if (m4Var != null) {
                                    }
                                    if (m4Var != null) {
                                    }
                                    if (a.isEmpty()) {
                                    }
                                    lx0.b bVar92 = bVar72;
                                    if (intValue > 0) {
                                    }
                                    if ((m4Var != null || (l5Var = m4Var.a) == null) ? z30 : l5Var.c) {
                                    }
                                    boolean z552 = z3Var.n;
                                    if (z3) {
                                    }
                                    z6 = false;
                                    if (list != null) {
                                    }
                                    String str3122 = u5Var.d;
                                    boolean z5622 = z3Var.o;
                                    boolean z5722 = u5Var.R;
                                    boolean z5822 = u5Var.S;
                                    xt0.n4 n4Var22 = u5Var.f;
                                    if (n4Var22 == null) {
                                    }
                                    xt0.t4 t4Var22 = u5Var.e;
                                    if (t4Var22 == null) {
                                    }
                                    boolean z5922 = u5Var.l;
                                    boolean z6022 = u5Var.T;
                                    if (w3Var == null) {
                                    }
                                    j2Var3 = new yz0.j2(str10, str12, str11, aVar11, str, z, z30, str3, z2, subscriptionState2, subscriptionState11, str4, str2, i142, z352, issueOrPullRequestState42, aVar122, b32, bVar52, o32, z362, f42, d32, f52, rVar3, arrayList52, z7, z5, str21, z3, z33, 0, 0, z4, z402, c2, z422, z5722, z5822, str5, false, str32, str33, z32, z432, a2Var2, z1Var, str26, c2Var2, a22, arrayList62, true, pullRequestReviewDecision32, hVar2, bVar92, i20, z54, z552, z6, str30, str3122, z5622, z5922, z6022, null, false, null, false, null, null, false, 1073742080);
                                }
                            }
                            z = z34;
                            z2 = false;
                            subscriptionState = SubscriptionState.SUBSCRIBED;
                            if (Q3 == subscriptionState) {
                            }
                            w3Var = w3Var2;
                            subscriptionState2 = subscriptionState;
                            if (Q4 != subscriptionState11) {
                            }
                            String str2422 = u5Var.g;
                            String str2522 = u5Var.h;
                            int i1422 = u5Var.q;
                            boolean z3522 = u5Var.m;
                            ordinal = u5Var.r.ordinal();
                            if (ordinal != 0) {
                            }
                            xt0.l4 l4Var222 = u5Var.n;
                            IssueOrPullRequestState issueOrPullRequestState422 = issueOrPullRequestState;
                            com.github.service.models.response.a aVar1222 = new com.github.service.models.response.a(l4Var222 != null ? l4Var222.b : "", m7.y.L(l4Var222 != null ? l4Var222.c : null), (String) null, false, (String) null, 60);
                            boolean b322 = k71.k.b(u5Var.o, Boolean.TRUE);
                            kx0.b bVar322 = new kx0.b(u5Var.U, str21, new yz0.b0(str22));
                            ArrayList o322 = m7.y.o(cVar4, str22);
                            boolean z3622 = cVar4.c;
                            xt0.a5 a5Var22 = u5Var.H;
                            kx0.g f422 = b31.b.f(a5Var22 != null ? a5Var22.c : null);
                            ArrayList d322 = k21.f.d(u5Var.X);
                            List f522 = b91.g.f(u5Var.Y);
                            list2 = c1Var.b.a;
                            if (list2 == null) {
                            }
                            ArrayList arrayList522 = new ArrayList();
                            while (r4.hasNext()) {
                            }
                            kx0.b bVar522 = bVar322;
                            boolean z3722 = u5Var.j;
                            boolean z3822 = u5Var.k;
                            z3 = aVar10.b;
                            gt0.a aVar1322 = u5Var.W;
                            boolean z3922 = aVar1322.b;
                            boolean z4022 = aVar1322.c;
                            List c22 = bx0.c.c(u5Var.Z);
                            boolean z4222 = u5Var.P;
                            boolean z4322 = u5Var.B;
                            int i1522 = u5Var.s;
                            int i1622 = u5Var.t;
                            int i1722 = u5Var.u;
                            if (u5Var.b0.b != null) {
                            }
                            r5Var = u5Var.O;
                            if (r5Var != null) {
                            }
                            yz0.a2 a2Var22 = new yz0.a2(i1522, i1622, i1722, z44, h2Var);
                            if (list != null) {
                            }
                            if (s4Var != null) {
                            }
                            yz0.c2 c2Var22 = new yz0.c2(u5Var.E, u5Var.G);
                            xt0.u4 u4Var322 = u4Var;
                            ArrayList a222 = bx0.a.a(n5Var, v4Var, u4Var322);
                            ArrayList S22 = x61.m.S(u5Var.L);
                            ArrayList arrayList622 = new ArrayList(x61.n.F(S22, 10));
                            size = S22.size();
                            i3 = 0;
                            while (i3 < size) {
                            }
                            otVar = u5Var.A;
                            if (otVar != null) {
                            }
                            pullRequestReviewDecision = PullRequestReviewDecision.UNKNOWN__;
                            xt0.w4 w4Var22 = u5Var.x;
                            xt0.b bVar622 = u5Var.c0;
                            PullRequestReviewDecision pullRequestReviewDecision322 = pullRequestReviewDecision;
                            MergeStateStatus P22 = v8.l0.P(u5Var.v);
                            ArrayList K22 = x61.l.K(new PullRequestMergeMethod[]{z3Var.j ? PullRequestMergeMethod.MERGE : null, z3Var.h ? PullRequestMergeMethod.SQUASH : null, z3Var.i ? PullRequestMergeMethod.REBASE : null});
                            boolean z4722 = !((s4Var != null || (k5Var = s4Var.b) == null) ? true : k5Var.a);
                            PullRequestMergeMethod V22 = aa1.b.V(z3Var.l);
                            String str2722 = z3Var.k;
                            List list922 = z3Var.m;
                            xt0.a aVar1422 = bVar622.d;
                            if (aVar1422 != null) {
                            }
                            boolean z4822 = bVar622.c;
                            boolean z4922 = bVar622.b;
                            boolean z5022 = u5Var.Q;
                            xt0.z4 z4Var22 = u5Var.w;
                            if (z4Var22 != null) {
                            }
                            if (w4Var22 != null) {
                            }
                            if (w4Var22 != null) {
                            }
                            xt0.y4 y4Var22 = u5Var.z;
                            if (y4Var22 != null) {
                            }
                            xt0.x4 x4Var22 = u5Var.y;
                            h01.h hVar22 = new h01.h(P22, K22, z4722, V22, str2722, list922, iVar, z4822, z4922, z5022, str28, str29, zonedDateTime3, v0, x4Var22 != null ? com.google.android.gms.internal.measurement.d5.c0(x4Var22.c) : null);
                            lx0.b bVar722 = new lx0.b(u5Var);
                            a = bx0.a.a(n5Var, v4Var, u4Var322);
                            if (m4Var != null) {
                            }
                            if (m4Var != null) {
                            }
                            if (a.isEmpty()) {
                            }
                            lx0.b bVar922 = bVar722;
                            if (intValue > 0) {
                            }
                            if ((m4Var != null || (l5Var = m4Var.a) == null) ? z30 : l5Var.c) {
                            }
                            boolean z5522 = z3Var.n;
                            if (z3) {
                            }
                            z6 = false;
                            if (list != null) {
                            }
                            String str31222 = u5Var.d;
                            boolean z56222 = z3Var.o;
                            boolean z57222 = u5Var.R;
                            boolean z58222 = u5Var.S;
                            xt0.n4 n4Var222 = u5Var.f;
                            if (n4Var222 == null) {
                            }
                            xt0.t4 t4Var222 = u5Var.e;
                            if (t4Var222 == null) {
                            }
                            boolean z59222 = u5Var.l;
                            boolean z60222 = u5Var.T;
                            if (w3Var == null) {
                            }
                            j2Var3 = new yz0.j2(str10, str12, str11, aVar11, str, z, z30, str3, z2, subscriptionState2, subscriptionState11, str4, str2, i1422, z3522, issueOrPullRequestState422, aVar1222, b322, bVar522, o322, z3622, f422, d322, f522, rVar3, arrayList522, z7, z5, str21, z3, z33, 0, 0, z4, z4022, c22, z4222, z57222, z58222, str5, false, str32, str33, z32, z4322, a2Var22, z1Var, str26, c2Var22, a222, arrayList622, true, pullRequestReviewDecision322, hVar22, bVar922, i20, z54, z5522, z6, str30, str31222, z56222, z59222, z60222, null, false, null, false, null, null, false, 1073742080);
                        } else {
                            z2Var2 = z2Var;
                            aVar = aVar2;
                        }
                        j2Var2 = j2Var3;
                        if (j2Var2 == null) {
                            z2 z2Var3 = z2Var2;
                            z2Var3.v = 1;
                            Object c3 = this.s.c(j2Var2, z2Var3);
                            b71.a aVar15 = aVar;
                            if (c3 == aVar15) {
                                return aVar15;
                            }
                        }
                    } else {
                        z2Var2 = z2Var;
                        aVar = aVar2;
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
        z2Var = new z2(this, cVar);
        Object obj22 = z2Var.u;
        b71.a aVar22 = b71.a.r;
        i = z2Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r4v2, types: [h01.o] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object f(a71.c cVar, Object obj) {
        a3 a3Var;
        int i;
        ow0.q0 q0Var;
        if (cVar instanceof a3) {
            a3Var = (a3) cVar;
            int i2 = a3Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a3Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = a3Var.u;
                b71.a aVar = b71.a.r;
                i = a3Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    ow0.p0 p0Var = ((ow0.o0) obj).a;
                    if (p0Var != null && (q0Var = p0Var.c) != null) {
                        uu0.i6Shadow i6Var = q0Var.b;
                        h01.p i3 = com.google.android.gms.internal.measurement.z3.i(i6Var.c);
                        uu0.p0 p0Var2 = i6Var.d.a;
                        r7 = new h01.o(i3, b91.g.g(i6Var.e), p0Var2 != null ? b41.b.l(p0Var2) : null);
                    }
                    a3Var.v = 1;
                    if (this.s.c(r7, a3Var) == aVar) {
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
        a3Var = new a3(this, cVar);
        Object obj22 = a3Var.u;
        b71.a aVar2 = b71.a.r;
        i = a3Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v3, types: [x61.r] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(a71.c cVar, Object obj) {
        e3 e3Var;
        int i;
        java.util.ArrayList r13;
        List<uw0.r> list;
        uu0.k3Shadow k3Var;
        String str;
        if (cVar instanceof e3) {
            e3Var = (e3) cVar;
            int i2 = e3Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e3Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = e3Var.u;
                b71.a aVar = b71.a.r;
                i = e3Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    uw0.q qVar = ((uw0.o) obj).a;
                    String str2 = qVar != null ? qVar.a : "";
                    String str3 = qVar != null ? qVar.b : "";
                    String str4 = (qVar == null || (str = qVar.c) == null) ? "" : str;
                    com.github.service.models.response.a e = k41.b.e(qVar != null ? qVar.d.c : null);
                    int i3 = qVar != null ? qVar.e.c : 0;
                    if (qVar == null || (list = qVar.e.b) == null) {
                        r13 = 0;
                    } else {
                        r13 = new ArrayList();
                        for (uw0.r rVar : list) {
                            p01.n E = ((rVar != null ? rVar.c : null) == null || (k3Var = rVar.b) == null) ? null : w8.s.E(new w61.k(k3Var, rVar.c));
                            if (E != null) {
                                r13.add(E);
                            }
                        }
                    }
                    if (r13 == 0) {
                        r13 = x61.r.r;
                    }
                    yz0.g1 g1Var = new yz0.g1(new yz0.p2(str2, str3, str4, i3, e), new yz0.c4(r13, new x01.i(qVar != null ? qVar.e.a.b : null, qVar != null ? qVar.e.a.a : false, false)));
                    e3Var.v = 1;
                    if (this.s.c(g1Var, e3Var) == aVar) {
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
        e3Var = new e3(this, cVar);
        Object obj22 = e3Var.u;
        b71.a aVar2 = b71.a.r;
        i = e3Var.v;
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
        f3 f3Var;
        int i;
        String str;
        if (cVar instanceof f3) {
            f3Var = (f3) cVar;
            int i2 = f3Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f3Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = f3Var.u;
                b71.a aVar = b71.a.r;
                i = f3Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    uw0.l lVar = ((uw0.k) obj).a;
                    String str2 = "";
                    String str3 = lVar != null ? lVar.a : "";
                    String str4 = lVar != null ? lVar.b : "";
                    String str5 = lVar != null ? lVar.c : "";
                    if (lVar != null && (str = lVar.d) != null) {
                        str2 = str;
                    }
                    xz0.h hVar = new xz0.h(str3, str4, str5, str2);
                    f3Var.v = 1;
                    if (this.s.c(hVar, f3Var) == aVar) {
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
        f3Var = new f3(this, cVar);
        Object obj22 = f3Var.u;
        b71.a aVar2 = b71.a.r;
        i = f3Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v2, types: [x61.r] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object i(a71.c cVar, Object obj) {
        g3Shadow g3Var;
        int i;
        Object obj2;
        List<uu0.n6> list;
        if (cVar instanceof g3Shadow) {
            g3Var = (g3Shadow) cVar;
            int i2 = g3Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g3Var.v = i2 - Integer.MIN_VALUE;
                Object obj3 = g3Var.u;
                b71.a aVar = b71.a.r;
                i = g3Var.v;
                if (i != 0) {
                    sy.y.j(obj3);
                    lf lfVar = ((kf) obj).a;
                    if (lfVar == null || (list = lfVar.c.b.a) == null) {
                        obj2 = x61.r.r;
                    } else {
                        obj2 = new ArrayList();
                        for (uu0.n6 n6Var : list) {
                            yz0.e8 Z = n6Var != null ? com.google.common.util.concurrent.a.Z(n6Var.c) : null;
                            if (Z != null) {
                                obj2.add(Z);
                            }
                        }
                    }
                    g3Var.v = 1;
                    if (this.s.c(obj2, g3Var) == aVar) {
                        return aVar;
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
        g3Var = new g3Shadow(this, cVar);
        Object obj32 = g3Var.u;
        b71.a aVar2 = b71.a.r;
        i = g3Var.v;
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
        i3 i3Var;
        int i;
        String str;
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
                    uw0.y yVar = ((uw0.w) obj).a;
                    uw0.x xVar = yVar != null ? yVar.a : null;
                    String str2 = "";
                    String str3 = xVar != null ? xVar.a : "";
                    String str4 = xVar != null ? xVar.b : "";
                    String str5 = xVar != null ? xVar.c : "";
                    if (xVar != null && (str = xVar.d) != null) {
                        str2 = str;
                    }
                    xz0.h hVar = new xz0.h(str3, str4, str5, str2);
                    i3Var.v = 1;
                    if (this.s.c(hVar, i3Var) == aVar) {
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
    private final Object k(a71.c cVar, Object obj) {
        j3 j3Var;
        int i;
        ui uiVar;
        ri riVar;
        ui uiVar2;
        vi viVar;
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
                    ti tiVar = (ti) obj;
                    ig igVar = (tiVar == null || (uiVar2 = tiVar.a) == null || (viVar = uiVar2.b) == null) ? null : viVar.b;
                    int i3 = igVar == null ? -1 : bx0.n.a[igVar.ordinal()];
                    yz0.t6Shadow t6Var = new yz0.t6(i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? TimelineItem$TimelineLockedEvent$Reason.UNKNOWN : TimelineItem$TimelineLockedEvent$Reason.RESOLVED : TimelineItem$TimelineLockedEvent$Reason.TOO_HEATED : TimelineItem$TimelineLockedEvent$Reason.SPAM : TimelineItem$TimelineLockedEvent$Reason.OFF_TOPIC, new com.github.service.models.response.a((tiVar == null || (uiVar = tiVar.a) == null || (riVar = uiVar.a) == null) ? "" : riVar.b, (Avatar) null, (String) null, false, (String) null, 62));
                    j3Var.v = 1;
                    if (this.s.c(t6Var, j3Var) == aVar) {
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
    private final Object n(a71.c cVar, Object obj) {
        m3 m3Var;
        int i;
        d80 d80Var;
        a80 a80Var;
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
                    c80 c80Var = (c80) obj;
                    yz0.p7 p7Var = new yz0.p7(new com.github.service.models.response.a((c80Var == null || (d80Var = c80Var.a) == null || (a80Var = d80Var.a) == null) ? "" : a80Var.b, (Avatar) null, (String) null, false, (String) null, 62));
                    m3Var.v = 1;
                    if (this.s.c(p7Var, m3Var) == aVar) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:617:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x096d  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x09d6  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x09e4  */
    /* JADX WARN: Removed duplicated region for block: B:750:0x0a54  */
    /* JADX WARN: Removed duplicated region for block: B:756:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x0a9a  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x0aa8  */
    /* JADX WARN: Type inference failed for: r1v123 */
    /* JADX WARN: Type inference failed for: r1v124 */
    /* JADX WARN: Type inference failed for: r1v125, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v127, types: [x61.r] */
    /* JADX WARN: Type inference failed for: r1v130, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        s1 s1Var;
        int i;
        u1 u1Var;
        int i2;
        v1 v1Var;
        int i3;
        uu0.z4 z4Var;
        kb0 kb0Var;
        x1 x1Var;
        int i4;
        Object obj2;
        bf bfVar;
        ye yeVar;
        we weVar;
        xe xeVar;
        y1 y1Var;
        int i5;
        qf qfVar;
        rf rfVar;
        pf pfVar;
        z1 z1Var;
        int i6;
        jv jvVar;
        a2 a2Var;
        int i7;
        d2 d2Var;
        int i8;
        RandomAccess randomAccess;
        ArrayList arrayList;
        yz0.o oVar;
        Object next;
        e2 e2Var;
        int i9;
        Boolean bool;
        g2 g2Var;
        int i10;
        h2 h2Var;
        int i12;
        j2 j2Var;
        int i13;
        ArrayList arrayList2;
        k2 k2Var;
        int i14;
        uu0.z4 z4Var2;
        l2 l2Var;
        int i15;
        m2 m2Var;
        int i16;
        n2 n2Var;
        int i17;
        java.util.ArrayList r1;
        List<ke0> list;
        o2 o2Var;
        int i18;
        h60 h60Var;
        m60 m60Var;
        q60 q60Var;
        n60 n60Var;
        h60 h60Var2;
        m60 m60Var2;
        q60 q60Var2;
        k60 k60Var;
        h60 h60Var3;
        m60 m60Var3;
        q60 q60Var3;
        n60 n60Var2;
        List list2;
        i60 i60Var;
        o60 o60Var;
        h60 h60Var4;
        j60 j60Var;
        r60 r60Var;
        l60 l60Var;
        r2 r2Var;
        int i19;
        n3 n3Var;
        int i20;
        ArrayList arrayList3;
        switch (this.r) {
            case 0:
                if (cVar instanceof s1) {
                    s1Var = (s1) cVar;
                    int i22 = s1Var.v;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        s1Var.v = i22 - Integer.MIN_VALUE;
                        Object obj3 = s1Var.u;
                        b71.a aVar = b71.a.r;
                        i = s1Var.v;
                        if (i != 0) {
                            sy.y.j(obj3);
                            ArrayList z = a.a.z((ud) obj);
                            s1Var.v = 1;
                            if (this.s.c(z, s1Var) == aVar) {
                                return aVar;
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
                s1Var = new s1(this, cVar);
                Object obj32 = s1Var.u;
                b71.a aVar2 = b71.a.r;
                i = s1Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof u1) {
                    u1Var = (u1) cVar;
                    int i23 = u1Var.v;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        u1Var.v = i23 - Integer.MIN_VALUE;
                        Object obj4 = u1Var.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = u1Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj4);
                            ArrayList z2 = a.a.z((ud) obj);
                            u1Var.v = 1;
                            if (this.s.c(z2, u1Var) == aVar3) {
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
                u1Var = new u1(this, cVar);
                Object obj42 = u1Var.u;
                b71.a aVar32 = b71.a.r;
                i2 = u1Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof v1) {
                    v1Var = (v1) cVar;
                    int i24 = v1Var.v;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        v1Var.v = i24 - Integer.MIN_VALUE;
                        Object obj5 = v1Var.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = v1Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj5);
                            jb0 jb0Var = ((ib0) obj).a;
                            List<fw0.h> list3 = (jb0Var == null || (kb0Var = jb0Var.a) == null) ? null : kb0Var.c.a.a;
                            if (list3 == null) {
                                list3 = x61.r.r;
                            }
                            ArrayList arrayList4 = new ArrayList();
                            for (fw0.h hVar : list3) {
                                SimpleRepository H = (hVar == null || (z4Var = hVar.c) == null) ? null : w8.s.H(z4Var);
                                if (H != null) {
                                    arrayList4.add(H);
                                }
                            }
                            v1Var.v = 1;
                            if (this.s.c(arrayList4, v1Var) == aVar4) {
                                return aVar4;
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
                v1Var = new v1(this, cVar);
                Object obj52 = v1Var.u;
                b71.a aVar42 = b71.a.r;
                i3 = v1Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof x1) {
                    x1Var = (x1) cVar;
                    int i25 = x1Var.v;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        x1Var.v = i25 - Integer.MIN_VALUE;
                        Object obj6 = x1Var.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = x1Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj6);
                            cf cfVar = ((ve) obj).a;
                            if (cfVar == null || (bfVar = cfVar.b) == null || (yeVar = bfVar.c) == null || (weVar = yeVar.b) == null || (xeVar = weVar.b) == null) {
                                obj2 = null;
                            } else {
                                String str = cfVar.a;
                                af afVar = xeVar.c;
                                if (afVar != null) {
                                    obj2 = new yz0.j1(afVar.a, str);
                                } else {
                                    ze zeVar = xeVar.b;
                                    obj2 = zeVar != null ? new yz0.h1(zeVar.a, str) : yz0.k1.a;
                                }
                            }
                            if (obj2 != null) {
                                x1Var.v = 1;
                                if (this.s.c(obj2, x1Var) == aVar5) {
                                    return aVar5;
                                }
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj6);
                        }
                        return w61.a0.a;
                    }
                }
                x1Var = new x1(this, cVar);
                Object obj62 = x1Var.u;
                b71.a aVar52 = b71.a.r;
                i4 = x1Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof y1) {
                    y1Var = (y1) cVar;
                    int i26 = y1Var.v;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        y1Var.v = i26 - Integer.MIN_VALUE;
                        Object obj7 = y1Var.u;
                        b71.a aVar6 = b71.a.r;
                        i5 = y1Var.v;
                        if (i5 != 0) {
                            sy.y.j(obj7);
                            sf sfVar = ((of) obj).a;
                            String str2 = (sfVar == null || (qfVar = sfVar.b) == null || (rfVar = qfVar.c) == null || (pfVar = rfVar.b) == null) ? null : pfVar.a;
                            Boolean valueOf = Boolean.valueOf(!(str2 == null || str2.length() == 0));
                            y1Var.v = 1;
                            if (this.s.c(valueOf, y1Var) == aVar6) {
                                return aVar6;
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
                y1Var = new y1(this, cVar);
                Object obj72 = y1Var.u;
                b71.a aVar62 = b71.a.r;
                i5 = y1Var.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof z1) {
                    z1Var = (z1) cVar;
                    int i27 = z1Var.v;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        z1Var.v = i27 - Integer.MIN_VALUE;
                        Object obj8 = z1Var.u;
                        b71.a aVar7 = b71.a.r;
                        i6 = z1Var.v;
                        if (i6 != 0) {
                            sy.y.j(obj8);
                            lv lvVar = ((hv) obj).a;
                            kv kvVar = (lvVar == null || (jvVar = lvVar.a) == null) ? null : jvVar.b;
                            if (kvVar != null) {
                                z1Var.v = 1;
                                if (this.s.c(kvVar, z1Var) == aVar7) {
                                    return aVar7;
                                }
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
                z1Var = new z1(this, cVar);
                Object obj82 = z1Var.u;
                b71.a aVar72 = b71.a.r;
                i6 = z1Var.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof a2) {
                    a2Var = (a2) cVar;
                    int i28 = a2Var.v;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        a2Var.v = i28 - Integer.MIN_VALUE;
                        Object obj9 = a2Var.u;
                        b71.a aVar8 = b71.a.r;
                        i7 = a2Var.v;
                        if (i7 != 0) {
                            sy.y.j(obj9);
                            Iterable<iv> iterable = ((kv) obj).a;
                            if (iterable == null) {
                                iterable = x61.r.r;
                            }
                            ArrayList arrayList5 = new ArrayList(x61.n.F(iterable, 10));
                            for (iv ivVar : iterable) {
                                String str3 = ivVar.a;
                                String str4 = ivVar.b;
                                int i29 = ivVar.c;
                                mv mvVar = ivVar.d;
                                arrayList5.add(new yz0.f1(i29, str3, str4, mvVar != null ? mvVar.a : ""));
                            }
                            List v0 = x61.m.v0(arrayList5, new b2(0));
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = new ArrayList();
                            for (Object obj10 : v0) {
                                Entry$EntryType entry$EntryType = ((yz0.f1) obj10).e;
                                if (entry$EntryType == Entry$EntryType.TREE) {
                                    arrayList6.add(obj10);
                                } else if (entry$EntryType == Entry$EntryType.COMMIT) {
                                    arrayList7.add(obj10);
                                } else {
                                    arrayList8.add(obj10);
                                }
                            }
                            ArrayList l0 = x61.m.l0(x61.m.l0(arrayList6, arrayList8), arrayList7);
                            a2Var.v = 1;
                            if (this.s.c(l0, a2Var) == aVar8) {
                                return aVar8;
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
                a2Var = new a2(this, cVar);
                Object obj92 = a2Var.u;
                b71.a aVar82 = b71.a.r;
                i7 = a2Var.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof d2) {
                    d2Var = (d2) cVar;
                    int i30 = d2Var.v;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        d2Var.v = i30 - Integer.MIN_VALUE;
                        Object obj11 = d2Var.u;
                        b71.a aVar9 = b71.a.r;
                        i8 = d2Var.v;
                        if (i8 != 0) {
                            sy.y.j(obj11);
                            jn0.g5 g5Var = ((jn0.i5) obj).a;
                            jn0.l5 l5Var = g5Var.a;
                            x01.i iVar = new x01.i(l5Var.b, l5Var.a, false);
                            List<jn0.k5> list4 = g5Var.b;
                            if (list4 != null) {
                                ArrayList arrayList9 = new ArrayList();
                                for (jn0.k5 k5Var : list4) {
                                    if (k5Var != null) {
                                        ArrayList arrayList10 = k5Var.d;
                                        String str5 = k5Var.b;
                                        jn0.j5 j5Var = k5Var.a;
                                        Language language = new Language(j5Var != null ? j5Var.b : "", j5Var != null ? j5Var.a : null);
                                        int i32 = k5Var.c;
                                        ArrayList arrayList11 = new ArrayList();
                                        int size = arrayList10.size();
                                        int i33 = 0;
                                        ArrayList arrayList12 = arrayList9;
                                        while (i33 < size) {
                                            Object obj12 = arrayList10.get(i33);
                                            i33++;
                                            jn0.m5 m5Var = (jn0.m5) obj12;
                                            ArrayList arrayList13 = arrayList12;
                                            yz0.p g = m5Var.e > 0.0d ? m71.a.g(m5Var) : null;
                                            if (g != null) {
                                                arrayList11.add(g);
                                            }
                                            arrayList12 = arrayList13;
                                        }
                                        arrayList = arrayList12;
                                        Object x0 = x61.m.x0(arrayList11, 4);
                                        if (x0.isEmpty()) {
                                            List x02 = x61.m.x0(arrayList10, 4);
                                            x0 = new ArrayList(x61.n.F(x02, 10));
                                            Iterator it = x02.iterator();
                                            while (it.hasNext()) {
                                                x0.add(m71.a.g((jn0.m5) it.next()));
                                            }
                                        }
                                        List list5 = x0;
                                        List x03 = x61.m.x0(arrayList10, 16);
                                        ArrayList arrayList14 = new ArrayList(x61.n.F(x03, 10));
                                        Iterator it2 = x03.iterator();
                                        while (it2.hasNext()) {
                                            arrayList14.add(m71.a.g((jn0.m5) it2.next()));
                                        }
                                        Iterator it3 = x61.m.x0(arrayList10, 16).iterator();
                                        if (it3.hasNext()) {
                                            next = it3.next();
                                            if (it3.hasNext()) {
                                                int i34 = ((jn0.m5) next).b;
                                                do {
                                                    Object next2 = it3.next();
                                                    int i35 = ((jn0.m5) next2).b;
                                                    if (i34 < i35) {
                                                        next = next2;
                                                        i34 = i35;
                                                    }
                                                } while (it3.hasNext());
                                            }
                                        } else {
                                            next = null;
                                        }
                                        jn0.m5 m5Var2 = (jn0.m5) next;
                                        oVar = new yz0.o(str5, language, m5Var2 != null ? m5Var2.b : 0, i32, list5, arrayList14);
                                    } else {
                                        arrayList = arrayList9;
                                        oVar = null;
                                    }
                                    ArrayList arrayList15 = arrayList;
                                    if (oVar != null) {
                                        arrayList15.add(oVar);
                                    }
                                    arrayList9 = arrayList15;
                                }
                                randomAccess = arrayList9;
                            } else {
                                randomAccess = null;
                            }
                            if (randomAccess == null) {
                                randomAccess = x61.r.r;
                            }
                            w61.k kVar = new w61.k(iVar, randomAccess);
                            d2Var.v = 1;
                            if (this.s.c(kVar, d2Var) == aVar9) {
                                return aVar9;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj11);
                        }
                        return w61.a0.a;
                    }
                }
                d2Var = new d2(this, cVar);
                Object obj112 = d2Var.u;
                b71.a aVar92 = b71.a.r;
                i8 = d2Var.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof e2) {
                    e2Var = (e2) cVar;
                    int i36 = e2Var.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        e2Var.v = i36 - Integer.MIN_VALUE;
                        Object obj13 = e2Var.u;
                        b71.a aVar10 = b71.a.r;
                        i9 = e2Var.v;
                        if (i9 != 0) {
                            sy.y.j(obj13);
                            jn0.t tVar = ((jn0.v) obj).a;
                            Boolean valueOf2 = Boolean.valueOf((tVar == null || (bool = tVar.a) == null) ? false : bool.booleanValue());
                            e2Var.v = 1;
                            if (this.s.c(valueOf2, e2Var) == aVar10) {
                                return aVar10;
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
                e2Var = new e2(this, cVar);
                Object obj132 = e2Var.u;
                b71.a aVar102 = b71.a.r;
                i9 = e2Var.v;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof g2) {
                    g2Var = (g2) cVar;
                    int i37 = g2Var.v;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        g2Var.v = i37 - Integer.MIN_VALUE;
                        Object obj14 = g2Var.u;
                        b71.a aVar11 = b71.a.r;
                        i10 = g2Var.v;
                        if (i10 != 0) {
                            sy.y.j(obj14);
                            kx0.e eVar = new kx0.e((mh) obj);
                            g2Var.v = 1;
                            if (this.s.c(eVar, g2Var) == aVar11) {
                                return aVar11;
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
                g2Var = new g2(this, cVar);
                Object obj142 = g2Var.u;
                b71.a aVar112 = b71.a.r;
                i10 = g2Var.v;
                if (i10 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof h2) {
                    h2Var = (h2) cVar;
                    int i38 = h2Var.v;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        h2Var.v = i38 - Integer.MIN_VALUE;
                        Object obj15 = h2Var.u;
                        b71.a aVar12 = b71.a.r;
                        i12 = h2Var.v;
                        if (i12 != 0) {
                            sy.y.j(obj15);
                            eh ehVar = ((gh) obj).a;
                            ih ihVar = ehVar.a;
                            x01.i iVar2 = new x01.i(ihVar.b, ihVar.a, false);
                            List<hh> list6 = ehVar.b;
                            x61.r rVar = null;
                            if (list6 != null) {
                                ArrayList arrayList16 = new ArrayList();
                                for (hh hhVar : list6) {
                                    yz0.t1 f = hhVar != null ? y9.a.f(hhVar.b) : null;
                                    if (f != null) {
                                        arrayList16.add(f);
                                    }
                                }
                                rVar = arrayList16;
                            }
                            if (rVar == null) {
                                rVar = x61.r.r;
                            }
                            w61.k kVar2 = new w61.k(iVar2, rVar);
                            h2Var.v = 1;
                            if (this.s.c(kVar2, h2Var) == aVar12) {
                                return aVar12;
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
                h2Var = new h2(this, cVar);
                Object obj152 = h2Var.u;
                b71.a aVar122 = b71.a.r;
                i12 = h2Var.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof j2) {
                    j2Var = (j2) cVar;
                    int i39 = j2Var.v;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        j2Var.v = i39 - Integer.MIN_VALUE;
                        Object obj16 = j2Var.u;
                        b71.a aVar13 = b71.a.r;
                        i13 = j2Var.v;
                        if (i13 != 0) {
                            sy.y.j(obj16);
                            fw0.a aVar14 = ((af0) obj).a.c.a;
                            if (aVar14 != null) {
                                ArrayList arrayList17 = aVar14.a;
                                ArrayList arrayList18 = new ArrayList(x61.n.F(arrayList17, 10));
                                int size2 = arrayList17.size();
                                int i40 = 0;
                                int i42 = 0;
                                while (i42 < size2) {
                                    Object obj17 = arrayList17.get(i42);
                                    i42++;
                                    fw0.b bVar = (fw0.b) obj17;
                                    k71.k.g(bVar, "<this>");
                                    arrayList18.add(new g01.d(com.google.common.util.concurrent.a.O(bVar.a), bVar.b));
                                }
                                arrayList2 = new ArrayList();
                                int size3 = arrayList18.size();
                                while (i40 < size3) {
                                    Object obj18 = arrayList18.get(i40);
                                    i40++;
                                    if (((g01.d) obj18).a != NavLinkIdentifier.UNKNOWN__) {
                                        arrayList2.add(obj18);
                                    }
                                }
                            } else {
                                arrayList2 = null;
                            }
                            if (arrayList2 != null) {
                                j2Var.v = 1;
                                if (this.s.c(arrayList2, j2Var) == aVar13) {
                                    return aVar13;
                                }
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
                j2Var = new j2(this, cVar);
                Object obj162 = j2Var.u;
                b71.a aVar132 = b71.a.r;
                i13 = j2Var.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof k2) {
                    k2Var = (k2) cVar;
                    int i43 = k2Var.v;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        k2Var.v = i43 - Integer.MIN_VALUE;
                        Object obj19 = k2Var.u;
                        b71.a aVar15 = b71.a.r;
                        i14 = k2Var.v;
                        if (i14 != 0) {
                            sy.y.j(obj19);
                            Iterable<fw0.h> iterable2 = ((hp) obj).a.c.a.a;
                            if (iterable2 == null) {
                                iterable2 = x61.r.r;
                            }
                            ArrayList arrayList19 = new ArrayList();
                            for (fw0.h hVar2 : iterable2) {
                                SimpleRepository H2 = (hVar2 == null || (z4Var2 = hVar2.c) == null) ? null : w8.s.H(z4Var2);
                                if (H2 != null) {
                                    arrayList19.add(H2);
                                }
                            }
                            k2Var.v = 1;
                            if (this.s.c(arrayList19, k2Var) == aVar15) {
                                return aVar15;
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj19);
                        }
                        return w61.a0.a;
                    }
                }
                k2Var = new k2(this, cVar);
                Object obj192 = k2Var.u;
                b71.a aVar152 = b71.a.r;
                i14 = k2Var.v;
                if (i14 != 0) {
                }
                return w61.a0.a;
            case 13:
                if (cVar instanceof l2) {
                    l2Var = (l2) cVar;
                    int i44 = l2Var.v;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        l2Var.v = i44 - Integer.MIN_VALUE;
                        Object obj20 = l2Var.u;
                        b71.a aVar16 = b71.a.r;
                        i15 = l2Var.v;
                        if (i15 != 0) {
                            sy.y.j(obj20);
                            g01.a c = b31.b.c((gi) obj);
                            l2Var.v = 1;
                            if (this.s.c(c, l2Var) == aVar16) {
                                return aVar16;
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj20);
                        }
                        return w61.a0.a;
                    }
                }
                l2Var = new l2(this, cVar);
                Object obj202 = l2Var.u;
                b71.a aVar162 = b71.a.r;
                i15 = l2Var.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof m2) {
                    m2Var = (m2) cVar;
                    int i45 = m2Var.v;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        m2Var.v = i45 - Integer.MIN_VALUE;
                        Object obj21 = m2Var.u;
                        b71.a aVar17 = b71.a.r;
                        i16 = m2Var.v;
                        if (i16 != 0) {
                            sy.y.j(obj21);
                            g01.a c2 = b31.b.c((gi) obj);
                            m2Var.v = 1;
                            if (this.s.c(c2, m2Var) == aVar17) {
                                return aVar17;
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj21);
                        }
                        return w61.a0.a;
                    }
                }
                m2Var = new m2(this, cVar);
                Object obj212 = m2Var.u;
                b71.a aVar172 = b71.a.r;
                i16 = m2Var.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 15:
                if (cVar instanceof n2) {
                    n2Var = (n2) cVar;
                    int i46 = n2Var.v;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        n2Var.v = i46 - Integer.MIN_VALUE;
                        Object obj22 = n2Var.u;
                        b71.a aVar18 = b71.a.r;
                        i17 = n2Var.v;
                        if (i17 != 0) {
                            sy.y.j(obj22);
                            je0 je0Var = (je0) obj;
                            k71.k.g(je0Var, "<this>");
                            le0 le0Var = je0Var.a;
                            if (le0Var == null || (list = le0Var.a) == null) {
                                r1 = 0;
                            } else {
                                ArrayList arrayList20 = new ArrayList(x61.n.F(list, 10));
                                for (ke0 ke0Var : list) {
                                    arrayList20.add(new g01.d(com.google.common.util.concurrent.a.O(ke0Var.a), ke0Var.b));
                                }
                                r1 = new ArrayList();
                                int size4 = arrayList20.size();
                                int i47 = 0;
                                while (i47 < size4) {
                                    Object obj23 = arrayList20.get(i47);
                                    i47++;
                                    if (((g01.d) obj23).a != NavLinkIdentifier.UNKNOWN__) {
                                        r1.add(obj23);
                                    }
                                }
                            }
                            if (r1 == 0) {
                                r1 = x61.r.r;
                            }
                            n2Var.v = 1;
                            if (this.s.c((Object) r1, n2Var) == aVar18) {
                                return aVar18;
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj22);
                        }
                        return w61.a0.a;
                    }
                }
                n2Var = new n2(this, cVar);
                Object obj222 = n2Var.u;
                b71.a aVar182 = b71.a.r;
                i17 = n2Var.v;
                if (i17 != 0) {
                }
                return w61.a0.a;
            case 16:
                if (cVar instanceof o2) {
                    o2Var = (o2) cVar;
                    int i48 = o2Var.v;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        o2Var.v = i48 - Integer.MIN_VALUE;
                        Object obj24 = o2Var.u;
                        b71.a aVar19 = b71.a.r;
                        i18 = o2Var.v;
                        if (i18 != 0) {
                            sy.y.j(obj24);
                            g60 g60Var = (g60) obj;
                            p60 p60Var = g60Var.a;
                            Object obj25 = null;
                            String str6 = (p60Var == null || (h60Var4 = p60Var.b) == null || (j60Var = h60Var4.b) == null || (r60Var = j60Var.a) == null || (l60Var = r60Var.b) == null) ? null : l60Var.a;
                            String str7 = (p60Var == null || (h60Var3 = p60Var.b) == null || (m60Var3 = h60Var3.c) == null || (q60Var3 = m60Var3.b) == null || (n60Var2 = q60Var3.c) == null || (list2 = n60Var2.b.a) == null || (i60Var = (i60) x61.m.W(list2)) == null || (o60Var = i60Var.a) == null) ? null : o60Var.a;
                            p60 p60Var2 = g60Var.a;
                            String str8 = (p60Var2 == null || (h60Var2 = p60Var2.b) == null || (m60Var2 = h60Var2.c) == null || (q60Var2 = m60Var2.b) == null || (k60Var = q60Var2.b) == null) ? null : k60Var.a;
                            String str9 = (p60Var2 == null || (h60Var = p60Var2.b) == null || (m60Var = h60Var.c) == null || (q60Var = m60Var.b) == null || (n60Var = q60Var.c) == null) ? null : n60Var.a;
                            if (str7 == null || str9 == null) {
                                if (str6 == null) {
                                    str6 = str7 == null ? str8 : str7;
                                }
                                if (str6 != null) {
                                    obj25 = new z01.d0(str6);
                                }
                            } else {
                                obj25 = new z01.e0(str9, str7);
                            }
                            if (obj25 == null) {
                                throw new ApiFailure(ApiFailureType.SERVER_ERROR, "Could not fetch time line id for given url.", null, null, null, null, null, 120);
                            }
                            o2Var.v = 1;
                            if (this.s.c(obj25, o2Var) == aVar19) {
                                return aVar19;
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj24);
                        }
                        return w61.a0.a;
                    }
                }
                o2Var = new o2(this, cVar);
                Object obj242 = o2Var.u;
                b71.a aVar192 = b71.a.r;
                i18 = o2Var.v;
                if (i18 != 0) {
                }
                return w61.a0.a;
            case 17:
                return a(cVar, obj);
            case 18:
                if (cVar instanceof r2) {
                    r2Var = (r2) cVar;
                    int i49 = r2Var.v;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        r2Var.v = i49 - Integer.MIN_VALUE;
                        Object obj26 = r2Var.u;
                        b71.a aVar20 = b71.a.r;
                        i19 = r2Var.v;
                        if (i19 != 0) {
                            sy.y.j(obj26);
                            List g2 = com.google.android.gms.internal.measurement.z3.g((ow0.q) obj);
                            r2Var.v = 1;
                            if (this.s.c(g2, r2Var) == aVar20) {
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
                r2Var = new r2(this, cVar);
                Object obj262 = r2Var.u;
                b71.a aVar202 = b71.a.r;
                i19 = r2Var.v;
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
                if (cVar instanceof n3) {
                    n3Var = (n3) cVar;
                    int i50 = n3Var.v;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        n3Var.v = i50 - Integer.MIN_VALUE;
                        Object obj27 = n3Var.u;
                        b71.a aVar21 = b71.a.r;
                        i20 = n3Var.v;
                        if (i20 != 0) {
                            sy.y.j(obj27);
                            rl rlVar = ((kl) obj).a;
                            ul ulVar = rlVar != null ? rlVar.d : null;
                            Collection<ql> collection = x61.r.r;
                            if (ulVar != null) {
                                ll llVar = rlVar.d.a;
                                Collection collection2 = llVar != null ? llVar.a : null;
                                if (collection2 != null) {
                                    collection = collection2;
                                }
                                arrayList3 = new ArrayList();
                                for (pl plVar : collection) {
                                    yz0.r2 c3 = (plVar != null ? plVar.b.b : null) != null ? bx0.f.c(plVar.b.b) : (plVar != null ? plVar.b.c : null) != null ? bx0.f.b(plVar.b.c) : (plVar != null ? plVar.b.d : null) != null ? bx0.f.a(plVar.b.d) : null;
                                    if (c3 != null) {
                                        arrayList3.add(c3);
                                    }
                                }
                            } else if ((rlVar != null ? rlVar.c : null) != null) {
                                nl nlVar = rlVar.c.a;
                                Collection collection3 = nlVar != null ? nlVar.a : null;
                                if (collection3 != null) {
                                    collection = collection3;
                                }
                                arrayList3 = new ArrayList();
                                for (ol olVar : collection) {
                                    yz0.r2 c4 = (olVar != null ? olVar.b.b : null) != null ? bx0.f.c(olVar.b.b) : (olVar != null ? olVar.b.c : null) != null ? bx0.f.b(olVar.b.c) : (olVar != null ? olVar.b.d : null) != null ? bx0.f.a(olVar.b.d) : null;
                                    if (c4 != null) {
                                        arrayList3.add(c4);
                                    }
                                }
                            } else {
                                if ((rlVar != null ? rlVar.e : null) != null) {
                                    ml mlVar = rlVar.e.a;
                                    Collection collection4 = mlVar != null ? mlVar.a : null;
                                    if (collection4 != null) {
                                        collection = collection4;
                                    }
                                    arrayList3 = new ArrayList();
                                    for (ql qlVar : collection) {
                                        yz0.r2 c5 = (qlVar != null ? qlVar.b.b : null) != null ? bx0.f.c(qlVar.b.b) : (qlVar != null ? qlVar.b.c : null) != null ? bx0.f.b(qlVar.b.c) : (qlVar != null ? qlVar.b.d : null) != null ? bx0.f.a(qlVar.b.d) : null;
                                        if (c5 != null) {
                                            arrayList3.add(c5);
                                        }
                                    }
                                }
                                n3Var.v = 1;
                                if (this.s.c(collection, n3Var) == aVar21) {
                                    return aVar21;
                                }
                            }
                            collection = arrayList3;
                            n3Var.v = 1;
                            if (this.s.c(collection, n3Var) == aVar21) {
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
                n3Var = new n3(this, cVar);
                Object obj272 = n3Var.u;
                b71.a aVar212 = b71.a.r;
                i20 = n3Var.v;
                if (i20 != 0) {
                }
                return w61.a0.a;
        }
    }

    public /* synthetic */ t1(y71.j jVar, rm0.c4 c4Var, int i) {
        this.r = i;
        this.s = jVar;
    }
}
