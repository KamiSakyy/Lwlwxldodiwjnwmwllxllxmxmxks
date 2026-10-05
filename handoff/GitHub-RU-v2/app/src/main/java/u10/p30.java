package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p30 {
    public final o30 a;

    public p30(o30 o30Var) {
        this.a = o30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p30) && k71.k.b(this.a, ((p30) obj).a);
    }

    public final int hashCode() {
        o30 o30Var = this.a;
        if (o30Var == null) {
            return 0;
        }
        return o30Var.hashCode();
    }

    public final String toString() {
        return "UpdateDiscussion(discussion=" + this.a + ")";
    }
}
