package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gj implements aaShadow.m0 {
    public final hj a;

    public gj(hj hjVar) {
        this.a = hjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gj) && k71.k.b(this.a, ((gj) obj).a);
    }

    public final int hashCode() {
        hj hjVar = this.a;
        if (hjVar == null) {
            return 0;
        }
        return hjVar.hashCode();
    }

    public final String toString() {
        return "Data(markFileAsViewed=" + this.a + ")";
    }
}
