package m00;

import aa.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 implements m0 {
    public final e0 a;

    public c0(e0 e0Var) {
        this.a = e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && k71.k.b(this.a, ((c0) obj).a);
    }

    public final int hashCode() {
        e0 e0Var = this.a;
        if (e0Var == null) {
            return 0;
        }
        return e0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateRepository=" + this.a + ")";
    }
}
