package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class db {
    public m10.py a;

    public db(m10.py pyVar) {
        this.a = pyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof db) && this.a == ((db) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AutoMergeRequest(mergeMethod=" + this.a + ")";
    }
}
