package id0;

import aa.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements m0 {
    public final a a;

    public c(a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && k71.k.b(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        a aVar = this.a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public final String toString() {
        return "Data(closeDiscussion=" + this.a + ")";
    }
    public Object b(Object p1) { return null; }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
}
