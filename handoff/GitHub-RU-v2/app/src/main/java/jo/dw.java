package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dw {
    public final String a;
    public final String b;
    public final dw.z6 c;

    public dw(String str, String str2, dw.z6 z6Var) {
        this.a = str;
        this.b = str2;
        this.c = z6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw)) {
            return false;
        }
        dw dwVar = (dw) obj;
        return k71.k.b(this.a, dwVar.a) && k71.k.b(this.b, dwVar.b) && k71.k.b(this.c, dwVar.c);
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
