package ks0;

import aa.h0;
import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements h0 {
    public final String a;
    public final boolean b;
    public final c c;
    public final b d;
    public final a e;

    public e(String str, boolean z, c cVar, b bVar, a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = z;
        this.c = cVar;
        this.d = bVar;
        this.e = aVar;
    }

    public static e a(e eVar, boolean z, c cVar, b bVar, a aVar) {
        String str = eVar.a;
        k71.k.g(str, "__typename");
        return new e(str, z, cVar, bVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && this.b == eVar.b && k71.k.b(this.c, eVar.c) && k71.k.b(this.d, eVar.d) && k71.k.b(this.e, eVar.e);
    }

    public final int hashCode() {
        int e = x.i.e(this.a.hashCode() * 31, 31, this.b);
        c cVar = this.c;
        int hashCode = (e + (cVar == null ? 0 : cVar.hashCode())) * 31;
        b bVar = this.d;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        a aVar = this.e;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = m0.o("LockableFragment(__typename=", this.a, ", locked=", ", onPullRequest=", this.b);
        o.append(this.c);
        o.append(", onIssue=");
        o.append(this.d);
        o.append(", onDiscussion=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
