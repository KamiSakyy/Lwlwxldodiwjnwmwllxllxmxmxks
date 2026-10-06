package yx0;

import aa.v0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements v0 {
    public final e a;
    public final String b;
    public final String c;

    public b(e eVar, String str, String str2) {
        this.a = eVar;
        this.b = str;
        this.c = str2;
    }

    public static b a(b bVar, e eVar) {
        String str = bVar.b;
        String str2 = bVar.c;
        bVar.getClass();
        return new b(eVar, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b) && k71.k.b(this.c, bVar.c);
    }

    public final int hashCode() {
        e eVar = this.a;
        return this.c.hashCode() + h1.i((eVar == null ? 0 : eVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(node=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
