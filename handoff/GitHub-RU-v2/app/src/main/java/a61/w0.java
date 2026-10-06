package a61;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w0 implements t0 {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public k41.g a;
    public q51.d b;
    public e61.g c;
    public l d;
    public a71.h e;

    public w0(k41.g gVar, q51.d dVar, e61.g gVar2, l lVar, a71.h hVar) {
        k71.k.g(gVar, "firebaseApp");
        k71.k.g(dVar, "firebaseInstallations");
        k71.k.g(gVar2, "sessionSettings");
        k71.k.g(lVar, "eventGDTLogger");
        k71.k.g(hVar, "backgroundDispatcher");
        this.a = gVar;
        this.b = dVar;
        this.c = gVar2;
        this.d = lVar;
        this.e = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(w0 w0Var, c71.c cVar) {
        v0 v0Var;
        int i;
        boolean z;
        Boolean a;
        if (cVar instanceof v0) {
            v0Var = (v0) cVar;
            int i2 = v0Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v0Var.x = i2 - Integer.MIN_VALUE;
                Object obj = v0Var.v;
                b71.a aVar = b71.a.r;
                i = v0Var.x;
                z = true;
                if (i != 0) {
                    sy.y.j(obj);
                    e61.g gVar = w0Var.c;
                    v0Var.u = w0Var;
                    v0Var.x = 1;
                    if (gVar.b(v0Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    w0Var = v0Var.u;
                    sy.y.j(obj);
                }
                e61.g gVar2 = w0Var.c;
                a = gVar2.a.a();
                if (a == null) {
                    z = a.booleanValue();
                } else {
                    Boolean a2 = gVar2.b.a();
                    if (a2 != null) {
                        z = a2.booleanValue();
                    }
                }
                if (z) {
                    return Boolean.FALSE;
                }
                return f <= w0Var.c.a() ? Boolean.TRUE : Boolean.FALSE;
            }
        }
        v0Var = new v0(w0Var, cVar);
        Object obj2 = v0Var.v;
        b71.a aVar2 = b71.a.r;
        i = v0Var.x;
        z = true;
        if (i != 0) {
        }
        e61.g gVar22 = w0Var.c;
        a = gVar22.a.a();
        if (a == null) {
        }
        if (z) {
        }
    }
}
