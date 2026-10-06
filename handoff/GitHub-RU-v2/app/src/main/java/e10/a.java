package e10;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public String a;
    public int b;
    public String c;

    public a(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && this.b == aVar.b && k.b(this.c, aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + s0.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return h1.p(s0.n(this.b, "Language(color=", this.a, ", id=", ", name="), this.c, ")");
    }
}
