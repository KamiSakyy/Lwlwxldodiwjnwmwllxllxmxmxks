package hd0;

import go0.z;
import sy.y;
import w61.a0;
import y71.s;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ z y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(z zVar, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.y = zVar;
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                k kVar = new k(this.y, cVar, 0);
                kVar.x = obj;
                return kVar;
            case 1:
                k kVar2 = new k(this.y, cVar, 1);
                kVar2.x = obj;
                return kVar2;
            default:
                k kVar3 = new k(this.y, cVar, 2);
                kVar3.x = obj;
                return kVar3;
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        qn.g gVar = (qn.g) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
        }
        return ((k) r(cVar, gVar)).v(a0.a);
    }

    @Override // c71.a
    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                qn.g gVar = (qn.g) this.x;
                s sVar = b71.a.r;
                int i = this.w;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                this.x = null;
                this.w = 1;
                s j = z.j(this.y, gVar);
                return j == sVar ? sVar : j;
            case 1:
                qn.g gVar2 = (qn.g) this.x;
                s sVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                this.x = null;
                this.w = 1;
                s j2 = z.j(this.y, gVar2);
                return j2 == sVar2 ? sVar2 : j2;
            default:
                qn.g gVar3 = (qn.g) this.x;
                s sVar3 = b71.a.r;
                int i3 = this.w;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                this.x = null;
                this.w = 1;
                s j3 = z.j(this.y, gVar3);
                return j3 == sVar3 ? sVar3 : j3;
        }
    }
}
