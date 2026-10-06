package ud0;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import jo.f4Shadow;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements h0 {
    public String a;
    public String b;
    public bl0.a c;

    public c(String str, String str2, bl0.a aVar) {
        k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && k.b(this.c, cVar.c);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        bl0.a aVar = this.c;
        return i + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return f4Shadow.q(s0.o("AvatarFragment(__typename=", this.a, ", avatarUrl=", this.b, ", nodeIdFragment="), this.c, ")");
    }
    public static final Object a = null;
}
