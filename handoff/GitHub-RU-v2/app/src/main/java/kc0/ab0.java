package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ab0 implements aaShadow.v0 {
    public final bb0 a;

    public ab0(bb0 bb0Var) {
        this.a = bb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ab0) && k71.k.b(this.a, ((ab0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
