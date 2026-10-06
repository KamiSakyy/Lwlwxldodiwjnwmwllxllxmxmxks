package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pa0 {
    public final String a;
    public final String b;
    public final String c;
    public final ud0.a d;

    public pa0(String str, String str2, String str3, ud0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa0)) {
            return false;
        }
        pa0 pa0Var = (pa0) obj;
        return k71.k.b(this.a, pa0Var.a) && k71.k.b(this.b, pa0Var.b) && k71.k.b(this.c, pa0Var.c) && k71.k.b(this.d, pa0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Viewer(__typename=", this.a, ", name=", this.b, ", id=");
        o.append(this.c);
        o.append(", actorFields=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
