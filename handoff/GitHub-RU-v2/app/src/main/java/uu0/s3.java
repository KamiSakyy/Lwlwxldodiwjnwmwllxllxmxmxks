package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s3 {
    public String a;
    public t3 b;
    public u3 c;

    public s3(String str, t3 t3Var, u3 u3Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = t3Var;
        this.c = u3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        return k71.k.b(this.a, s3Var.a) && k71.k.b(this.b, s3Var.b) && k71.k.b(this.c, s3Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        t3 t3Var = this.b;
        int hashCode2 = (hashCode + (t3Var == null ? 0 : t3Var.hashCode())) * 31;
        u3 u3Var = this.c;
        return hashCode2 + (u3Var != null ? u3Var.hashCode() : 0);
    }

    public final String toString() {
        return "IssueOrPullRequest(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ")";
    }
}
