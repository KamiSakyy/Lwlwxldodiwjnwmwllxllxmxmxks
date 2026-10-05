package com.github.service.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.service.models.response.Avatar;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        k.g(parcel, "parcel");
        return new Avatar(parcel.readString(), Avatar.Type.valueOf(parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new Avatar[i];
    }
}
