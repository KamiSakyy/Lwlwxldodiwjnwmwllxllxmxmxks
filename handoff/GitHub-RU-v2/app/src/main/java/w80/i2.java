package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i2 {
    public final String a;
    public final j2 b;
    public final k2 c;

    public i2(String str, j2 j2Var, k2 k2Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = j2Var;
        this.c = k2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return k71.k.b(this.a, i2Var.a) && k71.k.b(this.b, i2Var.b) && k71.k.b(this.c, i2Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        j2 j2Var = this.b;
        int hashCode2 = (hashCode + (j2Var == null ? 0 : j2Var.hashCode())) * 31;
        k2 k2Var = this.c;
        return hashCode2 + (k2Var != null ? k2Var.hashCode() : 0);
    }

    public final String toString() {
        return "IssueOrPullRequest(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ")";
    }
}
