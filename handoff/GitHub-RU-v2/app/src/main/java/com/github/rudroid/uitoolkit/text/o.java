package com.github.rudroid.uitoolkit.text;

import com.google.android.gms.internal.measurement.z3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o implements l {
    public Integer a;
    public Integer b;
    public w1.r c;
    public w1.r d;

    public o(Integer num, Integer num2, w1.r rVar, w1.r rVar2) {
        this.a = num;
        this.b = num2;
        this.c = rVar;
        this.d = rVar2;
    }

    @Override // com.github.rudroid.uitoolkit.text.l
    public final w1.r a() {
        return this.c;
    }

    @Override // com.github.rudroid.uitoolkit.text.l
    public final i2.b b(androidx.compose.runtime.s sVar) {
        i2.b C;
        sVar.c0(-481998931);
        Integer num = this.b;
        if (num == null) {
            sVar.c0(-1154436361);
            sVar.q(false);
            C = null;
        } else {
            sVar.c0(-1154436360);
            C = z3.C(num.intValue(), 0, sVar);
            sVar.q(false);
        }
        sVar.q(false);
        return C;
    }

    @Override // com.github.rudroid.uitoolkit.text.l
    public final i2.b c(androidx.compose.runtime.s sVar) {
        i2.b C;
        sVar.c0(-1151077644);
        Integer num = this.a;
        if (num == null) {
            sVar.c0(-735150640);
            sVar.q(false);
            C = null;
        } else {
            sVar.c0(-735150639);
            C = z3.C(num.intValue(), 0, sVar);
            sVar.q(false);
        }
        sVar.q(false);
        return C;
    }

    @Override // com.github.rudroid.uitoolkit.text.l
    public final w1.r d() {
        return this.d;
    }
}
