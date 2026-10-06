package ur;

import aa.h0;
import com.github.rudroid.m0;
import jo.f4;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements h0 {
    public final String a;
    public final boolean b;
    public final vx.a c;

    public a(String str, boolean z, vx.a aVar) {
        k.g(str, "__typename");
        this.a = str;
        this.b = z;
        this.c = aVar;
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
        int e = i.e(this.a.hashCode() * 31, 31, this.b);
        vx.a aVar = this.c;
        return e + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return f4.r(m0.o("DeletableFields(__typename=", this.a, ", viewerCanDelete=", ", nodeIdFragment=", this.b), this.c, ")");
    }
    public Object O(Object p1) { return null; }
}
