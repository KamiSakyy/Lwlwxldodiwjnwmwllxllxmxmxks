package com.github.rudroid.common.flow;

import c71.j;
import sy.y;
import w61.a0;

@c71.e(c = "com.github.rudroid.common.flow.FlowExtensionRetryUntilKt$retryUntil$3", f = "FlowExtensionRetryUntil.kt", l = {38, 40, 43}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class d extends j implements j71.g {
    public final /* synthetic */ int A;
    public final /* synthetic */ j71.e B;

    /* renamed from: v, reason: collision with root package name */
    public Object f9308v;

    /* renamed from: w, reason: collision with root package name */
    public int f9309w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ y71.j f9310x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Throwable f9311y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ long f9312z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i, a71.c cVar, j71.e eVar) {
        super(4, cVar);
        this.A = i;
        this.B = eVar;
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        d dVar = new d(this.A, (a71.c) obj4, this.B);
        dVar.f9310x = (y71.j) obj;
        dVar.f9311y = (Throwable) obj2;
        dVar.f9312z = longValue;
        return dVar.v(a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (v71.b0.l(r0, r13) != r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (r0.c(r14, r13) == r4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Object obj2;
        y71.j jVar = this.f9310x;
        Throwable th = this.f9311y;
        long j10 = this.f9312z;
        b71.a aVar = b71.a.r;
        int i = this.f9309w;
        boolean z10 = false;
        if (i == 0) {
            y.j(obj);
            if (th instanceof g) {
                Object obj3 = ((g) th).f9314r;
                if (j10 < this.A) {
                    obj2 = obj3;
                    long longValue = ((Number) this.B.s(obj2, new Long(j10))).longValue();
                    this.f9310x = null;
                    this.f9311y = null;
                    this.f9308v = null;
                    this.f9312z = j10;
                    this.f9309w = 2;
                } else {
                    this.f9310x = null;
                    this.f9311y = null;
                    this.f9308v = null;
                    this.f9312z = j10;
                    this.f9309w = 3;
                }
            }
        } else if (i == 1) {
            obj2 = this.f9308v;
            y.j(obj);
            long longValue2 = ((Number) this.B.s(obj2, new Long(j10))).longValue();
            this.f9310x = null;
            this.f9311y = null;
            this.f9308v = null;
            this.f9312z = j10;
            this.f9309w = 2;
        } else if (i == 2) {
            y.j(obj);
            z10 = true;
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.j(obj);
        }
        return Boolean.valueOf(z10);
    }
}
