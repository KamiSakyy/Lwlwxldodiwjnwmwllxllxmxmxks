package dl0;

import aa.v0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k0 implements v0 {
    public o0 a;

    public k0(o0 o0Var) {
        this.a = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && k71.k.b(this.a, ((k0) obj).a);
    }

    public final int hashCode() {
        o0 o0Var = this.a;
        if (o0Var == null) {
            return 0;
        }
        return o0Var.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
