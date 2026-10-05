package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ng {
    public final String a;
    public final String b;
    public final og c;

    public ng(String str, String str2, og ogVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = ogVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng)) {
            return false;
        }
        ng ngVar = (ng) obj;
        return k71.k.b(this.a, ngVar.a) && k71.k.b(this.b, ngVar.b) && k71.k.b(this.c, ngVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        og ogVar = this.c;
        return i + (ogVar == null ? 0 : ogVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Object(__typename=", this.a, ", id=", this.b, ", onCommit=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
