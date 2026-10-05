package g70;

import aa.h0;
import com.github.rudroid.m0;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements h0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final ja0.a d;

    public a(String str, boolean z, boolean z2, ja0.a aVar) {
        k.g(str, "__typename");
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = aVar;
    }

    public static a a(a aVar, boolean z, boolean z2) {
        String str = aVar.a;
        ja0.a aVar2 = aVar.d;
        aVar.getClass();
        k.g(str, "__typename");
        return new a(str, z, z2, aVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && k.b(this.d, aVar.d);
    }

    public final int hashCode() {
        int e = i.e(i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ja0.a aVar = this.d;
        return e + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = m0.o("OrgBlockableFragment(__typename=", this.a, ", viewerCanBlockFromOrg=", ", viewerCanUnblockFromOrg=", this.b);
        o.append(this.c);
        o.append(", nodeIdFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
