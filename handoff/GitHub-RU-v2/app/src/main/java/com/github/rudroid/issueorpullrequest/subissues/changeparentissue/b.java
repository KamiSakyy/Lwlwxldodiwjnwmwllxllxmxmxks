package com.github.rudroid.issueorpullrequest.subissues.changeparentissue;

import com.github.rudroid.utilities.ui.g1;
import w61.a0;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class b implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f16061r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f16062s;

    public /* synthetic */ b(a aVar, int i) {
        this.f16061r = i;
        this.f16062s = aVar;
    }

    public final Object k(Object obj) {
        fl.b bVar = (fl.b) obj;
        switch (this.f16061r) {
            case k5.f.J:
                a aVar = this.f16062s;
                y1 y1Var = aVar.f16059y;
                aVar.P(y1Var, bVar, ((g1) y1Var.getValue()).getData() == null);
                break;
            default:
                a aVar2 = this.f16062s;
                y1 y1Var2 = aVar2.f16059y;
                aVar2.P(y1Var2, bVar, ((g1) y1Var2.getValue()).getData() == null);
                break;
        }
        return a0.a;
    }
}
