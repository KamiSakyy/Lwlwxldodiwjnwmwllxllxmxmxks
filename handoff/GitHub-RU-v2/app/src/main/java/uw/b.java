package uw;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public class b {
    public String a;

    public b(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && k.b(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnStatusContext(id=", this.a, ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
