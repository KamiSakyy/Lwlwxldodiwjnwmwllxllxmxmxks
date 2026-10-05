package z70;

import hc0.zk;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final zk a;

    public a(zk zkVar) {
        this.a = zkVar;
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
