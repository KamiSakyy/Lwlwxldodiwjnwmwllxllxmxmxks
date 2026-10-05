package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 {
    public final s0 a;

    public e0(s0 s0Var) {
        this.a = s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && k71.k.b(this.a, ((e0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Diff(patches=" + this.a + ")";
    }
}
