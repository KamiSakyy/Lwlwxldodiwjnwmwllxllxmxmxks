package fb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r0 implements aa.v0 {
    public final x0 a;

    public r0(x0 x0Var) {
        this.a = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && k71.k.b(this.a, ((r0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
