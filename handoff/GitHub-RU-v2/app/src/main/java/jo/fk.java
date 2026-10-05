package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fk implements aa.m0 {
    public final hk a;

    public fk(hk hkVar) {
        this.a = hkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fk) && k71.k.b(this.a, ((fk) obj).a);
    }

    public final int hashCode() {
        hk hkVar = this.a;
        if (hkVar == null) {
            return 0;
        }
        return hkVar.hashCode();
    }

    public final String toString() {
        return "Data(markDiscussionCommentAsAnswer=" + this.a + ")";
    }
}
