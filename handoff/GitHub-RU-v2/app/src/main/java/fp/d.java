package fp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public final String a;
    public final String b;
    public final e c;

    public d(String str, String str2, e eVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && k71.k.b(this.b, dVar.b) && k71.k.b(this.c, dVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        e eVar = this.c;
        return i + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onPullRequest=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public Object ordinal() { return null; }
}
