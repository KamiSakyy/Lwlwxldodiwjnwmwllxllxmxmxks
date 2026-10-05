package p41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements p51.b {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile p51.b b;

    public k(p51.b bVar) {
        this.b = bVar;
    }

    @Override // p51.b
    public final Object get() {
        Object obj;
        Object obj2 = this.a;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.a;
                if (obj == obj3) {
                    obj = this.b.get();
                    this.a = obj;
                    this.b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
