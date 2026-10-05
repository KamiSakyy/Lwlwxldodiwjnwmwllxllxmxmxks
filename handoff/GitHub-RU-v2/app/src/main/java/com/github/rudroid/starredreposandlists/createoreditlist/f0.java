package com.github.rudroid.starredreposandlists.createoreditlist;

import androidx.compose.runtime.i3;
import androidx.lifecycle.l1;
import com.github.rudroid.utilities.m1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class f0 implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ f1 u;

    public /* synthetic */ f0(i3 i3Var, EditListFragment editListFragment, f1 f1Var, int i) {
        this.r = i;
        this.s = i3Var;
        this.t = editListFragment;
        this.u = f1Var;
    }

    public final Object s(Object obj, Object obj2) {
        String str;
        String str2;
        switch (this.r) {
            case 0:
                i3 i3Var = (i3) this.s;
                EditListFragment editListFragment = (EditListFragment) this.t;
                l1 l1Var = editListFragment.E0;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    w1.r f = f0.o.f(w1.o.a, ih.d.b(sVar).b, d2.a0.b);
                    xz0.h hVar = (xz0.h) ((fl.f) i3Var.getValue()).b;
                    String str3 = (hVar == null || (str2 = hVar.t) == null) ? "" : str2;
                    xz0.h hVar2 = (xz0.h) ((fl.f) i3Var.getValue()).b;
                    String str4 = (hVar2 == null || (str = hVar2.u) == null) ? "" : str;
                    u0 u0Var = (u0) l1Var.getValue();
                    boolean h = sVar.h(u0Var);
                    Object N = sVar.N();
                    androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
                    if (h || N == iVar) {
                        h0 h0Var = new h0(2, u0Var, u0.class, "saveList", "saveList(Ljava/lang/String;Ljava/lang/String;)V", 0, 0);
                        sVar.n0(h0Var);
                        N = h0Var;
                    }
                    j71.e eVar = (k71.i) N;
                    u0 u0Var2 = (u0) l1Var.getValue();
                    boolean h2 = sVar.h(u0Var2);
                    Object N2 = sVar.N();
                    if (h2 || N2 == iVar) {
                        i0 i0Var = new i0(1, u0Var2, u0.class, "onTitleChange", "onTitleChange(Ljava/lang/String;)V", 0, 0);
                        sVar.n0(i0Var);
                        N2 = i0Var;
                    }
                    j71.c cVar = (k71.i) N2;
                    j71.e eVar2 = eVar;
                    boolean h3 = sVar.h(editListFragment);
                    Object N3 = sVar.N();
                    if (h3 || N3 == iVar) {
                        N3 = new e0(editListFragment, 1);
                        sVar.n0(N3);
                    }
                    c0.e(f, eVar2, (j71.a) N3, cVar, this.u, str3, str4, sVar, 0);
                } else {
                    sVar.V();
                }
                break;
            case 1:
                i3 i3Var2 = (i3) this.s;
                EditListFragment editListFragment2 = (EditListFragment) this.t;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    w1.r f2 = f0.o.f(w1.o.a, ih.d.b(sVar2).b, d2.a0.b);
                    boolean z = ((fl.f) i3Var2.getValue()).b != null;
                    f1 f1Var = this.u;
                    m1.b(f2, i3Var2, z, r1.i.d(1142507779, new f0(i3Var2, editListFragment2, f1Var, 0), sVar2), r1.i.d(1874683234, new g0(f1Var, editListFragment2, 0), sVar2), null, sVar2, 27648, 32);
                } else {
                    sVar2.V();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                c0.d(this.u, (j71.a) this.s, (j71.a) this.t, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(385));
                break;
        }
        return w61.a0.a;
    }

    public /* synthetic */ f0(f1 f1Var, j71.a aVar, j71.a aVar2, int i) {
        this.r = 2;
        this.u = f1Var;
        this.s = aVar;
        this.t = aVar2;
    }







}
