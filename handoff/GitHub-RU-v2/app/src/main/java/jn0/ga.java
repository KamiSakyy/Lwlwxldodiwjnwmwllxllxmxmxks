package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ga {
    public final pz0.zs a;

    public ga(pz0.zs zsVar) {
        this.a = zsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ga) && this.a == ((ga) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AutoMergeRequest(mergeMethod=" + this.a + ")";
    }
}
