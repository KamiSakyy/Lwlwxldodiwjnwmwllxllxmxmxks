package yi;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements k, l {
    public static final d Companion = new d();
    public final Object a;
    public final Object b;

    public e(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a.equals(eVar.a) && this.b.equals(eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AliveProjectDenormalizedMessage(affectedIds=" + this.a + ", affectedModels=" + this.b + ")";
    }
}
