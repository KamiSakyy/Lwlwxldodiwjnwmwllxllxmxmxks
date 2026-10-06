package tt0;

import aa.h0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements h0 {
    public final boolean a;
    public final b b;

    public f(boolean z, b bVar) {
        this.a = z;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && k71.k.b(this.b, fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ItemShowcaseFragment(hasPinnedItems=" + this.a + ", items=" + this.b + ")";
    }
}
