package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hg {
    public final String a;
    public final String b;
    public final xt0.x0 c;

    public hg(String str, String str2, xt0.x0 x0Var) {
        this.a = str;
        this.b = str2;
        this.c = x0Var;
    }

    public static hg a(hg hgVar, xt0.x0 x0Var) {
        String str = hgVar.a;
        String str2 = hgVar.b;
        hgVar.getClass();
        return new hg(str, str2, x0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg)) {
            return false;
        }
        hg hgVar = (hg) obj;
        return k71.k.b(this.a, hgVar.a) && k71.k.b(this.b, hgVar.b) && k71.k.b(this.c, hgVar.c);
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
