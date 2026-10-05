package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class eg {
    public final String a;
    public final String b;
    public final cq.u2 c;

    public eg(String str, String str2, cq.u2 u2Var) {
        this.a = str;
        this.b = str2;
        this.c = u2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg)) {
            return false;
        }
        eg egVar = (eg) obj;
        return k71.k.b(this.a, egVar.a) && k71.k.b(this.b, egVar.b) && k71.k.b(this.c, egVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Organization(__typename=", this.a, ", id=", this.b, ", organizationNameAndAvatar=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
