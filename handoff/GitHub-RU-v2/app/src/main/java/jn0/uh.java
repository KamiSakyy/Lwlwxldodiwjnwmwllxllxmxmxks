package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class uh {
    public final String a;
    public final String b;
    public final ur0.o c;

    public uh(String str, String str2, ur0.o oVar) {
        this.a = str;
        this.b = str2;
        this.c = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh)) {
            return false;
        }
        uh uhVar = (uh) obj;
        return k71.k.b(this.a, uhVar.a) && k71.k.b(this.b, uhVar.b) && k71.k.b(this.c, uhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnIssue(__typename=", this.a, ", id=", this.b, ", issueListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
