package rc0;

import gn0.jr;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l {
    public final String a;
    public final String b;
    public final j c;
    public final jr d;
    public final String e;

    public l(String str, String str2, j jVar, jr jrVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = jVar;
        this.d = jrVar;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.a, lVar.a) && k71.k.b(this.b, lVar.b) && k71.k.b(this.c, lVar.c) && this.d == lVar.d && k71.k.b(this.e, lVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31;
        jr jrVar = this.d;
        return this.e.hashCode() + ((hashCode + (jrVar == null ? 0 : jrVar.hashCode())) * 31);
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
