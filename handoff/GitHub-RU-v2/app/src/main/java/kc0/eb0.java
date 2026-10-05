package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class eb0 implements aa.v0 {
    public final ib0 a;

    public eb0(ib0 ib0Var) {
        this.a = ib0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb0) && k71.k.b(this.a, ((eb0) obj).a);
    }

    public final int hashCode() {
        ib0 ib0Var = this.a;
        if (ib0Var == null) {
            return 0;
        }
        return ib0Var.hashCode();
    }

    public final String toString() {
        return "Data(user=" + this.a + ")";
    }
}
