package r70;

import a0.s0;
import com.github.rudroid.copilot.h1;
import w80.a2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public String a;
    public String b;
    public a2 c;

    public d(String str, String str2, a2 a2Var) {
        this.a = str;
        this.b = str2;
        this.c = a2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && k71.k.b(this.b, dVar.b) && k71.k.b(this.c, dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("OnRepository(__typename=", this.a, ", id=", this.b, ", repositoryListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
