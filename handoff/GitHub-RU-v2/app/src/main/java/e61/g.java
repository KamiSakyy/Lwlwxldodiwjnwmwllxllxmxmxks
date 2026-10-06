package e61;

import k71.k;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g {
    public final j a;
    public final j b;

    public g(j jVar, j jVar2) {
        k.g(jVar, "localOverrideSettings");
        k.g(jVar2, "remoteSettings");
        this.a = jVar;
        this.b = jVar2;
    }

    public final double a() {
        Double c = this.a.c();
        if (c != null) {
            double doubleValue = c.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double c2 = this.b.c();
        if (c2 != null) {
            double doubleValue2 = c2.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r6.d(r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(c71.c cVar) {
        f fVar;
        int i;
        g gVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i2 = fVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.x = i2 - Integer.MIN_VALUE;
                Object obj = fVar.v;
                b71.a aVar = b71.a.r;
                i = fVar.x;
                if (i != 0) {
                    y.j(obj);
                    fVar.u = this;
                    fVar.x = 1;
                    if (this.a.d(fVar) != aVar) {
                        gVar = this;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0.a;
                }
                gVar = fVar.u;
                y.j(obj);
                j jVar = gVar.b;
                fVar.u = null;
                fVar.x = 2;
            }
        }
        fVar = new f(this, cVar);
        Object obj2 = fVar.v;
        b71.a aVar2 = b71.a.r;
        i = fVar.x;
        if (i != 0) {
        }
        j jVar2 = gVar.b;
        fVar.u = null;
        fVar.x = 2;
    }
}
