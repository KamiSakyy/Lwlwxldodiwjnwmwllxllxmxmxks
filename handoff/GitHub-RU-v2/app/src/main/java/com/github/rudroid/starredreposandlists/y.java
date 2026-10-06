package com.github.rudroid.starredreposandlists;

import com.github.rudroid.starredreposandlists.h;
import com.github.rudroid.utilities.ui.g1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y71.y1;
import yz0.c4;
import yz0.e8;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class y implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ h0 s;

    public /* synthetic */ y(h0 h0Var, int i) {
        this.r = i;
        this.s = h0Var;
    }

    public final Object k(Object obj) {
        y61.b h;
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        h0 h0Var = this.s;
        switch (i) {
            case 0:
                com.github.rudroid.utilities.ui.g1 g1Var = (com.github.rudroid.utilities.ui.g1) obj;
                r71.e[] eVarArr = h0.C;
                k71.k.g(g1Var, "it");
                break;
            case 1:
                w61.k kVar = (w61.k) obj;
                y61.b bVar = x61.r.r;
                if (kVar == null) {
                    r71.e[] eVarArr2 = h0.C;
                    break;
                } else {
                    w wVar = h0Var.v;
                    List list = ((c4) kVar.r).a;
                    List<e8> list2 = (List) kVar.s;
                    boolean b = k71.k.b(h0Var.u.d().c, h0Var.w.a);
                    r1 = ((String) h0Var.y.t(h0Var, h0.C[0])).length() <= 0 ? 0 : 1;
                    wVar.getClass();
                    k71.k.g(list2, "lists");
                    if (list.isEmpty() && list2.isEmpty()) {
                        h = bVar;
                    } else {
                        y61.b i2 = sy.d0.i();
                        if (r1 != 0) {
                            ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(vh.a.a((p01.n) it.next()));
                            }
                            i2.addAll(arrayList);
                        } else {
                            if (!list2.isEmpty() || b) {
                                y61.b i3 = sy.d0.i();
                                i3.add(new h.c(2131231350, b ? 2131953019 : 2131953018, b));
                                if (list2.isEmpty()) {
                                    i3.add(h.b.s);
                                } else {
                                    ArrayList arrayList2 = new ArrayList(x61.n.F(list2, 10));
                                    for (e8 e8Var : list2) {
                                        arrayList2.add(new h.d(e8Var.t, e8Var.r, e8Var.s, e8Var.u));
                                    }
                                    i3.addAll(arrayList2);
                                }
                                i3.add(h.f.s);
                                i2.addAll(sy.d0.h(i3));
                                if (!list.isEmpty()) {
                                    i2.add(new h.c(2131231456, 2131953524, false));
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(x61.n.F(list, 10));
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(vh.a.a((p01.n) it2.next()));
                            }
                            i2.addAll(arrayList3);
                            if (list.isEmpty()) {
                                i2.add(new h.g(b));
                            }
                        }
                        h = sy.d0.h(i2);
                    }
                    if (h != null) {
                        break;
                    }
                }
                break;
            case 2:
                y1 y1Var = h0Var.A;
                g1.a aVar = com.github.rudroid.utilities.ui.g1.Companion;
                Object data = ((com.github.rudroid.utilities.ui.g1) y1Var.getValue()).getData();
                aVar.getClass();
                y1Var.k((Object) null, g1.a.b((fl.b) obj, data));
                break;
            case 3:
                y1 y1Var2 = h0Var.A;
                g1.a aVar2 = com.github.rudroid.utilities.ui.g1.Companion;
                Object data2 = ((com.github.rudroid.utilities.ui.g1) y1Var2.getValue()).getData();
                aVar2.getClass();
                y1Var2.k((Object) null, g1.a.b((fl.b) obj, data2));
                break;
            default:
                y1 y1Var3 = h0Var.A;
                g1.a aVar3 = com.github.rudroid.utilities.ui.g1.Companion;
                Object data3 = ((com.github.rudroid.utilities.ui.g1) y1Var3.getValue()).getData();
                aVar3.getClass();
                y1Var3.k((Object) null, g1.a.b((fl.b) obj, data3));
                break;
        }
        return a0Var;
    }
    public Object h() { return null; }
}
