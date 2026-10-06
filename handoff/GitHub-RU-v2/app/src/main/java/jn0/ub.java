package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ub {
    public String a;
    public String b;
    public ar0.a0 c;

    public ub(String str, String str2, ar0.a0 a0Var) {
        this.a = str;
        this.b = str2;
        this.c = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub)) {
            return false;
        }
        ub ubVar = (ub) obj;
        return k71.k.b(this.a, ubVar.a) && k71.k.b(this.b, ubVar.b) && k71.k.b(this.c, ubVar.c);
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
