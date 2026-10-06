package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ie {
    public final String a;
    public final String b;
    public final ee c;

    public ie(String str, String str2, ee eeVar) {
        this.a = str;
        this.b = str2;
        this.c = eeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie)) {
            return false;
        }
        ie ieVar = (ie) obj;
        return k71.k.b(this.a, ieVar.a) && k71.k.b(this.b, ieVar.b) && k71.k.b(this.c, ieVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ee eeVar = this.c;
        return i + (eeVar == null ? 0 : eeVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Viewer(__typename=", this.a, ", id=", this.b, ", dashboard=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
