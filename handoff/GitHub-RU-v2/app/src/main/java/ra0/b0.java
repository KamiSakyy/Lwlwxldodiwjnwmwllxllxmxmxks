package ra0;

import aa.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 implements m0 {
    public final f0 a;

    public b0(f0 f0Var) {
        this.a = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && k71.k.b(this.a, ((b0) obj).a);
    }

    public final int hashCode() {
        f0 f0Var = this.a;
        if (f0Var == null) {
            return 0;
        }
        return f0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateUserListsForItem=" + this.a + ")";
    }
}
