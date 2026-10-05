package go0;

import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ z y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(z zVar, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.y = zVar;
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                q qVar = new q(this.y, cVar, 0);
                qVar.x = obj;
                return qVar;
            case 1:
                q qVar2 = new q(this.y, cVar, 1);
                qVar2.x = obj;
                return qVar2;
            case 2:
                q qVar3 = new q(this.y, cVar, 2);
                qVar3.x = obj;
                return qVar3;
            default:
                q qVar4 = new q(this.y, cVar, 3);
                qVar4.x = obj;
                return qVar4;
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        qn.g gVar = (qn.g) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
        }
        return ((q) r(cVar, gVar)).v(a0.a);
    }

    @Override // c71.a
    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                qn.g gVar = (qn.g) this.x;
                y71.s sVar = b71.a.r;
                int i = this.w;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return obj;
                }
                sy.y.j(obj);
                this.x = null;
                this.w = 1;
                y71.s i2 = z.i(this.y, gVar);
                return i2 == sVar ? sVar : i2;
            case 1:
                qn.g gVar2 = (qn.g) this.x;
                y71.s sVar2 = b71.a.r;
                int i3 = this.w;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return obj;
                }
                sy.y.j(obj);
                this.x = null;
                this.w = 1;
                y71.s i4 = z.i(this.y, gVar2);
                return i4 == sVar2 ? sVar2 : i4;
            case 2:
                qn.g gVar3 = (qn.g) this.x;
                y71.s sVar3 = b71.a.r;
                int i5 = this.w;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return obj;
                }
                sy.y.j(obj);
                this.x = null;
                this.w = 1;
                y71.s i6 = z.i(this.y, gVar3);
                return i6 == sVar3 ? sVar3 : i6;
            default:
                qn.g gVar4 = (qn.g) this.x;
                y71.s sVar4 = b71.a.r;
                int i7 = this.w;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return obj;
                }
                sy.y.j(obj);
                this.x = null;
                this.w = 1;
                y71.s i8 = z.i(this.y, gVar4);
                return i8 == sVar4 ? sVar4 : i8;
        }
    }
}
