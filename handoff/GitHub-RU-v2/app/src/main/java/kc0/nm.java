package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nm {
    public String a;
    public String b;
    public uf0.a0 c;

    public nm(String str, String str2, uf0.a0 a0Var) {
        this.a = str;
        this.b = str2;
        this.c = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm)) {
            return false;
        }
        nm nmVar = (nm) obj;
        return k71.k.b(this.a, nmVar.a) && k71.k.b(this.b, nmVar.b) && k71.k.b(this.c, nmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Discussion(__typename=", this.a, ", id=", this.b, ", discussionDetailsFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
