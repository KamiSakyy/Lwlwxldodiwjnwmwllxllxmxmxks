package wi0;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g {
    public final String a;
    public final String b;
    public final k c;
    public final ud0.c d;

    public g(String str, String str2, k kVar, ud0.c cVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = kVar;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && k71.k.b(this.b, gVar.b) && k71.k.b(this.c, gVar.c) && k71.k.b(this.d, gVar.d);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        k kVar = this.c;
        return this.d.hashCode() + ((i + (kVar == null ? 0 : kVar.a.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Author(__typename=", this.a, ", login=", this.b, ", onUser=");
        o.append(this.c);
        o.append(", avatarFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
