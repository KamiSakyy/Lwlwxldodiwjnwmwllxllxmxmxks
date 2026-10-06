package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q00 {
    public String a;
    public s00 b;
    public v00 c;

    public q00(String str, s00 s00Var, v00 v00Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = s00Var;
        this.c = v00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q00)) {
            return false;
        }
        q00 q00Var = (q00) obj;
        return k71.k.b(this.a, q00Var.a) && k71.k.b(this.b, q00Var.b) && k71.k.b(this.c, q00Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s00 s00Var = this.b;
        int hashCode2 = (hashCode + (s00Var == null ? 0 : s00Var.hashCode())) * 31;
        v00 v00Var = this.c;
        return hashCode2 + (v00Var != null ? v00Var.hashCode() : 0);
    }

    public final String toString() {
        return "IssueOrPullRequest(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ")";
    }
}
