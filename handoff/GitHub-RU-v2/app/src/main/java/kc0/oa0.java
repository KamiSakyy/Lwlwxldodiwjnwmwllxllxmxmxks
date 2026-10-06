package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oa0 implements aaShadow.v0 {
    public pa0 a;

    public oa0(pa0 pa0Var) {
        this.a = pa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oa0) && k71.k.b(this.a, ((oa0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
