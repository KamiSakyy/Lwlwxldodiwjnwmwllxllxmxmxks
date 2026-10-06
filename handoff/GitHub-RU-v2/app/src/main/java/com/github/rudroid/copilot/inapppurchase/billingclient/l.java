package com.github.rudroid.copilot.inapppurchase.billingclient;

import android.content.Context;
import x9.o;
import x9.w;

/* loaded from: /home/user/work/p/classes.dex */
public final class l extends oa.c {

    /* renamed from: b, reason: collision with root package name */
    public Context f9673b;

    /* renamed from: c, reason: collision with root package name */
    public g f9674c;

    public l(Context context, g gVar) {
        k71.k.g(gVar, "billingClientPurchaseUpdateStore");
        this.f9673b = context;
        this.f9674c = gVar;
    }

    @Override // oa.c
    public final Object b(oa.j jVar) {
        Context context = this.f9673b;
        x9.a aVar = new x9.a(context);
        aVar.f33971c = this.f9674c;
        aVar.f33969a = new i80.d(9);
        aVar.f33972d = true;
        if (context == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        if (aVar.f33971c == null) {
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (aVar.f33969a == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        aVar.f33969a.getClass();
        if (aVar.f33971c == null) {
            i80.d dVar = aVar.f33969a;
            return aVar.a() ? new w(dVar, context, aVar) : new x9.c(dVar, context, aVar);
        }
        i80.d dVar2 = aVar.f33969a;
        o oVar = aVar.f33971c;
        return aVar.a() ? new w(dVar2, context, oVar, aVar) : new x9.c(dVar2, context, oVar, aVar);
    }
}
