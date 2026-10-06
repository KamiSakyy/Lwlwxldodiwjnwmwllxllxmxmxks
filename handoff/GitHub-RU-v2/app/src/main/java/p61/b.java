package p61;

/* loaded from: /home/user/work/p/classes4.dex */
public class b implements d {
    public static final Object c = new Object();
    public volatile d a;
    public volatile Object b;

    public static d a(d dVar) {
        if (dVar instanceof b) {
            return dVar;
        }
        b bVar = new b();
        bVar.b = c;
        bVar.a = dVar;
        return bVar;
    }

    @Override // v61.a
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.b;
            if (obj == obj3) {
                obj = this.a.get();
                Object obj4 = this.b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }
}
