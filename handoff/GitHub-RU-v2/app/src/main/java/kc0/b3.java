package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b3 implements aa.m0 {
    public final z2 a;

    public b3(z2 z2Var) {
        this.a = z2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b3) && k71.k.b(this.a, ((b3) obj).a);
    }

    public final int hashCode() {
        z2 z2Var = this.a;
        if (z2Var == null) {
            return 0;
        }
        return z2Var.hashCode();
    }

    public final String toString() {
        return "Data(blockUserFromOrganization=" + this.a + ")";
    }
}
