package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lb0 implements aa.v0 {
    public final nb0 a;
    public final mb0 b;

    public lb0(nb0 nb0Var, mb0 mb0Var) {
        this.a = nb0Var;
        this.b = mb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb0)) {
            return false;
        }
        lb0 lb0Var = (lb0) obj;
        return k71.k.b(this.a, lb0Var.a) && k71.k.b(this.b, lb0Var.b);
    }

    public final int hashCode() {
        nb0 nb0Var = this.a;
        int hashCode = (nb0Var == null ? 0 : nb0Var.hashCode()) * 31;
        mb0 mb0Var = this.b;
        return hashCode + (mb0Var != null ? mb0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Data(user=" + this.a + ", organization=" + this.b + ")";
    }
}
