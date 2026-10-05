package t00;

import com.github.service.models.HideCommentReason;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n extends c71.c {
    public int A;
    public String u;
    public String v;
    public String w;
    public boolean x;
    public /* synthetic */ Object y;
    public final /* synthetic */ rm0.o z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(rm0.o oVar, c71.c cVar) {
        super(cVar);
        this.z = oVar;
    }

    public final Object v(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.E((String) null, (String) null, false, (HideCommentReason) null, this);
    }
}
