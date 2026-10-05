package at0;

import aa.h0;
import com.github.rudroid.m0;
import f1.e;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements h0 {
    public final String a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final kw0.a e;

    public a(String str, boolean z, String str2, boolean z2, kw0.a aVar) {
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
        kw0.a aVar2 = aVar.e;
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
        kw0.a aVar = this.e;
        return e2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = m0.o("MinimizableCommentFragment(__typename=", this.a, ", isMinimized=", ", minimizedReason=", this.b);
        m0.x(o, this.c, ", viewerCanMinimize=", this.d, ", nodeIdFragment=");
        return e.n(o, this.e, ")");
    }
}
