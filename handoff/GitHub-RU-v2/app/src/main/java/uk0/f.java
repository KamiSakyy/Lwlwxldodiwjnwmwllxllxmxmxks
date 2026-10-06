package uk0;

import aa.v0;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements v0 {
    public h a;

    public f(h hVar) {
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && k.b(this.a, ((f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
