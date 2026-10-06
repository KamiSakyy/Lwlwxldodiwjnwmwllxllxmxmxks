package s;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: /home/user/work/p/classes.dex */
public class f implements Iterable {

    /* renamed from: r, reason: collision with root package name */
    public c f31381r;

    /* renamed from: s, reason: collision with root package name */
    public c f31382s;

    /* renamed from: t, reason: collision with root package name */
    public final WeakHashMap f31383t = new WeakHashMap();

    /* renamed from: u, reason: collision with root package name */
    public int f31384u = 0;

    public c a(Object obj) {
        c cVar = this.f31381r;
        while (cVar != null && !cVar.f31374r.equals(obj)) {
            cVar = cVar.f31376t;
        }
        return cVar;
    }

    public Object b(Object obj) {
        c a10 = a(obj);
        if (a10 == null) {
            return null;
        }
        this.f31384u--;
        WeakHashMap weakHashMap = this.f31383t;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((e) it.next()).a(a10);
            }
        }
        c cVar = a10.f31377u;
        if (cVar != null) {
            cVar.f31376t = a10.f31376t;
        } else {
            this.f31381r = a10.f31376t;
        }
        c cVar2 = a10.f31376t;
        if (cVar2 != null) {
            cVar2.f31377u = cVar;
        } else {
            this.f31382s = cVar;
        }
        a10.f31376t = null;
        a10.f31377u = null;
        return a10.f31375s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((s.b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f31384u != fVar.f31384u) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it2;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f31381r, this.f31382s, 0);
        this.f31383t.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                sb2.append("]");
                return sb2.toString();
            }
            sb2.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb2.append(", ");
            }
        }
    }
    public static final Object J = null;
}
