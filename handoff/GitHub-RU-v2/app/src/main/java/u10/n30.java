package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n30 implements aaShadow.m0 {
    public final p30 a;

    public n30(p30 p30Var) {
        this.a = p30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n30) && k71.k.b(this.a, ((n30) obj).a);
    }

    public final int hashCode() {
        p30 p30Var = this.a;
        if (p30Var == null) {
            return 0;
        }
        return p30Var.hashCode();
    }

    public final String toString() {
        return "Data(updateDiscussion=" + this.a + ")";
    }
}
