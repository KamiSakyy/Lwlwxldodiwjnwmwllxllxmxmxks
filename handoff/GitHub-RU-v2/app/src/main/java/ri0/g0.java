package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g0 {
    public String a;
    public qf0.a b;

    public g0(String str, qf0.a aVar) {
        k71.k.g(str, "__typename");
        k71.k.g(aVar, "diffLineFragment");
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
        return "DiffLine(__typename=" + this.a + ", diffLineFragment=" + this.b + ")";
    }
}
