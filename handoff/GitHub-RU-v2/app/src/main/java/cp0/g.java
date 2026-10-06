package cp0;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements h0 {
    public String a;
    public String b;
    public kw0.a c;

    public g(String str, String str2, kw0.a aVar) {
        k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k.b(this.a, gVar.a) && k.b(this.b, gVar.b) && k.b(this.c, gVar.c);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        kw0.a aVar = this.c;
        return i + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return f1.e.n(s0.o("AvatarFragment(__typename=", this.a, ", avatarUrl=", this.b, ", nodeIdFragment="), this.c, ")");
    }
}
