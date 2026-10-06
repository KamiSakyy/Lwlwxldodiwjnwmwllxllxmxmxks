package h01;

import a0.s0;
import com.github.rudroid.common.b0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.type.IssueState;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n {
    public String a;
    public String b;
    public int c;
    public IssueType d;
    public CloseReason e;
    public b0 f;
    public int g;
    public IssueState h;
    public String i;
    public String j;
    public p k;
    public String l;

    public n(String str, String str2, int i, IssueType issueType, CloseReason closeReason, b0 b0Var, int i2, IssueState issueState, String str3, String str4, p pVar, String str5) {
        k71.k.g(str, "id");
        k71.k.g(issueState, "state");
        k71.k.g(str3, "repoOwner");
        k71.k.g(str4, "repoName");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = issueType;
        this.e = closeReason;
        this.f = b0Var;
        this.g = i2;
        this.h = issueState;
        this.i = str3;
        this.j = str4;
        this.k = pVar;
        this.l = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.a, nVar.a) && k71.k.b(this.b, nVar.b) && this.c == nVar.c && k71.k.b(this.d, nVar.d) && this.e == nVar.e && k71.k.b(this.f, nVar.f) && this.g == nVar.g && this.h == nVar.h && k71.k.b(this.i, nVar.i) && k71.k.b(this.j, nVar.j) && k71.k.b(this.k, nVar.k) && k71.k.b(this.l, nVar.l);
    }

    public final int hashCode() {
        int b = s0.b(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31);
        IssueType issueType = this.d;
        int hashCode = (b + (issueType == null ? 0 : issueType.hashCode())) * 31;
        CloseReason closeReason = this.e;
        int i = h1.i(h1.i((this.h.hashCode() + s0.b(this.g, (this.f.hashCode() + ((hashCode + (closeReason == null ? 0 : closeReason.hashCode())) * 31)) * 31, 31)) * 31, this.i, 31), this.j, 31);
        p pVar = this.k;
        int hashCode2 = (i + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str = this.l;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("SubIssue(id=", this.a, ", titleHTML=", this.b, ", number=");
        o.append(this.c);
        o.append(", issueType=");
        o.append(this.d);
        o.append(", closeReason=");
        o.append(this.e);
        o.append(", assignees=");
        o.append(this.f);
        o.append(", relatedPullRequestsCount=");
        o.append(this.g);
        o.append(", state=");
        o.append(this.h);
        o.append(", repoOwner=");
        f1.e.x(o, this.i, ", repoName=", this.j, ", subIssueProgress=");
        o.append(this.k);
        o.append(", parentIssueId=");
        o.append(this.l);
        o.append(")");
        return o.toString();
    }
}
