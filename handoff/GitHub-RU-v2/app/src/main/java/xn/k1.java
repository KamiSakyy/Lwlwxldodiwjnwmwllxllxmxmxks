package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k1 extends sy.rShadow {
    public Boolean a;

    public k1(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1) && k71.k.b(this.a, ((k1) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.e(this.a, "BooleanField(default=", ")");
    }
}
