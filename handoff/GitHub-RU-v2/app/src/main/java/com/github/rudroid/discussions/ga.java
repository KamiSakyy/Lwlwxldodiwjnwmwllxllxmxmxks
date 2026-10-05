package com.github.rudroid.discussions;

import java.util.Collection;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class ga implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f11334r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ta f11335s;

    public /* synthetic */ ga(ta taVar, int i) {
        this.f11334r = i;
        this.f11335s = taVar;
    }

    public final Object k(Object obj) {
        fl.b bVar = (fl.b) obj;
        switch (this.f11334r) {
            case k5.f.J:
                ta taVar = this.f11335s;
                y71.y1 y1Var = taVar.f11834x;
                Collection collection = (Collection) ((com.github.rudroid.utilities.ui.g1) y1Var.getValue()).getData();
                taVar.R(y1Var, bVar, collection == null || collection.isEmpty());
                break;
            case 1:
                ta taVar2 = this.f11335s;
                y71.y1 y1Var2 = taVar2.f11834x;
                Collection collection2 = (Collection) ((com.github.rudroid.utilities.ui.g1) y1Var2.getValue()).getData();
                taVar2.R(y1Var2, bVar, collection2 == null || collection2.isEmpty());
                break;
            case 2:
                ta taVar3 = this.f11335s;
                y71.y1 y1Var3 = taVar3.f11834x;
                Collection collection3 = (Collection) ((com.github.rudroid.utilities.ui.g1) y1Var3.getValue()).getData();
                taVar3.R(y1Var3, bVar, collection3 == null || collection3.isEmpty());
                break;
            default:
                ta taVar4 = this.f11335s;
                y71.y1 y1Var4 = taVar4.f11834x;
                Collection collection4 = (Collection) ((com.github.rudroid.utilities.ui.g1) y1Var4.getValue()).getData();
                taVar4.R(y1Var4, bVar, collection4 == null || collection4.isEmpty());
                break;
        }
        return w61.a0.a;
    }
}
