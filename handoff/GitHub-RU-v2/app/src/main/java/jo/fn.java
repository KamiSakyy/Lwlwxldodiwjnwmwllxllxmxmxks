package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fn {
    public String a;
    public String b;
    public gn c;

    public fn(String str, String str2, gn gnVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = gnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn)) {
            return false;
        }
        fn fnVar = (fn) obj;
        return k71.k.b(this.a, fnVar.a) && k71.k.b(this.b, fnVar.b) && k71.k.b(this.c, fnVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        gn gnVar = this.c;
        return i + (gnVar == null ? 0 : gnVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepository=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
