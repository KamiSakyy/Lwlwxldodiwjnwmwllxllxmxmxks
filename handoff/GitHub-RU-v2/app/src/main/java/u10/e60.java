package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e60 implements aa.m0 {
    public final k60 a;

    public e60(k60 k60Var) {
        this.a = k60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e60) && k71.k.b(this.a, ((e60) obj).a);
    }

    public final int hashCode() {
        k60 k60Var = this.a;
        if (k60Var == null) {
            return 0;
        }
        return k60Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequest=" + this.a + ")";
    }
}
