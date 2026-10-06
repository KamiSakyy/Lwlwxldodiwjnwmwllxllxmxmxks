package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sv {
    public String a;
    public String b;
    public tv c;

    public sv(String str, String str2, tv tvVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = tvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv)) {
            return false;
        }
        sv svVar = (sv) obj;
        return k71.k.b(this.a, svVar.a) && k71.k.b(this.b, svVar.b) && k71.k.b(this.c, svVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        tv tvVar = this.c;
        return i + (tvVar == null ? 0 : tvVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepository=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
