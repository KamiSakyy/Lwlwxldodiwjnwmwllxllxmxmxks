package y91;

import b21.v;
import c21.h0;
import java.util.ArrayList;
import java.util.List;
import n91.b;
import q81.k;
import sy.rShadow;
import sy.tShadow;
import x91.c;
import x91.d;
import x91.e;
import x91.f;
import x91.g;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a implements f {
    public final /* synthetic */ int a;

    @Override // x91.f
    public final k a(c cVar, List list) {
        d v;
        d p;
        switch (this.a) {
            case 0:
                h0 h0Var = j91.a.b0;
                h0 h0Var2 = j91.a.c0;
                k kVar = new k(1);
                ArrayList arrayList = new ArrayList();
                v gVar = new g(cVar, list);
                int i = -239;
                int i2 = -239;
                while (true) {
                    h0 m = gVar.m();
                    int i3 = gVar.s;
                    if (m == null) {
                        if (i2 != -239) {
                            arrayList.add(new q71.g(i2, i, 1));
                        }
                        kVar.b(arrayList);
                        return kVar;
                    }
                    if (k71.k.b(gVar.m(), h0Var) || k71.k.b(gVar.m(), h0Var2)) {
                        v c = gVar.c();
                        int l = gVar.l() - (k71.k.b(gVar.m(), h0Var2) ? 2 : 0);
                        while (true) {
                            if (c.m() != null) {
                                if (k71.k.b(c.m(), h0Var) || k71.k.b(c.m(), h0Var2)) {
                                    if (c.l() - (k71.k.b(c.m(), h0Var2) ? 1 : 0) == l) {
                                    }
                                }
                                c = c.c();
                            } else {
                                c = null;
                            }
                        }
                        if (c != null) {
                            kVar.a.add(new e(new q71.g(i3, c.s + 1, 1), j91.a.h));
                            gVar = c.c();
                        }
                    }
                    if (i + 1 != i3) {
                        if (i2 != -239) {
                            arrayList.add(new q71.g(i2, i, 1));
                        }
                        i2 = i3;
                    }
                    gVar = gVar.c();
                    i = i3;
                }
                break;
            case 1:
                k kVar2 = new k(1);
                ArrayList arrayList2 = new ArrayList();
                v gVar2 = new g(cVar, list);
                int i4 = -239;
                int i5 = -239;
                while (true) {
                    h0 m2 = gVar2.m();
                    int i6 = gVar2.s;
                    if (m2 == null) {
                        if (i5 != -239) {
                            arrayList2.add(new q71.g(i5, i4, 1));
                        }
                        kVar2.b(arrayList2);
                        return kVar2;
                    }
                    if (k71.k.b(gVar2.m(), j91.a.R) && k71.k.b(gVar2.r(), j91.a.M)) {
                        d v2 = rShadow.v(gVar2.c());
                        if (v2 == null) {
                            v2 = tShadow.p(gVar2.c());
                        }
                        if (v2 != null) {
                            v vVar = v2.a;
                            kVar2.a.add(new e(new q71.g(i6, vVar.s + 1, 1), j91.a.u));
                            kVar2.c(v2);
                            gVar2 = vVar.c();
                        }
                    }
                    if (i4 + 1 != i6) {
                        if (i5 != -239) {
                            arrayList2.add(new q71.g(i5, i4, 1));
                        }
                        i5 = i6;
                    }
                    gVar2 = gVar2.c();
                    i4 = i6;
                }
                break;
            case 2:
                k kVar3 = new k(1);
                ArrayList arrayList3 = new ArrayList();
                v gVar3 = new g(cVar, list);
                int i7 = -239;
                int i8 = -239;
                while (gVar3.m() != null) {
                    if (!k71.k.b(gVar3.m(), j91.a.M) || (v = rShadow.v(gVar3)) == null) {
                        int i9 = gVar3.s;
                        if (i7 + 1 != i9) {
                            if (i8 != -239) {
                                arrayList3.add(new q71.g(i8, i7, 1));
                            }
                            i8 = i9;
                        }
                        gVar3 = gVar3.c();
                        i7 = i9;
                    } else {
                        gVar3 = v.a.c();
                        kVar3.c(v);
                    }
                }
                if (i8 != -239) {
                    arrayList3.add(new q71.g(i8, i7, 1));
                }
                kVar3.b(arrayList3);
                return kVar3;
            case 3:
                k kVar4 = new k(1);
                ArrayList arrayList4 = new ArrayList();
                v gVar4 = new g(cVar, list);
                int i10 = -239;
                int i11 = -239;
                while (true) {
                    h0 m3 = gVar4.m();
                    int i12 = gVar4.s;
                    if (m3 == null) {
                        if (i11 != -239) {
                            arrayList4.add(new q71.g(i11, i10, 1));
                        }
                        kVar4.b(arrayList4);
                        return kVar4;
                    }
                    if (k71.k.b(gVar4.m(), n91.c.f)) {
                        v c2 = gVar4.c();
                        int l2 = gVar4.l();
                        while (true) {
                            if (c2.m() == null) {
                                c2 = null;
                            } else if (!k71.k.b(c2.m(), n91.c.f) || c2.l() != l2) {
                                c2 = c2.c();
                            }
                        }
                        if (c2 != null) {
                            int i13 = c2.s;
                            int l3 = gVar4.l();
                            ArrayList arrayList5 = kVar4.a;
                            if (l3 == 1) {
                                arrayList5.add(new e(new q71.g(i12, i13 + 1, 1), b.e));
                            } else {
                                arrayList5.add(new e(new q71.g(i12, i13 + 1, 1), b.f));
                            }
                            gVar4 = c2.c();
                        }
                    }
                    if (i10 + 1 != i12) {
                        if (i11 != -239) {
                            arrayList4.add(new q71.g(i11, i10, 1));
                        }
                        i11 = i12;
                    }
                    gVar4 = gVar4.c();
                    i10 = i12;
                }
                break;
            default:
                k kVar5 = new k(1);
                ArrayList arrayList6 = new ArrayList();
                v gVar5 = new g(cVar, list);
                int i14 = -239;
                int i15 = -239;
                while (gVar5.m() != null) {
                    if (!k71.k.b(gVar5.m(), j91.a.M) || (p = tShadow.p(gVar5)) == null) {
                        int i16 = gVar5.s;
                        if (i14 + 1 != i16) {
                            if (i15 != -239) {
                                arrayList6.add(new q71.g(i15, i14, 1));
                            }
                            i15 = i16;
                        }
                        gVar5 = gVar5.c();
                        i14 = i16;
                    } else {
                        gVar5 = p.a.c();
                        kVar5.c(p);
                    }
                }
                if (i15 != -239) {
                    arrayList6.add(new q71.g(i15, i14, 1));
                }
                kVar5.b(arrayList6);
                return kVar5;
        }
    }
}
