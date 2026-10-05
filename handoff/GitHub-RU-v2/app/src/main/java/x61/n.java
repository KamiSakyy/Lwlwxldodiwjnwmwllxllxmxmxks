package x61;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n extends d0 {
    public static int F(Iterable iterable, int i) {
        k71.k.g(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static ArrayList G(Iterable iterable) {
        k71.k.g(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m.J(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    public n(Object... a) {
    }
}
