package v00;

import com.github.service.copilot.SteerCommand$AskUserResponse;
import com.github.service.copilot.SteerCommand$PermissionResponse;
import com.github.service.dotcom.models.response.copilot.SteerAgentTaskRequest;
import java.util.Locale;
import xn.z2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 extends c71.j implements j71.c {
    public final /* synthetic */ String A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ int v = 1;
    public int w;
    public final /* synthetic */ g0 x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, String str, String str2, String str3, boolean z, a71.c cVar) {
        super(1, cVar);
        this.x = g0Var;
        this.y = str;
        this.z = str2;
        this.A = str3;
        this.B = z;
    }

    public final Object k(Object obj) {
        switch (this.v) {
            case 0:
                boolean z = this.B;
                String str = this.A;
                return new e0(this.x, this.y, this.z, z, str, (a71.c) obj).v(w61.a0.a);
            default:
                String str2 = this.A;
                boolean z2 = this.B;
                return new e0(this.x, this.y, this.z, str2, z2, (a71.c) obj).v(w61.a0.a);
        }
    }

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
                String upperCase = this.A.toUpperCase(Locale.ROOT);
                k71.k.f(upperCase, "toUpperCase(...)");
                SteerAgentTaskRequest w = sy.p.w(new SteerCommand$PermissionResponse(this.z, this.B, z2.valueOf(upperCase)));
                this.w = 2;
                if (((mp.c) obj).a(this.y, w, this) == aVar) {
                    return aVar;
                }
                return w61.a0.a;
            default:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    g0 g0Var2 = this.x;
                    obj = g0Var2.t.a(g0Var2.s, mp.c.class, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    sy.y.j(obj);
                }
                SteerAgentTaskRequest w2 = sy.p.w(new SteerCommand$AskUserResponse(this.z, this.A, this.B));
                this.w = 2;
                if (((mp.c) obj).a(this.y, w2, this) == aVar2) {
                    return aVar2;
                }
                return w61.a0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, String str, String str2, boolean z, String str3, a71.c cVar) {
        super(1, cVar);
        this.x = g0Var;
        this.y = str;
        this.z = str2;
        this.B = z;
        this.A = str3;
    }
}
