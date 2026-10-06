package yd0;

import aa.h0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements h0 {
    public final String a;
    public final a b;
    public final b c;

    public c(String str, a aVar, b bVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b) && k71.k.b(this.c, cVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.c;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "AssignableFragment(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ")";
    }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object i = null;
}
