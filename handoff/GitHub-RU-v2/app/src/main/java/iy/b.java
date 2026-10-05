package iy;

import bz0.c0;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import dw.t4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends c71.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ c0 B;
    public int C;
    public String u;
    public CloseReason v;
    public t4 w;
    public String x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c0 c0Var, c71.c cVar) {
        super(cVar);
        this.B = c0Var;
    }

    public final Object v(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.c((String) null, (CloseReason) null, this);
    }
}
