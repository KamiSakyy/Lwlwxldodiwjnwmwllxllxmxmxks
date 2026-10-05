package py0;

import aa.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d0 implements m0 {
    public final f0 a;

    public d0(f0 f0Var) {
        this.a = f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && k71.k.b(this.a, ((d0) obj).a);
    }

    public final int hashCode() {
        f0 f0Var = this.a;
        if (f0Var == null) {
            return 0;
        }
        return f0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateRepository=" + this.a + ")";
    }
}
