package v00;

import fa1.q0;
import retrofit2.HttpException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d0 extends c71.j implements j71.c {
    public int v;
    public final /* synthetic */ g0 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, String str, int i, int i2, a71.c cVar) {
        super(1, cVar);
        this.w = g0Var;
        this.x = str;
        this.y = i;
        this.z = i2;
    }

    public final Object k(Object obj) {
        int i = this.y;
        int i2 = this.z;
        return new d0(this.w, this.x, i, i2, (a71.c) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r5 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (r5 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            this.v = 1;
            g0 g0Var = this.w;
            obj = g0Var.t.a(g0Var.s, mp.c.class, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                q0 q0Var = (q0) obj;
                if (q0Var.a.H) {
                    return q0Var;
                }
                throw new HttpException(q0Var);
            }
            sy.y.j(obj);
        }
        this.v = 2;
        obj = ((mp.c) obj).b(this.x, this.y, this.z, this);
    }
}
