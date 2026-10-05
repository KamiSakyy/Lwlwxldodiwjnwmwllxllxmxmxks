package do0;

import android.view.Choreographer;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import h0.h2;
import sy.y;
import v71.z;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m extends c71.j implements j71.e {
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, a71.c cVar, int i2) {
        super(i, cVar);
        this.v = i2;
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                return new m(2, cVar, 0);
            case 1:
                return new m(2, cVar, 1);
            case 2:
                return new m(2, cVar, 2);
            case 3:
                return new m(2, cVar, 3);
            case 4:
                return new m(2, cVar, 4);
            case 5:
                return new m(2, cVar, 5);
            case 6:
                return new m(2, cVar, 6);
            case 7:
                return new m(2, cVar, 7);
            case 8:
                return new m(2, cVar, 8);
            case 9:
                return new m(2, cVar, 9);
            case 10:
                return new m(2, cVar, 10);
            default:
                return new m(2, cVar, 11);
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                ((m) r((a71.c) obj2, (y71.j) obj)).v(a0.a);
                throw null;
            case 1:
                ((m) r((a71.c) obj2, (y71.j) obj)).v(a0.a);
                throw null;
            case 2:
                ((m) r((a71.c) obj2, (y71.j) obj)).v(a0.a);
                throw null;
            case 3:
                ((m) r((a71.c) obj2, (y71.j) obj)).v(a0.a);
                throw null;
            case 4:
                m mVar = (m) r((a71.c) obj2, (h2) obj);
                a0 a0Var = a0.a;
                mVar.v(a0Var);
                return a0Var;
            case 5:
                ((m) r((a71.c) obj2, (y71.j) obj)).v(a0.a);
                throw null;
            case 6:
                ((m) r((a71.c) obj2, (y71.j) obj)).v(a0.a);
                throw null;
            case 7:
                m mVar2 = (m) r((a71.c) obj2, (y71.j) obj);
                a0 a0Var2 = a0.a;
                mVar2.v(a0Var2);
                return a0Var2;
            case 8:
                ((m) r((a71.c) obj2, (y71.j) obj)).v(a0.a);
                throw null;
            case 9:
                ((m) r((a71.c) obj2, (y71.j) obj)).v(a0.a);
                throw null;
            case 10:
                return ((m) r((a71.c) obj2, (z) obj)).v(a0.a);
            default:
                ((m) r((a71.c) obj2, (y71.j) obj)).v(a0.a);
                throw null;
        }
    }

    @Override // c71.a
    public final Object v(Object obj) {
        int i = this.v;
        a0 a0Var = a0.a;
        switch (i) {
            case 0:
                b71.a aVar = b71.a.r;
                y.j(obj);
                throw new ApiFailure(ApiFailureType.PARSE_ERROR, "could not find new job instance", null, null, null, null, null, 120);
            case 1:
                b71.a aVar2 = b71.a.r;
                y.j(obj);
                throw new ApiFailure(ApiFailureType.PARSE_ERROR, "could not find new job instance", null, null, null, null, null, 120);
            case 2:
                b71.a aVar3 = b71.a.r;
                y.j(obj);
                throw new ApiFailure(ApiFailureType.PARSE_ERROR, "could not find new job instance", null, null, null, null, null, 120);
            case 3:
                b71.a aVar4 = b71.a.r;
                y.j(obj);
                throw new ApiFailure(ApiFailureType.ALIVE_IO, "io error on socket", null, new Integer(0), null, null, null, 112);
            case 4:
                b71.a aVar5 = b71.a.r;
                y.j(obj);
                return a0Var;
            case 5:
                b71.a aVar6 = b71.a.r;
                y.j(obj);
                throw new ApiFailure(ApiFailureType.ALIVE_IO, "io error on socket", null, new Integer(0), null, null, null, 112);
            case 6:
                b71.a aVar7 = b71.a.r;
                y.j(obj);
                throw new ApiFailure(ApiFailureType.ALIVE_IO, "io error on socket", null, new Integer(0), null, null, null, 112);
            case 7:
                b71.a aVar8 = b71.a.r;
                y.j(obj);
                return a0Var;
            case 8:
                b71.a aVar9 = b71.a.r;
                y.j(obj);
                throw new ApiFailure(ApiFailureType.PARSE_ERROR, "could not find new job instance", null, null, null, null, null, 120);
            case 9:
                b71.a aVar10 = b71.a.r;
                y.j(obj);
                throw new ApiFailure(ApiFailureType.ALIVE_IO, "io error on socket", null, new Integer(0), null, null, null, 112);
            case 10:
                b71.a aVar11 = b71.a.r;
                y.j(obj);
                return Choreographer.getInstance();
            default:
                b71.a aVar12 = b71.a.r;
                y.j(obj);
                throw new ApiFailure(ApiFailureType.SERVER_VERSION, "This server version is no longer supported.", null, new Integer(0), null, null, null, 112);
        }
    }
}
