package oe;

import a0.s0;
import com.github.rudroid.common.b0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.type.IssueState;
import h01.p;
import java.time.ZonedDateTime;
import java.util.List;
import le.v;
import yz0.d3;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements v, k {
    public final List A;
    public final lg.b B;
    public final int C;
    public final IssueState D;
    public final b0 E;
    public final int F;
    public final CloseReason G;
    public final IssueType H;
    public final p I;
    public final String J;
    public final z01.p K;
    public final String L;
    public final int M;
    public final int N;

    /* renamed from: r, reason: collision with root package name */
    public final String f30156r;

    /* renamed from: s, reason: collision with root package name */
    public final String f30157s;

    /* renamed from: t, reason: collision with root package name */
    public final int f30158t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f30159u;

    /* renamed from: v, reason: collision with root package name */
    public final ZonedDateTime f30160v;

    /* renamed from: w, reason: collision with root package name */
    public final d3 f30161w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f30162x;

    /* renamed from: y, reason: collision with root package name */
    public final String f30163y;

    /* renamed from: z, reason: collision with root package name */
    public final String f30164z;

    public /* synthetic */ a(String str, String str2, int i, boolean z10, ZonedDateTime zonedDateTime, d3 d3Var, boolean z11, String str3, String str4, List list, lg.b bVar, int i10, IssueState issueState, b0 b0Var, int i11, CloseReason closeReason, IssueType issueType, p pVar, String str5, z01.p pVar2, String str6, int i12) {
        this(str, str2, i, z10, zonedDateTime, d3Var, z11, str3, str4, list, bVar, i10, issueState, b0Var, i11, closeReason, (i12 & 65536) != 0 ? null : issueType, (i12 & 131072) != 0 ? null : pVar, (i12 & 262144) != 0 ? null : str5, (i12 & 524288) != 0 ? null : pVar2, str6, 4, 4);
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.f30156r, aVar.f30156r) && k71.k.b(this.f30157s, aVar.f30157s) && this.f30158t == aVar.f30158t && this.f30159u == aVar.f30159u && k71.k.b(this.f30160v, aVar.f30160v) && k71.k.b(this.f30161w, aVar.f30161w) && this.f30162x == aVar.f30162x && k71.k.b(this.f30163y, aVar.f30163y) && k71.k.b(this.f30164z, aVar.f30164z) && k71.k.b(this.A, aVar.A) && this.B == aVar.B && this.C == aVar.C && this.D == aVar.D && k71.k.b(this.E, aVar.E) && this.F == aVar.F && this.G == aVar.G && k71.k.b(this.H, aVar.H) && k71.k.b(this.I, aVar.I) && k71.k.b(this.J, aVar.J) && k71.k.b(this.K, aVar.K) && k71.k.b(this.L, aVar.L) && this.M == aVar.M && this.N == aVar.N;
    }

    @Override // le.v
    public final int h() {
        return this.N;
    }

    public final int hashCode() {
        int i = h1.i(x.i.e((this.f30161w.hashCode() + m0.a(this.f30160v, x.i.e(s0.b(this.f30158t, h1.i(this.f30156r.hashCode() * 31, this.f30157s, 31), 31), 31, this.f30159u), 31)) * 31, 31, this.f30162x), this.f30163y, 31);
        String str = this.f30164z;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.A;
        int b10 = s0.b(this.F, (this.E.hashCode() + ((this.D.hashCode() + s0.b(this.C, (this.B.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31)) * 31)) * 31, 31);
        CloseReason closeReason = this.G;
        int hashCode2 = (b10 + (closeReason == null ? 0 : closeReason.hashCode())) * 31;
        IssueType issueType = this.H;
        int hashCode3 = (hashCode2 + (issueType == null ? 0 : issueType.hashCode())) * 31;
        p pVar = this.I;
        int hashCode4 = (hashCode3 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str2 = this.J;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        z01.p pVar2 = this.K;
        return Integer.hashCode(this.N) + s0.b(this.M, h1.i((hashCode5 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31, this.L, 31), 31);
    }

    public final String toString() {
        StringBuilder o5 = s0.o("ListItemIssue(title=", this.f30156r, ", titleHTML=", this.f30157s, ", itemCount=");
        m0.w(o5, this.f30158t, ", isUnread=", this.f30159u, ", lastUpdatedAt=");
        o5.append(this.f30160v);
        o5.append(", owner=");
        o5.append(this.f30161w);
        o5.append(", repositoryIsPrivate=");
        m0.z(o5, this.f30162x, ", id=", this.f30163y, ", url=");
        o5.append(this.f30164z);
        o5.append(", labels=");
        o5.append(this.A);
        o5.append(", itemCountColor=");
        o5.append(this.B);
        o5.append(", number=");
        o5.append(this.C);
        o5.append(", state=");
        o5.append(this.D);
        o5.append(", assignees=");
        o5.append(this.E);
        o5.append(", relatedPullRequestsCount=");
        o5.append(this.F);
        o5.append(", closeReason=");
        o5.append(this.G);
        o5.append(", issueType=");
        o5.append(this.H);
        o5.append(", subIssueProgress=");
        o5.append(this.I);
        o5.append(", parentIssueId=");
        o5.append(this.J);
        o5.append(", duplicateOf=");
        o5.append(this.K);
        o5.append(", stableId=");
        s0.w(this.M, this.L, ", searchResultType=", ", itemType=", o5);
        return s0.l(o5, this.N, ")");
    }

    public a(String str, String str2, int i, boolean z10, ZonedDateTime zonedDateTime, d3 d3Var, boolean z11, String str3, String str4, List list, lg.b bVar, int i10, IssueState issueState, b0 b0Var, int i11, CloseReason closeReason, IssueType issueType, p pVar, String str5, z01.p pVar2, String str6, int i12, int i13) {
        k71.k.g(issueState, "state");
        k71.k.g(str6, "stableId");
        this.f30156r = str;
        this.f30157s = str2;
        this.f30158t = i;
        this.f30159u = z10;
        this.f30160v = zonedDateTime;
        this.f30161w = d3Var;
        this.f30162x = z11;
        this.f30163y = str3;
        this.f30164z = str4;
        this.A = list;
        this.B = bVar;
        this.C = i10;
        this.D = issueState;
        this.E = b0Var;
        this.F = i11;
        this.G = closeReason;
        this.H = issueType;
        this.I = pVar;
        this.J = str5;
        this.K = pVar2;
        this.L = str6;
        this.M = i12;
        this.N = i13;
    }
}
