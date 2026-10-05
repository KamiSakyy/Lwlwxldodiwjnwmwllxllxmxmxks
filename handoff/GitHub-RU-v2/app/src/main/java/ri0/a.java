package ri0;

import gn0.bm;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public final bm a;

    public a(bm bmVar) {
        this.a = bmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.a == ((a) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AutoMergeRequest(mergeMethod=" + this.a + ")";
    }
}
