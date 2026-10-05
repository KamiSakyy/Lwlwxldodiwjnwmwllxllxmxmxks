package androidx.compose.runtime;

/* loaded from: /home/user/work/p/classes.dex */
public final class i implements a71.g, a3 {

    /* renamed from: s, reason: collision with root package name */
    public static final a5.i f1668s = new a5.i(9);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ i f1669t = new i(1);

    /* renamed from: u, reason: collision with root package name */
    public static final i f1670u = new i(2);

    /* renamed from: v, reason: collision with root package name */
    public static final i f1671v = new i(3);

    /* renamed from: w, reason: collision with root package name */
    public static final i f1672w = new i(4);

    /* renamed from: x, reason: collision with root package name */
    public static final i f1673x = new i(5);

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1674r;

    public /* synthetic */ i(int i) {
        this.f1674r = i;
    }

    public static final void b(i iVar) {
        y71.y1 y1Var;
        m1.e eVar;
        p1.b bVar;
        y71.y1 y1Var2 = i2.A;
        do {
            y1Var = i2.A;
            eVar = (m1.e) y1Var.getValue();
            bVar = (p1.b) eVar;
            o1.c cVar = bVar.f30333t;
            p1.a aVar = (p1.a) cVar.get(iVar);
            if (aVar != null) {
                Object obj = aVar.f30328a;
                Object obj2 = aVar.f30329b;
                o1.m mVar = cVar.f29907r;
                o1.m v4 = mVar.v(iVar != null ? iVar.hashCode() : 0, iVar, 0);
                if (mVar != v4) {
                    cVar = v4 == null ? o1.c.f29906t : new o1.c(v4, cVar.f29908s - 1);
                }
                q1.b bVar2 = q1.b.f30817a;
                if (obj != bVar2) {
                    Object obj3 = cVar.get(obj);
                    k71.k.d(obj3);
                    cVar = cVar.b(obj, new p1.a(((p1.a) obj3).f30328a, obj2));
                }
                if (obj2 != bVar2) {
                    Object obj4 = cVar.get(obj2);
                    k71.k.d(obj4);
                    cVar = cVar.b(obj2, new p1.a(obj, ((p1.a) obj4).f30329b));
                }
                Object obj5 = obj != bVar2 ? bVar.f30331r : obj2;
                if (obj2 != bVar2) {
                    obj = bVar.f30332s;
                }
                bVar = new p1.b(obj5, obj, cVar);
            }
            if (eVar == bVar) {
                return;
            }
        } while (!y1Var.i(eVar, bVar));
    }

    @Override // androidx.compose.runtime.a3
    public boolean a(Object obj, Object obj2) {
        switch (this.f1674r) {
            case 2:
                return false;
            case 3:
                return obj == obj2;
            default:
                return k71.k.b(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f1674r) {
            case 2:
                return "NeverEqualPolicy";
            case 3:
                return "ReferentialEqualityPolicy";
            case 4:
            case 6:
            default:
                return super.toString();
            case 5:
                return "StructuralEqualityPolicy";
            case 7:
                return "Empty";
        }
    }
}
