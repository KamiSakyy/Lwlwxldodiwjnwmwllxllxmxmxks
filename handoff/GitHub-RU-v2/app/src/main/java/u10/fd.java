package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fd {
    public final String a;
    public final String b;
    public final gd c;

    public fd(String str, String str2, gd gdVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = gdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd)) {
            return false;
        }
        fd fdVar = (fd) obj;
        return k71.k.b(this.a, fdVar.a) && k71.k.b(this.b, fdVar.b) && k71.k.b(this.c, fdVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        gd gdVar = this.c;
        return i + (gdVar == null ? 0 : gdVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Object(__typename=", this.a, ", id=", this.b, ", onCommit=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
