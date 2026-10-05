package in;

import com.github.rudroid.common.e;
import com.github.service.models.ApiRequestStatus;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 extends c71.j implements j71.e {
    public final /* synthetic */ n0 A;
    public final /* synthetic */ String B;
    public s v;
    public y71.j w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ t z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(a71.c cVar, t tVar, n0 n0Var, String str) {
        super(2, cVar);
        this.z = tVar;
        this.A = n0Var;
        this.B = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        m0 m0Var = new m0(cVar, this.z, this.A, this.B);
        m0Var.y = obj;
        return m0Var;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (y71.j) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00fc, code lost:
    
        if (r9.c(r14, r13) == r10) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fe, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ec, code lost:
    
        if (r14 == r10) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b1, code lost:
    
        if (r14 == r10) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        if (r9.c(r14, r13) == r10) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
    
        if (r14 == r10) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0051, code lost:
    
        if (r9.c(r14, r13) == r10) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        s sVar;
        String concat;
        n0 n0Var = this.A;
        qe.a aVar = n0Var.d;
        t tVar = this.z;
        String str = tVar.d;
        String str2 = tVar.b;
        y71.j jVar = (y71.j) this.y;
        b71.a aVar2 = b71.a.r;
        switch (this.x) {
            case 0:
                sy.y.j(obj);
                e0 e0Var = new e0(ApiRequestStatus.LOADING, str2, str);
                this.y = jVar;
                this.x = 1;
                break;
            case 1:
                sy.y.j(obj);
                e.a aVar3 = com.github.rudroid.common.e.Companion;
                long j = tVar.c;
                aVar3.getClass();
                aVar.f(e.a.b(j));
                this.y = jVar;
                this.x = 2;
                obj = v71.b0.k(new an.i(n0Var, tVar, this.B, (a71.c) null, 6), this);
                break;
            case 2:
                sy.y.j(obj);
                sVar = (s) obj;
                w wVar = new w(ApiRequestStatus.LOADING, str2, str);
                this.y = jVar;
                this.v = sVar;
                this.x = 3;
                break;
            case 3:
                sVar = this.v;
                sy.y.j(obj);
                com.github.rudroid.common.e.Companion.getClass();
                aVar.f(e.a.b);
                this.y = jVar;
                this.v = null;
                this.x = 4;
                an.i iVar = new an.i(sVar, n0Var, tVar, (a71.c) null, 7);
                n0Var = n0Var;
                tVar = tVar;
                obj = v71.b0.k(iVar, this);
                break;
            case 4:
                sy.y.j(obj);
                c0 c0Var = (c0) obj;
                this.y = null;
                this.v = null;
                this.w = jVar;
                this.x = 5;
                String str3 = c0Var.a;
                if (str3 != null && str3.length() != 0) {
                    obj = new h0(c0Var.a, str2, str);
                    break;
                } else {
                    String str4 = c0Var.b;
                    if (str4 != null && (concat = n0Var.c.a().concat(str4)) != null) {
                        obj = v71.b0.k(new l0(null, tVar, n0Var, concat), this);
                        break;
                    } else {
                        throw new IllegalArgumentException("asset_upload_url");
                    }
                }
                break;
            case 5:
                jVar = this.w;
                sy.y.j(obj);
                this.y = null;
                this.v = null;
                this.w = null;
                this.x = 6;
                break;
            case 6:
                sy.y.j(obj);
                return w61.a0.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
