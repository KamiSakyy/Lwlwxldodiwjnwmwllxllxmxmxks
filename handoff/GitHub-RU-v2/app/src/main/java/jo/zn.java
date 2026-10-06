package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zn {
    public String a;
    public String b;
    public xn c;

    public zn(String str, String str2, xn xnVar) {
        this.a = str;
        this.b = str2;
        this.c = xnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn)) {
            return false;
        }
        zn znVar = (zn) obj;
        return k71.k.b(this.a, znVar.a) && k71.k.b(this.b, znVar.b) && k71.k.b(this.c, znVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnPullRequest(__typename=", this.a, ", id=", this.b, ", mergeRequirements=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
