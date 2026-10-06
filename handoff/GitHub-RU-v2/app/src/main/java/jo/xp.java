package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xp {
    public String a;
    public String b;
    public is.a0Shadow c;

    public xp(String str, String str2, is.a0Shadow a0Var) {
        this.a = str;
        this.b = str2;
        this.c = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp)) {
            return false;
        }
        xp xpVar = (xp) obj;
        return k71.k.b(this.a, xpVar.a) && k71.k.b(this.b, xpVar.b) && k71.k.b(this.c, xpVar.c);
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
