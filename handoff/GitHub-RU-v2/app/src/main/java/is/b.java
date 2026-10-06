package is;

import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public String a;
    public String b;
    public vx.a c;

    public b(String str, String str2, vx.a aVar) {
        k71.k.g(str, "__typename");
        k71.k.g(str2, "login");
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b) && k71.k.b(this.c, bVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        vx.a aVar = this.c;
        return i + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return f4.r(a0.s0.o("AnswerChosenBy(__typename=", this.a, ", login=", this.b, ", nodeIdFragment="), this.c, ")");
    }
}
