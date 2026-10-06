package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ru {
    public String a;
    public String b;
    public ur0.p0 c;

    public ru(String str, String str2, ur0.p0 p0Var) {
        this.a = str;
        this.b = str2;
        this.c = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru)) {
            return false;
        }
        ru ruVar = (ru) obj;
        return k71.k.b(this.a, ruVar.a) && k71.k.b(this.b, ruVar.b) && k71.k.b(this.c, ruVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Issue(__typename=", this.a, ", id=", this.b, ", updateIssueStateFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
