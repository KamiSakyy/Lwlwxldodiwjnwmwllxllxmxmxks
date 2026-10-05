package am0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p {
    public final String a;
    public final String b;
    public final String c;
    public final j0 d;

    public p(String str, String str2, String str3, j0 j0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k71.k.b(this.a, pVar.a) && k71.k.b(this.b, pVar.b) && k71.k.b(this.c, pVar.c) && k71.k.b(this.d, pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
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
