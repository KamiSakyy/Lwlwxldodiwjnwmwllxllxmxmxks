package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f0 {
    public final t0 a;

    public f0(t0 t0Var) {
        this.a = t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && k71.k.b(this.a, ((f0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Diff(patches=" + this.a + ")";
    }
}
