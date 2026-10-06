package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d4 implements aaShadow.v0 {
    public final List a;
    public final String b;
    public final String c;

    public d4(String str, String str2, List list) {
        this.a = list;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) obj;
        return k71.k.b(this.a, d4Var.a) && k71.k.b(this.b, d4Var.b) && k71.k.b(this.c, d4Var.c);
    }

    public final int hashCode() {
        List list = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((list == null ? 0 : list.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(com.github.rudroid.m0.n("Data(mobileCapabilities=", ", id=", this.b, ", __typename=", this.a), this.c, ")");
    }
}
