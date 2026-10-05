package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fx {
    public final String a;
    public final String b;
    public final String c;
    public final ex d;

    public fx(String str, String str2, String str3, ex exVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = exVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx)) {
            return false;
        }
        fx fxVar = (fx) obj;
        return k71.k.b(this.a, fxVar.a) && k71.k.b(this.b, fxVar.b) && k71.k.b(this.c, fxVar.c) && k71.k.b(this.d, fxVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        ex exVar = this.d;
        return i + (exVar == null ? 0 : exVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", name=", this.b, ", id=");
        o.append(this.c);
        o.append(", pinnedIssues=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
