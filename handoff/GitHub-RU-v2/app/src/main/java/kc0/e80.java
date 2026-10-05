package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e80 implements aa.m0 {
    public final k80 a;

    public e80(k80 k80Var) {
        this.a = k80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e80) && k71.k.b(this.a, ((e80) obj).a);
    }

    public final int hashCode() {
        k80 k80Var = this.a;
        if (k80Var == null) {
            return 0;
        }
        return k80Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequest=" + this.a + ")";
    }
}
