package wc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public String a;
    public String b;
    public String c;
    public String d;

    public c(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b) && k71.k.b(this.c, cVar.c) && k71.k.b(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return x.i.k(a0.s0.o("App(id=", this.a, ", name=", this.b, ", logoUrl="), this.c, ", __typename=", this.d, ")");
    }
    public Object b(Object p1) { return null; }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object f = null;
    public static final Object i = null;
    public static final Object k = null;
}
