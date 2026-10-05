package bm;

import java.util.Comparator;
import java.util.List;
import v2.g0;
import x.y;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                List list = (List) this.b;
                return sy.t.g(((com.github.domain.searchandfilter.filters.data.d) obj).r(list), ((com.github.domain.searchandfilter.filters.data.d) obj2).r(list));
            case 1:
                long longValue = ((Number) obj).longValue();
                y yVar = (y) this.b;
                return sy.t.g(Integer.valueOf(yVar.c(longValue)), Integer.valueOf(yVar.c(((Number) obj2).longValue())));
            case 2:
                int compare = ((Comparator) this.b).compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                return g0.l0.compare(((d3.t) obj).c, ((d3.t) obj2).c);
            case 3:
                int compare2 = ((m) this.b).compare(obj, obj2);
                return compare2 != 0 ? compare2 : sy.t.g(Integer.valueOf(((d3.t) obj).g), Integer.valueOf(((d3.t) obj2).g));
            default:
                ac.c cVar = (ac.c) this.b;
                return sy.t.g((Comparable) cVar.k(obj), (Comparable) cVar.k(obj2));
        }
    }

    public m(Comparator comparator) {
        this.a = 2;
        this.b = comparator;
    }
}
