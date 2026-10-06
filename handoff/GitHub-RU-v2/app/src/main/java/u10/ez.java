package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ez {
    public String a;
    public String b;
    public k90.v c;

    public ez(String str, String str2, k90.v vVar) {
        this.a = str;
        this.b = str2;
        this.c = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez)) {
            return false;
        }
        ez ezVar = (ez) obj;
        return k71.k.b(this.a, ezVar.a) && k71.k.b(this.b, ezVar.b) && k71.k.b(this.c, ezVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", shortcutFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
