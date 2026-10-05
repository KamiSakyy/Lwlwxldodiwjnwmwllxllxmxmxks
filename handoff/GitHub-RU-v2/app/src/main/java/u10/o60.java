package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o60 implements aa.m0 {
    public final v60 a;

    public o60(v60 v60Var) {
        this.a = v60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o60) && k71.k.b(this.a, ((o60) obj).a);
    }

    public final int hashCode() {
        v60 v60Var = this.a;
        if (v60Var == null) {
            return 0;
        }
        return v60Var.hashCode();
    }

    public final String toString() {
        return "Data(requestReviews=" + this.a + ")";
    }
}
