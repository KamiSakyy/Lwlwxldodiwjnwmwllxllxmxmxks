package f01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.fileschanged.CommentLevelType;
import com.github.service.models.response.type.DiffLineType;
import com.github.service.models.response.type.PullRequestReviewCommentState;
import java.util.List;
import k71.k;
import x.i;
import yz0.s;
import yz0.x2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g {
    public final CommentLevelType A;
    public final String a;
    public final String b;
    public final String c;
    public final PullRequestReviewCommentState d;
    public final String e;
    public final String f;
    public final DiffLineType g;
    public final String h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final x2 p;
    public final s q;
    public final List r;
    public final boolean s;
    public final Integer t;
    public final Integer u;
    public final DiffLineType v;
    public final DiffLineType w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public g(String str, String str2, String str3, PullRequestReviewCommentState pullRequestReviewCommentState, String str4, String str5, DiffLineType diffLineType, String str6, String str7, boolean z, boolean z2, String str8, boolean z3, boolean z4, boolean z5, x2 x2Var, s sVar, List list, boolean z6, Integer num, Integer num2, DiffLineType diffLineType2, DiffLineType diffLineType3, boolean z7, boolean z8, boolean z9, CommentLevelType commentLevelType) {
        k.g(str, "threadId");
        k.g(str3, "path");
        k.g(pullRequestReviewCommentState, "state");
        k.g(diffLineType, "lineType");
        k.g(str6, "pullRequestId");
        k.g(str7, "headRefOid");
        k.g(str8, "resolvedBy");
        k.g(sVar, "comment");
        k.g(list, "reactions");
        k.g(diffLineType2, "multiLineStartLineType");
        k.g(diffLineType3, "multiLineEndLineType");
        k.g(commentLevelType, "commentLevelType");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = pullRequestReviewCommentState;
        this.e = str4;
        this.f = str5;
        this.g = diffLineType;
        this.h = str6;
        this.i = str7;
        this.j = z;
        this.k = z2;
        this.l = str8;
        this.m = z3;
        this.n = z4;
        this.o = z5;
        this.p = x2Var;
        this.q = sVar;
        this.r = list;
        this.s = z6;
        this.t = num;
        this.u = num2;
        this.v = diffLineType2;
        this.w = diffLineType3;
        this.x = z7;
        this.y = z8;
        this.z = z9;
        this.A = commentLevelType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k.b(this.a, gVar.a) && k.b(this.b, gVar.b) && k.b(this.c, gVar.c) && this.d == gVar.d && k.b(this.e, gVar.e) && k.b(this.f, gVar.f) && this.g == gVar.g && k.b(this.h, gVar.h) && k.b(this.i, gVar.i) && this.j == gVar.j && this.k == gVar.k && k.b(this.l, gVar.l) && this.m == gVar.m && this.n == gVar.n && this.o == gVar.o && k.b(this.p, gVar.p) && k.b(this.q, gVar.q) && k.b(this.r, gVar.r) && this.s == gVar.s && k.b(this.t, gVar.t) && k.b(this.u, gVar.u) && this.v == gVar.v && this.w == gVar.w && this.x == gVar.x && this.y == gVar.y && this.z == gVar.z && this.A == gVar.A;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.d.hashCode() + h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31)) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int e = i.e(f1.e.c(this.r, (this.q.hashCode() + ((this.p.hashCode() + i.e(i.e(i.e(h1.i(i.e(i.e(h1.i(h1.i((this.g.hashCode() + ((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, this.h, 31), this.i, 31), 31, this.j), 31, this.k), this.l, 31), 31, this.m), 31, this.n), 31, this.o)) * 31)) * 31, 31), 31, this.s);
        Integer num = this.t;
        int hashCode4 = (e + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.u;
        return this.A.hashCode() + i.e(i.e(i.e((this.w.hashCode() + ((this.v.hashCode() + ((hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.x), 31, this.y), 31, this.z);
    }

    public final String toString() {
        StringBuilder o = s0.o("ReviewComment(threadId=", this.a, ", reviewId=", this.b, ", path=");
        o.append(this.c);
        o.append(", state=");
        o.append(this.d);
        o.append(", diffLinePositionId=");
        f1.e.x(o, this.e, ", diffLinePositioningId=", this.f, ", lineType=");
        o.append(this.g);
        o.append(", pullRequestId=");
        o.append(this.h);
        o.append(", headRefOid=");
        m0.x(o, this.i, ", viewerCanReply=", this.j, ", threadResolved=");
        m0.z(o, this.k, ", resolvedBy=", this.l, ", viewerCanResolve=");
        m0.A(o, this.m, ", viewerCanUnResolve=", this.n, ", isResolveCollapsed=");
        o.append(this.o);
        o.append(", minimizedState=");
        o.append(this.p);
        o.append(", comment=");
        o.append(this.q);
        o.append(", reactions=");
        o.append(this.r);
        o.append(", viewerCanReact=");
        o.append(this.s);
        o.append(", multiLineStartLine=");
        o.append(this.t);
        o.append(", multiLineEndLine=");
        o.append(this.u);
        o.append(", multiLineStartLineType=");
        o.append(this.v);
        o.append(", multiLineEndLineType=");
        o.append(this.w);
        o.append(", viewerCanBlockFromOrg=");
        o.append(this.x);
        o.append(", viewerCanUnblockFromOrg=");
        m0.A(o, this.y, ", canManage=", this.z, ", commentLevelType=");
        o.append(this.A);
        o.append(")");
        return o.toString();
    }
}
