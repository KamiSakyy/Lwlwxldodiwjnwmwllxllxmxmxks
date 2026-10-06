package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e9 {
    public hc0.zk a;

    public e9(hc0.zk zkVar) {
        this.a = zkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e9) && this.a == ((e9) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AutoMergeRequest(mergeMethod=" + this.a + ")";
    }
}
