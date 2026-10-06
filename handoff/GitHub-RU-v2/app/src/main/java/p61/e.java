package p61;

/* loaded from: /home/user/work/p/classes4.dex */
public class e implements d {
    public static final Object c = new Object();
    public volatile d a;
    public volatile Object b;

    public static d a(d dVar) {
        if ((dVar instanceof e) || (dVar instanceof b)) {
            return dVar;
        }
        e eVar = new e();
        eVar.b = c;
        eVar.a = dVar;
        return eVar;
    }

    @Override // v61.a
    public final Object get() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        d dVar = this.a;
        if (dVar == null) {
            return this.b;
        }
        Object obj2 = dVar.get();
        this.b = obj2;
        this.a = null;
        return obj2;
    }
}
