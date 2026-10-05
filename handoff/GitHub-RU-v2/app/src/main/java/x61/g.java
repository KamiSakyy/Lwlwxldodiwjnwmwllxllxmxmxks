package x61;

import java.util.AbstractList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g extends AbstractList implements List, l71.c {
    public abstract int a();

    public abstract Object b(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return b(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
