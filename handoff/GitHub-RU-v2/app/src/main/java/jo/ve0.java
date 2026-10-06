package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ve0 implements aaShadow.m0 {
    public ye0 a;

    public ve0(ye0 ye0Var) {
        this.a = ye0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ve0) && k71.k.b(this.a, ((ve0) obj).a);
    }

    public final int hashCode() {
        ye0 ye0Var = this.a;
        if (ye0Var == null) {
            return 0;
        }
        return ye0Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequest=" + this.a + ")";
    }
}
