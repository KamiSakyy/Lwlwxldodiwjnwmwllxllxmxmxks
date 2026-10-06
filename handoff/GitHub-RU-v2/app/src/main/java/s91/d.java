package s91;

import b21.v;
import c21.h0;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import sy.n;
import x61.l;
import x61.m;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d extends e51.a {
    public final /* synthetic */ e u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str) {
        super(str);
        k.g(str, "text");
        this.u = eVar;
    }

    public final List B(h0 h0Var, int i, int i2) {
        int i3;
        k.g(h0Var, "type");
        if (!(h0Var.equals(j91.a.j) ? true : h0Var.equals(j91.a.W) ? true : h0Var.equals(j91.a.Z) ? true : h0Var.equals(n91.c.e))) {
            return super.B(h0Var, i, i2);
        }
        CharSequence charSequence = (CharSequence) ((e51.a) this).s;
        k.g(charSequence, "text");
        this.u.getClass();
        o91.b bVar = new o91.b();
        r91.a aVar = new r91.a(bVar);
        k.g(charSequence, "originalText");
        aVar.d = charSequence;
        aVar.e = i;
        aVar.f = i2;
        bVar.c = charSequence;
        bVar.f = i;
        bVar.d = i;
        bVar.e = i;
        bVar.h = false;
        bVar.g = i2;
        bVar.b = 0;
        aVar.b = aVar.a();
        aVar.g = bVar.f;
        aVar.b();
        x91.c cVar = new x91.c(aVar);
        q71.g gVar = new q71.g(0, ((ArrayList) cVar.b).size(), 1);
        ArrayList arrayList = new ArrayList();
        int i4 = ((q71.e) gVar).s;
        int i5 = i4 - 1;
        if (i5 >= 0) {
            int i6 = 0;
            i3 = 0;
            while (true) {
                if (k.b(new v(cVar, i6, 14).m(), j91.a.G)) {
                    if (i3 < i6) {
                        arrayList.add(new q71.g(i3, i6 - 1, 1));
                    }
                    i3 = i6 + 1;
                }
                if (i6 == i5) {
                    break;
                }
                i6++;
            }
        } else {
            i3 = 0;
        }
        if (i3 < i4) {
            arrayList.add(new q71.g(i3, i4, 1));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(arrayList);
        for (x91.f fVar : l.r(new x91.f[]{new x91.b(1, l.r(new h0[]{j91.a.m0, n91.c.c})), new y91.a(0), new y91.a(3), new y91.a(1), new y91.a(2), new y91.a(4), new x91.b(0, new n[]{new n91.d(1), new n91.d(0)})})) {
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList3.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList3.get(i7);
                i7++;
                List list = (List) obj;
                k.f(list, "parsingSpace");
                q81.k a = fVar.a(cVar, list);
                arrayList2.addAll(a.a);
                arrayList4.addAll(a.b);
            }
            arrayList3 = arrayList4;
        }
        return d0Shadow.n(new b(new e51.a(0, charSequence), cVar).m(m.l0(arrayList2, d0Shadow.n(new x91.e(gVar, h0Var)))));
    }
}
