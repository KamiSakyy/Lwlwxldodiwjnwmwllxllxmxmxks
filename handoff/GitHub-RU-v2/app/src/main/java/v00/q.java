package v00;

import com.github.service.dotcom.models.response.copilot.serialization.PatchThreadNameInput;
import com.github.service.dotcom.models.response.copilot.serialization.PatchThreadNameResponse;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q extends c71.j implements j71.c {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ v x;
    public final /* synthetic */ String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(v vVar, String str, a71.c cVar, int i) {
        super(1, cVar);
        this.v = i;
        this.x = vVar;
        this.y = str;
    }

    public final Object k(Object obj) {
        a71.c cVar = (a71.c) obj;
        switch (this.v) {
            case 0:
                return new q(this.x, this.y, cVar, 0).v(w61.a0.a);
            case 1:
                return new q(this.x, this.y, cVar, 1).v(w61.a0.a);
            default:
                return new q(this.x, this.y, cVar, 2).v(w61.a0.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        if (r6 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b7, code lost:
    
        if (r6 == r0) goto L48;
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
                    break;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return obj;
                    }
                    sy.y.j(obj);
                }
                this.w = 2;
                Object d = ((mp.b) obj).d(this.y, this);
                if (d != aVar) {
                    return d;
                }
                return aVar;
            case 1:
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
                Object b = ((mp.b) obj).b(this.y, this);
                if (b != aVar2) {
                    return b;
                }
                return aVar2;
            default:
                b71.a aVar3 = b71.a.r;
                int i3 = this.w;
                if (i3 == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    v vVar3 = this.x;
                    obj = vVar3.u.a(vVar3.t, mp.b.class, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return ((PatchThreadNameResponse) obj).a;
                    }
                    sy.y.j(obj);
                }
                PatchThreadNameInput patchThreadNameInput = new PatchThreadNameInput(true);
                this.w = 2;
                obj = ((mp.b) obj).e(this.y, patchThreadNameInput, this);
                if (obj == aVar3) {
                    return aVar3;
                }
                return ((PatchThreadNameResponse) obj).a;
        }
    }
}
