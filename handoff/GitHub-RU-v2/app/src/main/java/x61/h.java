package x61;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h extends AbstractSet implements Set, l71.f {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
