package wk0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements aa.h0 {
    public final a a;
    public final String b;
    public final String c;

    public c(a aVar, String str, String str2) {
        this.a = aVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b) && k71.k.b(this.c, cVar.c);
    }

    public final int hashCode() {
        a aVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((aVar == null ? 0 : aVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeNavLinks(dashboard=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
    public Object b(Object p1) { return null; }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object f = null;
    public static final Object i = null;
    public static final Object k = null;
}
