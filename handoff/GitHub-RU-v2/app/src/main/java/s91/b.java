package s91;

import androidx.compose.foundation.lazy.layout.s0;
import b21.v;
import c21.h0;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import org.intellij.markdown.MarkdownParsingException;
import x61.m;

/* loaded from: /home/user/work/p/classes5.dex */
public final class b extends s0 {
    public x91.c t;
    public int u;

    public b(e51.a aVar, x91.c cVar) {
        super(8, aVar);
        this.t = cVar;
        this.u = -1;
    }

    public final void A(x91.c cVar, ArrayList arrayList, int i, int i2, int i3) {
        v vVar = new v(cVar, i, 14);
        int i4 = 0;
        while (true) {
            int i5 = i4 + i2;
            if (vVar.o(i5).a == null || vVar.o(i5).b == i3) {
                break;
            } else {
                i4 = i5;
            }
        }
        while (i4 != 0) {
            h0 h0Var = vVar.o(i4).a;
            k.d(h0Var);
            arrayList.addAll(((e51.a) ((s0) this).s).B(h0Var, vVar.o(i4).b, vVar.o(i4 + 1).b));
            i4 -= i2;
        }
    }

    public final h n(i iVar, List list, boolean z) {
        k.g(list, "currentNodeChildren");
        x91.e eVar = iVar.t;
        h0 h0Var = eVar.b;
        q71.g gVar = eVar.a;
        int i = ((q71.e) gVar).r;
        int i2 = ((q71.e) gVar).s;
        ArrayList arrayList = new ArrayList(list.size());
        if (z) {
            A(this.t, arrayList, i, -1, -1);
        }
        int size = list.size();
        for (int i3 = 1; i3 < size; i3++) {
            h hVar = (h) list.get(i3 - 1);
            h hVar2 = (h) list.get(i3);
            arrayList.add(hVar.a);
            int i4 = hVar.c - 1;
            int i5 = hVar2.b;
            x91.c cVar = this.t;
            A(cVar, arrayList, i4, 1, new v(cVar, i5, 14).o(0).b);
        }
        if (!list.isEmpty()) {
            arrayList.add(((h) m.e0(list)).a);
        }
        if (z) {
            x91.c cVar2 = this.t;
            A(cVar2, arrayList, i2 - 1, 1, new v(cVar2, i2, 14).o(0).b);
        }
        return new h(((e51.a) ((s0) this).s).A(h0Var, arrayList), i, i2);
    }

    public final void o(i iVar, List list) {
        k.g(iVar, "event");
        int i = iVar.r;
        if (this.u == -1) {
            this.u = i;
        }
        while (true) {
            int i2 = this.u;
            if (i2 >= i) {
                return;
            }
            v vVar = new v(this.t, i2, 14);
            if (vVar.m() == null) {
                throw new MarkdownParsingException("");
            }
            e51.a aVar = (e51.a) ((s0) this).s;
            h0 m = vVar.m();
            k.d(m);
            for (k91.a aVar2 : aVar.B(m, vVar.o(0).b, vVar.o(0).c)) {
                if (list != null) {
                    int i3 = vVar.s;
                    list.add(new h(aVar2, i3, i3 + 1));
                }
            }
            this.u++;
        }
    }
    public Object m(Object p1) { return null; }
}
