package s71;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public AtomicReference f31723a;

    public a(h hVar) {
        this.f31723a = new AtomicReference(hVar);
    }

    @Override // s71.h
    public final Iterator iterator() {
        h hVar = (h) this.f31723a.getAndSet(null);
        if (hVar != null) {
            return hVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
