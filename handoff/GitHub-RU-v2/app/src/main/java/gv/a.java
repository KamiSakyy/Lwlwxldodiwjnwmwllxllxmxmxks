package gv;

import m10.py;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final py a;

    public a(py pyVar) {
        this.a = pyVar;
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
    public Object O(Object p1) { return null; }
}
