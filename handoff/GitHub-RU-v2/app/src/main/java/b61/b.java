package b61;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /home/user/work/p/classes4.dex */
public class b extends c71.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ c B;
    public int C;
    public Map u;
    public Iterator v;
    public d w;
    public e81.c x;
    public Map y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, c71.c cVar2) {
        super(cVar2);
        this.B = cVar;
    }

    @Override // c71.a
    public final Object v(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.b(this);
    }
}
