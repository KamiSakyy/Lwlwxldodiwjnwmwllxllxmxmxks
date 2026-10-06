package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ur {
    public String a;
    public es.a b;

    public ur(String str, es.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur)) {
            return false;
        }
        ur urVar = (ur) obj;
        return k71.k.b(this.a, urVar.a) && k71.k.b(this.b, urVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiffLine(__typename=" + this.a + ", diffLineFragment=" + this.b + ")";
    }
}
