package rw0;

import bz0.c0;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import uu0.l4;

/* loaded from: /home/user/work/p/classes4.dex */
public class b extends c71.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ c0 B;
    public int C;
    public String u;
    public CloseReason v;
    public l4 w;
    public String x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c0 c0Var, c71.c cVar) {
        super(cVar);
        this.B = c0Var;
    }

    @Override // c71.a
    public final Object v(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.c(null, null, this);
    }
}
