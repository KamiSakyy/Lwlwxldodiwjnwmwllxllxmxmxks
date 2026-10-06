package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sx {
    public String a;
    public String b;
    public ea0.c1 c;

    public sx(String str, String str2, ea0.c1 c1Var) {
        this.a = str;
        this.b = str2;
        this.c = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx)) {
            return false;
        }
        sx sxVar = (sx) obj;
        return k71.k.b(this.a, sxVar.a) && k71.k.b(this.b, sxVar.b) && k71.k.b(this.c, sxVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnUser(__typename=", this.a, ", id=", this.b, ", userListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
