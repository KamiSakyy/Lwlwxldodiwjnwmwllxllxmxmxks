package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class va0 implements aaShadow.v0 {
    public wa0 a;

    public va0(wa0 wa0Var) {
        this.a = wa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof va0) && k71.k.b(this.a, ((va0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
