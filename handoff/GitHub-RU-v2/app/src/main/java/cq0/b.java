package cq0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public String a;
    public String b;
    public String c;
    public y d;

    public b(String str, String str2, String str3, y yVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b) && k71.k.b(this.c, bVar.c) && k71.k.b(this.d, bVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        y yVar = this.d;
        return hashCode + (yVar != null ? yVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Author(__typename=", this.a, ", avatarUrl=", this.b, ", name=");
        o.append(this.c);
        o.append(", user=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
