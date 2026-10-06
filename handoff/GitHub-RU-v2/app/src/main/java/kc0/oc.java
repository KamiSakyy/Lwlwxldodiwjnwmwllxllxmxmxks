package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oc {
    public List a;
    public String b;
    public String c;

    public oc(String str, String str2, List list) {
        this.a = list;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc)) {
            return false;
        }
        oc ocVar = (oc) obj;
        return k71.k.b(this.a, ocVar.a) && k71.k.b(this.b, ocVar.b) && k71.k.b(this.c, ocVar.c);
    }

    public final int hashCode() {
        List list = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((list == null ? 0 : list.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(com.github.rudroid.m0.n("Patch(diffLines=", ", id=", this.b, ", __typename=", this.a), this.c, ")");
    }
}
