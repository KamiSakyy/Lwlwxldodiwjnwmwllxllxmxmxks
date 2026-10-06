package ow0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public final String a;
    public final String b;
    public final d c;
    public final e d;

    public c(String str, String str2, d dVar, e eVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = dVar;
        this.d = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b) && k71.k.b(this.c, cVar.c) && k71.k.b(this.d, cVar.d);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        d dVar = this.c;
        int hashCode = (i + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e eVar = this.d;
        return hashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onIssue=");
        o.append(this.c);
        o.append(", onPullRequest=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
    public Object a(Object p1) { return null; }
    public Object b(Object p1) { return null; }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object i = null;
}
