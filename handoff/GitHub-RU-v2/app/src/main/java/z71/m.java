package z71;

import w61.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class m implements y71.j {
    public final /* synthetic */ x71.h r;
    public final /* synthetic */ int s;

    public m(x71.h hVar, int i) {
        this.r = hVar;
        this.s = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (v71.b0.O(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r5.r.l(r0, r7) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // y71.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        l lVar;
        int i;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i2 = lVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.w = i2 - Integer.MIN_VALUE;
                Object obj2 = lVar.u;
                b71.a aVar = b71.a.r;
                i = lVar.w;
                if (i != 0) {
                    sy.y.j(obj2);
                    x61.u uVar = new x61.u(this.s, obj);
                    lVar.w = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj2);
                        return a0.a;
                    }
                    sy.y.j(obj2);
                }
                lVar.w = 2;
            }
        }
        lVar = new l(this, cVar);
        Object obj22 = lVar.u;
        b71.a aVar2 = b71.a.r;
        i = lVar.w;
        if (i != 0) {
        }
        lVar.w = 2;
    }
}
