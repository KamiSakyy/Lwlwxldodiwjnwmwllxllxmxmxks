package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z {
    public final String a;
    public final String b;
    public final String c;

    public z(String str, String str2, String str3) {
        k71.k.g(str, "title");
        k71.k.g(str2, "message");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return k71.k.b(this.a, zVar.a) && k71.k.b(this.b, zVar.b) && k71.k.b(this.c, zVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("ChatMessageAgentConfirmation(title=", this.a, ", message=", this.b, ", confirmation="), this.c, ")");
    }
    public Object c(Object p1) { return null; }
    public Object l(Object p1, Object p2) { return null; }
}
