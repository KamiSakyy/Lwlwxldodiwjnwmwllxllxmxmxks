package n91;

import b21.v;
import c21.h0;
import java.util.ArrayList;
import q81.k;
import sy.n;
import sy.q;
import x91.e;
import x91.g;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d extends n {
    public final /* synthetic */ int a;

    public final void x(x91.c cVar, g gVar, ArrayList arrayList, k kVar) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    boolean z = false;
                    while (true) {
                        int i3 = size - 1;
                        if (z) {
                            z = false;
                        } else {
                            x91.a aVar = (x91.a) arrayList.get(size);
                            if (k71.k.b(aVar.a, c.a) && (i = aVar.g) != -1) {
                                z = q.b(arrayList, size, i);
                                x91.a aVar2 = (x91.a) arrayList.get(aVar.g);
                                if (z) {
                                    kVar.a.add(new e(new q71.g(aVar.b - 1, aVar2.b + 2, 1), b.a));
                                }
                            }
                        }
                        if (i3 < 0) {
                            break;
                        } else {
                            size = i3;
                        }
                    }
                }
                break;
            default:
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    boolean z2 = false;
                    while (true) {
                        int i4 = size2 - 1;
                        if (z2) {
                            z2 = false;
                        } else {
                            x91.a aVar3 = (x91.a) arrayList.get(size2);
                            h0 h0Var = aVar3.a;
                            int i5 = aVar3.b;
                            if (k71.k.b(h0Var, j91.a.a0) && (i2 = aVar3.g) != -1) {
                                z2 = q.b(arrayList, size2, i2);
                                x91.a aVar4 = (x91.a) arrayList.get(aVar3.g);
                                kVar.a.add(z2 ? new e(new q71.g(i5 - 1, aVar4.b + 2, 1), j91.a.l) : new e(new q71.g(i5, aVar4.b + 1, 1), j91.a.k));
                            }
                        }
                        if (i4 < 0) {
                            break;
                        } else {
                            size2 = i4;
                        }
                    }
                }
                break;
        }
    }

    public final int z(x91.c cVar, v vVar, ArrayList arrayList) {
        switch (this.a) {
            case 0:
                k71.k.g(vVar, "iterator");
                if (!k71.k.b(vVar.m(), c.a)) {
                    return 0;
                }
                v vVar2 = vVar;
                int i = 1;
                for (int i2 = 0; i2 < 50 && k71.k.b(vVar2.r(), c.a); i2++) {
                    vVar2 = vVar2.c();
                    i++;
                }
                w61.k g = n.g(cVar, vVar, vVar2, true);
                boolean booleanValue = ((Boolean) g.r).booleanValue();
                boolean booleanValue2 = ((Boolean) g.s).booleanValue();
                for (int i3 = 0; i3 < i; i3++) {
                    arrayList.add(new x91.a(c.a, vVar.s + i3, 0, booleanValue, booleanValue2, '~'));
                }
                return i;
            default:
                k71.k.g(vVar, "iterator");
                h0 m = vVar.m();
                h0 h0Var = j91.a.a0;
                if (!k71.k.b(m, h0Var)) {
                    return 0;
                }
                char a = ((x91.c) vVar.t).a(vVar.o(0).b);
                v vVar3 = vVar;
                int i4 = 1;
                for (int i5 = 0; i5 < 50 && k71.k.b(vVar3.r(), h0Var); i5++) {
                    v c = vVar3.c();
                    if (((x91.c) c.t).a(c.o(0).b) == a) {
                        vVar3 = vVar3.c();
                        i4++;
                    }
                }
                w61.k g2 = n.g(cVar, vVar, vVar3, a == '*');
                boolean booleanValue3 = ((Boolean) g2.r).booleanValue();
                boolean booleanValue4 = ((Boolean) g2.s).booleanValue();
                int i6 = 0;
                while (i6 < i4) {
                    int i7 = i4;
                    arrayList.add(new x91.a(h0Var, vVar.s + i6, i7, booleanValue3, booleanValue4, a));
                    i6++;
                    i4 = i7;
                }
                return i4;
        }
    }
}
