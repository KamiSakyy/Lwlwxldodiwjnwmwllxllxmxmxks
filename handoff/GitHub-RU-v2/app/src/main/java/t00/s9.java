package t00;

import com.github.service.models.response.type.SubscriptionState;
import jo.qg0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s9 extends c71.c {
    public com.github.service.wrapper.b u;
    public qg0 v;
    public /* synthetic */ Object w;
    public final /* synthetic */ rm0.y9Shadow x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(rm0.y9Shadow y9Var, c71.c cVar) {
        super(cVar);
        this.x = y9Var;
    }

    public final Object v(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.c((String) null, (SubscriptionState) null, this);
    }
}
