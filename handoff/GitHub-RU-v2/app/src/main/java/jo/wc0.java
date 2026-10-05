package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wc0 {
    public final String a;
    public final String b;
    public final String c;
    public final ar.c d;

    public wc0(String str, String str2, String str3, ar.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc0)) {
            return false;
        }
        wc0 wc0Var = (wc0) obj;
        return k71.k.b(this.a, wc0Var.a) && k71.k.b(this.b, wc0Var.b) && k71.k.b(this.c, wc0Var.c) && k71.k.b(this.d, wc0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("IssueComment(__typename=", this.a, ", id=", this.b, ", url=");
        o.append(this.c);
        o.append(", commentFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
