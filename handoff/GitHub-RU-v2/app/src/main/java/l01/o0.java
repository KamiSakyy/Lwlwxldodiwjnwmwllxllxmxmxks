package l01;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o0 {
    public final ArrayList a;
    public final boolean b;

    public o0(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.a.equals(o0Var.a) && this.b == o0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProjectViewGroupedItemsCollection(groups=" + this.a + ", hasNextPage=" + this.b + ")";
    }
}
