package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ff {
    public String a;
    public String b;
    public bf c;

    public ff(String str, String str2, bf bfVar) {
        this.a = str;
        this.b = str2;
        this.c = bfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff)) {
            return false;
        }
        ff ffVar = (ff) obj;
        return k71.k.b(this.a, ffVar.a) && k71.k.b(this.b, ffVar.b) && k71.k.b(this.c, ffVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        bf bfVar = this.c;
        return i + (bfVar == null ? 0 : bfVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Viewer(__typename=", this.a, ", id=", this.b, ", dashboard=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
