package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ij {
    public final String a;
    public final String b;
    public final dw.o c;

    public ij(String str, String str2, dw.o oVar) {
        this.a = str;
        this.b = str2;
        this.c = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij)) {
            return false;
        }
        ij ijVar = (ij) obj;
        return k71.k.b(this.a, ijVar.a) && k71.k.b(this.b, ijVar.b) && k71.k.b(this.c, ijVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", issueTemplateFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
