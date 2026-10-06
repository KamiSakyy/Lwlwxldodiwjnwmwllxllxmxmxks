package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pd0 implements aaShadow.m0 {
    public rd0 a;

    public pd0(rd0 rd0Var) {
        this.a = rd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pd0) && k71.k.b(this.a, ((pd0) obj).a);
    }

    public final int hashCode() {
        rd0 rd0Var = this.a;
        if (rd0Var == null) {
            return 0;
        }
        return rd0Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequestReview=" + this.a + ")";
    }
}
