package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ow {
    public final String a;
    public final String b;
    public final ct.w0 c;

    public ow(String str, String str2, ct.w0 w0Var) {
        this.a = str;
        this.b = str2;
        this.c = w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow)) {
            return false;
        }
        ow owVar = (ow) obj;
        return k71.k.b(this.a, owVar.a) && k71.k.b(this.b, owVar.b) && k71.k.b(this.c, owVar.c);
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
