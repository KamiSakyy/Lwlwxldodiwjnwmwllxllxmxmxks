package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class iv {
    public final String a;
    public final String b;
    public final int c;
    public final mv d;

    public iv(String str, String str2, int i, mv mvVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = mvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv)) {
            return false;
        }
        iv ivVar = (iv) obj;
        return k71.k.b(this.a, ivVar.a) && k71.k.b(this.b, ivVar.b) && this.c == ivVar.c && k71.k.b(this.d, ivVar.d);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
        mv mvVar = this.d;
        return b + (mvVar == null ? 0 : mvVar.a.hashCode());
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
