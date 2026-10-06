package is;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final String a;
    public final String b;

    public c(String str, String str2) {
        k71.k.g(str2, "__typename");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("ReplyTo(id=", this.a, ", __typename=", this.b, ")");
    }
    public Object b(Object p1) { return null; }
    public static final Object a = null;
    public static final Object f = null;
    public static final Object i = null;
}
