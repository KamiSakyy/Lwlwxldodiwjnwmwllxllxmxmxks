package yz0;

import com.github.service.models.response.discussions.type.DiscussionStateReason;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o4 extends o.b {
    public String t;
    public String u;
    public boolean v;
    public int w;
    public String x;
    public String y;
    public DiscussionStateReason z;

    public o4(String str, String str2, boolean z, int i, String str3, String str4, DiscussionStateReason discussionStateReason) {
        super(str, true);
        this.t = str;
        this.u = str2;
        this.v = z;
        this.w = i;
        this.x = str3;
        this.y = str4;
        this.z = discussionStateReason;
    }

    public final String c() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4)) {
            return false;
        }
        o4 o4Var = (o4) obj;
        return k71.k.b(this.t, o4Var.t) && k71.k.b(this.u, o4Var.u) && this.v == o4Var.v && this.w == o4Var.w && k71.k.b(this.x, o4Var.x) && k71.k.b(this.y, o4Var.y) && this.z == o4Var.z;
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(a0.s0.b(this.w, x.i.e(com.github.rudroid.copilot.h1.i(this.t.hashCode() * 31, this.u, 31), 31, this.v), 31), this.x, 31), this.y, 31);
        DiscussionStateReason discussionStateReason = this.z;
        return i + (discussionStateReason == null ? 0 : discussionStateReason.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Discussion(id=", this.t, ", url=", this.u, ", isAnswered=");
        com.github.rudroid.m0.y(o, this.v, ", number=", this.w, ", repoOwner=");
        f1.e.x(o, this.x, ", repoName=", this.y, ", stateReason=");
        o.append(this.z);
        o.append(")");
        return o.toString();
    }
}
