package np;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public final String a;
    public final String b;
    public final is.k c;

    public d(String str, String str2, is.k kVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = kVar;
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
        StringBuilder o = s0.o("Discussion(__typename=", this.a, ", id=", this.b, ", discussionClosedStateFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public static final Object a = null;
}
