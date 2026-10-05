package s91;

import androidx.compose.foundation.lazy.layout.s0;
import c21.h0;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import x61.m;

/* loaded from: /home/user/work/p/classes5.dex */
public final class g extends s0 {
    public final h n(i iVar, List list, boolean z) {
        j91.b bVar = j91.a.q0;
        e51.a aVar = (e51.a) ((s0) this).s;
        k.g(list, "currentNodeChildren");
        x91.e eVar = iVar.t;
        h0 h0Var = eVar.b;
        q71.g gVar = eVar.a;
        int i = ((q71.e) gVar).r;
        int i2 = ((q71.e) gVar).s;
        if (h0Var != null && h0Var.c) {
            return new h((k91.a) m.U(aVar.B(h0Var, i, i2)), i, i2);
        }
        ArrayList arrayList = new ArrayList(list.size());
        h hVar = (h) m.W(list);
        int i3 = hVar != null ? hVar.b : i2;
        if (i != i3) {
            arrayList.addAll(aVar.B(bVar, i, i3));
        }
        int size = list.size();
        for (int i4 = 1; i4 < size; i4++) {
            h hVar2 = (h) list.get(i4 - 1);
            h hVar3 = (h) list.get(i4);
            arrayList.add(hVar2.a);
            int i5 = hVar2.c;
            int i6 = hVar3.b;
            if (i5 != i6) {
                arrayList.addAll(aVar.B(bVar, i5, i6));
            }
        }
        if (!list.isEmpty()) {
            arrayList.add(((h) m.e0(list)).a);
            int i7 = ((h) m.e0(list)).c;
            if (i7 != i2) {
                arrayList.addAll(aVar.B(bVar, i7, i2));
            }
        }
        return new h(aVar.A(h0Var, arrayList), i, i2);
    }

    public final void o(i iVar, List list) {
        k.g(iVar, "event");
    }
}
