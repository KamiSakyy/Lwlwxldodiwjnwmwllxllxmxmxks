package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x1 implements aa.h0 {
    public final String a;
    public final Integer b;
    public final String c;

    public x1(Integer num, String str, String str2) {
        this.a = str;
        this.b = num;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return k71.k.b(this.a, x1Var.a) && k71.k.b(this.b, x1Var.b) && k71.k.b(this.c, x1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(com.github.rudroid.copilot.h1.r(this.b, "PullRequestCommentCountFragment(id=", this.a, ", totalCommentsCount=", ", __typename="), this.c, ")");
    }
}
