package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class db0 implements aaShadow.m0 {
    public hb0 a;

    public db0(hb0 hb0Var) {
        this.a = hb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof db0) && k71.k.b(this.a, ((db0) obj).a);
    }

    public final int hashCode() {
        hb0 hb0Var = this.a;
        if (hb0Var == null) {
            return 0;
        }
        return hb0Var.hashCode();
    }

    public final String toString() {
        return "Data(unmarkFileAsViewed=" + this.a + ")";
    }
}
