package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hd0 implements aaShadow.m0 {
    public kd0 a;

    public hd0(kd0 kd0Var) {
        this.a = kd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hd0) && k71.k.b(this.a, ((hd0) obj).a);
    }

    public final int hashCode() {
        kd0 kd0Var = this.a;
        if (kd0Var == null) {
            return 0;
        }
        return kd0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateIssue=" + this.a + ")";
    }
}
