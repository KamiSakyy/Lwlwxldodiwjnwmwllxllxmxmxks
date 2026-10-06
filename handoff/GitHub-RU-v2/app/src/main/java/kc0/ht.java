package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ht {
    public String a;
    public String b;
    public jt c;

    public ht(String str, String str2, jt jtVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = jtVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht)) {
            return false;
        }
        ht htVar = (ht) obj;
        return k71.k.b(this.a, htVar.a) && k71.k.b(this.b, htVar.b) && k71.k.b(this.c, htVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        jt jtVar = this.c;
        return i + (jtVar == null ? 0 : jtVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepository=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
