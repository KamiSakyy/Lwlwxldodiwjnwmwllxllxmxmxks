package ct;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final a a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;

    public b(a aVar, String str, boolean z, String str2, String str3) {
        this.a = aVar;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b) && this.c == bVar.c && k71.k.b(this.d, bVar.d) && k71.k.b(this.e, bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + h1.i(x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(owner=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", isPrivate=");
        com.github.rudroid.m0.z(sb, this.c, ", id=", this.d, ", __typename=");
        return h1.p(sb, this.e, ")");
    }
}
