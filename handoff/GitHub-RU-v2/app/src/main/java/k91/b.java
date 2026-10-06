package k91;

import c21.h0;
import java.util.Iterator;
import java.util.List;
import k71.k;
import x61.m;

/* loaded from: /home/user/work/p/classes5.dex */
public class b extends a {
    public List e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(h0 h0Var, List list) {
        super(h0Var, r0, r2 != null ? r2.c : 0);
        k.g(h0Var, "type");
        a aVar = (a) m.W(list);
        int i = aVar != null ? aVar.b : 0;
        a aVar2 = (a) m.f0(list);
        this.e = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar3 = (a) it.next();
            if (aVar3 != null) {
                aVar3.d = this;
            }
        }
    }

    @Override // k91.a
    public final List a() {
        return this.e;
    }
}
