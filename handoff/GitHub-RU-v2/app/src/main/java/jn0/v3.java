package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v3 implements aaShadow.v0 {
    public final List a;
    public final String b;
    public final String c;

    public v3(String str, String str2, List list) {
        this.a = list;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj;
        return k71.k.b(this.a, v3Var.a) && k71.k.b(this.b, v3Var.b) && k71.k.b(this.c, v3Var.c);
    }

    public final int hashCode() {
        List list = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((list == null ? 0 : list.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(com.github.rudroid.m0.n("Data(mobileCapabilities=", ", id=", this.b, ", __typename=", this.a), this.c, ")");
    }
}
