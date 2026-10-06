package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class np {
    public final String a;
    public final String b;
    public final cp c;

    public np(String str, String str2, cp cpVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = cpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np)) {
            return false;
        }
        np npVar = (np) obj;
        return k71.k.b(this.a, npVar.a) && k71.k.b(this.b, npVar.b) && k71.k.b(this.c, npVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        cp cpVar = this.c;
        return i + (cpVar == null ? 0 : cpVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Target1(__typename=", this.a, ", id=", this.b, ", onCommit=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
