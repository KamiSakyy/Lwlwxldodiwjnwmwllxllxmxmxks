package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k20 {
    public final aa1.b a;
    public final String b;
    public final String c;

    public k20(String str, String str2) {
        k71.k.g(str, "issueId");
        k71.k.g(str2, "subIssueId");
        this.a = aa.t0.d;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k20)) {
            return false;
        }
        k20 k20Var = (k20) obj;
        return k71.k.b(this.a, k20Var.a) && k71.k.b(this.b, k20Var.b) && k71.k.b(this.c, k20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemoveSubIssueInput(clientMutationId=");
        sb.append(this.a);
        sb.append(", issueId=");
        sb.append(this.b);
        sb.append(", subIssueId=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
