package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tc0 implements aa.v0 {
    public final xc0 a;

    public tc0(xc0 xc0Var) {
        this.a = xc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tc0) && k71.k.b(this.a, ((tc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
