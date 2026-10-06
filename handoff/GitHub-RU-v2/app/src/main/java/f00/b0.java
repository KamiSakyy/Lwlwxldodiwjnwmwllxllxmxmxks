package f00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 implements aa.h0 {
    public List a;

    public b0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && k71.k.b(this.a, ((b0) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return com.github.rudroid.m0.h("ProjectV2ItemSortValuesFragment(sortValues=", ")", this.a);
    }
}
