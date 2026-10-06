package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q0 implements aa.h0 {
    public String a;
    public o0 b;
    public p0 c;

    public q0(String str, o0 o0Var, p0 p0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = o0Var;
        this.c = p0Var;
    }

    public static q0 a(q0 q0Var, o0 o0Var, p0 p0Var) {
        String str = q0Var.a;
        q0Var.getClass();
        k71.k.g(str, "__typename");
        return new q0(str, o0Var, p0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return k71.k.b(this.a, q0Var.a) && k71.k.b(this.b, q0Var.b) && k71.k.b(this.c, q0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o0 o0Var = this.b;
        int hashCode2 = (hashCode + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
        p0 p0Var = this.c;
        return hashCode2 + (p0Var != null ? p0Var.hashCode() : 0);
    }

    public final String toString() {
        return "DiscussionVotableFragment(__typename=" + this.a + ", onDiscussion=" + this.b + ", onDiscussionComment=" + this.c + ")";
    }
}
