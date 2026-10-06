package uw0;

import aa.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements m0 {
    public b a;

    public c(b bVar) {
        this.a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && k71.k.b(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        b bVar = this.a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "Data(createUserList=" + this.a + ")";
    }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object i = null;
    public static final Object k = null;
    public static final Object l = null;
}
