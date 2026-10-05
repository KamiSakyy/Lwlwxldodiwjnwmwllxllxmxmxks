package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r50 implements aa.m0 {
    public final s50 a;

    public r50(s50 s50Var) {
        this.a = s50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r50) && k71.k.b(this.a, ((r50) obj).a);
    }

    public final int hashCode() {
        s50 s50Var = this.a;
        if (s50Var == null) {
            return 0;
        }
        return s50Var.hashCode();
    }

    public final String toString() {
        return "Data(updateDiscussionComment=" + this.a + ")";
    }
}
