package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b1 extends y implements p0 {
    public final /* synthetic */ com.google.common.util.concurrent.b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(x0 x0Var, com.google.common.util.concurrent.b bVar) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.f = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.p0
    public final void a() {
        this.f.run();
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean e(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        a();
        return true;
    }


}
