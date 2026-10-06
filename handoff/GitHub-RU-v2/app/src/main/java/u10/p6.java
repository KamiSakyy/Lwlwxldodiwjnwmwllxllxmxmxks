package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p6 implements aaShadow.m0 {
    public o6 a;

    public p6(o6 o6Var) {
        this.a = o6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p6) && k71.k.b(this.a, ((p6) obj).a);
    }

    public final int hashCode() {
        o6 o6Var = this.a;
        if (o6Var == null) {
            return 0;
        }
        return o6Var.hashCode();
    }

    public final String toString() {
        return "Data(createPullRequest=" + this.a + ")";
    }
}
