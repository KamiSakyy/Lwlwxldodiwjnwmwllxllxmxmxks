package ox0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q {
    public String a;
    public String b;
    public String c;
    public k0 d;

    public q(String str, String str2, String str3, k0 k0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.a, qVar.a) && k71.k.b(this.b, qVar.b) && k71.k.b(this.c, qVar.c) && k71.k.b(this.d, qVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnRelease(id=", this.a, ", tagName=", this.b, ", url=");
        o.append(this.c);
        o.append(", repository=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
