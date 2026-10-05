package wk;

import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.type.PullRequestReviewDecision;
import com.github.service.models.response.type.SubscriptionState;
import h01.q;
import java.util.ArrayList;
import java.util.List;
import sy.y;
import w61.a0;
import x61.m;
import yz0.a2;
import yz0.c2;
import yz0.i2;
import yz0.j2;
import yz0.s;
import yz0.v2;
import yz0.z1;
import z01.p;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends c71.j implements j71.g {
    public final /* synthetic */ int v;
    public /* synthetic */ List w;
    public /* synthetic */ Object x;
    public /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, a71.c cVar, int i2) {
        super(i, cVar);
        this.v = i2;
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.v) {
            case 0:
                b bVar = new b(4, (a71.c) obj4, 0);
                bVar.w = (List) obj;
                bVar.x = (List) obj2;
                bVar.y = (List) obj3;
                return bVar.v(a0.a);
            default:
                b bVar2 = new b(4, (a71.c) obj4, 1);
                bVar2.x = (j2) obj;
                bVar2.y = (q) obj2;
                bVar2.w = (List) obj3;
                return bVar2.v(a0.a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, java.util.List] */
    public final Object v(Object obj) {
        String str;
        p pVar;
        switch (this.v) {
            case 0:
                List list = this.w;
                List list2 = (List) this.x;
                List list3 = (List) this.y;
                b71.a aVar = b71.a.r;
                y.j(obj);
                return new a(list, m.H0(list2), list3);
            default:
                j2 j2Var = (j2) this.x;
                q qVar = (q) this.y;
                List list4 = this.w;
                b71.a aVar2 = b71.a.r;
                y.j(obj);
                String str2 = j2Var.a;
                String str3 = j2Var.b;
                String str4 = j2Var.c;
                com.github.service.models.response.a aVar3 = j2Var.d;
                String str5 = j2Var.e;
                boolean z = j2Var.f;
                boolean z2 = j2Var.g;
                String str6 = j2Var.h;
                boolean z3 = j2Var.i;
                SubscriptionState subscriptionState = j2Var.j;
                SubscriptionState subscriptionState2 = j2Var.k;
                String str7 = j2Var.l;
                String str8 = j2Var.m;
                int i = j2Var.n;
                boolean z4 = j2Var.o;
                IssueOrPullRequestState issueOrPullRequestState = j2Var.p;
                com.github.service.models.response.a aVar4 = j2Var.q;
                boolean z5 = j2Var.r;
                s sVar = j2Var.s;
                ArrayList arrayList = j2Var.t;
                boolean z6 = j2Var.u;
                v2 v2Var = j2Var.v;
                ?? r2 = j2Var.w;
                ?? r22 = j2Var.x;
                ?? r23 = j2Var.y;
                ?? r24 = j2Var.z;
                boolean z7 = j2Var.A;
                boolean z8 = j2Var.B;
                String str9 = j2Var.C;
                boolean z9 = j2Var.D;
                boolean z11 = j2Var.E;
                boolean z12 = j2Var.L;
                boolean z13 = j2Var.M;
                int i2 = j2Var.F;
                int i3 = j2Var.G;
                boolean z14 = j2Var.H;
                boolean z15 = j2Var.I;
                ?? r25 = j2Var.J;
                boolean z16 = j2Var.K;
                boolean z17 = j2Var.R;
                boolean z18 = j2Var.S;
                a2 a2Var = j2Var.T;
                z1 z1Var = j2Var.U;
                String str10 = j2Var.V;
                c2 c2Var = j2Var.W;
                ?? r26 = j2Var.X;
                ?? r27 = j2Var.Y;
                boolean z19 = j2Var.Z;
                PullRequestReviewDecision pullRequestReviewDecision = j2Var.a0;
                h01.h hVar = j2Var.b0;
                h01.c cVar = j2Var.c0;
                int i4 = j2Var.d0;
                boolean z20 = j2Var.e0;
                boolean z21 = j2Var.f0;
                boolean z22 = j2Var.g0;
                CloseReason closeReason = j2Var.m0;
                String str11 = j2Var.h0;
                String str12 = j2Var.i0;
                boolean z23 = j2Var.j0;
                boolean z24 = j2Var.n0;
                boolean z25 = j2Var.k0;
                boolean z26 = j2Var.l0;
                IssueType issueType = j2Var.o0;
                boolean z27 = j2Var.p0;
                h01.j jVar = j2Var.q0;
                String str13 = j2Var.P;
                String str14 = j2Var.Q;
                if (z19) {
                    str = str14;
                    pVar = null;
                } else {
                    str = str14;
                    pVar = j2Var.r0;
                }
                return new i2(str2, str3, str4, aVar3, str5, z, z2, str6, z3, subscriptionState, subscriptionState2, str7, str8, i, z4, issueOrPullRequestState, aVar4, z5, sVar, arrayList, z6, qVar, v2Var, (List) r2, (List) r22, (List) r23, (List) r24, z7, z8, str9, z9, z11, i2, i3, z14, z15, (List) r25, z16, z12, z13, j2Var.N, j2Var.O, str13, str, z17, z18, a2Var, z1Var, str10, c2Var, (List) r26, (List) r27, z19, pullRequestReviewDecision, hVar, cVar, i4, z20, z21, z22, str11, str12, z23, z25, z26, list4, closeReason, z24, issueType, z27, jVar, pVar, j2Var.s0);
        }
    }
}
