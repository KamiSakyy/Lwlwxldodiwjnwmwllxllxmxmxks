package yu;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public String a;
    public es.a b;

    public a(String str, es.a aVar) {
        k71.k.g(str, "__typename");
        k71.k.g(aVar, "diffLineFragment");
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && k71.k.b(this.b, aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiffLine(__typename=" + this.a + ", diffLineFragment=" + this.b + ")";
    }
    public Object O(Object p1) { return null; }
}
