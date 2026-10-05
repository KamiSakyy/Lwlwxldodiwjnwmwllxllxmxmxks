package e7;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import c21.c0;

/* loaded from: /home/user/work/p/classes.dex */
public final class a0 extends i {
    public static final Parcelable.Creator<a0> CREATOR = new c0(25);

    /* renamed from: r, reason: collision with root package name */
    public boolean f21995r;

    public a0(Parcel parcel) {
        super(parcel);
        this.f21995r = parcel.readInt() == 1;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f21995r ? 1 : 0);
    }

    public a0() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
