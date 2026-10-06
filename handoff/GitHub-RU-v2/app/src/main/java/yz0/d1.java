package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d1 {
    public int a;
    public String b;
    public String c;

    public d1(String str, int i, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return this.a == d1Var.a && k71.k.b(this.b, d1Var.b) && k71.k.b(this.c, d1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(Integer.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(x.i.n(this.a, "DiscussionsOverview(discussionsCount=", ", repoOwner=", this.b, ", repoName="), this.c, ")");
    }
}
