package x91;

import b21.v;
import c21.h0;
import java.util.ArrayList;
import java.util.List;
import x61.m;

/* loaded from: /home/user/work/p/classes5.dex */
public final class g extends v {
    public final List u;
    public final int v;
    public final /* synthetic */ c w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, List list, int i, int i2) {
        super(cVar, i2, 14);
        this.w = cVar;
        this.u = list;
        this.v = i;
    }

    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final g c() {
        int i = ((v) this).s;
        List list = this.u;
        int size = list.size();
        int i2 = this.v;
        if (i2 >= size) {
            return this;
        }
        int i3 = ((q71.e) ((q71.g) list.get(i2))).s;
        c cVar = this.w;
        if (i != i3) {
            return new g(cVar, list, i2, i + 1);
        }
        int i4 = i2 + 1;
        q71.g gVar = (q71.g) m.X(i4, list);
        return new g(cVar, list, i4, gVar != null ? ((q71.e) gVar).r : ((ArrayList) cVar.b).size());
    }

    public final h0 r() {
        q71.g gVar = (q71.g) m.X(this.v, this.u);
        if (gVar == null) {
            return null;
        }
        int i = ((q71.e) gVar).r;
        int i2 = ((q71.e) gVar).s;
        int i3 = ((v) this).s + 1;
        if (i > i3 || i3 > i2) {
            return null;
        }
        return o(1).a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(c cVar, List list) {
        this(cVar, list, 0, r0 != null ? ((q71.e) r0).r : -1);
        q71.g gVar = (q71.g) m.W(list);
    }
}
