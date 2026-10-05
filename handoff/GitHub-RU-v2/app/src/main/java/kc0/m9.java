package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m9 {
    public final gn0.bm a;

    public m9(gn0.bm bmVar) {
        this.a = bmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m9) && this.a == ((m9) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AutoMergeRequest(mergeMethod=" + this.a + ")";
    }
}
