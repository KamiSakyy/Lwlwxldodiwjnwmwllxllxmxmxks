package aa0;

import aa.h0;
import com.github.rudroid.m0;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements h0 {
    public final String a;
    public final boolean b;
    public final ja0.a c;

    public c(String str, boolean z, ja0.a aVar) {
        k.g(str, "__typename");
        this.a = str;
        this.b = z;
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
        return k.b(this.a, cVar.a) && this.b == cVar.b && k.b(this.c, cVar.c);
    }

    public final int hashCode() {
        int e = i.e(this.a.hashCode() * 31, 31, this.b);
        ja0.a aVar = this.c;
        return e + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return no.a.p(m0.o("UpdatableFragment(__typename=", this.a, ", viewerCanUpdate=", ", nodeIdFragment=", this.b), this.c, ")");
    }
    public static final Object a = null;
    public static final Object f = null;
}
