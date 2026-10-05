package sd0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g0 {
    public final String a;
    public final eg0.a b;

    public g0(String str, eg0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return k71.k.b(this.a, g0Var.a) && k71.k.b(this.b, g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextFieldFileLine(__typename=" + this.a + ", fileLineFragment=" + this.b + ")";
    }
}
