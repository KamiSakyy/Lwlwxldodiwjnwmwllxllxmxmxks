package com.github.rudroid.uitoolkit.avatarslayout;

import androidx.compose.ui.layout.k1;
import androidx.compose.ui.layout.l1;
import java.util.ArrayList;
import k71.u;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class e implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ ArrayList s;
    public final /* synthetic */ u t;
    public final /* synthetic */ float u;

    public /* synthetic */ e(ArrayList arrayList, u uVar, float f, int i) {
        this.r = i;
        this.s = arrayList;
        this.t = uVar;
        this.u = f;
    }

    public final Object k(Object obj) {
        k1 k1Var = (k1) obj;
        switch (this.r) {
            case 0:
                k71.k.g(k1Var, "$this$layout");
                ArrayList arrayList = this.s;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    l1 l1Var = (l1) obj2;
                    u uVar = this.t;
                    k1Var.o(l1Var, uVar.r, 0, 0.0f);
                    uVar.r = (l1Var.r - k1Var.i0(this.u)) + uVar.r;
                }
                break;
            default:
                k71.k.g(k1Var, "$this$layout");
                ArrayList arrayList2 = this.s;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    l1 l1Var2 = (l1) obj3;
                    u uVar2 = this.t;
                    k1Var.o(l1Var2, uVar2.r, 0, 0.0f);
                    uVar2.r = (l1Var2.r - k1Var.i0(this.u)) + uVar2.r;
                }
                break;
        }
        return a0.a;
    }
}
