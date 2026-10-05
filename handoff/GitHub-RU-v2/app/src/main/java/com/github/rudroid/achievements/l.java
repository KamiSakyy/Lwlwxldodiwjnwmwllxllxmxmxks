package com.github.rudroid.achievements;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.w0;
import w61.a0;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class l implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f4456r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f4457s;

    public /* synthetic */ l(k kVar, int i) {
        this.f4456r = i;
        this.f4457s = kVar;
    }

    public final Object k(Object obj) {
        fl.b bVar = (fl.b) obj;
        switch (this.f4456r) {
            case k5.f.J:
                k kVar = this.f4457s;
                w0.j(kVar.A);
                k71.k.g(bVar, "executionError");
                kVar.f4448s.a(bVar);
                break;
            case 1:
                k kVar2 = this.f4457s;
                y1 y1Var = kVar2.A;
                if (((g1) y1Var.getValue()).getData() != null) {
                    w0.j(y1Var);
                    k71.k.g(bVar, "executionError");
                    kVar2.f4448s.a(bVar);
                } else {
                    w0.m(y1Var, bVar);
                }
                return a0.a;
            default:
                k kVar3 = this.f4457s;
                w0.j(kVar3.A);
                k71.k.g(bVar, "executionError");
                kVar3.f4448s.a(bVar);
                break;
        }
        return a0.a;
    }
}
