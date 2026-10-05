package com.github.rudroid.utilities.ui;

@c71.e(c = "com.github.rudroid.utilities.ui.LongLoadingProgressContentKt$LongLoadingProgressContent$2$1", f = "LongLoadingProgressContent.kt", l = {62}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class a1 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ long w;
    public final /* synthetic */ androidx.compose.runtime.m1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(long j, androidx.compose.runtime.m1 m1Var, a71.c cVar) {
        super(2, cVar);
        this.w = j;
        this.x = m1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new a1(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
        return b71.a.r;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0020 -> B:5:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object v(java.lang.Object r6) {
        /*
            r5 = this;
            b71.a r0 = b71.a.r
            int r1 = r5.v
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            sy.y.j(r6)
            goto L23
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            sy.y.j(r6)
        L18:
            r5.v = r2
            long r3 = r5.w
            java.lang.Object r6 = v71.b0.l(r3, r5)
            if (r6 != r0) goto L23
            return r0
        L23:
            androidx.compose.runtime.m1 r6 = r5.x
            int r1 = r6.y()
            int r1 = r1 + r2
            r6.E(r1)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.rudroid.utilities.ui.a1.v(java.lang.Object):java.lang.Object");
    }
}
