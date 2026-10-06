package c7;

import java.util.List;
import sy.d0;
import x61.r;

/* loaded from: /home/user/work/p/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public List f4134a;

    /* renamed from: b, reason: collision with root package name */
    public int f4135b;

    public e(int i, List list) {
        this.f4134a = list;
        this.f4135b = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        StringBuilder o5 = x.i.o("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", i, "', bounds = '");
        o5.append(d0.l(list));
        o5.append("'.");
        throw new IllegalArgumentException(o5.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f4135b == eVar.f4135b && k71.k.b(this.f4134a, eVar.f4134a);
    }

    public final int hashCode() {
        return this.f4134a.hashCode() + (this.f4135b * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.f4135b + ", mergedHistory=" + this.f4134a + ')';
    }

    public e() {
        this(-1, r.r);
    }
}
