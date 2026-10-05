package v00;

import com.github.service.dotcom.models.response.copilot.SteerAgentTaskRequest;
import xn.a4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w extends c71.j implements j71.c {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ g0 x;
    public final /* synthetic */ String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(g0 g0Var, String str, a71.c cVar, int i) {
        super(1, cVar);
        this.v = i;
        this.x = g0Var;
        this.y = str;
    }

    public final Object k(Object obj) {
        a71.c cVar = (a71.c) obj;
        switch (this.v) {
            case 0:
                return new w(this.x, this.y, cVar, 0).v(w61.a0.a);
            case 1:
                return new w(this.x, this.y, cVar, 1).v(w61.a0.a);
            default:
                return new w(this.x, this.y, cVar, 2).v(w61.a0.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (r5 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        if (r5 == r0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    g0 g0Var = this.x;
                    obj = g0Var.t.a(g0Var.s, mp.c.class, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    sy.y.j(obj);
                }
                SteerAgentTaskRequest w = sy.p.w(a4.a);
                this.w = 2;
                if (((mp.c) obj).a(this.y, w, this) == aVar) {
                    return aVar;
                }
                return w61.a0.a;
            case 1:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    g0 g0Var2 = this.x;
                    obj = g0Var2.t.a(g0Var2.s, mp.c.class, this);
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return obj;
                    }
                    sy.y.j(obj);
                }
                this.w = 2;
                Object e = ((mp.c) obj).e(this.y, this);
                if (e != aVar2) {
                    return e;
                }
                return aVar2;
            default:
                b71.a aVar3 = b71.a.r;
                int i3 = this.w;
                if (i3 == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    g0 g0Var3 = this.x;
                    obj = g0Var3.t.a(g0Var3.s, mp.c.class, this);
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return obj;
                    }
                    sy.y.j(obj);
                }
                this.w = 2;
                Object d = ((mp.c) obj).d(this.y, this);
                if (d != aVar3) {
                    return d;
                }
                return aVar3;
        }
    }
}
