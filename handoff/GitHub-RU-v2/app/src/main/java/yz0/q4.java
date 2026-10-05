package yz0;

import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.type.IssueState;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q4 extends o.b {
    public final String t;
    public final String u;
    public final int v;
    public final IssueState w;
    public final String x;
    public final String y;
    public final CloseReason z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(String str, String str2, int i, IssueState issueState, String str3, String str4, CloseReason closeReason) {
        super(str, true);
        k71.k.g(str, "id");
        k71.k.g(str2, "url");
        k71.k.g(issueState, "state");
        k71.k.g(str3, "repoOwner");
        k71.k.g(str4, "repoName");
        this.t = str;
        this.u = str2;
        this.v = i;
        this.w = issueState;
        this.x = str3;
        this.y = str4;
        this.z = closeReason;
    }

    public final String c() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj;
        return k71.k.b(this.t, q4Var.t) && k71.k.b(this.u, q4Var.u) && this.v == q4Var.v && this.w == q4Var.w && k71.k.b(this.x, q4Var.x) && k71.k.b(this.y, q4Var.y) && this.z == q4Var.z;
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((this.w.hashCode() + a0.s0.b(this.v, com.github.rudroid.copilot.h1.i(this.t.hashCode() * 31, this.u, 31), 31)) * 31, this.x, 31), this.y, 31);
        CloseReason closeReason = this.z;
        return i + (closeReason == null ? 0 : closeReason.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Issue(id=", this.t, ", url=", this.u, ", number=");
        o.append(this.v);
        o.append(", state=");
        o.append(this.w);
        o.append(", repoOwner=");
        f1.e.x(o, this.x, ", repoName=", this.y, ", closeReason=");
        o.append(this.z);
        o.append(")");
        return o.toString();
    }
}
