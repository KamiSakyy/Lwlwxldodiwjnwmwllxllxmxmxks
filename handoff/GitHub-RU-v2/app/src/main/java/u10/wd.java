package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wd {
    public String a;
    public String b;
    public z70.w0 c;

    public wd(String str, String str2, z70.w0 w0Var) {
        this.a = str;
        this.b = str2;
        this.c = w0Var;
    }

    public static wd a(wd wdVar, z70.w0 w0Var) {
        String str = wdVar.a;
        String str2 = wdVar.b;
        wdVar.getClass();
        return new wd(str, str2, w0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd)) {
            return false;
        }
        wd wdVar = (wd) obj;
        return k71.k.b(this.a, wdVar.a) && k71.k.b(this.b, wdVar.b) && k71.k.b(this.c, wdVar.c);
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
