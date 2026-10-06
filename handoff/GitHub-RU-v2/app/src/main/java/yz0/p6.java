package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p6 extends s7 {
    public String a;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public ZonedDateTime g;

    public p6(String str, String str2, int i, String str3, String str4, String str5, ZonedDateTime zonedDateTime) {
        k71.k.g(str2, "actorDisplayName");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj;
        return k71.k.b(this.a, p6Var.a) && k71.k.b(this.b, p6Var.b) && this.c == p6Var.c && k71.k.b(this.d, p6Var.d) && k71.k.b(this.e, p6Var.e) && k71.k.b(this.f, p6Var.f) && k71.k.b(this.g, p6Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31), this.e, 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("TimelineIssueConvertedToDiscussionEvent(id=", this.a, ", actorDisplayName=", this.b, ", discussionNumber=");
        x.i.r(this.c, ", discussionTitle=", this.d, ", repoOwner=", o);
        f1.e.x(o, this.e, ", repoName=", this.f, ", createdAt=");
        return com.github.rudroid.copilot.h1.q(o, this.g, ")");
    }
}
