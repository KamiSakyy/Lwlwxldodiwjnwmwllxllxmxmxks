package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o90 implements aa.m0 {
    public final p90 a;

    public o90(p90 p90Var) {
        this.a = p90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o90) && k71.k.b(this.a, ((o90) obj).a);
    }

    public final int hashCode() {
        p90 p90Var = this.a;
        if (p90Var == null) {
            return 0;
        }
        return p90Var.hashCode();
    }

    public final String toString() {
        return "Data(updateDiscussionComment=" + this.a + ")";
    }
}
