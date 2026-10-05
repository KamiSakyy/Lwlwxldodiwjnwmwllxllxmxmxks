package v00;

import com.github.service.copilot.SteerCommand$PlanApprovalResponse;
import com.github.service.dotcom.models.response.copilot.SteerAgentTaskRequest;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f0 extends c71.j implements j71.c {
    public final /* synthetic */ String A;
    public final /* synthetic */ Boolean B;
    public final /* synthetic */ String C;
    public int v;
    public final /* synthetic */ g0 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, String str, String str2, boolean z, String str3, Boolean bool, String str4, a71.c cVar) {
        super(1, cVar);
        this.w = g0Var;
        this.x = str;
        this.y = str2;
        this.z = z;
        this.A = str3;
        this.B = bool;
        this.C = str4;
    }

    public final Object k(Object obj) {
        Boolean bool = this.B;
        String str = this.C;
        return new f0(this.w, this.x, this.y, this.z, this.A, bool, str, (a71.c) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (((mp.c) r10).a(r9.x, r1, r9) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r10 == r0) goto L15;
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
                return w61.a0.a;
            }
            sy.y.j(obj);
        }
        SteerAgentTaskRequest w = sy.p.w(new SteerCommand$PlanApprovalResponse(this.y, this.z, this.A, this.B, this.C));
        this.v = 2;
    }
}
