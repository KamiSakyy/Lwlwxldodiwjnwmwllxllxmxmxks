package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yu {
    public String a;
    public String b;
    public zu c;

    public yu(String str, String str2, zu zuVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = zuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu)) {
            return false;
        }
        yu yuVar = (yu) obj;
        return k71.k.b(this.a, yuVar.a) && k71.k.b(this.b, yuVar.b) && k71.k.b(this.c, yuVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        zu zuVar = this.c;
        return i + (zuVar == null ? 0 : zuVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepository=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
