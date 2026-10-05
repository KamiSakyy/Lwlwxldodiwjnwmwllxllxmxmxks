package k41;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements b21.b {
    public static final AtomicReference a = new AtomicReference();

    @Override // b21.b
    public final void a(boolean z) {
        synchronized (g.k) {
            try {
                ArrayList arrayList = new ArrayList(g.l.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    g gVar = (g) obj;
                    if (gVar.e.get()) {
                        Iterator it = gVar.i.iterator();
                        while (it.hasNext()) {
                            g gVar2 = ((d) it.next()).a;
                            if (!z) {
                                ((n51.d) gVar2.h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
