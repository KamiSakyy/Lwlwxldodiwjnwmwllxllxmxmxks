package yw;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import k71.k;
import m10.ya0;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements h0 {
    public final String a;
    public final String b;
    public final ya0 c;
    public final boolean d;
    public final a e;

    public b(String str, String str2, ya0 ya0Var, boolean z, a aVar) {
        k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = ya0Var;
        this.d = z;
        this.e = aVar;
    }

    public static b a(b bVar, ya0 ya0Var, a aVar, int i) {
        String str = bVar.a;
        String str2 = bVar.b;
        if ((i & 4) != 0) {
            ya0Var = bVar.c;
        }
        ya0 ya0Var2 = ya0Var;
        boolean z = bVar.d;
        if ((i & 16) != 0) {
            aVar = bVar.e;
        }
        k.g(str, "__typename");
        return new b(str, str2, ya0Var2, z, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && k.b(this.e, bVar.e);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        ya0 ya0Var = this.c;
        int e = i.e((i + (ya0Var == null ? 0 : ya0Var.hashCode())) * 31, 31, this.d);
        a aVar = this.e;
        return e + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("SubscribableFragment(__typename=", this.a, ", id=", this.b, ", viewerSubscription=");
        o.append(this.c);
        o.append(", viewerCanSubscribe=");
        o.append(this.d);
        o.append(", onRepository=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
