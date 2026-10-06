package d01;

import java.util.ArrayList;
import x01.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public ArrayList a;

    public a(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a) || !this.a.equals(((a) obj).a)) {
            return false;
        }
        i iVar = i.d;
        return iVar.equals(iVar);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (((Boolean.hashCode(false) * 31) + 0) * 31) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExploreRecommendationPaged(recommendations=" + this.a + ", page=" + i.d + ")";
    }
}
