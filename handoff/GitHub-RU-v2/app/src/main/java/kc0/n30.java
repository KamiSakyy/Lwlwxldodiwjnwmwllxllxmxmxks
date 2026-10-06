package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n30 implements aaShadow.m0 {
    public o30 a;

    public n30(o30 o30Var) {
        this.a = o30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n30) && k71.k.b(this.a, ((n30) obj).a);
    }

    public final int hashCode() {
        o30 o30Var = this.a;
        if (o30Var == null) {
            return 0;
        }
        return o30Var.hashCode();
    }

    public final String toString() {
        return "Data(unblockUserFromOrganization=" + this.a + ")";
    }
}
