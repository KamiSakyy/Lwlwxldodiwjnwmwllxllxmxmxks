package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w {
    public String a;
    public String b;
    public x c;

    public w(String str, String str2, x xVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return k71.k.b(this.a, wVar.a) && k71.k.b(this.b, wVar.b) && k71.k.b(this.c, wVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        x xVar = this.c;
        return i + (xVar == null ? 0 : xVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onIssue=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
