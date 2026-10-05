package ld0;

import aa.v0;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements v0 {
    public final f a;

    public c(f fVar) {
        this.a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && k.b(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        f fVar = this.a;
        if (fVar == null) {
            return 0;
        }
        return fVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
