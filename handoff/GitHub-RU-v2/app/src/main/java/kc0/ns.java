package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ns {
    public String a;
    public String b;
    public os c;

    public ns(String str, String str2, os osVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = osVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns)) {
            return false;
        }
        ns nsVar = (ns) obj;
        return k71.k.b(this.a, nsVar.a) && k71.k.b(this.b, nsVar.b) && k71.k.b(this.c, nsVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        os osVar = this.c;
        return i + (osVar == null ? 0 : osVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepository=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
