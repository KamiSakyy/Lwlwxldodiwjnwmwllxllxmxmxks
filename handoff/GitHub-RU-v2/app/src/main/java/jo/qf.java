package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qf {
    public String a;
    public String b;
    public jf c;

    public qf(String str, String str2, jf jfVar) {
        this.a = str;
        this.b = str2;
        this.c = jfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf)) {
            return false;
        }
        qf qfVar = (qf) obj;
        return k71.k.b(this.a, qfVar.a) && k71.k.b(this.b, qfVar.b) && k71.k.b(this.c, qfVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        jf jfVar = this.c;
        return i + (jfVar == null ? 0 : jfVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Viewer(__typename=", this.a, ", id=", this.b, ", dashboard=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
