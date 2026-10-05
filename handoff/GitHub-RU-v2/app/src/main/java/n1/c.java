package n1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class c extends x61.e implements List, Collection, l71.a {
    public abstract c b(int i, Object obj);

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract c d(Object obj);

    public c e(Collection collection) {
        f f6 = f();
        f6.addAll(collection);
        return f6.d();
    }

    public abstract f f();

    public abstract c g(b bVar);

    public abstract c i(int i);

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract c j(int i, Object obj);

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final List subList(int i, int i10) {
        return new m1.a(this, i, i10);
    }


}
