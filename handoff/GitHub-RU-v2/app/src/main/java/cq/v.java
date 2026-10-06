package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v {
    public String a;
    public String b;
    public l0 c;

    public v(String str, String str2, l0 l0Var) {
        this.a = str;
        this.b = str2;
        this.c = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return k71.k.b(this.a, vVar.a) && k71.k.b(this.b, vVar.b) && k71.k.b(this.c, vVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Discussion(__typename=", this.a, ", id=", this.b, ", discussionFeedFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
