package e7;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import c21.c0;

/* loaded from: /home/user/work/p/classes.dex */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new c0(19);

    /* renamed from: r, reason: collision with root package name */
    public String f21998r;

    public c(Parcel parcel) {
        super(parcel);
        this.f21998r = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f21998r);
    }

    public c() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
