package com.github.rudroid.copilot.inapppurchase.billingclient;

import com.github.rudroid.copilot.inapppurchase.billingclient.i;
import sy.y;
import w61.a0;

@c71.e(c = "com.github.rudroid.copilot.inapppurchase.billingclient.BillingClientExtensionsKt$connectAndRequest$1", f = "BillingClientExtensions.kt", l = {20, 20}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class d extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public y71.j f9658v;

    /* renamed from: w, reason: collision with root package name */
    public int f9659w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f9660x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c71.j f9661y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ x9.b f9662z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j71.e eVar, x9.b bVar, a71.c cVar) {
        super(2, cVar);
        this.f9661y = (c71.j) eVar;
        this.f9662z = bVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        d dVar = new d(this.f9661y, this.f9662z, cVar);
        dVar.f9660x = obj;
        return dVar;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (y71.j) obj).v(a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r0.c(r2, r6) == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r7 == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        y71.j jVar = (y71.j) this.f9660x;
        b71.a aVar = b71.a.r;
        int i = this.f9659w;
        if (i == 0) {
            y.j(obj);
            this.f9660x = null;
            this.f9658v = jVar;
            this.f9659w = 1;
            obj = this.f9661y.s(this.f9662z, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y.j(obj);
                return a0.a;
            }
            jVar = this.f9658v;
            y.j(obj);
        }
        i.a aVar2 = new i.a(obj);
        this.f9660x = null;
        this.f9658v = null;
        this.f9659w = 2;
    }
}
