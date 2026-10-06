package uw;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public String a;
    public a b;
    public b c;

    public c(String str, a aVar, b bVar) {
        k.g(str, "__typename");
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
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && k.b(this.c, cVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.a.hashCode())) * 31;
        b bVar = this.c;
        return hashCode2 + (bVar != null ? bVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "UnderlyingContext(__typename=" + this.a + ", onCheckRun=" + this.b + ", onStatusContext=" + this.c + ")";
    }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object f = null;
    public static final Object i = null;
    public Object b(Object, Object) { return null; }
    public Object b(Object, Object) { return null; }
    public Object b(Object, Object) { return null; }
}
