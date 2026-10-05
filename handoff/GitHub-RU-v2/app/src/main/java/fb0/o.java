package fb0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o {
    public final String a;
    public final String b;
    public final String c;
    public final i0 d;

    public o(String str, String str2, String str3, i0 i0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && k71.k.b(this.b, oVar.b) && k71.k.b(this.c, oVar.c) && k71.k.b(this.d, oVar.d);
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
