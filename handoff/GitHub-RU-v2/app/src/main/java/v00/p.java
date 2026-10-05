package v00;

import com.github.service.dotcom.models.response.copilot.serialization.CreateChatThreadResponse;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p extends c71.j implements j71.c {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ v x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(v vVar, a71.c cVar, int i) {
        super(1, cVar);
        this.v = i;
        this.x = vVar;
    }

    public final Object k(Object obj) {
        a71.c cVar = (a71.c) obj;
        switch (this.v) {
            case 0:
                return new p(this.x, cVar, 0).v(w61.a0.a);
            default:
                return new p(this.x, cVar, 1).v(w61.a0.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (r5 == r0) goto L17;
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
                    v vVar = this.x;
                    obj = vVar.u.a(vVar.t, mp.b.class, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return ((CreateChatThreadResponse) obj).a;
                    }
                    sy.y.j(obj);
                }
                this.w = 2;
                obj = ((mp.b) obj).g(this);
                if (obj == aVar) {
                    return aVar;
                }
                return ((CreateChatThreadResponse) obj).a;
            default:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    v vVar2 = this.x;
                    obj = vVar2.u.a(vVar2.t, mp.b.class, this);
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
                Object c = ((mp.b) obj).c(this);
                if (c != aVar2) {
                    return c;
                }
                return aVar2;
        }
    }
}
