package r9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
public final class o implements Iterable, l71.a {

    /* renamed from: s, reason: collision with root package name */
    public static final o f31323s = new o(x61.s.r);

    /* renamed from: r, reason: collision with root package name */
    public final Map f31324r;

    public o(Map map) {
        this.f31324r = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return k71.k.b(this.f31324r, ((o) obj).f31324r);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31324r.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f31324r;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            arrayList.add(new w61.k(str, (Object) null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.f31324r + ')';
    }
}
