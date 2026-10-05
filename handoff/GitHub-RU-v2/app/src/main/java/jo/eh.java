package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class eh {
    public final String a;
    public final String b;
    public final gv.h1 c;

    public eh(String str, String str2, gv.h1 h1Var) {
        this.a = str;
        this.b = str2;
        this.c = h1Var;
    }

    public static eh a(eh ehVar, gv.h1 h1Var) {
        String str = ehVar.a;
        String str2 = ehVar.b;
        ehVar.getClass();
        return new eh(str, str2, h1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh)) {
            return false;
        }
        eh ehVar = (eh) obj;
        return k71.k.b(this.a, ehVar.a) && k71.k.b(this.b, ehVar.b) && k71.k.b(this.c, ehVar.c);
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
