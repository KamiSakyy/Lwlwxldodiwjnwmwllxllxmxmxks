package li0;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import gn0.dl;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements h0 {
    public String a;
    public String b;
    public dl c;
    public int d;
    public String e;

    public a(String str, String str2, dl dlVar, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = dlVar;
        this.d = i;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && k.b(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + s0.b(this.d, (this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ProjectFragment(id=", this.a, ", name=", this.b, ", state=");
        o.append(this.c);
        o.append(", number=");
        o.append(this.d);
        o.append(", __typename=");
        return h1.p(o, this.e, ")");
    }
}
