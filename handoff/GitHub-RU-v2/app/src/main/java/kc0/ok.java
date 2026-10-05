package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ok {
    public final String a;
    public final String b;
    public final pk c;

    public ok(String str, String str2, pk pkVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = pkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok)) {
            return false;
        }
        ok okVar = (ok) obj;
        return k71.k.b(this.a, okVar.a) && k71.k.b(this.b, okVar.b) && k71.k.b(this.c, okVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        pk pkVar = this.c;
        return i + (pkVar == null ? 0 : pkVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onPullRequest=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
