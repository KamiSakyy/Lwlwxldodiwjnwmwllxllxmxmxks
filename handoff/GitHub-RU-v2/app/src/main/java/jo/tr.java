package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tr {
    public String a;
    public es.a b;

    public tr(String str, es.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tr)) {
            return false;
        }
        tr trVar = (tr) obj;
        return k71.k.b(this.a, trVar.a) && k71.k.b(this.b, trVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiffLine1(__typename=" + this.a + ", diffLineFragment=" + this.b + ")";
    }
}
