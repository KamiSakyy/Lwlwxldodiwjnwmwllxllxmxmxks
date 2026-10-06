package androidx.compose.foundation.lazy.layout;

import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public l1.e f1440a;

    public n(int i) {
        switch (i) {
            case 1:
                this.f1440a = new l1.e(new h0.u[16]);
                break;
            default:
                this.f1440a = new l1.e(new m[16]);
                break;
        }
    }

    public void a(CancellationException cancellationException) {
        l1.e eVar = this.f1440a;
        int i = eVar.f27903t;
        v71.k[] kVarArr = new v71.k[i];
        for (int i10 = 0; i10 < i; i10++) {
            kVarArr[i10] = ((h0.u) eVar.f27901r[i10]).f25186b;
        }
        for (int i11 = 0; i11 < i; i11++) {
            kVarArr[i11].x(cancellationException);
        }
        if (eVar.f27903t == 0) {
            return;
        }
        k0.b.c("uncancelled requests present");
    }

    public void b() {
        l1.e eVar = this.f1440a;
        q71.g b02 = aa1.b.b0(0, eVar.f27903t);
        int i = b02.f30996r;
        int i10 = b02.f30997s;
        if (i <= i10) {
            while (true) {
                ((h0.u) eVar.f27901r[i]).f25186b.i(w61.a0.a);
                if (i == i10) {
                    break;
                } else {
                    i++;
                }
            }
        }
        eVar.g();
    }
}
