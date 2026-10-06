package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class le {
    public String a;
    public int b;
    public String c;
    public dw.m3 d;

    public le(String str, int i, String str2, dw.m3 m3Var) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = m3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le)) {
            return false;
        }
        le leVar = (le) obj;
        return k71.k.b(this.a, leVar.a) && this.b == leVar.b && k71.k.b(this.c, leVar.c) && k71.k.b(this.d, leVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(a0.s0.b(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "Node(__typename=", this.a, ", contributorsCount=", ", id=");
        n.append(this.c);
        n.append(", repositoryListItemFragment=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }
}
