package com.github.rudroid.viewmodels.notifications;

import java.util.Collection;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class o implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ s s;

    public /* synthetic */ o(s sVar, int i) {
        this.r = i;
        this.s = sVar;
    }

    public final Object k(Object obj) {
        fl.b bVar = (fl.b) obj;
        switch (this.r) {
            case 0:
                k71.k.g(bVar, "it");
                this.s.T(bVar);
                break;
            case 1:
                k71.k.g(bVar, "it");
                this.s.T(bVar);
                break;
            case 2:
                k71.k.g(bVar, "it");
                this.s.T(bVar);
                break;
            case 3:
                k71.k.g(bVar, "it");
                this.s.T(bVar);
                break;
            case 4:
                k71.k.g(bVar, "it");
                this.s.T(bVar);
                break;
            case 5:
                k71.k.g(bVar, "it");
                this.s.T(bVar);
                break;
            case 6:
                k71.k.g(bVar, "it");
                this.s.T(bVar);
                break;
            case 7:
                k71.k.g(bVar, "it");
                this.s.T(bVar);
                break;
            case 8:
                s sVar = this.s;
                y1 y1Var = sVar.X;
                Collection collection = (Collection) ((com.github.rudroid.utilities.ui.g1) y1Var.getValue()).getData();
                sVar.r0(y1Var, bVar, collection == null || collection.isEmpty());
                break;
            default:
                s sVar2 = this.s;
                y1 y1Var2 = sVar2.X;
                Collection collection2 = (Collection) ((com.github.rudroid.utilities.ui.g1) y1Var2.getValue()).getData();
                sVar2.r0(y1Var2, bVar, collection2 == null || collection2.isEmpty());
                break;
        }
        return w61.a0.a;
    }
}
