package ih0;

import gn0.bm;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k {
    public bm a;

    public k(bm bmVar) {
        this.a = bmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.a == ((k) obj).a;
    }

    public final int hashCode() {
        bm bmVar = this.a;
        if (bmVar == null) {
            return 0;
        }
        return bmVar.hashCode();
    }

    public final String toString() {
        return "Configuration(mergeMethod=" + this.a + ")";
    }
}
