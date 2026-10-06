package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gu {
    public final String a;
    public final String b;
    public final uu0.d6 c;

    public gu(String str, String str2, uu0.d6 d6Var) {
        this.a = str;
        this.b = str2;
        this.c = d6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu)) {
            return false;
        }
        gu guVar = (gu) obj;
        return k71.k.b(this.a, guVar.a) && k71.k.b(this.b, guVar.b) && k71.k.b(this.c, guVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Parent(__typename=", this.a, ", id=", this.b, ", subIssueProgressFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
