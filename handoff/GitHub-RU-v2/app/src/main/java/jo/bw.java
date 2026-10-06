package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bw {
    public final String a;
    public final String b;
    public final String c;
    public final dw d;
    public final dw.e6 e;

    public bw(String str, String str2, String str3, dw dwVar, dw.e6 e6Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dwVar;
        this.e = e6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw)) {
            return false;
        }
        bw bwVar = (bw) obj;
        return k71.k.b(this.a, bwVar.a) && k71.k.b(this.b, bwVar.b) && k71.k.b(this.c, bwVar.c) && k71.k.b(this.d, bwVar.d) && k71.k.b(this.e, bwVar.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        dw dwVar = this.d;
        return this.e.hashCode() + ((i + (dwVar == null ? 0 : dwVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Issue(__typename=", this.a, ", id=", this.b, ", url=");
        o.append(this.c);
        o.append(", parent=");
        o.append(this.d);
        o.append(", subIssueFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
