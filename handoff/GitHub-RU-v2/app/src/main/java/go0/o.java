package go0;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o extends c71.j implements j71.f {
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, a71.c cVar, int i2) {
        super(i, cVar);
        this.v = i2;
    }

    @Override // j71.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        switch (this.v) {
            case 0:
                new o(3, (a71.c) obj3, 0).v(a0.a);
                throw null;
            case 1:
                new o(3, (a71.c) obj3, 1).v(a0.a);
                throw null;
            case 2:
                long j = ((c2.b) obj2).a;
                o oVar = new o(3, (a71.c) obj3, 2);
                a0 a0Var = a0.a;
                oVar.v(a0Var);
                return a0Var;
            case 3:
                ((Number) obj2).floatValue();
                o oVar2 = new o(3, (a71.c) obj3, 3);
                a0 a0Var2 = a0.a;
                oVar2.v(a0Var2);
                return a0Var2;
            case 4:
                long j2 = ((c2.b) obj2).a;
                o oVar3 = new o(3, (a71.c) obj3, 4);
                a0 a0Var3 = a0.a;
                oVar3.v(a0Var3);
                return a0Var3;
            case 5:
                new o(3, (a71.c) obj3, 5).v(a0.a);
                throw null;
            case 6:
                new o(3, (a71.c) obj3, 6).v(a0.a);
                throw null;
            case 7:
                o oVar4 = new o(3, (a71.c) obj3, 7);
                a0 a0Var4 = a0.a;
                oVar4.v(a0Var4);
                return a0Var4;
            case 8:
                new o(3, (a71.c) obj3, 8).v(a0.a);
                throw null;
            case 9:
                new o(3, (a71.c) obj3, 9).v(a0.a);
                throw null;
            default:
                o oVar5 = new o(3, (a71.c) obj3, 10);
                a0 a0Var5 = a0.a;
                oVar5.v(a0Var5);
                return a0Var5;
        }
    }

    @Override // c71.a
    public final Object v(Object obj) {
        int i = this.v;
        a0 a0Var = a0.a;
        switch (i) {
            case 0:
                b71.a aVar = b71.a.r;
                sy.y.j(obj);
                throw new ApiFailure(ApiFailureType.ALIVE_IO, "io error fetching the pull request update channel", null, new Integer(0), null, null, null, 112);
            case 1:
                b71.a aVar2 = b71.a.r;
                sy.y.j(obj);
                throw new ApiFailure(ApiFailureType.ALIVE_IO, "io error retrieving socket", null, new Integer(0), null, null, null, 112);
            case 2:
                b71.a aVar3 = b71.a.r;
                sy.y.j(obj);
                return a0Var;
            case 3:
                b71.a aVar4 = b71.a.r;
                sy.y.j(obj);
                return a0Var;
            case 4:
                b71.a aVar5 = b71.a.r;
                sy.y.j(obj);
                return a0Var;
            case 5:
                b71.a aVar6 = b71.a.r;
                sy.y.j(obj);
                throw new ApiFailure(ApiFailureType.ALIVE_IO, "io error fetching the pull request update channel", null, new Integer(0), null, null, null, 112);
            case 6:
                b71.a aVar7 = b71.a.r;
                sy.y.j(obj);
                throw new ApiFailure(ApiFailureType.ALIVE_IO, "io error retrieving socket", null, new Integer(0), null, null, null, 112);
            case 7:
                b71.a aVar8 = b71.a.r;
                sy.y.j(obj);
                return a0Var;
            case 8:
                b71.a aVar9 = b71.a.r;
                sy.y.j(obj);
                throw new ApiFailure(ApiFailureType.ALIVE_IO, "io error fetching the pull request update channel", null, new Integer(0), null, null, null, 112);
            case 9:
                b71.a aVar10 = b71.a.r;
                sy.y.j(obj);
                throw new ApiFailure(ApiFailureType.ALIVE_IO, "io error retrieving socket", null, new Integer(0), null, null, null, 112);
            default:
                b71.a aVar11 = b71.a.r;
                sy.y.j(obj);
                return a0Var;
        }
    }
}
