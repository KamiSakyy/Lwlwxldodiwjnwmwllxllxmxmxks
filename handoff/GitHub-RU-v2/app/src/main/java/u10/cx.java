package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cx {
    public String a;
    public String b;
    public z70.l2 c;

    public cx(String str, String str2, z70.l2 l2Var) {
        this.a = str;
        this.b = str2;
        this.c = l2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx)) {
            return false;
        }
        cx cxVar = (cx) obj;
        return k71.k.b(this.a, cxVar.a) && k71.k.b(this.b, cxVar.b) && k71.k.b(this.c, cxVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnPullRequest(__typename=", this.a, ", id=", this.b, ", pullRequestItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
