package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ic0 implements aa.v0 {
    public final jc0 a;

    public ic0(jc0 jc0Var) {
        this.a = jc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ic0) && k71.k.b(this.a, ((ic0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
