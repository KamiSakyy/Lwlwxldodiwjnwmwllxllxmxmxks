package com.github.rudroid.utilities.ui;

import android.os.Build;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class h implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ s3.c s;
    public final /* synthetic */ androidx.compose.runtime.f1 t;

    public /* synthetic */ h(s3.c cVar, androidx.compose.runtime.f1 f1Var, int i) {
        this.r = i;
        this.s = cVar;
        this.t = f1Var;
    }

    public final Object k(Object obj) {
        switch (this.r) {
            case 0:
                this.t.setValue(new s3.f(this.s.H(((Float) obj).floatValue())));
                break;
            case 1:
                float b = s3.h.b(((s3.h) obj).a);
                s3.c cVar = this.s;
                this.t.setValue(new s3.l((cVar.i0(b) << 32) | (cVar.i0(s3.h.a(r7.a)) & 4294967295L)));
                break;
            case 2:
                com.github.rudroid.agents.base.g gVar = new com.github.rudroid.agents.base.g(5, (j71.a) obj);
                h hVar = new h(this.s, this.t, 1);
                if (f0.i1.a()) {
                    return f0.i1.b(gVar, hVar, Build.VERSION.SDK_INT == 28 ? f0.t1.b : f0.t1.c);
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            case 3:
                float b2 = s3.h.b(((s3.h) obj).a);
                s3.c cVar2 = this.s;
                this.t.setValue(new s3.l((cVar2.i0(b2) << 32) | (cVar2.i0(s3.h.a(r7.a)) & 4294967295L)));
                break;
            default:
                com.github.rudroid.agents.base.g gVar2 = new com.github.rudroid.agents.base.g(6, (j71.a) obj);
                h hVar2 = new h(this.s, this.t, 3);
                if (f0.i1.a()) {
                    return f0.i1.b(gVar2, hVar2, Build.VERSION.SDK_INT == 28 ? f0.t1.b : f0.t1.c);
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
        return w61.a0.a;
    }
}
