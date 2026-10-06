package sm0;

import kc0.ua;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j extends c71.j implements j71.c {
    public final /* synthetic */ String A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ ua x;
    public final /* synthetic */ r y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(ua uaVar, r rVar, String str, String str2, int i, a71.c cVar, int i2) {
        super(1, cVar);
        this.v = i2;
        this.x = uaVar;
        this.y = rVar;
        this.z = str;
        this.A = str2;
        this.B = i;
    }

    @Override // j71.c
    public final Object k(Object obj) {
        switch (this.v) {
            case 0:
                int i = this.B;
                return new j(this.x, this.y, this.z, this.A, i, (a71.c) obj, 0).v(a0.a);
            default:
                int i2 = this.B;
                return new j(this.x, this.y, this.z, this.A, i2, (a71.c) obj, 1).v(a0.a);
        }
    }

    @Override // c71.a
    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    y.j(obj);
                    ua uaVar = this.x;
                    if (uaVar != null) {
                        a00.bShadow bVar = this.y.d;
                        id0.g gVar = new id0.g(this.z, this.B, this.A);
                        this.w = 1;
                        if (bVar.j(gVar, uaVar, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            default:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    y.j(obj);
                    ua uaVar2 = this.x;
                    if (uaVar2 != null) {
                        a00.bShadow bVar2 = this.y.d;
                        id0.g gVar2 = new id0.g(this.z, this.B, this.A);
                        this.w = 1;
                        if (bVar2.j(gVar2, uaVar2, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
        }
    }
}
