package yq;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public final String a;
    public final String b;
    public final boolean c;
    public final i d;
    public final String e;

    public l(String str, String str2, boolean z, i iVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = iVar;
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
        return k71.k.b(this.a, lVar.a) && k71.k.b(this.b, lVar.b) && this.c == lVar.c && k71.k.b(this.d, lVar.d) && k71.k.b(this.e, lVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Repository2(id=", this.a, ", name=", this.b, ", isPrivate=");
        o.append(this.c);
        o.append(", owner=");
        o.append(this.d);
        o.append(", __typename=");
        return h1.p(o, this.e, ")");
    }
}
