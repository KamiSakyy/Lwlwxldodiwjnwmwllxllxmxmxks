package zk;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 {
    public oa.g a;

    public m0(oa.g gVar) {
        k71.k.g(gVar, "service");
        this.a = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (y71.n1.j(r6, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, j71.c cVar, c71.c cVar2) {
        l0 l0Var;
        int i;
        if (cVar2 instanceof l0) {
            l0Var = (l0) cVar2;
            int i2 = l0Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l0Var.y = i2 - Integer.MIN_VALUE;
                Object obj = l0Var.w;
                b71.a aVar = b71.a.r;
                i = l0Var.y;
                if (i != 0) {
                    sy.y.j(obj);
                    z01.f0 f0Var = (z01.f0) this.a.a(jVar);
                    l0Var.u = jVar;
                    l0Var.v = cVar;
                    l0Var.y = 1;
                    obj = f0Var.a(str);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    cVar = l0Var.v;
                    jVar = l0Var.u;
                    sy.y.j(obj);
                }
                y71.y J = b31.b.J((y71.i) obj, jVar, cVar);
                l0Var.u = null;
                l0Var.v = null;
                l0Var.y = 2;
            }
        }
        l0Var = new l0(this, cVar2);
        Object obj2 = l0Var.w;
        b71.a aVar2 = b71.a.r;
        i = l0Var.y;
        if (i != 0) {
        }
        y71.y J2 = b31.b.J((y71.i) obj2, jVar, cVar);
        l0Var.u = null;
        l0Var.v = null;
        l0Var.y = 2;
    }
}
