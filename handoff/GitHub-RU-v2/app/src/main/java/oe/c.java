package oe;

import a0.s0;
import com.github.rudroid.common.b0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.type.ReviewDecision;
import com.github.service.models.response.type.StatusState;
import he.q;
import java.time.ZonedDateTime;
import java.util.List;
import le.v;
import yz0.d3;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements l, v {
    public lg.bShadow A;
    public int B;
    public StatusState C;
    public PullRequestState D;
    public boolean E;
    public b0 F;
    public ReviewDecision G;
    public int H;
    public Integer I;
    public boolean J;
    public q K;
    public String L;
    public int M;
    public int N;

    /* renamed from: r, reason: collision with root package name */
    public String f30165r;

    /* renamed from: s, reason: collision with root package name */
    public String f30166s;

    /* renamed from: t, reason: collision with root package name */
    public int f30167t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f30168u;

    /* renamed from: v, reason: collision with root package name */
    public ZonedDateTime f30169v;

    /* renamed from: w, reason: collision with root package name */
    public d3 f30170w;

    /* renamed from: x, reason: collision with root package name */
    public String f30171x;

    /* renamed from: y, reason: collision with root package name */
    public String f30172y;

    /* renamed from: z, reason: collision with root package name */
    public List f30173z;

    public /* synthetic */ c(String str, String str2, int i, boolean z10, ZonedDateTime zonedDateTime, d3 d3Var, String str3, String str4, List list, lg.bShadow bVar, int i10, StatusState statusState, PullRequestState pullRequestState, boolean z11, b0 b0Var, ReviewDecision reviewDecision, int i11, Integer num, boolean z12, q qVar, String str5) {
        this(str, str2, i, z10, zonedDateTime, d3Var, str3, str4, list, bVar, i10, statusState, pullRequestState, z11, b0Var, reviewDecision, i11, num, z12, qVar, str5, 5, 5);
    }

    public static c a(c cVar) {
        String str = cVar.f30165r;
        String str2 = cVar.f30166s;
        int i = cVar.f30167t;
        d3 d3Var = cVar.f30170w;
        String str3 = cVar.f30171x;
        String str4 = cVar.f30172y;
        List list = cVar.f30173z;
        lg.bShadow bVar = cVar.A;
        int i10 = cVar.B;
        StatusState statusState = cVar.C;
        PullRequestState pullRequestState = cVar.D;
        boolean z10 = cVar.E;
        b0 b0Var = cVar.F;
        ReviewDecision reviewDecision = cVar.G;
        int i11 = cVar.H;
        boolean z11 = cVar.J;
        q qVar = cVar.K;
        String str5 = cVar.L;
        int i12 = cVar.M;
        int i13 = cVar.N;
        k71.k.g(str, "title");
        k71.k.g(str2, "titleHTML");
        k71.k.g(d3Var, "owner");
        k71.k.g(str3, "id");
        k71.k.g(bVar, "itemCountColor");
        k71.k.g(pullRequestState, "pullRequestStatus");
        k71.k.g(b0Var, "assignees");
        k71.k.g(str5, "stableId");
        return new c(str, str2, i, false, null, d3Var, str3, str4, list, bVar, i10, statusState, pullRequestState, z10, b0Var, reviewDecision, i11, null, z11, qVar, str5, i12, i13);
    }

    @Override // le.z
    public final String E() {
        return this.L;
    }

    @Override // oe.l
    public final int M() {
        return this.M;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.f30165r, cVar.f30165r) && k71.k.b(this.f30166s, cVar.f30166s) && this.f30167t == cVar.f30167t && this.f30168u == cVar.f30168u && k71.k.b(this.f30169v, cVar.f30169v) && k71.k.b(this.f30170w, cVar.f30170w) && k71.k.b(this.f30171x, cVar.f30171x) && k71.k.b(this.f30172y, cVar.f30172y) && k71.k.b(this.f30173z, cVar.f30173z) && this.A == cVar.A && this.B == cVar.B && this.C == cVar.C && this.D == cVar.D && this.E == cVar.E && k71.k.b(this.F, cVar.F) && this.G == cVar.G && this.H == cVar.H && k71.k.b(this.I, cVar.I) && this.J == cVar.J && this.K == cVar.K && k71.k.b(this.L, cVar.L) && this.M == cVar.M && this.N == cVar.N;
    }

    @Override // le.v
    public final int h() {
        return this.N;
    }

    public final int hashCode() {
        int e5 = x.i.e(s0.b(this.f30167t, h1.i(this.f30165r.hashCode() * 31, this.f30166s, 31), 31), 31, this.f30168u);
        ZonedDateTime zonedDateTime = this.f30169v;
        int i = h1.i((this.f30170w.hashCode() + ((e5 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31)) * 31, this.f30171x, 31);
        String str = this.f30172y;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f30173z;
        int b10 = s0.b(this.B, (this.A.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31);
        StatusState statusState = this.C;
        int hashCode2 = (this.F.hashCode() + x.i.e((this.D.hashCode() + ((b10 + (statusState == null ? 0 : statusState.hashCode())) * 31)) * 31, 31, this.E)) * 31;
        ReviewDecision reviewDecision = this.G;
        int b11 = s0.b(this.H, (hashCode2 + (reviewDecision == null ? 0 : reviewDecision.hashCode())) * 31, 31);
        Integer num = this.I;
        int e10 = x.i.e((b11 + (num == null ? 0 : num.hashCode())) * 31, 31, this.J);
        q qVar = this.K;
        return Integer.hashCode(this.N) + s0.b(this.M, h1.i((e10 + (qVar != null ? qVar.hashCode() : 0)) * 31, this.L, 31), 31);
    }

    public final String toString() {
        StringBuilder o5 = s0.o("ListItemPullRequest(title=", this.f30165r, ", titleHTML=", this.f30166s, ", commentsCount=");
        m0.w(o5, this.f30167t, ", isUnread=", this.f30168u, ", lastUpdatedAt=");
        o5.append(this.f30169v);
        o5.append(", owner=");
        o5.append(this.f30170w);
        o5.append(", id=");
        f1.e.x(o5, this.f30171x, ", url=", this.f30172y, ", labels=");
        o5.append(this.f30173z);
        o5.append(", itemCountColor=");
        o5.append(this.A);
        o5.append(", number=");
        o5.append(this.B);
        o5.append(", status=");
        o5.append(this.C);
        o5.append(", pullRequestStatus=");
        o5.append(this.D);
        o5.append(", isDraft=");
        o5.append(this.E);
        o5.append(", assignees=");
        o5.append(this.F);
        o5.append(", reviewDecision=");
        o5.append(this.G);
        o5.append(", relatedIssuesCount=");
        o5.append(this.H);
        o5.append(", queuePosition=");
        o5.append(this.I);
        o5.append(", isInMergeQueue=");
        o5.append(this.J);
        o5.append(", viewerReviewerReviewStatus=");
        o5.append(this.K);
        o5.append(", stableId=");
        s0.w(this.M, this.L, ", searchResultType=", ", itemType=", o5);
        return s0.l(o5, this.N, ")");
    }

    public c(String str, String str2, int i, boolean z10, ZonedDateTime zonedDateTime, d3 d3Var, String str3, String str4, List list, lg.bShadow bVar, int i10, StatusState statusState, PullRequestState pullRequestState, boolean z11, b0 b0Var, ReviewDecision reviewDecision, int i11, Integer num, boolean z12, q qVar, String str5, int i12, int i13) {
        k71.k.g(pullRequestState, "pullRequestStatus");
        k71.k.g(str5, "stableId");
        this.f30165r = str;
        this.f30166s = str2;
        this.f30167t = i;
        this.f30168u = z10;
        this.f30169v = zonedDateTime;
        this.f30170w = d3Var;
        this.f30171x = str3;
        this.f30172y = str4;
        this.f30173z = list;
        this.A = bVar;
        this.B = i10;
        this.C = statusState;
        this.D = pullRequestState;
        this.E = z11;
        this.F = b0Var;
        this.G = reviewDecision;
        this.H = i11;
        this.I = num;
        this.J = z12;
        this.K = qVar;
        this.L = str5;
        this.M = i12;
        this.N = i13;
    }

    public Object f30165r;

    public Object f30166s;

    public Object f30167t;

    public Object f30168u;

    public Object f30169v;

    public Object f30170w;

    public Object f30171x;

    public Object f30172y;

    public Object f30173z;

    public Object A;

    public Object B;

    public Object C;

    public Object D;

    public Object E;

    public Object F;

    public Object G;

    public Object H;

    public Object I;

    public Object J;

    public Object K;

    public Object L;

    public Object M;

    public Object N;
}
