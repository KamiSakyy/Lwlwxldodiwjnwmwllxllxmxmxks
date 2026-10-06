package na0;

import aa.v0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w implements v0 {
    public a0Shadow a;

    public w(a0Shadow a0Var) {
        this.a = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && k71.k.b(this.a, ((w) obj).a);
    }

    public final int hashCode() {
        a0Shadow a0Var = this.a;
        if (a0Var == null) {
            return 0;
        }
        return a0Var.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
