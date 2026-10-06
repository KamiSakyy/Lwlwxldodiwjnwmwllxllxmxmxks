package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hu {
    public String a;
    public String b;
    public iu c;

    public hu(String str, String str2, iu iuVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = iuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu)) {
            return false;
        }
        hu huVar = (hu) obj;
        return k71.k.b(this.a, huVar.a) && k71.k.b(this.b, huVar.b) && k71.k.b(this.c, huVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        iu iuVar = this.c;
        return i + (iuVar == null ? 0 : iuVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepository=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
