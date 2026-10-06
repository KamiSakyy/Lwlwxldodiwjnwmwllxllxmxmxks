package ju;

import aa.h0;
import com.github.rudroid.m0;
import jo.f4Shadow;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements h0 {
    public String a;
    public boolean b;
    public String c;
    public boolean d;
    public vx.a e;

    public a(String str, boolean z, String str2, boolean z2, vx.a aVar) {
        k.g(str, "__typename");
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = z2;
        this.e = aVar;
    }

    public static a a(a aVar, boolean z, String str, int i) {
        String str2 = aVar.a;
        if ((i & 2) != 0) {
            z = aVar.b;
        }
        boolean z2 = aVar.d;
        vx.a aVar2 = aVar.e;
        aVar.getClass();
        k.g(str2, "__typename");
        return new a(str2, z, str, z2, aVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && this.b == aVar.b && k.b(this.c, aVar.c) && this.d == aVar.d && k.b(this.e, aVar.e);
    }

    public final int hashCode() {
        int e = i.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int e2 = i.e((e + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        vx.a aVar = this.e;
        return e2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = m0.o("MinimizableCommentFragment(__typename=", this.a, ", isMinimized=", ", minimizedReason=", this.b);
        m0.x(o, this.c, ", viewerCanMinimize=", this.d, ", nodeIdFragment=");
        return f4Shadow.r(o, this.e, ")");
    }
    public Object O(Object p1) { return null; }
}
