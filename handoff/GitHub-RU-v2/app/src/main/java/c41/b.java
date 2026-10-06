package c41;

/* loaded from: /home/user/work/p/classes4.dex */
public class b implements c {
    public static final Object t = new Object();
    public volatile c r;
    public volatile Object s;

    public static c a(c cVar) {
        if (cVar instanceof b) {
            return cVar;
        }
        b bVar = new b();
        bVar.s = t;
        bVar.r = cVar;
        return bVar;
    }

    @Override // c41.c
    public final Object c() {
        Object obj;
        Object obj2 = this.s;
        Object obj3 = t;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.s;
                if (obj == obj3) {
                    obj = this.r.c();
                    Object obj4 = this.s;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.s = obj;
                    this.r = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
