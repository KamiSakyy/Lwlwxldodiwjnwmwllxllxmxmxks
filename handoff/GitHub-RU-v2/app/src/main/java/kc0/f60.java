package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f60 implements aaShadow.m0 {
    public h60 a;

    public f60(h60 h60Var) {
        this.a = h60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f60) && k71.k.b(this.a, ((f60) obj).a);
    }

    public final int hashCode() {
        h60 h60Var = this.a;
        if (h60Var == null) {
            return 0;
        }
        return h60Var.hashCode();
    }

    public final String toString() {
        return "Data(updateIssueComment=" + this.a + ")";
    }
}
