package vn0;

import pz0.py;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r {
    public final String a;
    public final String b;
    public final n c;
    public final py d;
    public final String e;

    public r(String str, String str2, n nVar, py pyVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = nVar;
        this.d = pyVar;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b) && k71.k.b(this.c, rVar.c) && this.d == rVar.d && k71.k.b(this.e, rVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31;
        py pyVar = this.d;
        return this.e.hashCode() + ((hashCode + (pyVar == null ? 0 : pyVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(id=", this.a, ", name=", this.b, ", owner=");
        o.append(this.c);
        o.append(", viewerPermission=");
        o.append(this.d);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
}
