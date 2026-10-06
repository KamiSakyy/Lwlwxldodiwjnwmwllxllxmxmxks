package kr0;

import aa.h0;
import com.github.rudroid.m0;
import k71.k;
import pz0.g7;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements h0 {
    public final String a;
    public final boolean b;
    public final g7 c;

    public a(String str, boolean z, g7 g7Var) {
        this.a = str;
        this.b = z;
        this.c = g7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + i.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder o = m0.o("FeedFiltersFragment(name=", this.a, ", isEnabled=", ", filterGroup=", this.b);
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
