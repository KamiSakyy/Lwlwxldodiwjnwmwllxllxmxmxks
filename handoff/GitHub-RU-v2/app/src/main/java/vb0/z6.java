package vb0;

import com.github.service.models.response.type.PullRequestReviewEvent;
import rm0.k9;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z6 extends c71.c {
    public String u;
    public PullRequestReviewEvent v;
    public String w;
    public /* synthetic */ Object x;
    public final /* synthetic */ k9 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(k9 k9Var, c71.c cVar) {
        super(cVar);
        this.y = k9Var;
    }

    @Override // c71.a
    public final Object v(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.d(null, null, null, this);
    }
}
