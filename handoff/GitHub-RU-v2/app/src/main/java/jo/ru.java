package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ru {
    public final String a;
    public final String b;
    public final gu c;

    public ru(String str, String str2, gu guVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = guVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru)) {
            return false;
        }
        ru ruVar = (ru) obj;
        return k71.k.b(this.a, ruVar.a) && k71.k.b(this.b, ruVar.b) && k71.k.b(this.c, ruVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        gu guVar = this.c;
        return i + (guVar == null ? 0 : guVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Target1(__typename=", this.a, ", id=", this.b, ", onCommit=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
