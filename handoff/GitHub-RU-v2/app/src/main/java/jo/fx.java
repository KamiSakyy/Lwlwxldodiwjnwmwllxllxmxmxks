package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fx {
    public String a;
    public String b;
    public int c;
    public jx d;

    public fx(String str, String str2, int i, jx jxVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = jxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx)) {
            return false;
        }
        fx fxVar = (fx) obj;
        return k71.k.b(this.a, fxVar.a) && k71.k.b(this.b, fxVar.b) && this.c == fxVar.c && k71.k.b(this.d, fxVar.d);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
        jx jxVar = this.d;
        return b + (jxVar == null ? 0 : jxVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Entry(name=", this.a, ", type=", this.b, ", mode=");
        o.append(this.c);
        o.append(", submodule=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
