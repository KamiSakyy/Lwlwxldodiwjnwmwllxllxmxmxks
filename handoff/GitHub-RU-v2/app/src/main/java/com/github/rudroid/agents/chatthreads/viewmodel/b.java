package com.github.rudroid.agents.chatthreads.viewmodel;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.w0;
import java.util.Collection;
import w61.a0;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class b implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6716r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f6717s;

    public /* synthetic */ b(m mVar, int i) {
        this.f6716r = i;
        this.f6717s = mVar;
    }

    public final Object k(Object obj) {
        fl.b bVar = (fl.b) obj;
        switch (this.f6716r) {
            case k5.f.J:
                m mVar = this.f6717s;
                y1 y1Var = mVar.f6741x;
                Collection collection = (Collection) ((g1) y1Var.getValue()).getData();
                mVar.Q(y1Var, bVar, collection == null || collection.isEmpty());
                break;
            case 1:
                k71.k.g(bVar, "error");
                w0.m(this.f6717s.f6742y, bVar);
                break;
            default:
                m mVar2 = this.f6717s;
                y1 y1Var2 = mVar2.f6741x;
                Collection collection2 = (Collection) ((g1) y1Var2.getValue()).getData();
                mVar2.Q(y1Var2, bVar, collection2 == null || collection2.isEmpty());
                break;
        }
        return a0.a;
    }
}
