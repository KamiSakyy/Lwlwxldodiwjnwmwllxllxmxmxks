package a40;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public final String a;
    public final String b;
    public final boolean c;
    public final h d;
    public final String e;

    public k(String str, String str2, boolean z, h hVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = hVar;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && k71.k.b(this.b, kVar.b) && this.c == kVar.c && k71.k.b(this.d, kVar.d) && k71.k.b(this.e, kVar.e);
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
