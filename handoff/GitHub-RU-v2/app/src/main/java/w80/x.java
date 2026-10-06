package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xShadow {
    public String a;
    public String b;
    public y c;

    public Object x(String str, String str2, y yVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xShadow)) {
            return false;
        }
        xShadow xVar = (xShadow) obj;
        return k71.k.b(this.a, xVar.a) && k71.k.b(this.b, xVar.b) && k71.k.b(this.c, xVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        y yVar = this.c;
        return i + (yVar == null ? 0 : yVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Author(__typename=", this.a, ", login=", this.b, ", onNode=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
