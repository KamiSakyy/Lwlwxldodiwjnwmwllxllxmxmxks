package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kd {
    public String a;
    public String b;
    public hd c;
    public bl0.a d;

    public kd(String str, String str2, hd hdVar, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = hdVar;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd)) {
            return false;
        }
        kd kdVar = (kd) obj;
        return k71.k.b(this.a, kdVar.a) && k71.k.b(this.b, kdVar.b) && k71.k.b(this.c, kdVar.c) && k71.k.b(this.d, kdVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        hd hdVar = this.c;
        int hashCode = (i + (hdVar == null ? 0 : hdVar.hashCode())) * 31;
        bl0.a aVar = this.d;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepoObject(__typename=", this.a, ", oid=", this.b, ", onCommit=");
        o.append(this.c);
        o.append(", nodeIdFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
