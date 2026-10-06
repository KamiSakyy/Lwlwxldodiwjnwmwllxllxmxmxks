package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s5 {
    public final o5 a;
    public final String b;

    public s5(o5 o5Var, String str) {
        this.a = o5Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5)) {
            return false;
        }
        s5 s5Var = (s5) obj;
        return k71.k.b(this.a, s5Var.a) && k71.k.b(this.b, s5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnCommit(history=" + this.a + ", id=" + this.b + ")";
    }
}
