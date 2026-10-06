package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n1 {
    public final String a;
    public final es.a b;

    public n1(String str, es.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return k71.k.b(this.a, n1Var.a) && k71.k.b(this.b, n1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiffLine(__typename=" + this.a + ", diffLineFragment=" + this.b + ")";
    }
}
