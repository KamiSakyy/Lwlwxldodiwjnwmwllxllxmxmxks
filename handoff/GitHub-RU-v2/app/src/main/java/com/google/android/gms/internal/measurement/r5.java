package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r5 extends h {
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r5(String str, int i) {
        super(str);
        this.t = i;
    }

    @Override // com.google.android.gms.internal.measurement.h
    public final n c(w51.r rVar, List list) {
        switch (this.t) {
            case 0:
                return n.b;
            case 1:
            case 2:
                return this;
            case 3:
                return new g(Double.valueOf(0.0d));
            default:
                return n.b;
        }
    }
}
