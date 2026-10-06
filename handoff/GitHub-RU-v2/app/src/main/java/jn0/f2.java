package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f2 {
    public String a;
    public ap0.i0 b;

    public f2(String str, ap0.i0 i0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return k71.k.b(this.a, f2Var.a) && k71.k.b(this.b, f2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Subject(__typename=" + this.a + ", discussionVotableFragment=" + this.b + ")";
    }
}
