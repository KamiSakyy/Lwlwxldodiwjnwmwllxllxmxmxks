package gy0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g0 {
    public final a0 a;

    public g0(a0 a0Var) {
        this.a = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && k71.k.b(this.a, ((g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnProjectV2View(groups=" + this.a + ")";
    }
}
