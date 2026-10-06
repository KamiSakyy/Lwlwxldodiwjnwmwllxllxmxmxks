package t00;

import com.github.service.models.response.type.PullRequestReviewEvent;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f9Shadow extends c71.c {
    public String u;
    public PullRequestReviewEvent v;
    public String w;
    public /* synthetic */ Object x;
    public final /* synthetic */ rm0.k9 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(rm0.k9 k9Var, c71.c cVar) {
        super(cVar);
        this.y = k9Var;
    }

    public final Object v(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.d((String) null, (PullRequestReviewEvent) null, (String) null, this);
    }
}
