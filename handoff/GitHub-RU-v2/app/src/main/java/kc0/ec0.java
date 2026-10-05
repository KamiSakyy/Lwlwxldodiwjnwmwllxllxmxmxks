package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ec0 implements aa.v0 {
    public final fc0 a;

    public ec0(fc0 fc0Var) {
        this.a = fc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ec0) && k71.k.b(this.a, ((ec0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
