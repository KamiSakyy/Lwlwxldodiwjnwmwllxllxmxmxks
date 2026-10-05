package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b7 {
    public final String a;
    public final es.a b;

    public b7(String str, es.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7)) {
            return false;
        }
        b7 b7Var = (b7) obj;
        return k71.k.b(this.a, b7Var.a) && k71.k.b(this.b, b7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiffLine(__typename=" + this.a + ", diffLineFragment=" + this.b + ")";
    }
}
