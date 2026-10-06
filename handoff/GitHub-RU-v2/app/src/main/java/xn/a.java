package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final String a;
    public final String b;
    public final b c;

    public a(String str, String str2, b bVar) {
        k71.k.g(str, "provider");
        k71.k.g(str2, "type");
        this.a = str;
        this.b = str2;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && k71.k.b(this.b, aVar.b) && k71.k.b(this.c, aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("AgentTaskArtifact(provider=", this.a, ", type=", this.b, ", data=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public Object o(Object p1, Object p2) { return null; }
}
