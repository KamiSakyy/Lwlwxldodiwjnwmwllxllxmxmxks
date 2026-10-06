package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pe {
    public final String a;
    public final String b;
    public final ri0.x0 c;

    public pe(String str, String str2, ri0.x0 x0Var) {
        this.a = str;
        this.b = str2;
        this.c = x0Var;
    }

    public static pe a(pe peVar, ri0.x0 x0Var) {
        String str = peVar.a;
        String str2 = peVar.b;
        peVar.getClass();
        return new pe(str, str2, x0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe)) {
            return false;
        }
        pe peVar = (pe) obj;
        return k71.k.b(this.a, peVar.a) && k71.k.b(this.b, peVar.b) && k71.k.b(this.c, peVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnPullRequest(__typename=", this.a, ", id=", this.b, ", filesPullRequestFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
